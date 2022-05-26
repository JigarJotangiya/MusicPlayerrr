package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* renamed from: androidx.cardview.widget.f */
/* compiled from: RoundRectDrawable */
class C0360f extends Drawable {

    /* renamed from: a */
    private float f1526a;

    /* renamed from: b */
    private final Paint f1527b;

    /* renamed from: c */
    private final RectF f1528c;

    /* renamed from: d */
    private final Rect f1529d;

    /* renamed from: e */
    private float f1530e;

    /* renamed from: f */
    private boolean f1531f = false;

    /* renamed from: g */
    private boolean f1532g = true;

    /* renamed from: h */
    private ColorStateList f1533h;

    /* renamed from: i */
    private PorterDuffColorFilter f1534i;

    /* renamed from: j */
    private ColorStateList f1535j;

    /* renamed from: k */
    private PorterDuff.Mode f1536k = PorterDuff.Mode.SRC_IN;

    C0360f(ColorStateList colorStateList, float f) {
        this.f1526a = f;
        this.f1527b = new Paint(5);
        m2036e(colorStateList);
        this.f1528c = new RectF();
        this.f1529d = new Rect();
    }

    /* renamed from: a */
    private PorterDuffColorFilter m2035a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    /* renamed from: e */
    private void m2036e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1533h = colorStateList;
        this.f1527b.setColor(colorStateList.getColorForState(getState(), this.f1533h.getDefaultColor()));
    }

    /* renamed from: i */
    private void m2037i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1528c.set((float) rect.left, (float) rect.top, (float) rect.right, (float) rect.bottom);
        this.f1529d.set(rect);
        if (this.f1531f) {
            float d = C0361g.m2047d(this.f1530e, this.f1526a, this.f1532g);
            this.f1529d.inset((int) Math.ceil((double) C0361g.m2046c(this.f1530e, this.f1526a, this.f1532g)), (int) Math.ceil((double) d));
            this.f1528c.set(this.f1529d);
        }
    }

    /* renamed from: b */
    public ColorStateList mo2330b() {
        return this.f1533h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public float mo2331c() {
        return this.f1530e;
    }

    /* renamed from: d */
    public float mo2332d() {
        return this.f1526a;
    }

    public void draw(Canvas canvas) {
        boolean z;
        Paint paint = this.f1527b;
        if (this.f1534i == null || paint.getColorFilter() != null) {
            z = false;
        } else {
            paint.setColorFilter(this.f1534i);
            z = true;
        }
        RectF rectF = this.f1528c;
        float f = this.f1526a;
        canvas.drawRoundRect(rectF, f, f, paint);
        if (z) {
            paint.setColorFilter((ColorFilter) null);
        }
    }

    /* renamed from: f */
    public void mo2334f(ColorStateList colorStateList) {
        m2036e(colorStateList);
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo2335g(float f, boolean z, boolean z2) {
        if (f != this.f1530e || this.f1531f != z || this.f1532g != z2) {
            this.f1530e = f;
            this.f1531f = z;
            this.f1532g = z2;
            m2037i((Rect) null);
            invalidateSelf();
        }
    }

    public int getOpacity() {
        return -3;
    }

    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1529d, this.f1526a);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo2338h(float f) {
        if (f != this.f1526a) {
            this.f1526a = f;
            m2037i((Rect) null);
            invalidateSelf();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000a, code lost:
        r0 = r1.f1533h;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean isStateful() {
        /*
            r1 = this;
            android.content.res.ColorStateList r0 = r1.f1535j
            if (r0 == 0) goto L_0x000a
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x000a:
            android.content.res.ColorStateList r0 = r1.f1533h
            if (r0 == 0) goto L_0x0014
            boolean r0 = r0.isStateful()
            if (r0 != 0) goto L_0x001a
        L_0x0014:
            boolean r0 = super.isStateful()
            if (r0 == 0) goto L_0x001c
        L_0x001a:
            r0 = 1
            goto L_0x001d
        L_0x001c:
            r0 = 0
        L_0x001d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.cardview.widget.C0360f.isStateful():boolean");
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m2037i(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1533h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z = colorForState != this.f1527b.getColor();
        if (z) {
            this.f1527b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1535j;
        if (colorStateList2 == null || (mode = this.f1536k) == null) {
            return z;
        }
        this.f1534i = m2035a(colorStateList2, mode);
        return true;
    }

    public void setAlpha(int i) {
        this.f1527b.setAlpha(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f1527b.setColorFilter(colorFilter);
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f1535j = colorStateList;
        this.f1534i = m2035a(colorStateList, this.f1536k);
        invalidateSelf();
    }

    public void setTintMode(PorterDuff.Mode mode) {
        this.f1536k = mode;
        this.f1534i = m2035a(this.f1535j, mode);
        invalidateSelf();
    }
}
