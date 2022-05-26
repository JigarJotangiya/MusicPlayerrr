package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

public class NoScrollRelativeLayout extends RelativeLayout {
    public NoScrollRelativeLayout(Context context) {
        super(context);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public NoScrollRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public NoScrollRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
