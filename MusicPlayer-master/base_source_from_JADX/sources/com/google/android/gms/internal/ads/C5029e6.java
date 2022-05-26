package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.e6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5029e6 {

    /* renamed from: c */
    public static final boolean f15873c = C5066f6.f16447b;

    /* renamed from: a */
    private final List<C4992d6> f15874a = new ArrayList();

    /* renamed from: b */
    private boolean f15875b = false;

    C5029e6() {
    }

    /* renamed from: a */
    public final synchronized void mo17125a(String str, long j) {
        if (!this.f15875b) {
            this.f15874a.add(new C4992d6(str, j, SystemClock.elapsedRealtime()));
        } else {
            throw new IllegalStateException("Marker added to finished log");
        }
    }

    /* renamed from: b */
    public final synchronized void mo17126b(String str) {
        long j;
        this.f15875b = true;
        if (this.f15874a.size() == 0) {
            j = 0;
        } else {
            long j2 = this.f15874a.get(0).f15518c;
            List<C4992d6> list = this.f15874a;
            j = list.get(list.size() - 1).f15518c - j2;
        }
        if (j > 0) {
            long j3 = this.f15874a.get(0).f15518c;
            C5066f6.m23480a("(%-4d ms) %s", Long.valueOf(j), str);
            for (C4992d6 next : this.f15874a) {
                long j4 = next.f15518c;
                C5066f6.m23480a("(+%-4d) [%2d] %s", Long.valueOf(j4 - j3), Long.valueOf(next.f15517b), next.f15516a);
                j3 = j4;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        if (!this.f15875b) {
            mo17126b("Request on the loose");
            C5066f6.m23481b("Marker log finalized without finish() - uncaught exit point for request", new Object[0]);
        }
    }
}
