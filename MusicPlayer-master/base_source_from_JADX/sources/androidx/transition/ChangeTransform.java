package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.p003d.C0533g;
import org.xmlpull.v1.XmlPullParser;
import p082e.p109h.p119p.C3774v;

public class ChangeTransform extends Transition {

    /* renamed from: S */
    private static final String[] f4525S = {"android:changeTransform:matrix", "android:changeTransform:transforms", "android:changeTransform:parentMatrix"};

    /* renamed from: T */
    private static final Property<C1077e, float[]> f4526T = new C1073a(float[].class, "nonTranslations");

    /* renamed from: U */
    private static final Property<C1077e, PointF> f4527U = new C1074b(PointF.class, "translations");

    /* renamed from: V */
    private static final boolean f4528V = (Build.VERSION.SDK_INT >= 21);

    /* renamed from: P */
    boolean f4529P = true;

    /* renamed from: Q */
    private boolean f4530Q = true;

    /* renamed from: R */
    private Matrix f4531R = new Matrix();

    /* renamed from: androidx.transition.ChangeTransform$a */
    static class C1073a extends Property<C1077e, float[]> {
        C1073a(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public float[] get(C1077e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1077e eVar, float[] fArr) {
            eVar.mo5947d(fArr);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$b */
    static class C1074b extends Property<C1077e, PointF> {
        C1074b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1077e eVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1077e eVar, PointF pointF) {
            eVar.mo5946c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$c */
    class C1075c extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4532a;

        /* renamed from: b */
        private Matrix f4533b = new Matrix();

        /* renamed from: c */
        final /* synthetic */ boolean f4534c;

        /* renamed from: d */
        final /* synthetic */ Matrix f4535d;

        /* renamed from: e */
        final /* synthetic */ View f4536e;

        /* renamed from: f */
        final /* synthetic */ C1078f f4537f;

        /* renamed from: g */
        final /* synthetic */ C1077e f4538g;

        C1075c(boolean z, Matrix matrix, View view, C1078f fVar, C1077e eVar) {
            this.f4534c = z;
            this.f4535d = matrix;
            this.f4536e = view;
            this.f4537f = fVar;
            this.f4538g = eVar;
        }

        /* renamed from: a */
        private void m6175a(Matrix matrix) {
            this.f4533b.set(matrix);
            this.f4536e.setTag(C1143p.transition_transform, this.f4533b);
            this.f4537f.mo5948a(this.f4536e);
        }

        public void onAnimationCancel(Animator animator) {
            this.f4532a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4532a) {
                if (!this.f4534c || !ChangeTransform.this.f4529P) {
                    this.f4536e.setTag(C1143p.transition_transform, (Object) null);
                    this.f4536e.setTag(C1143p.parent_matrix, (Object) null);
                } else {
                    m6175a(this.f4535d);
                }
            }
            C1129j0.m6440f(this.f4536e, (Matrix) null);
            this.f4537f.mo5948a(this.f4536e);
        }

        public void onAnimationPause(Animator animator) {
            m6175a(this.f4538g.mo5945a());
        }

        public void onAnimationResume(Animator animator) {
            ChangeTransform.m6164q0(this.f4536e);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$d */
    private static class C1076d extends C1153u {

        /* renamed from: a */
        private View f4540a;

        /* renamed from: b */
        private C1117f f4541b;

        C1076d(View view, C1117f fVar) {
            this.f4540a = view;
            this.f4541b = fVar;
        }

        /* renamed from: b */
        public void mo5920b(Transition transition) {
            this.f4541b.setVisibility(4);
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            transition.mo5971X(this);
            C1128j.m6434b(this.f4540a);
            this.f4540a.setTag(C1143p.transition_transform, (Object) null);
            this.f4540a.setTag(C1143p.parent_matrix, (Object) null);
        }

        /* renamed from: e */
        public void mo5923e(Transition transition) {
            this.f4541b.setVisibility(0);
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$e */
    private static class C1077e {

        /* renamed from: a */
        private final Matrix f4542a = new Matrix();

        /* renamed from: b */
        private final View f4543b;

        /* renamed from: c */
        private final float[] f4544c;

        /* renamed from: d */
        private float f4545d;

        /* renamed from: e */
        private float f4546e;

        C1077e(View view, float[] fArr) {
            this.f4543b = view;
            float[] fArr2 = (float[]) fArr.clone();
            this.f4544c = fArr2;
            this.f4545d = fArr2[2];
            this.f4546e = fArr2[5];
            m6179b();
        }

        /* renamed from: b */
        private void m6179b() {
            float[] fArr = this.f4544c;
            fArr[2] = this.f4545d;
            fArr[5] = this.f4546e;
            this.f4542a.setValues(fArr);
            C1129j0.m6440f(this.f4543b, this.f4542a);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public Matrix mo5945a() {
            return this.f4542a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5946c(PointF pointF) {
            this.f4545d = pointF.x;
            this.f4546e = pointF.y;
            m6179b();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo5947d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f4544c, 0, fArr.length);
            m6179b();
        }
    }

    /* renamed from: androidx.transition.ChangeTransform$f */
    private static class C1078f {

        /* renamed from: a */
        final float f4547a;

        /* renamed from: b */
        final float f4548b;

        /* renamed from: c */
        final float f4549c;

        /* renamed from: d */
        final float f4550d;

        /* renamed from: e */
        final float f4551e;

        /* renamed from: f */
        final float f4552f;

        /* renamed from: g */
        final float f4553g;

        /* renamed from: h */
        final float f4554h;

        C1078f(View view) {
            this.f4547a = view.getTranslationX();
            this.f4548b = view.getTranslationY();
            this.f4549c = C3774v.m16171L(view);
            this.f4550d = view.getScaleX();
            this.f4551e = view.getScaleY();
            this.f4552f = view.getRotationX();
            this.f4553g = view.getRotationY();
            this.f4554h = view.getRotation();
        }

        /* renamed from: a */
        public void mo5948a(View view) {
            ChangeTransform.m6166s0(view, this.f4547a, this.f4548b, this.f4549c, this.f4550d, this.f4551e, this.f4552f, this.f4553g, this.f4554h);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1078f)) {
                return false;
            }
            C1078f fVar = (C1078f) obj;
            if (fVar.f4547a == this.f4547a && fVar.f4548b == this.f4548b && fVar.f4549c == this.f4549c && fVar.f4550d == this.f4550d && fVar.f4551e == this.f4551e && fVar.f4552f == this.f4552f && fVar.f4553g == this.f4553g && fVar.f4554h == this.f4554h) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            float f = this.f4547a;
            int i = 0;
            int floatToIntBits = (f != 0.0f ? Float.floatToIntBits(f) : 0) * 31;
            float f2 = this.f4548b;
            int floatToIntBits2 = (floatToIntBits + (f2 != 0.0f ? Float.floatToIntBits(f2) : 0)) * 31;
            float f3 = this.f4549c;
            int floatToIntBits3 = (floatToIntBits2 + (f3 != 0.0f ? Float.floatToIntBits(f3) : 0)) * 31;
            float f4 = this.f4550d;
            int floatToIntBits4 = (floatToIntBits3 + (f4 != 0.0f ? Float.floatToIntBits(f4) : 0)) * 31;
            float f5 = this.f4551e;
            int floatToIntBits5 = (floatToIntBits4 + (f5 != 0.0f ? Float.floatToIntBits(f5) : 0)) * 31;
            float f6 = this.f4552f;
            int floatToIntBits6 = (floatToIntBits5 + (f6 != 0.0f ? Float.floatToIntBits(f6) : 0)) * 31;
            float f7 = this.f4553g;
            int floatToIntBits7 = (floatToIntBits6 + (f7 != 0.0f ? Float.floatToIntBits(f7) : 0)) * 31;
            float f8 = this.f4554h;
            if (f8 != 0.0f) {
                i = Float.floatToIntBits(f8);
            }
            return floatToIntBits7 + i;
        }
    }

    public ChangeTransform() {
    }

    /* renamed from: m0 */
    private void m6160m0(C1160y yVar) {
        View view = yVar.f4752b;
        if (view.getVisibility() != 8) {
            yVar.f4751a.put("android:changeTransform:parent", view.getParent());
            yVar.f4751a.put("android:changeTransform:transforms", new C1078f(view));
            Matrix matrix = view.getMatrix();
            yVar.f4751a.put("android:changeTransform:matrix", (matrix == null || matrix.isIdentity()) ? null : new Matrix(matrix));
            if (this.f4530Q) {
                Matrix matrix2 = new Matrix();
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                C1129j0.m6444j(viewGroup, matrix2);
                matrix2.preTranslate((float) (-viewGroup.getScrollX()), (float) (-viewGroup.getScrollY()));
                yVar.f4751a.put("android:changeTransform:parentMatrix", matrix2);
                yVar.f4751a.put("android:changeTransform:intermediateMatrix", view.getTag(C1143p.transition_transform));
                yVar.f4751a.put("android:changeTransform:intermediateParentMatrix", view.getTag(C1143p.parent_matrix));
            }
        }
    }

    /* renamed from: n0 */
    private void m6161n0(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        View view = yVar2.f4752b;
        Matrix matrix = new Matrix((Matrix) yVar2.f4751a.get("android:changeTransform:parentMatrix"));
        C1129j0.m6445k(viewGroup, matrix);
        C1117f a = C1128j.m6433a(view, viewGroup, matrix);
        if (a != null) {
            a.mo6038a((ViewGroup) yVar.f4751a.get("android:changeTransform:parent"), yVar.f4752b);
            Transition transition = this;
            while (true) {
                Transition transition2 = transition.f4604x;
                if (transition2 == null) {
                    break;
                }
                transition = transition2;
            }
            transition.mo5973a(new C1076d(view, a));
            if (f4528V) {
                View view2 = yVar.f4752b;
                if (view2 != yVar2.f4752b) {
                    C1129j0.m6442h(view2, 0.0f);
                }
                C1129j0.m6442h(view, 1.0f);
            }
        }
    }

    /* renamed from: o0 */
    private ObjectAnimator m6162o0(C1160y yVar, C1160y yVar2, boolean z) {
        Matrix matrix = (Matrix) yVar.f4751a.get("android:changeTransform:matrix");
        Matrix matrix2 = (Matrix) yVar2.f4751a.get("android:changeTransform:matrix");
        if (matrix == null) {
            matrix = C1134l.f4704a;
        }
        if (matrix2 == null) {
            matrix2 = C1134l.f4704a;
        }
        Matrix matrix3 = matrix2;
        if (matrix.equals(matrix3)) {
            return null;
        }
        View view = yVar2.f4752b;
        m6164q0(view);
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        matrix3.getValues(fArr2);
        C1077e eVar = new C1077e(view, fArr);
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(eVar, new PropertyValuesHolder[]{PropertyValuesHolder.ofObject(f4526T, new C1109d(new float[9]), new float[][]{fArr, fArr2}), C1141o.m6466a(f4527U, mo5959A().mo5884a(fArr[2], fArr[5], fArr2[2], fArr2[5]))});
        C1075c cVar = new C1075c(z, matrix3, view, (C1078f) yVar2.f4751a.get("android:changeTransform:transforms"), eVar);
        ofPropertyValuesHolder.addListener(cVar);
        C1101a.m6342a(ofPropertyValuesHolder, cVar);
        return ofPropertyValuesHolder;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r5 == r4.f4752b) goto L_0x001e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r4 == r5) goto L_0x001e;
     */
    /* renamed from: p0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m6163p0(android.view.ViewGroup r4, android.view.ViewGroup r5) {
        /*
            r3 = this;
            boolean r0 = r3.mo5968M(r4)
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r3.mo5968M(r5)
            if (r0 != 0) goto L_0x000f
            goto L_0x001a
        L_0x000f:
            androidx.transition.y r4 = r3.mo6000y(r4, r1)
            if (r4 == 0) goto L_0x001f
            android.view.View r4 = r4.f4752b
            if (r5 != r4) goto L_0x001d
            goto L_0x001e
        L_0x001a:
            if (r4 != r5) goto L_0x001d
            goto L_0x001e
        L_0x001d:
            r1 = 0
        L_0x001e:
            r2 = r1
        L_0x001f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeTransform.m6163p0(android.view.ViewGroup, android.view.ViewGroup):boolean");
    }

    /* renamed from: q0 */
    static void m6164q0(View view) {
        m6166s0(view, 0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f);
    }

    /* renamed from: r0 */
    private void m6165r0(C1160y yVar, C1160y yVar2) {
        Matrix matrix = (Matrix) yVar2.f4751a.get("android:changeTransform:parentMatrix");
        yVar2.f4752b.setTag(C1143p.parent_matrix, matrix);
        Matrix matrix2 = this.f4531R;
        matrix2.reset();
        matrix.invert(matrix2);
        Matrix matrix3 = (Matrix) yVar.f4751a.get("android:changeTransform:matrix");
        if (matrix3 == null) {
            matrix3 = new Matrix();
            yVar.f4751a.put("android:changeTransform:matrix", matrix3);
        }
        matrix3.postConcat((Matrix) yVar.f4751a.get("android:changeTransform:parentMatrix"));
        matrix3.postConcat(matrix2);
    }

    /* renamed from: s0 */
    static void m6166s0(View view, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8) {
        view.setTranslationX(f);
        view.setTranslationY(f2);
        C3774v.m16166I0(view, f3);
        view.setScaleX(f4);
        view.setScaleY(f5);
        view.setRotationX(f6);
        view.setRotationY(f7);
        view.setRotation(f8);
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return f4525S;
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m6160m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m6160m0(yVar);
        if (!f4528V) {
            ((ViewGroup) yVar.f4752b.getParent()).startViewTransition(yVar.f4752b);
        }
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        if (yVar == null || yVar2 == null || !yVar.f4751a.containsKey("android:changeTransform:parent") || !yVar2.f4751a.containsKey("android:changeTransform:parent")) {
            return null;
        }
        ViewGroup viewGroup2 = (ViewGroup) yVar.f4751a.get("android:changeTransform:parent");
        boolean z = this.f4530Q && !m6163p0(viewGroup2, (ViewGroup) yVar2.f4751a.get("android:changeTransform:parent"));
        Matrix matrix = (Matrix) yVar.f4751a.get("android:changeTransform:intermediateMatrix");
        if (matrix != null) {
            yVar.f4751a.put("android:changeTransform:matrix", matrix);
        }
        Matrix matrix2 = (Matrix) yVar.f4751a.get("android:changeTransform:intermediateParentMatrix");
        if (matrix2 != null) {
            yVar.f4751a.put("android:changeTransform:parentMatrix", matrix2);
        }
        if (z) {
            m6165r0(yVar, yVar2);
        }
        ObjectAnimator o0 = m6162o0(yVar, yVar2, z);
        if (z && o0 != null && this.f4529P) {
            m6161n0(viewGroup, yVar, yVar2);
        } else if (!f4528V) {
            viewGroup2.endViewTransition(yVar.f4752b);
        }
        return o0;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeTransform(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4733e);
        XmlPullParser xmlPullParser = (XmlPullParser) attributeSet;
        this.f4529P = C0533g.m3242a(obtainStyledAttributes, xmlPullParser, "reparentWithOverlay", 1, true);
        this.f4530Q = C0533g.m3242a(obtainStyledAttributes, xmlPullParser, "reparent", 0, true);
        obtainStyledAttributes.recycle();
    }
}
