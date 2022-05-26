package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.p003d.C0533g;
import androidx.transition.C1101a;
import androidx.transition.Transition;

public abstract class Visibility extends Transition {

    /* renamed from: Q */
    private static final String[] f4622Q = {"android:visibility:visibility", "android:visibility:parent"};

    /* renamed from: P */
    private int f4623P = 3;

    /* renamed from: androidx.transition.Visibility$a */
    class C1098a extends C1153u {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f4624a;

        /* renamed from: b */
        final /* synthetic */ View f4625b;

        /* renamed from: c */
        final /* synthetic */ View f4626c;

        C1098a(ViewGroup viewGroup, View view, View view2) {
            this.f4624a = viewGroup;
            this.f4625b = view;
            this.f4626c = view2;
        }

        /* renamed from: b */
        public void mo5920b(Transition transition) {
            C1116e0.m6391b(this.f4624a).mo6032d(this.f4625b);
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            this.f4626c.setTag(C1143p.save_overlay_view, (Object) null);
            C1116e0.m6391b(this.f4624a).mo6032d(this.f4625b);
            transition.mo5971X(this);
        }

        /* renamed from: e */
        public void mo5923e(Transition transition) {
            if (this.f4625b.getParent() == null) {
                C1116e0.m6391b(this.f4624a).mo6031c(this.f4625b);
            } else {
                Visibility.this.mo5983h();
            }
        }
    }

    /* renamed from: androidx.transition.Visibility$b */
    private static class C1099b extends AnimatorListenerAdapter implements Transition.C1095f, C1101a.C1102a {

        /* renamed from: a */
        private final View f4628a;

        /* renamed from: b */
        private final int f4629b;

        /* renamed from: c */
        private final ViewGroup f4630c;

        /* renamed from: d */
        private final boolean f4631d;

        /* renamed from: e */
        private boolean f4632e;

        /* renamed from: f */
        boolean f4633f = false;

        C1099b(View view, int i, boolean z) {
            this.f4628a = view;
            this.f4629b = i;
            this.f4630c = (ViewGroup) view.getParent();
            this.f4631d = z;
            m6336g(true);
        }

        /* renamed from: f */
        private void m6335f() {
            if (!this.f4633f) {
                C1129j0.m6443i(this.f4628a, this.f4629b);
                ViewGroup viewGroup = this.f4630c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m6336g(false);
        }

        /* renamed from: g */
        private void m6336g(boolean z) {
            ViewGroup viewGroup;
            if (this.f4631d && this.f4632e != z && (viewGroup = this.f4630c) != null) {
                this.f4632e = z;
                C1116e0.m6393d(viewGroup, z);
            }
        }

        /* renamed from: a */
        public void mo6006a(Transition transition) {
        }

        /* renamed from: b */
        public void mo5920b(Transition transition) {
            m6336g(false);
        }

        /* renamed from: c */
        public void mo5921c(Transition transition) {
            m6335f();
            transition.mo5971X(this);
        }

        /* renamed from: d */
        public void mo5922d(Transition transition) {
        }

        /* renamed from: e */
        public void mo5923e(Transition transition) {
            m6336g(true);
        }

        public void onAnimationCancel(Animator animator) {
            this.f4633f = true;
        }

        public void onAnimationEnd(Animator animator) {
            m6335f();
        }

        public void onAnimationPause(Animator animator) {
            if (!this.f4633f) {
                C1129j0.m6443i(this.f4628a, this.f4629b);
            }
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationResume(Animator animator) {
            if (!this.f4633f) {
                C1129j0.m6443i(this.f4628a, 0);
            }
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: androidx.transition.Visibility$c */
    private static class C1100c {

        /* renamed from: a */
        boolean f4634a;

        /* renamed from: b */
        boolean f4635b;

        /* renamed from: c */
        int f4636c;

        /* renamed from: d */
        int f4637d;

        /* renamed from: e */
        ViewGroup f4638e;

        /* renamed from: f */
        ViewGroup f4639f;

        C1100c() {
        }
    }

    public Visibility() {
    }

    /* renamed from: m0 */
    private void m6319m0(C1160y yVar) {
        yVar.f4751a.put("android:visibility:visibility", Integer.valueOf(yVar.f4752b.getVisibility()));
        yVar.f4751a.put("android:visibility:parent", yVar.f4752b.getParent());
        int[] iArr = new int[2];
        yVar.f4752b.getLocationOnScreen(iArr);
        yVar.f4751a.put("android:visibility:screenLocation", iArr);
    }

    /* renamed from: o0 */
    private C1100c m6320o0(C1160y yVar, C1160y yVar2) {
        C1100c cVar = new C1100c();
        cVar.f4634a = false;
        cVar.f4635b = false;
        if (yVar == null || !yVar.f4751a.containsKey("android:visibility:visibility")) {
            cVar.f4636c = -1;
            cVar.f4638e = null;
        } else {
            cVar.f4636c = ((Integer) yVar.f4751a.get("android:visibility:visibility")).intValue();
            cVar.f4638e = (ViewGroup) yVar.f4751a.get("android:visibility:parent");
        }
        if (yVar2 == null || !yVar2.f4751a.containsKey("android:visibility:visibility")) {
            cVar.f4637d = -1;
            cVar.f4639f = null;
        } else {
            cVar.f4637d = ((Integer) yVar2.f4751a.get("android:visibility:visibility")).intValue();
            cVar.f4639f = (ViewGroup) yVar2.f4751a.get("android:visibility:parent");
        }
        if (yVar != null && yVar2 != null) {
            int i = cVar.f4636c;
            int i2 = cVar.f4637d;
            if (i == i2 && cVar.f4638e == cVar.f4639f) {
                return cVar;
            }
            if (i != i2) {
                if (i == 0) {
                    cVar.f4635b = false;
                    cVar.f4634a = true;
                } else if (i2 == 0) {
                    cVar.f4635b = true;
                    cVar.f4634a = true;
                }
            } else if (cVar.f4639f == null) {
                cVar.f4635b = false;
                cVar.f4634a = true;
            } else if (cVar.f4638e == null) {
                cVar.f4635b = true;
                cVar.f4634a = true;
            }
        } else if (yVar == null && cVar.f4637d == 0) {
            cVar.f4635b = true;
            cVar.f4634a = true;
        } else if (yVar2 == null && cVar.f4636c == 0) {
            cVar.f4635b = false;
            cVar.f4634a = true;
        }
        return cVar;
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return f4622Q;
    }

    /* renamed from: K */
    public boolean mo5967K(C1160y yVar, C1160y yVar2) {
        if (yVar == null && yVar2 == null) {
            return false;
        }
        if (yVar != null && yVar2 != null && yVar2.f4751a.containsKey("android:visibility:visibility") != yVar.f4751a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C1100c o0 = m6320o0(yVar, yVar2);
        if (!o0.f4634a) {
            return false;
        }
        if (o0.f4636c == 0 || o0.f4637d == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m6319m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m6319m0(yVar);
    }

    /* renamed from: n0 */
    public int mo6018n0() {
        return this.f4623P;
    }

    /* renamed from: p0 */
    public Animator mo5951p0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        return null;
    }

    /* renamed from: q */
    public Animator mo5892q(ViewGroup viewGroup, C1160y yVar, C1160y yVar2) {
        C1100c o0 = m6320o0(yVar, yVar2);
        if (!o0.f4634a) {
            return null;
        }
        if (o0.f4638e == null && o0.f4639f == null) {
            return null;
        }
        if (o0.f4635b) {
            return mo6019q0(viewGroup, yVar, o0.f4636c, yVar2, o0.f4637d);
        }
        return mo6020s0(viewGroup, yVar, o0.f4636c, yVar2, o0.f4637d);
    }

    /* renamed from: q0 */
    public Animator mo6019q0(ViewGroup viewGroup, C1160y yVar, int i, C1160y yVar2, int i2) {
        if ((this.f4623P & 1) != 1 || yVar2 == null) {
            return null;
        }
        if (yVar == null) {
            View view = (View) yVar2.f4752b.getParent();
            if (m6320o0(mo6000y(view, false), mo5966J(view, false)).f4634a) {
                return null;
            }
        }
        return mo5951p0(viewGroup, yVar2.f4752b, yVar, yVar2);
    }

    /* renamed from: r0 */
    public Animator mo5952r0(ViewGroup viewGroup, View view, C1160y yVar, C1160y yVar2) {
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0089, code lost:
        if (r0.f4576B != false) goto L_0x008b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004a  */
    /* renamed from: s0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo6020s0(android.view.ViewGroup r18, androidx.transition.C1160y r19, int r20, androidx.transition.C1160y r21, int r22) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            r3 = r21
            r4 = r22
            int r5 = r0.f4623P
            r6 = 2
            r5 = r5 & r6
            r7 = 0
            if (r5 == r6) goto L_0x0012
            return r7
        L_0x0012:
            if (r2 != 0) goto L_0x0015
            return r7
        L_0x0015:
            android.view.View r5 = r2.f4752b
            if (r3 == 0) goto L_0x001c
            android.view.View r8 = r3.f4752b
            goto L_0x001d
        L_0x001c:
            r8 = r7
        L_0x001d:
            int r9 = androidx.transition.C1143p.save_overlay_view
            java.lang.Object r10 = r5.getTag(r9)
            android.view.View r10 = (android.view.View) r10
            r11 = 0
            r12 = 1
            if (r10 == 0) goto L_0x002d
            r8 = r7
            r13 = 1
            goto L_0x0095
        L_0x002d:
            if (r8 == 0) goto L_0x0040
            android.view.ViewParent r10 = r8.getParent()
            if (r10 != 0) goto L_0x0036
            goto L_0x0040
        L_0x0036:
            r10 = 4
            if (r4 != r10) goto L_0x003a
            goto L_0x003c
        L_0x003a:
            if (r5 != r8) goto L_0x0045
        L_0x003c:
            r10 = r8
            r13 = 0
            r8 = r7
            goto L_0x0048
        L_0x0040:
            if (r8 == 0) goto L_0x0045
            r10 = r7
            r13 = 0
            goto L_0x0048
        L_0x0045:
            r8 = r7
            r10 = r8
            r13 = 1
        L_0x0048:
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            if (r13 != 0) goto L_0x0051
            goto L_0x008b
        L_0x0051:
            android.view.ViewParent r13 = r5.getParent()
            boolean r13 = r13 instanceof android.view.View
            if (r13 == 0) goto L_0x008f
            android.view.ViewParent r13 = r5.getParent()
            android.view.View r13 = (android.view.View) r13
            androidx.transition.y r14 = r0.mo5966J(r13, r12)
            androidx.transition.y r15 = r0.mo6000y(r13, r12)
            androidx.transition.Visibility$c r14 = r0.m6320o0(r14, r15)
            boolean r14 = r14.f4634a
            if (r14 != 0) goto L_0x0074
            android.view.View r8 = androidx.transition.C1158x.m6511a(r1, r5, r13)
            goto L_0x008f
        L_0x0074:
            int r14 = r13.getId()
            android.view.ViewParent r13 = r13.getParent()
            if (r13 != 0) goto L_0x008f
            r13 = -1
            if (r14 == r13) goto L_0x008f
            android.view.View r13 = r1.findViewById(r14)
            if (r13 == 0) goto L_0x008f
            boolean r13 = r0.f4576B
            if (r13 == 0) goto L_0x008f
        L_0x008b:
            r8 = r10
            r13 = 0
            r10 = r5
            goto L_0x0095
        L_0x008f:
            r13 = 0
            r16 = r10
            r10 = r8
            r8 = r16
        L_0x0095:
            if (r10 == 0) goto L_0x00e5
            if (r13 != 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.Object> r4 = r2.f4751a
            java.lang.String r7 = "android:visibility:screenLocation"
            java.lang.Object r4 = r4.get(r7)
            int[] r4 = (int[]) r4
            r7 = r4[r11]
            r4 = r4[r12]
            int[] r6 = new int[r6]
            r1.getLocationOnScreen(r6)
            r8 = r6[r11]
            int r7 = r7 - r8
            int r8 = r10.getLeft()
            int r7 = r7 - r8
            r10.offsetLeftAndRight(r7)
            r6 = r6[r12]
            int r4 = r4 - r6
            int r6 = r10.getTop()
            int r4 = r4 - r6
            r10.offsetTopAndBottom(r4)
            androidx.transition.d0 r4 = androidx.transition.C1116e0.m6391b(r18)
            r4.mo6031c(r10)
        L_0x00c9:
            android.animation.Animator r2 = r0.mo5952r0(r1, r10, r2, r3)
            if (r13 != 0) goto L_0x00e4
            if (r2 != 0) goto L_0x00d9
            androidx.transition.d0 r1 = androidx.transition.C1116e0.m6391b(r18)
            r1.mo6032d(r10)
            goto L_0x00e4
        L_0x00d9:
            r5.setTag(r9, r10)
            androidx.transition.Visibility$a r3 = new androidx.transition.Visibility$a
            r3.<init>(r1, r10, r5)
            r0.mo5973a(r3)
        L_0x00e4:
            return r2
        L_0x00e5:
            if (r8 == 0) goto L_0x0107
            int r5 = r8.getVisibility()
            androidx.transition.C1129j0.m6443i(r8, r11)
            android.animation.Animator r1 = r0.mo5952r0(r1, r8, r2, r3)
            if (r1 == 0) goto L_0x0103
            androidx.transition.Visibility$b r2 = new androidx.transition.Visibility$b
            r2.<init>(r8, r4, r12)
            r1.addListener(r2)
            androidx.transition.C1101a.m6342a(r1, r2)
            r0.mo5973a(r2)
            goto L_0x0106
        L_0x0103:
            androidx.transition.C1129j0.m6443i(r8, r5)
        L_0x0106:
            return r1
        L_0x0107:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.Visibility.mo6020s0(android.view.ViewGroup, androidx.transition.y, int, androidx.transition.y, int):android.animation.Animator");
    }

    /* renamed from: t0 */
    public void mo6021t0(int i) {
        if ((i & -4) == 0) {
            this.f4623P = i;
            return;
        }
        throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
    }

    @SuppressLint({"RestrictedApi"})
    public Visibility(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C1151t.f4731c);
        int g = C0533g.m3248g(obtainStyledAttributes, (XmlResourceParser) attributeSet, "transitionVisibilityMode", 0, 0);
        obtainStyledAttributes.recycle();
        if (g != 0) {
            mo6021t0(g);
        }
    }
}
