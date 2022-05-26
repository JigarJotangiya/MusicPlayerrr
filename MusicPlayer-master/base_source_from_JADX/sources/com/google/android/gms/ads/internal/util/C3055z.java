package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.C2971s;

/* renamed from: com.google.android.gms.ads.internal.util.z */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3055z implements DialogInterface.OnClickListener {

    /* renamed from: g */
    final /* synthetic */ C2973a0 f10134g;

    C3055z(C2973a0 a0Var) {
        this.f10134g = a0Var;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C2971s.m13214q();
        C2979b2.m13277y(this.f10134g.f9968g, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
