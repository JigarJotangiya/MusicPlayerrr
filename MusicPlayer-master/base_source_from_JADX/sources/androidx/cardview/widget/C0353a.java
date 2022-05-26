package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.C0361g;

/* renamed from: androidx.cardview.widget.a */
/* compiled from: CardViewApi17Impl */
class C0353a extends C0356c {

    /* renamed from: androidx.cardview.widget.a$a */
    /* compiled from: CardViewApi17Impl */
    class C0354a implements C0361g.C0362a {
        C0354a(C0353a aVar) {
        }

        /* renamed from: a */
        public void mo2315a(Canvas canvas, RectF rectF, float f, Paint paint) {
            canvas.drawRoundRect(rectF, f, f, paint);
        }
    }

    C0353a() {
    }

    /* renamed from: j */
    public void mo2314j() {
        C0361g.f1538r = new C0354a(this);
    }
}
