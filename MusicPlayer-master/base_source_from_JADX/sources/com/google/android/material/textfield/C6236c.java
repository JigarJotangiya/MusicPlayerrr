package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import p159f.p243f.p245b.p304b.p315w.C7541h;
import p159f.p243f.p245b.p304b.p315w.C7549m;

/* renamed from: com.google.android.material.textfield.c */
/* compiled from: CutoutDrawable */
class C6236c extends C7541h {

    /* renamed from: E */
    private final Paint f29112E;

    /* renamed from: F */
    private final RectF f29113F;

    /* renamed from: G */
    private int f29114G;

    C6236c() {
        this((C7549m) null);
    }

    /* renamed from: r0 */
    private void m37275r0(Canvas canvas) {
        if (!m37279y0(getCallback())) {
            canvas.restoreToCount(this.f29114G);
        }
    }

    /* renamed from: s0 */
    private void m37276s0(Canvas canvas) {
        Drawable.Callback callback = getCallback();
        if (m37279y0(callback)) {
            View view = (View) callback;
            if (view.getLayerType() != 2) {
                view.setLayerType(2, (Paint) null);
                return;
            }
            return;
        }
        m37277u0(canvas);
    }

    /* renamed from: u0 */
    private void m37277u0(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f29114G = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null);
            return;
        }
        this.f29114G = canvas.saveLayer(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight(), (Paint) null, 31);
    }

    /* renamed from: x0 */
    private void m37278x0() {
        this.f29112E.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f29112E.setColor(-1);
        this.f29112E.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    /* renamed from: y0 */
    private boolean m37279y0(Drawable.Callback callback) {
        return callback instanceof View;
    }

    public void draw(Canvas canvas) {
        m37276s0(canvas);
        super.draw(canvas);
        canvas.drawRect(this.f29113F, this.f29112E);
        m37275r0(canvas);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean mo25039q0() {
        return !this.f29113F.isEmpty();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t0 */
    public void mo25040t0() {
        mo25041v0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v0 */
    public void mo25041v0(float f, float f2, float f3, float f4) {
        RectF rectF = this.f29113F;
        if (f != rectF.left || f2 != rectF.top || f3 != rectF.right || f4 != rectF.bottom) {
            rectF.set(f, f2, f3, f4);
            invalidateSelf();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void mo25042w0(RectF rectF) {
        mo25041v0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C6236c(C7549m mVar) {
        super(mVar == null ? new C7549m() : mVar);
        this.f29112E = new Paint(1);
        m37278x0();
        this.f29113F = new RectF();
    }
}
