package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new C5981a();

    /* renamed from: g */
    private final Calendar f28125g;

    /* renamed from: h */
    final int f28126h;

    /* renamed from: i */
    final int f28127i;

    /* renamed from: j */
    final int f28128j;

    /* renamed from: k */
    final int f28129k;

    /* renamed from: l */
    private String f28130l;

    /* renamed from: com.google.android.material.datepicker.Month$a */
    static class C5981a implements Parcelable.Creator<Month> {
        C5981a() {
        }

        /* renamed from: a */
        public Month createFromParcel(Parcel parcel) {
            return Month.m36001h(parcel.readInt(), parcel.readInt());
        }

        /* renamed from: b */
        public Month[] newArray(int i) {
            return new Month[i];
        }
    }

    private Month(Calendar calendar) {
        calendar.set(5, 1);
        Calendar d = C6011m.m36105d(calendar);
        this.f28125g = d;
        this.f28126h = d.get(2);
        this.f28127i = d.get(1);
        this.f28128j = d.getMaximum(7);
        this.f28129k = d.getActualMaximum(5);
        d.getTimeInMillis();
    }

    /* renamed from: h */
    static Month m36001h(int i, int i2) {
        Calendar k = C6011m.m36112k();
        k.set(1, i);
        k.set(2, i2);
        return new Month(k);
    }

    /* renamed from: j */
    static Month m36002j(long j) {
        Calendar k = C6011m.m36112k();
        k.setTimeInMillis(j);
        return new Month(k);
    }

    /* renamed from: k */
    static Month m36003k() {
        return new Month(C6011m.m36110i());
    }

    /* renamed from: d */
    public int compareTo(Month month) {
        return this.f28125g.compareTo(month.f28125g);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        if (this.f28126h == month.f28126h && this.f28127i == month.f28127i) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f28126h), Integer.valueOf(this.f28127i)});
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public int mo23694l() {
        int firstDayOfWeek = this.f28125g.get(7) - this.f28125g.getFirstDayOfWeek();
        return firstDayOfWeek < 0 ? firstDayOfWeek + this.f28128j : firstDayOfWeek;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public long mo23695o(int i) {
        Calendar d = C6011m.m36105d(this.f28125g);
        d.set(5, i);
        return d.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public int mo23696p(long j) {
        Calendar d = C6011m.m36105d(this.f28125g);
        d.setTimeInMillis(j);
        return d.get(5);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public String mo23697q(Context context) {
        if (this.f28130l == null) {
            this.f28130l = C5986c.m36038c(context, this.f28125g.getTimeInMillis());
        }
        return this.f28130l;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public long mo23698r() {
        return this.f28125g.getTimeInMillis();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public Month mo23699s(int i) {
        Calendar d = C6011m.m36105d(this.f28125g);
        d.add(2, i);
        return new Month(d);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public int mo23700t(Month month) {
        if (this.f28125g instanceof GregorianCalendar) {
            return ((month.f28127i - this.f28127i) * 12) + (month.f28126h - this.f28126h);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f28127i);
        parcel.writeInt(this.f28126h);
    }
}
