package android.support.p001v4.media.session;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.session.ParcelableVolumeInfo */
public class ParcelableVolumeInfo implements Parcelable {
    public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new C0062a();

    /* renamed from: g */
    public int f162g;

    /* renamed from: h */
    public int f163h;

    /* renamed from: i */
    public int f164i;

    /* renamed from: j */
    public int f165j;

    /* renamed from: k */
    public int f166k;

    /* renamed from: android.support.v4.media.session.ParcelableVolumeInfo$a */
    class C0062a implements Parcelable.Creator<ParcelableVolumeInfo> {
        C0062a() {
        }

        /* renamed from: a */
        public ParcelableVolumeInfo createFromParcel(Parcel parcel) {
            return new ParcelableVolumeInfo(parcel);
        }

        /* renamed from: b */
        public ParcelableVolumeInfo[] newArray(int i) {
            return new ParcelableVolumeInfo[i];
        }
    }

    public ParcelableVolumeInfo(int i, int i2, int i3, int i4, int i5) {
        this.f162g = i;
        this.f163h = i2;
        this.f164i = i3;
        this.f165j = i4;
        this.f166k = i5;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f162g);
        parcel.writeInt(this.f164i);
        parcel.writeInt(this.f165j);
        parcel.writeInt(this.f166k);
        parcel.writeInt(this.f163h);
    }

    public ParcelableVolumeInfo(Parcel parcel) {
        this.f162g = parcel.readInt();
        this.f164i = parcel.readInt();
        this.f165j = parcel.readInt();
        this.f166k = parcel.readInt();
        this.f163h = parcel.readInt();
    }
}
