package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p082e.p109h.p110h.C3621a;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7553n;

/* renamed from: com.google.android.material.floatingactionbutton.c */
/* compiled from: BorderDrawable */
class C6034c extends Drawable {

    /* renamed from: a */
    private final C7553n f28276a = C7553n.m42215k();

    /* renamed from: b */
    private final Paint f28277b;

    /* renamed from: c */
    private final Path f28278c = new Path();

    /* renamed from: d */
    private final Rect f28279d = new Rect();

    /* renamed from: e */
    private final RectF f28280e = new RectF();

    /* renamed from: f */
    private final RectF f28281f = new RectF();

    /* renamed from: g */
    private final C6036b f28282g = new C6036b();

    /* renamed from: h */
    float f28283h;

    /* renamed from: i */
    private int f28284i;

    /* renamed from: j */
    private int f28285j;

    /* renamed from: k */
    private int f28286k;

    /* renamed from: l */
    private int f28287l;

    /* renamed from: m */
    private int f28288m;

    /* renamed from: n */
    private boolean f28289n = true;

    /* renamed from: o */
    private C7549m f28290o;

    /* renamed from: p */
    private ColorStateList f28291p;

    /* renamed from: com.google.android.material.floatingactionbutton.c$b */
    /* compiled from: BorderDrawable */
    private class C6036b extends Drawable.ConstantState {
        private C6036b() {
        }

        public int getChangingConfigurations() {
            return 0;
        }

        public Drawable newDrawable() {
            return C6034c.this;
        }
    }

    C6034c(C7549m mVar) {
        this.f28290o = mVar;
        Paint paint = new Paint(1);
        this.f28277b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    /* renamed from: a */
    private Shader m36242a() {
        Rect rect = this.f28279d;
        copyBounds(rect);
        float height = this.f28283h / ((float) rect.height());
        return new LinearGradient(0.0f, (float) rect.top, 0.0f, (float) rect.bottom, new int[]{C3621a.m15591i(this.f28284i, this.f28288m), C3621a.m15591i(this.f28285j, this.f28288m), C3621a.m15591i(C3621a.m15595m(this.f28285j, 0), this.f28288m), C3621a.m15591i(C3621a.m15595m(this.f28287l, 0), this.f28288m), C3621a.m15591i(this.f28287l, this.f28288m), C3621a.m15591i(this.f28286k, this.f28288m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public RectF mo23924b() {
        this.f28281f.set(getBounds());
        return this.f28281f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo23925c(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f28288m = colorStateList.getColorForState(getState(), this.f28288m);
        }
        this.f28291p = colorStateList;
        this.f28289n = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public void mo23926d(float f) {
        if (this.f28283h != f) {
            this.f28283h = f;
            this.f28277b.setStrokeWidth(f * 1.3333f);
            this.f28289n = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (this.f28289n) {
            this.f28277b.setShader(m36242a());
            this.f28289n = false;
        }
        float strokeWidth = this.f28277b.getStrokeWidth() / 2.0f;
        copyBounds(this.f28279d);
        this.f28280e.set(this.f28279d);
        float min = Math.min(this.f28290o.mo28508r().mo28437a(mo23924b()), this.f28280e.width() / 2.0f);
        if (this.f28290o.mo28511u(mo23924b())) {
            this.f28280e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f28280e, min, min, this.f28277b);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo23928e(int i, int i2, int i3, int i4) {
        this.f28284i = i;
        this.f28285j = i2;
        this.f28286k = i3;
        this.f28287l = i4;
    }

    /* renamed from: f */
    public void mo23929f(C7549m mVar) {
        this.f28290o = mVar;
        invalidateSelf();
    }

    public Drawable.ConstantState getConstantState() {
        return this.f28282g;
    }

    public int getOpacity() {
        return this.f28283h > 0.0f ? -3 : -2;
    }

    @TargetApi(21)
    public void getOutline(Outline outline) {
        if (this.f28290o.mo28511u(mo23924b())) {
            outline.setRoundRect(getBounds(), this.f28290o.mo28508r().mo28437a(mo23924b()));
            return;
        }
        copyBounds(this.f28279d);
        this.f28280e.set(this.f28279d);
        this.f28276a.mo28539d(this.f28290o, 1.0f, this.f28280e, this.f28278c);
        if (this.f28278c.isConvex()) {
            outline.setConvexPath(this.f28278c);
        }
    }

    public boolean getPadding(Rect rect) {
        if (!this.f28290o.mo28511u(mo23924b())) {
            return true;
        }
        int round = Math.round(this.f28283h);
        rect.set(round, round, round, round);
        return true;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f28291p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f28289n = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f28291p;
        if (!(colorStateList == null || (colorForState = colorStateList.getColorForState(iArr, this.f28288m)) == this.f28288m)) {
            this.f28289n = true;
            this.f28288m = colorForState;
        }
        if (this.f28289n) {
            invalidateSelf();
        }
        return this.f28289n;
    }

    public void setAlpha(int i) {
        this.f28277b.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f28277b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
