package kotlinx.coroutines.internal;

import p369i.p379w.C8508d;
import p369i.p387z.p388c.C8570l;

/* renamed from: kotlinx.coroutines.internal.h */
/* compiled from: DispatchedContinuation.kt */
public final class C8827h {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C8859z f35223a = new C8859z("UNDEFINED");

    /* renamed from: b */
    public static final C8859z f35224b = new C8859z("REUSABLE_CLAIMED");

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0093, code lost:
        if (r8.mo30886C0() != false) goto L_0x0095;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> void m47560b(p369i.p379w.C8508d<? super T> r6, java.lang.Object r7, p369i.p387z.p388c.C8570l<? super java.lang.Throwable, p369i.C8457t> r8) {
        /*
            boolean r0 = r6 instanceof kotlinx.coroutines.internal.C8825g
            if (r0 == 0) goto L_0x00ba
            kotlinx.coroutines.internal.g r6 = (kotlinx.coroutines.internal.C8825g) r6
            java.lang.Object r8 = kotlinx.coroutines.C8861j0.m47659b(r7, r8)
            kotlinx.coroutines.m0 r0 = r6.f35215j
            i.w.g r1 = r6.getContext()
            boolean r0 = r0.mo30867O0(r1)
            r1 = 1
            if (r0 == 0) goto L_0x0026
            r6.f35217l = r8
            r6.f35048i = r1
            kotlinx.coroutines.m0 r7 = r6.f35215j
            i.w.g r8 = r6.getContext()
            r7.mo30866N0(r8, r6)
            goto L_0x00bd
        L_0x0026:
            boolean r0 = kotlinx.coroutines.C8919v0.m47824a()
            kotlinx.coroutines.x2 r0 = kotlinx.coroutines.C8929x2.f35315a
            kotlinx.coroutines.k1 r0 = r0.mo31251b()
            boolean r2 = r0.mo31183W0()
            if (r2 == 0) goto L_0x003f
            r6.f35217l = r8
            r6.f35048i = r1
            r0.mo31180S0(r6)
            goto L_0x00bd
        L_0x003f:
            r0.mo31182U0(r1)
            r2 = 0
            i.w.g r3 = r6.getContext()     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.a2$b r4 = kotlinx.coroutines.C8665a2.f35030f     // Catch:{ all -> 0x00ad }
            i.w.g$b r3 = r3.get(r4)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.a2 r3 = (kotlinx.coroutines.C8665a2) r3     // Catch:{ all -> 0x00ad }
            if (r3 == 0) goto L_0x006d
            boolean r4 = r3.mo30862c()     // Catch:{ all -> 0x00ad }
            if (r4 != 0) goto L_0x006d
            java.util.concurrent.CancellationException r3 = r3.mo30860K()     // Catch:{ all -> 0x00ad }
            r6.mo30899a(r8, r3)     // Catch:{ all -> 0x00ad }
            i.l$a r8 = p369i.C8447l.Companion     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p369i.C8450m.m46574a(r3)     // Catch:{ all -> 0x00ad }
            java.lang.Object r8 = p369i.C8447l.m50326constructorimpl(r8)     // Catch:{ all -> 0x00ad }
            r6.resumeWith(r8)     // Catch:{ all -> 0x00ad }
            r8 = 1
            goto L_0x006e
        L_0x006d:
            r8 = 0
        L_0x006e:
            if (r8 != 0) goto L_0x00a6
            i.w.d<T> r8 = r6.f35216k     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = r6.f35218m     // Catch:{ all -> 0x00ad }
            i.w.g r4 = r8.getContext()     // Catch:{ all -> 0x00ad }
            java.lang.Object r3 = kotlinx.coroutines.internal.C8817d0.m47527c(r4, r3)     // Catch:{ all -> 0x00ad }
            kotlinx.coroutines.internal.z r5 = kotlinx.coroutines.internal.C8817d0.f35207a     // Catch:{ all -> 0x00ad }
            if (r3 == r5) goto L_0x0085
            kotlinx.coroutines.b3 r8 = kotlinx.coroutines.C8869l0.m47696e(r8, r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x0086
        L_0x0085:
            r8 = r2
        L_0x0086:
            i.w.d<T> r5 = r6.f35216k     // Catch:{ all -> 0x0099 }
            r5.resumeWith(r7)     // Catch:{ all -> 0x0099 }
            i.t r7 = p369i.C8457t.f34900a     // Catch:{ all -> 0x0099 }
            if (r8 == 0) goto L_0x0095
            boolean r7 = r8.mo30886C0()     // Catch:{ all -> 0x00ad }
            if (r7 == 0) goto L_0x00a6
        L_0x0095:
            kotlinx.coroutines.internal.C8817d0.m47525a(r4, r3)     // Catch:{ all -> 0x00ad }
            goto L_0x00a6
        L_0x0099:
            r7 = move-exception
            if (r8 == 0) goto L_0x00a2
            boolean r8 = r8.mo30886C0()     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x00a5
        L_0x00a2:
            kotlinx.coroutines.internal.C8817d0.m47525a(r4, r3)     // Catch:{ all -> 0x00ad }
        L_0x00a5:
            throw r7     // Catch:{ all -> 0x00ad }
        L_0x00a6:
            boolean r7 = r0.mo31186Z0()     // Catch:{ all -> 0x00ad }
            if (r7 != 0) goto L_0x00a6
            goto L_0x00b1
        L_0x00ad:
            r7 = move-exception
            r6.mo30903j(r7, r2)     // Catch:{ all -> 0x00b5 }
        L_0x00b1:
            r0.mo31179P0(r1)
            goto L_0x00bd
        L_0x00b5:
            r6 = move-exception
            r0.mo31179P0(r1)
            throw r6
        L_0x00ba:
            r6.resumeWith(r7)
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C8827h.m47560b(i.w.d, java.lang.Object, i.z.c.l):void");
    }

    /* renamed from: c */
    public static /* synthetic */ void m47561c(C8508d dVar, Object obj, C8570l lVar, int i, Object obj2) {
        if ((i & 2) != 0) {
            lVar = null;
        }
        m47560b(dVar, obj, lVar);
    }
}
