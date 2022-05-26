package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class sd0 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    final /* synthetic */ ud0 f23421g;

    sd0(ud0 ud0) {
        this.f23421g = ud0;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        Intent i2 = this.f23421g.mo21248i();
        C2971s.m13214q();
        C2979b2.m13269q(this.f23421g.f24297d, i2);
    }
}
