package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;

public class CustomRecycleView extends RecyclerView {

    /* renamed from: R0 */
    private boolean f31511R0 = false;

    public CustomRecycleView(Context context) {
        super(context);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        Log.e("onPanelS", "scrollEnable:" + this.f31511R0);
        return this.f31511R0;
    }

    public void setScrollEnable(boolean z) {
        this.f31511R0 = z;
    }

    public CustomRecycleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CustomRecycleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
