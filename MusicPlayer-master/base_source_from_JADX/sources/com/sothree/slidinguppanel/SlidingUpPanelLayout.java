package com.sothree.slidinguppanel;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.sothree.slidinguppanel.C6793b;
import java.util.List;
import p082e.p109h.p119p.C3762j;
import p082e.p109h.p119p.C3774v;

public class SlidingUpPanelLayout extends ViewGroup {

    /* renamed from: O */
    private static final String f30281O = SlidingUpPanelLayout.class.getSimpleName();

    /* renamed from: P */
    private static C6791e f30282P = C6791e.COLLAPSED;

    /* renamed from: Q */
    private static final int[] f30283Q = {16842927};
    /* access modifiers changed from: private */

    /* renamed from: A */
    public int f30284A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public float f30285B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public boolean f30286C;

    /* renamed from: D */
    private boolean f30287D;

    /* renamed from: E */
    private float f30288E;

    /* renamed from: F */
    private float f30289F;

    /* renamed from: G */
    private float f30290G;

    /* renamed from: H */
    private float f30291H;

    /* renamed from: I */
    private boolean f30292I;

    /* renamed from: J */
    private final List<C6790d> f30293J;

    /* renamed from: K */
    private View.OnClickListener f30294K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public final C6793b f30295L;

    /* renamed from: M */
    private boolean f30296M;

    /* renamed from: N */
    private final Rect f30297N;

    /* renamed from: g */
    private int f30298g;

    /* renamed from: h */
    private int f30299h;

    /* renamed from: i */
    private final Paint f30300i;

    /* renamed from: j */
    private final Drawable f30301j;

    /* renamed from: k */
    private int f30302k;

    /* renamed from: l */
    private int f30303l;

    /* renamed from: m */
    private int f30304m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public boolean f30305n;

    /* renamed from: o */
    private boolean f30306o;

    /* renamed from: p */
    private boolean f30307p;

    /* renamed from: q */
    private View f30308q;

    /* renamed from: r */
    private int f30309r;

    /* renamed from: s */
    private View f30310s;

    /* renamed from: t */
    private int f30311t;

    /* renamed from: u */
    private C6792a f30312u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public View f30313v;

    /* renamed from: w */
    private View f30314w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C6791e f30315x;

    /* renamed from: y */
    private C6791e f30316y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public float f30317z;

    /* renamed from: com.sothree.slidinguppanel.SlidingUpPanelLayout$a */
    class C6787a implements View.OnClickListener {
        C6787a() {
        }

        public void onClick(View view) {
            C6791e eVar;
            if (SlidingUpPanelLayout.this.isEnabled() && SlidingUpPanelLayout.this.mo26404u()) {
                C6791e a = SlidingUpPanelLayout.this.f30315x;
                C6791e eVar2 = C6791e.EXPANDED;
                if (a == eVar2 || SlidingUpPanelLayout.this.f30315x == (eVar = C6791e.ANCHORED)) {
                    SlidingUpPanelLayout.this.setPanelState(C6791e.COLLAPSED);
                } else if (SlidingUpPanelLayout.this.f30285B < 1.0f) {
                    SlidingUpPanelLayout.this.setPanelState(eVar);
                } else {
                    SlidingUpPanelLayout.this.setPanelState(eVar2);
                }
            }
        }
    }

    /* renamed from: com.sothree.slidinguppanel.SlidingUpPanelLayout$b */
    static /* synthetic */ class C6788b {

        /* renamed from: a */
        static final /* synthetic */ int[] f30321a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                com.sothree.slidinguppanel.SlidingUpPanelLayout$e[] r0 = com.sothree.slidinguppanel.SlidingUpPanelLayout.C6791e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f30321a = r0
                com.sothree.slidinguppanel.SlidingUpPanelLayout$e r1 = com.sothree.slidinguppanel.SlidingUpPanelLayout.C6791e.EXPANDED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f30321a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.sothree.slidinguppanel.SlidingUpPanelLayout$e r1 = com.sothree.slidinguppanel.SlidingUpPanelLayout.C6791e.ANCHORED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f30321a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.sothree.slidinguppanel.SlidingUpPanelLayout$e r1 = com.sothree.slidinguppanel.SlidingUpPanelLayout.C6791e.HIDDEN     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f30321a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.sothree.slidinguppanel.SlidingUpPanelLayout$e r1 = com.sothree.slidinguppanel.SlidingUpPanelLayout.C6791e.COLLAPSED     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.sothree.slidinguppanel.SlidingUpPanelLayout.C6788b.<clinit>():void");
        }
    }

    /* renamed from: com.sothree.slidinguppanel.SlidingUpPanelLayout$c */
    private class C6789c extends C6793b.C6796c {
        private C6789c() {
        }

        /* renamed from: b */
        public int mo26409b(View view, int i, int i2) {
            int d = SlidingUpPanelLayout.this.m38683p(0.0f);
            int d2 = SlidingUpPanelLayout.this.m38683p(1.0f);
            if (SlidingUpPanelLayout.this.f30305n) {
                return Math.min(Math.max(i, d2), d);
            }
            return Math.min(Math.max(i, d), d2);
        }

        /* renamed from: e */
        public int mo26410e(View view) {
            return SlidingUpPanelLayout.this.f30284A;
        }

        /* renamed from: i */
        public void mo26411i(View view, int i) {
            SlidingUpPanelLayout.this.mo26405x();
        }

        /* renamed from: j */
        public void mo26412j(int i) {
            if (SlidingUpPanelLayout.this.f30295L != null && SlidingUpPanelLayout.this.f30295L.mo26432w() == 0) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                float unused = slidingUpPanelLayout.f30317z = slidingUpPanelLayout.m38684q(slidingUpPanelLayout.f30313v.getTop());
                SlidingUpPanelLayout.this.m38682o();
                if (SlidingUpPanelLayout.this.f30317z == 1.0f) {
                    SlidingUpPanelLayout.this.mo26360A();
                    SlidingUpPanelLayout.this.setPanelStateInternal(C6791e.EXPANDED);
                } else if (SlidingUpPanelLayout.this.f30317z == 0.0f) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(C6791e.COLLAPSED);
                } else if (SlidingUpPanelLayout.this.f30317z < 0.0f) {
                    SlidingUpPanelLayout.this.setPanelStateInternal(C6791e.HIDDEN);
                    SlidingUpPanelLayout.this.f30313v.setVisibility(4);
                } else {
                    SlidingUpPanelLayout.this.mo26360A();
                    SlidingUpPanelLayout.this.setPanelStateInternal(C6791e.ANCHORED);
                }
            }
        }

        /* renamed from: k */
        public void mo26413k(View view, int i, int i2, int i3, int i4) {
            SlidingUpPanelLayout.this.m38687w(i2);
            SlidingUpPanelLayout.this.invalidate();
        }

        /* renamed from: l */
        public void mo26414l(View view, float f, float f2) {
            int i;
            if (SlidingUpPanelLayout.this.f30305n) {
                f2 = -f2;
            }
            int i2 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            if (i2 > 0 && SlidingUpPanelLayout.this.f30317z <= SlidingUpPanelLayout.this.f30285B) {
                SlidingUpPanelLayout slidingUpPanelLayout = SlidingUpPanelLayout.this;
                i = slidingUpPanelLayout.m38683p(slidingUpPanelLayout.f30285B);
            } else if (i2 <= 0 || SlidingUpPanelLayout.this.f30317z <= SlidingUpPanelLayout.this.f30285B) {
                int i3 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
                if (i3 < 0 && SlidingUpPanelLayout.this.f30317z >= SlidingUpPanelLayout.this.f30285B) {
                    SlidingUpPanelLayout slidingUpPanelLayout2 = SlidingUpPanelLayout.this;
                    i = slidingUpPanelLayout2.m38683p(slidingUpPanelLayout2.f30285B);
                } else if (i3 < 0 && SlidingUpPanelLayout.this.f30317z < SlidingUpPanelLayout.this.f30285B) {
                    i = SlidingUpPanelLayout.this.m38683p(0.0f);
                } else if (SlidingUpPanelLayout.this.f30317z >= (SlidingUpPanelLayout.this.f30285B + 1.0f) / 2.0f) {
                    i = SlidingUpPanelLayout.this.m38683p(1.0f);
                } else if (SlidingUpPanelLayout.this.f30317z >= SlidingUpPanelLayout.this.f30285B / 2.0f) {
                    SlidingUpPanelLayout slidingUpPanelLayout3 = SlidingUpPanelLayout.this;
                    i = slidingUpPanelLayout3.m38683p(slidingUpPanelLayout3.f30285B);
                } else {
                    i = SlidingUpPanelLayout.this.m38683p(0.0f);
                }
            } else {
                i = SlidingUpPanelLayout.this.m38683p(1.0f);
            }
            if (SlidingUpPanelLayout.this.f30295L != null) {
                SlidingUpPanelLayout.this.f30295L.mo26422H(view.getLeft(), i);
            }
            SlidingUpPanelLayout.this.invalidate();
        }

        /* renamed from: m */
        public boolean mo26415m(View view, int i) {
            return !SlidingUpPanelLayout.this.f30286C && view == SlidingUpPanelLayout.this.f30313v;
        }

        /* synthetic */ C6789c(SlidingUpPanelLayout slidingUpPanelLayout, C6787a aVar) {
            this();
        }
    }

    /* renamed from: com.sothree.slidinguppanel.SlidingUpPanelLayout$d */
    public interface C6790d {
        /* renamed from: a */
        void mo26416a(View view, float f);

        /* renamed from: b */
        void mo26417b(View view, C6791e eVar, C6791e eVar2);
    }

    /* renamed from: com.sothree.slidinguppanel.SlidingUpPanelLayout$e */
    public enum C6791e {
        EXPANDED,
        COLLAPSED,
        ANCHORED,
        HIDDEN,
        DRAGGING
    }

    public SlidingUpPanelLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"NewApi"})
    /* renamed from: o */
    public void m38682o() {
        if (this.f30304m > 0) {
            C3774v.m16164H0(this.f30314w, (float) getCurrentParallaxOffset());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public int m38683p(float f) {
        View view = this.f30313v;
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        int i = (int) (f * ((float) this.f30284A));
        if (this.f30305n) {
            return ((getMeasuredHeight() - getPaddingBottom()) - this.f30302k) - i;
        }
        return (getPaddingTop() - measuredHeight) + this.f30302k + i;
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public float m38684q(int i) {
        int p = m38683p(0.0f);
        return (this.f30305n ? (float) (p - i) : (float) (i - p)) / ((float) this.f30284A);
    }

    /* access modifiers changed from: private */
    public void setPanelStateInternal(C6791e eVar) {
        C6791e eVar2 = this.f30315x;
        if (eVar2 != eVar) {
            this.f30315x = eVar;
            mo26387s(this, eVar2, eVar);
        }
    }

    /* renamed from: t */
    private static boolean m38685t(View view) {
        Drawable background = view.getBackground();
        return background != null && background.getOpacity() == -1;
    }

    /* renamed from: v */
    private boolean m38686v(View view, int i, int i2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int[] iArr2 = new int[2];
        getLocationOnScreen(iArr2);
        int i3 = iArr2[0] + i;
        int i4 = iArr2[1] + i2;
        if (i3 < iArr[0] || i3 >= iArr[0] + view.getWidth() || i4 < iArr[1] || i4 >= iArr[1] + view.getHeight()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void m38687w(int i) {
        C6791e eVar = this.f30315x;
        C6791e eVar2 = C6791e.DRAGGING;
        if (eVar != eVar2) {
            this.f30316y = eVar;
        }
        setPanelStateInternal(eVar2);
        this.f30317z = m38684q(i);
        m38682o();
        mo26386r(this.f30313v);
        LayoutParams layoutParams = (LayoutParams) this.f30314w.getLayoutParams();
        int height = ((getHeight() - getPaddingBottom()) - getPaddingTop()) - this.f30302k;
        if (this.f30317z <= 0.0f && !this.f30306o) {
            int paddingBottom = this.f30305n ? i - getPaddingBottom() : ((getHeight() - getPaddingBottom()) - this.f30313v.getMeasuredHeight()) - i;
            layoutParams.height = paddingBottom;
            if (paddingBottom == height) {
                layoutParams.height = -1;
            }
            this.f30314w.requestLayout();
        } else if (layoutParams.height != -1 && !this.f30306o) {
            layoutParams.height = -1;
            this.f30314w.requestLayout();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo26360A() {
        int i;
        int i2;
        int i3;
        int i4;
        if (getChildCount() != 0) {
            int paddingLeft = getPaddingLeft();
            int width = getWidth() - getPaddingRight();
            int paddingTop = getPaddingTop();
            int height = getHeight() - getPaddingBottom();
            View view = this.f30313v;
            int i5 = 0;
            if (view == null || !m38685t(view)) {
                i4 = 0;
                i3 = 0;
                i2 = 0;
                i = 0;
            } else {
                i4 = this.f30313v.getLeft();
                i3 = this.f30313v.getRight();
                i2 = this.f30313v.getTop();
                i = this.f30313v.getBottom();
            }
            View childAt = getChildAt(0);
            int max = Math.max(paddingLeft, childAt.getLeft());
            int max2 = Math.max(paddingTop, childAt.getTop());
            int min = Math.min(width, childAt.getRight());
            int min2 = Math.min(height, childAt.getBottom());
            if (max >= i4 && max2 >= i2 && min <= i3 && min2 <= i) {
                i5 = 4;
            }
            childAt.setVisibility(i5);
        }
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof LayoutParams) && super.checkLayoutParams(layoutParams);
    }

    public void computeScroll() {
        C6793b bVar = this.f30295L;
        if (bVar != null && bVar.mo26429l(true)) {
            if (!isEnabled()) {
                this.f30295L.mo26426a();
            } else {
                C3774v.m16197e0(this);
            }
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int c = C3762j.m16107c(motionEvent);
        if (!isEnabled() || !mo26404u() || (this.f30286C && c != 0)) {
            this.f30295L.mo26426a();
            return super.dispatchTouchEvent(motionEvent);
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (c == 0) {
            this.f30292I = false;
            this.f30288E = x;
            this.f30289F = y;
        } else if (c == 2) {
            float f = y - this.f30289F;
            this.f30288E = x;
            this.f30289F = y;
            if (Math.abs(x - this.f30288E) > Math.abs(f)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            if (!m38686v(this.f30310s, (int) this.f30290G, (int) this.f30291H)) {
                return super.dispatchTouchEvent(motionEvent);
            }
            boolean z = this.f30305n;
            int i = -1;
            if (((float) (z ? 1 : -1)) * f <= 0.0f) {
                if (z) {
                    i = 1;
                }
                if (f * ((float) i) < 0.0f) {
                    if (this.f30317z < 1.0f) {
                        this.f30292I = false;
                        return onTouchEvent(motionEvent);
                    }
                    if (!this.f30292I && this.f30295L.mo26434y()) {
                        this.f30295L.mo26427b();
                        motionEvent.setAction(0);
                    }
                    this.f30292I = true;
                    return super.dispatchTouchEvent(motionEvent);
                }
            } else if (this.f30312u.mo26418a(this.f30310s, z) > 0) {
                this.f30292I = true;
                return super.dispatchTouchEvent(motionEvent);
            } else {
                if (this.f30292I) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.setAction(3);
                    super.dispatchTouchEvent(obtain);
                    obtain.recycle();
                    motionEvent.setAction(0);
                }
                this.f30292I = false;
                return onTouchEvent(motionEvent);
            }
        } else if (c == 1 && this.f30292I) {
            this.f30295L.mo26420F(0);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public void draw(Canvas canvas) {
        View view;
        int i;
        int i2;
        super.draw(canvas);
        if (this.f30301j != null && (view = this.f30313v) != null) {
            int right = view.getRight();
            if (this.f30305n) {
                i2 = this.f30313v.getTop() - this.f30303l;
                i = this.f30313v.getTop();
            } else {
                i2 = this.f30313v.getBottom();
                i = this.f30313v.getBottom() + this.f30303l;
            }
            this.f30301j.setBounds(this.f30313v.getLeft(), i2, right, i);
            this.f30301j.draw(canvas);
        }
    }

    /* access modifiers changed from: protected */
    public boolean drawChild(Canvas canvas, View view, long j) {
        boolean z;
        int save = canvas.save(2);
        View view2 = this.f30313v;
        if (view2 == null || view2 == view) {
            z = super.drawChild(canvas, view, j);
        } else {
            canvas.getClipBounds(this.f30297N);
            if (!this.f30306o) {
                if (this.f30305n) {
                    Rect rect = this.f30297N;
                    rect.bottom = Math.min(rect.bottom, this.f30313v.getTop());
                } else {
                    Rect rect2 = this.f30297N;
                    rect2.top = Math.max(rect2.top, this.f30313v.getBottom());
                }
            }
            if (this.f30307p) {
                canvas.clipRect(this.f30297N);
            }
            z = super.drawChild(canvas, view, j);
            int i = this.f30299h;
            if (i != 0) {
                float f = this.f30317z;
                if (f > 0.0f) {
                    this.f30300i.setColor((i & 16777215) | (((int) (((float) ((-16777216 & i) >>> 24)) * f)) << 24));
                    canvas.drawRect(this.f30297N, this.f30300i);
                }
            }
        }
        canvas.restoreToCount(save);
        return z;
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams();
    }

    /* access modifiers changed from: protected */
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    public float getAnchorPoint() {
        return this.f30285B;
    }

    public int getCoveredFadeColor() {
        return this.f30299h;
    }

    public int getCurrentParallaxOffset() {
        int max = (int) (((float) this.f30304m) * Math.max(this.f30317z, 0.0f));
        return this.f30305n ? -max : max;
    }

    public int getMinFlingVelocity() {
        return this.f30298g;
    }

    public int getPanelHeight() {
        return this.f30302k;
    }

    public C6791e getPanelState() {
        return this.f30315x;
    }

    public int getShadowHeight() {
        return this.f30303l;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f30296M = true;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f30296M = true;
    }

    /* access modifiers changed from: protected */
    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f30309r;
        if (i != -1) {
            setDragView(findViewById(i));
        }
        int i2 = this.f30311t;
        if (i2 != -1) {
            setScrollableView(findViewById(i2));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (r0 != 3) goto L_0x009d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            boolean r0 = r8.f30292I
            r1 = 0
            if (r0 != 0) goto L_0x00a4
            boolean r0 = r8.mo26404u()
            if (r0 != 0) goto L_0x000d
            goto L_0x00a4
        L_0x000d:
            int r0 = p082e.p109h.p119p.C3762j.m16107c(r9)
            float r2 = r9.getX()
            float r3 = r9.getY()
            float r4 = r8.f30290G
            float r4 = r2 - r4
            float r4 = java.lang.Math.abs(r4)
            float r5 = r8.f30291H
            float r5 = r3 - r5
            float r5 = java.lang.Math.abs(r5)
            com.sothree.slidinguppanel.b r6 = r8.f30295L
            int r6 = r6.mo26431v()
            r7 = 1
            if (r0 == 0) goto L_0x0085
            if (r0 == r7) goto L_0x004c
            r2 = 2
            if (r0 == r2) goto L_0x003b
            r2 = 3
            if (r0 == r2) goto L_0x004c
            goto L_0x009d
        L_0x003b:
            float r0 = (float) r6
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            com.sothree.slidinguppanel.b r9 = r8.f30295L
            r9.mo26427b()
            r8.f30286C = r7
            return r1
        L_0x004c:
            com.sothree.slidinguppanel.b r0 = r8.f30295L
            boolean r0 = r0.mo26434y()
            if (r0 == 0) goto L_0x005a
            com.sothree.slidinguppanel.b r0 = r8.f30295L
            r0.mo26419A(r9)
            return r7
        L_0x005a:
            float r0 = (float) r6
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 > 0) goto L_0x009d
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L_0x009d
            float r0 = r8.f30317z
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009d
            android.view.View r0 = r8.f30313v
            float r2 = r8.f30290G
            int r2 = (int) r2
            float r3 = r8.f30291H
            int r3 = (int) r3
            boolean r0 = r8.m38686v(r0, r2, r3)
            if (r0 != 0) goto L_0x009d
            android.view.View$OnClickListener r0 = r8.f30294K
            if (r0 == 0) goto L_0x009d
            r8.playSoundEffect(r1)
            android.view.View$OnClickListener r9 = r8.f30294K
            r9.onClick(r8)
            return r7
        L_0x0085:
            r8.f30286C = r1
            r8.f30290G = r2
            r8.f30291H = r3
            android.view.View r0 = r8.f30308q
            int r2 = (int) r2
            int r3 = (int) r3
            boolean r0 = r8.m38686v(r0, r2, r3)
            if (r0 != 0) goto L_0x009d
            com.sothree.slidinguppanel.b r9 = r8.f30295L
            r9.mo26427b()
            r8.f30286C = r7
            return r1
        L_0x009d:
            com.sothree.slidinguppanel.b r0 = r8.f30295L
            boolean r9 = r0.mo26423I(r9)
            return r9
        L_0x00a4:
            com.sothree.slidinguppanel.b r9 = r8.f30295L
            r9.mo26426a()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sothree.slidinguppanel.SlidingUpPanelLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f30296M) {
            int i5 = C6788b.f30321a[this.f30315x.ordinal()];
            if (i5 == 1) {
                this.f30317z = 1.0f;
            } else if (i5 == 2) {
                this.f30317z = this.f30285B;
            } else if (i5 != 3) {
                this.f30317z = 0.0f;
            } else {
                this.f30317z = m38684q(m38683p(0.0f) + (this.f30305n ? this.f30302k : -this.f30302k));
            }
        }
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (childAt.getVisibility() != 8 || (i6 != 0 && !this.f30296M)) {
                int measuredHeight = childAt.getMeasuredHeight();
                int p = childAt == this.f30313v ? m38683p(this.f30317z) : paddingTop;
                if (!this.f30305n && childAt == this.f30314w && !this.f30306o) {
                    p = m38683p(this.f30317z) + this.f30313v.getMeasuredHeight();
                }
                int i7 = layoutParams.leftMargin + paddingLeft;
                childAt.layout(i7, p, childAt.getMeasuredWidth() + i7, measuredHeight + p);
            }
        }
        if (this.f30296M) {
            mo26360A();
        }
        m38682o();
        this.f30296M = false;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode != 1073741824 && mode != Integer.MIN_VALUE) {
            throw new IllegalStateException("Width must have an exact value or MATCH_PARENT");
        } else if (mode2 == 1073741824 || mode2 == Integer.MIN_VALUE) {
            int childCount = getChildCount();
            if (childCount == 2) {
                this.f30314w = getChildAt(0);
                View childAt = getChildAt(1);
                this.f30313v = childAt;
                if (this.f30308q == null) {
                    setDragView(childAt);
                }
                if (this.f30313v.getVisibility() != 0) {
                    this.f30315x = C6791e.HIDDEN;
                }
                int paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
                int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
                for (int i7 = 0; i7 < childCount; i7++) {
                    View childAt2 = getChildAt(i7);
                    LayoutParams layoutParams = (LayoutParams) childAt2.getLayoutParams();
                    if (childAt2.getVisibility() != 8 || i7 != 0) {
                        if (childAt2 == this.f30314w) {
                            i4 = (this.f30306o || this.f30315x == C6791e.HIDDEN) ? paddingTop : paddingTop - this.f30302k;
                            i3 = paddingLeft - (layoutParams.leftMargin + layoutParams.rightMargin);
                        } else {
                            i4 = childAt2 == this.f30313v ? paddingTop - layoutParams.topMargin : paddingTop;
                            i3 = paddingLeft;
                        }
                        int i8 = layoutParams.width;
                        if (i8 == -2) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i3, Integer.MIN_VALUE);
                        } else if (i8 == -1) {
                            i5 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
                        } else {
                            i5 = View.MeasureSpec.makeMeasureSpec(i8, 1073741824);
                        }
                        int i9 = layoutParams.height;
                        if (i9 == -2) {
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, Integer.MIN_VALUE);
                        } else {
                            float f = layoutParams.f30319a;
                            if (f > 0.0f && f < 1.0f) {
                                i4 = (int) (((float) i4) * f);
                            } else if (i9 != -1) {
                                i4 = i9;
                            }
                            i6 = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
                        }
                        childAt2.measure(i5, i6);
                        View view = this.f30313v;
                        if (childAt2 == view) {
                            this.f30284A = view.getMeasuredHeight() - this.f30302k;
                        }
                    }
                }
                setMeasuredDimension(size, size2);
                return;
            }
            throw new IllegalStateException("Sliding up panel layout must have exactly 2 children!");
        } else {
            throw new IllegalStateException("Height must have an exact value or MATCH_PARENT");
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            C6791e eVar = (C6791e) bundle.getSerializable("sliding_state");
            this.f30315x = eVar;
            if (eVar == null) {
                eVar = f30282P;
            }
            this.f30315x = eVar;
            parcelable = bundle.getParcelable("superState");
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("superState", super.onSaveInstanceState());
        C6791e eVar = this.f30315x;
        if (eVar == C6791e.DRAGGING) {
            eVar = this.f30316y;
        }
        bundle.putSerializable("sliding_state", eVar);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i2 != i4) {
            this.f30296M = true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled() || !mo26404u()) {
            return super.onTouchEvent(motionEvent);
        }
        try {
            this.f30295L.mo26419A(motionEvent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo26386r(View view) {
        synchronized (this.f30293J) {
            for (C6790d a : this.f30293J) {
                a.mo26416a(view, this.f30317z);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo26387s(View view, C6791e eVar, C6791e eVar2) {
        synchronized (this.f30293J) {
            for (C6790d b : this.f30293J) {
                b.mo26417b(view, eVar, eVar2);
            }
        }
        sendAccessibilityEvent(32);
    }

    public void setAnchorPoint(float f) {
        if (f > 0.0f && f <= 1.0f) {
            this.f30285B = f;
            this.f30296M = true;
            requestLayout();
        }
    }

    public void setClipPanel(boolean z) {
        this.f30307p = z;
    }

    public void setCoveredFadeColor(int i) {
        this.f30299h = i;
        requestLayout();
    }

    public void setDragView(View view) {
        View view2 = this.f30308q;
        if (view2 != null) {
            view2.setOnClickListener((View.OnClickListener) null);
        }
        this.f30308q = view;
        if (view != null) {
            view.setClickable(true);
            this.f30308q.setFocusable(false);
            this.f30308q.setFocusableInTouchMode(false);
            this.f30308q.setOnClickListener(new C6787a());
        }
    }

    public void setFadeOnClickListener(View.OnClickListener onClickListener) {
        this.f30294K = onClickListener;
    }

    public void setGravity(int i) {
        if (i == 48 || i == 80) {
            this.f30305n = i == 80;
            if (!this.f30296M) {
                requestLayout();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("gravity must be set to either top or bottom");
    }

    public void setMinFlingVelocity(int i) {
        this.f30298g = i;
    }

    public void setOverlayed(boolean z) {
        this.f30306o = z;
    }

    public void setPanelHeight(int i) {
        if (getPanelHeight() != i) {
            this.f30302k = i;
            if (!this.f30296M) {
                requestLayout();
            }
            if (getPanelState() == C6791e.COLLAPSED) {
                mo26407z();
                invalidate();
            }
        }
    }

    public void setPanelState(C6791e eVar) {
        C6791e eVar2;
        C6791e eVar3;
        if (this.f30295L.mo26432w() == 2) {
            Log.d(f30281O, "View is settling. Aborting animation.");
            this.f30295L.mo26426a();
        }
        if (eVar == null || eVar == (eVar2 = C6791e.DRAGGING)) {
            throw new IllegalArgumentException("Panel state cannot be null or DRAGGING.");
        } else if (isEnabled()) {
            boolean z = this.f30296M;
            if ((z || this.f30313v != null) && eVar != (eVar3 = this.f30315x) && eVar3 != eVar2) {
                if (z) {
                    setPanelStateInternal(eVar);
                    return;
                }
                if (eVar3 == C6791e.HIDDEN) {
                    this.f30313v.setVisibility(0);
                    requestLayout();
                }
                int i = C6788b.f30321a[eVar.ordinal()];
                if (i == 1) {
                    mo26406y(1.0f, 0);
                } else if (i == 2) {
                    mo26406y(this.f30285B, 0);
                } else if (i == 3) {
                    mo26406y(m38684q(m38683p(0.0f) + (this.f30305n ? this.f30302k : -this.f30302k)), 0);
                } else if (i == 4) {
                    mo26406y(0.0f, 0);
                }
            }
        }
    }

    public void setParallaxOffset(int i) {
        this.f30304m = i;
        if (!this.f30296M) {
            requestLayout();
        }
    }

    public void setScrollableView(View view) {
        this.f30310s = view;
    }

    public void setScrollableViewHelper(C6792a aVar) {
        this.f30312u = aVar;
    }

    public void setShadowHeight(int i) {
        this.f30303l = i;
        if (!this.f30296M) {
            invalidate();
        }
    }

    public void setTouchEnabled(boolean z) {
        this.f30287D = z;
    }

    /* renamed from: u */
    public boolean mo26404u() {
        return (!this.f30287D || this.f30313v == null || this.f30315x == C6791e.HIDDEN) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo26405x() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo26406y(float f, int i) {
        if (isEnabled() && this.f30313v != null) {
            int p = m38683p(f);
            C6793b bVar = this.f30295L;
            View view = this.f30313v;
            if (bVar.mo26424J(view, view.getLeft(), p)) {
                mo26405x();
                C3774v.m16197e0(this);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo26407z() {
        mo26406y(0.0f, 0);
    }

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {

        /* renamed from: b */
        private static final int[] f30318b = {16843137};

        /* renamed from: a */
        public float f30319a = 0.0f;

        public LayoutParams() {
            super(-1, -1);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f30318b);
            if (obtainStyledAttributes != null) {
                this.f30319a = obtainStyledAttributes.getFloat(0, 0.0f);
                obtainStyledAttributes.recycle();
            }
        }
    }

    public SlidingUpPanelLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00f3  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ff  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0133  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SlidingUpPanelLayout(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            r8.<init>(r9, r10, r11)
            r11 = 400(0x190, float:5.6E-43)
            r8.f30298g = r11
            r0 = -1728053248(0xffffffff99000000, float:-6.617445E-24)
            r8.f30299h = r0
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            r8.f30300i = r1
            r1 = -1
            r8.f30302k = r1
            r8.f30303l = r1
            r8.f30304m = r1
            r2 = 0
            r8.f30306o = r2
            r3 = 1
            r8.f30307p = r3
            r8.f30309r = r1
            com.sothree.slidinguppanel.a r4 = new com.sothree.slidinguppanel.a
            r4.<init>()
            r8.f30312u = r4
            com.sothree.slidinguppanel.SlidingUpPanelLayout$e r4 = f30282P
            r8.f30315x = r4
            r8.f30316y = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r8.f30285B = r4
            r8.f30292I = r2
            java.util.concurrent.CopyOnWriteArrayList r5 = new java.util.concurrent.CopyOnWriteArrayList
            r5.<init>()
            r8.f30293J = r5
            r8.f30296M = r3
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            r8.f30297N = r5
            boolean r5 = r8.isInEditMode()
            r6 = 0
            if (r5 == 0) goto L_0x0050
            r8.f30301j = r6
            r8.f30295L = r6
            return
        L_0x0050:
            if (r10 == 0) goto L_0x00e2
            int[] r5 = f30283Q
            android.content.res.TypedArray r5 = r9.obtainStyledAttributes(r10, r5)
            if (r5 == 0) goto L_0x0064
            int r7 = r5.getInt(r2, r2)
            r8.setGravity(r7)
            r5.recycle()
        L_0x0064:
            int[] r5 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout
            android.content.res.TypedArray r10 = r9.obtainStyledAttributes(r10, r5)
            if (r10 == 0) goto L_0x00e2
            int r5 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoPanelHeight
            int r5 = r10.getDimensionPixelSize(r5, r1)
            r8.f30302k = r5
            int r5 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoShadowHeight
            int r5 = r10.getDimensionPixelSize(r5, r1)
            r8.f30303l = r5
            int r5 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoParallaxOffset
            int r5 = r10.getDimensionPixelSize(r5, r1)
            r8.f30304m = r5
            int r5 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoFlingVelocity
            int r11 = r10.getInt(r5, r11)
            r8.f30298g = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoFadeColor
            int r11 = r10.getColor(r11, r0)
            r8.f30299h = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoDragView
            int r11 = r10.getResourceId(r11, r1)
            r8.f30309r = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoScrollableView
            int r11 = r10.getResourceId(r11, r1)
            r8.f30311t = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoOverlay
            boolean r11 = r10.getBoolean(r11, r2)
            r8.f30306o = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoClipPanel
            boolean r11 = r10.getBoolean(r11, r3)
            r8.f30307p = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoAnchorPoint
            float r11 = r10.getFloat(r11, r4)
            r8.f30285B = r11
            com.sothree.slidinguppanel.SlidingUpPanelLayout$e[] r11 = com.sothree.slidinguppanel.SlidingUpPanelLayout.C6791e.values()
            int r0 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoInitialState
            com.sothree.slidinguppanel.SlidingUpPanelLayout$e r4 = f30282P
            int r4 = r4.ordinal()
            int r0 = r10.getInt(r0, r4)
            r11 = r11[r0]
            r8.f30315x = r11
            int r11 = com.sothree.slidinguppanel.p271c.C6798b.SlidingUpPanelLayout_umanoScrollInterpolator
            int r11 = r10.getResourceId(r11, r1)
            if (r11 == r1) goto L_0x00dd
            android.view.animation.Interpolator r11 = android.view.animation.AnimationUtils.loadInterpolator(r9, r11)
            goto L_0x00de
        L_0x00dd:
            r11 = r6
        L_0x00de:
            r10.recycle()
            goto L_0x00e3
        L_0x00e2:
            r11 = r6
        L_0x00e3:
            android.content.res.Resources r9 = r9.getResources()
            android.util.DisplayMetrics r9 = r9.getDisplayMetrics()
            float r9 = r9.density
            int r10 = r8.f30302k
            r0 = 1056964608(0x3f000000, float:0.5)
            if (r10 != r1) goto L_0x00fb
            r10 = 1116209152(0x42880000, float:68.0)
            float r10 = r10 * r9
            float r10 = r10 + r0
            int r10 = (int) r10
            r8.f30302k = r10
        L_0x00fb:
            int r10 = r8.f30303l
            if (r10 != r1) goto L_0x0107
            r10 = 1082130432(0x40800000, float:4.0)
            float r10 = r10 * r9
            float r10 = r10 + r0
            int r10 = (int) r10
            r8.f30303l = r10
        L_0x0107:
            int r10 = r8.f30304m
            if (r10 != r1) goto L_0x0111
            r10 = 0
            float r10 = r10 * r9
            int r10 = (int) r10
            r8.f30304m = r10
        L_0x0111:
            int r10 = r8.f30303l
            if (r10 <= 0) goto L_0x0133
            boolean r10 = r8.f30305n
            if (r10 == 0) goto L_0x0126
            android.content.res.Resources r10 = r8.getResources()
            int r1 = com.sothree.slidinguppanel.p271c.C6797a.above_shadow
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r1)
            r8.f30301j = r10
            goto L_0x0135
        L_0x0126:
            android.content.res.Resources r10 = r8.getResources()
            int r1 = com.sothree.slidinguppanel.p271c.C6797a.below_shadow
            android.graphics.drawable.Drawable r10 = r10.getDrawable(r1)
            r8.f30301j = r10
            goto L_0x0135
        L_0x0133:
            r8.f30301j = r6
        L_0x0135:
            r8.setWillNotDraw(r2)
            com.sothree.slidinguppanel.SlidingUpPanelLayout$c r10 = new com.sothree.slidinguppanel.SlidingUpPanelLayout$c
            r10.<init>(r8, r6)
            com.sothree.slidinguppanel.b r10 = com.sothree.slidinguppanel.C6793b.m38717m(r8, r0, r11, r10)
            r8.f30295L = r10
            int r11 = r8.f30298g
            float r11 = (float) r11
            float r11 = r11 * r9
            r10.mo26421G(r11)
            r8.f30287D = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sothree.slidinguppanel.SlidingUpPanelLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setDragView(int i) {
        this.f30309r = i;
        setDragView(findViewById(i));
    }
}
