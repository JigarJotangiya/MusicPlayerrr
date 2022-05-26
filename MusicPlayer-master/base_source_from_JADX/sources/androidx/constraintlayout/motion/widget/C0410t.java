package androidx.constraintlayout.motion.widget;

import android.graphics.Rect;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.motion.widget.C0407s;
import androidx.constraintlayout.widget.C0430c;
import androidx.constraintlayout.widget.C0440g;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: androidx.constraintlayout.motion.widget.t */
/* compiled from: ViewTransitionController */
public class C0410t {

    /* renamed from: a */
    private final MotionLayout f2028a;

    /* renamed from: b */
    private ArrayList<C0407s> f2029b = new ArrayList<>();

    /* renamed from: c */
    private HashSet<View> f2030c;

    /* renamed from: d */
    private String f2031d = "ViewTransitionController";

    /* renamed from: e */
    ArrayList<C0407s.C0409b> f2032e;

    /* renamed from: f */
    ArrayList<C0407s.C0409b> f2033f = new ArrayList<>();

    /* renamed from: androidx.constraintlayout.motion.widget.t$a */
    /* compiled from: ViewTransitionController */
    class C0411a implements C0440g.C0441a {
        C0411a(C0410t tVar, C0407s sVar, int i, boolean z, int i2) {
        }
    }

    public C0410t(MotionLayout motionLayout) {
        this.f2028a = motionLayout;
    }

    /* renamed from: f */
    private void m2628f(C0407s sVar, boolean z) {
        ConstraintLayout.getSharedValues().mo2988a(sVar.mo2716g(), new C0411a(this, sVar, sVar.mo2716g(), z, sVar.mo2715f()));
    }

    /* renamed from: j */
    private void m2629j(C0407s sVar, View... viewArr) {
        int currentState = this.f2028a.getCurrentState();
        if (sVar.f1996e == 2) {
            sVar.mo2711b(this, this.f2028a, currentState, (C0430c) null, viewArr);
        } else if (currentState == -1) {
            String str = this.f2031d;
            String valueOf = String.valueOf(this.f2028a.toString());
            Log.w(str, valueOf.length() != 0 ? "No support for ViewTransition within transition yet. Currently: ".concat(valueOf) : new String("No support for ViewTransition within transition yet. Currently: "));
        } else {
            C0430c m0 = this.f2028a.mo2471m0(currentState);
            if (m0 != null) {
                sVar.mo2711b(this, this.f2028a, currentState, m0, viewArr);
            }
        }
    }

    /* renamed from: a */
    public void mo2728a(C0407s sVar) {
        this.f2029b.add(sVar);
        this.f2030c = null;
        if (sVar.mo2717h() == 4) {
            m2628f(sVar, true);
        } else if (sVar.mo2717h() == 5) {
            m2628f(sVar, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo2729b(C0407s.C0409b bVar) {
        if (this.f2032e == null) {
            this.f2032e = new ArrayList<>();
        }
        this.f2032e.add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2730c() {
        ArrayList<C0407s.C0409b> arrayList = this.f2032e;
        if (arrayList != null) {
            Iterator<C0407s.C0409b> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo2723a();
            }
            this.f2032e.removeAll(this.f2033f);
            this.f2033f.clear();
            if (this.f2032e.isEmpty()) {
                this.f2032e = null;
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo2731d(int i, C0396n nVar) {
        Iterator<C0407s> it = this.f2029b.iterator();
        while (it.hasNext()) {
            C0407s next = it.next();
            if (next.mo2713d() == i) {
                next.f1997f.mo2555a(nVar);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo2732e() {
        this.f2028a.invalidate();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2733g(C0407s.C0409b bVar) {
        this.f2033f.add(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2734h(MotionEvent motionEvent) {
        C0407s sVar;
        int currentState = this.f2028a.getCurrentState();
        if (currentState != -1) {
            if (this.f2030c == null) {
                this.f2030c = new HashSet<>();
                Iterator<C0407s> it = this.f2029b.iterator();
                while (it.hasNext()) {
                    C0407s next = it.next();
                    int childCount = this.f2028a.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = this.f2028a.getChildAt(i);
                        if (next.mo2719k(childAt)) {
                            childAt.getId();
                            this.f2030c.add(childAt);
                        }
                    }
                }
            }
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            Rect rect = new Rect();
            int action = motionEvent.getAction();
            ArrayList<C0407s.C0409b> arrayList = this.f2032e;
            if (arrayList != null && !arrayList.isEmpty()) {
                Iterator<C0407s.C0409b> it2 = this.f2032e.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2726d(action, x, y);
                }
            }
            if (action == 0 || action == 1) {
                C0430c m0 = this.f2028a.mo2471m0(currentState);
                Iterator<C0407s> it3 = this.f2029b.iterator();
                while (it3.hasNext()) {
                    C0407s next2 = it3.next();
                    if (next2.mo2720m(action)) {
                        Iterator<View> it4 = this.f2030c.iterator();
                        while (it4.hasNext()) {
                            View next3 = it4.next();
                            if (next2.mo2719k(next3)) {
                                next3.getHitRect(rect);
                                if (rect.contains((int) x, (int) y)) {
                                    sVar = next2;
                                    next2.mo2711b(this, this.f2028a, currentState, m0, next3);
                                } else {
                                    sVar = next2;
                                }
                                next2 = sVar;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2735i(int i, View... viewArr) {
        ArrayList arrayList = new ArrayList();
        Iterator<C0407s> it = this.f2029b.iterator();
        C0407s sVar = null;
        while (it.hasNext()) {
            C0407s next = it.next();
            if (next.mo2713d() == i) {
                for (View view : viewArr) {
                    if (next.mo2712c(view)) {
                        arrayList.add(view);
                    }
                }
                if (!arrayList.isEmpty()) {
                    m2629j(next, (View[]) arrayList.toArray(new View[0]));
                    arrayList.clear();
                }
                sVar = next;
            }
        }
        if (sVar == null) {
            Log.e(this.f2031d, " Could not find ViewTransition");
        }
    }
}
