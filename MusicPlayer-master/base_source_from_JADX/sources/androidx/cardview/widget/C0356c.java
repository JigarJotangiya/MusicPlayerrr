package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import androidx.cardview.widget.C0361g;

/* renamed from: androidx.cardview.widget.c */
/* compiled from: CardViewBaseImpl */
class C0356c implements C0359e {

    /* renamed from: a */
    final RectF f1524a = new RectF();

    /* renamed from: androidx.cardview.widget.c$a */
    /* compiled from: CardViewBaseImpl */
    class C0357a implements C0361g.C0362a {
        C0357a() {
        }

        /* renamed from: a */
        public void mo2315a(Canvas canvas, RectF rectF, float f, Paint paint) {
            Canvas canvas2 = canvas;
            RectF rectF2 = rectF;
            float f2 = 2.0f * f;
            float width = (rectF.width() - f2) - 1.0f;
            float height = (rectF.height() - f2) - 1.0f;
            if (f >= 1.0f) {
                float f3 = f + 0.5f;
                float f4 = -f3;
                C0356c.this.f1524a.set(f4, f4, f3, f3);
                int save = canvas.save();
                canvas2.translate(rectF2.left + f3, rectF2.top + f3);
                Paint paint2 = paint;
                canvas.drawArc(C0356c.this.f1524a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0356c.this.f1524a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(height, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0356c.this.f1524a, 180.0f, 90.0f, true, paint2);
                canvas2.translate(width, 0.0f);
                canvas2.rotate(90.0f);
                canvas.drawArc(C0356c.this.f1524a, 180.0f, 90.0f, true, paint2);
                canvas2.restoreToCount(save);
                float f5 = rectF2.top;
                canvas.drawRect((rectF2.left + f3) - 1.0f, f5, (rectF2.right - f3) + 1.0f, f5 + f3, paint2);
                float f6 = rectF2.bottom;
                Canvas canvas3 = canvas;
                canvas3.drawRect((rectF2.left + f3) - 1.0f, f6 - f3, (rectF2.right - f3) + 1.0f, f6, paint2);
            }
            canvas.drawRect(rectF2.left, rectF2.top + f, rectF2.right, rectF2.bottom - f, paint);
        }
    }

    C0356c() {
    }

    /* renamed from: p */
    private C0361g m1995p(Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        return new C0361g(context.getResources(), colorStateList, f, f2, f3);
    }

    /* renamed from: q */
    private C0361g m1996q(C0358d dVar) {
        return (C0361g) dVar.mo2312f();
    }

    /* renamed from: a */
    public void mo2316a(C0358d dVar, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        C0361g p = m1995p(context, colorStateList, f, f2, f3);
        p.mo2357m(dVar.mo2310d());
        dVar.mo2309c(p);
        mo2324i(dVar);
    }

    /* renamed from: b */
    public void mo2317b(C0358d dVar, float f) {
        m1996q(dVar).mo2361p(f);
        mo2324i(dVar);
    }

    /* renamed from: c */
    public float mo2318c(C0358d dVar) {
        return m1996q(dVar).mo2356l();
    }

    /* renamed from: d */
    public float mo2319d(C0358d dVar) {
        return m1996q(dVar).mo2348g();
    }

    /* renamed from: e */
    public void mo2320e(C0358d dVar) {
    }

    /* renamed from: f */
    public void mo2321f(C0358d dVar, float f) {
        m1996q(dVar).mo2363r(f);
    }

    /* renamed from: g */
    public float mo2322g(C0358d dVar) {
        return m1996q(dVar).mo2352i();
    }

    /* renamed from: h */
    public ColorStateList mo2323h(C0358d dVar) {
        return m1996q(dVar).mo2347f();
    }

    /* renamed from: i */
    public void mo2324i(C0358d dVar) {
        Rect rect = new Rect();
        m1996q(dVar).mo2351h(rect);
        dVar.mo2308b((int) Math.ceil((double) mo2326l(dVar)), (int) Math.ceil((double) mo2325k(dVar)));
        dVar.mo2307a(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* renamed from: j */
    public void mo2314j() {
        C0361g.f1538r = new C0357a();
    }

    /* renamed from: k */
    public float mo2325k(C0358d dVar) {
        return m1996q(dVar).mo2354j();
    }

    /* renamed from: l */
    public float mo2326l(C0358d dVar) {
        return m1996q(dVar).mo2355k();
    }

    /* renamed from: m */
    public void mo2327m(C0358d dVar) {
        m1996q(dVar).mo2357m(dVar.mo2310d());
        mo2324i(dVar);
    }

    /* renamed from: n */
    public void mo2328n(C0358d dVar, ColorStateList colorStateList) {
        m1996q(dVar).mo2358o(colorStateList);
    }

    /* renamed from: o */
    public void mo2329o(C0358d dVar, float f) {
        m1996q(dVar).mo2362q(f);
        mo2324i(dVar);
    }
}
