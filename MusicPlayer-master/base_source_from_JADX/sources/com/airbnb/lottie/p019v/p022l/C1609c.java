package com.airbnb.lottie.p019v.p022l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p026y.C1683h;
import com.airbnb.lottie.p027z.C1690c;

/* renamed from: com.airbnb.lottie.v.l.c */
/* compiled from: ImageLayer */
public class C1609c extends C1604a {

    /* renamed from: B */
    private final Paint f6159B = new C1505a(3);

    /* renamed from: C */
    private final Rect f6160C = new Rect();

    /* renamed from: D */
    private final Rect f6161D = new Rect();

    /* renamed from: E */
    private C1529a<ColorFilter, ColorFilter> f6162E;

    /* renamed from: F */
    private C1529a<Bitmap, Bitmap> f6163F;

    C1609c(C1473f fVar, C1610d dVar) {
        super(fVar, dVar);
    }

    /* renamed from: N */
    private Bitmap m8179N() {
        Bitmap h;
        C1529a<Bitmap, Bitmap> aVar = this.f6163F;
        if (aVar != null && (h = aVar.mo7157h()) != null) {
            return h;
        }
        return this.f6137n.mo7099u(this.f6138o.mo7385m());
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        super.mo7135d(rectF, matrix, z);
        Bitmap N = m8179N();
        if (N != null) {
            rectF.set(0.0f, 0.0f, ((float) N.getWidth()) * C1683h.m8459e(), ((float) N.getHeight()) * C1683h.m8459e());
            this.f6136m.mapRect(rectF);
        }
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        super.mo7137g(t, cVar);
        if (t == C1493k.f5721K) {
            if (cVar == null) {
                this.f6162E = null;
            } else {
                this.f6162E = new C1552q(cVar);
            }
        } else if (t != C1493k.f5724N) {
        } else {
            if (cVar == null) {
                this.f6163F = null;
            } else {
                this.f6163F = new C1552q(cVar);
            }
        }
    }

    /* renamed from: t */
    public void mo7367t(Canvas canvas, Matrix matrix, int i) {
        Bitmap N = m8179N();
        if (N != null && !N.isRecycled()) {
            float e = C1683h.m8459e();
            this.f6159B.setAlpha(i);
            C1529a<ColorFilter, ColorFilter> aVar = this.f6162E;
            if (aVar != null) {
                this.f6159B.setColorFilter(aVar.mo7157h());
            }
            canvas.save();
            canvas.concat(matrix);
            this.f6160C.set(0, 0, N.getWidth(), N.getHeight());
            this.f6161D.set(0, 0, (int) (((float) N.getWidth()) * e), (int) (((float) N.getHeight()) * e));
            canvas.drawBitmap(N, this.f6160C, this.f6161D, this.f6159B);
            canvas.restore();
        }
    }
}
