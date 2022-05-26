package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.mh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5337mh {

    /* renamed from: a */
    public final int f20035a;

    /* renamed from: b */
    public int f20036b;

    /* renamed from: c */
    public int f20037c;

    /* renamed from: d */
    public long f20038d;

    /* renamed from: e */
    private final boolean f20039e;

    /* renamed from: f */
    private final C5600tl f20040f;

    /* renamed from: g */
    private final C5600tl f20041g;

    /* renamed from: h */
    private int f20042h;

    /* renamed from: i */
    private int f20043i;

    public C5337mh(C5600tl tlVar, C5600tl tlVar2, boolean z) {
        this.f20041g = tlVar;
        this.f20040f = tlVar2;
        this.f20039e = z;
        tlVar2.mo21103v(12);
        this.f20035a = tlVar2.mo21090i();
        tlVar.mo21103v(12);
        this.f20043i = tlVar.mo21090i();
        C5304ll.m26777f(tlVar.mo21086e() != 1 ? false : true, "first_chunk must be 1");
        this.f20036b = -1;
    }

    /* renamed from: a */
    public final boolean mo19381a() {
        long j;
        int i = this.f20036b + 1;
        this.f20036b = i;
        if (i == this.f20035a) {
            return false;
        }
        if (this.f20039e) {
            j = this.f20040f.mo21095n();
        } else {
            j = this.f20040f.mo21094m();
        }
        this.f20038d = j;
        if (this.f20036b == this.f20042h) {
            this.f20037c = this.f20041g.mo21090i();
            this.f20041g.mo21104w(4);
            int i2 = -1;
            int i3 = this.f20043i - 1;
            this.f20043i = i3;
            if (i3 > 0) {
                i2 = -1 + this.f20041g.mo21090i();
            }
            this.f20042h = i2;
        }
        return true;
    }
}
