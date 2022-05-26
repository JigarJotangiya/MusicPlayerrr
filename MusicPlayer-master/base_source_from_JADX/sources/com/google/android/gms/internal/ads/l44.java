package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l44 implements Comparable<l44> {

    /* renamed from: g */
    private final boolean f19203g;

    /* renamed from: h */
    private final boolean f19204h;

    public l44(C5689w wVar, int i) {
        this.f19203g = 1 != (wVar.f25125d & 1) ? false : true;
        this.f19204h = v44.m32159m(i, false);
    }

    /* renamed from: c */
    public final int compareTo(l44 l44) {
        return v33.m32138i().mo20765d(this.f19204h, l44.f19204h).mo20765d(this.f19203g, l44.f19203g).mo20762a();
    }
}
