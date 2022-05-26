package com.coocent.visualizerlibrary;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.media.audiofx.Visualizer;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public class DropVisualizerView extends View implements View.OnClickListener {

    /* renamed from: A */
    private int[] f9626A;

    /* renamed from: B */
    private int[] f9627B;

    /* renamed from: C */
    private int[] f9628C;

    /* renamed from: D */
    private C2832c f9629D;

    /* renamed from: E */
    private Runnable f9630E;

    /* renamed from: g */
    private boolean f9631g;

    /* renamed from: h */
    private int f9632h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public int f9633i;

    /* renamed from: j */
    private float f9634j;

    /* renamed from: k */
    private int f9635k;

    /* renamed from: l */
    private int f9636l;

    /* renamed from: m */
    private Visualizer f9637m;

    /* renamed from: n */
    private int f9638n;

    /* renamed from: o */
    private Paint f9639o;

    /* renamed from: p */
    private Paint f9640p;

    /* renamed from: q */
    private Paint f9641q;

    /* renamed from: r */
    private Matrix f9642r;

    /* renamed from: s */
    private Bitmap f9643s;

    /* renamed from: t */
    private Canvas f9644t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f9645u;

    /* renamed from: v */
    private float[] f9646v;

    /* renamed from: w */
    private byte[] f9647w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public int[] f9648x;

    /* renamed from: y */
    private int[] f9649y;

    /* renamed from: z */
    private final float[] f9650z;

    /* renamed from: com.coocent.visualizerlibrary.DropVisualizerView$a */
    class C2830a implements Visualizer.OnDataCaptureListener {
        C2830a() {
        }

        public void onFftDataCapture(Visualizer visualizer, byte[] bArr, int i) {
            boolean unused = DropVisualizerView.this.f9645u = false;
            DropVisualizerView.this.mo10586t(bArr);
        }

        public void onWaveFormDataCapture(Visualizer visualizer, byte[] bArr, int i) {
        }
    }

    /* renamed from: com.coocent.visualizerlibrary.DropVisualizerView$b */
    class C2831b implements Runnable {
        C2831b() {
        }

        public void run() {
            if (DropVisualizerView.this.f9648x != null) {
                int i = 0;
                while (true) {
                    if (i >= DropVisualizerView.this.f9648x.length) {
                        break;
                    } else if (((float) DropVisualizerView.this.f9648x[i]) != ((float) DropVisualizerView.this.f9633i) * 1.0f) {
                        DropVisualizerView.this.mo10574f();
                        break;
                    } else {
                        i++;
                    }
                }
                boolean unused = DropVisualizerView.this.f9645u = true;
            }
        }
    }

    /* renamed from: com.coocent.visualizerlibrary.DropVisualizerView$c */
    private static class C2832c extends Handler {

        /* renamed from: a */
        private WeakReference f9653a;

        public C2832c(DropVisualizerView dropVisualizerView) {
            super(Looper.getMainLooper());
            this.f9653a = new WeakReference(dropVisualizerView);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (((DropVisualizerView) this.f9653a.get()) == null) {
            }
        }
    }

    public DropVisualizerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: o */
    private int m12802o(float f) {
        return (int) ((f * getContext().getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: p */
    private int m12803p(float f, int i) {
        return (Math.min(255, Math.max(0, (int) (f * 255.0f))) << 24) + (i & 16777215);
    }

    /* renamed from: q */
    private void m12804q() {
        this.f9629D = new C2832c(this);
        int[] iArr = this.f9626A;
        this.f9627B = new int[iArr.length];
        this.f9628C = new int[iArr.length];
        int i = 0;
        while (true) {
            int[] iArr2 = this.f9626A;
            if (i < iArr2.length) {
                this.f9627B[i] = m12803p(0.3f, iArr2[i]);
                this.f9628C[i] = m12803p(0.7f, this.f9626A[i]);
                i++;
            } else {
                this.f9639o = new Paint();
                this.f9640p = new Paint();
                this.f9641q = new Paint();
                this.f9642r = new Matrix();
                return;
            }
        }
    }

    private void setSessionId(int i) {
        try {
            if (this.f9637m == null) {
                this.f9637m = new Visualizer(i);
            } else if (this.f9638n != i) {
                mo10581s();
                this.f9637m = new Visualizer(i);
            }
            this.f9638n = i;
        } catch (Exception e) {
            e.printStackTrace();
        }
        Visualizer visualizer = this.f9637m;
        if (visualizer == null) {
            mo10574f();
            return;
        }
        try {
            if (visualizer.getEnabled()) {
                this.f9637m.setEnabled(false);
                this.f9637m.setCaptureSize(Visualizer.getCaptureSizeRange()[1]);
            }
            this.f9637m.setDataCaptureListener(new C2830a(), Visualizer.getMaxCaptureRate() / 2, false, true);
            if (!this.f9637m.getEnabled()) {
                this.f9637m.setEnabled(true);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: f */
    public void mo10574f() {
        if (this.f9647w == null) {
            byte[] bArr = new byte[1024];
            this.f9647w = bArr;
            Arrays.fill(bArr, (byte) 0);
        }
        try {
            mo10586t(this.f9647w);
        } catch (Exception e) {
            e.printStackTrace();
        }
        C2832c cVar = this.f9629D;
        if (cVar != null) {
            cVar.removeCallbacks(this.f9630E);
            this.f9629D.postDelayed(this.f9630E, 100);
        }
    }

    /* renamed from: n */
    public void mo10575n() {
        try {
            Visualizer visualizer = this.f9637m;
            if (visualizer != null && visualizer.getEnabled()) {
                this.f9637m.setEnabled(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onClick(View view) {
        setUseLog10(!this.f9631g);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo10581s();
        C2832c cVar = this.f9629D;
        if (cVar != null) {
            cVar.removeCallbacksAndMessages((Object) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int i2 = this.f9635k;
        if (i2 > 0 && (i = this.f9636l) > 0) {
            if (this.f9643s == null) {
                this.f9643s = Bitmap.createBitmap(i2, i, Bitmap.Config.ARGB_8888);
            }
            if (this.f9644t == null) {
                this.f9644t = new Canvas(this.f9643s);
            }
            int o = m12802o(1.0f);
            int i3 = this.f9635k;
            int i4 = this.f9632h;
            float f = (((float) (i3 - ((i4 - 1) * o))) * 1.0f) / ((float) i4);
            if (this.f9646v != null) {
                int i5 = 0;
                while (true) {
                    float[] fArr = this.f9646v;
                    if (i5 >= fArr.length) {
                        break;
                    }
                    if (!this.f9645u) {
                        Canvas canvas2 = this.f9644t;
                        float f2 = ((float) i5) * (((float) o) + f);
                        int i6 = this.f9636l;
                        float f3 = this.f9634j;
                        canvas2.drawRect(f2, (((float) i6) * f3) - (fArr[i5] * ((float) this.f9633i)), f + f2, ((float) i6) * f3, this.f9639o);
                    }
                    float f4 = (float) o;
                    float f5 = (f + f4) * ((float) i5);
                    int i7 = this.f9636l;
                    float f6 = this.f9634j;
                    float f7 = f + f5;
                    canvas.drawRect(f5, (((float) i7) * f6) - (this.f9646v[i5] * ((float) this.f9633i)), f7, ((float) i7) * f6, this.f9639o);
                    int i8 = this.f9636l;
                    float f8 = this.f9634j;
                    canvas.drawRect(f5, (((float) i8) * f8) + f4, f7, (((float) i8) * f8) + f4 + ((this.f9646v[i5] * ((float) this.f9633i)) / 3.0f), this.f9640p);
                    int i9 = this.f9636l;
                    float f9 = this.f9634j;
                    int[] iArr = this.f9648x;
                    canvas.drawRect(f5, ((((float) i9) * f9) - ((float) iArr[i5])) - ((float) (o * 5)), f7, ((((float) i9) * f9) - ((float) iArr[i5])) - ((float) (o * 3)), this.f9639o);
                    i5++;
                }
            }
            if (!this.f9645u) {
                this.f9644t.drawPaint(this.f9641q);
                canvas.drawBitmap(this.f9643s, this.f9642r, (Paint) null);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f9636l = i2;
        this.f9635k = i;
        if (i != i3) {
            this.f9639o.setShader(new LinearGradient(0.0f, 0.0f, (float) this.f9635k, 0.0f, this.f9626A, this.f9650z, Shader.TileMode.MIRROR));
            this.f9640p.setShader(new LinearGradient(0.0f, 0.0f, (float) this.f9635k, 0.0f, this.f9627B, this.f9650z, Shader.TileMode.MIRROR));
            this.f9641q.setShader(new LinearGradient(0.0f, 0.0f, (float) this.f9635k, 0.0f, this.f9628C, this.f9650z, Shader.TileMode.MIRROR));
            this.f9641q.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.f9645u = true;
    }

    /* renamed from: r */
    public void mo10580r(int i, boolean z) {
        mo10575n();
        C2832c cVar = this.f9629D;
        if (cVar != null) {
            cVar.removeCallbacks(this.f9630E);
        }
        if (!z || i <= 0) {
            mo10574f();
        } else {
            setSessionId(i);
        }
    }

    /* renamed from: s */
    public void mo10581s() {
        try {
            Visualizer visualizer = this.f9637m;
            if (visualizer != null) {
                if (visualizer.getEnabled()) {
                    this.f9637m.setEnabled(false);
                }
                this.f9637m.release();
                this.f9637m = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setCylinderHeight(int i) {
        this.f9633i = i;
    }

    public void setCylinderSize(int i) {
        this.f9632h = i;
        invalidate();
    }

    public void setPercentHeight(float f) {
        this.f9634j = f;
    }

    public void setUseLog10(boolean z) {
        this.f9631g = z;
    }

    /* renamed from: t */
    public void mo10586t(byte[] bArr) {
        if (bArr != null) {
            int i = this.f9632h;
            if (i * 2 <= bArr.length) {
                float[] fArr = this.f9646v;
                if (fArr == null || fArr.length < i) {
                    this.f9646v = new float[i];
                }
                int[] iArr = this.f9648x;
                if (iArr == null || iArr.length < i) {
                    this.f9648x = new int[i];
                }
                int[] iArr2 = this.f9649y;
                if (iArr2 == null || iArr2.length < i) {
                    int[] iArr3 = new int[i];
                    this.f9649y = iArr3;
                    Arrays.fill(iArr3, 1);
                }
                for (int i2 = 0; i2 < this.f9632h; i2++) {
                    if (this.f9631g) {
                        int i3 = i2 * 2;
                        int i4 = i3 + 1;
                        this.f9646v[i2] = ((float) Math.log10((double) ((bArr[i3] * bArr[i3]) + (bArr[i4] * bArr[i4])))) * 30.0f;
                        float[] fArr2 = this.f9646v;
                        if (fArr2[i2] <= 0.0f) {
                            fArr2[i2] = 1.0f;
                        }
                    } else {
                        int i5 = i2 * 2;
                        this.f9646v[i2] = (float) Math.hypot((double) bArr[i5], (double) bArr[i5 + 1]);
                        float[] fArr3 = this.f9646v;
                        if (fArr3[i2] == 0.0f) {
                            fArr3[i2] = 1.0f;
                        }
                    }
                    int i6 = ((int) this.f9646v[i2]) * this.f9633i;
                    int[] iArr4 = this.f9648x;
                    if (iArr4[i2] > i6) {
                        int i7 = iArr4[i2];
                        int[] iArr5 = this.f9649y;
                        iArr4[i2] = i7 - iArr5[i2];
                        if (iArr4[i2] < i6) {
                            iArr4[i2] = i6;
                        }
                        iArr5[i2] = iArr5[i2] * 2;
                    } else {
                        iArr4[i2] = i6;
                        this.f9649y[i2] = 1;
                    }
                }
                invalidate();
            }
        }
    }

    public DropVisualizerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public DropVisualizerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f9631g = false;
        this.f9632h = 50;
        this.f9633i = 3;
        this.f9634j = 0.6f;
        this.f9650z = new float[]{0.0f, 0.14f, 0.58f, 0.86f, 1.0f};
        this.f9626A = new int[]{Color.parseColor("#f71e00"), Color.parseColor("#fe7b00"), Color.parseColor("#f0ff00"), Color.parseColor("#00d731"), Color.parseColor("#007385")};
        this.f9630E = new C2831b();
        m12804q();
    }
}
