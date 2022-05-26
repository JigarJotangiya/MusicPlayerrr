package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzyw implements zzdc {
    public static final Parcelable.Creator<zzyw> CREATOR = new gb4();

    /* renamed from: g */
    public final String f27424g;

    /* renamed from: h */
    public final String f27425h;

    /* renamed from: i */
    public final long f27426i;

    /* renamed from: j */
    public final long f27427j;

    /* renamed from: k */
    public final byte[] f27428k;

    /* renamed from: l */
    private int f27429l;

    static {
        jb4 jb4 = new jb4();
        jb4.mo18599s("application/id3");
        jb4.mo18605y();
        jb4 jb42 = new jb4();
        jb42.mo18599s("application/x-scte35");
        jb42.mo18605y();
    }

    zzyw(Parcel parcel) {
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27424g = readString;
        this.f27425h = parcel.readString();
        this.f27426i = parcel.readLong();
        this.f27427j = parcel.readLong();
        byte[] createByteArray = parcel.createByteArray();
        wy2.m33436c(createByteArray);
        this.f27428k = createByteArray;
    }

    public zzyw(String str, String str2, long j, long j2, byte[] bArr) {
        this.f27424g = str;
        this.f27425h = str2;
        this.f27426i = j;
        this.f27427j = j2;
        this.f27428k = bArr;
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
        if (obj != null && zzyw.class == obj.getClass()) {
            zzyw zzyw = (zzyw) obj;
            return this.f27426i == zzyw.f27426i && this.f27427j == zzyw.f27427j && wy2.m33453p(this.f27424g, zzyw.f27424g) && wy2.m33453p(this.f27425h, zzyw.f27425h) && Arrays.equals(this.f27428k, zzyw.f27428k);
        }
    }

    public final int hashCode() {
        int i = this.f27429l;
        if (i != 0) {
            return i;
        }
        String str = this.f27424g;
        int i2 = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f27425h;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        long j = this.f27426i;
        long j2 = this.f27427j;
        int hashCode2 = ((((((hashCode + i2) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + Arrays.hashCode(this.f27428k);
        this.f27429l = hashCode2;
        return hashCode2;
    }

    public final String toString() {
        String str = this.f27424g;
        long j = this.f27427j;
        long j2 = this.f27426i;
        String str2 = this.f27425h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 79 + String.valueOf(str2).length());
        sb.append("EMSG: scheme=");
        sb.append(str);
        sb.append(", id=");
        sb.append(j);
        sb.append(", durationMs=");
        sb.append(j2);
        sb.append(", value=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27424g);
        parcel.writeString(this.f27425h);
        parcel.writeLong(this.f27426i);
        parcel.writeLong(this.f27427j);
        parcel.writeByteArray(this.f27428k);
    }
}
