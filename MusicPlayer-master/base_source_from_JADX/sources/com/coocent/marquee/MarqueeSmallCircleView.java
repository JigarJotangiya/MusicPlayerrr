package com.coocent.marquee;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Region;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import java.util.Locale;

public class MarqueeSmallCircleView extends View {

    /* renamed from: g */
    private float f7754g;

    /* renamed from: h */
    private int f7755h;

    /* renamed from: i */
    private int[] f7756i;

    /* renamed from: j */
    private Paint f7757j;

    /* renamed from: k */
    private Paint f7758k;

    /* renamed from: l */
    private int f7759l;

    /* renamed from: m */
    private Path f7760m;

    public MarqueeSmallCircleView(Context context) {
        super(context);
        this.f7755h = 0;
        this.f7757j = new Paint();
        this.f7758k = new Paint();
        this.f7760m = new Path();
        this.f7759l = m10553b(context, 4);
        this.f7757j.setAntiAlias(true);
        this.f7757j.setFilterBitmap(true);
        this.f7754g = (float) m10553b(context, 1);
        this.f7758k.setAntiAlias(true);
        this.f7758k.setFilterBitmap(true);
        this.f7758k.setStyle(Paint.Style.STROKE);
        this.f7758k.setStrokeWidth(this.f7754g);
        this.f7758k.setColor(-16777216);
        setShadow(true);
    }

    /* renamed from: a */
    private int m10552a(float f) {
        return (int) TypedValue.applyDimension(1, f, getContext().getResources().getDisplayMetrics());
    }

    /* renamed from: b */
    private int m10553b(Context context, int i) {
        return (int) TypedValue.applyDimension(1, (float) i, context.getResources().getDisplayMetrics());
    }

    /* renamed from: c */
    private boolean m10554c() {
        if (Build.VERSION.SDK_INT < 17 || TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
            return false;
        }
        return true;
    }

    private void setShadow(boolean z) {
        this.f7758k.setColor(z ? -16777216 : -1);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        int[] iArr = this.f7756i;
        if (iArr != null && iArr.length >= 2) {
            int i2 = 0;
            if (this.f7755h == 1) {
                int min = Math.min(iArr.length, 5);
                float f = ((float) this.f7759l) / 2.0f;
                float width = (((float) getWidth()) - ((((float) (min * 3)) * f) + f)) / 2.0f;
                if (m10554c()) {
                    float f2 = width - f;
                    while (i2 < min) {
                        this.f7757j.setColor(this.f7756i[(min - i2) - 1]);
                        float f3 = f * 3.0f;
                        f2 += f3;
                        canvas.save();
                        if (i2 != min - 1) {
                            this.f7760m.reset();
                            this.f7760m.addCircle(f3 + f2, ((float) getHeight()) / 2.0f, ((float) this.f7759l) + (this.f7754g / 2.0f), Path.Direction.CW);
                            canvas.clipPath(this.f7760m, Region.Op.DIFFERENCE);
                        }
                        canvas.drawCircle(f2, ((float) getHeight()) / 2.0f, (float) this.f7759l, this.f7757j);
                        canvas.drawCircle(f2, ((float) getHeight()) / 2.0f, (float) this.f7759l, this.f7758k);
                        canvas.restore();
                        i2++;
                    }
                    return;
                }
                float width2 = (((float) getWidth()) - width) + f;
                for (int i3 = min - 1; i3 >= 0; i3--) {
                    this.f7757j.setColor(this.f7756i[i3]);
                    float f4 = f * 3.0f;
                    width2 -= f4;
                    canvas.save();
                    if (i3 != 0) {
                        this.f7760m.reset();
                        this.f7760m.addCircle(width2 - f4, ((float) getHeight()) / 2.0f, ((float) this.f7759l) + (this.f7754g / 2.0f), Path.Direction.CW);
                        canvas.clipPath(this.f7760m, Region.Op.DIFFERENCE);
                    }
                    canvas.drawCircle(width2, ((float) getHeight()) / 2.0f, (float) this.f7759l, this.f7757j);
                    canvas.drawCircle(width2, ((float) getHeight()) / 2.0f, (float) this.f7759l, this.f7758k);
                    canvas.restore();
                }
                return;
            }
            int length = iArr.length;
            if (length < 2 || length > 4) {
                i = 0;
            } else {
                int i4 = 5 - length;
                int i5 = this.f7759l;
                i = (i4 * i5) + (i5 / 2);
            }
            while (true) {
                int[] iArr2 = this.f7756i;
                if (i2 < iArr2.length && i2 <= 4) {
                    this.f7757j.setColor(iArr2[i2]);
                    int i6 = this.f7759l;
                    i += (i6 * 2) + (i6 / 2);
                    float f5 = (float) i;
                    canvas.drawCircle(f5, ((float) getHeight()) / 2.0f, (float) this.f7759l, this.f7757j);
                    canvas.drawCircle(f5, ((float) getHeight()) / 2.0f, (float) this.f7759l, this.f7758k);
                    i2++;
                } else {
                    return;
                }
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
            size = Math.max(m10552a(60.0f), getSuggestedMinimumWidth());
        }
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.max(m10552a(16.0f), getSuggestedMinimumHeight());
        }
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, mode), View.MeasureSpec.makeMeasureSpec(size2, mode2));
    }

    public void setBlackShadow(boolean z) {
        setShadow(z);
        invalidate();
    }

    public void setCircleStyle(int i) {
        this.f7755h = i;
        invalidate();
    }

    public void setColors(int[] iArr) {
        this.f7756i = iArr;
        invalidate();
    }

    public MarqueeSmallCircleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7755h = 0;
        this.f7757j = new Paint();
        this.f7758k = new Paint();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeSmallCircleView);
        boolean z = obtainStyledAttributes.getBoolean(C2328w.MarqueeSmallCircleView_isBlackShadow, true);
        this.f7755h = obtainStyledAttributes.getInt(C2328w.MarqueeSmallCircleView_circleStyle, 0);
        obtainStyledAttributes.recycle();
        this.f7760m = new Path();
        this.f7759l = m10553b(context, 4);
        this.f7757j.setAntiAlias(true);
        this.f7757j.setFilterBitmap(true);
        this.f7754g = (float) m10553b(context, 1);
        this.f7758k.setAntiAlias(true);
        this.f7758k.setFilterBitmap(true);
        this.f7758k.setStyle(Paint.Style.STROKE);
        this.f7758k.setStrokeWidth(this.f7754g);
        this.f7758k.setColor(-16777216);
        setShadow(z);
    }
}
