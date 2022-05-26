package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import p082e.p109h.p113j.C3641a;
import p082e.p109h.p119p.C3774v;

abstract class HeaderBehavior<V extends View> extends ViewOffsetBehavior<V> {

    /* renamed from: d */
    private Runnable f27677d;

    /* renamed from: e */
    OverScroller f27678e;

    /* renamed from: f */
    private boolean f27679f;

    /* renamed from: g */
    private int f27680g = -1;

    /* renamed from: h */
    private int f27681h;

    /* renamed from: i */
    private int f27682i = -1;

    /* renamed from: j */
    private VelocityTracker f27683j;

    /* renamed from: com.google.android.material.appbar.HeaderBehavior$a */
    private class C5903a implements Runnable {

        /* renamed from: g */
        private final CoordinatorLayout f27684g;

        /* renamed from: h */
        private final View f27685h;

        C5903a(CoordinatorLayout coordinatorLayout, V v) {
            this.f27684g = coordinatorLayout;
            this.f27685h = v;
        }

        public void run() {
            OverScroller overScroller;
            if (this.f27685h != null && (overScroller = HeaderBehavior.this.f27678e) != null) {
                if (overScroller.computeScrollOffset()) {
                    HeaderBehavior headerBehavior = HeaderBehavior.this;
                    headerBehavior.mo22904P(this.f27684g, this.f27685h, headerBehavior.f27678e.getCurrY());
                    C3774v.m16201g0(this.f27685h, this);
                    return;
                }
                HeaderBehavior.this.mo22794N(this.f27684g, this.f27685h);
            }
        }
    }

    public HeaderBehavior() {
    }

    /* renamed from: I */
    private void m35256I() {
        if (this.f27683j == null) {
            this.f27683j = VelocityTracker.obtain();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x008c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* renamed from: D */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo3050D(androidx.coordinatorlayout.widget.CoordinatorLayout r12, V r13, android.view.MotionEvent r14) {
        /*
            r11 = this;
            int r0 = r14.getActionMasked()
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == r2) goto L_0x004e
            r4 = 2
            if (r0 == r4) goto L_0x002d
            r12 = 3
            if (r0 == r12) goto L_0x0072
            r12 = 6
            if (r0 == r12) goto L_0x0013
            goto L_0x004c
        L_0x0013:
            int r12 = r14.getActionIndex()
            if (r12 != 0) goto L_0x001b
            r12 = 1
            goto L_0x001c
        L_0x001b:
            r12 = 0
        L_0x001c:
            int r13 = r14.getPointerId(r12)
            r11.f27680g = r13
            float r12 = r14.getY(r12)
            r13 = 1056964608(0x3f000000, float:0.5)
            float r12 = r12 + r13
            int r12 = (int) r12
            r11.f27681h = r12
            goto L_0x004c
        L_0x002d:
            int r0 = r11.f27680g
            int r0 = r14.findPointerIndex(r0)
            if (r0 != r1) goto L_0x0036
            return r3
        L_0x0036:
            float r0 = r14.getY(r0)
            int r0 = (int) r0
            int r1 = r11.f27681h
            int r7 = r1 - r0
            r11.f27681h = r0
            int r8 = r11.mo22791K(r13)
            r9 = 0
            r4 = r11
            r5 = r12
            r6 = r13
            r4.mo22903O(r5, r6, r7, r8, r9)
        L_0x004c:
            r12 = 0
            goto L_0x0081
        L_0x004e:
            android.view.VelocityTracker r0 = r11.f27683j
            if (r0 == 0) goto L_0x0072
            r0.addMovement(r14)
            android.view.VelocityTracker r0 = r11.f27683j
            r4 = 1000(0x3e8, float:1.401E-42)
            r0.computeCurrentVelocity(r4)
            android.view.VelocityTracker r0 = r11.f27683j
            int r4 = r11.f27680g
            float r10 = r0.getYVelocity(r4)
            int r0 = r11.mo22792L(r13)
            int r8 = -r0
            r9 = 0
            r5 = r11
            r6 = r12
            r7 = r13
            r5.mo22902J(r6, r7, r8, r9, r10)
            r12 = 1
            goto L_0x0073
        L_0x0072:
            r12 = 0
        L_0x0073:
            r11.f27679f = r3
            r11.f27680g = r1
            android.view.VelocityTracker r13 = r11.f27683j
            if (r13 == 0) goto L_0x0081
            r13.recycle()
            r13 = 0
            r11.f27683j = r13
        L_0x0081:
            android.view.VelocityTracker r13 = r11.f27683j
            if (r13 == 0) goto L_0x0088
            r13.addMovement(r14)
        L_0x0088:
            boolean r13 = r11.f27679f
            if (r13 != 0) goto L_0x0090
            if (r12 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r2 = 0
        L_0x0090:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.HeaderBehavior.mo3050D(androidx.coordinatorlayout.widget.CoordinatorLayout, android.view.View, android.view.MotionEvent):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public boolean mo22790H(V v) {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: J */
    public final boolean mo22902J(CoordinatorLayout coordinatorLayout, V v, int i, int i2, float f) {
        V v2 = v;
        Runnable runnable = this.f27677d;
        if (runnable != null) {
            v.removeCallbacks(runnable);
            this.f27677d = null;
        }
        if (this.f27678e == null) {
            this.f27678e = new OverScroller(v.getContext());
        }
        this.f27678e.fling(0, mo22917E(), 0, Math.round(f), 0, 0, i, i2);
        if (this.f27678e.computeScrollOffset()) {
            CoordinatorLayout coordinatorLayout2 = coordinatorLayout;
            C5903a aVar = new C5903a(coordinatorLayout, v);
            this.f27677d = aVar;
            C3774v.m16201g0(v, aVar);
            return true;
        }
        CoordinatorLayout coordinatorLayout3 = coordinatorLayout;
        mo22794N(coordinatorLayout, v);
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: K */
    public int mo22791K(V v) {
        return -v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: L */
    public int mo22792L(V v) {
        return v.getHeight();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: M */
    public int mo22793M() {
        return mo22917E();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: N */
    public void mo22794N(CoordinatorLayout coordinatorLayout, V v) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: O */
    public final int mo22903O(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        return mo22795Q(coordinatorLayout, v, mo22793M() - i, i2, i3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public int mo22904P(CoordinatorLayout coordinatorLayout, V v, int i) {
        return mo22795Q(coordinatorLayout, v, i, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public int mo22795Q(CoordinatorLayout coordinatorLayout, V v, int i, int i2, int i3) {
        int b;
        int E = mo22917E();
        if (i2 == 0 || E < i2 || E > i3 || E == (b = C3641a.m15694b(i, i2, i3))) {
            return 0;
        }
        mo22918G(b);
        return E - b;
    }

    /* renamed from: k */
    public boolean mo3061k(CoordinatorLayout coordinatorLayout, V v, MotionEvent motionEvent) {
        int findPointerIndex;
        if (this.f27682i < 0) {
            this.f27682i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f27679f) {
            int i = this.f27680g;
            if (i == -1 || (findPointerIndex = motionEvent.findPointerIndex(i)) == -1) {
                return false;
            }
            int y = (int) motionEvent.getY(findPointerIndex);
            if (Math.abs(y - this.f27681h) > this.f27682i) {
                this.f27681h = y;
                return true;
            }
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f27680g = -1;
            int x = (int) motionEvent.getX();
            int y2 = (int) motionEvent.getY();
            boolean z = mo22790H(v) && coordinatorLayout.mo2998F(v, x, y2);
            this.f27679f = z;
            if (z) {
                this.f27681h = y2;
                this.f27680g = motionEvent.getPointerId(0);
                m35256I();
                OverScroller overScroller = this.f27678e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f27678e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f27683j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public HeaderBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
