package p159f.p334h.p337b.p338z.p340k;

import com.un4seen.bass.BASS;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p159f.p334h.p337b.C7835s;
import p159f.p334h.p337b.p338z.C7850c;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.p340k.C7894b;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8638h;
import p394k.C8645n;

/* renamed from: f.h.b.z.k.o */
/* compiled from: SpdyConnection */
public final class C7921o implements Closeable {
    /* access modifiers changed from: private */

    /* renamed from: C */
    public static final ExecutorService f33573C = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C7859h.m43094r("OkHttp SpdyConnection", true));

    /* renamed from: A */
    final C7930i f33574A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final Set<Integer> f33575B;

    /* renamed from: g */
    final C7835s f33576g;

    /* renamed from: h */
    final boolean f33577h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7909i f33578i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final Map<Integer, C7933p> f33579j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final String f33580k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int f33581l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public int f33582m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f33583n;

    /* renamed from: o */
    private long f33584o;

    /* renamed from: p */
    private final ExecutorService f33585p;

    /* renamed from: q */
    private Map<Integer, C7914k> f33586q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final C7915l f33587r;

    /* renamed from: s */
    long f33588s;

    /* renamed from: t */
    long f33589t;

    /* renamed from: u */
    final C7917m f33590u;

    /* renamed from: v */
    final C7917m f33591v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public boolean f33592w;

    /* renamed from: x */
    final C7938q f33593x;

    /* renamed from: y */
    final Socket f33594y;

    /* renamed from: z */
    final C7896c f33595z;

    /* renamed from: f.h.b.z.k.o$a */
    /* compiled from: SpdyConnection */
    class C7922a extends C7850c {

        /* renamed from: h */
        final /* synthetic */ int f33596h;

        /* renamed from: i */
        final /* synthetic */ C7893a f33597i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7922a(String str, Object[] objArr, int i, C7893a aVar) {
            super(str, objArr);
            this.f33596h = i;
            this.f33597i = aVar;
        }

        /* renamed from: a */
        public void mo29277a() {
            try {
                C7921o.this.mo29445k1(this.f33596h, this.f33597i);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$b */
    /* compiled from: SpdyConnection */
    class C7923b extends C7850c {

        /* renamed from: h */
        final /* synthetic */ int f33599h;

        /* renamed from: i */
        final /* synthetic */ long f33600i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7923b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f33599h = i;
            this.f33600i = j;
        }

        /* renamed from: a */
        public void mo29277a() {
            try {
                C7921o.this.f33595z.mo29380i(this.f33599h, this.f33600i);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$c */
    /* compiled from: SpdyConnection */
    class C7924c extends C7850c {

        /* renamed from: h */
        final /* synthetic */ boolean f33602h;

        /* renamed from: i */
        final /* synthetic */ int f33603i;

        /* renamed from: j */
        final /* synthetic */ int f33604j;

        /* renamed from: k */
        final /* synthetic */ C7914k f33605k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7924c(String str, Object[] objArr, boolean z, int i, int i2, C7914k kVar) {
            super(str, objArr);
            this.f33602h = z;
            this.f33603i = i;
            this.f33604j = i2;
            this.f33605k = kVar;
        }

        /* renamed from: a */
        public void mo29277a() {
            try {
                C7921o.this.m43438i1(this.f33602h, this.f33603i, this.f33604j, this.f33605k);
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$d */
    /* compiled from: SpdyConnection */
    class C7925d extends C7850c {

        /* renamed from: h */
        final /* synthetic */ int f33607h;

        /* renamed from: i */
        final /* synthetic */ List f33608i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7925d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f33607h = i;
            this.f33608i = list;
        }

        /* renamed from: a */
        public void mo29277a() {
            if (C7921o.this.f33587r.mo29414a(this.f33607h, this.f33608i)) {
                try {
                    C7921o.this.f33595z.mo29378f(this.f33607h, C7893a.CANCEL);
                    synchronized (C7921o.this) {
                        C7921o.this.f33575B.remove(Integer.valueOf(this.f33607h));
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$e */
    /* compiled from: SpdyConnection */
    class C7926e extends C7850c {

        /* renamed from: h */
        final /* synthetic */ int f33610h;

        /* renamed from: i */
        final /* synthetic */ List f33611i;

        /* renamed from: j */
        final /* synthetic */ boolean f33612j;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7926e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f33610h = i;
            this.f33611i = list;
            this.f33612j = z;
        }

        /* renamed from: a */
        public void mo29277a() {
            boolean b = C7921o.this.f33587r.mo29415b(this.f33610h, this.f33611i, this.f33612j);
            if (b) {
                try {
                    C7921o.this.f33595z.mo29378f(this.f33610h, C7893a.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (b || this.f33612j) {
                synchronized (C7921o.this) {
                    C7921o.this.f33575B.remove(Integer.valueOf(this.f33610h));
                }
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$f */
    /* compiled from: SpdyConnection */
    class C7927f extends C7850c {

        /* renamed from: h */
        final /* synthetic */ int f33614h;

        /* renamed from: i */
        final /* synthetic */ C8633e f33615i;

        /* renamed from: j */
        final /* synthetic */ int f33616j;

        /* renamed from: k */
        final /* synthetic */ boolean f33617k;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7927f(String str, Object[] objArr, int i, C8633e eVar, int i2, boolean z) {
            super(str, objArr);
            this.f33614h = i;
            this.f33615i = eVar;
            this.f33616j = i2;
            this.f33617k = z;
        }

        /* renamed from: a */
        public void mo29277a() {
            try {
                boolean d = C7921o.this.f33587r.mo29417d(this.f33614h, this.f33615i, this.f33616j, this.f33617k);
                if (d) {
                    C7921o.this.f33595z.mo29378f(this.f33614h, C7893a.CANCEL);
                }
                if (d || this.f33617k) {
                    synchronized (C7921o.this) {
                        C7921o.this.f33575B.remove(Integer.valueOf(this.f33614h));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$g */
    /* compiled from: SpdyConnection */
    class C7928g extends C7850c {

        /* renamed from: h */
        final /* synthetic */ int f33619h;

        /* renamed from: i */
        final /* synthetic */ C7893a f33620i;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C7928g(String str, Object[] objArr, int i, C7893a aVar) {
            super(str, objArr);
            this.f33619h = i;
            this.f33620i = aVar;
        }

        /* renamed from: a */
        public void mo29277a() {
            C7921o.this.f33587r.mo29416c(this.f33619h, this.f33620i);
            synchronized (C7921o.this) {
                C7921o.this.f33575B.remove(Integer.valueOf(this.f33619h));
            }
        }
    }

    /* renamed from: f.h.b.z.k.o$h */
    /* compiled from: SpdyConnection */
    public static class C7929h {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public String f33622a;
        /* access modifiers changed from: private */

        /* renamed from: b */
        public Socket f33623b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public C7909i f33624c = C7909i.f33551a;
        /* access modifiers changed from: private */

        /* renamed from: d */
        public C7835s f33625d = C7835s.SPDY_3;
        /* access modifiers changed from: private */

        /* renamed from: e */
        public C7915l f33626e = C7915l.f33559a;
        /* access modifiers changed from: private */

        /* renamed from: f */
        public boolean f33627f;

        public C7929h(String str, boolean z, Socket socket) throws IOException {
            this.f33622a = str;
            this.f33627f = z;
            this.f33623b = socket;
        }

        /* renamed from: g */
        public C7921o mo29448g() throws IOException {
            return new C7921o(this, (C7922a) null);
        }

        /* renamed from: h */
        public C7929h mo29449h(C7835s sVar) {
            this.f33625d = sVar;
            return this;
        }
    }

    /* renamed from: f.h.b.z.k.o$i */
    /* compiled from: SpdyConnection */
    class C7930i extends C7850c implements C7894b.C7895a {

        /* renamed from: h */
        C7894b f33628h;

        /* renamed from: f.h.b.z.k.o$i$a */
        /* compiled from: SpdyConnection */
        class C7931a extends C7850c {

            /* renamed from: h */
            final /* synthetic */ C7933p f33630h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7931a(String str, Object[] objArr, C7933p pVar) {
                super(str, objArr);
                this.f33630h = pVar;
            }

            /* renamed from: a */
            public void mo29277a() {
                try {
                    C7921o.this.f33578i.mo29407a(this.f33630h);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }

        /* renamed from: f.h.b.z.k.o$i$b */
        /* compiled from: SpdyConnection */
        class C7932b extends C7850c {

            /* renamed from: h */
            final /* synthetic */ C7917m f33632h;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C7932b(String str, Object[] objArr, C7917m mVar) {
                super(str, objArr);
                this.f33632h = mVar;
            }

            /* renamed from: a */
            public void mo29277a() {
                try {
                    C7921o.this.f33595z.mo29376G(this.f33632h);
                } catch (IOException unused) {
                }
            }
        }

        /* synthetic */ C7930i(C7921o oVar, C7922a aVar) {
            this();
        }

        /* renamed from: b */
        private void m43475b(C7917m mVar) {
            C7921o.f33573C.execute(new C7932b("OkHttp %s ACK Settings", new Object[]{C7921o.this.f33580k}, mVar));
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
            r0 = p159f.p334h.p337b.p338z.p340k.C7893a.PROTOCOL_ERROR;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
            p159f.p334h.p337b.p338z.p340k.C7921o.m43433c(r5.f33629i, r0, r0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0047, code lost:
            r2 = move-exception;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
            r4 = r2;
            r2 = r1;
            r1 = r4;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x003a */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29277a() {
            /*
                r5 = this;
                f.h.b.z.k.a r0 = p159f.p334h.p337b.p338z.p340k.C7893a.INTERNAL_ERROR
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                f.h.b.z.k.q r2 = r1.f33593x     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                java.net.Socket r1 = r1.f33594y     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                k.a0 r1 = p394k.C8645n.m46990g(r1)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                k.g r1 = p394k.C8645n.m46985b(r1)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                f.h.b.z.k.o r3 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                boolean r3 = r3.f33577h     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                f.h.b.z.k.b r1 = r2.mo29399a(r1, r3)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                r5.f33628h = r1     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                f.h.b.z.k.o r2 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                boolean r2 = r2.f33577h     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                if (r2 != 0) goto L_0x0023
                r1.mo29360h0()     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
            L_0x0023:
                f.h.b.z.k.b r1 = r5.f33628h     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                boolean r1 = r1.mo29361s0(r5)     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                if (r1 == 0) goto L_0x002c
                goto L_0x0023
            L_0x002c:
                f.h.b.z.k.a r1 = p159f.p334h.p337b.p338z.p340k.C7893a.NO_ERROR     // Catch:{ IOException -> 0x0039, all -> 0x0036 }
                f.h.b.z.k.a r0 = p159f.p334h.p337b.p338z.p340k.C7893a.CANCEL     // Catch:{ IOException -> 0x003a }
                f.h.b.z.k.o r2 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ IOException -> 0x0041 }
                r2.m43424Q0(r1, r0)     // Catch:{ IOException -> 0x0041 }
                goto L_0x0041
            L_0x0036:
                r1 = move-exception
                r2 = r0
                goto L_0x004b
            L_0x0039:
                r1 = r0
            L_0x003a:
                f.h.b.z.k.a r0 = p159f.p334h.p337b.p338z.p340k.C7893a.PROTOCOL_ERROR     // Catch:{ all -> 0x0047 }
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ IOException -> 0x0041 }
                r1.m43424Q0(r0, r0)     // Catch:{ IOException -> 0x0041 }
            L_0x0041:
                f.h.b.z.k.b r0 = r5.f33628h
                p159f.p334h.p337b.p338z.C7859h.m43079c(r0)
                return
            L_0x0047:
                r2 = move-exception
                r4 = r2
                r2 = r1
                r1 = r4
            L_0x004b:
                f.h.b.z.k.o r3 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ IOException -> 0x0050 }
                r3.m43424Q0(r2, r0)     // Catch:{ IOException -> 0x0050 }
            L_0x0050:
                f.h.b.z.k.b r0 = r5.f33628h
                p159f.p334h.p337b.p338z.C7859h.m43079c(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7921o.C7930i.mo29277a():void");
        }

        /* renamed from: f */
        public void mo29362f(int i, C7893a aVar) {
            if (C7921o.this.m43432b1(i)) {
                C7921o.this.m43431a1(i, aVar);
                return;
            }
            C7933p d1 = C7921o.this.mo29440d1(i);
            if (d1 != null) {
                d1.mo29463y(aVar);
            }
        }

        /* renamed from: i */
        public void mo29363i(int i, long j) {
            if (i == 0) {
                synchronized (C7921o.this) {
                    C7921o oVar = C7921o.this;
                    oVar.f33589t += j;
                    oVar.notifyAll();
                }
                return;
            }
            C7933p T0 = C7921o.this.mo29436T0(i);
            if (T0 != null) {
                synchronized (T0) {
                    T0.mo29450i(j);
                }
            }
        }

        /* renamed from: k */
        public void mo29364k(boolean z, int i, int i2) {
            if (z) {
                C7914k z0 = C7921o.this.m43434c1(i);
                if (z0 != null) {
                    z0.mo29412b();
                    return;
                }
                return;
            }
            C7921o.this.m43439j1(true, i, i2, (C7914k) null);
        }

        /* renamed from: l */
        public void mo29365l(int i, int i2, List<C7897d> list) {
            C7921o.this.m43430Z0(i2, list);
        }

        /* renamed from: m */
        public void mo29366m() {
        }

        /* renamed from: n */
        public void mo29367n(boolean z, int i, C8637g gVar, int i2) throws IOException {
            if (C7921o.this.m43432b1(i)) {
                C7921o.this.m43427X0(i, gVar, i2, z);
                return;
            }
            C7933p T0 = C7921o.this.mo29436T0(i);
            if (T0 == null) {
                C7921o.this.mo29446l1(i, C7893a.INVALID_STREAM);
                gVar.mo30715j((long) i2);
                return;
            }
            T0.mo29460v(gVar, i2);
            if (z) {
                T0.mo29461w();
            }
        }

        /* JADX WARNING: type inference failed for: r1v14, types: [java.lang.Object[]] */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: o */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29368o(boolean r7, p159f.p334h.p337b.p338z.p340k.C7917m r8) {
            /*
                r6 = this;
                f.h.b.z.k.o r0 = p159f.p334h.p337b.p338z.p340k.C7921o.this
                monitor-enter(r0)
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.m r1 = r1.f33591v     // Catch:{ all -> 0x0093 }
                r2 = 65536(0x10000, float:9.18355E-41)
                int r1 = r1.mo29422e(r2)     // Catch:{ all -> 0x0093 }
                if (r7 == 0) goto L_0x0016
                f.h.b.z.k.o r7 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.m r7 = r7.f33591v     // Catch:{ all -> 0x0093 }
                r7.mo29418a()     // Catch:{ all -> 0x0093 }
            L_0x0016:
                f.h.b.z.k.o r7 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.m r7 = r7.f33591v     // Catch:{ all -> 0x0093 }
                r7.mo29426i(r8)     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.o r7 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                f.h.b.s r7 = r7.mo29435S0()     // Catch:{ all -> 0x0093 }
                f.h.b.s r3 = p159f.p334h.p337b.C7835s.HTTP_2     // Catch:{ all -> 0x0093 }
                if (r7 != r3) goto L_0x002a
                r6.m43475b(r8)     // Catch:{ all -> 0x0093 }
            L_0x002a:
                f.h.b.z.k.o r7 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.m r7 = r7.f33591v     // Catch:{ all -> 0x0093 }
                int r7 = r7.mo29422e(r2)     // Catch:{ all -> 0x0093 }
                r8 = -1
                r2 = 0
                r4 = 0
                if (r7 == r8) goto L_0x0079
                if (r7 == r1) goto L_0x0079
                int r7 = r7 - r1
                long r7 = (long) r7     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.f33592w     // Catch:{ all -> 0x0093 }
                if (r1 != 0) goto L_0x004f
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                r1.mo29433P0(r7)     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                r5 = 1
                boolean unused = r1.f33592w = r5     // Catch:{ all -> 0x0093 }
            L_0x004f:
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                java.util.Map r1 = r1.f33579j     // Catch:{ all -> 0x0093 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0093 }
                if (r1 != 0) goto L_0x007a
                f.h.b.z.k.o r1 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                java.util.Map r1 = r1.f33579j     // Catch:{ all -> 0x0093 }
                java.util.Collection r1 = r1.values()     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.o r4 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x0093 }
                java.util.Map r4 = r4.f33579j     // Catch:{ all -> 0x0093 }
                int r4 = r4.size()     // Catch:{ all -> 0x0093 }
                f.h.b.z.k.p[] r4 = new p159f.p334h.p337b.p338z.p340k.C7933p[r4]     // Catch:{ all -> 0x0093 }
                java.lang.Object[] r1 = r1.toArray(r4)     // Catch:{ all -> 0x0093 }
                r4 = r1
                f.h.b.z.k.p[] r4 = (p159f.p334h.p337b.p338z.p340k.C7933p[]) r4     // Catch:{ all -> 0x0093 }
                goto L_0x007a
            L_0x0079:
                r7 = r2
            L_0x007a:
                monitor-exit(r0)     // Catch:{ all -> 0x0093 }
                if (r4 == 0) goto L_0x0092
                int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                if (r0 == 0) goto L_0x0092
                int r0 = r4.length
                r1 = 0
            L_0x0083:
                if (r1 >= r0) goto L_0x0092
                r2 = r4[r1]
                monitor-enter(r2)
                r2.mo29450i(r7)     // Catch:{ all -> 0x008f }
                monitor-exit(r2)     // Catch:{ all -> 0x008f }
                int r1 = r1 + 1
                goto L_0x0083
            L_0x008f:
                r7 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x008f }
                throw r7
            L_0x0092:
                return
            L_0x0093:
                r7 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0093 }
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7921o.C7930i.mo29368o(boolean, f.h.b.z.k.m):void");
        }

        /* renamed from: p */
        public void mo29369p(int i, int i2, int i3, boolean z) {
        }

        /* JADX WARNING: Code restructure failed: missing block: B:31:0x008f, code lost:
            if (r14.failIfStreamPresent() == false) goto L_0x009c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
            r0.mo29452n(p159f.p334h.p337b.p338z.p340k.C7893a.PROTOCOL_ERROR);
            r8.f33629i.mo29440d1(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:33:0x009b, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:34:0x009c, code lost:
            r0.mo29462x(r13, r14);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x009f, code lost:
            if (r10 == false) goto L_?;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
            r0.mo29461w();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:45:?, code lost:
            return;
         */
        /* renamed from: q */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void mo29370q(boolean r9, boolean r10, int r11, int r12, java.util.List<p159f.p334h.p337b.p338z.p340k.C7897d> r13, p159f.p334h.p337b.p338z.p340k.C7898e r14) {
            /*
                r8 = this;
                f.h.b.z.k.o r12 = p159f.p334h.p337b.p338z.p340k.C7921o.this
                boolean r12 = r12.m43432b1(r11)
                if (r12 == 0) goto L_0x000e
                f.h.b.z.k.o r9 = p159f.p334h.p337b.p338z.p340k.C7921o.this
                r9.m43429Y0(r11, r13, r10)
                return
            L_0x000e:
                f.h.b.z.k.o r12 = p159f.p334h.p337b.p338z.p340k.C7921o.this
                monitor-enter(r12)
                f.h.b.z.k.o r0 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                boolean r0 = r0.f33583n     // Catch:{ all -> 0x00a5 }
                if (r0 == 0) goto L_0x001b
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x001b:
                f.h.b.z.k.o r0 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                f.h.b.z.k.p r0 = r0.mo29436T0(r11)     // Catch:{ all -> 0x00a5 }
                if (r0 != 0) goto L_0x008a
                boolean r14 = r14.failIfStreamAbsent()     // Catch:{ all -> 0x00a5 }
                if (r14 == 0) goto L_0x0032
                f.h.b.z.k.o r9 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                f.h.b.z.k.a r10 = p159f.p334h.p337b.p338z.p340k.C7893a.INVALID_STREAM     // Catch:{ all -> 0x00a5 }
                r9.mo29446l1(r11, r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x0032:
                f.h.b.z.k.o r14 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                int r14 = r14.f33581l     // Catch:{ all -> 0x00a5 }
                if (r11 > r14) goto L_0x003c
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x003c:
                int r14 = r11 % 2
                f.h.b.z.k.o r0 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                int r0 = r0.f33582m     // Catch:{ all -> 0x00a5 }
                r1 = 2
                int r0 = r0 % r1
                if (r14 != r0) goto L_0x004a
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x004a:
                f.h.b.z.k.p r14 = new f.h.b.z.k.p     // Catch:{ all -> 0x00a5 }
                f.h.b.z.k.o r4 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                r2 = r14
                r3 = r11
                r5 = r9
                r6 = r10
                r7 = r13
                r2.<init>(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00a5 }
                f.h.b.z.k.o r9 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                int unused = r9.f33581l = r11     // Catch:{ all -> 0x00a5 }
                f.h.b.z.k.o r9 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                java.util.Map r9 = r9.f33579j     // Catch:{ all -> 0x00a5 }
                java.lang.Integer r10 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r9.put(r10, r14)     // Catch:{ all -> 0x00a5 }
                java.util.concurrent.ExecutorService r9 = p159f.p334h.p337b.p338z.p340k.C7921o.f33573C     // Catch:{ all -> 0x00a5 }
                f.h.b.z.k.o$i$a r10 = new f.h.b.z.k.o$i$a     // Catch:{ all -> 0x00a5 }
                java.lang.String r13 = "OkHttp %s stream %d"
                java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a5 }
                r1 = 0
                f.h.b.z.k.o r2 = p159f.p334h.p337b.p338z.p340k.C7921o.this     // Catch:{ all -> 0x00a5 }
                java.lang.String r2 = r2.f33580k     // Catch:{ all -> 0x00a5 }
                r0[r1] = r2     // Catch:{ all -> 0x00a5 }
                r1 = 1
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x00a5 }
                r0[r1] = r11     // Catch:{ all -> 0x00a5 }
                r10.<init>(r13, r0, r14)     // Catch:{ all -> 0x00a5 }
                r9.execute(r10)     // Catch:{ all -> 0x00a5 }
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                return
            L_0x008a:
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                boolean r9 = r14.failIfStreamPresent()
                if (r9 == 0) goto L_0x009c
                f.h.b.z.k.a r9 = p159f.p334h.p337b.p338z.p340k.C7893a.PROTOCOL_ERROR
                r0.mo29452n(r9)
                f.h.b.z.k.o r9 = p159f.p334h.p337b.p338z.p340k.C7921o.this
                r9.mo29440d1(r11)
                return
            L_0x009c:
                r0.mo29462x(r13, r14)
                if (r10 == 0) goto L_0x00a4
                r0.mo29461w()
            L_0x00a4:
                return
            L_0x00a5:
                r9 = move-exception
                monitor-exit(r12)     // Catch:{ all -> 0x00a5 }
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7921o.C7930i.mo29370q(boolean, boolean, int, int, java.util.List, f.h.b.z.k.e):void");
        }

        /* renamed from: r */
        public void mo29371r(int i, C7893a aVar, C8638h hVar) {
            C7933p[] pVarArr;
            hVar.size();
            synchronized (C7921o.this) {
                pVarArr = (C7933p[]) C7921o.this.f33579j.values().toArray(new C7933p[C7921o.this.f33579j.size()]);
                boolean unused = C7921o.this.f33583n = true;
            }
            for (C7933p pVar : pVarArr) {
                if (pVar.mo29453o() > i && pVar.mo29457s()) {
                    pVar.mo29463y(C7893a.REFUSED_STREAM);
                    C7921o.this.mo29440d1(pVar.mo29453o());
                }
            }
        }

        private C7930i() {
            super("OkHttp %s", C7921o.this.f33580k);
        }
    }

    static {
        Class<C7921o> cls = C7921o.class;
    }

    /* synthetic */ C7921o(C7929h hVar, C7922a aVar) throws IOException {
        this(hVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: Q0 */
    public void m43424Q0(C7893a aVar, C7893a aVar2) throws IOException {
        int i;
        C7933p[] pVarArr;
        C7914k[] kVarArr = null;
        try {
            mo29443g1(aVar);
            e = null;
        } catch (IOException e) {
            e = e;
        }
        synchronized (this) {
            if (!this.f33579j.isEmpty()) {
                pVarArr = (C7933p[]) this.f33579j.values().toArray(new C7933p[this.f33579j.size()]);
                this.f33579j.clear();
                m43436f1(false);
            } else {
                pVarArr = null;
            }
            Map<Integer, C7914k> map = this.f33586q;
            if (map != null) {
                this.f33586q = null;
                kVarArr = (C7914k[]) map.values().toArray(new C7914k[this.f33586q.size()]);
            }
        }
        if (pVarArr != null) {
            for (C7933p l : pVarArr) {
                try {
                    l.mo29451l(aVar2);
                } catch (IOException e2) {
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        if (kVarArr != null) {
            for (C7914k a : kVarArr) {
                a.mo29411a();
            }
        }
        try {
            this.f33595z.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.f33594y.close();
        } catch (IOException e4) {
            e = e4;
        }
        if (e != null) {
            throw e;
        }
    }

    /* renamed from: V0 */
    private C7933p m43426V0(int i, List<C7897d> list, boolean z, boolean z2) throws IOException {
        int i2;
        C7933p pVar;
        boolean z3 = !z;
        boolean z4 = !z2;
        synchronized (this.f33595z) {
            synchronized (this) {
                if (!this.f33583n) {
                    i2 = this.f33582m;
                    this.f33582m = i2 + 2;
                    pVar = new C7933p(i2, this, z3, z4, list);
                    if (pVar.mo29458t()) {
                        this.f33579j.put(Integer.valueOf(i2), pVar);
                        m43436f1(false);
                    }
                } else {
                    throw new IOException("shutdown");
                }
            }
            if (i == 0) {
                this.f33595z.mo29374D0(z3, z4, i2, i, list);
            } else if (!this.f33577h) {
                this.f33595z.mo29382l(i, i2, list);
            } else {
                throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
            }
        }
        if (!z) {
            this.f33595z.flush();
        }
        return pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: X0 */
    public void m43427X0(int i, C8637g gVar, int i2, boolean z) throws IOException {
        C8633e eVar = new C8633e();
        long j = (long) i2;
        gVar.mo30668E0(j);
        gVar.mo29326w0(eVar, j);
        if (eVar.mo30688U0() == j) {
            this.f33585p.execute(new C7927f("OkHttp %s Push Data[%s]", new Object[]{this.f33580k, Integer.valueOf(i)}, i, eVar, i2, z));
            return;
        }
        throw new IOException(eVar.mo30688U0() + " != " + i2);
    }

    /* access modifiers changed from: private */
    /* renamed from: Y0 */
    public void m43429Y0(int i, List<C7897d> list, boolean z) {
        this.f33585p.execute(new C7926e("OkHttp %s Push Headers[%s]", new Object[]{this.f33580k, Integer.valueOf(i)}, i, list, z));
    }

    /* access modifiers changed from: private */
    /* renamed from: Z0 */
    public void m43430Z0(int i, List<C7897d> list) {
        synchronized (this) {
            if (this.f33575B.contains(Integer.valueOf(i))) {
                mo29446l1(i, C7893a.PROTOCOL_ERROR);
                return;
            }
            this.f33575B.add(Integer.valueOf(i));
            this.f33585p.execute(new C7925d("OkHttp %s Push Request[%s]", new Object[]{this.f33580k, Integer.valueOf(i)}, i, list));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a1 */
    public void m43431a1(int i, C7893a aVar) {
        this.f33585p.execute(new C7928g("OkHttp %s Push Reset[%s]", new Object[]{this.f33580k, Integer.valueOf(i)}, i, aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: b1 */
    public boolean m43432b1(int i) {
        return this.f33576g == C7835s.HTTP_2 && i != 0 && (i & 1) == 0;
    }

    /* access modifiers changed from: private */
    /* renamed from: c1 */
    public synchronized C7914k m43434c1(int i) {
        Map<Integer, C7914k> map;
        map = this.f33586q;
        return map != null ? map.remove(Integer.valueOf(i)) : null;
    }

    /* renamed from: f1 */
    private synchronized void m43436f1(boolean z) {
        long j;
        if (z) {
            try {
                j = System.nanoTime();
            } catch (Throwable th) {
                throw th;
            }
        } else {
            j = Long.MAX_VALUE;
        }
        this.f33584o = j;
    }

    /* access modifiers changed from: private */
    /* renamed from: i1 */
    public void m43438i1(boolean z, int i, int i2, C7914k kVar) throws IOException {
        synchronized (this.f33595z) {
            if (kVar != null) {
                kVar.mo29413c();
            }
            this.f33595z.mo29381k(z, i, i2);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j1 */
    public void m43439j1(boolean z, int i, int i2, C7914k kVar) {
        f33573C.execute(new C7924c("OkHttp %s ping %08x%08x", new Object[]{this.f33580k, Integer.valueOf(i), Integer.valueOf(i2)}, z, i, i2, kVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public void mo29433P0(long j) {
        this.f33589t += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: R0 */
    public synchronized long mo29434R0() {
        return this.f33584o;
    }

    /* renamed from: S0 */
    public C7835s mo29435S0() {
        return this.f33576g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T0 */
    public synchronized C7933p mo29436T0(int i) {
        return this.f33579j.get(Integer.valueOf(i));
    }

    /* renamed from: U0 */
    public synchronized boolean mo29437U0() {
        return this.f33584o != Long.MAX_VALUE;
    }

    /* renamed from: W0 */
    public C7933p mo29438W0(List<C7897d> list, boolean z, boolean z2) throws IOException {
        return m43426V0(0, list, z, z2);
    }

    public void close() throws IOException {
        m43424Q0(C7893a.NO_ERROR, C7893a.CANCEL);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d1 */
    public synchronized C7933p mo29440d1(int i) {
        C7933p remove;
        remove = this.f33579j.remove(Integer.valueOf(i));
        if (remove != null && this.f33579j.isEmpty()) {
            m43436f1(true);
        }
        return remove;
    }

    /* renamed from: e1 */
    public void mo29441e1() throws IOException {
        this.f33595z.mo29372C();
        this.f33595z.mo29383y0(this.f33590u);
        int e = this.f33590u.mo29422e(65536);
        if (e != 65536) {
            this.f33595z.mo29380i(0, (long) (e - 65536));
        }
    }

    public void flush() throws IOException {
        this.f33595z.flush();
    }

    /* renamed from: g1 */
    public void mo29443g1(C7893a aVar) throws IOException {
        synchronized (this.f33595z) {
            synchronized (this) {
                if (!this.f33583n) {
                    this.f33583n = true;
                    int i = this.f33581l;
                    this.f33595z.mo29377O(i, aVar, C7859h.f33390a);
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:22|23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r3 = java.lang.Math.min((int) java.lang.Math.min(r12, r3), r8.f33595z.mo29373C0());
        r6 = (long) r3;
        r8.f33589t -= r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0049, code lost:
        throw new java.io.InterruptedIOException();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0044 */
    /* renamed from: h1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo29444h1(int r9, boolean r10, p394k.C8633e r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            r1 = 0
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 != 0) goto L_0x000d
            f.h.b.z.k.c r12 = r8.f33595z
            r12.mo29375F(r10, r9, r11, r0)
            return
        L_0x000d:
            int r3 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r3 <= 0) goto L_0x004c
            monitor-enter(r8)
        L_0x0012:
            long r3 = r8.f33589t     // Catch:{ InterruptedException -> 0x0044 }
            int r5 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r5 > 0) goto L_0x001c
            r8.wait()     // Catch:{ InterruptedException -> 0x0044 }
            goto L_0x0012
        L_0x001c:
            long r3 = java.lang.Math.min(r12, r3)     // Catch:{ all -> 0x0042 }
            int r4 = (int) r3     // Catch:{ all -> 0x0042 }
            f.h.b.z.k.c r3 = r8.f33595z     // Catch:{ all -> 0x0042 }
            int r3 = r3.mo29373C0()     // Catch:{ all -> 0x0042 }
            int r3 = java.lang.Math.min(r4, r3)     // Catch:{ all -> 0x0042 }
            long r4 = r8.f33589t     // Catch:{ all -> 0x0042 }
            long r6 = (long) r3     // Catch:{ all -> 0x0042 }
            long r4 = r4 - r6
            r8.f33589t = r4     // Catch:{ all -> 0x0042 }
            monitor-exit(r8)     // Catch:{ all -> 0x0042 }
            long r12 = r12 - r6
            f.h.b.z.k.c r4 = r8.f33595z
            if (r10 == 0) goto L_0x003d
            int r5 = (r12 > r1 ? 1 : (r12 == r1 ? 0 : -1))
            if (r5 != 0) goto L_0x003d
            r5 = 1
            goto L_0x003e
        L_0x003d:
            r5 = 0
        L_0x003e:
            r4.mo29375F(r5, r9, r11, r3)
            goto L_0x000d
        L_0x0042:
            r9 = move-exception
            goto L_0x004a
        L_0x0044:
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch:{ all -> 0x0042 }
            r9.<init>()     // Catch:{ all -> 0x0042 }
            throw r9     // Catch:{ all -> 0x0042 }
        L_0x004a:
            monitor-exit(r8)     // Catch:{ all -> 0x0042 }
            throw r9
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7921o.mo29444h1(int, boolean, k.e, long):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k1 */
    public void mo29445k1(int i, C7893a aVar) throws IOException {
        this.f33595z.mo29378f(i, aVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l1 */
    public void mo29446l1(int i, C7893a aVar) {
        f33573C.submit(new C7922a("OkHttp %s stream %d", new Object[]{this.f33580k, Integer.valueOf(i)}, i, aVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m1 */
    public void mo29447m1(int i, long j) {
        f33573C.execute(new C7923b("OkHttp Window Update %s stream %d", new Object[]{this.f33580k, Integer.valueOf(i)}, i, j));
    }

    private C7921o(C7929h hVar) throws IOException {
        this.f33579j = new HashMap();
        this.f33584o = System.nanoTime();
        this.f33588s = 0;
        C7917m mVar = new C7917m();
        this.f33590u = mVar;
        C7917m mVar2 = new C7917m();
        this.f33591v = mVar2;
        this.f33592w = false;
        this.f33575B = new LinkedHashSet();
        C7835s a = hVar.f33625d;
        this.f33576g = a;
        this.f33587r = hVar.f33626e;
        boolean c = hVar.f33627f;
        this.f33577h = c;
        this.f33578i = hVar.f33624c;
        this.f33582m = hVar.f33627f ? 1 : 2;
        if (hVar.f33627f && a == C7835s.HTTP_2) {
            this.f33582m += 2;
        }
        boolean c2 = hVar.f33627f;
        if (hVar.f33627f) {
            mVar.mo29428k(7, 0, BASS.BASS_SPEAKER_FRONT);
        }
        String e = hVar.f33622a;
        this.f33580k = e;
        if (a == C7835s.HTTP_2) {
            this.f33593x = new C7902g();
            this.f33585p = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), C7859h.m43094r(String.format("OkHttp %s Push Observer", new Object[]{e}), true));
            mVar2.mo29428k(7, 0, 65535);
            mVar2.mo29428k(5, 0, 16384);
        } else if (a == C7835s.SPDY_3) {
            this.f33593x = new C7918n();
            this.f33585p = null;
        } else {
            throw new AssertionError(a);
        }
        this.f33589t = (long) mVar2.mo29422e(65536);
        this.f33594y = hVar.f33623b;
        this.f33595z = this.f33593x.mo29400b(C8645n.m46984a(C8645n.m46987d(hVar.f33623b)), c);
        C7930i iVar = new C7930i(this, (C7922a) null);
        this.f33574A = iVar;
        new Thread(iVar).start();
    }
}
