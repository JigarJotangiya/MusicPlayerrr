package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcdq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdq> CREATOR = new pg0();

    /* renamed from: g */
    public final Bundle f27348g;

    /* renamed from: h */
    public final zzcjf f27349h;

    /* renamed from: i */
    public final ApplicationInfo f27350i;

    /* renamed from: j */
    public final String f27351j;

    /* renamed from: k */
    public final List<String> f27352k;

    /* renamed from: l */
    public final PackageInfo f27353l;

    /* renamed from: m */
    public final String f27354m;

    /* renamed from: n */
    public final String f27355n;

    /* renamed from: o */
    public zzffu f27356o;

    /* renamed from: p */
    public String f27357p;

    public zzcdq(Bundle bundle, zzcjf zzcjf, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, String str2, String str3, zzffu zzffu, String str4) {
        this.f27348g = bundle;
        this.f27349h = zzcjf;
        this.f27351j = str;
        this.f27350i = applicationInfo;
        this.f27352k = list;
        this.f27353l = packageInfo;
        this.f27354m = str2;
        this.f27355n = str3;
        this.f27356o = zzffu;
        this.f27357p = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14312d(parcel, 1, this.f27348g, false);
        C3315b.m14321m(parcel, 2, this.f27349h, i, false);
        C3315b.m14321m(parcel, 3, this.f27350i, i, false);
        C3315b.m14322n(parcel, 4, this.f27351j, false);
        C3315b.m14324p(parcel, 5, this.f27352k, false);
        C3315b.m14321m(parcel, 6, this.f27353l, i, false);
        C3315b.m14322n(parcel, 7, this.f27354m, false);
        C3315b.m14322n(parcel, 9, this.f27355n, false);
        C3315b.m14321m(parcel, 10, this.f27356o, i, false);
        C3315b.m14322n(parcel, 11, this.f27357p, false);
        C3315b.m14310b(parcel, a);
    }
}
