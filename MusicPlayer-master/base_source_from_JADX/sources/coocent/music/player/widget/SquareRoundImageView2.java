package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.makeramen.roundedimageview.RoundedImageView;

public class SquareRoundImageView2 extends RoundedImageView {
    public SquareRoundImageView2(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(ImageView.getDefaultSize(0, i), ImageView.getDefaultSize(0, i2));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }

    public SquareRoundImageView2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareRoundImageView2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
