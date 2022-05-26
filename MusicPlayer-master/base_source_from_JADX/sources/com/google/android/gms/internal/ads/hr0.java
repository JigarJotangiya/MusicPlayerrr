package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class hr0 implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    final /* synthetic */ JsResult f17747g;

    hr0(JsResult jsResult) {
        this.f17747g = jsResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f17747g.cancel();
    }
}
