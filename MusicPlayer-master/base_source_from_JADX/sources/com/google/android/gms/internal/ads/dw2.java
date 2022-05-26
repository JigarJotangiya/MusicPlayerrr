package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dw2 {

    /* renamed from: a */
    private final String f15764a;

    /* renamed from: b */
    private final String f15765b;

    private dw2(String str, String str2) {
        this.f15764a = str;
        this.f15765b = str2;
    }

    /* renamed from: a */
    public static dw2 m22714a(String str, String str2) {
        dx2.m22728a(str, "Name is null or empty");
        dx2.m22728a(str2, "Version is null or empty");
        return new dw2(str, str2);
    }

    /* renamed from: b */
    public final String mo17025b() {
        return this.f15764a;
    }

    /* renamed from: c */
    public final String mo17026c() {
        return this.f15765b;
    }
}
