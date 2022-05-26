package com.coocent.marquee;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.SweepGradient;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.WindowManager;

public class MarqueeSweepGradientView extends View {

    /* renamed from: A */
    private int f7761A;

    /* renamed from: B */
    private float f7762B;

    /* renamed from: C */
    private final boolean f7763C;

    /* renamed from: D */
    private SweepGradient f7764D;

    /* renamed from: E */
    private Matrix f7765E = new Matrix();

    /* renamed from: F */
    private int f7766F;

    /* renamed from: G */
    private boolean f7767G;

    /* renamed from: g */
    private final Context f7768g;

    /* renamed from: h */
    private final int f7769h;

    /* renamed from: i */
    private final boolean f7770i;

    /* renamed from: j */
    private Paint f7771j = new Paint();

    /* renamed from: k */
    private Path f7772k = new Path();

    /* renamed from: l */
    private Path f7773l = new Path();

    /* renamed from: m */
    private RectF f7774m = new RectF();

    /* renamed from: n */
    private RectF f7775n = new RectF();

    /* renamed from: o */
    private RectF f7776o = new RectF();

    /* renamed from: p */
    private RectF f7777p = new RectF();

    /* renamed from: q */
    private RectF f7778q = new RectF();

    /* renamed from: r */
    private RectF f7779r = new RectF();

    /* renamed from: s */
    private RectF f7780s = new RectF();

    /* renamed from: t */
    private RectF f7781t = new RectF();

    /* renamed from: u */
    private float f7782u;

    /* renamed from: v */
    private float f7783v;

    /* renamed from: w */
    private float f7784w;

    /* renamed from: x */
    private float f7785x;

    /* renamed from: y */
    private float f7786y;

    /* renamed from: z */
    private int[] f7787z;

    public MarqueeSweepGradientView(Context context) {
        super(context);
        this.f7768g = context;
        this.f7761A = 5;
        this.f7786y = (float) m10555a(3.0f);
        this.f7783v = (float) (m10555a(0.0f) * 2);
        this.f7785x = (float) (m10555a(0.0f) * 2);
        this.f7782u = (float) (m10555a(0.0f) * 2);
        this.f7784w = (float) (m10555a(0.0f) * 2);
        this.f7767G = true;
        this.f7763C = true;
        this.f7770i = true;
        this.f7769h = m10555a(10.0f);
        this.f7787z = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f7771j.setAntiAlias(true);
        this.f7771j.setFilterBitmap(true);
        mo8943b();
    }

    /* renamed from: a */
    private int m10555a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f7768g.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    private void m10556c() {
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f7787z, (float[]) null);
        this.f7764D = sweepGradient;
        this.f7771j.setShader(sweepGradient);
    }

    /* renamed from: g */
    private void m10557g(RectF rectF, float f, float f2, float f3) {
        if (f3 <= 0.0f) {
            f3 = 0.1f;
        }
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f + f3;
        rectF.bottom = f2 + f3;
    }

    private void setOrientationMode(int i) {
        float f;
        float f2;
        Log.e("TAGF", "isInward=" + this.f7767G + "_orientation=" + i + "_getHeight=" + getHeight());
        if (this.f7767G) {
            f2 = this.f7786y;
            f = 0.0f;
        } else {
            int i2 = this.f7769h;
            f = ((float) i2) - this.f7786y;
            f2 = (float) i2;
        }
        if (i == 0) {
            float f3 = f + 0.0f;
            m10557g(this.f7774m, f3, f3, this.f7783v);
            RectF rectF = this.f7775n;
            float f4 = this.f7783v;
            m10557g(rectF, ((float) getWidth()) - (f4 + f), f3, f4);
            float f5 = this.f7785x;
            m10557g(this.f7776o, ((float) getWidth()) - (this.f7785x + f), ((float) getHeight()) - (f5 + f), f5);
            RectF rectF2 = this.f7777p;
            float f6 = this.f7785x;
            m10557g(rectF2, f3, ((float) getHeight()) - (f + f6), f6);
            m10557g(this.f7778q, f2, f2, this.f7782u);
            RectF rectF3 = this.f7779r;
            float f7 = this.f7782u;
            m10557g(rectF3, (((float) getWidth()) - f7) - f2, f2, f7);
            float f8 = this.f7784w;
            m10557g(this.f7780s, (((float) getWidth()) - this.f7784w) - f2, (((float) getHeight()) - f8) - f2, f8);
            RectF rectF4 = this.f7781t;
            float f9 = this.f7784w;
            m10557g(rectF4, f2, (((float) getHeight()) - f9) - f2, f9);
        } else if (i == 1) {
            float f10 = f + 0.0f;
            m10557g(this.f7774m, f10, f10, this.f7783v);
            RectF rectF5 = this.f7775n;
            float f11 = this.f7785x;
            m10557g(rectF5, ((float) getWidth()) - (f11 + f), f10, f11);
            float f12 = this.f7785x;
            m10557g(this.f7776o, ((float) getWidth()) - (this.f7785x + f), ((float) getHeight()) - (f12 + f), f12);
            RectF rectF6 = this.f7777p;
            float f13 = this.f7783v;
            m10557g(rectF6, f10, ((float) getHeight()) - (f + f13), f13);
            m10557g(this.f7778q, f2, f2, this.f7782u);
            RectF rectF7 = this.f7779r;
            float f14 = this.f7784w;
            m10557g(rectF7, (((float) getWidth()) - f14) - f2, f2, f14);
            float f15 = this.f7784w;
            m10557g(this.f7780s, (((float) getWidth()) - this.f7784w) - f2, (((float) getHeight()) - f15) - f2, f15);
            RectF rectF8 = this.f7781t;
            float f16 = this.f7782u;
            m10557g(rectF8, f2, (((float) getHeight()) - f16) - f2, f16);
        } else if (i == 2) {
            float f17 = f + 0.0f;
            m10557g(this.f7774m, f17, f17, this.f7785x);
            RectF rectF9 = this.f7775n;
            float f18 = this.f7785x;
            m10557g(rectF9, ((float) getWidth()) - (f18 + f), f17, f18);
            float f19 = this.f7783v;
            m10557g(this.f7776o, ((float) getWidth()) - (this.f7783v + f), ((float) getHeight()) - (f19 + f), f19);
            RectF rectF10 = this.f7777p;
            float f20 = this.f7783v;
            m10557g(rectF10, f17, ((float) getHeight()) - (f + f20), f20);
            m10557g(this.f7778q, f2, f2, this.f7784w);
            RectF rectF11 = this.f7779r;
            float f21 = this.f7784w;
            m10557g(rectF11, (((float) getWidth()) - f21) - f2, f2, f21);
            float f22 = this.f7782u;
            m10557g(this.f7780s, (((float) getWidth()) - this.f7782u) - f2, (((float) getHeight()) - f22) - f2, f22);
            RectF rectF12 = this.f7781t;
            float f23 = this.f7782u;
            m10557g(rectF12, f2, (((float) getHeight()) - f23) - f2, f23);
        } else if (i == 3) {
            float f24 = f + 0.0f;
            m10557g(this.f7774m, f24, f24, this.f7785x);
            RectF rectF13 = this.f7775n;
            float f25 = this.f7783v;
            m10557g(rectF13, ((float) getWidth()) - (f25 + f), f24, f25);
            float f26 = this.f7783v;
            m10557g(this.f7776o, ((float) getWidth()) - (this.f7783v + f), ((float) getHeight()) - (f26 + f), f26);
            RectF rectF14 = this.f7777p;
            float f27 = this.f7785x;
            m10557g(rectF14, f24, ((float) getHeight()) - (f + f27), f27);
            m10557g(this.f7778q, f2, f2, this.f7784w);
            RectF rectF15 = this.f7779r;
            float f28 = this.f7782u;
            m10557g(rectF15, (((float) getWidth()) - f28) - f2, f2, f28);
            float f29 = this.f7782u;
            m10557g(this.f7780s, (((float) getWidth()) - this.f7782u) - f2, (((float) getHeight()) - f29) - f2, f29);
            RectF rectF16 = this.f7781t;
            float f30 = this.f7784w;
            m10557g(rectF16, f2, (((float) getHeight()) - f30) - f2, f30);
        }
        this.f7772k.reset();
        this.f7772k.addArc(this.f7774m, -180.0f, 90.0f);
        this.f7772k.arcTo(this.f7775n, -90.0f, 90.0f);
        this.f7772k.arcTo(this.f7776o, 0.0f, 90.0f);
        this.f7772k.arcTo(this.f7777p, 90.0f, 90.0f);
        this.f7773l.reset();
        this.f7773l.addArc(this.f7778q, -180.0f, 90.0f);
        this.f7773l.arcTo(this.f7779r, -90.0f, 90.0f);
        this.f7773l.arcTo(this.f7780s, 0.0f, 90.0f);
        this.f7773l.arcTo(this.f7781t, 90.0f, 90.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8943b() {
        if (Build.VERSION.SDK_INT < 21) {
            setLayerType(1, (Paint) null);
        }
    }

    /* renamed from: d */
    public void mo8944d(int i) {
        Log.v("M_SweepGradientView", "onOrientationChanged_orientation=" + i);
        this.f7766F = i;
        setOrientationMode(i);
        invalidate();
    }

    /* renamed from: e */
    public void mo8945e(int i, int i2, int i3, int i4, int i5, int i6) {
        this.f7782u = (float) (m10555a((float) i) * 2);
        this.f7784w = (float) (m10555a((float) i2) * 2);
        this.f7783v = (float) (m10555a((float) i3) * 2);
        this.f7785x = (float) (m10555a((float) i4) * 2);
        this.f7786y = (float) m10555a((float) (i5 + 1));
        setOrientationMode(this.f7766F);
        this.f7761A = i6;
        invalidate();
    }

    /* renamed from: f */
    public void mo8946f(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        this.f7782u = (float) (m10555a((float) i) * 2);
        this.f7784w = (float) (m10555a((float) i2) * 2);
        this.f7783v = (float) (m10555a((float) i3) * 2);
        this.f7785x = (float) (m10555a((float) i4) * 2);
        this.f7786y = (float) m10555a((float) (i5 + 1));
        setOrientationMode(this.f7766F);
        this.f7761A = i6;
        if (iArr == null || iArr.length <= 1) {
            iArr = new int[]{-1, Color.parseColor(C2276f.f7825a), Color.parseColor(C2276f.f7827c), -1};
        }
        this.f7787z = iArr;
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f7787z, (float[]) null);
        this.f7764D = sweepGradient;
        this.f7771j.setShader(sweepGradient);
        invalidate();
    }

    public int[] getColors() {
        return this.f7787z;
    }

    public int getSpeed() {
        return this.f7761A;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f7763C) {
            canvas.save();
            canvas.clipPath(this.f7772k, Region.Op.DIFFERENCE);
            canvas.drawColor(-16777216);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.f7772k);
        if (this.f7770i) {
            canvas.clipPath(this.f7773l, Region.Op.DIFFERENCE);
        }
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f7771j);
        canvas.restore();
        this.f7765E.setRotate(this.f7762B, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        SweepGradient sweepGradient = this.f7764D;
        if (sweepGradient != null) {
            sweepGradient.setLocalMatrix(this.f7765E);
        }
        float f = this.f7762B + ((float) this.f7761A);
        this.f7762B = f;
        if (f >= 360.0f) {
            this.f7762B = 0.0f;
        }
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m10556c();
        WindowManager windowManager = (WindowManager) this.f7768g.getSystemService("window");
        if (windowManager != null) {
            try {
                mo8944d(windowManager.getDefaultDisplay().getRotation());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void setBaseRotate(int i) {
        this.f7761A = i;
        invalidate();
    }

    public void setColors(int[] iArr) {
        if (iArr == null || iArr.length <= 1) {
            iArr = new int[]{-1, Color.parseColor(C2276f.f7825a), Color.parseColor(C2276f.f7827c), -1};
        }
        this.f7787z = iArr;
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f7787z, (float[]) null);
        this.f7764D = sweepGradient;
        this.f7771j.setShader(sweepGradient);
        invalidate();
    }

    public void setRadius(int i) {
        float a = (float) (m10555a((float) i) * 2);
        this.f7785x = a;
        this.f7783v = a;
        this.f7784w = a;
        this.f7782u = a;
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setRadiusBottom(int i) {
        float a = (float) (m10555a((float) i) * 2);
        this.f7785x = a;
        this.f7784w = a;
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setRadiusBottomIn(int i) {
        this.f7784w = (float) (m10555a((float) i) * 2);
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setRadiusBottomOut(int i) {
        this.f7785x = (float) (m10555a((float) i) * 2);
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setRadiusTop(int i) {
        float a = (float) (m10555a((float) i) * 2);
        this.f7783v = a;
        this.f7782u = a;
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setRadiusTopIn(int i) {
        this.f7782u = (float) (m10555a((float) i) * 2);
        Log.e("TAGF", "TopIn=" + this.f7782u);
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setRadiusTopOut(int i) {
        this.f7783v = (float) (m10555a((float) i) * 2);
        Log.e("TAGF", "TopOut=" + this.f7783v);
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public void setWidth(int i) {
        this.f7786y = (float) m10555a((float) (i + 1));
        setOrientationMode(this.f7766F);
        invalidate();
    }

    public MarqueeSweepGradientView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7768g = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeSweepGradientView);
        this.f7761A = obtainStyledAttributes.getInt(C2328w.MarqueeSweepGradientView_baseRotate, 5);
        this.f7786y = (float) m10555a(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveWidth, 2.0f) + 1.0f);
        this.f7783v = (float) (m10555a(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusTopOut, 0.0f)) * 2);
        this.f7785x = (float) (m10555a(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusBottomOut, 0.0f)) * 2);
        this.f7782u = (float) (m10555a(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusTopIn, 0.0f)) * 2);
        this.f7784w = (float) (m10555a(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusBottomIn, 0.0f)) * 2);
        this.f7767G = obtainStyledAttributes.getBoolean(C2328w.MarqueeSweepGradientView_isInward, true);
        this.f7763C = obtainStyledAttributes.getBoolean(C2328w.MarqueeSweepGradientView_isCornerBlack, true);
        this.f7770i = obtainStyledAttributes.getBoolean(C2328w.MarqueeSweepGradientView_isKnockout, true);
        obtainStyledAttributes.recycle();
        this.f7769h = m10555a(10.0f);
        this.f7787z = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f7771j.setAntiAlias(true);
        this.f7771j.setFilterBitmap(true);
        mo8943b();
    }
}
