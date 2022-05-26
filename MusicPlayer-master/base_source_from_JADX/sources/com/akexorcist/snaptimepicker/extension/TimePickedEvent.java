package com.akexorcist.snaptimepicker.extension;

import android.os.Parcel;
import android.os.Parcelable;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* compiled from: TimePickedEvent.kt */
public final class TimePickedEvent implements Parcelable {
    public static final C1711a CREATOR = new C1711a((C8589g) null);

    /* renamed from: g */
    private final int f6415g;

    /* renamed from: h */
    private final int f6416h;

    /* renamed from: com.akexorcist.snaptimepicker.extension.TimePickedEvent$a */
    /* compiled from: TimePickedEvent.kt */
    public static final class C1711a implements Parcelable.Creator<TimePickedEvent> {
        private C1711a() {
        }

        /* renamed from: a */
        public TimePickedEvent createFromParcel(Parcel parcel) {
            C8594l.m46771e(parcel, "parcel");
            return new TimePickedEvent(parcel);
        }

        /* renamed from: b */
        public TimePickedEvent[] newArray(int i) {
            return new TimePickedEvent[i];
        }

        public /* synthetic */ C1711a(C8589g gVar) {
            this();
        }
    }

    public TimePickedEvent(int i, int i2) {
        this.f6415g = i;
        this.f6416h = i2;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimePickedEvent)) {
            return false;
        }
        TimePickedEvent timePickedEvent = (TimePickedEvent) obj;
        return this.f6415g == timePickedEvent.f6415g && this.f6416h == timePickedEvent.f6416h;
    }

    public int hashCode() {
        return (this.f6415g * 31) + this.f6416h;
    }

    public String toString() {
        return "TimePickedEvent(hour=" + this.f6415g + ", minute=" + this.f6416h + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        C8594l.m46771e(parcel, "parcel");
        parcel.writeInt(this.f6415g);
        parcel.writeInt(this.f6416h);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TimePickedEvent(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
        C8594l.m46771e(parcel, "parcel");
    }
}
