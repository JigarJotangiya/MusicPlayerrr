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
import android.graphics.SurfaceTexture;
import android.graphics.SweepGradient;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.TextureView;
import android.view.WindowManager;
import com.coocent.marquee.C2276f;
import com.coocent.marquee.C2328w;

@Deprecated
public class MarqueeTextureView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private int f8044A;

    /* renamed from: B */
    private float f8045B;

    /* renamed from: C */
    private final boolean f8046C;

    /* renamed from: D */
    private SweepGradient f8047D;

    /* renamed from: E */
    private Matrix f8048E = new Matrix();

    /* renamed from: F */
    private int f8049F;

    /* renamed from: G */
    private boolean f8050G;

    /* renamed from: g */
    private final Context f8051g;

    /* renamed from: h */
    private final int f8052h;

    /* renamed from: i */
    private final boolean f8053i;

    /* renamed from: j */
    private Paint f8054j = new Paint();

    /* renamed from: k */
    private Path f8055k = new Path();

    /* renamed from: l */
    private Path f8056l = new Path();

    /* renamed from: m */
    private RectF f8057m = new RectF();

    /* renamed from: n */
    private RectF f8058n = new RectF();

    /* renamed from: o */
    private RectF f8059o = new RectF();

    /* renamed from: p */
    private RectF f8060p = new RectF();

    /* renamed from: q */
    private RectF f8061q = new RectF();

    /* renamed from: r */
    private RectF f8062r = new RectF();

    /* renamed from: s */
    private RectF f8063s = new RectF();

    /* renamed from: t */
    private RectF f8064t = new RectF();

    /* renamed from: u */
    private float f8065u;

    /* renamed from: v */
    private float f8066v;

    /* renamed from: w */
    private float f8067w;

    /* renamed from: x */
    private float f8068x;

    /* renamed from: y */
    private float f8069y;

    /* renamed from: z */
    private int[] f8070z;

    /* renamed from: com.coocent.marquee.surfaceView.MarqueeTextureView$a */
    class C2309a implements Runnable {
        C2309a() {
        }

        public void run() {
            while (true) {
                Canvas lockCanvas = MarqueeTextureView.this.lockCanvas();
                MarqueeTextureView.this.m10872e(lockCanvas);
                try {
                    Thread.sleep(16);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                MarqueeTextureView.this.unlockCanvasAndPost(lockCanvas);
            }
        }
    }

    public MarqueeTextureView(Context context) {
        super(context);
        this.f8051g = context;
        if (Build.VERSION.SDK_INT < 21) {
            setLayerType(1, (Paint) null);
        }
        this.f8044A = 5;
        this.f8069y = (float) m10869b(3.0f);
        this.f8066v = (float) (m10869b(0.0f) * 2);
        this.f8068x = (float) (m10869b(0.0f) * 2);
        this.f8065u = (float) (m10869b(0.0f) * 2);
        this.f8067w = (float) (m10869b(0.0f) * 2);
        this.f8050G = true;
        this.f8046C = true;
        this.f8053i = true;
        this.f8052h = m10869b(10.0f);
        this.f8070z = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f8054j.setAntiAlias(true);
        this.f8054j.setFilterBitmap(true);
        m10870c();
    }

    /* renamed from: b */
    private int m10869b(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f8051g.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    private void m10870c() {
        setSurfaceTextureListener(this);
        setOpaque(false);
    }

    /* renamed from: d */
    private void m10871d() {
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8070z, (float[]) null);
        this.f8047D = sweepGradient;
        this.f8054j.setShader(sweepGradient);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m10872e(Canvas canvas) {
        Log.d("TAGF", "BBBBB");
        if (this.f8046C) {
            canvas.save();
            canvas.clipPath(this.f8055k, Region.Op.DIFFERENCE);
            canvas.drawColor(-16777216);
            canvas.restore();
        }
        canvas.save();
        canvas.clipPath(this.f8055k);
        if (this.f8053i) {
            canvas.clipPath(this.f8056l, Region.Op.DIFFERENCE);
        }
        canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f8054j);
        canvas.restore();
        this.f8048E.setRotate(this.f8045B, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
        SweepGradient sweepGradient = this.f8047D;
        if (sweepGradient != null) {
            sweepGradient.setLocalMatrix(this.f8048E);
        }
        float f = this.f8045B + ((float) this.f8044A);
        this.f8045B = f;
        if (f >= 360.0f) {
            this.f8045B = 0.0f;
        }
    }

    /* renamed from: g */
    private void m10873g(RectF rectF, float f, float f2, float f3) {
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
        if (this.f8050G) {
            f2 = this.f8069y;
            f = 0.0f;
        } else {
            int i2 = this.f8052h;
            f = ((float) i2) - this.f8069y;
            f2 = (float) i2;
        }
        if (i == 0) {
            float f3 = f + 0.0f;
            m10873g(this.f8057m, f3, f3, this.f8066v);
            RectF rectF = this.f8058n;
            float f4 = this.f8066v;
            m10873g(rectF, ((float) getWidth()) - (f4 + f), f3, f4);
            float f5 = this.f8068x;
            m10873g(this.f8059o, ((float) getWidth()) - (this.f8068x + f), ((float) getHeight()) - (f5 + f), f5);
            RectF rectF2 = this.f8060p;
            float f6 = this.f8068x;
            m10873g(rectF2, f3, ((float) getHeight()) - (f + f6), f6);
            m10873g(this.f8061q, f2, f2, this.f8065u);
            RectF rectF3 = this.f8062r;
            float f7 = this.f8065u;
            m10873g(rectF3, (((float) getWidth()) - f7) - f2, f2, f7);
            float f8 = this.f8067w;
            m10873g(this.f8063s, (((float) getWidth()) - this.f8067w) - f2, (((float) getHeight()) - f8) - f2, f8);
            RectF rectF4 = this.f8064t;
            float f9 = this.f8067w;
            m10873g(rectF4, f2, (((float) getHeight()) - f9) - f2, f9);
        } else if (i == 1) {
            float f10 = f + 0.0f;
            m10873g(this.f8057m, f10, f10, this.f8066v);
            RectF rectF5 = this.f8058n;
            float f11 = this.f8068x;
            m10873g(rectF5, ((float) getWidth()) - (f11 + f), f10, f11);
            float f12 = this.f8068x;
            m10873g(this.f8059o, ((float) getWidth()) - (this.f8068x + f), ((float) getHeight()) - (f12 + f), f12);
            RectF rectF6 = this.f8060p;
            float f13 = this.f8066v;
            m10873g(rectF6, f10, ((float) getHeight()) - (f + f13), f13);
            m10873g(this.f8061q, f2, f2, this.f8065u);
            RectF rectF7 = this.f8062r;
            float f14 = this.f8067w;
            m10873g(rectF7, (((float) getWidth()) - f14) - f2, f2, f14);
            float f15 = this.f8067w;
            m10873g(this.f8063s, (((float) getWidth()) - this.f8067w) - f2, (((float) getHeight()) - f15) - f2, f15);
            RectF rectF8 = this.f8064t;
            float f16 = this.f8065u;
            m10873g(rectF8, f2, (((float) getHeight()) - f16) - f2, f16);
        } else if (i == 2) {
            float f17 = f + 0.0f;
            m10873g(this.f8057m, f17, f17, this.f8068x);
            RectF rectF9 = this.f8058n;
            float f18 = this.f8068x;
            m10873g(rectF9, ((float) getWidth()) - (f18 + f), f17, f18);
            float f19 = this.f8066v;
            m10873g(this.f8059o, ((float) getWidth()) - (this.f8066v + f), ((float) getHeight()) - (f19 + f), f19);
            RectF rectF10 = this.f8060p;
            float f20 = this.f8066v;
            m10873g(rectF10, f17, ((float) getHeight()) - (f + f20), f20);
            m10873g(this.f8061q, f2, f2, this.f8067w);
            RectF rectF11 = this.f8062r;
            float f21 = this.f8067w;
            m10873g(rectF11, (((float) getWidth()) - f21) - f2, f2, f21);
            float f22 = this.f8065u;
            m10873g(this.f8063s, (((float) getWidth()) - this.f8065u) - f2, (((float) getHeight()) - f22) - f2, f22);
            RectF rectF12 = this.f8064t;
            float f23 = this.f8065u;
            m10873g(rectF12, f2, (((float) getHeight()) - f23) - f2, f23);
        } else if (i == 3) {
            float f24 = f + 0.0f;
            m10873g(this.f8057m, f24, f24, this.f8068x);
            RectF rectF13 = this.f8058n;
            float f25 = this.f8066v;
            m10873g(rectF13, ((float) getWidth()) - (f25 + f), f24, f25);
            float f26 = this.f8066v;
            m10873g(this.f8059o, ((float) getWidth()) - (this.f8066v + f), ((float) getHeight()) - (f26 + f), f26);
            RectF rectF14 = this.f8060p;
            float f27 = this.f8068x;
            m10873g(rectF14, f24, ((float) getHeight()) - (f + f27), f27);
            m10873g(this.f8061q, f2, f2, this.f8067w);
            RectF rectF15 = this.f8062r;
            float f28 = this.f8065u;
            m10873g(rectF15, (((float) getWidth()) - f28) - f2, f2, f28);
            float f29 = this.f8065u;
            m10873g(this.f8063s, (((float) getWidth()) - this.f8065u) - f2, (((float) getHeight()) - f29) - f2, f29);
            RectF rectF16 = this.f8064t;
            float f30 = this.f8067w;
            m10873g(rectF16, f2, (((float) getHeight()) - f30) - f2, f30);
        }
        this.f8055k.reset();
        this.f8055k.addArc(this.f8057m, -180.0f, 90.0f);
        this.f8055k.arcTo(this.f8058n, -90.0f, 90.0f);
        this.f8055k.arcTo(this.f8059o, 0.0f, 90.0f);
        this.f8055k.arcTo(this.f8060p, 90.0f, 90.0f);
        this.f8056l.reset();
        this.f8056l.addArc(this.f8061q, -180.0f, 90.0f);
        this.f8056l.arcTo(this.f8062r, -90.0f, 90.0f);
        this.f8056l.arcTo(this.f8063s, 0.0f, 90.0f);
        this.f8056l.arcTo(this.f8064t, 90.0f, 90.0f);
    }

    /* renamed from: f */
    public void mo9065f(int i) {
        Log.v("M_SweepGradientView", "onOrientationChanged_orientation=" + i);
        this.f8049F = i;
        setOrientationMode(i);
    }

    public int[] getColors() {
        return this.f8070z;
    }

    public int getSpeed() {
        return this.f8044A;
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
        m10871d();
        WindowManager windowManager = (WindowManager) this.f8051g.getSystemService("window");
        if (windowManager != null) {
            try {
                mo9065f(windowManager.getDefaultDisplay().getRotation());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        new Thread(new C2309a(), "drawThread").start();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setBaseRotate(int i) {
        this.f8044A = i;
    }

    public void setColors(int[] iArr) {
        if (iArr == null || iArr.length <= 1) {
            iArr = new int[]{-1, Color.parseColor(C2276f.f7825a), Color.parseColor(C2276f.f7827c), -1};
        }
        this.f8070z = iArr;
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8070z, (float[]) null);
        this.f8047D = sweepGradient;
        this.f8054j.setShader(sweepGradient);
    }

    public void setRadius(int i) {
        float b = (float) (m10869b((float) i) * 2);
        this.f8068x = b;
        this.f8066v = b;
        this.f8067w = b;
        this.f8065u = b;
        setOrientationMode(this.f8049F);
    }

    public void setRadiusBottom(int i) {
        float b = (float) (m10869b((float) i) * 2);
        this.f8068x = b;
        this.f8067w = b;
        setOrientationMode(this.f8049F);
    }

    public void setRadiusBottomIn(int i) {
        this.f8067w = (float) (m10869b((float) i) * 2);
        setOrientationMode(this.f8049F);
    }

    public void setRadiusBottomOut(int i) {
        this.f8068x = (float) (m10869b((float) i) * 2);
        setOrientationMode(this.f8049F);
    }

    public void setRadiusTop(int i) {
        float b = (float) (m10869b((float) i) * 2);
        this.f8066v = b;
        this.f8065u = b;
        setOrientationMode(this.f8049F);
    }

    public void setRadiusTopIn(int i) {
        this.f8065u = (float) (m10869b((float) i) * 2);
        setOrientationMode(this.f8049F);
    }

    public void setRadiusTopOut(int i) {
        this.f8066v = (float) (m10869b((float) i) * 2);
        setOrientationMode(this.f8049F);
    }

    public void setWidth(int i) {
        this.f8069y = (float) m10869b((float) (i + 1));
        setOrientationMode(this.f8049F);
    }

    public MarqueeTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8051g = context;
        if (Build.VERSION.SDK_INT < 21) {
            setLayerType(1, (Paint) null);
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeSurfaceView);
        this.f8044A = obtainStyledAttributes.getInt(C2328w.MarqueeSurfaceView_baseRotateSurfaceView, 5);
        this.f8069y = (float) m10869b(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveWidthSurfaceView, 2.0f) + 1.0f);
        this.f8066v = (float) (m10869b(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusTopOutSurfaceView, 0.0f)) * 2);
        this.f8068x = (float) (m10869b(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusBottomOutSurfaceView, 0.0f)) * 2);
        this.f8065u = (float) (m10869b(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusTopInSurfaceView, 0.0f)) * 2);
        this.f8067w = (float) (m10869b(obtainStyledAttributes.getFloat(C2328w.MarqueeSurfaceView_effectiveRadiusBottomInSurfaceView, 0.0f)) * 2);
        this.f8050G = obtainStyledAttributes.getBoolean(C2328w.MarqueeSurfaceView_isInwardSurfaceView, true);
        this.f8046C = obtainStyledAttributes.getBoolean(C2328w.MarqueeSurfaceView_isCornerBlackSurfaceView, true);
        this.f8053i = obtainStyledAttributes.getBoolean(C2328w.MarqueeSurfaceView_isKnockoutSurfaceView, true);
        obtainStyledAttributes.recycle();
        this.f8052h = m10869b(10.0f);
        this.f8070z = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f8054j.setAntiAlias(true);
        this.f8054j.setFilterBitmap(true);
        m10870c();
    }
}
