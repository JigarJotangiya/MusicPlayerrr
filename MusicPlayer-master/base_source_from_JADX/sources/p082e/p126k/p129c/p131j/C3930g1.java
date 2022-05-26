package p082e.p126k.p129c.p131j;

/* renamed from: e.k.c.j.g1 */
/* compiled from: RawMessageInfo */
final class C3930g1 implements C4005q0 {

    /* renamed from: a */
    private final C4012s0 f12017a;

    /* renamed from: b */
    private final String f12018b;

    /* renamed from: c */
    private final Object[] f12019c;

    /* renamed from: d */
    private final int f12020d;

    C3930g1(C4012s0 s0Var, String str, Object[] objArr) {
        this.f12017a = s0Var;
        this.f12018b = str;
        this.f12019c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f12020d = charAt;
            return;
        }
        char c = charAt & 8191;
        int i = 13;
        int i2 = 1;
        while (true) {
            int i3 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                c |= (charAt2 & 8191) << i;
                i += 13;
                i2 = i3;
            } else {
                this.f12020d = c | (charAt2 << i);
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo13581a() {
        return (this.f12020d & 2) == 2;
    }

    /* renamed from: b */
    public C4012s0 mo13582b() {
        return this.f12017a;
    }

    /* renamed from: c */
    public C3916d1 mo13583c() {
        return (this.f12020d & 1) == 1 ? C3916d1.PROTO2 : C3916d1.PROTO3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Object[] mo13584d() {
        return this.f12019c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public String mo13585e() {
        return this.f12018b;
    }
}
