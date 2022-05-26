package p082e.p109h.p119p;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: e.h.p.y */
/* compiled from: ViewParentCompat */
public final class C3789y {
    /* renamed from: a */
    public static boolean m16294a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (viewParent instanceof C3767o) {
            return ((C3767o) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m16295b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (viewParent instanceof C3767o) {
            return ((C3767o) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static void m16296c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C3765m) {
            ((C3765m) viewParent).mo1219o(view, i, i2, iArr, i3);
        } else if (i3 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
                }
            } else if (viewParent instanceof C3767o) {
                ((C3767o) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: d */
    public static void m16297d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        ViewParent viewParent2 = viewParent;
        if (viewParent2 instanceof C3766n) {
            ((C3766n) viewParent2).mo1214j(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent2 instanceof C3765m) {
            ((C3765m) viewParent2).mo1215k(view, i, i2, i3, i4, i5);
        } else if (i5 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    AbstractMethodError abstractMethodError = e;
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", abstractMethodError);
                }
            } else if (viewParent2 instanceof C3767o) {
                ((C3767o) viewParent2).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: e */
    public static void m16298e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C3765m) {
            ((C3765m) viewParent).mo1217m(view, view2, i, i2);
        } else if (i2 != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
                }
            } else if (viewParent instanceof C3767o) {
                ((C3767o) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: f */
    public static boolean m16299f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C3765m) {
            return ((C3765m) viewParent).mo1216l(view, view2, i, i2);
        }
        if (i2 != 0) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onStartNestedScroll(view, view2, i);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                return false;
            }
        } else if (viewParent instanceof C3767o) {
            return ((C3767o) viewParent).onStartNestedScroll(view, view2, i);
        } else {
            return false;
        }
    }

    /* renamed from: g */
    public static void m16300g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C3765m) {
            ((C3765m) viewParent).mo1218n(view, i);
        } else if (i != 0) {
        } else {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
                }
            } else if (viewParent instanceof C3767o) {
                ((C3767o) viewParent).onStopNestedScroll(view);
            }
        }
    }

    @Deprecated
    /* renamed from: h */
    public static boolean m16301h(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }
}
