package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vg1 implements pa1 {

    /* renamed from: a */
    private final co1 f24760a = new co1();

    /* renamed from: b */
    private fr1 f24761b;

    /* renamed from: c */
    private String f24762c;

    /* renamed from: d */
    private int f24763d = 8000;

    /* renamed from: e */
    private int f24764e = 8000;

    /* renamed from: f */
    private boolean f24765f;

    /* renamed from: a */
    public final vg1 mo21495a(boolean z) {
        this.f24765f = true;
        return this;
    }

    /* renamed from: b */
    public final vg1 mo21496b(int i) {
        this.f24763d = i;
        return this;
    }

    /* renamed from: c */
    public final vg1 mo21497c(int i) {
        this.f24764e = i;
        return this;
    }

    /* renamed from: d */
    public final vg1 mo21498d(fr1 fr1) {
        this.f24761b = fr1;
        return this;
    }

    /* renamed from: e */
    public final vg1 mo21499e(String str) {
        this.f24762c = str;
        return this;
    }

    /* renamed from: f */
    public final xi1 zza() {
        xi1 xi1 = new xi1(this.f24762c, this.f24763d, this.f24764e, this.f24765f, this.f24760a, (t13) null, false, (wh1) null);
        fr1 fr1 = this.f24761b;
        if (fr1 != null) {
            xi1.mo19648l(fr1);
        }
        return xi1;
    }
}
