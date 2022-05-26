package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaxe implements Parcelable {
    public static final Parcelable.Creator<zzaxe> CREATOR = new C5008dm();

    /* renamed from: g */
    public final int f27160g;

    /* renamed from: h */
    public final int f27161h;

    /* renamed from: i */
    public final int f27162i;

    /* renamed from: j */
    public final byte[] f27163j;

    /* renamed from: k */
    private int f27164k;

    public zzaxe(int i, int i2, int i3, byte[] bArr) {
        this.f27160g = i;
        this.f27161h = i2;
        this.f27162i = i3;
        this.f27163j = bArr;
    }

    zzaxe(Parcel parcel) {
        this.f27160g = parcel.readInt();
        this.f27161h = parcel.readInt();
        this.f27162i = parcel.readInt();
        this.f27163j = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaxe.class == obj.getClass()) {
            zzaxe zzaxe = (zzaxe) obj;
            return this.f27160g == zzaxe.f27160g && this.f27161h == zzaxe.f27161h && this.f27162i == zzaxe.f27162i && Arrays.equals(this.f27163j, zzaxe.f27163j);
        }
    }

    public final int hashCode() {
        int i = this.f27164k;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((this.f27160g + 527) * 31) + this.f27161h) * 31) + this.f27162i) * 31) + Arrays.hashCode(this.f27163j);
        this.f27164k = hashCode;
        return hashCode;
    }

    public final String toString() {
        int i = this.f27160g;
        int i2 = this.f27161h;
        int i3 = this.f27162i;
        boolean z = this.f27163j != null;
        StringBuilder sb = new StringBuilder(55);
        sb.append("ColorInfo(");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        sb.append(", ");
        sb.append(i3);
        sb.append(", ");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f27160g);
        parcel.writeInt(this.f27161h);
        parcel.writeInt(this.f27162i);
        parcel.writeInt(this.f27163j != null ? 1 : 0);
        byte[] bArr = this.f27163j;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
