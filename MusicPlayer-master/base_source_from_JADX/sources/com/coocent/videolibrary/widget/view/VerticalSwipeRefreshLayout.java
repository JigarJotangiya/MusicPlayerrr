package com.coocent.videolibrary.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewConfiguration;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

public class VerticalSwipeRefreshLayout extends SwipeRefreshLayout {

    /* renamed from: b0 */
    private boolean f9175b0;

    /* renamed from: c0 */
    private float f9176c0;

    /* renamed from: d0 */
    private float f9177d0;

    /* renamed from: e0 */
    private int f9178e0;

    public VerticalSwipeRefreshLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9178e0 = ViewConfiguration.get(context).getScaledTouchSlop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        if (r0 != 3) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int r0 = r6.getAction()
            r1 = 0
            if (r0 == 0) goto L_0x003d
            r2 = 1
            if (r0 == r2) goto L_0x003a
            r3 = 2
            if (r0 == r3) goto L_0x0011
            r2 = 3
            if (r0 == r2) goto L_0x003a
            goto L_0x004b
        L_0x0011:
            boolean r0 = r5.f9175b0
            if (r0 == 0) goto L_0x0016
            return r1
        L_0x0016:
            float r0 = r6.getY()
            float r3 = r6.getX()
            float r4 = r5.f9177d0
            float r3 = r3 - r4
            float r3 = java.lang.Math.abs(r3)
            float r4 = r5.f9176c0
            float r0 = r0 - r4
            float r0 = java.lang.Math.abs(r0)
            int r4 = r5.f9178e0
            float r4 = (float) r4
            int r4 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r4 <= 0) goto L_0x004b
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L_0x004b
            r5.f9175b0 = r2
            return r1
        L_0x003a:
            r5.f9175b0 = r1
            goto L_0x004b
        L_0x003d:
            float r0 = r6.getY()
            r5.f9176c0 = r0
            float r0 = r6.getX()
            r5.f9177d0 = r0
            r5.f9175b0 = r1
        L_0x004b:
            boolean r6 = super.onInterceptTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.coocent.videolibrary.widget.view.VerticalSwipeRefreshLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }
}
