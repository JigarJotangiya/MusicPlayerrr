package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import com.google.android.material.progressindicator.C6129c;

/* renamed from: com.google.android.material.progressindicator.j */
/* compiled from: IndeterminateDrawable */
public final class C6144j<S extends C6129c> extends C6138g {

    /* renamed from: v */
    private C6142h<S> f28708v;

    /* renamed from: w */
    private C6143i<ObjectAnimator> f28709w;

    C6144j(Context context, C6129c cVar, C6142h<S> hVar, C6143i<ObjectAnimator> iVar) {
        super(context, cVar);
        mo24516x(hVar);
        mo24515w(iVar);
    }

    /* renamed from: s */
    public static C6144j<CircularProgressIndicatorSpec> m36793s(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C6144j<>(context, circularProgressIndicatorSpec, new C6130d(circularProgressIndicatorSpec), new C6131e(circularProgressIndicatorSpec));
    }

    /* renamed from: t */
    public static C6144j<LinearProgressIndicatorSpec> m36794t(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new C6144j<>(context, linearProgressIndicatorSpec, new C6145k(linearProgressIndicatorSpec), linearProgressIndicatorSpec.f28633g == 0 ? new C6146l(linearProgressIndicatorSpec) : new C6149m(context, linearProgressIndicatorSpec));
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f28708v.mo24507g(canvas, mo24484g());
            this.f28708v.mo24452c(canvas, this.f28699s);
            int i = 0;
            while (true) {
                C6143i<ObjectAnimator> iVar = this.f28709w;
                int[] iArr = iVar.f28707c;
                if (i < iArr.length) {
                    C6142h<S> hVar = this.f28708v;
                    Paint paint = this.f28699s;
                    float[] fArr = iVar.f28706b;
                    int i2 = i * 2;
                    hVar.mo24451b(canvas, paint, fArr[i2], fArr[i2 + 1], iArr[i]);
                    i++;
                } else {
                    canvas.restore();
                    return;
                }
            }
        }
    }

    public int getIntrinsicHeight() {
        return this.f28708v.mo24453d();
    }

    public int getIntrinsicWidth() {
        return this.f28708v.mo24454e();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo24479q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo24479q(z, z2, z3);
        if (!isRunning()) {
            this.f28709w.mo24455a();
        }
        float a = this.f28689i.mo24417a(this.f28687g.getContentResolver());
        if (z && (z3 || (Build.VERSION.SDK_INT <= 21 && a > 0.0f))) {
            this.f28709w.mo24459g();
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public C6143i<ObjectAnimator> mo24513u() {
        return this.f28709w;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public C6142h<S> mo24514v() {
        return this.f28708v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public void mo24515w(C6143i<ObjectAnimator> iVar) {
        this.f28709w = iVar;
        iVar.mo24509e(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: x */
    public void mo24516x(C6142h<S> hVar) {
        this.f28708v = hVar;
        hVar.mo24506f(this);
    }
}
