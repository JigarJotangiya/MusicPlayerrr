package com.google.android.gms.ads.internal.util;

import com.google.android.gms.ads.internal.C2971s;

/* renamed from: com.google.android.gms.ads.internal.util.b1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2978b1 {

    /* renamed from: a */
    private long f9977a;

    /* renamed from: b */
    private long f9978b = Long.MIN_VALUE;

    /* renamed from: c */
    private final Object f9979c = new Object();

    public C2978b1(long j) {
        this.f9977a = j;
    }

    /* renamed from: a */
    public final void mo10974a(long j) {
        synchronized (this.f9979c) {
            this.f9977a = j;
        }
    }

    /* renamed from: b */
    public final boolean mo10975b() {
        synchronized (this.f9979c) {
            long b = C2971s.m13198a().mo11989b();
            if (this.f9978b + this.f9977a > b) {
                return false;
            }
            this.f9978b = b;
            return true;
        }
    }
}
