package com.coocent.marquee;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class MarqueeMaskView extends View {

    /* renamed from: g */
    private final Paint f7724g;

    /* renamed from: h */
    private final Context f7725h;

    /* renamed from: i */
    private int f7726i;

    /* renamed from: j */
    private RectF f7727j = new RectF();

    /* renamed from: k */
    private RectF f7728k = new RectF();

    /* renamed from: l */
    private Path f7729l = new Path();

    /* renamed from: m */
    private Path f7730m = new Path();

    /* renamed from: n */
    private RectF f7731n = new RectF();

    /* renamed from: o */
    private float f7732o;

    /* renamed from: p */
    private float f7733p;

    public MarqueeMaskView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7725h = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2328w.MarqueeMaskView);
        this.f7732o = (float) m10541a(obtainStyledAttributes.getFloat(C2328w.MarqueeMaskView_maskRadiusTop, 0.0f));
        this.f7733p = (float) m10541a(obtainStyledAttributes.getFloat(C2328w.MarqueeMaskView_maskRadiusBottom, 0.0f));
        this.f7726i = obtainStyledAttributes.getColor(C2328w.MarqueeMaskView_maskColor, Color.parseColor("#60000000"));
        obtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.f7724g = paint;
        paint.setColor(this.f7726i);
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
    }

    /* renamed from: a */
    private int m10541a(float f) {
        return (int) TypedValue.applyDimension(1, f, this.f7725h.getResources().getDisplayMetrics());
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        canvas.clipPath(this.f7730m, Region.Op.DIFFERENCE);
        RectF rectF = this.f7731n;
        float f = this.f7732o;
        canvas.drawRoundRect(rectF, f, f, this.f7724g);
        canvas.restore();
        canvas.save();
        canvas.clipPath(this.f7729l, Region.Op.DIFFERENCE);
        RectF rectF2 = this.f7731n;
        float f2 = this.f7733p;
        canvas.drawRoundRect(rectF2, f2, f2, this.f7724g);
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = this.f7731n;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = (float) getWidth();
        this.f7731n.bottom = (float) getHeight();
        RectF rectF2 = this.f7727j;
        rectF2.left = 0.0f;
        rectF2.top = 0.0f;
        rectF2.right = (float) getWidth();
        this.f7727j.bottom = (float) (getHeight() / 2);
        RectF rectF3 = this.f7728k;
        rectF3.left = 0.0f;
        rectF3.top = (float) (getHeight() / 2);
        this.f7728k.right = (float) getWidth();
        this.f7728k.bottom = (float) getHeight();
        this.f7729l.reset();
        this.f7729l.addRect(this.f7727j, Path.Direction.CW);
        this.f7730m.reset();
        this.f7730m.addRect(this.f7728k, Path.Direction.CW);
    }
}
