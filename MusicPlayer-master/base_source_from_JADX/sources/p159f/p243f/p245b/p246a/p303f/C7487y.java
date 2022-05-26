package p159f.p243f.p245b.p246a.p303f;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: f.f.b.a.f.y */
/* compiled from: com.google.android.gms:play-services-tasks@@17.2.1 */
final class C7487y<TResult> {

    /* renamed from: a */
    private final Object f32676a = new Object();

    /* renamed from: b */
    private Queue<C7486x<TResult>> f32677b;

    /* renamed from: c */
    private boolean f32678c;

    C7487y() {
    }

    /* renamed from: a */
    public final void mo28364a(C7486x<TResult> xVar) {
        synchronized (this.f32676a) {
            if (this.f32677b == null) {
                this.f32677b = new ArrayDeque();
            }
            this.f32677b.add(xVar);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0010, code lost:
        r1 = r2.f32676a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0012, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0 = r2.f32677b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001b, code lost:
        if (r0 != null) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r2.f32678c = false;
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
        r0.mo28358c(r3);
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo28365b(p159f.p243f.p245b.p246a.p303f.C7470h<TResult> r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f32676a
            monitor-enter(r0)
            java.util.Queue<f.f.b.a.f.x<TResult>> r1 = r2.f32677b     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r2.f32678c     // Catch:{ all -> 0x002c }
            if (r1 == 0) goto L_0x000c
            goto L_0x002a
        L_0x000c:
            r1 = 1
            r2.f32678c = r1     // Catch:{ all -> 0x002c }
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
        L_0x0010:
            java.lang.Object r1 = r2.f32676a
            monitor-enter(r1)
            java.util.Queue<f.f.b.a.f.x<TResult>> r0 = r2.f32677b     // Catch:{ all -> 0x0027 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0027 }
            f.f.b.a.f.x r0 = (p159f.p243f.p245b.p246a.p303f.C7486x) r0     // Catch:{ all -> 0x0027 }
            if (r0 != 0) goto L_0x0022
            r3 = 0
            r2.f32678c = r3     // Catch:{ all -> 0x0027 }
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            return
        L_0x0022:
            monitor-exit(r1)     // Catch:{ all -> 0x0027 }
            r0.mo28358c(r3)
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
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p246a.p303f.C7487y.mo28365b(f.f.b.a.f.h):void");
    }
}
