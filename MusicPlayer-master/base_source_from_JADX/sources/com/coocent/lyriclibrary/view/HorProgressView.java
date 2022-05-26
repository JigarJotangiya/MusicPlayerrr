package com.coocent.lyriclibrary.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import p159f.p166c.p177d.p180j.C4352a;

public class HorProgressView extends View {

    /* renamed from: g */
    private int f7525g;

    /* renamed from: h */
    private float f7526h;

    public HorProgressView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m10370a(Canvas canvas) {
        canvas.save();
        canvas.clipRect(new Rect(0, 0, (int) (((float) getWidth()) * this.f7526h), getHeight()));
        canvas.drawColor(this.f7525g);
        canvas.restore();
    }

    /* renamed from: b */
    private void m10371b() {
        this.f7525g = C4352a.f12934g[0];
    }

    private void setPercentageInernal(float f) {
        this.f7526h = f;
        invalidate();
    }

    /* renamed from: c */
    public void mo8838c(int i, int i2) {
        if (i > i2) {
            i = i2;
        }
        setPercentageInernal((i <= 0 || i2 <= 0) ? 0.0f : (((float) i) * 1.0f) / ((float) i2));
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m10370a(canvas);
    }

    public void setProgressColor(int i) {
        this.f7525g = i;
        invalidate();
    }

    public HorProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7526h = 0.0f;
        m10371b();
    }
}
