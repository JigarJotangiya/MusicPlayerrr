package p082e.p147t.p148e;

import android.view.GestureDetector;
import android.view.GestureDetector.OnDoubleTapListener;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.t.e.p */
/* compiled from: GestureRouter */
final class C4193p<T extends GestureDetector.OnGestureListener & GestureDetector.OnDoubleTapListener> implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    /* renamed from: a */
    private final C4183l0<T> f12550a;

    C4193p(T t) {
        C3703i.m15824a(t != null);
        this.f12550a = new C4183l0<>(t);
    }

    /* renamed from: a */
    public void mo14353a(int i, T t) {
        this.f12550a.mo14337b(i, t);
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent))).onDoubleTap(motionEvent);
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent))).onDoubleTapEvent(motionEvent);
    }

    public boolean onDown(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent)).onDown(motionEvent);
    }

    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent2)).onFling(motionEvent, motionEvent2, f, f2);
    }

    public void onLongPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent)).onLongPress(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent2)).onScroll(motionEvent, motionEvent2, f, f2);
    }

    public void onShowPress(MotionEvent motionEvent) {
        ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent)).onShowPress(motionEvent);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return ((GestureDetector.OnDoubleTapListener) ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent))).onSingleTapConfirmed(motionEvent);
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return ((GestureDetector.OnGestureListener) this.f12550a.mo14336a(motionEvent)).onSingleTapUp(motionEvent);
    }

    C4193p() {
        this(new GestureDetector.SimpleOnGestureListener());
    }
}
