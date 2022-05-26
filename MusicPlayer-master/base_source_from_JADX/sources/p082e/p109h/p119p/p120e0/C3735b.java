package p082e.p109h.p119p.p120e0;

import android.os.Build;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: e.h.p.e0.b */
/* compiled from: AccessibilityEventCompat */
public final class C3735b {
    /* renamed from: a */
    public static int m15973a(AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 19) {
            return accessibilityEvent.getContentChangeTypes();
        }
        return 0;
    }

    /* renamed from: b */
    public static void m15974b(AccessibilityEvent accessibilityEvent, int i) {
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(i);
        }
    }
}
