package com.google.android.material.textview;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.theme.p249a.C6260a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7521b;
import p159f.p243f.p245b.p304b.p312t.C7522c;

public class MaterialTextView extends AppCompatTextView {
    public MaterialTextView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: p */
    private void m37374p(Resources.Theme theme, int i) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(i, C7500l.MaterialTextAppearance);
        int s = m37377s(getContext(), obtainStyledAttributes, C7500l.MaterialTextAppearance_android_lineHeight, C7500l.MaterialTextAppearance_lineHeight);
        obtainStyledAttributes.recycle();
        if (s >= 0) {
            setLineHeight(s);
        }
    }

    /* renamed from: q */
    private static boolean m37375q(Context context) {
        return C7521b.m42010b(context, C7490b.textAppearanceLineHeightEnabled, true);
    }

    /* renamed from: r */
    private static int m37376r(Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7500l.MaterialTextView, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(C7500l.MaterialTextView_android_textAppearance, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: s */
    private static int m37377s(Context context, TypedArray typedArray, int... iArr) {
        int i = -1;
        for (int i2 = 0; i2 < iArr.length && i < 0; i2++) {
            i = C7522c.m42016c(context, typedArray, iArr[i2], -1);
        }
        return i;
    }

    /* renamed from: t */
    private static boolean m37378t(Context context, Resources.Theme theme, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, C7500l.MaterialTextView, i, i2);
        int s = m37377s(context, obtainStyledAttributes, C7500l.MaterialTextView_android_lineHeight, C7500l.MaterialTextView_lineHeight);
        obtainStyledAttributes.recycle();
        if (s != -1) {
            return true;
        }
        return false;
    }

    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        if (m37375q(context)) {
            m37374p(context.getTheme(), i);
        }
    }

    public MaterialTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842884);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public MaterialTextView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C6260a.m37386c(context, attributeSet, i, i2), attributeSet, i);
        int r;
        Context context2 = getContext();
        if (m37375q(context2)) {
            Resources.Theme theme = context2.getTheme();
            if (!m37378t(context2, theme, attributeSet, i, i2) && (r = m37376r(theme, attributeSet, i, i2)) != -1) {
                m37374p(theme, r);
            }
        }
    }
}
