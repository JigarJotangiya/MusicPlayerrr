package com.google.android.material.theme.p249a;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import p082e.p083a.p090o.C3435d;
import p159f.p243f.p245b.p304b.C7490b;

/* renamed from: com.google.android.material.theme.a.a */
/* compiled from: MaterialThemeOverlay */
public class C6260a {

    /* renamed from: a */
    private static final int[] f29182a = {16842752, C7490b.theme};

    /* renamed from: b */
    private static final int[] f29183b = {C7490b.materialThemeOverlay};

    /* renamed from: a */
    private static int m37384a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29182a);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        return resourceId != 0 ? resourceId : resourceId2;
    }

    /* renamed from: b */
    private static int m37385b(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f29183b, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    /* renamed from: c */
    public static Context m37386c(Context context, AttributeSet attributeSet, int i, int i2) {
        int b = m37385b(context, attributeSet, i, i2);
        boolean z = (context instanceof C3435d) && ((C3435d) context).mo12170c() == b;
        if (b == 0 || z) {
            return context;
        }
        C3435d dVar = new C3435d(context, b);
        int a = m37384a(context, attributeSet);
        if (a != 0) {
            dVar.getTheme().applyStyle(a, true);
        }
        return dVar;
    }
}
