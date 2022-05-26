package com.coocent.musiccutter.ringtone;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0506a;
import p159f.p166c.p199f.C4488b;
import p159f.p166c.p199f.C4489c;
import p159f.p166c.p199f.p200h.C4497c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class WaveformView extends View {

    /* renamed from: A */
    private int f8470A;

    /* renamed from: B */
    private float f8471B;

    /* renamed from: C */
    private C2427a f8472C;

    /* renamed from: D */
    private boolean f8473D;

    /* renamed from: E */
    private Bitmap f8474E;

    /* renamed from: F */
    private boolean f8475F = true;

    /* renamed from: G */
    private final Paint f8476G;

    /* renamed from: H */
    private final Paint f8477H;

    /* renamed from: I */
    private int f8478I = 0;

    /* renamed from: g */
    private Paint f8479g;

    /* renamed from: h */
    private Paint f8480h;

    /* renamed from: i */
    private Paint f8481i;

    /* renamed from: j */
    private Paint f8482j;

    /* renamed from: k */
    private Paint f8483k;

    /* renamed from: l */
    private Paint f8484l;

    /* renamed from: m */
    private Paint f8485m;

    /* renamed from: n */
    private Paint f8486n;

    /* renamed from: o */
    private C2438d f8487o;

    /* renamed from: p */
    private int[] f8488p;

    /* renamed from: q */
    private double[][] f8489q;

    /* renamed from: r */
    private double[] f8490r;

    /* renamed from: s */
    private int[] f8491s;

    /* renamed from: t */
    private int f8492t = 4;

    /* renamed from: u */
    private int f8493u;

    /* renamed from: v */
    private int f8494v;

    /* renamed from: w */
    private int f8495w;

    /* renamed from: x */
    private int f8496x;

    /* renamed from: y */
    private int f8497y;

    /* renamed from: z */
    private int f8498z;

    /* renamed from: com.coocent.musiccutter.ringtone.WaveformView$a */
    public interface C2427a {
        /* renamed from: a */
        void mo9370a(float f, float f2);

        /* renamed from: n */
        void mo9375n();

        /* renamed from: q */
        void mo9379q(float f, float f2);

        /* renamed from: s */
        void mo9382s(float f);
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        float f = context.getResources().getDisplayMetrics().density;
        setFocusable(false);
        Paint paint = new Paint();
        this.f8479g = paint;
        paint.setAntiAlias(false);
        this.f8479g.setColor(C0506a.m3150b(context, C4488b.grid_line));
        Paint paint2 = new Paint();
        this.f8480h = paint2;
        paint2.setAntiAlias(false);
        this.f8480h.setColor(C0506a.m3150b(context, C4488b.waveform_selected));
        Paint paint3 = new Paint();
        this.f8481i = paint3;
        paint3.setAntiAlias(false);
        this.f8481i.setColor(C0506a.m3150b(context, C4488b.waveform_unselected));
        Paint paint4 = new Paint();
        this.f8482j = paint4;
        paint4.setAntiAlias(false);
        this.f8482j.setColor(C0506a.m3150b(context, C4488b.waveform_unselected_bkgnd_overlay));
        Paint paint5 = new Paint();
        this.f8483k = paint5;
        paint5.setAntiAlias(true);
        this.f8483k.setStrokeWidth(1.5f);
        this.f8483k.setPathEffect(new DashPathEffect(new float[]{3.0f, 2.0f}, 0.0f));
        this.f8483k.setColor(C0506a.m3150b(context, C4488b.selection_border));
        Paint paint6 = new Paint();
        this.f8484l = paint6;
        paint6.setAntiAlias(false);
        this.f8484l.setColor(C0506a.m3150b(context, C4488b.playback_indicator));
        Paint paint7 = new Paint();
        this.f8485m = paint7;
        paint7.setAntiAlias(true);
        this.f8485m.setColor(C0506a.m3150b(context, C4488b.timecode));
        this.f8485m.setTextSize(24.0f);
        Paint paint8 = new Paint();
        this.f8476G = paint8;
        paint8.setAntiAlias(true);
        paint8.setStrokeWidth((float) C4497c.m19710a(context, 1.0f));
        int i = C4488b.crop_light_color;
        paint8.setColor(C0506a.m3150b(context, i));
        Paint paint9 = new Paint();
        this.f8477H = paint9;
        paint9.setAntiAlias(true);
        paint9.setStrokeWidth((float) C4497c.m19710a(context, 1.0f));
        paint9.setColor(C0506a.m3150b(context, i));
        Paint paint10 = new Paint();
        this.f8486n = paint10;
        paint10.setAntiAlias(true);
        this.f8486n.setColor(getResources().getColor(C4488b.default_time_bg_color));
        this.f8474E = BitmapFactory.decodeResource(getResources(), C4489c.spectrum_progress_line);
        BitmapFactory.decodeResource(getResources(), C4489c.spectrum_editor_list);
        this.f8487o = null;
        this.f8488p = null;
        this.f8489q = null;
        this.f8491s = null;
        this.f8496x = 0;
        this.f8470A = -1;
        this.f8497y = 0;
        this.f8498z = 0;
        this.f8471B = 1.0f;
        this.f8473D = false;
        setPadding(C4497c.m19710a(context, 20.0f), 0, C4497c.m19710a(context, 20.0f), 0);
    }

    /* renamed from: c */
    private void m11324c() {
        int i;
        int l = this.f8487o.mo9475l();
        int[] i2 = this.f8487o.mo9472i();
        double[] dArr = new double[l];
        if (l == 1) {
            dArr[0] = (double) i2[0];
        } else if (l == 2) {
            dArr[0] = (double) i2[0];
            dArr[1] = (double) i2[1];
        } else if (l > 2) {
            dArr[0] = (((double) i2[0]) / 2.0d) + (((double) i2[1]) / 2.0d);
            int i3 = 1;
            while (true) {
                i = l - 1;
                if (i3 >= i) {
                    break;
                }
                int i4 = i3 + 1;
                dArr[i3] = (((double) i2[i3 - 1]) / 3.0d) + (((double) i2[i3]) / 3.0d) + (((double) i2[i4]) / 3.0d);
                i3 = i4;
            }
            dArr[i] = (((double) i2[l - 2]) / 2.0d) + (((double) i2[i]) / 2.0d);
        }
        double d = 1.0d;
        for (int i5 = 0; i5 < l; i5++) {
            if (dArr[i5] > d) {
                d = dArr[i5];
            }
        }
        double d2 = d > 255.0d ? 255.0d / d : 1.0d;
        int[] iArr = new int[256];
        double d3 = 0.0d;
        for (int i6 = 0; i6 < l; i6++) {
            int i7 = (int) (dArr[i6] * d2);
            if (i7 < 0) {
                i7 = 0;
            }
            if (i7 > 255) {
                i7 = 255;
            }
            double d4 = (double) i7;
            if (d4 > d3) {
                d3 = d4;
            }
            iArr[i7] = iArr[i7] + 1;
        }
        double d5 = 0.0d;
        int i8 = 0;
        while (d5 < 255.0d && i8 < l / 20) {
            i8 += iArr[(int) d5];
            d5 += 1.0d;
        }
        double d6 = d3;
        int i9 = 0;
        while (d6 > 2.0d && i9 < l / 100) {
            i9 += iArr[(int) d6];
            d6 -= 1.0d;
        }
        double[] dArr2 = new double[l];
        double d7 = d6 - d5;
        for (int i10 = 0; i10 < l; i10++) {
            double d8 = ((dArr[i10] * d2) - d5) / d7;
            if (d8 < 0.0d) {
                d8 = 0.0d;
            }
            if (d8 > 1.0d) {
                d8 = 1.0d;
            }
            dArr2[i10] = d8 * d8;
        }
        this.f8493u = 5;
        int[] iArr2 = new int[5];
        this.f8488p = iArr2;
        double[] dArr3 = new double[5];
        this.f8490r = dArr3;
        double[][] dArr4 = new double[5][];
        this.f8489q = dArr4;
        iArr2[0] = l * 2;
        dArr3[0] = 2.0d;
        dArr4[0] = new double[iArr2[0]];
        if (l > 0) {
            dArr4[0][0] = dArr2[0] * 0.5d;
            dArr4[0][1] = dArr2[0];
        }
        for (int i11 = 1; i11 < l; i11++) {
            double[][] dArr5 = this.f8489q;
            int i12 = i11 * 2;
            dArr5[0][i12] = (dArr2[i11 - 1] + dArr2[i11]) * 0.5d;
            dArr5[0][i12 + 1] = dArr2[i11];
        }
        int[] iArr3 = this.f8488p;
        iArr3[1] = l;
        this.f8489q[1] = new double[iArr3[1]];
        this.f8490r[1] = 1.0d;
        for (int i13 = 0; i13 < this.f8488p[1]; i13++) {
            this.f8489q[1][i13] = dArr2[i13];
        }
        for (int i14 = 2; i14 < 5; i14++) {
            int[] iArr4 = this.f8488p;
            int i15 = i14 - 1;
            iArr4[i14] = iArr4[i15] / 2;
            this.f8489q[i14] = new double[iArr4[i14]];
            double[] dArr6 = this.f8490r;
            dArr6[i14] = dArr6[i15] / 2.0d;
            for (int i16 = 0; i16 < this.f8488p[i14]; i16++) {
                double[][] dArr7 = this.f8489q;
                int i17 = i16 * 2;
                dArr7[i14][i16] = (dArr7[i15][i17] + dArr7[i15][i17 + 1]) * 0.5d;
            }
        }
        this.f8473D = true;
    }

    /* renamed from: d */
    private void m11325d() {
        int measuredHeight = (getMeasuredHeight() / 2) - 1;
        this.f8491s = new int[this.f8488p[this.f8492t]];
        int i = 0;
        while (true) {
            int[] iArr = this.f8488p;
            int i2 = this.f8492t;
            if (i < iArr[i2]) {
                this.f8491s[i] = (int) (this.f8489q[i2][i] * ((double) measuredHeight));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo9435a() {
        return this.f8492t > 0;
    }

    /* renamed from: b */
    public boolean mo9436b() {
        return this.f8492t < this.f8493u - 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo9437e(Canvas canvas, int i, int i2, int i3, Paint paint) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i6 > i5) {
            int i7 = (i6 - i5) / 4;
            i5 += i7;
            i6 -= i7;
        }
        if (((double) this.f8471B) > 1.0d && i4 % 2 == 1) {
            float f = (float) i4;
            canvas.drawLine(f, (float) i5, f, (float) i6, paint);
        }
        float f2 = (float) i4;
        canvas.drawLine(f2, (float) i5, f2, (float) i6, paint);
    }

    /* renamed from: f */
    public boolean mo9438f() {
        return this.f8473D;
    }

    /* renamed from: g */
    public int mo9439g() {
        int[] iArr = this.f8488p;
        if (iArr == null) {
            return 0;
        }
        return iArr[this.f8492t];
    }

    public int getEnd() {
        return this.f8498z;
    }

    public int getOffset() {
        return this.f8496x;
    }

    public int getStart() {
        return this.f8497y;
    }

    public int getZoomLevel() {
        return this.f8492t;
    }

    /* renamed from: h */
    public int mo9444h(int i) {
        return (int) (((((((double) i) * 1.0d) * ((double) this.f8494v)) * this.f8490r[this.f8492t]) / (((double) this.f8495w) * 1000.0d)) + 0.5d);
    }

    /* renamed from: i */
    public int mo9445i(int i) {
        return (int) (((((double) i) * (((double) this.f8495w) * 1000.0d)) / (((double) this.f8494v) * this.f8490r[this.f8492t])) + 0.5d);
    }

    /* renamed from: j */
    public double mo9446j(int i) {
        try {
            double d = this.f8490r[this.f8492t];
            return (((double) i) * ((double) this.f8495w)) / (((double) this.f8494v) * d);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: k */
    public void mo9447k(float f) {
        this.f8491s = null;
        this.f8471B = f;
        invalidate();
    }

    /* renamed from: l */
    public int mo9448l(double d) {
        return (int) ((((d * 1.0d) * ((double) this.f8494v)) / ((double) this.f8495w)) + 0.5d);
    }

    /* renamed from: m */
    public int mo9449m(double d) {
        double[] dArr = this.f8490r;
        return (int) (((((dArr == null ? 0.0d : dArr[this.f8492t]) * d) * ((double) this.f8494v)) / ((double) this.f8495w)) + 0.5d);
    }

    /* renamed from: n */
    public void mo9450n(int i, int i2, int i3, int i4) {
        this.f8497y = i;
        this.f8498z = i2;
        this.f8496x = i3;
    }

    /* renamed from: o */
    public void mo9451o() {
        if (mo9435a()) {
            this.f8492t--;
            this.f8497y *= 2;
            this.f8498z *= 2;
            this.f8491s = null;
            int measuredWidth = ((this.f8496x + (getMeasuredWidth() / 2)) * 2) - (getMeasuredWidth() / 2);
            this.f8496x = measuredWidth;
            if (measuredWidth < 0) {
                this.f8496x = 0;
            }
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        double d;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f8487o != null) {
            if (this.f8491s == null) {
                m11325d();
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int length = this.f8491s.length - this.f8496x;
            int i = measuredHeight / 2;
            int i2 = length > measuredWidth ? measuredWidth : length;
            if (this.f8478I != measuredHeight) {
                this.f8478I = measuredHeight;
            }
            double j = mo9446j(1);
            int i3 = (j > 0.02d ? 1 : (j == 0.02d ? 0 : -1));
            int i4 = (int) (getResources().getDisplayMetrics().density * 15.0f);
            float f = (float) i4;
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), f, this.f8486n);
            Log.e("wave", "width:" + i2);
            int i5 = 0;
            while (i5 < this.f8496x + i2) {
                Paint paint = this.f8480h;
                if (i5 < this.f8497y || i5 >= this.f8498z) {
                    paint = this.f8481i;
                }
                Paint paint2 = paint;
                int paddingStart = (getPaddingStart() + i5) - this.f8496x;
                int[] iArr = this.f8491s;
                int i6 = i5;
                mo9437e(canvas, paddingStart, i - iArr[i5], i + 1 + iArr[i5], paint2);
                if (i6 == this.f8470A) {
                    canvas2.drawBitmap(this.f8474E, (float) ((getPaddingStart() + i6) - this.f8496x), f, (Paint) null);
                }
                i5 = i6 + 1;
            }
            canvas.drawLine(((float) ((getPaddingStart() + this.f8497y) - this.f8496x)) + 0.5f, f, ((float) ((getPaddingStart() + this.f8497y) - this.f8496x)) + 0.5f, (float) getHeight(), this.f8475F ? this.f8476G : this.f8477H);
            canvas.drawLine(((float) ((getPaddingStart() + this.f8498z) - this.f8496x)) + 0.5f, f, ((float) ((getPaddingStart() + this.f8498z) - this.f8496x)) + 0.5f, (float) getHeight(), this.f8475F ? this.f8477H : this.f8476G);
            float f2 = f;
            canvas.drawRect(0.0f, f2, ((float) ((getPaddingStart() + this.f8497y) - this.f8496x)) + 0.5f, (float) getHeight(), this.f8482j);
            canvas.drawRect(((float) ((getPaddingStart() + this.f8498z) - this.f8496x)) + 0.5f, f2, (float) getWidth(), (float) getHeight(), this.f8482j);
            double d2 = 1.0d;
            if (1.0d / j < 50.0d) {
                d2 = 5.0d;
            }
            if (d2 / j < 50.0d) {
                d2 = 15.0d;
            }
            double d3 = ((double) this.f8496x) * j;
            int i7 = (int) (d3 / d2);
            int i8 = 0;
            while (i8 < i2) {
                i8++;
                d3 += j;
                int i9 = (int) d3;
                int i10 = i2;
                int i11 = (int) (d3 / d2);
                if (i11 != i7) {
                    String str = BuildConfig.FLAVOR + (i9 / 60);
                    StringBuilder sb = new StringBuilder();
                    sb.append(BuildConfig.FLAVOR);
                    int i12 = i9 % 60;
                    sb.append(i12);
                    String sb2 = sb.toString();
                    if (i12 < 10) {
                        sb2 = "0" + sb2;
                    }
                    String str2 = str + ":" + sb2;
                    d = d2;
                    Rect rect = new Rect();
                    this.f8485m.getTextBounds(str2, 0, str2.length(), rect);
                    canvas2.drawText(str2, ((float) (getPaddingStart() + i8)) - ((float) (((double) this.f8485m.measureText(str2)) * 0.5d)), (float) ((i4 / 2) + (rect.height() / 2)), this.f8485m);
                    i7 = i11;
                } else {
                    d = d2;
                }
                i2 = i10;
                d2 = d;
            }
            C2427a aVar = this.f8472C;
            if (aVar != null) {
                aVar.mo9375n();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                motionEvent.getX(0);
                motionEvent.getY(0);
                this.f8472C.mo9370a(motionEvent.getX(), motionEvent.getRawX());
            } else if (action == 1) {
                this.f8472C.mo9382s(motionEvent.getRawX());
            } else if (action == 2) {
                this.f8472C.mo9379q(motionEvent.getX(), motionEvent.getRawX());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p */
    public void mo9454p() {
        if (mo9436b()) {
            this.f8492t++;
            this.f8497y /= 2;
            this.f8498z /= 2;
            int measuredWidth = ((this.f8496x + (getMeasuredWidth() / 2)) / 2) - (getMeasuredWidth() / 2);
            this.f8496x = measuredWidth;
            if (measuredWidth < 0) {
                this.f8496x = 0;
            }
            this.f8491s = null;
            invalidate();
        }
    }

    public void setHandler(Handler handler) {
    }

    public void setLineStart(boolean z) {
        this.f8475F = z;
    }

    public void setListener(C2427a aVar) {
        this.f8472C = aVar;
    }

    public void setPlayback(int i) {
        this.f8470A = i;
    }

    public void setSoundFile(C2438d dVar) {
        this.f8487o = dVar;
        this.f8494v = dVar.mo9476m();
        this.f8495w = this.f8487o.mo9477n();
        m11324c();
        this.f8491s = null;
    }

    public void setZoomLevel(int i) {
        while (this.f8492t > i) {
            mo9451o();
        }
        while (this.f8492t < i) {
            mo9454p();
        }
    }
}
