package androidx.appcompat.widget;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import androidx.core.graphics.drawable.C0536c;

/* renamed from: androidx.appcompat.widget.i */
/* compiled from: AppCompatProgressBarHelper */
class C0284i {

    /* renamed from: c */
    private static final int[] f1322c = {16843067, 16843068};

    /* renamed from: a */
    private final ProgressBar f1323a;

    /* renamed from: b */
    private Bitmap f1324b;

    C0284i(ProgressBar progressBar) {
        this.f1323a = progressBar;
    }

    /* renamed from: a */
    private Shape m1695a() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: d */
    private Drawable m1696d(Drawable drawable, boolean z) {
        if (drawable instanceof C0536c) {
            C0536c cVar = (C0536c) drawable;
            Drawable b = cVar.mo3309b();
            if (b != null) {
                cVar.mo3308a(m1696d(b, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m1696d(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f1324b == null) {
                this.f1324b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m1695a());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: e */
    private Drawable m1697e(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable d = m1696d(animationDrawable.getFrame(i), true);
            d.setLevel(10000);
            animationDrawable2.addFrame(d, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public Bitmap mo2043b() {
        return this.f1324b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo2044c(AttributeSet attributeSet, int i) {
        C0279g0 v = C0279g0.m1627v(this.f1323a.getContext(), attributeSet, f1322c, i, 0);
        Drawable h = v.mo1983h(0);
        if (h != null) {
            this.f1323a.setIndeterminateDrawable(m1697e(h));
        }
        Drawable h2 = v.mo1983h(1);
        if (h2 != null) {
            this.f1323a.setProgressDrawable(m1696d(h2, false));
        }
        v.mo1995w();
    }
}
