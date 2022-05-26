package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzaah implements zzdc {
    public static final Parcelable.Creator<zzaah> CREATOR = new C5022e();

    /* renamed from: g */
    public final String f27102g;

    /* renamed from: h */
    public final byte[] f27103h;

    /* renamed from: i */
    public final int f27104i;

    /* renamed from: j */
    public final int f27105j;

    /* synthetic */ zzaah(Parcel parcel, C5059f fVar) {
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27102g = readString;
        byte[] createByteArray = parcel.createByteArray();
        wy2.m33436c(createByteArray);
        this.f27103h = createByteArray;
        this.f27104i = parcel.readInt();
        this.f27105j = parcel.readInt();
    }

    public zzaah(String str, byte[] bArr, int i, int i2) {
        this.f27102g = str;
        this.f27103h = bArr;
        this.f27104i = i;
        this.f27105j = i2;
    }

    /* renamed from: E */
    public final /* synthetic */ void mo22456E(C5828zq zqVar) {
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzaah.class == obj.getClass()) {
            zzaah zzaah = (zzaah) obj;
            return this.f27102g.equals(zzaah.f27102g) && Arrays.equals(this.f27103h, zzaah.f27103h) && this.f27104i == zzaah.f27104i && this.f27105j == zzaah.f27105j;
        }
    }

    public final int hashCode() {
        return ((((((this.f27102g.hashCode() + 527) * 31) + Arrays.hashCode(this.f27103h)) * 31) + this.f27104i) * 31) + this.f27105j;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f27102g);
        return valueOf.length() != 0 ? "mdta: key=".concat(valueOf) : new String("mdta: key=");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27102g);
        parcel.writeByteArray(this.f27103h);
        parcel.writeInt(this.f27104i);
        parcel.writeInt(this.f27105j);
    }
}
