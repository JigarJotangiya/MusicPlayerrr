package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3769q;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;

public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: g */
    Drawable f28398g;

    /* renamed from: h */
    Rect f28399h;

    /* renamed from: i */
    private Rect f28400i;

    /* renamed from: j */
    private boolean f28401j;

    /* renamed from: k */
    private boolean f28402k;

    /* renamed from: com.google.android.material.internal.ScrimInsetsFrameLayout$a */
    class C6060a implements C3769q {
        C6060a() {
        }

        /* renamed from: a */
        public C3718d0 mo580a(View view, C3718d0 d0Var) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f28399h == null) {
                scrimInsetsFrameLayout.f28399h = new Rect();
            }
            ScrimInsetsFrameLayout.this.f28399h.set(d0Var.mo13036j(), d0Var.mo13038l(), d0Var.mo13037k(), d0Var.mo13035i());
            ScrimInsetsFrameLayout.this.mo24102a(d0Var);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!d0Var.mo13039m() || ScrimInsetsFrameLayout.this.f28398g == null);
            C3774v.m16197e0(ScrimInsetsFrameLayout.this);
            return d0Var.mo13027c();
        }
    }

    public ScrimInsetsFrameLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24102a(C3718d0 d0Var) {
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f28399h != null && this.f28398g != null) {
            int save = canvas.save();
            canvas.translate((float) getScrollX(), (float) getScrollY());
            if (this.f28401j) {
                this.f28400i.set(0, 0, width, this.f28399h.top);
                this.f28398g.setBounds(this.f28400i);
                this.f28398g.draw(canvas);
            }
            if (this.f28402k) {
                this.f28400i.set(0, height - this.f28399h.bottom, width, height);
                this.f28398g.setBounds(this.f28400i);
                this.f28398g.draw(canvas);
            }
            Rect rect = this.f28400i;
            Rect rect2 = this.f28399h;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f28398g.setBounds(this.f28400i);
            this.f28398g.draw(canvas);
            Rect rect3 = this.f28400i;
            Rect rect4 = this.f28399h;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f28398g.setBounds(this.f28400i);
            this.f28398g.draw(canvas);
            canvas.restoreToCount(save);
        }
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f28398g;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f28398g;
        if (drawable != null) {
            drawable.setCallback((Drawable.Callback) null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z) {
        this.f28402k = z;
    }

    public void setDrawTopInsetForeground(boolean z) {
        this.f28401j = z;
    }

    public void setScrimInsetForeground(Drawable drawable) {
        this.f28398g = drawable;
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f28400i = new Rect();
        this.f28401j = true;
        this.f28402k = true;
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.ScrimInsetsFrameLayout, i, C7499k.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f28398g = h.getDrawable(C7500l.ScrimInsetsFrameLayout_insetForeground);
        h.recycle();
        setWillNotDraw(true);
        C3774v.m16154C0(this, new C6060a());
    }
}
