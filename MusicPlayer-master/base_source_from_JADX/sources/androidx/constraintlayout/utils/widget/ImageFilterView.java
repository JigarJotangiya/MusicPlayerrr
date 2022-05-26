package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.C0439f;
import p082e.p083a.p084k.p085a.C3410a;

public class ImageFilterView extends AppCompatImageView {

    /* renamed from: g */
    private C0416c f2052g = new C0416c();

    /* renamed from: h */
    private boolean f2053h = true;

    /* renamed from: i */
    private Drawable f2054i = null;

    /* renamed from: j */
    private Drawable f2055j = null;

    /* renamed from: k */
    private float f2056k = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f2057l = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public float f2058m = Float.NaN;

    /* renamed from: n */
    private Path f2059n;

    /* renamed from: o */
    ViewOutlineProvider f2060o;

    /* renamed from: p */
    RectF f2061p;

    /* renamed from: q */
    Drawable[] f2062q = new Drawable[2];

    /* renamed from: r */
    LayerDrawable f2063r;

    /* renamed from: s */
    float f2064s = Float.NaN;

    /* renamed from: t */
    float f2065t = Float.NaN;

    /* renamed from: u */
    float f2066u = Float.NaN;

    /* renamed from: v */
    float f2067v = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$a */
    class C0414a extends ViewOutlineProvider {
        C0414a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterView.this.getWidth();
            int height = ImageFilterView.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterView.this.f2057l) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$b */
    class C0415b extends ViewOutlineProvider {
        C0415b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.f2058m);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterView$c */
    static class C0416c {

        /* renamed from: a */
        float[] f2070a = new float[20];

        /* renamed from: b */
        ColorMatrix f2071b = new ColorMatrix();

        /* renamed from: c */
        ColorMatrix f2072c = new ColorMatrix();

        /* renamed from: d */
        float f2073d = 1.0f;

        /* renamed from: e */
        float f2074e = 1.0f;

        /* renamed from: f */
        float f2075f = 1.0f;

        /* renamed from: g */
        float f2076g = 1.0f;

        C0416c() {
        }

        /* renamed from: a */
        private void m2647a(float f) {
            float[] fArr = this.f2070a;
            fArr[0] = f;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = f;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: b */
        private void m2648b(float f) {
            float f2 = 1.0f - f;
            float f3 = 0.2999f * f2;
            float f4 = 0.587f * f2;
            float f5 = f2 * 0.114f;
            float[] fArr = this.f2070a;
            fArr[0] = f3 + f;
            fArr[1] = f4;
            fArr[2] = f5;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f3;
            fArr[6] = f4 + f;
            fArr[7] = f5;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f3;
            fArr[11] = f4;
            fArr[12] = f5 + f;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* renamed from: d */
        private void m2649d(float f) {
            float f2;
            float f3;
            if (f <= 0.0f) {
                f = 0.01f;
            }
            float f4 = (5000.0f / f) / 100.0f;
            if (f4 > 66.0f) {
                double d = (double) (f4 - 60.0f);
                f3 = ((float) Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                f2 = ((float) Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                f2 = (((float) Math.log((double) f4)) * 99.4708f) - 161.11957f;
                f3 = 255.0f;
            }
            float log = f4 < 66.0f ? f4 > 19.0f ? (((float) Math.log((double) (f4 - 10.0f))) * 138.51773f) - 305.0448f : 0.0f : 255.0f;
            float min = Math.min(255.0f, Math.max(f3, 0.0f));
            float min2 = Math.min(255.0f, Math.max(f2, 0.0f));
            float min3 = Math.min(255.0f, Math.max(log, 0.0f));
            float min4 = Math.min(255.0f, Math.max(255.0f, 0.0f));
            float min5 = Math.min(255.0f, Math.max((((float) Math.log((double) 50.0f)) * 99.4708f) - 161.11957f, 0.0f));
            float min6 = min3 / Math.min(255.0f, Math.max((((float) Math.log((double) 40.0f)) * 138.51773f) - 305.0448f, 0.0f));
            float[] fArr = this.f2070a;
            fArr[0] = min / min4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = min2 / min5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = min6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo2789c(ImageView imageView) {
            boolean z;
            this.f2071b.reset();
            float f = this.f2074e;
            boolean z2 = true;
            if (f != 1.0f) {
                m2648b(f);
                this.f2071b.set(this.f2070a);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.f2075f;
            if (f2 != 1.0f) {
                this.f2072c.setScale(f2, f2, f2, 1.0f);
                this.f2071b.postConcat(this.f2072c);
                z = true;
            }
            float f3 = this.f2076g;
            if (f3 != 1.0f) {
                m2649d(f3);
                this.f2072c.set(this.f2070a);
                this.f2071b.postConcat(this.f2072c);
                z = true;
            }
            float f4 = this.f2073d;
            if (f4 != 1.0f) {
                m2647a(f4);
                this.f2072c.set(this.f2070a);
                this.f2071b.postConcat(this.f2072c);
            } else {
                z2 = z;
            }
            if (z2) {
                imageView.setColorFilter(new ColorMatrixColorFilter(this.f2071b));
            } else {
                imageView.clearColorFilter();
            }
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    private void init(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2054i = obtainStyledAttributes.getDrawable(C0439f.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ImageFilterView_crossfade) {
                    this.f2056k = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0439f.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_brightness) {
                    setBrightness(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_round) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == C0439f.ImageFilterView_roundPercent) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                } else if (index == C0439f.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2053h));
                } else if (index == C0439f.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2064s));
                } else if (index == C0439f.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2065t));
                } else if (index == C0439f.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2067v));
                } else if (index == C0439f.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2066u));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2055j = drawable;
            if (this.f2054i == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2055j = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2062q;
                    Drawable mutate = drawable2.mutate();
                    this.f2055j = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2062q;
            Drawable mutate2 = getDrawable().mutate();
            this.f2055j = mutate2;
            drawableArr2[0] = mutate2;
            this.f2062q[1] = this.f2054i.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2062q);
            this.f2063r = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2056k * 255.0f));
            if (!this.f2053h) {
                this.f2063r.getDrawable(0).setAlpha((int) ((1.0f - this.f2056k) * 255.0f));
            }
            super.setImageDrawable(this.f2063r);
        }
    }

    /* renamed from: o */
    private void m2645o() {
        if (!Float.isNaN(this.f2064s) || !Float.isNaN(this.f2065t) || !Float.isNaN(this.f2066u) || !Float.isNaN(this.f2067v)) {
            float f = 0.0f;
            float f2 = Float.isNaN(this.f2064s) ? 0.0f : this.f2064s;
            float f3 = Float.isNaN(this.f2065t) ? 0.0f : this.f2065t;
            float f4 = Float.isNaN(this.f2066u) ? 1.0f : this.f2066u;
            if (!Float.isNaN(this.f2067v)) {
                f = this.f2067v;
            }
            Matrix matrix = new Matrix();
            matrix.reset();
            float intrinsicWidth = (float) getDrawable().getIntrinsicWidth();
            float intrinsicHeight = (float) getDrawable().getIntrinsicHeight();
            float width = (float) getWidth();
            float height = (float) getHeight();
            float f5 = f4 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
            matrix.postScale(f5, f5);
            float f6 = intrinsicWidth * f5;
            float f7 = f5 * intrinsicHeight;
            matrix.postTranslate((((f2 * (width - f6)) + width) - f6) * 0.5f, (((f3 * (height - f7)) + height) - f7) * 0.5f);
            matrix.postRotate(f, width / 2.0f, height / 2.0f);
            setImageMatrix(matrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    /* renamed from: p */
    private void m2646p() {
        if (!Float.isNaN(this.f2064s) || !Float.isNaN(this.f2065t) || !Float.isNaN(this.f2066u) || !Float.isNaN(this.f2067v)) {
            m2645o();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private void setOverlay(boolean z) {
        this.f2053h = z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2057l == 0.0f || this.f2059n == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2059n);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getBrightness() {
        return this.f2052g.f2073d;
    }

    public float getContrast() {
        return this.f2052g.f2075f;
    }

    public float getCrossfade() {
        return this.f2056k;
    }

    public float getImagePanX() {
        return this.f2064s;
    }

    public float getImagePanY() {
        return this.f2065t;
    }

    public float getImageRotate() {
        return this.f2067v;
    }

    public float getImageZoom() {
        return this.f2066u;
    }

    public float getRound() {
        return this.f2058m;
    }

    public float getRoundPercent() {
        return this.f2057l;
    }

    public float getSaturation() {
        return this.f2052g.f2074e;
    }

    public float getWarmth() {
        return this.f2052g.f2076g;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m2645o();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C3410a.m14543d(getContext(), i).mutate();
        this.f2054i = mutate;
        Drawable[] drawableArr = this.f2062q;
        drawableArr[0] = this.f2055j;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2062q);
        this.f2063r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2056k);
    }

    public void setBrightness(float f) {
        C0416c cVar = this.f2052g;
        cVar.f2073d = f;
        cVar.mo2789c(this);
    }

    public void setContrast(float f) {
        C0416c cVar = this.f2052g;
        cVar.f2075f = f;
        cVar.mo2789c(this);
    }

    public void setCrossfade(float f) {
        this.f2056k = f;
        if (this.f2062q != null) {
            if (!this.f2053h) {
                this.f2063r.getDrawable(0).setAlpha((int) ((1.0f - this.f2056k) * 255.0f));
            }
            this.f2063r.getDrawable(1).setAlpha((int) (this.f2056k * 255.0f));
            super.setImageDrawable(this.f2063r);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2054i == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2055j = mutate;
        Drawable[] drawableArr = this.f2062q;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2054i;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2062q);
        this.f2063r = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2056k);
    }

    public void setImagePanX(float f) {
        this.f2064s = f;
        m2646p();
    }

    public void setImagePanY(float f) {
        this.f2065t = f;
        m2646p();
    }

    public void setImageResource(int i) {
        if (this.f2054i != null) {
            Drawable mutate = C3410a.m14543d(getContext(), i).mutate();
            this.f2055j = mutate;
            Drawable[] drawableArr = this.f2062q;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2054i;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2062q);
            this.f2063r = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2056k);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2067v = f;
        m2646p();
    }

    public void setImageZoom(float f) {
        this.f2066u = f;
        m2646p();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2058m = f;
            float f2 = this.f2057l;
            this.f2057l = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2058m != f;
        this.f2058m = f;
        if (f != 0.0f) {
            if (this.f2059n == null) {
                this.f2059n = new Path();
            }
            if (this.f2061p == null) {
                this.f2061p = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2060o == null) {
                    C0415b bVar = new C0415b();
                    this.f2060o = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.f2061p.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2059n.reset();
            Path path = this.f2059n;
            RectF rectF = this.f2061p;
            float f3 = this.f2058m;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f2057l != f;
        this.f2057l = f;
        if (f != 0.0f) {
            if (this.f2059n == null) {
                this.f2059n = new Path();
            }
            if (this.f2061p == null) {
                this.f2061p = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2060o == null) {
                    C0414a aVar = new C0414a();
                    this.f2060o = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2057l) / 2.0f;
            this.f2061p.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2059n.reset();
            this.f2059n.addRoundRect(this.f2061p, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        C0416c cVar = this.f2052g;
        cVar.f2074e = f;
        cVar.mo2789c(this);
    }

    public void setWarmth(float f) {
        C0416c cVar = this.f2052g;
        cVar.f2076g = f;
        cVar.mo2789c(this);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        init(context, attributeSet);
    }

    public ImageFilterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        init(context, attributeSet);
    }
}
