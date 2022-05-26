package androidx.recyclerview.widget;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import p082e.p109h.p119p.C3774v;
import p082e.p147t.C4134c;

/* renamed from: androidx.recyclerview.widget.n */
/* compiled from: ItemTouchUIUtilImpl */
class C0899n implements C0898m {

    /* renamed from: a */
    static final C0898m f4028a = new C0899n();

    C0899n() {
    }

    /* renamed from: e */
    private static float m5509e(RecyclerView recyclerView, View view) {
        int childCount = recyclerView.getChildCount();
        float f = 0.0f;
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            if (childAt != view) {
                float w = C3774v.m16232w(childAt);
                if (w > f) {
                    f = w;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public void mo5361a(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            int i = C4134c.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                C3774v.m16231v0(view, ((Float) tag).floatValue());
            }
            view.setTag(i, (Object) null);
        }
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
    }

    /* renamed from: b */
    public void mo5362b(View view) {
    }

    /* renamed from: c */
    public void mo5363c(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
    }

    /* renamed from: d */
    public void mo5364d(Canvas canvas, RecyclerView recyclerView, View view, float f, float f2, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 21 && z) {
            int i2 = C4134c.item_touch_helper_previous_elevation;
            if (view.getTag(i2) == null) {
                Float valueOf = Float.valueOf(C3774v.m16232w(view));
                C3774v.m16231v0(view, m5509e(recyclerView, view) + 1.0f);
                view.setTag(i2, valueOf);
            }
        }
        view.setTranslationX(f);
        view.setTranslationY(f2);
    }
}
