package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class dx0 {

    /* renamed from: a */
    private int f15766a;

    /* renamed from: a */
    public final void mo17028a(int i) {
        this.f15766a |= Integer.MIN_VALUE;
    }

    /* renamed from: b */
    public void mo16814b() {
        this.f15766a = 0;
    }

    /* renamed from: c */
    public final void mo17029c(int i) {
        this.f15766a = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo17030d(int i) {
        return (this.f15766a & i) == i;
    }

    /* renamed from: e */
    public final boolean mo17031e() {
        return mo17030d(268435456);
    }

    /* renamed from: f */
    public final boolean mo17032f() {
        return mo17030d(Integer.MIN_VALUE);
    }

    /* renamed from: g */
    public final boolean mo17033g() {
        return mo17030d(4);
    }

    /* renamed from: h */
    public final boolean mo17034h() {
        return mo17030d(1);
    }
}
