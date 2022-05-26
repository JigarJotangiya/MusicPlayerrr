package com.airbnb.lottie.p019v;

import com.airbnb.lottie.p019v.p021k.C1596o;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.d */
/* compiled from: FontCharacter */
public class C1559d {

    /* renamed from: a */
    private final List<C1596o> f5993a;

    /* renamed from: b */
    private final char f5994b;

    /* renamed from: c */
    private final double f5995c;

    /* renamed from: d */
    private final String f5996d;

    /* renamed from: e */
    private final String f5997e;

    public C1559d(List<C1596o> list, char c, double d, double d2, String str, String str2) {
        this.f5993a = list;
        this.f5994b = c;
        this.f5995c = d2;
        this.f5996d = str;
        this.f5997e = str2;
    }

    /* renamed from: c */
    public static int m7979c(char c, String str, String str2) {
        return ((((0 + c) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: a */
    public List<C1596o> mo7227a() {
        return this.f5993a;
    }

    /* renamed from: b */
    public double mo7228b() {
        return this.f5995c;
    }

    public int hashCode() {
        return m7979c(this.f5994b, this.f5997e, this.f5996d);
    }
}
