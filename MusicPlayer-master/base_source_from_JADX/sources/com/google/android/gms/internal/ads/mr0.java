package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mr0 implements DialogInterface.OnClickListener {

    /* renamed from: g */
    final /* synthetic */ JsPromptResult f20134g;

    /* renamed from: h */
    final /* synthetic */ EditText f20135h;

    mr0(JsPromptResult jsPromptResult, EditText editText) {
        this.f20134g = jsPromptResult;
        this.f20135h = editText;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f20134g.confirm(this.f20135h.getText().toString());
    }
}
