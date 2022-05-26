package coocent.music.player.widget.ringtone;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.C0506a;
import media.musicplayer.audioplayer.videoplayer.R;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class WaveformView extends View {

    /* renamed from: A */
    private int f32125A;

    /* renamed from: B */
    private float f32126B;

    /* renamed from: C */
    private C7276a f32127C;

    /* renamed from: D */
    private boolean f32128D;

    /* renamed from: E */
    private Bitmap f32129E;

    /* renamed from: F */
    private boolean f32130F = true;

    /* renamed from: G */
    private final float f32131G;

    /* renamed from: H */
    private final Paint f32132H;

    /* renamed from: I */
    private final Context f32133I;

    /* renamed from: J */
    private final Paint f32134J;

    /* renamed from: g */
    private Paint f32135g;

    /* renamed from: h */
    private Paint f32136h;

    /* renamed from: i */
    private Paint f32137i;

    /* renamed from: j */
    private Paint f32138j;

    /* renamed from: k */
    private Paint f32139k;

    /* renamed from: l */
    private Paint f32140l;

    /* renamed from: m */
    private Paint f32141m;

    /* renamed from: n */
    private Paint f32142n;

    /* renamed from: o */
    private C7284d f32143o;

    /* renamed from: p */
    private int[] f32144p;

    /* renamed from: q */
    private double[][] f32145q;

    /* renamed from: r */
    private double[] f32146r;

    /* renamed from: s */
    private int[] f32147s;

    /* renamed from: t */
    private int f32148t = 4;

    /* renamed from: u */
    private int f32149u;

    /* renamed from: v */
    private int f32150v;

    /* renamed from: w */
    private int f32151w;

    /* renamed from: x */
    private int f32152x;

    /* renamed from: y */
    private int f32153y;

    /* renamed from: z */
    private int f32154z;

    /* renamed from: coocent.music.player.widget.ringtone.WaveformView$a */
    public interface C7276a {
        /* renamed from: a */
        void mo26527a(float f, float f2);

        /* renamed from: n */
        void mo26534n();

        /* renamed from: q */
        void mo26540q(float f, float f2);

        /* renamed from: s */
        void mo26541s(float f);
    }

    public WaveformView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32133I = context;
        this.f32131G = context.getResources().getDisplayMetrics().density;
        setFocusable(false);
        Paint paint = new Paint();
        this.f32135g = paint;
        paint.setAntiAlias(false);
        this.f32135g.setColor(C0506a.m3150b(context, R.color.grid_line));
        Paint paint2 = new Paint();
        this.f32136h = paint2;
        paint2.setAntiAlias(false);
        this.f32136h.setColor(C0506a.m3150b(context, R.color.waveform_selected));
        Paint paint3 = new Paint();
        this.f32137i = paint3;
        paint3.setAntiAlias(false);
        this.f32137i.setColor(C0506a.m3150b(context, R.color.waveform_unselected));
        Paint paint4 = new Paint();
        this.f32138j = paint4;
        paint4.setAntiAlias(false);
        this.f32138j.setColor(C0506a.m3150b(context, R.color.waveform_unselected_bkgnd_overlay));
        Paint paint5 = new Paint();
        this.f32139k = paint5;
        paint5.setAntiAlias(true);
        this.f32139k.setStrokeWidth(1.5f);
        this.f32139k.setPathEffect(new DashPathEffect(new float[]{3.0f, 2.0f}, 0.0f));
        this.f32139k.setColor(C0506a.m3150b(context, R.color.selection_border));
        Paint paint6 = new Paint();
        this.f32140l = paint6;
        paint6.setAntiAlias(false);
        this.f32140l.setColor(C0506a.m3150b(context, R.color.playback_indicator));
        Paint paint7 = new Paint();
        this.f32141m = paint7;
        paint7.setAntiAlias(true);
        this.f32141m.setColor(C0506a.m3150b(context, R.color.timecode));
        this.f32141m.setTextSize(24.0f);
        Paint paint8 = new Paint();
        this.f32132H = paint8;
        paint8.setAntiAlias(true);
        paint8.setStrokeWidth(mo27921e(1.5f));
        paint8.setColor(C0506a.m3150b(context, R.color.line_selected));
        Paint paint9 = new Paint();
        this.f32134J = paint9;
        paint9.setAntiAlias(true);
        paint9.setStrokeWidth(mo27921e(1.5f));
        paint9.setColor(C0506a.m3150b(context, R.color.line_unselected));
        Paint paint10 = new Paint();
        this.f32142n = paint10;
        paint10.setAntiAlias(true);
        this.f32142n.setColor(C9332d.m49405b(context, R.color.default_time_bg_color));
        this.f32129E = BitmapFactory.decodeResource(getResources(), R.drawable.spectrum_progress_line);
        BitmapFactory.decodeResource(getResources(), R.drawable.spectrum_editor_list);
        this.f32143o = null;
        this.f32144p = null;
        this.f32145q = null;
        this.f32147s = null;
        this.f32152x = 0;
        this.f32125A = -1;
        this.f32153y = 0;
        this.f32154z = 0;
        this.f32126B = 1.0f;
        this.f32128D = false;
    }

    /* renamed from: c */
    private void m41257c() {
        int i;
        int g = this.f32143o.mo27951g();
        int[] f = this.f32143o.mo27950f();
        double[] dArr = new double[g];
        if (g == 1) {
            dArr[0] = (double) f[0];
        } else if (g == 2) {
            dArr[0] = (double) f[0];
            dArr[1] = (double) f[1];
        } else if (g > 2) {
            dArr[0] = (((double) f[0]) / 2.0d) + (((double) f[1]) / 2.0d);
            int i2 = 1;
            while (true) {
                i = g - 1;
                if (i2 >= i) {
                    break;
                }
                int i3 = i2 + 1;
                dArr[i2] = (((double) f[i2 - 1]) / 3.0d) + (((double) f[i2]) / 3.0d) + (((double) f[i3]) / 3.0d);
                i2 = i3;
            }
            dArr[i] = (((double) f[g - 2]) / 2.0d) + (((double) f[i]) / 2.0d);
        }
        double d = 1.0d;
        for (int i4 = 0; i4 < g; i4++) {
            if (dArr[i4] > d) {
                d = dArr[i4];
            }
        }
        double d2 = d > 255.0d ? 255.0d / d : 1.0d;
        int[] iArr = new int[256];
        double d3 = 0.0d;
        for (int i5 = 0; i5 < g; i5++) {
            int i6 = (int) (dArr[i5] * d2);
            if (i6 < 0) {
                i6 = 0;
            }
            if (i6 > 255) {
                i6 = 255;
            }
            double d4 = (double) i6;
            if (d4 > d3) {
                d3 = d4;
            }
            iArr[i6] = iArr[i6] + 1;
        }
        double d5 = 0.0d;
        int i7 = 0;
        while (d5 < 255.0d && i7 < g / 20) {
            i7 += iArr[(int) d5];
            d5 += 1.0d;
        }
        double d6 = d3;
        int i8 = 0;
        while (d6 > 2.0d && i8 < g / 100) {
            i8 += iArr[(int) d6];
            d6 -= 1.0d;
        }
        double[] dArr2 = new double[g];
        double d7 = d6 - d5;
        for (int i9 = 0; i9 < g; i9++) {
            double d8 = ((dArr[i9] * d2) - d5) / d7;
            if (d8 < 0.0d) {
                d8 = 0.0d;
            }
            if (d8 > 1.0d) {
                d8 = 1.0d;
            }
            dArr2[i9] = d8 * d8;
        }
        this.f32149u = 5;
        int[] iArr2 = new int[5];
        this.f32144p = iArr2;
        double[] dArr3 = new double[5];
        this.f32146r = dArr3;
        double[][] dArr4 = new double[5][];
        this.f32145q = dArr4;
        iArr2[0] = g * 2;
        dArr3[0] = 2.0d;
        dArr4[0] = new double[iArr2[0]];
        if (g > 0) {
            dArr4[0][0] = dArr2[0] * 0.5d;
            dArr4[0][1] = dArr2[0];
        }
        for (int i10 = 1; i10 < g; i10++) {
            double[][] dArr5 = this.f32145q;
            int i11 = i10 * 2;
            dArr5[0][i11] = (dArr2[i10 - 1] + dArr2[i10]) * 0.5d;
            dArr5[0][i11 + 1] = dArr2[i10];
        }
        int[] iArr3 = this.f32144p;
        iArr3[1] = g;
        this.f32145q[1] = new double[iArr3[1]];
        this.f32146r[1] = 1.0d;
        for (int i12 = 0; i12 < this.f32144p[1]; i12++) {
            this.f32145q[1][i12] = dArr2[i12];
        }
        for (int i13 = 2; i13 < 5; i13++) {
            int[] iArr4 = this.f32144p;
            int i14 = i13 - 1;
            iArr4[i13] = iArr4[i14] / 2;
            this.f32145q[i13] = new double[iArr4[i13]];
            double[] dArr6 = this.f32146r;
            dArr6[i13] = dArr6[i14] / 2.0d;
            for (int i15 = 0; i15 < this.f32144p[i13]; i15++) {
                double[][] dArr7 = this.f32145q;
                int i16 = i15 * 2;
                dArr7[i13][i15] = (dArr7[i14][i16] + dArr7[i14][i16 + 1]) * 0.5d;
            }
        }
        this.f32128D = true;
    }

    /* renamed from: d */
    private void m41258d() {
        int measuredHeight = (getMeasuredHeight() / 2) - 1;
        this.f32147s = new int[this.f32144p[this.f32148t]];
        int i = 0;
        while (true) {
            int[] iArr = this.f32144p;
            int i2 = this.f32148t;
            if (i < iArr[i2]) {
                this.f32147s[i] = (int) (this.f32145q[i2][i] * ((double) measuredHeight));
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public boolean mo27919a() {
        return this.f32148t > 0;
    }

    /* renamed from: b */
    public boolean mo27920b() {
        return this.f32148t < this.f32149u - 1;
    }

    /* renamed from: e */
    public float mo27921e(float f) {
        return (f * this.f32131G) + 0.5f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo27922f(Canvas canvas, int i, int i2, int i3, Paint paint) {
        int i4 = i;
        int i5 = i2;
        int i6 = i3;
        if (i6 > i5) {
            int i7 = (i6 - i5) / 4;
            i5 += i7;
            i6 -= i7;
        }
        if (((double) this.f32126B) > 1.0d && i4 % 2 == 1) {
            float f = (float) i4;
            canvas.drawLine(f, (float) i5, f, (float) i6, paint);
        }
        float f2 = (float) i4;
        canvas.drawLine(f2, (float) i5, f2, (float) i6, paint);
    }

    /* renamed from: g */
    public boolean mo27923g() {
        return this.f32128D;
    }

    public int getEnd() {
        return this.f32154z;
    }

    public int getOffset() {
        return this.f32152x;
    }

    public int getStart() {
        return this.f32153y;
    }

    public int getZoomLevel() {
        return this.f32148t;
    }

    /* renamed from: h */
    public int mo27928h() {
        int[] iArr = this.f32144p;
        if (iArr == null) {
            return 0;
        }
        return iArr[this.f32148t];
    }

    /* renamed from: i */
    public int mo27929i(int i) {
        return (int) (((((((double) i) * 1.0d) * ((double) this.f32150v)) * this.f32146r[this.f32148t]) / (((double) this.f32151w) * 1000.0d)) + 0.5d);
    }

    /* renamed from: j */
    public int mo27930j(int i) {
        return (int) (((((double) i) * (((double) this.f32151w) * 1000.0d)) / (((double) this.f32150v) * this.f32146r[this.f32148t])) + 0.5d);
    }

    /* renamed from: k */
    public double mo27931k(int i) {
        try {
            double d = this.f32146r[this.f32148t];
            return (((double) i) * ((double) this.f32151w)) / (((double) this.f32150v) * d);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0d;
        }
    }

    /* renamed from: l */
    public void mo27932l(float f) {
        this.f32147s = null;
        this.f32126B = f;
        invalidate();
    }

    /* renamed from: m */
    public int mo27933m(double d) {
        return (int) ((((d * 1.0d) * ((double) this.f32150v)) / ((double) this.f32151w)) + 0.5d);
    }

    /* renamed from: n */
    public int mo27934n(double d) {
        double[] dArr = this.f32146r;
        return (int) (((((dArr == null ? 0.0d : dArr[this.f32148t]) * d) * ((double) this.f32150v)) / ((double) this.f32151w)) + 0.5d);
    }

    /* renamed from: o */
    public void mo27935o(int i, int i2, int i3, int i4) {
        this.f32153y = i;
        this.f32154z = i2;
        this.f32152x = i3;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        double d;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f32143o != null) {
            if (this.f32147s == null) {
                m41258d();
            }
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            int i = this.f32152x;
            int length = this.f32147s.length - i;
            int i2 = measuredHeight / 2;
            int i3 = length > measuredWidth ? measuredWidth : length;
            double k = mo27931k(1);
            int i4 = (k > 0.02d ? 1 : (k == 0.02d ? 0 : -1));
            int i5 = (int) (getResources().getDisplayMetrics().density * 15.0f);
            float f = (float) i5;
            canvas.drawRect(0.0f, 0.0f, (float) getWidth(), f, this.f32142n);
            int i6 = 0;
            while (i6 < i3) {
                Paint paint = this.f32136h;
                int i7 = i6 + i;
                if (i7 < this.f32153y || i7 >= this.f32154z) {
                    paint = this.f32137i;
                }
                Paint paint2 = paint;
                int[] iArr = this.f32147s;
                int i8 = i2 - iArr[i7];
                int i9 = i2 + 1 + iArr[i7];
                int i10 = i6;
                int i11 = i7;
                int i12 = i8;
                int i13 = i;
                int i14 = i6;
                int i15 = i9;
                int i16 = i2;
                mo27922f(canvas, i10, i12, i15, paint2);
                if (i11 == this.f32125A) {
                    canvas2.drawBitmap(this.f32129E, (float) i14, f, (Paint) null);
                }
                i6 = i14 + 1;
                i = i13;
                i2 = i16;
            }
            int i17 = this.f32153y;
            int i18 = this.f32152x;
            canvas.drawLine(((float) (i17 - i18)) + 0.5f, f, ((float) (i17 - i18)) + 0.5f, (float) getHeight(), this.f32130F ? this.f32132H : this.f32134J);
            int i19 = this.f32154z;
            int i20 = this.f32152x;
            canvas.drawLine(((float) (i19 - i20)) + 0.5f, f, ((float) (i19 - i20)) + 0.5f, (float) getHeight(), this.f32130F ? this.f32134J : this.f32132H);
            double d2 = 1.0d;
            if (1.0d / k < 50.0d) {
                d2 = 5.0d;
            }
            if (d2 / k < 50.0d) {
                d2 = 15.0d;
            }
            double d3 = ((double) this.f32152x) * k;
            int i21 = (int) (d3 / d2);
            int i22 = 0;
            while (i22 < i3) {
                i22++;
                d3 += k;
                int i23 = (int) d3;
                int i24 = i3;
                int i25 = (int) (d3 / d2);
                if (i25 != i21) {
                    String str = BuildConfig.FLAVOR + (i23 / 60);
                    StringBuilder sb = new StringBuilder();
                    sb.append(BuildConfig.FLAVOR);
                    int i26 = i23 % 60;
                    sb.append(i26);
                    String sb2 = sb.toString();
                    if (i26 < 10) {
                        sb2 = "0" + sb2;
                    }
                    String str2 = str + ":" + sb2;
                    d = d2;
                    Rect rect = new Rect();
                    this.f32141m.getTextBounds(str2, 0, str2.length(), rect);
                    canvas2.drawText(str2, ((float) i22) - ((float) (((double) this.f32141m.measureText(str2)) * 0.5d)), (float) ((i5 / 2) + (rect.height() / 2)), this.f32141m);
                    i21 = i25;
                } else {
                    d = d2;
                }
                i3 = i24;
                d2 = d;
            }
            C7276a aVar = this.f32127C;
            if (aVar != null) {
                aVar.mo26534n();
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            int action = motionEvent.getAction() & 255;
            if (action == 0) {
                motionEvent.getX(0);
                motionEvent.getY(0);
                this.f32127C.mo26527a(motionEvent.getX(), motionEvent.getRawX());
            } else if (action == 1) {
                this.f32127C.mo26541s(motionEvent.getRawX());
            } else if (action == 2) {
                this.f32127C.mo26540q(motionEvent.getX(), motionEvent.getRawX());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }

    /* renamed from: p */
    public void mo27938p() {
        if (mo27919a()) {
            this.f32148t--;
            this.f32153y *= 2;
            this.f32154z *= 2;
            this.f32147s = null;
            int measuredWidth = ((this.f32152x + (getMeasuredWidth() / 2)) * 2) - (getMeasuredWidth() / 2);
            this.f32152x = measuredWidth;
            if (measuredWidth < 0) {
                this.f32152x = 0;
            }
            invalidate();
        }
    }

    /* renamed from: q */
    public void mo27939q() {
        if (mo27920b()) {
            this.f32148t++;
            this.f32153y /= 2;
            this.f32154z /= 2;
            int measuredWidth = ((this.f32152x + (getMeasuredWidth() / 2)) / 2) - (getMeasuredWidth() / 2);
            this.f32152x = measuredWidth;
            if (measuredWidth < 0) {
                this.f32152x = 0;
            }
            this.f32147s = null;
            invalidate();
        }
    }

    public void setHandler(Handler handler) {
    }

    public void setLineStart(boolean z) {
        this.f32130F = z;
    }

    public void setListener(C7276a aVar) {
        this.f32127C = aVar;
    }

    public void setPlayback(int i) {
        this.f32125A = i;
    }

    public void setSoundFile(C7284d dVar) {
        this.f32143o = dVar;
        this.f32150v = dVar.mo27952h();
        this.f32151w = this.f32143o.mo27953i();
        m41257c();
        this.f32147s = null;
    }

    public void setZoomLevel(int i) {
        while (this.f32148t > i) {
            mo27938p();
        }
        while (this.f32148t < i) {
            mo27939q();
        }
    }
}
