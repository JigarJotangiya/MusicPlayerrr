package com.google.android.gms.internal.ads;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbfd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbfd> CREATOR = new C4942bu();

    /* renamed from: A */
    public final String f27191A;

    /* renamed from: B */
    public final List<String> f27192B;

    /* renamed from: C */
    public final int f27193C;

    /* renamed from: D */
    public final String f27194D;

    /* renamed from: g */
    public final int f27195g;
    @Deprecated

    /* renamed from: h */
    public final long f27196h;

    /* renamed from: i */
    public final Bundle f27197i;
    @Deprecated

    /* renamed from: j */
    public final int f27198j;

    /* renamed from: k */
    public final List<String> f27199k;

    /* renamed from: l */
    public final boolean f27200l;

    /* renamed from: m */
    public final int f27201m;

    /* renamed from: n */
    public final boolean f27202n;

    /* renamed from: o */
    public final String f27203o;

    /* renamed from: p */
    public final zzbkm f27204p;

    /* renamed from: q */
    public final Location f27205q;

    /* renamed from: r */
    public final String f27206r;

    /* renamed from: s */
    public final Bundle f27207s;

    /* renamed from: t */
    public final Bundle f27208t;

    /* renamed from: u */
    public final List<String> f27209u;

    /* renamed from: v */
    public final String f27210v;

    /* renamed from: w */
    public final String f27211w;
    @Deprecated

    /* renamed from: x */
    public final boolean f27212x;

    /* renamed from: y */
    public final zzbeu f27213y;

    /* renamed from: z */
    public final int f27214z;

    public zzbfd(int i, long j, Bundle bundle, int i2, List<String> list, boolean z, int i3, boolean z2, String str, zzbkm zzbkm, Location location, String str2, Bundle bundle2, Bundle bundle3, List<String> list2, String str3, String str4, boolean z3, zzbeu zzbeu, int i4, String str5, List<String> list3, int i5, String str6) {
        this.f27195g = i;
        this.f27196h = j;
        this.f27197i = bundle == null ? new Bundle() : bundle;
        this.f27198j = i2;
        this.f27199k = list;
        this.f27200l = z;
        this.f27201m = i3;
        this.f27202n = z2;
        this.f27203o = str;
        this.f27204p = zzbkm;
        this.f27205q = location;
        this.f27206r = str2;
        this.f27207s = bundle2 == null ? new Bundle() : bundle2;
        this.f27208t = bundle3;
        this.f27209u = list2;
        this.f27210v = str3;
        this.f27211w = str4;
        this.f27212x = z3;
        this.f27213y = zzbeu;
        this.f27214z = i4;
        this.f27191A = str5;
        this.f27192B = list3 == null ? new ArrayList<>() : list3;
        this.f27193C = i5;
        this.f27194D = str6;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfd)) {
            return false;
        }
        zzbfd zzbfd = (zzbfd) obj;
        if (this.f27195g != zzbfd.f27195g || this.f27196h != zzbfd.f27196h || !wl0.m33225a(this.f27197i, zzbfd.f27197i) || this.f27198j != zzbfd.f27198j || !C3289k.m14227a(this.f27199k, zzbfd.f27199k) || this.f27200l != zzbfd.f27200l || this.f27201m != zzbfd.f27201m || this.f27202n != zzbfd.f27202n || !C3289k.m14227a(this.f27203o, zzbfd.f27203o) || !C3289k.m14227a(this.f27204p, zzbfd.f27204p) || !C3289k.m14227a(this.f27205q, zzbfd.f27205q) || !C3289k.m14227a(this.f27206r, zzbfd.f27206r) || !wl0.m33225a(this.f27207s, zzbfd.f27207s) || !wl0.m33225a(this.f27208t, zzbfd.f27208t) || !C3289k.m14227a(this.f27209u, zzbfd.f27209u) || !C3289k.m14227a(this.f27210v, zzbfd.f27210v) || !C3289k.m14227a(this.f27211w, zzbfd.f27211w) || this.f27212x != zzbfd.f27212x || this.f27214z != zzbfd.f27214z || !C3289k.m14227a(this.f27191A, zzbfd.f27191A) || !C3289k.m14227a(this.f27192B, zzbfd.f27192B) || this.f27193C != zzbfd.f27193C || !C3289k.m14227a(this.f27194D, zzbfd.f27194D)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C3289k.m14228b(Integer.valueOf(this.f27195g), Long.valueOf(this.f27196h), this.f27197i, Integer.valueOf(this.f27198j), this.f27199k, Boolean.valueOf(this.f27200l), Integer.valueOf(this.f27201m), Boolean.valueOf(this.f27202n), this.f27203o, this.f27204p, this.f27205q, this.f27206r, this.f27207s, this.f27208t, this.f27209u, this.f27210v, this.f27211w, Boolean.valueOf(this.f27212x), Integer.valueOf(this.f27214z), this.f27191A, this.f27192B, Integer.valueOf(this.f27193C), this.f27194D);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27195g);
        C3315b.m14319k(parcel, 2, this.f27196h);
        C3315b.m14312d(parcel, 3, this.f27197i, false);
        C3315b.m14316h(parcel, 4, this.f27198j);
        C3315b.m14324p(parcel, 5, this.f27199k, false);
        C3315b.m14311c(parcel, 6, this.f27200l);
        C3315b.m14316h(parcel, 7, this.f27201m);
        C3315b.m14311c(parcel, 8, this.f27202n);
        C3315b.m14322n(parcel, 9, this.f27203o, false);
        C3315b.m14321m(parcel, 10, this.f27204p, i, false);
        C3315b.m14321m(parcel, 11, this.f27205q, i, false);
        C3315b.m14322n(parcel, 12, this.f27206r, false);
        C3315b.m14312d(parcel, 13, this.f27207s, false);
        C3315b.m14312d(parcel, 14, this.f27208t, false);
        C3315b.m14324p(parcel, 15, this.f27209u, false);
        C3315b.m14322n(parcel, 16, this.f27210v, false);
        C3315b.m14322n(parcel, 17, this.f27211w, false);
        C3315b.m14311c(parcel, 18, this.f27212x);
        C3315b.m14321m(parcel, 19, this.f27213y, i, false);
        C3315b.m14316h(parcel, 20, this.f27214z);
        C3315b.m14322n(parcel, 21, this.f27191A, false);
        C3315b.m14324p(parcel, 22, this.f27192B, false);
        C3315b.m14316h(parcel, 23, this.f27193C);
        C3315b.m14322n(parcel, 24, this.f27194D, false);
        C3315b.m14310b(parcel, a);
    }
}
