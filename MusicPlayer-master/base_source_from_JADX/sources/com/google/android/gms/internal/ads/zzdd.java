package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzdd implements Parcelable {
    public static final Parcelable.Creator<zzdd> CREATOR = new l41();

    /* renamed from: g */
    private final zzdc[] f27381g;

    zzdd(Parcel parcel) {
        this.f27381g = new zzdc[parcel.readInt()];
        int i = 0;
        while (true) {
            zzdc[] zzdcArr = this.f27381g;
            if (i < zzdcArr.length) {
                zzdcArr[i] = (zzdc) parcel.readParcelable(zzdc.class.getClassLoader());
                i++;
            } else {
                return;
            }
        }
    }

    public zzdd(zzdc... zzdcArr) {
        this.f27381g = zzdcArr;
    }

    /* renamed from: a */
    public final int mo22581a() {
        return this.f27381g.length;
    }

    /* renamed from: b */
    public final zzdc mo22582b(int i) {
        return this.f27381g[i];
    }

    /* renamed from: d */
    public final zzdd mo22583d(zzdc... zzdcArr) {
        if (zzdcArr.length == 0) {
            return this;
        }
        return new zzdd((zzdc[]) wy2.m33463z(this.f27381g, zzdcArr));
    }

    public final int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final zzdd mo22585e(zzdd zzdd) {
        return zzdd == null ? this : mo22583d(zzdd.f27381g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzdd.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f27381g, ((zzdd) obj).f27381g);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f27381g);
    }

    public final String toString() {
        String valueOf = String.valueOf(Arrays.toString(this.f27381g));
        return valueOf.length() != 0 ? "entries=".concat(valueOf) : new String("entries=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27381g.length);
        for (zzdc writeParcelable : this.f27381g) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzdd(List<? extends zzdc> list) {
        this.f27381g = (zzdc[]) list.toArray(new zzdc[0]);
    }
}
