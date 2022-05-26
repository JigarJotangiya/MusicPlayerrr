package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p293c.p297d.C7446b;
import p159f.p243f.p245b.p246a.p293c.p297d.C7447c;

/* renamed from: com.google.android.gms.common.internal.i1 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C3285i1 extends C7446b implements C3288j1 {
    public C3285i1() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    /* renamed from: C0 */
    public static C3288j1 m14222C0(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        if (queryLocalInterface instanceof C3288j1) {
            return (C3288j1) queryLocalInterface;
        }
        return new C3282h1(iBinder);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo11853z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            C4863a f = mo11848f();
            parcel2.writeNoException();
            C7447c.m41839c(parcel2, f);
        } else if (i != 2) {
            return false;
        } else {
            int zze = zze();
            parcel2.writeNoException();
            parcel2.writeInt(zze);
        }
        return true;
    }
}
