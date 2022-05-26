package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class kr0 implements DialogInterface.OnCancelListener {

    /* renamed from: g */
    final /* synthetic */ JsPromptResult f18967g;

    kr0(JsPromptResult jsPromptResult) {
        this.f18967g = jsPromptResult;
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f18967g.cancel();
    }
}
