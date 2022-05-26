package com.makeramen.roundedimageview;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: com.makeramen.roundedimageview.b */
/* compiled from: RoundedDrawable */
public class C6741b extends Drawable {

    /* renamed from: a */
    private final RectF f30180a = new RectF();

    /* renamed from: b */
    private final RectF f30181b = new RectF();

    /* renamed from: c */
    private final RectF f30182c;

    /* renamed from: d */
    private final Bitmap f30183d;

    /* renamed from: e */
    private final Paint f30184e;

    /* renamed from: f */
    private final int f30185f;

    /* renamed from: g */
    private final int f30186g;

    /* renamed from: h */
    private final RectF f30187h;

    /* renamed from: i */
    private final Paint f30188i;

    /* renamed from: j */
    private final Matrix f30189j;

    /* renamed from: k */
    private final RectF f30190k;

    /* renamed from: l */
    private Shader.TileMode f30191l;

    /* renamed from: m */
    private Shader.TileMode f30192m;

    /* renamed from: n */
    private boolean f30193n;

    /* renamed from: o */
    private float f30194o;

    /* renamed from: p */
    private final boolean[] f30195p;

    /* renamed from: q */
    private boolean f30196q;

    /* renamed from: r */
    private float f30197r;

    /* renamed from: s */
    private ColorStateList f30198s;

    /* renamed from: t */
    private ImageView.ScaleType f30199t;

    /* renamed from: com.makeramen.roundedimageview.b$a */
    /* compiled from: RoundedDrawable */
    static /* synthetic */ class C6742a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30200a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|(3:13|14|16)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|16) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0049 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30200a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30200a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30200a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30200a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30200a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30200a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30200a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.C6741b.C6742a.<clinit>():void");
        }
    }

    public C6741b(Bitmap bitmap) {
        RectF rectF = new RectF();
        this.f30182c = rectF;
        this.f30187h = new RectF();
        this.f30189j = new Matrix();
        this.f30190k = new RectF();
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.f30191l = tileMode;
        this.f30192m = tileMode;
        this.f30193n = true;
        this.f30194o = 0.0f;
        this.f30195p = new boolean[]{true, true, true, true};
        this.f30196q = false;
        this.f30197r = 0.0f;
        this.f30198s = ColorStateList.valueOf(-16777216);
        this.f30199t = ImageView.ScaleType.FIT_CENTER;
        this.f30183d = bitmap;
        int width = bitmap.getWidth();
        this.f30185f = width;
        int height = bitmap.getHeight();
        this.f30186g = height;
        rectF.set(0.0f, 0.0f, (float) width, (float) height);
        Paint paint = new Paint();
        this.f30184e = paint;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f30188i = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(this.f30198s.getColorForState(getState(), -16777216));
        paint2.setStrokeWidth(this.f30197r);
    }

    /* renamed from: a */
    private static boolean m38532a(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: b */
    private static boolean m38533b(boolean[] zArr) {
        for (boolean z : zArr) {
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static Bitmap m38534c(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(Math.max(drawable.getIntrinsicWidth(), 2), Math.max(drawable.getIntrinsicHeight(), 2), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            return createBitmap;
        } catch (Exception e) {
            e.printStackTrace();
            Log.w("RoundedDrawable", "Failed to create bitmap from drawable!");
            return null;
        }
    }

    /* renamed from: d */
    public static C6741b m38535d(Bitmap bitmap) {
        if (bitmap != null) {
            return new C6741b(bitmap);
        }
        return null;
    }

    /* renamed from: e */
    public static Drawable m38536e(Drawable drawable) {
        if (drawable == null || (drawable instanceof C6741b)) {
            return drawable;
        }
        if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            for (int i = 0; i < numberOfLayers; i++) {
                layerDrawable.setDrawableByLayerId(layerDrawable.getId(i), m38536e(layerDrawable.getDrawable(i)));
            }
            return layerDrawable;
        }
        Bitmap c = m38534c(drawable);
        return c != null ? new C6741b(c) : drawable;
    }

    /* renamed from: f */
    private void m38537f(Canvas canvas) {
        if (!m38532a(this.f30195p) && this.f30194o != 0.0f) {
            RectF rectF = this.f30181b;
            float f = rectF.left;
            float f2 = rectF.top;
            float width = rectF.width() + f;
            float height = this.f30181b.height() + f2;
            float f3 = this.f30194o;
            if (!this.f30195p[0]) {
                this.f30190k.set(f, f2, f + f3, f2 + f3);
                canvas.drawRect(this.f30190k, this.f30184e);
            }
            if (!this.f30195p[1]) {
                this.f30190k.set(width - f3, f2, width, f3);
                canvas.drawRect(this.f30190k, this.f30184e);
            }
            if (!this.f30195p[2]) {
                this.f30190k.set(width - f3, height - f3, width, height);
                canvas.drawRect(this.f30190k, this.f30184e);
            }
            if (!this.f30195p[3]) {
                this.f30190k.set(f, height - f3, f3 + f, height);
                canvas.drawRect(this.f30190k, this.f30184e);
            }
        }
    }

    /* renamed from: g */
    private void m38538g(Canvas canvas) {
        float f;
        if (!m38532a(this.f30195p) && this.f30194o != 0.0f) {
            RectF rectF = this.f30181b;
            float f2 = rectF.left;
            float f3 = rectF.top;
            float width = rectF.width() + f2;
            float height = f3 + this.f30181b.height();
            float f4 = this.f30194o;
            float f5 = this.f30197r / 2.0f;
            if (!this.f30195p[0]) {
                Canvas canvas2 = canvas;
                canvas2.drawLine(f2 - f5, f3, f2 + f4, f3, this.f30188i);
                canvas2.drawLine(f2, f3 - f5, f2, f3 + f4, this.f30188i);
            }
            if (!this.f30195p[1]) {
                Canvas canvas3 = canvas;
                float f6 = width;
                canvas3.drawLine((width - f4) - f5, f3, f6, f3, this.f30188i);
                canvas3.drawLine(width, f3 - f5, f6, f3 + f4, this.f30188i);
            }
            if (!this.f30195p[2]) {
                f = f4;
                canvas.drawLine((width - f4) - f5, height, width + f5, height, this.f30188i);
                canvas.drawLine(width, height - f, width, height, this.f30188i);
            } else {
                f = f4;
            }
            if (!this.f30195p[3]) {
                canvas.drawLine(f2 - f5, height, f2 + f, height, this.f30188i);
                canvas.drawLine(f2, height - f, f2, height, this.f30188i);
            }
        }
    }

    /* renamed from: o */
    private void m38539o() {
        float f;
        float f2;
        float f3;
        int i = C6742a.f30200a[this.f30199t.ordinal()];
        if (i == 1) {
            this.f30187h.set(this.f30180a);
            RectF rectF = this.f30187h;
            float f4 = this.f30197r;
            rectF.inset(f4 / 2.0f, f4 / 2.0f);
            this.f30189j.reset();
            this.f30189j.setTranslate((float) ((int) (((this.f30187h.width() - ((float) this.f30185f)) * 0.5f) + 0.5f)), (float) ((int) (((this.f30187h.height() - ((float) this.f30186g)) * 0.5f) + 0.5f)));
        } else if (i == 2) {
            this.f30187h.set(this.f30180a);
            RectF rectF2 = this.f30187h;
            float f5 = this.f30197r;
            rectF2.inset(f5 / 2.0f, f5 / 2.0f);
            this.f30189j.reset();
            float f6 = 0.0f;
            if (((float) this.f30185f) * this.f30187h.height() > this.f30187h.width() * ((float) this.f30186g)) {
                f2 = this.f30187h.height() / ((float) this.f30186g);
                f6 = (this.f30187h.width() - (((float) this.f30185f) * f2)) * 0.5f;
                f = 0.0f;
            } else {
                f2 = this.f30187h.width() / ((float) this.f30185f);
                f = (this.f30187h.height() - (((float) this.f30186g) * f2)) * 0.5f;
            }
            this.f30189j.setScale(f2, f2);
            Matrix matrix = this.f30189j;
            float f7 = this.f30197r;
            matrix.postTranslate(((float) ((int) (f6 + 0.5f))) + (f7 / 2.0f), ((float) ((int) (f + 0.5f))) + (f7 / 2.0f));
        } else if (i == 3) {
            this.f30189j.reset();
            if (((float) this.f30185f) > this.f30180a.width() || ((float) this.f30186g) > this.f30180a.height()) {
                f3 = Math.min(this.f30180a.width() / ((float) this.f30185f), this.f30180a.height() / ((float) this.f30186g));
            } else {
                f3 = 1.0f;
            }
            this.f30189j.setScale(f3, f3);
            this.f30189j.postTranslate((float) ((int) (((this.f30180a.width() - (((float) this.f30185f) * f3)) * 0.5f) + 0.5f)), (float) ((int) (((this.f30180a.height() - (((float) this.f30186g) * f3)) * 0.5f) + 0.5f)));
            this.f30187h.set(this.f30182c);
            this.f30189j.mapRect(this.f30187h);
            RectF rectF3 = this.f30187h;
            float f8 = this.f30197r;
            rectF3.inset(f8 / 2.0f, f8 / 2.0f);
            this.f30189j.setRectToRect(this.f30182c, this.f30187h, Matrix.ScaleToFit.FILL);
        } else if (i == 5) {
            this.f30187h.set(this.f30182c);
            this.f30189j.setRectToRect(this.f30182c, this.f30180a, Matrix.ScaleToFit.END);
            this.f30189j.mapRect(this.f30187h);
            RectF rectF4 = this.f30187h;
            float f9 = this.f30197r;
            rectF4.inset(f9 / 2.0f, f9 / 2.0f);
            this.f30189j.setRectToRect(this.f30182c, this.f30187h, Matrix.ScaleToFit.FILL);
        } else if (i == 6) {
            this.f30187h.set(this.f30182c);
            this.f30189j.setRectToRect(this.f30182c, this.f30180a, Matrix.ScaleToFit.START);
            this.f30189j.mapRect(this.f30187h);
            RectF rectF5 = this.f30187h;
            float f10 = this.f30197r;
            rectF5.inset(f10 / 2.0f, f10 / 2.0f);
            this.f30189j.setRectToRect(this.f30182c, this.f30187h, Matrix.ScaleToFit.FILL);
        } else if (i != 7) {
            this.f30187h.set(this.f30182c);
            this.f30189j.setRectToRect(this.f30182c, this.f30180a, Matrix.ScaleToFit.CENTER);
            this.f30189j.mapRect(this.f30187h);
            RectF rectF6 = this.f30187h;
            float f11 = this.f30197r;
            rectF6.inset(f11 / 2.0f, f11 / 2.0f);
            this.f30189j.setRectToRect(this.f30182c, this.f30187h, Matrix.ScaleToFit.FILL);
        } else {
            this.f30187h.set(this.f30180a);
            RectF rectF7 = this.f30187h;
            float f12 = this.f30197r;
            rectF7.inset(f12 / 2.0f, f12 / 2.0f);
            this.f30189j.reset();
            this.f30189j.setRectToRect(this.f30182c, this.f30187h, Matrix.ScaleToFit.FILL);
        }
        this.f30181b.set(this.f30187h);
    }

    public void draw(Canvas canvas) {
        if (this.f30193n) {
            BitmapShader bitmapShader = new BitmapShader(this.f30183d, this.f30191l, this.f30192m);
            Shader.TileMode tileMode = this.f30191l;
            Shader.TileMode tileMode2 = Shader.TileMode.CLAMP;
            if (tileMode == tileMode2 && this.f30192m == tileMode2) {
                bitmapShader.setLocalMatrix(this.f30189j);
            }
            this.f30184e.setShader(bitmapShader);
            this.f30193n = false;
        }
        if (this.f30196q) {
            if (this.f30197r > 0.0f) {
                canvas.drawOval(this.f30181b, this.f30184e);
                canvas.drawOval(this.f30187h, this.f30188i);
                return;
            }
            canvas.drawOval(this.f30181b, this.f30184e);
        } else if (m38533b(this.f30195p)) {
            float f = this.f30194o;
            if (this.f30197r > 0.0f) {
                canvas.drawRoundRect(this.f30181b, f, f, this.f30184e);
                canvas.drawRoundRect(this.f30187h, f, f, this.f30188i);
                m38537f(canvas);
                m38538g(canvas);
                return;
            }
            canvas.drawRoundRect(this.f30181b, f, f, this.f30184e);
            m38537f(canvas);
        } else {
            canvas.drawRect(this.f30181b, this.f30184e);
            if (this.f30197r > 0.0f) {
                canvas.drawRect(this.f30187h, this.f30188i);
            }
        }
    }

    public int getAlpha() {
        return this.f30184e.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f30184e.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f30186g;
    }

    public int getIntrinsicWidth() {
        return this.f30185f;
    }

    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public C6741b mo26238h(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f30198s = colorStateList;
        this.f30188i.setColor(colorStateList.getColorForState(getState(), -16777216));
        return this;
    }

    /* renamed from: i */
    public C6741b mo26239i(float f) {
        this.f30197r = f;
        this.f30188i.setStrokeWidth(f);
        return this;
    }

    public boolean isStateful() {
        return this.f30198s.isStateful();
    }

    /* renamed from: j */
    public C6741b mo26241j(float f, float f2, float f3, float f4) {
        HashSet hashSet = new HashSet(4);
        hashSet.add(Float.valueOf(f));
        hashSet.add(Float.valueOf(f2));
        hashSet.add(Float.valueOf(f3));
        hashSet.add(Float.valueOf(f4));
        hashSet.remove(Float.valueOf(0.0f));
        boolean z = true;
        if (hashSet.size() <= 1) {
            if (!hashSet.isEmpty()) {
                float floatValue = ((Float) hashSet.iterator().next()).floatValue();
                if (Float.isInfinite(floatValue) || Float.isNaN(floatValue) || floatValue < 0.0f) {
                    throw new IllegalArgumentException("Invalid radius value: " + floatValue);
                }
                this.f30194o = floatValue;
            } else {
                this.f30194o = 0.0f;
            }
            boolean[] zArr = this.f30195p;
            zArr[0] = f > 0.0f;
            zArr[1] = f2 > 0.0f;
            zArr[2] = f3 > 0.0f;
            if (f4 <= 0.0f) {
                z = false;
            }
            zArr[3] = z;
            return this;
        }
        throw new IllegalArgumentException("Multiple nonzero corner radii not yet supported.");
    }

    /* renamed from: k */
    public C6741b mo26242k(boolean z) {
        this.f30196q = z;
        return this;
    }

    /* renamed from: l */
    public C6741b mo26243l(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            scaleType = ImageView.ScaleType.FIT_CENTER;
        }
        if (this.f30199t != scaleType) {
            this.f30199t = scaleType;
            m38539o();
        }
        return this;
    }

    /* renamed from: m */
    public C6741b mo26244m(Shader.TileMode tileMode) {
        if (this.f30191l != tileMode) {
            this.f30191l = tileMode;
            this.f30193n = true;
            invalidateSelf();
        }
        return this;
    }

    /* renamed from: n */
    public C6741b mo26245n(Shader.TileMode tileMode) {
        if (this.f30192m != tileMode) {
            this.f30192m = tileMode;
            this.f30193n = true;
            invalidateSelf();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f30180a.set(rect);
        m38539o();
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        int colorForState = this.f30198s.getColorForState(iArr, 0);
        if (this.f30188i.getColor() == colorForState) {
            return super.onStateChange(iArr);
        }
        this.f30188i.setColor(colorForState);
        return true;
    }

    public void setAlpha(int i) {
        this.f30184e.setAlpha(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f30184e.setColorFilter(colorFilter);
        invalidateSelf();
    }

    public void setDither(boolean z) {
        this.f30184e.setDither(z);
        invalidateSelf();
    }

    public void setFilterBitmap(boolean z) {
        this.f30184e.setFilterBitmap(z);
        invalidateSelf();
    }
}
