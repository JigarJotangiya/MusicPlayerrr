package com.coocent.marquee.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import p369i.p387z.p389d.C8594l;

/* compiled from: MarqueeCircleColorView.kt */
public final class MarqueeCircleColorView extends View {

    /* renamed from: g */
    private Paint f8148g;

    /* renamed from: h */
    private float f8149h;

    /* renamed from: i */
    private float f8150i;

    /* renamed from: j */
    private Paint f8151j;

    public MarqueeCircleColorView(Context context) {
        super(context);
        m10921b();
    }

    /* renamed from: a */
    private final int m10920a(Context context, int i) {
        Resources resources = context.getResources();
        C8594l.m46768b(resources, "context.resources");
        return (int) TypedValue.applyDimension(1, (float) i, resources.getDisplayMetrics());
    }

    /* renamed from: b */
    private final void m10921b() {
        Context context = getContext();
        C8594l.m46768b(context, "context");
        this.f8150i = (float) m10920a(context, 21);
        Context context2 = getContext();
        C8594l.m46768b(context2, "context");
        this.f8149h = (float) m10920a(context2, 25);
        Paint paint = new Paint();
        paint.setColor(-65536);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        this.f8151j = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-65536);
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
        paint2.setAlpha(51);
        this.f8148g = paint2;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (canvas != null) {
            float width = ((float) getWidth()) / 2.0f;
            float height = ((float) getHeight()) / 2.0f;
            float f = this.f8149h;
            Paint paint = this.f8148g;
            if (paint != null) {
                canvas.drawCircle(width, height, f, paint);
                float width2 = ((float) getWidth()) / 2.0f;
                float height2 = ((float) getHeight()) / 2.0f;
                float f2 = this.f8150i;
                Paint paint2 = this.f8151j;
                if (paint2 != null) {
                    canvas.drawCircle(width2, height2, f2, paint2);
                } else {
                    C8594l.m46783q("mPaint");
                    throw null;
                }
            } else {
                C8594l.m46783q("mOutPaint");
                throw null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode == Integer.MIN_VALUE) {
            Context context = getContext();
            C8594l.m46768b(context, "context");
            size = C8392f.m46450a(m10920a(context, 50) + getPaddingStart() + getPaddingEnd(), getSuggestedMinimumWidth());
        }
        if (mode2 == Integer.MIN_VALUE) {
            Context context2 = getContext();
            C8594l.m46768b(context2, "context");
            size2 = C8392f.m46450a(m10920a(context2, 50) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight());
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public final void setColor(int i) {
        Paint paint = this.f8151j;
        if (paint != null) {
            paint.setColor(i);
            Paint paint2 = this.f8148g;
            if (paint2 != null) {
                paint2.setColor(i);
                Paint paint3 = this.f8148g;
                if (paint3 != null) {
                    paint3.setAlpha(51);
                    invalidate();
                    return;
                }
                C8594l.m46783q("mOutPaint");
                throw null;
            }
            C8594l.m46783q("mOutPaint");
            throw null;
        }
        C8594l.m46783q("mPaint");
        throw null;
    }

    public final void setSolidColor(int i) {
        Paint paint = this.f8151j;
        if (paint != null) {
            paint.setColor(i);
            Paint paint2 = this.f8151j;
            if (paint2 != null) {
                paint2.setAlpha(0);
                Paint paint3 = this.f8148g;
                if (paint3 != null) {
                    paint3.setColor(i);
                    invalidate();
                    return;
                }
                C8594l.m46783q("mOutPaint");
                throw null;
            }
            C8594l.m46783q("mPaint");
            throw null;
        }
        C8594l.m46783q("mPaint");
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MarqueeCircleColorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C8594l.m46772f(attributeSet, "attrs");
        m10921b();
    }
}
