package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lu2 {

    /* renamed from: a */
    public final String f19530a;

    /* renamed from: b */
    public final String f19531b;

    public lu2(String str, String str2) {
        this.f19530a = str;
        this.f19531b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lu2)) {
            return false;
        }
        lu2 lu2 = (lu2) obj;
        return this.f19530a.equals(lu2.f19530a) && this.f19531b.equals(lu2.f19531b);
    }

    public final int hashCode() {
        String valueOf = String.valueOf(this.f19530a);
        String valueOf2 = String.valueOf(this.f19531b);
        return (valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf)).hashCode();
    }
}
