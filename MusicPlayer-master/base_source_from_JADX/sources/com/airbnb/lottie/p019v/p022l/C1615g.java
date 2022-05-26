package com.airbnb.lottie.p019v.p022l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.C1493k;
import com.airbnb.lottie.p015t.C1505a;
import com.airbnb.lottie.p015t.p017c.C1529a;
import com.airbnb.lottie.p015t.p017c.C1552q;
import com.airbnb.lottie.p027z.C1690c;

/* renamed from: com.airbnb.lottie.v.l.g */
/* compiled from: SolidLayer */
public class C1615g extends C1604a {

    /* renamed from: B */
    private final RectF f6192B = new RectF();

    /* renamed from: C */
    private final Paint f6193C;

    /* renamed from: D */
    private final float[] f6194D;

    /* renamed from: E */
    private final Path f6195E;

    /* renamed from: F */
    private final C1610d f6196F;

    /* renamed from: G */
    private C1529a<ColorFilter, ColorFilter> f6197G;

    C1615g(C1473f fVar, C1610d dVar) {
        super(fVar, dVar);
        C1505a aVar = new C1505a();
        this.f6193C = aVar;
        this.f6194D = new float[8];
        this.f6195E = new Path();
        this.f6196F = dVar;
        aVar.setAlpha(0);
        aVar.setStyle(Paint.Style.FILL);
        aVar.setColor(dVar.mo7387o());
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        super.mo7135d(rectF, matrix, z);
        this.f6192B.set(0.0f, 0.0f, (float) this.f6196F.mo7389q(), (float) this.f6196F.mo7388p());
        this.f6136m.mapRect(this.f6192B);
        rectF.set(this.f6192B);
    }

    /* renamed from: g */
    public <T> void mo7137g(T t, C1690c<T> cVar) {
        super.mo7137g(t, cVar);
        if (t != C1493k.f5721K) {
            return;
        }
        if (cVar == null) {
            this.f6197G = null;
        } else {
            this.f6197G = new C1552q(cVar);
        }
    }

    /* renamed from: t */
    public void mo7367t(Canvas canvas, Matrix matrix, int i) {
        int alpha = Color.alpha(this.f6196F.mo7387o());
        if (alpha != 0) {
            int intValue = (int) ((((float) i) / 255.0f) * (((((float) alpha) / 255.0f) * ((float) (this.f6145v.mo7208h() == null ? 100 : this.f6145v.mo7208h().mo7157h().intValue()))) / 100.0f) * 255.0f);
            this.f6193C.setAlpha(intValue);
            C1529a<ColorFilter, ColorFilter> aVar = this.f6197G;
            if (aVar != null) {
                this.f6193C.setColorFilter(aVar.mo7157h());
            }
            if (intValue > 0) {
                float[] fArr = this.f6194D;
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                fArr[2] = (float) this.f6196F.mo7389q();
                float[] fArr2 = this.f6194D;
                fArr2[3] = 0.0f;
                fArr2[4] = (float) this.f6196F.mo7389q();
                this.f6194D[5] = (float) this.f6196F.mo7388p();
                float[] fArr3 = this.f6194D;
                fArr3[6] = 0.0f;
                fArr3[7] = (float) this.f6196F.mo7388p();
                matrix.mapPoints(this.f6194D);
                this.f6195E.reset();
                Path path = this.f6195E;
                float[] fArr4 = this.f6194D;
                path.moveTo(fArr4[0], fArr4[1]);
                Path path2 = this.f6195E;
                float[] fArr5 = this.f6194D;
                path2.lineTo(fArr5[2], fArr5[3]);
                Path path3 = this.f6195E;
                float[] fArr6 = this.f6194D;
                path3.lineTo(fArr6[4], fArr6[5]);
                Path path4 = this.f6195E;
                float[] fArr7 = this.f6194D;
                path4.lineTo(fArr7[6], fArr7[7]);
                Path path5 = this.f6195E;
                float[] fArr8 = this.f6194D;
                path5.lineTo(fArr8[0], fArr8[1]);
                this.f6195E.close();
                canvas.drawPath(this.f6195E, this.f6193C);
            }
        }
    }
}
