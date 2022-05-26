package com.google.android.material.checkbox;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.core.widget.C0549e;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p307o.C7513a;

public class MaterialCheckBox extends AppCompatCheckBox {

    /* renamed from: l */
    private static final int f27983l = C7499k.Widget_MaterialComponents_CompoundButton_CheckBox;

    /* renamed from: m */
    private static final int[][] f27984m = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: j */
    private ColorStateList f27985j;

    /* renamed from: k */
    private boolean f27986k;

    public MaterialCheckBox(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f27985j == null) {
            int[][] iArr = f27984m;
            int[] iArr2 = new int[iArr.length];
            int d = C7513a.m41980d(this, C7490b.colorControlActivated);
            int d2 = C7513a.m41980d(this, C7490b.colorSurface);
            int d3 = C7513a.m41980d(this, C7490b.colorOnSurface);
            iArr2[0] = C7513a.m41983g(d2, d, 1.0f);
            iArr2[1] = C7513a.m41983g(d2, d3, 0.54f);
            iArr2[2] = C7513a.m41983g(d2, d3, 0.38f);
            iArr2[3] = C7513a.m41983g(d2, d3, 0.38f);
            this.f27985j = new ColorStateList(iArr, iArr2);
        }
        return this.f27985j;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f27986k && C0549e.m3394b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f27986k = z;
        if (z) {
            C0549e.m3395c(this, getMaterialThemeColorsTintList());
        } else {
            C0549e.m3395c(this, (ColorStateList) null);
        }
    }

    public MaterialCheckBox(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.checkboxStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialCheckBox(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = f27983l
            android.content.Context r8 = com.google.android.material.theme.p249a.C6260a.m37386c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.MaterialCheckBox
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r10 = p159f.p243f.p245b.p304b.C7500l.MaterialCheckBox_buttonTint
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L_0x0028
            android.content.res.ColorStateList r8 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r8, r9, r10)
            androidx.core.widget.C0549e.m3395c(r7, r8)
        L_0x0028:
            int r8 = p159f.p243f.p245b.p304b.C7500l.MaterialCheckBox_useMaterialThemeColors
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f27986k = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.checkbox.MaterialCheckBox.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
