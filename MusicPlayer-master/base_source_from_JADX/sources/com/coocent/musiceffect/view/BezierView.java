package com.coocent.musiceffect.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0506a;
import java.util.Arrays;
import p159f.p166c.p201g.C4509d;
import p159f.p166c.p201g.p208p.C4569d;

public class BezierView extends View {

    /* renamed from: g */
    private int f8680g;

    /* renamed from: h */
    private Paint f8681h;

    /* renamed from: i */
    private Paint f8682i;

    /* renamed from: j */
    private Path f8683j;

    /* renamed from: k */
    private PathEffect f8684k;

    /* renamed from: l */
    private int f8685l;

    /* renamed from: m */
    private int f8686m;

    /* renamed from: n */
    private float f8687n;

    /* renamed from: o */
    private int[] f8688o;

    /* renamed from: p */
    private int f8689p;

    /* renamed from: q */
    private int f8690q;

    /* renamed from: r */
    private int f8691r;

    /* renamed from: s */
    private int f8692s;

    public BezierView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: a */
    private void m11586a(Canvas canvas) {
        this.f8682i.setPathEffect((PathEffect) null);
        int i = 0;
        while (true) {
            int i2 = this.f8680g;
            if (i < i2) {
                i++;
                float f = ((((float) this.f8685l) * 1.0f) / ((float) (i2 + 1))) * ((float) i);
                canvas.drawLine(f, 0.0f, f, (float) this.f8686m, this.f8682i);
            } else {
                canvas.drawLine(0.0f, 0.0f, (float) this.f8685l, 0.0f, this.f8682i);
                int i3 = this.f8686m;
                canvas.drawLine(0.0f, (float) i3, (float) this.f8685l, (float) i3, this.f8682i);
                int i4 = this.f8686m;
                canvas.drawLine(0.0f, ((float) i4) * 0.5f, (float) this.f8685l, ((float) i4) * 0.5f, this.f8682i);
                this.f8682i.setPathEffect(this.f8684k);
                this.f8683j.reset();
                this.f8683j.moveTo(0.0f, ((float) this.f8686m) * 0.25f);
                this.f8683j.lineTo((float) this.f8685l, ((float) this.f8686m) * 0.25f);
                this.f8683j.moveTo(0.0f, ((float) this.f8686m) * 0.75f);
                this.f8683j.lineTo((float) this.f8685l, ((float) this.f8686m) * 0.75f);
                canvas.drawPath(this.f8683j, this.f8682i);
                return;
            }
        }
    }

    /* renamed from: b */
    private float m11587b(int i) {
        int i2 = this.f8686m;
        float f = this.f8687n;
        return (((float) i2) - (((((float) i2) - f) * ((float) i)) / ((float) this.f8689p))) - (f / 2.0f);
    }

    /* renamed from: c */
    private void m11588c(Context context) {
        this.f8690q = C0506a.m3150b(context, C4509d.effect_default);
        this.f8691r = C0506a.m3150b(context, C4509d.effect_progress_close);
        this.f8692s = C0506a.m3150b(context, C4509d.effect_accent);
        Paint paint = new Paint();
        this.f8681h = paint;
        paint.setAntiAlias(true);
        this.f8681h.setDither(true);
        this.f8681h.setStyle(Paint.Style.STROKE);
        this.f8681h.setColor(this.f8692s);
        float a = (float) C4569d.m19968a(context, 3.0f);
        this.f8687n = a;
        this.f8681h.setStrokeWidth(a);
        Paint paint2 = new Paint();
        this.f8682i = paint2;
        paint2.setAntiAlias(true);
        this.f8682i.setStyle(Paint.Style.STROKE);
        this.f8682i.setColor(this.f8690q);
        this.f8682i.setStrokeWidth((float) C4569d.m19968a(context, 1.0f));
        this.f8683j = new Path();
        this.f8684k = new DashPathEffect(new float[]{8.0f, 8.0f}, 0.0f);
        int[] iArr = new int[(this.f8680g + 2)];
        this.f8688o = iArr;
        Arrays.fill(iArr, this.f8689p / 2);
    }

    private Path getBezierPath() {
        this.f8683j.reset();
        int[] iArr = this.f8688o;
        if (iArr == null || iArr.length == 0) {
            return this.f8683j;
        }
        float length = (((float) this.f8685l) * 1.0f) / ((float) (iArr.length - 1));
        int i = 0;
        this.f8683j.moveTo(0.0f, m11587b(iArr[0]));
        while (true) {
            int[] iArr2 = this.f8688o;
            if (i >= iArr2.length - 1) {
                return this.f8683j;
            }
            int i2 = i + 1;
            float f = length * ((float) i2);
            float f2 = ((((float) i) * length) + f) / 2.0f;
            this.f8683j.cubicTo(f2, m11587b(iArr2[i]), f2, m11587b(this.f8688o[i2]), f, m11587b(this.f8688o[i2]));
            i = i2;
        }
    }

    /* renamed from: d */
    public void mo9563d(int i, int i2) {
        int i3 = i + 1;
        int[] iArr = this.f8688o;
        if (i3 < iArr.length) {
            iArr[i3] = i2;
            invalidate();
        }
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f8685l > 0 && this.f8686m > 0) {
            m11586a(canvas);
            this.f8681h.setColor(isEnabled() ? this.f8692s : this.f8691r);
            canvas.drawPath(getBezierPath(), this.f8681h);
        }
    }

    /* access modifiers changed from: protected */
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f8685l = i;
        this.f8686m = i2;
    }

    public void setLineWidth(float f) {
        float a = (float) C4569d.m19968a(getContext(), f);
        this.f8687n = a;
        this.f8681h.setStrokeWidth(a);
        invalidate();
    }

    public void setNum(int i) {
        this.f8680g = i;
        int[] iArr = new int[(i + 2)];
        this.f8688o = iArr;
        Arrays.fill(iArr, this.f8689p / 2);
        invalidate();
    }

    public void setValues(int[] iArr) {
        int i = 0;
        while (i < iArr.length) {
            int i2 = i + 1;
            int[] iArr2 = this.f8688o;
            if (i2 >= iArr2.length) {
                break;
            }
            iArr2[i2] = (iArr[i] * 100) + 1500;
            i = i2;
        }
        invalidate();
    }

    public BezierView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BezierView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f8680g = 10;
        this.f8689p = 3000;
        m11588c(context);
    }
}
