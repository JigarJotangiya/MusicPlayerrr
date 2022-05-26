package com.airbnb.lottie.p019v.p022l;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.airbnb.lottie.C1473f;
import com.airbnb.lottie.p015t.p016b.C1511d;
import com.airbnb.lottie.p019v.C1560e;
import com.airbnb.lottie.p019v.p021k.C1579a;
import com.airbnb.lottie.p019v.p021k.C1596o;
import com.airbnb.lottie.p024x.C1646j;
import java.util.Collections;
import java.util.List;

/* renamed from: com.airbnb.lottie.v.l.f */
/* compiled from: ShapeLayer */
public class C1614f extends C1604a {

    /* renamed from: B */
    private final C1511d f6190B;

    /* renamed from: C */
    private final C1607b f6191C;

    C1614f(C1473f fVar, C1610d dVar, C1607b bVar) {
        super(fVar, dVar);
        this.f6191C = bVar;
        C1511d dVar2 = new C1511d(fVar, this, new C1596o("__container", dVar.mo7386n(), false));
        this.f6190B = dVar2;
        dVar2.mo7133b(Collections.emptyList(), Collections.emptyList());
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public void mo7361G(C1560e eVar, int i, List<C1560e> list, C1560e eVar2) {
        this.f6190B.mo7134c(eVar, i, list, eVar2);
    }

    /* renamed from: d */
    public void mo7135d(RectF rectF, Matrix matrix, boolean z) {
        super.mo7135d(rectF, matrix, z);
        this.f6190B.mo7135d(rectF, this.f6136m, z);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo7367t(Canvas canvas, Matrix matrix, int i) {
        this.f6190B.mo7136f(canvas, matrix, i);
    }

    /* renamed from: v */
    public C1579a mo7368v() {
        C1579a v = super.mo7368v();
        if (v != null) {
            return v;
        }
        return this.f6191C.mo7368v();
    }

    /* renamed from: x */
    public C1646j mo7370x() {
        C1646j x = super.mo7370x();
        if (x != null) {
            return x;
        }
        return this.f6191C.mo7370x();
    }
}
