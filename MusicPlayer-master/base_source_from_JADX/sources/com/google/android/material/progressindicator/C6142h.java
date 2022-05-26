package com.google.android.material.progressindicator;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.google.android.material.progressindicator.C6129c;

/* renamed from: com.google.android.material.progressindicator.h */
/* compiled from: DrawingDelegate */
abstract class C6142h<S extends C6129c> {

    /* renamed from: a */
    S f28703a;

    /* renamed from: b */
    protected C6138g f28704b;

    public C6142h(S s) {
        this.f28703a = s;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo24450a(Canvas canvas, float f);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo24451b(Canvas canvas, Paint paint, float f, float f2, int i);

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo24452c(Canvas canvas, Paint paint);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract int mo24453d();

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract int mo24454e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo24506f(C6138g gVar) {
        this.f28704b = gVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo24507g(Canvas canvas, float f) {
        this.f28703a.mo24406e();
        mo24450a(canvas, f);
    }
}
