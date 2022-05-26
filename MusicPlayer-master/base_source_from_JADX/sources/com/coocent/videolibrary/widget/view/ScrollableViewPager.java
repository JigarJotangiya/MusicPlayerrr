package com.coocent.videolibrary.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

@Deprecated
public class ScrollableViewPager extends ViewPager {

    /* renamed from: p0 */
    private boolean f9174p0 = true;

    public ScrollableViewPager(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9174p0 && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f9174p0 && super.onTouchEvent(motionEvent);
    }

    public void setCanScroll(boolean z) {
        this.f9174p0 = z;
    }

    public ScrollableViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
