package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import p082e.p109h.p118o.C3698d;

public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new C5973a();

    /* renamed from: g */
    private final Month f28111g;

    /* renamed from: h */
    private final Month f28112h;

    /* renamed from: i */
    private final DateValidator f28113i;

    /* renamed from: j */
    private Month f28114j;

    /* renamed from: k */
    private final int f28115k;

    /* renamed from: l */
    private final int f28116l;

    public interface DateValidator extends Parcelable {
        /* renamed from: H */
        boolean mo23644H(long j);
    }

    /* renamed from: com.google.android.material.datepicker.CalendarConstraints$a */
    static class C5973a implements Parcelable.Creator<CalendarConstraints> {
        C5973a() {
        }

        /* renamed from: a */
        public CalendarConstraints createFromParcel(Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (C5973a) null);
        }

        /* renamed from: b */
        public CalendarConstraints[] newArray(int i) {
            return new CalendarConstraints[i];
        }
    }

    /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, C5973a aVar) {
        this(month, month2, dateValidator, month3);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public Month mo23633a(Month month) {
        if (month.compareTo(this.f28111g) < 0) {
            return this.f28111g;
        }
        return month.compareTo(this.f28112h) > 0 ? this.f28112h : month;
    }

    /* renamed from: b */
    public DateValidator mo23634b() {
        return this.f28113i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public Month mo23635d() {
        return this.f28112h;
    }

    public int describeContents() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo23637e() {
        return this.f28116l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        if (!this.f28111g.equals(calendarConstraints.f28111g) || !this.f28112h.equals(calendarConstraints.f28112h) || !C3698d.m15814a(this.f28114j, calendarConstraints.f28114j) || !this.f28113i.equals(calendarConstraints.f28113i)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public Month mo23639f() {
        return this.f28114j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public Month mo23640g() {
        return this.f28111g;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo23641h() {
        return this.f28115k;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f28111g, this.f28112h, this.f28114j, this.f28113i});
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.f28111g, 0);
        parcel.writeParcelable(this.f28112h, 0);
        parcel.writeParcelable(this.f28114j, 0);
        parcel.writeParcelable(this.f28113i, 0);
    }

    private CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3) {
        this.f28111g = month;
        this.f28112h = month2;
        this.f28114j = month3;
        this.f28113i = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        } else if (month3 == null || month3.compareTo(month2) <= 0) {
            this.f28116l = month.mo23700t(month2) + 1;
            this.f28115k = (month2.f28127i - month.f28127i) + 1;
        } else {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
    }
}
