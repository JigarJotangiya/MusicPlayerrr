package com.coocent.marquee;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class MarqueeBorderView extends View {

    /* renamed from: g */
    private Paint f7691g;

    public MarqueeBorderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f7691g = paint;
        paint.setStrokeWidth((float) m10482a(context, 3));
    }

    /* renamed from: a */
    private int m10482a(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        this.f7691g.setColor(-16777216);
        Canvas canvas2 = canvas;
        canvas2.drawLine(0.0f, 0.0f, (float) getWidth(), 0.0f, this.f7691g);
        canvas2.drawLine(0.0f, 0.0f, 0.0f, (float) getHeight(), this.f7691g);
        canvas2.drawLine((float) getWidth(), 0.0f, (float) getWidth(), (float) getHeight(), this.f7691g);
        canvas2.drawLine(0.0f, (float) getHeight(), (float) getWidth(), (float) getHeight(), this.f7691g);
        super.onDraw(canvas);
    }
}
