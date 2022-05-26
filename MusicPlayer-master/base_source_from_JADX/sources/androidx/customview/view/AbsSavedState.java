package androidx.customview.view;

import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
    public static final Parcelable.Creator<AbsSavedState> CREATOR = new C0562a();

    /* renamed from: h */
    public static final AbsSavedState f2835h = new AbsSavedState() {
    };

    /* renamed from: g */
    private final Parcelable f2836g;

    /* renamed from: androidx.customview.view.AbsSavedState$a */
    static class C0562a implements Parcelable.ClassLoaderCreator<AbsSavedState> {
        C0562a() {
        }

        /* renamed from: a */
        public AbsSavedState createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, (ClassLoader) null);
        }

        /* renamed from: b */
        public AbsSavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) == null) {
                return AbsSavedState.f2835h;
            }
            throw new IllegalStateException("superState must be null");
        }

        /* renamed from: c */
        public AbsSavedState[] newArray(int i) {
            return new AbsSavedState[i];
        }
    }

    /* renamed from: a */
    public final Parcelable mo3471a() {
        return this.f2836g;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f2836g, i);
    }

    private AbsSavedState() {
        this.f2836g = null;
    }

    protected AbsSavedState(Parcelable parcelable) {
        if (parcelable != null) {
            this.f2836g = parcelable == f2835h ? null : parcelable;
            return;
        }
        throw new IllegalArgumentException("superState must not be null");
    }

    protected AbsSavedState(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.f2836g = readParcelable == null ? f2835h : readParcelable;
    }
}
