package com.akexorcist.snaptimepicker;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8594l;

/* compiled from: TimeValue.kt */
public final class TimeValue implements Parcelable {
    public static final Parcelable.Creator<TimeValue> CREATOR = new C1694a();

    /* renamed from: g */
    private int f6357g;

    /* renamed from: h */
    private int f6358h;

    /* renamed from: com.akexorcist.snaptimepicker.TimeValue$a */
    public static class C1694a implements Parcelable.Creator<TimeValue> {
        /* renamed from: a */
        public final TimeValue createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "in");
            return new TimeValue(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public final TimeValue[] newArray(int i) {
            return new TimeValue[i];
        }
    }

    public TimeValue(int i, int i2) {
        this.f6357g = i;
        this.f6358h = i2;
    }

    /* renamed from: a */
    public final int mo7527a() {
        return this.f6357g;
    }

    /* renamed from: b */
    public final int mo7528b() {
        return this.f6358h;
    }

    /* renamed from: d */
    public final void mo7529d(int i) {
        this.f6357g = i;
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final void mo7531e(int i) {
        this.f6358h = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeValue)) {
            return false;
        }
        TimeValue timeValue = (TimeValue) obj;
        return this.f6357g == timeValue.f6357g && this.f6358h == timeValue.f6358h;
    }

    public int hashCode() {
        return (this.f6357g * 31) + this.f6358h;
    }

    public String toString() {
        return "TimeValue(hour=" + this.f6357g + ", minute=" + this.f6358h + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "parcel");
        parcel.writeInt(this.f6357g);
        parcel.writeInt(this.f6358h);
    }
}
