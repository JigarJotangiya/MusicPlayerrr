package com.coocent.musiceffect.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import p159f.p166c.p201g.C4510e;
import p159f.p166c.p201g.C4514i;

public class EffectArcSeekbar extends View {

    /* renamed from: A */
    private int f8693A;

    /* renamed from: B */
    private C2469b f8694B;

    /* renamed from: C */
    private float f8695C;

    /* renamed from: D */
    private float f8696D;

    /* renamed from: E */
    private boolean f8697E;

    /* renamed from: F */
    private boolean f8698F;

    /* renamed from: g */
    private Bitmap f8699g;

    /* renamed from: h */
    private Bitmap f8700h;

    /* renamed from: i */
    private Bitmap f8701i;

    /* renamed from: j */
    private Bitmap f8702j;

    /* renamed from: k */
    private Bitmap f8703k;

    /* renamed from: l */
    private Bitmap f8704l;

    /* renamed from: m */
    private Paint f8705m;

    /* renamed from: n */
    private Paint f8706n;

    /* renamed from: o */
    private Matrix f8707o;

    /* renamed from: p */
    private RectF f8708p;

    /* renamed from: q */
    private PaintFlagsDrawFilter f8709q;

    /* renamed from: r */
    private int f8710r;

    /* renamed from: s */
    private int f8711s;

    /* renamed from: t */
    private float f8712t;

    /* renamed from: u */
    private float f8713u;

    /* renamed from: v */
    private int f8714v;

    /* renamed from: w */
    private int f8715w;

    /* renamed from: x */
    private boolean f8716x;

    /* renamed from: y */
    private ValueAnimator f8717y;

    /* renamed from: z */
    private int f8718z;

    /* renamed from: com.coocent.musiceffect.view.EffectArcSeekbar$a */
    class C2468a implements ValueAnimator.AnimatorUpdateListener {
        C2468a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            EffectArcSeekbar.this.setProgressInternal(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.coocent.musiceffect.view.EffectArcSeekbar$b */
    public interface C2469b {
        /* renamed from: a */
        void mo9521a(EffectArcSeekbar effectArcSeekbar);

        /* renamed from: b */
        void mo9522b(int i, boolean z);
    }

    public EffectArcSeekbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private void m11591b(float f) {
        int i;
        float f2 = this.f8696D + f;
        this.f8696D = f2;
        int i2 = this.f8693A;
        if (f2 > ((float) i2)) {
            this.f8696D = (float) i2;
        }
        float f3 = this.f8696D;
        int i3 = this.f8718z;
        if (f3 < ((float) i3)) {
            this.f8696D = (float) i3;
        }
        try {
            i = Math.round(((((float) this.f8715w) * 1.0f) * this.f8696D) / ((float) i2));
        } catch (Exception e) {
            e.printStackTrace();
            i = 0;
        }
        if (this.f8714v != i || this.f8716x) {
            this.f8714v = i;
            this.f8716x = false;
            C2469b bVar = this.f8694B;
            if (bVar != null) {
                bVar.mo9522b(i, this.f8697E);
            }
            invalidate();
        }
    }

    /* renamed from: c */
    private float m11592c(float f, float f2, float f3, float f4) {
        double d;
        float f5 = f3 - f;
        float f6 = f4 - f2;
        int i = (f5 > 0.0f ? 1 : (f5 == 0.0f ? 0 : -1));
        if (i != 0) {
            float abs = Math.abs(f6 / f5);
            d = i > 0 ? f6 >= 0.0f ? Math.atan((double) abs) : 6.283185307179586d - Math.atan((double) abs) : f6 >= 0.0f ? 3.141592653589793d - Math.atan((double) abs) : Math.atan((double) abs) + 3.141592653589793d;
        } else {
            d = f6 > 0.0f ? 1.5707963267948966d : -1.5707963267948966d;
        }
        return (float) ((d * 180.0d) / 3.141592653589793d);
    }

    /* renamed from: d */
    private void m11593d() {
        if (getWidth() > 0 && getHeight() > 0) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) this.f8701i.getWidth(), (float) this.f8701i.getHeight());
            this.f8707o.setRectToRect(rectF, new RectF(0.0f, 0.0f, (float) this.f8710r, (float) this.f8711s), Matrix.ScaleToFit.CENTER);
            this.f8707o.mapRect(this.f8708p, rectF);
            Bitmap bitmap = this.f8701i;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(this.f8707o);
            this.f8705m.setShader(bitmapShader);
            Bitmap bitmap2 = this.f8700h;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader2 = new BitmapShader(bitmap2, tileMode2, tileMode2);
            bitmapShader2.setLocalMatrix(this.f8707o);
            this.f8706n.setShader(bitmapShader2);
            this.f8712t = ((float) this.f8710r) * 0.5f;
            this.f8713u = ((float) this.f8711s) * 0.5f;
        }
    }

    /* renamed from: e */
    private void m11594e(Context context, AttributeSet attributeSet) {
        int i = C4510e.arc_progress_default;
        int i2 = C4510e.arc_progress_off;
        int i3 = C4510e.arc_progress_on;
        int i4 = C4510e.arc_thumb_off;
        int i5 = C4510e.arc_thumb_on;
        int i6 = C4510e.arc_thumb_selected;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4514i.EffectArcSeekbar);
            i = obtainStyledAttributes.getResourceId(C4514i.EffectArcSeekbar_arcProgressBg, i);
            i2 = obtainStyledAttributes.getResourceId(C4514i.EffectArcSeekbar_arcProgressOff, i2);
            i3 = obtainStyledAttributes.getResourceId(C4514i.EffectArcSeekbar_arcProgressOn, i3);
            i4 = obtainStyledAttributes.getResourceId(C4514i.EffectArcSeekbar_arcThumbOff, i4);
            int i7 = C4514i.EffectArcSeekbar_arcThumbOn;
            i5 = obtainStyledAttributes.getResourceId(i7, i5);
            i6 = obtainStyledAttributes.getResourceId(i7, i6);
            this.f8714v = obtainStyledAttributes.getInteger(C4514i.EffectArcSeekbar_arcProgress, 0);
            this.f8715w = obtainStyledAttributes.getInteger(C4514i.EffectArcSeekbar_arcMax, 100);
            obtainStyledAttributes.recycle();
        }
        this.f8696D = ((((float) this.f8714v) * 1.0f) * ((float) this.f8693A)) / ((float) this.f8715w);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        this.f8699g = BitmapFactory.decodeResource(getResources(), i, options);
        this.f8700h = BitmapFactory.decodeResource(getResources(), i2, options);
        this.f8701i = BitmapFactory.decodeResource(getResources(), i3, options);
        this.f8703k = BitmapFactory.decodeResource(getResources(), i4, options);
        this.f8702j = BitmapFactory.decodeResource(getResources(), i5, options);
        this.f8704l = BitmapFactory.decodeResource(getResources(), i6, options);
        this.f8705m = new Paint();
        this.f8706n = new Paint();
        this.f8708p = new RectF();
        this.f8707o = new Matrix();
        this.f8709q = new PaintFlagsDrawFilter(0, 3);
    }

    /* access modifiers changed from: private */
    public void setProgressInternal(int i) {
        this.f8696D = 0.0f;
        m11591b(((((float) i) * 1.0f) * ((float) this.f8693A)) / ((float) this.f8715w));
    }

    /* renamed from: f */
    public void mo9569f(int i, boolean z) {
        if (z) {
            ValueAnimator valueAnimator = this.f8717y;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f8714v, i});
            this.f8717y = ofInt;
            ofInt.addUpdateListener(new C2468a());
            this.f8717y.setDuration(500).start();
            return;
        }
        setProgressInternal(i);
    }

    public int getMax() {
        return this.f8715w;
    }

    public int getProgress() {
        return this.f8714v;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f8717y;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8717y.end();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8710r > 0 && this.f8711s > 0) {
            canvas.setDrawFilter(this.f8709q);
            canvas.drawBitmap(this.f8699g, this.f8707o, this.f8705m);
            int i = this.f8714v;
            if (i <= 0 || i >= this.f8715w) {
                if (i == this.f8715w) {
                    if (isEnabled()) {
                        canvas.drawBitmap(this.f8701i, this.f8707o, this.f8705m);
                    } else {
                        canvas.drawBitmap(this.f8700h, this.f8707o, this.f8705m);
                    }
                }
            } else if (isEnabled()) {
                canvas.drawArc(this.f8708p, 90.0f, this.f8696D + 45.0f, true, this.f8705m);
            } else {
                canvas.drawArc(this.f8708p, 90.0f, this.f8696D + 45.0f, true, this.f8706n);
            }
            canvas.rotate(this.f8696D - (((float) this.f8693A) * 0.5f), this.f8712t, this.f8713u);
            if (!isEnabled()) {
                canvas.drawBitmap(this.f8703k, this.f8707o, this.f8705m);
            } else if (this.f8698F) {
                canvas.drawBitmap(this.f8704l, this.f8707o, this.f8705m);
            } else {
                canvas.drawBitmap(this.f8702j, this.f8707o, this.f8705m);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size2 > size) {
            size2 = size;
        }
        setMeasuredDimension(size, size2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8710r = i;
        this.f8711s = i2;
        m11593d();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x0078;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            r1 = 1
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r5.getAction()
            r2 = 0
            if (r0 == 0) goto L_0x005b
            if (r0 == r1) goto L_0x0045
            r3 = 2
            if (r0 == r3) goto L_0x0018
            r5 = 3
            if (r0 == r5) goto L_0x0045
            goto L_0x0078
        L_0x0018:
            r4.f8697E = r1
            float r0 = r4.f8712t
            float r2 = r4.f8713u
            float r3 = r5.getX()
            float r5 = r5.getY()
            float r5 = r4.m11592c(r0, r2, r3, r5)
            float r0 = r4.f8695C
            float r0 = r5 - r0
            r2 = -1014562816(0xffffffffc3870000, float:-270.0)
            r3 = 1135869952(0x43b40000, float:360.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 >= 0) goto L_0x0038
            float r0 = r0 + r3
            goto L_0x003f
        L_0x0038:
            r2 = 1132920832(0x43870000, float:270.0)
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x003f
            float r0 = r0 - r3
        L_0x003f:
            r4.m11591b(r0)
            r4.f8695C = r5
            goto L_0x0078
        L_0x0045:
            r4.f8697E = r2
            r4.f8698F = r2
            com.coocent.musiceffect.view.EffectArcSeekbar$b r5 = r4.f8694B
            if (r5 == 0) goto L_0x0050
            r5.mo9521a(r4)
        L_0x0050:
            r4.invalidate()
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0078
        L_0x005b:
            r4.f8697E = r2
            float r0 = r4.f8712t
            float r2 = r4.f8713u
            float r3 = r5.getX()
            float r5 = r5.getY()
            float r5 = r4.m11592c(r0, r2, r3, r5)
            r4.f8695C = r5
            r4.f8698F = r1
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiceffect.view.EffectArcSeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMax(int i) {
        this.f8715w = i;
        postInvalidate();
        int i2 = this.f8714v;
        int i3 = this.f8715w;
        if (i2 > i3) {
            this.f8714v = i3;
            setProgressInternal(i3);
        }
    }

    public void setOnProgressChangedListener(C2469b bVar) {
        this.f8694B = bVar;
    }

    public void setProgress(int i) {
        setProgressInternal(i);
    }

    public EffectArcSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EffectArcSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8714v = 0;
        this.f8715w = 100;
        this.f8716x = true;
        this.f8718z = 0;
        this.f8693A = 270;
        this.f8696D = 0.0f;
        this.f8698F = false;
        m11594e(context, attributeSet);
    }
}
