package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.core.content.p003d.C0533g;
import org.xmlpull.v1.XmlPullParser;
import p082e.p109h.p119p.C3774v;

public class Slide extends Visibility {

    /* renamed from: S */
    private static final TimeInterpolator f4563S = new DecelerateInterpolator();

    /* renamed from: T */
    private static final TimeInterpolator f4564T = new AccelerateInterpolator();

    /* renamed from: U */
    private static final C1087g f4565U = new C1081a();

    /* renamed from: V */
    private static final C1087g f4566V = new C1082b();

    /* renamed from: W */
    private static final C1087g f4567W = new C1083c();

    /* renamed from: X */
    private static final C1087g f4568X = new C1084d();

    /* renamed from: Y */
    private static final C1087g f4569Y = new C1085e();

    /* renamed from: Z */
    private static final C1087g f4570Z = new C1086f();

    /* renamed from: R */
    private C1087g f4571R = f4570Z;

    /* renamed from: androidx.transition.Slide$a */
    static class C1081a extends C1088h {
        C1081a() {
            super((C1081a) null);
        }

        /* renamed from: b */
        public float mo5957b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$b */
    static class C1082b extends C1088h {
        C1082b() {
            super((C1081a) null);
        }

        /* renamed from: b */
        public float mo5957b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C3774v.m16151B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() + ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() - ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$c */
    static class C1083c extends C1089i {
        C1083c() {
            super((C1081a) null);
        }

        /* renamed from: a */
        public float mo5958a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() - ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$d */
    static class C1084d extends C1088h {
        C1084d() {
            super((C1081a) null);
        }

        /* renamed from: b */
        public float mo5957b(ViewGroup viewGroup, View view) {
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$e */
    static class C1085e extends C1088h {
        C1085e() {
            super((C1081a) null);
        }

        /* renamed from: b */
        public float mo5957b(ViewGroup viewGroup, View view) {
            boolean z = true;
            if (C3774v.m16151B(viewGroup) != 1) {
                z = false;
            }
            if (z) {
                return view.getTranslationX() - ((float) viewGroup.getWidth());
            }
            return view.getTranslationX() + ((float) viewGroup.getWidth());
        }
    }

    /* renamed from: androidx.transition.Slide$f */
    static class C1086f extends C1089i {
        C1086f() {
            super((C1081a) null);
        }

        /* renamed from: a */
        public float mo5958a(ViewGroup viewGroup, View view) {
            return view.getTranslationY() + ((float) viewGroup.getHeight());
        }
    }

    /* renamed from: androidx.transition.Slide$g */
    private interface C1087g {
        /* renamed from: a */
        float mo5958a(ViewGroup viewGroup, View view);

        /* renamed from: b */
        float mo5957b(ViewGroup viewGroup, View view);
    }

    /* renamed from: androidx.transition.Slide$h */
    private static abstract class C1088h implements C1087g {
        private C1088h() {
        }

        /* renamed from: a */
        public float mo5958a(ViewGroup viewGroup, View view) {
            return view.getTranslationY();
        }

        /* synthetic */ C1088h(C1081a aVar) {
            this();
        }
    }

    /* renamed from: androidx.transition.Slide$i */
    private static abstract class C1089i implements C1087g {
        private C1089i() {
        }

        /* renamed from: b */
        public float mo5957b(ViewGroup viewGroup, View view) {
            return view.getTranslationX();
        }

        /* synthetic */ C1089i(C1081a aVar) {
            this();
        }
    }

    public Slide() {
        mo5956u0(80);
    }

    /* renamed from: m0 */
    private void m6202m0(C1160y yVar) {
        int[] iArr = new int[2];
        yVar.f4752b.getLocationOnScreen(iArr);
        yVar.f4751a.put("android:slide:screenPosition", iArr);
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        super.mo5889i(yVar);
        m6202m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        super.mo5890l(yVar);
        m6202m0(yVar);
    }

    /* renamed from: p0 */
    public Animator mo5951p0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        if (yVar2 == null) {
            return null;
        }
        int[] iArr = (int[]) yVar2.f4751a.get("android:slide:screenPosition");
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        return C1103a0.m6345a(view, yVar2, iArr[0], iArr[1], this.f4571R.mo5957b(viewGroup, view), this.f4571R.mo5958a(viewGroup, view), translationX, translationY, f4563S, this);
    }

    /* renamed from: r0 */
    public Animator mo5952r0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        if (yVar == null) {
            return null;
        }
        int[] iArr = (int[]) yVar.f4751a.get("android:slide:screenPosition");
        return C1103a0.m6345a(view, yVar, iArr[0], iArr[1], view.getTranslationX(), view.getTranslationY(), this.f4571R.mo5957b(viewGroup, view), this.f4571R.mo5958a(viewGroup, view), f4564T, this);
    }

    /* renamed from: u0 */
    public void mo5956u0(int i) {
        if (i == 3) {
            this.f4571R = f4565U;
        } else if (i == 5) {
            this.f4571R = f4568X;
        } else if (i == 48) {
            this.f4571R = f4567W;
        } else if (i == 80) {
            this.f4571R = f4570Z;
        } else if (i == 8388611) {
            this.f4571R = f4566V;
        } else if (i == 8388613) {
            this.f4571R = f4569Y;
        } else {
            throw new IllegalArgumentException("Invalid slide direction");
        }
        C1149s sVar = new C1149s();
        sVar.mo6124j(i);
        mo5985i0(sVar);
    }

    @SuppressLint({"RestrictedApi"})
    public Slide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4734f);
        int g = C0533g.m3248g(obtainStyledAttributes, (XmlPullParser) attributeSet, "slideEdge", 0, 80);
        obtainStyledAttributes.recycle();
        mo5956u0(g);
    }
}
