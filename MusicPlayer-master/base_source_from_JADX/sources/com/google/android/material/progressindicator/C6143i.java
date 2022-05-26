package com.google.android.material.progressindicator;

import android.animation.Animator;
import p082e.p154x.p155a.p156a.C4236b;

/* renamed from: com.google.android.material.progressindicator.i */
/* compiled from: IndeterminateAnimatorDelegate */
abstract class C6143i<T extends Animator> {

    /* renamed from: a */
    protected C6144j f28705a;

    /* renamed from: b */
    protected final float[] f28706b;

    /* renamed from: c */
    protected final int[] f28707c;

    protected C6143i(int i) {
        this.f28706b = new float[(i * 2)];
        this.f28707c = new int[i];
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo24455a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public float mo24508b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    /* renamed from: c */
    public abstract void mo24456c();

    /* renamed from: d */
    public abstract void mo24457d(C4236b bVar);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo24509e(C6144j jVar) {
        this.f28705a = jVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public abstract void mo24458f();

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public abstract void mo24459g();

    /* renamed from: h */
    public abstract void mo24460h();
}
