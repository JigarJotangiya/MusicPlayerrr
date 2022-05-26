package com.coocent.colorpicker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import p159f.p166c.p167a.p169d.C4309a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class ColorPickerView extends View {

    /* renamed from: A */
    private float f7465A;

    /* renamed from: B */
    private float f7466B;

    /* renamed from: C */
    private String f7467C;

    /* renamed from: D */
    private int f7468D;

    /* renamed from: E */
    private int f7469E;

    /* renamed from: F */
    private boolean f7470F;

    /* renamed from: G */
    private int f7471G;

    /* renamed from: H */
    private float f7472H;

    /* renamed from: I */
    private RectF f7473I;

    /* renamed from: J */
    private RectF f7474J;

    /* renamed from: K */
    private RectF f7475K;

    /* renamed from: L */
    private RectF f7476L;

    /* renamed from: M */
    private C4309a f7477M;

    /* renamed from: N */
    private Point f7478N;

    /* renamed from: g */
    private float f7479g;

    /* renamed from: h */
    private float f7480h;

    /* renamed from: i */
    private float f7481i;

    /* renamed from: j */
    private float f7482j;

    /* renamed from: k */
    private float f7483k;

    /* renamed from: l */
    private float f7484l;

    /* renamed from: m */
    private C2223a f7485m;

    /* renamed from: n */
    private Paint f7486n;

    /* renamed from: o */
    private Paint f7487o;

    /* renamed from: p */
    private Paint f7488p;

    /* renamed from: q */
    private Paint f7489q;

    /* renamed from: r */
    private Paint f7490r;

    /* renamed from: s */
    private Paint f7491s;

    /* renamed from: t */
    private Paint f7492t;

    /* renamed from: u */
    private Shader f7493u;

    /* renamed from: v */
    private Shader f7494v;

    /* renamed from: w */
    private Shader f7495w;

    /* renamed from: x */
    private Shader f7496x;

    /* renamed from: y */
    private int f7497y;

    /* renamed from: z */
    private float f7498z;

    /* renamed from: com.coocent.colorpicker.view.ColorPickerView$a */
    public interface C2223a {
        /* renamed from: a */
        void mo8810a(int i);
    }

    public ColorPickerView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private Point m10333a(int i) {
        RectF rectF = this.f7476L;
        float width = rectF.width();
        Point point = new Point();
        point.x = (int) ((width - ((((float) i) * width) / 255.0f)) + rectF.left);
        point.y = (int) rectF.top;
        return point;
    }

    /* renamed from: b */
    private int[] m10334b() {
        int[] iArr = new int[361];
        int i = 360;
        int i2 = 0;
        while (i >= 0) {
            iArr[i2] = Color.HSVToColor(new float[]{(float) i, 1.0f, 1.0f});
            i--;
            i2++;
        }
        return iArr;
    }

    /* renamed from: c */
    private float m10335c() {
        return Math.max(Math.max(this.f7482j, this.f7483k), this.f7484l * 1.0f) * 1.5f;
    }

    /* renamed from: d */
    private int m10336d(int i, int i2) {
        return (i == Integer.MIN_VALUE || i == 1073741824) ? i2 : getPrefferedHeight();
    }

    /* renamed from: e */
    private int m10337e(int i, int i2) {
        return (i == Integer.MIN_VALUE || i == 1073741824) ? i2 : getPrefferedWidth();
    }

    /* renamed from: f */
    private void m10338f(Canvas canvas) {
        RectF rectF;
        if (this.f7470F && (rectF = this.f7476L) != null && this.f7477M != null) {
            this.f7492t.setColor(this.f7469E);
            canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f7492t);
            this.f7477M.draw(canvas);
            float[] fArr = {this.f7498z, this.f7465A, this.f7466B};
            int HSVToColor = Color.HSVToColor(fArr);
            int HSVToColor2 = Color.HSVToColor(0, fArr);
            float f = rectF.left;
            float f2 = rectF.top;
            LinearGradient linearGradient = new LinearGradient(f, f2, rectF.right, f2, HSVToColor, HSVToColor2, Shader.TileMode.CLAMP);
            this.f7496x = linearGradient;
            this.f7490r.setShader(linearGradient);
            canvas.drawRect(rectF, this.f7490r);
            String str = this.f7467C;
            if (!(str == null || str == BuildConfig.FLAVOR)) {
                canvas.drawText(str, rectF.centerX(), rectF.centerY() + (this.f7484l * 4.0f), this.f7491s);
            }
            float f3 = (this.f7484l * 4.0f) / 2.0f;
            Point a = m10333a(this.f7497y);
            RectF rectF2 = new RectF();
            int i = a.x;
            rectF2.left = ((float) i) - f3;
            rectF2.right = ((float) i) + f3;
            float f4 = rectF.top;
            float f5 = this.f7483k;
            rectF2.top = f4 - f5;
            rectF2.bottom = rectF.bottom + f5;
            canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f7489q);
        }
    }

    /* renamed from: g */
    private void m10339g(Canvas canvas) {
        RectF rectF = this.f7475K;
        this.f7492t.setColor(this.f7469E);
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f7492t);
        if (this.f7495w == null) {
            float f = rectF.left;
            LinearGradient linearGradient = new LinearGradient(f, rectF.top, f, rectF.bottom, m10334b(), (float[]) null, Shader.TileMode.CLAMP);
            this.f7495w = linearGradient;
            this.f7488p.setShader(linearGradient);
        }
        canvas.drawRect(rectF, this.f7488p);
        float f2 = (this.f7484l * 4.0f) / 2.0f;
        Point i = m10341i(this.f7498z);
        RectF rectF2 = new RectF();
        float f3 = rectF.left;
        float f4 = this.f7483k;
        rectF2.left = f3 - f4;
        rectF2.right = rectF.right + f4;
        int i2 = i.y;
        rectF2.top = ((float) i2) - f2;
        rectF2.bottom = ((float) i2) + f2;
        canvas.drawRoundRect(rectF2, 2.0f, 2.0f, this.f7489q);
    }

    private int getPrefferedHeight() {
        int i = (int) (this.f7484l * 200.0f);
        return this.f7470F ? (int) (((float) i) + this.f7481i + this.f7480h) : i;
    }

    private int getPrefferedWidth() {
        int prefferedHeight = getPrefferedHeight();
        if (this.f7470F) {
            prefferedHeight = (int) (((float) prefferedHeight) - (this.f7481i + this.f7480h));
        }
        return (int) (((float) prefferedHeight) + this.f7479g + this.f7481i);
    }

    /* renamed from: h */
    private void m10340h(Canvas canvas) {
        Canvas canvas2 = canvas;
        RectF rectF = this.f7474J;
        this.f7492t.setColor(this.f7469E);
        RectF rectF2 = this.f7473I;
        canvas.drawRect(rectF2.left, rectF2.top, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f7492t);
        if (this.f7493u == null) {
            float f = rectF.left;
            this.f7493u = new LinearGradient(f, rectF.top, f, rectF.bottom, -1, -16777216, Shader.TileMode.CLAMP);
        }
        int HSVToColor = Color.HSVToColor(new float[]{this.f7498z, 1.0f, 1.0f});
        float f2 = rectF.left;
        float f3 = rectF.top;
        this.f7494v = new LinearGradient(f2, f3, rectF.right, f3, -1, HSVToColor, Shader.TileMode.CLAMP);
        this.f7486n.setShader(new ComposeShader(this.f7493u, this.f7494v, PorterDuff.Mode.MULTIPLY));
        canvas2.drawRect(rectF, this.f7486n);
        Point p = m10348p(this.f7465A, this.f7466B);
        this.f7487o.setColor(-16777216);
        canvas2.drawCircle((float) p.x, (float) p.y, this.f7482j - (this.f7484l * 1.0f), this.f7487o);
        this.f7487o.setColor(-2236963);
        canvas2.drawCircle((float) p.x, (float) p.y, this.f7482j, this.f7487o);
    }

    /* renamed from: i */
    private Point m10341i(float f) {
        RectF rectF = this.f7475K;
        float height = rectF.height();
        Point point = new Point();
        point.y = (int) ((height - ((f * height) / 360.0f)) + rectF.top);
        point.x = (int) rectF.left;
        return point;
    }

    /* renamed from: j */
    private void m10342j() {
        float f = getContext().getResources().getDisplayMetrics().density;
        this.f7484l = f;
        this.f7482j *= f;
        this.f7483k *= f;
        this.f7479g *= f;
        this.f7480h *= f;
        this.f7481i *= f;
        this.f7472H = m10335c();
        m10343k();
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    /* renamed from: k */
    private void m10343k() {
        this.f7486n = new Paint();
        this.f7487o = new Paint();
        this.f7488p = new Paint();
        this.f7489q = new Paint();
        this.f7490r = new Paint();
        this.f7491s = new Paint();
        this.f7492t = new Paint();
        this.f7487o.setStyle(Paint.Style.STROKE);
        this.f7487o.setStrokeWidth(this.f7484l * 2.0f);
        this.f7487o.setAntiAlias(true);
        this.f7489q.setColor(this.f7468D);
        this.f7489q.setStyle(Paint.Style.STROKE);
        this.f7489q.setStrokeWidth(this.f7484l * 2.0f);
        this.f7489q.setAntiAlias(true);
        this.f7491s.setColor(-14935012);
        this.f7491s.setTextSize(this.f7484l * 14.0f);
        this.f7491s.setAntiAlias(true);
        this.f7491s.setTextAlign(Paint.Align.CENTER);
        this.f7491s.setFakeBoldText(true);
    }

    /* renamed from: l */
    private boolean m10344l(MotionEvent motionEvent) {
        Point point = this.f7478N;
        if (point == null) {
            return false;
        }
        int i = point.x;
        float f = (float) i;
        float f2 = (float) point.y;
        if (this.f7475K.contains(f, f2)) {
            this.f7471G = 1;
            this.f7498z = m10346n(motionEvent.getY());
        } else if (this.f7474J.contains(f, f2)) {
            this.f7471G = 0;
            float[] o = m10347o(motionEvent.getX(), motionEvent.getY());
            this.f7465A = o[0];
            this.f7466B = o[1];
        } else {
            RectF rectF = this.f7476L;
            if (rectF == null || !rectF.contains(f, f2)) {
                return false;
            }
            this.f7471G = 2;
            this.f7497y = m10345m((int) motionEvent.getX());
        }
        return true;
    }

    /* renamed from: m */
    private int m10345m(int i) {
        int i2;
        RectF rectF = this.f7476L;
        int width = (int) rectF.width();
        float f = (float) i;
        float f2 = rectF.left;
        if (f < f2) {
            i2 = 0;
        } else {
            i2 = f > rectF.right ? width : i - ((int) f2);
        }
        return 255 - ((i2 * 255) / width);
    }

    /* renamed from: n */
    private float m10346n(float f) {
        float f2;
        RectF rectF = this.f7475K;
        float height = rectF.height();
        float f3 = rectF.top;
        if (f < f3) {
            f2 = 0.0f;
        } else {
            f2 = f > rectF.bottom ? height : f - f3;
        }
        return 360.0f - ((f2 * 360.0f) / height);
    }

    /* renamed from: o */
    private float[] m10347o(float f, float f2) {
        float f3;
        RectF rectF = this.f7474J;
        float[] fArr = new float[2];
        float width = rectF.width();
        float height = rectF.height();
        float f4 = rectF.left;
        float f5 = 0.0f;
        if (f < f4) {
            f3 = 0.0f;
        } else {
            f3 = f > rectF.right ? width : f - f4;
        }
        float f6 = rectF.top;
        if (f2 >= f6) {
            f5 = f2 > rectF.bottom ? height : f2 - f6;
        }
        fArr[0] = (1.0f / width) * f3;
        fArr[1] = 1.0f - ((1.0f / height) * f5);
        return fArr;
    }

    /* renamed from: p */
    private Point m10348p(float f, float f2) {
        RectF rectF = this.f7474J;
        float height = rectF.height();
        float width = rectF.width();
        Point point = new Point();
        point.x = (int) ((f * width) + rectF.left);
        point.y = (int) (((1.0f - f2) * height) + rectF.top);
        return point;
    }

    /* renamed from: r */
    private void m10349r() {
        if (this.f7470F) {
            RectF rectF = this.f7473I;
            float f = rectF.bottom;
            this.f7476L = new RectF(rectF.left + 1.0f, (f - this.f7480h) + 1.0f, rectF.right - 1.0f, f - 1.0f);
            C4309a aVar = new C4309a((int) (this.f7484l * 5.0f));
            this.f7477M = aVar;
            aVar.setBounds(Math.round(this.f7476L.left), Math.round(this.f7476L.top), Math.round(this.f7476L.right), Math.round(this.f7476L.bottom));
        }
    }

    /* renamed from: s */
    private void m10350s() {
        RectF rectF = this.f7473I;
        float f = rectF.right;
        this.f7475K = new RectF((f - this.f7479g) + 1.0f, rectF.top + 1.0f, f - 1.0f, (rectF.bottom - 1.0f) - (this.f7470F ? this.f7481i + this.f7480h : 0.0f));
    }

    /* renamed from: t */
    private void m10351t() {
        RectF rectF = this.f7473I;
        float height = rectF.height() - 2.0f;
        if (this.f7470F) {
            height -= this.f7481i + this.f7480h;
        }
        float f = rectF.left + 1.0f;
        float f2 = rectF.top + 1.0f;
        this.f7474J = new RectF(f, f2, height + f, f2 + height);
    }

    public String getAlphaSliderText() {
        return this.f7467C;
    }

    public boolean getAlphaSliderVisible() {
        return this.f7470F;
    }

    public int getBorderColor() {
        return this.f7469E;
    }

    public int getColor() {
        return Color.HSVToColor(this.f7497y, new float[]{this.f7498z, this.f7465A, this.f7466B});
    }

    public float getDrawingOffset() {
        return this.f7472H;
    }

    public int getSliderTrackerColor() {
        return this.f7468D;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f7473I.width() > 0.0f && this.f7473I.height() > 0.0f) {
            m10340h(canvas);
            m10339g(canvas);
            m10338f(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int e = m10337e(mode, size);
        int d = m10336d(mode2, size2);
        if (!this.f7470F) {
            int i3 = (int) ((((float) e) - this.f7481i) - this.f7479g);
            if (i3 > d || getTag().equals("landscape")) {
                e = (int) (((float) d) + this.f7481i + this.f7479g);
            } else {
                d = i3;
            }
        } else {
            float f = this.f7480h;
            float f2 = this.f7479g;
            int i4 = (int) ((((float) d) - f) + f2);
            if (i4 > e) {
                d = (int) ((((float) e) - f2) + f);
            } else {
                e = i4;
            }
        }
        setMeasuredDimension(e, d);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = new RectF();
        this.f7473I = rectF;
        rectF.left = this.f7472H + ((float) getPaddingLeft());
        this.f7473I.right = (((float) i) - this.f7472H) - ((float) getPaddingRight());
        this.f7473I.top = this.f7472H + ((float) getPaddingTop());
        this.f7473I.bottom = (((float) i2) - this.f7472H) - ((float) getPaddingBottom());
        m10351t();
        m10350s();
        m10349r();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f7478N = new Point((int) motionEvent.getX(), (int) motionEvent.getY());
            z = m10344l(motionEvent);
        } else if (action == 1) {
            this.f7478N = null;
            z = m10344l(motionEvent);
        } else if (action != 2) {
            z = false;
        } else {
            z = m10344l(motionEvent);
        }
        if (!z) {
            return super.onTouchEvent(motionEvent);
        }
        C2223a aVar = this.f7485m;
        if (aVar != null) {
            aVar.mo8810a(Color.HSVToColor(this.f7497y, new float[]{this.f7498z, this.f7465A, this.f7466B}));
        }
        invalidate();
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTrackballEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            float r0 = r9.getX()
            float r1 = r9.getY()
            int r2 = r9.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 != r3) goto L_0x007d
            int r2 = r8.f7471G
            r6 = 0
            if (r2 == 0) goto L_0x0053
            r7 = 1092616192(0x41200000, float:10.0)
            if (r2 == r5) goto L_0x003b
            if (r2 == r3) goto L_0x001e
            goto L_0x007d
        L_0x001e:
            boolean r1 = r8.f7470F
            if (r1 == 0) goto L_0x007d
            android.graphics.RectF r1 = r8.f7476L
            if (r1 != 0) goto L_0x0027
            goto L_0x007d
        L_0x0027:
            int r1 = r8.f7497y
            float r1 = (float) r1
            float r0 = r0 * r7
            float r1 = r1 - r0
            int r0 = (int) r1
            r1 = 255(0xff, float:3.57E-43)
            if (r0 >= 0) goto L_0x0034
            r0 = 0
            goto L_0x0038
        L_0x0034:
            if (r0 <= r1) goto L_0x0038
            r0 = 255(0xff, float:3.57E-43)
        L_0x0038:
            r8.f7497y = r0
            goto L_0x0051
        L_0x003b:
            float r0 = r8.f7498z
            float r1 = r1 * r7
            float r0 = r0 - r1
            r1 = 1135869952(0x43b40000, float:360.0)
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0047
            goto L_0x004f
        L_0x0047:
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 <= 0) goto L_0x004e
            r6 = 1135869952(0x43b40000, float:360.0)
            goto L_0x004f
        L_0x004e:
            r6 = r0
        L_0x004f:
            r8.f7498z = r6
        L_0x0051:
            r0 = 1
            goto L_0x007e
        L_0x0053:
            float r2 = r8.f7465A
            r7 = 1112014848(0x42480000, float:50.0)
            float r0 = r0 / r7
            float r2 = r2 + r0
            float r0 = r8.f7466B
            float r1 = r1 / r7
            float r0 = r0 - r1
            r1 = 1065353216(0x3f800000, float:1.0)
            int r7 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0065
            r2 = 0
            goto L_0x006b
        L_0x0065:
            int r7 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r7 <= 0) goto L_0x006b
            r2 = 1065353216(0x3f800000, float:1.0)
        L_0x006b:
            int r7 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r7 >= 0) goto L_0x0070
            goto L_0x0078
        L_0x0070:
            int r6 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r6 <= 0) goto L_0x0077
            r6 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0078
        L_0x0077:
            r6 = r0
        L_0x0078:
            r8.f7465A = r2
            r8.f7466B = r6
            goto L_0x0051
        L_0x007d:
            r0 = 0
        L_0x007e:
            if (r0 == 0) goto L_0x00a0
            com.coocent.colorpicker.view.ColorPickerView$a r9 = r8.f7485m
            if (r9 == 0) goto L_0x009c
            int r0 = r8.f7497y
            r1 = 3
            float[] r1 = new float[r1]
            float r2 = r8.f7498z
            r1[r4] = r2
            float r2 = r8.f7465A
            r1[r5] = r2
            float r2 = r8.f7466B
            r1[r3] = r2
            int r0 = android.graphics.Color.HSVToColor(r0, r1)
            r9.mo8810a(r0)
        L_0x009c:
            r8.invalidate()
            return r5
        L_0x00a0:
            boolean r9 = super.onTrackballEvent(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.colorpicker.view.ColorPickerView.onTrackballEvent(android.view.MotionEvent):boolean");
    }

    /* renamed from: q */
    public void mo8802q(int i, boolean z) {
        C2223a aVar;
        int alpha = Color.alpha(i);
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        this.f7497y = alpha;
        float f = fArr[0];
        this.f7498z = f;
        float f2 = fArr[1];
        this.f7465A = f2;
        float f3 = fArr[2];
        this.f7466B = f3;
        if (z && (aVar = this.f7485m) != null) {
            aVar.mo8810a(Color.HSVToColor(alpha, new float[]{f, f2, f3}));
        }
        invalidate();
    }

    public void setAlphaSliderText(int i) {
        setAlphaSliderText(getContext().getString(i));
    }

    public void setAlphaSliderVisible(boolean z) {
        if (this.f7470F != z) {
            this.f7470F = z;
            this.f7493u = null;
            this.f7494v = null;
            this.f7495w = null;
            this.f7496x = null;
            requestLayout();
        }
    }

    public void setBorderColor(int i) {
        this.f7469E = i;
        invalidate();
    }

    public void setColor(int i) {
        mo8802q(i, false);
    }

    public void setOnColorChangedListener(C2223a aVar) {
        this.f7485m = aVar;
    }

    public void setSliderTrackerColor(int i) {
        this.f7468D = i;
        this.f7489q.setColor(i);
        invalidate();
    }

    public ColorPickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7479g = 30.0f;
        this.f7480h = 20.0f;
        this.f7481i = 10.0f;
        this.f7482j = 5.0f;
        this.f7483k = 2.0f;
        this.f7484l = 1.0f;
        this.f7497y = 255;
        this.f7498z = 360.0f;
        this.f7465A = 0.0f;
        this.f7466B = 0.0f;
        this.f7467C = BuildConfig.FLAVOR;
        this.f7468D = -14935012;
        this.f7469E = -9539986;
        this.f7470F = false;
        this.f7471G = 0;
        this.f7478N = null;
        m10342j();
    }

    public void setAlphaSliderText(String str) {
        this.f7467C = str;
        invalidate();
    }
}
