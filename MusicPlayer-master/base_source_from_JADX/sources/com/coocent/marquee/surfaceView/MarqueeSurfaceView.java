package com.coocent.marquee.surfaceView;

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
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.WindowManager;
import com.coocent.marquee.C2276f;
import com.coocent.marquee.C2328w;

@Deprecated
public class MarqueeSurfaceView extends SurfaceView implements SurfaceHolder.Callback, Runnable {

    /* renamed from: A */
    private int f8014A;

    /* renamed from: B */
    private float f8015B;

    /* renamed from: C */
    private final boolean f8016C;

    /* renamed from: D */
    private SweepGradient f8017D;

    /* renamed from: E */
    private Matrix f8018E = new Matrix();

    /* renamed from: F */
    private int f8019F;

    /* renamed from: G */
    private boolean f8020G;

    /* renamed from: H */
    private SurfaceHolder f8021H;

    /* renamed from: I */
    private Canvas f8022I;

    /* renamed from: J */
    private boolean f8023J;

    /* renamed from: g */
    private final Context f8024g;

    /* renamed from: h */
    private final int f8025h;

    /* renamed from: i */
    private final boolean f8026i;

    /* renamed from: j */
    private Paint f8027j = new Paint();

    /* renamed from: k */
    private Path f8028k = new Path();

    /* renamed from: l */
    private Path f8029l = new Path();

    /* renamed from: m */
    private RectF f8030m = new RectF();

    /* renamed from: n */
    private RectF f8031n = new RectF();

    /* renamed from: o */
    private RectF f8032o = new RectF();

    /* renamed from: p */
    private RectF f8033p = new RectF();

    /* renamed from: q */
    private RectF f8034q = new RectF();

    /* renamed from: r */
    private RectF f8035r = new RectF();

    /* renamed from: s */
    private RectF f8036s = new RectF();

    /* renamed from: t */
    private RectF f8037t = new RectF();

    /* renamed from: u */
    private float f8038u;

    /* renamed from: v */
    private float f8039v;

    /* renamed from: w */
    private float f8040w;

    /* renamed from: x */
    private float f8041x;

    /* renamed from: y */
    private float f8042y;

    /* renamed from: z */
    private int[] f8043z;

    public MarqueeSurfaceView(Context context) {
        super(context);
        this.f8024g = context;
        if (Build.VERSION.SDK_INT < 21) {
            setLayerType(1, (Paint) null);
        }
        this.f8014A = 5;
        this.f8042y = (float) m10861a(3.0f);
        this.f8039v = (float) (m10861a(0.0f) * 2);
        this.f8041x = (float) (m10861a(0.0f) * 2);
        this.f8038u = (float) (m10861a(0.0f) * 2);
        this.f8040w = (float) (m10861a(0.0f) * 2);
        this.f8020G = true;
        this.f8016C = true;
        this.f8026i = true;
        this.f8025h = m10861a(10.0f);
        this.f8043z = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f8027j.setAntiAlias(true);
        this.f8027j.setFilterBitmap(true);
        m10864d();
    }

    /* renamed from: a */
    private int m10861a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f8024g.getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    private void m10862b() {
        Canvas canvas;
        try {
            Canvas lockCanvas = this.f8021H.lockCanvas();
            this.f8022I = lockCanvas;
            m10865e(lockCanvas);
            canvas = this.f8022I;
            if (canvas == null) {
                return;
            }
        } catch (Exception unused) {
            canvas = this.f8022I;
            if (canvas == null) {
                return;
            }
        } catch (Throwable th) {
            Canvas canvas2 = this.f8022I;
            if (canvas2 != null) {
                this.f8021H.unlockCanvasAndPost(canvas2);
            }
            throw th;
        }
        this.f8021H.unlockCanvasAndPost(canvas);
    }

    /* renamed from: c */
    private void m10863c() {
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8043z, (float[]) null);
        this.f8017D = sweepGradient;
        this.f8027j.setShader(sweepGradient);
    }

    /* renamed from: d */
    private void m10864d() {
        SurfaceHolder holder = getHolder();
        this.f8021H = holder;
        holder.setFormat(-2);
        setZOrderOnTop(true);
        this.f8021H.addCallback(this);
        setFocusable(false);
        setKeepScreenOn(false);
        setFocusableInTouchMode(false);
    }

    /* renamed from: e */
    private void m10865e(Canvas canvas) {
        if (this.f8016C) {
            canvas.save();
            canvas.clipPath(this.f8028k, Region.Op.DIFFERENCE);
            canvas.drawColor(-16777216);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.f8028k);
        if (this.f8026i) {
            canvas.clipPath(this.f8029l, Region.Op.DIFFERENCE);
        }
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f8027j);
        canvas.restore();
        this.f8018E.setRotate(this.f8015B, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        SweepGradient sweepGradient = this.f8017D;
        if (sweepGradient != null) {
            sweepGradient.setLocalMatrix(this.f8018E);
        }
        float f = this.f8015B + ((float) this.f8014A);
        this.f8015B = f;
        if (f >= 360.0f) {
            this.f8015B = 0.0f;
        }
    }

    /* renamed from: g */
    private void m10866g(RectF rectF, float f, float f2, float f3) {
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
        if (this.f8020G) {
            f2 = this.f8042y;
            f = 0.0f;
        } else {
            int i2 = this.f8025h;
            f = ((float) i2) - this.f8042y;
            f2 = (float) i2;
        }
        if (i == 0) {
            float f3 = f + 0.0f;
            m10866g(this.f8030m, f3, f3, this.f8039v);
            RectF rectF = this.f8031n;
            float f4 = this.f8039v;
            m10866g(rectF, ((float) getWidth()) - (f4 + f), f3, f4);
            float f5 = this.f8041x;
            m10866g(this.f8032o, ((float) getWidth()) - (this.f8041x + f), ((float) getHeight()) - (f5 + f), f5);
            RectF rectF2 = this.f8033p;
            float f6 = this.f8041x;
            m10866g(rectF2, f3, ((float) getHeight()) - (f + f6), f6);
            m10866g(this.f8034q, f2, f2, this.f8038u);
            RectF rectF3 = this.f8035r;
            float f7 = this.f8038u;
            m10866g(rectF3, (((float) getWidth()) - f7) - f2, f2, f7);
            float f8 = this.f8040w;
            m10866g(this.f8036s, (((float) getWidth()) - this.f8040w) - f2, (((float) getHeight()) - f8) - f2, f8);
            RectF rectF4 = this.f8037t;
            float f9 = this.f8040w;
            m10866g(rectF4, f2, (((float) getHeight()) - f9) - f2, f9);
        } else if (i == 1) {
            float f10 = f + 0.0f;
            m10866g(this.f8030m, f10, f10, this.f8039v);
            RectF rectF5 = this.f8031n;
            float f11 = this.f8041x;
            m10866g(rectF5, ((float) getWidth()) - (f11 + f), f10, f11);
            float f12 = this.f8041x;
            m10866g(this.f8032o, ((float) getWidth()) - (this.f8041x + f), ((float) getHeight()) - (f12 + f), f12);
            RectF rectF6 = this.f8033p;
            float f13 = this.f8039v;
            m10866g(rectF6, f10, ((float) getHeight()) - (f + f13), f13);
            m10866g(this.f8034q, f2, f2, this.f8038u);
            RectF rectF7 = this.f8035r;
            float f14 = this.f8040w;
            m10866g(rectF7, (((float) getWidth()) - f14) - f2, f2, f14);
            float f15 = this.f8040w;
            m10866g(this.f8036s, (((float) getWidth()) - this.f8040w) - f2, (((float) getHeight()) - f15) - f2, f15);
            RectF rectF8 = this.f8037t;
            float f16 = this.f8038u;
            m10866g(rectF8, f2, (((float) getHeight()) - f16) - f2, f16);
        } else if (i == 2) {
            float f17 = f + 0.0f;
            m10866g(this.f8030m, f17, f17, this.f8041x);
            RectF rectF9 = this.f8031n;
            float f18 = this.f8041x;
            m10866g(rectF9, ((float) getWidth()) - (f18 + f), f17, f18);
            float f19 = this.f8039v;
            m10866g(this.f8032o, ((float) getWidth()) - (this.f8039v + f), ((float) getHeight()) - (f19 + f), f19);
            RectF rectF10 = this.f8033p;
            float f20 = this.f8039v;
            m10866g(rectF10, f17, ((float) getHeight()) - (f + f20), f20);
            m10866g(this.f8034q, f2, f2, this.f8040w);
            RectF rectF11 = this.f8035r;
            float f21 = this.f8040w;
            m10866g(rectF11, (((float) getWidth()) - f21) - f2, f2, f21);
            float f22 = this.f8038u;
            m10866g(this.f8036s, (((float) getWidth()) - this.f8038u) - f2, (((float) getHeight()) - f22) - f2, f22);
            RectF rectF12 = this.f8037t;
            float f23 = this.f8038u;
            m10866g(rectF12, f2, (((float) getHeight()) - f23) - f2, f23);
        } else if (i == 3) {
            float f24 = f + 0.0f;
            m10866g(this.f8030m, f24, f24, this.f8041x);
            RectF rectF13 = this.f8031n;
            float f25 = this.f8039v;
            m10866g(rectF13, ((float) getWidth()) - (f25 + f), f24, f25);
            float f26 = this.f8039v;
            m10866g(this.f8032o, ((float) getWidth()) - (this.f8039v + f), ((float) getHeight()) - (f26 + f), f26);
            RectF rectF14 = this.f8033p;
            float f27 = this.f8041x;
            m10866g(rectF14, f24, ((float) getHeight()) - (f + f27), f27);
            m10866g(this.f8034q, f2, f2, this.f8040w);
            RectF rectF15 = this.f8035r;
            float f28 = this.f8038u;
            m10866g(rectF15, (((float) getWidth()) - f28) - f2, f2, f28);
            float f29 = this.f8038u;
            m10866g(this.f8036s, (((float) getWidth()) - this.f8038u) - f2, (((float) getHeight()) - f29) - f2, f29);
            RectF rectF16 = this.f8037t;
            float f30 = this.f8040w;
            m10866g(rectF16, f2, (((float) getHeight()) - f30) - f2, f30);
        }
        this.f8028k.reset();
        this.f8028k.addArc(this.f8030m, -180.0f, 90.0f);
        this.f8028k.arcTo(this.f8031n, -90.0f, 90.0f);
        this.f8028k.arcTo(this.f8032o, 0.0f, 90.0f);
        this.f8028k.arcTo(this.f8033p, 90.0f, 90.0f);
        this.f8029l.reset();
        this.f8029l.addArc(this.f8034q, -180.0f, 90.0f);
        this.f8029l.arcTo(this.f8035r, -90.0f, 90.0f);
        this.f8029l.arcTo(this.f8036s, 0.0f, 90.0f);
        this.f8029l.arcTo(this.f8037t, 90.0f, 90.0f);
    }

    /* renamed from: f */
    public void mo9045f(int i) {
        Log.v("M_SweepGradientView", "onOrientationChanged_orientation=" + i);
        this.f8019F = i;
        setOrientationMode(i);
    }

    public int[] getColors() {
        return this.f8043z;
    }

    public int getSpeed() {
        return this.f8014A;
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
        m10863c();
        WindowManager windowManager = (WindowManager) this.f8024g.getSystemService("window");
        if (windowManager != null) {
            try {
                mo9045f(windowManager.getDefaultDisplay().getRotation());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void run() {
        while (this.f8023J) {
            m10862b();
        }
    }

    public void setBaseRotate(int i) {
        this.f8014A = i;
    }

    public void setColors(int[] iArr) {
        if (iArr == null || iArr.length <= 1) {
            iArr = new int[]{-1, Color.parseColor(C2276f.f7825a), Color.parseColor(C2276f.f7827c), -1};
        }
        this.f8043z = iArr;
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8043z, (float[]) null);
        this.f8017D = sweepGradient;
        this.f8027j.setShader(sweepGradient);
    }

    public void setRadius(int i) {
        float a = (float) (m10861a((float) i) * 2);
        this.f8041x = a;
        this.f8039v = a;
        this.f8040w = a;
        this.f8038u = a;
        setOrientationMode(this.f8019F);
    }

    public void setRadiusBottom(int i) {
        float a = (float) (m10861a((float) i) * 2);
        this.f8041x = a;
        this.f8040w = a;
        setOrientationMode(this.f8019F);
    }

    public void setRadiusBottomIn(int i) {
        this.f8040w = (float) (m10861a((float) i) * 2);
        setOrientationMode(this.f8019F);
    }

    public void setRadiusBottomOut(int i) {
        this.f8041x = (float) (m10861a((float) i) * 2);
        setOrientationMode(this.f8019F);
    }

    public void setRadiusTop(int i) {
        float a = (float) (m10861a((float) i) * 2);
        this.f8039v = a;
        this.f8038u = a;
        setOrientationMode(this.f8019F);
    }

    public void setRadiusTopIn(int i) {
        this.f8038u = (float) (m10861a((float) i) * 2);
        setOrientationMode(this.f8019F);
    }

    public void setRadiusTopOut(int i) {
        this.f8039v = (float) (m10861a((float) i) * 2);
        setOrientationMode(this.f8019F);
    }

    public void setWidth(int i) {
        this.f8042y = (float) m10861a((float) (i + 1));
        setOrientationMode(this.f8019F);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f8023J = true;
        new Thread(this).start();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f8023J = false;
    }

    public MarqueeSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8024g = context;
        if (Build.VERSION.SDK_INT < 21) {
            setLayerType(1, (Paint) null);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeSurfaceView);
        this.f8014A = obtainStyledAttributes.getInt(C2328w.MarqueeSurfaceView_baseRotateSurfaceView, 5);
        this.f8042y = (float) m10861a(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveWidthSurfaceView, 2.0f) + 1.0f);
        this.f8039v = (float) (m10861a(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusTopOutSurfaceView, 0.0f)) * 2);
        this.f8041x = (float) (m10861a(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusBottomOutSurfaceView, 0.0f)) * 2);
        this.f8038u = (float) (m10861a(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusTopInSurfaceView, 0.0f)) * 2);
        this.f8040w = (float) (m10861a(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusBottomInSurfaceView, 0.0f)) * 2);
        this.f8020G = obtainStyledAttributes.getBoolean(C2328w.MarqueeSurfaceView_isInwardSurfaceView, true);
        this.f8016C = obtainStyledAttributes.getBoolean(C2328w.MarqueeSurfaceView_isCornerBlackSurfaceView, true);
        this.f8026i = obtainStyledAttributes.getBoolean(C2328w.MarqueeSurfaceView_isKnockoutSurfaceView, true);
        obtainStyledAttributes.recycle();
        this.f8025h = m10861a(10.0f);
        this.f8043z = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f8027j.setAntiAlias(true);
        this.f8027j.setFilterBitmap(true);
        m10864d();
    }
}
