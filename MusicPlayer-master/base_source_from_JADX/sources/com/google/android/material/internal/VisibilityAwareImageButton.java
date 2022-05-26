package com.google.android.material.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
public class VisibilityAwareImageButton extends ImageButton {

    /* renamed from: g */
    private int f28404g;

    public VisibilityAwareImageButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    public final void mo24109a(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.f28404g = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.f28404g;
    }

    public void setVisibility(int i) {
        mo24109a(i, true);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VisibilityAwareImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28404g = getVisibility();
    }
}
