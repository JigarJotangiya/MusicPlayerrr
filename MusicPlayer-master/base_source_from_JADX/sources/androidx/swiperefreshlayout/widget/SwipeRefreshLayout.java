package androidx.swiperefreshlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Transformation;
import android.widget.AbsListView;
import android.widget.ListView;
import androidx.core.content.C0506a;
import androidx.core.widget.C0553i;
import p082e.p109h.p119p.C3763k;
import p082e.p109h.p119p.C3764l;
import p082e.p109h.p119p.C3765m;
import p082e.p109h.p119p.C3766n;
import p082e.p109h.p119p.C3767o;
import p082e.p109h.p119p.C3768p;
import p082e.p109h.p119p.C3774v;

public class SwipeRefreshLayout extends ViewGroup implements C3766n, C3765m, C3763k, C3767o {

    /* renamed from: W */
    private static final String f4386W = SwipeRefreshLayout.class.getSimpleName();

    /* renamed from: a0 */
    private static final int[] f4387a0 = {16842766};

    /* renamed from: A */
    private final DecelerateInterpolator f4388A;

    /* renamed from: B */
    C1052a f4389B;

    /* renamed from: C */
    private int f4390C;

    /* renamed from: D */
    protected int f4391D;

    /* renamed from: E */
    float f4392E;

    /* renamed from: F */
    protected int f4393F;

    /* renamed from: G */
    int f4394G;

    /* renamed from: H */
    int f4395H;

    /* renamed from: I */
    C1054b f4396I;

    /* renamed from: J */
    private Animation f4397J;

    /* renamed from: K */
    private Animation f4398K;

    /* renamed from: L */
    private Animation f4399L;

    /* renamed from: M */
    private Animation f4400M;

    /* renamed from: N */
    private Animation f4401N;

    /* renamed from: O */
    boolean f4402O;

    /* renamed from: P */
    private int f4403P;

    /* renamed from: Q */
    boolean f4404Q;

    /* renamed from: R */
    private C1050i f4405R;

    /* renamed from: S */
    private boolean f4406S;

    /* renamed from: T */
    private Animation.AnimationListener f4407T;

    /* renamed from: U */
    private final Animation f4408U;

    /* renamed from: V */
    private final Animation f4409V;

    /* renamed from: g */
    private View f4410g;

    /* renamed from: h */
    C1051j f4411h;

    /* renamed from: i */
    boolean f4412i;

    /* renamed from: j */
    private int f4413j;

    /* renamed from: k */
    private float f4414k;

    /* renamed from: l */
    private float f4415l;

    /* renamed from: m */
    private final C3768p f4416m;

    /* renamed from: n */
    private final C3764l f4417n;

    /* renamed from: o */
    private final int[] f4418o;

    /* renamed from: p */
    private final int[] f4419p;

    /* renamed from: q */
    private final int[] f4420q;

    /* renamed from: r */
    private boolean f4421r;

    /* renamed from: s */
    private int f4422s;

    /* renamed from: t */
    int f4423t;

    /* renamed from: u */
    private float f4424u;

    /* renamed from: v */
    private float f4425v;

    /* renamed from: w */
    private boolean f4426w;

    /* renamed from: x */
    private int f4427x;

    /* renamed from: y */
    boolean f4428y;

    /* renamed from: z */
    private boolean f4429z;

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$a */
    class C1042a implements Animation.AnimationListener {
        C1042a() {
        }

        public void onAnimationEnd(Animation animation) {
            C1051j jVar;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (swipeRefreshLayout.f4412i) {
                swipeRefreshLayout.f4396I.setAlpha(255);
                SwipeRefreshLayout.this.f4396I.start();
                SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
                if (swipeRefreshLayout2.f4402O && (jVar = swipeRefreshLayout2.f4411h) != null) {
                    jVar.mo5827e1();
                }
                SwipeRefreshLayout swipeRefreshLayout3 = SwipeRefreshLayout.this;
                swipeRefreshLayout3.f4423t = swipeRefreshLayout3.f4389B.getTop();
                return;
            }
            swipeRefreshLayout.mo5788r();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$b */
    class C1043b extends Animation {
        C1043b() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$c */
    class C1044c extends Animation {
        C1044c() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.setAnimationProgress(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$d */
    class C1045d extends Animation {

        /* renamed from: g */
        final /* synthetic */ int f4434g;

        /* renamed from: h */
        final /* synthetic */ int f4435h;

        C1045d(int i, int i2) {
            this.f4434g = i;
            this.f4435h = i2;
        }

        public void applyTransformation(float f, Transformation transformation) {
            C1054b bVar = SwipeRefreshLayout.this.f4396I;
            int i = this.f4434g;
            bVar.setAlpha((int) (((float) i) + (((float) (this.f4435h - i)) * f)));
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$e */
    class C1046e implements Animation.AnimationListener {
        C1046e() {
        }

        public void onAnimationEnd(Animation animation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f4428y) {
                swipeRefreshLayout.mo5808x((Animation.AnimationListener) null);
            }
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$f */
    class C1047f extends Animation {
        C1047f() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            int i;
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            if (!swipeRefreshLayout.f4404Q) {
                i = swipeRefreshLayout.f4394G - Math.abs(swipeRefreshLayout.f4393F);
            } else {
                i = swipeRefreshLayout.f4394G;
            }
            SwipeRefreshLayout swipeRefreshLayout2 = SwipeRefreshLayout.this;
            int i2 = swipeRefreshLayout2.f4391D;
            SwipeRefreshLayout.this.setTargetOffsetTopAndBottom((i2 + ((int) (((float) (i - i2)) * f))) - swipeRefreshLayout2.f4389B.getTop());
            SwipeRefreshLayout.this.f4396I.mo5838e(1.0f - f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$g */
    class C1048g extends Animation {
        C1048g() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout.this.mo5787p(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$h */
    class C1049h extends Animation {
        C1049h() {
        }

        public void applyTransformation(float f, Transformation transformation) {
            SwipeRefreshLayout swipeRefreshLayout = SwipeRefreshLayout.this;
            float f2 = swipeRefreshLayout.f4392E;
            swipeRefreshLayout.setAnimationProgress(f2 + ((-f2) * f));
            SwipeRefreshLayout.this.mo5787p(f);
        }
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$i */
    public interface C1050i {
        /* renamed from: a */
        boolean mo5826a(SwipeRefreshLayout swipeRefreshLayout, View view);
    }

    /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$j */
    public interface C1051j {
        /* renamed from: e1 */
        void mo5827e1();
    }

    public SwipeRefreshLayout(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m6031a(int i, Animation.AnimationListener animationListener) {
        this.f4391D = i;
        this.f4408U.reset();
        this.f4408U.setDuration(200);
        this.f4408U.setInterpolator(this.f4388A);
        if (animationListener != null) {
            this.f4389B.mo5828b(animationListener);
        }
        this.f4389B.clearAnimation();
        this.f4389B.startAnimation(this.f4408U);
    }

    /* renamed from: b */
    private void m6032b(int i, Animation.AnimationListener animationListener) {
        if (this.f4428y) {
            m6044y(i, animationListener);
            return;
        }
        this.f4391D = i;
        this.f4409V.reset();
        this.f4409V.setDuration(200);
        this.f4409V.setInterpolator(this.f4388A);
        if (animationListener != null) {
            this.f4389B.mo5828b(animationListener);
        }
        this.f4389B.clearAnimation();
        this.f4389B.startAnimation(this.f4409V);
    }

    /* renamed from: d */
    private void m6033d() {
        this.f4389B = new C1052a(getContext());
        C1054b bVar = new C1054b(getContext());
        this.f4396I = bVar;
        bVar.mo5846l(1);
        this.f4389B.setImageDrawable(this.f4396I);
        this.f4389B.setVisibility(8);
        addView(this.f4389B);
    }

    /* renamed from: f */
    private void m6034f() {
        if (this.f4410g == null) {
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (!childAt.equals(this.f4389B)) {
                    this.f4410g = childAt;
                    return;
                }
            }
        }
    }

    /* renamed from: g */
    private void m6035g(float f) {
        if (f > this.f4414k) {
            m6039s(true, true);
            return;
        }
        this.f4412i = false;
        this.f4396I.mo5844j(0.0f, 0.0f);
        C1046e eVar = null;
        if (!this.f4428y) {
            eVar = new C1046e();
        }
        m6032b(this.f4423t, eVar);
        this.f4396I.mo5836d(false);
    }

    /* renamed from: h */
    private boolean m6036h(Animation animation) {
        return animation != null && animation.hasStarted() && !animation.hasEnded();
    }

    /* renamed from: i */
    private void m6037i(float f) {
        this.f4396I.mo5836d(true);
        float min = Math.min(1.0f, Math.abs(f / this.f4414k));
        float max = (((float) Math.max(((double) min) - 0.4d, 0.0d)) * 5.0f) / 3.0f;
        float abs = Math.abs(f) - this.f4414k;
        int i = this.f4395H;
        if (i <= 0) {
            if (this.f4404Q) {
                i = this.f4394G - this.f4393F;
            } else {
                i = this.f4394G;
            }
        }
        float f2 = (float) i;
        double max2 = (double) (Math.max(0.0f, Math.min(abs, f2 * 2.0f) / f2) / 4.0f);
        float pow = ((float) (max2 - Math.pow(max2, 2.0d))) * 2.0f;
        int i2 = this.f4393F + ((int) ((f2 * min) + (f2 * pow * 2.0f)));
        if (this.f4389B.getVisibility() != 0) {
            this.f4389B.setVisibility(0);
        }
        if (!this.f4428y) {
            this.f4389B.setScaleX(1.0f);
            this.f4389B.setScaleY(1.0f);
        }
        if (this.f4428y) {
            setAnimationProgress(Math.min(1.0f, f / this.f4414k));
        }
        if (f < this.f4414k) {
            if (this.f4396I.getAlpha() > 76 && !m6036h(this.f4399L)) {
                m6043w();
            }
        } else if (this.f4396I.getAlpha() < 255 && !m6036h(this.f4400M)) {
            m6042v();
        }
        this.f4396I.mo5844j(0.0f, Math.min(0.8f, max * 0.8f));
        this.f4396I.mo5838e(Math.min(1.0f, max));
        this.f4396I.mo5840g((((max * 0.4f) - 16.0f) + (pow * 2.0f)) * 0.5f);
        setTargetOffsetTopAndBottom(i2 - this.f4423t);
    }

    /* renamed from: q */
    private void m6038q(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4427x) {
            this.f4427x = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
        }
    }

    /* renamed from: s */
    private void m6039s(boolean z, boolean z2) {
        if (this.f4412i != z) {
            this.f4402O = z2;
            m6034f();
            this.f4412i = z;
            if (z) {
                m6031a(this.f4423t, this.f4407T);
            } else {
                mo5808x(this.f4407T);
            }
        }
    }

    private void setColorViewAlpha(int i) {
        this.f4389B.getBackground().setAlpha(i);
        this.f4396I.setAlpha(i);
    }

    /* renamed from: t */
    private Animation m6040t(int i, int i2) {
        C1045d dVar = new C1045d(i, i2);
        dVar.setDuration(300);
        this.f4389B.mo5828b((Animation.AnimationListener) null);
        this.f4389B.clearAnimation();
        this.f4389B.startAnimation(dVar);
        return dVar;
    }

    /* renamed from: u */
    private void m6041u(float f) {
        float f2 = this.f4425v;
        int i = this.f4413j;
        if (f - f2 > ((float) i) && !this.f4426w) {
            this.f4424u = f2 + ((float) i);
            this.f4426w = true;
            this.f4396I.setAlpha(76);
        }
    }

    /* renamed from: v */
    private void m6042v() {
        this.f4400M = m6040t(this.f4396I.getAlpha(), 255);
    }

    /* renamed from: w */
    private void m6043w() {
        this.f4399L = m6040t(this.f4396I.getAlpha(), 76);
    }

    /* renamed from: y */
    private void m6044y(int i, Animation.AnimationListener animationListener) {
        this.f4391D = i;
        this.f4392E = this.f4389B.getScaleX();
        C1049h hVar = new C1049h();
        this.f4401N = hVar;
        hVar.setDuration(150);
        if (animationListener != null) {
            this.f4389B.mo5828b(animationListener);
        }
        this.f4389B.clearAnimation();
        this.f4389B.startAnimation(this.f4401N);
    }

    /* renamed from: z */
    private void m6045z(Animation.AnimationListener animationListener) {
        this.f4389B.setVisibility(0);
        this.f4396I.setAlpha(255);
        C1043b bVar = new C1043b();
        this.f4397J = bVar;
        bVar.setDuration((long) this.f4422s);
        if (animationListener != null) {
            this.f4389B.mo5828b(animationListener);
        }
        this.f4389B.clearAnimation();
        this.f4389B.startAnimation(this.f4397J);
    }

    /* renamed from: c */
    public boolean mo5768c() {
        C1050i iVar = this.f4405R;
        if (iVar != null) {
            return iVar.mo5826a(this, this.f4410g);
        }
        View view = this.f4410g;
        if (view instanceof ListView) {
            return C0553i.m3405a((ListView) view, -1);
        }
        return view.canScrollVertically(-1);
    }

    public boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.f4417n.mo13174a(f, f2, z);
    }

    public boolean dispatchNestedPreFling(float f, float f2) {
        return this.f4417n.mo13175b(f, f2);
    }

    public boolean dispatchNestedPreScroll(int i, int i2, int[] iArr, int[] iArr2) {
        return this.f4417n.mo13176c(i, i2, iArr, iArr2);
    }

    public boolean dispatchNestedScroll(int i, int i2, int i3, int i4, int[] iArr) {
        return this.f4417n.mo13179f(i, i2, i3, i4, iArr);
    }

    /* renamed from: e */
    public void mo5773e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        if (i5 == 0) {
            this.f4417n.mo13178e(i, i2, i3, i4, iArr, i5, iArr2);
        }
    }

    /* access modifiers changed from: protected */
    public int getChildDrawingOrder(int i, int i2) {
        int i3 = this.f4390C;
        if (i3 < 0) {
            return i2;
        }
        if (i2 == i - 1) {
            return i3;
        }
        return i2 >= i3 ? i2 + 1 : i2;
    }

    public int getNestedScrollAxes() {
        return this.f4416m.mo13188a();
    }

    public int getProgressCircleDiameter() {
        return this.f4403P;
    }

    public int getProgressViewEndOffset() {
        return this.f4394G;
    }

    public int getProgressViewStartOffset() {
        return this.f4393F;
    }

    public boolean hasNestedScrollingParent() {
        return this.f4417n.mo13180j();
    }

    public boolean isNestedScrollingEnabled() {
        return this.f4417n.mo13182l();
    }

    /* renamed from: j */
    public void mo1214j(View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (i5 == 0) {
            int i6 = iArr[1];
            mo5773e(i, i2, i3, i4, this.f4419p, i5, iArr);
            int i7 = i4 - (iArr[1] - i6);
            int i8 = i7 == 0 ? i4 + this.f4419p[1] : i7;
            if (i8 < 0 && !mo5768c()) {
                float abs = this.f4415l + ((float) Math.abs(i8));
                this.f4415l = abs;
                m6037i(abs);
                iArr[1] = iArr[1] + i7;
            }
        }
    }

    /* renamed from: k */
    public void mo1215k(View view, int i, int i2, int i3, int i4, int i5) {
        mo1214j(view, i, i2, i3, i4, i5, this.f4420q);
    }

    /* renamed from: l */
    public boolean mo1216l(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            return onStartNestedScroll(view, view2, i);
        }
        return false;
    }

    /* renamed from: m */
    public void mo1217m(View view, View view2, int i, int i2) {
        if (i2 == 0) {
            onNestedScrollAccepted(view, view2, i);
        }
    }

    /* renamed from: n */
    public void mo1218n(View view, int i) {
        if (i == 0) {
            onStopNestedScroll(view);
        }
    }

    /* renamed from: o */
    public void mo1219o(View view, int i, int i2, int[] iArr, int i3) {
        if (i3 == 0) {
            onNestedPreScroll(view, i, i2, iArr);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mo5788r();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        m6034f();
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4429z && actionMasked == 0) {
            this.f4429z = false;
        }
        if (!isEnabled() || this.f4429z || mo5768c() || this.f4412i || this.f4421r) {
            return false;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    int i = this.f4427x;
                    if (i == -1) {
                        Log.e(f4386W, "Got ACTION_MOVE event but don't have an active pointer id.");
                        return false;
                    }
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    if (findPointerIndex < 0) {
                        return false;
                    }
                    m6041u(motionEvent.getY(findPointerIndex));
                } else if (actionMasked != 3) {
                    if (actionMasked == 6) {
                        m6038q(motionEvent);
                    }
                }
            }
            this.f4426w = false;
            this.f4427x = -1;
        } else {
            setTargetOffsetTopAndBottom(this.f4393F - this.f4389B.getTop());
            int pointerId = motionEvent.getPointerId(0);
            this.f4427x = pointerId;
            this.f4426w = false;
            int findPointerIndex2 = motionEvent.findPointerIndex(pointerId);
            if (findPointerIndex2 < 0) {
                return false;
            }
            this.f4425v = motionEvent.getY(findPointerIndex2);
        }
        return this.f4426w;
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (getChildCount() != 0) {
            if (this.f4410g == null) {
                m6034f();
            }
            View view = this.f4410g;
            if (view != null) {
                int paddingLeft = getPaddingLeft();
                int paddingTop = getPaddingTop();
                view.layout(paddingLeft, paddingTop, ((measuredWidth - getPaddingLeft()) - getPaddingRight()) + paddingLeft, ((measuredHeight - getPaddingTop()) - getPaddingBottom()) + paddingTop);
                int measuredWidth2 = this.f4389B.getMeasuredWidth();
                int measuredHeight2 = this.f4389B.getMeasuredHeight();
                int i5 = measuredWidth / 2;
                int i6 = measuredWidth2 / 2;
                int i7 = this.f4423t;
                this.f4389B.layout(i5 - i6, i7, i5 + i6, measuredHeight2 + i7);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f4410g == null) {
            m6034f();
        }
        View view = this.f4410g;
        if (view != null) {
            view.measure(View.MeasureSpec.makeMeasureSpec((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), 1073741824));
            this.f4389B.measure(View.MeasureSpec.makeMeasureSpec(this.f4403P, 1073741824), View.MeasureSpec.makeMeasureSpec(this.f4403P, 1073741824));
            this.f4390C = -1;
            for (int i3 = 0; i3 < getChildCount(); i3++) {
                if (getChildAt(i3) == this.f4389B) {
                    this.f4390C = i3;
                    return;
                }
            }
        }
    }

    public boolean onNestedFling(View view, float f, float f2, boolean z) {
        return dispatchNestedFling(f, f2, z);
    }

    public boolean onNestedPreFling(View view, float f, float f2) {
        return dispatchNestedPreFling(f, f2);
    }

    public void onNestedPreScroll(View view, int i, int i2, int[] iArr) {
        if (i2 > 0) {
            float f = this.f4415l;
            if (f > 0.0f) {
                float f2 = (float) i2;
                if (f2 > f) {
                    iArr[1] = (int) f;
                    this.f4415l = 0.0f;
                } else {
                    this.f4415l = f - f2;
                    iArr[1] = i2;
                }
                m6037i(this.f4415l);
            }
        }
        if (this.f4404Q && i2 > 0 && this.f4415l == 0.0f && Math.abs(i2 - iArr[1]) > 0) {
            this.f4389B.setVisibility(8);
        }
        int[] iArr2 = this.f4418o;
        if (dispatchNestedPreScroll(i - iArr[0], i2 - iArr[1], iArr2, (int[]) null)) {
            iArr[0] = iArr[0] + iArr2[0];
            iArr[1] = iArr[1] + iArr2[1];
        }
    }

    public void onNestedScroll(View view, int i, int i2, int i3, int i4) {
        mo1214j(view, i, i2, i3, i4, 0, this.f4420q);
    }

    public void onNestedScrollAccepted(View view, View view2, int i) {
        this.f4416m.mo13189b(view, view2, i);
        startNestedScroll(i & 2);
        this.f4415l = 0.0f;
        this.f4421r = true;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setRefreshing(savedState.f4430g);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new SavedState(super.onSaveInstanceState(), this.f4412i);
    }

    public boolean onStartNestedScroll(View view, View view2, int i) {
        return isEnabled() && !this.f4429z && !this.f4412i && (i & 2) != 0;
    }

    public void onStopNestedScroll(View view) {
        this.f4416m.mo13191d(view);
        this.f4421r = false;
        float f = this.f4415l;
        if (f > 0.0f) {
            m6035g(f);
            this.f4415l = 0.0f;
        }
        stopNestedScroll();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (this.f4429z && actionMasked == 0) {
            this.f4429z = false;
        }
        if (!isEnabled() || this.f4429z || mo5768c() || this.f4412i || this.f4421r) {
            return false;
        }
        if (actionMasked == 0) {
            this.f4427x = motionEvent.getPointerId(0);
            this.f4426w = false;
        } else if (actionMasked == 1) {
            int findPointerIndex = motionEvent.findPointerIndex(this.f4427x);
            if (findPointerIndex < 0) {
                Log.e(f4386W, "Got ACTION_UP event but don't have an active pointer id.");
                return false;
            }
            if (this.f4426w) {
                this.f4426w = false;
                m6035g((motionEvent.getY(findPointerIndex) - this.f4424u) * 0.5f);
            }
            this.f4427x = -1;
            return false;
        } else if (actionMasked == 2) {
            int findPointerIndex2 = motionEvent.findPointerIndex(this.f4427x);
            if (findPointerIndex2 < 0) {
                Log.e(f4386W, "Got ACTION_MOVE event but have an invalid active pointer id.");
                return false;
            }
            float y = motionEvent.getY(findPointerIndex2);
            m6041u(y);
            if (this.f4426w) {
                float f = (y - this.f4424u) * 0.5f;
                if (f <= 0.0f) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m6037i(f);
            }
        } else if (actionMasked == 3) {
            return false;
        } else {
            if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                if (actionIndex < 0) {
                    Log.e(f4386W, "Got ACTION_POINTER_DOWN event but have an invalid action index.");
                    return false;
                }
                this.f4427x = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                m6038q(motionEvent);
            }
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public void mo5787p(float f) {
        int i = this.f4391D;
        setTargetOffsetTopAndBottom((i + ((int) (((float) (this.f4393F - i)) * f))) - this.f4389B.getTop());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo5788r() {
        this.f4389B.clearAnimation();
        this.f4396I.stop();
        this.f4389B.setVisibility(8);
        setColorViewAlpha(255);
        if (this.f4428y) {
            setAnimationProgress(0.0f);
        } else {
            setTargetOffsetTopAndBottom(this.f4393F - this.f4423t);
        }
        this.f4423t = this.f4389B.getTop();
    }

    public void requestDisallowInterceptTouchEvent(boolean z) {
        ViewParent parent;
        View view;
        if ((Build.VERSION.SDK_INT >= 21 || !(this.f4410g instanceof AbsListView)) && ((view = this.f4410g) == null || C3774v.m16182U(view))) {
            super.requestDisallowInterceptTouchEvent(z);
        } else if (!this.f4406S && (parent = getParent()) != null) {
            parent.requestDisallowInterceptTouchEvent(z);
        }
    }

    /* access modifiers changed from: package-private */
    public void setAnimationProgress(float f) {
        this.f4389B.setScaleX(f);
        this.f4389B.setScaleY(f);
    }

    @Deprecated
    public void setColorScheme(int... iArr) {
        setColorSchemeResources(iArr);
    }

    public void setColorSchemeColors(int... iArr) {
        m6034f();
        this.f4396I.mo5839f(iArr);
    }

    public void setColorSchemeResources(int... iArr) {
        Context context = getContext();
        int[] iArr2 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = C0506a.m3150b(context, iArr[i]);
        }
        setColorSchemeColors(iArr2);
    }

    public void setDistanceToTriggerSync(int i) {
        this.f4414k = (float) i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (!z) {
            mo5788r();
        }
    }

    @Deprecated
    public void setLegacyRequestDisallowInterceptTouchEventEnabled(boolean z) {
        this.f4406S = z;
    }

    public void setNestedScrollingEnabled(boolean z) {
        this.f4417n.mo13183m(z);
    }

    public void setOnChildScrollUpCallback(C1050i iVar) {
        this.f4405R = iVar;
    }

    public void setOnRefreshListener(C1051j jVar) {
        this.f4411h = jVar;
    }

    @Deprecated
    public void setProgressBackgroundColor(int i) {
        setProgressBackgroundColorSchemeResource(i);
    }

    public void setProgressBackgroundColorSchemeColor(int i) {
        this.f4389B.setBackgroundColor(i);
    }

    public void setProgressBackgroundColorSchemeResource(int i) {
        setProgressBackgroundColorSchemeColor(C0506a.m3150b(getContext(), i));
    }

    public void setRefreshing(boolean z) {
        int i;
        if (!z || this.f4412i == z) {
            m6039s(z, false);
            return;
        }
        this.f4412i = z;
        if (!this.f4404Q) {
            i = this.f4394G + this.f4393F;
        } else {
            i = this.f4394G;
        }
        setTargetOffsetTopAndBottom(i - this.f4423t);
        this.f4402O = false;
        m6045z(this.f4407T);
    }

    public void setSize(int i) {
        if (i == 0 || i == 1) {
            DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
            if (i == 0) {
                this.f4403P = (int) (displayMetrics.density * 56.0f);
            } else {
                this.f4403P = (int) (displayMetrics.density * 40.0f);
            }
            this.f4389B.setImageDrawable((Drawable) null);
            this.f4396I.mo5846l(i);
            this.f4389B.setImageDrawable(this.f4396I);
        }
    }

    public void setSlingshotDistance(int i) {
        this.f4395H = i;
    }

    /* access modifiers changed from: package-private */
    public void setTargetOffsetTopAndBottom(int i) {
        this.f4389B.bringToFront();
        C3774v.m16187Z(this.f4389B, i);
        this.f4423t = this.f4389B.getTop();
    }

    public boolean startNestedScroll(int i) {
        return this.f4417n.mo13184o(i);
    }

    public void stopNestedScroll() {
        this.f4417n.mo13186q();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo5808x(Animation.AnimationListener animationListener) {
        C1044c cVar = new C1044c();
        this.f4398K = cVar;
        cVar.setDuration(150);
        this.f4389B.mo5828b(animationListener);
        this.f4389B.clearAnimation();
        this.f4389B.startAnimation(this.f4398K);
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C1041a();

        /* renamed from: g */
        final boolean f4430g;

        /* renamed from: androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState$a */
        class C1041a implements Parcelable.Creator<SavedState> {
            C1041a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable, boolean z) {
            super(parcelable);
            this.f4430g = z;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f4430g ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4430g = parcel.readByte() != 0;
        }
    }

    public SwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4412i = false;
        this.f4414k = -1.0f;
        this.f4418o = new int[2];
        this.f4419p = new int[2];
        this.f4420q = new int[2];
        this.f4427x = -1;
        this.f4390C = -1;
        this.f4407T = new C1042a();
        this.f4408U = new C1047f();
        this.f4409V = new C1048g();
        this.f4413j = ViewConfiguration.get(context).getScaledTouchSlop();
        this.f4422s = getResources().getInteger(17694721);
        setWillNotDraw(false);
        this.f4388A = new DecelerateInterpolator(2.0f);
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        this.f4403P = (int) (displayMetrics.density * 40.0f);
        m6033d();
        setChildrenDrawingOrderEnabled(true);
        int i = (int) (displayMetrics.density * 64.0f);
        this.f4394G = i;
        this.f4414k = (float) i;
        this.f4416m = new C3768p(this);
        this.f4417n = new C3764l(this);
        setNestedScrollingEnabled(true);
        int i2 = -this.f4403P;
        this.f4423t = i2;
        this.f4393F = i2;
        mo5787p(1.0f);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f4387a0);
        setEnabled(obtainStyledAttributes.getBoolean(0, true));
        obtainStyledAttributes.recycle();
    }
}
