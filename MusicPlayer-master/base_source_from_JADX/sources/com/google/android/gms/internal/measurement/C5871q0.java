package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.measurement.q0 */
/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public abstract class C5871q0 extends C5876u implements C5873r0 {
    public C5871q0() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo22718z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo22691z0((Bundle) C5853h0.m35032b(parcel, Bundle.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
