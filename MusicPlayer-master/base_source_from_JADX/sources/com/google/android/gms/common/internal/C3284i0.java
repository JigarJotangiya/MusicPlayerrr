package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p293c.p297d.C7446b;
import p159f.p243f.p245b.p246a.p293c.p297d.C7447c;

/* renamed from: com.google.android.gms.common.internal.i0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C3284i0 extends C7446b implements C3283i {
    public C3284i0() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo11853z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            mo11852z3(parcel.readInt(), parcel.readStrongBinder(), (Bundle) C7447c.m41838b(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            mo11851g0(parcel.readInt(), (Bundle) C7447c.m41838b(parcel, Bundle.CREATOR));
        } else if (i != 3) {
            return false;
        } else {
            mo11850D4(parcel.readInt(), parcel.readStrongBinder(), (zzi) C7447c.m41838b(parcel, zzi.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
