package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C6065c;
import java.util.List;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7489a;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.C7500l;
import p159f.p243f.p245b.p304b.p305m.C7508h;

public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.C0447b {

    /* renamed from: M */
    private static final int f28208M = C7499k.Widget_MaterialComponents_ExtendedFloatingActionButton_Icon;

    /* renamed from: N */
    static final Property<View, Float> f28209N;

    /* renamed from: O */
    static final Property<View, Float> f28210O;

    /* renamed from: P */
    static final Property<View, Float> f28211P;

    /* renamed from: Q */
    static final Property<View, Float> f28212Q;
    /* access modifiers changed from: private */

    /* renamed from: A */
    public final C6052f f28213A;
    /* access modifiers changed from: private */

    /* renamed from: B */
    public final C6052f f28214B;
    /* access modifiers changed from: private */

    /* renamed from: C */
    public final C6052f f28215C;
    /* access modifiers changed from: private */

    /* renamed from: D */
    public final C6052f f28216D;

    /* renamed from: E */
    private final int f28217E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f28218F;
    /* access modifiers changed from: private */

    /* renamed from: G */
    public int f28219G;

    /* renamed from: H */
    private final CoordinatorLayout.Behavior<ExtendedFloatingActionButton> f28220H;
    /* access modifiers changed from: private */

    /* renamed from: I */
    public boolean f28221I;
    /* access modifiers changed from: private */

    /* renamed from: J */
    public boolean f28222J;

    /* renamed from: K */
    private boolean f28223K;

    /* renamed from: L */
    protected ColorStateList f28224L;
    /* access modifiers changed from: private */

    /* renamed from: y */
    public int f28225y;

    /* renamed from: z */
    private final C6031a f28226z;

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a */
    class C6015a implements C6026l {
        C6015a() {
        }

        /* renamed from: a */
        public int mo23796a() {
            return ExtendedFloatingActionButton.this.f28219G;
        }

        /* renamed from: b */
        public int mo23797b() {
            return ExtendedFloatingActionButton.this.f28218F;
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        public int getWidth() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.f28218F + ExtendedFloatingActionButton.this.f28219G;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b */
    class C6016b implements C6026l {
        C6016b() {
        }

        /* renamed from: a */
        public int mo23796a() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        /* renamed from: b */
        public int mo23797b() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        public int getHeight() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        public ViewGroup.LayoutParams getLayoutParams() {
            return new ViewGroup.LayoutParams(getWidth(), getHeight());
        }

        public int getWidth() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$c */
    class C6017c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f28234a;

        /* renamed from: b */
        final /* synthetic */ C6052f f28235b;

        /* renamed from: c */
        final /* synthetic */ C6024j f28236c;

        C6017c(ExtendedFloatingActionButton extendedFloatingActionButton, C6052f fVar, C6024j jVar) {
            this.f28235b = fVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f28234a = true;
            this.f28235b.mo23827a();
        }

        public void onAnimationEnd(Animator animator) {
            this.f28235b.mo23823f();
            if (!this.f28234a) {
                this.f28235b.mo23825j(this.f28236c);
            }
        }

        public void onAnimationStart(Animator animator) {
            this.f28235b.onAnimationStart(animator);
            this.f28234a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$d */
    static class C6018d extends Property<View, Float> {
        C6018d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().width);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().width = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$e */
    static class C6019e extends Property<View, Float> {
        C6019e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) view.getLayoutParams().height);
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            view.getLayoutParams().height = f.intValue();
            view.requestLayout();
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$f */
    static class C6020f extends Property<View, Float> {
        C6020f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C3774v.m16161G(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C3774v.m16156D0(view, f.intValue(), view.getPaddingTop(), C3774v.m16159F(view), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    static class C6021g extends Property<View, Float> {
        C6021g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public Float get(View view) {
            return Float.valueOf((float) C3774v.m16159F(view));
        }

        /* renamed from: b */
        public void set(View view, Float f) {
            C3774v.m16156D0(view, C3774v.m16161G(view), view.getPaddingTop(), f.intValue(), view.getPaddingBottom());
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h */
    class C6022h extends C6032b {

        /* renamed from: g */
        private final C6026l f28237g;

        /* renamed from: h */
        private final boolean f28238h;

        C6022h(C6031a aVar, C6026l lVar, boolean z) {
            super(ExtendedFloatingActionButton.this, aVar);
            this.f28237g = lVar;
            this.f28238h = z;
        }

        /* renamed from: b */
        public int mo23820b() {
            return this.f28238h ? C7489a.mtrl_extended_fab_change_size_expand_motion_spec : C7489a.mtrl_extended_fab_change_size_collapse_motion_spec;
        }

        /* renamed from: c */
        public void mo23821c() {
            boolean unused = ExtendedFloatingActionButton.this.f28221I = this.f28238h;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f28237g.getLayoutParams().width;
                layoutParams.height = this.f28237g.getLayoutParams().height;
                C3774v.m16156D0(ExtendedFloatingActionButton.this, this.f28237g.mo23797b(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f28237g.mo23796a(), ExtendedFloatingActionButton.this.getPaddingBottom());
                ExtendedFloatingActionButton.this.requestLayout();
            }
        }

        /* renamed from: e */
        public boolean mo23822e() {
            return this.f28238h == ExtendedFloatingActionButton.this.f28221I || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        /* renamed from: f */
        public void mo23823f() {
            super.mo23823f();
            boolean unused = ExtendedFloatingActionButton.this.f28222J = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams != null) {
                layoutParams.width = this.f28237g.getLayoutParams().width;
                layoutParams.height = this.f28237g.getLayoutParams().height;
            }
        }

        /* renamed from: h */
        public AnimatorSet mo23824h() {
            C7508h m = mo23919m();
            if (m.mo28388j("width")) {
                PropertyValuesHolder[] g = m.mo28384g("width");
                g[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getWidth(), (float) this.f28237g.getWidth()});
                m.mo28390l("width", g);
            }
            if (m.mo28388j("height")) {
                PropertyValuesHolder[] g2 = m.mo28384g("height");
                g2[0].setFloatValues(new float[]{(float) ExtendedFloatingActionButton.this.getHeight(), (float) this.f28237g.getHeight()});
                m.mo28390l("height", g2);
            }
            if (m.mo28388j("paddingStart")) {
                PropertyValuesHolder[] g3 = m.mo28384g("paddingStart");
                g3[0].setFloatValues(new float[]{(float) C3774v.m16161G(ExtendedFloatingActionButton.this), (float) this.f28237g.mo23797b()});
                m.mo28390l("paddingStart", g3);
            }
            if (m.mo28388j("paddingEnd")) {
                PropertyValuesHolder[] g4 = m.mo28384g("paddingEnd");
                g4[0].setFloatValues(new float[]{(float) C3774v.m16159F(ExtendedFloatingActionButton.this), (float) this.f28237g.mo23796a()});
                m.mo28390l("paddingEnd", g4);
            }
            if (m.mo28388j("labelOpacity")) {
                PropertyValuesHolder[] g5 = m.mo28384g("labelOpacity");
                boolean z = this.f28238h;
                float f = 0.0f;
                float f2 = z ? 0.0f : 1.0f;
                if (z) {
                    f = 1.0f;
                }
                g5[0].setFloatValues(new float[]{f2, f});
                m.mo28390l("labelOpacity", g5);
            }
            return super.mo23918l(m);
        }

        /* renamed from: j */
        public void mo23825j(C6024j jVar) {
            if (jVar != null) {
                if (this.f28238h) {
                    jVar.mo23828a(ExtendedFloatingActionButton.this);
                } else {
                    jVar.mo23831d(ExtendedFloatingActionButton.this);
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            boolean unused = ExtendedFloatingActionButton.this.f28221I = this.f28238h;
            boolean unused2 = ExtendedFloatingActionButton.this.f28222J = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i */
    class C6023i extends C6032b {

        /* renamed from: g */
        private boolean f28240g;

        public C6023i(C6031a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: a */
        public void mo23827a() {
            super.mo23827a();
            this.f28240g = true;
        }

        /* renamed from: b */
        public int mo23820b() {
            return C7489a.mtrl_extended_fab_hide_motion_spec;
        }

        /* renamed from: c */
        public void mo23821c() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        /* renamed from: e */
        public boolean mo23822e() {
            return ExtendedFloatingActionButton.this.m36138z();
        }

        /* renamed from: f */
        public void mo23823f() {
            super.mo23823f();
            int unused = ExtendedFloatingActionButton.this.f28225y = 0;
            if (!this.f28240g) {
                ExtendedFloatingActionButton.this.setVisibility(8);
            }
        }

        /* renamed from: j */
        public void mo23825j(C6024j jVar) {
            if (jVar != null) {
                jVar.mo23829b(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f28240g = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f28225y = 1;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$j */
    public static abstract class C6024j {
        /* renamed from: a */
        public abstract void mo23828a(ExtendedFloatingActionButton extendedFloatingActionButton);

        /* renamed from: b */
        public abstract void mo23829b(ExtendedFloatingActionButton extendedFloatingActionButton);

        /* renamed from: c */
        public abstract void mo23830c(ExtendedFloatingActionButton extendedFloatingActionButton);

        /* renamed from: d */
        public abstract void mo23831d(ExtendedFloatingActionButton extendedFloatingActionButton);
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    class C6025k extends C6032b {
        public C6025k(C6031a aVar) {
            super(ExtendedFloatingActionButton.this, aVar);
        }

        /* renamed from: b */
        public int mo23820b() {
            return C7489a.mtrl_extended_fab_show_motion_spec;
        }

        /* renamed from: c */
        public void mo23821c() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }

        /* renamed from: e */
        public boolean mo23822e() {
            return ExtendedFloatingActionButton.this.m36121A();
        }

        /* renamed from: f */
        public void mo23823f() {
            super.mo23823f();
            int unused = ExtendedFloatingActionButton.this.f28225y = 0;
        }

        /* renamed from: j */
        public void mo23825j(C6024j jVar) {
            if (jVar != null) {
                jVar.mo23830c(ExtendedFloatingActionButton.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            int unused = ExtendedFloatingActionButton.this.f28225y = 2;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$l */
    interface C6026l {
        /* renamed from: a */
        int mo23796a();

        /* renamed from: b */
        int mo23797b();

        int getHeight();

        ViewGroup.LayoutParams getLayoutParams();

        int getWidth();
    }

    static {
        Class<Float> cls = Float.class;
        f28209N = new C6018d(cls, "width");
        f28210O = new C6019e(cls, "height");
        f28211P = new C6020f(cls, "paddingStart");
        f28212Q = new C6021g(cls, "paddingEnd");
    }

    public ExtendedFloatingActionButton(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public boolean m36121A() {
        if (getVisibility() != 0) {
            if (this.f28225y == 2) {
                return true;
            }
            return false;
        } else if (this.f28225y != 1) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public void m36122B(C6052f fVar, C6024j jVar) {
        if (!fVar.mo23822e()) {
            if (!m36124D()) {
                fVar.mo23821c();
                fVar.mo23825j(jVar);
                return;
            }
            measure(0, 0);
            AnimatorSet h = fVar.mo23824h();
            h.addListener(new C6017c(this, fVar, jVar));
            for (Animator.AnimatorListener addListener : fVar.mo23917i()) {
                h.addListener(addListener);
            }
            h.start();
        }
    }

    /* renamed from: C */
    private void m36123C() {
        this.f28224L = getTextColors();
    }

    /* renamed from: D */
    private boolean m36124D() {
        return (C3774v.m16181T(this) || (!m36121A() && this.f28223K)) && !isInEditMode();
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public boolean m36138z() {
        if (getVisibility() == 0) {
            if (this.f28225y == 1) {
                return true;
            }
            return false;
        } else if (this.f28225y != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public void mo23770E(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public CoordinatorLayout.Behavior<ExtendedFloatingActionButton> getBehavior() {
        return this.f28220H;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    /* access modifiers changed from: package-private */
    public int getCollapsedSize() {
        int i = this.f28217E;
        return i < 0 ? (Math.min(C3774v.m16161G(this), C3774v.m16159F(this)) * 2) + getIconSize() : i;
    }

    public C7508h getExtendMotionSpec() {
        return this.f28214B.mo23915d();
    }

    public C7508h getHideMotionSpec() {
        return this.f28216D.mo23915d();
    }

    public C7508h getShowMotionSpec() {
        return this.f28215C.mo23915d();
    }

    public C7508h getShrinkMotionSpec() {
        return this.f28213A.mo23915d();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f28221I && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.f28221I = false;
            this.f28213A.mo23821c();
        }
    }

    public void setAnimateShowBeforeLayout(boolean z) {
        this.f28223K = z;
    }

    public void setExtendMotionSpec(C7508h hVar) {
        this.f28214B.mo23916g(hVar);
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C7508h.m41956d(getContext(), i));
    }

    public void setExtended(boolean z) {
        if (this.f28221I != z) {
            C6052f fVar = z ? this.f28214B : this.f28213A;
            if (!fVar.mo23822e()) {
                fVar.mo23821c();
            }
        }
    }

    public void setHideMotionSpec(C7508h hVar) {
        this.f28216D.mo23916g(hVar);
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C7508h.m41956d(getContext(), i));
    }

    public void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        if (this.f28221I && !this.f28222J) {
            this.f28218F = C3774v.m16161G(this);
            this.f28219G = C3774v.m16159F(this);
        }
    }

    public void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
        if (this.f28221I && !this.f28222J) {
            this.f28218F = i;
            this.f28219G = i3;
        }
    }

    public void setShowMotionSpec(C7508h hVar) {
        this.f28215C.mo23916g(hVar);
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C7508h.m41956d(getContext(), i));
    }

    public void setShrinkMotionSpec(C7508h hVar) {
        this.f28213A.mo23916g(hVar);
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C7508h.m41956d(getContext(), i));
    }

    public void setTextColor(int i) {
        super.setTextColor(i);
        m36123C();
    }

    public ExtendedFloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.extendedFloatingActionButtonStyle);
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.Behavior<T> {

        /* renamed from: a */
        private Rect f28227a;

        /* renamed from: b */
        private C6024j f28228b;

        /* renamed from: c */
        private C6024j f28229c;

        /* renamed from: d */
        private boolean f28230d;

        /* renamed from: e */
        private boolean f28231e;

        public ExtendedFloatingActionButtonBehavior() {
            this.f28230d = false;
            this.f28231e = true;
        }

        /* renamed from: G */
        private static boolean m36140G(View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.C0450e) {
                return ((CoordinatorLayout.C0450e) layoutParams).mo3092f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* renamed from: J */
        private boolean m36141J(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            CoordinatorLayout.C0450e eVar = (CoordinatorLayout.C0450e) extendedFloatingActionButton.getLayoutParams();
            if ((this.f28230d || this.f28231e) && eVar.mo3091e() == view.getId()) {
                return true;
            }
            return false;
        }

        /* renamed from: L */
        private boolean m36142L(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m36141J(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f28227a == null) {
                this.f28227a = new Rect();
            }
            Rect rect = this.f28227a;
            C6065c.m36465a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                mo23795K(extendedFloatingActionButton);
                return true;
            }
            mo23791E(extendedFloatingActionButton);
            return true;
        }

        /* renamed from: M */
        private boolean m36143M(View view, ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m36141J(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((CoordinatorLayout.C0450e) extendedFloatingActionButton.getLayoutParams()).topMargin) {
                mo23795K(extendedFloatingActionButton);
                return true;
            }
            mo23791E(extendedFloatingActionButton);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: E */
        public void mo23791E(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C6052f fVar;
            boolean z = this.f28231e;
            C6024j jVar = z ? this.f28229c : this.f28228b;
            if (z) {
                fVar = extendedFloatingActionButton.f28214B;
            } else {
                fVar = extendedFloatingActionButton.f28215C;
            }
            extendedFloatingActionButton.m36122B(fVar, jVar);
        }

        /* renamed from: F */
        public boolean mo3052b(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, Rect rect) {
            return super.mo3052b(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        /* renamed from: H */
        public boolean mo3058h(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                m36142L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            } else if (!m36140G(view)) {
                return false;
            } else {
                m36143M(view, extendedFloatingActionButton);
                return false;
            }
        }

        /* renamed from: I */
        public boolean mo3062l(CoordinatorLayout coordinatorLayout, ExtendedFloatingActionButton extendedFloatingActionButton, int i) {
            List<View> v = coordinatorLayout.mo3042v(extendedFloatingActionButton);
            int size = v.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = v.get(i2);
                if (!(view instanceof AppBarLayout)) {
                    if (m36140G(view) && m36143M(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else if (m36142L(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                    break;
                }
            }
            coordinatorLayout.mo3001M(extendedFloatingActionButton, i);
            return true;
        }

        /* access modifiers changed from: protected */
        /* renamed from: K */
        public void mo23795K(ExtendedFloatingActionButton extendedFloatingActionButton) {
            C6052f fVar;
            boolean z = this.f28231e;
            C6024j jVar = z ? this.f28229c : this.f28228b;
            if (z) {
                fVar = extendedFloatingActionButton.f28213A;
            } else {
                fVar = extendedFloatingActionButton.f28216D;
            }
            extendedFloatingActionButton.m36122B(fVar, jVar);
        }

        /* renamed from: g */
        public void mo3057g(CoordinatorLayout.C0450e eVar) {
            if (eVar.f2500h == 0) {
                eVar.f2500h = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7500l.ExtendedFloatingActionButton_Behavior_Layout);
            this.f28230d = obtainStyledAttributes.getBoolean(C7500l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoHide, false);
            this.f28231e = obtainStyledAttributes.getBoolean(C7500l.ExtendedFloatingActionButton_Behavior_Layout_behavior_autoShrink, true);
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ExtendedFloatingActionButton(android.content.Context r17, android.util.AttributeSet r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r7 = r18
            r8 = r19
            int r9 = f28208M
            r1 = r17
            android.content.Context r1 = com.google.android.material.theme.p249a.C6260a.m37386c(r1, r7, r8, r9)
            r0.<init>(r1, r7, r8)
            r10 = 0
            r0.f28225y = r10
            com.google.android.material.floatingactionbutton.a r1 = new com.google.android.material.floatingactionbutton.a
            r1.<init>()
            r0.f28226z = r1
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k r11 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k
            r11.<init>(r1)
            r0.f28215C = r11
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i r12 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$i
            r12.<init>(r1)
            r0.f28216D = r12
            r13 = 1
            r0.f28221I = r13
            r0.f28222J = r10
            r0.f28223K = r10
            android.content.Context r14 = r16.getContext()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior r1 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$ExtendedFloatingActionButtonBehavior
            r1.<init>(r14, r7)
            r0.f28220H = r1
            int[] r3 = p159f.p243f.p245b.p304b.C7500l.ExtendedFloatingActionButton
            int[] r6 = new int[r10]
            r1 = r14
            r2 = r18
            r4 = r19
            r5 = r9
            android.content.res.TypedArray r1 = com.google.android.material.internal.C6093m.m36563h(r1, r2, r3, r4, r5, r6)
            int r2 = p159f.p243f.p245b.p304b.C7500l.ExtendedFloatingActionButton_showMotionSpec
            f.f.b.b.m.h r2 = p159f.p243f.p245b.p304b.p305m.C7508h.m41955c(r14, r1, r2)
            int r3 = p159f.p243f.p245b.p304b.C7500l.ExtendedFloatingActionButton_hideMotionSpec
            f.f.b.b.m.h r3 = p159f.p243f.p245b.p304b.p305m.C7508h.m41955c(r14, r1, r3)
            int r4 = p159f.p243f.p245b.p304b.C7500l.ExtendedFloatingActionButton_extendMotionSpec
            f.f.b.b.m.h r4 = p159f.p243f.p245b.p304b.p305m.C7508h.m41955c(r14, r1, r4)
            int r5 = p159f.p243f.p245b.p304b.C7500l.ExtendedFloatingActionButton_shrinkMotionSpec
            f.f.b.b.m.h r5 = p159f.p243f.p245b.p304b.p305m.C7508h.m41955c(r14, r1, r5)
            int r6 = p159f.p243f.p245b.p304b.C7500l.ExtendedFloatingActionButton_collapsedSize
            r15 = -1
            int r6 = r1.getDimensionPixelSize(r6, r15)
            r0.f28217E = r6
            int r6 = p082e.p109h.p119p.C3774v.m16161G(r16)
            r0.f28218F = r6
            int r6 = p082e.p109h.p119p.C3774v.m16159F(r16)
            r0.f28219G = r6
            com.google.android.material.floatingactionbutton.a r6 = new com.google.android.material.floatingactionbutton.a
            r6.<init>()
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r15 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$a
            r10.<init>()
            r15.<init>(r6, r10, r13)
            r0.f28214B = r15
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h r10 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$h
            com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b r13 = new com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$b
            r13.<init>()
            r7 = 0
            r10.<init>(r6, r13, r7)
            r0.f28213A = r10
            r11.mo23916g(r2)
            r12.mo23916g(r3)
            r15.mo23916g(r4)
            r10.mo23916g(r5)
            r1.recycle()
            f.f.b.b.w.c r1 = p159f.p243f.p245b.p304b.p315w.C7549m.f32836m
            r2 = r18
            f.f.b.b.w.m$b r1 = p159f.p243f.p245b.p304b.p315w.C7549m.m42151g(r14, r2, r8, r9, r1)
            f.f.b.b.w.m r1 = r1.mo28526m()
            r0.setShapeAppearanceModel(r1)
            r16.m36123C()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        m36123C();
    }
}
