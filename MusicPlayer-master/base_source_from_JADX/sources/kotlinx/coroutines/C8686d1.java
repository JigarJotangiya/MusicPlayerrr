package kotlinx.coroutines;

import kotlinx.coroutines.p400h3.C8787i;
import p369i.p379w.C8508d;
import p369i.p387z.p389d.C8594l;

/* renamed from: kotlinx.coroutines.d1 */
/* compiled from: DispatchedTask.kt */
public abstract class C8686d1<T> extends C8787i {

    /* renamed from: i */
    public int f35048i;

    public C8686d1(int i) {
        this.f35048i = i;
    }

    /* renamed from: a */
    public void mo30899a(Object obj, Throwable th) {
    }

    /* renamed from: c */
    public abstract C8508d<T> mo30900c();

    /* renamed from: d */
    public Throwable mo30901d(Object obj) {
        C8724f0 f0Var = obj instanceof C8724f0 ? (C8724f0) obj : null;
        if (f0Var == null) {
            return null;
        }
        return f0Var.f35091a;
    }

    /* renamed from: i */
    public <T> T mo30902i(Object obj) {
        return obj;
    }

    /* renamed from: j */
    public final void mo30903j(Throwable th, Throwable th2) {
        if (th != null || th2 != null) {
            if (!(th == null || th2 == null)) {
                C8375b.m46425a(th, th2);
            }
            if (th == null) {
                th = th2;
            }
            C8594l.m46769c(th);
            C8886o0.m47742a(mo30900c().getContext(), new C8915u0("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
        }
    }

    /* renamed from: k */
    public abstract Object mo30904k();

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00aa, code lost:
        if (r4.mo30886C0() != false) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d3, code lost:
        if (r4.mo30886C0() != false) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            boolean r0 = kotlinx.coroutines.C8919v0.m47824a()
            if (r0 == 0) goto L_0x0017
            int r0 = r10.f35048i
            r1 = -1
            if (r0 == r1) goto L_0x000d
            r0 = 1
            goto L_0x000e
        L_0x000d:
            r0 = 0
        L_0x000e:
            if (r0 == 0) goto L_0x0011
            goto L_0x0017
        L_0x0011:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>()
            throw r0
        L_0x0017:
            kotlinx.coroutines.h3.j r0 = r10.f35164h
            i.w.d r1 = r10.mo30900c()     // Catch:{ all -> 0x00d9 }
            kotlinx.coroutines.internal.g r1 = (kotlinx.coroutines.internal.C8825g) r1     // Catch:{ all -> 0x00d9 }
            i.w.d<T> r2 = r1.f35216k     // Catch:{ all -> 0x00d9 }
            java.lang.Object r1 = r1.f35218m     // Catch:{ all -> 0x00d9 }
            i.w.g r3 = r2.getContext()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r1 = kotlinx.coroutines.internal.C8817d0.m47527c(r3, r1)     // Catch:{ all -> 0x00d9 }
            kotlinx.coroutines.internal.z r4 = kotlinx.coroutines.internal.C8817d0.f35207a     // Catch:{ all -> 0x00d9 }
            r5 = 0
            if (r1 == r4) goto L_0x0035
            kotlinx.coroutines.b3 r4 = kotlinx.coroutines.C8869l0.m47696e(r2, r3, r1)     // Catch:{ all -> 0x00d9 }
            goto L_0x0036
        L_0x0035:
            r4 = r5
        L_0x0036:
            i.w.g r6 = r2.getContext()     // Catch:{ all -> 0x00cc }
            java.lang.Object r7 = r10.mo30904k()     // Catch:{ all -> 0x00cc }
            java.lang.Throwable r8 = r10.mo30901d(r7)     // Catch:{ all -> 0x00cc }
            if (r8 != 0) goto L_0x0055
            int r9 = r10.f35048i     // Catch:{ all -> 0x00cc }
            boolean r9 = kotlinx.coroutines.C8692e1.m47137b(r9)     // Catch:{ all -> 0x00cc }
            if (r9 == 0) goto L_0x0055
            kotlinx.coroutines.a2$b r9 = kotlinx.coroutines.C8665a2.f35030f     // Catch:{ all -> 0x00cc }
            i.w.g$b r6 = r6.get(r9)     // Catch:{ all -> 0x00cc }
            kotlinx.coroutines.a2 r6 = (kotlinx.coroutines.C8665a2) r6     // Catch:{ all -> 0x00cc }
            goto L_0x0056
        L_0x0055:
            r6 = r5
        L_0x0056:
            if (r6 == 0) goto L_0x0085
            boolean r9 = r6.mo30862c()     // Catch:{ all -> 0x00cc }
            if (r9 != 0) goto L_0x0085
            java.util.concurrent.CancellationException r6 = r6.mo30860K()     // Catch:{ all -> 0x00cc }
            r10.mo30899a(r7, r6)     // Catch:{ all -> 0x00cc }
            i.l$a r7 = p369i.C8447l.Companion     // Catch:{ all -> 0x00cc }
            boolean r7 = kotlinx.coroutines.C8919v0.m47827d()     // Catch:{ all -> 0x00cc }
            if (r7 == 0) goto L_0x0079
            boolean r7 = r2 instanceof p369i.p379w.p381j.p382a.C8532e     // Catch:{ all -> 0x00cc }
            if (r7 != 0) goto L_0x0072
            goto L_0x0079
        L_0x0072:
            r7 = r2
            i.w.j.a.e r7 = (p369i.p379w.p381j.p382a.C8532e) r7     // Catch:{ all -> 0x00cc }
            java.lang.Throwable r6 = kotlinx.coroutines.internal.C8858y.m47654j(r6, r7)     // Catch:{ all -> 0x00cc }
        L_0x0079:
            java.lang.Object r6 = p369i.C8450m.m46574a(r6)     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p369i.C8447l.m50326constructorimpl(r6)     // Catch:{ all -> 0x00cc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00cc }
            goto L_0x00a2
        L_0x0085:
            if (r8 == 0) goto L_0x0095
            i.l$a r6 = p369i.C8447l.Companion     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p369i.C8450m.m46574a(r8)     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p369i.C8447l.m50326constructorimpl(r6)     // Catch:{ all -> 0x00cc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00cc }
            goto L_0x00a2
        L_0x0095:
            java.lang.Object r6 = r10.mo30902i(r7)     // Catch:{ all -> 0x00cc }
            i.l$a r7 = p369i.C8447l.Companion     // Catch:{ all -> 0x00cc }
            java.lang.Object r6 = p369i.C8447l.m50326constructorimpl(r6)     // Catch:{ all -> 0x00cc }
            r2.resumeWith(r6)     // Catch:{ all -> 0x00cc }
        L_0x00a2:
            i.t r2 = p369i.C8457t.f34900a     // Catch:{ all -> 0x00cc }
            if (r4 == 0) goto L_0x00ac
            boolean r4 = r4.mo30886C0()     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x00af
        L_0x00ac:
            kotlinx.coroutines.internal.C8817d0.m47525a(r3, r1)     // Catch:{ all -> 0x00d9 }
        L_0x00af:
            i.l$a r1 = p369i.C8447l.Companion     // Catch:{ all -> 0x00b9 }
            r0.mo31035E()     // Catch:{ all -> 0x00b9 }
            java.lang.Object r0 = p369i.C8447l.m50326constructorimpl(r2)     // Catch:{ all -> 0x00b9 }
            goto L_0x00c4
        L_0x00b9:
            r0 = move-exception
            i.l$a r1 = p369i.C8447l.Companion
            java.lang.Object r0 = p369i.C8450m.m46574a(r0)
            java.lang.Object r0 = p369i.C8447l.m50326constructorimpl(r0)
        L_0x00c4:
            java.lang.Throwable r0 = p369i.C8447l.m50329exceptionOrNullimpl(r0)
            r10.mo30903j(r5, r0)
            goto L_0x00f8
        L_0x00cc:
            r2 = move-exception
            if (r4 == 0) goto L_0x00d5
            boolean r4 = r4.mo30886C0()     // Catch:{ all -> 0x00d9 }
            if (r4 == 0) goto L_0x00d8
        L_0x00d5:
            kotlinx.coroutines.internal.C8817d0.m47525a(r3, r1)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            i.l$a r2 = p369i.C8447l.Companion     // Catch:{ all -> 0x00e6 }
            r0.mo31035E()     // Catch:{ all -> 0x00e6 }
            i.t r0 = p369i.C8457t.f34900a     // Catch:{ all -> 0x00e6 }
            java.lang.Object r0 = p369i.C8447l.m50326constructorimpl(r0)     // Catch:{ all -> 0x00e6 }
            goto L_0x00f1
        L_0x00e6:
            r0 = move-exception
            i.l$a r2 = p369i.C8447l.Companion
            java.lang.Object r0 = p369i.C8450m.m46574a(r0)
            java.lang.Object r0 = p369i.C8447l.m50326constructorimpl(r0)
        L_0x00f1:
            java.lang.Throwable r0 = p369i.C8447l.m50329exceptionOrNullimpl(r0)
            r10.mo30903j(r1, r0)
        L_0x00f8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.C8686d1.run():void");
    }
}
