package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p082e.p109h.p119p.C3774v;

public class ChangeClipBounds extends Transition {

    /* renamed from: P */
    private static final String[] f4518P = {"android:clipBounds:clip"};

    /* renamed from: androidx.transition.ChangeClipBounds$a */
    class C1069a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ View f4519a;

        C1069a(ChangeClipBounds changeClipBounds, View view) {
            this.f4519a = view;
        }

        public void onAnimationEnd(Animator animator) {
            C3774v.m16229u0(this.f4519a, (Rect) null);
        }
    }

    public ChangeClipBounds() {
    }

    /* renamed from: m0 */
    private void m6137m0(C1160y yVar) {
        View view = yVar.f4752b;
        if (view.getVisibility() != 8) {
            Rect u = C3774v.m16228u(view);
            yVar.f4751a.put("android:clipBounds:clip", u);
            if (u == null) {
                yVar.f4751a.put("android:clipBounds:bounds", new Rect(0, 0, view.getWidth(), view.getHeight()));
            }
        }
    }

    /* renamed from: I */
    public String[] mo5888I() {
        return f4518P;
    }

    /* renamed from: i */
    public void mo5889i(C1160y yVar) {
        m6137m0(yVar);
    }

    /* renamed from: l */
    public void mo5890l(C1160y yVar) {
        m6137m0(yVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.graphics.Rect} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: android.graphics.Rect} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.animation.Animator mo5892q(android.view.ViewGroup r8, androidx.transition.C1160y r9, androidx.transition.C1160y r10) {
        /*
            r7 = this;
            r8 = 0
            if (r9 == 0) goto L_0x007e
            if (r10 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f4751a
            java.lang.String r1 = "android:clipBounds:clip"
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto L_0x007e
            java.util.Map<java.lang.String, java.lang.Object> r0 = r10.f4751a
            boolean r0 = r0.containsKey(r1)
            if (r0 != 0) goto L_0x0018
            goto L_0x007e
        L_0x0018:
            java.util.Map<java.lang.String, java.lang.Object> r0 = r9.f4751a
            java.lang.Object r0 = r0.get(r1)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            java.util.Map<java.lang.String, java.lang.Object> r2 = r10.f4751a
            java.lang.Object r1 = r2.get(r1)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x002e
            r4 = 1
            goto L_0x002f
        L_0x002e:
            r4 = 0
        L_0x002f:
            if (r0 != 0) goto L_0x0034
            if (r1 != 0) goto L_0x0034
            return r8
        L_0x0034:
            java.lang.String r5 = "android:clipBounds:bounds"
            if (r0 != 0) goto L_0x0042
            java.util.Map<java.lang.String, java.lang.Object> r9 = r9.f4751a
            java.lang.Object r9 = r9.get(r5)
            r0 = r9
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            goto L_0x004d
        L_0x0042:
            if (r1 != 0) goto L_0x004d
            java.util.Map<java.lang.String, java.lang.Object> r9 = r10.f4751a
            java.lang.Object r9 = r9.get(r5)
            r1 = r9
            android.graphics.Rect r1 = (android.graphics.Rect) r1
        L_0x004d:
            boolean r9 = r0.equals(r1)
            if (r9 == 0) goto L_0x0054
            return r8
        L_0x0054:
            android.view.View r8 = r10.f4752b
            p082e.p109h.p119p.C3774v.m16229u0(r8, r0)
            androidx.transition.q r8 = new androidx.transition.q
            android.graphics.Rect r9 = new android.graphics.Rect
            r9.<init>()
            r8.<init>(r9)
            android.view.View r9 = r10.f4752b
            android.util.Property<android.view.View, android.graphics.Rect> r5 = androidx.transition.C1129j0.f4699c
            r6 = 2
            android.graphics.Rect[] r6 = new android.graphics.Rect[r6]
            r6[r3] = r0
            r6[r2] = r1
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofObject(r9, r5, r8, r6)
            if (r4 == 0) goto L_0x007e
            android.view.View r9 = r10.f4752b
            androidx.transition.ChangeClipBounds$a r10 = new androidx.transition.ChangeClipBounds$a
            r10.<init>(r7, r9)
            r8.addListener(r10)
        L_0x007e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeClipBounds.mo5892q(android.view.ViewGroup, androidx.transition.y, androidx.transition.y):android.animation.Animator");
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
