package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.view.animation.Animation;
import android.widget.ImageView;
import p082e.p109h.p119p.C3774v;
import p082e.p152v.C4232a;

/* renamed from: androidx.swiperefreshlayout.widget.a */
/* compiled from: CircleImageView */
class C1052a extends ImageView {

    /* renamed from: g */
    private Animation.AnimationListener f4441g;

    /* renamed from: h */
    private int f4442h;

    /* renamed from: i */
    private int f4443i;

    /* renamed from: androidx.swiperefreshlayout.widget.a$a */
    /* compiled from: CircleImageView */
    private static class C1053a extends OvalShape {

        /* renamed from: g */
        private Paint f4444g = new Paint();

        /* renamed from: h */
        private int f4445h;

        /* renamed from: i */
        private C1052a f4446i;

        C1053a(C1052a aVar, int i) {
            this.f4446i = aVar;
            this.f4445h = i;
            m6063a((int) rect().width());
        }

        /* renamed from: a */
        private void m6063a(int i) {
            float f = (float) (i / 2);
            this.f4444g.setShader(new RadialGradient(f, f, (float) this.f4445h, new int[]{1023410176, 0}, (float[]) null, Shader.TileMode.CLAMP));
        }

        public void draw(Canvas canvas, Paint paint) {
            int width = this.f4446i.getWidth() / 2;
            float f = (float) width;
            float height = (float) (this.f4446i.getHeight() / 2);
            canvas.drawCircle(f, height, f, this.f4444g);
            canvas.drawCircle(f, height, (float) (width - this.f4445h), paint);
        }

        /* access modifiers changed from: protected */
        public void onResize(float f, float f2) {
            super.onResize(f, f2);
            m6063a((int) f);
        }
    }

    C1052a(Context context) {
        super(context);
        ShapeDrawable shapeDrawable;
        float f = getContext().getResources().getDisplayMetrics().density;
        int i = (int) (1.75f * f);
        int i2 = (int) (0.0f * f);
        this.f4442h = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(C4232a.SwipeRefreshLayout);
        this.f4443i = obtainStyledAttributes.getColor(C4232a.f12622xaa980688, -328966);
        obtainStyledAttributes.recycle();
        if (m6061a()) {
            shapeDrawable = new ShapeDrawable(new OvalShape());
            C3774v.m16231v0(this, f * 4.0f);
        } else {
            ShapeDrawable shapeDrawable2 = new ShapeDrawable(new C1053a(this, this.f4442h));
            setLayerType(1, shapeDrawable2.getPaint());
            shapeDrawable2.getPaint().setShadowLayer((float) this.f4442h, (float) i2, (float) i, 503316480);
            int i3 = this.f4442h;
            setPadding(i3, i3, i3, i3);
            shapeDrawable = shapeDrawable2;
        }
        shapeDrawable.getPaint().setColor(this.f4443i);
        C3774v.m16223r0(this, shapeDrawable);
    }

    /* renamed from: a */
    private boolean m6061a() {
        return Build.VERSION.SDK_INT >= 21;
    }

    /* renamed from: b */
    public void mo5828b(Animation.AnimationListener animationListener) {
        this.f4441g = animationListener;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.f4441g;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.f4441g;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (!m6061a()) {
            setMeasuredDimension(getMeasuredWidth() + (this.f4442h * 2), getMeasuredHeight() + (this.f4442h * 2));
        }
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.f4443i = i;
        }
    }
}
