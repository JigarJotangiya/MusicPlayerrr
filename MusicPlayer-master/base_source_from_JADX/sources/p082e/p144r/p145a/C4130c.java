package p082e.p144r.p145a;

/* renamed from: e.r.a.c */
/* compiled from: Target */
public final class C4130c {

    /* renamed from: e */
    public static final C4130c f12442e;

    /* renamed from: f */
    public static final C4130c f12443f;

    /* renamed from: g */
    public static final C4130c f12444g;

    /* renamed from: h */
    public static final C4130c f12445h;

    /* renamed from: i */
    public static final C4130c f12446i;

    /* renamed from: j */
    public static final C4130c f12447j;

    /* renamed from: a */
    final float[] f12448a;

    /* renamed from: b */
    final float[] f12449b;

    /* renamed from: c */
    final float[] f12450c = new float[3];

    /* renamed from: d */
    boolean f12451d = true;

    static {
        C4130c cVar = new C4130c();
        f12442e = cVar;
        m18261m(cVar);
        m18264p(cVar);
        C4130c cVar2 = new C4130c();
        f12443f = cVar2;
        m18263o(cVar2);
        m18264p(cVar2);
        C4130c cVar3 = new C4130c();
        f12444g = cVar3;
        m18260l(cVar3);
        m18264p(cVar3);
        C4130c cVar4 = new C4130c();
        f12445h = cVar4;
        m18261m(cVar4);
        m18262n(cVar4);
        C4130c cVar5 = new C4130c();
        f12446i = cVar5;
        m18263o(cVar5);
        m18262n(cVar5);
        C4130c cVar6 = new C4130c();
        f12447j = cVar6;
        m18260l(cVar6);
        m18262n(cVar6);
    }

    C4130c() {
        float[] fArr = new float[3];
        this.f12448a = fArr;
        float[] fArr2 = new float[3];
        this.f12449b = fArr2;
        m18266r(fArr);
        m18266r(fArr2);
        m18265q();
    }

    /* renamed from: l */
    private static void m18260l(C4130c cVar) {
        float[] fArr = cVar.f12449b;
        fArr[1] = 0.26f;
        fArr[2] = 0.45f;
    }

    /* renamed from: m */
    private static void m18261m(C4130c cVar) {
        float[] fArr = cVar.f12449b;
        fArr[0] = 0.55f;
        fArr[1] = 0.74f;
    }

    /* renamed from: n */
    private static void m18262n(C4130c cVar) {
        float[] fArr = cVar.f12448a;
        fArr[1] = 0.3f;
        fArr[2] = 0.4f;
    }

    /* renamed from: o */
    private static void m18263o(C4130c cVar) {
        float[] fArr = cVar.f12449b;
        fArr[0] = 0.3f;
        fArr[1] = 0.5f;
        fArr[2] = 0.7f;
    }

    /* renamed from: p */
    private static void m18264p(C4130c cVar) {
        float[] fArr = cVar.f12448a;
        fArr[0] = 0.35f;
        fArr[1] = 1.0f;
    }

    /* renamed from: q */
    private void m18265q() {
        float[] fArr = this.f12450c;
        fArr[0] = 0.24f;
        fArr[1] = 0.52f;
        fArr[2] = 0.24f;
    }

    /* renamed from: r */
    private static void m18266r(float[] fArr) {
        fArr[0] = 0.0f;
        fArr[1] = 0.5f;
        fArr[2] = 1.0f;
    }

    /* renamed from: a */
    public float mo14240a() {
        return this.f12450c[1];
    }

    /* renamed from: b */
    public float mo14241b() {
        return this.f12449b[2];
    }

    /* renamed from: c */
    public float mo14242c() {
        return this.f12448a[2];
    }

    /* renamed from: d */
    public float mo14243d() {
        return this.f12449b[0];
    }

    /* renamed from: e */
    public float mo14244e() {
        return this.f12448a[0];
    }

    /* renamed from: f */
    public float mo14245f() {
        return this.f12450c[2];
    }

    /* renamed from: g */
    public float mo14246g() {
        return this.f12450c[0];
    }

    /* renamed from: h */
    public float mo14247h() {
        return this.f12449b[1];
    }

    /* renamed from: i */
    public float mo14248i() {
        return this.f12448a[1];
    }

    /* renamed from: j */
    public boolean mo14249j() {
        return this.f12451d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo14250k() {
        float f = 0.0f;
        for (float f2 : this.f12450c) {
            if (f2 > 0.0f) {
                f += f2;
            }
        }
        if (f != 0.0f) {
            int length = this.f12450c.length;
            for (int i = 0; i < length; i++) {
                float[] fArr = this.f12450c;
                if (fArr[i] > 0.0f) {
                    fArr[i] = fArr[i] / f;
                }
            }
        }
    }
}
