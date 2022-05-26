package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzzb implements zzdc {
    public static final Parcelable.Creator<zzzb> CREATOR = new kb4();

    /* renamed from: g */
    public final String f27438g;

    /* renamed from: h */
    public final String f27439h;

    zzzb(Parcel parcel) {
        String readString = parcel.readString();
        int i = wy2.f25579a;
        this.f27438g = readString;
        this.f27439h = parcel.readString();
    }

    public zzzb(String str, String str2) {
        this.f27438g = str;
        this.f27439h = str2;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo22456E(com.google.android.gms.internal.ads.C5828zq r7) {
        /*
            r6 = this;
            java.lang.String r0 = r6.f27438g
            int r1 = r0.hashCode()
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            switch(r1) {
                case 62359119: goto L_0x0036;
                case 79833656: goto L_0x002c;
                case 428414940: goto L_0x0022;
                case 1746739798: goto L_0x0018;
                case 1939198791: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x0040
        L_0x000e:
            java.lang.String r1 = "ARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 1
            goto L_0x0041
        L_0x0018:
            java.lang.String r1 = "ALBUMARTIST"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 3
            goto L_0x0041
        L_0x0022:
            java.lang.String r1 = "DESCRIPTION"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 4
            goto L_0x0041
        L_0x002c:
            java.lang.String r1 = "TITLE"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 0
            goto L_0x0041
        L_0x0036:
            java.lang.String r1 = "ALBUM"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0040
            r0 = 2
            goto L_0x0041
        L_0x0040:
            r0 = -1
        L_0x0041:
            if (r0 == 0) goto L_0x0064
            if (r0 == r5) goto L_0x005e
            if (r0 == r4) goto L_0x0058
            if (r0 == r3) goto L_0x0052
            if (r0 == r2) goto L_0x004c
            return
        L_0x004c:
            java.lang.String r0 = r6.f27439h
            r7.mo22409q(r0)
            return
        L_0x0052:
            java.lang.String r0 = r6.f27439h
            r7.mo22404l(r0)
            return
        L_0x0058:
            java.lang.String r0 = r6.f27439h
            r7.mo22405m(r0)
            return
        L_0x005e:
            java.lang.String r0 = r6.f27439h
            r7.mo22406n(r0)
            return
        L_0x0064:
            java.lang.String r0 = r6.f27439h
            r7.mo22416x(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzzb.mo22456E(com.google.android.gms.internal.ads.zq):void");
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzzb.class == obj.getClass()) {
            zzzb zzzb = (zzzb) obj;
            return this.f27438g.equals(zzzb.f27438g) && this.f27439h.equals(zzzb.f27439h);
        }
    }

    public final int hashCode() {
        return ((this.f27438g.hashCode() + 527) * 31) + this.f27439h.hashCode();
    }

    public final String toString() {
        String str = this.f27438g;
        String str2 = this.f27439h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append("VC: ");
        sb.append(str);
        sb.append("=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f27438g);
        parcel.writeString(this.f27439h);
    }
}
