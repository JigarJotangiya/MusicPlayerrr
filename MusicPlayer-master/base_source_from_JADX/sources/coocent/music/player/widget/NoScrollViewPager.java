package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.viewpager.widget.ViewPager;

public class NoScrollViewPager extends ViewPager {

    /* renamed from: p0 */
    boolean f31614p0 = false;

    public NoScrollViewPager(Context context) {
        super(context);
    }

    public boolean getIsScroll() {
        return this.f31614p0;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return !this.f31614p0 && super.onInterceptTouchEvent(motionEvent);
        } catch (Exception e) {
            e.printStackTrace();
            return super.onInterceptTouchEvent(motionEvent);
        }
    }

    public void setScroll(boolean z) {
        this.f31614p0 = z;
    }

    public NoScrollViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
