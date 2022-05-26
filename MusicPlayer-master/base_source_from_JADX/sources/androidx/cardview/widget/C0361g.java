package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import p082e.p097d.C3461b;
import p082e.p097d.C3462c;

/* renamed from: androidx.cardview.widget.g */
/* compiled from: RoundRectDrawableWithShadow */
class C0361g extends Drawable {

    /* renamed from: q */
    private static final double f1537q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r */
    static C0362a f1538r;

    /* renamed from: a */
    private final int f1539a;

    /* renamed from: b */
    private Paint f1540b;

    /* renamed from: c */
    private Paint f1541c;

    /* renamed from: d */
    private Paint f1542d;

    /* renamed from: e */
    private final RectF f1543e;

    /* renamed from: f */
    private float f1544f;

    /* renamed from: g */
    private Path f1545g;

    /* renamed from: h */
    private float f1546h;

    /* renamed from: i */
    private float f1547i;

    /* renamed from: j */
    private float f1548j;

    /* renamed from: k */
    private ColorStateList f1549k;

    /* renamed from: l */
    private boolean f1550l = true;

    /* renamed from: m */
    private final int f1551m;

    /* renamed from: n */
    private final int f1552n;

    /* renamed from: o */
    private boolean f1553o = true;

    /* renamed from: p */
    private boolean f1554p = false;

    /* renamed from: androidx.cardview.widget.g$a */
    /* compiled from: RoundRectDrawableWithShadow */
    interface C0362a {
        /* renamed from: a */
        void mo2315a(Canvas canvas, RectF rectF, float f, Paint paint);
    }

    C0361g(Resources resources, ColorStateList colorStateList, float f, float f2, float f3) {
        this.f1551m = resources.getColor(C3461b.cardview_shadow_start_color);
        this.f1552n = resources.getColor(C3461b.cardview_shadow_end_color);
        this.f1539a = resources.getDimensionPixelSize(C3462c.cardview_compat_inset_shadow);
        this.f1540b = new Paint(5);
        m2049n(colorStateList);
        Paint paint = new Paint(5);
        this.f1541c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1544f = (float) ((int) (f + 0.5f));
        this.f1543e = new RectF();
        Paint paint2 = new Paint(this.f1541c);
        this.f1542d = paint2;
        paint2.setAntiAlias(false);
        m2050s(f2, f3);
    }

    /* renamed from: a */
    private void m2044a(Rect rect) {
        float f = this.f1546h;
        float f2 = 1.5f * f;
        this.f1543e.set(((float) rect.left) + f, ((float) rect.top) + f2, ((float) rect.right) - f, ((float) rect.bottom) - f2);
        m2045b();
    }

    /* renamed from: b */
    private void m2045b() {
        float f = this.f1544f;
        RectF rectF = new RectF(-f, -f, f, f);
        RectF rectF2 = new RectF(rectF);
        float f2 = this.f1547i;
        rectF2.inset(-f2, -f2);
        Path path = this.f1545g;
        if (path == null) {
            this.f1545g = new Path();
        } else {
            path.reset();
        }
        this.f1545g.setFillType(Path.FillType.EVEN_ODD);
        this.f1545g.moveTo(-this.f1544f, 0.0f);
        this.f1545g.rLineTo(-this.f1547i, 0.0f);
        this.f1545g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1545g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1545g.close();
        float f3 = this.f1544f;
        float f4 = f3 / (this.f1547i + f3);
        Paint paint = this.f1541c;
        float f5 = this.f1544f + this.f1547i;
        int i = this.f1551m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f5, new int[]{i, i, this.f1552n}, new float[]{0.0f, f4, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1542d;
        float f6 = this.f1544f;
        float f7 = this.f1547i;
        int i2 = this.f1551m;
        paint2.setShader(new LinearGradient(0.0f, (-f6) + f7, 0.0f, (-f6) - f7, new int[]{i2, i2, this.f1552n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1542d.setAntiAlias(false);
    }

    /* renamed from: c */
    static float m2046c(float f, float f2, boolean z) {
        return z ? (float) (((double) f) + ((1.0d - f1537q) * ((double) f2))) : f;
    }

    /* renamed from: d */
    static float m2047d(float f, float f2, boolean z) {
        return z ? (float) (((double) (f * 1.5f)) + ((1.0d - f1537q) * ((double) f2))) : f * 1.5f;
    }

    /* renamed from: e */
    private void m2048e(Canvas canvas) {
        float f = this.f1544f;
        float f2 = (-f) - this.f1547i;
        float f3 = f + ((float) this.f1539a) + (this.f1548j / 2.0f);
        float f4 = f3 * 2.0f;
        boolean z = this.f1543e.width() - f4 > 0.0f;
        boolean z2 = this.f1543e.height() - f4 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1543e;
        canvas.translate(rectF.left + f3, rectF.top + f3);
        canvas.drawPath(this.f1545g, this.f1541c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1543e.width() - f4, -this.f1544f, this.f1542d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1543e;
        canvas.translate(rectF2.right - f3, rectF2.bottom - f3);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1545g, this.f1541c);
        if (z) {
            canvas.drawRect(0.0f, f2, this.f1543e.width() - f4, (-this.f1544f) + this.f1547i, this.f1542d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1543e;
        canvas.translate(rectF3.left + f3, rectF3.bottom - f3);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1545g, this.f1541c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1543e.height() - f4, -this.f1544f, this.f1542d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1543e;
        canvas.translate(rectF4.right - f3, rectF4.top + f3);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1545g, this.f1541c);
        if (z2) {
            canvas.drawRect(0.0f, f2, this.f1543e.height() - f4, -this.f1544f, this.f1542d);
        }
        canvas.restoreToCount(save4);
    }

    /* renamed from: n */
    private void m2049n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1549k = colorStateList;
        this.f1540b.setColor(colorStateList.getColorForState(getState(), this.f1549k.getDefaultColor()));
    }

    /* renamed from: s */
    private void m2050s(float f, float f2) {
        if (f < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f + ". Must be >= 0");
        } else if (f2 >= 0.0f) {
            float t = (float) m2051t(f);
            float t2 = (float) m2051t(f2);
            if (t > t2) {
                if (!this.f1554p) {
                    this.f1554p = true;
                }
                t = t2;
            }
            if (this.f1548j != t || this.f1546h != t2) {
                this.f1548j = t;
                this.f1546h = t2;
                this.f1547i = (float) ((int) ((t * 1.5f) + ((float) this.f1539a) + 0.5f));
                this.f1550l = true;
                invalidateSelf();
            }
        } else {
            throw new IllegalArgumentException("Invalid max shadow size " + f2 + ". Must be >= 0");
        }
    }

    /* renamed from: t */
    private int m2051t(float f) {
        int i = (int) (f + 0.5f);
        return i % 2 == 1 ? i - 1 : i;
    }

    public void draw(Canvas canvas) {
        if (this.f1550l) {
            m2044a(getBounds());
            this.f1550l = false;
        }
        canvas.translate(0.0f, this.f1548j / 2.0f);
        m2048e(canvas);
        canvas.translate(0.0f, (-this.f1548j) / 2.0f);
        f1538r.mo2315a(canvas, this.f1543e, this.f1544f, this.f1540b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public ColorStateList mo2347f() {
        return this.f1549k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public float mo2348g() {
        return this.f1544f;
    }

    public int getOpacity() {
        return -3;
    }

    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil((double) m2047d(this.f1546h, this.f1544f, this.f1553o));
        int ceil2 = (int) Math.ceil((double) m2046c(this.f1546h, this.f1544f, this.f1553o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2351h(Rect rect) {
        getPadding(rect);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public float mo2352i() {
        return this.f1546h;
    }

    public boolean isStateful() {
        ColorStateList colorStateList = this.f1549k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public float mo2354j() {
        float f = this.f1546h;
        return (Math.max(f, this.f1544f + ((float) this.f1539a) + ((f * 1.5f) / 2.0f)) * 2.0f) + (((this.f1546h * 1.5f) + ((float) this.f1539a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public float mo2355k() {
        float f = this.f1546h;
        return (Math.max(f, this.f1544f + ((float) this.f1539a) + (f / 2.0f)) * 2.0f) + ((this.f1546h + ((float) this.f1539a)) * 2.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public float mo2356l() {
        return this.f1548j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo2357m(boolean z) {
        this.f1553o = z;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo2358o(ColorStateList colorStateList) {
        m2049n(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1550l = true;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1549k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1540b.getColor() == colorForState) {
            return false;
        }
        this.f1540b.setColor(colorForState);
        this.f1550l = true;
        invalidateSelf();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo2361p(float f) {
        if (f >= 0.0f) {
            float f2 = (float) ((int) (f + 0.5f));
            if (this.f1544f != f2) {
                this.f1544f = f2;
                this.f1550l = true;
                invalidateSelf();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Invalid radius " + f + ". Must be >= 0");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public void mo2362q(float f) {
        m2050s(this.f1548j, f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo2363r(float f) {
        m2050s(f, this.f1546h);
    }

    public void setAlpha(int i) {
        this.f1540b.setAlpha(i);
        this.f1541c.setAlpha(i);
        this.f1542d.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1540b.setColorFilter(colorFilter);
    }
}
