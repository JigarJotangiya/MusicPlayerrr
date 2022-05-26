package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0279g0;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7500l;

/* renamed from: com.google.android.material.internal.m */
/* compiled from: ThemeEnforcement */
public final class C6093m {

    /* renamed from: a */
    private static final int[] f28536a = {C7490b.colorPrimary};

    /* renamed from: b */
    private static final int[] f28537b = {C7490b.colorPrimaryVariant};

    /* renamed from: a */
    public static void m36556a(Context context) {
        m36560e(context, f28536a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m36557b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.ThemeEnforcement, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7500l.ThemeEnforcement_enforceMaterialTheme, false);
        obtainStyledAttributes.recycle();
        if (z) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C7490b.isMaterialTheme, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                m36558c(context);
            }
        }
        m36556a(context);
    }

    /* renamed from: c */
    public static void m36558c(Context context) {
        m36560e(context, f28537b, "Theme.MaterialComponents");
    }

    /* renamed from: d */
    private static void m36559d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C7500l.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C7500l.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m36561f(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: e */
    private static void m36560e(Context context, int[] iArr, String str) {
        if (!m36562g(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: f */
    private static boolean m36561f(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: g */
    private static boolean m36562g(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i = 0; i < iArr.length; i++) {
            if (!obtainStyledAttributes.hasValue(i)) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: h */
    public static TypedArray m36563h(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m36557b(context, attributeSet, i, i2);
        m36559d(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: i */
    public static C0279g0 m36564i(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m36557b(context, attributeSet, i, i2);
        m36559d(context, attributeSet, iArr, i, i2, iArr2);
        return C0279g0.m1627v(context, attributeSet, iArr, i, i2);
    }
}
