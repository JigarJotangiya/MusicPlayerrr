package retrofit;

import java.util.concurrent.Executor;

abstract class CallbackRunnable<T> implements Runnable {
    /* access modifiers changed from: private */
    public final Callback<T> callback;
    private final Executor callbackExecutor;
    private final ErrorHandler errorHandler;

    CallbackRunnable(Callback<T> callback2, Executor executor, ErrorHandler errorHandler2) {
        this.callback = callback2;
        this.callbackExecutor = executor;
        this.errorHandler = errorHandler2;
    }

    public abstract ResponseWrapper obtainResponse();

    public final void run() {
        try {
            final ResponseWrapper obtainResponse = obtainResponse();
            this.callbackExecutor.execute(new Runnable() {
                public void run() {
                    Callback access$000 = CallbackRunnable.this.callback;
                    ResponseWrapper responseWrapper = obtainResponse;
                    access$000.success(responseWrapper.responseBody, responseWrapper.response);
                }
            });
        } catch (RetrofitError e) {
            e = e;
            Throwable handleError = this.errorHandler.handleError(e);
            if (handleError != e) {
                e = RetrofitError.unexpectedError(e.getUrl(), handleError);
            }
            this.callbackExecutor.execute(new Runnable() {
                public void run() {
                    CallbackRunnable.this.callback.failure(e);
                }
            });
        }
    }
}
