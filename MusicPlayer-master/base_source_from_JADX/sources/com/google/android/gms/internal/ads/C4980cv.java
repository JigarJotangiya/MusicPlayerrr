package com.google.android.gms.internal.ads;

import java.util.Random;

/* renamed from: com.google.android.gms.internal.ads.cv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4980cv {

    /* renamed from: f */
    private static final C4980cv f15160f = new C4980cv();

    /* renamed from: a */
    private final nl0 f15161a;

    /* renamed from: b */
    private final C4906av f15162b;

    /* renamed from: c */
    private final String f15163c;

    /* renamed from: d */
    private final zzcjf f15164d;

    /* renamed from: e */
    private final Random f15165e;

    protected C4980cv() {
        nl0 nl0 = new nl0();
        C4906av avVar = new C4906av(new C5831zt(), new C5756xt(), new C5132gy(), new o40(), new ji0(), new ue0(), new p40());
        String d = nl0.m27915d();
        zzcjf zzcjf = new zzcjf(0, 214106000, true, false, false);
        Random random = new Random();
        this.f15161a = nl0;
        this.f15162b = avVar;
        this.f15163c = d;
        this.f15164d = zzcjf;
        this.f15165e = random;
    }

    /* renamed from: a */
    public static C4906av m22122a() {
        return f15160f.f15162b;
    }

    /* renamed from: b */
    public static nl0 m22123b() {
        return f15160f.f15161a;
    }

    /* renamed from: c */
    public static zzcjf m22124c() {
        return f15160f.f15164d;
    }

    /* renamed from: d */
    public static String m22125d() {
        return f15160f.f15163c;
    }

    /* renamed from: e */
    public static Random m22126e() {
        return f15160f.f15165e;
    }
}
