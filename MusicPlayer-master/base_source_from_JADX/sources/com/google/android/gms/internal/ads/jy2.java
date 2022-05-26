package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jy2 extends fy2 {

    /* renamed from: a */
    private final String f18678a;

    /* renamed from: b */
    private final boolean f18679b;

    /* renamed from: c */
    private final boolean f18680c;

    /* synthetic */ jy2(String str, boolean z, boolean z2, iy2 iy2) {
        this.f18678a = str;
        this.f18679b = z;
        this.f18680c = z2;
    }

    /* renamed from: b */
    public final String mo17769b() {
        return this.f18678a;
    }

    /* renamed from: c */
    public final boolean mo17770c() {
        return this.f18680c;
    }

    /* renamed from: d */
    public final boolean mo17771d() {
        return this.f18679b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fy2) {
            fy2 fy2 = (fy2) obj;
            return this.f18678a.equals(fy2.mo17769b()) && this.f18679b == fy2.mo17771d() && this.f18680c == fy2.mo17770c();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f18678a.hashCode() ^ 1000003) * 1000003) ^ (true != this.f18679b ? 1237 : 1231)) * 1000003;
        if (true == this.f18680c) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.f18678a;
        boolean z = this.f18679b;
        boolean z2 = this.f18680c;
        StringBuilder sb = new StringBuilder(str.length() + 99);
        sb.append("AdShield2Options{clientVersion=");
        sb.append(str);
        sb.append(", shouldGetAdvertisingId=");
        sb.append(z);
        sb.append(", isGooglePlayServicesAvailable=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
