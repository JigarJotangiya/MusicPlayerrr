package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d5 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4991d5 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ C5547s5 f15506g;

    /* renamed from: h */
    final /* synthetic */ C5028e5 f15507h;

    C4991d5(C5028e5 e5Var, C5547s5 s5Var) {
        this.f15507h = e5Var;
        this.f15506g = s5Var;
    }

    public final void run() {
        try {
            this.f15507h.f15861h.put(this.f15506g);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }
}
