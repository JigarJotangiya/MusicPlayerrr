package com.google.android.material.switchmaterial;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.SwitchCompat;
import com.google.android.material.internal.C6100s;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p307o.C7513a;
import p159f.p243f.p245b.p304b.p309q.C7515a;

public class SwitchMaterial extends SwitchCompat {

    /* renamed from: c0 */
    private static final int f28882c0 = C7499k.Widget_MaterialComponents_CompoundButton_Switch;

    /* renamed from: d0 */
    private static final int[][] f28883d0 = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: V */
    private final C7515a f28884V;

    /* renamed from: W */
    private ColorStateList f28885W;

    /* renamed from: a0 */
    private ColorStateList f28886a0;

    /* renamed from: b0 */
    private boolean f28887b0;

    public SwitchMaterial(Context context) {
        this(context, (AttributeSet) null);
    }

    private ColorStateList getMaterialThemeColorsThumbTintList() {
        if (this.f28885W == null) {
            int d = C7513a.m41980d(this, C7490b.colorSurface);
            int d2 = C7513a.m41980d(this, C7490b.colorControlActivated);
            float dimension = getResources().getDimension(C7492d.mtrl_switch_thumb_elevation);
            if (this.f28884V.mo28406e()) {
                dimension += C6100s.m36586g(this);
            }
            int c = this.f28884V.mo28404c(d, dimension);
            int[][] iArr = f28883d0;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C7513a.m41983g(d, d2, 1.0f);
            iArr2[1] = c;
            iArr2[2] = C7513a.m41983g(d, d2, 0.38f);
            iArr2[3] = c;
            this.f28885W = new ColorStateList(iArr, iArr2);
        }
        return this.f28885W;
    }

    private ColorStateList getMaterialThemeColorsTrackTintList() {
        if (this.f28886a0 == null) {
            int[][] iArr = f28883d0;
            int[] iArr2 = new int[iArr.length];
            int d = C7513a.m41980d(this, C7490b.colorSurface);
            int d2 = C7513a.m41980d(this, C7490b.colorControlActivated);
            int d3 = C7513a.m41980d(this, C7490b.colorOnSurface);
            iArr2[0] = C7513a.m41983g(d, d2, 0.54f);
            iArr2[1] = C7513a.m41983g(d, d3, 0.32f);
            iArr2[2] = C7513a.m41983g(d, d2, 0.12f);
            iArr2[3] = C7513a.m41983g(d, d3, 0.12f);
            this.f28886a0 = new ColorStateList(iArr, iArr2);
        }
        return this.f28886a0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28887b0 && getThumbTintList() == null) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
        }
        if (this.f28887b0 && getTrackTintList() == null) {
            setTrackTintList(getMaterialThemeColorsTrackTintList());
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f28887b0 = z;
        if (z) {
            setThumbTintList(getMaterialThemeColorsThumbTintList());
            setTrackTintList(getMaterialThemeColorsTrackTintList());
            return;
        }
        setThumbTintList((ColorStateList) null);
        setTrackTintList((ColorStateList) null);
    }

    public SwitchMaterial(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.switchStyle);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SwitchMaterial(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = f28882c0
            android.content.Context r7 = com.google.android.material.theme.p249a.C6260a.m37386c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            f.f.b.b.q.a r7 = new f.f.b.b.q.a
            r7.<init>(r0)
            r6.f28884V = r7
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.SwitchMaterial
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r9 = p159f.p243f.p245b.p304b.C7500l.SwitchMaterial_useMaterialThemeColors
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f28887b0 = r7
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.switchmaterial.SwitchMaterial.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
