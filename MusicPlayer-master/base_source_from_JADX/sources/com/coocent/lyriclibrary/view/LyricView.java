package com.coocent.lyriclibrary.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.Scroller;
import androidx.core.content.C0506a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p159f.p166c.p177d.C4342b;
import p159f.p166c.p177d.C4343c;
import p159f.p166c.p177d.C4346f;
import p159f.p166c.p177d.C4347g;
import p159f.p166c.p177d.p178h.C4348a;
import p159f.p166c.p177d.p178h.C4349b;
import p159f.p166c.p177d.p179i.C4351b;
import p159f.p166c.p177d.p180j.C4359c;
import p159f.p166c.p177d.p180j.C4360d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class LyricView extends View {

    /* renamed from: A */
    private int f7527A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public Drawable f7528B;

    /* renamed from: C */
    private int f7529C;

    /* renamed from: D */
    private int f7530D;

    /* renamed from: E */
    private ValueAnimator f7531E;

    /* renamed from: F */
    private GestureDetector f7532F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public Scroller f7533G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public float f7534H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public int f7535I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f7536J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public boolean f7537K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public boolean f7538L;

    /* renamed from: M */
    private int f7539M;

    /* renamed from: N */
    private boolean f7540N;
    /* access modifiers changed from: private */

    /* renamed from: O */
    public C4351b f7541O;

    /* renamed from: P */
    private GestureDetector.SimpleOnGestureListener f7542P;
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public Runnable f7543Q;

    /* renamed from: R */
    private int f7544R;

    /* renamed from: S */
    private int f7545S;

    /* renamed from: T */
    private boolean f7546T;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public List<C4348a> f7547g;

    /* renamed from: h */
    private List<C4349b> f7548h;

    /* renamed from: i */
    private TextPaint f7549i;

    /* renamed from: j */
    private TextPaint f7550j;

    /* renamed from: k */
    private Rect f7551k;

    /* renamed from: l */
    private Paint.FontMetrics f7552l;

    /* renamed from: m */
    private StaticLayout f7553m;

    /* renamed from: n */
    private float f7554n;

    /* renamed from: o */
    private float f7555o;

    /* renamed from: p */
    private float f7556p;

    /* renamed from: q */
    private long f7557q;

    /* renamed from: r */
    private int f7558r;

    /* renamed from: s */
    private float f7559s;

    /* renamed from: t */
    private int f7560t;

    /* renamed from: u */
    private int f7561u;

    /* renamed from: v */
    private float f7562v;

    /* renamed from: w */
    private float f7563w;

    /* renamed from: x */
    private int f7564x;

    /* renamed from: y */
    private int f7565y;

    /* renamed from: z */
    private String f7566z;

    /* renamed from: com.coocent.lyriclibrary.view.LyricView$a */
    class C2231a implements Runnable {

        /* renamed from: g */
        final /* synthetic */ long f7567g;

        /* renamed from: h */
        final /* synthetic */ long f7568h;

        C2231a(long j, long j2) {
            this.f7567g = j;
            this.f7568h = j2;
        }

        public void run() {
            long j;
            if (LyricView.this.mo8855x()) {
                int c = C4359c.m19012c(LyricView.this.f7547g, this.f7567g);
                long j2 = c < LyricView.this.f7547g.size() ? ((C4348a) LyricView.this.f7547g.get(c)).mo14757j() : 0;
                if (c >= LyricView.this.f7547g.size() || ((C4348a) LyricView.this.f7547g.get(c)).mo14755d() <= j2) {
                    int i = c + 1;
                    if (i < LyricView.this.f7547g.size()) {
                        j = ((C4348a) LyricView.this.f7547g.get(i)).mo14757j();
                    } else {
                        j = this.f7568h;
                    }
                } else {
                    j = ((C4348a) LyricView.this.f7547g.get(c)).mo14755d();
                }
                LyricView.this.m10376E(this.f7567g, j2, j);
                if (c != LyricView.this.f7535I) {
                    int unused = LyricView.this.f7535I = c;
                    if (!LyricView.this.f7536J) {
                        LyricView.this.m10374C(c);
                    } else {
                        LyricView.this.invalidate();
                    }
                }
            }
        }
    }

    /* renamed from: com.coocent.lyriclibrary.view.LyricView$b */
    class C2232b extends GestureDetector.SimpleOnGestureListener {
        C2232b() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            if (LyricView.this.f7541O == null) {
                return super.onDown(motionEvent);
            }
            if (LyricView.this.mo8855x()) {
                LyricView.this.f7533G.forceFinished(true);
                LyricView lyricView = LyricView.this;
                lyricView.removeCallbacks(lyricView.f7543Q);
                boolean unused = LyricView.this.f7537K = true;
                boolean unused2 = LyricView.this.f7536J = true;
                LyricView.this.invalidate();
            }
            return true;
        }

        public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!LyricView.this.mo8855x()) {
                return super.onFling(motionEvent, motionEvent2, f, f2);
            }
            LyricView lyricView = LyricView.this;
            LyricView.this.f7533G.fling(0, (int) LyricView.this.f7534H, 0, (int) f2, 0, 0, (int) lyricView.m10399w(lyricView.f7547g.size() - 1), (int) LyricView.this.m10399w(0));
            boolean unused = LyricView.this.f7538L = true;
            return true;
        }

        public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (!LyricView.this.mo8855x()) {
                return super.onScroll(motionEvent, motionEvent2, f, f2);
            }
            LyricView lyricView = LyricView.this;
            float unused = lyricView.f7534H = lyricView.f7534H + (-f2);
            LyricView lyricView2 = LyricView.this;
            float unused2 = lyricView2.f7534H = Math.min(lyricView2.f7534H, LyricView.this.m10399w(0));
            LyricView lyricView3 = LyricView.this;
            float p = lyricView3.f7534H;
            LyricView lyricView4 = LyricView.this;
            float unused3 = lyricView3.f7534H = Math.max(p, lyricView4.m10399w(lyricView4.f7547g.size() - 1));
            LyricView.this.invalidate();
            return true;
        }

        public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            if (LyricView.this.f7541O == null) {
                return super.onSingleTapConfirmed(motionEvent);
            }
            if (!LyricView.this.mo8855x() || !LyricView.this.f7536J || !LyricView.this.f7528B.getBounds().contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                LyricView.this.f7541O.mo8880b(LyricView.this.mo8855x());
                return true;
            }
            int f = LyricView.this.getCenterLine();
            if (!LyricView.this.f7541O.mo14781a(((C4348a) LyricView.this.f7547g.get(f)).mo14757j())) {
                return true;
            }
            boolean unused = LyricView.this.f7536J = false;
            LyricView lyricView = LyricView.this;
            lyricView.removeCallbacks(lyricView.f7543Q);
            int unused2 = LyricView.this.f7535I = f;
            LyricView.this.invalidate();
            return true;
        }
    }

    /* renamed from: com.coocent.lyriclibrary.view.LyricView$c */
    class C2233c implements Runnable {
        C2233c() {
        }

        public void run() {
            if (LyricView.this.mo8855x() && LyricView.this.f7536J) {
                boolean unused = LyricView.this.f7536J = false;
                LyricView lyricView = LyricView.this;
                lyricView.m10374C(lyricView.f7535I);
            }
        }
    }

    /* renamed from: com.coocent.lyriclibrary.view.LyricView$d */
    class C2234d implements ValueAnimator.AnimatorUpdateListener {
        C2234d() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float unused = LyricView.this.f7534H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            LyricView.this.invalidate();
        }
    }

    public LyricView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: B */
    private void m10373B(Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            runnable.run();
        } else {
            post(runnable);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C */
    public void m10374C(int i) {
        m10375D(i, this.f7557q);
    }

    /* renamed from: D */
    private void m10375D(int i, long j) {
        float w = m10399w(i);
        m10398v();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{this.f7534H, w});
        this.f7531E = ofFloat;
        ofFloat.setDuration(j);
        this.f7531E.setInterpolator(new LinearInterpolator());
        this.f7531E.addUpdateListener(new C2234d());
        this.f7531E.start();
    }

    /* access modifiers changed from: private */
    /* renamed from: E */
    public void m10376E(long j, long j2, long j3) {
        if (j3 > j2) {
            try {
                this.f7539M = (int) (((j - j2) * 100) / (j3 - j2));
                this.f7540N = true;
                invalidate();
                this.f7540N = false;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: private */
    public int getCenterLine() {
        int i = 0;
        float f = Float.MAX_VALUE;
        for (int i2 = 0; i2 < this.f7547g.size(); i2++) {
            if (Math.abs(this.f7534H - m10399w(i2)) < f) {
                f = Math.abs(this.f7534H - m10399w(i2));
                i = i2;
            }
        }
        return i;
    }

    private float getLrcWidth() {
        float width = (((float) getWidth()) - this.f7555o) - this.f7556p;
        if (width > 0.0f) {
            return width;
        }
        return (float) getWidth();
    }

    /* renamed from: r */
    private void m10394r() {
        m10375D(getCenterLine(), 100);
    }

    /* renamed from: s */
    private void m10395s(Canvas canvas, StaticLayout staticLayout, Rect rect, float f) {
        if (staticLayout != null) {
            canvas.save();
            canvas.clipRect(rect);
            canvas.translate(this.f7555o, f - (((float) staticLayout.getHeight()) * 0.5f));
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: t */
    private void m10396t(Canvas canvas, StaticLayout staticLayout, float f) {
        if (staticLayout != null) {
            canvas.save();
            canvas.translate(this.f7555o, f - (((float) staticLayout.getHeight()) * 0.5f));
            staticLayout.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: u */
    private void m10397u(Canvas canvas, String str) {
        int i = this.f7530D;
        if (i == 0) {
            int width = getWidth();
            int i2 = this.f7565y;
            int i3 = this.f7564x;
            int i4 = (width - ((i2 - i3) / 2)) - i3;
            int i5 = this.f7564x;
            int height = (getHeight() / 2) - (i5 / 2);
            this.f7528B.setBounds(i4, height, i4 + i5, i5 + height);
            this.f7528B.draw(canvas);
            canvas.drawLine((float) this.f7565y, ((float) getHeight()) * 0.5f, (float) (getWidth() - this.f7565y), ((float) getHeight()) * 0.5f, this.f7550j);
            Paint.FontMetrics fontMetrics = this.f7552l;
            canvas.drawText(str, ((float) this.f7565y) * 0.5f, (((float) getHeight()) * 0.5f) - ((fontMetrics.descent + fontMetrics.ascent) / 2.0f), this.f7550j);
        } else if (i == 1) {
            int width2 = (getWidth() - (this.f7564x / 2)) - this.f7565y;
            int i6 = this.f7564x;
            int height2 = (getHeight() / 2) - (i6 / 2);
            this.f7528B.setBounds(width2, height2, width2 + i6, i6 + height2);
            this.f7528B.draw(canvas);
            Paint.FontMetrics fontMetrics2 = this.f7552l;
            canvas.drawText(str, ((float) getWidth()) - (((float) this.f7565y) * 0.5f), (((float) getHeight()) * 0.5f) - ((fontMetrics2.descent + fontMetrics2.ascent) / 2.0f), this.f7550j);
        } else if (i == 2) {
            int i7 = (this.f7565y - this.f7564x) / 2;
            int i8 = this.f7564x;
            int height3 = (getHeight() / 2) - (i8 / 2);
            this.f7528B.setBounds(i7, height3, i7 + i8, i8 + height3);
            this.f7528B.draw(canvas);
            Paint.FontMetrics fontMetrics3 = this.f7552l;
            canvas.drawText(str, (((float) this.f7565y) * 0.5f) + ((float) this.f7564x), (((float) getHeight()) * 0.5f) - ((fontMetrics3.descent + fontMetrics3.ascent) / 2.0f), this.f7550j);
        }
    }

    /* renamed from: v */
    private void m10398v() {
        ValueAnimator valueAnimator = this.f7531E;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f7531E.end();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public float m10399w(int i) {
        if (i >= this.f7548h.size()) {
            return 0.0f;
        }
        if (this.f7548h.get(i).mo14761c() == Float.MIN_VALUE) {
            float height = (float) (getHeight() / 2);
            for (int i2 = 1; i2 <= i; i2++) {
                height -= (((float) (this.f7548h.get(i2 - 1).mo14760b() + this.f7548h.get(i2).mo14760b())) * 0.5f) + this.f7554n;
            }
            this.f7548h.get(i).mo14763g(height);
        }
        return this.f7548h.get(i).mo14761c();
    }

    /* renamed from: y */
    private void m10400y(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C4347g.LyricView);
        this.f7554n = obtainStyledAttributes.getDimension(C4347g.LyricView_lyricDividerHeight, (float) C4360d.m19019a(getContext(), 10.0f));
        this.f7555o = obtainStyledAttributes.getDimension(C4347g.LyricView_lyricPaddingLeft, (float) C4360d.m19019a(getContext(), 50.0f));
        this.f7556p = obtainStyledAttributes.getDimension(C4347g.LyricView_lyricPaddingRight, (float) C4360d.m19019a(getContext(), 50.0f));
        this.f7562v = obtainStyledAttributes.getDimension(C4347g.LyricView_lyricCurrentTextSize, (float) C4360d.m19020b(getContext(), 16.0f));
        int i = C4347g.LyricView_lyricCurrentTextColor;
        Resources resources = getResources();
        int i2 = C4342b.lyric_light;
        this.f7560t = obtainStyledAttributes.getColor(i, resources.getColor(i2));
        this.f7561u = obtainStyledAttributes.getColor(C4347g.LyricView_lyricCurrentDefaultTextColor, getResources().getColor(C4342b.lyric_default));
        this.f7559s = obtainStyledAttributes.getDimension(C4347g.LyricView_lyricNormalTextSize, (float) C4360d.m19020b(getContext(), 14.0f));
        this.f7558r = obtainStyledAttributes.getColor(C4347g.LyricView_lyricNormalTextColor, getResources().getColor(C4342b.lyric_normal));
        Drawable drawable = obtainStyledAttributes.getDrawable(C4347g.LyricView_lyricPlayDrawable);
        this.f7528B = drawable;
        if (drawable == null) {
            drawable = C0506a.m3152d(getContext(), C4343c.ic_lyric_play);
        }
        this.f7528B = drawable;
        if (Build.VERSION.SDK_INT >= 21) {
            drawable.setTint(this.f7558r);
        }
        String string = obtainStyledAttributes.getString(C4347g.LyricView_lyricDefaultLabel);
        this.f7566z = string;
        this.f7566z = TextUtils.isEmpty(string) ? getResources().getString(C4346f.lyrics_no_find) : this.f7566z;
        this.f7527A = obtainStyledAttributes.getColor(C4347g.LyricView_lyricDefaultColor, getResources().getColor(i2));
        this.f7529C = obtainStyledAttributes.getInteger(C4347g.LyricView_lyricGravity, 0);
        this.f7530D = obtainStyledAttributes.getInteger(C4347g.LyricView_lyricTimelineType, 0);
        obtainStyledAttributes.recycle();
        this.f7563w = this.f7559s;
        this.f7557q = 1000;
        this.f7564x = C4360d.m19019a(getContext(), 30.0f);
        this.f7565y = C4360d.m19019a(getContext(), 50.0f);
        TextPaint textPaint = new TextPaint();
        this.f7549i = textPaint;
        textPaint.setAntiAlias(true);
        this.f7549i.setTextSize(this.f7562v);
        this.f7549i.setTextAlign(Paint.Align.LEFT);
        this.f7549i.setFakeBoldText(false);
        TextPaint textPaint2 = new TextPaint();
        this.f7550j = textPaint2;
        textPaint2.setAntiAlias(true);
        this.f7550j.setTextSize((float) C4360d.m19020b(getContext(), 12.0f));
        this.f7550j.setTextAlign(Paint.Align.CENTER);
        this.f7550j.setColor(this.f7558r);
        this.f7550j.setStrokeWidth((float) C4360d.m19019a(getContext(), 1.0f));
        this.f7550j.setStrokeCap(Paint.Cap.ROUND);
        this.f7552l = this.f7550j.getFontMetrics();
        this.f7551k = new Rect();
        GestureDetector gestureDetector = new GestureDetector(getContext(), this.f7542P);
        this.f7532F = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        this.f7533G = new Scroller(getContext());
    }

    /* renamed from: z */
    private void m10401z() {
        if (mo8855x() && getWidth() != 0) {
            this.f7548h.clear();
            this.f7549i.setTextSize(this.f7562v);
            for (C4348a h : this.f7547g) {
                this.f7548h.add(new C4349b(C4349b.m18961a(h.mo14756h(), this.f7549i, (int) getLrcWidth(), this.f7529C)));
            }
            this.f7534H = (float) (getHeight() / 2);
        }
    }

    /* renamed from: A */
    public void mo8841A() {
        m10398v();
        this.f7533G.forceFinished(true);
        this.f7536J = false;
        this.f7537K = false;
        this.f7538L = false;
        removeCallbacks(this.f7543Q);
        this.f7547g.clear();
        this.f7534H = 0.0f;
        this.f7535I = 0;
        invalidate();
    }

    /* renamed from: F */
    public void mo8842F(long j, long j2) {
        m10373B(new C2231a(j, j2));
    }

    public void computeScroll() {
        if (this.f7533G.computeScrollOffset()) {
            this.f7534H = (float) this.f7533G.getCurrY();
            invalidate();
        }
        if (this.f7538L && this.f7533G.isFinished()) {
            this.f7538L = false;
            if (mo8855x() && !this.f7537K) {
                m10394r();
                postDelayed(this.f7543Q, 3000);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L_0x0060;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean dispatchTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x004b
            r2 = 0
            if (r0 == r1) goto L_0x0041
            r3 = 2
            if (r0 == r3) goto L_0x0011
            r1 = 3
            if (r0 == r1) goto L_0x0041
            goto L_0x0060
        L_0x0011:
            float r0 = r6.getX()
            int r0 = (int) r0
            float r3 = r6.getY()
            int r3 = (int) r3
            int r4 = r5.f7544R
            int r0 = r0 - r4
            int r0 = java.lang.Math.abs(r0)
            int r4 = r5.f7545S
            int r3 = r3 - r4
            int r3 = java.lang.Math.abs(r3)
            if (r0 < r3) goto L_0x0037
            boolean r0 = r5.f7546T
            if (r0 != 0) goto L_0x0060
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0060
        L_0x0037:
            r5.f7546T = r1
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            goto L_0x0060
        L_0x0041:
            r5.f7546T = r2
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L_0x0060
        L_0x004b:
            float r0 = r6.getX()
            int r0 = (int) r0
            r5.f7544R = r0
            float r0 = r6.getY()
            int r0 = (int) r0
            r5.f7545S = r0
            android.view.ViewParent r0 = r5.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
        L_0x0060:
            boolean r6 = super.dispatchTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.lyriclibrary.view.LyricView.dispatchTouchEvent(android.view.MotionEvent):boolean");
    }

    public String getCurrentText() {
        int size = this.f7547g.size();
        int i = this.f7535I;
        return size > i ? this.f7547g.get(i).mo14756h() : BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f7543Q);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (!mo8855x()) {
            this.f7549i.setTextSize(this.f7562v);
            this.f7549i.setColor(this.f7527A);
            if (this.f7553m == null) {
                this.f7553m = C4349b.m18961a(this.f7566z, this.f7549i, (int) getLrcWidth(), this.f7529C);
            }
            m10396t(canvas2, this.f7553m, (float) (getHeight() / 2));
            return;
        }
        int centerLine = getCenterLine();
        if (this.f7536J) {
            m10397u(canvas2, C4360d.m19021c(this.f7547g.get(centerLine).mo14757j()));
        }
        float f = 0.0f;
        if (!this.f7540N) {
            canvas2.translate(0.0f, this.f7534H);
        }
        for (int i = 0; i < this.f7548h.size(); i++) {
            float f2 = 0.5f;
            if (i > 0) {
                f += (((float) (this.f7548h.get(i - 1).mo14760b() + this.f7548h.get(i).mo14760b())) * 0.5f) + this.f7554n;
            }
            StaticLayout f3 = this.f7548h.get(i).mo14762f();
            if (i == this.f7535I) {
                this.f7549i.setFakeBoldText(true);
                this.f7549i.setTextSize(this.f7562v);
                this.f7549i.setColor(this.f7561u);
                m10396t(canvas2, f3, f);
                this.f7549i.setColor(this.f7560t);
                int lineCount = f3.getLineCount();
                float height = (((float) f3.getHeight()) * 1.0f) / ((float) lineCount);
                float measureText = (this.f7549i.measureText(getCurrentText()) * ((float) this.f7539M)) / 100.0f;
                int i2 = 0;
                while (i2 < lineCount) {
                    this.f7551k.top = (int) (((((float) i2) * height) + f) - (((float) f3.getHeight()) * f2));
                    int i3 = i2 + 1;
                    this.f7551k.bottom = (int) (((((float) i3) * height) + f) - (((float) f3.getHeight()) * f2));
                    int i4 = lineCount;
                    this.f7551k.left = C4349b.m18962d((float) getWidth(), this.f7555o, this.f7556p, f3.getLineWidth(i2), this.f7529C);
                    Rect rect = this.f7551k;
                    float width = (float) getWidth();
                    float f4 = this.f7555o;
                    int i5 = i3;
                    rect.right = C4349b.m18963e(width, f4, this.f7556p, f3.getLineWidth(i2), measureText, this.f7529C, measureText > f3.getLineWidth(i2));
                    m10395s(canvas2, f3, this.f7551k, f);
                    measureText -= f3.getLineWidth(i2);
                    lineCount = i4;
                    i2 = i5;
                    f2 = 0.5f;
                }
                this.f7549i.setFakeBoldText(false);
            } else if (!this.f7536J || i != centerLine) {
                this.f7549i.setTextSize(this.f7559s);
                this.f7549i.setColor(this.f7558r);
                m10396t(canvas2, f3, f);
            } else {
                this.f7549i.setTextSize(this.f7563w);
                this.f7549i.setColor(this.f7561u);
                m10396t(canvas2, f3, f);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        m10401z();
        if (mo8855x()) {
            m10375D(this.f7535I, 0);
            computeScroll();
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            this.f7537K = false;
            if (mo8855x() && !this.f7538L) {
                m10394r();
                postDelayed(this.f7543Q, 3000);
            }
        }
        return this.f7532F.onTouchEvent(motionEvent);
    }

    public void setLyric(String str) {
        setLyricList(C4359c.m19017h(str));
    }

    public void setLyricList(List<C4348a> list) {
        mo8841A();
        if (list != null && !list.isEmpty()) {
            Collections.sort(list);
            for (C4348a next : list) {
                if (!TextUtils.isEmpty(next.mo14756h().trim())) {
                    this.f7547g.add(next);
                } else if (this.f7547g.size() > 0) {
                    List<C4348a> list2 = this.f7547g;
                    if (list2.get(list2.size() - 1).mo14755d() == 0) {
                        List<C4348a> list3 = this.f7547g;
                        list3.get(list3.size() - 1).mo14758k(next.mo14757j());
                    }
                }
            }
        }
        m10401z();
        invalidate();
    }

    public void setOnPlayClickListener(C4351b bVar) {
        this.f7541O = bVar;
    }

    public void setTextColor(int i) {
        this.f7560t = i;
        this.f7527A = i;
        postInvalidate();
    }

    public void setTextSize(float f) {
        this.f7559s = (float) C4360d.m19020b(getContext(), f);
        this.f7563w = (float) C4360d.m19020b(getContext(), f);
        this.f7562v = (float) C4360d.m19020b(getContext(), f + 2.0f);
        m10401z();
        if (mo8855x()) {
            m10375D(this.f7535I, 0);
        }
    }

    /* renamed from: x */
    public boolean mo8855x() {
        return !this.f7547g.isEmpty();
    }

    public LyricView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LyricView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7547g = new ArrayList();
        this.f7548h = new ArrayList();
        this.f7529C = 0;
        this.f7530D = 0;
        this.f7536J = false;
        this.f7539M = 0;
        this.f7540N = false;
        this.f7542P = new C2232b();
        this.f7543Q = new C2233c();
        this.f7544R = 0;
        this.f7545S = 0;
        this.f7546T = false;
        m10400y(attributeSet);
    }
}
