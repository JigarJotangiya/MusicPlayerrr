package com.google.android.material.badge;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.ParcelableSparseArray;

/* renamed from: com.google.android.material.badge.a */
/* compiled from: BadgeUtils */
public class C5908a {

    /* renamed from: a */
    public static final boolean f27741a = (Build.VERSION.SDK_INT < 18);

    /* renamed from: a */
    public static void m35358a(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        m35362e(badgeDrawable, view, frameLayout);
        if (badgeDrawable.mo22935i() != null) {
            badgeDrawable.mo22935i().setForeground(badgeDrawable);
        } else if (!f27741a) {
            view.getOverlay().add(badgeDrawable);
        } else {
            throw new IllegalArgumentException("Trying to reference null customBadgeParent");
        }
    }

    /* renamed from: b */
    public static SparseArray<BadgeDrawable> m35359b(Context context, ParcelableSparseArray parcelableSparseArray) {
        SparseArray<BadgeDrawable> sparseArray = new SparseArray<>(parcelableSparseArray.size());
        int i = 0;
        while (i < parcelableSparseArray.size()) {
            int keyAt = parcelableSparseArray.keyAt(i);
            BadgeDrawable.SavedState savedState = (BadgeDrawable.SavedState) parcelableSparseArray.valueAt(i);
            if (savedState != null) {
                sparseArray.put(keyAt, BadgeDrawable.m35305e(context, savedState));
                i++;
            } else {
                throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
            }
        }
        return sparseArray;
    }

    /* renamed from: c */
    public static ParcelableSparseArray m35360c(SparseArray<BadgeDrawable> sparseArray) {
        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
        int i = 0;
        while (i < sparseArray.size()) {
            int keyAt = sparseArray.keyAt(i);
            BadgeDrawable valueAt = sparseArray.valueAt(i);
            if (valueAt != null) {
                parcelableSparseArray.put(keyAt, valueAt.mo22940m());
                i++;
            } else {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
        }
        return parcelableSparseArray;
    }

    /* renamed from: d */
    public static void m35361d(BadgeDrawable badgeDrawable, View view) {
        if (badgeDrawable != null) {
            if (f27741a || badgeDrawable.mo22935i() != null) {
                badgeDrawable.mo22935i().setForeground((Drawable) null);
            } else {
                view.getOverlay().remove(badgeDrawable);
            }
        }
    }

    /* renamed from: e */
    public static void m35362e(BadgeDrawable badgeDrawable, View view, FrameLayout frameLayout) {
        Rect rect = new Rect();
        view.getDrawingRect(rect);
        badgeDrawable.setBounds(rect);
        badgeDrawable.mo22927F(view, frameLayout);
    }

    /* renamed from: f */
    public static void m35363f(Rect rect, float f, float f2, float f3, float f4) {
        rect.set((int) (f - f3), (int) (f2 - f4), (int) (f + f3), (int) (f2 + f4));
    }
}
