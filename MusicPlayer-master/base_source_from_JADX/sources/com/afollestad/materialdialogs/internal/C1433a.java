package com.afollestad.materialdialogs.internal;

import android.content.Context;
import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import java.util.Locale;

/* renamed from: com.afollestad.materialdialogs.internal.a */
/* compiled from: AllCapsTransformationMethod */
class C1433a implements TransformationMethod {

    /* renamed from: g */
    private Locale f5525g;

    C1433a(Context context) {
        this.f5525g = context.getResources().getConfiguration().locale;
    }

    public CharSequence getTransformation(CharSequence charSequence, View view) {
        if (charSequence != null) {
            return charSequence.toString().toUpperCase(this.f5525g);
        }
        return null;
    }

    public void onFocusChanged(View view, CharSequence charSequence, boolean z, int i, Rect rect) {
    }
}
