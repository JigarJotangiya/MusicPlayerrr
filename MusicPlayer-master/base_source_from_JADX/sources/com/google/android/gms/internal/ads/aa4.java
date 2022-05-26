package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aa4 {

    /* renamed from: c */
    public static final aa4 f13831c = new aa4(0, 0);

    /* renamed from: a */
    public final long f13832a;

    /* renamed from: b */
    public final long f13833b;

    public aa4(long j, long j2) {
        this.f13832a = j;
        this.f13833b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && aa4.class == obj.getClass()) {
            aa4 aa4 = (aa4) obj;
            return this.f13832a == aa4.f13832a && this.f13833b == aa4.f13833b;
        }
    }

    public final int hashCode() {
        return (((int) this.f13832a) * 31) + ((int) this.f13833b);
    }

    public final String toString() {
        long j = this.f13832a;
        long j2 = this.f13833b;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
