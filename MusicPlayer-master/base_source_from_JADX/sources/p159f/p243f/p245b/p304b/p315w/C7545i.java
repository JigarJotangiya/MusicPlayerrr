package p159f.p243f.p245b.p304b.p315w;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.internal.C6100s;

/* renamed from: f.f.b.b.w.i */
/* compiled from: MaterialShapeUtils */
public class C7545i {
    /* renamed from: a */
    static C7537d m42135a(int i) {
        if (i == 0) {
            return new C7548l();
        }
        if (i != 1) {
            return m42136b();
        }
        return new C7538e();
    }

    /* renamed from: b */
    static C7537d m42136b() {
        return new C7548l();
    }

    /* renamed from: c */
    static C7539f m42137c() {
        return new C7539f();
    }

    /* renamed from: d */
    public static void m42138d(View view, float f) {
        Drawable background = view.getBackground();
        if (background instanceof C7541h) {
            ((C7541h) background).mo28462Z(f);
        }
    }

    /* renamed from: e */
    public static void m42139e(View view) {
        Drawable background = view.getBackground();
        if (background instanceof C7541h) {
            m42140f(view, (C7541h) background);
        }
    }

    /* renamed from: f */
    public static void m42140f(View view, C7541h hVar) {
        if (hVar.mo28457R()) {
            hVar.mo28467e0(C6100s.m36586g(view));
        }
    }
}
