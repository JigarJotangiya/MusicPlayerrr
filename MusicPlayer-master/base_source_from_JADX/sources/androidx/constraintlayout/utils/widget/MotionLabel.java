package androidx.constraintlayout.utils.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.constraintlayout.motion.widget.C0379b;
import androidx.constraintlayout.motion.widget.C0381d;
import androidx.constraintlayout.widget.C0439f;
import p082e.p083a.C3400a;

public class MotionLabel extends View implements C0381d {

    /* renamed from: e0 */
    static String f2095e0 = "MotionLabel";

    /* renamed from: A */
    private int f2096A = 1;

    /* renamed from: B */
    private String f2097B;

    /* renamed from: C */
    private Layout f2098C;

    /* renamed from: D */
    private int f2099D = 8388659;

    /* renamed from: E */
    private int f2100E = 0;

    /* renamed from: F */
    private boolean f2101F = false;

    /* renamed from: G */
    private float f2102G;

    /* renamed from: H */
    private float f2103H;

    /* renamed from: I */
    private float f2104I;

    /* renamed from: J */
    private Drawable f2105J;

    /* renamed from: K */
    Matrix f2106K;

    /* renamed from: L */
    private Bitmap f2107L;

    /* renamed from: M */
    private BitmapShader f2108M;

    /* renamed from: N */
    private Matrix f2109N;

    /* renamed from: O */
    private float f2110O = Float.NaN;

    /* renamed from: P */
    private float f2111P = Float.NaN;

    /* renamed from: Q */
    private float f2112Q = 0.0f;

    /* renamed from: R */
    private float f2113R = 0.0f;

    /* renamed from: S */
    Paint f2114S = new Paint();

    /* renamed from: T */
    private int f2115T = 0;

    /* renamed from: U */
    Rect f2116U;

    /* renamed from: V */
    Paint f2117V;

    /* renamed from: W */
    float f2118W;

    /* renamed from: a0 */
    float f2119a0 = Float.NaN;

    /* renamed from: b0 */
    float f2120b0 = Float.NaN;

    /* renamed from: c0 */
    float f2121c0 = Float.NaN;

    /* renamed from: d0 */
    float f2122d0 = Float.NaN;

    /* renamed from: g */
    TextPaint f2123g = new TextPaint();

    /* renamed from: h */
    Path f2124h = new Path();

    /* renamed from: i */
    private int f2125i = 65535;

    /* renamed from: j */
    private int f2126j = 65535;

    /* renamed from: k */
    private boolean f2127k = false;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f2128l = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f2129m = Float.NaN;

    /* renamed from: n */
    ViewOutlineProvider f2130n;

    /* renamed from: o */
    RectF f2131o;

    /* renamed from: p */
    private float f2132p = 48.0f;

    /* renamed from: q */
    private float f2133q = Float.NaN;

    /* renamed from: r */
    private int f2134r;

    /* renamed from: s */
    private int f2135s;

    /* renamed from: t */
    private float f2136t = 0.0f;

    /* renamed from: u */
    private String f2137u = "Hello World";

    /* renamed from: v */
    boolean f2138v = true;

    /* renamed from: w */
    private Rect f2139w = new Rect();

    /* renamed from: x */
    private int f2140x = 1;

    /* renamed from: y */
    private int f2141y = 1;

    /* renamed from: z */
    private int f2142z = 1;

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$a */
    class C0419a extends ViewOutlineProvider {
        C0419a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = MotionLabel.this.getWidth();
            int height = MotionLabel.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * MotionLabel.this.f2128l) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.MotionLabel$b */
    class C0420b extends ViewOutlineProvider {
        C0420b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionLabel.this.getWidth(), MotionLabel.this.getHeight(), MotionLabel.this.f2129m);
        }
    }

    public MotionLabel(Context context) {
        super(context);
        m2658g(context, (AttributeSet) null);
    }

    /* renamed from: d */
    private void m2657d(float f, float f2, float f3, float f4) {
        if (this.f2109N != null) {
            this.f2103H = f3 - f;
            this.f2104I = f4 - f2;
            m2662l();
        }
    }

    /* renamed from: g */
    private void m2658g(Context context, AttributeSet attributeSet) {
        m2660i(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.MotionLabel);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.MotionLabel_android_text) {
                    setText(obtainStyledAttributes.getText(index));
                } else if (index == C0439f.MotionLabel_android_fontFamily) {
                    this.f2097B = obtainStyledAttributes.getString(index);
                } else if (index == C0439f.MotionLabel_scaleFromTextSize) {
                    this.f2133q = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2133q);
                } else if (index == C0439f.MotionLabel_android_textSize) {
                    this.f2132p = (float) obtainStyledAttributes.getDimensionPixelSize(index, (int) this.f2132p);
                } else if (index == C0439f.MotionLabel_android_textStyle) {
                    this.f2134r = obtainStyledAttributes.getInt(index, this.f2134r);
                } else if (index == C0439f.MotionLabel_android_typeface) {
                    this.f2135s = obtainStyledAttributes.getInt(index, this.f2135s);
                } else if (index == C0439f.MotionLabel_android_textColor) {
                    this.f2125i = obtainStyledAttributes.getColor(index, this.f2125i);
                } else if (index == C0439f.MotionLabel_borderRound) {
                    float dimension = obtainStyledAttributes.getDimension(index, this.f2129m);
                    this.f2129m = dimension;
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(dimension);
                    }
                } else if (index == C0439f.MotionLabel_borderRoundPercent) {
                    float f = obtainStyledAttributes.getFloat(index, this.f2128l);
                    this.f2128l = f;
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(f);
                    }
                } else if (index == C0439f.MotionLabel_android_gravity) {
                    setGravity(obtainStyledAttributes.getInt(index, -1));
                } else if (index == C0439f.MotionLabel_android_autoSizeTextType) {
                    this.f2100E = obtainStyledAttributes.getInt(index, 0);
                } else if (index == C0439f.MotionLabel_textOutlineColor) {
                    this.f2126j = obtainStyledAttributes.getInt(index, this.f2126j);
                    this.f2127k = true;
                } else if (index == C0439f.MotionLabel_textOutlineThickness) {
                    this.f2136t = obtainStyledAttributes.getDimension(index, this.f2136t);
                    this.f2127k = true;
                } else if (index == C0439f.MotionLabel_textBackground) {
                    this.f2105J = obtainStyledAttributes.getDrawable(index);
                    this.f2127k = true;
                } else if (index == C0439f.MotionLabel_textBackgroundPanX) {
                    this.f2119a0 = obtainStyledAttributes.getFloat(index, this.f2119a0);
                } else if (index == C0439f.MotionLabel_textBackgroundPanY) {
                    this.f2120b0 = obtainStyledAttributes.getFloat(index, this.f2120b0);
                } else if (index == C0439f.MotionLabel_textPanX) {
                    this.f2112Q = obtainStyledAttributes.getFloat(index, this.f2112Q);
                } else if (index == C0439f.MotionLabel_textPanY) {
                    this.f2113R = obtainStyledAttributes.getFloat(index, this.f2113R);
                } else if (index == C0439f.MotionLabel_textBackgroundRotate) {
                    this.f2122d0 = obtainStyledAttributes.getFloat(index, this.f2122d0);
                } else if (index == C0439f.MotionLabel_textBackgroundZoom) {
                    this.f2121c0 = obtainStyledAttributes.getFloat(index, this.f2121c0);
                } else if (index == C0439f.MotionLabel_textureHeight) {
                    this.f2110O = obtainStyledAttributes.getDimension(index, this.f2110O);
                } else if (index == C0439f.MotionLabel_textureWidth) {
                    this.f2111P = obtainStyledAttributes.getDimension(index, this.f2111P);
                } else if (index == C0439f.MotionLabel_textureEffect) {
                    this.f2115T = obtainStyledAttributes.getInt(index, this.f2115T);
                }
            }
            obtainStyledAttributes.recycle();
        }
        m2661k();
        mo2813j();
    }

    private float getHorizontalOffset() {
        float f = Float.isNaN(this.f2133q) ? 1.0f : this.f2132p / this.f2133q;
        TextPaint textPaint = this.f2123g;
        String str = this.f2137u;
        return (((((Float.isNaN(this.f2103H) ? (float) getMeasuredWidth() : this.f2103H) - ((float) getPaddingLeft())) - ((float) getPaddingRight())) - (f * textPaint.measureText(str, 0, str.length()))) * (this.f2112Q + 1.0f)) / 2.0f;
    }

    private float getVerticalOffset() {
        float f = Float.isNaN(this.f2133q) ? 1.0f : this.f2132p / this.f2133q;
        Paint.FontMetrics fontMetrics = this.f2123g.getFontMetrics();
        float measuredHeight = ((Float.isNaN(this.f2104I) ? (float) getMeasuredHeight() : this.f2104I) - ((float) getPaddingTop())) - ((float) getPaddingBottom());
        float f2 = fontMetrics.descent;
        float f3 = fontMetrics.ascent;
        return (((measuredHeight - ((f2 - f3) * f)) * (1.0f - this.f2113R)) / 2.0f) - (f * f3);
    }

    /* renamed from: h */
    private void m2659h(String str, int i, int i2) {
        Typeface typeface;
        Typeface typeface2;
        if (str != null) {
            typeface = Typeface.create(str, i2);
            if (typeface != null) {
                setTypeface(typeface);
                return;
            }
        } else {
            typeface = null;
        }
        boolean z = true;
        if (i == 1) {
            typeface = Typeface.SANS_SERIF;
        } else if (i == 2) {
            typeface = Typeface.SERIF;
        } else if (i == 3) {
            typeface = Typeface.MONOSPACE;
        }
        float f = 0.0f;
        if (i2 > 0) {
            if (typeface == null) {
                typeface2 = Typeface.defaultFromStyle(i2);
            } else {
                typeface2 = Typeface.create(typeface, i2);
            }
            setTypeface(typeface2);
            int i3 = (~(typeface2 != null ? typeface2.getStyle() : 0)) & i2;
            TextPaint textPaint = this.f2123g;
            if ((i3 & 1) == 0) {
                z = false;
            }
            textPaint.setFakeBoldText(z);
            TextPaint textPaint2 = this.f2123g;
            if ((i3 & 2) != 0) {
                f = -0.25f;
            }
            textPaint2.setTextSkewX(f);
            return;
        }
        this.f2123g.setFakeBoldText(false);
        this.f2123g.setTextSkewX(0.0f);
        setTypeface(typeface);
    }

    /* renamed from: i */
    private void m2660i(Context context, AttributeSet attributeSet) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C3400a.colorPrimary, typedValue, true);
        TextPaint textPaint = this.f2123g;
        int i = typedValue.data;
        this.f2125i = i;
        textPaint.setColor(i);
    }

    /* renamed from: k */
    private void m2661k() {
        if (this.f2105J != null) {
            this.f2109N = new Matrix();
            int intrinsicWidth = this.f2105J.getIntrinsicWidth();
            int intrinsicHeight = this.f2105J.getIntrinsicHeight();
            int i = 128;
            if (intrinsicWidth <= 0 && (intrinsicWidth = getWidth()) == 0) {
                intrinsicWidth = Float.isNaN(this.f2111P) ? 128 : (int) this.f2111P;
            }
            if (intrinsicHeight <= 0 && (intrinsicHeight = getHeight()) == 0) {
                if (!Float.isNaN(this.f2110O)) {
                    i = (int) this.f2110O;
                }
                intrinsicHeight = i;
            }
            if (this.f2115T != 0) {
                intrinsicWidth /= 2;
                intrinsicHeight /= 2;
            }
            this.f2107L = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(this.f2107L);
            this.f2105J.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            this.f2105J.setFilterBitmap(true);
            this.f2105J.draw(canvas);
            if (this.f2115T != 0) {
                this.f2107L = mo2798e(this.f2107L, 4);
            }
            Bitmap bitmap = this.f2107L;
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            this.f2108M = new BitmapShader(bitmap, tileMode, tileMode);
        }
    }

    /* renamed from: l */
    private void m2662l() {
        float f = 0.0f;
        float f2 = Float.isNaN(this.f2119a0) ? 0.0f : this.f2119a0;
        float f3 = Float.isNaN(this.f2120b0) ? 0.0f : this.f2120b0;
        float f4 = Float.isNaN(this.f2121c0) ? 1.0f : this.f2121c0;
        if (!Float.isNaN(this.f2122d0)) {
            f = this.f2122d0;
        }
        this.f2109N.reset();
        float width = (float) this.f2107L.getWidth();
        float height = (float) this.f2107L.getHeight();
        float f5 = Float.isNaN(this.f2111P) ? this.f2103H : this.f2111P;
        float f6 = Float.isNaN(this.f2110O) ? this.f2104I : this.f2110O;
        float f7 = f4 * (width * f6 < height * f5 ? f5 / width : f6 / height);
        this.f2109N.postScale(f7, f7);
        float f8 = width * f7;
        float f9 = f5 - f8;
        float f10 = f7 * height;
        float f11 = f6 - f10;
        if (!Float.isNaN(this.f2110O)) {
            f11 = this.f2110O / 2.0f;
        }
        if (!Float.isNaN(this.f2111P)) {
            f9 = this.f2111P / 2.0f;
        }
        this.f2109N.postTranslate((((f2 * f9) + f5) - f8) * 0.5f, (((f3 * f11) + f6) - f10) * 0.5f);
        this.f2109N.postRotate(f, f5 / 2.0f, f6 / 2.0f);
        this.f2108M.setLocalMatrix(this.f2109N);
    }

    /* renamed from: a */
    public void mo2538a(float f, float f2, float f3, float f4) {
        int i = (int) (f + 0.5f);
        this.f2102G = f - ((float) i);
        int i2 = (int) (f3 + 0.5f);
        int i3 = i2 - i;
        int i4 = (int) (f4 + 0.5f);
        int i5 = (int) (0.5f + f2);
        int i6 = i4 - i5;
        float f5 = f3 - f;
        this.f2103H = f5;
        float f6 = f4 - f2;
        this.f2104I = f6;
        m2657d(f, f2, f3, f4);
        if (getMeasuredHeight() == i6 && getMeasuredWidth() == i3) {
            super.layout(i, i5, i2, i4);
        } else {
            measure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i6, 1073741824));
            super.layout(i, i5, i2, i4);
        }
        if (this.f2101F) {
            if (this.f2116U == null) {
                this.f2117V = new Paint();
                this.f2116U = new Rect();
                this.f2117V.set(this.f2123g);
                this.f2118W = this.f2117V.getTextSize();
            }
            this.f2103H = f5;
            this.f2104I = f6;
            Paint paint = this.f2117V;
            String str = this.f2137u;
            paint.getTextBounds(str, 0, str.length(), this.f2116U);
            int width = this.f2116U.width();
            float height = ((float) this.f2116U.height()) * 1.3f;
            float f7 = (f5 - ((float) this.f2141y)) - ((float) this.f2140x);
            float f8 = (f6 - ((float) this.f2096A)) - ((float) this.f2142z);
            float f9 = (float) width;
            if (f9 * f8 > height * f7) {
                this.f2123g.setTextSize((this.f2118W * f7) / f9);
            } else {
                this.f2123g.setTextSize((this.f2118W * f8) / height);
            }
            if (this.f2127k || !Float.isNaN(this.f2133q)) {
                mo2799f(Float.isNaN(this.f2133q) ? 1.0f : this.f2132p / this.f2133q);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public Bitmap mo2798e(Bitmap bitmap, int i) {
        System.nanoTime();
        int width = bitmap.getWidth() / 2;
        int height = bitmap.getHeight() / 2;
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, width, height, true);
        for (int i2 = 0; i2 < i && width >= 32 && height >= 32; i2++) {
            width /= 2;
            height /= 2;
            createScaledBitmap = Bitmap.createScaledBitmap(createScaledBitmap, width, height, true);
        }
        return createScaledBitmap;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo2799f(float f) {
        if (this.f2127k || f != 1.0f) {
            this.f2124h.reset();
            String str = this.f2137u;
            int length = str.length();
            this.f2123g.getTextBounds(str, 0, length, this.f2139w);
            this.f2123g.getTextPath(str, 0, length, 0.0f, 0.0f, this.f2124h);
            if (f != 1.0f) {
                String str2 = f2095e0;
                String a = C0379b.m2239a();
                StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 22);
                sb.append(a);
                sb.append(" scale ");
                sb.append(f);
                Log.v(str2, sb.toString());
                Matrix matrix = new Matrix();
                matrix.postScale(f, f);
                this.f2124h.transform(matrix);
            }
            Rect rect = this.f2139w;
            rect.right--;
            rect.left++;
            rect.bottom++;
            rect.top--;
            RectF rectF = new RectF();
            rectF.bottom = (float) getHeight();
            rectF.right = (float) getWidth();
            this.f2138v = false;
        }
    }

    public float getRound() {
        return this.f2129m;
    }

    public float getRoundPercent() {
        return this.f2128l;
    }

    public float getScaleFromTextSize() {
        return this.f2133q;
    }

    public float getTextBackgroundPanX() {
        return this.f2119a0;
    }

    public float getTextBackgroundPanY() {
        return this.f2120b0;
    }

    public float getTextBackgroundRotate() {
        return this.f2122d0;
    }

    public float getTextBackgroundZoom() {
        return this.f2121c0;
    }

    public int getTextOutlineColor() {
        return this.f2126j;
    }

    public float getTextPanX() {
        return this.f2112Q;
    }

    public float getTextPanY() {
        return this.f2113R;
    }

    public float getTextureHeight() {
        return this.f2110O;
    }

    public float getTextureWidth() {
        return this.f2111P;
    }

    public Typeface getTypeface() {
        return this.f2123g.getTypeface();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo2813j() {
        this.f2140x = getPaddingLeft();
        this.f2141y = getPaddingRight();
        this.f2142z = getPaddingTop();
        this.f2096A = getPaddingBottom();
        m2659h(this.f2097B, this.f2135s, this.f2134r);
        this.f2123g.setColor(this.f2125i);
        this.f2123g.setStrokeWidth(this.f2136t);
        this.f2123g.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f2123g.setFlags(128);
        setTextSize(this.f2132p);
        this.f2123g.setAntiAlias(true);
    }

    public void layout(int i, int i2, int i3, int i4) {
        float f;
        super.layout(i, i2, i3, i4);
        boolean isNaN = Float.isNaN(this.f2133q);
        if (isNaN) {
            f = 1.0f;
        } else {
            f = this.f2132p / this.f2133q;
        }
        this.f2103H = (float) (i3 - i);
        this.f2104I = (float) (i4 - i2);
        if (this.f2101F) {
            if (this.f2116U == null) {
                this.f2117V = new Paint();
                this.f2116U = new Rect();
                this.f2117V.set(this.f2123g);
                this.f2118W = this.f2117V.getTextSize();
            }
            Paint paint = this.f2117V;
            String str = this.f2137u;
            paint.getTextBounds(str, 0, str.length(), this.f2116U);
            int width = this.f2116U.width();
            int height = (int) (((float) this.f2116U.height()) * 1.3f);
            float f2 = (this.f2103H - ((float) this.f2141y)) - ((float) this.f2140x);
            float f3 = (this.f2104I - ((float) this.f2096A)) - ((float) this.f2142z);
            if (isNaN) {
                float f4 = (float) width;
                float f5 = (float) height;
                if (f4 * f3 > f5 * f2) {
                    this.f2123g.setTextSize((this.f2118W * f2) / f4);
                } else {
                    this.f2123g.setTextSize((this.f2118W * f3) / f5);
                }
            } else {
                float f6 = (float) width;
                float f7 = (float) height;
                f = f6 * f3 > f7 * f2 ? f2 / f6 : f3 / f7;
            }
        }
        if (this.f2127k || !isNaN) {
            m2657d((float) i, (float) i2, (float) i3, (float) i4);
            mo2799f(f);
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        float f = Float.isNaN(this.f2133q) ? 1.0f : this.f2132p / this.f2133q;
        super.onDraw(canvas);
        if (this.f2127k || f != 1.0f) {
            if (this.f2138v) {
                mo2799f(f);
            }
            if (this.f2106K == null) {
                this.f2106K = new Matrix();
            }
            if (this.f2127k) {
                this.f2114S.set(this.f2123g);
                this.f2106K.reset();
                float horizontalOffset = ((float) this.f2140x) + getHorizontalOffset();
                float verticalOffset = ((float) this.f2142z) + getVerticalOffset();
                this.f2106K.postTranslate(horizontalOffset, verticalOffset);
                this.f2106K.preScale(f, f);
                this.f2124h.transform(this.f2106K);
                if (this.f2108M != null) {
                    this.f2123g.setFilterBitmap(true);
                    this.f2123g.setShader(this.f2108M);
                } else {
                    this.f2123g.setColor(this.f2125i);
                }
                this.f2123g.setStyle(Paint.Style.FILL);
                this.f2123g.setStrokeWidth(this.f2136t);
                canvas.drawPath(this.f2124h, this.f2123g);
                if (this.f2108M != null) {
                    this.f2123g.setShader((Shader) null);
                }
                this.f2123g.setColor(this.f2126j);
                this.f2123g.setStyle(Paint.Style.STROKE);
                this.f2123g.setStrokeWidth(this.f2136t);
                canvas.drawPath(this.f2124h, this.f2123g);
                this.f2106K.reset();
                this.f2106K.postTranslate(-horizontalOffset, -verticalOffset);
                this.f2124h.transform(this.f2106K);
                this.f2123g.set(this.f2114S);
                return;
            }
            float horizontalOffset2 = ((float) this.f2140x) + getHorizontalOffset();
            float verticalOffset2 = ((float) this.f2142z) + getVerticalOffset();
            this.f2106K.reset();
            this.f2106K.preTranslate(horizontalOffset2, verticalOffset2);
            this.f2124h.transform(this.f2106K);
            this.f2123g.setColor(this.f2125i);
            this.f2123g.setStyle(Paint.Style.FILL_AND_STROKE);
            this.f2123g.setStrokeWidth(this.f2136t);
            canvas.drawPath(this.f2124h, this.f2123g);
            this.f2106K.reset();
            this.f2106K.preTranslate(-horizontalOffset2, -verticalOffset2);
            this.f2124h.transform(this.f2106K);
            return;
        }
        canvas.drawText(this.f2137u, this.f2102G + ((float) this.f2140x) + getHorizontalOffset(), ((float) this.f2142z) + getVerticalOffset(), this.f2123g);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        this.f2101F = false;
        this.f2140x = getPaddingLeft();
        this.f2141y = getPaddingRight();
        this.f2142z = getPaddingTop();
        this.f2096A = getPaddingBottom();
        if (mode != 1073741824 || mode2 != 1073741824) {
            TextPaint textPaint = this.f2123g;
            String str = this.f2137u;
            textPaint.getTextBounds(str, 0, str.length(), this.f2139w);
            if (mode != 1073741824) {
                size = (int) (((float) this.f2139w.width()) + 0.99999f);
            }
            size += this.f2140x + this.f2141y;
            if (mode2 != 1073741824) {
                int fontMetricsInt = (int) (((float) this.f2123g.getFontMetricsInt((Paint.FontMetricsInt) null)) + 0.99999f);
                if (mode2 == Integer.MIN_VALUE) {
                    fontMetricsInt = Math.min(size2, fontMetricsInt);
                }
                size2 = this.f2142z + this.f2096A + fontMetricsInt;
            }
        } else if (this.f2100E != 0) {
            this.f2101F = true;
        }
        setMeasuredDimension(size, size2);
    }

    @SuppressLint({"RtlHardcoded"})
    public void setGravity(int i) {
        if ((i & 8388615) == 0) {
            i |= 8388611;
        }
        if ((i & 112) == 0) {
            i |= 48;
        }
        int i2 = i & 8388615;
        int i3 = this.f2099D;
        int i4 = i3 & 8388615;
        if (i != i3) {
            invalidate();
        }
        this.f2099D = i;
        int i5 = i & 112;
        if (i5 == 48) {
            this.f2113R = -1.0f;
        } else if (i5 != 80) {
            this.f2113R = 0.0f;
        } else {
            this.f2113R = 1.0f;
        }
        int i6 = i & 8388615;
        if (i6 != 3) {
            if (i6 != 5) {
                if (i6 != 8388611) {
                    if (i6 != 8388613) {
                        this.f2112Q = 0.0f;
                        return;
                    }
                }
            }
            this.f2112Q = 1.0f;
            return;
        }
        this.f2112Q = -1.0f;
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2129m = f;
            float f2 = this.f2128l;
            this.f2128l = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2129m != f;
        this.f2129m = f;
        if (f != 0.0f) {
            if (this.f2124h == null) {
                this.f2124h = new Path();
            }
            if (this.f2131o == null) {
                this.f2131o = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2130n == null) {
                    C0420b bVar = new C0420b();
                    this.f2130n = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.f2131o.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2124h.reset();
            Path path = this.f2124h;
            RectF rectF = this.f2131o;
            float f3 = this.f2129m;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f2128l != f;
        this.f2128l = f;
        if (f != 0.0f) {
            if (this.f2124h == null) {
                this.f2124h = new Path();
            }
            if (this.f2131o == null) {
                this.f2131o = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2130n == null) {
                    C0419a aVar = new C0419a();
                    this.f2130n = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2128l) / 2.0f;
            this.f2131o.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2124h.reset();
            this.f2124h.addRoundRect(this.f2131o, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setScaleFromTextSize(float f) {
        this.f2133q = f;
    }

    public void setText(CharSequence charSequence) {
        this.f2137u = charSequence.toString();
        invalidate();
    }

    public void setTextBackgroundPanX(float f) {
        this.f2119a0 = f;
        m2662l();
        invalidate();
    }

    public void setTextBackgroundPanY(float f) {
        this.f2120b0 = f;
        m2662l();
        invalidate();
    }

    public void setTextBackgroundRotate(float f) {
        this.f2122d0 = f;
        m2662l();
        invalidate();
    }

    public void setTextBackgroundZoom(float f) {
        this.f2121c0 = f;
        m2662l();
        invalidate();
    }

    public void setTextFillColor(int i) {
        this.f2125i = i;
        invalidate();
    }

    public void setTextOutlineColor(int i) {
        this.f2126j = i;
        this.f2127k = true;
        invalidate();
    }

    public void setTextOutlineThickness(float f) {
        this.f2136t = f;
        this.f2127k = true;
        if (Float.isNaN(f)) {
            this.f2136t = 1.0f;
            this.f2127k = false;
        }
        invalidate();
    }

    public void setTextPanX(float f) {
        this.f2112Q = f;
        invalidate();
    }

    public void setTextPanY(float f) {
        this.f2113R = f;
        invalidate();
    }

    public void setTextSize(float f) {
        this.f2132p = f;
        String str = f2095e0;
        String a = C0379b.m2239a();
        float f2 = this.f2133q;
        StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 35);
        sb.append(a);
        sb.append("  ");
        sb.append(f);
        sb.append(" / ");
        sb.append(f2);
        Log.v(str, sb.toString());
        TextPaint textPaint = this.f2123g;
        if (!Float.isNaN(this.f2133q)) {
            f = this.f2133q;
        }
        textPaint.setTextSize(f);
        mo2799f(Float.isNaN(this.f2133q) ? 1.0f : this.f2132p / this.f2133q);
        requestLayout();
        invalidate();
    }

    public void setTextureHeight(float f) {
        this.f2110O = f;
        m2662l();
        invalidate();
    }

    public void setTextureWidth(float f) {
        this.f2111P = f;
        m2662l();
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        if (this.f2123g.getTypeface() != typeface) {
            this.f2123g.setTypeface(typeface);
            if (this.f2098C != null) {
                this.f2098C = null;
                requestLayout();
                invalidate();
            }
        }
    }

    public MotionLabel(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2658g(context, attributeSet);
    }

    public MotionLabel(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2658g(context, attributeSet);
    }
}
