package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
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
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.C0439f;
import p082e.p083a.p084k.p085a.C3410a;

public class ImageFilterButton extends AppCompatImageButton {

    /* renamed from: i */
    private ImageFilterView.C0416c f2034i = new ImageFilterView.C0416c();

    /* renamed from: j */
    private float f2035j = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public float f2036k = 0.0f;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public float f2037l = Float.NaN;

    /* renamed from: m */
    private Path f2038m;

    /* renamed from: n */
    ViewOutlineProvider f2039n;

    /* renamed from: o */
    RectF f2040o;

    /* renamed from: p */
    Drawable[] f2041p = new Drawable[2];

    /* renamed from: q */
    LayerDrawable f2042q;

    /* renamed from: r */
    private boolean f2043r = true;

    /* renamed from: s */
    private Drawable f2044s = null;

    /* renamed from: t */
    private Drawable f2045t = null;

    /* renamed from: u */
    private float f2046u = Float.NaN;

    /* renamed from: v */
    private float f2047v = Float.NaN;

    /* renamed from: w */
    private float f2048w = Float.NaN;

    /* renamed from: x */
    private float f2049x = Float.NaN;

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$a */
    class C0412a extends ViewOutlineProvider {
        C0412a() {
        }

        public void getOutline(View view, Outline outline) {
            int width = ImageFilterButton.this.getWidth();
            int height = ImageFilterButton.this.getHeight();
            outline.setRoundRect(0, 0, width, height, (((float) Math.min(width, height)) * ImageFilterButton.this.f2036k) / 2.0f);
        }
    }

    /* renamed from: androidx.constraintlayout.utils.widget.ImageFilterButton$b */
    class C0413b extends ViewOutlineProvider {
        C0413b() {
        }

        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, ImageFilterButton.this.getWidth(), ImageFilterButton.this.getHeight(), ImageFilterButton.this.f2037l);
        }
    }

    public ImageFilterButton(Context context) {
        super(context);
        m2640c(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m2640c(Context context, AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C0439f.ImageFilterView);
            int indexCount = obtainStyledAttributes.getIndexCount();
            this.f2044s = obtainStyledAttributes.getDrawable(C0439f.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.ImageFilterView_crossfade) {
                    this.f2035j = obtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == C0439f.ImageFilterView_warmth) {
                    setWarmth(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_saturation) {
                    setSaturation(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_contrast) {
                    setContrast(obtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == C0439f.ImageFilterView_round) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRound(obtainStyledAttributes.getDimension(index, 0.0f));
                    }
                } else if (index == C0439f.ImageFilterView_roundPercent) {
                    if (Build.VERSION.SDK_INT >= 21) {
                        setRoundPercent(obtainStyledAttributes.getFloat(index, 0.0f));
                    }
                } else if (index == C0439f.ImageFilterView_overlay) {
                    setOverlay(obtainStyledAttributes.getBoolean(index, this.f2043r));
                } else if (index == C0439f.ImageFilterView_imagePanX) {
                    setImagePanX(obtainStyledAttributes.getFloat(index, this.f2046u));
                } else if (index == C0439f.ImageFilterView_imagePanY) {
                    setImagePanY(obtainStyledAttributes.getFloat(index, this.f2047v));
                } else if (index == C0439f.ImageFilterView_imageRotate) {
                    setImageRotate(obtainStyledAttributes.getFloat(index, this.f2049x));
                } else if (index == C0439f.ImageFilterView_imageZoom) {
                    setImageZoom(obtainStyledAttributes.getFloat(index, this.f2048w));
                }
            }
            obtainStyledAttributes.recycle();
            Drawable drawable = getDrawable();
            this.f2045t = drawable;
            if (this.f2044s == null || drawable == null) {
                Drawable drawable2 = getDrawable();
                this.f2045t = drawable2;
                if (drawable2 != null) {
                    Drawable[] drawableArr = this.f2041p;
                    Drawable mutate = drawable2.mutate();
                    this.f2045t = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.f2041p;
            Drawable mutate2 = getDrawable().mutate();
            this.f2045t = mutate2;
            drawableArr2[0] = mutate2;
            this.f2041p[1] = this.f2044s.mutate();
            LayerDrawable layerDrawable = new LayerDrawable(this.f2041p);
            this.f2042q = layerDrawable;
            layerDrawable.getDrawable(1).setAlpha((int) (this.f2035j * 255.0f));
            if (!this.f2043r) {
                this.f2042q.getDrawable(0).setAlpha((int) ((1.0f - this.f2035j) * 255.0f));
            }
            super.setImageDrawable(this.f2042q);
        }
    }

    /* renamed from: d */
    private void m2641d() {
        if (!Float.isNaN(this.f2046u) || !Float.isNaN(this.f2047v) || !Float.isNaN(this.f2048w) || !Float.isNaN(this.f2049x)) {
            float f = 0.0f;
            float f2 = Float.isNaN(this.f2046u) ? 0.0f : this.f2046u;
            float f3 = Float.isNaN(this.f2047v) ? 0.0f : this.f2047v;
            float f4 = Float.isNaN(this.f2048w) ? 1.0f : this.f2048w;
            if (!Float.isNaN(this.f2049x)) {
                f = this.f2049x;
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

    /* renamed from: e */
    private void m2642e() {
        if (!Float.isNaN(this.f2046u) || !Float.isNaN(this.f2047v) || !Float.isNaN(this.f2048w) || !Float.isNaN(this.f2049x)) {
            m2641d();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private void setOverlay(boolean z) {
        this.f2043r = z;
    }

    public void draw(Canvas canvas) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 21 || this.f2037l == 0.0f || this.f2038m == null) {
            z = false;
        } else {
            z = true;
            canvas.save();
            canvas.clipPath(this.f2038m);
        }
        super.draw(canvas);
        if (z) {
            canvas.restore();
        }
    }

    public float getContrast() {
        return this.f2034i.f2075f;
    }

    public float getCrossfade() {
        return this.f2035j;
    }

    public float getImagePanX() {
        return this.f2046u;
    }

    public float getImagePanY() {
        return this.f2047v;
    }

    public float getImageRotate() {
        return this.f2049x;
    }

    public float getImageZoom() {
        return this.f2048w;
    }

    public float getRound() {
        return this.f2037l;
    }

    public float getRoundPercent() {
        return this.f2036k;
    }

    public float getSaturation() {
        return this.f2034i.f2074e;
    }

    public float getWarmth() {
        return this.f2034i.f2076g;
    }

    public void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        m2641d();
    }

    public void setAltImageResource(int i) {
        Drawable mutate = C3410a.m14543d(getContext(), i).mutate();
        this.f2044s = mutate;
        Drawable[] drawableArr = this.f2041p;
        drawableArr[0] = this.f2045t;
        drawableArr[1] = mutate;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2041p);
        this.f2042q = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2035j);
    }

    public void setBrightness(float f) {
        ImageFilterView.C0416c cVar = this.f2034i;
        cVar.f2073d = f;
        cVar.mo2789c(this);
    }

    public void setContrast(float f) {
        ImageFilterView.C0416c cVar = this.f2034i;
        cVar.f2075f = f;
        cVar.mo2789c(this);
    }

    public void setCrossfade(float f) {
        this.f2035j = f;
        if (this.f2041p != null) {
            if (!this.f2043r) {
                this.f2042q.getDrawable(0).setAlpha((int) ((1.0f - this.f2035j) * 255.0f));
            }
            this.f2042q.getDrawable(1).setAlpha((int) (this.f2035j * 255.0f));
            super.setImageDrawable(this.f2042q);
        }
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.f2044s == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        Drawable mutate = drawable.mutate();
        this.f2045t = mutate;
        Drawable[] drawableArr = this.f2041p;
        drawableArr[0] = mutate;
        drawableArr[1] = this.f2044s;
        LayerDrawable layerDrawable = new LayerDrawable(this.f2041p);
        this.f2042q = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.f2035j);
    }

    public void setImagePanX(float f) {
        this.f2046u = f;
        m2642e();
    }

    public void setImagePanY(float f) {
        this.f2047v = f;
        m2642e();
    }

    public void setImageResource(int i) {
        if (this.f2044s != null) {
            Drawable mutate = C3410a.m14543d(getContext(), i).mutate();
            this.f2045t = mutate;
            Drawable[] drawableArr = this.f2041p;
            drawableArr[0] = mutate;
            drawableArr[1] = this.f2044s;
            LayerDrawable layerDrawable = new LayerDrawable(this.f2041p);
            this.f2042q = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.f2035j);
            return;
        }
        super.setImageResource(i);
    }

    public void setImageRotate(float f) {
        this.f2049x = f;
        m2642e();
    }

    public void setImageZoom(float f) {
        this.f2048w = f;
        m2642e();
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.f2037l = f;
            float f2 = this.f2036k;
            this.f2036k = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.f2037l != f;
        this.f2037l = f;
        if (f != 0.0f) {
            if (this.f2038m == null) {
                this.f2038m = new Path();
            }
            if (this.f2040o == null) {
                this.f2040o = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2039n == null) {
                    C0413b bVar = new C0413b();
                    this.f2039n = bVar;
                    setOutlineProvider(bVar);
                }
                setClipToOutline(true);
            }
            this.f2040o.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.f2038m.reset();
            Path path = this.f2038m;
            RectF rectF = this.f2040o;
            float f3 = this.f2037l;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.f2036k != f;
        this.f2036k = f;
        if (f != 0.0f) {
            if (this.f2038m == null) {
                this.f2038m = new Path();
            }
            if (this.f2040o == null) {
                this.f2040o = new RectF();
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.f2039n == null) {
                    C0412a aVar = new C0412a();
                    this.f2039n = aVar;
                    setOutlineProvider(aVar);
                }
                setClipToOutline(true);
            }
            int width = getWidth();
            int height = getHeight();
            float min = (((float) Math.min(width, height)) * this.f2036k) / 2.0f;
            this.f2040o.set(0.0f, 0.0f, (float) width, (float) height);
            this.f2038m.reset();
            this.f2038m.addRoundRect(this.f2040o, min, min, Path.Direction.CW);
        } else if (Build.VERSION.SDK_INT >= 21) {
            setClipToOutline(false);
        }
        if (z && Build.VERSION.SDK_INT >= 21) {
            invalidateOutline();
        }
    }

    public void setSaturation(float f) {
        ImageFilterView.C0416c cVar = this.f2034i;
        cVar.f2074e = f;
        cVar.mo2789c(this);
    }

    public void setWarmth(float f) {
        ImageFilterView.C0416c cVar = this.f2034i;
        cVar.f2076g = f;
        cVar.mo2789c(this);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2640c(context, attributeSet);
    }

    public ImageFilterButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2640c(context, attributeSet);
    }
}
