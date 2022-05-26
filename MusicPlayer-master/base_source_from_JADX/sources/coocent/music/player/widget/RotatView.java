package coocent.music.player.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import java.lang.reflect.Array;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;
import p342g.p343a.p344a.p358i.C8343s;
import p443m.p444a.p447e.p448a.C9332d;

public class RotatView extends View {

    /* renamed from: A */
    float f31697A;

    /* renamed from: B */
    float f31698B;

    /* renamed from: C */
    float f31699C;

    /* renamed from: D */
    float f31700D = 0.0f;

    /* renamed from: E */
    double f31701E = 0.0d;

    /* renamed from: F */
    C7166c f31702F;

    /* renamed from: g */
    float f31703g;

    /* renamed from: h */
    float f31704h;

    /* renamed from: i */
    int f31705i;

    /* renamed from: j */
    int f31706j;

    /* renamed from: k */
    double f31707k;

    /* renamed from: l */
    Bitmap f31708l;

    /* renamed from: m */
    boolean f31709m = true;

    /* renamed from: n */
    private PaintFlagsDrawFilter f31710n;

    /* renamed from: o */
    private C7165b f31711o;

    /* renamed from: p */
    int f31712p;

    /* renamed from: q */
    int f31713q;

    /* renamed from: r */
    int f31714r;

    /* renamed from: s */
    public int f31715s = 46;

    /* renamed from: t */
    public int f31716t = (360 - 46);

    /* renamed from: u */
    public int f31717u = ((360 - 46) - 46);

    /* renamed from: v */
    private float f31718v;

    /* renamed from: w */
    private float f31719w;

    /* renamed from: x */
    Paint f31720x = new Paint();

    /* renamed from: y */
    float f31721y;

    /* renamed from: z */
    float f31722z;

    /* renamed from: coocent.music.player.widget.RotatView$a */
    static class C7164a extends RuntimeException {
        private static final long serialVersionUID = 1;

        public C7164a(String str) {
            super(str);
        }
    }

    /* renamed from: coocent.music.player.widget.RotatView$b */
    public interface C7165b {
        /* renamed from: a */
        void mo27586a(float f);

        /* renamed from: b */
        void mo27587b();

        /* renamed from: c */
        void mo27588c(float f);
    }

    /* renamed from: coocent.music.player.widget.RotatView$c */
    static class C7166c {

        /* renamed from: a */
        int f31723a;

        /* renamed from: b */
        double[][] f31724b = ((double[][]) Array.newInstance(double.class, new int[]{15, 2}));

        C7166c() {
        }

        /* renamed from: a */
        public void mo27632a(double d, double d2) {
            for (int i = 14; i > 0; i--) {
                double[][] dArr = this.f31724b;
                int i2 = i - 1;
                dArr[i][0] = dArr[i2][0];
                dArr[i][1] = dArr[i2][1];
            }
            double[][] dArr2 = this.f31724b;
            dArr2[0][0] = d;
            dArr2[0][1] = d2;
            this.f31723a++;
        }

        /* renamed from: b */
        public void mo27633b() {
            this.f31723a = 0;
            for (int i = 14; i > 0; i--) {
                double[][] dArr = this.f31724b;
                dArr[i][0] = 0.0d;
                dArr[i][1] = 0.0d;
            }
        }
    }

    public RotatView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m40789c();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7941a.RotateView);
        this.f31712p = obtainStyledAttributes.getResourceId(1, 2131231039);
        this.f31713q = obtainStyledAttributes.getResourceId(2, 2131231048);
        this.f31714r = obtainStyledAttributes.getResourceId(0, 2131231040);
        obtainStyledAttributes.recycle();
    }

    /* renamed from: a */
    private void m40788a(float f) {
        float f2 = this.f31700D + f;
        this.f31700D = f2;
        int i = this.f31716t;
        if (f2 > ((float) i)) {
            this.f31700D = (float) i;
        }
        float f3 = this.f31700D;
        int i2 = this.f31715s;
        if (f3 < ((float) i2)) {
            this.f31700D = (float) i2;
        }
        C7165b bVar = this.f31711o;
        if (bVar != null) {
            bVar.mo27588c(this.f31700D);
        }
    }

    /* renamed from: c */
    private void m40789c() {
        this.f31710n = new PaintFlagsDrawFilter(0, 3);
        this.f31702F = new C7166c();
        m40790d();
    }

    /* renamed from: d */
    private void m40790d() {
        Bitmap bitmap = this.f31708l;
        if (bitmap != null) {
            this.f31705i = bitmap.getWidth();
            int height = this.f31708l.getHeight();
            this.f31706j = height;
            int i = this.f31705i;
            double sqrt = Math.sqrt((double) ((i * i) + (height * height)));
            this.f31707k = sqrt;
            float f = (float) (sqrt / 2.0d);
            this.f31704h = f;
            this.f31703g = f;
        }
    }

    private void setRotatDrawableResource(int i) {
        setRotatBitmap(((BitmapDrawable) C9332d.m49407d(getContext(), i)).getBitmap());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public float mo27618b(float f, float f2, float f3, float f4) {
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

    /* renamed from: e */
    public void mo27619e() {
        this.f31720x.setColorFilter(new PorterDuffColorFilter(C8343s.m46300h(), PorterDuff.Mode.SRC_IN));
        postInvalidate();
    }

    public float getDegree() {
        return this.f31700D;
    }

    public float getDeta_degree() {
        return (this.f31700D - ((float) this.f31715s)) / ((float) this.f31717u);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Matrix matrix = new Matrix();
        matrix.setTranslate(((float) this.f31705i) / 2.0f, ((float) this.f31706j) / 2.0f);
        matrix.preRotate(this.f31700D);
        matrix.preTranslate((-((float) this.f31705i)) / 2.0f, (-((float) this.f31706j)) / 2.0f);
        double d = this.f31707k;
        matrix.postTranslate(((float) (d - ((double) this.f31705i))) / 2.0f, ((float) (d - ((double) this.f31706j))) / 2.0f);
        canvas.setDrawFilter(this.f31710n);
        Bitmap bitmap = this.f31708l;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, matrix, this.f31720x);
        }
        super.onDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        if (this.f31712p != 0) {
            setRotatDrawableResource(this.f31714r);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        double d = this.f31707k;
        setMeasuredDimension((int) d, (int) d);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        if (r0 != 3) goto L_0x00ed;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r8) {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f31708l
            if (r0 == 0) goto L_0x00ee
            int r0 = r8.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x00b2
            if (r0 == r1) goto L_0x0060
            r2 = 2
            if (r0 == r2) goto L_0x0015
            r2 = 3
            if (r0 == r2) goto L_0x0060
            goto L_0x00ed
        L_0x0015:
            boolean r0 = r7.f31709m
            if (r0 == 0) goto L_0x00ed
            float r0 = r8.getX()
            r7.f31697A = r0
            r7.f31721y = r0
            float r8 = r8.getY()
            r7.f31698B = r8
            r7.f31722z = r8
            float r0 = r7.f31703g
            float r2 = r7.f31704h
            float r3 = r7.f31697A
            float r8 = r7.mo27618b(r0, r2, r3, r8)
            float r0 = r7.f31699C
            float r0 = r8 - r0
            int r2 = r7.f31717u
            int r3 = -r2
            float r3 = (float) r3
            r4 = 1135869952(0x43b40000, float:360.0)
            int r3 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r3 >= 0) goto L_0x0043
            float r0 = r0 + r4
            goto L_0x0049
        L_0x0043:
            float r2 = (float) r2
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0049
            float r0 = r0 - r4
        L_0x0049:
            long r2 = java.lang.System.currentTimeMillis()
            double r2 = (double) r2
            r7.f31701E = r2
            coocent.music.player.widget.RotatView$c r4 = r7.f31702F
            double r5 = (double) r0
            r4.mo27632a(r5, r2)
            r7.m40788a(r0)
            r7.f31699C = r8
            r7.postInvalidate()
            goto L_0x00ed
        L_0x0060:
            float r0 = r8.getX()
            float r8 = r8.getY()
            float r2 = r7.f31718v
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            r2 = 1092616192(0x41200000, float:10.0)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0088
            float r0 = r7.f31719w
            float r8 = r8 - r0
            float r8 = java.lang.Math.abs(r8)
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto L_0x0088
            coocent.music.player.widget.RotatView$b r8 = r7.f31711o
            if (r8 == 0) goto L_0x00a9
            r8.mo27587b()
            goto L_0x00a9
        L_0x0088:
            boolean r8 = r7.f31709m
            if (r8 == 0) goto L_0x009b
            float r8 = r7.f31700D
            int r0 = r7.f31715s
            float r0 = (float) r0
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 <= 0) goto L_0x009b
            int r8 = r7.f31712p
            r7.setRotatDrawableResource(r8)
            goto L_0x00a0
        L_0x009b:
            int r8 = r7.f31714r
            r7.setRotatDrawableResource(r8)
        L_0x00a0:
            coocent.music.player.widget.RotatView$b r8 = r7.f31711o
            if (r8 == 0) goto L_0x00a9
            float r0 = r7.f31700D
            r8.mo27586a(r0)
        L_0x00a9:
            android.view.ViewParent r8 = r7.getParent()
            r0 = 0
            r8.requestDisallowInterceptTouchEvent(r0)
            goto L_0x00ed
        L_0x00b2:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            float r0 = r8.getX()
            r7.f31721y = r0
            float r0 = r8.getY()
            r7.f31722z = r0
            float r0 = r8.getX()
            r7.f31718v = r0
            float r8 = r8.getY()
            r7.f31719w = r8
            float r8 = r7.f31703g
            float r0 = r7.f31704h
            float r2 = r7.f31721y
            float r3 = r7.f31722z
            float r8 = r7.mo27618b(r8, r0, r2, r3)
            r7.f31699C = r8
            coocent.music.player.widget.RotatView$c r8 = r7.f31702F
            r8.mo27633b()
            boolean r8 = r7.f31709m
            if (r8 == 0) goto L_0x00ed
            int r8 = r7.f31713q
            r7.setRotatDrawableResource(r8)
        L_0x00ed:
            return r1
        L_0x00ee:
            coocent.music.player.widget.RotatView$a r8 = new coocent.music.player.widget.RotatView$a
            java.lang.String r0 = "Error,No bitmap in RotatView!"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: coocent.music.player.widget.RotatView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setArc(int i) {
        this.f31715s = i;
        int i2 = 360 - i;
        this.f31716t = i2;
        this.f31717u = i2 - i;
    }

    public void setDegree(float f) {
        this.f31700D = f;
    }

    public void setEnabled(boolean z) {
        int i;
        Paint paint = this.f31720x;
        if (z) {
            i = C8343s.m46300h();
        } else {
            i = C8343s.m46295c(R.color.app_sub_title_color);
        }
        paint.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
        super.setEnabled(z);
        this.f31709m = z;
        if (!z || this.f31700D <= ((float) this.f31715s)) {
            setRotatDrawableResource(this.f31714r);
        } else {
            setRotatDrawableResource(this.f31712p);
        }
    }

    public void setOnChangeListener(C7165b bVar) {
        this.f31711o = bVar;
    }

    public void setRotatBitmap(Bitmap bitmap) {
        this.f31708l = bitmap;
        m40790d();
        postInvalidate();
    }
}
