package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.internal.ads.rd */
/* compiled from: com.google.android.gms:play-services-ads-base@@20.6.0 */
public final class C5518rd {

    /* renamed from: a */
    private static final ClassLoader f22821a = C5518rd.class.getClassLoader();

    private C5518rd() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m30059a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static ArrayList m30060b(Parcel parcel) {
        return parcel.readArrayList(f22821a);
    }

    /* renamed from: c */
    public static void m30061c(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: d */
    public static void m30062d(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: e */
    public static void m30063e(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 1);
    }

    /* renamed from: f */
    public static void m30064f(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }

    /* renamed from: g */
    public static boolean m30065g(Parcel parcel) {
        return parcel.readInt() != 0;
    }
}
