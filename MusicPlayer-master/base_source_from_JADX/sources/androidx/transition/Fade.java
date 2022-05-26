package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.p003d.C0533g;
import p082e.p109h.p119p.C3774v;

public class Fade extends Visibility {

    /* renamed from: androidx.transition.Fade$a */
    class C1079a extends C1153u {

        /* renamed from: a */
        final /* synthetic */ View f4558a;

        C1079a(Fade fade, View view) {
            this.f4558a = view;
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            C1129j0.m6442h(this.f4558a, 1.0f);
            C1129j0.m6435a(this.f4558a);
            transition.mo5971X(this);
        }
    }

    /* renamed from: androidx.transition.Fade$b */
    private static class C1080b extends AnimatorListenerAdapter {

        /* renamed from: a */
        private final View f4559a;

        /* renamed from: b */
        private boolean f4560b = false;

        C1080b(View view) {
            this.f4559a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C1129j0.m6442h(this.f4559a, 1.0f);
            if (this.f4560b) {
                this.f4559a.setLayerType(0, (Paint) null);
            }
        }

        public void onAnimationStart(Animator animator) {
            if (C3774v.m16177P(this.f4559a) && this.f4559a.getLayerType() == 0) {
                this.f4560b = true;
                this.f4559a.setLayerType(2, (Paint) null);
            }
        }
    }

    public Fade(int i) {
        mo6021t0(i);
    }

    /* renamed from: u0 */
    private Animator m6192u0(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        C1129j0.m6442h(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, C1129j0.f4698b, new float[]{f2});
        ofFloat.addListener(new C1080b(view));
        mo5973a(new C1079a(this, view));
        return ofFloat;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
        r1 = (java.lang.Float) r1.f4751a.get("android:fade:transitionAlpha");
     */
    /* renamed from: v0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static float m6193v0(androidx.transition.C1160y r1, float r2) {
        /*
            if (r1 == 0) goto L_0x0012
            java.util.Map<java.lang.String, java.lang.Object> r1 = r1.f4751a
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Object r1 = r1.get(r0)
            java.lang.Float r1 = (java.lang.Float) r1
            if (r1 == 0) goto L_0x0012
            float r2 = r1.floatValue()
        L_0x0012:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Fade.m6193v0(androidx.transition.y, float):float");
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        super.mo5890l(yVar);
        yVar.f4751a.put("android:fade:transitionAlpha", Float.valueOf(C1129j0.m6437c(yVar.f4752b)));
    }

    /* renamed from: p0 */
    public Animator mo5951p0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        float f = 0.0f;
        float v0 = m6193v0(yVar, 0.0f);
        if (v0 != 1.0f) {
            f = v0;
        }
        return m6192u0(view, f, 1.0f);
    }

    /* renamed from: r0 */
    public Animator mo5952r0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        C1129j0.m6439e(view);
        return m6192u0(view, m6193v0(yVar, 1.0f), 0.0f);
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4732d);
        mo6021t0(C0533g.m3248g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, mo6018n0()));
        obtainStyledAttributes.recycle();
    }
}
