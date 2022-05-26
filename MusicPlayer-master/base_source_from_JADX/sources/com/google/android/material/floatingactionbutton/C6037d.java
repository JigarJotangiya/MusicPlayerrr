package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.FloatEvaluator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.core.graphics.drawable.C0534a;
import com.google.android.material.internal.C6082h;
import java.util.ArrayList;
import java.util.Iterator;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3774v;
import p159f.p243f.p245b.p304b.C7489a;
import p159f.p243f.p245b.p304b.p305m.C7501a;
import p159f.p243f.p245b.p304b.p305m.C7502b;
import p159f.p243f.p245b.p304b.p305m.C7506f;
import p159f.p243f.p245b.p304b.p305m.C7507g;
import p159f.p243f.p245b.p304b.p305m.C7508h;
import p159f.p243f.p245b.p304b.p313u.C7528a;
import p159f.p243f.p245b.p304b.p313u.C7531b;
import p159f.p243f.p245b.p304b.p314v.C7533b;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7545i;
import p159f.p243f.p245b.p304b.p315w.C7549m;
import p159f.p243f.p245b.p304b.p315w.C7565p;

/* renamed from: com.google.android.material.floatingactionbutton.d */
/* compiled from: FloatingActionButtonImpl */
class C6037d {

    /* renamed from: F */
    static final TimeInterpolator f28293F = C7501a.f32701c;

    /* renamed from: G */
    static final int[] f28294G = {16842919, 16842910};

    /* renamed from: H */
    static final int[] f28295H = {16843623, 16842908, 16842910};

    /* renamed from: I */
    static final int[] f28296I = {16842908, 16842910};

    /* renamed from: J */
    static final int[] f28297J = {16843623, 16842910};

    /* renamed from: K */
    static final int[] f28298K = {16842910};

    /* renamed from: L */
    static final int[] f28299L = new int[0];

    /* renamed from: A */
    private final Rect f28300A = new Rect();

    /* renamed from: B */
    private final RectF f28301B = new RectF();

    /* renamed from: C */
    private final RectF f28302C = new RectF();

    /* renamed from: D */
    private final Matrix f28303D = new Matrix();

    /* renamed from: E */
    private ViewTreeObserver.OnPreDrawListener f28304E;

    /* renamed from: a */
    C7549m f28305a;

    /* renamed from: b */
    C7541h f28306b;

    /* renamed from: c */
    Drawable f28307c;

    /* renamed from: d */
    C6034c f28308d;

    /* renamed from: e */
    Drawable f28309e;

    /* renamed from: f */
    boolean f28310f;

    /* renamed from: g */
    boolean f28311g = true;

    /* renamed from: h */
    float f28312h;

    /* renamed from: i */
    float f28313i;

    /* renamed from: j */
    float f28314j;

    /* renamed from: k */
    int f28315k;

    /* renamed from: l */
    private final C6082h f28316l;

    /* renamed from: m */
    private C7508h f28317m;

    /* renamed from: n */
    private C7508h f28318n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public Animator f28319o;

    /* renamed from: p */
    private C7508h f28320p;

    /* renamed from: q */
    private C7508h f28321q;

    /* renamed from: r */
    private float f28322r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public float f28323s = 1.0f;

    /* renamed from: t */
    private int f28324t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public int f28325u = 0;

    /* renamed from: v */
    private ArrayList<Animator.AnimatorListener> f28326v;

    /* renamed from: w */
    private ArrayList<Animator.AnimatorListener> f28327w;

    /* renamed from: x */
    private ArrayList<C6046i> f28328x;

    /* renamed from: y */
    final FloatingActionButton f28329y;

    /* renamed from: z */
    final C7533b f28330z;

    /* renamed from: com.google.android.material.floatingactionbutton.d$a */
    /* compiled from: FloatingActionButtonImpl */
    class C6038a extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f28331a;

        /* renamed from: b */
        final /* synthetic */ boolean f28332b;

        /* renamed from: c */
        final /* synthetic */ C6047j f28333c;

        C6038a(boolean z, C6047j jVar) {
            this.f28332b = z;
            this.f28333c = jVar;
        }

        public void onAnimationCancel(Animator animator) {
            this.f28331a = true;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C6037d.this.f28325u = 0;
            Animator unused2 = C6037d.this.f28319o = null;
            if (!this.f28331a) {
                FloatingActionButton floatingActionButton = C6037d.this.f28329y;
                boolean z = this.f28332b;
                floatingActionButton.mo24109a(z ? 8 : 4, z);
                C6047j jVar = this.f28333c;
                if (jVar != null) {
                    jVar.mo23904b();
                }
            }
        }

        public void onAnimationStart(Animator animator) {
            C6037d.this.f28329y.mo24109a(0, this.f28332b);
            int unused = C6037d.this.f28325u = 1;
            Animator unused2 = C6037d.this.f28319o = animator;
            this.f28331a = false;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$b */
    /* compiled from: FloatingActionButtonImpl */
    class C6039b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ boolean f28335a;

        /* renamed from: b */
        final /* synthetic */ C6047j f28336b;

        C6039b(boolean z, C6047j jVar) {
            this.f28335a = z;
            this.f28336b = jVar;
        }

        public void onAnimationEnd(Animator animator) {
            int unused = C6037d.this.f28325u = 0;
            Animator unused2 = C6037d.this.f28319o = null;
            C6047j jVar = this.f28336b;
            if (jVar != null) {
                jVar.mo23903a();
            }
        }

        public void onAnimationStart(Animator animator) {
            C6037d.this.f28329y.mo24109a(0, this.f28335a);
            int unused = C6037d.this.f28325u = 2;
            Animator unused2 = C6037d.this.f28319o = animator;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$c */
    /* compiled from: FloatingActionButtonImpl */
    class C6040c extends C7507g {
        C6040c() {
        }

        /* renamed from: a */
        public Matrix mo23995a(float f, Matrix matrix, Matrix matrix2) {
            float unused = C6037d.this.f28323s = f;
            return super.evaluate(f, matrix, matrix2);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$d */
    /* compiled from: FloatingActionButtonImpl */
    class C6041d implements TypeEvaluator<Float> {

        /* renamed from: a */
        FloatEvaluator f28339a = new FloatEvaluator();

        C6041d(C6037d dVar) {
        }

        /* renamed from: a */
        public Float evaluate(float f, Float f2, Float f3) {
            float floatValue = this.f28339a.evaluate(f, f2, f3).floatValue();
            if (floatValue < 0.1f) {
                floatValue = 0.0f;
            }
            return Float.valueOf(floatValue);
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$e */
    /* compiled from: FloatingActionButtonImpl */
    class C6042e implements ViewTreeObserver.OnPreDrawListener {
        C6042e() {
        }

        public boolean onPreDraw() {
            C6037d.this.mo23948H();
            return true;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$f */
    /* compiled from: FloatingActionButtonImpl */
    private class C6043f extends C6049l {
        C6043f(C6037d dVar) {
            super(dVar, (C6038a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo23999a() {
            return 0.0f;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$g */
    /* compiled from: FloatingActionButtonImpl */
    private class C6044g extends C6049l {
        C6044g() {
            super(C6037d.this, (C6038a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo23999a() {
            C6037d dVar = C6037d.this;
            return dVar.f28312h + dVar.f28313i;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$h */
    /* compiled from: FloatingActionButtonImpl */
    private class C6045h extends C6049l {
        C6045h() {
            super(C6037d.this, (C6038a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo23999a() {
            C6037d dVar = C6037d.this;
            return dVar.f28312h + dVar.f28314j;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$i */
    /* compiled from: FloatingActionButtonImpl */
    interface C6046i {
        /* renamed from: a */
        void mo23908a();

        /* renamed from: b */
        void mo23909b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$j */
    /* compiled from: FloatingActionButtonImpl */
    interface C6047j {
        /* renamed from: a */
        void mo23903a();

        /* renamed from: b */
        void mo23904b();
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$k */
    /* compiled from: FloatingActionButtonImpl */
    private class C6048k extends C6049l {
        C6048k() {
            super(C6037d.this, (C6038a) null);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public float mo23999a() {
            return C6037d.this.f28312h;
        }
    }

    /* renamed from: com.google.android.material.floatingactionbutton.d$l */
    /* compiled from: FloatingActionButtonImpl */
    private abstract class C6049l extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a */
        private boolean f28344a;

        /* renamed from: b */
        private float f28345b;

        /* renamed from: c */
        private float f28346c;

        private C6049l() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public abstract float mo23999a();

        public void onAnimationEnd(Animator animator) {
            C6037d.this.mo23975g0((float) ((int) this.f28346c));
            this.f28344a = false;
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (!this.f28344a) {
                C7541h hVar = C6037d.this.f28306b;
                this.f28345b = hVar == null ? 0.0f : hVar.mo28488w();
                this.f28346c = mo23999a();
                this.f28344a = true;
            }
            C6037d dVar = C6037d.this;
            float f = this.f28345b;
            dVar.mo23975g0((float) ((int) (f + ((this.f28346c - f) * valueAnimator.getAnimatedFraction()))));
        }

        /* synthetic */ C6049l(C6037d dVar, C6038a aVar) {
            this();
        }
    }

    C6037d(FloatingActionButton floatingActionButton, C7533b bVar) {
        this.f28329y = floatingActionButton;
        this.f28330z = bVar;
        C6082h hVar = new C6082h();
        this.f28316l = hVar;
        hVar.mo24203a(f28294G, m36255i(new C6045h()));
        hVar.mo24203a(f28295H, m36255i(new C6044g()));
        hVar.mo24203a(f28296I, m36255i(new C6044g()));
        hVar.mo24203a(f28297J, m36255i(new C6044g()));
        hVar.mo24203a(f28298K, m36255i(new C6048k()));
        hVar.mo24203a(f28299L, m36255i(new C6043f(this)));
        this.f28322r = floatingActionButton.getRotation();
    }

    /* renamed from: a0 */
    private boolean m36249a0() {
        return C3774v.m16181T(this.f28329y) && !this.f28329y.isInEditMode();
    }

    /* renamed from: g */
    private void m36252g(float f, Matrix matrix) {
        matrix.reset();
        Drawable drawable = this.f28329y.getDrawable();
        if (drawable != null && this.f28324t != 0) {
            RectF rectF = this.f28301B;
            RectF rectF2 = this.f28302C;
            rectF.set(0.0f, 0.0f, (float) drawable.getIntrinsicWidth(), (float) drawable.getIntrinsicHeight());
            int i = this.f28324t;
            rectF2.set(0.0f, 0.0f, (float) i, (float) i);
            matrix.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
            int i2 = this.f28324t;
            matrix.postScale(f, f, ((float) i2) / 2.0f, ((float) i2) / 2.0f);
        }
    }

    /* renamed from: h */
    private AnimatorSet m36253h(C7508h hVar, float f, float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f28329y, View.ALPHA, new float[]{f});
        hVar.mo28385h("opacity").mo28393a(ofFloat);
        arrayList.add(ofFloat);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.f28329y, View.SCALE_X, new float[]{f2});
        hVar.mo28385h("scale").mo28393a(ofFloat2);
        m36254h0(ofFloat2);
        arrayList.add(ofFloat2);
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(this.f28329y, View.SCALE_Y, new float[]{f2});
        hVar.mo28385h("scale").mo28393a(ofFloat3);
        m36254h0(ofFloat3);
        arrayList.add(ofFloat3);
        m36252g(f3, this.f28303D);
        ObjectAnimator ofObject = ObjectAnimator.ofObject(this.f28329y, new C7506f(), new C6040c(), new Matrix[]{new Matrix(this.f28303D)});
        hVar.mo28385h("iconScale").mo28393a(ofObject);
        arrayList.add(ofObject);
        AnimatorSet animatorSet = new AnimatorSet();
        C7502b.m41943a(animatorSet, arrayList);
        return animatorSet;
    }

    /* renamed from: h0 */
    private void m36254h0(ObjectAnimator objectAnimator) {
        if (Build.VERSION.SDK_INT == 26) {
            objectAnimator.setEvaluator(new C6041d(this));
        }
    }

    /* renamed from: i */
    private ValueAnimator m36255i(C6049l lVar) {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setInterpolator(f28293F);
        valueAnimator.setDuration(100);
        valueAnimator.addListener(lVar);
        valueAnimator.addUpdateListener(lVar);
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        return valueAnimator;
    }

    /* renamed from: l */
    private C7508h m36256l() {
        if (this.f28318n == null) {
            this.f28318n = C7508h.m41956d(this.f28329y.getContext(), C7489a.design_fab_hide_motion_spec);
        }
        C7508h hVar = this.f28318n;
        C3703i.m15827d(hVar);
        return hVar;
    }

    /* renamed from: m */
    private C7508h m36257m() {
        if (this.f28317m == null) {
            this.f28317m = C7508h.m41956d(this.f28329y.getContext(), C7489a.design_fab_show_motion_spec);
        }
        C7508h hVar = this.f28317m;
        C3703i.m15827d(hVar);
        return hVar;
    }

    /* renamed from: r */
    private ViewTreeObserver.OnPreDrawListener m36258r() {
        if (this.f28304E == null) {
            this.f28304E = new C6042e();
        }
        return this.f28304E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo23941A() {
        this.f28316l.mo24204c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo23942B() {
        C7541h hVar = this.f28306b;
        if (hVar != null) {
            C7545i.m42140f(this.f28329y, hVar);
        }
        if (mo23951K()) {
            this.f28329y.getViewTreeObserver().addOnPreDrawListener(m36258r());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public void mo23943C() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public void mo23944D() {
        ViewTreeObserver viewTreeObserver = this.f28329y.getViewTreeObserver();
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f28304E;
        if (onPreDrawListener != null) {
            viewTreeObserver.removeOnPreDrawListener(onPreDrawListener);
            this.f28304E = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: E */
    public void mo23945E(int[] iArr) {
        this.f28316l.mo24205d(iArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public void mo23946F(float f, float f2, float f3) {
        mo23974f0();
        mo23975g0(f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public void mo23947G(Rect rect) {
        C3703i.m15828e(this.f28309e, "Didn't initialize content background");
        if (mo23966Z()) {
            this.f28330z.mo23907c(new InsetDrawable(this.f28309e, rect.left, rect.top, rect.right, rect.bottom));
            return;
        }
        this.f28330z.mo23907c(this.f28309e);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo23948H() {
        float rotation = this.f28329y.getRotation();
        if (this.f28322r != rotation) {
            this.f28322r = rotation;
            mo23970d0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: I */
    public void mo23949I() {
        ArrayList<C6046i> arrayList = this.f28328x;
        if (arrayList != null) {
            Iterator<C6046i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo23909b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public void mo23950J() {
        ArrayList<C6046i> arrayList = this.f28328x;
        if (arrayList != null) {
            Iterator<C6046i> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().mo23908a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public boolean mo23951K() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public void mo23952L(ColorStateList colorStateList) {
        C7541h hVar = this.f28306b;
        if (hVar != null) {
            hVar.setTintList(colorStateList);
        }
        C6034c cVar = this.f28308d;
        if (cVar != null) {
            cVar.mo23925c(colorStateList);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public void mo23953M(PorterDuff.Mode mode) {
        C7541h hVar = this.f28306b;
        if (hVar != null) {
            hVar.setTintMode(mode);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public final void mo23954N(float f) {
        if (this.f28312h != f) {
            this.f28312h = f;
            mo23946F(f, this.f28313i, this.f28314j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public void mo23955O(boolean z) {
        this.f28310f = z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public final void mo23956P(C7508h hVar) {
        this.f28321q = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo23957Q(float f) {
        if (this.f28313i != f) {
            this.f28313i = f;
            mo23946F(this.f28312h, f, this.f28314j);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public final void mo23958R(float f) {
        this.f28323s = f;
        Matrix matrix = this.f28303D;
        m36252g(f, matrix);
        this.f28329y.setImageMatrix(matrix);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public final void mo23959S(int i) {
        if (this.f28324t != i) {
            this.f28324t = i;
            mo23972e0();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public void mo23960T(int i) {
        this.f28315k = i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: U */
    public final void mo23961U(float f) {
        if (this.f28314j != f) {
            this.f28314j = f;
            mo23946F(this.f28312h, this.f28313i, f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo23962V(ColorStateList colorStateList) {
        Drawable drawable = this.f28307c;
        if (drawable != null) {
            C0534a.m3289o(drawable, C7531b.m42046d(colorStateList));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo23963W(boolean z) {
        this.f28311g = z;
        mo23974f0();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public final void mo23964X(C7549m mVar) {
        this.f28305a = mVar;
        C7541h hVar = this.f28306b;
        if (hVar != null) {
            hVar.setShapeAppearanceModel(mVar);
        }
        Drawable drawable = this.f28307c;
        if (drawable instanceof C7565p) {
            ((C7565p) drawable).setShapeAppearanceModel(mVar);
        }
        C6034c cVar = this.f28308d;
        if (cVar != null) {
            cVar.mo23929f(mVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public final void mo23965Y(C7508h hVar) {
        this.f28320p = hVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public boolean mo23966Z() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b0 */
    public final boolean mo23967b0() {
        return !this.f28310f || this.f28329y.getSizeDimension() >= this.f28315k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c0 */
    public void mo23968c0(C6047j jVar, boolean z) {
        if (!mo23989z()) {
            Animator animator = this.f28319o;
            if (animator != null) {
                animator.cancel();
            }
            if (m36249a0()) {
                if (this.f28329y.getVisibility() != 0) {
                    this.f28329y.setAlpha(0.0f);
                    this.f28329y.setScaleY(0.0f);
                    this.f28329y.setScaleX(0.0f);
                    mo23958R(0.0f);
                }
                C7508h hVar = this.f28320p;
                if (hVar == null) {
                    hVar = m36257m();
                }
                AnimatorSet h = m36253h(hVar, 1.0f, 1.0f, 1.0f);
                h.addListener(new C6039b(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f28326v;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f28329y.mo24109a(0, z);
            this.f28329y.setAlpha(1.0f);
            this.f28329y.setScaleY(1.0f);
            this.f28329y.setScaleX(1.0f);
            mo23958R(1.0f);
            if (jVar != null) {
                jVar.mo23903a();
            }
        }
    }

    /* renamed from: d */
    public void mo23969d(Animator.AnimatorListener animatorListener) {
        if (this.f28327w == null) {
            this.f28327w = new ArrayList<>();
        }
        this.f28327w.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void mo23970d0() {
        if (Build.VERSION.SDK_INT == 19) {
            if (this.f28322r % 90.0f != 0.0f) {
                if (this.f28329y.getLayerType() != 1) {
                    this.f28329y.setLayerType(1, (Paint) null);
                }
            } else if (this.f28329y.getLayerType() != 0) {
                this.f28329y.setLayerType(0, (Paint) null);
            }
        }
        C7541h hVar = this.f28306b;
        if (hVar != null) {
            hVar.mo28474h0((int) this.f28322r);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo23971e(Animator.AnimatorListener animatorListener) {
        if (this.f28326v == null) {
            this.f28326v = new ArrayList<>();
        }
        this.f28326v.add(animatorListener);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e0 */
    public final void mo23972e0() {
        mo23958R(this.f28323s);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo23973f(C6046i iVar) {
        if (this.f28328x == null) {
            this.f28328x = new ArrayList<>();
        }
        this.f28328x.add(iVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public final void mo23974f0() {
        Rect rect = this.f28300A;
        mo23982s(rect);
        mo23947G(rect);
        this.f28330z.mo23905a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g0 */
    public void mo23975g0(float f) {
        C7541h hVar = this.f28306b;
        if (hVar != null) {
            hVar.mo28462Z(f);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public C7541h mo23976j() {
        C7549m mVar = this.f28305a;
        C3703i.m15827d(mVar);
        return new C7541h(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public final Drawable mo23977k() {
        return this.f28309e;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public float mo23978n() {
        return this.f28312h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public boolean mo23979o() {
        return this.f28310f;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C7508h mo23980p() {
        return this.f28321q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public float mo23981q() {
        return this.f28313i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo23982s(Rect rect) {
        int sizeDimension = this.f28310f ? (this.f28315k - this.f28329y.getSizeDimension()) / 2 : 0;
        float n = this.f28311g ? mo23978n() + this.f28314j : 0.0f;
        int max = Math.max(sizeDimension, (int) Math.ceil((double) n));
        int max2 = Math.max(sizeDimension, (int) Math.ceil((double) (n * 1.5f)));
        rect.set(max, max2, max, max2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public float mo23983t() {
        return this.f28314j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C7549m mo23984u() {
        return this.f28305a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final C7508h mo23985v() {
        return this.f28320p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo23986w(C6047j jVar, boolean z) {
        if (!mo23988y()) {
            Animator animator = this.f28319o;
            if (animator != null) {
                animator.cancel();
            }
            if (m36249a0()) {
                C7508h hVar = this.f28321q;
                if (hVar == null) {
                    hVar = m36256l();
                }
                AnimatorSet h = m36253h(hVar, 0.0f, 0.0f, 0.0f);
                h.addListener(new C6038a(z, jVar));
                ArrayList<Animator.AnimatorListener> arrayList = this.f28327w;
                if (arrayList != null) {
                    Iterator<Animator.AnimatorListener> it = arrayList.iterator();
                    while (it.hasNext()) {
                        h.addListener(it.next());
                    }
                }
                h.start();
                return;
            }
            this.f28329y.mo24109a(z ? 8 : 4, z);
            if (jVar != null) {
                jVar.mo23904b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo23987x(ColorStateList colorStateList, PorterDuff.Mode mode, ColorStateList colorStateList2, int i) {
        C7541h j = mo23976j();
        this.f28306b = j;
        j.setTintList(colorStateList);
        if (mode != null) {
            this.f28306b.setTintMode(mode);
        }
        this.f28306b.mo28469g0(-12303292);
        this.f28306b.mo28456P(this.f28329y.getContext());
        C7528a aVar = new C7528a(this.f28306b.mo28448D());
        aVar.setTintList(C7531b.m42046d(colorStateList2));
        this.f28307c = aVar;
        C7541h hVar = this.f28306b;
        C3703i.m15827d(hVar);
        this.f28309e = new LayerDrawable(new Drawable[]{hVar, aVar});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public boolean mo23988y() {
        if (this.f28329y.getVisibility() == 0) {
            if (this.f28325u == 1) {
                return true;
            }
            return false;
        } else if (this.f28325u != 2) {
            return true;
        } else {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: z */
    public boolean mo23989z() {
        if (this.f28329y.getVisibility() != 0) {
            if (this.f28325u == 2) {
                return true;
            }
            return false;
        } else if (this.f28325u != 1) {
            return true;
        } else {
            return false;
        }
    }
}
