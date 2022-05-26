package com.google.android.gms.internal.ads;

import android.content.Context;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uu1 implements gu1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f24442a;

    /* renamed from: b */
    private final ea2 f24443b;

    uu1(long j, Context context, nu1 nu1, mt0 mt0, String str) {
        this.f24442a = j;
        en2 A = mt0.mo19506A();
        A.mo17222Q(context);
        A.mo17223a(new zzbfi());
        A.mo17225p(str);
        ea2 zza = A.mo17224f().zza();
        this.f24443b = zza;
        zza.mo10952k5(new tu1(this, nu1));
    }

    /* renamed from: a */
    public final void mo18026a(zzbfd zzbfd) {
        this.f24443b.mo10934O5(zzbfd);
    }

    /* renamed from: b */
    public final void mo18027b() {
        this.f24443b.mo10962x2(C4865b.m20503f2(null));
    }

    public final void zza() {
        this.f24443b.mo10926G();
    }
}
