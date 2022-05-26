package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcjf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcjf> CREATOR = new bm0();

    /* renamed from: g */
    public String f27376g;

    /* renamed from: h */
    public int f27377h;

    /* renamed from: i */
    public int f27378i;

    /* renamed from: j */
    public boolean f27379j;

    /* renamed from: k */
    public boolean f27380k;

    public zzcjf(int i, int i2, boolean z, boolean z2) {
        this(214106000, i2, true, false, false);
    }

    /* renamed from: Y */
    public static zzcjf m34965Y() {
        return new zzcjf((int) C3245g.f10501a, (int) C3245g.f10501a, true, false, false);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 2, this.f27376g, false);
        C3315b.m14316h(parcel, 3, this.f27377h);
        C3315b.m14316h(parcel, 4, this.f27378i);
        C3315b.m14311c(parcel, 5, this.f27379j);
        C3315b.m14311c(parcel, 6, this.f27380k);
        C3315b.m14310b(parcel, a);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzcjf(int r8, int r9, boolean r10, boolean r11, boolean r12) {
        /*
            r7 = this;
            if (r10 == 0) goto L_0x0005
            java.lang.String r11 = "0"
            goto L_0x0007
        L_0x0005:
            java.lang.String r11 = "1"
        L_0x0007:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            int r0 = r11.length()
            int r0 = r0 + 36
            r12.<init>(r0)
            java.lang.String r0 = "afma-sdk-a-v"
            r12.append(r0)
            r12.append(r8)
            java.lang.String r0 = "."
            r12.append(r0)
            r12.append(r9)
            r12.append(r0)
            r12.append(r11)
            java.lang.String r2 = r12.toString()
            r6 = 0
            r1 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r1.<init>((java.lang.String) r2, (int) r3, (int) r4, (boolean) r5, (boolean) r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcjf.<init>(int, int, boolean, boolean, boolean):void");
    }

    zzcjf(String str, int i, int i2, boolean z, boolean z2) {
        this.f27376g = str;
        this.f27377h = i;
        this.f27378i = i2;
        this.f27379j = z;
        this.f27380k = z2;
    }
}
