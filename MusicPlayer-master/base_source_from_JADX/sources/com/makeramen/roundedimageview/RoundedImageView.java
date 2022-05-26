package com.makeramen.roundedimageview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;

public class RoundedImageView extends ImageView {

    /* renamed from: v */
    public static final Shader.TileMode f30162v = Shader.TileMode.CLAMP;

    /* renamed from: w */
    private static final ImageView.ScaleType[] f30163w = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: g */
    private final float[] f30164g;

    /* renamed from: h */
    private Drawable f30165h;

    /* renamed from: i */
    private ColorStateList f30166i;

    /* renamed from: j */
    private float f30167j;

    /* renamed from: k */
    private ColorFilter f30168k;

    /* renamed from: l */
    private boolean f30169l;

    /* renamed from: m */
    private Drawable f30170m;

    /* renamed from: n */
    private boolean f30171n;

    /* renamed from: o */
    private boolean f30172o;

    /* renamed from: p */
    private boolean f30173p;

    /* renamed from: q */
    private int f30174q;

    /* renamed from: r */
    private int f30175r;

    /* renamed from: s */
    private ImageView.ScaleType f30176s;

    /* renamed from: t */
    private Shader.TileMode f30177t;

    /* renamed from: u */
    private Shader.TileMode f30178u;

    /* renamed from: com.makeramen.roundedimageview.RoundedImageView$a */
    static /* synthetic */ class C6739a {

        /* renamed from: a */
        static final /* synthetic */ int[] f30179a;

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
                f30179a = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30179a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30179a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30179a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f30179a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f30179a     // Catch:{ NoSuchFieldError -> 0x0049 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                int[] r0 = f30179a     // Catch:{ NoSuchFieldError -> 0x0054 }
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r2 = 7
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.makeramen.roundedimageview.RoundedImageView.C6739a.<clinit>():void");
        }
    }

    static {
        Class<RoundedImageView> cls = RoundedImageView.class;
    }

    public RoundedImageView(Context context) {
        super(context);
        this.f30164g = new float[]{0.0f, 0.0f, 0.0f, 0.0f};
        this.f30166i = ColorStateList.valueOf(-16777216);
        this.f30167j = 0.0f;
        this.f30168k = null;
        this.f30169l = false;
        this.f30171n = false;
        this.f30172o = false;
        this.f30173p = false;
        Shader.TileMode tileMode = f30162v;
        this.f30177t = tileMode;
        this.f30178u = tileMode;
    }

    /* renamed from: a */
    private void m38524a() {
        Drawable drawable = this.f30170m;
        if (drawable != null && this.f30169l) {
            Drawable mutate = drawable.mutate();
            this.f30170m = mutate;
            if (this.f30171n) {
                mutate.setColorFilter(this.f30168k);
            }
        }
    }

    /* renamed from: b */
    private static Shader.TileMode m38525b(int i) {
        if (i == 0) {
            return Shader.TileMode.CLAMP;
        }
        if (i == 1) {
            return Shader.TileMode.REPEAT;
        }
        if (i != 2) {
            return null;
        }
        return Shader.TileMode.MIRROR;
    }

    /* renamed from: c */
    private Drawable m38526c() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f30175r;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f30175r, e);
                this.f30175r = 0;
            }
        }
        return C6741b.m38536e(drawable);
    }

    /* renamed from: d */
    private Drawable m38527d() {
        Resources resources = getResources();
        Drawable drawable = null;
        if (resources == null) {
            return null;
        }
        int i = this.f30174q;
        if (i != 0) {
            try {
                drawable = resources.getDrawable(i);
            } catch (Exception e) {
                Log.w("RoundedImageView", "Unable to find resource: " + this.f30174q, e);
                this.f30174q = 0;
            }
        }
        return C6741b.m38536e(drawable);
    }

    /* renamed from: f */
    private void m38528f(Drawable drawable, ImageView.ScaleType scaleType) {
        if (drawable != null) {
            if (drawable instanceof C6741b) {
                C6741b bVar = (C6741b) drawable;
                bVar.mo26243l(scaleType);
                bVar.mo26239i(this.f30167j);
                bVar.mo26238h(this.f30166i);
                bVar.mo26242k(this.f30172o);
                bVar.mo26244m(this.f30177t);
                bVar.mo26245n(this.f30178u);
                float[] fArr = this.f30164g;
                if (fArr != null) {
                    bVar.mo26241j(fArr[0], fArr[1], fArr[2], fArr[3]);
                }
                m38524a();
            } else if (drawable instanceof LayerDrawable) {
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                int numberOfLayers = layerDrawable.getNumberOfLayers();
                for (int i = 0; i < numberOfLayers; i++) {
                    m38528f(layerDrawable.getDrawable(i), scaleType);
                }
            }
        }
    }

    /* renamed from: g */
    private void m38529g(boolean z) {
        if (this.f30173p) {
            if (z) {
                this.f30165h = C6741b.m38536e(this.f30165h);
            }
            m38528f(this.f30165h, ImageView.ScaleType.FIT_XY);
        }
    }

    /* renamed from: h */
    private void m38530h() {
        m38528f(this.f30170m, this.f30176s);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        invalidate();
    }

    /* renamed from: e */
    public void mo26204e(float f, float f2, float f3, float f4) {
        float[] fArr = this.f30164g;
        if (fArr[0] != f || fArr[1] != f2 || fArr[2] != f4 || fArr[3] != f3) {
            fArr[0] = f;
            fArr[1] = f2;
            fArr[3] = f3;
            fArr[2] = f4;
            m38530h();
            m38529g(false);
            invalidate();
        }
    }

    public int getBorderColor() {
        return this.f30166i.getDefaultColor();
    }

    public ColorStateList getBorderColors() {
        return this.f30166i;
    }

    public float getBorderWidth() {
        return this.f30167j;
    }

    public float getCornerRadius() {
        return getMaxCornerRadius();
    }

    public float getMaxCornerRadius() {
        float f = 0.0f;
        for (float max : this.f30164g) {
            f = Math.max(max, f);
        }
        return f;
    }

    public ImageView.ScaleType getScaleType() {
        return this.f30176s;
    }

    public Shader.TileMode getTileModeX() {
        return this.f30177t;
    }

    public Shader.TileMode getTileModeY() {
        return this.f30178u;
    }

    public void setBackground(Drawable drawable) {
        setBackgroundDrawable(drawable);
    }

    public void setBackgroundColor(int i) {
        ColorDrawable colorDrawable = new ColorDrawable(i);
        this.f30165h = colorDrawable;
        setBackgroundDrawable(colorDrawable);
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        this.f30165h = drawable;
        m38529g(true);
        super.setBackgroundDrawable(this.f30165h);
    }

    public void setBackgroundResource(int i) {
        if (this.f30175r != i) {
            this.f30175r = i;
            Drawable c = m38526c();
            this.f30165h = c;
            setBackgroundDrawable(c);
        }
    }

    public void setBorderColor(int i) {
        setBorderColor(ColorStateList.valueOf(i));
    }

    public void setBorderWidth(int i) {
        setBorderWidth(getResources().getDimension(i));
    }

    public void setColorFilter(ColorFilter colorFilter) {
        if (this.f30168k != colorFilter) {
            this.f30168k = colorFilter;
            this.f30171n = true;
            this.f30169l = true;
            m38524a();
            invalidate();
        }
    }

    public void setCornerRadius(float f) {
        mo26204e(f, f, f, f);
    }

    public void setCornerRadiusDimen(int i) {
        float dimension = getResources().getDimension(i);
        mo26204e(dimension, dimension, dimension, dimension);
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.f30174q = 0;
        this.f30170m = C6741b.m38535d(bitmap);
        m38530h();
        super.setImageDrawable(this.f30170m);
    }

    public void setImageDrawable(Drawable drawable) {
        this.f30174q = 0;
        this.f30170m = C6741b.m38536e(drawable);
        m38530h();
        super.setImageDrawable(this.f30170m);
    }

    public void setImageResource(int i) {
        if (this.f30174q != i) {
            this.f30174q = i;
            this.f30170m = m38527d();
            m38530h();
            super.setImageDrawable(this.f30170m);
        }
    }

    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setImageDrawable(getDrawable());
    }

    public void setOval(boolean z) {
        this.f30172o = z;
        m38530h();
        m38529g(false);
        invalidate();
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        if (this.f30176s != scaleType) {
            this.f30176s = scaleType;
            switch (C6739a.f30179a[scaleType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                    super.setScaleType(ImageView.ScaleType.FIT_XY);
                    break;
                default:
                    super.setScaleType(scaleType);
                    break;
            }
            m38530h();
            m38529g(false);
            invalidate();
        }
    }

    public void setTileModeX(Shader.TileMode tileMode) {
        if (this.f30177t != tileMode) {
            this.f30177t = tileMode;
            m38530h();
            m38529g(false);
            invalidate();
        }
    }

    public void setTileModeY(Shader.TileMode tileMode) {
        if (this.f30178u != tileMode) {
            this.f30178u = tileMode;
            m38530h();
            m38529g(false);
            invalidate();
        }
    }

    public void setBorderColor(ColorStateList colorStateList) {
        if (!this.f30166i.equals(colorStateList)) {
            if (colorStateList == null) {
                colorStateList = ColorStateList.valueOf(-16777216);
            }
            this.f30166i = colorStateList;
            m38530h();
            m38529g(false);
            if (this.f30167j > 0.0f) {
                invalidate();
            }
        }
    }

    public void setBorderWidth(float f) {
        if (this.f30167j != f) {
            this.f30167j = f;
            m38530h();
            m38529g(false);
            invalidate();
        }
    }

    public RoundedImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RoundedImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float[] fArr = {0.0f, 0.0f, 0.0f, 0.0f};
        this.f30164g = fArr;
        this.f30166i = ColorStateList.valueOf(-16777216);
        this.f30167j = 0.0f;
        this.f30168k = null;
        this.f30169l = false;
        this.f30171n = false;
        this.f30172o = false;
        this.f30173p = false;
        Shader.TileMode tileMode = f30162v;
        this.f30177t = tileMode;
        this.f30178u = tileMode;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6740a.RoundedImageView, i, 0);
        int i2 = obtainStyledAttributes.getInt(C6740a.RoundedImageView_android_scaleType, -1);
        if (i2 >= 0) {
            setScaleType(f30163w[i2]);
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
        float dimensionPixelSize = (float) obtainStyledAttributes.getDimensionPixelSize(C6740a.RoundedImageView_riv_corner_radius, -1);
        fArr[0] = (float) obtainStyledAttributes.getDimensionPixelSize(C6740a.RoundedImageView_riv_corner_radius_top_left, -1);
        fArr[1] = (float) obtainStyledAttributes.getDimensionPixelSize(C6740a.RoundedImageView_riv_corner_radius_top_right, -1);
        fArr[2] = (float) obtainStyledAttributes.getDimensionPixelSize(C6740a.RoundedImageView_riv_corner_radius_bottom_right, -1);
        fArr[3] = (float) obtainStyledAttributes.getDimensionPixelSize(C6740a.RoundedImageView_riv_corner_radius_bottom_left, -1);
        int length = fArr.length;
        boolean z = false;
        for (int i3 = 0; i3 < length; i3++) {
            float[] fArr2 = this.f30164g;
            if (fArr2[i3] < 0.0f) {
                fArr2[i3] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            dimensionPixelSize = dimensionPixelSize < 0.0f ? 0.0f : dimensionPixelSize;
            int length2 = this.f30164g.length;
            for (int i4 = 0; i4 < length2; i4++) {
                this.f30164g[i4] = dimensionPixelSize;
            }
        }
        float dimensionPixelSize2 = (float) obtainStyledAttributes.getDimensionPixelSize(C6740a.RoundedImageView_riv_border_width, -1);
        this.f30167j = dimensionPixelSize2;
        if (dimensionPixelSize2 < 0.0f) {
            this.f30167j = 0.0f;
        }
        ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(C6740a.RoundedImageView_riv_border_color);
        this.f30166i = colorStateList;
        if (colorStateList == null) {
            this.f30166i = ColorStateList.valueOf(-16777216);
        }
        this.f30173p = obtainStyledAttributes.getBoolean(C6740a.RoundedImageView_riv_mutate_background, false);
        this.f30172o = obtainStyledAttributes.getBoolean(C6740a.RoundedImageView_riv_oval, false);
        int i5 = obtainStyledAttributes.getInt(C6740a.RoundedImageView_riv_tile_mode, -2);
        if (i5 != -2) {
            setTileModeX(m38525b(i5));
            setTileModeY(m38525b(i5));
        }
        int i6 = obtainStyledAttributes.getInt(C6740a.RoundedImageView_riv_tile_mode_x, -2);
        if (i6 != -2) {
            setTileModeX(m38525b(i6));
        }
        int i7 = obtainStyledAttributes.getInt(C6740a.RoundedImageView_riv_tile_mode_y, -2);
        if (i7 != -2) {
            setTileModeY(m38525b(i7));
        }
        m38530h();
        m38529g(true);
        if (this.f30173p) {
            super.setBackgroundDrawable(this.f30165h);
        }
        obtainStyledAttributes.recycle();
    }
}
