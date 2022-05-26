package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatt extends zzatx {
    public static final Parcelable.Creator<zzatt> CREATOR = new C5634ui();

    /* renamed from: h */
    public final String f27150h;

    /* renamed from: i */
    public final String f27151i;

    /* renamed from: j */
    public final int f27152j;

    /* renamed from: k */
    public final byte[] f27153k;

    zzatt(Parcel parcel) {
        super("APIC");
        this.f27150h = parcel.readString();
        this.f27151i = parcel.readString();
        this.f27152j = parcel.readInt();
        this.f27153k = parcel.createByteArray();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatt.class == obj.getClass()) {
            zzatt zzatt = (zzatt) obj;
            return this.f27152j == zzatt.f27152j && C4934bm.m21445o(this.f27150h, zzatt.f27150h) && C4934bm.m21445o(this.f27151i, zzatt.f27151i) && Arrays.equals(this.f27153k, zzatt.f27153k);
        }
    }

    public final int hashCode() {
        int i = (this.f27152j + 527) * 31;
        String str = this.f27150h;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27151i;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return ((hashCode + i2) * 31) + Arrays.hashCode(this.f27153k);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27150h);
        parcel.writeString(this.f27151i);
        parcel.writeInt(this.f27152j);
        parcel.writeByteArray(this.f27153k);
    }

    public zzatt(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.f27150h = str;
        this.f27151i = null;
        this.f27152j = 3;
        this.f27153k = bArr;
    }
}
