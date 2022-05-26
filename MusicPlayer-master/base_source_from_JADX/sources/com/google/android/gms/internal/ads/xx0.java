package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class xx0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ yx0 f26117g;

    /* renamed from: h */
    public final /* synthetic */ Runnable f26118h;

    public /* synthetic */ xx0(yx0 yx0, Runnable runnable) {
        this.f26117g = yx0;
        this.f26118h = runnable;
    }

    public final void run() {
        hm0.f17712e.execute(new wx0(this.f26117g, this.f26118h));
    }
}
