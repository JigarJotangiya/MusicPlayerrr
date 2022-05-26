package androidx.swiperefreshlayout.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import p082e.p109h.p118o.C3703i;
import p082e.p137o.p138a.p139a.C4097b;

/* renamed from: androidx.swiperefreshlayout.widget.b */
/* compiled from: CircularProgressDrawable */
public class C1054b extends Drawable implements Animatable {

    /* renamed from: m */
    private static final Interpolator f4447m = new LinearInterpolator();

    /* renamed from: n */
    private static final Interpolator f4448n = new C4097b();

    /* renamed from: o */
    private static final int[] f4449o = {-16777216};

    /* renamed from: g */
    private final C1057c f4450g;

    /* renamed from: h */
    private float f4451h;

    /* renamed from: i */
    private Resources f4452i;

    /* renamed from: j */
    private Animator f4453j;

    /* renamed from: k */
    float f4454k;

    /* renamed from: l */
    boolean f4455l;

    /* renamed from: androidx.swiperefreshlayout.widget.b$a */
    /* compiled from: CircularProgressDrawable */
    class C1055a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C1057c f4456a;

        C1055a(C1057c cVar) {
            this.f4456a = cVar;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            C1054b.this.mo5847n(floatValue, this.f4456a);
            C1054b.this.mo5835b(floatValue, this.f4456a, false);
            C1054b.this.invalidateSelf();
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$b */
    /* compiled from: CircularProgressDrawable */
    class C1056b implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C1057c f4458a;

        C1056b(C1057c cVar) {
            this.f4458a = cVar;
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
        }

        public void onAnimationRepeat(Animator animator) {
            C1054b.this.mo5835b(1.0f, this.f4458a, true);
            this.f4458a.mo5857A();
            this.f4458a.mo5869l();
            C1054b bVar = C1054b.this;
            if (bVar.f4455l) {
                bVar.f4455l = false;
                animator.cancel();
                animator.setDuration(1332);
                animator.start();
                this.f4458a.mo5881x(false);
                return;
            }
            bVar.f4454k += 1.0f;
        }

        public void onAnimationStart(Animator animator) {
            C1054b.this.f4454k = 0.0f;
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.b$c */
    /* compiled from: CircularProgressDrawable */
    private static class C1057c {

        /* renamed from: a */
        final RectF f4460a = new RectF();

        /* renamed from: b */
        final Paint f4461b;

        /* renamed from: c */
        final Paint f4462c;

        /* renamed from: d */
        final Paint f4463d;

        /* renamed from: e */
        float f4464e;

        /* renamed from: f */
        float f4465f;

        /* renamed from: g */
        float f4466g;

        /* renamed from: h */
        float f4467h;

        /* renamed from: i */
        int[] f4468i;

        /* renamed from: j */
        int f4469j;

        /* renamed from: k */
        float f4470k;

        /* renamed from: l */
        float f4471l;

        /* renamed from: m */
        float f4472m;

        /* renamed from: n */
        boolean f4473n;

        /* renamed from: o */
        Path f4474o;

        /* renamed from: p */
        float f4475p;

        /* renamed from: q */
        float f4476q;

        /* renamed from: r */
        int f4477r;

        /* renamed from: s */
        int f4478s;

        /* renamed from: t */
        int f4479t;

        /* renamed from: u */
        int f4480u;

        C1057c() {
            Paint paint = new Paint();
            this.f4461b = paint;
            Paint paint2 = new Paint();
            this.f4462c = paint2;
            Paint paint3 = new Paint();
            this.f4463d = paint3;
            this.f4464e = 0.0f;
            this.f4465f = 0.0f;
            this.f4466g = 0.0f;
            this.f4467h = 5.0f;
            this.f4475p = 1.0f;
            this.f4479t = 255;
            paint.setStrokeCap(Paint.Cap.SQUARE);
            paint.setAntiAlias(true);
            paint.setStyle(Paint.Style.STROKE);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setAntiAlias(true);
            paint3.setColor(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: A */
        public void mo5857A() {
            this.f4470k = this.f4464e;
            this.f4471l = this.f4465f;
            this.f4472m = this.f4466g;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5858a(Canvas canvas, Rect rect) {
            RectF rectF = this.f4460a;
            float f = this.f4476q;
            float f2 = (this.f4467h / 2.0f) + f;
            if (f <= 0.0f) {
                f2 = (((float) Math.min(rect.width(), rect.height())) / 2.0f) - Math.max((((float) this.f4477r) * this.f4475p) / 2.0f, this.f4467h / 2.0f);
            }
            rectF.set(((float) rect.centerX()) - f2, ((float) rect.centerY()) - f2, ((float) rect.centerX()) + f2, ((float) rect.centerY()) + f2);
            float f3 = this.f4464e;
            float f4 = this.f4466g;
            float f5 = (f3 + f4) * 360.0f;
            float f6 = ((this.f4465f + f4) * 360.0f) - f5;
            this.f4461b.setColor(this.f4480u);
            this.f4461b.setAlpha(this.f4479t);
            float f7 = this.f4467h / 2.0f;
            rectF.inset(f7, f7);
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, this.f4463d);
            float f8 = -f7;
            rectF.inset(f8, f8);
            canvas.drawArc(rectF, f5, f6, false, this.f4461b);
            mo5859b(canvas, f5, f6, rectF);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo5859b(Canvas canvas, float f, float f2, RectF rectF) {
            if (this.f4473n) {
                Path path = this.f4474o;
                if (path == null) {
                    Path path2 = new Path();
                    this.f4474o = path2;
                    path2.setFillType(Path.FillType.EVEN_ODD);
                } else {
                    path.reset();
                }
                this.f4474o.moveTo(0.0f, 0.0f);
                this.f4474o.lineTo(((float) this.f4477r) * this.f4475p, 0.0f);
                Path path3 = this.f4474o;
                float f3 = this.f4475p;
                path3.lineTo((((float) this.f4477r) * f3) / 2.0f, ((float) this.f4478s) * f3);
                this.f4474o.offset(((Math.min(rectF.width(), rectF.height()) / 2.0f) + rectF.centerX()) - ((((float) this.f4477r) * this.f4475p) / 2.0f), rectF.centerY() + (this.f4467h / 2.0f));
                this.f4474o.close();
                this.f4462c.setColor(this.f4480u);
                this.f4462c.setAlpha(this.f4479t);
                canvas.save();
                canvas.rotate(f + f2, rectF.centerX(), rectF.centerY());
                canvas.drawPath(this.f4474o, this.f4462c);
                canvas.restore();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public int mo5860c() {
            return this.f4479t;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public float mo5861d() {
            return this.f4465f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public int mo5862e() {
            return this.f4468i[mo5863f()];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public int mo5863f() {
            return (this.f4469j + 1) % this.f4468i.length;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public float mo5864g() {
            return this.f4464e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public int mo5865h() {
            return this.f4468i[this.f4469j];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public float mo5866i() {
            return this.f4471l;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public float mo5867j() {
            return this.f4472m;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public float mo5868k() {
            return this.f4470k;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo5869l() {
            mo5877t(mo5863f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public void mo5870m() {
            this.f4470k = 0.0f;
            this.f4471l = 0.0f;
            this.f4472m = 0.0f;
            mo5882y(0.0f);
            mo5879v(0.0f);
            mo5880w(0.0f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public void mo5871n(int i) {
            this.f4479t = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public void mo5872o(float f, float f2) {
            this.f4477r = (int) f;
            this.f4478s = (int) f2;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: p */
        public void mo5873p(float f) {
            if (f != this.f4475p) {
                this.f4475p = f;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo5874q(float f) {
            this.f4476q = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo5875r(int i) {
            this.f4480u = i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: s */
        public void mo5876s(ColorFilter colorFilter) {
            this.f4461b.setColorFilter(colorFilter);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: t */
        public void mo5877t(int i) {
            this.f4469j = i;
            this.f4480u = this.f4468i[i];
        }

        /* access modifiers changed from: package-private */
        /* renamed from: u */
        public void mo5878u(int[] iArr) {
            this.f4468i = iArr;
            mo5877t(0);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: v */
        public void mo5879v(float f) {
            this.f4465f = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public void mo5880w(float f) {
            this.f4466g = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: x */
        public void mo5881x(boolean z) {
            if (this.f4473n != z) {
                this.f4473n = z;
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: y */
        public void mo5882y(float f) {
            this.f4464e = f;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: z */
        public void mo5883z(float f) {
            this.f4467h = f;
            this.f4461b.setStrokeWidth(f);
        }
    }

    public C1054b(Context context) {
        C3703i.m15827d(context);
        this.f4452i = context.getResources();
        C1057c cVar = new C1057c();
        this.f4450g = cVar;
        cVar.mo5878u(f4449o);
        mo5845k(2.5f);
        m6068m();
    }

    /* renamed from: a */
    private void m6064a(float f, C1057c cVar) {
        mo5847n(f, cVar);
        cVar.mo5882y(cVar.mo5868k() + (((cVar.mo5866i() - 0.01f) - cVar.mo5868k()) * f));
        cVar.mo5879v(cVar.mo5866i());
        cVar.mo5880w(cVar.mo5867j() + ((((float) (Math.floor((double) (cVar.mo5867j() / 0.8f)) + 1.0d)) - cVar.mo5867j()) * f));
    }

    /* renamed from: c */
    private int m6065c(float f, int i, int i2) {
        int i3 = (i >> 24) & 255;
        int i4 = (i >> 16) & 255;
        int i5 = (i >> 8) & 255;
        int i6 = i & 255;
        return ((i3 + ((int) (((float) (((i2 >> 24) & 255) - i3)) * f))) << 24) | ((i4 + ((int) (((float) (((i2 >> 16) & 255) - i4)) * f))) << 16) | ((i5 + ((int) (((float) (((i2 >> 8) & 255) - i5)) * f))) << 8) | (i6 + ((int) (f * ((float) ((i2 & 255) - i6)))));
    }

    /* renamed from: h */
    private void m6066h(float f) {
        this.f4451h = f;
    }

    /* renamed from: i */
    private void m6067i(float f, float f2, float f3, float f4) {
        C1057c cVar = this.f4450g;
        float f5 = this.f4452i.getDisplayMetrics().density;
        cVar.mo5883z(f2 * f5);
        cVar.mo5874q(f * f5);
        cVar.mo5877t(0);
        cVar.mo5872o(f3 * f5, f4 * f5);
    }

    /* renamed from: m */
    private void m6068m() {
        C1057c cVar = this.f4450g;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
        ofFloat.addUpdateListener(new C1055a(cVar));
        ofFloat.setRepeatCount(-1);
        ofFloat.setRepeatMode(1);
        ofFloat.setInterpolator(f4447m);
        ofFloat.addListener(new C1056b(cVar));
        this.f4453j = ofFloat;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo5835b(float f, C1057c cVar, boolean z) {
        float f2;
        float f3;
        if (this.f4455l) {
            m6064a(f, cVar);
        } else if (f != 1.0f || z) {
            float j = cVar.mo5867j();
            if (f < 0.5f) {
                f2 = cVar.mo5868k();
                f3 = (f4448n.getInterpolation(f / 0.5f) * 0.79f) + 0.01f + f2;
            } else {
                float k = cVar.mo5868k() + 0.79f;
                float f4 = k;
                f2 = k - (((1.0f - f4448n.getInterpolation((f - 0.5f) / 0.5f)) * 0.79f) + 0.01f);
                f3 = f4;
            }
            cVar.mo5882y(f2);
            cVar.mo5879v(f3);
            cVar.mo5880w(j + (0.20999998f * f));
            m6066h((f + this.f4454k) * 216.0f);
        }
    }

    /* renamed from: d */
    public void mo5836d(boolean z) {
        this.f4450g.mo5881x(z);
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        canvas.save();
        canvas.rotate(this.f4451h, bounds.exactCenterX(), bounds.exactCenterY());
        this.f4450g.mo5858a(canvas, bounds);
        canvas.restore();
    }

    /* renamed from: e */
    public void mo5838e(float f) {
        this.f4450g.mo5873p(f);
        invalidateSelf();
    }

    /* renamed from: f */
    public void mo5839f(int... iArr) {
        this.f4450g.mo5878u(iArr);
        this.f4450g.mo5877t(0);
        invalidateSelf();
    }

    /* renamed from: g */
    public void mo5840g(float f) {
        this.f4450g.mo5880w(f);
        invalidateSelf();
    }

    public int getAlpha() {
        return this.f4450g.mo5860c();
    }

    public int getOpacity() {
        return -3;
    }

    public boolean isRunning() {
        return this.f4453j.isRunning();
    }

    /* renamed from: j */
    public void mo5844j(float f, float f2) {
        this.f4450g.mo5882y(f);
        this.f4450g.mo5879v(f2);
        invalidateSelf();
    }

    /* renamed from: k */
    public void mo5845k(float f) {
        this.f4450g.mo5883z(f);
        invalidateSelf();
    }

    /* renamed from: l */
    public void mo5846l(int i) {
        if (i == 0) {
            m6067i(11.0f, 3.0f, 12.0f, 6.0f);
        } else {
            m6067i(7.5f, 2.5f, 10.0f, 5.0f);
        }
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public void mo5847n(float f, C1057c cVar) {
        if (f > 0.75f) {
            cVar.mo5875r(m6065c((f - 0.75f) / 0.25f, cVar.mo5865h(), cVar.mo5862e()));
        } else {
            cVar.mo5875r(cVar.mo5865h());
        }
    }

    public void setAlpha(int i) {
        this.f4450g.mo5871n(i);
        invalidateSelf();
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f4450g.mo5876s(colorFilter);
        invalidateSelf();
    }

    public void start() {
        this.f4453j.cancel();
        this.f4450g.mo5857A();
        if (this.f4450g.mo5861d() != this.f4450g.mo5864g()) {
            this.f4455l = true;
            this.f4453j.setDuration(666);
            this.f4453j.start();
            return;
        }
        this.f4450g.mo5877t(0);
        this.f4450g.mo5870m();
        this.f4453j.setDuration(1332);
        this.f4453j.start();
    }

    public void stop() {
        this.f4453j.cancel();
        m6066h(0.0f);
        this.f4450g.mo5881x(false);
        this.f4450g.mo5877t(0);
        this.f4450g.mo5870m();
        invalidateSelf();
    }
}
