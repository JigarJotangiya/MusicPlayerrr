package com.google.android.gms.internal.ads;

import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.c4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4953c4 {

    /* renamed from: a */
    private final String f14815a;

    /* renamed from: b */
    private final int f14816b;

    /* renamed from: c */
    private final int f14817c;

    /* renamed from: d */
    private int f14818d;

    /* renamed from: e */
    private String f14819e;

    public C4953c4(int i, int i2, int i3) {
        String str;
        if (i != Integer.MIN_VALUE) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(i);
            sb.append("/");
            str = sb.toString();
        } else {
            str = BuildConfig.FLAVOR;
        }
        this.f14815a = str;
        this.f14816b = i2;
        this.f14817c = i3;
        this.f14818d = Integer.MIN_VALUE;
        this.f14819e = BuildConfig.FLAVOR;
    }

    /* renamed from: d */
    private final void m21657d() {
        if (this.f14818d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    /* renamed from: a */
    public final int mo16481a() {
        m21657d();
        return this.f14818d;
    }

    /* renamed from: b */
    public final String mo16482b() {
        m21657d();
        return this.f14819e;
    }

    /* renamed from: c */
    public final void mo16483c() {
        int i = this.f14818d;
        int i2 = i == Integer.MIN_VALUE ? this.f14816b : i + this.f14817c;
        this.f14818d = i2;
        String str = this.f14815a;
        StringBuilder sb = new StringBuilder(str.length() + 11);
        sb.append(str);
        sb.append(i2);
        this.f14819e = sb.toString();
    }
}
