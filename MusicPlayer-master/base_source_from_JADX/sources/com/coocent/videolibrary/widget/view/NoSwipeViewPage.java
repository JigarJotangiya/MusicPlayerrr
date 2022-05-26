package com.coocent.videolibrary.widget.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

@Deprecated
public class NoSwipeViewPage extends ViewPager {

    /* renamed from: p0 */
    private boolean f9173p0 = true;

    public NoSwipeViewPage(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f9173p0 && super.onInterceptTouchEvent(motionEvent);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f9173p0 && super.onTouchEvent(motionEvent);
    }

    public void setSetCanSwipe(boolean z) {
        this.f9173p0 = z;
    }

    public NoSwipeViewPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
