package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i10 {

    /* renamed from: d */
    public static final i10 f17853d = new i10(1.0f, 1.0f);

    /* renamed from: a */
    public final float f17854a;

    /* renamed from: b */
    public final float f17855b;

    /* renamed from: c */
    private final int f17856c;

    static {
        h00 h00 = h00.f17470a;
    }

    public i10(float f, float f2) {
        boolean z = true;
        gs1.m24486d(f > 0.0f);
        gs1.m24486d(f2 <= 0.0f ? false : z);
        this.f17854a = f;
        this.f17855b = f2;
        this.f17856c = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo18252a(long j) {
        return j * ((long) this.f17856c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && i10.class == obj.getClass()) {
            i10 i10 = (i10) obj;
            return this.f17854a == i10.f17854a && this.f17855b == i10.f17855b;
        }
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f17854a) + 527) * 31) + Float.floatToRawIntBits(this.f17855b);
    }

    public final String toString() {
        return wy2.m33438d("PlaybackParameters(speed=%.2f, pitch=%.2f)", Float.valueOf(this.f17854a), Float.valueOf(this.f17855b));
    }
}
