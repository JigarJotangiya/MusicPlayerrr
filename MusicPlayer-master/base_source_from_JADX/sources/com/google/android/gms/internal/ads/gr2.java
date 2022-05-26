package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class gr2 {

    /* renamed from: a */
    private final fr2 f17234a = new fr2();

    /* renamed from: b */
    private int f17235b;

    /* renamed from: c */
    private int f17236c;

    /* renamed from: d */
    private int f17237d;

    /* renamed from: e */
    private int f17238e;

    /* renamed from: f */
    private int f17239f;

    gr2() {
    }

    /* renamed from: a */
    public final fr2 mo18007a() {
        fr2 a = this.f17234a.clone();
        fr2 fr2 = this.f17234a;
        fr2.f16741g = false;
        fr2.f16742h = false;
        return a;
    }

    /* renamed from: b */
    public final String mo18008b() {
        return "\n\tPool does not exist: " + this.f17237d + "\n\tNew pools created: " + this.f17235b + "\n\tPools removed: " + this.f17236c + "\n\tEntries added: " + this.f17239f + "\n\tNo entries retrieved: " + this.f17238e + "\n";
    }

    /* renamed from: c */
    public final void mo18009c() {
        this.f17239f++;
    }

    /* renamed from: d */
    public final void mo18010d() {
        this.f17235b++;
        this.f17234a.f16741g = true;
    }

    /* renamed from: e */
    public final void mo18011e() {
        this.f17238e++;
    }

    /* renamed from: f */
    public final void mo18012f() {
        this.f17237d++;
    }

    /* renamed from: g */
    public final void mo18013g() {
        this.f17236c++;
        this.f17234a.f16742h = true;
    }
}
