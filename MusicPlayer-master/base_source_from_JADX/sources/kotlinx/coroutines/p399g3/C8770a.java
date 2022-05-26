package kotlinx.coroutines.p399g3;

import kotlinx.coroutines.internal.C8827h;
import p369i.C8447l;
import p369i.C8450m;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p388c.C8574p;

/* renamed from: kotlinx.coroutines.g3.a */
/* compiled from: Cancellable.kt */
public final class C8770a {
    /* renamed from: a */
    public static final /* synthetic */ void m47310a(C8508d dVar, Throwable th) {
        m47311b(dVar, th);
        throw null;
    }

    /* renamed from: b */
    private static final void m47311b(C8508d<?> dVar, Throwable th) {
        C8447l.C8448a aVar = C8447l.Companion;
        dVar.resumeWith(C8447l.m50326constructorimpl(C8450m.m46574a(th)));
        throw th;
    }

    /* renamed from: c */
    public static final void m47312c(C8508d<? super C8457t> dVar, C8508d<?> dVar2) {
        try {
            C8508d<? super C8457t> c = C8522c.m46721c(dVar);
            C8447l.C8448a aVar = C8447l.Companion;
            C8827h.m47561c(c, C8447l.m50326constructorimpl(C8457t.f34900a), (C8570l) null, 2, (Object) null);
        } catch (Throwable th) {
            m47310a(dVar2, th);
            throw null;
        }
    }

    /* renamed from: d */
    public static final <T> void m47313d(C8570l<? super C8508d<? super T>, ? extends Object> lVar, C8508d<? super T> dVar) {
        try {
            C8508d<C8457t> c = C8522c.m46721c(C8522c.m46719a(lVar, dVar));
            C8447l.C8448a aVar = C8447l.Companion;
            C8827h.m47561c(c, C8447l.m50326constructorimpl(C8457t.f34900a), (C8570l) null, 2, (Object) null);
        } catch (Throwable th) {
            m47310a(dVar, th);
            throw null;
        }
    }

    /* renamed from: e */
    public static final <R, T> void m47314e(C8574p<? super R, ? super C8508d<? super T>, ? extends Object> pVar, R r, C8508d<? super T> dVar, C8570l<? super Throwable, C8457t> lVar) {
        try {
            C8508d<C8457t> c = C8522c.m46721c(C8522c.m46720b(pVar, r, dVar));
            C8447l.C8448a aVar = C8447l.Companion;
            C8827h.m47560b(c, C8447l.m50326constructorimpl(C8457t.f34900a), lVar);
        } catch (Throwable th) {
            m47310a(dVar, th);
            throw null;
        }
    }

    /* renamed from: f */
    public static /* synthetic */ void m47315f(C8574p pVar, Object obj, C8508d dVar, C8570l lVar, int i, Object obj2) {
        if ((i & 4) != 0) {
            lVar = null;
        }
        m47314e(pVar, obj, dVar, lVar);
    }
}
