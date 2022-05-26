package com.afollestad.materialdialogs.color;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import p159f.p160a.p161a.p163r.C4297a;

public class CircleView extends FrameLayout {

    /* renamed from: g */
    private final int f5481g;

    /* renamed from: h */
    private final int f5482h;

    /* renamed from: i */
    private final Paint f5483i;

    /* renamed from: j */
    private final Paint f5484j;

    /* renamed from: k */
    private final Paint f5485k;

    /* renamed from: l */
    private boolean f5486l;

    public CircleView(Context context) {
        this(context, (AttributeSet) null, 0);
    }

    /* renamed from: a */
    private Drawable m7502a(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(m7506e(m7505d(i)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable);
        return stateListDrawable;
    }

    /* renamed from: b */
    public static int m7503b(int i, float f) {
        if (f == 1.0f) {
            return i;
        }
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        fArr[2] = fArr[2] * f;
        return Color.HSVToColor(fArr);
    }

    /* renamed from: c */
    public static int m7504c(int i) {
        return m7503b(i, 0.9f);
    }

    /* renamed from: d */
    public static int m7505d(int i) {
        return m7503b(i, 1.1f);
    }

    /* renamed from: e */
    private static int m7506e(int i) {
        return Color.argb(Math.round(((float) Color.alpha(i)) * 0.7f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: f */
    private void m7507f(int i) {
        this.f5485k.setColor(i);
        this.f5483i.setColor(m7504c(i));
        Drawable a = m7502a(i);
        if (Build.VERSION.SDK_INT >= 21) {
            setForeground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{m7505d(i)}), a, (Drawable) null));
            return;
        }
        setForeground(a);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / 2;
        if (this.f5486l) {
            int i = measuredWidth - this.f5482h;
            int i2 = i - this.f5481g;
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f5483i);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i, this.f5484j);
            canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) i2, this.f5485k);
            return;
        }
        canvas.drawCircle((float) (getMeasuredWidth() / 2), (float) (getMeasuredHeight() / 2), (float) measuredWidth, this.f5485k);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    @Deprecated
    public void setActivated(boolean z) {
        throw new IllegalStateException("Cannot use setActivated() on CircleView.");
    }

    @Deprecated
    public void setBackground(Drawable drawable) {
        throw new IllegalStateException("Cannot use setBackground() on CircleView.");
    }

    public void setBackgroundColor(int i) {
        m7507f(i);
        requestLayout();
        invalidate();
    }

    @Deprecated
    public void setBackgroundDrawable(Drawable drawable) {
        throw new IllegalStateException("Cannot use setBackgroundDrawable() on CircleView.");
    }

    public void setBackgroundResource(int i) {
        setBackgroundColor(C4297a.m18789c(getContext(), i));
    }

    public void setSelected(boolean z) {
        this.f5486l = z;
        requestLayout();
        invalidate();
    }

    public CircleView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CircleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Resources resources = getResources();
        this.f5481g = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        this.f5482h = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        Paint paint = new Paint();
        this.f5484j = paint;
        paint.setAntiAlias(true);
        paint.setColor(-1);
        Paint paint2 = new Paint();
        this.f5485k = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.f5483i = paint3;
        paint3.setAntiAlias(true);
        m7507f(-12303292);
        setWillNotDraw(false);
    }
}
