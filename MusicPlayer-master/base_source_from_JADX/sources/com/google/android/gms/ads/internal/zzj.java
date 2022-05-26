package com.google.android.gms.ads.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new C2934j();

    /* renamed from: g */
    public final boolean f10137g;

    /* renamed from: h */
    public final boolean f10138h;

    /* renamed from: i */
    public final String f10139i;

    /* renamed from: j */
    public final boolean f10140j;

    /* renamed from: k */
    public final float f10141k;

    /* renamed from: l */
    public final int f10142l;

    /* renamed from: m */
    public final boolean f10143m;

    /* renamed from: n */
    public final boolean f10144n;

    /* renamed from: o */
    public final boolean f10145o;

    zzj(boolean z, boolean z2, String str, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this.f10137g = z;
        this.f10138h = z2;
        this.f10139i = str;
        this.f10140j = z3;
        this.f10141k = f;
        this.f10142l = i;
        this.f10143m = z4;
        this.f10144n = z5;
        this.f10145o = z6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 2, this.f10137g);
        C3315b.m14311c(parcel, 3, this.f10138h);
        C3315b.m14322n(parcel, 4, this.f10139i, false);
        C3315b.m14311c(parcel, 5, this.f10140j);
        C3315b.m14314f(parcel, 6, this.f10141k);
        C3315b.m14316h(parcel, 7, this.f10142l);
        C3315b.m14311c(parcel, 8, this.f10143m);
        C3315b.m14311c(parcel, 9, this.f10144n);
        C3315b.m14311c(parcel, 10, this.f10145o);
        C3315b.m14310b(parcel, a);
    }

    public zzj(boolean z, boolean z2, boolean z3, float f, int i, boolean z4, boolean z5, boolean z6) {
        this(z, z2, (String) null, z3, f, -1, z4, z5, z6);
    }
}
