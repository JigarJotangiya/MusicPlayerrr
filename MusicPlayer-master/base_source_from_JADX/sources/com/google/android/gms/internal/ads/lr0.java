package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lr0 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    final /* synthetic */ JsPromptResult f19506g;

    lr0(JsPromptResult jsPromptResult) {
        this.f19506g = jsPromptResult;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f19506g.cancel();
    }
}
