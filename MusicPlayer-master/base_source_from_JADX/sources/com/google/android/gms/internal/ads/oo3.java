package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class oo3 {

    /* renamed from: a */
    private final ArrayDeque<kl3> f21105a = new ArrayDeque<>();

    /* synthetic */ oo3(no3 no3) {
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ kl3 m28633a(oo3 oo3, kl3 kl3, kl3 kl32) {
        oo3.m28634b(kl3);
        oo3.m28634b(kl32);
        kl3 pop = oo3.f21105a.pop();
        while (!oo3.f21105a.isEmpty()) {
            pop = new so3(oo3.f21105a.pop(), pop);
        }
        return pop;
    }

    /* renamed from: b */
    private final void m28634b(kl3 kl3) {
        if (kl3.zzh()) {
            int c = m28635c(kl3.zzd());
            int zzc = so3.zzc(c + 1);
            if (this.f21105a.isEmpty() || this.f21105a.peek().zzd() >= zzc) {
                this.f21105a.push(kl3);
                return;
            }
            int zzc2 = so3.zzc(c);
            kl3 pop = this.f21105a.pop();
            while (!this.f21105a.isEmpty() && this.f21105a.peek().zzd() < zzc2) {
                pop = new so3(this.f21105a.pop(), pop);
            }
            so3 so3 = new so3(pop, kl3);
            while (!this.f21105a.isEmpty() && this.f21105a.peek().zzd() < so3.zzc(m28635c(so3.zzd()) + 1)) {
                so3 = new so3(this.f21105a.pop(), so3);
            }
            this.f21105a.push(so3);
        } else if (kl3 instanceof so3) {
            so3 so32 = (so3) kl3;
            m28634b(so32.zzd);
            m28634b(so32.zze);
        } else {
            String valueOf = String.valueOf(kl3.getClass());
            String.valueOf(valueOf).length();
            throw new IllegalArgumentException("Has a new type of ByteString been created? Found ".concat(String.valueOf(valueOf)));
        }
    }

    /* renamed from: c */
    private static final int m28635c(int i) {
        int binarySearch = Arrays.binarySearch(so3.zza, i);
        return binarySearch < 0 ? (-(binarySearch + 1)) - 1 : binarySearch;
    }
}
