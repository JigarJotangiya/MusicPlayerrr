package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.constraintlayout.motion.widget.MotionHelper;
import androidx.constraintlayout.widget.C0439f;

public class MotionEffect extends MotionHelper {

    /* renamed from: A */
    private int f1608A = -1;

    /* renamed from: t */
    private float f1609t = 0.1f;

    /* renamed from: u */
    private int f1610u = 49;

    /* renamed from: v */
    private int f1611v = 50;

    /* renamed from: w */
    private int f1612w = 0;

    /* renamed from: x */
    private int f1613x = 0;

    /* renamed from: y */
    private boolean f1614y = true;

    /* renamed from: z */
    private int f1615z = -1;

    public MotionEffect(Context context) {
        super(context);
    }

    /* renamed from: F */
    private void m2100F(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C0439f.MotionEffect);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == C0439f.MotionEffect_motionEffect_start) {
                    int i2 = obtainStyledAttributes.getInt(index, this.f1610u);
                    this.f1610u = i2;
                    this.f1610u = Math.max(Math.min(i2, 99), 0);
                } else if (index == C0439f.MotionEffect_motionEffect_end) {
                    int i3 = obtainStyledAttributes.getInt(index, this.f1611v);
                    this.f1611v = i3;
                    this.f1611v = Math.max(Math.min(i3, 99), 0);
                } else if (index == C0439f.MotionEffect_motionEffect_translationX) {
                    this.f1612w = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1612w);
                } else if (index == C0439f.MotionEffect_motionEffect_translationY) {
                    this.f1613x = obtainStyledAttributes.getDimensionPixelOffset(index, this.f1613x);
                } else if (index == C0439f.MotionEffect_motionEffect_alpha) {
                    this.f1609t = obtainStyledAttributes.getFloat(index, this.f1609t);
                } else if (index == C0439f.MotionEffect_motionEffect_move) {
                    this.f1608A = obtainStyledAttributes.getInt(index, this.f1608A);
                } else if (index == C0439f.MotionEffect_motionEffect_strict) {
                    this.f1614y = obtainStyledAttributes.getBoolean(index, this.f1614y);
                } else if (index == C0439f.MotionEffect_motionEffect_viewTransition) {
                    this.f1615z = obtainStyledAttributes.getResourceId(index, this.f1615z);
                }
            }
            int i4 = this.f1610u;
            int i5 = this.f1611v;
            if (i4 == i5) {
                if (i4 > 0) {
                    this.f1610u = i4 - 1;
                } else {
                    this.f1611v = i5 + 1;
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0182, code lost:
        if (r14 == 0.0f) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0196, code lost:
        if (r14 == 0.0f) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01a6, code lost:
        if (r15 == 0.0f) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b6, code lost:
        if (r15 == 0.0f) goto L_0x0185;
     */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01bc  */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo2424D(androidx.constraintlayout.motion.widget.MotionLayout r22, java.util.HashMap<android.view.View, androidx.constraintlayout.motion.widget.C0396n> r23) {
        /*
            r21 = this;
            r0 = r21
            r1 = r23
            android.view.ViewParent r2 = r21.getParent()
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            android.view.View[] r2 = r0.mo2850n(r2)
            if (r2 != 0) goto L_0x0024
            java.lang.String r1 = androidx.constraintlayout.motion.widget.C0379b.m2239a()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = " views = null"
            java.lang.String r1 = r1.concat(r2)
            java.lang.String r2 = "FadeMove"
            android.util.Log.v(r2, r1)
            return
        L_0x0024:
            androidx.constraintlayout.motion.widget.f r3 = new androidx.constraintlayout.motion.widget.f
            r3.<init>()
            androidx.constraintlayout.motion.widget.f r4 = new androidx.constraintlayout.motion.widget.f
            r4.<init>()
            float r5 = r0.f1609t
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "alpha"
            r3.mo2552R(r6, r5)
            float r5 = r0.f1609t
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            r4.mo2552R(r6, r5)
            int r5 = r0.f1610u
            r3.mo2546g(r5)
            int r5 = r0.f1611v
            r4.mo2546g(r5)
            androidx.constraintlayout.motion.widget.i r5 = new androidx.constraintlayout.motion.widget.i
            r5.<init>()
            int r6 = r0.f1610u
            r5.mo2546g(r6)
            r6 = 0
            r5.mo2559m(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r8 = "percentX"
            r5.mo2560n(r8, r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            java.lang.String r9 = "percentY"
            r5.mo2560n(r9, r7)
            androidx.constraintlayout.motion.widget.i r7 = new androidx.constraintlayout.motion.widget.i
            r7.<init>()
            int r10 = r0.f1611v
            r7.mo2546g(r10)
            r7.mo2559m(r6)
            r10 = 1
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r7.mo2560n(r8, r11)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r10)
            r7.mo2560n(r9, r8)
            int r8 = r0.f1612w
            r9 = 0
            if (r8 <= 0) goto L_0x00b5
            androidx.constraintlayout.motion.widget.f r8 = new androidx.constraintlayout.motion.widget.f
            r8.<init>()
            androidx.constraintlayout.motion.widget.f r11 = new androidx.constraintlayout.motion.widget.f
            r11.<init>()
            int r12 = r0.f1612w
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.String r13 = "translationX"
            r8.mo2552R(r13, r12)
            int r12 = r0.f1611v
            r8.mo2546g(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r6)
            r11.mo2552R(r13, r12)
            int r12 = r0.f1611v
            int r12 = r12 - r10
            r11.mo2546g(r12)
            goto L_0x00b7
        L_0x00b5:
            r8 = r9
            r11 = r8
        L_0x00b7:
            int r12 = r0.f1613x
            if (r12 <= 0) goto L_0x00e3
            androidx.constraintlayout.motion.widget.f r9 = new androidx.constraintlayout.motion.widget.f
            r9.<init>()
            androidx.constraintlayout.motion.widget.f r12 = new androidx.constraintlayout.motion.widget.f
            r12.<init>()
            int r13 = r0.f1613x
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            java.lang.String r14 = "translationY"
            r9.mo2552R(r14, r13)
            int r13 = r0.f1611v
            r9.mo2546g(r13)
            java.lang.Integer r13 = java.lang.Integer.valueOf(r6)
            r12.mo2552R(r14, r13)
            int r13 = r0.f1611v
            int r13 = r13 - r10
            r12.mo2546g(r13)
            goto L_0x00e4
        L_0x00e3:
            r12 = r9
        L_0x00e4:
            int r13 = r0.f1608A
            r15 = -1
            r17 = 0
            if (r13 != r15) goto L_0x0150
            r13 = 4
            int[] r15 = new int[r13]
            r13 = 0
        L_0x00ef:
            int r14 = r2.length
            if (r13 >= r14) goto L_0x013c
            r14 = r2[r13]
            java.lang.Object r14 = r1.get(r14)
            androidx.constraintlayout.motion.widget.n r14 = (androidx.constraintlayout.motion.widget.C0396n) r14
            if (r14 != 0) goto L_0x00fd
            goto L_0x0139
        L_0x00fd:
            float r19 = r14.mo2595n()
            float r20 = r14.mo2599t()
            float r19 = r19 - r20
            float r20 = r14.mo2596o()
            float r14 = r14.mo2601u()
            float r20 = r20 - r14
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x011a
            r14 = r15[r10]
            int r14 = r14 + r10
            r15[r10] = r14
        L_0x011a:
            int r14 = (r20 > r17 ? 1 : (r20 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x0123
            r14 = r15[r6]
            int r14 = r14 + r10
            r15[r6] = r14
        L_0x0123:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x012e
            r14 = 3
            r18 = r15[r14]
            int r18 = r18 + 1
            r15[r14] = r18
        L_0x012e:
            int r14 = (r19 > r17 ? 1 : (r19 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0139
            r14 = 2
            r16 = r15[r14]
            int r16 = r16 + 1
            r15[r14] = r16
        L_0x0139:
            int r13 = r13 + 1
            goto L_0x00ef
        L_0x013c:
            r13 = r15[r6]
            r14 = r13
            r6 = 1
            r10 = 4
            r13 = 0
        L_0x0142:
            if (r6 >= r10) goto L_0x0150
            r10 = r15[r6]
            if (r14 >= r10) goto L_0x014c
            r10 = r15[r6]
            r13 = r6
            r14 = r10
        L_0x014c:
            int r6 = r6 + 1
            r10 = 4
            goto L_0x0142
        L_0x0150:
            r6 = 0
        L_0x0151:
            int r10 = r2.length
            if (r6 >= r10) goto L_0x01ef
            r10 = r2[r6]
            java.lang.Object r10 = r1.get(r10)
            androidx.constraintlayout.motion.widget.n r10 = (androidx.constraintlayout.motion.widget.C0396n) r10
            if (r10 != 0) goto L_0x0163
        L_0x015e:
            r1 = r22
            r15 = -1
            goto L_0x01e9
        L_0x0163:
            float r14 = r10.mo2595n()
            float r15 = r10.mo2599t()
            float r14 = r14 - r15
            float r15 = r10.mo2596o()
            float r20 = r10.mo2601u()
            float r15 = r15 - r20
            if (r13 != 0) goto L_0x0189
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 <= 0) goto L_0x0187
            boolean r15 = r0.f1614y
            if (r15 == 0) goto L_0x0184
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0187
        L_0x0184:
            r1 = 3
        L_0x0185:
            r14 = 0
            goto L_0x01ba
        L_0x0187:
            r1 = 3
            goto L_0x01b9
        L_0x0189:
            r1 = 1
            if (r13 != r1) goto L_0x0199
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L_0x0187
            boolean r15 = r0.f1614y
            if (r15 == 0) goto L_0x0184
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0187
            goto L_0x0184
        L_0x0199:
            r1 = 2
            if (r13 != r1) goto L_0x01a9
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 >= 0) goto L_0x0187
            boolean r14 = r0.f1614y
            if (r14 == 0) goto L_0x0184
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x0187
            goto L_0x0184
        L_0x01a9:
            r1 = 3
            if (r13 != r1) goto L_0x01b9
            int r14 = (r14 > r17 ? 1 : (r14 == r17 ? 0 : -1))
            if (r14 <= 0) goto L_0x01b9
            boolean r14 = r0.f1614y
            if (r14 == 0) goto L_0x0185
            int r14 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r14 != 0) goto L_0x01b9
            goto L_0x0185
        L_0x01b9:
            r14 = 1
        L_0x01ba:
            if (r14 == 0) goto L_0x015e
            int r14 = r0.f1615z
            r15 = -1
            if (r14 != r15) goto L_0x01e4
            r10.mo2583a(r3)
            r10.mo2583a(r4)
            r10.mo2583a(r5)
            r10.mo2583a(r7)
            int r14 = r0.f1612w
            if (r14 <= 0) goto L_0x01d7
            r10.mo2583a(r8)
            r10.mo2583a(r11)
        L_0x01d7:
            int r14 = r0.f1613x
            if (r14 <= 0) goto L_0x01e1
            r10.mo2583a(r9)
            r10.mo2583a(r12)
        L_0x01e1:
            r1 = r22
            goto L_0x01e9
        L_0x01e4:
            r1 = r22
            r1.mo2450Z(r14, r10)
        L_0x01e9:
            int r6 = r6 + 1
            r1 = r23
            goto L_0x0151
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.helper.widget.MotionEffect.mo2424D(androidx.constraintlayout.motion.widget.MotionLayout, java.util.HashMap):void");
    }

    /* renamed from: x */
    public boolean mo2425x() {
        return true;
    }

    public MotionEffect(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m2100F(context, attributeSet);
    }

    public MotionEffect(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2100F(context, attributeSet);
    }
}
