package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0534a;
import p082e.p083a.C3409j;
import p082e.p109h.p119p.C3774v;

/* renamed from: androidx.appcompat.widget.j */
/* compiled from: AppCompatSeekBarHelper */
class C0286j extends C0284i {

    /* renamed from: d */
    private final SeekBar f1325d;

    /* renamed from: e */
    private Drawable f1326e;

    /* renamed from: f */
    private ColorStateList f1327f = null;

    /* renamed from: g */
    private PorterDuff.Mode f1328g = null;

    /* renamed from: h */
    private boolean f1329h = false;

    /* renamed from: i */
    private boolean f1330i = false;

    C0286j(SeekBar seekBar) {
        super(seekBar);
        this.f1325d = seekBar;
    }

    /* renamed from: f */
    private void m1701f() {
        Drawable drawable = this.f1326e;
        if (drawable == null) {
            return;
        }
        if (this.f1329h || this.f1330i) {
            Drawable r = C0534a.m3292r(drawable.mutate());
            this.f1326e = r;
            if (this.f1329h) {
                C0534a.m3289o(r, this.f1327f);
            }
            if (this.f1330i) {
                C0534a.m3290p(this.f1326e, this.f1328g);
            }
            if (this.f1326e.isStateful()) {
                this.f1326e.setState(this.f1325d.getDrawableState());
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2044c(AttributeSet attributeSet, int i) {
        super.mo2044c(attributeSet, i);
        Context context = this.f1325d.getContext();
        int[] iArr = C3409j.AppCompatSeekBar;
        C0279g0 v = C0279g0.m1627v(context, attributeSet, iArr, i, 0);
        SeekBar seekBar = this.f1325d;
        C3774v.m16213m0(seekBar, seekBar.getContext(), iArr, attributeSet, v.mo1993r(), i, 0);
        Drawable h = v.mo1983h(C3409j.AppCompatSeekBar_android_thumb);
        if (h != null) {
            this.f1325d.setThumb(h);
        }
        mo2048j(v.mo1982g(C3409j.AppCompatSeekBar_tickMark));
        int i2 = C3409j.AppCompatSeekBar_tickMarkTintMode;
        if (v.mo1994s(i2)) {
            this.f1328g = C0303p.m1832e(v.mo1986k(i2, -1), this.f1328g);
            this.f1330i = true;
        }
        int i3 = C3409j.AppCompatSeekBar_tickMarkTint;
        if (v.mo1994s(i3)) {
            this.f1327f = v.mo1978c(i3);
            this.f1329h = true;
        }
        v.mo1995w();
        m1701f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2045g(Canvas canvas) {
        if (this.f1326e != null) {
            int max = this.f1325d.getMax();
            int i = 1;
            if (max > 1) {
                int intrinsicWidth = this.f1326e.getIntrinsicWidth();
                int intrinsicHeight = this.f1326e.getIntrinsicHeight();
                int i2 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                if (intrinsicHeight >= 0) {
                    i = intrinsicHeight / 2;
                }
                this.f1326e.setBounds(-i2, -i, i2, i);
                float width = ((float) ((this.f1325d.getWidth() - this.f1325d.getPaddingLeft()) - this.f1325d.getPaddingRight())) / ((float) max);
                int save = canvas.save();
                canvas.translate((float) this.f1325d.getPaddingLeft(), (float) (this.f1325d.getHeight() / 2));
                for (int i3 = 0; i3 <= max; i3++) {
                    this.f1326e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(save);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2046h() {
        Drawable drawable = this.f1326e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f1325d.getDrawableState())) {
            this.f1325d.invalidateDrawable(drawable);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public void mo2047i() {
        Drawable drawable = this.f1326e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2048j(Drawable drawable) {
        Drawable drawable2 = this.f1326e;
        if (drawable2 != null) {
            drawable2.setCallback((Drawable.Callback) null);
        }
        this.f1326e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f1325d);
            C0534a.m3287m(drawable, C3774v.m16151B(this.f1325d));
            if (drawable.isStateful()) {
                drawable.setState(this.f1325d.getDrawableState());
            }
            m1701f();
        }
        this.f1325d.invalidate();
    }
}
