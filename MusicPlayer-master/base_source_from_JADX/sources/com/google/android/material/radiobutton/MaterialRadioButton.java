package com.google.android.material.radiobutton;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.core.widget.C0549e;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p307o.C7513a;

public class MaterialRadioButton extends AppCompatRadioButton {

    /* renamed from: l */
    private static final int f28733l = C7499k.Widget_MaterialComponents_CompoundButton_RadioButton;

    /* renamed from: m */
    private static final int[][] f28734m = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j */
    private ColorStateList f28735j;

    /* renamed from: k */
    private boolean f28736k;

    public MaterialRadioButton(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f28735j == null) {
            int d = C7513a.m41980d(this, C7490b.colorControlActivated);
            int d2 = C7513a.m41980d(this, C7490b.colorOnSurface);
            int d3 = C7513a.m41980d(this, C7490b.colorSurface);
            int[][] iArr = f28734m;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C7513a.m41983g(d3, d, 1.0f);
            iArr2[1] = C7513a.m41983g(d3, d2, 0.54f);
            iArr2[2] = C7513a.m41983g(d3, d2, 0.38f);
            iArr2[3] = C7513a.m41983g(d3, d2, 0.38f);
            this.f28735j = new ColorStateList(iArr, iArr2);
        }
        return this.f28735j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28736k && C0549e.m3394b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f28736k = z;
        if (z) {
            C0549e.m3395c(this, getMaterialThemeColorsTintList());
        } else {
            C0549e.m3395c(this, (ColorStateList) null);
        }
    }

    public MaterialRadioButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.radioButtonStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialRadioButton(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f28733l
            android.content.Context r8 = com.google.android.material.theme.p249a.C6260a.m37386c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.MaterialRadioButton
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r10 = p159f.p243f.p245b.p304b.C7500l.MaterialRadioButton_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r8, r9, r10)
            androidx.core.widget.C0549e.m3395c(r7, r8)
        L_0x0028:
            int r8 = p159f.p243f.p245b.p304b.C7500l.MaterialRadioButton_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f28736k = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.radiobutton.MaterialRadioButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
