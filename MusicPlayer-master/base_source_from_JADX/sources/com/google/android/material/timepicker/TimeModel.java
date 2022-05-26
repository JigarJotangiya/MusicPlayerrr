package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new C6270a();

    /* renamed from: g */
    final int f29227g;

    /* renamed from: h */
    int f29228h;

    /* renamed from: i */
    int f29229i;

    /* renamed from: j */
    int f29230j;

    /* renamed from: com.google.android.material.timepicker.TimeModel$a */
    static class C6270a implements Parcelable.Creator<TimeModel> {
        C6270a() {
        }

        /* renamed from: a */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        /* renamed from: b */
        public TimeModel[] newArray(int i) {
            return new TimeModel[i];
        }
    }

    public TimeModel() {
        this(0);
    }

    /* renamed from: a */
    public static String m37423a(Resources resources, CharSequence charSequence) {
        return m37424b(resources, charSequence, "%02d");
    }

    /* renamed from: b */
    public static String m37424b(Resources resources, CharSequence charSequence, String str) {
        return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
    }

    /* renamed from: d */
    private static int m37425d(int i) {
        return i >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        if (this.f29228h == timeModel.f29228h && this.f29229i == timeModel.f29229i && this.f29227g == timeModel.f29227g && this.f29230j == timeModel.f29230j) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f29227g), Integer.valueOf(this.f29228h), Integer.valueOf(this.f29229i), Integer.valueOf(this.f29230j)});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f29228h);
        parcel.writeInt(this.f29229i);
        parcel.writeInt(this.f29230j);
        parcel.writeInt(this.f29227g);
    }

    public TimeModel(int i) {
        this(0, 0, 10, i);
    }

    public TimeModel(int i, int i2, int i3, int i4) {
        this.f29228h = i;
        this.f29229i = i2;
        this.f29230j = i3;
        this.f29227g = i4;
        m37425d(i);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
