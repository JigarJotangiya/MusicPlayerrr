package com.ocnyang.pagetransformerhelp.cardtransformer;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.Log;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.ocnyang.pagetransformerhelp.cardtransformer.f */
/* compiled from: Indicator */
public class C6770f extends BaseIndicator {

    /* renamed from: g */
    private Paint f30277g;

    public C6770f(Context context) {
        super(context);
        m38636a();
    }

    /* renamed from: a */
    private void m38636a() {
        Paint paint = new Paint();
        this.f30277g = paint;
        paint.setAntiAlias(true);
        setState(false);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredHeight = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        Log.e("heigth", BuildConfig.FLAVOR + measuredHeight);
        Log.e("width", BuildConfig.FLAVOR + measuredWidth);
        float f = ((float) measuredWidth) * 0.5f;
        canvas.translate(f, ((float) measuredHeight) * 0.5f);
        canvas.drawCircle(0.0f, 0.0f, f, this.f30277g);
    }

    public void setState(boolean z) {
        if (z) {
            this.f30277g.setColor(-1);
        } else {
            this.f30277g.setColor(-1996488705);
        }
        invalidate();
    }
}
