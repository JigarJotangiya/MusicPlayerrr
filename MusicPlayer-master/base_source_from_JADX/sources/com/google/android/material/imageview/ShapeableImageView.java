package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatImageView;
import p082e.p083a.p084k.p085a.C3410a;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7553n;
import p159f.p243f.p245b.p304b.p315w.C7565p;

public class ShapeableImageView extends AppCompatImageView implements C7565p {

    /* renamed from: y */
    private static final int f28348y = C7499k.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: g */
    private final C7553n f28349g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final RectF f28350h;

    /* renamed from: i */
    private final RectF f28351i;

    /* renamed from: j */
    private final Paint f28352j;

    /* renamed from: k */
    private final Paint f28353k;

    /* renamed from: l */
    private final Path f28354l;

    /* renamed from: m */
    private ColorStateList f28355m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C7541h f28356n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C7549m f28357o;

    /* renamed from: p */
    private float f28358p;

    /* renamed from: q */
    private Path f28359q;

    /* renamed from: r */
    private int f28360r;

    /* renamed from: s */
    private int f28361s;

    /* renamed from: t */
    private int f28362t;

    /* renamed from: u */
    private int f28363u;

    /* renamed from: v */
    private int f28364v;

    /* renamed from: w */
    private int f28365w;

    /* renamed from: x */
    private boolean f28366x;

    @TargetApi(21)
    /* renamed from: com.google.android.material.imageview.ShapeableImageView$a */
    class C6053a extends ViewOutlineProvider {

        /* renamed from: a */
        private final Rect f28367a = new Rect();

        C6053a() {
        }

        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f28357o != null) {
                if (ShapeableImageView.this.f28356n == null) {
                    C7541h unused = ShapeableImageView.this.f28356n = new C7541h(ShapeableImageView.this.f28357o);
                }
                ShapeableImageView.this.f28350h.round(this.f28367a);
                ShapeableImageView.this.f28356n.setBounds(this.f28367a);
                ShapeableImageView.this.f28356n.getOutline(outline);
            }
        }
    }

    public ShapeableImageView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: q */
    private void m36347q(Canvas canvas) {
        if (this.f28355m != null) {
            this.f28352j.setStrokeWidth(this.f28358p);
            int colorForState = this.f28355m.getColorForState(getDrawableState(), this.f28355m.getDefaultColor());
            if (this.f28358p > 0.0f && colorForState != 0) {
                this.f28352j.setColor(colorForState);
                canvas.drawPath(this.f28354l, this.f28352j);
            }
        }
    }

    /* renamed from: r */
    private boolean m36348r() {
        return (this.f28364v == Integer.MIN_VALUE && this.f28365w == Integer.MIN_VALUE) ? false : true;
    }

    /* renamed from: s */
    private boolean m36349s() {
        return Build.VERSION.SDK_INT >= 17 && getLayoutDirection() == 1;
    }

    /* renamed from: t */
    private void m36350t(int i, int i2) {
        this.f28350h.set((float) getPaddingLeft(), (float) getPaddingTop(), (float) (i - getPaddingRight()), (float) (i2 - getPaddingBottom()));
        this.f28349g.mo28539d(this.f28357o, 1.0f, this.f28350h, this.f28354l);
        this.f28359q.rewind();
        this.f28359q.addPath(this.f28354l);
        this.f28351i.set(0.0f, 0.0f, (float) i, (float) i2);
        this.f28359q.addRect(this.f28351i, Path.Direction.CCW);
    }

    public int getContentPaddingBottom() {
        return this.f28363u;
    }

    public final int getContentPaddingEnd() {
        int i = this.f28365w;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m36349s() ? this.f28360r : this.f28362t;
    }

    public int getContentPaddingLeft() {
        int i;
        int i2;
        if (m36348r()) {
            if (m36349s() && (i2 = this.f28365w) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m36349s() && (i = this.f28364v) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f28360r;
    }

    public int getContentPaddingRight() {
        int i;
        int i2;
        if (m36348r()) {
            if (m36349s() && (i2 = this.f28364v) != Integer.MIN_VALUE) {
                return i2;
            }
            if (!m36349s() && (i = this.f28365w) != Integer.MIN_VALUE) {
                return i;
            }
        }
        return this.f28362t;
    }

    public final int getContentPaddingStart() {
        int i = this.f28364v;
        if (i != Integer.MIN_VALUE) {
            return i;
        }
        return m36349s() ? this.f28362t : this.f28360r;
    }

    public int getContentPaddingTop() {
        return this.f28361s;
    }

    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    public C7549m getShapeAppearanceModel() {
        return this.f28357o;
    }

    public ColorStateList getStrokeColor() {
        return this.f28355m;
    }

    public float getStrokeWidth() {
        return this.f28358p;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setLayerType(2, (Paint) null);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        setLayerType(0, (Paint) null);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f28359q, this.f28353k);
        m36347q(canvas);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!this.f28366x) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 19 || isLayoutDirectionResolved()) {
                this.f28366x = true;
                if (i3 < 21 || (!isPaddingRelative() && !m36348r())) {
                    setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
                } else {
                    setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m36350t(i, i2);
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i + getContentPaddingLeft(), i2 + getContentPaddingTop(), i3 + getContentPaddingRight(), i4 + getContentPaddingBottom());
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i + getContentPaddingStart(), i2 + getContentPaddingTop(), i3 + getContentPaddingEnd(), i4 + getContentPaddingBottom());
    }

    public void setShapeAppearanceModel(C7549m mVar) {
        this.f28357o = mVar;
        C7541h hVar = this.f28356n;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        m36350t(getWidth(), getHeight());
        invalidate();
        if (Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setStrokeColor(ColorStateList colorStateList) {
        this.f28355m = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(int i) {
        setStrokeColor(C3410a.m14542c(getContext(), i));
    }

    public void setStrokeWidth(float f) {
        if (this.f28358p != f) {
            this.f28358p = f;
            invalidate();
        }
    }

    public void setStrokeWidthResource(int i) {
        setStrokeWidth((float) getResources().getDimensionPixelSize(i));
    }

    public ShapeableImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ShapeableImageView(android.content.Context r7, android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = f28348y
            android.content.Context r7 = com.google.android.material.theme.p249a.C6260a.m37386c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            f.f.b.b.w.n r7 = p159f.p243f.p245b.p304b.p315w.C7553n.m42215k()
            r6.f28349g = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f28354l = r7
            r7 = 0
            r6.f28366x = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f28353k = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f28350h = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f28351i = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f28359q = r2
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r1, r2, r4)
            r6.f28355m = r4
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f28358p = r4
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f28360r = r7
            r6.f28361s = r7
            r6.f28362t = r7
            r6.f28363u = r7
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f28360r = r4
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f28361s = r4
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f28362t = r4
            int r4 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f28363u = r7
            int r7 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f28364v = r7
            int r7 = p159f.p243f.p245b.p304b.C7500l.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f28365w = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f28352j = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            f.f.b.b.w.m$b r7 = p159f.p243f.p245b.p304b.p315w.C7549m.m42149e(r1, r8, r9, r0)
            f.f.b.b.w.m r7 = r7.mo28526m()
            r6.f28357o = r7
            int r7 = android.os.Build.VERSION.SDK_INT
            r8 = 21
            if (r7 < r8) goto L_0x00cc
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
