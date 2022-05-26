package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointBackward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointBackward> CREATOR = new C5978a();

    /* renamed from: g */
    private final long f28121g;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointBackward$a */
    static class C5978a implements Parcelable.Creator<DateValidatorPointBackward> {
        C5978a() {
        }

        /* renamed from: a */
        public DateValidatorPointBackward createFromParcel(Parcel parcel) {
            return new DateValidatorPointBackward(parcel.readLong(), (C5978a) null);
        }

        /* renamed from: b */
        public DateValidatorPointBackward[] newArray(int i) {
            return new DateValidatorPointBackward[i];
        }
    }

    /* synthetic */ DateValidatorPointBackward(long j, C5978a aVar) {
        this(j);
    }

    /* renamed from: H */
    public boolean mo23644H(long j) {
        return j <= this.f28121g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointBackward) && this.f28121g == ((DateValidatorPointBackward) obj).f28121g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f28121g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f28121g);
    }

    private DateValidatorPointBackward(long j) {
        this.f28121g = j;
    }
}
