package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzy extends zzzu {
    public static final Parcelable.Creator<zzzy> CREATOR = new xb4();

    /* renamed from: h */
    public final int f27473h;

    /* renamed from: i */
    public final int f27474i;

    /* renamed from: j */
    public final int f27475j;

    /* renamed from: k */
    public final int[] f27476k;

    /* renamed from: l */
    public final int[] f27477l;

    public zzzy(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super("MLLT");
        this.f27473h = i;
        this.f27474i = i2;
        this.f27475j = i3;
        this.f27476k = iArr;
        this.f27477l = iArr2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzy.class == obj.getClass()) {
            zzzy zzzy = (zzzy) obj;
            return this.f27473h == zzzy.f27473h && this.f27474i == zzzy.f27474i && this.f27475j == zzzy.f27475j && Arrays.equals(this.f27476k, zzzy.f27476k) && Arrays.equals(this.f27477l, zzzy.f27477l);
        }
    }

    public final int hashCode() {
        return ((((((((this.f27473h + 527) * 31) + this.f27474i) * 31) + this.f27475j) * 31) + Arrays.hashCode(this.f27476k)) * 31) + Arrays.hashCode(this.f27477l);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27473h);
        parcel.writeInt(this.f27474i);
        parcel.writeInt(this.f27475j);
        parcel.writeIntArray(this.f27476k);
        parcel.writeIntArray(this.f27477l);
    }

    zzzy(Parcel parcel) {
        super("MLLT");
        this.f27473h = parcel.readInt();
        this.f27474i = parcel.readInt();
        this.f27475j = parcel.readInt();
        int[] createIntArray = parcel.createIntArray();
        wy2.m33436c(createIntArray);
        this.f27476k = createIntArray;
        int[] createIntArray2 = parcel.createIntArray();
        wy2.m33436c(createIntArray2);
        this.f27477l = createIntArray2;
    }
}
