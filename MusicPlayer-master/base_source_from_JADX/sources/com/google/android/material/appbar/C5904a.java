package com.google.android.material.appbar;

import android.view.View;
import p082e.p109h.p119p.C3774v;

/* renamed from: com.google.android.material.appbar.a */
/* compiled from: ViewOffsetHelper */
class C5904a {

    /* renamed from: a */
    private final View f27698a;

    /* renamed from: b */
    private int f27699b;

    /* renamed from: c */
    private int f27700c;

    /* renamed from: d */
    private int f27701d;

    /* renamed from: e */
    private int f27702e;

    /* renamed from: f */
    private boolean f27703f = true;

    /* renamed from: g */
    private boolean f27704g = true;

    public C5904a(View view) {
        this.f27698a = view;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo22919a() {
        View view = this.f27698a;
        C3774v.m16187Z(view, this.f27701d - (view.getTop() - this.f27699b));
        View view2 = this.f27698a;
        C3774v.m16186Y(view2, this.f27702e - (view2.getLeft() - this.f27700c));
    }

    /* renamed from: b */
    public int mo22920b() {
        return this.f27699b;
    }

    /* renamed from: c */
    public int mo22921c() {
        return this.f27701d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo22922d() {
        this.f27699b = this.f27698a.getTop();
        this.f27700c = this.f27698a.getLeft();
    }

    /* renamed from: e */
    public boolean mo22923e(int i) {
        if (!this.f27704g || this.f27702e == i) {
            return false;
        }
        this.f27702e = i;
        mo22919a();
        return true;
    }

    /* renamed from: f */
    public boolean mo22924f(int i) {
        if (!this.f27703f || this.f27701d == i) {
            return false;
        }
        this.f27701d = i;
        mo22919a();
        return true;
    }
}
