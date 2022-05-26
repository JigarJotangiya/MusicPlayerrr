package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcdc extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcdc> CREATOR = new eg0();

    /* renamed from: A */
    public final long f27285A;

    /* renamed from: B */
    public final String f27286B;

    /* renamed from: C */
    public final List<String> f27287C;

    /* renamed from: D */
    public final String f27288D;

    /* renamed from: E */
    public final zzbnw f27289E;

    /* renamed from: F */
    public final List<String> f27290F;

    /* renamed from: G */
    public final long f27291G;

    /* renamed from: H */
    public final String f27292H;

    /* renamed from: I */
    public final float f27293I;

    /* renamed from: J */
    public final int f27294J;

    /* renamed from: K */
    public final int f27295K;

    /* renamed from: L */
    public final boolean f27296L;

    /* renamed from: M */
    public final String f27297M;

    /* renamed from: N */
    public final boolean f27298N;

    /* renamed from: O */
    public final String f27299O;

    /* renamed from: P */
    public final boolean f27300P;

    /* renamed from: Q */
    public final int f27301Q;

    /* renamed from: R */
    public final Bundle f27302R;

    /* renamed from: S */
    public final String f27303S;

    /* renamed from: T */
    public final zzbjd f27304T;

    /* renamed from: U */
    public final boolean f27305U;

    /* renamed from: V */
    public final Bundle f27306V;

    /* renamed from: W */
    public final String f27307W;

    /* renamed from: X */
    public final String f27308X;

    /* renamed from: Y */
    public final String f27309Y;

    /* renamed from: Z */
    public final boolean f27310Z;

    /* renamed from: a0 */
    public final List<Integer> f27311a0;

    /* renamed from: b0 */
    public final String f27312b0;

    /* renamed from: c0 */
    public final List<String> f27313c0;

    /* renamed from: d0 */
    public final int f27314d0;

    /* renamed from: e0 */
    public final boolean f27315e0;

    /* renamed from: f0 */
    public final boolean f27316f0;

    /* renamed from: g */
    public final int f27317g;

    /* renamed from: g0 */
    public final boolean f27318g0;

    /* renamed from: h */
    public final Bundle f27319h;

    /* renamed from: h0 */
    public final ArrayList<String> f27320h0;

    /* renamed from: i */
    public final zzbfd f27321i;

    /* renamed from: i0 */
    public final String f27322i0;

    /* renamed from: j */
    public final zzbfi f27323j;

    /* renamed from: j0 */
    public final zzbtz f27324j0;

    /* renamed from: k */
    public final String f27325k;

    /* renamed from: k0 */
    public final String f27326k0;

    /* renamed from: l */
    public final ApplicationInfo f27327l;

    /* renamed from: l0 */
    public final Bundle f27328l0;

    /* renamed from: m */
    public final PackageInfo f27329m;

    /* renamed from: n */
    public final String f27330n;

    /* renamed from: o */
    public final String f27331o;

    /* renamed from: p */
    public final String f27332p;

    /* renamed from: q */
    public final zzcjf f27333q;

    /* renamed from: r */
    public final Bundle f27334r;

    /* renamed from: s */
    public final int f27335s;

    /* renamed from: t */
    public final List<String> f27336t;

    /* renamed from: u */
    public final Bundle f27337u;

    /* renamed from: v */
    public final boolean f27338v;

    /* renamed from: w */
    public final int f27339w;

    /* renamed from: x */
    public final int f27340x;

    /* renamed from: y */
    public final float f27341y;

    /* renamed from: z */
    public final String f27342z;

    zzcdc(int i, Bundle bundle, zzbfd zzbfd, zzbfi zzbfi, String str, ApplicationInfo applicationInfo, PackageInfo packageInfo, String str2, String str3, String str4, zzcjf zzcjf, Bundle bundle2, int i2, List<String> list, Bundle bundle3, boolean z, int i3, int i4, float f, String str5, long j, String str6, List<String> list2, String str7, zzbnw zzbnw, List<String> list3, long j2, String str8, float f2, boolean z2, int i5, int i6, boolean z3, String str9, String str10, boolean z4, int i7, Bundle bundle4, String str11, zzbjd zzbjd, boolean z5, Bundle bundle5, String str12, String str13, String str14, boolean z6, List<Integer> list4, String str15, List<String> list5, int i8, boolean z7, boolean z8, boolean z9, ArrayList<String> arrayList, String str16, zzbtz zzbtz, String str17, Bundle bundle6) {
        List<String> list6;
        List<String> list7;
        this.f27317g = i;
        this.f27319h = bundle;
        this.f27321i = zzbfd;
        this.f27323j = zzbfi;
        this.f27325k = str;
        this.f27327l = applicationInfo;
        this.f27329m = packageInfo;
        this.f27330n = str2;
        this.f27331o = str3;
        this.f27332p = str4;
        this.f27333q = zzcjf;
        this.f27334r = bundle2;
        this.f27335s = i2;
        this.f27336t = list;
        if (list3 == null) {
            list6 = Collections.emptyList();
        } else {
            list6 = Collections.unmodifiableList(list3);
        }
        this.f27290F = list6;
        this.f27337u = bundle3;
        this.f27338v = z;
        this.f27339w = i3;
        this.f27340x = i4;
        this.f27341y = f;
        this.f27342z = str5;
        this.f27285A = j;
        this.f27286B = str6;
        if (list2 == null) {
            list7 = Collections.emptyList();
        } else {
            list7 = Collections.unmodifiableList(list2);
        }
        this.f27287C = list7;
        this.f27288D = str7;
        this.f27289E = zzbnw;
        this.f27291G = j2;
        this.f27292H = str8;
        this.f27293I = f2;
        this.f27298N = z2;
        this.f27294J = i5;
        this.f27295K = i6;
        this.f27296L = z3;
        this.f27297M = str9;
        this.f27299O = str10;
        this.f27300P = z4;
        this.f27301Q = i7;
        this.f27302R = bundle4;
        this.f27303S = str11;
        this.f27304T = zzbjd;
        this.f27305U = z5;
        this.f27306V = bundle5;
        this.f27307W = str12;
        this.f27308X = str13;
        this.f27309Y = str14;
        this.f27310Z = z6;
        this.f27311a0 = list4;
        this.f27312b0 = str15;
        this.f27313c0 = list5;
        this.f27314d0 = i8;
        this.f27315e0 = z7;
        this.f27316f0 = z8;
        this.f27318g0 = z9;
        this.f27320h0 = arrayList;
        this.f27322i0 = str16;
        this.f27324j0 = zzbtz;
        this.f27326k0 = str17;
        this.f27328l0 = bundle6;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27317g);
        C3315b.m14312d(parcel, 2, this.f27319h, false);
        C3315b.m14321m(parcel, 3, this.f27321i, i, false);
        C3315b.m14321m(parcel, 4, this.f27323j, i, false);
        C3315b.m14322n(parcel, 5, this.f27325k, false);
        C3315b.m14321m(parcel, 6, this.f27327l, i, false);
        C3315b.m14321m(parcel, 7, this.f27329m, i, false);
        C3315b.m14322n(parcel, 8, this.f27330n, false);
        C3315b.m14322n(parcel, 9, this.f27331o, false);
        C3315b.m14322n(parcel, 10, this.f27332p, false);
        C3315b.m14321m(parcel, 11, this.f27333q, i, false);
        C3315b.m14312d(parcel, 12, this.f27334r, false);
        C3315b.m14316h(parcel, 13, this.f27335s);
        C3315b.m14324p(parcel, 14, this.f27336t, false);
        C3315b.m14312d(parcel, 15, this.f27337u, false);
        C3315b.m14311c(parcel, 16, this.f27338v);
        C3315b.m14316h(parcel, 18, this.f27339w);
        C3315b.m14316h(parcel, 19, this.f27340x);
        C3315b.m14314f(parcel, 20, this.f27341y);
        C3315b.m14322n(parcel, 21, this.f27342z, false);
        C3315b.m14319k(parcel, 25, this.f27285A);
        C3315b.m14322n(parcel, 26, this.f27286B, false);
        C3315b.m14324p(parcel, 27, this.f27287C, false);
        C3315b.m14322n(parcel, 28, this.f27288D, false);
        C3315b.m14321m(parcel, 29, this.f27289E, i, false);
        C3315b.m14324p(parcel, 30, this.f27290F, false);
        C3315b.m14319k(parcel, 31, this.f27291G);
        C3315b.m14322n(parcel, 33, this.f27292H, false);
        C3315b.m14314f(parcel, 34, this.f27293I);
        C3315b.m14316h(parcel, 35, this.f27294J);
        C3315b.m14316h(parcel, 36, this.f27295K);
        C3315b.m14311c(parcel, 37, this.f27296L);
        C3315b.m14322n(parcel, 39, this.f27297M, false);
        C3315b.m14311c(parcel, 40, this.f27298N);
        C3315b.m14322n(parcel, 41, this.f27299O, false);
        C3315b.m14311c(parcel, 42, this.f27300P);
        C3315b.m14316h(parcel, 43, this.f27301Q);
        C3315b.m14312d(parcel, 44, this.f27302R, false);
        C3315b.m14322n(parcel, 45, this.f27303S, false);
        C3315b.m14321m(parcel, 46, this.f27304T, i, false);
        C3315b.m14311c(parcel, 47, this.f27305U);
        C3315b.m14312d(parcel, 48, this.f27306V, false);
        C3315b.m14322n(parcel, 49, this.f27307W, false);
        C3315b.m14322n(parcel, 50, this.f27308X, false);
        C3315b.m14322n(parcel, 51, this.f27309Y, false);
        C3315b.m14311c(parcel, 52, this.f27310Z);
        C3315b.m14318j(parcel, 53, this.f27311a0, false);
        C3315b.m14322n(parcel, 54, this.f27312b0, false);
        C3315b.m14324p(parcel, 55, this.f27313c0, false);
        C3315b.m14316h(parcel, 56, this.f27314d0);
        C3315b.m14311c(parcel, 57, this.f27315e0);
        C3315b.m14311c(parcel, 58, this.f27316f0);
        C3315b.m14311c(parcel, 59, this.f27318g0);
        C3315b.m14324p(parcel, 60, this.f27320h0, false);
        C3315b.m14322n(parcel, 61, this.f27322i0, false);
        C3315b.m14321m(parcel, 63, this.f27324j0, i, false);
        C3315b.m14322n(parcel, 64, this.f27326k0, false);
        C3315b.m14312d(parcel, 65, this.f27328l0, false);
        C3315b.m14310b(parcel, a);
    }
}
