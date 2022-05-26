package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.ads.internal.util.C3049x;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rq1 extends FrameLayout {

    /* renamed from: g */
    private final C3049x f22956g;

    public rq1(Context context, View view, C3049x xVar) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.f22956g = xVar;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f22956g.mo11138m(motionEvent);
        return false;
    }

    public final void removeAllViews() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if (childAt != null && (childAt instanceof pr0)) {
                arrayList.add((pr0) childAt);
            }
        }
        super.removeAllViews();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((pr0) arrayList.get(i2)).destroy();
        }
    }
}
