package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p119p.C3704a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7491c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.C7496h;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

class ClockFaceView extends RadialViewGroup implements ClockHandView.C6268d {
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final ClockHandView f29189D;

    /* renamed from: E */
    private final Rect f29190E;

    /* renamed from: F */
    private final RectF f29191F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public final SparseArray<TextView> f29192G;

    /* renamed from: H */
    private final C3704a f29193H;

    /* renamed from: I */
    private final int[] f29194I;

    /* renamed from: J */
    private final float[] f29195J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public final int f29196K;

    /* renamed from: L */
    private final int f29197L;

    /* renamed from: M */
    private final int f29198M;

    /* renamed from: N */
    private final int f29199N;

    /* renamed from: O */
    private String[] f29200O;

    /* renamed from: P */
    private float f29201P;

    /* renamed from: Q */
    private final ColorStateList f29202Q;

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$a */
    class C6263a implements ViewTreeObserver.OnPreDrawListener {
        C6263a() {
        }

        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.mo25089D(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f29189D.mo25097g()) - ClockFaceView.this.f29196K);
            return true;
        }
    }

    /* renamed from: com.google.android.material.timepicker.ClockFaceView$b */
    class C6264b extends C3704a {
        C6264b() {
        }

        /* renamed from: g */
        public void mo3427g(View view, C3736c cVar) {
            super.mo3427g(view, cVar);
            int intValue = ((Integer) view.getTag(C7494f.material_value_index)).intValue();
            if (intValue > 0) {
                cVar.mo13091F0((View) ClockFaceView.this.f29192G.get(intValue - 1));
            }
            cVar.mo13120f0(C3736c.C3739c.m16068a(0, 1, intValue, 1, false, view.isSelected()));
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.materialClockStyle);
    }

    /* renamed from: K */
    private void m37394K() {
        RectF d = this.f29189D.mo25095d();
        for (int i = 0; i < this.f29192G.size(); i++) {
            TextView textView = this.f29192G.get(i);
            if (textView != null) {
                textView.getDrawingRect(this.f29190E);
                this.f29190E.offset(textView.getPaddingLeft(), textView.getPaddingTop());
                offsetDescendantRectToMyCoords(textView, this.f29190E);
                this.f29191F.set(this.f29190E);
                textView.getPaint().setShader(m37395L(d, this.f29191F));
                textView.invalidate();
            }
        }
    }

    /* renamed from: L */
    private RadialGradient m37395L(RectF rectF, RectF rectF2) {
        if (!RectF.intersects(rectF, rectF2)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f29191F.left, rectF.centerY() - this.f29191F.top, rectF.width() * 0.5f, this.f29194I, this.f29195J, Shader.TileMode.CLAMP);
    }

    /* renamed from: M */
    private static float m37396M(float f, float f2, float f3) {
        return Math.max(Math.max(f, f2), f3);
    }

    /* renamed from: O */
    private void m37397O(int i) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f29192G.size();
        for (int i2 = 0; i2 < Math.max(this.f29200O.length, size); i2++) {
            TextView textView = this.f29192G.get(i2);
            if (i2 >= this.f29200O.length) {
                removeView(textView);
                this.f29192G.remove(i2);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(C7496h.material_clockface_textview, this, false);
                    this.f29192G.put(i2, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.f29200O[i2]);
                textView.setTag(C7494f.material_value_index, Integer.valueOf(i2));
                C3774v.m16217o0(textView, this.f29193H);
                textView.setTextColor(this.f29202Q);
                if (i != 0) {
                    textView.setContentDescription(getResources().getString(i, new Object[]{this.f29200O[i2]}));
                }
            }
        }
    }

    /* renamed from: D */
    public void mo25089D(int i) {
        if (i != mo25107C()) {
            super.mo25089D(i);
            this.f29189D.mo25098j(mo25107C());
        }
    }

    /* renamed from: N */
    public void mo25090N(String[] strArr, int i) {
        this.f29200O = strArr;
        m37397O(i);
    }

    /* renamed from: a */
    public void mo25091a(float f, boolean z) {
        if (Math.abs(this.f29201P - f) > 0.001f) {
            this.f29201P = f;
            m37394K();
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3736c.m15976I0(accessibilityNodeInfo).mo13117e0(C3736c.C3738b.m16067b(1, this.f29200O.length, false, 1));
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m37394K();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int M = (int) (((float) this.f29199N) / m37396M(((float) this.f29197L) / ((float) displayMetrics.heightPixels), ((float) this.f29198M) / ((float) displayMetrics.widthPixels), 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(M, 1073741824);
        setMeasuredDimension(M, M);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29190E = new Rect();
        this.f29191F = new RectF();
        this.f29192G = new SparseArray<>();
        this.f29195J = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.ClockFaceView, i, C7499k.Widget_MaterialComponents_TimePicker_Clock);
        Resources resources = getResources();
        ColorStateList a = C7522c.m42014a(context, obtainStyledAttributes, C7500l.ClockFaceView_clockNumberTextColor);
        this.f29202Q = a;
        LayoutInflater.from(context).inflate(C7496h.material_clockface_view, this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(C7494f.material_clock_hand);
        this.f29189D = clockHandView;
        this.f29196K = resources.getDimensionPixelSize(C7492d.material_clock_hand_padding);
        int colorForState = a.getColorForState(new int[]{16842913}, a.getDefaultColor());
        this.f29194I = new int[]{colorForState, colorForState, a.getDefaultColor()};
        clockHandView.mo25094b(this);
        int defaultColor = C3410a.m14542c(context, C7491c.material_timepicker_clockface).getDefaultColor();
        ColorStateList a2 = C7522c.m42014a(context, obtainStyledAttributes, C7500l.ClockFaceView_clockFaceBackgroundColor);
        setBackgroundColor(a2 != null ? a2.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new C6263a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f29193H = new C6264b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        mo25090N(strArr, 0);
        this.f29197L = resources.getDimensionPixelSize(C7492d.material_time_picker_minimum_screen_height);
        this.f29198M = resources.getDimensionPixelSize(C7492d.material_time_picker_minimum_screen_width);
        this.f29199N = resources.getDimensionPixelSize(C7492d.material_clock_size);
    }
}
