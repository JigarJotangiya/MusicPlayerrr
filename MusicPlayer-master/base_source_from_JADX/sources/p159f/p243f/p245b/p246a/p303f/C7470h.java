package p159f.p243f.p245b.p246a.p303f;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.h */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
public abstract class C7470h<TResult> {
    /* renamed from: a */
    public C7470h<TResult> mo28331a(@RecentlyNonNull Executor executor, @RecentlyNonNull C7464c cVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    /* renamed from: b */
    public C7470h<TResult> mo28332b(@RecentlyNonNull C7466d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: c */
    public C7470h<TResult> mo28333c(@RecentlyNonNull Executor executor, @RecentlyNonNull C7466d<TResult> dVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    /* renamed from: d */
    public abstract C7470h<TResult> mo28334d(@RecentlyNonNull Executor executor, @RecentlyNonNull C7467e eVar);

    /* renamed from: e */
    public abstract C7470h<TResult> mo28335e(@RecentlyNonNull Executor executor, @RecentlyNonNull C7468f<? super TResult> fVar);

    /* renamed from: f */
    public <TContinuationResult> C7470h<TContinuationResult> mo28336f(@RecentlyNonNull Executor executor, @RecentlyNonNull C7460a<TResult, TContinuationResult> aVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    /* renamed from: g */
    public <TContinuationResult> C7470h<TContinuationResult> mo28337g(@RecentlyNonNull C7460a<TResult, C7470h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    /* renamed from: h */
    public <TContinuationResult> C7470h<TContinuationResult> mo28338h(@RecentlyNonNull Executor executor, @RecentlyNonNull C7460a<TResult, C7470h<TContinuationResult>> aVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    @RecentlyNullable
    /* renamed from: i */
    public abstract Exception mo28339i();

    @RecentlyNonNull
    /* renamed from: j */
    public abstract TResult mo28340j();

    /* renamed from: k */
    public abstract boolean mo28341k();

    /* renamed from: l */
    public abstract boolean mo28342l();

    /* renamed from: m */
    public abstract boolean mo28343m();
}
