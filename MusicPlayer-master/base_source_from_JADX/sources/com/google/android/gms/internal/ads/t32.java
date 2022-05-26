package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class t32 implements e41 {

    /* renamed from: a */
    public final /* synthetic */ n22 f23707a;

    public /* synthetic */ t32(n22 n22) {
        this.f23707a = n22;
    }

    public final C5427ox zza() {
        try {
            return ((bd0) this.f23707a.f20467b).zze();
        } catch (RemoteException e) {
            throw new zp2(e);
        }
    }
}
