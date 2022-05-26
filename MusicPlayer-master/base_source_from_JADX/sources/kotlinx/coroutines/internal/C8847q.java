package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlinx.coroutines.C8919v0;
import p369i.p387z.p389d.C8589g;

/* renamed from: kotlinx.coroutines.internal.q */
/* compiled from: LockFreeTaskQueue.kt */
public final class C8847q<E> {

    /* renamed from: e */
    public static final C8848a f35238e = new C8848a((C8589g) null);

    /* renamed from: f */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f35239f;

    /* renamed from: g */
    private static final /* synthetic */ AtomicLongFieldUpdater f35240g;

    /* renamed from: h */
    public static final C8859z f35241h = new C8859z("REMOVE_FROZEN");
    private volatile /* synthetic */ Object _next = null;
    private volatile /* synthetic */ long _state = 0;

    /* renamed from: a */
    private final int f35242a;

    /* renamed from: b */
    private final boolean f35243b;

    /* renamed from: c */
    private final int f35244c;

    /* renamed from: d */
    private /* synthetic */ AtomicReferenceArray f35245d;

    /* renamed from: kotlinx.coroutines.internal.q$a */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C8848a {
        private C8848a() {
        }

        public /* synthetic */ C8848a(C8589g gVar) {
            this();
        }

        /* renamed from: a */
        public final int mo31165a(long j) {
            return (j & 2305843009213693952L) != 0 ? 2 : 1;
        }

        /* renamed from: b */
        public final long mo31166b(long j, int i) {
            return mo31168d(j, 1073741823) | (((long) i) << 0);
        }

        /* renamed from: c */
        public final long mo31167c(long j, int i) {
            return mo31168d(j, 1152921503533105152L) | (((long) i) << 30);
        }

        /* renamed from: d */
        public final long mo31168d(long j, long j2) {
            return j & (~j2);
        }
    }

    /* renamed from: kotlinx.coroutines.internal.q$b */
    /* compiled from: LockFreeTaskQueue.kt */
    public static final class C8849b {

        /* renamed from: a */
        public final int f35246a;

        public C8849b(int i) {
            this.f35246a = i;
        }
    }

    static {
        Class<C8847q> cls = C8847q.class;
        f35239f = AtomicReferenceFieldUpdater.newUpdater(cls, Object.class, "_next");
        f35240g = AtomicLongFieldUpdater.newUpdater(cls, "_state");
    }

    public C8847q(int i, boolean z) {
        this.f35242a = i;
        this.f35243b = z;
        int i2 = i - 1;
        this.f35244c = i2;
        this.f35245d = new AtomicReferenceArray(i);
        boolean z2 = false;
        if (i2 <= 1073741823) {
            if (!((i & i2) == 0 ? true : z2)) {
                throw new IllegalStateException("Check failed.".toString());
            }
            return;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    /* renamed from: b */
    private final C8847q<E> m47607b(long j) {
        C8847q<E> qVar = new C8847q<>(this.f35242a * 2, this.f35243b);
        int i = (int) ((1073741823 & j) >> 0);
        int i2 = (int) ((1152921503533105152L & j) >> 30);
        while (true) {
            int i3 = this.f35244c;
            if ((i & i3) != (i2 & i3)) {
                Object obj = this.f35245d.get(i3 & i);
                if (obj == null) {
                    obj = new C8849b(i);
                }
                qVar.f35245d.set(qVar.f35244c & i, obj);
                i++;
            } else {
                qVar._state = f35238e.mo31168d(j, 1152921504606846976L);
                return qVar;
            }
        }
    }

    /* renamed from: c */
    private final C8847q<E> m47608c(long j) {
        while (true) {
            C8847q<E> qVar = (C8847q) this._next;
            if (qVar != null) {
                return qVar;
            }
            f35239f.compareAndSet(this, (Object) null, m47607b(j));
        }
    }

    /* renamed from: e */
    private final C8847q<E> m47609e(int i, E e) {
        Object obj = this.f35245d.get(this.f35244c & i);
        if (!(obj instanceof C8849b) || ((C8849b) obj).f35246a != i) {
            return null;
        }
        this.f35245d.set(i & this.f35244c, e);
        return this;
    }

    /* renamed from: h */
    private final long m47610h() {
        long j;
        long j2;
        do {
            j = this._state;
            if ((j & 1152921504606846976L) != 0) {
                return j;
            }
            j2 = j | 1152921504606846976L;
        } while (!f35240g.compareAndSet(this, j, j2));
        return j2;
    }

    /* renamed from: k */
    private final C8847q<E> m47611k(int i, int i2) {
        long j;
        C8848a aVar;
        int i3;
        do {
            j = this._state;
            aVar = f35238e;
            boolean z = false;
            i3 = (int) ((1073741823 & j) >> 0);
            if (C8919v0.m47824a()) {
                if (i3 == i) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            if ((1152921504606846976L & j) != 0) {
                return mo31163i();
            }
        } while (!f35240g.compareAndSet(this, j, aVar.mo31166b(j, i2)));
        this.f35245d.set(this.f35244c & i3, (Object) null);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0069 A[LOOP:1: B:19:0x0069->B:22:0x007b, LOOP_START, PHI: r0 
      PHI: (r0v7 kotlinx.coroutines.internal.q) = (r0v6 kotlinx.coroutines.internal.q), (r0v9 kotlinx.coroutines.internal.q) binds: [B:18:0x0061, B:22:0x007b] A[DONT_GENERATE, DONT_INLINE]] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo31159a(E r14) {
        /*
            r13 = this;
        L_0x0000:
            long r2 = r13._state
            r0 = 3458764513820540928(0x3000000000000000, double:1.727233711018889E-77)
            long r0 = r0 & r2
            r6 = 0
            int r4 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0012
            kotlinx.coroutines.internal.q$a r14 = f35238e
            int r14 = r14.mo31165a(r2)
            return r14
        L_0x0012:
            kotlinx.coroutines.internal.q$a r0 = f35238e
            r4 = 1073741823(0x3fffffff, double:5.304989472E-315)
            long r4 = r4 & r2
            r8 = 0
            long r4 = r4 >> r8
            int r1 = (int) r4
            r4 = 1152921503533105152(0xfffffffc0000000, double:1.2882296003504729E-231)
            long r4 = r4 & r2
            r9 = 30
            long r4 = r4 >> r9
            int r9 = (int) r4
            int r10 = r13.f35244c
            int r4 = r9 + 2
            r4 = r4 & r10
            r5 = r1 & r10
            r11 = 1
            if (r4 != r5) goto L_0x0030
            return r11
        L_0x0030:
            boolean r4 = r13.f35243b
            r5 = 1073741823(0x3fffffff, float:1.9999999)
            if (r4 != 0) goto L_0x004f
            java.util.concurrent.atomic.AtomicReferenceArray r4 = r13.f35245d
            r12 = r9 & r10
            java.lang.Object r4 = r4.get(r12)
            if (r4 == 0) goto L_0x004f
            int r0 = r13.f35242a
            r2 = 1024(0x400, float:1.435E-42)
            if (r0 < r2) goto L_0x004e
            int r9 = r9 - r1
            r1 = r9 & r5
            int r0 = r0 >> 1
            if (r1 <= r0) goto L_0x0000
        L_0x004e:
            return r11
        L_0x004f:
            int r1 = r9 + 1
            r1 = r1 & r5
            java.util.concurrent.atomic.AtomicLongFieldUpdater r4 = f35240g
            long r11 = r0.mo31167c(r2, r1)
            r0 = r4
            r1 = r13
            r4 = r11
            boolean r0 = r0.compareAndSet(r1, r2, r4)
            if (r0 == 0) goto L_0x0000
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r13.f35245d
            r1 = r9 & r10
            r0.set(r1, r14)
            r0 = r13
        L_0x0069:
            long r1 = r0._state
            r3 = 1152921504606846976(0x1000000000000000, double:1.2882297539194267E-231)
            long r1 = r1 & r3
            int r3 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r3 != 0) goto L_0x0073
            goto L_0x007d
        L_0x0073:
            kotlinx.coroutines.internal.q r0 = r0.mo31163i()
            kotlinx.coroutines.internal.q r0 = r0.m47609e(r9, r14)
            if (r0 != 0) goto L_0x0069
        L_0x007d:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.internal.C8847q.mo31159a(java.lang.Object):int");
    }

    /* renamed from: d */
    public final boolean mo31160d() {
        long j;
        do {
            j = this._state;
            if ((j & 2305843009213693952L) != 0) {
                return true;
            }
            if ((1152921504606846976L & j) != 0) {
                return false;
            }
        } while (!f35240g.compareAndSet(this, j, j | 2305843009213693952L));
        return true;
    }

    /* renamed from: f */
    public final int mo31161f() {
        long j = this._state;
        return 1073741823 & (((int) ((j & 1152921503533105152L) >> 30)) - ((int) ((1073741823 & j) >> 0)));
    }

    /* renamed from: g */
    public final boolean mo31162g() {
        long j = this._state;
        return ((int) ((1073741823 & j) >> 0)) == ((int) ((j & 1152921503533105152L) >> 30));
    }

    /* renamed from: i */
    public final C8847q<E> mo31163i() {
        return m47608c(m47610h());
    }

    /* renamed from: j */
    public final Object mo31164j() {
        while (true) {
            long j = this._state;
            if ((1152921504606846976L & j) != 0) {
                return f35241h;
            }
            C8848a aVar = f35238e;
            int i = (int) ((1073741823 & j) >> 0);
            int i2 = (int) ((1152921503533105152L & j) >> 30);
            int i3 = this.f35244c;
            if ((i2 & i3) == (i & i3)) {
                return null;
            }
            Object obj = this.f35245d.get(i3 & i);
            if (obj == null) {
                if (this.f35243b) {
                    return null;
                }
            } else if (obj instanceof C8849b) {
                return null;
            } else {
                int i4 = (i + 1) & 1073741823;
                if (f35240g.compareAndSet(this, j, aVar.mo31166b(j, i4))) {
                    this.f35245d.set(this.f35244c & i, (Object) null);
                    return obj;
                } else if (this.f35243b) {
                    C8847q qVar = this;
                    do {
                        qVar = qVar.m47611k(i, i4);
                    } while (qVar != null);
                    return obj;
                }
            }
        }
    }
}
