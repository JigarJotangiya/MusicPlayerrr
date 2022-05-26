package skin.support.widget;

import android.content.res.TypedArray;
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
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import p443m.p444a.p446d.C9323b;
import p443m.p444a.p447e.p448a.C9332d;
import p443m.p444a.p447e.p448a.C9335g;
import p443m.p444a.p452i.C9345a;

/* renamed from: skin.support.widget.e */
/* compiled from: SkinCompatProgressBarHelper */
public class C9714e extends C9712c {

    /* renamed from: a */
    private final ProgressBar f36807a;

    /* renamed from: b */
    private Bitmap f36808b;

    /* renamed from: c */
    private int f36809c = 0;

    /* renamed from: d */
    private int f36810d = 0;

    /* renamed from: e */
    private int f36811e = 0;

    C9714e(ProgressBar progressBar) {
        this.f36807a = progressBar;
    }

    /* renamed from: c */
    private int m50291c(int i) {
        return C9712c.m50287a(i);
    }

    /* renamed from: d */
    private Shape m50292d() {
        return new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, (RectF) null, (float[]) null);
    }

    /* renamed from: f */
    private Drawable m50293f(Drawable drawable, boolean z) {
        if (C9345a.m49488e(drawable)) {
            Drawable b = C9345a.m49485b(drawable);
            if (b != null) {
                C9345a.m49491h(drawable, m50293f(b, z));
            }
        } else if (C9345a.m49487d(drawable)) {
            Drawable a = C9345a.m49484a(drawable);
            if (a != null) {
                C9345a.m49490g(drawable, m50293f(a, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                drawableArr[i] = m50293f(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (this.f36808b == null) {
                this.f36808b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(m50292d());
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        return drawable;
    }

    /* renamed from: g */
    private Drawable m50294g(Drawable drawable) {
        if (!(drawable instanceof AnimationDrawable)) {
            return drawable;
        }
        AnimationDrawable animationDrawable = (AnimationDrawable) drawable;
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        AnimationDrawable animationDrawable2 = new AnimationDrawable();
        animationDrawable2.setOneShot(animationDrawable.isOneShot());
        for (int i = 0; i < numberOfFrames; i++) {
            Drawable f = m50293f(animationDrawable.getFrame(i), true);
            f.setLevel(10000);
            animationDrawable2.addFrame(f, animationDrawable.getDuration(i));
        }
        animationDrawable2.setLevel(10000);
        return animationDrawable2;
    }

    /* renamed from: b */
    public void mo33878b() {
        int a = C9712c.m50287a(this.f36809c);
        this.f36809c = a;
        if (a != 0) {
            Drawable a2 = C9335g.m49448a(this.f36807a.getContext(), this.f36809c);
            a2.setBounds(this.f36807a.getIndeterminateDrawable().getBounds());
            this.f36807a.setIndeterminateDrawable(m50294g(a2));
        }
        int c = m50291c(this.f36810d);
        this.f36810d = c;
        if (c != 0) {
            this.f36807a.setProgressDrawable(m50293f(C9335g.m49448a(this.f36807a.getContext(), this.f36810d), false));
        }
        if (Build.VERSION.SDK_INT > 21) {
            int a3 = C9712c.m50287a(this.f36811e);
            this.f36811e = a3;
            if (a3 != 0) {
                ProgressBar progressBar = this.f36807a;
                progressBar.setIndeterminateTintList(C9332d.m49406c(progressBar.getContext(), this.f36811e));
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo33879e(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = this.f36807a.getContext().obtainStyledAttributes(attributeSet, C9323b.SkinCompatProgressBar, i, 0);
        this.f36809c = obtainStyledAttributes.getResourceId(C9323b.SkinCompatProgressBar_android_indeterminateDrawable, 0);
        this.f36810d = obtainStyledAttributes.getResourceId(C9323b.SkinCompatProgressBar_android_progressDrawable, 0);
        obtainStyledAttributes.recycle();
        if (Build.VERSION.SDK_INT > 21) {
            TypedArray obtainStyledAttributes2 = this.f36807a.getContext().obtainStyledAttributes(attributeSet, new int[]{16843881}, i, 0);
            this.f36811e = obtainStyledAttributes2.getResourceId(0, 0);
            obtainStyledAttributes2.recycle();
        }
        mo33878b();
    }
}
