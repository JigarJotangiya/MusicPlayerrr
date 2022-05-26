package p082e.p126k.p129c.p131j;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import p082e.p126k.p129c.p131j.C3976l0;
import p082e.p126k.p129c.p131j.C4052x1;

/* renamed from: e.k.c.j.m */
/* compiled from: CodedOutputStreamWriter */
final class C3979m implements C4052x1 {

    /* renamed from: a */
    private final C3970l f12115a;

    /* renamed from: e.k.c.j.m$a */
    /* compiled from: CodedOutputStreamWriter */
    static /* synthetic */ class C3980a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12116a;

        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21|22|23|24|26) */
        /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0054 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0060 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x006c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0084 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                e.k.c.j.w1$b[] r0 = p082e.p126k.p129c.p131j.C4042w1.C4044b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12116a = r0
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.BOOL     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x001d }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED32     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT32     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0033 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED32     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x003e }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT32     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0049 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT32     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0054 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.FIXED64     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0060 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.INT64     // Catch:{ NoSuchFieldError -> 0x0060 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0060 }
                r2 = 8
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0060 }
            L_0x0060:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x006c }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SFIXED64     // Catch:{ NoSuchFieldError -> 0x006c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x006c }
                r2 = 9
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x006c }
            L_0x006c:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0078 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.SINT64     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r2 = 10
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0084 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.UINT64     // Catch:{ NoSuchFieldError -> 0x0084 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0084 }
                r2 = 11
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0084 }
            L_0x0084:
                int[] r0 = f12116a     // Catch:{ NoSuchFieldError -> 0x0090 }
                e.k.c.j.w1$b r1 = p082e.p126k.p129c.p131j.C4042w1.C4044b.STRING     // Catch:{ NoSuchFieldError -> 0x0090 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0090 }
                r2 = 12
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0090 }
            L_0x0090:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3979m.C3980a.<clinit>():void");
        }
    }

    private C3979m(C3970l lVar) {
        C3899b0.m16646b(lVar, "output");
        C3970l lVar2 = lVar;
        this.f12115a = lVar2;
        lVar2.f12094a = this;
    }

    /* renamed from: P */
    public static C3979m m17351P(C3970l lVar) {
        C3979m mVar = lVar.f12094a;
        if (mVar != null) {
            return mVar;
        }
        return new C3979m(lVar);
    }

    /* renamed from: Q */
    private <V> void m17352Q(int i, boolean z, V v, C3976l0.C3977a<Boolean, V> aVar) throws IOException {
        this.f12115a.mo13740X0(i, 2);
        this.f12115a.mo13742Z0(C3976l0.m17289b(aVar, Boolean.valueOf(z), v));
        C3976l0.m17291e(this.f12115a, aVar, Boolean.valueOf(z), v);
    }

    /* renamed from: R */
    private <V> void m17353R(int i, C3976l0.C3977a<Integer, V> aVar, Map<Integer, V> map) throws IOException {
        int size = map.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (Integer intValue : map.keySet()) {
            iArr[i2] = intValue.intValue();
            i2++;
        }
        Arrays.sort(iArr);
        for (int i3 = 0; i3 < size; i3++) {
            int i4 = iArr[i3];
            V v = map.get(Integer.valueOf(i4));
            this.f12115a.mo13740X0(i, 2);
            this.f12115a.mo13742Z0(C3976l0.m17289b(aVar, Integer.valueOf(i4), v));
            C3976l0.m17291e(this.f12115a, aVar, Integer.valueOf(i4), v);
        }
    }

    /* renamed from: S */
    private <V> void m17354S(int i, C3976l0.C3977a<Long, V> aVar, Map<Long, V> map) throws IOException {
        int size = map.size();
        long[] jArr = new long[size];
        int i2 = 0;
        for (Long longValue : map.keySet()) {
            jArr[i2] = longValue.longValue();
            i2++;
        }
        Arrays.sort(jArr);
        for (int i3 = 0; i3 < size; i3++) {
            long j = jArr[i3];
            V v = map.get(Long.valueOf(j));
            this.f12115a.mo13740X0(i, 2);
            this.f12115a.mo13742Z0(C3976l0.m17289b(aVar, Long.valueOf(j), v));
            C3976l0.m17291e(this.f12115a, aVar, Long.valueOf(j), v);
        }
    }

    /* renamed from: T */
    private <K, V> void m17355T(int i, C3976l0.C3977a<K, V> aVar, Map<K, V> map) throws IOException {
        switch (C3980a.f12116a[aVar.f12107a.ordinal()]) {
            case 1:
                V v = map.get(Boolean.FALSE);
                if (v != null) {
                    m17352Q(i, false, v, aVar);
                }
                V v2 = map.get(Boolean.TRUE);
                if (v2 != null) {
                    m17352Q(i, true, v2, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m17353R(i, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m17354S(i, aVar, map);
                return;
            case 12:
                m17356U(i, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f12107a);
        }
    }

    /* renamed from: U */
    private <V> void m17356U(int i, C3976l0.C3977a<String, V> aVar, Map<String, V> map) throws IOException {
        int size = map.size();
        String[] strArr = new String[size];
        int i2 = 0;
        for (String str : map.keySet()) {
            strArr[i2] = str;
            i2++;
        }
        Arrays.sort(strArr);
        for (int i3 = 0; i3 < size; i3++) {
            String str2 = strArr[i3];
            V v = map.get(str2);
            this.f12115a.mo13740X0(i, 2);
            this.f12115a.mo13742Z0(C3976l0.m17289b(aVar, str2, v));
            C3976l0.m17291e(this.f12115a, aVar, str2, v);
        }
    }

    /* renamed from: V */
    private void m17357V(int i, Object obj) throws IOException {
        if (obj instanceof String) {
            this.f12115a.mo13738V0(i, (String) obj);
        } else {
            this.f12115a.mo13755p0(i, (C3934i) obj);
        }
    }

    /* renamed from: A */
    public void mo13782A(int i, List<Boolean> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17148f(list.get(i4).booleanValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13752m0(list.get(i2).booleanValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13751l0(i, list.get(i2).booleanValue());
            i2++;
        }
    }

    /* renamed from: B */
    public void mo13783B(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17141Y(list.get(i4).intValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13742Z0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13741Y0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: C */
    public void mo13784C(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17136T(list.get(i4).longValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13737U0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13736T0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: D */
    public void mo13785D(int i, long j) throws IOException {
        this.f12115a.mo13736T0(i, j);
    }

    /* renamed from: E */
    public void mo13786E(int i, float f) throws IOException {
        this.f12115a.mo13765z0(i, f);
    }

    /* renamed from: F */
    public void mo13787F(int i) throws IOException {
        this.f12115a.mo13740X0(i, 4);
    }

    /* renamed from: G */
    public void mo13788G(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17134R(list.get(i4).intValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13735S0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13734R0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: H */
    public void mo13789H(int i, int i2) throws IOException {
        this.f12115a.mo13759t0(i, i2);
    }

    /* renamed from: I */
    public void mo13790I(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17171z(list.get(i4).longValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13725I0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13724H0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: J */
    public void mo13791J(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17158m(list.get(i4).intValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13760u0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13759t0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: K */
    public void mo13792K(int i, List<Double> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17156k(list.get(i4).doubleValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13758s0(list.get(i2).doubleValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13757r0(i, list.get(i2).doubleValue());
            i2++;
        }
    }

    /* renamed from: L */
    public <K, V> void mo13793L(int i, C3976l0.C3977a<K, V> aVar, Map<K, V> map) throws IOException {
        if (this.f12115a.mo13748f0()) {
            m17355T(i, aVar, map);
            return;
        }
        for (Map.Entry next : map.entrySet()) {
            this.f12115a.mo13740X0(i, 2);
            this.f12115a.mo13742Z0(C3976l0.m17289b(aVar, next.getKey(), next.getValue()));
            C3976l0.m17291e(this.f12115a, aVar, next.getKey(), next.getValue());
        }
    }

    /* renamed from: M */
    public void mo13794M(int i, int i2) throws IOException {
        this.f12115a.mo13734R0(i, i2);
    }

    /* renamed from: N */
    public void mo13795N(int i, List<C3934i> list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.f12115a.mo13755p0(i, list.get(i2));
        }
    }

    /* renamed from: O */
    public void mo13796O(int i, Object obj, C3963j1 j1Var) throws IOException {
        this.f12115a.mo13719C0(i, (C4012s0) obj, j1Var);
    }

    /* renamed from: a */
    public void mo13797a(int i, List<Float> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17164s(list.get(i4).floatValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13717A0(list.get(i2).floatValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13765z0(i, list.get(i2).floatValue());
            i2++;
        }
    }

    /* renamed from: b */
    public void mo13798b(int i, int i2) throws IOException {
        this.f12115a.mo13741Y0(i, i2);
    }

    /* renamed from: c */
    public final void mo13799c(int i, Object obj) throws IOException {
        if (obj instanceof C3934i) {
            this.f12115a.mo13729M0(i, (C3934i) obj);
        } else {
            this.f12115a.mo13728L0(i, (C4012s0) obj);
        }
    }

    /* renamed from: d */
    public void mo13800d(int i, int i2) throws IOException {
        this.f12115a.mo13761v0(i, i2);
    }

    /* renamed from: e */
    public void mo13801e(int i, double d) throws IOException {
        this.f12115a.mo13757r0(i, d);
    }

    /* renamed from: f */
    public void mo13802f(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17132P(list.get(i4).longValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13733Q0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13732P0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: g */
    public void mo13803g(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17143a0(list.get(i4).longValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13744b1(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13743a1(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: h */
    public void mo13804h(int i, long j) throws IOException {
        this.f12115a.mo13763x0(i, j);
    }

    /* renamed from: i */
    public C4052x1.C4053a mo13805i() {
        return C4052x1.C4053a.ASCENDING;
    }

    /* renamed from: j */
    public void mo13806j(int i, List<?> list, C3963j1 j1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo13822z(i, list.get(i2), j1Var);
        }
    }

    /* renamed from: k */
    public void mo13807k(int i, List<String> list) throws IOException {
        int i2 = 0;
        if (list instanceof C3932h0) {
            C3932h0 h0Var = (C3932h0) list;
            while (i2 < list.size()) {
                m17357V(i, h0Var.mo13573q(i2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13738V0(i, list.get(i2));
            i2++;
        }
    }

    /* renamed from: l */
    public void mo13808l(int i, List<?> list, C3963j1 j1Var) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            mo13796O(i, list.get(i2), j1Var);
        }
    }

    /* renamed from: m */
    public void mo13809m(int i, String str) throws IOException {
        this.f12115a.mo13738V0(i, str);
    }

    /* renamed from: n */
    public void mo13810n(int i, long j) throws IOException {
        this.f12115a.mo13743a1(i, j);
    }

    /* renamed from: o */
    public void mo13811o(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17169x(list.get(i4).intValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13723G0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13722F0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: p */
    public void mo13812p(int i, long j) throws IOException {
        this.f12115a.mo13724H0(i, j);
    }

    /* renamed from: q */
    public void mo13813q(int i, boolean z) throws IOException {
        this.f12115a.mo13751l0(i, z);
    }

    /* renamed from: r */
    public void mo13814r(int i, int i2) throws IOException {
        this.f12115a.mo13730N0(i, i2);
    }

    /* renamed from: s */
    public void mo13815s(int i) throws IOException {
        this.f12115a.mo13740X0(i, 3);
    }

    /* renamed from: t */
    public void mo13816t(int i, int i2) throws IOException {
        this.f12115a.mo13722F0(i, i2);
    }

    /* renamed from: u */
    public void mo13817u(int i, List<Long> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17162q(list.get(i4).longValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13764y0(list.get(i2).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13763x0(i, list.get(i2).longValue());
            i2++;
        }
    }

    /* renamed from: v */
    public void mo13818v(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17130N(list.get(i4).intValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13731O0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13730N0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: w */
    public void mo13819w(int i, C3934i iVar) throws IOException {
        this.f12115a.mo13755p0(i, iVar);
    }

    /* renamed from: x */
    public void mo13820x(int i, long j) throws IOException {
        this.f12115a.mo13732P0(i, j);
    }

    /* renamed from: y */
    public void mo13821y(int i, List<Integer> list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.f12115a.mo13740X0(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += C3970l.m17160o(list.get(i4).intValue());
            }
            this.f12115a.mo13742Z0(i3);
            while (i2 < list.size()) {
                this.f12115a.mo13762w0(list.get(i2).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.f12115a.mo13761v0(i, list.get(i2).intValue());
            i2++;
        }
    }

    /* renamed from: z */
    public void mo13822z(int i, Object obj, C3963j1 j1Var) throws IOException {
        this.f12115a.mo13726J0(i, (C4012s0) obj, j1Var);
    }
}
