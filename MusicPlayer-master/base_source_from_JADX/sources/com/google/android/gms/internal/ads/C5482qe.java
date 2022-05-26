package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qe */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5482qe {

    /* renamed from: d */
    public static final C5482qe f21905d = new C5482qe(1.0f, 1.0f);

    /* renamed from: a */
    public final float f21906a;

    /* renamed from: b */
    public final float f21907b = 1.0f;

    /* renamed from: c */
    private final int f21908c;

    public C5482qe(float f, float f2) {
        this.f21906a = f;
        this.f21908c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo20431a(long j) {
        return j * ((long) this.f21908c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5482qe.class == obj.getClass() && this.f21906a == ((C5482qe) obj).f21906a;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f21906a) + 527) * 31) + Float.floatToRawIntBits(1.0f);
    }
}
