package p082e.p109h.p119p;

import android.view.View;
import android.view.ViewGroup;

/* renamed from: e.h.p.p */
/* compiled from: NestedScrollingParentHelper */
public class C3768p {

    /* renamed from: a */
    private int f11825a;

    /* renamed from: b */
    private int f11826b;

    public C3768p(ViewGroup viewGroup) {
    }

    /* renamed from: a */
    public int mo13188a() {
        return this.f11825a | this.f11826b;
    }

    /* renamed from: b */
    public void mo13189b(View view, View view2, int i) {
        mo13190c(view, view2, i, 0);
    }

    /* renamed from: c */
    public void mo13190c(View view, View view2, int i, int i2) {
        if (i2 == 1) {
            this.f11826b = i;
        } else {
            this.f11825a = i;
        }
    }

    /* renamed from: d */
    public void mo13191d(View view) {
        mo13192e(view, 0);
    }

    /* renamed from: e */
    public void mo13192e(View view, int i) {
        if (i == 1) {
            this.f11826b = 0;
        } else {
            this.f11825a = 0;
        }
    }
}
