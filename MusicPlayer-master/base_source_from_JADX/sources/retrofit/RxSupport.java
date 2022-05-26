package retrofit;

import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import rx.Observable;
import rx.Subscriber;
import rx.subscriptions.Subscriptions;

final class RxSupport {
    /* access modifiers changed from: private */
    public final ErrorHandler errorHandler;
    /* access modifiers changed from: private */
    public final Executor executor;
    /* access modifiers changed from: private */
    public final RequestInterceptor requestInterceptor;

    interface Invoker {
        ResponseWrapper invoke(RequestInterceptor requestInterceptor);
    }

    RxSupport(Executor executor2, ErrorHandler errorHandler2, RequestInterceptor requestInterceptor2) {
        this.executor = executor2;
        this.errorHandler = errorHandler2;
        this.requestInterceptor = requestInterceptor2;
    }

    /* access modifiers changed from: private */
    public Runnable getRunnable(final Subscriber<? super Object> subscriber, final Invoker invoker, final RequestInterceptorTape requestInterceptorTape) {
        return new Runnable() {
            public void run() {
                try {
                    if (!subscriber.isUnsubscribed()) {
                        subscriber.onNext(invoker.invoke(requestInterceptorTape).responseBody);
                        subscriber.onCompleted();
                    }
                } catch (RetrofitError e) {
                    subscriber.onError(RxSupport.this.errorHandler.handleError(e));
                }
            }
        };
    }

    /* access modifiers changed from: package-private */
    public Observable createRequestObservable(final Invoker invoker) {
        return Observable.create(new Observable.OnSubscribe<Object>() {
            public void call(Subscriber<? super Object> subscriber) {
                RequestInterceptorTape requestInterceptorTape = new RequestInterceptorTape();
                RxSupport.this.requestInterceptor.intercept(requestInterceptorTape);
                FutureTask futureTask = new FutureTask(RxSupport.this.getRunnable(subscriber, invoker, requestInterceptorTape), (Object) null);
                subscriber.add(Subscriptions.from(futureTask));
                RxSupport.this.executor.execute(futureTask);
            }
        });
    }
}
