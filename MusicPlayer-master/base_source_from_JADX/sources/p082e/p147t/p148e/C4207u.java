package p082e.p147t.p148e;

import android.graphics.Point;
import android.view.MotionEvent;

/* renamed from: e.t.e.u */
/* compiled from: MotionEvents */
final class C4207u {
    /* renamed from: a */
    static MotionEvent m18520a() {
        return MotionEvent.obtain(0, 1, 3, 0.0f, 0.0f, 0);
    }

    /* renamed from: b */
    static Point m18521b(MotionEvent motionEvent) {
        return new Point((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* renamed from: c */
    private static boolean m18522c(int i, int i2) {
        return (i & i2) != 0;
    }

    /* renamed from: d */
    static boolean m18523d(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 3;
    }

    /* renamed from: e */
    static boolean m18524e(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 0;
    }

    /* renamed from: f */
    static boolean m18525f(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 2;
    }

    /* renamed from: g */
    static boolean m18526g(MotionEvent motionEvent) {
        return motionEvent.getActionMasked() == 1;
    }

    /* renamed from: h */
    static boolean m18527h(MotionEvent motionEvent) {
        return m18522c(motionEvent.getMetaState(), 2);
    }

    /* renamed from: i */
    private static boolean m18528i(MotionEvent motionEvent, int i) {
        return i != 0 && (motionEvent.getButtonState() & i) == i;
    }

    /* renamed from: j */
    static boolean m18529j(MotionEvent motionEvent) {
        return m18522c(motionEvent.getMetaState(), 4096);
    }

    /* renamed from: k */
    static boolean m18530k(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    /* renamed from: l */
    static boolean m18531l(MotionEvent motionEvent) {
        return m18532m(motionEvent) && m18525f(motionEvent);
    }

    /* renamed from: m */
    static boolean m18532m(MotionEvent motionEvent) {
        return m18528i(motionEvent, 1);
    }

    /* renamed from: n */
    static boolean m18533n(MotionEvent motionEvent) {
        return m18528i(motionEvent, 2);
    }

    /* renamed from: o */
    static boolean m18534o(MotionEvent motionEvent) {
        return m18522c(motionEvent.getMetaState(), 1);
    }

    /* renamed from: p */
    static boolean m18535p(MotionEvent motionEvent) {
        return m18528i(motionEvent, 4);
    }

    /* renamed from: q */
    static boolean m18536q(MotionEvent motionEvent) {
        return m18530k(motionEvent) && m18525f(motionEvent) && motionEvent.getButtonState() == 0;
    }
}
