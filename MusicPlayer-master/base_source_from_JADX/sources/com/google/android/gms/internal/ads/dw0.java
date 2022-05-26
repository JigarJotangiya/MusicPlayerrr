package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dw0 implements hu1 {

    /* renamed from: a */
    private final mx0 f15759a;

    /* renamed from: b */
    private final jw0 f15760b;

    /* renamed from: c */
    private Long f15761c;

    /* renamed from: d */
    private String f15762d;

    /* synthetic */ dw0(mx0 mx0, jw0 jw0, bw0 bw0) {
        this.f15759a = mx0;
        this.f15760b = jw0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ hu1 mo17022a(long j) {
        this.f15761c = Long.valueOf(j);
        return this;
    }

    /* renamed from: b */
    public final ku1 mo17023b() {
        gs3.m24491c(this.f15761c, Long.class);
        gs3.m24491c(this.f15762d, String.class);
        return new fw0(this.f15759a, this.f15760b, this.f15761c, this.f15762d, (ew0) null);
    }

    /* renamed from: p */
    public final /* synthetic */ hu1 mo17024p(String str) {
        Objects.requireNonNull(str);
        this.f15762d = str;
        return this;
    }
}
