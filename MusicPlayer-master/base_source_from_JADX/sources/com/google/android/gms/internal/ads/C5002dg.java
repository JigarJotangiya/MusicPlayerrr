package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.dg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C5002dg {

    /* renamed from: a */
    private int f15604a;

    /* renamed from: a */
    public final void mo16918a(int i) {
        this.f15604a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo16919b() {
        this.f15604a = 0;
    }

    /* renamed from: c */
    public final void mo16920c(int i) {
        this.f15604a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo16921d(int i) {
        return (this.f15604a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo16922e() {
        return mo16921d(Integer.MIN_VALUE);
    }

    /* renamed from: f */
    public final boolean mo16923f() {
        return mo16921d(4);
    }

    /* renamed from: g */
    public final boolean mo16924g() {
        return mo16921d(1);
    }
}
