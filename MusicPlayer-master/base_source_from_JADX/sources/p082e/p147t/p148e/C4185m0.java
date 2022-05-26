package p082e.p147t.p148e;

import android.view.MotionEvent;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4168j0;
import p082e.p147t.p148e.C4204s;

/* renamed from: e.t.e.m0 */
/* compiled from: TouchInputHandler */
final class C4185m0<K> extends C4208v<K> {

    /* renamed from: d */
    private final C4204s<K> f12533d;

    /* renamed from: e */
    private final C4168j0.C4175c<K> f12534e;

    /* renamed from: f */
    private final C4137a0<K> f12535f;

    /* renamed from: g */
    private final C4212z f12536g;

    /* renamed from: h */
    private final Runnable f12537h;

    /* renamed from: i */
    private final Runnable f12538i;

    /* renamed from: j */
    private final Runnable f12539j;

    C4185m0(C4168j0<K> j0Var, C4206t<K> tVar, C4204s<K> sVar, C4168j0.C4175c<K> cVar, Runnable runnable, C4212z zVar, C4137a0<K> a0Var, C4186n<K> nVar, Runnable runnable2, Runnable runnable3) {
        super(j0Var, tVar, nVar);
        boolean z = true;
        C3703i.m15824a(sVar != null);
        C3703i.m15824a(cVar != null);
        C3703i.m15824a(runnable != null);
        C3703i.m15824a(a0Var != null);
        C3703i.m15824a(zVar != null);
        C3703i.m15824a(runnable2 == null ? false : z);
        this.f12533d = sVar;
        this.f12534e = cVar;
        this.f12537h = runnable;
        this.f12535f = a0Var;
        this.f12536g = zVar;
        this.f12538i = runnable2;
        this.f12539j = runnable3;
    }

    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        return C4207u.m18526g(motionEvent) && onSingleTapUp(motionEvent);
    }

    public void onLongPress(MotionEvent motionEvent) {
        C4204s.C4205a<K> a;
        if (this.f12533d.mo14388f(motionEvent) && (a = this.f12533d.mo10098a(motionEvent)) != null) {
            this.f12539j.run();
            if (mo14399g(motionEvent)) {
                mo14395a(a);
                this.f12538i.run();
            } else if (this.f12584a.mo14301m(a.mo10107b())) {
                if (this.f12536g.mo14329a(motionEvent)) {
                    this.f12538i.run();
                }
            } else if (this.f12534e.mo14326c(a.mo10107b(), true) && mo14397e(a)) {
                if (this.f12534e.mo14324a() && this.f12584a.mo14300l()) {
                    this.f12537h.run();
                }
                this.f12538i.run();
            }
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        C4204s.C4205a<K> a = this.f12533d.mo10098a(motionEvent);
        if (a == null || !a.mo14389c()) {
            return this.f12584a.mo14293e();
        }
        if (this.f12584a.mo14299k()) {
            if (mo14399g(motionEvent)) {
                mo14395a(a);
                return true;
            } else if (this.f12584a.mo14301m(a.mo10107b())) {
                this.f12584a.mo14294f(a.mo10107b());
                return true;
            } else {
                mo14397e(a);
                return true;
            }
        } else if (a.mo14391e(motionEvent)) {
            return mo14397e(a);
        } else {
            return this.f12535f.mo14252a(a, motionEvent);
        }
    }
}
