package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import p082e.p109h.p118o.C3699e;

public class SingleDateSelector implements DateSelector<Long> {
    public static final Parcelable.Creator<SingleDateSelector> CREATOR = new C5983a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Long f28133g;

    /* renamed from: com.google.android.material.datepicker.SingleDateSelector$a */
    static class C5983a implements Parcelable.Creator<SingleDateSelector> {
        C5983a() {
        }

        /* renamed from: a */
        public SingleDateSelector createFromParcel(Parcel parcel) {
            SingleDateSelector singleDateSelector = new SingleDateSelector();
            Long unused = singleDateSelector.f28133g = (Long) parcel.readValue(Long.class.getClassLoader());
            return singleDateSelector;
        }

        /* renamed from: b */
        public SingleDateSelector[] newArray(int i) {
            return new SingleDateSelector[i];
        }
    }

    /* renamed from: K */
    public Collection<Long> mo23659K() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f28133g;
        if (l != null) {
            arrayList.add(l);
        }
        return arrayList;
    }

    /* renamed from: b */
    public Long mo23660T() {
        return this.f28133g;
    }

    /* renamed from: c */
    public Collection<C3699e<Long, Long>> mo23661c() {
        return new ArrayList();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i0 */
    public void mo23662i0(long j) {
        this.f28133g = Long.valueOf(j);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f28133g);
    }
}
