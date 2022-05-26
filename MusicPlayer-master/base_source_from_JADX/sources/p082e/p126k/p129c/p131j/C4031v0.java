package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p082e.p126k.p129c.p131j.C3899b0;
import p082e.p126k.p129c.p131j.C3934i;
import p082e.p126k.p129c.p131j.C3976l0;
import p082e.p126k.p129c.p131j.C4042w1;
import p082e.p126k.p129c.p131j.C4052x1;
import sun.misc.Unsafe;

/* renamed from: e.k.c.j.v0 */
/* compiled from: MessageSchema */
final class C4031v0<T> implements C3963j1<T> {

    /* renamed from: r */
    private static final int[] f12190r = new int[0];

    /* renamed from: s */
    private static final Unsafe f12191s = C4022u1.m17618F();

    /* renamed from: a */
    private final int[] f12192a;

    /* renamed from: b */
    private final Object[] f12193b;

    /* renamed from: c */
    private final int f12194c;

    /* renamed from: d */
    private final int f12195d;

    /* renamed from: e */
    private final C4012s0 f12196e;

    /* renamed from: f */
    private final boolean f12197f;

    /* renamed from: g */
    private final boolean f12198g;

    /* renamed from: h */
    private final boolean f12199h;

    /* renamed from: i */
    private final boolean f12200i;

    /* renamed from: j */
    private final int[] f12201j;

    /* renamed from: k */
    private final int f12202k;

    /* renamed from: l */
    private final int f12203l;

    /* renamed from: m */
    private final C4051x0 f12204m;

    /* renamed from: n */
    private final C3947i0 f12205n;

    /* renamed from: o */
    private final C4006q1<?, ?> f12206o;

    /* renamed from: p */
    private final C4007r<?> f12207p;

    /* renamed from: q */
    private final C3993n0 f12208q;

    private C4031v0(int[] iArr, Object[] objArr, int i, int i2, C4012s0 s0Var, boolean z, boolean z2, int[] iArr2, int i3, int i4, C4051x0 x0Var, C3947i0 i0Var, C4006q1<?, ?> q1Var, C4007r<?> rVar, C3993n0 n0Var) {
        this.f12192a = iArr;
        this.f12193b = objArr;
        this.f12194c = i;
        this.f12195d = i2;
        this.f12198g = s0Var instanceof C4056z;
        this.f12199h = z;
        this.f12197f = rVar != null && rVar.mo13936e(s0Var);
        this.f12200i = z2;
        this.f12201j = iArr2;
        this.f12202k = i3;
        this.f12203l = i4;
        this.f12204m = x0Var;
        this.f12205n = i0Var;
        this.f12206o = q1Var;
        this.f12207p = rVar;
        this.f12196e = s0Var;
        this.f12208q = n0Var;
    }

    /* renamed from: A */
    private static boolean m17746A(Object obj, int i, C3963j1 j1Var) {
        return j1Var.mo13707d(C4022u1.m17617E(obj, m17763R(i)));
    }

    /* renamed from: B */
    private <N> boolean m17747B(Object obj, int i, int i2) {
        List list = (List) C4022u1.m17617E(obj, m17763R(i));
        if (list.isEmpty()) {
            return true;
        }
        C3963j1 s = m17796s(i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (!s.mo13707d(list.get(i3))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: C */
    private boolean m17748C(T t, int i, int i2) {
        Map<?, ?> h = this.f12208q.mo13902h(C4022u1.m17617E(t, m17763R(i)));
        if (h.isEmpty()) {
            return true;
        }
        if (this.f12208q.mo13897c(m17795r(i2)).f12109c.getJavaType() != C4042w1.C4049c.MESSAGE) {
            return true;
        }
        C3963j1<?> j1Var = null;
        for (Object next : h.values()) {
            if (j1Var == null) {
                j1Var = C3924e1.m16737a().mo13539d(next.getClass());
            }
            if (!j1Var.mo13707d(next)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: D */
    private boolean m17749D(T t, T t2, int i) {
        long Y = (long) (m17770Y(i) & 1048575);
        return C4022u1.m17613A(t, Y) == C4022u1.m17613A(t2, Y);
    }

    /* renamed from: E */
    private boolean m17750E(T t, int i, int i2) {
        return C4022u1.m17613A(t, (long) (m17770Y(i2) & 1048575)) == i;
    }

    /* renamed from: F */
    private static boolean m17751F(int i) {
        return (i & 268435456) != 0;
    }

    /* renamed from: G */
    private static List<?> m17752G(Object obj, long j) {
        return (List) C4022u1.m17617E(obj, j);
    }

    /* renamed from: H */
    private static <T> long m17753H(T t, long j) {
        return C4022u1.m17615C(t, j);
    }

    /*  JADX ERROR: StackOverflow in pass: MarkFinallyVisitor
        jadx.core.utils.exceptions.JadxOverflowException: 
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* renamed from: I */
    private <UT, UB, ET extends p082e.p126k.p129c.p131j.C4028v.C4030b<ET>> void m17754I(p082e.p126k.p129c.p131j.C4006q1<UT, UB> r17, p082e.p126k.p129c.p131j.C4007r<ET> r18, T r19, p082e.p126k.p129c.p131j.C3933h1 r20, p082e.p126k.p129c.p131j.C4003q r21) throws java.io.IOException {
        /*
            r16 = this;
            r8 = r16
            r9 = r17
            r10 = r19
            r0 = r20
            r11 = r21
            r12 = 0
            r13 = r12
            r14 = r13
        L_0x000d:
            int r1 = r20.mo13524z()     // Catch:{ all -> 0x060f }
            int r3 = r8.m17769X(r1)     // Catch:{ all -> 0x060f }
            if (r3 >= 0) goto L_0x008c
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 != r2) goto L_0x0033
            int r0 = r8.f12202k
        L_0x001e:
            int r1 = r8.f12203l
            if (r0 >= r1) goto L_0x002d
            int[] r1 = r8.f12201j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m17789n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x001e
        L_0x002d:
            if (r13 == 0) goto L_0x0032
            r9.mo13926o(r10, r13)
        L_0x0032:
            return
        L_0x0033:
            boolean r2 = r8.f12197f     // Catch:{ all -> 0x060f }
            if (r2 != 0) goto L_0x003b
            r15 = r18
            r3 = r12
            goto L_0x0044
        L_0x003b:
            e.k.c.j.s0 r2 = r8.f12196e     // Catch:{ all -> 0x060f }
            r15 = r18
            java.lang.Object r1 = r15.mo13933b(r11, r2, r1)     // Catch:{ all -> 0x060f }
            r3 = r1
        L_0x0044:
            if (r3 == 0) goto L_0x005b
            if (r14 != 0) goto L_0x004c
            e.k.c.j.v r14 = r18.mo13935d(r19)     // Catch:{ all -> 0x060f }
        L_0x004c:
            r1 = r18
            r2 = r20
            r4 = r21
            r5 = r14
            r6 = r13
            r7 = r17
            java.lang.Object r13 = r1.mo13938g(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x060f }
            goto L_0x000d
        L_0x005b:
            boolean r1 = r9.mo13928q(r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0068
            boolean r1 = r20.mo13484G()     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0068:
            if (r13 != 0) goto L_0x006e
            java.lang.Object r13 = r9.mo13917f(r10)     // Catch:{ all -> 0x060f }
        L_0x006e:
            boolean r1 = r9.mo13924m(r13, r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x0075
            goto L_0x000d
        L_0x0075:
            int r0 = r8.f12202k
        L_0x0077:
            int r1 = r8.f12203l
            if (r0 >= r1) goto L_0x0086
            int[] r1 = r8.f12201j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m17789n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x0077
        L_0x0086:
            if (r13 == 0) goto L_0x008b
            r9.mo13926o(r10, r13)
        L_0x008b:
            return
        L_0x008c:
            r15 = r18
            int r4 = r8.m17780i0(r3)     // Catch:{ all -> 0x060f }
            int r2 = m17779h0(r4)     // Catch:{ a -> 0x05c8 }
            switch(r2) {
                case 0: goto L_0x059b;
                case 1: goto L_0x058b;
                case 2: goto L_0x057b;
                case 3: goto L_0x056b;
                case 4: goto L_0x055b;
                case 5: goto L_0x054b;
                case 6: goto L_0x053b;
                case 7: goto L_0x052b;
                case 8: goto L_0x0523;
                case 9: goto L_0x04ec;
                case 10: goto L_0x04dc;
                case 11: goto L_0x04cc;
                case 12: goto L_0x04a9;
                case 13: goto L_0x0499;
                case 14: goto L_0x0489;
                case 15: goto L_0x0479;
                case 16: goto L_0x0469;
                case 17: goto L_0x0432;
                case 18: goto L_0x0423;
                case 19: goto L_0x0414;
                case 20: goto L_0x0405;
                case 21: goto L_0x03f6;
                case 22: goto L_0x03e7;
                case 23: goto L_0x03d8;
                case 24: goto L_0x03c9;
                case 25: goto L_0x03ba;
                case 26: goto L_0x03b5;
                case 27: goto L_0x03a3;
                case 28: goto L_0x0394;
                case 29: goto L_0x0385;
                case 30: goto L_0x036e;
                case 31: goto L_0x035f;
                case 32: goto L_0x0350;
                case 33: goto L_0x0341;
                case 34: goto L_0x0332;
                case 35: goto L_0x0323;
                case 36: goto L_0x0314;
                case 37: goto L_0x0305;
                case 38: goto L_0x02f6;
                case 39: goto L_0x02e7;
                case 40: goto L_0x02d8;
                case 41: goto L_0x02c9;
                case 42: goto L_0x02ba;
                case 43: goto L_0x02ab;
                case 44: goto L_0x0294;
                case 45: goto L_0x0285;
                case 46: goto L_0x0276;
                case 47: goto L_0x0267;
                case 48: goto L_0x0258;
                case 49: goto L_0x0242;
                case 50: goto L_0x0231;
                case 51: goto L_0x021d;
                case 52: goto L_0x0209;
                case 53: goto L_0x01f5;
                case 54: goto L_0x01e1;
                case 55: goto L_0x01cd;
                case 56: goto L_0x01b9;
                case 57: goto L_0x01a5;
                case 58: goto L_0x0191;
                case 59: goto L_0x0189;
                case 60: goto L_0x0150;
                case 61: goto L_0x0140;
                case 62: goto L_0x012c;
                case 63: goto L_0x0105;
                case 64: goto L_0x00f1;
                case 65: goto L_0x00dd;
                case 66: goto L_0x00c9;
                case 67: goto L_0x00b5;
                case 68: goto L_0x00a1;
                default: goto L_0x0099;
            }     // Catch:{ a -> 0x05c8 }
        L_0x0099:
            if (r13 != 0) goto L_0x05ab
            java.lang.Object r13 = r17.mo13925n()     // Catch:{ a -> 0x05c8 }
            goto L_0x05ab
        L_0x00a1:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r2 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r2 = r0.mo13492O(r2, r11)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x00b5:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r6 = r20.mo13521w()     // Catch:{ a -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x00c9:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r2 = r20.mo13520v()     // Catch:{ a -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x00dd:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r6 = r20.mo13507k()     // Catch:{ a -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x00f1:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r2 = r20.mo13485H()     // Catch:{ a -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0105:
            int r2 = r20.mo13518t()     // Catch:{ a -> 0x05c8 }
            e.k.c.j.b0$e r5 = r8.m17794q(r3)     // Catch:{ a -> 0x05c8 }
            if (r5 == 0) goto L_0x011c
            boolean r5 = r5.mo13462a(r2)     // Catch:{ a -> 0x05c8 }
            if (r5 == 0) goto L_0x0116
            goto L_0x011c
        L_0x0116:
            java.lang.Object r13 = p082e.p126k.p129c.p131j.C3978l1.m17305L(r1, r2, r13, r9)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x011c:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x012c:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r2 = r20.mo13510n()     // Catch:{ a -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0140:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.i r2 = r20.mo13480C()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0150:
            boolean r2 = r8.m17750E(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            if (r2 == 0) goto L_0x0172
            long r5 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r2 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r10, r5)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r5 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r5 = r0.mo13494a(r5, r11)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r2 = p082e.p126k.p129c.p131j.C3899b0.m16652h(r2, r5)     // Catch:{ a -> 0x05c8 }
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            goto L_0x0184
        L_0x0172:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r2 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r2 = r0.mo13494a(r2, r11)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
        L_0x0184:
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0189:
            r8.m17773b0(r10, r4, r0)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0191:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            boolean r2 = r20.mo13506j()     // Catch:{ a -> 0x05c8 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x01a5:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r2 = r20.mo13505i()     // Catch:{ a -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x01b9:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r6 = r20.mo13499d()     // Catch:{ a -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x01cd:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r2 = r20.mo13482E()     // Catch:{ a -> 0x05c8 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x01e1:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r6 = r20.mo13498c()     // Catch:{ a -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x01f5:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r6 = r20.mo13489L()     // Catch:{ a -> 0x05c8 }
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0209:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            float r2 = r20.readFloat()     // Catch:{ a -> 0x05c8 }
            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x021d:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            double r6 = r20.readDouble()     // Catch:{ a -> 0x05c8 }
            java.lang.Double r2 = java.lang.Double.valueOf(r6)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17777f0(r10, r1, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0231:
            java.lang.Object r4 = r8.m17795r(r3)     // Catch:{ a -> 0x05c8 }
            r1 = r16
            r2 = r19
            r5 = r21
            r6 = r20
            r1.m17755J(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0242:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r6 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r5 = r20
            r7 = r21
            r1.m17771Z(r2, r3, r5, r6, r7)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0258:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13503g(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0267:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13496b(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0276:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13512p(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0285:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13502f(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0294:
            e.k.c.j.i0 r2 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r2 = r2.mo13625e(r10, r4)     // Catch:{ a -> 0x05c8 }
            r0.mo13514r(r2)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.b0$e r3 = r8.m17794q(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r13 = p082e.p126k.p129c.p131j.C3978l1.m17294A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x02ab:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13504h(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x02ba:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13522x(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x02c9:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13519u(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x02d8:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13491N(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x02e7:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13513q(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x02f6:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13508l(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0305:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13511o(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0314:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13481D(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0323:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13487J(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0332:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13503g(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0341:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13496b(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0350:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13512p(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x035f:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13502f(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x036e:
            e.k.c.j.i0 r2 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r2 = r2.mo13625e(r10, r4)     // Catch:{ a -> 0x05c8 }
            r0.mo13514r(r2)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.b0$e r3 = r8.m17794q(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r13 = p082e.p126k.p129c.p131j.C3978l1.m17294A(r1, r2, r3, r13, r9)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0385:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13504h(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0394:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13486I(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03a3:
            e.k.c.j.j1 r5 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            r1 = r16
            r2 = r19
            r3 = r4
            r4 = r20
            r6 = r21
            r1.m17772a0(r2, r3, r4, r5, r6)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03b5:
            r8.m17774c0(r10, r4, r0)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03ba:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13522x(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03c9:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13519u(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03d8:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13491N(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03e7:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13513q(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x03f6:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13508l(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0405:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13511o(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0414:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13481D(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0423:
            e.k.c.j.i0 r1 = r8.f12205n     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.util.List r1 = r1.mo13625e(r10, r2)     // Catch:{ a -> 0x05c8 }
            r0.mo13487J(r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0432:
            boolean r1 = r8.m17802y(r10, r3)     // Catch:{ a -> 0x05c8 }
            if (r1 == 0) goto L_0x0455
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r1 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r10, r1)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r2 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r2 = r0.mo13492O(r2, r11)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r1 = p082e.p126k.p129c.p131j.C3899b0.m16652h(r1, r2)     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r2, r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0455:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r4 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r4 = r0.mo13492O(r4, r11)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0469:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r4 = r20.mo13521w()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17631S(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0479:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r4 = r20.mo13520v()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17630R(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0489:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r4 = r20.mo13507k()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17631S(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0499:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r4 = r20.mo13485H()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17630R(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x04a9:
            int r2 = r20.mo13518t()     // Catch:{ a -> 0x05c8 }
            e.k.c.j.b0$e r5 = r8.m17794q(r3)     // Catch:{ a -> 0x05c8 }
            if (r5 == 0) goto L_0x04c0
            boolean r5 = r5.mo13462a(r2)     // Catch:{ a -> 0x05c8 }
            if (r5 == 0) goto L_0x04ba
            goto L_0x04c0
        L_0x04ba:
            java.lang.Object r13 = p082e.p126k.p129c.p131j.C3978l1.m17305L(r1, r2, r13, r9)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x04c0:
            long r4 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17630R(r10, r4, r2)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x04cc:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r4 = r20.mo13510n()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17630R(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x04dc:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.i r4 = r20.mo13480C()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x04ec:
            boolean r1 = r8.m17802y(r10, r3)     // Catch:{ a -> 0x05c8 }
            if (r1 == 0) goto L_0x050f
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r1 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r10, r1)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r2 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r2 = r0.mo13494a(r2, r11)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r1 = p082e.p126k.p129c.p131j.C3899b0.m16652h(r1, r2)     // Catch:{ a -> 0x05c8 }
            long r2 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r2, r1)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x050f:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            e.k.c.j.j1 r4 = r8.m17796s(r3)     // Catch:{ a -> 0x05c8 }
            java.lang.Object r4 = r0.mo13494a(r4, r11)     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17632T(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x0523:
            r8.m17773b0(r10, r4, r0)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x052b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            boolean r4 = r20.mo13506j()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17622J(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x053b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r4 = r20.mo13505i()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17630R(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x054b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r4 = r20.mo13499d()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17631S(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x055b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            int r4 = r20.mo13482E()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17630R(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x056b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r4 = r20.mo13498c()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17631S(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x057b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            long r4 = r20.mo13489L()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17631S(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x058b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            float r4 = r20.readFloat()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17629Q(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x059b:
            long r1 = m17763R(r4)     // Catch:{ a -> 0x05c8 }
            double r4 = r20.readDouble()     // Catch:{ a -> 0x05c8 }
            p082e.p126k.p129c.p131j.C4022u1.m17628P(r10, r1, r4)     // Catch:{ a -> 0x05c8 }
            r8.m17776e0(r10, r3)     // Catch:{ a -> 0x05c8 }
            goto L_0x000d
        L_0x05ab:
            boolean r1 = r9.mo13924m(r13, r0)     // Catch:{ a -> 0x05c8 }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f12202k
        L_0x05b3:
            int r1 = r8.f12203l
            if (r0 >= r1) goto L_0x05c2
            int[] r1 = r8.f12201j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m17789n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05b3
        L_0x05c2:
            if (r13 == 0) goto L_0x05c7
            r9.mo13926o(r10, r13)
        L_0x05c7:
            return
        L_0x05c8:
            boolean r1 = r9.mo13928q(r0)     // Catch:{ all -> 0x060f }
            if (r1 == 0) goto L_0x05eb
            boolean r1 = r20.mo13484G()     // Catch:{ all -> 0x060f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f12202k
        L_0x05d6:
            int r1 = r8.f12203l
            if (r0 >= r1) goto L_0x05e5
            int[] r1 = r8.f12201j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m17789n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05d6
        L_0x05e5:
            if (r13 == 0) goto L_0x05ea
            r9.mo13926o(r10, r13)
        L_0x05ea:
            return
        L_0x05eb:
            if (r13 != 0) goto L_0x05f2
            java.lang.Object r1 = r9.mo13917f(r10)     // Catch:{ all -> 0x060f }
            r13 = r1
        L_0x05f2:
            boolean r1 = r9.mo13924m(r13, r0)     // Catch:{ all -> 0x060f }
            if (r1 != 0) goto L_0x000d
            int r0 = r8.f12202k
        L_0x05fa:
            int r1 = r8.f12203l
            if (r0 >= r1) goto L_0x0609
            int[] r1 = r8.f12201j
            r1 = r1[r0]
            java.lang.Object r13 = r8.m17789n(r10, r1, r13, r9)
            int r0 = r0 + 1
            goto L_0x05fa
        L_0x0609:
            if (r13 == 0) goto L_0x060e
            r9.mo13926o(r10, r13)
        L_0x060e:
            return
        L_0x060f:
            r0 = move-exception
            int r1 = r8.f12202k
        L_0x0612:
            int r2 = r8.f12203l
            if (r1 >= r2) goto L_0x0621
            int[] r2 = r8.f12201j
            r2 = r2[r1]
            java.lang.Object r13 = r8.m17789n(r10, r2, r13, r9)
            int r1 = r1 + 1
            goto L_0x0612
        L_0x0621:
            if (r13 == 0) goto L_0x0626
            r9.mo13926o(r10, r13)
        L_0x0626:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17754I(e.k.c.j.q1, e.k.c.j.r, java.lang.Object, e.k.c.j.h1, e.k.c.j.q):void");
    }

    /* renamed from: J */
    private final <K, V> void m17755J(Object obj, int i, Object obj2, C4003q qVar, C3933h1 h1Var) throws IOException {
        long R = m17763R(m17780i0(i));
        Object E = C4022u1.m17617E(obj, R);
        if (E == null) {
            E = this.f12208q.mo13899e(obj2);
            C4022u1.m17632T(obj, R, E);
        } else if (this.f12208q.mo13901g(E)) {
            Object e = this.f12208q.mo13899e(obj2);
            this.f12208q.mo13895a(e, E);
            C4022u1.m17632T(obj, R, e);
            E = e;
        }
        h1Var.mo13517s(this.f12208q.mo13898d(E), this.f12208q.mo13897c(obj2), qVar);
    }

    /* renamed from: K */
    private void m17756K(T t, T t2, int i) {
        long R = m17763R(m17780i0(i));
        if (m17802y(t2, i)) {
            Object E = C4022u1.m17617E(t, R);
            Object E2 = C4022u1.m17617E(t2, R);
            if (E != null && E2 != null) {
                C4022u1.m17632T(t, R, C3899b0.m16652h(E, E2));
                m17776e0(t, i);
            } else if (E2 != null) {
                C4022u1.m17632T(t, R, E2);
                m17776e0(t, i);
            }
        }
    }

    /* renamed from: L */
    private void m17757L(T t, T t2, int i) {
        int i0 = m17780i0(i);
        int Q = m17762Q(i);
        long R = m17763R(i0);
        if (m17750E(t2, Q, i)) {
            Object E = C4022u1.m17617E(t, R);
            Object E2 = C4022u1.m17617E(t2, R);
            if (E != null && E2 != null) {
                C4022u1.m17632T(t, R, C3899b0.m16652h(E, E2));
                m17777f0(t, Q, i);
            } else if (E2 != null) {
                C4022u1.m17632T(t, R, E2);
                m17777f0(t, Q, i);
            }
        }
    }

    /* renamed from: M */
    private void m17758M(T t, T t2, int i) {
        int i0 = m17780i0(i);
        long R = m17763R(i0);
        int Q = m17762Q(i);
        switch (m17779h0(i0)) {
            case 0:
                if (m17802y(t2, i)) {
                    C4022u1.m17628P(t, R, C4022u1.m17659y(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 1:
                if (m17802y(t2, i)) {
                    C4022u1.m17629Q(t, R, C4022u1.m17660z(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 2:
                if (m17802y(t2, i)) {
                    C4022u1.m17631S(t, R, C4022u1.m17615C(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 3:
                if (m17802y(t2, i)) {
                    C4022u1.m17631S(t, R, C4022u1.m17615C(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 4:
                if (m17802y(t2, i)) {
                    C4022u1.m17630R(t, R, C4022u1.m17613A(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 5:
                if (m17802y(t2, i)) {
                    C4022u1.m17631S(t, R, C4022u1.m17615C(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 6:
                if (m17802y(t2, i)) {
                    C4022u1.m17630R(t, R, C4022u1.m17613A(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 7:
                if (m17802y(t2, i)) {
                    C4022u1.m17622J(t, R, C4022u1.m17652r(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 8:
                if (m17802y(t2, i)) {
                    C4022u1.m17632T(t, R, C4022u1.m17617E(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 9:
                m17756K(t, t2, i);
                return;
            case 10:
                if (m17802y(t2, i)) {
                    C4022u1.m17632T(t, R, C4022u1.m17617E(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 11:
                if (m17802y(t2, i)) {
                    C4022u1.m17630R(t, R, C4022u1.m17613A(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 12:
                if (m17802y(t2, i)) {
                    C4022u1.m17630R(t, R, C4022u1.m17613A(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 13:
                if (m17802y(t2, i)) {
                    C4022u1.m17630R(t, R, C4022u1.m17613A(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 14:
                if (m17802y(t2, i)) {
                    C4022u1.m17631S(t, R, C4022u1.m17615C(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 15:
                if (m17802y(t2, i)) {
                    C4022u1.m17630R(t, R, C4022u1.m17613A(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 16:
                if (m17802y(t2, i)) {
                    C4022u1.m17631S(t, R, C4022u1.m17615C(t2, R));
                    m17776e0(t, i);
                    return;
                }
                return;
            case 17:
                m17756K(t, t2, i);
                return;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                this.f12205n.mo13624d(t, t2, R);
                return;
            case 50:
                C3978l1.m17299F(this.f12208q, t, t2, R);
                return;
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
                if (m17750E(t2, Q, i)) {
                    C4022u1.m17632T(t, R, C4022u1.m17617E(t2, R));
                    m17777f0(t, Q, i);
                    return;
                }
                return;
            case 60:
                m17757L(t, t2, i);
                return;
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
                if (m17750E(t2, Q, i)) {
                    C4022u1.m17632T(t, R, C4022u1.m17617E(t2, R));
                    m17777f0(t, Q, i);
                    return;
                }
                return;
            case 68:
                m17757L(t, t2, i);
                return;
            default:
                return;
        }
    }

    /* renamed from: N */
    static <T> C4031v0<T> m17759N(Class<T> cls, C4005q0 q0Var, C4051x0 x0Var, C3947i0 i0Var, C4006q1<?, ?> q1Var, C4007r<?> rVar, C3993n0 n0Var) {
        if (q0Var instanceof C3930g1) {
            return m17761P((C3930g1) q0Var, x0Var, i0Var, q1Var, rVar, n0Var);
        }
        return m17760O((C3994n1) q0Var, x0Var, i0Var, q1Var, rVar, n0Var);
    }

    /* renamed from: O */
    static <T> C4031v0<T> m17760O(C3994n1 n1Var, C4051x0 x0Var, C3947i0 i0Var, C4006q1<?, ?> q1Var, C4007r<?> rVar, C3993n0 n0Var) {
        boolean z = n1Var.mo13583c() == C3916d1.PROTO3;
        C4020u[] e = n1Var.mo13904e();
        if (e.length == 0) {
            int length = e.length;
            int[] iArr = new int[(length * 3)];
            Object[] objArr = new Object[(length * 2)];
            if (e.length <= 0) {
                int[] d = n1Var.mo13903d();
                if (d == null) {
                    d = f12190r;
                }
                if (e.length <= 0) {
                    int[] iArr2 = f12190r;
                    int[] iArr3 = f12190r;
                    int[] iArr4 = new int[(d.length + iArr2.length + iArr3.length)];
                    System.arraycopy(d, 0, iArr4, 0, d.length);
                    System.arraycopy(iArr2, 0, iArr4, d.length, iArr2.length);
                    System.arraycopy(iArr3, 0, iArr4, d.length + iArr2.length, iArr3.length);
                    return new C4031v0(iArr, objArr, 0, 0, n1Var.mo13582b(), z, true, iArr4, d.length, d.length + iArr2.length, x0Var, i0Var, q1Var, rVar, n0Var);
                }
                e[0].mo13999c();
                throw null;
            }
            e[0].mo14000d();
            throw null;
        }
        e[0].mo13999c();
        throw null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:121:0x0277  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0295  */
    /* JADX WARNING: Removed duplicated region for block: B:157:0x033d  */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0392  */
    /* renamed from: P */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <T> p082e.p126k.p129c.p131j.C4031v0<T> m17761P(p082e.p126k.p129c.p131j.C3930g1 r36, p082e.p126k.p129c.p131j.C4051x0 r37, p082e.p126k.p129c.p131j.C3947i0 r38, p082e.p126k.p129c.p131j.C4006q1<?, ?> r39, p082e.p126k.p129c.p131j.C4007r<?> r40, p082e.p126k.p129c.p131j.C3993n0 r41) {
        /*
            e.k.c.j.d1 r0 = r36.mo13583c()
            e.k.c.j.d1 r1 = p082e.p126k.p129c.p131j.C3916d1.PROTO3
            r2 = 0
            if (r0 != r1) goto L_0x000b
            r10 = 1
            goto L_0x000c
        L_0x000b:
            r10 = 0
        L_0x000c:
            java.lang.String r0 = r36.mo13585e()
            int r1 = r0.length()
            char r4 = r0.charAt(r2)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r6) goto L_0x0035
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r7 = 1
            r8 = 13
        L_0x0022:
            int r9 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0032
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r8
            r4 = r4 | r7
            int r8 = r8 + 13
            r7 = r9
            goto L_0x0022
        L_0x0032:
            int r7 = r7 << r8
            r4 = r4 | r7
            goto L_0x0036
        L_0x0035:
            r9 = 1
        L_0x0036:
            int r7 = r9 + 1
            char r8 = r0.charAt(r9)
            if (r8 < r6) goto L_0x0055
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x0042:
            int r11 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0052
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r8 = r8 | r7
            int r9 = r9 + 13
            r7 = r11
            goto L_0x0042
        L_0x0052:
            int r7 = r7 << r9
            r8 = r8 | r7
            r7 = r11
        L_0x0055:
            if (r8 != 0) goto L_0x0062
            int[] r8 = f12190r
            r13 = r8
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            goto L_0x0177
        L_0x0062:
            int r8 = r7 + 1
            char r7 = r0.charAt(r7)
            if (r7 < r6) goto L_0x0081
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L_0x006e:
            int r11 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x007e
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r9
            r7 = r7 | r8
            int r9 = r9 + 13
            r8 = r11
            goto L_0x006e
        L_0x007e:
            int r8 = r8 << r9
            r7 = r7 | r8
            r8 = r11
        L_0x0081:
            int r9 = r8 + 1
            char r8 = r0.charAt(r8)
            if (r8 < r6) goto L_0x00a0
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        L_0x008d:
            int r12 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x009d
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r11
            r8 = r8 | r9
            int r11 = r11 + 13
            r9 = r12
            goto L_0x008d
        L_0x009d:
            int r9 = r9 << r11
            r8 = r8 | r9
            r9 = r12
        L_0x00a0:
            int r11 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r9 < r6) goto L_0x00bf
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        L_0x00ac:
            int r13 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00bc
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r9 = r9 | r11
            int r12 = r12 + 13
            r11 = r13
            goto L_0x00ac
        L_0x00bc:
            int r11 = r11 << r12
            r9 = r9 | r11
            r11 = r13
        L_0x00bf:
            int r12 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r6) goto L_0x00de
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        L_0x00cb:
            int r14 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00db
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto L_0x00cb
        L_0x00db:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        L_0x00de:
            int r13 = r12 + 1
            char r12 = r0.charAt(r12)
            if (r12 < r6) goto L_0x00fd
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        L_0x00ea:
            int r15 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x00fa
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto L_0x00ea
        L_0x00fa:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L_0x00fd:
            int r14 = r13 + 1
            char r13 = r0.charAt(r13)
            if (r13 < r6) goto L_0x011e
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L_0x0109:
            int r16 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x011a
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L_0x0109
        L_0x011a:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L_0x011e:
            int r15 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r6) goto L_0x0141
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L_0x012a:
            int r17 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x013c
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L_0x012a
        L_0x013c:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L_0x0141:
            int r16 = r15 + 1
            char r15 = r0.charAt(r15)
            if (r15 < r6) goto L_0x0166
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r2 = r16
            r16 = 13
        L_0x014f:
            int r18 = r2 + 1
            char r2 = r0.charAt(r2)
            if (r2 < r6) goto L_0x0161
            r2 = r2 & 8191(0x1fff, float:1.1478E-41)
            int r2 = r2 << r16
            r15 = r15 | r2
            int r16 = r16 + 13
            r2 = r18
            goto L_0x014f
        L_0x0161:
            int r2 = r2 << r16
            r15 = r15 | r2
            r16 = r18
        L_0x0166:
            int r2 = r15 + r13
            int r2 = r2 + r14
            int[] r2 = new int[r2]
            int r14 = r7 * 2
            int r14 = r14 + r8
            r8 = r7
            r7 = r16
            r35 = r13
            r13 = r2
            r2 = r9
            r9 = r35
        L_0x0177:
            sun.misc.Unsafe r5 = f12191s
            java.lang.Object[] r18 = r36.mo13584d()
            e.k.c.j.s0 r19 = r36.mo13582b()
            java.lang.Class r3 = r19.getClass()
            int r6 = r12 * 3
            int[] r6 = new int[r6]
            int r12 = r12 * 2
            java.lang.Object[] r12 = new java.lang.Object[r12]
            int r21 = r15 + r9
            r23 = r15
            r24 = r21
            r9 = 0
            r22 = 0
        L_0x0196:
            if (r7 >= r1) goto L_0x03e6
            int r25 = r7 + 1
            char r7 = r0.charAt(r7)
            r26 = r1
            r1 = 55296(0xd800, float:7.7486E-41)
            if (r7 < r1) goto L_0x01ca
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r1 = r25
            r25 = 13
        L_0x01ab:
            int r27 = r1 + 1
            char r1 = r0.charAt(r1)
            r28 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x01c4
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            int r1 = r1 << r25
            r7 = r7 | r1
            int r25 = r25 + 13
            r1 = r27
            r15 = r28
            goto L_0x01ab
        L_0x01c4:
            int r1 = r1 << r25
            r7 = r7 | r1
            r1 = r27
            goto L_0x01ce
        L_0x01ca:
            r28 = r15
            r1 = r25
        L_0x01ce:
            int r15 = r1 + 1
            char r1 = r0.charAt(r1)
            r25 = r15
            r15 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r15) goto L_0x0200
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r15 = r25
            r25 = 13
        L_0x01e1:
            int r27 = r15 + 1
            char r15 = r0.charAt(r15)
            r29 = r10
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x01fa
            r10 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r25
            r1 = r1 | r10
            int r25 = r25 + 13
            r15 = r27
            r10 = r29
            goto L_0x01e1
        L_0x01fa:
            int r10 = r15 << r25
            r1 = r1 | r10
            r15 = r27
            goto L_0x0204
        L_0x0200:
            r29 = r10
            r15 = r25
        L_0x0204:
            r10 = r1 & 255(0xff, float:3.57E-43)
            r25 = r11
            r11 = r1 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0211
            int r11 = r9 + 1
            r13[r9] = r22
            r9 = r11
        L_0x0211:
            r11 = 51
            r31 = r9
            if (r10 < r11) goto L_0x02b1
            int r11 = r15 + 1
            char r15 = r0.charAt(r15)
            r9 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r9) goto L_0x0240
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r33 = 13
        L_0x0226:
            int r34 = r11 + 1
            char r11 = r0.charAt(r11)
            if (r11 < r9) goto L_0x023b
            r9 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r33
            r15 = r15 | r9
            int r33 = r33 + 13
            r11 = r34
            r9 = 55296(0xd800, float:7.7486E-41)
            goto L_0x0226
        L_0x023b:
            int r9 = r11 << r33
            r15 = r15 | r9
            r11 = r34
        L_0x0240:
            int r9 = r10 + -51
            r33 = r11
            r11 = 9
            if (r9 == r11) goto L_0x0262
            r11 = 17
            if (r9 != r11) goto L_0x024d
            goto L_0x0262
        L_0x024d:
            r11 = 12
            if (r9 != r11) goto L_0x026f
            r9 = r4 & 1
            r11 = 1
            if (r9 != r11) goto L_0x026f
            int r9 = r22 / 3
            int r9 = r9 * 2
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
            goto L_0x026e
        L_0x0262:
            int r9 = r22 / 3
            int r9 = r9 * 2
            r11 = 1
            int r9 = r9 + r11
            int r11 = r14 + 1
            r14 = r18[r14]
            r12[r9] = r14
        L_0x026e:
            r14 = r11
        L_0x026f:
            int r15 = r15 * 2
            r9 = r18[r15]
            boolean r11 = r9 instanceof java.lang.reflect.Field
            if (r11 == 0) goto L_0x027a
            java.lang.reflect.Field r9 = (java.lang.reflect.Field) r9
            goto L_0x0282
        L_0x027a:
            java.lang.String r9 = (java.lang.String) r9
            java.lang.reflect.Field r9 = m17775d0(r3, r9)
            r18[r15] = r9
        L_0x0282:
            r11 = r6
            r34 = r7
            long r6 = r5.objectFieldOffset(r9)
            int r7 = (int) r6
            int r15 = r15 + 1
            r6 = r18[r15]
            boolean r9 = r6 instanceof java.lang.reflect.Field
            if (r9 == 0) goto L_0x0295
            java.lang.reflect.Field r6 = (java.lang.reflect.Field) r6
            goto L_0x029d
        L_0x0295:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.reflect.Field r6 = m17775d0(r3, r6)
            r18[r15] = r6
        L_0x029d:
            r9 = r7
            long r6 = r5.objectFieldOffset(r6)
            int r7 = (int) r6
            r32 = r0
            r19 = r3
            r0 = r4
            r4 = r7
            r7 = r9
            r9 = r10
            r6 = r14
            r14 = r33
            r15 = 0
            goto L_0x03a9
        L_0x02b1:
            r11 = r6
            r34 = r7
            int r6 = r14 + 1
            r7 = r18[r14]
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = m17775d0(r3, r7)
            r9 = 49
            r14 = 9
            if (r10 == r14) goto L_0x0326
            r14 = 17
            if (r10 != r14) goto L_0x02c9
            goto L_0x0326
        L_0x02c9:
            r14 = 27
            if (r10 == r14) goto L_0x0316
            if (r10 != r9) goto L_0x02d0
            goto L_0x0316
        L_0x02d0:
            r14 = 12
            if (r10 == r14) goto L_0x0305
            r14 = 30
            if (r10 == r14) goto L_0x0305
            r14 = 44
            if (r10 != r14) goto L_0x02dd
            goto L_0x0305
        L_0x02dd:
            r14 = 50
            if (r10 != r14) goto L_0x0303
            int r14 = r23 + 1
            r13[r23] = r22
            int r23 = r22 / 3
            int r23 = r23 * 2
            int r27 = r6 + 1
            r6 = r18[r6]
            r12[r23] = r6
            r6 = r1 & 2048(0x800, float:2.87E-42)
            if (r6 == 0) goto L_0x02fe
            int r23 = r23 + 1
            int r6 = r27 + 1
            r27 = r18[r27]
            r12[r23] = r27
            r23 = r14
            goto L_0x0332
        L_0x02fe:
            r23 = r14
            r6 = r27
            goto L_0x0332
        L_0x0303:
            r9 = 1
            goto L_0x0332
        L_0x0305:
            r14 = r4 & 1
            r9 = 1
            if (r14 != r9) goto L_0x0332
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
            goto L_0x0322
        L_0x0316:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            int r20 = r6 + 1
            r6 = r18[r6]
            r12[r14] = r6
        L_0x0322:
            r14 = r10
            r6 = r20
            goto L_0x0333
        L_0x0326:
            r9 = 1
            int r14 = r22 / 3
            int r14 = r14 * 2
            int r14 = r14 + r9
            java.lang.Class r20 = r7.getType()
            r12[r14] = r20
        L_0x0332:
            r14 = r10
        L_0x0333:
            long r9 = r5.objectFieldOffset(r7)
            int r7 = (int) r9
            r9 = r4 & 1
            r10 = 1
            if (r9 != r10) goto L_0x0392
            r9 = r14
            r14 = 17
            if (r9 > r14) goto L_0x038c
            int r14 = r15 + 1
            char r15 = r0.charAt(r15)
            r10 = 55296(0xd800, float:7.7486E-41)
            if (r15 < r10) goto L_0x0368
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            r19 = 13
        L_0x0351:
            int r30 = r14 + 1
            char r14 = r0.charAt(r14)
            if (r14 < r10) goto L_0x0363
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r19
            r15 = r15 | r14
            int r19 = r19 + 13
            r14 = r30
            goto L_0x0351
        L_0x0363:
            int r14 = r14 << r19
            r15 = r15 | r14
            r14 = r30
        L_0x0368:
            int r19 = r8 * 2
            int r30 = r15 / 32
            int r19 = r19 + r30
            r10 = r18[r19]
            r32 = r0
            boolean r0 = r10 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L_0x0379
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            goto L_0x0381
        L_0x0379:
            java.lang.String r10 = (java.lang.String) r10
            java.lang.reflect.Field r10 = m17775d0(r3, r10)
            r18[r19] = r10
        L_0x0381:
            r19 = r3
            r0 = r4
            long r3 = r5.objectFieldOffset(r10)
            int r4 = (int) r3
            int r15 = r15 % 32
            goto L_0x039b
        L_0x038c:
            r32 = r0
            r19 = r3
            r0 = r4
            goto L_0x0398
        L_0x0392:
            r32 = r0
            r19 = r3
            r0 = r4
            r9 = r14
        L_0x0398:
            r14 = r15
            r4 = 0
            r15 = 0
        L_0x039b:
            r3 = 18
            if (r9 < r3) goto L_0x03a9
            r3 = 49
            if (r9 > r3) goto L_0x03a9
            int r3 = r24 + 1
            r13[r24] = r7
            r24 = r3
        L_0x03a9:
            int r3 = r22 + 1
            r11[r22] = r34
            int r10 = r3 + 1
            r22 = r0
            r0 = r1 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x03b8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L_0x03b9
        L_0x03b8:
            r0 = 0
        L_0x03b9:
            r1 = r1 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x03c0
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            goto L_0x03c1
        L_0x03c0:
            r1 = 0
        L_0x03c1:
            r0 = r0 | r1
            int r1 = r9 << 20
            r0 = r0 | r1
            r0 = r0 | r7
            r11[r3] = r0
            int r0 = r10 + 1
            int r1 = r15 << 20
            r1 = r1 | r4
            r11[r10] = r1
            r7 = r14
            r3 = r19
            r4 = r22
            r1 = r26
            r15 = r28
            r10 = r29
            r9 = r31
            r22 = r0
            r14 = r6
            r6 = r11
            r11 = r25
            r0 = r32
            goto L_0x0196
        L_0x03e6:
            r29 = r10
            r25 = r11
            r28 = r15
            r11 = r6
            e.k.c.j.v0 r0 = new e.k.c.j.v0
            e.k.c.j.s0 r9 = r36.mo13582b()
            r1 = 0
            r4 = r0
            r5 = r11
            r6 = r12
            r7 = r2
            r8 = r25
            r11 = r1
            r12 = r13
            r13 = r28
            r14 = r21
            r15 = r37
            r16 = r38
            r17 = r39
            r18 = r40
            r19 = r41
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17761P(e.k.c.j.g1, e.k.c.j.x0, e.k.c.j.i0, e.k.c.j.q1, e.k.c.j.r, e.k.c.j.n0):e.k.c.j.v0");
    }

    /* renamed from: Q */
    private int m17762Q(int i) {
        return this.f12192a[i];
    }

    /* renamed from: R */
    private static long m17763R(int i) {
        return (long) (i & 1048575);
    }

    /* renamed from: S */
    private static <T> boolean m17764S(T t, long j) {
        return ((Boolean) C4022u1.m17617E(t, j)).booleanValue();
    }

    /* renamed from: T */
    private static <T> double m17765T(T t, long j) {
        return ((Double) C4022u1.m17617E(t, j)).doubleValue();
    }

    /* renamed from: U */
    private static <T> float m17766U(T t, long j) {
        return ((Float) C4022u1.m17617E(t, j)).floatValue();
    }

    /* renamed from: V */
    private static <T> int m17767V(T t, long j) {
        return ((Integer) C4022u1.m17617E(t, j)).intValue();
    }

    /* renamed from: W */
    private static <T> long m17768W(T t, long j) {
        return ((Long) C4022u1.m17617E(t, j)).longValue();
    }

    /* renamed from: X */
    private int m17769X(int i) {
        if (i < this.f12194c || i > this.f12195d) {
            return -1;
        }
        return m17778g0(i, 0);
    }

    /* renamed from: Y */
    private int m17770Y(int i) {
        return this.f12192a[i + 2];
    }

    /* renamed from: Z */
    private <E> void m17771Z(Object obj, long j, C3933h1 h1Var, C3963j1<E> j1Var, C4003q qVar) throws IOException {
        h1Var.mo13483F(this.f12205n.mo13625e(obj, j), j1Var, qVar);
    }

    /* renamed from: a0 */
    private <E> void m17772a0(Object obj, int i, C3933h1 h1Var, C3963j1<E> j1Var, C4003q qVar) throws IOException {
        h1Var.mo13488K(this.f12205n.mo13625e(obj, m17763R(i)), j1Var, qVar);
    }

    /* renamed from: b0 */
    private void m17773b0(Object obj, int i, C3933h1 h1Var) throws IOException {
        if (m17801x(i)) {
            C4022u1.m17632T(obj, m17763R(i), h1Var.mo13490M());
        } else if (this.f12198g) {
            C4022u1.m17632T(obj, m17763R(i), h1Var.mo13523y());
        } else {
            C4022u1.m17632T(obj, m17763R(i), h1Var.mo13480C());
        }
    }

    /* renamed from: c0 */
    private void m17774c0(Object obj, int i, C3933h1 h1Var) throws IOException {
        if (m17801x(i)) {
            h1Var.mo13479B(this.f12205n.mo13625e(obj, m17763R(i)));
        } else {
            h1Var.mo13478A(this.f12205n.mo13625e(obj, m17763R(i)));
        }
    }

    /* renamed from: d0 */
    private static Field m17775d0(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            throw new RuntimeException("Field " + str + " for " + cls.getName() + " not found. Known fields are " + Arrays.toString(declaredFields));
        }
    }

    /* renamed from: e0 */
    private void m17776e0(T t, int i) {
        if (!this.f12199h) {
            int Y = m17770Y(i);
            long j = (long) (Y & 1048575);
            C4022u1.m17630R(t, j, C4022u1.m17613A(t, j) | (1 << (Y >>> 20)));
        }
    }

    /* renamed from: f0 */
    private void m17777f0(T t, int i, int i2) {
        C4022u1.m17630R(t, (long) (m17770Y(i2) & 1048575), i);
    }

    /* renamed from: g0 */
    private int m17778g0(int i, int i2) {
        int length = (this.f12192a.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int Q = m17762Q(i4);
            if (i == Q) {
                return i4;
            }
            if (i < Q) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    /* renamed from: h0 */
    private static int m17779h0(int i) {
        return (i & 267386880) >>> 20;
    }

    /* renamed from: i0 */
    private int m17780i0(int i) {
        return this.f12192a[i + 1];
    }

    /* renamed from: j */
    private boolean m17781j(T t, T t2, int i) {
        return m17802y(t, i) == m17802y(t2, i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:171:0x049e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002d  */
    /* renamed from: j0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17782j0(T r18, p082e.p126k.p129c.p131j.C4052x1 r19) throws java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r0.f12197f
            if (r3 == 0) goto L_0x0021
            e.k.c.j.r<?> r3 = r0.f12207p
            e.k.c.j.v r3 = r3.mo13934c(r1)
            boolean r5 = r3.mo14032n()
            if (r5 != 0) goto L_0x0021
            java.util.Iterator r3 = r3.mo14035s()
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0023
        L_0x0021:
            r3 = 0
            r5 = 0
        L_0x0023:
            r6 = -1
            int[] r7 = r0.f12192a
            int r7 = r7.length
            sun.misc.Unsafe r8 = f12191s
            r10 = 0
            r11 = 0
        L_0x002b:
            if (r10 >= r7) goto L_0x049a
            int r12 = r0.m17780i0(r10)
            int r13 = r0.m17762Q(r10)
            int r14 = m17779h0(r12)
            boolean r15 = r0.f12199h
            if (r15 != 0) goto L_0x005e
            r15 = 17
            if (r14 > r15) goto L_0x005e
            int[] r15 = r0.f12192a
            int r16 = r10 + 2
            r15 = r15[r16]
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r15 & r16
            r16 = r5
            if (r9 == r6) goto L_0x0056
            long r4 = (long) r9
            int r11 = r8.getInt(r1, r4)
            r6 = r9
        L_0x0056:
            int r4 = r15 >>> 20
            r5 = 1
            int r4 = r5 << r4
            r5 = r16
            goto L_0x0063
        L_0x005e:
            r16 = r5
            r5 = r16
            r4 = 0
        L_0x0063:
            if (r5 == 0) goto L_0x0081
            e.k.c.j.r<?> r9 = r0.f12207p
            int r9 = r9.mo13932a(r5)
            if (r9 > r13) goto L_0x0081
            e.k.c.j.r<?> r9 = r0.f12207p
            r9.mo13941j(r2, r5)
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L_0x007f
            java.lang.Object r5 = r3.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            goto L_0x0063
        L_0x007f:
            r5 = 0
            goto L_0x0063
        L_0x0081:
            r15 = r5
            r9 = r6
            long r5 = m17763R(r12)
            switch(r14) {
                case 0: goto L_0x0489;
                case 1: goto L_0x047d;
                case 2: goto L_0x0471;
                case 3: goto L_0x0465;
                case 4: goto L_0x0459;
                case 5: goto L_0x044d;
                case 6: goto L_0x0441;
                case 7: goto L_0x0435;
                case 8: goto L_0x0429;
                case 9: goto L_0x0418;
                case 10: goto L_0x0409;
                case 11: goto L_0x03fc;
                case 12: goto L_0x03ef;
                case 13: goto L_0x03e2;
                case 14: goto L_0x03d5;
                case 15: goto L_0x03c8;
                case 16: goto L_0x03bb;
                case 17: goto L_0x03aa;
                case 18: goto L_0x039a;
                case 19: goto L_0x038a;
                case 20: goto L_0x037a;
                case 21: goto L_0x036a;
                case 22: goto L_0x035a;
                case 23: goto L_0x034a;
                case 24: goto L_0x033a;
                case 25: goto L_0x032a;
                case 26: goto L_0x031b;
                case 27: goto L_0x0308;
                case 28: goto L_0x02f9;
                case 29: goto L_0x02e9;
                case 30: goto L_0x02d9;
                case 31: goto L_0x02c9;
                case 32: goto L_0x02b9;
                case 33: goto L_0x02a9;
                case 34: goto L_0x0299;
                case 35: goto L_0x0289;
                case 36: goto L_0x0279;
                case 37: goto L_0x0269;
                case 38: goto L_0x0259;
                case 39: goto L_0x0249;
                case 40: goto L_0x0239;
                case 41: goto L_0x0229;
                case 42: goto L_0x0219;
                case 43: goto L_0x0209;
                case 44: goto L_0x01f9;
                case 45: goto L_0x01e9;
                case 46: goto L_0x01d9;
                case 47: goto L_0x01c9;
                case 48: goto L_0x01b9;
                case 49: goto L_0x01a6;
                case 50: goto L_0x019d;
                case 51: goto L_0x018e;
                case 52: goto L_0x017f;
                case 53: goto L_0x0170;
                case 54: goto L_0x0161;
                case 55: goto L_0x0152;
                case 56: goto L_0x0143;
                case 57: goto L_0x0134;
                case 58: goto L_0x0125;
                case 59: goto L_0x0116;
                case 60: goto L_0x0103;
                case 61: goto L_0x00f3;
                case 62: goto L_0x00e5;
                case 63: goto L_0x00d7;
                case 64: goto L_0x00c9;
                case 65: goto L_0x00bb;
                case 66: goto L_0x00ad;
                case 67: goto L_0x009f;
                case 68: goto L_0x008d;
                default: goto L_0x008a;
            }
        L_0x008a:
            r12 = 0
            goto L_0x0494
        L_0x008d:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.k.c.j.j1 r5 = r0.m17796s(r10)
            r2.mo13796O(r13, r4, r5)
            goto L_0x008a
        L_0x009f:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m17768W(r1, r5)
            r2.mo13785D(r13, r4)
            goto L_0x008a
        L_0x00ad:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m17767V(r1, r5)
            r2.mo13794M(r13, r4)
            goto L_0x008a
        L_0x00bb:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m17768W(r1, r5)
            r2.mo13820x(r13, r4)
            goto L_0x008a
        L_0x00c9:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m17767V(r1, r5)
            r2.mo13814r(r13, r4)
            goto L_0x008a
        L_0x00d7:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m17767V(r1, r5)
            r2.mo13789H(r13, r4)
            goto L_0x008a
        L_0x00e5:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m17767V(r1, r5)
            r2.mo13798b(r13, r4)
            goto L_0x008a
        L_0x00f3:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.k.c.j.i r4 = (p082e.p126k.p129c.p131j.C3934i) r4
            r2.mo13819w(r13, r4)
            goto L_0x008a
        L_0x0103:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.k.c.j.j1 r5 = r0.m17796s(r10)
            r2.mo13822z(r13, r4, r5)
            goto L_0x008a
        L_0x0116:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m17790n0(r13, r4, r2)
            goto L_0x008a
        L_0x0125:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            boolean r4 = m17764S(r1, r5)
            r2.mo13813q(r13, r4)
            goto L_0x008a
        L_0x0134:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m17767V(r1, r5)
            r2.mo13800d(r13, r4)
            goto L_0x008a
        L_0x0143:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m17768W(r1, r5)
            r2.mo13804h(r13, r4)
            goto L_0x008a
        L_0x0152:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            int r4 = m17767V(r1, r5)
            r2.mo13816t(r13, r4)
            goto L_0x008a
        L_0x0161:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m17768W(r1, r5)
            r2.mo13810n(r13, r4)
            goto L_0x008a
        L_0x0170:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            long r4 = m17768W(r1, r5)
            r2.mo13812p(r13, r4)
            goto L_0x008a
        L_0x017f:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            float r4 = m17766U(r1, r5)
            r2.mo13786E(r13, r4)
            goto L_0x008a
        L_0x018e:
            boolean r4 = r0.m17750E(r1, r13, r10)
            if (r4 == 0) goto L_0x008a
            double r4 = m17765T(r1, r5)
            r2.mo13801e(r13, r4)
            goto L_0x008a
        L_0x019d:
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m17788m0(r2, r13, r4, r10)
            goto L_0x008a
        L_0x01a6:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            e.k.c.j.j1 r6 = r0.m17796s(r10)
            p082e.p126k.p129c.p131j.C3978l1.m17314U(r4, r5, r2, r6)
            goto L_0x008a
        L_0x01b9:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 1
            p082e.p126k.p129c.p131j.C3978l1.m17323b0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01c9:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17321a0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01d9:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17319Z(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01e9:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17318Y(r4, r5, r2, r12)
            goto L_0x008a
        L_0x01f9:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17310Q(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0209:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17327d0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0219:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17307N(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0229:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17311R(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0239:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17312S(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0249:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17315V(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0259:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17329e0(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0269:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17316W(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0279:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17313T(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0289:
            r12 = 1
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17309P(r4, r5, r2, r12)
            goto L_0x008a
        L_0x0299:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p082e.p126k.p129c.p131j.C3978l1.m17323b0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02a9:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17321a0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02b9:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17319Z(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02c9:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17318Y(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02d9:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17310Q(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02e9:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17327d0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x02f9:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17308O(r4, r5, r2)
            goto L_0x008a
        L_0x0308:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            e.k.c.j.j1 r6 = r0.m17796s(r10)
            p082e.p126k.p129c.p131j.C3978l1.m17317X(r4, r5, r2, r6)
            goto L_0x008a
        L_0x031b:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17325c0(r4, r5, r2)
            goto L_0x008a
        L_0x032a:
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            p082e.p126k.p129c.p131j.C3978l1.m17307N(r4, r5, r2, r12)
            goto L_0x0494
        L_0x033a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17311R(r4, r5, r2, r12)
            goto L_0x0494
        L_0x034a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17312S(r4, r5, r2, r12)
            goto L_0x0494
        L_0x035a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17315V(r4, r5, r2, r12)
            goto L_0x0494
        L_0x036a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17329e0(r4, r5, r2, r12)
            goto L_0x0494
        L_0x037a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17316W(r4, r5, r2, r12)
            goto L_0x0494
        L_0x038a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17313T(r4, r5, r2, r12)
            goto L_0x0494
        L_0x039a:
            r12 = 0
            int r4 = r0.m17762Q(r10)
            java.lang.Object r5 = r8.getObject(r1, r5)
            java.util.List r5 = (java.util.List) r5
            p082e.p126k.p129c.p131j.C3978l1.m17309P(r4, r5, r2, r12)
            goto L_0x0494
        L_0x03aa:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.k.c.j.j1 r5 = r0.m17796s(r10)
            r2.mo13796O(r13, r4, r5)
            goto L_0x0494
        L_0x03bb:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo13785D(r13, r4)
            goto L_0x0494
        L_0x03c8:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo13794M(r13, r4)
            goto L_0x0494
        L_0x03d5:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo13820x(r13, r4)
            goto L_0x0494
        L_0x03e2:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo13814r(r13, r4)
            goto L_0x0494
        L_0x03ef:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo13789H(r13, r4)
            goto L_0x0494
        L_0x03fc:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo13798b(r13, r4)
            goto L_0x0494
        L_0x0409:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.k.c.j.i r4 = (p082e.p126k.p129c.p131j.C3934i) r4
            r2.mo13819w(r13, r4)
            goto L_0x0494
        L_0x0418:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            e.k.c.j.j1 r5 = r0.m17796s(r10)
            r2.mo13822z(r13, r4, r5)
            goto L_0x0494
        L_0x0429:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            java.lang.Object r4 = r8.getObject(r1, r5)
            r0.m17790n0(r13, r4, r2)
            goto L_0x0494
        L_0x0435:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            boolean r4 = m17783k(r1, r5)
            r2.mo13813q(r13, r4)
            goto L_0x0494
        L_0x0441:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo13800d(r13, r4)
            goto L_0x0494
        L_0x044d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo13804h(r13, r4)
            goto L_0x0494
        L_0x0459:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            int r4 = r8.getInt(r1, r5)
            r2.mo13816t(r13, r4)
            goto L_0x0494
        L_0x0465:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo13810n(r13, r4)
            goto L_0x0494
        L_0x0471:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            long r4 = r8.getLong(r1, r5)
            r2.mo13812p(r13, r4)
            goto L_0x0494
        L_0x047d:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            float r4 = m17793p(r1, r5)
            r2.mo13786E(r13, r4)
            goto L_0x0494
        L_0x0489:
            r12 = 0
            r4 = r4 & r11
            if (r4 == 0) goto L_0x0494
            double r4 = m17785l(r1, r5)
            r2.mo13801e(r13, r4)
        L_0x0494:
            int r10 = r10 + 3
            r6 = r9
            r5 = r15
            goto L_0x002b
        L_0x049a:
            r16 = r5
        L_0x049c:
            if (r5 == 0) goto L_0x04b3
            e.k.c.j.r<?> r4 = r0.f12207p
            r4.mo13941j(r2, r5)
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x04b1
            java.lang.Object r4 = r3.next()
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            r5 = r4
            goto L_0x049c
        L_0x04b1:
            r5 = 0
            goto L_0x049c
        L_0x04b3:
            e.k.c.j.q1<?, ?> r3 = r0.f12206o
            r0.m17792o0(r3, r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17782j0(java.lang.Object, e.k.c.j.x1):void");
    }

    /* renamed from: k */
    private static <T> boolean m17783k(T t, long j) {
        return C4022u1.m17652r(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x0588  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* renamed from: k0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17784k0(T r13, p082e.p126k.p129c.p131j.C4052x1 r14) throws java.io.IOException {
        /*
            r12 = this;
            boolean r0 = r12.f12197f
            r1 = 0
            if (r0 == 0) goto L_0x001c
            e.k.c.j.r<?> r0 = r12.f12207p
            e.k.c.j.v r0 = r0.mo13934c(r13)
            boolean r2 = r0.mo14032n()
            if (r2 != 0) goto L_0x001c
            java.util.Iterator r0 = r0.mo14035s()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x001e
        L_0x001c:
            r0 = r1
            r2 = r0
        L_0x001e:
            int[] r3 = r12.f12192a
            int r3 = r3.length
            r4 = 0
            r5 = 0
        L_0x0023:
            if (r5 >= r3) goto L_0x0586
            int r6 = r12.m17780i0(r5)
            int r7 = r12.m17762Q(r5)
        L_0x002d:
            if (r2 == 0) goto L_0x004b
            e.k.c.j.r<?> r8 = r12.f12207p
            int r8 = r8.mo13932a(r2)
            if (r8 > r7) goto L_0x004b
            e.k.c.j.r<?> r8 = r12.f12207p
            r8.mo13941j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x002d
        L_0x0049:
            r2 = r1
            goto L_0x002d
        L_0x004b:
            int r8 = m17779h0(r6)
            r9 = 1
            switch(r8) {
                case 0: goto L_0x0571;
                case 1: goto L_0x055f;
                case 2: goto L_0x054d;
                case 3: goto L_0x053b;
                case 4: goto L_0x0529;
                case 5: goto L_0x0517;
                case 6: goto L_0x0505;
                case 7: goto L_0x04f2;
                case 8: goto L_0x04df;
                case 9: goto L_0x04c8;
                case 10: goto L_0x04b3;
                case 11: goto L_0x04a0;
                case 12: goto L_0x048d;
                case 13: goto L_0x047a;
                case 14: goto L_0x0467;
                case 15: goto L_0x0454;
                case 16: goto L_0x0441;
                case 17: goto L_0x042a;
                case 18: goto L_0x0417;
                case 19: goto L_0x0404;
                case 20: goto L_0x03f1;
                case 21: goto L_0x03de;
                case 22: goto L_0x03cb;
                case 23: goto L_0x03b8;
                case 24: goto L_0x03a5;
                case 25: goto L_0x0392;
                case 26: goto L_0x037f;
                case 27: goto L_0x0368;
                case 28: goto L_0x0355;
                case 29: goto L_0x0342;
                case 30: goto L_0x032f;
                case 31: goto L_0x031c;
                case 32: goto L_0x0309;
                case 33: goto L_0x02f6;
                case 34: goto L_0x02e3;
                case 35: goto L_0x02d0;
                case 36: goto L_0x02bd;
                case 37: goto L_0x02aa;
                case 38: goto L_0x0297;
                case 39: goto L_0x0284;
                case 40: goto L_0x0271;
                case 41: goto L_0x025e;
                case 42: goto L_0x024b;
                case 43: goto L_0x0238;
                case 44: goto L_0x0225;
                case 45: goto L_0x0212;
                case 46: goto L_0x01ff;
                case 47: goto L_0x01ec;
                case 48: goto L_0x01d9;
                case 49: goto L_0x01c2;
                case 50: goto L_0x01b5;
                case 51: goto L_0x01a2;
                case 52: goto L_0x018f;
                case 53: goto L_0x017c;
                case 54: goto L_0x0169;
                case 55: goto L_0x0156;
                case 56: goto L_0x0143;
                case 57: goto L_0x0130;
                case 58: goto L_0x011d;
                case 59: goto L_0x010a;
                case 60: goto L_0x00f3;
                case 61: goto L_0x00de;
                case 62: goto L_0x00cb;
                case 63: goto L_0x00b8;
                case 64: goto L_0x00a5;
                case 65: goto L_0x0092;
                case 66: goto L_0x007f;
                case 67: goto L_0x006c;
                case 68: goto L_0x0055;
                default: goto L_0x0053;
            }
        L_0x0053:
            goto L_0x0582
        L_0x0055:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            e.k.c.j.j1 r8 = r12.m17796s(r5)
            r14.mo13796O(r7, r6, r8)
            goto L_0x0582
        L_0x006c:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17768W(r13, r8)
            r14.mo13785D(r7, r8)
            goto L_0x0582
        L_0x007f:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17767V(r13, r8)
            r14.mo13794M(r7, r6)
            goto L_0x0582
        L_0x0092:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17768W(r13, r8)
            r14.mo13820x(r7, r8)
            goto L_0x0582
        L_0x00a5:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17767V(r13, r8)
            r14.mo13814r(r7, r6)
            goto L_0x0582
        L_0x00b8:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17767V(r13, r8)
            r14.mo13789H(r7, r6)
            goto L_0x0582
        L_0x00cb:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17767V(r13, r8)
            r14.mo13798b(r7, r6)
            goto L_0x0582
        L_0x00de:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            e.k.c.j.i r6 = (p082e.p126k.p129c.p131j.C3934i) r6
            r14.mo13819w(r7, r6)
            goto L_0x0582
        L_0x00f3:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            e.k.c.j.j1 r8 = r12.m17796s(r5)
            r14.mo13822z(r7, r6, r8)
            goto L_0x0582
        L_0x010a:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            r12.m17790n0(r7, r6, r14)
            goto L_0x0582
        L_0x011d:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            boolean r6 = m17764S(r13, r8)
            r14.mo13813q(r7, r6)
            goto L_0x0582
        L_0x0130:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17767V(r13, r8)
            r14.mo13800d(r7, r6)
            goto L_0x0582
        L_0x0143:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17768W(r13, r8)
            r14.mo13804h(r7, r8)
            goto L_0x0582
        L_0x0156:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17767V(r13, r8)
            r14.mo13816t(r7, r6)
            goto L_0x0582
        L_0x0169:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17768W(r13, r8)
            r14.mo13810n(r7, r8)
            goto L_0x0582
        L_0x017c:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17768W(r13, r8)
            r14.mo13812p(r7, r8)
            goto L_0x0582
        L_0x018f:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            float r6 = m17766U(r13, r8)
            r14.mo13786E(r7, r6)
            goto L_0x0582
        L_0x01a2:
            boolean r8 = r12.m17750E(r13, r7, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            double r8 = m17765T(r13, r8)
            r14.mo13801e(r7, r8)
            goto L_0x0582
        L_0x01b5:
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            r12.m17788m0(r14, r7, r6, r5)
            goto L_0x0582
        L_0x01c2:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            e.k.c.j.j1 r8 = r12.m17796s(r5)
            p082e.p126k.p129c.p131j.C3978l1.m17314U(r7, r6, r14, r8)
            goto L_0x0582
        L_0x01d9:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17323b0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ec:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17321a0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x01ff:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17319Z(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0212:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17318Y(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0225:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17310Q(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0238:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17327d0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x024b:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17307N(r7, r6, r14, r9)
            goto L_0x0582
        L_0x025e:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17311R(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0271:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17312S(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0284:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17315V(r7, r6, r14, r9)
            goto L_0x0582
        L_0x0297:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17329e0(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02aa:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17316W(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02bd:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17313T(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02d0:
            int r7 = r12.m17762Q(r5)
            long r10 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r10)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17309P(r7, r6, r14, r9)
            goto L_0x0582
        L_0x02e3:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17323b0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x02f6:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17321a0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0309:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17319Z(r7, r6, r14, r4)
            goto L_0x0582
        L_0x031c:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17318Y(r7, r6, r14, r4)
            goto L_0x0582
        L_0x032f:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17310Q(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0342:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17327d0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0355:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17308O(r7, r6, r14)
            goto L_0x0582
        L_0x0368:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            e.k.c.j.j1 r8 = r12.m17796s(r5)
            p082e.p126k.p129c.p131j.C3978l1.m17317X(r7, r6, r14, r8)
            goto L_0x0582
        L_0x037f:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17325c0(r7, r6, r14)
            goto L_0x0582
        L_0x0392:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17307N(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03a5:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17311R(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03b8:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17312S(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03cb:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17315V(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03de:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17329e0(r7, r6, r14, r4)
            goto L_0x0582
        L_0x03f1:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17316W(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0404:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17313T(r7, r6, r14, r4)
            goto L_0x0582
        L_0x0417:
            int r7 = r12.m17762Q(r5)
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            java.util.List r6 = (java.util.List) r6
            p082e.p126k.p129c.p131j.C3978l1.m17309P(r7, r6, r14, r4)
            goto L_0x0582
        L_0x042a:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            e.k.c.j.j1 r8 = r12.m17796s(r5)
            r14.mo13796O(r7, r6, r8)
            goto L_0x0582
        L_0x0441:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17753H(r13, r8)
            r14.mo13785D(r7, r8)
            goto L_0x0582
        L_0x0454:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17800w(r13, r8)
            r14.mo13794M(r7, r6)
            goto L_0x0582
        L_0x0467:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17753H(r13, r8)
            r14.mo13820x(r7, r8)
            goto L_0x0582
        L_0x047a:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17800w(r13, r8)
            r14.mo13814r(r7, r6)
            goto L_0x0582
        L_0x048d:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17800w(r13, r8)
            r14.mo13789H(r7, r6)
            goto L_0x0582
        L_0x04a0:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17800w(r13, r8)
            r14.mo13798b(r7, r6)
            goto L_0x0582
        L_0x04b3:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            e.k.c.j.i r6 = (p082e.p126k.p129c.p131j.C3934i) r6
            r14.mo13819w(r7, r6)
            goto L_0x0582
        L_0x04c8:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            e.k.c.j.j1 r8 = r12.m17796s(r5)
            r14.mo13822z(r7, r6, r8)
            goto L_0x0582
        L_0x04df:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r13, r8)
            r12.m17790n0(r7, r6, r14)
            goto L_0x0582
        L_0x04f2:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            boolean r6 = m17783k(r13, r8)
            r14.mo13813q(r7, r6)
            goto L_0x0582
        L_0x0505:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17800w(r13, r8)
            r14.mo13800d(r7, r6)
            goto L_0x0582
        L_0x0517:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17753H(r13, r8)
            r14.mo13804h(r7, r8)
            goto L_0x0582
        L_0x0529:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            int r6 = m17800w(r13, r8)
            r14.mo13816t(r7, r6)
            goto L_0x0582
        L_0x053b:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17753H(r13, r8)
            r14.mo13810n(r7, r8)
            goto L_0x0582
        L_0x054d:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            long r8 = m17753H(r13, r8)
            r14.mo13812p(r7, r8)
            goto L_0x0582
        L_0x055f:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            float r6 = m17793p(r13, r8)
            r14.mo13786E(r7, r6)
            goto L_0x0582
        L_0x0571:
            boolean r8 = r12.m17802y(r13, r5)
            if (r8 == 0) goto L_0x0582
            long r8 = m17763R(r6)
            double r8 = m17785l(r13, r8)
            r14.mo13801e(r7, r8)
        L_0x0582:
            int r5 = r5 + 3
            goto L_0x0023
        L_0x0586:
            if (r2 == 0) goto L_0x059c
            e.k.c.j.r<?> r3 = r12.f12207p
            r3.mo13941j(r14, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x059a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0586
        L_0x059a:
            r2 = r1
            goto L_0x0586
        L_0x059c:
            e.k.c.j.q1<?, ?> r0 = r12.f12206o
            r12.m17792o0(r0, r13, r14)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17784k0(java.lang.Object, e.k.c.j.x1):void");
    }

    /* renamed from: l */
    private static <T> double m17785l(T t, long j) {
        return C4022u1.m17659y(t, j);
    }

    /* JADX WARNING: Removed duplicated region for block: B:161:0x058e  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002a  */
    /* renamed from: l0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m17786l0(T r11, p082e.p126k.p129c.p131j.C4052x1 r12) throws java.io.IOException {
        /*
            r10 = this;
            e.k.c.j.q1<?, ?> r0 = r10.f12206o
            r10.m17792o0(r0, r11, r12)
            boolean r0 = r10.f12197f
            r1 = 0
            if (r0 == 0) goto L_0x0021
            e.k.c.j.r<?> r0 = r10.f12207p
            e.k.c.j.v r0 = r0.mo13934c(r11)
            boolean r2 = r0.mo14032n()
            if (r2 != 0) goto L_0x0021
            java.util.Iterator r0 = r0.mo14027g()
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0023
        L_0x0021:
            r0 = r1
            r2 = r0
        L_0x0023:
            int[] r3 = r10.f12192a
            int r3 = r3.length
            int r3 = r3 + -3
        L_0x0028:
            if (r3 < 0) goto L_0x058c
            int r4 = r10.m17780i0(r3)
            int r5 = r10.m17762Q(r3)
        L_0x0032:
            if (r2 == 0) goto L_0x0050
            e.k.c.j.r<?> r6 = r10.f12207p
            int r6 = r6.mo13932a(r2)
            if (r6 <= r5) goto L_0x0050
            e.k.c.j.r<?> r6 = r10.f12207p
            r6.mo13941j(r12, r2)
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x004e
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            goto L_0x0032
        L_0x004e:
            r2 = r1
            goto L_0x0032
        L_0x0050:
            int r6 = m17779h0(r4)
            r7 = 1
            r8 = 0
            switch(r6) {
                case 0: goto L_0x0577;
                case 1: goto L_0x0565;
                case 2: goto L_0x0553;
                case 3: goto L_0x0541;
                case 4: goto L_0x052f;
                case 5: goto L_0x051d;
                case 6: goto L_0x050b;
                case 7: goto L_0x04f8;
                case 8: goto L_0x04e5;
                case 9: goto L_0x04ce;
                case 10: goto L_0x04b9;
                case 11: goto L_0x04a6;
                case 12: goto L_0x0493;
                case 13: goto L_0x0480;
                case 14: goto L_0x046d;
                case 15: goto L_0x045a;
                case 16: goto L_0x0447;
                case 17: goto L_0x0430;
                case 18: goto L_0x041d;
                case 19: goto L_0x040a;
                case 20: goto L_0x03f7;
                case 21: goto L_0x03e4;
                case 22: goto L_0x03d1;
                case 23: goto L_0x03be;
                case 24: goto L_0x03ab;
                case 25: goto L_0x0398;
                case 26: goto L_0x0385;
                case 27: goto L_0x036e;
                case 28: goto L_0x035b;
                case 29: goto L_0x0348;
                case 30: goto L_0x0335;
                case 31: goto L_0x0322;
                case 32: goto L_0x030f;
                case 33: goto L_0x02fc;
                case 34: goto L_0x02e9;
                case 35: goto L_0x02d6;
                case 36: goto L_0x02c3;
                case 37: goto L_0x02b0;
                case 38: goto L_0x029d;
                case 39: goto L_0x028a;
                case 40: goto L_0x0277;
                case 41: goto L_0x0264;
                case 42: goto L_0x0251;
                case 43: goto L_0x023e;
                case 44: goto L_0x022b;
                case 45: goto L_0x0218;
                case 46: goto L_0x0205;
                case 47: goto L_0x01f2;
                case 48: goto L_0x01df;
                case 49: goto L_0x01c8;
                case 50: goto L_0x01bb;
                case 51: goto L_0x01a8;
                case 52: goto L_0x0195;
                case 53: goto L_0x0182;
                case 54: goto L_0x016f;
                case 55: goto L_0x015c;
                case 56: goto L_0x0149;
                case 57: goto L_0x0136;
                case 58: goto L_0x0123;
                case 59: goto L_0x0110;
                case 60: goto L_0x00f9;
                case 61: goto L_0x00e4;
                case 62: goto L_0x00d1;
                case 63: goto L_0x00be;
                case 64: goto L_0x00ab;
                case 65: goto L_0x0098;
                case 66: goto L_0x0085;
                case 67: goto L_0x0072;
                case 68: goto L_0x005b;
                default: goto L_0x0059;
            }
        L_0x0059:
            goto L_0x0588
        L_0x005b:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            e.k.c.j.j1 r6 = r10.m17796s(r3)
            r12.mo13796O(r5, r4, r6)
            goto L_0x0588
        L_0x0072:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17768W(r11, r6)
            r12.mo13785D(r5, r6)
            goto L_0x0588
        L_0x0085:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17767V(r11, r6)
            r12.mo13794M(r5, r4)
            goto L_0x0588
        L_0x0098:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17768W(r11, r6)
            r12.mo13820x(r5, r6)
            goto L_0x0588
        L_0x00ab:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17767V(r11, r6)
            r12.mo13814r(r5, r4)
            goto L_0x0588
        L_0x00be:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17767V(r11, r6)
            r12.mo13789H(r5, r4)
            goto L_0x0588
        L_0x00d1:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17767V(r11, r6)
            r12.mo13798b(r5, r4)
            goto L_0x0588
        L_0x00e4:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            e.k.c.j.i r4 = (p082e.p126k.p129c.p131j.C3934i) r4
            r12.mo13819w(r5, r4)
            goto L_0x0588
        L_0x00f9:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            e.k.c.j.j1 r6 = r10.m17796s(r3)
            r12.mo13822z(r5, r4, r6)
            goto L_0x0588
        L_0x0110:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            r10.m17790n0(r5, r4, r12)
            goto L_0x0588
        L_0x0123:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            boolean r4 = m17764S(r11, r6)
            r12.mo13813q(r5, r4)
            goto L_0x0588
        L_0x0136:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17767V(r11, r6)
            r12.mo13800d(r5, r4)
            goto L_0x0588
        L_0x0149:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17768W(r11, r6)
            r12.mo13804h(r5, r6)
            goto L_0x0588
        L_0x015c:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17767V(r11, r6)
            r12.mo13816t(r5, r4)
            goto L_0x0588
        L_0x016f:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17768W(r11, r6)
            r12.mo13810n(r5, r6)
            goto L_0x0588
        L_0x0182:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17768W(r11, r6)
            r12.mo13812p(r5, r6)
            goto L_0x0588
        L_0x0195:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            float r4 = m17766U(r11, r6)
            r12.mo13786E(r5, r4)
            goto L_0x0588
        L_0x01a8:
            boolean r6 = r10.m17750E(r11, r5, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            double r6 = m17765T(r11, r6)
            r12.mo13801e(r5, r6)
            goto L_0x0588
        L_0x01bb:
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            r10.m17788m0(r12, r5, r4, r3)
            goto L_0x0588
        L_0x01c8:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            e.k.c.j.j1 r6 = r10.m17796s(r3)
            p082e.p126k.p129c.p131j.C3978l1.m17314U(r5, r4, r12, r6)
            goto L_0x0588
        L_0x01df:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17323b0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x01f2:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17321a0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0205:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17319Z(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0218:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17318Y(r5, r4, r12, r7)
            goto L_0x0588
        L_0x022b:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17310Q(r5, r4, r12, r7)
            goto L_0x0588
        L_0x023e:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17327d0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0251:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17307N(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0264:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17311R(r5, r4, r12, r7)
            goto L_0x0588
        L_0x0277:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17312S(r5, r4, r12, r7)
            goto L_0x0588
        L_0x028a:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17315V(r5, r4, r12, r7)
            goto L_0x0588
        L_0x029d:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17329e0(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02b0:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17316W(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02c3:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17313T(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02d6:
            int r5 = r10.m17762Q(r3)
            long r8 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r8)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17309P(r5, r4, r12, r7)
            goto L_0x0588
        L_0x02e9:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17323b0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x02fc:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17321a0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x030f:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17319Z(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0322:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17318Y(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0335:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17310Q(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0348:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17327d0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x035b:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17308O(r5, r4, r12)
            goto L_0x0588
        L_0x036e:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            e.k.c.j.j1 r6 = r10.m17796s(r3)
            p082e.p126k.p129c.p131j.C3978l1.m17317X(r5, r4, r12, r6)
            goto L_0x0588
        L_0x0385:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17325c0(r5, r4, r12)
            goto L_0x0588
        L_0x0398:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17307N(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03ab:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17311R(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03be:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17312S(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03d1:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17315V(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03e4:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17329e0(r5, r4, r12, r8)
            goto L_0x0588
        L_0x03f7:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17316W(r5, r4, r12, r8)
            goto L_0x0588
        L_0x040a:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17313T(r5, r4, r12, r8)
            goto L_0x0588
        L_0x041d:
            int r5 = r10.m17762Q(r3)
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            java.util.List r4 = (java.util.List) r4
            p082e.p126k.p129c.p131j.C3978l1.m17309P(r5, r4, r12, r8)
            goto L_0x0588
        L_0x0430:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            e.k.c.j.j1 r6 = r10.m17796s(r3)
            r12.mo13796O(r5, r4, r6)
            goto L_0x0588
        L_0x0447:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17753H(r11, r6)
            r12.mo13785D(r5, r6)
            goto L_0x0588
        L_0x045a:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17800w(r11, r6)
            r12.mo13794M(r5, r4)
            goto L_0x0588
        L_0x046d:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17753H(r11, r6)
            r12.mo13820x(r5, r6)
            goto L_0x0588
        L_0x0480:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17800w(r11, r6)
            r12.mo13814r(r5, r4)
            goto L_0x0588
        L_0x0493:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17800w(r11, r6)
            r12.mo13789H(r5, r4)
            goto L_0x0588
        L_0x04a6:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17800w(r11, r6)
            r12.mo13798b(r5, r4)
            goto L_0x0588
        L_0x04b9:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            e.k.c.j.i r4 = (p082e.p126k.p129c.p131j.C3934i) r4
            r12.mo13819w(r5, r4)
            goto L_0x0588
        L_0x04ce:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            e.k.c.j.j1 r6 = r10.m17796s(r3)
            r12.mo13822z(r5, r4, r6)
            goto L_0x0588
        L_0x04e5:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            java.lang.Object r4 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r11, r6)
            r10.m17790n0(r5, r4, r12)
            goto L_0x0588
        L_0x04f8:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            boolean r4 = m17783k(r11, r6)
            r12.mo13813q(r5, r4)
            goto L_0x0588
        L_0x050b:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17800w(r11, r6)
            r12.mo13800d(r5, r4)
            goto L_0x0588
        L_0x051d:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17753H(r11, r6)
            r12.mo13804h(r5, r6)
            goto L_0x0588
        L_0x052f:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            int r4 = m17800w(r11, r6)
            r12.mo13816t(r5, r4)
            goto L_0x0588
        L_0x0541:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17753H(r11, r6)
            r12.mo13810n(r5, r6)
            goto L_0x0588
        L_0x0553:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            long r6 = m17753H(r11, r6)
            r12.mo13812p(r5, r6)
            goto L_0x0588
        L_0x0565:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            float r4 = m17793p(r11, r6)
            r12.mo13786E(r5, r4)
            goto L_0x0588
        L_0x0577:
            boolean r6 = r10.m17802y(r11, r3)
            if (r6 == 0) goto L_0x0588
            long r6 = m17763R(r4)
            double r6 = m17785l(r11, r6)
            r12.mo13801e(r5, r6)
        L_0x0588:
            int r3 = r3 + -3
            goto L_0x0028
        L_0x058c:
            if (r2 == 0) goto L_0x05a3
            e.k.c.j.r<?> r11 = r10.f12207p
            r11.mo13941j(r12, r2)
            boolean r11 = r0.hasNext()
            if (r11 == 0) goto L_0x05a1
            java.lang.Object r11 = r0.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            r2 = r11
            goto L_0x058c
        L_0x05a1:
            r2 = r1
            goto L_0x058c
        L_0x05a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17786l0(java.lang.Object, e.k.c.j.x1):void");
    }

    /* renamed from: m */
    private boolean m17787m(T t, T t2, int i) {
        int i0 = m17780i0(i);
        long R = m17763R(i0);
        switch (m17779h0(i0)) {
            case 0:
                if (!m17781j(t, t2, i) || Double.doubleToLongBits(C4022u1.m17659y(t, R)) != Double.doubleToLongBits(C4022u1.m17659y(t2, R))) {
                    return false;
                }
                return true;
            case 1:
                if (!m17781j(t, t2, i) || Float.floatToIntBits(C4022u1.m17660z(t, R)) != Float.floatToIntBits(C4022u1.m17660z(t2, R))) {
                    return false;
                }
                return true;
            case 2:
                if (!m17781j(t, t2, i) || C4022u1.m17615C(t, R) != C4022u1.m17615C(t2, R)) {
                    return false;
                }
                return true;
            case 3:
                if (!m17781j(t, t2, i) || C4022u1.m17615C(t, R) != C4022u1.m17615C(t2, R)) {
                    return false;
                }
                return true;
            case 4:
                if (!m17781j(t, t2, i) || C4022u1.m17613A(t, R) != C4022u1.m17613A(t2, R)) {
                    return false;
                }
                return true;
            case 5:
                if (!m17781j(t, t2, i) || C4022u1.m17615C(t, R) != C4022u1.m17615C(t2, R)) {
                    return false;
                }
                return true;
            case 6:
                if (!m17781j(t, t2, i) || C4022u1.m17613A(t, R) != C4022u1.m17613A(t2, R)) {
                    return false;
                }
                return true;
            case 7:
                if (!m17781j(t, t2, i) || C4022u1.m17652r(t, R) != C4022u1.m17652r(t2, R)) {
                    return false;
                }
                return true;
            case 8:
                if (!m17781j(t, t2, i) || !C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R))) {
                    return false;
                }
                return true;
            case 9:
                if (!m17781j(t, t2, i) || !C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R))) {
                    return false;
                }
                return true;
            case 10:
                if (!m17781j(t, t2, i) || !C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R))) {
                    return false;
                }
                return true;
            case 11:
                if (!m17781j(t, t2, i) || C4022u1.m17613A(t, R) != C4022u1.m17613A(t2, R)) {
                    return false;
                }
                return true;
            case 12:
                if (!m17781j(t, t2, i) || C4022u1.m17613A(t, R) != C4022u1.m17613A(t2, R)) {
                    return false;
                }
                return true;
            case 13:
                if (!m17781j(t, t2, i) || C4022u1.m17613A(t, R) != C4022u1.m17613A(t2, R)) {
                    return false;
                }
                return true;
            case 14:
                if (!m17781j(t, t2, i) || C4022u1.m17615C(t, R) != C4022u1.m17615C(t2, R)) {
                    return false;
                }
                return true;
            case 15:
                if (!m17781j(t, t2, i) || C4022u1.m17613A(t, R) != C4022u1.m17613A(t2, R)) {
                    return false;
                }
                return true;
            case 16:
                if (!m17781j(t, t2, i) || C4022u1.m17615C(t, R) != C4022u1.m17615C(t2, R)) {
                    return false;
                }
                return true;
            case 17:
                if (!m17781j(t, t2, i) || !C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R))) {
                    return false;
                }
                return true;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                return C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R));
            case 50:
                return C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R));
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
            case 56:
            case 57:
            case 58:
            case 59:
            case 60:
            case 61:
            case 62:
            case 63:
            case 64:
            case 65:
            case 66:
            case 67:
            case 68:
                if (!m17749D(t, t2, i) || !C3978l1.m17304K(C4022u1.m17617E(t, R), C4022u1.m17617E(t2, R))) {
                    return false;
                }
                return true;
            default:
                return true;
        }
    }

    /* renamed from: m0 */
    private <K, V> void m17788m0(C4052x1 x1Var, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            x1Var.mo13793L(i, this.f12208q.mo13897c(m17795r(i2)), this.f12208q.mo13902h(obj));
        }
    }

    /* renamed from: n */
    private final <UT, UB> UB m17789n(Object obj, int i, UB ub, C4006q1<UT, UB> q1Var) {
        C3899b0.C3904e q;
        int Q = m17762Q(i);
        Object E = C4022u1.m17617E(obj, m17763R(m17780i0(i)));
        if (E == null || (q = m17794q(i)) == null) {
            return ub;
        }
        return m17791o(i, Q, this.f12208q.mo13898d(E), q, ub, q1Var);
    }

    /* renamed from: n0 */
    private void m17790n0(int i, Object obj, C4052x1 x1Var) throws IOException {
        if (obj instanceof String) {
            x1Var.mo13809m(i, (String) obj);
        } else {
            x1Var.mo13819w(i, (C3934i) obj);
        }
    }

    /* renamed from: o */
    private final <K, V, UT, UB> UB m17791o(int i, int i2, Map<K, V> map, C3899b0.C3904e eVar, UB ub, C4006q1<UT, UB> q1Var) {
        C3976l0.C3977a<?, ?> c = this.f12208q.mo13897c(m17795r(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry next = it.next();
            if (!eVar.mo13462a(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = q1Var.mo13925n();
                }
                C3934i.C3942h newCodedBuilder = C3934i.newCodedBuilder(C3976l0.m17289b(c, next.getKey(), next.getValue()));
                try {
                    C3976l0.m17291e(newCodedBuilder.mo13618b(), c, next.getKey(), next.getValue());
                    q1Var.mo13915d(ub, i2, newCodedBuilder.mo13617a());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* renamed from: o0 */
    private <UT, UB> void m17792o0(C4006q1<UT, UB> q1Var, T t, C4052x1 x1Var) throws IOException {
        q1Var.mo13931t(q1Var.mo13918g(t), x1Var);
    }

    /* renamed from: p */
    private static <T> float m17793p(T t, long j) {
        return C4022u1.m17660z(t, j);
    }

    /* renamed from: q */
    private C3899b0.C3904e m17794q(int i) {
        return (C3899b0.C3904e) this.f12193b[((i / 3) * 2) + 1];
    }

    /* renamed from: r */
    private Object m17795r(int i) {
        return this.f12193b[(i / 3) * 2];
    }

    /* renamed from: s */
    private C3963j1 m17796s(int i) {
        int i2 = (i / 3) * 2;
        C3963j1 j1Var = (C3963j1) this.f12193b[i2];
        if (j1Var != null) {
            return j1Var;
        }
        C3963j1 d = C3924e1.m16737a().mo13539d((Class) this.f12193b[i2 + 1]);
        this.f12193b[i2] = d;
        return d;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x0347, code lost:
        r4 = (r4 + r8) + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0461, code lost:
        r6 = r6 + r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0518, code lost:
        r5 = r5 + 3;
        r4 = r16;
     */
    /* renamed from: t */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m17797t(T r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            sun.misc.Unsafe r2 = f12191s
            r4 = -1
            r5 = 0
            r6 = 0
            r7 = 0
        L_0x000a:
            int[] r8 = r0.f12192a
            int r8 = r8.length
            if (r5 >= r8) goto L_0x051e
            int r8 = r0.m17780i0(r5)
            int r9 = r0.m17762Q(r5)
            int r10 = m17779h0(r8)
            r11 = 17
            r12 = 1048575(0xfffff, float:1.469367E-39)
            r13 = 1
            if (r10 > r11) goto L_0x0039
            int[] r11 = r0.f12192a
            int r14 = r5 + 2
            r11 = r11[r14]
            r12 = r12 & r11
            int r14 = r11 >>> 20
            int r14 = r13 << r14
            r15 = r14
            if (r12 == r4) goto L_0x0037
            long r13 = (long) r12
            int r7 = r2.getInt(r1, r13)
            r4 = r12
        L_0x0037:
            r14 = r15
            goto L_0x0057
        L_0x0039:
            boolean r11 = r0.f12200i
            if (r11 == 0) goto L_0x0055
            e.k.c.j.w r11 = p082e.p126k.p129c.p131j.C4038w.DOUBLE_LIST_PACKED
            int r11 = r11.mo14057id()
            if (r10 < r11) goto L_0x0055
            e.k.c.j.w r11 = p082e.p126k.p129c.p131j.C4038w.SINT64_LIST_PACKED
            int r11 = r11.mo14057id()
            if (r10 > r11) goto L_0x0055
            int[] r11 = r0.f12192a
            int r13 = r5 + 2
            r11 = r11[r13]
            r11 = r11 & r12
            goto L_0x0056
        L_0x0055:
            r11 = 0
        L_0x0056:
            r14 = 0
        L_0x0057:
            long r12 = m17763R(r8)
            r8 = 0
            r16 = r4
            r3 = 0
            switch(r10) {
                case 0: goto L_0x050c;
                case 1: goto L_0x0502;
                case 2: goto L_0x04f4;
                case 3: goto L_0x04e6;
                case 4: goto L_0x04d8;
                case 5: goto L_0x04ce;
                case 6: goto L_0x04c4;
                case 7: goto L_0x04b9;
                case 8: goto L_0x049d;
                case 9: goto L_0x048c;
                case 10: goto L_0x047d;
                case 11: goto L_0x0470;
                case 12: goto L_0x0463;
                case 13: goto L_0x0458;
                case 14: goto L_0x044f;
                case 15: goto L_0x0442;
                case 16: goto L_0x0435;
                case 17: goto L_0x0422;
                case 18: goto L_0x0413;
                case 19: goto L_0x0407;
                case 20: goto L_0x03fb;
                case 21: goto L_0x03ef;
                case 22: goto L_0x03e3;
                case 23: goto L_0x03d7;
                case 24: goto L_0x03cb;
                case 25: goto L_0x03bf;
                case 26: goto L_0x03b4;
                case 27: goto L_0x03a5;
                case 28: goto L_0x0399;
                case 29: goto L_0x038c;
                case 30: goto L_0x037f;
                case 31: goto L_0x0372;
                case 32: goto L_0x0365;
                case 33: goto L_0x0358;
                case 34: goto L_0x034b;
                case 35: goto L_0x032b;
                case 36: goto L_0x030e;
                case 37: goto L_0x02f1;
                case 38: goto L_0x02d4;
                case 39: goto L_0x02b6;
                case 40: goto L_0x0298;
                case 41: goto L_0x027a;
                case 42: goto L_0x025c;
                case 43: goto L_0x023e;
                case 44: goto L_0x0220;
                case 45: goto L_0x0202;
                case 46: goto L_0x01e4;
                case 47: goto L_0x01c6;
                case 48: goto L_0x01a8;
                case 49: goto L_0x0198;
                case 50: goto L_0x0188;
                case 51: goto L_0x017a;
                case 52: goto L_0x016e;
                case 53: goto L_0x015e;
                case 54: goto L_0x014e;
                case 55: goto L_0x013e;
                case 56: goto L_0x0132;
                case 57: goto L_0x0125;
                case 58: goto L_0x0118;
                case 59: goto L_0x00fa;
                case 60: goto L_0x00e6;
                case 61: goto L_0x00d4;
                case 62: goto L_0x00c4;
                case 63: goto L_0x00b4;
                case 64: goto L_0x00a7;
                case 65: goto L_0x009b;
                case 66: goto L_0x008b;
                case 67: goto L_0x007b;
                case 68: goto L_0x0065;
                default: goto L_0x0063;
            }
        L_0x0063:
            goto L_0x041f
        L_0x0065:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.k.c.j.s0 r3 = (p082e.p126k.p129c.p131j.C4012s0) r3
            e.k.c.j.j1 r4 = r0.m17796s(r5)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17165t(r9, r3, r4)
            goto L_0x041e
        L_0x007b:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = m17768W(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17135S(r9, r3)
            goto L_0x041e
        L_0x008b:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = m17767V(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17133Q(r9, r3)
            goto L_0x041e
        L_0x009b:
            boolean r8 = r0.m17750E(r1, r9, r5)
            if (r8 == 0) goto L_0x041f
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17131O(r9, r3)
            goto L_0x041e
        L_0x00a7:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17129M(r9, r3)
            goto L_0x0461
        L_0x00b4:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = m17767V(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17157l(r9, r3)
            goto L_0x041e
        L_0x00c4:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = m17767V(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17140X(r9, r3)
            goto L_0x041e
        L_0x00d4:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.k.c.j.i r3 = (p082e.p126k.p129c.p131j.C3934i) r3
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17151h(r9, r3)
            goto L_0x041e
        L_0x00e6:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.k.c.j.j1 r4 = r0.m17796s(r5)
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17339o(r9, r3, r4)
            goto L_0x041e
        L_0x00fa:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof p082e.p126k.p129c.p131j.C3934i
            if (r4 == 0) goto L_0x0110
            e.k.c.j.i r3 = (p082e.p126k.p129c.p131j.C3934i) r3
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17151h(r9, r3)
            goto L_0x041e
        L_0x0110:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17137U(r9, r3)
            goto L_0x041e
        L_0x0118:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 1
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17147e(r9, r3)
            goto L_0x041e
        L_0x0125:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17159n(r9, r3)
            goto L_0x0461
        L_0x0132:
            boolean r8 = r0.m17750E(r1, r9, r5)
            if (r8 == 0) goto L_0x041f
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17161p(r9, r3)
            goto L_0x041e
        L_0x013e:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = m17767V(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17168w(r9, r3)
            goto L_0x041e
        L_0x014e:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = m17768W(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17142Z(r9, r3)
            goto L_0x041e
        L_0x015e:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            long r3 = m17768W(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17170y(r9, r3)
            goto L_0x041e
        L_0x016e:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17163r(r9, r8)
            goto L_0x041e
        L_0x017a:
            boolean r3 = r0.m17750E(r1, r9, r5)
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17155j(r9, r3)
            goto L_0x041e
        L_0x0188:
            e.k.c.j.n0 r3 = r0.f12208q
            java.lang.Object r4 = r2.getObject(r1, r12)
            java.lang.Object r8 = r0.m17795r(r5)
            int r3 = r3.mo13900f(r9, r4, r8)
            goto L_0x041e
        L_0x0198:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            e.k.c.j.j1 r4 = r0.m17796s(r5)
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17334j(r9, r3, r4)
            goto L_0x041e
        L_0x01a8:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17344t(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x01bc
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01bc:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x01c6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17342r(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x01da
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01da:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x01e4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17333i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x01f8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x01f8:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x0202:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17331g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x0216
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0216:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x0220:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17328e(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x0234
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0234:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x023e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17347w(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x0252
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0252:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x025c:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17322b(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x0270
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0270:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x027a:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17331g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x028e
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x028e:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x0298:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17333i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x02ac
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ac:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x02b6:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17336l(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x02ca
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02ca:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x02d4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17349y(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x02e8
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x02e8:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x02f1:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17338n(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x0305
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0305:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x030e:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17331g(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x0322
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x0322:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
            goto L_0x0347
        L_0x032b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17333i(r3)
            if (r3 <= 0) goto L_0x041f
            boolean r4 = r0.f12200i
            if (r4 == 0) goto L_0x033f
            long r10 = (long) r11
            r2.putInt(r1, r10, r3)
        L_0x033f:
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17139W(r9)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r3)
        L_0x0347:
            int r4 = r4 + r8
            int r4 = r4 + r3
            goto L_0x0461
        L_0x034b:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17343s(r9, r3, r4)
            goto L_0x041e
        L_0x0358:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17341q(r9, r3, r4)
            goto L_0x041e
        L_0x0365:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17332h(r9, r3, r4)
            goto L_0x041e
        L_0x0372:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17330f(r9, r3, r4)
            goto L_0x041e
        L_0x037f:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17326d(r9, r3, r4)
            goto L_0x041e
        L_0x038c:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17346v(r9, r3, r4)
            goto L_0x041e
        L_0x0399:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17324c(r9, r3)
            goto L_0x041e
        L_0x03a5:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            e.k.c.j.j1 r4 = r0.m17796s(r5)
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17340p(r9, r3, r4)
            goto L_0x041e
        L_0x03b4:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17345u(r9, r3)
            goto L_0x041e
        L_0x03bf:
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            r4 = 0
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17320a(r9, r3, r4)
            goto L_0x041e
        L_0x03cb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17330f(r9, r3, r4)
            goto L_0x041e
        L_0x03d7:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17332h(r9, r3, r4)
            goto L_0x041e
        L_0x03e3:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17335k(r9, r3, r4)
            goto L_0x041e
        L_0x03ef:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17348x(r9, r3, r4)
            goto L_0x041e
        L_0x03fb:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17337m(r9, r3, r4)
            goto L_0x041e
        L_0x0407:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17330f(r9, r3, r4)
            goto L_0x041e
        L_0x0413:
            r4 = 0
            java.lang.Object r3 = r2.getObject(r1, r12)
            java.util.List r3 = (java.util.List) r3
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17332h(r9, r3, r4)
        L_0x041e:
            int r6 = r6 + r3
        L_0x041f:
            r10 = 0
            goto L_0x0518
        L_0x0422:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.k.c.j.s0 r3 = (p082e.p126k.p129c.p131j.C4012s0) r3
            e.k.c.j.j1 r4 = r0.m17796s(r5)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17165t(r9, r3, r4)
            goto L_0x041e
        L_0x0435:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            long r3 = r2.getLong(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17135S(r9, r3)
            goto L_0x041e
        L_0x0442:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17133Q(r9, r3)
            goto L_0x041e
        L_0x044f:
            r8 = r7 & r14
            if (r8 == 0) goto L_0x041f
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17131O(r9, r3)
            goto L_0x041e
        L_0x0458:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r3 = 0
            int r4 = p082e.p126k.p129c.p131j.C3970l.m17129M(r9, r3)
        L_0x0461:
            int r6 = r6 + r4
            goto L_0x041f
        L_0x0463:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17157l(r9, r3)
            goto L_0x041e
        L_0x0470:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            int r3 = r2.getInt(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17140X(r9, r3)
            goto L_0x041e
        L_0x047d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.k.c.j.i r3 = (p082e.p126k.p129c.p131j.C3934i) r3
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17151h(r9, r3)
            goto L_0x041e
        L_0x048c:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            e.k.c.j.j1 r4 = r0.m17796s(r5)
            int r3 = p082e.p126k.p129c.p131j.C3978l1.m17339o(r9, r3, r4)
            goto L_0x041e
        L_0x049d:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            java.lang.Object r3 = r2.getObject(r1, r12)
            boolean r4 = r3 instanceof p082e.p126k.p129c.p131j.C3934i
            if (r4 == 0) goto L_0x04b1
            e.k.c.j.i r3 = (p082e.p126k.p129c.p131j.C3934i) r3
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17151h(r9, r3)
            goto L_0x041e
        L_0x04b1:
            java.lang.String r3 = (java.lang.String) r3
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17137U(r9, r3)
            goto L_0x041e
        L_0x04b9:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r3 = 1
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17147e(r9, r3)
            goto L_0x041e
        L_0x04c4:
            r3 = r7 & r14
            if (r3 == 0) goto L_0x041f
            r10 = 0
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17159n(r9, r10)
            goto L_0x0517
        L_0x04ce:
            r10 = 0
            r8 = r7 & r14
            if (r8 == 0) goto L_0x0518
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17161p(r9, r3)
            goto L_0x0517
        L_0x04d8:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            int r3 = r2.getInt(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17168w(r9, r3)
            goto L_0x0517
        L_0x04e6:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            long r3 = r2.getLong(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17142Z(r9, r3)
            goto L_0x0517
        L_0x04f4:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            long r3 = r2.getLong(r1, r12)
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17170y(r9, r3)
            goto L_0x0517
        L_0x0502:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17163r(r9, r8)
            goto L_0x0517
        L_0x050c:
            r10 = 0
            r3 = r7 & r14
            if (r3 == 0) goto L_0x0518
            r3 = 0
            int r3 = p082e.p126k.p129c.p131j.C3970l.m17155j(r9, r3)
        L_0x0517:
            int r6 = r6 + r3
        L_0x0518:
            int r5 = r5 + 3
            r4 = r16
            goto L_0x000a
        L_0x051e:
            e.k.c.j.q1<?, ?> r2 = r0.f12206o
            int r2 = r0.m17799v(r2, r1)
            int r6 = r6 + r2
            boolean r2 = r0.f12197f
            if (r2 == 0) goto L_0x0534
            e.k.c.j.r<?> r2 = r0.f12207p
            e.k.c.j.v r1 = r2.mo13934c(r1)
            int r1 = r1.mo14031l()
            int r6 = r6 + r1
        L_0x0534:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17797t(java.lang.Object):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: u */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int m17798u(T r16) {
        /*
            r15 = this;
            r0 = r15
            r1 = r16
            sun.misc.Unsafe r2 = f12191s
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0008:
            int[] r6 = r0.f12192a
            int r6 = r6.length
            if (r4 >= r6) goto L_0x04e3
            int r6 = r15.m17780i0(r4)
            int r7 = m17779h0(r6)
            int r8 = r15.m17762Q(r4)
            long r9 = m17763R(r6)
            e.k.c.j.w r6 = p082e.p126k.p129c.p131j.C4038w.DOUBLE_LIST_PACKED
            int r6 = r6.mo14057id()
            if (r7 < r6) goto L_0x0038
            e.k.c.j.w r6 = p082e.p126k.p129c.p131j.C4038w.SINT64_LIST_PACKED
            int r6 = r6.mo14057id()
            if (r7 > r6) goto L_0x0038
            int[] r6 = r0.f12192a
            int r11 = r4 + 2
            r6 = r6[r11]
            r11 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r11
            goto L_0x0039
        L_0x0038:
            r6 = 0
        L_0x0039:
            r11 = 1
            r12 = 0
            r13 = 0
            switch(r7) {
                case 0: goto L_0x04d1;
                case 1: goto L_0x04c5;
                case 2: goto L_0x04b5;
                case 3: goto L_0x04a5;
                case 4: goto L_0x0495;
                case 5: goto L_0x0489;
                case 6: goto L_0x047d;
                case 7: goto L_0x0471;
                case 8: goto L_0x0453;
                case 9: goto L_0x043f;
                case 10: goto L_0x042e;
                case 11: goto L_0x041f;
                case 12: goto L_0x0410;
                case 13: goto L_0x0405;
                case 14: goto L_0x03fa;
                case 15: goto L_0x03eb;
                case 16: goto L_0x03dc;
                case 17: goto L_0x03c7;
                case 18: goto L_0x03bc;
                case 19: goto L_0x03b3;
                case 20: goto L_0x03aa;
                case 21: goto L_0x03a1;
                case 22: goto L_0x0398;
                case 23: goto L_0x038f;
                case 24: goto L_0x0386;
                case 25: goto L_0x037d;
                case 26: goto L_0x0374;
                case 27: goto L_0x0367;
                case 28: goto L_0x035e;
                case 29: goto L_0x0355;
                case 30: goto L_0x034b;
                case 31: goto L_0x0341;
                case 32: goto L_0x0337;
                case 33: goto L_0x032d;
                case 34: goto L_0x0323;
                case 35: goto L_0x0303;
                case 36: goto L_0x02e6;
                case 37: goto L_0x02c9;
                case 38: goto L_0x02ac;
                case 39: goto L_0x028e;
                case 40: goto L_0x0270;
                case 41: goto L_0x0252;
                case 42: goto L_0x0234;
                case 43: goto L_0x0216;
                case 44: goto L_0x01f8;
                case 45: goto L_0x01da;
                case 46: goto L_0x01bc;
                case 47: goto L_0x019e;
                case 48: goto L_0x0180;
                case 49: goto L_0x0172;
                case 50: goto L_0x0162;
                case 51: goto L_0x0154;
                case 52: goto L_0x0148;
                case 53: goto L_0x0138;
                case 54: goto L_0x0128;
                case 55: goto L_0x0118;
                case 56: goto L_0x010c;
                case 57: goto L_0x0100;
                case 58: goto L_0x00f4;
                case 59: goto L_0x00d6;
                case 60: goto L_0x00c2;
                case 61: goto L_0x00b0;
                case 62: goto L_0x00a0;
                case 63: goto L_0x0090;
                case 64: goto L_0x0084;
                case 65: goto L_0x0078;
                case 66: goto L_0x0068;
                case 67: goto L_0x0058;
                case 68: goto L_0x0042;
                default: goto L_0x0040;
            }
        L_0x0040:
            goto L_0x04df
        L_0x0042:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            e.k.c.j.s0 r6 = (p082e.p126k.p129c.p131j.C4012s0) r6
            e.k.c.j.j1 r7 = r15.m17796s(r4)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17165t(r8, r6, r7)
            goto L_0x03c4
        L_0x0058:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m17768W(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17135S(r8, r6)
            goto L_0x03c4
        L_0x0068:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m17767V(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17133Q(r8, r6)
            goto L_0x03c4
        L_0x0078:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17131O(r8, r13)
            goto L_0x03c4
        L_0x0084:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17129M(r8, r3)
            goto L_0x03c4
        L_0x0090:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m17767V(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17157l(r8, r6)
            goto L_0x03c4
        L_0x00a0:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m17767V(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17140X(r8, r6)
            goto L_0x03c4
        L_0x00b0:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            e.k.c.j.i r6 = (p082e.p126k.p129c.p131j.C3934i) r6
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17151h(r8, r6)
            goto L_0x03c4
        L_0x00c2:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            e.k.c.j.j1 r7 = r15.m17796s(r4)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17339o(r8, r6, r7)
            goto L_0x03c4
        L_0x00d6:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            boolean r7 = r6 instanceof p082e.p126k.p129c.p131j.C3934i
            if (r7 == 0) goto L_0x00ec
            e.k.c.j.i r6 = (p082e.p126k.p129c.p131j.C3934i) r6
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17151h(r8, r6)
            goto L_0x03c4
        L_0x00ec:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17137U(r8, r6)
            goto L_0x03c4
        L_0x00f4:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17147e(r8, r11)
            goto L_0x03c4
        L_0x0100:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17159n(r8, r3)
            goto L_0x03c4
        L_0x010c:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17161p(r8, r13)
            goto L_0x03c4
        L_0x0118:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = m17767V(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17168w(r8, r6)
            goto L_0x03c4
        L_0x0128:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m17768W(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17142Z(r8, r6)
            goto L_0x03c4
        L_0x0138:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = m17768W(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17170y(r8, r6)
            goto L_0x03c4
        L_0x0148:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17163r(r8, r12)
            goto L_0x03c4
        L_0x0154:
            boolean r6 = r15.m17750E(r1, r8, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17155j(r8, r6)
            goto L_0x03c4
        L_0x0162:
            e.k.c.j.n0 r6 = r0.f12208q
            java.lang.Object r7 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            java.lang.Object r9 = r15.m17795r(r4)
            int r6 = r6.mo13900f(r8, r7, r9)
            goto L_0x03c4
        L_0x0172:
            java.util.List r6 = m17752G(r1, r9)
            e.k.c.j.j1 r7 = r15.m17796s(r4)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17334j(r8, r6, r7)
            goto L_0x03c4
        L_0x0180:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17344t(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x0194
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0194:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x019e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17342r(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x01b2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01b2:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x01bc:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17333i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x01d0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01d0:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x01da:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17331g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x01ee
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x01ee:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x01f8:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17328e(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x020c
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x020c:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x0216:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17347w(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x022a
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x022a:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x0234:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17322b(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x0248
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0248:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x0252:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17331g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x0266
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0266:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x0270:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17333i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x0284
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0284:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x028e:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17336l(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x02a2
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02a2:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x02ac:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17349y(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x02c0
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02c0:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x02c9:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17338n(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x02dd
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02dd:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x02e6:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17331g(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x02fa
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x02fa:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
            goto L_0x031f
        L_0x0303:
            java.lang.Object r7 = r2.getObject(r1, r9)
            java.util.List r7 = (java.util.List) r7
            int r7 = p082e.p126k.p129c.p131j.C3978l1.m17333i(r7)
            if (r7 <= 0) goto L_0x04df
            boolean r9 = r0.f12200i
            if (r9 == 0) goto L_0x0317
            long r9 = (long) r6
            r2.putInt(r1, r9, r7)
        L_0x0317:
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17139W(r8)
            int r8 = p082e.p126k.p129c.p131j.C3970l.m17141Y(r7)
        L_0x031f:
            int r6 = r6 + r8
            int r6 = r6 + r7
            goto L_0x03c4
        L_0x0323:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17343s(r8, r6, r3)
            goto L_0x03c4
        L_0x032d:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17341q(r8, r6, r3)
            goto L_0x03c4
        L_0x0337:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17332h(r8, r6, r3)
            goto L_0x03c4
        L_0x0341:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17330f(r8, r6, r3)
            goto L_0x03c4
        L_0x034b:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17326d(r8, r6, r3)
            goto L_0x03c4
        L_0x0355:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17346v(r8, r6, r3)
            goto L_0x03c4
        L_0x035e:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17324c(r8, r6)
            goto L_0x03c4
        L_0x0367:
            java.util.List r6 = m17752G(r1, r9)
            e.k.c.j.j1 r7 = r15.m17796s(r4)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17340p(r8, r6, r7)
            goto L_0x03c4
        L_0x0374:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17345u(r8, r6)
            goto L_0x03c4
        L_0x037d:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17320a(r8, r6, r3)
            goto L_0x03c4
        L_0x0386:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17330f(r8, r6, r3)
            goto L_0x03c4
        L_0x038f:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17332h(r8, r6, r3)
            goto L_0x03c4
        L_0x0398:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17335k(r8, r6, r3)
            goto L_0x03c4
        L_0x03a1:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17348x(r8, r6, r3)
            goto L_0x03c4
        L_0x03aa:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17337m(r8, r6, r3)
            goto L_0x03c4
        L_0x03b3:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17330f(r8, r6, r3)
            goto L_0x03c4
        L_0x03bc:
            java.util.List r6 = m17752G(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17332h(r8, r6, r3)
        L_0x03c4:
            int r5 = r5 + r6
            goto L_0x04df
        L_0x03c7:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            e.k.c.j.s0 r6 = (p082e.p126k.p129c.p131j.C4012s0) r6
            e.k.c.j.j1 r7 = r15.m17796s(r4)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17165t(r8, r6, r7)
            goto L_0x03c4
        L_0x03dc:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17135S(r8, r6)
            goto L_0x03c4
        L_0x03eb:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17133Q(r8, r6)
            goto L_0x03c4
        L_0x03fa:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17131O(r8, r13)
            goto L_0x03c4
        L_0x0405:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17129M(r8, r3)
            goto L_0x03c4
        L_0x0410:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17157l(r8, r6)
            goto L_0x03c4
        L_0x041f:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17140X(r8, r6)
            goto L_0x03c4
        L_0x042e:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            e.k.c.j.i r6 = (p082e.p126k.p129c.p131j.C3934i) r6
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17151h(r8, r6)
            goto L_0x03c4
        L_0x043f:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            e.k.c.j.j1 r7 = r15.m17796s(r4)
            int r6 = p082e.p126k.p129c.p131j.C3978l1.m17339o(r8, r6, r7)
            goto L_0x03c4
        L_0x0453:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            java.lang.Object r6 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r1, r9)
            boolean r7 = r6 instanceof p082e.p126k.p129c.p131j.C3934i
            if (r7 == 0) goto L_0x0469
            e.k.c.j.i r6 = (p082e.p126k.p129c.p131j.C3934i) r6
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17151h(r8, r6)
            goto L_0x03c4
        L_0x0469:
            java.lang.String r6 = (java.lang.String) r6
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17137U(r8, r6)
            goto L_0x03c4
        L_0x0471:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17147e(r8, r11)
            goto L_0x03c4
        L_0x047d:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17159n(r8, r3)
            goto L_0x03c4
        L_0x0489:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17161p(r8, r13)
            goto L_0x03c4
        L_0x0495:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17168w(r8, r6)
            goto L_0x03c4
        L_0x04a5:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17142Z(r8, r6)
            goto L_0x03c4
        L_0x04b5:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            long r6 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r1, r9)
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17170y(r8, r6)
            goto L_0x03c4
        L_0x04c5:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17163r(r8, r12)
            goto L_0x03c4
        L_0x04d1:
            boolean r6 = r15.m17802y(r1, r4)
            if (r6 == 0) goto L_0x04df
            r6 = 0
            int r6 = p082e.p126k.p129c.p131j.C3970l.m17155j(r8, r6)
            goto L_0x03c4
        L_0x04df:
            int r4 = r4 + 3
            goto L_0x0008
        L_0x04e3:
            e.k.c.j.q1<?, ?> r2 = r0.f12206o
            int r1 = r15.m17799v(r2, r1)
            int r5 = r5 + r1
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.m17798u(java.lang.Object):int");
    }

    /* renamed from: v */
    private <UT, UB> int m17799v(C4006q1<UT, UB> q1Var, T t) {
        return q1Var.mo13919h(q1Var.mo13918g(t));
    }

    /* renamed from: w */
    private static <T> int m17800w(T t, long j) {
        return C4022u1.m17613A(t, j);
    }

    /* renamed from: x */
    private static boolean m17801x(int i) {
        return (i & 536870912) != 0;
    }

    /* renamed from: y */
    private boolean m17802y(T t, int i) {
        if (this.f12199h) {
            int i0 = m17780i0(i);
            long R = m17763R(i0);
            switch (m17779h0(i0)) {
                case 0:
                    if (C4022u1.m17659y(t, R) != 0.0d) {
                        return true;
                    }
                    return false;
                case 1:
                    if (C4022u1.m17660z(t, R) != 0.0f) {
                        return true;
                    }
                    return false;
                case 2:
                    if (C4022u1.m17615C(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 3:
                    if (C4022u1.m17615C(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 4:
                    if (C4022u1.m17613A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 5:
                    if (C4022u1.m17615C(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 6:
                    if (C4022u1.m17613A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 7:
                    return C4022u1.m17652r(t, R);
                case 8:
                    Object E = C4022u1.m17617E(t, R);
                    if (E instanceof String) {
                        return !((String) E).isEmpty();
                    }
                    if (E instanceof C3934i) {
                        return !C3934i.EMPTY.equals(E);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    if (C4022u1.m17617E(t, R) != null) {
                        return true;
                    }
                    return false;
                case 10:
                    return !C3934i.EMPTY.equals(C4022u1.m17617E(t, R));
                case 11:
                    if (C4022u1.m17613A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 12:
                    if (C4022u1.m17613A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 13:
                    if (C4022u1.m17613A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 14:
                    if (C4022u1.m17615C(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 15:
                    if (C4022u1.m17613A(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 16:
                    if (C4022u1.m17615C(t, R) != 0) {
                        return true;
                    }
                    return false;
                case 17:
                    if (C4022u1.m17617E(t, R) != null) {
                        return true;
                    }
                    return false;
                default:
                    throw new IllegalArgumentException();
            }
        } else {
            int Y = m17770Y(i);
            if ((C4022u1.m17613A(t, (long) (Y & 1048575)) & (1 << (Y >>> 20))) != 0) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: z */
    private boolean m17803z(T t, int i, int i2, int i3) {
        if (this.f12199h) {
            return m17802y(t, i);
        }
        return (i2 & i3) != 0;
    }

    /* renamed from: a */
    public void mo13704a(T t, T t2) {
        Objects.requireNonNull(t2);
        for (int i = 0; i < this.f12192a.length; i += 3) {
            m17758M(t, t2, i);
        }
        if (!this.f12199h) {
            C3978l1.m17300G(this.f12206o, t, t2);
            if (this.f12197f) {
                C3978l1.m17298E(this.f12207p, t, t2);
            }
        }
    }

    /* renamed from: b */
    public void mo13705b(T t, C3933h1 h1Var, C4003q qVar) throws IOException {
        Objects.requireNonNull(qVar);
        m17754I(this.f12206o, this.f12207p, t, h1Var, qVar);
    }

    /* renamed from: c */
    public void mo13706c(T t) {
        int i;
        int i2 = this.f12202k;
        while (true) {
            i = this.f12203l;
            if (i2 >= i) {
                break;
            }
            long R = m17763R(m17780i0(this.f12201j[i2]));
            Object E = C4022u1.m17617E(t, R);
            if (E != null) {
                C4022u1.m17632T(t, R, this.f12208q.mo13896b(E));
            }
            i2++;
        }
        int length = this.f12201j.length;
        while (i < length) {
            this.f12205n.mo13623c(t, (long) this.f12201j[i]);
            i++;
        }
        this.f12206o.mo13921j(t);
        if (this.f12197f) {
            this.f12207p.mo13937f(t);
        }
    }

    /* renamed from: d */
    public final boolean mo13707d(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f12202k; i4++) {
            int i5 = this.f12201j[i4];
            int Q = m17762Q(i5);
            int i0 = m17780i0(i5);
            if (!this.f12199h) {
                int i6 = this.f12192a[i5 + 2];
                int i7 = 1048575 & i6;
                i = 1 << (i6 >>> 20);
                if (i7 != i2) {
                    i3 = f12191s.getInt(t, (long) i7);
                    i2 = i7;
                }
            } else {
                i = 0;
            }
            if (m17751F(i0) && !m17803z(t, i5, i3, i)) {
                return false;
            }
            int h0 = m17779h0(i0);
            if (h0 != 9 && h0 != 17) {
                if (h0 != 27) {
                    if (h0 == 60 || h0 == 68) {
                        if (m17750E(t, Q, i5) && !m17746A(t, i0, m17796s(i5))) {
                            return false;
                        }
                    } else if (h0 != 49) {
                        if (h0 == 50 && !m17748C(t, i0, i5)) {
                            return false;
                        }
                    }
                }
                if (!m17747B(t, i0, i5)) {
                    return false;
                }
            } else if (m17803z(t, i5, i3, i) && !m17746A(t, i0, m17796s(i5))) {
                return false;
            }
        }
        return !this.f12197f || this.f12207p.mo13934c(t).mo14034p();
    }

    /* renamed from: e */
    public void mo13708e(T t, C4052x1 x1Var) throws IOException {
        if (x1Var.mo13805i() == C4052x1.C4053a.DESCENDING) {
            m17786l0(t, x1Var);
        } else if (this.f12199h) {
            m17784k0(t, x1Var);
        } else {
            m17782j0(t, x1Var);
        }
    }

    /* renamed from: f */
    public boolean mo13709f(T t, T t2) {
        int length = this.f12192a.length;
        for (int i = 0; i < length; i += 3) {
            if (!m17787m(t, t2, i)) {
                return false;
            }
        }
        if (!this.f12206o.mo13918g(t).equals(this.f12206o.mo13918g(t2))) {
            return false;
        }
        if (this.f12197f) {
            return this.f12207p.mo13934c(t).equals(this.f12207p.mo13934c(t2));
        }
        return true;
    }

    /* renamed from: g */
    public int mo13710g(T t) {
        return this.f12199h ? m17798u(t) : m17797t(t);
    }

    /* renamed from: h */
    public T mo13711h() {
        return this.f12204m.mo14084a(this.f12196e);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01c1, code lost:
        r2 = (r2 * 53) + r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0225, code lost:
        r2 = r2 + r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0226, code lost:
        r1 = r1 + 3;
     */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int mo13712i(T r9) {
        /*
            r8 = this;
            int[] r0 = r8.f12192a
            int r0 = r0.length
            r1 = 0
            r2 = 0
        L_0x0005:
            if (r1 >= r0) goto L_0x022a
            int r3 = r8.m17780i0(r1)
            int r4 = r8.m17762Q(r1)
            long r5 = m17763R(r3)
            int r3 = m17779h0(r3)
            r7 = 37
            switch(r3) {
                case 0: goto L_0x0217;
                case 1: goto L_0x020c;
                case 2: goto L_0x0201;
                case 3: goto L_0x01f6;
                case 4: goto L_0x01ef;
                case 5: goto L_0x01e4;
                case 6: goto L_0x01dd;
                case 7: goto L_0x01d2;
                case 8: goto L_0x01c5;
                case 9: goto L_0x01b7;
                case 10: goto L_0x01ab;
                case 11: goto L_0x01a3;
                case 12: goto L_0x019b;
                case 13: goto L_0x0193;
                case 14: goto L_0x0187;
                case 15: goto L_0x017f;
                case 16: goto L_0x0173;
                case 17: goto L_0x0168;
                case 18: goto L_0x015c;
                case 19: goto L_0x015c;
                case 20: goto L_0x015c;
                case 21: goto L_0x015c;
                case 22: goto L_0x015c;
                case 23: goto L_0x015c;
                case 24: goto L_0x015c;
                case 25: goto L_0x015c;
                case 26: goto L_0x015c;
                case 27: goto L_0x015c;
                case 28: goto L_0x015c;
                case 29: goto L_0x015c;
                case 30: goto L_0x015c;
                case 31: goto L_0x015c;
                case 32: goto L_0x015c;
                case 33: goto L_0x015c;
                case 34: goto L_0x015c;
                case 35: goto L_0x015c;
                case 36: goto L_0x015c;
                case 37: goto L_0x015c;
                case 38: goto L_0x015c;
                case 39: goto L_0x015c;
                case 40: goto L_0x015c;
                case 41: goto L_0x015c;
                case 42: goto L_0x015c;
                case 43: goto L_0x015c;
                case 44: goto L_0x015c;
                case 45: goto L_0x015c;
                case 46: goto L_0x015c;
                case 47: goto L_0x015c;
                case 48: goto L_0x015c;
                case 49: goto L_0x015c;
                case 50: goto L_0x0150;
                case 51: goto L_0x013a;
                case 52: goto L_0x0128;
                case 53: goto L_0x0116;
                case 54: goto L_0x0104;
                case 55: goto L_0x00f6;
                case 56: goto L_0x00e4;
                case 57: goto L_0x00d6;
                case 58: goto L_0x00c4;
                case 59: goto L_0x00b0;
                case 60: goto L_0x009e;
                case 61: goto L_0x008c;
                case 62: goto L_0x007e;
                case 63: goto L_0x0070;
                case 64: goto L_0x0062;
                case 65: goto L_0x0050;
                case 66: goto L_0x0042;
                case 67: goto L_0x0030;
                case 68: goto L_0x001e;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x0226
        L_0x001e:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0030:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m17768W(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0042:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m17767V(r9, r5)
            goto L_0x0225
        L_0x0050:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m17768W(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0062:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m17767V(r9, r5)
            goto L_0x0225
        L_0x0070:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m17767V(r9, r5)
            goto L_0x0225
        L_0x007e:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m17767V(r9, r5)
            goto L_0x0225
        L_0x008c:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x009e:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            int r2 = r2 * 53
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00b0:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x00c4:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            boolean r3 = m17764S(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16647c(r3)
            goto L_0x0225
        L_0x00d6:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m17767V(r9, r5)
            goto L_0x0225
        L_0x00e4:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m17768W(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x00f6:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            int r3 = m17767V(r9, r5)
            goto L_0x0225
        L_0x0104:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m17768W(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0116:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            long r3 = m17768W(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0128:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            float r3 = m17766U(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x013a:
            boolean r3 = r8.m17750E(r9, r4, r1)
            if (r3 == 0) goto L_0x0226
            int r2 = r2 * 53
            double r3 = m17765T(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0150:
            int r2 = r2 * 53
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x015c:
            int r2 = r2 * 53
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x0168:
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
            goto L_0x01c1
        L_0x0173:
            int r2 = r2 * 53
            long r3 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x017f:
            int r2 = r2 * 53
            int r3 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r9, r5)
            goto L_0x0225
        L_0x0187:
            int r2 = r2 * 53
            long r3 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0193:
            int r2 = r2 * 53
            int r3 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r9, r5)
            goto L_0x0225
        L_0x019b:
            int r2 = r2 * 53
            int r3 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r9, r5)
            goto L_0x0225
        L_0x01a3:
            int r2 = r2 * 53
            int r3 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r9, r5)
            goto L_0x0225
        L_0x01ab:
            int r2 = r2 * 53
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01b7:
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            if (r3 == 0) goto L_0x01c1
            int r7 = r3.hashCode()
        L_0x01c1:
            int r2 = r2 * 53
            int r2 = r2 + r7
            goto L_0x0226
        L_0x01c5:
            int r2 = r2 * 53
            java.lang.Object r3 = p082e.p126k.p129c.p131j.C4022u1.m17617E(r9, r5)
            java.lang.String r3 = (java.lang.String) r3
            int r3 = r3.hashCode()
            goto L_0x0225
        L_0x01d2:
            int r2 = r2 * 53
            boolean r3 = p082e.p126k.p129c.p131j.C4022u1.m17652r(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16647c(r3)
            goto L_0x0225
        L_0x01dd:
            int r2 = r2 * 53
            int r3 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r9, r5)
            goto L_0x0225
        L_0x01e4:
            int r2 = r2 * 53
            long r3 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x01ef:
            int r2 = r2 * 53
            int r3 = p082e.p126k.p129c.p131j.C4022u1.m17613A(r9, r5)
            goto L_0x0225
        L_0x01f6:
            int r2 = r2 * 53
            long r3 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x0201:
            int r2 = r2 * 53
            long r3 = p082e.p126k.p129c.p131j.C4022u1.m17615C(r9, r5)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
            goto L_0x0225
        L_0x020c:
            int r2 = r2 * 53
            float r3 = p082e.p126k.p129c.p131j.C4022u1.m17660z(r9, r5)
            int r3 = java.lang.Float.floatToIntBits(r3)
            goto L_0x0225
        L_0x0217:
            int r2 = r2 * 53
            double r3 = p082e.p126k.p129c.p131j.C4022u1.m17659y(r9, r5)
            long r3 = java.lang.Double.doubleToLongBits(r3)
            int r3 = p082e.p126k.p129c.p131j.C3899b0.m16650f(r3)
        L_0x0225:
            int r2 = r2 + r3
        L_0x0226:
            int r1 = r1 + 3
            goto L_0x0005
        L_0x022a:
            int r2 = r2 * 53
            e.k.c.j.q1<?, ?> r0 = r8.f12206o
            java.lang.Object r0 = r0.mo13918g(r9)
            int r0 = r0.hashCode()
            int r2 = r2 + r0
            boolean r0 = r8.f12197f
            if (r0 == 0) goto L_0x0248
            int r2 = r2 * 53
            e.k.c.j.r<?> r0 = r8.f12207p
            e.k.c.j.v r9 = r0.mo13934c(r9)
            int r9 = r9.hashCode()
            int r2 = r2 + r9
        L_0x0248:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4031v0.mo13712i(java.lang.Object):int");
    }
}
