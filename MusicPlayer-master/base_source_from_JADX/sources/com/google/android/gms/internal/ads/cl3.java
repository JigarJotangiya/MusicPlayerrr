package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cl3 extends dl3 {

    /* renamed from: g */
    private int f15022g = 0;

    /* renamed from: h */
    private final int f15023h;

    /* renamed from: i */
    final /* synthetic */ kl3 f15024i;

    cl3(kl3 kl3) {
        this.f15024i = kl3;
        this.f15023h = kl3.zzd();
    }

    public final boolean hasNext() {
        return this.f15022g < this.f15023h;
    }

    public final byte zza() {
        int i = this.f15022g;
        if (i < this.f15023h) {
            this.f15022g = i + 1;
            return this.f15024i.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
