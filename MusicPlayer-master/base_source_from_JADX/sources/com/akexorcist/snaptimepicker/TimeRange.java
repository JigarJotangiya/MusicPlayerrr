package com.akexorcist.snaptimepicker;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8594l;

/* compiled from: TimeRange.kt */
public final class TimeRange implements Parcelable {
    public static final Parcelable.Creator<TimeRange> CREATOR = new C1693a();

    /* renamed from: g */
    private TimeValue f6355g;

    /* renamed from: h */
    private TimeValue f6356h;

    /* renamed from: com.akexorcist.snaptimepicker.TimeRange$a */
    public static class C1693a implements Parcelable.Creator<TimeRange> {
        /* renamed from: a */
        public final TimeRange createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "in");
            TimeValue timeValue = null;
            TimeValue createFromParcel = parcel.readInt() != 0 ? TimeValue.CREATOR.createFromParcel(parcel) : null;
            if (parcel.readInt() != 0) {
                timeValue = TimeValue.CREATOR.createFromParcel(parcel);
            }
            return new TimeRange(createFromParcel, timeValue);
        }

        /* renamed from: b */
        public final TimeRange[] newArray(int i) {
            return new TimeRange[i];
        }
    }

    public TimeRange(TimeValue timeValue, TimeValue timeValue2) {
        this.f6355g = timeValue;
        this.f6356h = timeValue2;
    }

    /* renamed from: a */
    public final TimeValue mo7516a() {
        return this.f6356h;
    }

    /* renamed from: b */
    public final TimeValue mo7517b() {
        return this.f6355g;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeRange)) {
            return false;
        }
        TimeRange timeRange = (TimeRange) obj;
        return C8594l.m46767a(this.f6355g, timeRange.f6355g) && C8594l.m46767a(this.f6356h, timeRange.f6356h);
    }

    public int hashCode() {
        TimeValue timeValue = this.f6355g;
        int i = 0;
        int hashCode = (timeValue != null ? timeValue.hashCode() : 0) * 31;
        TimeValue timeValue2 = this.f6356h;
        if (timeValue2 != null) {
            i = timeValue2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "TimeRange(start=" + this.f6355g + ", end=" + this.f6356h + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "parcel");
        TimeValue timeValue = this.f6355g;
        if (timeValue != null) {
            parcel.writeInt(1);
            timeValue.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        TimeValue timeValue2 = this.f6356h;
        if (timeValue2 != null) {
            parcel.writeInt(1);
            timeValue2.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }
}
