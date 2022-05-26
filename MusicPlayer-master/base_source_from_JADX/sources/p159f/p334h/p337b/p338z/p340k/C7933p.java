package p159f.p334h.p337b.p338z.p340k;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import p394k.C8620a0;
import p394k.C8622b0;
import p394k.C8628d;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8659y;

/* renamed from: f.h.b.z.k.p */
/* compiled from: SpdyStream */
public final class C7933p {

    /* renamed from: a */
    long f33634a = 0;

    /* renamed from: b */
    long f33635b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final int f33636c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C7921o f33637d;

    /* renamed from: e */
    private final List<C7897d> f33638e;

    /* renamed from: f */
    private List<C7897d> f33639f;

    /* renamed from: g */
    private final C7936c f33640g;

    /* renamed from: h */
    final C7935b f33641h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7937d f33642i = new C7937d();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C7937d f33643j = new C7937d();
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C7893a f33644k = null;

    /* renamed from: f.h.b.z.k.p$b */
    /* compiled from: SpdyStream */
    final class C7935b implements C8659y {

        /* renamed from: g */
        private final C8633e f33645g = new C8633e();
        /* access modifiers changed from: private */

        /* renamed from: h */
        public boolean f33646h;
        /* access modifiers changed from: private */

        /* renamed from: i */
        public boolean f33647i;

        C7935b() {
        }

        /* JADX INFO: finally extract failed */
        /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
            p159f.p334h.p337b.p338z.p340k.C7933p.m43490b(r11.f33648j).mo29466z();
            p159f.p334h.p337b.p338z.p340k.C7933p.m43491c(r11.f33648j);
            r9 = java.lang.Math.min(r11.f33648j.f33635b, r11.f33645g.mo30688U0());
            r1 = r11.f33648j;
            r1.f33635b -= r9;
         */
        /* renamed from: x */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private void m43518x(boolean r12) throws java.io.IOException {
            /*
                r11 = this;
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                monitor-enter(r0)
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x007a }
                f.h.b.z.k.p$d r1 = r1.f33643j     // Catch:{ all -> 0x007a }
                r1.mo30653s()     // Catch:{ all -> 0x007a }
            L_0x000c:
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x006f }
                long r2 = r1.f33635b     // Catch:{ all -> 0x006f }
                r4 = 0
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L_0x002a
                boolean r2 = r11.f33647i     // Catch:{ all -> 0x006f }
                if (r2 != 0) goto L_0x002a
                boolean r2 = r11.f33646h     // Catch:{ all -> 0x006f }
                if (r2 != 0) goto L_0x002a
                f.h.b.z.k.a r1 = r1.f33644k     // Catch:{ all -> 0x006f }
                if (r1 != 0) goto L_0x002a
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x006f }
                r1.m43500z()     // Catch:{ all -> 0x006f }
                goto L_0x000c
            L_0x002a:
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x007a }
                f.h.b.z.k.p$d r1 = r1.f33643j     // Catch:{ all -> 0x007a }
                r1.mo29466z()     // Catch:{ all -> 0x007a }
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x007a }
                r1.m43498k()     // Catch:{ all -> 0x007a }
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x007a }
                long r1 = r1.f33635b     // Catch:{ all -> 0x007a }
                k.e r3 = r11.f33645g     // Catch:{ all -> 0x007a }
                long r3 = r3.mo30688U0()     // Catch:{ all -> 0x007a }
                long r9 = java.lang.Math.min(r1, r3)     // Catch:{ all -> 0x007a }
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x007a }
                long r2 = r1.f33635b     // Catch:{ all -> 0x007a }
                long r2 = r2 - r9
                r1.f33635b = r2     // Catch:{ all -> 0x007a }
                monitor-exit(r0)     // Catch:{ all -> 0x007a }
                f.h.b.z.k.o r5 = r1.f33637d
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                int r6 = r0.f33636c
                if (r12 == 0) goto L_0x0067
                k.e r12 = r11.f33645g
                long r0 = r12.mo30688U0()
                int r12 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
                if (r12 != 0) goto L_0x0067
                r12 = 1
                r7 = 1
                goto L_0x0069
            L_0x0067:
                r12 = 0
                r7 = 0
            L_0x0069:
                k.e r8 = r11.f33645g
                r5.mo29444h1(r6, r7, r8, r9)
                return
            L_0x006f:
                r12 = move-exception
                f.h.b.z.k.p r1 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x007a }
                f.h.b.z.k.p$d r1 = r1.f33643j     // Catch:{ all -> 0x007a }
                r1.mo29466z()     // Catch:{ all -> 0x007a }
                throw r12     // Catch:{ all -> 0x007a }
            L_0x007a:
                r12 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x007a }
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7933p.C7935b.m43518x(boolean):void");
        }

        /* renamed from: b0 */
        public void mo29321b0(C8633e eVar, long j) throws IOException {
            this.f33645g.mo29321b0(eVar, j);
            while (this.f33645g.mo30688U0() >= 16384) {
                m43518x(false);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (r8.f33645g.mo30688U0() <= 0) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0027, code lost:
            if (r8.f33645g.mo30688U0() <= 0) goto L_0x0040;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0029, code lost:
            m43518x(true);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
            p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33648j).mo29444h1(p159f.p334h.p337b.p338z.p340k.C7933p.m43493e(r8.f33648j), true, (p394k.C8633e) null, 0);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0040, code lost:
            r2 = r8.f33648j;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
            monitor-enter(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
            r8.f33646h = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
            monitor-exit(r2);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
            p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33648j).flush();
            p159f.p334h.p337b.p338z.p340k.C7933p.m43489a(r8.f33648j);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
            if (r8.f33648j.f33641h.f33647i != false) goto L_0x0040;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void close() throws java.io.IOException {
            /*
                r8 = this;
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                monitor-enter(r0)
                boolean r1 = r8.f33646h     // Catch:{ all -> 0x0058 }
                if (r1 == 0) goto L_0x0009
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                return
            L_0x0009:
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                f.h.b.z.k.p$b r0 = r0.f33641h
                boolean r0 = r0.f33647i
                r1 = 1
                if (r0 != 0) goto L_0x0040
                k.e r0 = r8.f33645g
                long r2 = r0.mo30688U0()
                r4 = 0
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x002d
            L_0x001f:
                k.e r0 = r8.f33645g
                long r2 = r0.mo30688U0()
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 <= 0) goto L_0x0040
                r8.m43518x(r1)
                goto L_0x001f
            L_0x002d:
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                f.h.b.z.k.o r2 = r0.f33637d
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                int r3 = r0.f33636c
                r4 = 1
                r5 = 0
                r6 = 0
                r2.mo29444h1(r3, r4, r5, r6)
            L_0x0040:
                f.h.b.z.k.p r2 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                monitor-enter(r2)
                r8.f33646h = r1     // Catch:{ all -> 0x0055 }
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                f.h.b.z.k.o r0 = r0.f33637d
                r0.flush()
                f.h.b.z.k.p r0 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                r0.m43497j()
                return
            L_0x0055:
                r0 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x0055 }
                throw r0
            L_0x0058:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0058 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7933p.C7935b.close():void");
        }

        public void flush() throws IOException {
            synchronized (C7933p.this) {
                C7933p.this.m43498k();
            }
            while (this.f33645g.mo30688U0() > 0) {
                m43518x(false);
            }
            C7933p.this.f33637d.flush();
        }

        public C8622b0 timeout() {
            return C7933p.this.f33643j;
        }
    }

    /* renamed from: f.h.b.z.k.p$c */
    /* compiled from: SpdyStream */
    private final class C7936c implements C8620a0 {

        /* renamed from: g */
        private final C8633e f33649g;

        /* renamed from: h */
        private final C8633e f33650h;

        /* renamed from: i */
        private final long f33651i;
        /* access modifiers changed from: private */

        /* renamed from: j */
        public boolean f33652j;
        /* access modifiers changed from: private */

        /* renamed from: k */
        public boolean f33653k;

        /* renamed from: H */
        private void m43520H() throws IOException {
            C7933p.this.f33642i.mo30653s();
            while (this.f33650h.mo30688U0() == 0 && !this.f33653k && !this.f33652j && C7933p.this.f33644k == null) {
                try {
                    C7933p.this.m43500z();
                } finally {
                    C7933p.this.f33642i.mo29466z();
                }
            }
        }

        /* renamed from: x */
        private void m43524x() throws IOException {
            if (this.f33652j) {
                throw new IOException("stream closed");
            } else if (C7933p.this.f33644k != null) {
                throw new IOException("stream was reset: " + C7933p.this.f33644k);
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: E */
        public void mo29464E(C8637g gVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            while (j > 0) {
                synchronized (C7933p.this) {
                    z = this.f33653k;
                    z2 = true;
                    z3 = this.f33650h.mo30688U0() + j > this.f33651i;
                }
                if (z3) {
                    gVar.mo30715j(j);
                    C7933p.this.mo29452n(C7893a.FLOW_CONTROL_ERROR);
                    return;
                } else if (z) {
                    gVar.mo30715j(j);
                    return;
                } else {
                    long w0 = gVar.mo29326w0(this.f33649g, j);
                    if (w0 != -1) {
                        j -= w0;
                        synchronized (C7933p.this) {
                            if (this.f33650h.mo30688U0() != 0) {
                                z2 = false;
                            }
                            this.f33650h.mo30703e0(this.f33649g);
                            if (z2) {
                                C7933p.this.notifyAll();
                            }
                        }
                    } else {
                        throw new EOFException();
                    }
                }
            }
        }

        public void close() throws IOException {
            synchronized (C7933p.this) {
                this.f33652j = true;
                this.f33650h.mo30697c();
                C7933p.this.notifyAll();
            }
            C7933p.this.m43497j();
        }

        public C8622b0 timeout() {
            return C7933p.this.f33642i;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:14:0x005d, code lost:
            r11 = p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0063, code lost:
            monitor-enter(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
            p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l).f33588s += r9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x0088, code lost:
            if (p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l).f33588s < ((long) (p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l).f33590u.mo29422e(65536) / 2))) goto L_0x00a4;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
            p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l).mo29447m1(0, p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l).f33588s);
            p159f.p334h.p337b.p338z.p340k.C7933p.m43492d(r8.f33654l).f33588s = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a4, code lost:
            monitor-exit(r11);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a5, code lost:
            return r9;
         */
        /* renamed from: w0 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public long mo29326w0(p394k.C8633e r9, long r10) throws java.io.IOException {
            /*
                r8 = this;
                r0 = 0
                int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
                if (r2 < 0) goto L_0x00ac
                f.h.b.z.k.p r2 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                monitor-enter(r2)
                r8.m43520H()     // Catch:{ all -> 0x00a9 }
                r8.m43524x()     // Catch:{ all -> 0x00a9 }
                k.e r3 = r8.f33650h     // Catch:{ all -> 0x00a9 }
                long r3 = r3.mo30688U0()     // Catch:{ all -> 0x00a9 }
                int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
                if (r5 != 0) goto L_0x001d
                r9 = -1
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                return r9
            L_0x001d:
                k.e r3 = r8.f33650h     // Catch:{ all -> 0x00a9 }
                long r4 = r3.mo30688U0()     // Catch:{ all -> 0x00a9 }
                long r10 = java.lang.Math.min(r10, r4)     // Catch:{ all -> 0x00a9 }
                long r9 = r3.mo29326w0(r9, r10)     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.p r11 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a9 }
                long r3 = r11.f33634a     // Catch:{ all -> 0x00a9 }
                long r3 = r3 + r9
                r11.f33634a = r3     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.o r11 = r11.f33637d     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.m r11 = r11.f33590u     // Catch:{ all -> 0x00a9 }
                r5 = 65536(0x10000, float:9.18355E-41)
                int r11 = r11.mo29422e(r5)     // Catch:{ all -> 0x00a9 }
                int r11 = r11 / 2
                long r6 = (long) r11     // Catch:{ all -> 0x00a9 }
                int r11 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
                if (r11 < 0) goto L_0x005c
                f.h.b.z.k.p r11 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.o r11 = r11.f33637d     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.p r3 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a9 }
                int r3 = r3.f33636c     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.p r4 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a9 }
                long r6 = r4.f33634a     // Catch:{ all -> 0x00a9 }
                r11.mo29447m1(r3, r6)     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.p r11 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a9 }
                r11.f33634a = r0     // Catch:{ all -> 0x00a9 }
            L_0x005c:
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                f.h.b.z.k.p r11 = p159f.p334h.p337b.p338z.p340k.C7933p.this
                f.h.b.z.k.o r11 = r11.f33637d
                monitor-enter(r11)
                f.h.b.z.k.p r2 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.o r2 = r2.f33637d     // Catch:{ all -> 0x00a6 }
                long r3 = r2.f33588s     // Catch:{ all -> 0x00a6 }
                long r3 = r3 + r9
                r2.f33588s = r3     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.p r2 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.o r2 = r2.f33637d     // Catch:{ all -> 0x00a6 }
                long r2 = r2.f33588s     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.p r4 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.o r4 = r4.f33637d     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.m r4 = r4.f33590u     // Catch:{ all -> 0x00a6 }
                int r4 = r4.mo29422e(r5)     // Catch:{ all -> 0x00a6 }
                int r4 = r4 / 2
                long r4 = (long) r4     // Catch:{ all -> 0x00a6 }
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L_0x00a4
                f.h.b.z.k.p r2 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.o r2 = r2.f33637d     // Catch:{ all -> 0x00a6 }
                r3 = 0
                f.h.b.z.k.p r4 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.o r4 = r4.f33637d     // Catch:{ all -> 0x00a6 }
                long r4 = r4.f33588s     // Catch:{ all -> 0x00a6 }
                r2.mo29447m1(r3, r4)     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.p r2 = p159f.p334h.p337b.p338z.p340k.C7933p.this     // Catch:{ all -> 0x00a6 }
                f.h.b.z.k.o r2 = r2.f33637d     // Catch:{ all -> 0x00a6 }
                r2.f33588s = r0     // Catch:{ all -> 0x00a6 }
            L_0x00a4:
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                return r9
            L_0x00a6:
                r9 = move-exception
                monitor-exit(r11)     // Catch:{ all -> 0x00a6 }
                throw r9
            L_0x00a9:
                r9 = move-exception
                monitor-exit(r2)     // Catch:{ all -> 0x00a9 }
                throw r9
            L_0x00ac:
                java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "byteCount < 0: "
                r0.append(r1)
                r0.append(r10)
                java.lang.String r10 = r0.toString()
                r9.<init>(r10)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7933p.C7936c.mo29326w0(k.e, long):long");
        }

        private C7936c(long j) {
            this.f33649g = new C8633e();
            this.f33650h = new C8633e();
            this.f33651i = j;
        }
    }

    /* renamed from: f.h.b.z.k.p$d */
    /* compiled from: SpdyStream */
    class C7937d extends C8628d {
        C7937d() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: y */
        public void mo29465y() {
            C7933p.this.mo29452n(C7893a.CANCEL);
        }

        /* renamed from: z */
        public void mo29466z() throws InterruptedIOException {
            if (mo30654t()) {
                throw new InterruptedIOException("timeout");
            }
        }
    }

    C7933p(int i, C7921o oVar, boolean z, boolean z2, List<C7897d> list) {
        Objects.requireNonNull(oVar, "connection == null");
        Objects.requireNonNull(list, "requestHeaders == null");
        this.f33636c = i;
        this.f33637d = oVar;
        this.f33635b = (long) oVar.f33591v.mo29422e(65536);
        C7936c cVar = new C7936c((long) oVar.f33590u.mo29422e(65536));
        this.f33640g = cVar;
        C7935b bVar = new C7935b();
        this.f33641h = bVar;
        boolean unused = cVar.f33653k = z2;
        boolean unused2 = bVar.f33647i = z;
        this.f33638e = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public void m43497j() throws IOException {
        boolean z;
        boolean t;
        synchronized (this) {
            z = !this.f33640g.f33653k && this.f33640g.f33652j && (this.f33641h.f33647i || this.f33641h.f33646h);
            t = mo29458t();
        }
        if (z) {
            mo29451l(C7893a.CANCEL);
        } else if (!t) {
            this.f33637d.mo29440d1(this.f33636c);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void m43498k() throws IOException {
        if (this.f33641h.f33646h) {
            throw new IOException("stream closed");
        } else if (this.f33641h.f33647i) {
            throw new IOException("stream finished");
        } else if (this.f33644k != null) {
            throw new IOException("stream was reset: " + this.f33644k);
        }
    }

    /* renamed from: m */
    private boolean m43499m(C7893a aVar) {
        synchronized (this) {
            if (this.f33644k != null) {
                return false;
            }
            if (this.f33640g.f33653k && this.f33641h.f33647i) {
                return false;
            }
            this.f33644k = aVar;
            notifyAll();
            this.f33637d.mo29440d1(this.f33636c);
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m43500z() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            throw new InterruptedIOException();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo29450i(long j) {
        this.f33635b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* renamed from: l */
    public void mo29451l(C7893a aVar) throws IOException {
        if (m43499m(aVar)) {
            this.f33637d.mo29445k1(this.f33636c, aVar);
        }
    }

    /* renamed from: n */
    public void mo29452n(C7893a aVar) {
        if (m43499m(aVar)) {
            this.f33637d.mo29446l1(this.f33636c, aVar);
        }
    }

    /* renamed from: o */
    public int mo29453o() {
        return this.f33636c;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0036, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r3.f33642i.mo29466z();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized java.util.List<p159f.p334h.p337b.p338z.p340k.C7897d> mo29454p() throws java.io.IOException {
        /*
            r3 = this;
            monitor-enter(r3)
            f.h.b.z.k.p$d r0 = r3.f33642i     // Catch:{ all -> 0x003d }
            r0.mo30653s()     // Catch:{ all -> 0x003d }
        L_0x0006:
            java.util.List<f.h.b.z.k.d> r0 = r3.f33639f     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            f.h.b.z.k.a r0 = r3.f33644k     // Catch:{ all -> 0x0036 }
            if (r0 != 0) goto L_0x0012
            r3.m43500z()     // Catch:{ all -> 0x0036 }
            goto L_0x0006
        L_0x0012:
            f.h.b.z.k.p$d r0 = r3.f33642i     // Catch:{ all -> 0x003d }
            r0.mo29466z()     // Catch:{ all -> 0x003d }
            java.util.List<f.h.b.z.k.d> r0 = r3.f33639f     // Catch:{ all -> 0x003d }
            if (r0 == 0) goto L_0x001d
            monitor-exit(r3)
            return r0
        L_0x001d:
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x003d }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003d }
            r1.<init>()     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "stream was reset: "
            r1.append(r2)     // Catch:{ all -> 0x003d }
            f.h.b.z.k.a r2 = r3.f33644k     // Catch:{ all -> 0x003d }
            r1.append(r2)     // Catch:{ all -> 0x003d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x003d }
            r0.<init>(r1)     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x0036:
            r0 = move-exception
            f.h.b.z.k.p$d r1 = r3.f33642i     // Catch:{ all -> 0x003d }
            r1.mo29466z()     // Catch:{ all -> 0x003d }
            throw r0     // Catch:{ all -> 0x003d }
        L_0x003d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p340k.C7933p.mo29454p():java.util.List");
    }

    /* renamed from: q */
    public C8659y mo29455q() {
        synchronized (this) {
            if (this.f33639f == null) {
                if (!mo29457s()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
            }
        }
        return this.f33641h;
    }

    /* renamed from: r */
    public C8620a0 mo29456r() {
        return this.f33640g;
    }

    /* renamed from: s */
    public boolean mo29457s() {
        if (this.f33637d.f33577h == ((this.f33636c & 1) == 1)) {
            return true;
        }
        return false;
    }

    /* renamed from: t */
    public synchronized boolean mo29458t() {
        if (this.f33644k != null) {
            return false;
        }
        if ((this.f33640g.f33653k || this.f33640g.f33652j) && ((this.f33641h.f33647i || this.f33641h.f33646h) && this.f33639f != null)) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public C8622b0 mo29459u() {
        return this.f33642i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public void mo29460v(C8637g gVar, int i) throws IOException {
        this.f33640g.mo29464E(gVar, (long) i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo29461w() {
        boolean t;
        synchronized (this) {
            boolean unused = this.f33640g.f33653k = true;
            t = mo29458t();
            notifyAll();
        }
        if (!t) {
            this.f33637d.mo29440d1(this.f33636c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo29462x(List<C7897d> list, C7898e eVar) {
        C7893a aVar = null;
        boolean z = true;
        synchronized (this) {
            if (this.f33639f == null) {
                if (eVar.failIfHeadersAbsent()) {
                    aVar = C7893a.PROTOCOL_ERROR;
                } else {
                    this.f33639f = list;
                    z = mo29458t();
                    notifyAll();
                }
            } else if (eVar.failIfHeadersPresent()) {
                aVar = C7893a.STREAM_IN_USE;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f33639f);
                arrayList.addAll(list);
                this.f33639f = arrayList;
            }
        }
        if (aVar != null) {
            mo29452n(aVar);
        } else if (!z) {
            this.f33637d.mo29440d1(this.f33636c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public synchronized void mo29463y(C7893a aVar) {
        if (this.f33644k == null) {
            this.f33644k = aVar;
            notifyAll();
        }
    }
}
