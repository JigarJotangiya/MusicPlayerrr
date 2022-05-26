package coocent.music.player.visualizer;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.C0885l;
import com.un4seen.bass.BASS;
import coocent.musiclibrary.music.p292j.C7397j;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;
import p342g.p343a.p344a.p346c.C7959l;
import p443m.p444a.p447e.p448a.C9332d;

public class SpectrumView extends View {
    /* access modifiers changed from: private */

    /* renamed from: A */
    public Interpolator f31407A = new LinearInterpolator();

    /* renamed from: B */
    private List<C7119a> f31408B = new ArrayList();

    /* renamed from: C */
    private boolean f31409C;

    /* renamed from: D */
    private boolean f31410D;

    /* renamed from: E */
    private Paint f31411E;

    /* renamed from: F */
    private long f31412F;

    /* renamed from: G */
    private int f31413G = 0;

    /* renamed from: H */
    private C7959l f31414H;

    /* renamed from: I */
    private RectF f31415I = new RectF();

    /* renamed from: J */
    private RectF f31416J = new RectF();

    /* renamed from: K */
    private Bitmap f31417K;

    /* renamed from: L */
    private float f31418L;

    /* renamed from: g */
    private int f31419g = 15;

    /* renamed from: h */
    private int[] f31420h;

    /* renamed from: i */
    private int f31421i;

    /* renamed from: j */
    private int f31422j;

    /* renamed from: k */
    private int f31423k;

    /* renamed from: l */
    private int f31424l;

    /* renamed from: m */
    int[] f31425m;

    /* renamed from: n */
    private Rect f31426n = new Rect();

    /* renamed from: o */
    private Rect f31427o = new Rect();

    /* renamed from: p */
    private Bitmap f31428p;

    /* renamed from: q */
    private Bitmap f31429q;

    /* renamed from: r */
    private Bitmap f31430r;

    /* renamed from: s */
    private Bitmap f31431s;

    /* renamed from: t */
    private Bitmap f31432t;

    /* renamed from: u */
    private Context f31433u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public float f31434v;

    /* renamed from: w */
    private float f31435w = 0.85f;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public float f31436x;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public long f31437y = 2000;

    /* renamed from: z */
    private int f31438z = C0885l.C0891f.DEFAULT_DRAG_ANIMATION_DURATION;

    /* renamed from: coocent.music.player.visualizer.SpectrumView$a */
    private class C7119a {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public long f31439a = System.currentTimeMillis();

        public C7119a() {
        }

        /* renamed from: b */
        public int mo27355b() {
            return (int) ((1.0f - SpectrumView.this.f31407A.getInterpolation((((float) (System.currentTimeMillis() - this.f31439a)) * 1.0f) / ((float) SpectrumView.this.f31437y))) * 255.0f);
        }

        /* renamed from: c */
        public float mo27356c() {
            return SpectrumView.this.f31434v + (SpectrumView.this.f31407A.getInterpolation((((float) (System.currentTimeMillis() - this.f31439a)) * 1.0f) / ((float) SpectrumView.this.f31437y)) * (SpectrumView.this.f31436x - SpectrumView.this.f31434v));
        }
    }

    public SpectrumView(Context context) {
        super(context);
    }

    /* renamed from: e */
    private void m40509e(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7941a.spectrum);
        this.f31419g = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: f */
    private void m40510f(Context context) {
        this.f31433u = context;
        this.f31420h = new int[256];
        for (int i = 1; i < 128; i++) {
            this.f31420h[i] = Color.rgb(255, 255, 255);
        }
        for (int i2 = 0; i2 < 32; i2++) {
            int i3 = i2 * 8;
            this.f31420h[i2 + 128] = Color.rgb(0, 0, i3);
            this.f31420h[i2 + 160] = Color.rgb(i3, 0, 255);
            this.f31420h[i2 + 192] = Color.rgb(255, i3, (31 - i2) * 8);
            this.f31420h[i2 + 224] = Color.rgb(255, 255, i3);
        }
        if (this.f31419g == 9) {
            this.f31411E = new Paint(1);
            setStyle(Paint.Style.FILL);
            setColor(C9332d.m49405b(this.f31433u, R.color.colorAccent));
        }
    }

    /* renamed from: g */
    private void m40511g() {
        int i = this.f31419g;
        if (i != 15 && i != 6 && i != 2) {
        }
    }

    /* renamed from: h */
    private void m40512h() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f31412F >= ((long) this.f31438z)) {
            C7119a aVar = new C7119a();
            List<C7119a> list = this.f31408B;
            if (list != null) {
                list.add(aVar);
            }
            this.f31412F = currentTimeMillis;
        }
    }

    /* renamed from: i */
    private void m40513i() {
        Bitmap bitmap = this.f31429q;
        if (bitmap != null) {
            bitmap.recycle();
            this.f31429q = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        try {
            int i = this.f31419g;
            int i2 = 0;
            if (i == 15) {
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2048);
                allocateDirect.order((ByteOrder) null);
                BASS.BASS_ChannelGetData(0, allocateDirect, BASS.BASS_DATA_FFT1024);
                float[] fArr = new float[512];
                allocateDirect.asFloatBuffer().get(fArr);
                Arrays.fill(this.f31425m, 0);
                canvas.save();
                int i3 = 0;
                for (int i4 = 0; i4 < 10; i4++) {
                    int pow = (int) Math.pow(2.0d, (((double) i4) * 9.0d) / 9.0d);
                    if (pow <= i3) {
                        pow = i3 + 1;
                    }
                    if (pow > 511) {
                        pow = 511;
                    }
                    float f = 0.0f;
                    while (i3 < pow) {
                        i3++;
                        if (f < fArr[i3]) {
                            f = fArr[i3];
                        }
                    }
                    int sqrt = (int) (((Math.sqrt((double) f) * 3.0d) * ((double) this.f31422j)) - 4.0d);
                    int i5 = this.f31423k;
                    if (sqrt > i5) {
                        sqrt = i5;
                    }
                    Rect rect = this.f31426n;
                    rect.top = i5 - sqrt;
                    rect.left = 0;
                    int i6 = this.f31424l;
                    rect.right = i6 / 10;
                    rect.bottom = i5;
                    Rect rect2 = this.f31427o;
                    rect2.top = i5 - sqrt;
                    int i7 = ((i6 / 10) * i4) + 5;
                    rect2.left = i7;
                    rect2.right = (i7 + (i6 / 10)) - 5;
                    rect2.bottom = i5;
                    canvas.drawBitmap(this.f31428p, rect, rect2, (Paint) null);
                }
                canvas.restore();
            } else if (i == 6) {
                Arrays.fill(this.f31425m, 0);
                ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(this.f31421i * 2);
                allocateDirect2.order((ByteOrder) null);
                BASS.BASS_ChannelGetData(0, allocateDirect2, this.f31421i * 2);
                short[] sArr = new short[this.f31421i];
                allocateDirect2.asShortBuffer().get(sArr);
                canvas.save();
                int i8 = 0;
                while (i2 < 1) {
                    int i9 = ((Short.MAX_VALUE - sArr[i2]) * this.f31422j) / 65536;
                    if (i2 == 0) {
                        i8 = i9;
                    }
                    Paint paint = new Paint();
                    Path path = new Path();
                    float width = (float) ((((this.f31422j - i8) * this.f31430r.getWidth()) / 2) / this.f31422j);
                    if (width <= 0.0f) {
                        width = 0.0f;
                    }
                    path.addCircle((float) (this.f31424l / 2), (float) (this.f31423k / 2), width, Path.Direction.CCW);
                    canvas.clipPath(path);
                    Bitmap bitmap = this.f31430r;
                    canvas.drawBitmap(bitmap, (float) ((this.f31424l / 2) - (bitmap.getWidth() / 2)), (float) ((this.f31423k / 2) - (this.f31430r.getHeight() / 2)), paint);
                    i2++;
                }
                canvas.restore();
            } else if (i != 2) {
                if (i == 9) {
                    setColor(this.f31433u.getResources().getColor(R.color.black));
                    int i10 = this.f31424l;
                    float f2 = (float) (i10 / 2);
                    float f3 = (float) (this.f31423k / 2);
                    int i11 = this.f31413G;
                    if (i11 == 0) {
                        i11 = (i10 / 2) - C7397j.m41731a(this.f31433u, 40);
                    }
                    canvas.drawCircle(f2, f3, (float) i11, this.f31411E);
                    setColor(C9332d.m49405b(this.f31433u, R.color.colorAccent));
                    Arrays.fill(this.f31425m, 0);
                    ByteBuffer allocateDirect3 = ByteBuffer.allocateDirect(this.f31421i * 2);
                    allocateDirect3.order((ByteOrder) null);
                    BASS.BASS_ChannelGetData(0, allocateDirect3, this.f31421i * 2);
                    short[] sArr2 = new short[this.f31421i];
                    allocateDirect3.asShortBuffer().get(sArr2);
                    canvas.save();
                    int i12 = 0;
                    while (i2 < 1) {
                        int i13 = this.f31422j;
                        int i14 = ((Short.MAX_VALUE - sArr2[i2]) * i13) / 65536;
                        if (i2 == 0) {
                            i12 = i14;
                        }
                        float f4 = (((float) (i13 - i12)) * 1.0f) / ((float) i13);
                        if (f4 <= 0.0f) {
                            f4 = 0.0f;
                        }
                        if (f4 > 0.53f && this.f31409C) {
                            m40512h();
                        }
                        List<C7119a> list = this.f31408B;
                        if (list != null) {
                            Iterator<C7119a> it = list.iterator();
                            while (it.hasNext()) {
                                C7119a next = it.next();
                                if (next != null) {
                                    if (System.currentTimeMillis() - next.f31439a < this.f31437y) {
                                        Paint paint2 = this.f31411E;
                                        if (paint2 != null) {
                                            paint2.setAlpha(next.mo27355b());
                                            canvas.drawCircle((float) (getWidth() / 2), (float) (getHeight() / 2), next.mo27356c(), this.f31411E);
                                        }
                                    } else {
                                        it.remove();
                                    }
                                }
                            }
                        }
                        i2++;
                    }
                } else if (i == 4) {
                    float f5 = this.f31418L;
                    canvas.scale(f5, f5, (float) (this.f31424l / 2), (float) (this.f31423k / 2));
                    Bitmap bitmap2 = this.f31417K;
                    canvas.drawBitmap(bitmap2, (float) ((this.f31424l / 2) - (bitmap2.getWidth() / 2)), (float) ((this.f31423k / 2) - (this.f31417K.getHeight() / 2)), (Paint) null);
                    Arrays.fill(this.f31425m, 0);
                    ByteBuffer allocateDirect4 = ByteBuffer.allocateDirect(this.f31421i * 2);
                    allocateDirect4.order((ByteOrder) null);
                    BASS.BASS_ChannelGetData(0, allocateDirect4, this.f31421i * 2);
                    short[] sArr3 = new short[this.f31421i];
                    allocateDirect4.asShortBuffer().get(sArr3);
                    canvas.save();
                    int i15 = 0;
                    for (int i16 = 0; i16 < 1; i16++) {
                        int i17 = ((Short.MAX_VALUE - sArr3[i16]) * this.f31422j) / 65536;
                        if (i16 == 0) {
                            i15 = i17;
                        }
                        do {
                            if (i15 < i17) {
                                i15++;
                                continue;
                            } else if (i15 > i17) {
                                i15--;
                                continue;
                            } else {
                                continue;
                            }
                        } while (i15 != i17);
                        this.f31416J.left = (float) ((this.f31424l / 2) - (this.f31431s.getWidth() / 2));
                        this.f31416J.right = (float) ((this.f31424l / 2) + (this.f31431s.getWidth() / 2));
                        RectF rectF = this.f31416J;
                        int i18 = this.f31423k;
                        rectF.top = (float) ((i18 - i15) - 150);
                        rectF.bottom = (float) ((i18 / 2) + (this.f31431s.getHeight() / 2));
                        canvas.clipRect(this.f31416J);
                        Bitmap bitmap3 = this.f31431s;
                        canvas.drawBitmap(bitmap3, this.f31416J.left, (float) ((this.f31423k / 2) - (bitmap3.getHeight() / 2)), (Paint) null);
                    }
                    for (int i19 = (this.f31421i / 2) - 1; i19 < this.f31421i / 2; i19++) {
                        int i20 = ((Short.MAX_VALUE - sArr3[i19]) * this.f31422j) / 65536;
                        if (i19 == 0) {
                            i2 = i20;
                        }
                        do {
                            if (i2 < i20) {
                                i2++;
                                continue;
                            } else if (i2 > i20) {
                                i2--;
                                continue;
                            } else {
                                continue;
                            }
                        } while (i2 != i20);
                        this.f31415I.left = (float) ((this.f31424l / 2) - (this.f31432t.getWidth() / 2));
                        this.f31415I.right = (float) ((this.f31424l / 2) + (this.f31432t.getWidth() / 2));
                        RectF rectF2 = this.f31415I;
                        int i21 = this.f31423k;
                        rectF2.top = (float) ((i21 - i2) - 150);
                        rectF2.bottom = (float) ((i21 / 2) + (this.f31432t.getHeight() / 2));
                        canvas.clipRect(this.f31415I);
                        Bitmap bitmap4 = this.f31432t;
                        canvas.drawBitmap(bitmap4, this.f31415I.left, (float) ((this.f31423k / 2) - (bitmap4.getHeight() / 2)), (Paint) null);
                    }
                    canvas.restore();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f31421i = Math.min(i, 1023);
        int min = Math.min(i2, 600);
        this.f31422j = min;
        this.f31424l = i;
        this.f31423k = i2;
        this.f31425m = new int[(min * this.f31421i)];
        int i5 = this.f31419g;
        if (i5 == 15) {
            try {
                this.f31428p = Bitmap.createScaledBitmap(this.f31429q, i / 10, i2, true);
                m40513i();
            } catch (Exception unused) {
                m40513i();
            }
        } else if (i5 == 9) {
            if (!this.f31410D) {
                this.f31436x = (((float) Math.min(i, i2)) * this.f31435w) / 1.3f;
            }
        } else if (i5 != 2 && i5 == 4) {
            this.f31418L = (((float) ((i2 + (C7397j.m41731a(this.f31433u, 10) * 2)) / 2)) * 1.0f) / (((float) (this.f31417K.getHeight() / 2)) * 1.0f);
        }
        C7959l lVar = this.f31414H;
        if (lVar != null) {
            lVar.mo29490a();
        }
    }

    public void setColor(int i) {
        this.f31411E.setColor(i);
    }

    public void setDuration(long j) {
        this.f31437y = j;
    }

    public void setInitialRadius(float f) {
        this.f31434v = f;
    }

    public void setInterpolator(Interpolator interpolator) {
        this.f31407A = interpolator;
        if (interpolator == null) {
            this.f31407A = new LinearInterpolator();
        }
    }

    public void setMaxRadius(float f) {
        this.f31436x = f;
        this.f31410D = true;
    }

    public void setMaxRadiusRate(float f) {
        this.f31435w = f;
    }

    public void setSizeChangeListener(C7959l lVar) {
        this.f31414H = lVar;
    }

    public void setSkin9BgWidth(int i) {
        this.f31413G = (i / 2) - C7397j.m41731a(this.f31433u, 20);
        invalidate();
    }

    public void setSkin9Running(boolean z) {
        this.f31409C = z;
    }

    public void setSpeed(int i) {
        this.f31438z = i;
    }

    public void setStyle(Paint.Style style) {
        this.f31411E.setStyle(style);
    }

    public SpectrumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40509e(context, attributeSet);
        m40511g();
        m40510f(context);
    }

    public SpectrumView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
