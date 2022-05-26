package com.google.android.material.progressindicator;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import com.google.android.material.progressindicator.C6129c;
import p082e.p132l.p133a.C4084c;
import p082e.p132l.p133a.C4085d;
import p082e.p132l.p133a.C4086e;
import p159f.p243f.p245b.p304b.p307o.C7513a;

/* renamed from: com.google.android.material.progressindicator.f */
/* compiled from: DeterminateDrawable */
public final class C6136f<S extends C6129c> extends C6138g {

    /* renamed from: A */
    private static final C4084c<C6136f> f28680A = new C6137a("indicatorLevel");

    /* renamed from: v */
    private C6142h<S> f28681v;

    /* renamed from: w */
    private final C4086e f28682w;

    /* renamed from: x */
    private final C4085d f28683x;

    /* renamed from: y */
    private float f28684y;

    /* renamed from: z */
    private boolean f28685z = false;

    /* renamed from: com.google.android.material.progressindicator.f$a */
    /* compiled from: DeterminateDrawable */
    static class C6137a extends C4084c<C6136f> {
        C6137a(String str) {
            super(str);
        }

        /* renamed from: c */
        public float mo14129a(C6136f fVar) {
            return fVar.m36748x() * 10000.0f;
        }

        /* renamed from: d */
        public void mo14130b(C6136f fVar, float f) {
            fVar.m36749z(f / 10000.0f);
        }
    }

    C6136f(Context context, C6129c cVar, C6142h<S> hVar) {
        super(context, cVar);
        mo24481y(hVar);
        C4086e eVar = new C4086e();
        this.f28682w = eVar;
        eVar.mo14150d(1.0f);
        eVar.mo14152f(50.0f);
        C4085d dVar = new C4085d(this, f28680A);
        this.f28683x = dVar;
        dVar.mo14147p(eVar);
        mo24492m(1.0f);
    }

    /* renamed from: u */
    public static C6136f<CircularProgressIndicatorSpec> m36746u(Context context, CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return new C6136f<>(context, circularProgressIndicatorSpec, new C6130d(circularProgressIndicatorSpec));
    }

    /* renamed from: v */
    public static C6136f<LinearProgressIndicatorSpec> m36747v(Context context, LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return new C6136f<>(context, linearProgressIndicatorSpec, new C6145k(linearProgressIndicatorSpec));
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public float m36748x() {
        return this.f28684y;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public void m36749z(float f) {
        this.f28684y = f;
        invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public void mo24473A(float f) {
        setLevel((int) (f * 10000.0f));
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f28681v.mo24507g(canvas, mo24484g());
            this.f28681v.mo24452c(canvas, this.f28699s);
            Canvas canvas2 = canvas;
            this.f28681v.mo24451b(canvas2, this.f28699s, 0.0f, m36748x(), C7513a.m41977a(this.f28688h.f28657c[0], getAlpha()));
            canvas.restore();
        }
    }

    public int getIntrinsicHeight() {
        return this.f28681v.mo24453d();
    }

    public int getIntrinsicWidth() {
        return this.f28681v.mo24454e();
    }

    public void jumpToCurrentState() {
        this.f28683x.mo14122b();
        m36749z(((float) getLevel()) / 10000.0f);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f28685z) {
            this.f28683x.mo14122b();
            m36749z(((float) i) / 10000.0f);
            return true;
        }
        this.f28683x.mo14126i(m36748x() * 10000.0f);
        this.f28683x.mo14145m((float) i);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public boolean mo24479q(boolean z, boolean z2, boolean z3) {
        boolean q = super.mo24479q(z, z2, z3);
        float a = this.f28689i.mo24417a(this.f28687g.getContentResolver());
        if (a == 0.0f) {
            this.f28685z = true;
        } else {
            this.f28685z = false;
            this.f28682w.mo14152f(50.0f / a);
        }
        return q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public C6142h<S> mo24480w() {
        return this.f28681v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: y */
    public void mo24481y(C6142h<S> hVar) {
        this.f28681v = hVar;
        hVar.mo24506f(this);
    }
}
