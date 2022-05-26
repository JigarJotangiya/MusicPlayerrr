package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzatv extends zzatx {
    public static final Parcelable.Creator<zzatv> CREATOR = new C5671vi();

    /* renamed from: h */
    public final String f27154h;

    /* renamed from: i */
    public final String f27155i;

    /* renamed from: j */
    public final String f27156j;

    zzatv(Parcel parcel) {
        super("COMM");
        this.f27154h = parcel.readString();
        this.f27155i = parcel.readString();
        this.f27156j = parcel.readString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzatv.class == obj.getClass()) {
            zzatv zzatv = (zzatv) obj;
            return C4934bm.m21445o(this.f27155i, zzatv.f27155i) && C4934bm.m21445o(this.f27154h, zzatv.f27154h) && C4934bm.m21445o(this.f27156j, zzatv.f27156j);
        }
    }

    public final int hashCode() {
        String str = this.f27154h;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f27155i;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f27156j;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27157g);
        parcel.writeString(this.f27154h);
        parcel.writeString(this.f27156j);
    }

    public zzatv(String str, String str2, String str3) {
        super("COMM");
        this.f27154h = "und";
        this.f27155i = str2;
        this.f27156j = str3;
    }
}
