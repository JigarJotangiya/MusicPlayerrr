package p453me.zhanghai.android.materialprogressbar;

import android.graphics.Canvas;
import android.graphics.Paint;

/* renamed from: me.zhanghai.android.materialprogressbar.CircularProgressBackgroundDrawable */
class CircularProgressBackgroundDrawable extends BaseSingleCircularProgressDrawable implements ShowBackgroundDrawable {
    private boolean mShow = true;

    CircularProgressBackgroundDrawable() {
    }

    public void draw(Canvas canvas) {
        if (this.mShow) {
            super.draw(canvas);
        }
    }

    public boolean getShowBackground() {
        return this.mShow;
    }

    /* access modifiers changed from: protected */
    public void onDrawRing(Canvas canvas, Paint paint) {
        drawRing(canvas, paint, 0.0f, 360.0f);
    }

    public void setShowBackground(boolean z) {
        if (this.mShow != z) {
            this.mShow = z;
            invalidateSelf();
        }
    }
}
