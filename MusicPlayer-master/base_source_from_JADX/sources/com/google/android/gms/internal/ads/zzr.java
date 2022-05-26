package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzr implements Parcelable {
    public static final Parcelable.Creator<zzr> CREATOR = new g24();

    /* renamed from: g */
    private int f27411g;

    /* renamed from: h */
    public final UUID f27412h;

    /* renamed from: i */
    public final String f27413i;

    /* renamed from: j */
    public final String f27414j;

    /* renamed from: k */
    public final byte[] f27415k;

    zzr(Parcel parcel) {
        this.f27412h = new UUID(parcel.readLong(), parcel.readLong());
        this.f27413i = parcel.readString();
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27414j = readString;
        this.f27415k = parcel.createByteArray();
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzr)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzr zzr = (zzr) obj;
        return wy2.m33453p(this.f27413i, zzr.f27413i) && wy2.m33453p(this.f27414j, zzr.f27414j) && wy2.m33453p(this.f27412h, zzr.f27412h) && Arrays.equals(this.f27415k, zzr.f27415k);
    }

    public final int hashCode() {
        int i;
        int i2 = this.f27411g;
        if (i2 != 0) {
            return i2;
        }
        int hashCode = this.f27412h.hashCode() * 31;
        String str = this.f27413i;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode2 = ((((hashCode + i) * 31) + this.f27414j.hashCode()) * 31) + Arrays.hashCode(this.f27415k);
        this.f27411g = hashCode2;
        return hashCode2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f27412h.getMostSignificantBits());
        parcel.writeLong(this.f27412h.getLeastSignificantBits());
        parcel.writeString(this.f27413i);
        parcel.writeString(this.f27414j);
        parcel.writeByteArray(this.f27415k);
    }

    public zzr(UUID uuid, String str, String str2, byte[] bArr) {
        Objects.requireNonNull(uuid);
        this.f27412h = uuid;
        this.f27413i = null;
        this.f27414j = str2;
        this.f27415k = bArr;
    }
}
