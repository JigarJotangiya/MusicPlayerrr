package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.wp */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5715wp {

    /* renamed from: a */
    private final InputStream f25477a;

    /* renamed from: b */
    private final boolean f25478b;

    /* renamed from: c */
    private final boolean f25479c;

    /* renamed from: d */
    private final long f25480d;

    /* renamed from: e */
    private final boolean f25481e;

    private C5715wp(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        this.f25477a = inputStream;
        this.f25478b = z;
        this.f25479c = z2;
        this.f25480d = j;
        this.f25481e = z3;
    }

    /* renamed from: b */
    public static C5715wp m33250b(InputStream inputStream, boolean z, boolean z2, long j, boolean z3) {
        return new C5715wp(inputStream, z, z2, j, z3);
    }

    /* renamed from: a */
    public final long mo21863a() {
        return this.f25480d;
    }

    /* renamed from: c */
    public final InputStream mo21864c() {
        return this.f25477a;
    }

    /* renamed from: d */
    public final boolean mo21865d() {
        return this.f25478b;
    }

    /* renamed from: e */
    public final boolean mo21866e() {
        return this.f25481e;
    }

    /* renamed from: f */
    public final boolean mo21867f() {
        return this.f25479c;
    }
}
