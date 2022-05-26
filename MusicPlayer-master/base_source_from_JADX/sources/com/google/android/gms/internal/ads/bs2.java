package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bs2 {

    /* renamed from: a */
    private final long f14688a;

    /* renamed from: b */
    private final as2 f14689b = new as2();

    /* renamed from: c */
    private long f14690c;

    /* renamed from: d */
    private int f14691d = 0;

    /* renamed from: e */
    private int f14692e = 0;

    /* renamed from: f */
    private int f14693f = 0;

    public bs2() {
        long a = C2971s.m13198a().mo11988a();
        this.f14688a = a;
        this.f14690c = a;
    }

    /* renamed from: a */
    public final int mo16374a() {
        return this.f14691d;
    }

    /* renamed from: b */
    public final long mo16375b() {
        return this.f14688a;
    }

    /* renamed from: c */
    public final long mo16376c() {
        return this.f14690c;
    }

    /* renamed from: d */
    public final as2 mo16377d() {
        as2 a = this.f14689b.clone();
        as2 as2 = this.f14689b;
        as2.f14059g = false;
        as2.f14060h = 0;
        return a;
    }

    /* renamed from: e */
    public final String mo16378e() {
        return "Created: " + this.f14688a + " Last accessed: " + this.f14690c + " Accesses: " + this.f14691d + "\nEntries retrieved: Valid: " + this.f14692e + " Stale: " + this.f14693f;
    }

    /* renamed from: f */
    public final void mo16379f() {
        this.f14690c = C2971s.m13198a().mo11988a();
        this.f14691d++;
    }

    /* renamed from: g */
    public final void mo16380g() {
        this.f14693f++;
        this.f14689b.f14060h++;
    }

    /* renamed from: h */
    public final void mo16381h() {
        this.f14692e++;
        this.f14689b.f14059g = true;
    }
}
