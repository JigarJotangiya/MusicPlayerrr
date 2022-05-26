package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: f.f.b.c.a.a.f0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7588f0 {
    static {
        C7588f0.class.getClassLoader();
    }

    private C7588f0() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m42343a(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: b */
    public static void m42344b(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.os.IInterface, android.os.IBinder] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void m42345c(android.os.Parcel r0, android.os.IInterface r1) {
        /*
            r0.writeStrongBinder(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p243f.p245b.p318c.p319a.p320a.C7588f0.m42345c(android.os.Parcel, android.os.IInterface):void");
    }
}
