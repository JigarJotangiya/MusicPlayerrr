package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.TypedArray;
import androidx.fragment.app.C0584b;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.p312t.C7521b;

/* renamed from: com.google.android.material.datepicker.f */
/* compiled from: MaterialDatePicker */
public final class C6001f<S> extends C0584b {
    /* renamed from: i3 */
    static boolean m36073i3(Context context) {
        return m36075k3(context, 16843277);
    }

    /* renamed from: j3 */
    static boolean m36074j3(Context context) {
        return m36075k3(context, C7490b.nestedScrollable);
    }

    /* renamed from: k3 */
    static boolean m36075k3(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C7521b.m42012d(context, C7490b.materialCalendarStyle, C5988e.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }
}
