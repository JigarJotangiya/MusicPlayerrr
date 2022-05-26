package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.k */
/* compiled from: LinearDrawingDelegate */
final class C6145k extends C6142h<LinearProgressIndicatorSpec> {

    /* renamed from: c */
    private float f28710c = 300.0f;

    /* renamed from: d */
    private float f28711d;

    /* renamed from: e */
    private float f28712e;

    public C6145k(LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(linearProgressIndicatorSpec);
    }

    /* renamed from: h */
    private static void m36800h(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = f;
        float f5 = f2;
        canvas.save();
        float f6 = f3;
        canvas.translate(f3, 0.0f);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f7 = ((-f4) / 2.0f) + f5;
        float f8 = (f4 / 2.0f) - f5;
        Canvas canvas3 = canvas;
        Paint paint2 = paint;
        canvas3.drawRect(-f5, f7, 0.0f, f8, paint2);
        canvas.save();
        canvas.translate(0.0f, f7);
        RectF rectF2 = rectF;
        canvas3.drawArc(rectF2, 180.0f, 90.0f, true, paint2);
        canvas.restore();
        canvas.translate(0.0f, f8);
        canvas3.drawArc(rectF2, 180.0f, -90.0f, true, paint2);
        canvas.restore();
    }

    /* renamed from: a */
    public void mo24450a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.f28710c = (float) clipBounds.width();
        float f2 = (float) ((LinearProgressIndicatorSpec) this.f28703a).f28655a;
        canvas.translate(((float) clipBounds.left) + (((float) clipBounds.width()) / 2.0f), ((float) clipBounds.top) + (((float) clipBounds.height()) / 2.0f) + Math.max(0.0f, ((float) (clipBounds.height() - ((LinearProgressIndicatorSpec) this.f28703a).f28655a)) / 2.0f));
        if (((LinearProgressIndicatorSpec) this.f28703a).f28635i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.f28704b.mo24490j() && ((LinearProgressIndicatorSpec) this.f28703a).f28659e == 1) || (this.f28704b.mo24488i() && ((LinearProgressIndicatorSpec) this.f28703a).f28660f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.f28704b.mo24490j() || this.f28704b.mo24488i()) {
            canvas.translate(0.0f, (((float) ((LinearProgressIndicatorSpec) this.f28703a).f28655a) * (f - 1.0f)) / 2.0f);
        }
        float f3 = this.f28710c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.f28703a;
        this.f28711d = ((float) ((LinearProgressIndicatorSpec) s).f28655a) * f;
        this.f28712e = ((float) ((LinearProgressIndicatorSpec) s).f28656b) * f;
    }

    /* renamed from: b */
    public void mo24451b(Canvas canvas, Paint paint, float f, float f2, int i) {
        Paint paint2 = paint;
        if (f != f2) {
            float f3 = this.f28710c;
            float f4 = this.f28712e;
            float f5 = ((-f3) / 2.0f) + f4 + ((f3 - (f4 * 2.0f)) * f);
            float f6 = ((-f3) / 2.0f) + f4 + ((f3 - (f4 * 2.0f)) * f2);
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f7 = this.f28711d;
            canvas.drawRect(f5, (-f7) / 2.0f, f6, f7 / 2.0f, paint);
            float f8 = this.f28712e;
            RectF rectF = new RectF(-f8, -f8, f8, f8);
            Canvas canvas2 = canvas;
            Paint paint3 = paint;
            float f9 = f5;
            RectF rectF2 = rectF;
            m36800h(canvas2, paint3, this.f28711d, this.f28712e, f9, true, rectF2);
            m36800h(canvas2, paint3, this.f28711d, this.f28712e, f6, false, rectF2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo24452c(Canvas canvas, Paint paint) {
        int a = C7513a.m41977a(((LinearProgressIndicatorSpec) this.f28703a).f28658d, this.f28704b.getAlpha());
        float f = ((-this.f28710c) / 2.0f) + this.f28712e;
        float f2 = -f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(a);
        float f3 = this.f28711d;
        canvas.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
        float f4 = this.f28712e;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        m36800h(canvas, paint, this.f28711d, this.f28712e, f, true, rectF);
        m36800h(canvas, paint, this.f28711d, this.f28712e, f2, false, rectF);
    }

    /* renamed from: d */
    public int mo24453d() {
        return ((LinearProgressIndicatorSpec) this.f28703a).f28655a;
    }

    /* renamed from: e */
    public int mo24454e() {
        return -1;
    }
}
