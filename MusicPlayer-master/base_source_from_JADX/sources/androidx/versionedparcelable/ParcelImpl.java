package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
    public static final Parcelable.Creator<ParcelImpl> CREATOR = new C1162a();

    /* renamed from: g */
    private final C1166d f4758g;

    /* renamed from: androidx.versionedparcelable.ParcelImpl$a */
    static class C1162a implements Parcelable.Creator<ParcelImpl> {
        C1162a() {
        }

        /* renamed from: a */
        public ParcelImpl createFromParcel(Parcel parcel) {
            return new ParcelImpl(parcel);
        }

        /* renamed from: b */
        public ParcelImpl[] newArray(int i) {
            return new ParcelImpl[i];
        }
    }

    public ParcelImpl(C1166d dVar) {
        this.f4758g = dVar;
    }

    /* renamed from: a */
    public <T extends C1166d> T mo6135a() {
        return this.f4758g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        new C1165c(parcel).mo6153L(this.f4758g);
    }

    protected ParcelImpl(Parcel parcel) {
        this.f4758g = new C1165c(parcel).mo6172u();
    }
}
