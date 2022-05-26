package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class vr2 implements o83<Void> {

    /* renamed from: a */
    final /* synthetic */ yr2 f24911a;

    /* renamed from: b */
    final /* synthetic */ zr2 f24912b;

    vr2(zr2 zr2, yr2 yr2) {
        this.f24912b = zr2;
        this.f24911a = yr2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.f24912b) {
            this.f24912b.f26894e = null;
            this.f24912b.f26893d.addFirst(this.f24911a);
            if (this.f24912b.f26895f == 1) {
                this.f24912b.m34769h();
            }
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        synchronized (this.f24912b) {
            this.f24912b.f26894e = null;
        }
    }
}
