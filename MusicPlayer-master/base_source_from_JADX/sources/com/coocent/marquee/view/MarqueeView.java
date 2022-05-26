package com.coocent.marquee.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.SurfaceTexture;
import android.graphics.SweepGradient;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.WindowManager;
import com.coocent.marquee.C2276f;
import com.coocent.marquee.C2328w;

public class MarqueeView extends TextureView implements TextureView.SurfaceTextureListener {

    /* renamed from: A */
    private int[] f8152A;

    /* renamed from: B */
    private int f8153B;

    /* renamed from: C */
    private float f8154C;

    /* renamed from: D */
    private final boolean f8155D;

    /* renamed from: E */
    private SweepGradient f8156E;

    /* renamed from: F */
    private Matrix f8157F = new Matrix();

    /* renamed from: G */
    private int f8158G;

    /* renamed from: H */
    private boolean f8159H;

    /* renamed from: I */
    private Thread f8160I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f8161J = false;

    /* renamed from: K */
    private boolean f8162K = false;

    /* renamed from: L */
    private Surface f8163L;

    /* renamed from: M */
    private Rect f8164M;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f8165g = false;

    /* renamed from: h */
    private final Context f8166h;

    /* renamed from: i */
    private final int f8167i;

    /* renamed from: j */
    private final boolean f8168j;

    /* renamed from: k */
    private Paint f8169k = new Paint();

    /* renamed from: l */
    private Path f8170l = new Path();

    /* renamed from: m */
    private Path f8171m = new Path();

    /* renamed from: n */
    private RectF f8172n = new RectF();

    /* renamed from: o */
    private RectF f8173o = new RectF();

    /* renamed from: p */
    private RectF f8174p = new RectF();

    /* renamed from: q */
    private RectF f8175q = new RectF();

    /* renamed from: r */
    private RectF f8176r = new RectF();

    /* renamed from: s */
    private RectF f8177s = new RectF();

    /* renamed from: t */
    private RectF f8178t = new RectF();

    /* renamed from: u */
    private RectF f8179u = new RectF();

    /* renamed from: v */
    private float f8180v;

    /* renamed from: w */
    private float f8181w;

    /* renamed from: x */
    private float f8182x;

    /* renamed from: y */
    private float f8183y;

    /* renamed from: z */
    private float f8184z;

    /* renamed from: com.coocent.marquee.view.MarqueeView$a */
    class C2327a implements Runnable {
        C2327a() {
        }

        public void run() {
            while (!MarqueeView.this.f8161J) {
                synchronized (this) {
                    if (MarqueeView.this.f8165g) {
                        MarqueeView.this.m10928g();
                    }
                }
            }
        }
    }

    public MarqueeView(Context context) {
        super(context);
        this.f8166h = context;
        this.f8153B = 5;
        this.f8184z = (float) m10925d(3.0f);
        this.f8181w = (float) (m10925d(0.0f) * 2);
        this.f8183y = (float) (m10925d(0.0f) * 2);
        this.f8180v = (float) (m10925d(0.0f) * 2);
        this.f8182x = (float) (m10925d(0.0f) * 2);
        this.f8159H = true;
        this.f8155D = true;
        this.f8168j = true;
        this.f8167i = m10925d(10.0f);
        this.f8152A = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f8169k.setAntiAlias(true);
        this.f8169k.setFilterBitmap(true);
        m10926e();
    }

    /* renamed from: d */
    private int m10925d(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f8166h.getResources().getDisplayMetrics());
    }

    /* renamed from: e */
    private void m10926e() {
        setSurfaceTextureListener(this);
        setOpaque(false);
    }

    /* renamed from: f */
    private void m10927f() {
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8152A, (float[]) null);
        this.f8156E = sweepGradient;
        this.f8169k.setShader(sweepGradient);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m10928g() {
        Rect rect;
        try {
            Surface surface = this.f8163L;
            if (surface != null && (rect = this.f8164M) != null) {
                Canvas lockCanvas = surface.lockCanvas(rect);
                m10929h(lockCanvas);
                try {
                    Thread.sleep(6);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                this.f8163L.unlockCanvasAndPost(lockCanvas);
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        } catch (Surface.OutOfResourcesException e3) {
            e3.printStackTrace();
        }
    }

    /* renamed from: h */
    private void m10929h(Canvas canvas) {
        if (canvas != null) {
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.f8155D) {
                canvas.save();
                canvas.clipPath(this.f8170l, Region.Op.DIFFERENCE);
                canvas.drawColor(-16777216);
                canvas.restore();
            }
            canvas.save();
            canvas.clipPath(this.f8170l);
            if (this.f8168j) {
                canvas.clipPath(this.f8171m, Region.Op.DIFFERENCE);
            }
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), (float) getHeight(), this.f8169k);
            canvas.restore();
            this.f8157F.setRotate(this.f8154C, ((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f);
            SweepGradient sweepGradient = this.f8156E;
            if (sweepGradient != null) {
                sweepGradient.setLocalMatrix(this.f8157F);
            }
            float f = this.f8154C + ((float) this.f8153B);
            this.f8154C = f;
            if (f >= 360.0f) {
                this.f8154C = 0.0f;
            }
        } else {
            Log.e("TAGF", "canvas is null");
        }
        m10931m();
    }

    /* renamed from: l */
    private void m10930l(RectF rectF, float f, float f2, float f3) {
        if (f3 <= 0.0f) {
            f3 = 0.1f;
        }
        rectF.left = f;
        rectF.top = f2;
        rectF.right = f + f3;
        rectF.bottom = f2 + f3;
    }

    /* renamed from: m */
    private void m10931m() {
        this.f8165g = true;
    }

    /* renamed from: n */
    private void m10932n() {
        if (this.f8162K) {
            this.f8161J = false;
            this.f8165g = true;
            Thread thread = this.f8160I;
            if (thread != null && !thread.isInterrupted()) {
                this.f8160I.interrupt();
            }
            Thread thread2 = new Thread(new C2327a(), String.valueOf(System.currentTimeMillis()));
            this.f8160I = thread2;
            thread2.start();
        }
    }

    /* renamed from: o */
    private void m10933o() {
        this.f8165g = false;
    }

    private void setOrientationMode(int i) {
        float f;
        float f2;
        if (this.f8159H) {
            f2 = this.f8184z;
            f = 0.0f;
        } else {
            int i2 = this.f8167i;
            f = ((float) i2) - this.f8184z;
            f2 = (float) i2;
        }
        if (i == 0) {
            float f3 = f + 0.0f;
            m10930l(this.f8172n, f3, f3, this.f8181w);
            RectF rectF = this.f8173o;
            float f4 = this.f8181w;
            m10930l(rectF, ((float) getWidth()) - (f4 + f), f3, f4);
            float f5 = this.f8183y;
            m10930l(this.f8174p, ((float) getWidth()) - (this.f8183y + f), ((float) getHeight()) - (f5 + f), f5);
            RectF rectF2 = this.f8175q;
            float f6 = this.f8183y;
            m10930l(rectF2, f3, ((float) getHeight()) - (f + f6), f6);
            m10930l(this.f8176r, f2, f2, this.f8180v);
            RectF rectF3 = this.f8177s;
            float f7 = this.f8180v;
            m10930l(rectF3, (((float) getWidth()) - f7) - f2, f2, f7);
            float f8 = this.f8182x;
            m10930l(this.f8178t, (((float) getWidth()) - this.f8182x) - f2, (((float) getHeight()) - f8) - f2, f8);
            RectF rectF4 = this.f8179u;
            float f9 = this.f8182x;
            m10930l(rectF4, f2, (((float) getHeight()) - f9) - f2, f9);
        } else if (i == 1) {
            float f10 = f + 0.0f;
            m10930l(this.f8172n, f10, f10, this.f8181w);
            RectF rectF5 = this.f8173o;
            float f11 = this.f8183y;
            m10930l(rectF5, ((float) getWidth()) - (f11 + f), f10, f11);
            float f12 = this.f8183y;
            m10930l(this.f8174p, ((float) getWidth()) - (this.f8183y + f), ((float) getHeight()) - (f12 + f), f12);
            RectF rectF6 = this.f8175q;
            float f13 = this.f8181w;
            m10930l(rectF6, f10, ((float) getHeight()) - (f + f13), f13);
            m10930l(this.f8176r, f2, f2, this.f8180v);
            RectF rectF7 = this.f8177s;
            float f14 = this.f8182x;
            m10930l(rectF7, (((float) getWidth()) - f14) - f2, f2, f14);
            float f15 = this.f8182x;
            m10930l(this.f8178t, (((float) getWidth()) - this.f8182x) - f2, (((float) getHeight()) - f15) - f2, f15);
            RectF rectF8 = this.f8179u;
            float f16 = this.f8180v;
            m10930l(rectF8, f2, (((float) getHeight()) - f16) - f2, f16);
        } else if (i == 2) {
            float f17 = f + 0.0f;
            m10930l(this.f8172n, f17, f17, this.f8183y);
            RectF rectF9 = this.f8173o;
            float f18 = this.f8183y;
            m10930l(rectF9, ((float) getWidth()) - (f18 + f), f17, f18);
            float f19 = this.f8181w;
            m10930l(this.f8174p, ((float) getWidth()) - (this.f8181w + f), ((float) getHeight()) - (f19 + f), f19);
            RectF rectF10 = this.f8175q;
            float f20 = this.f8181w;
            m10930l(rectF10, f17, ((float) getHeight()) - (f + f20), f20);
            m10930l(this.f8176r, f2, f2, this.f8182x);
            RectF rectF11 = this.f8177s;
            float f21 = this.f8182x;
            m10930l(rectF11, (((float) getWidth()) - f21) - f2, f2, f21);
            float f22 = this.f8180v;
            m10930l(this.f8178t, (((float) getWidth()) - this.f8180v) - f2, (((float) getHeight()) - f22) - f2, f22);
            RectF rectF12 = this.f8179u;
            float f23 = this.f8180v;
            m10930l(rectF12, f2, (((float) getHeight()) - f23) - f2, f23);
        } else if (i == 3) {
            float f24 = f + 0.0f;
            m10930l(this.f8172n, f24, f24, this.f8183y);
            RectF rectF13 = this.f8173o;
            float f25 = this.f8181w;
            m10930l(rectF13, ((float) getWidth()) - (f25 + f), f24, f25);
            float f26 = this.f8181w;
            m10930l(this.f8174p, ((float) getWidth()) - (this.f8181w + f), ((float) getHeight()) - (f26 + f), f26);
            RectF rectF14 = this.f8175q;
            float f27 = this.f8183y;
            m10930l(rectF14, f24, ((float) getHeight()) - (f + f27), f27);
            m10930l(this.f8176r, f2, f2, this.f8182x);
            RectF rectF15 = this.f8177s;
            float f28 = this.f8180v;
            m10930l(rectF15, (((float) getWidth()) - f28) - f2, f2, f28);
            float f29 = this.f8180v;
            m10930l(this.f8178t, (((float) getWidth()) - this.f8180v) - f2, (((float) getHeight()) - f29) - f2, f29);
            RectF rectF16 = this.f8179u;
            float f30 = this.f8182x;
            m10930l(rectF16, f2, (((float) getHeight()) - f30) - f2, f30);
        }
        this.f8170l.reset();
        this.f8170l.addArc(this.f8172n, -180.0f, 90.0f);
        this.f8170l.arcTo(this.f8173o, -90.0f, 90.0f);
        this.f8170l.arcTo(this.f8174p, 0.0f, 90.0f);
        this.f8170l.arcTo(this.f8175q, 90.0f, 90.0f);
        this.f8171m.reset();
        this.f8171m.addArc(this.f8176r, -180.0f, 90.0f);
        this.f8171m.arcTo(this.f8177s, -90.0f, 90.0f);
        this.f8171m.arcTo(this.f8178t, 0.0f, 90.0f);
        this.f8171m.arcTo(this.f8179u, 90.0f, 90.0f);
    }

    public int[] getColors() {
        return this.f8152A;
    }

    public int getSpeed() {
        return this.f8153B;
    }

    /* renamed from: i */
    public void mo9102i(int i) {
        Log.v("M_SweepGradientView", "onOrientationChanged_orientation=" + i);
        m10933o();
        this.f8158G = i;
        setOrientationMode(i);
        m10931m();
    }

    /* renamed from: j */
    public void mo9103j() {
        Thread thread = this.f8160I;
        if (thread != null && !thread.isInterrupted()) {
            this.f8160I.interrupt();
            this.f8160I = null;
        }
        this.f8161J = true;
        m10933o();
    }

    /* renamed from: k */
    public void mo9104k(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m10933o();
        this.f8180v = (float) (m10925d((float) i) * 2);
        this.f8182x = (float) (m10925d((float) i2) * 2);
        this.f8181w = (float) (m10925d((float) i3) * 2);
        this.f8183y = (float) (m10925d((float) i4) * 2);
        this.f8184z = (float) m10925d((float) (i5 + 1));
        setOrientationMode(this.f8158G);
        this.f8153B = i6;
        if (iArr == null || iArr.length <= 1) {
            iArr = new int[]{-1, Color.parseColor(C2276f.f7825a), Color.parseColor(C2276f.f7827c), -1};
        }
        this.f8152A = iArr;
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8152A, (float[]) null);
        this.f8156E = sweepGradient;
        this.f8169k.setShader(sweepGradient);
        m10931m();
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
        m10927f();
        WindowManager windowManager = (WindowManager) this.f8166h.getSystemService("window");
        if (windowManager != null) {
            try {
                mo9102i(windowManager.getDefaultDisplay().getRotation());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f8162K = true;
        this.f8163L = new Surface(surfaceTexture);
        this.f8164M = new Rect(0, 0, i, i2);
        m10932n();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        this.f8162K = false;
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            mo9103j();
        } else {
            m10932n();
        }
    }

    public void setBackground(Drawable drawable) {
        super.setBackground((Drawable) null);
    }

    public void setBaseRotate(int i) {
        m10933o();
        this.f8153B = i;
        m10931m();
    }

    public void setColors(int[] iArr) {
        m10933o();
        if (iArr == null || iArr.length <= 1) {
            iArr = new int[]{-1, Color.parseColor(C2276f.f7825a), Color.parseColor(C2276f.f7827c), -1};
        }
        this.f8152A = iArr;
        SweepGradient sweepGradient = new SweepGradient(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, this.f8152A, (float[]) null);
        this.f8156E = sweepGradient;
        this.f8169k.setShader(sweepGradient);
        m10931m();
    }

    public void setRadius(int i) {
        m10933o();
        float d = (float) (m10925d((float) i) * 2);
        this.f8183y = d;
        this.f8181w = d;
        this.f8182x = d;
        this.f8180v = d;
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setRadiusBottom(int i) {
        m10933o();
        float d = (float) (m10925d((float) i) * 2);
        this.f8183y = d;
        this.f8182x = d;
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setRadiusBottomIn(int i) {
        m10933o();
        this.f8182x = (float) (m10925d((float) i) * 2);
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setRadiusBottomOut(int i) {
        m10933o();
        this.f8183y = (float) (m10925d((float) i) * 2);
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setRadiusTop(int i) {
        m10933o();
        float d = (float) (m10925d((float) i) * 2);
        this.f8181w = d;
        this.f8180v = d;
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setRadiusTopIn(int i) {
        m10933o();
        this.f8180v = (float) (m10925d((float) i) * 2);
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setRadiusTopOut(int i) {
        m10933o();
        this.f8181w = (float) (m10925d((float) i) * 2);
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public void setWidth(int i) {
        m10933o();
        this.f8184z = (float) m10925d((float) (i + 1));
        setOrientationMode(this.f8158G);
        m10931m();
    }

    public MarqueeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f8166h = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeSweepGradientView);
        this.f8153B = obtainStyledAttributes.getInt(C2328w.MarqueeSweepGradientView_baseRotate, 5);
        this.f8184z = (float) m10925d(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveWidth, 2.0f) + 1.0f);
        this.f8181w = (float) (m10925d(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusTopOut, 0.0f)) * 2);
        this.f8183y = (float) (m10925d(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusBottomOut, 0.0f)) * 2);
        this.f8180v = (float) (m10925d(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusTopIn, 0.0f)) * 2);
        this.f8182x = (float) (m10925d(obtainStyledAttributes.getFloat(C2328w.MarqueeSweepGradientView_effectiveRadiusBottomIn, 0.0f)) * 2);
        this.f8159H = obtainStyledAttributes.getBoolean(C2328w.MarqueeSweepGradientView_isInward, true);
        this.f8155D = obtainStyledAttributes.getBoolean(C2328w.MarqueeSweepGradientView_isCornerBlack, true);
        this.f8168j = obtainStyledAttributes.getBoolean(C2328w.MarqueeSweepGradientView_isKnockout, true);
        obtainStyledAttributes.recycle();
        this.f8167i = m10925d(10.0f);
        this.f8152A = new int[]{Color.parseColor("#10000000"), Color.parseColor("#10000000")};
        this.f8169k.setAntiAlias(true);
        this.f8169k.setFilterBitmap(true);
        m10926e();
    }
}
