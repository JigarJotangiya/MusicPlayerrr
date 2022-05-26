package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jr0 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    final /* synthetic */ JsResult f18569g;

    jr0(JsResult jsResult) {
        this.f18569g = jsResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f18569g.confirm();
    }
}
