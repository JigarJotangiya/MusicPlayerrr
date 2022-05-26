package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import coocent.music.player.widget.rtl.RtlViewPager;

public class CashErrorViewPager extends RtlViewPager {
    public CashErrorViewPager(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (ArrayIndexOutOfBoundsException | Exception | IllegalArgumentException | IllegalStateException unused) {
            return false;
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (Exception unused) {
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        try {
            super.onMeasure(i, i2);
        } catch (Exception unused) {
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            return true;
        }
    }

    public CashErrorViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
