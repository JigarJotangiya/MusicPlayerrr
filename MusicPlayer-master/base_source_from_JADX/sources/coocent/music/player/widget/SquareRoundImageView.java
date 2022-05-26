package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;

public class SquareRoundImageView extends RelativeLayout {
    public SquareRoundImageView(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(RelativeLayout.getDefaultSize(0, i), RelativeLayout.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareRoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareRoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
