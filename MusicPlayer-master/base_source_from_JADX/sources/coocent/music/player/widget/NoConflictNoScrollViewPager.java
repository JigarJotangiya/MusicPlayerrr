package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class NoConflictNoScrollViewPager extends ViewPager {

    /* renamed from: p0 */
    boolean f31605p0 = false;

    public NoConflictNoScrollViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        getParent().requestDisallowInterceptTouchEvent(true);
        return super.dispatchTouchEvent(motionEvent);
    }

    public boolean getIsScroll() {
        return this.f31605p0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.f31605p0) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void setScroll(boolean z) {
        this.f31605p0 = z;
    }

    public NoConflictNoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
