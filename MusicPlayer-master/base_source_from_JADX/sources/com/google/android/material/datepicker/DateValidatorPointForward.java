package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.Arrays;

public class DateValidatorPointForward implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<DateValidatorPointForward> CREATOR = new C5979a();

    /* renamed from: g */
    private final long f28122g;

    /* renamed from: com.google.android.material.datepicker.DateValidatorPointForward$a */
    static class C5979a implements Parcelable.Creator<DateValidatorPointForward> {
        C5979a() {
        }

        /* renamed from: a */
        public DateValidatorPointForward createFromParcel(Parcel parcel) {
            return new DateValidatorPointForward(parcel.readLong(), (C5979a) null);
        }

        /* renamed from: b */
        public DateValidatorPointForward[] newArray(int i) {
            return new DateValidatorPointForward[i];
        }
    }

    /* synthetic */ DateValidatorPointForward(long j, C5979a aVar) {
        this(j);
    }

    /* renamed from: H */
    public boolean mo23644H(long j) {
        return j >= this.f28122g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof DateValidatorPointForward) && this.f28122g == ((DateValidatorPointForward) obj).f28122g) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f28122g)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f28122g);
    }

    private DateValidatorPointForward(long j) {
        this.f28122g = j;
    }
}
