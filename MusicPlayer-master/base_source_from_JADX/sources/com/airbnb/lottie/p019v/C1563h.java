package com.airbnb.lottie.p019v;

/* renamed from: com.airbnb.lottie.v.h */
/* compiled from: Marker */
public class C1563h {

    /* renamed from: d */
    private static String f6003d = "\r";

    /* renamed from: a */
    private final String f6004a;

    /* renamed from: b */
    public final float f6005b;

    /* renamed from: c */
    public final float f6006c;

    public C1563h(String str, float f, float f2) {
        this.f6004a = str;
        this.f6006c = f2;
        this.f6005b = f;
    }

    /* renamed from: a */
    public boolean mo7240a(String str) {
        if (this.f6004a.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f6004a.endsWith(f6003d)) {
            String str2 = this.f6004a;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
