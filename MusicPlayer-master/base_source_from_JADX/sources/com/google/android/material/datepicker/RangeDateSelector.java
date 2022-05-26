package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;
import p082e.p109h.p118o.C3699e;

public class RangeDateSelector implements DateSelector<C3699e<Long, Long>> {
    public static final Parcelable.Creator<RangeDateSelector> CREATOR = new C5982a();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public Long f28131g = null;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Long f28132h = null;

    /* renamed from: com.google.android.material.datepicker.RangeDateSelector$a */
    static class C5982a implements Parcelable.Creator<RangeDateSelector> {
        C5982a() {
        }

        /* renamed from: a */
        public RangeDateSelector createFromParcel(Parcel parcel) {
            Class<Long> cls = Long.class;
            RangeDateSelector rangeDateSelector = new RangeDateSelector();
            Long unused = rangeDateSelector.f28131g = (Long) parcel.readValue(cls.getClassLoader());
            Long unused2 = rangeDateSelector.f28132h = (Long) parcel.readValue(cls.getClassLoader());
            return rangeDateSelector;
        }

        /* renamed from: b */
        public RangeDateSelector[] newArray(int i) {
            return new RangeDateSelector[i];
        }
    }

    /* renamed from: e */
    private boolean m36016e(long j, long j2) {
        return j <= j2;
    }

    /* renamed from: K */
    public Collection<Long> mo23659K() {
        ArrayList arrayList = new ArrayList();
        Long l = this.f28131g;
        if (l != null) {
            arrayList.add(l);
        }
        Long l2 = this.f28132h;
        if (l2 != null) {
            arrayList.add(l2);
        }
        return arrayList;
    }

    /* renamed from: c */
    public Collection<C3699e<Long, Long>> mo23661c() {
        if (this.f28131g == null || this.f28132h == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C3699e(this.f28131g, this.f28132h));
        return arrayList;
    }

    /* renamed from: d */
    public C3699e<Long, Long> mo23660T() {
        return new C3699e<>(this.f28131g, this.f28132h);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: i0 */
    public void mo23662i0(long j) {
        Long l = this.f28131g;
        if (l == null) {
            this.f28131g = Long.valueOf(j);
        } else if (this.f28132h != null || !m36016e(l.longValue(), j)) {
            this.f28132h = null;
            this.f28131g = Long.valueOf(j);
        } else {
            this.f28132h = Long.valueOf(j);
        }
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.f28131g);
        parcel.writeValue(this.f28132h);
    }
}
