package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.material.internal.C6065c;
import com.google.android.material.internal.C6093m;
import com.google.android.material.internal.C6099r;
import com.google.android.material.internal.C6100s;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.slider.C6161a;
import com.google.android.material.slider.C6162b;
import com.google.android.material.theme.p249a.C6260a;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p082e.p083a.p084k.p085a.C3410a;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p119p.C3774v;
import p082e.p109h.p119p.p120e0.C3736c;
import p082e.p124j.p125a.C3800a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7491c;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7498j;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p308p.C7514a;
import p159f.p243f.p245b.p304b.p312t.C7522c;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p316x.C7566a;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends C6161a<S>, T extends C6162b<S>> extends View {

    /* renamed from: i0 */
    private static final String f28737i0 = BaseSlider.class.getSimpleName();

    /* renamed from: j0 */
    static final int f28738j0 = C7499k.Widget_MaterialComponents_Slider;

    /* renamed from: A */
    private int f28739A;

    /* renamed from: B */
    private int f28740B;

    /* renamed from: C */
    private int f28741C;

    /* renamed from: D */
    private int f28742D;

    /* renamed from: E */
    private int f28743E;

    /* renamed from: F */
    private int f28744F;

    /* renamed from: G */
    private int f28745G;

    /* renamed from: H */
    private float f28746H;

    /* renamed from: I */
    private MotionEvent f28747I;

    /* renamed from: J */
    private C6163c f28748J;

    /* renamed from: K */
    private boolean f28749K;

    /* renamed from: L */
    private float f28750L;

    /* renamed from: M */
    private float f28751M;

    /* renamed from: N */
    private ArrayList<Float> f28752N;

    /* renamed from: O */
    private int f28753O;

    /* renamed from: P */
    private int f28754P;

    /* renamed from: Q */
    private float f28755Q;

    /* renamed from: R */
    private float[] f28756R;

    /* renamed from: S */
    private boolean f28757S;

    /* renamed from: T */
    private int f28758T;

    /* renamed from: U */
    private boolean f28759U;

    /* renamed from: V */
    private boolean f28760V;

    /* renamed from: W */
    private boolean f28761W;

    /* renamed from: a0 */
    private ColorStateList f28762a0;

    /* renamed from: b0 */
    private ColorStateList f28763b0;

    /* renamed from: c0 */
    private ColorStateList f28764c0;

    /* renamed from: d0 */
    private ColorStateList f28765d0;

    /* renamed from: e0 */
    private ColorStateList f28766e0;

    /* renamed from: f0 */
    private final C7541h f28767f0;

    /* renamed from: g */
    private final Paint f28768g;

    /* renamed from: g0 */
    private float f28769g0;

    /* renamed from: h */
    private final Paint f28770h;

    /* renamed from: h0 */
    private int f28771h0;

    /* renamed from: i */
    private final Paint f28772i;

    /* renamed from: j */
    private final Paint f28773j;

    /* renamed from: k */
    private final Paint f28774k;

    /* renamed from: l */
    private final Paint f28775l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final C6157e f28776m;

    /* renamed from: n */
    private final AccessibilityManager f28777n;

    /* renamed from: o */
    private BaseSlider<S, L, T>.d f28778o;

    /* renamed from: p */
    private final C6158f f28779p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public final List<C7566a> f28780q;

    /* renamed from: r */
    private final List<L> f28781r;

    /* renamed from: s */
    private final List<T> f28782s;

    /* renamed from: t */
    private boolean f28783t;

    /* renamed from: u */
    private ValueAnimator f28784u;

    /* renamed from: v */
    private ValueAnimator f28785v;

    /* renamed from: w */
    private final int f28786w;

    /* renamed from: x */
    private int f28787x;

    /* renamed from: y */
    private int f28788y;

    /* renamed from: z */
    private int f28789z;

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new C6152a();

        /* renamed from: g */
        float f28790g;

        /* renamed from: h */
        float f28791h;

        /* renamed from: i */
        ArrayList<Float> f28792i;

        /* renamed from: j */
        float f28793j;

        /* renamed from: k */
        boolean f28794k;

        /* renamed from: com.google.android.material.slider.BaseSlider$SliderState$a */
        static class C6152a implements Parcelable.Creator<SliderState> {
            C6152a() {
            }

            /* renamed from: a */
            public SliderState createFromParcel(Parcel parcel) {
                return new SliderState(parcel, (C6153a) null);
            }

            /* renamed from: b */
            public SliderState[] newArray(int i) {
                return new SliderState[i];
            }
        }

        /* synthetic */ SliderState(Parcel parcel, C6153a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.f28790g);
            parcel.writeFloat(this.f28791h);
            parcel.writeList(this.f28792i);
            parcel.writeFloat(this.f28793j);
            parcel.writeBooleanArray(new boolean[]{this.f28794k});
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.f28790g = parcel.readFloat();
            this.f28791h = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.f28792i = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.f28793j = parcel.readFloat();
            this.f28794k = parcel.createBooleanArray()[0];
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$a */
    class C6153a implements C6158f {

        /* renamed from: a */
        final /* synthetic */ AttributeSet f28795a;

        /* renamed from: b */
        final /* synthetic */ int f28796b;

        C6153a(AttributeSet attributeSet, int i) {
            this.f28795a = attributeSet;
            this.f28796b = i;
        }

        /* renamed from: a */
        public C7566a mo24614a() {
            TypedArray h = C6093m.m36563h(BaseSlider.this.getContext(), this.f28795a, C7500l.Slider, this.f28796b, BaseSlider.f28738j0, new int[0]);
            C7566a a = BaseSlider.m36862R(BaseSlider.this.getContext(), h);
            h.recycle();
            return a;
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$b */
    class C6154b implements ValueAnimator.AnimatorUpdateListener {
        C6154b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            for (C7566a B0 : BaseSlider.this.f28780q) {
                B0.mo28557B0(floatValue);
            }
            C3774v.m16197e0(BaseSlider.this);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$c */
    class C6155c extends AnimatorListenerAdapter {
        C6155c() {
        }

        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            for (C7566a b : BaseSlider.this.f28780q) {
                C6100s.m36584e(BaseSlider.this).mo24228b(b);
            }
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$e */
    private static class C6157e extends C3800a {

        /* renamed from: q */
        private final BaseSlider<?, ?, ?> f28802q;

        /* renamed from: r */
        Rect f28803r = new Rect();

        C6157e(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.f28802q = baseSlider;
        }

        /* renamed from: Y */
        private String m36916Y(int i) {
            if (i == this.f28802q.getValues().size() - 1) {
                return this.f28802q.getContext().getString(C7498j.material_slider_range_end);
            }
            return i == 0 ? this.f28802q.getContext().getString(C7498j.material_slider_range_start) : BuildConfig.FLAVOR;
        }

        /* access modifiers changed from: protected */
        /* renamed from: B */
        public int mo13257B(float f, float f2) {
            for (int i = 0; i < this.f28802q.getValues().size(); i++) {
                this.f28802q.mo24537c0(i, this.f28803r);
                if (this.f28803r.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public void mo13258C(List<Integer> list) {
            for (int i = 0; i < this.f28802q.getValues().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: L */
        public boolean mo13263L(int i, int i2, Bundle bundle) {
            if (!this.f28802q.isEnabled()) {
                return false;
            }
            if (i2 == 4096 || i2 == 8192) {
                float g = this.f28802q.m36889k(20);
                if (i2 == 8192) {
                    g = -g;
                }
                if (this.f28802q.mo24535F()) {
                    g = -g;
                }
                if (!this.f28802q.m36871a0(i, C3641a.m15693a(this.f28802q.getValues().get(i).floatValue() + g, this.f28802q.getValueFrom(), this.f28802q.getValueTo()))) {
                    return false;
                }
                this.f28802q.m36876d0();
                this.f28802q.postInvalidate();
                mo13259E(i);
                return true;
            }
            if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                if (this.f28802q.m36871a0(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                    this.f28802q.m36876d0();
                    this.f28802q.postInvalidate();
                    mo13259E(i);
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        /* renamed from: P */
        public void mo13267P(int i, C3736c cVar) {
            cVar.mo13111b(C3736c.C3737a.f11802o);
            List<Float> values = this.f28802q.getValues();
            float floatValue = values.get(i).floatValue();
            float valueFrom = this.f28802q.getValueFrom();
            float valueTo = this.f28802q.getValueTo();
            if (this.f28802q.isEnabled()) {
                if (floatValue > valueFrom) {
                    cVar.mo13109a(8192);
                }
                if (floatValue < valueTo) {
                    cVar.mo13109a(4096);
                }
            }
            cVar.mo13148v0(C3736c.C3740d.m16069a(1, valueFrom, valueTo, floatValue));
            cVar.mo13114c0(SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.f28802q.getContentDescription() != null) {
                sb.append(this.f28802q.getContentDescription());
                sb.append(",");
            }
            if (values.size() > 1) {
                sb.append(m36916Y(i));
                sb.append(this.f28802q.m36906y(floatValue));
            }
            cVar.mo13121g0(sb.toString());
            this.f28802q.mo24537c0(i, this.f28803r);
            cVar.mo13106X(this.f28803r);
        }
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$f */
    private interface C6158f {
        /* renamed from: a */
        C7566a mo24614a();
    }

    public BaseSlider(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: A */
    private float m36847A(int i, float f) {
        float f2 = 0.0f;
        if (this.f28755Q == 0.0f) {
            f2 = getMinSeparation();
        }
        if (this.f28771h0 == 0) {
            f2 = m36897p(f2);
        }
        if (mo24535F()) {
            f2 = -f2;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return C3641a.m15693a(f, i3 < 0 ? this.f28750L : this.f28752N.get(i3).floatValue() + f2, i2 >= this.f28752N.size() ? this.f28751M : this.f28752N.get(i2).floatValue() - f2);
    }

    /* renamed from: B */
    private int m36848B(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    /* renamed from: D */
    private void m36849D() {
        this.f28768g.setStrokeWidth((float) this.f28740B);
        this.f28770h.setStrokeWidth((float) this.f28740B);
        this.f28774k.setStrokeWidth(((float) this.f28740B) / 2.0f);
        this.f28775l.setStrokeWidth(((float) this.f28740B) / 2.0f);
    }

    /* renamed from: E */
    private boolean m36850E() {
        ViewParent parent = getParent();
        while (true) {
            boolean z = false;
            if (!(parent instanceof ViewGroup)) {
                return false;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) {
                z = true;
            }
            if (z && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = parent.getParent();
        }
    }

    /* renamed from: G */
    private void m36851G(Resources resources) {
        this.f28789z = resources.getDimensionPixelSize(C7492d.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7492d.mtrl_slider_track_side_padding);
        this.f28787x = dimensionPixelOffset;
        this.f28741C = dimensionPixelOffset;
        this.f28788y = resources.getDimensionPixelSize(C7492d.mtrl_slider_thumb_radius);
        this.f28742D = resources.getDimensionPixelOffset(C7492d.mtrl_slider_track_top);
        this.f28745G = resources.getDimensionPixelSize(C7492d.mtrl_slider_label_padding);
    }

    /* renamed from: H */
    private void m36852H() {
        if (this.f28755Q > 0.0f) {
            m36880f0();
            int min = Math.min((int) (((this.f28751M - this.f28750L) / this.f28755Q) + 1.0f), (this.f28758T / (this.f28740B * 2)) + 1);
            float[] fArr = this.f28756R;
            if (fArr == null || fArr.length != min * 2) {
                this.f28756R = new float[(min * 2)];
            }
            float f = ((float) this.f28758T) / ((float) (min - 1));
            for (int i = 0; i < min * 2; i += 2) {
                float[] fArr2 = this.f28756R;
                fArr2[i] = ((float) this.f28741C) + (((float) (i / 2)) * f);
                fArr2[i + 1] = (float) m36891l();
            }
        }
    }

    /* renamed from: I */
    private void m36853I(Canvas canvas, int i, int i2) {
        if (m36867X()) {
            int N = (int) (((float) this.f28741C) + (m36858N(this.f28752N.get(this.f28754P).floatValue()) * ((float) i)));
            if (Build.VERSION.SDK_INT < 28) {
                int i3 = this.f28744F;
                canvas.clipRect((float) (N - i3), (float) (i2 - i3), (float) (N + i3), (float) (i3 + i2), Region.Op.UNION);
            }
            canvas.drawCircle((float) N, (float) i2, (float) this.f28744F, this.f28773j);
        }
    }

    /* renamed from: J */
    private void m36854J(Canvas canvas) {
        if (this.f28757S && this.f28755Q > 0.0f) {
            float[] activeRange = getActiveRange();
            int T = m36863T(this.f28756R, activeRange[0]);
            int T2 = m36863T(this.f28756R, activeRange[1]);
            int i = T * 2;
            canvas.drawPoints(this.f28756R, 0, i, this.f28774k);
            int i2 = T2 * 2;
            canvas.drawPoints(this.f28756R, i, i2 - i, this.f28775l);
            float[] fArr = this.f28756R;
            canvas.drawPoints(fArr, i2, fArr.length - i2, this.f28774k);
        }
    }

    /* renamed from: K */
    private void m36855K() {
        this.f28741C = this.f28787x + Math.max(this.f28743E - this.f28788y, 0);
        if (C3774v.m16181T(this)) {
            m36878e0(getWidth());
        }
    }

    /* renamed from: L */
    private boolean m36856L(int i) {
        int i2 = this.f28754P;
        int c = (int) C3641a.m15695c(((long) i2) + ((long) i), 0, (long) (this.f28752N.size() - 1));
        this.f28754P = c;
        if (c == i2) {
            return false;
        }
        if (this.f28753O != -1) {
            this.f28753O = c;
        }
        m36876d0();
        postInvalidate();
        return true;
    }

    /* renamed from: M */
    private boolean m36857M(int i) {
        if (mo24535F()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return m36856L(i);
    }

    /* renamed from: N */
    private float m36858N(float f) {
        float f2 = this.f28750L;
        float f3 = (f - f2) / (this.f28751M - f2);
        return mo24535F() ? 1.0f - f3 : f3;
    }

    /* renamed from: O */
    private Boolean m36859O(int i, KeyEvent keyEvent) {
        if (i != 61) {
            if (i != 66) {
                if (i != 81) {
                    if (i == 69) {
                        m36856L(-1);
                        return Boolean.TRUE;
                    } else if (i != 70) {
                        switch (i) {
                            case 21:
                                m36857M(-1);
                                return Boolean.TRUE;
                            case 22:
                                m36857M(1);
                                return Boolean.TRUE;
                            case 23:
                                break;
                            default:
                                return null;
                        }
                    }
                }
                m36856L(1);
                return Boolean.TRUE;
            }
            this.f28753O = this.f28754P;
            postInvalidate();
            return Boolean.TRUE;
        } else if (keyEvent.hasNoModifiers()) {
            return Boolean.valueOf(m36856L(1));
        } else {
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(m36856L(-1));
            }
            return Boolean.FALSE;
        }
    }

    /* renamed from: P */
    private void m36860P() {
        for (T a : this.f28782s) {
            a.mo24629a(this);
        }
    }

    /* renamed from: Q */
    private void m36861Q() {
        for (T b : this.f28782s) {
            b.mo24630b(this);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R */
    public static C7566a m36862R(Context context, TypedArray typedArray) {
        return C7566a.m42282u0(context, (AttributeSet) null, 0, typedArray.getResourceId(C7500l.Slider_labelStyle, C7499k.Widget_MaterialComponents_Tooltip));
    }

    /* renamed from: T */
    private static int m36863T(float[] fArr, float f) {
        return Math.round(f * ((float) ((fArr.length / 2) - 1)));
    }

    /* renamed from: U */
    private void m36864U(Context context, AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        TypedArray h = C6093m.m36563h(context, attributeSet, C7500l.Slider, i, f28738j0, new int[0]);
        this.f28750L = h.getFloat(C7500l.Slider_android_valueFrom, 0.0f);
        this.f28751M = h.getFloat(C7500l.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.f28750L));
        this.f28755Q = h.getFloat(C7500l.Slider_android_stepSize, 0.0f);
        int i4 = C7500l.Slider_trackColor;
        boolean hasValue = h.hasValue(i4);
        if (hasValue) {
            i2 = i4;
        } else {
            i2 = C7500l.Slider_trackColorInactive;
        }
        if (!hasValue) {
            i4 = C7500l.Slider_trackColorActive;
        }
        ColorStateList a = C7522c.m42014a(context, h, i2);
        if (a == null) {
            a = C3410a.m14542c(context, C7491c.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(a);
        ColorStateList a2 = C7522c.m42014a(context, h, i4);
        if (a2 == null) {
            a2 = C3410a.m14542c(context, C7491c.material_slider_active_track_color);
        }
        setTrackActiveTintList(a2);
        this.f28767f0.mo28463a0(C7522c.m42014a(context, h, C7500l.Slider_thumbColor));
        int i5 = C7500l.Slider_thumbStrokeColor;
        if (h.hasValue(i5)) {
            setThumbStrokeColor(C7522c.m42014a(context, h, i5));
        }
        setThumbStrokeWidth(h.getDimension(C7500l.Slider_thumbStrokeWidth, 0.0f));
        ColorStateList a3 = C7522c.m42014a(context, h, C7500l.Slider_haloColor);
        if (a3 == null) {
            a3 = C3410a.m14542c(context, C7491c.material_slider_halo_color);
        }
        setHaloTintList(a3);
        this.f28757S = h.getBoolean(C7500l.Slider_tickVisible, true);
        int i6 = C7500l.Slider_tickColor;
        boolean hasValue2 = h.hasValue(i6);
        if (hasValue2) {
            i3 = i6;
        } else {
            i3 = C7500l.Slider_tickColorInactive;
        }
        if (!hasValue2) {
            i6 = C7500l.Slider_tickColorActive;
        }
        ColorStateList a4 = C7522c.m42014a(context, h, i3);
        if (a4 == null) {
            a4 = C3410a.m14542c(context, C7491c.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(a4);
        ColorStateList a5 = C7522c.m42014a(context, h, i6);
        if (a5 == null) {
            a5 = C3410a.m14542c(context, C7491c.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(a5);
        setThumbRadius(h.getDimensionPixelSize(C7500l.Slider_thumbRadius, 0));
        setHaloRadius(h.getDimensionPixelSize(C7500l.Slider_haloRadius, 0));
        setThumbElevation(h.getDimension(C7500l.Slider_thumbElevation, 0.0f));
        setTrackHeight(h.getDimensionPixelSize(C7500l.Slider_trackHeight, 0));
        this.f28739A = h.getInt(C7500l.Slider_labelBehavior, 0);
        if (!h.getBoolean(C7500l.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        h.recycle();
    }

    /* renamed from: V */
    private void m36865V(int i) {
        BaseSlider<S, L, T>.d dVar = this.f28778o;
        if (dVar == null) {
            this.f28778o = new C6156d(this, (C6153a) null);
        } else {
            removeCallbacks(dVar);
        }
        this.f28778o.mo24617a(i);
        postDelayed(this.f28778o, 200);
    }

    /* renamed from: W */
    private void m36866W(C7566a aVar, float f) {
        aVar.mo28558C0(m36906y(f));
        int N = (this.f28741C + ((int) (m36858N(f) * ((float) this.f28758T)))) - (aVar.getIntrinsicWidth() / 2);
        int l = m36891l() - (this.f28745G + this.f28743E);
        aVar.setBounds(N, l - aVar.getIntrinsicHeight(), aVar.getIntrinsicWidth() + N, l);
        Rect rect = new Rect(aVar.getBounds());
        C6065c.m36467c(C6100s.m36583d(this), this, rect);
        aVar.setBounds(rect);
        C6100s.m36584e(this).mo24227a(aVar);
    }

    /* renamed from: X */
    private boolean m36867X() {
        return this.f28759U || Build.VERSION.SDK_INT < 21 || !(getBackground() instanceof RippleDrawable);
    }

    /* renamed from: Y */
    private boolean m36868Y(float f) {
        return m36871a0(this.f28753O, f);
    }

    /* renamed from: Z */
    private double m36869Z(float f) {
        float f2 = this.f28755Q;
        if (f2 <= 0.0f) {
            return (double) f;
        }
        int i = (int) ((this.f28751M - this.f28750L) / f2);
        return ((double) Math.round(f * ((float) i))) / ((double) i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a0 */
    public boolean m36871a0(int i, float f) {
        if (((double) Math.abs(f - this.f28752N.get(i).floatValue())) < 1.0E-4d) {
            return false;
        }
        this.f28752N.set(i, Float.valueOf(m36847A(i, f)));
        this.f28754P = i;
        m36898q(i);
        return true;
    }

    /* renamed from: b0 */
    private boolean m36873b0() {
        return m36868Y(getValueOfTouchPosition());
    }

    /* access modifiers changed from: private */
    /* renamed from: d0 */
    public void m36876d0() {
        if (!m36867X() && getMeasuredWidth() > 0) {
            Drawable background = getBackground();
            if (background instanceof RippleDrawable) {
                int N = (int) ((m36858N(this.f28752N.get(this.f28754P).floatValue()) * ((float) this.f28758T)) + ((float) this.f28741C));
                int l = m36891l();
                int i = this.f28744F;
                C0534a.m3286l(background, N - i, l - i, N + i, l + i);
            }
        }
    }

    /* renamed from: e0 */
    private void m36878e0(int i) {
        this.f28758T = Math.max(i - (this.f28741C * 2), 0);
        m36852H();
    }

    /* renamed from: f0 */
    private void m36880f0() {
        if (this.f28761W) {
            m36884h0();
            m36886i0();
            m36882g0();
            m36888j0();
            m36894m0();
            this.f28761W = false;
        }
    }

    /* renamed from: g0 */
    private void m36882g0() {
        if (this.f28755Q > 0.0f && !m36890k0(this.f28751M)) {
            throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(this.f28755Q), Float.toString(this.f28750L), Float.toString(this.f28751M)}));
        }
    }

    private float[] getActiveRange() {
        float floatValue = ((Float) Collections.max(getValues())).floatValue();
        float floatValue2 = ((Float) Collections.min(getValues())).floatValue();
        if (this.f28752N.size() == 1) {
            floatValue2 = this.f28750L;
        }
        float N = m36858N(floatValue2);
        float N2 = m36858N(floatValue);
        if (mo24535F()) {
            return new float[]{N2, N};
        }
        return new float[]{N, N2};
    }

    private float getValueOfTouchPosition() {
        double Z = m36869Z(this.f28769g0);
        if (mo24535F()) {
            Z = 1.0d - Z;
        }
        float f = this.f28751M;
        float f2 = this.f28750L;
        return (float) ((Z * ((double) (f - f2))) + ((double) f2));
    }

    private float getValueOfTouchPositionAbsolute() {
        float f = this.f28769g0;
        if (mo24535F()) {
            f = 1.0f - f;
        }
        float f2 = this.f28751M;
        float f3 = this.f28750L;
        return (f * (f2 - f3)) + f3;
    }

    /* renamed from: h */
    private void m36883h(C7566a aVar) {
        aVar.mo28556A0(C6100s.m36583d(this));
    }

    /* renamed from: h0 */
    private void m36884h0() {
        if (this.f28750L >= this.f28751M) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", new Object[]{Float.toString(this.f28750L), Float.toString(this.f28751M)}));
        }
    }

    /* renamed from: i */
    private Float m36885i(int i) {
        float k = this.f28760V ? m36889k(20) : m36887j();
        if (i == 21) {
            if (!mo24535F()) {
                k = -k;
            }
            return Float.valueOf(k);
        } else if (i == 22) {
            if (mo24535F()) {
                k = -k;
            }
            return Float.valueOf(k);
        } else if (i == 69) {
            return Float.valueOf(-k);
        } else {
            if (i == 70 || i == 81) {
                return Float.valueOf(k);
            }
            return null;
        }
    }

    /* renamed from: i0 */
    private void m36886i0() {
        if (this.f28751M <= this.f28750L) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", new Object[]{Float.toString(this.f28751M), Float.toString(this.f28750L)}));
        }
    }

    /* renamed from: j */
    private float m36887j() {
        float f = this.f28755Q;
        if (f == 0.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: j0 */
    private void m36888j0() {
        Iterator<Float> it = this.f28752N.iterator();
        while (it.hasNext()) {
            Float next = it.next();
            if (next.floatValue() < this.f28750L || next.floatValue() > this.f28751M) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.f28750L), Float.toString(this.f28751M)}));
            } else if (this.f28755Q > 0.0f && !m36890k0(next.floatValue())) {
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", new Object[]{Float.toString(next.floatValue()), Float.toString(this.f28750L), Float.toString(this.f28755Q), Float.toString(this.f28755Q)}));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public float m36889k(int i) {
        float j = m36887j();
        float f = (this.f28751M - this.f28750L) / j;
        float f2 = (float) i;
        if (f <= f2) {
            return j;
        }
        return ((float) Math.round(f / f2)) * j;
    }

    /* renamed from: k0 */
    private boolean m36890k0(float f) {
        double doubleValue = new BigDecimal(Float.toString(f)).subtract(new BigDecimal(Float.toString(this.f28750L))).divide(new BigDecimal(Float.toString(this.f28755Q)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(doubleValue)) - doubleValue) < 1.0E-4d;
    }

    /* renamed from: l */
    private int m36891l() {
        int i = this.f28742D;
        int i2 = 0;
        if (this.f28739A == 1) {
            i2 = this.f28780q.get(0).getIntrinsicHeight();
        }
        return i + i2;
    }

    /* renamed from: l0 */
    private float m36892l0(float f) {
        return (m36858N(f) * ((float) this.f28758T)) + ((float) this.f28741C);
    }

    /* renamed from: m */
    private ValueAnimator m36893m(boolean z) {
        float f = 0.0f;
        float z2 = m36907z(z ? this.f28785v : this.f28784u, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{z2, f});
        ofFloat.setDuration(z ? 83 : 117);
        ofFloat.setInterpolator(z ? C7501a.f32703e : C7501a.f32701c);
        ofFloat.addUpdateListener(new C6154b());
        return ofFloat;
    }

    /* renamed from: m0 */
    private void m36894m0() {
        float f = this.f28755Q;
        if (f != 0.0f) {
            if (((float) ((int) f)) != f) {
                Log.w(f28737i0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"stepSize", Float.valueOf(f)}));
            }
            float f2 = this.f28750L;
            if (((float) ((int) f2)) != f2) {
                Log.w(f28737i0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"valueFrom", Float.valueOf(f2)}));
            }
            float f3 = this.f28751M;
            if (((float) ((int) f3)) != f3) {
                Log.w(f28737i0, String.format("Floating point value used for %s(%s). Using floats can have rounding errors which may result in incorrect values. Instead, consider using integers with a custom LabelFormatter to display the  value correctly.", new Object[]{"valueTo", Float.valueOf(f3)}));
            }
        }
    }

    /* renamed from: n */
    private void m36895n() {
        if (this.f28780q.size() > this.f28752N.size()) {
            List<C7566a> subList = this.f28780q.subList(this.f28752N.size(), this.f28780q.size());
            for (C7566a next : subList) {
                if (C3774v.m16180S(this)) {
                    m36896o(next);
                }
            }
            subList.clear();
        }
        while (this.f28780q.size() < this.f28752N.size()) {
            C7566a a = this.f28779p.mo24614a();
            this.f28780q.add(a);
            if (C3774v.m16180S(this)) {
                m36883h(a);
            }
        }
        int i = 1;
        if (this.f28780q.size() == 1) {
            i = 0;
        }
        for (C7566a m0 : this.f28780q) {
            m0.mo28481m0((float) i);
        }
    }

    /* renamed from: o */
    private void m36896o(C7566a aVar) {
        C6099r e = C6100s.m36584e(this);
        if (e != null) {
            e.mo24228b(aVar);
            aVar.mo28562w0(C6100s.m36583d(this));
        }
    }

    /* renamed from: p */
    private float m36897p(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        float f2 = (f - ((float) this.f28741C)) / ((float) this.f28758T);
        float f3 = this.f28750L;
        return (f2 * (f3 - this.f28751M)) + f3;
    }

    /* renamed from: q */
    private void m36898q(int i) {
        for (L a : this.f28781r) {
            a.mo24628a(this, this.f28752N.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.f28777n;
        if (accessibilityManager != null && accessibilityManager.isEnabled()) {
            m36865V(i);
        }
    }

    /* renamed from: r */
    private void m36899r() {
        for (L l : this.f28781r) {
            Iterator<Float> it = this.f28752N.iterator();
            while (it.hasNext()) {
                l.mo24628a(this, it.next().floatValue(), false);
            }
        }
    }

    /* renamed from: s */
    private void m36900s(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f28741C;
        float f = (float) i;
        float f2 = (float) i2;
        Canvas canvas2 = canvas;
        canvas2.drawLine(((float) i3) + (activeRange[0] * f), f2, ((float) i3) + (activeRange[1] * f), f2, this.f28770h);
    }

    private void setValuesInternal(ArrayList<Float> arrayList) {
        if (!arrayList.isEmpty()) {
            Collections.sort(arrayList);
            if (this.f28752N.size() != arrayList.size() || !this.f28752N.equals(arrayList)) {
                this.f28752N = arrayList;
                this.f28761W = true;
                this.f28754P = 0;
                m36876d0();
                m36895n();
                m36899r();
                postInvalidate();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("At least one value must be set");
    }

    /* renamed from: t */
    private void m36901t(Canvas canvas, int i, int i2) {
        float[] activeRange = getActiveRange();
        int i3 = this.f28741C;
        float f = (float) i;
        float f2 = ((float) i3) + (activeRange[1] * f);
        if (f2 < ((float) (i3 + i))) {
            float f3 = (float) i2;
            canvas.drawLine(f2, f3, (float) (i3 + i), f3, this.f28768g);
        }
        int i4 = this.f28741C;
        float f4 = ((float) i4) + (activeRange[0] * f);
        if (f4 > ((float) i4)) {
            float f5 = (float) i2;
            canvas.drawLine((float) i4, f5, f4, f5, this.f28768g);
        }
    }

    /* renamed from: u */
    private void m36902u(Canvas canvas, int i, int i2) {
        if (!isEnabled()) {
            Iterator<Float> it = this.f28752N.iterator();
            while (it.hasNext()) {
                canvas.drawCircle(((float) this.f28741C) + (m36858N(it.next().floatValue()) * ((float) i)), (float) i2, (float) this.f28743E, this.f28772i);
            }
        }
        Iterator<Float> it2 = this.f28752N.iterator();
        while (it2.hasNext()) {
            canvas.save();
            int N = this.f28741C + ((int) (m36858N(it2.next().floatValue()) * ((float) i)));
            int i3 = this.f28743E;
            canvas.translate((float) (N - i3), (float) (i2 - i3));
            this.f28767f0.draw(canvas);
            canvas.restore();
        }
    }

    /* renamed from: v */
    private void m36903v() {
        if (this.f28739A != 2) {
            if (!this.f28783t) {
                this.f28783t = true;
                ValueAnimator m = m36893m(true);
                this.f28784u = m;
                this.f28785v = null;
                m.start();
            }
            Iterator<C7566a> it = this.f28780q.iterator();
            for (int i = 0; i < this.f28752N.size() && it.hasNext(); i++) {
                if (i != this.f28754P) {
                    m36866W(it.next(), this.f28752N.get(i).floatValue());
                }
            }
            if (it.hasNext()) {
                m36866W(it.next(), this.f28752N.get(this.f28754P).floatValue());
            } else {
                throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", new Object[]{Integer.valueOf(this.f28780q.size()), Integer.valueOf(this.f28752N.size())}));
            }
        }
    }

    /* renamed from: w */
    private void m36904w() {
        if (this.f28783t) {
            this.f28783t = false;
            ValueAnimator m = m36893m(false);
            this.f28785v = m;
            this.f28784u = null;
            m.addListener(new C6155c());
            this.f28785v.start();
        }
    }

    /* renamed from: x */
    private void m36905x(int i) {
        if (i == 1) {
            m36856L(Integer.MAX_VALUE);
        } else if (i == 2) {
            m36856L(Integer.MIN_VALUE);
        } else if (i == 17) {
            m36857M(Integer.MAX_VALUE);
        } else if (i == 66) {
            m36857M(Integer.MIN_VALUE);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: y */
    public String m36906y(float f) {
        if (mo24534C()) {
            return this.f28748J.mo24631a(f);
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", new Object[]{Float.valueOf(f)});
    }

    /* renamed from: z */
    private static float m36907z(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return floatValue;
    }

    /* renamed from: C */
    public boolean mo24534C() {
        return this.f28748J != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final boolean mo24535F() {
        return C3774v.m16151B(this) == 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public boolean mo24536S() {
        if (this.f28753O != -1) {
            return true;
        }
        float valueOfTouchPositionAbsolute = getValueOfTouchPositionAbsolute();
        float l0 = m36892l0(valueOfTouchPositionAbsolute);
        this.f28753O = 0;
        float abs = Math.abs(this.f28752N.get(0).floatValue() - valueOfTouchPositionAbsolute);
        for (int i = 1; i < this.f28752N.size(); i++) {
            float abs2 = Math.abs(this.f28752N.get(i).floatValue() - valueOfTouchPositionAbsolute);
            float l02 = m36892l0(this.f28752N.get(i).floatValue());
            if (Float.compare(abs2, abs) > 1) {
                break;
            }
            boolean z = !mo24535F() ? l02 - l0 < 0.0f : l02 - l0 > 0.0f;
            if (Float.compare(abs2, abs) < 0) {
                this.f28753O = i;
            } else {
                if (Float.compare(abs2, abs) != 0) {
                    continue;
                } else if (Math.abs(l02 - l0) < ((float) this.f28786w)) {
                    this.f28753O = -1;
                    return false;
                } else if (z) {
                    this.f28753O = i;
                }
            }
            abs = abs2;
        }
        if (this.f28753O != -1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo24537c0(int i, Rect rect) {
        int N = this.f28741C + ((int) (m36858N(getValues().get(i).floatValue()) * ((float) this.f28758T)));
        int l = m36891l();
        int i2 = this.f28743E;
        rect.set(N - i2, l - i2, N + i2, l + i2);
    }

    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.f28776m.mo13273v(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        this.f28768g.setColor(m36848B(this.f28766e0));
        this.f28770h.setColor(m36848B(this.f28765d0));
        this.f28774k.setColor(m36848B(this.f28764c0));
        this.f28775l.setColor(m36848B(this.f28763b0));
        for (C7566a next : this.f28780q) {
            if (next.isStateful()) {
                next.setState(getDrawableState());
            }
        }
        if (this.f28767f0.isStateful()) {
            this.f28767f0.setState(getDrawableState());
        }
        this.f28773j.setColor(m36848B(this.f28762a0));
        this.f28773j.setAlpha(63);
    }

    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    /* access modifiers changed from: package-private */
    public final int getAccessibilityFocusedVirtualViewId() {
        return this.f28776m.mo13275x();
    }

    public int getActiveThumbIndex() {
        return this.f28753O;
    }

    public int getFocusedThumbIndex() {
        return this.f28754P;
    }

    public int getHaloRadius() {
        return this.f28744F;
    }

    public ColorStateList getHaloTintList() {
        return this.f28762a0;
    }

    public int getLabelBehavior() {
        return this.f28739A;
    }

    /* access modifiers changed from: protected */
    public float getMinSeparation() {
        return 0.0f;
    }

    public float getStepSize() {
        return this.f28755Q;
    }

    public float getThumbElevation() {
        return this.f28767f0.mo28488w();
    }

    public int getThumbRadius() {
        return this.f28743E;
    }

    public ColorStateList getThumbStrokeColor() {
        return this.f28767f0.mo28449E();
    }

    public float getThumbStrokeWidth() {
        return this.f28767f0.mo28450G();
    }

    public ColorStateList getThumbTintList() {
        return this.f28767f0.mo28489x();
    }

    public ColorStateList getTickActiveTintList() {
        return this.f28763b0;
    }

    public ColorStateList getTickInactiveTintList() {
        return this.f28764c0;
    }

    public ColorStateList getTickTintList() {
        if (this.f28764c0.equals(this.f28763b0)) {
            return this.f28763b0;
        }
        throw new IllegalStateException("The inactive and active ticks are different colors. Use the getTickColorInactive() and getTickColorActive() methods instead.");
    }

    public ColorStateList getTrackActiveTintList() {
        return this.f28765d0;
    }

    public int getTrackHeight() {
        return this.f28740B;
    }

    public ColorStateList getTrackInactiveTintList() {
        return this.f28766e0;
    }

    public int getTrackSidePadding() {
        return this.f28741C;
    }

    public ColorStateList getTrackTintList() {
        if (this.f28766e0.equals(this.f28765d0)) {
            return this.f28765d0;
        }
        throw new IllegalStateException("The inactive and active parts of the track are different colors. Use the getInactiveTrackColor() and getActiveTrackColor() methods instead.");
    }

    public int getTrackWidth() {
        return this.f28758T;
    }

    public float getValueFrom() {
        return this.f28750L;
    }

    public float getValueTo() {
        return this.f28751M;
    }

    /* access modifiers changed from: package-private */
    public List<Float> getValues() {
        return new ArrayList(this.f28752N);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        for (C7566a h : this.f28780q) {
            m36883h(h);
        }
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        BaseSlider<S, L, T>.d dVar = this.f28778o;
        if (dVar != null) {
            removeCallbacks(dVar);
        }
        this.f28783t = false;
        for (C7566a o : this.f28780q) {
            m36896o(o);
        }
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        if (this.f28761W) {
            m36880f0();
            m36852H();
        }
        super.onDraw(canvas);
        int l = m36891l();
        m36901t(canvas, this.f28758T, l);
        if (((Float) Collections.max(getValues())).floatValue() > this.f28750L) {
            m36900s(canvas, this.f28758T, l);
        }
        m36854J(canvas);
        if ((this.f28749K || isFocused()) && isEnabled()) {
            m36853I(canvas, this.f28758T, l);
            if (this.f28753O != -1) {
                m36903v();
            }
        }
        m36902u(canvas, this.f28758T, l);
    }

    /* access modifiers changed from: protected */
    public void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.f28753O = -1;
            m36904w();
            this.f28776m.mo13272o(this.f28754P);
            return;
        }
        m36905x(i);
        this.f28776m.mo13270V(this.f28754P);
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this.f28752N.size() == 1) {
            this.f28753O = 0;
        }
        if (this.f28753O == -1) {
            Boolean O = m36859O(i, keyEvent);
            return O != null ? O.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.f28760V |= keyEvent.isLongPress();
        Float i2 = m36885i(i);
        if (i2 != null) {
            if (m36868Y(this.f28752N.get(this.f28753O).floatValue() + i2.floatValue())) {
                m36876d0();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i != 61) {
                if (i != 66) {
                    return super.onKeyDown(i, keyEvent);
                }
            } else if (keyEvent.hasNoModifiers()) {
                return m36856L(1);
            } else {
                if (keyEvent.isShiftPressed()) {
                    return m36856L(-1);
                }
                return false;
            }
        }
        this.f28753O = -1;
        m36904w();
        postInvalidate();
        return true;
    }

    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.f28760V = false;
        return super.onKeyUp(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3 = this.f28789z;
        int i4 = 0;
        if (this.f28739A == 1) {
            i4 = this.f28780q.get(0).getIntrinsicHeight();
        }
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3 + i4, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.f28750L = sliderState.f28790g;
        this.f28751M = sliderState.f28791h;
        setValuesInternal(sliderState.f28792i);
        this.f28755Q = sliderState.f28793j;
        if (sliderState.f28794k) {
            requestFocus();
        }
        m36899r();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.f28790g = this.f28750L;
        sliderState.f28791h = this.f28751M;
        sliderState.f28792i = new ArrayList<>(this.f28752N);
        sliderState.f28793j = this.f28755Q;
        sliderState.f28794k = hasFocus();
        return sliderState;
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        m36878e0(i);
        m36876d0();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!isEnabled()) {
            return false;
        }
        float x = motionEvent.getX();
        float f = (x - ((float) this.f28741C)) / ((float) this.f28758T);
        this.f28769g0 = f;
        float max = Math.max(0.0f, f);
        this.f28769g0 = max;
        this.f28769g0 = Math.min(1.0f, max);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f28746H = x;
            if (!m36850E()) {
                getParent().requestDisallowInterceptTouchEvent(true);
                if (mo24536S()) {
                    requestFocus();
                    this.f28749K = true;
                    m36873b0();
                    m36876d0();
                    invalidate();
                    m36860P();
                }
            }
        } else if (actionMasked == 1) {
            this.f28749K = false;
            MotionEvent motionEvent2 = this.f28747I;
            if (motionEvent2 != null && motionEvent2.getActionMasked() == 0 && Math.abs(this.f28747I.getX() - motionEvent.getX()) <= ((float) this.f28786w) && Math.abs(this.f28747I.getY() - motionEvent.getY()) <= ((float) this.f28786w) && mo24536S()) {
                m36860P();
            }
            if (this.f28753O != -1) {
                m36873b0();
                this.f28753O = -1;
                m36861Q();
            }
            m36904w();
            invalidate();
        } else if (actionMasked == 2) {
            if (!this.f28749K) {
                if (m36850E() && Math.abs(x - this.f28746H) < ((float) this.f28786w)) {
                    return false;
                }
                getParent().requestDisallowInterceptTouchEvent(true);
                m36860P();
            }
            if (mo24536S()) {
                this.f28749K = true;
                m36873b0();
                m36876d0();
                invalidate();
            }
        }
        setPressed(this.f28749K);
        this.f28747I = MotionEvent.obtain(motionEvent);
        return true;
    }

    /* access modifiers changed from: protected */
    public void setActiveThumbIndex(int i) {
        this.f28753O = i;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, (Paint) null);
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this.f28752N.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.f28754P = i;
        this.f28776m.mo13270V(i);
        postInvalidate();
    }

    public void setHaloRadius(int i) {
        if (i != this.f28744F) {
            this.f28744F = i;
            Drawable background = getBackground();
            if (m36867X() || !(background instanceof RippleDrawable)) {
                postInvalidate();
            } else {
                C7514a.m41985a((RippleDrawable) background, this.f28744F);
            }
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f28762a0)) {
            this.f28762a0 = colorStateList;
            Drawable background = getBackground();
            if (m36867X() || !(background instanceof RippleDrawable)) {
                this.f28773j.setColor(m36848B(colorStateList));
                this.f28773j.setAlpha(63);
                invalidate();
                return;
            }
            ((RippleDrawable) background).setColor(colorStateList);
        }
    }

    public void setLabelBehavior(int i) {
        if (this.f28739A != i) {
            this.f28739A = i;
            requestLayout();
        }
    }

    public void setLabelFormatter(C6163c cVar) {
        this.f28748J = cVar;
    }

    /* access modifiers changed from: protected */
    public void setSeparationUnit(int i) {
        this.f28771h0 = i;
    }

    public void setStepSize(float f) {
        if (f < 0.0f) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", new Object[]{Float.toString(f), Float.toString(this.f28750L), Float.toString(this.f28751M)}));
        } else if (this.f28755Q != f) {
            this.f28755Q = f;
            this.f28761W = true;
            postInvalidate();
        }
    }

    public void setThumbElevation(float f) {
        this.f28767f0.mo28462Z(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i != this.f28743E) {
            this.f28743E = i;
            m36855K();
            C7541h hVar = this.f28767f0;
            C7549m.C7551b a = C7549m.m42145a();
            a.mo28529q(0, (float) this.f28743E);
            hVar.setShapeAppearanceModel(a.mo28526m());
            C7541h hVar2 = this.f28767f0;
            int i2 = this.f28743E;
            hVar2.setBounds(0, 0, i2 * 2, i2 * 2);
            postInvalidate();
        }
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.f28767f0.mo28480l0(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(C3410a.m14542c(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.f28767f0.mo28481m0(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f28767f0.mo28489x())) {
            this.f28767f0.mo28463a0(colorStateList);
            invalidate();
        }
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f28763b0)) {
            this.f28763b0 = colorStateList;
            this.f28775l.setColor(m36848B(colorStateList));
            invalidate();
        }
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f28764c0)) {
            this.f28764c0 = colorStateList;
            this.f28774k.setColor(m36848B(colorStateList));
            invalidate();
        }
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickVisible(boolean z) {
        if (this.f28757S != z) {
            this.f28757S = z;
            postInvalidate();
        }
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f28765d0)) {
            this.f28765d0 = colorStateList;
            this.f28770h.setColor(m36848B(colorStateList));
            invalidate();
        }
    }

    public void setTrackHeight(int i) {
        if (this.f28740B != i) {
            this.f28740B = i;
            m36849D();
            postInvalidate();
        }
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (!colorStateList.equals(this.f28766e0)) {
            this.f28766e0 = colorStateList;
            this.f28768g.setColor(m36848B(colorStateList));
            invalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setValueFrom(float f) {
        this.f28750L = f;
        this.f28761W = true;
        postInvalidate();
    }

    public void setValueTo(float f) {
        this.f28751M = f;
        this.f28761W = true;
        postInvalidate();
    }

    /* access modifiers changed from: package-private */
    public void setValues(Float... fArr) {
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, fArr);
        setValuesInternal(arrayList);
    }

    /* renamed from: com.google.android.material.slider.BaseSlider$d */
    private class C6156d implements Runnable {

        /* renamed from: g */
        int f28800g;

        private C6156d() {
            this.f28800g = -1;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo24617a(int i) {
            this.f28800g = i;
        }

        public void run() {
            BaseSlider.this.f28776m.mo13271W(this.f28800g, 4);
        }

        /* synthetic */ C6156d(BaseSlider baseSlider, C6153a aVar) {
            this();
        }
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.sliderStyle);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(C6260a.m37386c(context, attributeSet, i, f28738j0), attributeSet, i);
        this.f28780q = new ArrayList();
        this.f28781r = new ArrayList();
        this.f28782s = new ArrayList();
        this.f28783t = false;
        this.f28749K = false;
        this.f28752N = new ArrayList<>();
        this.f28753O = -1;
        this.f28754P = -1;
        this.f28755Q = 0.0f;
        this.f28757S = true;
        this.f28760V = false;
        C7541h hVar = new C7541h();
        this.f28767f0 = hVar;
        this.f28771h0 = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.f28768g = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.f28770h = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.f28772i = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.f28773j = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.f28774k = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.f28775l = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        m36851G(context2.getResources());
        this.f28779p = new C6153a(attributeSet, i);
        m36864U(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        hVar.mo28475i0(2);
        this.f28786w = ViewConfiguration.get(context2).getScaledTouchSlop();
        C6157e eVar = new C6157e(this);
        this.f28776m = eVar;
        C3774v.m16217o0(this, eVar);
        this.f28777n = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    /* access modifiers changed from: package-private */
    public void setValues(List<Float> list) {
        setValuesInternal(new ArrayList(list));
    }
}
