package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C5481qd;
import com.google.android.gms.internal.ads.C5518rd;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.ads.internal.util.t0 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C3038t0 extends C5481qd implements C3041u0 {
    public C3038t0() {
        super("com.google.android.gms.ads.internal.util.IWorkManagerUtil");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            boolean zzf = zzf(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
            parcel2.writeNoException();
            C5518rd.m30061c(parcel2, zzf);
        } else if (i != 2) {
            return false;
        } else {
            zze(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
            parcel2.writeNoException();
        }
        return true;
    }
}
