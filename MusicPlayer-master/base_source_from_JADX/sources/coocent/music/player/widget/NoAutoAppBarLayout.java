package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.google.android.material.appbar.AppBarLayout;

public class NoAutoAppBarLayout extends AppBarLayout {

    /* renamed from: y */
    private boolean f31604y = true;

    public NoAutoAppBarLayout(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.f31604y) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public void setTouchEnable(boolean z) {
        this.f31604y = z;
    }

    public NoAutoAppBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
