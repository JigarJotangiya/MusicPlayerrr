package p082e.p109h.p119p;

import android.view.MotionEvent;

/* renamed from: e.h.p.j */
/* compiled from: MotionEventCompat */
public final class C3762j {
    @Deprecated
    /* renamed from: a */
    public static int m16105a(MotionEvent motionEvent, int i) {
        return motionEvent.findPointerIndex(i);
    }

    @Deprecated
    /* renamed from: b */
    public static int m16106b(MotionEvent motionEvent) {
        return motionEvent.getActionIndex();
    }

    @Deprecated
    /* renamed from: c */
    public static int m16107c(MotionEvent motionEvent) {
        return motionEvent.getActionMasked();
    }

    @Deprecated
    /* renamed from: d */
    public static int m16108d(MotionEvent motionEvent) {
        return motionEvent.getPointerCount();
    }

    @Deprecated
    /* renamed from: e */
    public static int m16109e(MotionEvent motionEvent, int i) {
        return motionEvent.getPointerId(i);
    }

    @Deprecated
    /* renamed from: f */
    public static float m16110f(MotionEvent motionEvent, int i) {
        return motionEvent.getX(i);
    }

    @Deprecated
    /* renamed from: g */
    public static float m16111g(MotionEvent motionEvent, int i) {
        return motionEvent.getY(i);
    }

    /* renamed from: h */
    public static boolean m16112h(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
