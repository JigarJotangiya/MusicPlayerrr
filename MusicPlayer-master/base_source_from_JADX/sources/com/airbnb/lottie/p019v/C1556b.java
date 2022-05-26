package com.airbnb.lottie.p019v;

/* renamed from: com.airbnb.lottie.v.b */
/* compiled from: DocumentData */
public class C1556b {

    /* renamed from: a */
    public final String f5977a;

    /* renamed from: b */
    public final String f5978b;

    /* renamed from: c */
    public final float f5979c;

    /* renamed from: d */
    public final C1557a f5980d;

    /* renamed from: e */
    public final int f5981e;

    /* renamed from: f */
    public final float f5982f;

    /* renamed from: g */
    public final float f5983g;

    /* renamed from: h */
    public final int f5984h;

    /* renamed from: i */
    public final int f5985i;

    /* renamed from: j */
    public final float f5986j;

    /* renamed from: k */
    public final boolean f5987k;

    /* renamed from: com.airbnb.lottie.v.b$a */
    /* compiled from: DocumentData */
    public enum C1557a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C1556b(String str, String str2, float f, C1557a aVar, int i, float f2, float f3, int i2, int i3, float f4, boolean z) {
        this.f5977a = str;
        this.f5978b = str2;
        this.f5979c = f;
        this.f5980d = aVar;
        this.f5981e = i;
        this.f5982f = f2;
        this.f5983g = f3;
        this.f5984h = i2;
        this.f5985i = i3;
        this.f5986j = f4;
        this.f5987k = z;
    }

    public int hashCode() {
        int hashCode = (((((int) (((float) (((this.f5977a.hashCode() * 31) + this.f5978b.hashCode()) * 31)) + this.f5979c)) * 31) + this.f5980d.ordinal()) * 31) + this.f5981e;
        long floatToRawIntBits = (long) Float.floatToRawIntBits(this.f5982f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f5984h;
    }
}
