package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mt3 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public boolean f20165a;

    /* renamed from: b */
    public fu3 f20166b;

    /* renamed from: c */
    public int f20167c;

    /* renamed from: d */
    public boolean f20168d;

    /* renamed from: e */
    public int f20169e;

    /* renamed from: f */
    public boolean f20170f;

    /* renamed from: g */
    public int f20171g;

    public mt3(fu3 fu3) {
        this.f20166b = fu3;
    }

    /* renamed from: a */
    public final void mo19543a(int i) {
        boolean z = true;
        if (true != (this.f20165a | i)) {
            z = false;
        }
        this.f20165a = z;
        this.f20167c += i;
    }

    /* renamed from: b */
    public final void mo19544b(int i) {
        this.f20165a = true;
        this.f20170f = true;
        this.f20171g = i;
    }

    /* renamed from: c */
    public final void mo19545c(fu3 fu3) {
        this.f20165a |= this.f20166b != fu3;
        this.f20166b = fu3;
    }

    /* renamed from: d */
    public final void mo19546d(int i) {
        boolean z = true;
        if (!this.f20168d || this.f20169e == 5) {
            this.f20165a = true;
            this.f20168d = true;
            this.f20169e = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        gs1.m24486d(z);
    }
}
