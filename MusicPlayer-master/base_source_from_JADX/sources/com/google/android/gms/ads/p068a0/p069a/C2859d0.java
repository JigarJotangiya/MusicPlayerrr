package com.google.android.gms.ads.p068a0.p069a;

import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.nf0;
import com.google.android.gms.internal.ads.o83;
import com.google.android.gms.internal.ads.ul0;
import java.util.Collections;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.a0.a.d0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2859d0 implements o83<Uri> {

    /* renamed from: a */
    final /* synthetic */ nf0 f9686a;

    /* renamed from: b */
    final /* synthetic */ C2863f0 f9687b;

    C2859d0(C2863f0 f0Var, nf0 nf0) {
        this.f9687b = f0Var;
        this.f9686a = nf0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        Uri uri = (Uri) obj;
        try {
            this.f9687b.f9698A.getAndIncrement();
            this.f9686a.mo19163G1(Collections.singletonList(uri));
            if (this.f9687b.f9717v) {
                C2863f0 f0Var = this.f9687b;
                this.f9687b.f9715t.mo19285b(C2863f0.m12871p7(uri, f0Var.f9701D, "1").toString());
            }
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        try {
            nf0 nf0 = this.f9686a;
            String valueOf = String.valueOf(th.getMessage());
            nf0.mo19164q(valueOf.length() != 0 ? "Internal error: ".concat(valueOf) : new String("Internal error: "));
        } catch (RemoteException e) {
            ul0.m31860e(BuildConfig.FLAVOR, e);
        }
    }
}
