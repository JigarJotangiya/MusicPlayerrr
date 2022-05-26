package p082e.p109h.p119p.p120e0;

import android.os.Build;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;

/* renamed from: e.h.p.e0.e */
/* compiled from: AccessibilityRecordCompat */
public class C3745e {
    /* renamed from: a */
    public static void m16076a(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollX(i);
        }
    }

    /* renamed from: b */
    public static void m16077b(AccessibilityRecord accessibilityRecord, int i) {
        if (Build.VERSION.SDK_INT >= 15) {
            accessibilityRecord.setMaxScrollY(i);
        }
    }

    /* renamed from: c */
    public static void m16078c(AccessibilityRecord accessibilityRecord, View view, int i) {
        if (Build.VERSION.SDK_INT >= 16) {
            accessibilityRecord.setSource(view, i);
        }
    }
}
