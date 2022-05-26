package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

class ViewOffsetBehavior<V extends View> extends CoordinatorLayout.Behavior<V> {

    /* renamed from: a */
    private C5904a f27695a;

    /* renamed from: b */
    private int f27696b = 0;

    /* renamed from: c */
    private int f27697c = 0;

    public ViewOffsetBehavior() {
    }

    /* renamed from: E */
    public int mo22917E() {
        C5904a aVar = this.f27695a;
        if (aVar != null) {
            return aVar.mo22921c();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: F */
    public void mo22906F(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.mo3001M(v, i);
    }

    /* renamed from: G */
    public boolean mo22918G(int i) {
        C5904a aVar = this.f27695a;
        if (aVar != null) {
            return aVar.mo22924f(i);
        }
        this.f27696b = i;
        return false;
    }

    /* renamed from: l */
    public boolean mo3062l(CoordinatorLayout coordinatorLayout, V v, int i) {
        mo22906F(coordinatorLayout, v, i);
        if (this.f27695a == null) {
            this.f27695a = new C5904a(v);
        }
        this.f27695a.mo22922d();
        this.f27695a.mo22919a();
        int i2 = this.f27696b;
        if (i2 != 0) {
            this.f27695a.mo22924f(i2);
            this.f27696b = 0;
        }
        int i3 = this.f27697c;
        if (i3 == 0) {
            return true;
        }
        this.f27695a.mo22923e(i3);
        this.f27697c = 0;
        return true;
    }

    public ViewOffsetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
