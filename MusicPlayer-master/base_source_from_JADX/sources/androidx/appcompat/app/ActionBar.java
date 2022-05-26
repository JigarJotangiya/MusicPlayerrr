package androidx.appcompat.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import p082e.p083a.C3409j;
import p082e.p083a.p090o.C3432b;

public abstract class ActionBar {

    /* renamed from: androidx.appcompat.app.ActionBar$a */
    public interface C0086a {
        /* renamed from: a */
        void mo428a(boolean z);
    }

    @Deprecated
    /* renamed from: androidx.appcompat.app.ActionBar$b */
    public static abstract class C0087b {
        /* renamed from: a */
        public abstract CharSequence mo429a();

        /* renamed from: b */
        public abstract View mo430b();

        /* renamed from: c */
        public abstract Drawable mo431c();

        /* renamed from: d */
        public abstract CharSequence mo432d();

        /* renamed from: e */
        public abstract void mo433e();
    }

    /* renamed from: A */
    public abstract void mo405A();

    /* renamed from: B */
    public C3432b mo406B(C3432b.C3433a aVar) {
        return null;
    }

    /* renamed from: f */
    public boolean mo407f() {
        return false;
    }

    /* renamed from: g */
    public abstract boolean mo408g();

    /* renamed from: h */
    public abstract void mo409h(boolean z);

    /* renamed from: i */
    public abstract int mo410i();

    /* renamed from: j */
    public abstract Context mo411j();

    /* renamed from: k */
    public abstract void mo412k();

    /* renamed from: l */
    public boolean mo413l() {
        return false;
    }

    /* renamed from: m */
    public void mo414m(Configuration configuration) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo415n() {
    }

    /* renamed from: o */
    public abstract boolean mo416o(int i, KeyEvent keyEvent);

    /* renamed from: p */
    public boolean mo417p(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: q */
    public boolean mo418q() {
        return false;
    }

    /* renamed from: r */
    public abstract void mo419r(boolean z);

    /* renamed from: s */
    public abstract void mo420s(boolean z);

    /* renamed from: t */
    public abstract void mo421t(boolean z);

    /* renamed from: u */
    public abstract void mo422u(int i);

    /* renamed from: v */
    public abstract void mo423v(boolean z);

    /* renamed from: w */
    public abstract void mo424w(boolean z);

    /* renamed from: x */
    public abstract void mo425x(int i);

    /* renamed from: y */
    public abstract void mo426y(CharSequence charSequence);

    /* renamed from: z */
    public abstract void mo427z(CharSequence charSequence);

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: a */
        public int f234a;

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f234a = 0;
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3409j.ActionBarLayout);
            this.f234a = obtainStyledAttributes.getInt(C3409j.ActionBarLayout_android_layout_gravity, 0);
            obtainStyledAttributes.recycle();
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f234a = 0;
            this.f234a = 8388627;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f234a = 0;
            this.f234a = layoutParams.f234a;
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f234a = 0;
        }
    }
}
