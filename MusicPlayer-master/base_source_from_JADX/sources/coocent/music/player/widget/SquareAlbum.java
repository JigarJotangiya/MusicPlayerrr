package coocent.music.player.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.makeramen.roundedimageview.RoundedImageView;

public class SquareAlbum extends RoundedImageView {
    public SquareAlbum(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(ImageView.getDefaultSize(0, i), ImageView.getDefaultSize(0, i2));
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (makeMeasureSpec >= makeMeasureSpec2) {
            super.onMeasure(makeMeasureSpec2, makeMeasureSpec2);
            Log.e("onMeasure", "heightMeasureSpec >= widthMeasureSpec");
            return;
        }
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
        Log.e("onMeasure", "heightMeasureSpec < widthMeasureSpec");
    }

    public SquareAlbum(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SquareAlbum(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
