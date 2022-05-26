package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatr implements Parcelable {
    public static final Parcelable.Creator<zzatr> CREATOR = new C5597ti();

    /* renamed from: g */
    private final zzatq[] f27149g;

    zzatr(Parcel parcel) {
        this.f27149g = new zzatq[parcel.readInt()];
        int i = 0;
        while (true) {
            zzatq[] zzatqArr = this.f27149g;
            if (i < zzatqArr.length) {
                zzatqArr[i] = (zzatq) parcel.readParcelable(zzatq.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo22501a() {
        return this.f27149g.length;
    }

    /* renamed from: b */
    public final zzatq mo22502b(int i) {
        return this.f27149g[i];
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzatr.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27149g, ((zzatr) obj).f27149g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27149g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27149g.length);
        for (zzatq writeParcelable : this.f27149g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzatr(List<? extends zzatq> list) {
        zzatq[] zzatqArr = new zzatq[list.size()];
        this.f27149g = zzatqArr;
        list.toArray(zzatqArr);
    }
}
