package com.p256kk.taurus.playerbase.p267k;

import android.graphics.Rect;

/* renamed from: com.kk.taurus.playerbase.k.c */
/* compiled from: RectUtils */
public class C6699c {
    /* renamed from: a */
    public static Rect m38417a(Rect rect) {
        int i;
        int i2;
        int i3;
        int i4 = rect.right - rect.left;
        int i5 = rect.bottom - rect.top;
        int i6 = i4 / 2;
        int i7 = i5 / 2;
        if (i4 > i5) {
            i3 = i6 - i7;
            i = i6 + i7;
            i2 = i7 * 2;
        } else {
            i3 = i7 - i6;
            int i8 = i7 + i6;
            i2 = i6 * 2;
            i = i8;
        }
        return new Rect(i3, 0, i, i2);
    }
}
