package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.widget.Button;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.gms.common.util.C3363h;
import p159f.p243f.p245b.p246a.p247a.C4859a;
import p159f.p243f.p245b.p246a.p247a.C4860b;
import p159f.p243f.p245b.p246a.p247a.C4861c;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaaa extends Button {
    public zaaa(Context context, AttributeSet attributeSet) {
        super(context, (AttributeSet) null, 16842824);
    }

    /* renamed from: b */
    private static final int m14353b(int i, int i2, int i3, int i4) {
        if (i == 0) {
            return i2;
        }
        if (i == 1) {
            return i3;
        }
        if (i == 2) {
            return i4;
        }
        StringBuilder sb = new StringBuilder(33);
        sb.append("Unknown color scheme: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final void mo11898a(Resources resources, int i, int i2) {
        setTypeface(Typeface.DEFAULT_BOLD);
        setTextSize(14.0f);
        int i3 = (int) ((resources.getDisplayMetrics().density * 48.0f) + 0.5f);
        setMinHeight(i3);
        setMinWidth(i3);
        int i4 = C4860b.common_google_signin_btn_icon_dark;
        int i5 = C4860b.common_google_signin_btn_icon_light;
        int b = m14353b(i2, i4, i5, i5);
        int i6 = C4860b.common_google_signin_btn_text_dark;
        int i7 = C4860b.common_google_signin_btn_text_light;
        int b2 = m14353b(i2, i6, i7, i7);
        if (i == 0 || i == 1) {
            b = b2;
        } else if (i != 2) {
            StringBuilder sb = new StringBuilder(32);
            sb.append("Unknown button size: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        Drawable r = C0534a.m3292r(resources.getDrawable(b));
        C0534a.m3289o(r, resources.getColorStateList(C4859a.common_google_signin_btn_tint));
        C0534a.m3290p(r, PorterDuff.Mode.SRC_ATOP);
        setBackgroundDrawable(r);
        int i8 = C4859a.common_google_signin_btn_text_dark;
        int i9 = C4859a.common_google_signin_btn_text_light;
        ColorStateList colorStateList = resources.getColorStateList(m14353b(i2, i8, i9, i9));
        C3292l.m14240h(colorStateList);
        setTextColor(colorStateList);
        if (i == 0) {
            setText(resources.getString(C4861c.common_signin_button_text));
        } else if (i == 1) {
            setText(resources.getString(C4861c.common_signin_button_text_long));
        } else if (i == 2) {
            setText((CharSequence) null);
        } else {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Unknown button size: ");
            sb2.append(i);
            throw new IllegalStateException(sb2.toString());
        }
        setTransformationMethod((TransformationMethod) null);
        if (C3363h.m14455e(getContext())) {
            setGravity(19);
        }
    }
}
