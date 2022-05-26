package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.widget.d */
/* compiled from: AppCompatBackgroundHelper */
class C0271d {

    /* renamed from: a */
    private final View f1263a;

    /* renamed from: b */
    private final C0275f f1264b;

    /* renamed from: c */
    private int f1265c = -1;

    /* renamed from: d */
    private C0274e0 f1266d;

    /* renamed from: e */
    private C0274e0 f1267e;

    /* renamed from: f */
    private C0274e0 f1268f;

    C0271d(View view) {
        this.f1263a = view;
        this.f1264b = C0275f.m1604b();
    }

    /* renamed from: a */
    private boolean m1581a(Drawable drawable) {
        if (this.f1268f == null) {
            this.f1268f = new C0274e0();
        }
        C0274e0 e0Var = this.f1268f;
        e0Var.mo1965a();
        ColorStateList s = C3774v.m16224s(this.f1263a);
        if (s != null) {
            e0Var.f1282d = true;
            e0Var.f1279a = s;
        }
        PorterDuff.Mode t = C3774v.m16226t(this.f1263a);
        if (t != null) {
            e0Var.f1281c = true;
            e0Var.f1280b = t;
        }
        if (!e0Var.f1282d && !e0Var.f1281c) {
            return false;
        }
        C0275f.m1607i(drawable, e0Var, this.f1263a.getDrawableState());
        return true;
    }

    /* renamed from: k */
    private boolean m1582k() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1266d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1944b() {
        Drawable background = this.f1263a.getBackground();
        if (background == null) {
            return;
        }
        if (!m1582k() || !m1581a(background)) {
            C0274e0 e0Var = this.f1267e;
            if (e0Var != null) {
                C0275f.m1607i(background, e0Var, this.f1263a.getDrawableState());
                return;
            }
            C0274e0 e0Var2 = this.f1266d;
            if (e0Var2 != null) {
                C0275f.m1607i(background, e0Var2, this.f1263a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1945c() {
        C0274e0 e0Var = this.f1267e;
        if (e0Var != null) {
            return e0Var.f1279a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1946d() {
        C0274e0 e0Var = this.f1267e;
        if (e0Var != null) {
            return e0Var.f1280b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo1947e(AttributeSet attributeSet, int i) {
        Context context = this.f1263a.getContext();
        int[] iArr = C3409j.ViewBackgroundHelper;
        C0279g0 v = C0279g0.m1627v(context, attributeSet, iArr, i, 0);
        View view = this.f1263a;
        C3774v.m16213m0(view, view.getContext(), iArr, attributeSet, v.mo1993r(), i, 0);
        try {
            int i2 = C3409j.ViewBackgroundHelper_android_background;
            if (v.mo1994s(i2)) {
                this.f1265c = v.mo1989n(i2, -1);
                ColorStateList f = this.f1264b.mo1968f(this.f1263a.getContext(), this.f1265c);
                if (f != null) {
                    mo1950h(f);
                }
            }
            int i3 = C3409j.ViewBackgroundHelper_backgroundTint;
            if (v.mo1994s(i3)) {
                C3774v.m16225s0(this.f1263a, v.mo1978c(i3));
            }
            int i4 = C3409j.ViewBackgroundHelper_backgroundTintMode;
            if (v.mo1994s(i4)) {
                C3774v.m16227t0(this.f1263a, C0303p.m1832e(v.mo1986k(i4, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo1995w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo1948f(Drawable drawable) {
        this.f1265c = -1;
        mo1950h((ColorStateList) null);
        mo1944b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo1949g(int i) {
        this.f1265c = i;
        C0275f fVar = this.f1264b;
        mo1950h(fVar != null ? fVar.mo1968f(this.f1263a.getContext(), i) : null);
        mo1944b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo1950h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f1266d == null) {
                this.f1266d = new C0274e0();
            }
            C0274e0 e0Var = this.f1266d;
            e0Var.f1279a = colorStateList;
            e0Var.f1282d = true;
        } else {
            this.f1266d = null;
        }
        mo1944b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo1951i(ColorStateList colorStateList) {
        if (this.f1267e == null) {
            this.f1267e = new C0274e0();
        }
        C0274e0 e0Var = this.f1267e;
        e0Var.f1279a = colorStateList;
        e0Var.f1282d = true;
        mo1944b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo1952j(PorterDuff.Mode mode) {
        if (this.f1267e == null) {
            this.f1267e = new C0274e0();
        }
        C0274e0 e0Var = this.f1267e;
        e0Var.f1280b = mode;
        e0Var.f1281c = true;
        mo1944b();
    }
}
