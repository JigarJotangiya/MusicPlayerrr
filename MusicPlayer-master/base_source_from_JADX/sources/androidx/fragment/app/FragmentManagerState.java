package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class FragmentManagerState implements Parcelable {
    public static final Parcelable.Creator<FragmentManagerState> CREATOR = new C0579a();

    /* renamed from: g */
    ArrayList<FragmentState> f2992g;

    /* renamed from: h */
    ArrayList<String> f2993h;

    /* renamed from: i */
    BackStackState[] f2994i;

    /* renamed from: j */
    int f2995j;

    /* renamed from: k */
    String f2996k = null;

    /* renamed from: androidx.fragment.app.FragmentManagerState$a */
    static class C0579a implements Parcelable.Creator<FragmentManagerState> {
        C0579a() {
        }

        /* renamed from: a */
        public FragmentManagerState createFromParcel(Parcel parcel) {
            return new FragmentManagerState(parcel);
        }

        /* renamed from: b */
        public FragmentManagerState[] newArray(int i) {
            return new FragmentManagerState[i];
        }
    }

    public FragmentManagerState() {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeTypedList(this.f2992g);
        parcel.writeStringList(this.f2993h);
        parcel.writeTypedArray(this.f2994i, i);
        parcel.writeInt(this.f2995j);
        parcel.writeString(this.f2996k);
    }

    public FragmentManagerState(Parcel parcel) {
        this.f2992g = parcel.createTypedArrayList(FragmentState.CREATOR);
        this.f2993h = parcel.createStringArrayList();
        this.f2994i = (BackStackState[]) parcel.createTypedArray(BackStackState.CREATOR);
        this.f2995j = parcel.readInt();
        this.f2996k = parcel.readString();
    }
}
