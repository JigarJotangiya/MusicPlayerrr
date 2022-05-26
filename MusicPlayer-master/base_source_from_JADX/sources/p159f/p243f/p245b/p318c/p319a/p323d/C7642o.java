package p159f.p243f.p245b.p318c.p319a.p323d;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: f.f.b.c.a.d.o */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C7642o<ResultT> {

    /* renamed from: a */
    private final Object f33006a = new Object();

    /* renamed from: b */
    private Queue<C7641n<ResultT>> f33007b;

    /* renamed from: c */
    private boolean f33008c;

    C7642o() {
    }

    /* renamed from: a */
    public final void mo28630a(C7641n<ResultT> nVar) {
        synchronized (this.f33006a) {
            if (this.f33007b == null) {
                this.f33007b = new ArrayDeque();
            }
            this.f33007b.add(nVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f33006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f33007b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f33008c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0020, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0021, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0022, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0023, code lost:
        r0.mo28627a(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28631b(p159f.p243f.p245b.p318c.p319a.p323d.C7632e<ResultT> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f33006a
            monitor-enter(r0)
            java.util.Queue<f.f.b.c.a.d.n<ResultT>> r1 = r2.f33007b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f33008c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f33008c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f33006a
            monitor-enter(r1)
            java.util.Queue<f.f.b.c.a.d.n<ResultT>> r0 = r2.f33007b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            f.f.b.c.a.d.n r0 = (p159f.p243f.p245b.p318c.p319a.p323d.C7641n) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f33008c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo28627a(r3)
            goto L_0x0010
        L_0x0027:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            throw r3
        L_0x002a:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return
        L_0x002c:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p318c.p319a.p323d.C7642o.mo28631b(f.f.b.c.a.d.e):void");
    }
}
