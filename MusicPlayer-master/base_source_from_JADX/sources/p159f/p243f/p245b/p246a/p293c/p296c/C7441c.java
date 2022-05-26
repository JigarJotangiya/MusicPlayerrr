package p159f.p243f.p245b.p246a.p293c.p296c;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.f.b.a.c.c.c */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C7441c {
    static {
        C7441c.class.getClassLoader();
    }

    private C7441c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m41831a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m41832b(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* renamed from: c */
    public static void m41833c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
