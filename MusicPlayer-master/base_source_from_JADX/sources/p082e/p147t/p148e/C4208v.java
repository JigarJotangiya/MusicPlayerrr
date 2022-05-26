package p082e.p147t.p148e;

import android.view.GestureDetector;
import android.view.MotionEvent;
import p082e.p109h.p118o.C3703i;
import p082e.p147t.p148e.C4204s;

/* renamed from: e.t.e.v */
/* compiled from: MotionInputHandler */
abstract class C4208v<K> extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: a */
    protected final C4168j0<K> f12584a;

    /* renamed from: b */
    private final C4206t<K> f12585b;

    /* renamed from: c */
    private final C4186n<K> f12586c;

    C4208v(C4168j0<K> j0Var, C4206t<K> tVar, C4186n<K> nVar) {
        boolean z = true;
        C3703i.m15824a(j0Var != null);
        C3703i.m15824a(tVar != null);
        C3703i.m15824a(nVar == null ? false : z);
        this.f12584a = j0Var;
        this.f12585b = tVar;
        this.f12586c = nVar;
    }

    /* renamed from: c */
    static boolean m18537c(C4204s.C4205a<?> aVar) {
        return (aVar == null || aVar.mo10106a() == -1) ? false : true;
    }

    /* renamed from: d */
    static boolean m18538d(C4204s.C4205a<?> aVar) {
        return (aVar == null || aVar.mo10107b() == null) ? false : true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo14395a(C4204s.C4205a<K> aVar) {
        C3703i.m15829f(this.f12585b.mo14394c(0));
        C3703i.m15824a(m18537c(aVar));
        C3703i.m15824a(m18538d(aVar));
        this.f12584a.mo14296h(aVar.mo10106a());
        this.f12586c.mo14343c(aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo14396b(C4204s.C4205a<K> aVar) {
        C3703i.m15824a(aVar != null);
        C3703i.m15824a(m18538d(aVar));
        this.f12584a.mo14293e();
        this.f12586c.mo14343c(aVar);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo14397e(C4204s.C4205a<K> aVar) {
        C3703i.m15824a(aVar != null);
        C3703i.m15824a(m18537c(aVar));
        C3703i.m15824a(m18538d(aVar));
        if (this.f12584a.mo14303o(aVar.mo10107b())) {
            this.f12584a.mo14292d(aVar.mo10106a());
        }
        if (this.f12584a.mo14298j().size() == 1) {
            this.f12586c.mo14343c(aVar);
        } else {
            this.f12586c.mo14342a();
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean mo14398f(MotionEvent motionEvent, C4204s.C4205a<K> aVar) {
        return !C4207u.m18529j(motionEvent) && !aVar.mo14391e(motionEvent) && !this.f12584a.mo14301m(aVar.mo10107b());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final boolean mo14399g(MotionEvent motionEvent) {
        if (!C4207u.m18534o(motionEvent) || !this.f12584a.mo14300l() || !this.f12585b.mo14394c(0)) {
            return false;
        }
        return true;
    }
}
