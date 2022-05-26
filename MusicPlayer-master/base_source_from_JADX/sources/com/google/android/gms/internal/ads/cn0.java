package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cn0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f15037g;

    /* renamed from: h */
    final /* synthetic */ String f15038h;

    /* renamed from: i */
    final /* synthetic */ in0 f15039i;

    cn0(in0 in0, String str, String str2) {
        this.f15039i = in0;
        this.f15037g = str;
        this.f15038h = str2;
    }

    public final void run() {
        if (this.f15039i.f18116x != null) {
            this.f15039i.f18116x.mo18674a(this.f15037g, this.f15038h);
        }
    }
}
