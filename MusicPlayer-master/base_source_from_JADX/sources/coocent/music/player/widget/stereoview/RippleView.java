package coocent.music.player.widget.stereoview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.C7941a;

public class RippleView extends View {

    /* renamed from: g */
    private Paint f32238g;

    /* renamed from: h */
    private Paint f32239h;

    /* renamed from: i */
    private Paint f32240i;

    /* renamed from: j */
    private Drawable f32241j;

    /* renamed from: k */
    private Drawable f32242k;

    /* renamed from: l */
    private Bitmap f32243l;

    /* renamed from: m */
    private Bitmap f32244m;

    /* renamed from: n */
    private int f32245n;

    /* renamed from: o */
    private int f32246o;

    /* renamed from: p */
    private int f32247p;

    /* renamed from: q */
    private int f32248q;

    /* renamed from: r */
    private int f32249r;

    /* renamed from: s */
    private C7306c f32250s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public float f32251t;

    /* renamed from: u */
    private Region f32252u;

    /* renamed from: v */
    private Rect f32253v;

    /* renamed from: w */
    private boolean f32254w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C7305b f32255x;

    /* renamed from: coocent.music.player.widget.stereoview.RippleView$a */
    class C7304a implements Animation.AnimationListener {
        C7304a() {
        }

        public void onAnimationEnd(Animation animation) {
            if (RippleView.this.f32255x != null) {
                RippleView.this.f32255x.mo28017a(RippleView.this);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: coocent.music.player.widget.stereoview.RippleView$b */
    public interface C7305b {
        /* renamed from: a */
        void mo28017a(View view);
    }

    /* renamed from: coocent.music.player.widget.stereoview.RippleView$c */
    private class C7306c extends Animation {
        private C7306c() {
        }

        /* access modifiers changed from: protected */
        public void applyTransformation(float f, Transformation transformation) {
            super.applyTransformation(f, transformation);
            float unused = RippleView.this.f32251t = f;
            RippleView.this.invalidate();
        }

        /* synthetic */ C7306c(RippleView rippleView, C7304a aVar) {
            this();
        }
    }

    public RippleView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: c */
    private void m41414c() {
        this.f32249r = 0;
        this.f32248q = 0;
    }

    /* renamed from: d */
    private void m41415d() {
        Paint paint = new Paint();
        this.f32238g = paint;
        paint.setColor(getResources().getColor(R.color.bg_gray));
        Paint paint2 = new Paint();
        this.f32239h = paint2;
        paint2.setColor(getResources().getColor(R.color.bg_white));
        Paint paint3 = new Paint();
        this.f32240i = paint3;
        paint3.setAntiAlias(true);
        Drawable drawable = this.f32241j;
        if (drawable != null) {
            this.f32243l = ((BitmapDrawable) drawable).getBitmap();
        }
        Drawable drawable2 = this.f32242k;
        if (drawable2 != null) {
            this.f32244m = ((BitmapDrawable) drawable2).getBitmap();
        }
        this.f32252u = new Region();
        this.f32253v = new Rect();
    }

    /* renamed from: e */
    private boolean m41416e(MotionEvent motionEvent) {
        this.f32253v.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        this.f32252u.set(this.f32253v);
        return this.f32252u.contains((int) motionEvent.getX(), (int) motionEvent.getY());
    }

    /* renamed from: f */
    private void m41417f() {
        if (this.f32250s == null) {
            this.f32250s = new C7306c(this, (C7304a) null);
        }
        this.f32250s.setAnimationListener(new C7304a());
        this.f32250s.cancel();
        this.f32250s.setDuration(600);
        startAnimation(this.f32250s);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            getParent().requestDisallowInterceptTouchEvent(true);
        } else if (action == 2) {
            if (m41416e(motionEvent)) {
                this.f32254w = true;
                m41417f();
            } else {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        canvas.translate((float) getPaddingLeft(), 0.0f);
        float f = this.f32251t;
        int i = this.f32247p;
        int i2 = (int) (((float) i) * f * 1.2f);
        this.f32248q = i2;
        if (((float) i2) > ((float) i) * 0.8f) {
            this.f32249r = (int) ((((double) f) - 0.6d) * ((double) i) * 3.0d);
        }
        if (f != 1.0f) {
            canvas.drawCircle((float) (this.f32245n / 2), (float) (this.f32246o / 2), (float) i2, this.f32238g);
            canvas.drawCircle((float) (this.f32245n / 2), (float) (this.f32246o / 2), (float) this.f32249r, this.f32239h);
        } else {
            m41414c();
        }
        if (this.f32243l != null && !this.f32254w) {
            Rect rect = new Rect();
            int i3 = this.f32245n;
            int i4 = this.f32246o;
            rect.set((i3 * 5) / 16, (i4 * 5) / 16, (i3 * 11) / 16, (i4 * 11) / 16);
            canvas.drawBitmap(this.f32243l, (Rect) null, rect, this.f32240i);
        } else if (this.f32244m != null && this.f32254w) {
            Rect rect2 = new Rect();
            int i5 = this.f32245n;
            int i6 = this.f32246o;
            rect2.set((i5 * 5) / 16, (i6 * 5) / 16, (i5 * 11) / 16, (i6 * 11) / 16);
            canvas.drawBitmap(this.f32244m, (Rect) null, rect2, this.f32240i);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f32245n = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        this.f32246o = measuredHeight;
        this.f32247p = Math.min(this.f32245n / 2, measuredHeight / 2);
    }

    public void setiRippleAnimListener(C7305b bVar) {
        this.f32255x = bVar;
    }

    public RippleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RippleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32254w = false;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7941a.ddrippleView);
        this.f32242k = obtainStyledAttributes.getDrawable(1);
        this.f32241j = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
        m41415d();
    }
}
