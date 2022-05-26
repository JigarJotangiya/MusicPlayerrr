package p082e.p147t.p148e;

import android.util.Log;
import android.view.MotionEvent;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4204s;

/* renamed from: e.t.e.w */
/* compiled from: MouseInputHandler */
final class C4209w<K> extends C4208v<K> {

    /* renamed from: d */
    private final C4204s<K> f12587d;

    /* renamed from: e */
    private final C4211y f12588e;

    /* renamed from: f */
    private final C4137a0<K> f12589f;

    /* renamed from: g */
    private final C4186n<K> f12590g;

    /* renamed from: h */
    private boolean f12591h;

    /* renamed from: i */
    private boolean f12592i;

    C4209w(C4168j0<K> j0Var, C4206t<K> tVar, C4204s<K> sVar, C4211y yVar, C4137a0<K> a0Var, C4186n<K> nVar) {
        super(j0Var, tVar, nVar);
        boolean z = true;
        C3703i.m15824a(sVar != null);
        C3703i.m15824a(yVar != null);
        C3703i.m15824a(a0Var == null ? false : z);
        this.f12587d = sVar;
        this.f12588e = yVar;
        this.f12589f = a0Var;
        this.f12590g = nVar;
    }

    /* renamed from: h */
    private void m18544h(MotionEvent motionEvent, C4204s.C4205a<K> aVar) {
        if (!this.f12584a.mo14299k()) {
            Log.e("MouseInputHandler", "Call to onItemClick w/o selection.");
            return;
        }
        C3703i.m15824a(aVar != null);
        if (mo14399g(motionEvent)) {
            mo14395a(aVar);
            return;
        }
        if (mo14398f(motionEvent, aVar)) {
            this.f12584a.mo14293e();
        }
        if (!this.f12584a.mo14301m(aVar.mo10107b())) {
            m18546j(aVar, motionEvent);
        } else if (this.f12584a.mo14294f(aVar.mo10107b())) {
            this.f12590g.mo14342a();
        }
    }

    /* renamed from: i */
    private boolean m18545i(MotionEvent motionEvent) {
        C4204s.C4205a<K> a;
        if (this.f12587d.mo14388f(motionEvent) && (a = this.f12587d.mo10098a(motionEvent)) != null && !this.f12584a.mo14301m(a.mo10107b())) {
            this.f12584a.mo14293e();
            mo14397e(a);
        }
        return this.f12588e.onContextClick(motionEvent);
    }

    /* renamed from: j */
    private void m18546j(C4204s.C4205a<K> aVar, MotionEvent motionEvent) {
        if (aVar.mo14391e(motionEvent) || C4207u.m18529j(motionEvent)) {
            mo14397e(aVar);
        } else {
            mo14396b(aVar);
        }
    }

    public boolean onDoubleTap(MotionEvent motionEvent) {
        C4204s.C4205a<K> a;
        this.f12591h = false;
        if (this.f12587d.mo14388f(motionEvent) && !C4207u.m18535p(motionEvent) && (a = this.f12587d.mo10098a(motionEvent)) != null && this.f12589f.mo14252a(a, motionEvent)) {
            return true;
        }
        return false;
    }

    public boolean onDown(MotionEvent motionEvent) {
        if ((!C4207u.m18527h(motionEvent) || !C4207u.m18532m(motionEvent)) && !C4207u.m18533n(motionEvent)) {
            return false;
        }
        this.f12592i = true;
        return m18545i(motionEvent);
    }

    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return !C4207u.m18536q(motionEvent2);
    }

    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        C4204s.C4205a<K> a;
        if (this.f12591h) {
            this.f12591h = false;
            return false;
        } else if (this.f12584a.mo14299k() || !this.f12587d.mo14387e(motionEvent) || C4207u.m18535p(motionEvent) || (a = this.f12587d.mo10098a(motionEvent)) == null || !a.mo14389c()) {
            return false;
        } else {
            if (!this.f12590g.mo14345e() || !C4207u.m18534o(motionEvent)) {
                m18546j(a, motionEvent);
                return true;
            }
            this.f12584a.mo14306r(this.f12590g.mo14344d());
            this.f12584a.mo14296h(a.mo10106a());
            return true;
        }
    }

    public boolean onSingleTapUp(MotionEvent motionEvent) {
        if (this.f12592i) {
            this.f12592i = false;
            return false;
        } else if (!this.f12587d.mo14388f(motionEvent)) {
            this.f12584a.mo14293e();
            this.f12590g.mo14342a();
            return false;
        } else if (C4207u.m18535p(motionEvent) || !this.f12584a.mo14299k()) {
            return false;
        } else {
            m18544h(motionEvent, this.f12587d.mo10098a(motionEvent));
            this.f12591h = true;
            return true;
        }
    }
}
