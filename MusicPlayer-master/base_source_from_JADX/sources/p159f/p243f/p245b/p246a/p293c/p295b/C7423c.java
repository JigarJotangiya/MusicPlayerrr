package p159f.p243f.p245b.p246a.p293c.p295b;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.f.b.a.c.b.c */
/* compiled from: com.google.android.gms:play-services-appset@@16.0.0 */
public final class C7423c {
    static {
        C7423c.class.getClassLoader();
    }

    private C7423c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m41799a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m41800b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m41801c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p246a.p293c.p295b.C7423c.m41801c(android.os.Parcel, android.os.IInterface):void");
    }
}
