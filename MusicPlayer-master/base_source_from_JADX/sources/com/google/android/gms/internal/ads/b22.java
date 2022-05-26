package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import com.google.android.gms.ads.internal.overlay.C2955n;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class b22 implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    public final /* synthetic */ C2955n f14277g;

    public /* synthetic */ b22(C2955n nVar) {
        this.f14277g = nVar;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        C2955n nVar = this.f14277g;
        if (nVar != null) {
            nVar.mo10874a();
        }
    }
}
