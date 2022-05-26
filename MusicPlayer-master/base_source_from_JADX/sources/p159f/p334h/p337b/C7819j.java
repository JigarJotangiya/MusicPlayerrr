package p159f.p334h.p337b;

import java.net.SocketException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p159f.p334h.p337b.p338z.C7854f;
import p159f.p334h.p337b.p338z.C7859h;

/* renamed from: f.h.b.j */
/* compiled from: ConnectionPool */
public final class C7819j {

    /* renamed from: f */
    private static final C7819j f33264f;

    /* renamed from: a */
    private final int f33265a;

    /* renamed from: b */
    private final long f33266b;

    /* renamed from: c */
    private final LinkedList<C7818i> f33267c = new LinkedList<>();

    /* renamed from: d */
    private Executor f33268d = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C7859h.m43094r("OkHttp ConnectionPool", true));

    /* renamed from: e */
    private final Runnable f33269e = new C7820a();

    /* renamed from: f.h.b.j$a */
    /* compiled from: ConnectionPool */
    class C7820a implements Runnable {
        C7820a() {
        }

        public void run() {
            C7819j.this.m42853g();
        }
    }

    static {
        String property = System.getProperty("http.keepAlive");
        String property2 = System.getProperty("http.keepAliveDuration");
        String property3 = System.getProperty("http.maxConnections");
        long parseLong = property2 != null ? Long.parseLong(property2) : 300000;
        if (property != null && !Boolean.parseBoolean(property)) {
            f33264f = new C7819j(0, parseLong);
        } else if (property3 != null) {
            f33264f = new C7819j(Integer.parseInt(property3), parseLong);
        } else {
            f33264f = new C7819j(5, parseLong);
        }
    }

    public C7819j(int i, long j) {
        this.f33265a = i;
        this.f33266b = j * 1000 * 1000;
    }

    /* renamed from: b */
    private void m42851b(C7818i iVar) {
        boolean isEmpty = this.f33267c.isEmpty();
        this.f33267c.addFirst(iVar);
        if (isEmpty) {
            this.f33268d.execute(this.f33269e);
        } else {
            notifyAll();
        }
    }

    /* renamed from: d */
    public static C7819j m42852d() {
        return f33264f;
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m42853g() {
        do {
        } while (mo29132e());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        r0 = r2;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized p159f.p334h.p337b.C7818i mo29131c(p159f.p334h.p337b.C7805a r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            java.util.LinkedList<f.h.b.i> r1 = r8.f33267c     // Catch:{ all -> 0x0082 }
            int r2 = r1.size()     // Catch:{ all -> 0x0082 }
            java.util.ListIterator r1 = r1.listIterator(r2)     // Catch:{ all -> 0x0082 }
        L_0x000c:
            boolean r2 = r1.hasPrevious()     // Catch:{ all -> 0x0082 }
            if (r2 == 0) goto L_0x0073
            java.lang.Object r2 = r1.previous()     // Catch:{ all -> 0x0082 }
            f.h.b.i r2 = (p159f.p334h.p337b.C7818i) r2     // Catch:{ all -> 0x0082 }
            f.h.b.x r3 = r2.mo29116g()     // Catch:{ all -> 0x0082 }
            f.h.b.a r3 = r3.mo29266a()     // Catch:{ all -> 0x0082 }
            boolean r3 = r3.equals(r9)     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x000c
            boolean r3 = r2.mo29119j()     // Catch:{ all -> 0x0082 }
            if (r3 == 0) goto L_0x000c
            long r3 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0082 }
            long r5 = r2.mo29114e()     // Catch:{ all -> 0x0082 }
            long r3 = r3 - r5
            long r5 = r8.f33266b     // Catch:{ all -> 0x0082 }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x003c
            goto L_0x000c
        L_0x003c:
            r1.remove()     // Catch:{ all -> 0x0082 }
            boolean r3 = r2.mo29123n()     // Catch:{ all -> 0x0082 }
            if (r3 != 0) goto L_0x0072
            f.h.b.z.f r3 = p159f.p334h.p337b.p338z.C7854f.m43054f()     // Catch:{ SocketException -> 0x0051 }
            java.net.Socket r4 = r2.mo29117h()     // Catch:{ SocketException -> 0x0051 }
            r3.mo29291j(r4)     // Catch:{ SocketException -> 0x0051 }
            goto L_0x0072
        L_0x0051:
            r3 = move-exception
            java.net.Socket r2 = r2.mo29117h()     // Catch:{ all -> 0x0082 }
            p159f.p334h.p337b.p338z.C7859h.m43080d(r2)     // Catch:{ all -> 0x0082 }
            f.h.b.z.f r2 = p159f.p334h.p337b.p338z.C7854f.m43054f()     // Catch:{ all -> 0x0082 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0082 }
            r4.<init>()     // Catch:{ all -> 0x0082 }
            java.lang.String r5 = "Unable to tagSocket(): "
            r4.append(r5)     // Catch:{ all -> 0x0082 }
            r4.append(r3)     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = r4.toString()     // Catch:{ all -> 0x0082 }
            r2.mo29290i(r3)     // Catch:{ all -> 0x0082 }
            goto L_0x000c
        L_0x0072:
            r0 = r2
        L_0x0073:
            if (r0 == 0) goto L_0x0080
            boolean r9 = r0.mo29123n()     // Catch:{ all -> 0x0082 }
            if (r9 == 0) goto L_0x0080
            java.util.LinkedList<f.h.b.i> r9 = r8.f33267c     // Catch:{ all -> 0x0082 }
            r9.addFirst(r0)     // Catch:{ all -> 0x0082 }
        L_0x0080:
            monitor-exit(r8)
            return r0
        L_0x0082:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.C7819j.mo29131c(f.h.b.a):f.h.b.i");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo29132e() {
        synchronized (this) {
            if (this.f33267c.isEmpty()) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            long nanoTime = System.nanoTime();
            long j = this.f33266b;
            LinkedList<C7818i> linkedList = this.f33267c;
            ListIterator<C7818i> listIterator = linkedList.listIterator(linkedList.size());
            int i = 0;
            while (listIterator.hasPrevious()) {
                C7818i previous = listIterator.previous();
                long e = (previous.mo29114e() + this.f33266b) - nanoTime;
                if (e > 0) {
                    if (previous.mo29119j()) {
                        if (previous.mo29121l()) {
                            i++;
                            j = Math.min(j, e);
                        }
                    }
                }
                listIterator.remove();
                arrayList.add(previous);
            }
            LinkedList<C7818i> linkedList2 = this.f33267c;
            ListIterator<C7818i> listIterator2 = linkedList2.listIterator(linkedList2.size());
            while (listIterator2.hasPrevious() && i > this.f33265a) {
                C7818i previous2 = listIterator2.previous();
                if (previous2.mo29121l()) {
                    arrayList.add(previous2);
                    listIterator2.remove();
                    i--;
                }
            }
            if (arrayList.isEmpty()) {
                try {
                    long j2 = j / 1000000;
                    Long.signum(j2);
                    wait(j2, (int) (j - (1000000 * j2)));
                    return true;
                } catch (InterruptedException unused) {
                    int size = arrayList.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C7859h.m43080d(((C7818i) arrayList.get(i2)).mo29117h());
                    }
                    return true;
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo29133f(C7818i iVar) {
        if (iVar.mo29123n() || !iVar.mo29110a()) {
            return;
        }
        if (!iVar.mo29119j()) {
            C7859h.m43080d(iVar.mo29117h());
            return;
        }
        try {
            C7854f.m43054f().mo29293l(iVar.mo29117h());
            synchronized (this) {
                m42851b(iVar);
                iVar.mo29118i();
                iVar.mo29126r();
            }
        } catch (SocketException e) {
            C7854f f = C7854f.m43054f();
            f.mo29290i("Unable to untagSocket(): " + e);
            C7859h.m43080d(iVar.mo29117h());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo29134h(C7818i iVar) {
        if (!iVar.mo29123n()) {
            throw new IllegalArgumentException();
        } else if (iVar.mo29119j()) {
            synchronized (this) {
                m42851b(iVar);
            }
        }
    }
}
