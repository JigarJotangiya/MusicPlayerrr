package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class mo3 extends dl3 {

    /* renamed from: g */
    final qo3 f20111g;

    /* renamed from: h */
    fl3 f20112h = m27372a();

    /* renamed from: i */
    final /* synthetic */ so3 f20113i;

    mo3(so3 so3) {
        this.f20113i = so3;
        this.f20111g = new qo3(so3, (po3) null);
    }

    /* renamed from: a */
    private final fl3 m27372a() {
        if (this.f20111g.hasNext()) {
            return this.f20111g.next().iterator();
        }
        return null;
    }

    public final boolean hasNext() {
        return this.f20112h != null;
    }

    public final byte zza() {
        fl3 fl3 = this.f20112h;
        if (fl3 != null) {
            byte zza = fl3.zza();
            if (!this.f20112h.hasNext()) {
                this.f20112h = m27372a();
            }
            return zza;
        }
        throw new NoSuchElementException();
    }
}
