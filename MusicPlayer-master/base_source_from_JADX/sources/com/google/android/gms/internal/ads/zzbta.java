package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbta extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbta> CREATOR = new x60();

    /* renamed from: g */
    public final String f27256g;

    /* renamed from: h */
    public final String[] f27257h;

    /* renamed from: i */
    public final String[] f27258i;

    zzbta(String str, String[] strArr, String[] strArr2) {
        this.f27256g = str;
        this.f27257h = strArr;
        this.f27258i = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f27256g, false);
        C3315b.m14323o(parcel, 2, this.f27257h, false);
        C3315b.m14323o(parcel, 3, this.f27258i, false);
        C3315b.m14310b(parcel, a);
    }
}
