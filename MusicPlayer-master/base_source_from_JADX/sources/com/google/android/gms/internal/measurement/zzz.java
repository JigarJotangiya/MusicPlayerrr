package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.3 */
public final class zzz extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzz> CREATOR = new C5840b();

    /* renamed from: g */
    public final long f27576g;

    /* renamed from: h */
    public final long f27577h;

    /* renamed from: i */
    public final boolean f27578i;

    /* renamed from: j */
    public final String f27579j;

    /* renamed from: k */
    public final String f27580k;

    /* renamed from: l */
    public final String f27581l;

    /* renamed from: m */
    public final Bundle f27582m;

    /* renamed from: n */
    public final String f27583n;

    public zzz(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f27576g = j;
        this.f27577h = j2;
        this.f27578i = z;
        this.f27579j = str;
        this.f27580k = str2;
        this.f27581l = str3;
        this.f27582m = bundle;
        this.f27583n = str4;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14319k(parcel, 1, this.f27576g);
        C3315b.m14319k(parcel, 2, this.f27577h);
        C3315b.m14311c(parcel, 3, this.f27578i);
        C3315b.m14322n(parcel, 4, this.f27579j, false);
        C3315b.m14322n(parcel, 5, this.f27580k, false);
        C3315b.m14322n(parcel, 6, this.f27581l, false);
        C3315b.m14312d(parcel, 7, this.f27582m, false);
        C3315b.m14322n(parcel, 8, this.f27583n, false);
        C3315b.m14310b(parcel, a);
    }
}
