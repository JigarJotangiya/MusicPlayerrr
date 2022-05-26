package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.d */
/* compiled from: CircularDrawingDelegate */
final class C6130d extends C6142h<CircularProgressIndicatorSpec> {

    /* renamed from: c */
    private int f28661c = 1;

    /* renamed from: d */
    private float f28662d;

    /* renamed from: e */
    private float f28663e;

    /* renamed from: f */
    private float f28664f;

    public C6130d(CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(circularProgressIndicatorSpec);
    }

    /* renamed from: h */
    private void m36713h(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f3);
        float f5 = f / 2.0f;
        float f6 = f4 * f2;
        Paint paint2 = paint;
        canvas.drawRect((this.f28664f - f5) + f2, Math.min(0.0f, ((float) this.f28661c) * f6), (this.f28664f + f5) - f2, Math.max(0.0f, f6 * ((float) this.f28661c)), paint2);
        canvas.translate((this.f28664f - f5) + f2, 0.0f);
        RectF rectF2 = rectF;
        canvas.drawArc(rectF2, 180.0f, (-f4) * 90.0f * ((float) this.f28661c), true, paint2);
        canvas.translate(f - (f2 * 2.0f), 0.0f);
        canvas.drawArc(rectF2, 0.0f, f4 * 90.0f * ((float) this.f28661c), true, paint2);
        canvas.restore();
    }

    /* renamed from: i */
    private int m36714i() {
        S s = this.f28703a;
        return ((CircularProgressIndicatorSpec) s).f28629g + (((CircularProgressIndicatorSpec) s).f28630h * 2);
    }

    /* renamed from: a */
    public void mo24450a(Canvas canvas, float f) {
        S s = this.f28703a;
        float f2 = (((float) ((CircularProgressIndicatorSpec) s).f28629g) / 2.0f) + ((float) ((CircularProgressIndicatorSpec) s).f28630h);
        canvas.translate(f2, f2);
        canvas.rotate(-90.0f);
        float f3 = -f2;
        canvas.clipRect(f3, f3, f2, f2);
        S s2 = this.f28703a;
        this.f28661c = ((CircularProgressIndicatorSpec) s2).f28631i == 0 ? 1 : -1;
        this.f28662d = ((float) ((CircularProgressIndicatorSpec) s2).f28655a) * f;
        this.f28663e = ((float) ((CircularProgressIndicatorSpec) s2).f28656b) * f;
        this.f28664f = ((float) (((CircularProgressIndicatorSpec) s2).f28629g - ((CircularProgressIndicatorSpec) s2).f28655a)) / 2.0f;
        if ((this.f28704b.mo24490j() && ((CircularProgressIndicatorSpec) this.f28703a).f28659e == 2) || (this.f28704b.mo24488i() && ((CircularProgressIndicatorSpec) this.f28703a).f28660f == 1)) {
            this.f28664f += ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f28703a).f28655a)) / 2.0f;
        } else if ((this.f28704b.mo24490j() && ((CircularProgressIndicatorSpec) this.f28703a).f28659e == 1) || (this.f28704b.mo24488i() && ((CircularProgressIndicatorSpec) this.f28703a).f28660f == 2)) {
            this.f28664f -= ((1.0f - f) * ((float) ((CircularProgressIndicatorSpec) this.f28703a).f28655a)) / 2.0f;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24451b(Canvas canvas, Paint paint, float f, float f2, int i) {
        Paint paint2 = paint;
        if (f != f2) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.f28662d);
            int i2 = this.f28661c;
            float f3 = f * 360.0f * ((float) i2);
            float f4 = (f2 >= f ? f2 - f : (f2 + 1.0f) - f) * 360.0f * ((float) i2);
            float f5 = this.f28664f;
            canvas.drawArc(new RectF(-f5, -f5, f5, f5), f3, f4, false, paint);
            if (this.f28663e > 0.0f && Math.abs(f4) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f6 = this.f28663e;
                RectF rectF = new RectF(-f6, -f6, f6, f6);
                Canvas canvas2 = canvas;
                Paint paint3 = paint;
                RectF rectF2 = rectF;
                m36713h(canvas2, paint3, this.f28662d, this.f28663e, f3, true, rectF2);
                m36713h(canvas2, paint3, this.f28662d, this.f28663e, f3 + f4, false, rectF2);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24452c(Canvas canvas, Paint paint) {
        int a = C7513a.m41977a(((CircularProgressIndicatorSpec) this.f28703a).f28658d, this.f28704b.getAlpha());
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(a);
        paint.setStrokeWidth(this.f28662d);
        float f = this.f28664f;
        canvas.drawArc(new RectF(-f, -f, f, f), 0.0f, 360.0f, false, paint);
    }

    /* renamed from: d */
    public int mo24453d() {
        return m36714i();
    }

    /* renamed from: e */
    public int mo24454e() {
        return m36714i();
    }
}
