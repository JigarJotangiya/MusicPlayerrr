package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzare implements Parcelable {
    public static final Parcelable.Creator<zzare> CREATOR = new C5299lg();

    /* renamed from: g */
    private int f27141g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final UUID f27142h;

    /* renamed from: i */
    public final String f27143i;

    /* renamed from: j */
    public final byte[] f27144j;

    /* renamed from: k */
    public final boolean f27145k;

    zzare(Parcel parcel) {
        this.f27142h = new UUID(parcel.readLong(), parcel.readLong());
        this.f27143i = parcel.readString();
        this.f27144j = parcel.createByteArray();
        this.f27145k = parcel.readByte() != 0;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzare)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        zzare zzare = (zzare) obj;
        return this.f27143i.equals(zzare.f27143i) && C4934bm.m21445o(this.f27142h, zzare.f27142h) && Arrays.equals(this.f27144j, zzare.f27144j);
    }

    public final int hashCode() {
        int i = this.f27141g;
        if (i != 0) {
            return i;
        }
        int hashCode = (((this.f27142h.hashCode() * 31) + this.f27143i.hashCode()) * 31) + Arrays.hashCode(this.f27144j);
        this.f27141g = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f27142h.getMostSignificantBits());
        parcel.writeLong(this.f27142h.getLeastSignificantBits());
        parcel.writeString(this.f27143i);
        parcel.writeByteArray(this.f27144j);
        parcel.writeByte(this.f27145k ? (byte) 1 : 0);
    }

    public zzare(UUID uuid, String str, byte[] bArr, boolean z) {
        Objects.requireNonNull(uuid);
        this.f27142h = uuid;
        this.f27143i = str;
        Objects.requireNonNull(bArr);
        this.f27144j = bArr;
        this.f27145k = false;
    }
}
