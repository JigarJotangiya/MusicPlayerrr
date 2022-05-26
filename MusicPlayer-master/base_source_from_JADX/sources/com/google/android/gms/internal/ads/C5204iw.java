package com.google.android.gms.internal.ads;

import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* renamed from: com.google.android.gms.internal.ads.iw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5204iw extends C5481qd implements C5241jw {
    public C5204iw() {
        super("com.google.android.gms.ads.internal.client.IClientApi");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                C5833zv E5 = mo10816E5(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), (zzbfi) C5518rd.m30059a(parcel, zzbfi.CREATOR), parcel.readString(), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, E5);
                return true;
            case 2:
                C5833zv a5 = mo10822a5(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), (zzbfi) C5518rd.m30059a(parcel, zzbfi.CREATOR), parcel.readString(), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, a5);
                return true;
            case 3:
                C5684vv i22 = mo10823i2(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readString(), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, i22);
                return true;
            case 4:
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, (IInterface) null);
                return true;
            case 5:
                u20 x0 = mo10826x0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, x0);
                return true;
            case 6:
                ih0 D6 = mo10815D6(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, D6);
                return true;
            case 7:
                C4863a.C4864a.m20501C0(parcel.readStrongBinder());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, (IInterface) null);
                return true;
            case 8:
                xe0 a0 = mo10821a0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, a0);
                return true;
            case 9:
                C5537rw q0 = mo10824q0(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, q0);
                return true;
            case 10:
                C5833zv Y1 = mo10820Y1(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), (zzbfi) C5518rd.m30059a(parcel, zzbfi.CREATOR), parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, Y1);
                return true;
            case 11:
                z20 u6 = mo10825u6(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), C4863a.C4864a.m20501C0(parcel.readStrongBinder()), C4863a.C4864a.m20501C0(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, u6);
                return true;
            case 12:
                wh0 V6 = mo10819V6(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), parcel.readString(), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, V6);
                return true;
            case 13:
                C5833zv C6 = mo10814C6(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), (zzbfi) C5518rd.m30059a(parcel, zzbfi.CREATOR), parcel.readString(), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, C6);
                return true;
            case 14:
                ok0 L4 = mo10817L4(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, L4);
                return true;
            case 15:
                le0 U1 = mo10818U1(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt());
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, U1);
                return true;
            case 16:
                u60 C2 = mo10813C2(C4863a.C4864a.m20501C0(parcel.readStrongBinder()), bb0.m21200e7(parcel.readStrongBinder()), parcel.readInt(), r60.m29881e7(parcel.readStrongBinder()));
                parcel2.writeNoException();
                C5518rd.m30064f(parcel2, C2);
                return true;
            default:
                return false;
        }
    }
}
