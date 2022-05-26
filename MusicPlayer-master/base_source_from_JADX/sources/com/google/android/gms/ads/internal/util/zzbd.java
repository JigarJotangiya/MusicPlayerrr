package com.google.android.gms.ads.internal.util;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.internal.ads.d23;
import com.google.android.gms.internal.ads.nq2;
import com.google.android.gms.internal.ads.zzbew;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbd> CREATOR = new C2993f0();

    /* renamed from: g */
    public final String f10135g;

    /* renamed from: h */
    public final int f10136h;

    zzbd(String str, int i) {
        this.f10135g = str == null ? BuildConfig.FLAVOR : str;
        this.f10136h = i;
    }

    /* renamed from: Y */
    public static zzbd m13526Y(Throwable th) {
        String str;
        zzbew a = nq2.m28045a(th);
        if (d23.m22316d(th.getMessage())) {
            str = a.f27187h;
        } else {
            str = th.getMessage();
        }
        return new zzbd(str, a.f27186g);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, this.f10135g, false);
        C3315b.m14316h(parcel, 2, this.f10136h);
        C3315b.m14310b(parcel, a);
    }
}
