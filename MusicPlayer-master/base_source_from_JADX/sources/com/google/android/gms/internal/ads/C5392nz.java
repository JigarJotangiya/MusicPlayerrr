package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5392nz implements u10 {

    /* renamed from: a */
    final /* synthetic */ C5429oz f20769a;

    C5392nz(C5429oz ozVar) {
        this.f20769a = ozVar;
    }

    /* renamed from: a */
    public final String mo19865a(String str, String str2) {
        return this.f20769a.f21245k.getString(str, str2);
    }

    /* renamed from: b */
    public final Double mo19866b(String str, double d) {
        return Double.valueOf((double) this.f20769a.f21245k.getFloat(str, (float) d));
    }

    /* renamed from: c */
    public final Long mo19867c(String str, long j) {
        try {
            return Long.valueOf(this.f20769a.f21245k.getLong(str, j));
        } catch (ClassCastException unused) {
            return Long.valueOf((long) this.f20769a.f21245k.getInt(str, (int) j));
        }
    }

    /* renamed from: d */
    public final Boolean mo19868d(String str, boolean z) {
        return Boolean.valueOf(this.f20769a.f21245k.getBoolean(str, z));
    }
}
