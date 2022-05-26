package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatz extends zzatx {
    public static final Parcelable.Creator<zzatz> CREATOR = new C5708wi();

    /* renamed from: h */
    public final String f27158h;

    /* renamed from: i */
    public final String f27159i;

    zzatz(Parcel parcel) {
        super(parcel.readString());
        this.f27158h = parcel.readString();
        this.f27159i = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatz.class == obj.getClass()) {
            zzatz zzatz = (zzatz) obj;
            return this.f27157g.equals(zzatz.f27157g) && C4934bm.m21445o(this.f27158h, zzatz.f27158h) && C4934bm.m21445o(this.f27159i, zzatz.f27159i);
        }
    }

    public final int hashCode() {
        int hashCode = (this.f27157g.hashCode() + 527) * 31;
        String str = this.f27158h;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f27159i;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27157g);
        parcel.writeString(this.f27158h);
        parcel.writeString(this.f27159i);
    }

    public zzatz(String str, String str2, String str3) {
        super(str);
        this.f27158h = null;
        this.f27159i = str3;
    }
}
