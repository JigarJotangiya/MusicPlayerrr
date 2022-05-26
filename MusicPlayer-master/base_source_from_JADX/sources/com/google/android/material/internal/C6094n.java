package com.google.android.material.internal;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;

/* renamed from: com.google.android.material.internal.n */
/* compiled from: ToolbarUtils */
public class C6094n {
    /* renamed from: a */
    public static TextView m36565a(Toolbar toolbar) {
        return m36566b(toolbar, toolbar.getSubtitle());
    }

    /* renamed from: b */
    private static TextView m36566b(Toolbar toolbar, CharSequence charSequence) {
        for (int i = 0; i < toolbar.getChildCount(); i++) {
            View childAt = toolbar.getChildAt(i);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    return textView;
                }
            }
        }
        return null;
    }

    /* renamed from: c */
    public static TextView m36567c(Toolbar toolbar) {
        return m36566b(toolbar, toolbar.getTitle());
    }
}
