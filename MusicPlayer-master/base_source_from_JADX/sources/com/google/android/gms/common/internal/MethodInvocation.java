package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class MethodInvocation extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<MethodInvocation> CREATOR = new C3259c0();

    /* renamed from: g */
    private final int f10552g;

    /* renamed from: h */
    private final int f10553h;

    /* renamed from: i */
    private final int f10554i;

    /* renamed from: j */
    private final long f10555j;

    /* renamed from: k */
    private final long f10556k;

    /* renamed from: l */
    private final String f10557l;

    /* renamed from: m */
    private final String f10558m;

    /* renamed from: n */
    private final int f10559n;

    public MethodInvocation(int i, int i2, int i3, long j, long j2, String str, String str2, int i4) {
        this.f10552g = i;
        this.f10553h = i2;
        this.f10554i = i3;
        this.f10555j = j;
        this.f10556k = j2;
        this.f10557l = str;
        this.f10558m = str2;
        this.f10559n = i4;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10552g);
        C3315b.m14316h(parcel, 2, this.f10553h);
        C3315b.m14316h(parcel, 3, this.f10554i);
        C3315b.m14319k(parcel, 4, this.f10555j);
        C3315b.m14319k(parcel, 5, this.f10556k);
        C3315b.m14322n(parcel, 6, this.f10557l, false);
        C3315b.m14322n(parcel, 7, this.f10558m, false);
        C3315b.m14316h(parcel, 8, this.f10559n);
        C3315b.m14310b(parcel, a);
    }
}
