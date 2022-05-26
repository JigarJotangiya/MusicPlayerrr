package com.google.android.material.behavior;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p109h.p119p.p120e0.C3746f;
import p082e.p124j.p125a.C3808c;

public class SwipeDismissBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    C3808c f27747a;

    /* renamed from: b */
    C5912c f27748b;

    /* renamed from: c */
    private boolean f27749c;

    /* renamed from: d */
    private float f27750d = 0.0f;

    /* renamed from: e */
    private boolean f27751e;

    /* renamed from: f */
    int f27752f = 2;

    /* renamed from: g */
    float f27753g = 0.5f;

    /* renamed from: h */
    float f27754h = 0.0f;

    /* renamed from: i */
    float f27755i = 0.5f;

    /* renamed from: j */
    private final C3808c.C3811c f27756j = new C5910a();

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$a */
    class C5910a extends C3808c.C3811c {

        /* renamed from: a */
        private int f27757a;

        /* renamed from: b */
        private int f27758b = -1;

        C5910a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0023 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0030 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* renamed from: n */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean m35385n(android.view.View r7, float r8) {
            /*
                r6 = this;
                r0 = 0
                r1 = 0
                r2 = 1
                int r3 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r3 == 0) goto L_0x0032
                int r7 = p082e.p109h.p119p.C3774v.m16151B(r7)
                if (r7 != r2) goto L_0x000f
                r7 = 1
                goto L_0x0010
            L_0x000f:
                r7 = 0
            L_0x0010:
                com.google.android.material.behavior.SwipeDismissBehavior r4 = com.google.android.material.behavior.SwipeDismissBehavior.this
                int r4 = r4.f27752f
                r5 = 2
                if (r4 != r5) goto L_0x0018
                return r2
            L_0x0018:
                if (r4 != 0) goto L_0x0025
                if (r7 == 0) goto L_0x0021
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0024
                goto L_0x0023
            L_0x0021:
                if (r3 <= 0) goto L_0x0024
            L_0x0023:
                r1 = 1
            L_0x0024:
                return r1
            L_0x0025:
                if (r4 != r2) goto L_0x0031
                if (r7 == 0) goto L_0x002c
                if (r3 <= 0) goto L_0x0031
                goto L_0x0030
            L_0x002c:
                int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
                if (r7 >= 0) goto L_0x0031
            L_0x0030:
                r1 = 1
            L_0x0031:
                return r1
            L_0x0032:
                int r8 = r7.getLeft()
                int r0 = r6.f27757a
                int r8 = r8 - r0
                int r7 = r7.getWidth()
                float r7 = (float) r7
                com.google.android.material.behavior.SwipeDismissBehavior r0 = com.google.android.material.behavior.SwipeDismissBehavior.this
                float r0 = r0.f27753g
                float r7 = r7 * r0
                int r7 = java.lang.Math.round(r7)
                int r8 = java.lang.Math.abs(r8)
                if (r8 < r7) goto L_0x004f
                r1 = 1
            L_0x004f:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.behavior.SwipeDismissBehavior.C5910a.m35385n(android.view.View, float):boolean");
        }

        /* renamed from: a */
        public int mo3555a(View view, int i, int i2) {
            int i3;
            int i4;
            int width;
            boolean z = C3774v.m16151B(view) == 1;
            int i5 = SwipeDismissBehavior.this.f27752f;
            if (i5 != 0) {
                if (i5 != 1) {
                    i3 = this.f27757a - view.getWidth();
                    i4 = view.getWidth() + this.f27757a;
                } else if (z) {
                    i3 = this.f27757a;
                    width = view.getWidth();
                } else {
                    i3 = this.f27757a - view.getWidth();
                    i4 = this.f27757a;
                }
                return SwipeDismissBehavior.m35373G(i3, i, i4);
            } else if (z) {
                i3 = this.f27757a - view.getWidth();
                i4 = this.f27757a;
                return SwipeDismissBehavior.m35373G(i3, i, i4);
            } else {
                i3 = this.f27757a;
                width = view.getWidth();
            }
            i4 = width + i3;
            return SwipeDismissBehavior.m35373G(i3, i, i4);
        }

        /* renamed from: b */
        public int mo3556b(View view, int i, int i2) {
            return view.getTop();
        }

        /* renamed from: d */
        public int mo3557d(View view) {
            return view.getWidth();
        }

        /* renamed from: i */
        public void mo3561i(View view, int i) {
            this.f27758b = i;
            this.f27757a = view.getLeft();
            ViewParent parent = view.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }

        /* renamed from: j */
        public void mo3562j(int i) {
            C5912c cVar = SwipeDismissBehavior.this.f27748b;
            if (cVar != null) {
                cVar.mo22970b(i);
            }
        }

        /* renamed from: k */
        public void mo3563k(View view, int i, int i2, int i3, int i4) {
            float width = ((float) this.f27757a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f27754h);
            float width2 = ((float) this.f27757a) + (((float) view.getWidth()) * SwipeDismissBehavior.this.f27755i);
            float f = (float) i;
            if (f <= width) {
                view.setAlpha(1.0f);
            } else if (f >= width2) {
                view.setAlpha(0.0f);
            } else {
                view.setAlpha(SwipeDismissBehavior.m35372F(0.0f, 1.0f - SwipeDismissBehavior.m35375I(width, width2, f), 1.0f));
            }
        }

        /* renamed from: l */
        public void mo3564l(View view, float f, float f2) {
            boolean z;
            int i;
            C5912c cVar;
            this.f27758b = -1;
            int width = view.getWidth();
            if (m35385n(view, f)) {
                int left = view.getLeft();
                int i2 = this.f27757a;
                i = left < i2 ? i2 - width : i2 + width;
                z = true;
            } else {
                i = this.f27757a;
                z = false;
            }
            if (SwipeDismissBehavior.this.f27747a.mo13291N(i, view.getTop())) {
                C3774v.m16201g0(view, new C5913d(view, z));
            } else if (z && (cVar = SwipeDismissBehavior.this.f27748b) != null) {
                cVar.mo22969a(view);
            }
        }

        /* renamed from: m */
        public boolean mo3565m(View view, int i) {
            int i2 = this.f27758b;
            return (i2 == -1 || i2 == i) && SwipeDismissBehavior.this.mo22964E(view);
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$b */
    class C5911b implements C3746f {
        C5911b() {
        }

        /* renamed from: a */
        public boolean mo6390a(View view, C3746f.C3747a aVar) {
            boolean z = false;
            if (!SwipeDismissBehavior.this.mo22964E(view)) {
                return false;
            }
            boolean z2 = C3774v.m16151B(view) == 1;
            int i = SwipeDismissBehavior.this.f27752f;
            if ((i == 0 && z2) || (i == 1 && !z2)) {
                z = true;
            }
            int width = view.getWidth();
            if (z) {
                width = -width;
            }
            C3774v.m16186Y(view, width);
            view.setAlpha(0.0f);
            C5912c cVar = SwipeDismissBehavior.this.f27748b;
            if (cVar != null) {
                cVar.mo22969a(view);
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$c */
    public interface C5912c {
        /* renamed from: a */
        void mo22969a(View view);

        /* renamed from: b */
        void mo22970b(int i);
    }

    /* renamed from: com.google.android.material.behavior.SwipeDismissBehavior$d */
    private class C5913d implements Runnable {

        /* renamed from: g */
        private final View f27761g;

        /* renamed from: h */
        private final boolean f27762h;

        C5913d(View view, boolean z) {
            this.f27761g = view;
            this.f27762h = z;
        }

        public void run() {
            C5912c cVar;
            C3808c cVar2 = SwipeDismissBehavior.this.f27747a;
            if (cVar2 != null && cVar2.mo13300n(true)) {
                C3774v.m16201g0(this.f27761g, this);
            } else if (this.f27762h && (cVar = SwipeDismissBehavior.this.f27748b) != null) {
                cVar.mo22969a(this.f27761g);
            }
        }
    }

    /* renamed from: F */
    static float m35372F(float f, float f2, float f3) {
        return Math.min(Math.max(f, f2), f3);
    }

    /* renamed from: G */
    static int m35373G(int i, int i2, int i3) {
        return Math.min(Math.max(i, i2), i3);
    }

    /* renamed from: H */
    private void m35374H(ViewGroup viewGroup) {
        C3808c cVar;
        if (this.f27747a == null) {
            if (this.f27751e) {
                cVar = C3808c.m16414o(viewGroup, this.f27750d, this.f27756j);
            } else {
                cVar = C3808c.m16415p(viewGroup, this.f27756j);
            }
            this.f27747a = cVar;
        }
    }

    /* renamed from: I */
    static float m35375I(float f, float f2, float f3) {
        return (f3 - f) / (f2 - f);
    }

    /* renamed from: N */
    private void m35376N(View view) {
        C3774v.m16205i0(view, 1048576);
        if (mo22964E(view)) {
            C3774v.m16209k0(view, C3736c.C3737a.f11799l, (CharSequence) null, new C5911b());
        }
    }

    /* renamed from: D */
    public boolean mo3050D(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        C3808c cVar = this.f27747a;
        if (cVar == null) {
            return false;
        }
        cVar.mo13287F(motionEvent);
        return true;
    }

    /* renamed from: E */
    public boolean mo22964E(View view) {
        return true;
    }

    /* renamed from: J */
    public void mo22965J(float f) {
        this.f27755i = m35372F(0.0f, f, 1.0f);
    }

    /* renamed from: K */
    public void mo22966K(C5912c cVar) {
        this.f27748b = cVar;
    }

    /* renamed from: L */
    public void mo22967L(float f) {
        this.f27754h = m35372F(0.0f, f, 1.0f);
    }

    /* renamed from: M */
    public void mo22968M(int i) {
        this.f27752f = i;
    }

    /* renamed from: k */
    public boolean mo3061k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        boolean z = this.f27749c;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            z = coordinatorLayout.mo2998F(v, (int) motionEvent.getX(), (int) motionEvent.getY());
            this.f27749c = z;
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.f27749c = false;
        }
        if (!z) {
            return false;
        }
        m35374H(coordinatorLayout);
        return this.f27747a.mo13292O(motionEvent);
    }

    /* renamed from: l */
    public boolean mo3062l(CoordinatorLayout coordinatorLayout, V v, int i) {
        boolean l = super.mo3062l(coordinatorLayout, v, i);
        if (C3774v.m16238z(v) == 0) {
            C3774v.m16237y0(v, 1);
            m35376N(v);
        }
        return l;
    }
}
