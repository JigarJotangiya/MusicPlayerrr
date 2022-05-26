package p159f.p243f.p245b.p246a.p293c.p297d;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.f.b.a.c.d.c */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C7447c {
    static {
        C7447c.class.getClassLoader();
    }

    private C7447c() {
    }

    /* renamed from: a */
    public static void m41837a(Parcel parcel, boolean z) {
        parcel.writeInt(z ? 1 : 0);
    }

    /* renamed from: b */
    public static <T extends Parcelable> T m41838b(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: c */
    public static void m41839c(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder((IBinder) null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
