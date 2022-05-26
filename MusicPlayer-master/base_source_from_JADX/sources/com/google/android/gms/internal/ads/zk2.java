package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zk2 implements la2<x11> {

    /* renamed from: a */
    final /* synthetic */ al2 f26810a;

    zk2(al2 al2) {
        this.f26810a = al2;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo16152a(Object obj) {
        x11 x11 = (x11) obj;
        synchronized (this.f26810a) {
            x11 x112 = this.f26810a.f13972o;
            if (x112 != null) {
                x112.mo17837a();
            }
            al2 al2 = this.f26810a;
            al2.f13972o = x11;
            x11.mo21952i(al2);
            sk2 e7 = this.f26810a.f13969l;
            al2 al22 = this.f26810a;
            e7.mo20864k(new y11(x11, al22, al22.f13969l));
            x11.mo17838b();
        }
    }

    public final void zza() {
        synchronized (this.f26810a) {
            this.f26810a.f13972o = null;
        }
    }
}
