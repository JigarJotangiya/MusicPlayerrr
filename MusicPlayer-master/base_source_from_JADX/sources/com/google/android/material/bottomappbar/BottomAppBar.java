package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.drawable.C0534a;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C6100s;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p082e.p109h.p119p.C3718d0;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7490b;
import p159f.p243f.p245b.p304b.C7492d;
import p159f.p243f.p245b.p304b.C7499k;
import p159f.p243f.p245b.p304b.p305m.C7511k;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7545i;

public class BottomAppBar extends Toolbar implements CoordinatorLayout.C0447b {

    /* renamed from: t0 */
    private static final int f27764t0 = C7499k.Widget_MaterialComponents_BottomAppBar;
    /* access modifiers changed from: private */

    /* renamed from: V */
    public final int f27765V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public final C7541h f27766W;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public Animator f27767a0;
    /* access modifiers changed from: private */

    /* renamed from: b0 */
    public Animator f27768b0;
    /* access modifiers changed from: private */

    /* renamed from: c0 */
    public int f27769c0;

    /* renamed from: d0 */
    private int f27770d0;

    /* renamed from: e0 */
    private boolean f27771e0;
    /* access modifiers changed from: private */

    /* renamed from: f0 */
    public final boolean f27772f0;
    /* access modifiers changed from: private */

    /* renamed from: g0 */
    public final boolean f27773g0;
    /* access modifiers changed from: private */

    /* renamed from: h0 */
    public final boolean f27774h0;

    /* renamed from: i0 */
    private int f27775i0;

    /* renamed from: j0 */
    private ArrayList<C5926j> f27776j0;
    /* access modifiers changed from: private */

    /* renamed from: k0 */
    public int f27777k0;
    /* access modifiers changed from: private */

    /* renamed from: l0 */
    public boolean f27778l0;
    /* access modifiers changed from: private */

    /* renamed from: m0 */
    public boolean f27779m0;

    /* renamed from: n0 */
    private Behavior f27780n0;
    /* access modifiers changed from: private */

    /* renamed from: o0 */
    public int f27781o0;
    /* access modifiers changed from: private */

    /* renamed from: p0 */
    public int f27782p0;
    /* access modifiers changed from: private */

    /* renamed from: q0 */
    public int f27783q0;

    /* renamed from: r0 */
    AnimatorListenerAdapter f27784r0;

    /* renamed from: s0 */
    C7511k<FloatingActionButton> f27785s0;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C5915a();

        /* renamed from: i */
        int f27791i;

        /* renamed from: j */
        boolean f27792j;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$SavedState$a */
        static class C5915a implements Parcelable.ClassLoaderCreator<SavedState> {
            C5915a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f27791i);
            parcel.writeInt(this.f27792j ? 1 : 0);
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f27791i = parcel.readInt();
            this.f27792j = parcel.readInt() != 0;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$a */
    class C5916a extends AnimatorListenerAdapter {
        C5916a() {
        }

        public void onAnimationStart(Animator animator) {
            if (!BottomAppBar.this.f27778l0) {
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.m35405J0(bottomAppBar.f27769c0, BottomAppBar.this.f27779m0);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$b */
    class C5917b implements C7511k<FloatingActionButton> {
        C5917b() {
        }

        /* renamed from: c */
        public void mo23004a(FloatingActionButton floatingActionButton) {
            BottomAppBar.this.f27766W.mo28464b0(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        /* renamed from: d */
        public void mo23005b(FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().mo23027i() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().mo23033o(translationX);
                BottomAppBar.this.f27766W.invalidateSelf();
            }
            float f = 0.0f;
            float max = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().mo23022c() != max) {
                BottomAppBar.this.getTopEdgeTreatment().mo23028j(max);
                BottomAppBar.this.f27766W.invalidateSelf();
            }
            C7541h q0 = BottomAppBar.this.f27766W;
            if (floatingActionButton.getVisibility() == 0) {
                f = floatingActionButton.getScaleY();
            }
            q0.mo28464b0(f);
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$c */
    class C5918c implements C6100s.C6104d {
        C5918c() {
        }

        /* renamed from: a */
        public C3718d0 mo23008a(View view, C3718d0 d0Var, C6100s.C6105e eVar) {
            boolean z;
            if (BottomAppBar.this.f27772f0) {
                int unused = BottomAppBar.this.f27781o0 = d0Var.mo13035i();
            }
            boolean z2 = true;
            boolean z3 = false;
            if (BottomAppBar.this.f27773g0) {
                z = BottomAppBar.this.f27783q0 != d0Var.mo13036j();
                int unused2 = BottomAppBar.this.f27783q0 = d0Var.mo13036j();
            } else {
                z = false;
            }
            if (BottomAppBar.this.f27774h0) {
                if (BottomAppBar.this.f27782p0 == d0Var.mo13037k()) {
                    z2 = false;
                }
                int unused3 = BottomAppBar.this.f27782p0 = d0Var.mo13037k();
                z3 = z2;
            }
            if (z || z3) {
                BottomAppBar.this.m35445y0();
                BottomAppBar.this.m35408N0();
                BottomAppBar.this.m35407M0();
            }
            return d0Var;
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$d */
    class C5919d extends AnimatorListenerAdapter {
        C5919d() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m35399C0();
            Animator unused = BottomAppBar.this.f27767a0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m35400D0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e */
    class C5920e extends FloatingActionButton.C6028b {

        /* renamed from: a */
        final /* synthetic */ int f27797a;

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$e$a */
        class C5921a extends FloatingActionButton.C6028b {
            C5921a() {
            }

            /* renamed from: b */
            public void mo23012b(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.m35399C0();
            }
        }

        C5920e(int i) {
            this.f27797a = i;
        }

        /* renamed from: a */
        public void mo23011a(FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.m35403H0(this.f27797a));
            floatingActionButton.mo23866s(new C5921a());
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$f */
    class C5922f extends AnimatorListenerAdapter {
        C5922f() {
        }

        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.m35399C0();
            boolean unused = BottomAppBar.this.f27778l0 = false;
            Animator unused2 = BottomAppBar.this.f27768b0 = null;
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.m35400D0();
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    class C5923g extends AnimatorListenerAdapter {

        /* renamed from: a */
        public boolean f27801a;

        /* renamed from: b */
        final /* synthetic */ ActionMenuView f27802b;

        /* renamed from: c */
        final /* synthetic */ int f27803c;

        /* renamed from: d */
        final /* synthetic */ boolean f27804d;

        C5923g(ActionMenuView actionMenuView, int i, boolean z) {
            this.f27802b = actionMenuView;
            this.f27803c = i;
            this.f27804d = z;
        }

        public void onAnimationCancel(Animator animator) {
            this.f27801a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f27801a) {
                boolean z = BottomAppBar.this.f27777k0 != 0;
                BottomAppBar bottomAppBar = BottomAppBar.this;
                bottomAppBar.mo22973L0(bottomAppBar.f27777k0);
                BottomAppBar.this.m35412R0(this.f27802b, this.f27803c, this.f27804d, z);
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$h */
    class C5924h implements Runnable {

        /* renamed from: g */
        final /* synthetic */ ActionMenuView f27806g;

        /* renamed from: h */
        final /* synthetic */ int f27807h;

        /* renamed from: i */
        final /* synthetic */ boolean f27808i;

        C5924h(ActionMenuView actionMenuView, int i, boolean z) {
            this.f27806g = actionMenuView;
            this.f27807h = i;
            this.f27808i = z;
        }

        public void run() {
            ActionMenuView actionMenuView = this.f27806g;
            actionMenuView.setTranslationX((float) BottomAppBar.this.mo22972G0(actionMenuView, this.f27807h, this.f27808i));
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$i */
    class C5925i extends AnimatorListenerAdapter {
        C5925i() {
        }

        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.f27784r0.onAnimationStart(animator);
            FloatingActionButton h0 = BottomAppBar.this.m35401E0();
            if (h0 != null) {
                h0.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$j */
    interface C5926j {
        /* renamed from: a */
        void mo23019a(BottomAppBar bottomAppBar);

        /* renamed from: b */
        void mo23020b(BottomAppBar bottomAppBar);
    }

    public BottomAppBar(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: A0 */
    private void m35397A0(int i, List<Animator> list) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(m35401E0(), "translationX", new float[]{m35403H0(i)});
        ofFloat.setDuration(300);
        list.add(ofFloat);
    }

    /* renamed from: B0 */
    private void m35398B0(int i, boolean z, List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{1.0f});
            if (Math.abs(actionMenuView.getTranslationX() - ((float) mo22972G0(actionMenuView, i, z))) > 1.0f) {
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(actionMenuView, "alpha", new float[]{0.0f});
                ofFloat2.addListener(new C5923g(actionMenuView, i, z));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(150);
                animatorSet.playSequentially(new Animator[]{ofFloat2, ofFloat});
                list.add(animatorSet);
            } else if (actionMenuView.getAlpha() < 1.0f) {
                list.add(ofFloat);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: C0 */
    public void m35399C0() {
        ArrayList<C5926j> arrayList;
        int i = this.f27775i0 - 1;
        this.f27775i0 = i;
        if (i == 0 && (arrayList = this.f27776j0) != null) {
            Iterator<C5926j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo23020b(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D0 */
    public void m35400D0() {
        ArrayList<C5926j> arrayList;
        int i = this.f27775i0;
        this.f27775i0 = i + 1;
        if (i == 0 && (arrayList = this.f27776j0) != null) {
            Iterator<C5926j> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo23019a(this);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: E0 */
    public FloatingActionButton m35401E0() {
        View F0 = m35402F0();
        if (F0 instanceof FloatingActionButton) {
            return (FloatingActionButton) F0;
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* renamed from: F0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View m35402F0() {
        /*
            r4 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r0 = r0 instanceof androidx.coordinatorlayout.widget.CoordinatorLayout
            r1 = 0
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            android.view.ViewParent r0 = r4.getParent()
            androidx.coordinatorlayout.widget.CoordinatorLayout r0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) r0
            java.util.List r0 = r0.mo3044w(r4)
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x002d
            java.lang.Object r2 = r0.next()
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.FloatingActionButton
            if (r3 != 0) goto L_0x002c
            boolean r3 = r2 instanceof com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
            if (r3 == 0) goto L_0x0018
        L_0x002c:
            return r2
        L_0x002d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.m35402F0():android.view.View");
    }

    /* access modifiers changed from: private */
    /* renamed from: H0 */
    public float m35403H0(int i) {
        boolean h = C6100s.m36587h(this);
        int i2 = 1;
        if (i != 1) {
            return 0.0f;
        }
        int measuredWidth = (getMeasuredWidth() / 2) - (this.f27765V + (h ? this.f27783q0 : this.f27782p0));
        if (h) {
            i2 = -1;
        }
        return (float) (measuredWidth * i2);
    }

    /* renamed from: I0 */
    private boolean m35404I0() {
        FloatingActionButton E0 = m35401E0();
        return E0 != null && E0.mo23859n();
    }

    /* access modifiers changed from: private */
    /* renamed from: J0 */
    public void m35405J0(int i, boolean z) {
        if (!C3774v.m16181T(this)) {
            this.f27778l0 = false;
            mo22973L0(this.f27777k0);
            return;
        }
        Animator animator = this.f27768b0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!m35404I0()) {
            i = 0;
            z = false;
        }
        m35398B0(i, z, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.f27768b0 = animatorSet;
        animatorSet.addListener(new C5922f());
        this.f27768b0.start();
    }

    /* renamed from: K0 */
    private void m35406K0(int i) {
        if (this.f27769c0 != i && C3774v.m16181T(this)) {
            Animator animator = this.f27767a0;
            if (animator != null) {
                animator.cancel();
            }
            ArrayList arrayList = new ArrayList();
            if (this.f27770d0 == 1) {
                m35397A0(i, arrayList);
            } else {
                mo22993z0(i, arrayList);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(arrayList);
            this.f27767a0 = animatorSet;
            animatorSet.addListener(new C5919d());
            this.f27767a0.start();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: M0 */
    public void m35407M0() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView != null && this.f27768b0 == null) {
            actionMenuView.setAlpha(1.0f);
            if (!m35404I0()) {
                m35410Q0(actionMenuView, 0, false);
            } else {
                m35410Q0(actionMenuView, this.f27769c0, this.f27779m0);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: N0 */
    public void m35408N0() {
        getTopEdgeTreatment().mo23033o(getFabTranslationX());
        View F0 = m35402F0();
        this.f27766W.mo28464b0((!this.f27779m0 || !m35404I0()) ? 0.0f : 1.0f);
        if (F0 != null) {
            F0.setTranslationY(getFabTranslationY());
            F0.setTranslationX(getFabTranslationX());
        }
    }

    /* renamed from: Q0 */
    private void m35410Q0(ActionMenuView actionMenuView, int i, boolean z) {
        m35412R0(actionMenuView, i, z, false);
    }

    /* access modifiers changed from: private */
    /* renamed from: R0 */
    public void m35412R0(ActionMenuView actionMenuView, int i, boolean z, boolean z2) {
        C5924h hVar = new C5924h(actionMenuView, i, z);
        if (z2) {
            actionMenuView.post(hVar);
        } else {
            hVar.run();
        }
    }

    private ActionMenuView getActionMenuView() {
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    public int getBottomInset() {
        return this.f27781o0;
    }

    /* access modifiers changed from: private */
    public float getFabTranslationX() {
        return m35403H0(this.f27769c0);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().mo23022c();
    }

    /* access modifiers changed from: private */
    public int getLeftInset() {
        return this.f27783q0;
    }

    /* access modifiers changed from: private */
    public int getRightInset() {
        return this.f27782p0;
    }

    /* access modifiers changed from: private */
    public C5927a getTopEdgeTreatment() {
        return (C5927a) this.f27766W.mo28448D().mo28506p();
    }

    /* access modifiers changed from: private */
    /* renamed from: x0 */
    public void m35444x0(FloatingActionButton floatingActionButton) {
        floatingActionButton.mo23832d(this.f27784r0);
        floatingActionButton.mo23834e(new C5925i());
        floatingActionButton.mo23835f(this.f27785s0);
    }

    /* access modifiers changed from: private */
    /* renamed from: y0 */
    public void m35445y0() {
        Animator animator = this.f27768b0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.f27767a0;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: G0 */
    public int mo22972G0(ActionMenuView actionMenuView, int i, boolean z) {
        if (i != 1 || !z) {
            return 0;
        }
        boolean h = C6100s.m36587h(this);
        int measuredWidth = h ? getMeasuredWidth() : 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if ((childAt.getLayoutParams() instanceof Toolbar.LayoutParams) && (((Toolbar.LayoutParams) childAt.getLayoutParams()).f234a & 8388615) == 8388611) {
                if (h) {
                    measuredWidth = Math.min(measuredWidth, childAt.getLeft());
                } else {
                    measuredWidth = Math.max(measuredWidth, childAt.getRight());
                }
            }
        }
        return measuredWidth - ((h ? actionMenuView.getRight() : actionMenuView.getLeft()) + (h ? this.f27782p0 : -this.f27783q0));
    }

    /* renamed from: L0 */
    public void mo22973L0(int i) {
        if (i != 0) {
            this.f27777k0 = 0;
            getMenu().clear();
            mo1887y(i);
        }
    }

    /* renamed from: O0 */
    public void mo22974O0(int i, int i2) {
        this.f27777k0 = i2;
        this.f27778l0 = true;
        m35405J0(i, this.f27779m0);
        m35406K0(i);
        this.f27769c0 = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P0 */
    public boolean mo22975P0(int i) {
        float f = (float) i;
        if (f == getTopEdgeTreatment().mo23026h()) {
            return false;
        }
        getTopEdgeTreatment().mo23032n(f);
        this.f27766W.invalidateSelf();
        return true;
    }

    public ColorStateList getBackgroundTint() {
        return this.f27766W.mo28451H();
    }

    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().mo23022c();
    }

    public int getFabAlignmentMode() {
        return this.f27769c0;
    }

    public int getFabAnimationMode() {
        return this.f27770d0;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().mo23024f();
    }

    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().mo23025g();
    }

    public boolean getHideOnScroll() {
        return this.f27771e0;
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        C7545i.m42140f(this, this.f27766W);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m35445y0();
            m35408N0();
        }
        m35407M0();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3471a());
        this.f27769c0 = savedState.f27791i;
        this.f27779m0 = savedState.f27792j;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f27791i = this.f27769c0;
        savedState.f27792j = this.f27779m0;
        return savedState;
    }

    public void setBackgroundTint(ColorStateList colorStateList) {
        C0534a.m3289o(this.f27766W, colorStateList);
    }

    public void setCradleVerticalOffset(float f) {
        if (f != getCradleVerticalOffset()) {
            getTopEdgeTreatment().mo23028j(f);
            this.f27766W.invalidateSelf();
            m35408N0();
        }
    }

    public void setElevation(float f) {
        this.f27766W.mo28462Z(f);
        getBehavior().mo22960G(this, this.f27766W.mo28447C() - this.f27766W.mo28446B());
    }

    public void setFabAlignmentMode(int i) {
        mo22974O0(i, 0);
    }

    public void setFabAnimationMode(int i) {
        this.f27770d0 = i;
    }

    /* access modifiers changed from: package-private */
    public void setFabCornerSize(float f) {
        if (f != getTopEdgeTreatment().mo23023e()) {
            getTopEdgeTreatment().mo23029k(f);
            this.f27766W.invalidateSelf();
        }
    }

    public void setFabCradleMargin(float f) {
        if (f != getFabCradleMargin()) {
            getTopEdgeTreatment().mo23030l(f);
            this.f27766W.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(float f) {
        if (f != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().mo23031m(f);
            this.f27766W.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z) {
        this.f27771e0 = z;
    }

    public void setSubtitle(CharSequence charSequence) {
    }

    public void setTitle(CharSequence charSequence) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z0 */
    public void mo22993z0(int i, List<Animator> list) {
        FloatingActionButton E0 = m35401E0();
        if (E0 != null && !E0.mo23858m()) {
            m35400D0();
            E0.mo23856k(new C5920e(i));
        }
    }

    public BottomAppBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7490b.bottomAppBarStyle);
    }

    public Behavior getBehavior() {
        if (this.f27780n0 == null) {
            this.f27780n0 = new Behavior();
        }
        return this.f27780n0;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {
        /* access modifiers changed from: private */

        /* renamed from: e */
        public final Rect f27786e = new Rect();
        /* access modifiers changed from: private */

        /* renamed from: f */
        public WeakReference<BottomAppBar> f27787f;
        /* access modifiers changed from: private */

        /* renamed from: g */
        public int f27788g;

        /* renamed from: h */
        private final View.OnLayoutChangeListener f27789h = new C5914a();

        /* renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$a */
        class C5914a implements View.OnLayoutChangeListener {
            C5914a() {
            }

            public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f27787f.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.mo23853i(Behavior.this.f27786e);
                int height = Behavior.this.f27786e.height();
                bottomAppBar.mo22975P0(height);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().mo28508r().mo28437a(new RectF(Behavior.this.f27786e)));
                CoordinatorLayout.C0450e eVar = (CoordinatorLayout.C0450e) view.getLayoutParams();
                if (Behavior.this.f27788g == 0) {
                    eVar.bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C7492d.mtrl_bottomappbar_fab_bottom_margin) - ((floatingActionButton.getMeasuredHeight() - height) / 2));
                    eVar.leftMargin = bottomAppBar.getLeftInset();
                    eVar.rightMargin = bottomAppBar.getRightInset();
                    if (C6100s.m36587h(floatingActionButton)) {
                        eVar.leftMargin += bottomAppBar.f27765V;
                    } else {
                        eVar.rightMargin += bottomAppBar.f27765V;
                    }
                }
            }
        }

        public Behavior() {
        }

        /* renamed from: M */
        public boolean mo3062l(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, int i) {
            this.f27787f = new WeakReference<>(bottomAppBar);
            View o0 = bottomAppBar.m35402F0();
            if (o0 != null && !C3774v.m16181T(o0)) {
                CoordinatorLayout.C0450e eVar = (CoordinatorLayout.C0450e) o0.getLayoutParams();
                eVar.f2496d = 49;
                this.f27788g = eVar.bottomMargin;
                if (o0 instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) o0;
                    floatingActionButton.addOnLayoutChangeListener(this.f27789h);
                    bottomAppBar.m35444x0(floatingActionButton);
                }
                bottomAppBar.m35408N0();
            }
            coordinatorLayout.mo3001M(bottomAppBar, i);
            return super.mo3062l(coordinatorLayout, bottomAppBar, i);
        }

        /* renamed from: N */
        public boolean mo3047A(CoordinatorLayout coordinatorLayout, BottomAppBar bottomAppBar, View view, View view2, int i, int i2) {
            return bottomAppBar.getHideOnScroll() && super.mo3047A(coordinatorLayout, bottomAppBar, view, view2, i, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BottomAppBar(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            int r6 = f27764t0
            android.content.Context r11 = com.google.android.material.theme.p249a.C6260a.m37386c(r11, r12, r13, r6)
            r10.<init>(r11, r12, r13)
            f.f.b.b.w.h r11 = new f.f.b.b.w.h
            r11.<init>()
            r10.f27766W = r11
            r7 = 0
            r10.f27775i0 = r7
            r10.f27777k0 = r7
            r10.f27778l0 = r7
            r0 = 1
            r10.f27779m0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$a r0 = new com.google.android.material.bottomappbar.BottomAppBar$a
            r0.<init>()
            r10.f27784r0 = r0
            com.google.android.material.bottomappbar.BottomAppBar$b r0 = new com.google.android.material.bottomappbar.BottomAppBar$b
            r0.<init>()
            r10.f27785s0 = r0
            android.content.Context r8 = r10.getContext()
            int[] r2 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar
            int[] r5 = new int[r7]
            r0 = r8
            r1 = r12
            r3 = r13
            r4 = r6
            android.content.res.TypedArray r0 = com.google.android.material.internal.C6093m.m36563h(r0, r1, r2, r3, r4, r5)
            int r1 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_backgroundTint
            android.content.res.ColorStateList r1 = p159f.p243f.p245b.p304b.p312t.C7522c.m42014a(r8, r0, r1)
            int r2 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_elevation
            int r2 = r0.getDimensionPixelSize(r2, r7)
            int r3 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_fabCradleMargin
            int r3 = r0.getDimensionPixelOffset(r3, r7)
            float r3 = (float) r3
            int r4 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_fabCradleRoundedCornerRadius
            int r4 = r0.getDimensionPixelOffset(r4, r7)
            float r4 = (float) r4
            int r5 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_fabCradleVerticalOffset
            int r5 = r0.getDimensionPixelOffset(r5, r7)
            float r5 = (float) r5
            int r9 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_fabAlignmentMode
            int r9 = r0.getInt(r9, r7)
            r10.f27769c0 = r9
            int r9 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_fabAnimationMode
            int r9 = r0.getInt(r9, r7)
            r10.f27770d0 = r9
            int r9 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_hideOnScroll
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f27771e0 = r9
            int r9 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_paddingBottomSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f27772f0 = r9
            int r9 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_paddingLeftSystemWindowInsets
            boolean r9 = r0.getBoolean(r9, r7)
            r10.f27773g0 = r9
            int r9 = p159f.p243f.p245b.p304b.C7500l.BottomAppBar_paddingRightSystemWindowInsets
            boolean r7 = r0.getBoolean(r9, r7)
            r10.f27774h0 = r7
            r0.recycle()
            android.content.res.Resources r0 = r10.getResources()
            int r7 = p159f.p243f.p245b.p304b.C7492d.mtrl_bottomappbar_fabOffsetEndMode
            int r0 = r0.getDimensionPixelOffset(r7)
            r10.f27765V = r0
            com.google.android.material.bottomappbar.a r0 = new com.google.android.material.bottomappbar.a
            r0.<init>(r3, r4, r5)
            f.f.b.b.w.m$b r3 = p159f.p243f.p245b.p304b.p315w.C7549m.m42145a()
            r3.mo28517B(r0)
            f.f.b.b.w.m r0 = r3.mo28526m()
            r11.setShapeAppearanceModel(r0)
            r0 = 2
            r11.mo28475i0(r0)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.FILL
            r11.mo28466d0(r0)
            r11.mo28456P(r8)
            float r0 = (float) r2
            r10.setElevation(r0)
            androidx.core.graphics.drawable.C0534a.m3289o(r11, r1)
            p082e.p109h.p119p.C3774v.m16223r0(r10, r11)
            com.google.android.material.bottomappbar.BottomAppBar$c r11 = new com.google.android.material.bottomappbar.BottomAppBar$c
            r11.<init>()
            com.google.android.material.internal.C6100s.m36580a(r10, r12, r13, r6, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomappbar.BottomAppBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
