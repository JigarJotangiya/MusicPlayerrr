package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import coocent.music.player.base.BaseApplication;
import skin.support.widget.SkinCompatView;

public class StatusBarView extends SkinCompatView {
    public StatusBarView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(i, BaseApplication.f31145H);
    }

    public StatusBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public StatusBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
