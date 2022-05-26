package com.coocent.musiceffect.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.C4514i;
import p159f.p166c.p201g.p208p.C4569d;

public class EffectVerticalSeekbar extends View {

    /* renamed from: A */
    private C2471b f8720A;

    /* renamed from: B */
    private boolean f8721B;

    /* renamed from: C */
    private boolean f8722C;

    /* renamed from: g */
    private Paint f8723g;

    /* renamed from: h */
    private Paint f8724h;

    /* renamed from: i */
    private Paint f8725i;

    /* renamed from: j */
    private int f8726j;

    /* renamed from: k */
    private int f8727k;

    /* renamed from: l */
    private int f8728l;

    /* renamed from: m */
    private int f8729m;

    /* renamed from: n */
    private int f8730n;

    /* renamed from: o */
    private int f8731o;

    /* renamed from: p */
    private int f8732p;

    /* renamed from: q */
    private float f8733q;

    /* renamed from: r */
    private float f8734r;

    /* renamed from: s */
    private float f8735s;

    /* renamed from: t */
    private float f8736t;

    /* renamed from: u */
    private float f8737u;

    /* renamed from: v */
    private int f8738v;

    /* renamed from: w */
    private int f8739w;

    /* renamed from: x */
    private boolean f8740x;

    /* renamed from: y */
    private String f8741y;

    /* renamed from: z */
    private ValueAnimator f8742z;

    /* renamed from: com.coocent.musiceffect.view.EffectVerticalSeekbar$a */
    class C2470a implements ValueAnimator.AnimatorUpdateListener {
        C2470a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            EffectVerticalSeekbar.this.setProgressInternal(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* renamed from: com.coocent.musiceffect.view.EffectVerticalSeekbar$b */
    public interface C2471b {
        /* renamed from: a */
        void mo9593a(EffectVerticalSeekbar effectVerticalSeekbar, int i, boolean z);

        /* renamed from: b */
        void mo9594b(EffectVerticalSeekbar effectVerticalSeekbar);
    }

    public EffectVerticalSeekbar(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: b */
    private void m11599b(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C4514i.EffectVerticalSeekbar);
            this.f8738v = obtainStyledAttributes.getInteger(C4514i.EffectVerticalSeekbar_verticalProgress, 0);
            this.f8739w = obtainStyledAttributes.getInteger(C4514i.EffectVerticalSeekbar_verticalMax, 100);
            obtainStyledAttributes.recycle();
        }
        this.f8730n = context.getResources().getColor(C4509d.effect_progress_bg);
        this.f8731o = context.getResources().getColor(C4509d.effect_accent);
        this.f8732p = context.getResources().getColor(C4509d.effect_progress_close);
        this.f8729m = C4569d.m19968a(context, 10.0f);
        this.f8733q = (float) C4569d.m19968a(context, 6.0f);
        this.f8735s = (float) C4569d.m19968a(context, 10.0f);
        Paint paint = new Paint();
        this.f8723g = paint;
        paint.setAntiAlias(true);
        this.f8723g.setStrokeWidth(this.f8733q);
        this.f8723g.setStyle(Paint.Style.STROKE);
        this.f8723g.setStrokeCap(Paint.Cap.ROUND);
        this.f8723g.setColor(this.f8730n);
        TextPaint textPaint = new TextPaint();
        this.f8725i = textPaint;
        textPaint.setTextSize((float) C4569d.m19969b(getContext(), 18.0f));
        this.f8725i.setColor(context.getResources().getColor(C4509d.effect_textcolor));
        this.f8725i.setAntiAlias(true);
        Paint paint2 = new Paint();
        this.f8724h = paint2;
        paint2.setAntiAlias(true);
        this.f8724h.setColor(this.f8731o);
    }

    /* renamed from: c */
    private boolean m11600c(float f, float f2) {
        float precentage = this.f8736t - (this.f8734r * getPrecentage());
        float f3 = this.f8735s;
        return f2 > precentage - (f3 * 2.0f) && f2 < precentage + (f3 * 2.0f);
    }

    private float getPrecentage() {
        int i = this.f8738v;
        int i2 = this.f8739w;
        if (i > i2) {
            this.f8738v = i2;
        }
        int i3 = this.f8738v;
        if (i3 <= 0 || i2 <= 0) {
            return 0.0f;
        }
        return (((float) i3) * 1.0f) / ((float) i2);
    }

    /* access modifiers changed from: private */
    public void setProgressInternal(int i) {
        if (this.f8738v != i || this.f8740x) {
            this.f8738v = i;
            this.f8740x = false;
            C2471b bVar = this.f8720A;
            if (bVar != null) {
                bVar.mo9593a(this, i, this.f8721B);
            }
            invalidate();
        }
    }

    /* renamed from: d */
    public void mo9581d(int i, boolean z) {
        if (z) {
            ValueAnimator valueAnimator = this.f8742z;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{this.f8738v, i});
            this.f8742z = ofInt;
            ofInt.addUpdateListener(new C2470a());
            this.f8742z.setDuration(500).start();
            return;
        }
        setProgressInternal(i);
    }

    public int getMax() {
        return this.f8739w;
    }

    public int getProgress() {
        return this.f8738v;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.f8742z;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f8742z.end();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f8723g.setColor(this.f8730n);
        int i = this.f8726j;
        int i2 = this.f8729m;
        canvas.drawLine(((float) i) * 0.5f, (float) i2, ((float) i) * 0.5f, (float) (this.f8727k - i2), this.f8723g);
        this.f8723g.setColor(isEnabled() ? this.f8731o : this.f8732p);
        canvas.drawLine(((float) this.f8726j) * 0.5f, ((float) (this.f8727k - this.f8729m)) - (((float) this.f8728l) * getPrecentage()), ((float) this.f8726j) * 0.5f, (float) (this.f8727k - this.f8729m), this.f8723g);
        this.f8724h.setColor(isEnabled() ? this.f8731o : this.f8732p);
        float min = Math.min(Math.max(this.f8736t - (this.f8734r * getPrecentage()), this.f8737u), this.f8736t);
        canvas.drawCircle(((float) this.f8726j) * 0.5f, min, this.f8735s, this.f8724h);
        if (this.f8721B) {
            canvas.drawText(this.f8741y, (((float) getWidth()) - this.f8725i.measureText(this.f8741y)) * 0.5f, Math.max(min - (this.f8735s * 2.0f), this.f8737u), this.f8725i);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8726j = i;
        this.f8727k = i2;
        int i5 = this.f8729m;
        int i6 = i2 - (i5 * 2);
        this.f8728l = i6;
        float f = this.f8733q;
        float f2 = this.f8735s;
        this.f8734r = (((float) i6) + f) - (f2 * 2.0f);
        this.f8736t = (((float) (i2 - i5)) - f2) + (f / 2.0f);
        this.f8737u = (((float) i5) + f2) - (f / 2.0f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r0 != 3) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.isEnabled()
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = r5.getAction()
            r2 = 1
            if (r0 == 0) goto L_0x0052
            if (r0 == r2) goto L_0x003c
            r3 = 2
            if (r0 == r3) goto L_0x0018
            r5 = 3
            if (r0 == r5) goto L_0x003c
            goto L_0x0075
        L_0x0018:
            r4.f8721B = r2
            boolean r0 = r4.f8722C
            if (r0 == 0) goto L_0x0075
            float r0 = r4.f8736t
            float r5 = r5.getY()
            float r0 = r0 - r5
            float r5 = r4.f8734r
            float r0 = r0 / r5
            int r5 = r4.f8739w
            float r5 = (float) r5
            float r5 = r5 * r0
            int r5 = (int) r5
            int r5 = java.lang.Math.max(r5, r1)
            int r0 = r4.f8739w
            int r5 = java.lang.Math.min(r5, r0)
            r4.setProgressInternal(r5)
            goto L_0x0075
        L_0x003c:
            r4.f8722C = r1
            r4.f8721B = r1
            com.coocent.musiceffect.view.EffectVerticalSeekbar$b r5 = r4.f8720A
            if (r5 == 0) goto L_0x0047
            r5.mo9594b(r4)
        L_0x0047:
            r4.invalidate()
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0075
        L_0x0052:
            r4.f8721B = r1
            r4.f8722C = r1
            float r0 = r5.getX()
            float r5 = r5.getY()
            boolean r5 = r4.m11600c(r0, r5)
            if (r5 == 0) goto L_0x006e
            r4.f8722C = r2
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0075
        L_0x006e:
            android.view.ViewParent r5 = r4.getParent()
            r5.requestDisallowInterceptTouchEvent(r1)
        L_0x0075:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.musiceffect.view.EffectVerticalSeekbar.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setMax(int i) {
        this.f8739w = i;
        postInvalidate();
        int i2 = this.f8738v;
        int i3 = this.f8739w;
        if (i2 > i3) {
            this.f8738v = i3;
            setProgressInternal(i3);
        }
    }

    public void setOnProgressChangedListener(C2471b bVar) {
        this.f8720A = bVar;
    }

    public void setProgress(int i) {
        mo9581d(i, false);
    }

    public void setValue(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f8741y = str;
            invalidate();
        }
    }

    public EffectVerticalSeekbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EffectVerticalSeekbar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8738v = 0;
        this.f8739w = 100;
        this.f8740x = true;
        this.f8741y = "+0";
        m11599b(context, attributeSet);
    }
}
