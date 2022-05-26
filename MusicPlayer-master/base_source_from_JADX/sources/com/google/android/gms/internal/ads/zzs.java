package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzs implements Comparator<zzr>, Parcelable {
    public static final Parcelable.Creator<zzs> CREATOR = new f14();

    /* renamed from: g */
    private final zzr[] f27416g;

    /* renamed from: h */
    private int f27417h;

    /* renamed from: i */
    public final String f27418i;

    zzs(Parcel parcel) {
        this.f27418i = parcel.readString();
        zzr[] zzrArr = (zzr[]) parcel.createTypedArray(zzr.CREATOR);
        wy2.m33436c(zzrArr);
        zzr[] zzrArr2 = zzrArr;
        this.f27416g = zzrArr2;
        int length = zzrArr2.length;
    }

    /* renamed from: a */
    public final zzs mo22601a(String str) {
        if (wy2.m33453p(this.f27418i, str)) {
            return this;
        }
        return new zzs(str, false, this.f27416g);
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzr zzr = (zzr) obj;
        zzr zzr2 = (zzr) obj2;
        UUID uuid = bw3.f14720a;
        if (uuid.equals(zzr.f27412h)) {
            return !uuid.equals(zzr2.f27412h) ? 1 : 0;
        }
        return zzr.f27412h.compareTo(zzr2.f27412h);
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzs.class == obj.getClass()) {
            zzs zzs = (zzs) obj;
            return wy2.m33453p(this.f27418i, zzs.f27418i) && Arrays.equals(this.f27416g, zzs.f27416g);
        }
    }

    public final int hashCode() {
        int i;
        int i2 = this.f27417h;
        if (i2 != 0) {
            return i2;
        }
        String str = this.f27418i;
        if (str == null) {
            i = 0;
        } else {
            i = str.hashCode();
        }
        int hashCode = (i * 31) + Arrays.hashCode(this.f27416g);
        this.f27417h = hashCode;
        return hashCode;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27418i);
        parcel.writeTypedArray(this.f27416g, 0);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: com.google.android.gms.internal.ads.zzr[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private zzs(java.lang.String r1, boolean r2, com.google.android.gms.internal.ads.zzr... r3) {
        /*
            r0 = this;
            r0.<init>()
            r0.f27418i = r1
            if (r2 == 0) goto L_0x000e
            java.lang.Object r1 = r3.clone()
            r3 = r1
            com.google.android.gms.internal.ads.zzr[] r3 = (com.google.android.gms.internal.ads.zzr[]) r3
        L_0x000e:
            r0.f27416g = r3
            int r1 = r3.length
            java.util.Arrays.sort(r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzs.<init>(java.lang.String, boolean, com.google.android.gms.internal.ads.zzr[]):void");
    }

    public zzs(String str, zzr... zzrArr) {
        this((String) null, true, zzrArr);
    }

    public zzs(List<zzr> list) {
        this((String) null, false, (zzr[]) list.toArray(new zzr[0]));
    }
}
