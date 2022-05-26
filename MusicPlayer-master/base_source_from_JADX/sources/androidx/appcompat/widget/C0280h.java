package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.core.widget.C0551g;
import p082e.p083a.C3409j;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.widget.h */
/* compiled from: AppCompatImageHelper */
public class C0280h {

    /* renamed from: a */
    private final ImageView f1296a;

    /* renamed from: b */
    private C0274e0 f1297b;

    /* renamed from: c */
    private C0274e0 f1298c;

    /* renamed from: d */
    private C0274e0 f1299d;

    public C0280h(ImageView imageView) {
        this.f1296a = imageView;
    }

    /* renamed from: a */
    private boolean m1648a(Drawable drawable) {
        if (this.f1299d == null) {
            this.f1299d = new C0274e0();
        }
        C0274e0 e0Var = this.f1299d;
        e0Var.mo1965a();
        ColorStateList a = C0551g.m3398a(this.f1296a);
        if (a != null) {
            e0Var.f1282d = true;
            e0Var.f1279a = a;
        }
        PorterDuff.Mode b = C0551g.m3399b(this.f1296a);
        if (b != null) {
            e0Var.f1281c = true;
            e0Var.f1280b = b;
        }
        if (!e0Var.f1282d && !e0Var.f1281c) {
            return false;
        }
        C0275f.m1607i(drawable, e0Var, this.f1296a.getDrawableState());
        return true;
    }

    /* renamed from: j */
    private boolean m1649j() {
        int i = Build.VERSION.SDK_INT;
        if (i <= 21) {
            return i == 21;
        }
        if (this.f1297b != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1996b() {
        Drawable drawable = this.f1296a.getDrawable();
        if (drawable != null) {
            C0303p.m1829b(drawable);
        }
        if (drawable == null) {
            return;
        }
        if (!m1649j() || !m1648a(drawable)) {
            C0274e0 e0Var = this.f1298c;
            if (e0Var != null) {
                C0275f.m1607i(drawable, e0Var, this.f1296a.getDrawableState());
                return;
            }
            C0274e0 e0Var2 = this.f1297b;
            if (e0Var2 != null) {
                C0275f.m1607i(drawable, e0Var2, this.f1296a.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public ColorStateList mo1997c() {
        C0274e0 e0Var = this.f1298c;
        if (e0Var != null) {
            return e0Var.f1279a;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public PorterDuff.Mode mo1998d() {
        C0274e0 e0Var = this.f1298c;
        if (e0Var != null) {
            return e0Var.f1280b;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo1999e() {
        return Build.VERSION.SDK_INT < 21 || !(this.f1296a.getBackground() instanceof RippleDrawable);
    }

    /* renamed from: f */
    public void mo2000f(AttributeSet attributeSet, int i) {
        int n;
        Context context = this.f1296a.getContext();
        int[] iArr = C3409j.AppCompatImageView;
        C0279g0 v = C0279g0.m1627v(context, attributeSet, iArr, i, 0);
        ImageView imageView = this.f1296a;
        C3774v.m16213m0(imageView, imageView.getContext(), iArr, attributeSet, v.mo1993r(), i, 0);
        try {
            Drawable drawable = this.f1296a.getDrawable();
            if (!(drawable != null || (n = v.mo1989n(C3409j.AppCompatImageView_srcCompat, -1)) == -1 || (drawable = C3410a.m14543d(this.f1296a.getContext(), n)) == null)) {
                this.f1296a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                C0303p.m1829b(drawable);
            }
            int i2 = C3409j.AppCompatImageView_tint;
            if (v.mo1994s(i2)) {
                C0551g.m3400c(this.f1296a, v.mo1978c(i2));
            }
            int i3 = C3409j.AppCompatImageView_tintMode;
            if (v.mo1994s(i3)) {
                C0551g.m3401d(this.f1296a, C0303p.m1832e(v.mo1986k(i3, -1), (PorterDuff.Mode) null));
            }
        } finally {
            v.mo1995w();
        }
    }

    /* renamed from: g */
    public void mo2001g(int i) {
        if (i != 0) {
            Drawable d = C3410a.m14543d(this.f1296a.getContext(), i);
            if (d != null) {
                C0303p.m1829b(d);
            }
            this.f1296a.setImageDrawable(d);
        } else {
            this.f1296a.setImageDrawable((Drawable) null);
        }
        mo1996b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2002h(ColorStateList colorStateList) {
        if (this.f1298c == null) {
            this.f1298c = new C0274e0();
        }
        C0274e0 e0Var = this.f1298c;
        e0Var.f1279a = colorStateList;
        e0Var.f1282d = true;
        mo1996b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2003i(PorterDuff.Mode mode) {
        if (this.f1298c == null) {
            this.f1298c = new C0274e0();
        }
        C0274e0 e0Var = this.f1298c;
        e0Var.f1280b = mode;
        e0Var.f1281c = true;
        mo1996b();
    }
}
