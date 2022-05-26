package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.p003d.C0533g;
import java.util.Map;
import p082e.p109h.p119p.C3774v;

public class ChangeBounds extends Transition {

    /* renamed from: S */
    private static final String[] f4485S = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};

    /* renamed from: T */
    private static final Property<Drawable, PointF> f4486T = new C1059b(PointF.class, "boundsOrigin");

    /* renamed from: U */
    private static final Property<C1068k, PointF> f4487U = new C1060c(PointF.class, "topLeft");

    /* renamed from: V */
    private static final Property<C1068k, PointF> f4488V = new C1061d(PointF.class, "bottomRight");

    /* renamed from: W */
    private static final Property<View, PointF> f4489W = new C1062e(PointF.class, "bottomRight");

    /* renamed from: X */
    private static final Property<View, PointF> f4490X = new C1063f(PointF.class, "topLeft");

    /* renamed from: Y */
    private static final Property<View, PointF> f4491Y = new C1064g(PointF.class, "position");

    /* renamed from: Z */
    private static C1145q f4492Z = new C1145q();

    /* renamed from: P */
    private int[] f4493P = new int[2];

    /* renamed from: Q */
    private boolean f4494Q = false;

    /* renamed from: R */
    private boolean f4495R = false;

    /* renamed from: androidx.transition.ChangeBounds$a */
    class C1058a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4496a;

        /* renamed from: b */
        final /* synthetic */ BitmapDrawable f4497b;

        /* renamed from: c */
        final /* synthetic */ View f4498c;

        /* renamed from: d */
        final /* synthetic */ float f4499d;

        C1058a(ChangeBounds changeBounds, ViewGroup viewGroup, BitmapDrawable bitmapDrawable, View view, float f) {
            this.f4496a = viewGroup;
            this.f4497b = bitmapDrawable;
            this.f4498c = view;
            this.f4499d = f;
        }

        public void onAnimationEnd(Animator animator) {
            C1129j0.m6436b(this.f4496a).mo6035b(this.f4497b);
            C1129j0.m6442h(this.f4498c, this.f4499d);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$b */
    static class C1059b extends Property<Drawable, PointF> {

        /* renamed from: a */
        private Rect f4500a = new Rect();

        C1059b(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(Drawable drawable) {
            drawable.copyBounds(this.f4500a);
            Rect rect = this.f4500a;
            return new PointF((float) rect.left, (float) rect.top);
        }

        /* renamed from: b */
        public void set(Drawable drawable, PointF pointF) {
            drawable.copyBounds(this.f4500a);
            this.f4500a.offsetTo(Math.round(pointF.x), Math.round(pointF.y));
            drawable.setBounds(this.f4500a);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$c */
    static class C1060c extends Property<C1068k, PointF> {
        C1060c(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1068k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1068k kVar, PointF pointF) {
            kVar.mo5925c(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$d */
    static class C1061d extends Property<C1068k, PointF> {
        C1061d(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(C1068k kVar) {
            return null;
        }

        /* renamed from: b */
        public void set(C1068k kVar, PointF pointF) {
            kVar.mo5924a(pointF);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$e */
    static class C1062e extends Property<View, PointF> {
        C1062e(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1129j0.m6441g(view, view.getLeft(), view.getTop(), Math.round(pointF.x), Math.round(pointF.y));
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$f */
    static class C1063f extends Property<View, PointF> {
        C1063f(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            C1129j0.m6441g(view, Math.round(pointF.x), Math.round(pointF.y), view.getRight(), view.getBottom());
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$g */
    static class C1064g extends Property<View, PointF> {
        C1064g(Class cls, String str) {
            super(cls, str);
        }

        /* renamed from: a */
        public PointF get(View view) {
            return null;
        }

        /* renamed from: b */
        public void set(View view, PointF pointF) {
            int round = Math.round(pointF.x);
            int round2 = Math.round(pointF.y);
            C1129j0.m6441g(view, round, round2, view.getWidth() + round, view.getHeight() + round2);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$h */
    class C1065h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C1068k f4501a;
        private C1068k mViewBounds;

        C1065h(ChangeBounds changeBounds, C1068k kVar) {
            this.f4501a = kVar;
            this.mViewBounds = kVar;
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$i */
    class C1066i extends AnimatorListenerAdapter {

        /* renamed from: a */
        private boolean f4502a;

        /* renamed from: b */
        final /* synthetic */ View f4503b;

        /* renamed from: c */
        final /* synthetic */ Rect f4504c;

        /* renamed from: d */
        final /* synthetic */ int f4505d;

        /* renamed from: e */
        final /* synthetic */ int f4506e;

        /* renamed from: f */
        final /* synthetic */ int f4507f;

        /* renamed from: g */
        final /* synthetic */ int f4508g;

        C1066i(ChangeBounds changeBounds, View view, Rect rect, int i, int i2, int i3, int i4) {
            this.f4503b = view;
            this.f4504c = rect;
            this.f4505d = i;
            this.f4506e = i2;
            this.f4507f = i3;
            this.f4508g = i4;
        }

        public void onAnimationCancel(Animator animator) {
            this.f4502a = true;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.f4502a) {
                C3774v.m16229u0(this.f4503b, this.f4504c);
                C1129j0.m6441g(this.f4503b, this.f4505d, this.f4506e, this.f4507f, this.f4508g);
            }
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$j */
    class C1067j extends C1153u {

        /* renamed from: a */
        boolean f4509a = false;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f4510b;

        C1067j(ChangeBounds changeBounds, ViewGroup viewGroup) {
            this.f4510b = viewGroup;
        }

        /* renamed from: b */
        public void mo5920b(Transition transition) {
            C1116e0.m6393d(this.f4510b, false);
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            if (!this.f4509a) {
                C1116e0.m6393d(this.f4510b, false);
            }
            transition.mo5971X(this);
        }

        /* renamed from: d */
        public void mo5922d(Transition transition) {
            C1116e0.m6393d(this.f4510b, false);
            this.f4509a = true;
        }

        /* renamed from: e */
        public void mo5923e(Transition transition) {
            C1116e0.m6393d(this.f4510b, true);
        }
    }

    /* renamed from: androidx.transition.ChangeBounds$k */
    private static class C1068k {

        /* renamed from: a */
        private int f4511a;

        /* renamed from: b */
        private int f4512b;

        /* renamed from: c */
        private int f4513c;

        /* renamed from: d */
        private int f4514d;

        /* renamed from: e */
        private View f4515e;

        /* renamed from: f */
        private int f4516f;

        /* renamed from: g */
        private int f4517g;

        C1068k(View view) {
            this.f4515e = view;
        }

        /* renamed from: b */
        private void m6134b() {
            C1129j0.m6441g(this.f4515e, this.f4511a, this.f4512b, this.f4513c, this.f4514d);
            this.f4516f = 0;
            this.f4517g = 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo5924a(PointF pointF) {
            this.f4513c = Math.round(pointF.x);
            this.f4514d = Math.round(pointF.y);
            int i = this.f4517g + 1;
            this.f4517g = i;
            if (this.f4516f == i) {
                m6134b();
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo5925c(PointF pointF) {
            this.f4511a = Math.round(pointF.x);
            this.f4512b = Math.round(pointF.y);
            int i = this.f4516f + 1;
            this.f4516f = i;
            if (i == this.f4517g) {
                m6134b();
            }
        }
    }

    public ChangeBounds() {
    }

    /* renamed from: m0 */
    private void m6111m0(C1160y yVar) {
        View view = yVar.f4752b;
        if (C3774v.m16181T(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            yVar.f4751a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            yVar.f4751a.put("android:changeBounds:parent", yVar.f4752b.getParent());
            if (this.f4495R) {
                yVar.f4752b.getLocationInWindow(this.f4493P);
                yVar.f4751a.put("android:changeBounds:windowX", Integer.valueOf(this.f4493P[0]));
                yVar.f4751a.put("android:changeBounds:windowY", Integer.valueOf(this.f4493P[1]));
            }
            if (this.f4494Q) {
                yVar.f4751a.put("android:changeBounds:clip", C3774v.m16228u(view));
            }
        }
    }

    /* renamed from: n0 */
    private boolean m6112n0(View view, View view2) {
        if (!this.f4495R) {
            return true;
        }
        C1160y y = mo6000y(view, true);
        if (y == null) {
            if (view == view2) {
                return true;
            }
        } else if (view2 == y.f4752b) {
            return true;
        }
        return false;
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return f4485S;
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m6111m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m6111m0(yVar);
    }

    /* renamed from: o0 */
    public void mo5891o0(boolean z) {
        this.f4494Q = z;
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        int i;
        View view;
        Animator animator;
        ObjectAnimator objectAnimator;
        int i2;
        Rect rect;
        ObjectAnimator objectAnimator2;
        C1160y yVar3 = yVar;
        C1160y yVar4 = yVar2;
        if (yVar3 == null || yVar4 == null) {
            return null;
        }
        Map<String, Object> map = yVar3.f4751a;
        Map<String, Object> map2 = yVar4.f4751a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view2 = yVar4.f4752b;
        if (m6112n0(viewGroup2, viewGroup3)) {
            Rect rect2 = (Rect) yVar3.f4751a.get("android:changeBounds:bounds");
            Rect rect3 = (Rect) yVar4.f4751a.get("android:changeBounds:bounds");
            int i3 = rect2.left;
            int i4 = rect3.left;
            int i5 = rect2.top;
            int i6 = rect3.top;
            int i7 = rect2.right;
            int i8 = rect3.right;
            int i9 = rect2.bottom;
            int i10 = rect3.bottom;
            int i11 = i7 - i3;
            int i12 = i9 - i5;
            int i13 = i8 - i4;
            int i14 = i10 - i6;
            View view3 = view2;
            Rect rect4 = (Rect) yVar3.f4751a.get("android:changeBounds:clip");
            Rect rect5 = (Rect) yVar4.f4751a.get("android:changeBounds:clip");
            if ((i11 == 0 || i12 == 0) && (i13 == 0 || i14 == 0)) {
                i = 0;
            } else {
                i = (i3 == i4 && i5 == i6) ? 0 : 1;
                if (!(i7 == i8 && i9 == i10)) {
                    i++;
                }
            }
            if ((rect4 != null && !rect4.equals(rect5)) || (rect4 == null && rect5 != null)) {
                i++;
            }
            if (i <= 0) {
                return null;
            }
            Rect rect6 = rect5;
            Rect rect7 = rect4;
            if (!this.f4494Q) {
                view = view3;
                C1129j0.m6441g(view, i3, i5, i7, i9);
                if (i == 2) {
                    if (i11 == i13 && i12 == i14) {
                        animator = C1137m.m6461a(view, f4491Y, mo5959A().mo5884a((float) i3, (float) i5, (float) i4, (float) i6));
                    } else {
                        C1068k kVar = new C1068k(view);
                        ObjectAnimator a = C1137m.m6461a(kVar, f4487U, mo5959A().mo5884a((float) i3, (float) i5, (float) i4, (float) i6));
                        ObjectAnimator a2 = C1137m.m6461a(kVar, f4488V, mo5959A().mo5884a((float) i7, (float) i9, (float) i8, (float) i10));
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.playTogether(new Animator[]{a, a2});
                        animatorSet.addListener(new C1065h(this, kVar));
                        animator = animatorSet;
                    }
                } else if (i3 == i4 && i5 == i6) {
                    animator = C1137m.m6461a(view, f4489W, mo5959A().mo5884a((float) i7, (float) i9, (float) i8, (float) i10));
                } else {
                    animator = C1137m.m6461a(view, f4490X, mo5959A().mo5884a((float) i3, (float) i5, (float) i4, (float) i6));
                }
            } else {
                view = view3;
                C1129j0.m6441g(view, i3, i5, Math.max(i11, i13) + i3, Math.max(i12, i14) + i5);
                if (i3 == i4 && i5 == i6) {
                    objectAnimator = null;
                } else {
                    objectAnimator = C1137m.m6461a(view, f4491Y, mo5959A().mo5884a((float) i3, (float) i5, (float) i4, (float) i6));
                }
                if (rect7 == null) {
                    i2 = 0;
                    rect = new Rect(0, 0, i11, i12);
                } else {
                    i2 = 0;
                    rect = rect7;
                }
                Rect rect8 = rect6 == null ? new Rect(i2, i2, i13, i14) : rect6;
                if (!rect.equals(rect8)) {
                    C3774v.m16229u0(view, rect);
                    C1145q qVar = f4492Z;
                    Object[] objArr = new Object[2];
                    objArr[i2] = rect;
                    objArr[1] = rect8;
                    ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "clipBounds", qVar, objArr);
                    ofObject.addListener(new C1066i(this, view, rect6, i4, i6, i8, i10));
                    objectAnimator2 = ofObject;
                } else {
                    objectAnimator2 = null;
                }
                animator = C1158x.m6513c(objectAnimator, objectAnimator2);
            }
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup4 = (ViewGroup) view.getParent();
                C1116e0.m6393d(viewGroup4, true);
                mo5973a(new C1067j(this, viewGroup4));
            }
            return animator;
        }
        int intValue = ((Integer) yVar3.f4751a.get("android:changeBounds:windowX")).intValue();
        int intValue2 = ((Integer) yVar3.f4751a.get("android:changeBounds:windowY")).intValue();
        int intValue3 = ((Integer) yVar4.f4751a.get("android:changeBounds:windowX")).intValue();
        int intValue4 = ((Integer) yVar4.f4751a.get("android:changeBounds:windowY")).intValue();
        if (intValue == intValue3 && intValue2 == intValue4) {
            return null;
        }
        viewGroup.getLocationInWindow(this.f4493P);
        Bitmap createBitmap = Bitmap.createBitmap(view2.getWidth(), view2.getHeight(), Bitmap.Config.ARGB_8888);
        view2.draw(new Canvas(createBitmap));
        BitmapDrawable bitmapDrawable = new BitmapDrawable(createBitmap);
        float c = C1129j0.m6437c(view2);
        C1129j0.m6442h(view2, 0.0f);
        C1129j0.m6436b(viewGroup).mo6034a(bitmapDrawable);
        PathMotion A = mo5959A();
        int[] iArr = this.f4493P;
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(bitmapDrawable, new PropertyValuesHolder[]{C1141o.m6466a(f4486T, A.mo5884a((float) (intValue - iArr[0]), (float) (intValue2 - iArr[1]), (float) (intValue3 - iArr[0]), (float) (intValue4 - iArr[1])))});
        ofPropertyValuesHolder.addListener(new C1058a(this, viewGroup, bitmapDrawable, view2, c));
        return ofPropertyValuesHolder;
    }

    @SuppressLint({"RestrictedApi"})
    public ChangeBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4730b);
        boolean a = C0533g.m3242a(obtainStyledAttributes, (XmlResourceParser) attributeSet, "resizeClip", 0, false);
        obtainStyledAttributes.recycle();
        mo5891o0(a);
    }
}
