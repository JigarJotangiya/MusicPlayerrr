package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.C5963a;
import com.google.android.material.circularreveal.C5965b;
import com.google.android.material.circularreveal.C5967c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7494f;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p305m.C7502b;
import p159f.p243f.p245b.p304b.p305m.C7503c;
import p159f.p243f.p245b.p304b.p305m.C7504d;
import p159f.p243f.p245b.p304b.p305m.C7505e;
import p159f.p243f.p245b.p304b.p305m.C7508h;
import p159f.p243f.p245b.p304b.p305m.C7509i;
import p159f.p243f.p245b.p304b.p305m.C7510j;
import p159f.p243f.p245b.p304b.p311s.C7518a;

@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* renamed from: c */
    private final Rect f29249c = new Rect();

    /* renamed from: d */
    private final RectF f29250d = new RectF();

    /* renamed from: e */
    private final RectF f29251e = new RectF();

    /* renamed from: f */
    private final int[] f29252f = new int[2];

    /* renamed from: g */
    private float f29253g;

    /* renamed from: h */
    private float f29254h;

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$a */
    class C6280a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f29255a;

        /* renamed from: b */
        final /* synthetic */ View f29256b;

        /* renamed from: c */
        final /* synthetic */ View f29257c;

        C6280a(FabTransformationBehavior fabTransformationBehavior, boolean z, View view, View view2) {
            this.f29255a = z;
            this.f29256b = view;
            this.f29257c = view2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f29255a) {
                this.f29256b.setVisibility(4);
                this.f29257c.setAlpha(1.0f);
                this.f29257c.setVisibility(0);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (this.f29255a) {
                this.f29256b.setVisibility(0);
                this.f29257c.setAlpha(0.0f);
                this.f29257c.setVisibility(4);
            }
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$b */
    class C6281b implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f29258a;

        C6281b(FabTransformationBehavior fabTransformationBehavior, View view) {
            this.f29258a = view;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f29258a.invalidate();
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$c */
    class C6282c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5967c f29259a;

        /* renamed from: b */
        final /* synthetic */ Drawable f29260b;

        C6282c(FabTransformationBehavior fabTransformationBehavior, C5967c cVar, Drawable drawable) {
            this.f29259a = cVar;
            this.f29260b = drawable;
        }

        public void onAnimationEnd(Animator animator) {
            this.f29259a.setCircularRevealOverlayDrawable((Drawable) null);
        }

        public void onAnimationStart(Animator animator) {
            this.f29259a.setCircularRevealOverlayDrawable(this.f29260b);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$d */
    class C6283d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C5967c f29261a;

        C6283d(FabTransformationBehavior fabTransformationBehavior, C5967c cVar) {
            this.f29261a = cVar;
        }

        public void onAnimationEnd(Animator animator) {
            C5967c.C5972e revealInfo = this.f29261a.getRevealInfo();
            revealInfo.f28108c = Float.MAX_VALUE;
            this.f29261a.setRevealInfo(revealInfo);
        }
    }

    /* renamed from: com.google.android.material.transformation.FabTransformationBehavior$e */
    protected static class C6284e {

        /* renamed from: a */
        public C7508h f29262a;

        /* renamed from: b */
        public C7510j f29263b;

        protected C6284e() {
        }
    }

    public FabTransformationBehavior() {
    }

    /* renamed from: K */
    private ViewGroup m37447K(View view) {
        View findViewById = view.findViewById(C7494f.mtrl_child_content_container);
        if (findViewById != null) {
            return m37467f0(findViewById);
        }
        if ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) {
            return m37467f0(((ViewGroup) view).getChildAt(0));
        }
        return m37467f0(view);
    }

    /* renamed from: L */
    private void m37448L(View view, C6284e eVar, C7509i iVar, C7509i iVar2, float f, float f2, float f3, float f4, RectF rectF) {
        float S = m37455S(eVar, iVar, f, f3);
        float S2 = m37455S(eVar, iVar2, f2, f4);
        Rect rect = this.f29249c;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f29250d;
        rectF2.set(rect);
        RectF rectF3 = this.f29251e;
        m37456T(view, rectF3);
        rectF3.offset(S, S2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* renamed from: M */
    private void m37449M(View view, RectF rectF) {
        m37456T(view, rectF);
        rectF.offset(this.f29253g, this.f29254h);
    }

    /* renamed from: N */
    private Pair<C7509i, C7509i> m37450N(float f, float f2, boolean z, C6284e eVar) {
        C7509i iVar;
        C7509i iVar2;
        int i;
        if (f == 0.0f || f2 == 0.0f) {
            iVar2 = eVar.f29262a.mo28385h("translationXLinear");
            iVar = eVar.f29262a.mo28385h("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || i <= 0)) {
            iVar2 = eVar.f29262a.mo28385h("translationXCurveDownwards");
            iVar = eVar.f29262a.mo28385h("translationYCurveDownwards");
        } else {
            iVar2 = eVar.f29262a.mo28385h("translationXCurveUpwards");
            iVar = eVar.f29262a.mo28385h("translationYCurveUpwards");
        }
        return new Pair<>(iVar2, iVar);
    }

    /* renamed from: O */
    private float m37451O(View view, View view2, C7510j jVar) {
        RectF rectF = this.f29250d;
        RectF rectF2 = this.f29251e;
        m37449M(view, rectF);
        m37456T(view2, rectF2);
        rectF2.offset(-m37453Q(view, view2, jVar), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    /* renamed from: P */
    private float m37452P(View view, View view2, C7510j jVar) {
        RectF rectF = this.f29250d;
        RectF rectF2 = this.f29251e;
        m37449M(view, rectF);
        m37456T(view2, rectF2);
        rectF2.offset(0.0f, -m37454R(view, view2, jVar));
        return rectF.centerY() - rectF2.top;
    }

    /* renamed from: Q */
    private float m37453Q(View view, View view2, C7510j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f29250d;
        RectF rectF2 = this.f29251e;
        m37449M(view, rectF);
        m37456T(view2, rectF2);
        int i = jVar.f32719a & 7;
        if (i == 1) {
            f3 = rectF2.centerX();
            f2 = rectF.centerX();
        } else if (i == 3) {
            f3 = rectF2.left;
            f2 = rectF.left;
        } else if (i != 5) {
            f = 0.0f;
            return f + jVar.f32720b;
        } else {
            f3 = rectF2.right;
            f2 = rectF.right;
        }
        f = f3 - f2;
        return f + jVar.f32720b;
    }

    /* renamed from: R */
    private float m37454R(View view, View view2, C7510j jVar) {
        float f;
        float f2;
        float f3;
        RectF rectF = this.f29250d;
        RectF rectF2 = this.f29251e;
        m37449M(view, rectF);
        m37456T(view2, rectF2);
        int i = jVar.f32719a & 112;
        if (i == 16) {
            f3 = rectF2.centerY();
            f2 = rectF.centerY();
        } else if (i == 48) {
            f3 = rectF2.top;
            f2 = rectF.top;
        } else if (i != 80) {
            f = 0.0f;
            return f + jVar.f32721c;
        } else {
            f3 = rectF2.bottom;
            f2 = rectF.bottom;
        }
        f = f3 - f2;
        return f + jVar.f32721c;
    }

    /* renamed from: S */
    private float m37455S(C6284e eVar, C7509i iVar, float f, float f2) {
        long c = iVar.mo28394c();
        long d = iVar.mo28395d();
        C7509i h = eVar.f29262a.mo28385h("expansion");
        return C7501a.m41940a(f, f2, iVar.mo28396e().getInterpolation(((float) (((h.mo28394c() + h.mo28395d()) + 17) - c)) / ((float) d)));
    }

    /* renamed from: T */
    private void m37456T(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        int[] iArr = this.f29252f;
        view.getLocationInWindow(iArr);
        rectF.offsetTo((float) iArr[0], (float) iArr[1]);
        rectF.offset((float) ((int) (-view.getTranslationX())), (float) ((int) (-view.getTranslationY())));
    }

    /* renamed from: U */
    private void m37457U(View view, View view2, boolean z, boolean z2, C6284e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup K;
        ObjectAnimator objectAnimator;
        if (view2 instanceof ViewGroup) {
            if ((!(view2 instanceof C5967c) || C5965b.f28092j != 0) && (K = m37447K(view2)) != null) {
                if (z) {
                    if (!z2) {
                        C7504d.f32705a.set(K, Float.valueOf(0.0f));
                    }
                    objectAnimator = ObjectAnimator.ofFloat(K, C7504d.f32705a, new float[]{1.0f});
                } else {
                    objectAnimator = ObjectAnimator.ofFloat(K, C7504d.f32705a, new float[]{0.0f});
                }
                eVar.f29262a.mo28385h("contentFade").mo28393a(objectAnimator);
                list.add(objectAnimator);
            }
        }
    }

    /* renamed from: V */
    private void m37458V(View view, View view2, boolean z, boolean z2, C6284e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if (view2 instanceof C5967c) {
            C5967c cVar = (C5967c) view2;
            int d0 = m37466d0(view);
            int i = 16777215 & d0;
            if (z) {
                if (!z2) {
                    cVar.setCircularRevealScrimColor(d0);
                }
                objectAnimator = ObjectAnimator.ofInt(cVar, C5967c.C5971d.f28105a, new int[]{i});
            } else {
                objectAnimator = ObjectAnimator.ofInt(cVar, C5967c.C5971d.f28105a, new int[]{d0});
            }
            objectAnimator.setEvaluator(C7503c.m41944b());
            eVar.f29262a.mo28385h("color").mo28393a(objectAnimator);
            list.add(objectAnimator);
        }
    }

    /* renamed from: W */
    private void m37459W(View view, View view2, boolean z, C6284e eVar, List<Animator> list) {
        float Q = m37453Q(view, view2, eVar.f29263b);
        float R = m37454R(view, view2, eVar.f29263b);
        Pair<C7509i, C7509i> N = m37450N(Q, R, z, eVar);
        C7509i iVar = (C7509i) N.first;
        C7509i iVar2 = (C7509i) N.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z) {
            Q = this.f29253g;
        }
        fArr[0] = Q;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z) {
            R = this.f29254h;
        }
        fArr2[0] = R;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, property2, fArr2);
        iVar.mo28393a(ofFloat);
        iVar2.mo28393a(ofFloat2);
        list.add(ofFloat);
        list.add(ofFloat2);
    }

    @TargetApi(21)
    /* renamed from: X */
    private void m37460X(View view, View view2, boolean z, boolean z2, C6284e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        float w = C3774v.m16232w(view2) - C3774v.m16232w(view);
        if (z) {
            if (!z2) {
                view2.setTranslationZ(-w);
            }
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{0.0f});
        } else {
            objectAnimator = ObjectAnimator.ofFloat(view2, View.TRANSLATION_Z, new float[]{-w});
        }
        eVar.f29262a.mo28385h("elevation").mo28393a(objectAnimator);
        list.add(objectAnimator);
    }

    /* renamed from: Y */
    private void m37461Y(View view, View view2, boolean z, boolean z2, C6284e eVar, float f, float f2, List<Animator> list, List<Animator.AnimatorListener> list2) {
        Animator animator;
        View view3 = view;
        View view4 = view2;
        C6284e eVar2 = eVar;
        if (view4 instanceof C5967c) {
            C5967c cVar = (C5967c) view4;
            float O = m37451O(view3, view4, eVar2.f29263b);
            float P = m37452P(view3, view4, eVar2.f29263b);
            ((FloatingActionButton) view3).mo23852h(this.f29249c);
            float width = ((float) this.f29249c.width()) / 2.0f;
            C7509i h = eVar2.f29262a.mo28385h("expansion");
            if (z) {
                if (!z2) {
                    cVar.setRevealInfo(new C5967c.C5972e(O, P, width));
                }
                if (z2) {
                    width = cVar.getRevealInfo().f28108c;
                }
                animator = C5963a.m35927a(cVar, O, P, C7518a.m42000b(O, P, 0.0f, 0.0f, f, f2));
                animator.addListener(new C6283d(this, cVar));
                m37464b0(view2, h.mo28394c(), (int) O, (int) P, width, list);
            } else {
                float f3 = cVar.getRevealInfo().f28108c;
                Animator a = C5963a.m35927a(cVar, O, P, width);
                int i = (int) O;
                int i2 = (int) P;
                View view5 = view2;
                m37464b0(view5, h.mo28394c(), i, i2, f3, list);
                long c = h.mo28394c();
                long d = h.mo28395d();
                long i3 = eVar2.f29262a.mo28387i();
                m37463a0(view5, c, d, i3, i, i2, width, list);
                animator = a;
            }
            h.mo28393a(animator);
            list.add(animator);
            list2.add(C5963a.m35928b(cVar));
        }
    }

    /* renamed from: Z */
    private void m37462Z(View view, View view2, boolean z, boolean z2, C6284e eVar, List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimator;
        if ((view2 instanceof C5967c) && (view instanceof ImageView)) {
            C5967c cVar = (C5967c) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable != null) {
                drawable.mutate();
                if (z) {
                    if (!z2) {
                        drawable.setAlpha(255);
                    }
                    objectAnimator = ObjectAnimator.ofInt(drawable, C7505e.f32706b, new int[]{0});
                } else {
                    objectAnimator = ObjectAnimator.ofInt(drawable, C7505e.f32706b, new int[]{255});
                }
                objectAnimator.addUpdateListener(new C6281b(this, view2));
                eVar.f29262a.mo28385h("iconFade").mo28393a(objectAnimator);
                list.add(objectAnimator);
                list2.add(new C6282c(this, cVar, drawable));
            }
        }
    }

    /* renamed from: a0 */
    private void m37463a0(View view, long j, long j2, long j3, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21) {
            long j4 = j + j2;
            if (j4 < j3) {
                Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
                createCircularReveal.setStartDelay(j4);
                createCircularReveal.setDuration(j3 - j4);
                list.add(createCircularReveal);
            }
        }
    }

    /* renamed from: b0 */
    private void m37464b0(View view, long j, int i, int i2, float f, List<Animator> list) {
        if (Build.VERSION.SDK_INT >= 21 && j > 0) {
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, i, i2, f, f);
            createCircularReveal.setStartDelay(0);
            createCircularReveal.setDuration(j);
            list.add(createCircularReveal);
        }
    }

    /* renamed from: c0 */
    private void m37465c0(View view, View view2, boolean z, boolean z2, C6284e eVar, List<Animator> list, List<Animator.AnimatorListener> list2, RectF rectF) {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2;
        View view3 = view;
        View view4 = view2;
        boolean z3 = z;
        C6284e eVar2 = eVar;
        List<Animator> list3 = list;
        float Q = m37453Q(view3, view4, eVar2.f29263b);
        float R = m37454R(view3, view4, eVar2.f29263b);
        Pair<C7509i, C7509i> N = m37450N(Q, R, z3, eVar2);
        C7509i iVar = (C7509i) N.first;
        C7509i iVar2 = (C7509i) N.second;
        if (z3) {
            if (!z2) {
                view4.setTranslationX(-Q);
                view4.setTranslationY(-R);
            }
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{0.0f});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{0.0f});
            m37448L(view2, eVar, iVar, iVar2, -Q, -R, 0.0f, 0.0f, rectF);
        } else {
            objectAnimator2 = ObjectAnimator.ofFloat(view4, View.TRANSLATION_X, new float[]{-Q});
            objectAnimator = ObjectAnimator.ofFloat(view4, View.TRANSLATION_Y, new float[]{-R});
        }
        iVar.mo28393a(objectAnimator2);
        iVar2.mo28393a(objectAnimator);
        list3.add(objectAnimator2);
        list3.add(objectAnimator);
    }

    /* renamed from: d0 */
    private int m37466d0(View view) {
        ColorStateList s = C3774v.m16224s(view);
        if (s != null) {
            return s.getColorForState(view.getDrawableState(), s.getDefaultColor());
        }
        return 0;
    }

    /* renamed from: f0 */
    private ViewGroup m37467f0(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public AnimatorSet mo25132J(View view, View view2, boolean z, boolean z2) {
        boolean z3 = z;
        C6284e e0 = mo25134e0(view2.getContext(), z3);
        if (z3) {
            this.f29253g = view.getTranslationX();
            this.f29254h = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (Build.VERSION.SDK_INT >= 21) {
            m37460X(view, view2, z, z2, e0, arrayList, arrayList2);
        }
        RectF rectF = this.f29250d;
        View view3 = view;
        View view4 = view2;
        boolean z4 = z;
        ArrayList arrayList3 = arrayList;
        ArrayList arrayList4 = arrayList2;
        m37465c0(view3, view4, z4, z2, e0, arrayList3, arrayList4, rectF);
        float width = rectF.width();
        float height = rectF.height();
        m37459W(view3, view4, z4, e0, arrayList);
        boolean z5 = z2;
        C6284e eVar = e0;
        m37462Z(view3, view4, z4, z5, eVar, arrayList3, arrayList4);
        m37461Y(view3, view4, z4, z5, eVar, width, height, arrayList, arrayList2);
        ArrayList arrayList5 = arrayList;
        ArrayList arrayList6 = arrayList2;
        m37458V(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        m37457U(view3, view4, z4, z5, eVar, arrayList5, arrayList6);
        AnimatorSet animatorSet = new AnimatorSet();
        C7502b.m41943a(animatorSet, arrayList);
        animatorSet.addListener(new C6280a(this, z3, view2, view));
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            animatorSet.addListener((Animator.AnimatorListener) arrayList2.get(i));
        }
        return animatorSet;
    }

    /* renamed from: e */
    public boolean mo3055e(CoordinatorLayout coordinatorLayout, View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        } else if (!(view2 instanceof FloatingActionButton)) {
            return false;
        } else {
            int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
            if (expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId()) {
                return true;
            }
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e0 */
    public abstract C6284e mo25134e0(Context context, boolean z);

    /* renamed from: g */
    public void mo3057g(CoordinatorLayout.C0450e eVar) {
        if (eVar.f2500h == 0) {
            eVar.f2500h = 80;
        }
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
