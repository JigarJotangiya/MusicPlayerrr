package p159f.p243f.p245b.p318c.p319a.p320a;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* renamed from: f.f.b.c.a.a.o0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7606o0 extends C7586e0 implements C7608p0 {
    public C7606o0() {
        super("com.google.android.play.core.assetpacks.protocol.IAssetModuleServiceCallback");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final boolean mo28589z(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 2:
                mo25321g6(parcel.readInt(), (Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
                return true;
            case 3:
                mo25320g0(parcel.readInt(), (Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
                return true;
            case 4:
                mo25314E6(parcel.readInt(), (Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
                return true;
            case 5:
                mo25319e1(parcel.createTypedArrayList(Bundle.CREATOR));
                return true;
            case 6:
                Parcelable.Creator creator = Bundle.CREATOR;
                mo25318c7((Bundle) C7588f0.m42343a(parcel, creator), (Bundle) C7588f0.m42343a(parcel, creator));
                return true;
            case 7:
                mo25322l0((Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
                return true;
            case 8:
                Parcelable.Creator creator2 = Bundle.CREATOR;
                mo25324q4((Bundle) C7588f0.m42343a(parcel, creator2), (Bundle) C7588f0.m42343a(parcel, creator2));
                return true;
            case 10:
                Parcelable.Creator creator3 = Bundle.CREATOR;
                mo25316W4((Bundle) C7588f0.m42343a(parcel, creator3), (Bundle) C7588f0.m42343a(parcel, creator3));
                return true;
            case 11:
                Parcelable.Creator creator4 = Bundle.CREATOR;
                mo25317W5((Bundle) C7588f0.m42343a(parcel, creator4), (Bundle) C7588f0.m42343a(parcel, creator4));
                return true;
            case 12:
                Parcelable.Creator creator5 = Bundle.CREATOR;
                mo25315R0((Bundle) C7588f0.m42343a(parcel, creator5), (Bundle) C7588f0.m42343a(parcel, creator5));
                return true;
            case 13:
                Parcelable.Creator creator6 = Bundle.CREATOR;
                mo25323q3((Bundle) C7588f0.m42343a(parcel, creator6), (Bundle) C7588f0.m42343a(parcel, creator6));
                return true;
            case 14:
                Parcelable.Creator creator7 = Bundle.CREATOR;
                mo25326z2((Bundle) C7588f0.m42343a(parcel, creator7), (Bundle) C7588f0.m42343a(parcel, creator7));
                return true;
            case 15:
                mo25325r0((Bundle) C7588f0.m42343a(parcel, Bundle.CREATOR));
                return true;
            default:
                return false;
        }
    }
}
