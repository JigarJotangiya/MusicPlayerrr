package p159f.p243f.p245b.p246a.p303f;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: f.f.b.a.f.k */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
public final class C7473k {
    @Deprecated
    /* renamed from: a */
    public static <TResult> C7470h<TResult> m41913a(@RecentlyNonNull Executor executor, @RecentlyNonNull Callable<TResult> callable) {
        C3292l.m14241i(executor, "Executor must not be null");
        C3292l.m14241i(callable, "Callback must not be null");
        C7463b0 b0Var = new C7463b0();
        executor.execute(new C7465c0(b0Var, callable));
        return b0Var;
    }

    /* renamed from: b */
    public static <TResult> C7470h<TResult> m41914b(@RecentlyNonNull Exception exc) {
        C7463b0 b0Var = new C7463b0();
        b0Var.mo28346p(exc);
        return b0Var;
    }

    /* renamed from: c */
    public static <TResult> C7470h<TResult> m41915c(@RecentlyNonNull TResult tresult) {
        C7463b0 b0Var = new C7463b0();
        b0Var.mo28344n(tresult);
        return b0Var;
    }
}
