package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.util.List;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.p310r.C7516a;

@Deprecated
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public int f29242a = 0;

    /* renamed from: com.google.android.material.transformation.ExpandableBehavior$a */
    class C6278a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: g */
        final /* synthetic */ View f29243g;

        /* renamed from: h */
        final /* synthetic */ int f29244h;

        /* renamed from: i */
        final /* synthetic */ C7516a f29245i;

        C6278a(View view, int i, C7516a aVar) {
            this.f29243g = view;
            this.f29244h = i;
            this.f29245i = aVar;
        }

        public boolean onPreDraw() {
            this.f29243g.getViewTreeObserver().removeOnPreDrawListener(this);
            if (ExpandableBehavior.this.f29242a == this.f29244h) {
                ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                C7516a aVar = this.f29245i;
                expandableBehavior.mo25130H((View) aVar, this.f29243g, aVar.isExpanded(), false);
            }
            return false;
        }
    }

    public ExpandableBehavior() {
    }

    /* renamed from: F */
    private boolean m37439F(boolean z) {
        if (z) {
            int i = this.f29242a;
            return i == 0 || i == 2;
        } else if (this.f29242a == 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public C7516a mo25129G(CoordinatorLayout coordinatorLayout, View view) {
        List<View> v = coordinatorLayout.mo3042v(view);
        int size = v.size();
        for (int i = 0; i < size; i++) {
            View view2 = v.get(i);
            if (mo3055e(coordinatorLayout, view, view2)) {
                return (C7516a) view2;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public abstract boolean mo25130H(View view, View view2, boolean z, boolean z2);

    /* renamed from: h */
    public boolean mo3058h(CoordinatorLayout coordinatorLayout, View view, View view2) {
        C7516a aVar = (C7516a) view2;
        if (!m37439F(aVar.isExpanded())) {
            return false;
        }
        this.f29242a = aVar.isExpanded() ? 1 : 2;
        return mo25130H((View) aVar, view, aVar.isExpanded(), true);
    }

    /* renamed from: l */
    public boolean mo3062l(CoordinatorLayout coordinatorLayout, View view, int i) {
        C7516a G;
        if (C3774v.m16181T(view) || (G = mo25129G(coordinatorLayout, view)) == null || !m37439F(G.isExpanded())) {
            return false;
        }
        int i2 = G.isExpanded() ? 1 : 2;
        this.f29242a = i2;
        view.getViewTreeObserver().addOnPreDrawListener(new C6278a(view, i2, G));
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
