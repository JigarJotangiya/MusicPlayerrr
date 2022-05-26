package com.coocent.marquee;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.coocent.marquee.l */
/* compiled from: MarqueeService */
public interface C2294l extends IInterface {

    /* renamed from: com.coocent.marquee.l$a */
    /* compiled from: MarqueeService */
    public static abstract class C2295a extends Binder implements C2294l {
        public C2295a() {
            attachInterface(this, "com.coocent.marquee.MarqueeService");
        }

        public IBinder asBinder() {
            return this;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1598968902) {
                switch (i) {
                    case 1:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8912P6(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 2:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8911N5(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 3:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8916f4(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 4:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8914W2(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 5:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8910J4(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 6:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8918v4(parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 7:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8919w3(parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    case 8:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8915d4(parcel.readInt() != 0);
                        parcel2.writeNoException();
                        return true;
                    case 9:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8913R5(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                        parcel2.writeNoException();
                        return true;
                    case 10:
                        parcel.enforceInterface("com.coocent.marquee.MarqueeService");
                        mo8917j3(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
                        parcel2.writeNoException();
                        return true;
                    default:
                        return super.onTransact(i, parcel, parcel2, i2);
                }
            } else {
                parcel2.writeString("com.coocent.marquee.MarqueeService");
                return true;
            }
        }
    }

    /* renamed from: J4 */
    void mo8910J4(int i) throws RemoteException;

    /* renamed from: N5 */
    void mo8911N5(int i) throws RemoteException;

    /* renamed from: P6 */
    void mo8912P6(int i) throws RemoteException;

    /* renamed from: R5 */
    void mo8913R5(int i, int i2, int i3, int i4) throws RemoteException;

    /* renamed from: W2 */
    void mo8914W2(int i) throws RemoteException;

    /* renamed from: d4 */
    void mo8915d4(boolean z) throws RemoteException;

    /* renamed from: f4 */
    void mo8916f4(int i) throws RemoteException;

    /* renamed from: j3 */
    void mo8917j3(int i, int i2, int i3, int i4, int i5, int i6, String str) throws RemoteException;

    /* renamed from: v4 */
    void mo8918v4(int i) throws RemoteException;

    /* renamed from: w3 */
    void mo8919w3(String str) throws RemoteException;
}
