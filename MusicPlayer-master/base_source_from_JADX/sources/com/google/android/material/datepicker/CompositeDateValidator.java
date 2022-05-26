package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.CalendarConstraints;
import java.util.ArrayList;
import java.util.List;
import p082e.p109h.p118o.C3703i;

public final class CompositeDateValidator implements CalendarConstraints.DateValidator {
    public static final Parcelable.Creator<CompositeDateValidator> CREATOR = new C5976c();
    /* access modifiers changed from: private */

    /* renamed from: i */
    public static final C5977d f28117i = new C5974a();
    /* access modifiers changed from: private */

    /* renamed from: j */
    public static final C5977d f28118j = new C5975b();

    /* renamed from: g */
    private final C5977d f28119g;

    /* renamed from: h */
    private final List<CalendarConstraints.DateValidator> f28120h;

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$a */
    static class C5974a implements C5977d {
        C5974a() {
        }

        /* renamed from: D */
        public int mo23653D() {
            return 1;
        }

        /* renamed from: a */
        public boolean mo23654a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && next.mo23644H(j)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$b */
    static class C5975b implements C5977d {
        C5975b() {
        }

        /* renamed from: D */
        public int mo23653D() {
            return 2;
        }

        /* renamed from: a */
        public boolean mo23654a(List<CalendarConstraints.DateValidator> list, long j) {
            for (CalendarConstraints.DateValidator next : list) {
                if (next != null && !next.mo23644H(j)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$c */
    static class C5976c implements Parcelable.Creator<CompositeDateValidator> {
        C5976c() {
        }

        /* renamed from: a */
        public CompositeDateValidator createFromParcel(Parcel parcel) {
            C5977d dVar;
            ArrayList readArrayList = parcel.readArrayList(CalendarConstraints.DateValidator.class.getClassLoader());
            int readInt = parcel.readInt();
            if (readInt == 2) {
                dVar = CompositeDateValidator.f28118j;
            } else if (readInt == 1) {
                dVar = CompositeDateValidator.f28117i;
            } else {
                dVar = CompositeDateValidator.f28118j;
            }
            C3703i.m15827d(readArrayList);
            return new CompositeDateValidator(readArrayList, dVar, (C5974a) null);
        }

        /* renamed from: b */
        public CompositeDateValidator[] newArray(int i) {
            return new CompositeDateValidator[i];
        }
    }

    /* renamed from: com.google.android.material.datepicker.CompositeDateValidator$d */
    private interface C5977d {
        /* renamed from: D */
        int mo23653D();

        /* renamed from: a */
        boolean mo23654a(List<CalendarConstraints.DateValidator> list, long j);
    }

    /* synthetic */ CompositeDateValidator(List list, C5977d dVar, C5974a aVar) {
        this(list, dVar);
    }

    /* renamed from: H */
    public boolean mo23644H(long j) {
        return this.f28119g.mo23654a(this.f28120h, j);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompositeDateValidator)) {
            return false;
        }
        CompositeDateValidator compositeDateValidator = (CompositeDateValidator) obj;
        if (!this.f28120h.equals(compositeDateValidator.f28120h) || this.f28119g.mo23653D() != compositeDateValidator.f28119g.mo23653D()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f28120h.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.f28120h);
        parcel.writeInt(this.f28119g.mo23653D());
    }

    private CompositeDateValidator(List<CalendarConstraints.DateValidator> list, C5977d dVar) {
        this.f28120h = list;
        this.f28119g = dVar;
    }
}
