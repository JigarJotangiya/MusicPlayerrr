package net.coocent.android.xmlparser.widget.view.tabs.p455b;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p391j.p392a.p393a.C8610c;
import p391j.p392a.p393a.C8618k;

/* renamed from: net.coocent.android.xmlparser.widget.view.tabs.b.a */
/* compiled from: ThemeEnforcement */
public final class C9554a {

    /* renamed from: a */
    private static final int[] f36699a = {C8610c.colorPrimary};

    /* renamed from: a */
    public static void m50144a(Context context) {
        m50147d(context, f36699a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m50145b(Context context, AttributeSet attributeSet, int i, int i2) {
        context.obtainStyledAttributes(attributeSet, C8618k.ThemeEnforcement, i, i2).recycle();
        m50144a(context);
    }

    /* renamed from: c */
    private static void m50146c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8618k.ThemeEnforcement, i, i2);
        boolean z2 = false;
        if (!obtainStyledAttributes.getBoolean(C8618k.ThemeEnforcement_enforceTextAppearance, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            if (obtainStyledAttributes.getResourceId(C8618k.ThemeEnforcement_android_textAppearance, -1) != -1) {
                z2 = true;
            }
            z = z2;
        } else {
            z = m50148e(context, attributeSet, iArr, i, i2, iArr2);
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* renamed from: d */
    private static void m50147d(Context context, int[] iArr, String str) {
        if (!m50149f(context, iArr)) {
            throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
        }
    }

    /* renamed from: e */
    private static boolean m50148e(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
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

    /* renamed from: f */
    private static boolean m50149f(Context context, int[] iArr) {
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

    /* renamed from: g */
    public static TypedArray m50150g(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m50145b(context, attributeSet, i, i2);
        m50146c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }
}
