package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7500l;

/* renamed from: com.google.android.material.internal.s */
/* compiled from: ViewUtils */
public class C6100s {

    /* renamed from: com.google.android.material.internal.s$a */
    /* compiled from: ViewUtils */
    static class C6101a implements C6104d {

        /* renamed from: a */
        final /* synthetic */ boolean f28545a;

        /* renamed from: b */
        final /* synthetic */ boolean f28546b;

        /* renamed from: c */
        final /* synthetic */ boolean f28547c;

        /* renamed from: d */
        final /* synthetic */ C6104d f28548d;

        C6101a(boolean z, boolean z2, boolean z3, C6104d dVar) {
            this.f28545a = z;
            this.f28546b = z2;
            this.f28547c = z3;
            this.f28548d = dVar;
        }

        /* renamed from: a */
        public C3718d0 mo23008a(View view, C3718d0 d0Var, C6105e eVar) {
            if (this.f28545a) {
                eVar.f28554d += d0Var.mo13035i();
            }
            boolean h = C6100s.m36587h(view);
            if (this.f28546b) {
                if (h) {
                    eVar.f28553c += d0Var.mo13036j();
                } else {
                    eVar.f28551a += d0Var.mo13036j();
                }
            }
            if (this.f28547c) {
                if (h) {
                    eVar.f28551a += d0Var.mo13037k();
                } else {
                    eVar.f28553c += d0Var.mo13037k();
                }
            }
            eVar.mo24239a(view);
            C6104d dVar = this.f28548d;
            return dVar != null ? dVar.mo23008a(view, d0Var, eVar) : d0Var;
        }
    }

    /* renamed from: com.google.android.material.internal.s$b */
    /* compiled from: ViewUtils */
    static class C6102b implements C3769q {

        /* renamed from: a */
        final /* synthetic */ C6104d f28549a;

        /* renamed from: b */
        final /* synthetic */ C6105e f28550b;

        C6102b(C6104d dVar, C6105e eVar) {
            this.f28549a = dVar;
            this.f28550b = eVar;
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            return this.f28549a.mo23008a(view, d0Var, new C6105e(this.f28550b));
        }
    }

    /* renamed from: com.google.android.material.internal.s$c */
    /* compiled from: ViewUtils */
    static class C6103c implements View.OnAttachStateChangeListener {
        C6103c() {
        }

        public void onViewAttachedToWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
            C3774v.m16211l0(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* renamed from: com.google.android.material.internal.s$d */
    /* compiled from: ViewUtils */
    public interface C6104d {
        /* renamed from: a */
        C3718d0 mo23008a(View view, C3718d0 d0Var, C6105e eVar);
    }

    /* renamed from: a */
    public static void m36580a(View view, AttributeSet attributeSet, int i, int i2, C6104d dVar) {
        TypedArray obtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, C7500l.Insets, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(C7500l.Insets_paddingBottomSystemWindowInsets, false);
        boolean z2 = obtainStyledAttributes.getBoolean(C7500l.Insets_paddingLeftSystemWindowInsets, false);
        boolean z3 = obtainStyledAttributes.getBoolean(C7500l.Insets_paddingRightSystemWindowInsets, false);
        obtainStyledAttributes.recycle();
        m36581b(view, new C6101a(z, z2, z3, dVar));
    }

    /* renamed from: b */
    public static void m36581b(View view, C6104d dVar) {
        C3774v.m16154C0(view, new C6102b(dVar, new C6105e(C3774v.m16161G(view), view.getPaddingTop(), C3774v.m16159F(view), view.getPaddingBottom())));
        m36589j(view);
    }

    /* renamed from: c */
    public static float m36582c(Context context, int i) {
        return TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: d */
    public static ViewGroup m36583d(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    /* renamed from: e */
    public static C6099r m36584e(View view) {
        return m36585f(m36583d(view));
    }

    /* renamed from: f */
    public static C6099r m36585f(View view) {
        if (view == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 18) {
            return new C6098q(view);
        }
        return C6096p.m36568c(view);
    }

    /* renamed from: g */
    public static float m36586g(View view) {
        float f = 0.0f;
        for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
            f += C3774v.m16232w((View) parent);
        }
        return f;
    }

    /* renamed from: h */
    public static boolean m36587h(View view) {
        return C3774v.m16151B(view) == 1;
    }

    /* renamed from: i */
    public static PorterDuff.Mode m36588i(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    /* renamed from: j */
    public static void m36589j(View view) {
        if (C3774v.m16180S(view)) {
            C3774v.m16211l0(view);
        } else {
            view.addOnAttachStateChangeListener(new C6103c());
        }
    }

    /* renamed from: com.google.android.material.internal.s$e */
    /* compiled from: ViewUtils */
    public static class C6105e {

        /* renamed from: a */
        public int f28551a;

        /* renamed from: b */
        public int f28552b;

        /* renamed from: c */
        public int f28553c;

        /* renamed from: d */
        public int f28554d;

        public C6105e(int i, int i2, int i3, int i4) {
            this.f28551a = i;
            this.f28552b = i2;
            this.f28553c = i3;
            this.f28554d = i4;
        }

        /* renamed from: a */
        public void mo24239a(View view) {
            C3774v.m16156D0(view, this.f28551a, this.f28552b, this.f28553c, this.f28554d);
        }

        public C6105e(C6105e eVar) {
            this.f28551a = eVar.f28551a;
            this.f28552b = eVar.f28552b;
            this.f28553c = eVar.f28553c;
            this.f28554d = eVar.f28554d;
        }
    }
}
