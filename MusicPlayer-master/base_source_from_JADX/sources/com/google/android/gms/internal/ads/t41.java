package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class t41 implements o83<o41> {

    /* renamed from: a */
    final /* synthetic */ o83 f23742a;

    /* renamed from: b */
    final /* synthetic */ v41 f23743b;

    t41(v41 v41, o83 o83) {
        this.f23743b = v41;
        this.f23742a = o83;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        v41.m32146b(this.f23743b, ((o41) obj).f20896a, this.f23742a);
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        this.f23742a.mo10678b(th);
        hm0.f17712e.execute(new r41(this.f23743b));
    }
}
