package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzl extends zzzu {
    public static final Parcelable.Creator<zzzl> CREATOR = new pb4();

    /* renamed from: h */
    public final String f27457h;

    /* renamed from: i */
    public final boolean f27458i;

    /* renamed from: j */
    public final boolean f27459j;

    /* renamed from: k */
    public final String[] f27460k;

    /* renamed from: l */
    private final zzzu[] f27461l;

    zzzl(Parcel parcel) {
        super("CTOC");
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27457h = readString;
        boolean z = true;
        this.f27458i = parcel.readByte() != 0;
        this.f27459j = parcel.readByte() == 0 ? false : z;
        String[] createStringArray = parcel.createStringArray();
        wy2.m33436c(createStringArray);
        this.f27460k = createStringArray;
        int readInt = parcel.readInt();
        this.f27461l = new zzzu[readInt];
        for (int i2 = 0; i2 < readInt; i2++) {
            this.f27461l[i2] = (zzzu) parcel.readParcelable(zzzu.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzl.class == obj.getClass()) {
            zzzl zzzl = (zzzl) obj;
            return this.f27458i == zzzl.f27458i && this.f27459j == zzzl.f27459j && wy2.m33453p(this.f27457h, zzzl.f27457h) && Arrays.equals(this.f27460k, zzzl.f27460k) && Arrays.equals(this.f27461l, zzzl.f27461l);
        }
    }

    public final int hashCode() {
        int i = ((((this.f27458i ? 1 : 0) + true) * 31) + (this.f27459j ? 1 : 0)) * 31;
        String str = this.f27457h;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27457h);
        parcel.writeByte(this.f27458i ? (byte) 1 : 0);
        parcel.writeByte(this.f27459j ? (byte) 1 : 0);
        parcel.writeStringArray(this.f27460k);
        parcel.writeInt(this.f27461l.length);
        for (zzzu writeParcelable : this.f27461l) {
            parcel.writeParcelable(writeParcelable, 0);
        }
    }

    public zzzl(String str, boolean z, boolean z2, String[] strArr, zzzu[] zzzuArr) {
        super("CTOC");
        this.f27457h = str;
        this.f27458i = z;
        this.f27459j = z2;
        this.f27460k = strArr;
        this.f27461l = zzzuArr;
    }
}
