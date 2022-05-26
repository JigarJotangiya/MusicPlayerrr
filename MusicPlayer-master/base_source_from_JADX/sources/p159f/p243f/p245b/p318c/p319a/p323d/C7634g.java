package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7613s;

/* renamed from: f.f.b.c.a.d.g */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7634g {
    /* renamed from: a */
    public static <ResultT> ResultT m42448a(C7632e<ResultT> eVar) throws ExecutionException, InterruptedException {
        C7613s.m42415a(eVar, "Task must not be null");
        if (eVar.mo28624f()) {
            return m42451d(eVar);
        }
        C7649v vVar = new C7649v((C7648u) null);
        m42452e(eVar, vVar);
        vVar.mo28643c();
        return m42451d(eVar);
    }

    /* renamed from: b */
    public static <ResultT> C7632e<ResultT> m42449b(Exception exc) {
        C7647t tVar = new C7647t();
        tVar.mo28639h(exc);
        return tVar;
    }

    /* renamed from: c */
    public static <ResultT> C7632e<ResultT> m42450c(ResultT resultt) {
        C7647t tVar = new C7647t();
        tVar.mo28640i(resultt);
        return tVar;
    }

    /* renamed from: d */
    private static <ResultT> ResultT m42451d(C7632e<ResultT> eVar) throws ExecutionException {
        if (eVar.mo28625g()) {
            return eVar.mo28623e();
        }
        throw new ExecutionException(eVar.mo28622d());
    }

    /* renamed from: e */
    private static void m42452e(C7632e<?> eVar, C7650w wVar) {
        Executor executor = C7633f.f32990b;
        eVar.mo28621c(executor, wVar);
        eVar.mo28620b(executor, wVar);
    }
}
