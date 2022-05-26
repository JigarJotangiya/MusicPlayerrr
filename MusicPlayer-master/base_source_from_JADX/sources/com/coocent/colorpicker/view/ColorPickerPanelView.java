package com.coocent.colorpicker.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import p159f.p166c.p167a.p169d.C4309a;

public class ColorPickerPanelView extends View {

    /* renamed from: g */
    private float f7457g;

    /* renamed from: h */
    private int f7458h;

    /* renamed from: i */
    private int f7459i;

    /* renamed from: j */
    private Paint f7460j;

    /* renamed from: k */
    private Paint f7461k;

    /* renamed from: l */
    private RectF f7462l;

    /* renamed from: m */
    private RectF f7463m;

    /* renamed from: n */
    private C4309a f7464n;

    public ColorPickerPanelView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m10331a() {
        this.f7460j = new Paint();
        this.f7461k = new Paint();
        this.f7457g = getContext().getResources().getDisplayMetrics().density;
    }

    /* renamed from: b */
    private void m10332b() {
        RectF rectF = this.f7462l;
        this.f7463m = new RectF(rectF.left + 1.0f, rectF.top + 1.0f, rectF.right - 1.0f, rectF.bottom - 1.0f);
        C4309a aVar = new C4309a((int) (this.f7457g * 5.0f));
        this.f7464n = aVar;
        aVar.setBounds(Math.round(this.f7463m.left), Math.round(this.f7463m.top), Math.round(this.f7463m.right), Math.round(this.f7463m.bottom));
    }

    public int getBorderColor() {
        return this.f7458h;
    }

    public int getColor() {
        return this.f7459i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        RectF rectF = this.f7463m;
        this.f7460j.setColor(this.f7458h);
        canvas.drawRect(this.f7462l, this.f7460j);
        C4309a aVar = this.f7464n;
        if (aVar != null) {
            aVar.draw(canvas);
        }
        this.f7461k.setColor(this.f7459i);
        canvas.drawRect(rectF, this.f7461k);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        RectF rectF = new RectF();
        this.f7462l = rectF;
        rectF.left = (float) getPaddingLeft();
        this.f7462l.right = (float) (i - getPaddingRight());
        this.f7462l.top = (float) getPaddingTop();
        this.f7462l.bottom = (float) (i2 - getPaddingBottom());
        m10332b();
    }

    public void setBorderColor(int i) {
        this.f7458h = i;
        invalidate();
    }

    public void setColor(int i) {
        this.f7459i = i;
        invalidate();
    }

    public ColorPickerPanelView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ColorPickerPanelView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7457g = 1.0f;
        this.f7458h = -9539986;
        this.f7459i = -16777216;
        m10331a();
    }
}
