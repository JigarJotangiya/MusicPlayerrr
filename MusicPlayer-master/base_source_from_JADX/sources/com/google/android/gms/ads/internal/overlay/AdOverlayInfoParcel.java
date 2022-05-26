package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.internal.util.C3041u0;
import com.google.android.gms.ads.internal.zzj;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.internal.ads.C5497qt;
import com.google.android.gms.internal.ads.gt1;
import com.google.android.gms.internal.ads.gu2;
import com.google.android.gms.internal.ads.pr0;
import com.google.android.gms.internal.ads.s81;
import com.google.android.gms.internal.ads.x40;
import com.google.android.gms.internal.ads.y12;
import com.google.android.gms.internal.ads.yf1;
import com.google.android.gms.internal.ads.z40;
import com.google.android.gms.internal.ads.zzcjf;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new C2957p();

    /* renamed from: A */
    public final C3041u0 f9845A;
    @RecentlyNonNull

    /* renamed from: B */
    public final String f9846B;
    @RecentlyNonNull

    /* renamed from: C */
    public final String f9847C;

    /* renamed from: D */
    public final s81 f9848D;

    /* renamed from: E */
    public final yf1 f9849E;

    /* renamed from: g */
    public final zzc f9850g;

    /* renamed from: h */
    public final C5497qt f9851h;

    /* renamed from: i */
    public final C2958q f9852i;

    /* renamed from: j */
    public final pr0 f9853j;

    /* renamed from: k */
    public final z40 f9854k;
    @RecentlyNonNull

    /* renamed from: l */
    public final String f9855l;

    /* renamed from: m */
    public final boolean f9856m;
    @RecentlyNonNull

    /* renamed from: n */
    public final String f9857n;

    /* renamed from: o */
    public final C2966y f9858o;

    /* renamed from: p */
    public final int f9859p;

    /* renamed from: q */
    public final int f9860q;
    @RecentlyNonNull

    /* renamed from: r */
    public final String f9861r;

    /* renamed from: s */
    public final zzcjf f9862s;
    @RecentlyNonNull

    /* renamed from: t */
    public final String f9863t;

    /* renamed from: u */
    public final zzj f9864u;

    /* renamed from: v */
    public final x40 f9865v;
    @RecentlyNonNull

    /* renamed from: w */
    public final String f9866w;

    /* renamed from: x */
    public final y12 f9867x;

    /* renamed from: y */
    public final gt1 f9868y;

    /* renamed from: z */
    public final gu2 f9869z;

    public AdOverlayInfoParcel(C5497qt qtVar, C2958q qVar, x40 x40, z40 z40, C2966y yVar, pr0 pr0, boolean z, int i, String str, zzcjf zzcjf, yf1 yf1) {
        this.f9850g = null;
        this.f9851h = qtVar;
        this.f9852i = qVar;
        this.f9853j = pr0;
        this.f9865v = x40;
        this.f9854k = z40;
        this.f9855l = null;
        this.f9856m = z;
        this.f9857n = null;
        this.f9858o = yVar;
        this.f9859p = i;
        this.f9860q = 3;
        this.f9861r = str;
        this.f9862s = zzcjf;
        this.f9863t = null;
        this.f9864u = null;
        this.f9866w = null;
        this.f9846B = null;
        this.f9867x = null;
        this.f9868y = null;
        this.f9869z = null;
        this.f9845A = null;
        this.f9847C = null;
        this.f9848D = null;
        this.f9849E = yf1;
    }

    @RecentlyNonNull
    /* renamed from: Y */
    public static AdOverlayInfoParcel m13079Y(@RecentlyNonNull Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14321m(parcel, 2, this.f9850g, i, false);
        C3315b.m14315g(parcel, 3, C4865b.m20503f2(this.f9851h).asBinder(), false);
        C3315b.m14315g(parcel, 4, C4865b.m20503f2(this.f9852i).asBinder(), false);
        C3315b.m14315g(parcel, 5, C4865b.m20503f2(this.f9853j).asBinder(), false);
        C3315b.m14315g(parcel, 6, C4865b.m20503f2(this.f9854k).asBinder(), false);
        C3315b.m14322n(parcel, 7, this.f9855l, false);
        C3315b.m14311c(parcel, 8, this.f9856m);
        C3315b.m14322n(parcel, 9, this.f9857n, false);
        C3315b.m14315g(parcel, 10, C4865b.m20503f2(this.f9858o).asBinder(), false);
        C3315b.m14316h(parcel, 11, this.f9859p);
        C3315b.m14316h(parcel, 12, this.f9860q);
        C3315b.m14322n(parcel, 13, this.f9861r, false);
        C3315b.m14321m(parcel, 14, this.f9862s, i, false);
        C3315b.m14322n(parcel, 16, this.f9863t, false);
        C3315b.m14321m(parcel, 17, this.f9864u, i, false);
        C3315b.m14315g(parcel, 18, C4865b.m20503f2(this.f9865v).asBinder(), false);
        C3315b.m14322n(parcel, 19, this.f9866w, false);
        C3315b.m14315g(parcel, 20, C4865b.m20503f2(this.f9867x).asBinder(), false);
        C3315b.m14315g(parcel, 21, C4865b.m20503f2(this.f9868y).asBinder(), false);
        C3315b.m14315g(parcel, 22, C4865b.m20503f2(this.f9869z).asBinder(), false);
        C3315b.m14315g(parcel, 23, C4865b.m20503f2(this.f9845A).asBinder(), false);
        C3315b.m14322n(parcel, 24, this.f9846B, false);
        C3315b.m14322n(parcel, 25, this.f9847C, false);
        C3315b.m14315g(parcel, 26, C4865b.m20503f2(this.f9848D).asBinder(), false);
        C3315b.m14315g(parcel, 27, C4865b.m20503f2(this.f9849E).asBinder(), false);
        C3315b.m14310b(parcel, a);
    }

    public AdOverlayInfoParcel(C5497qt qtVar, C2958q qVar, x40 x40, z40 z40, C2966y yVar, pr0 pr0, boolean z, int i, String str, String str2, zzcjf zzcjf, yf1 yf1) {
        this.f9850g = null;
        this.f9851h = qtVar;
        this.f9852i = qVar;
        this.f9853j = pr0;
        this.f9865v = x40;
        this.f9854k = z40;
        this.f9855l = str2;
        this.f9856m = z;
        this.f9857n = str;
        this.f9858o = yVar;
        this.f9859p = i;
        this.f9860q = 3;
        this.f9861r = null;
        this.f9862s = zzcjf;
        this.f9863t = null;
        this.f9864u = null;
        this.f9866w = null;
        this.f9846B = null;
        this.f9867x = null;
        this.f9868y = null;
        this.f9869z = null;
        this.f9845A = null;
        this.f9847C = null;
        this.f9848D = null;
        this.f9849E = yf1;
    }

    public AdOverlayInfoParcel(C5497qt qtVar, C2958q qVar, C2966y yVar, pr0 pr0, int i, zzcjf zzcjf, String str, zzj zzj, String str2, String str3, String str4, s81 s81) {
        this.f9850g = null;
        this.f9851h = null;
        this.f9852i = qVar;
        this.f9853j = pr0;
        this.f9865v = null;
        this.f9854k = null;
        this.f9855l = str2;
        this.f9856m = false;
        this.f9857n = str3;
        this.f9858o = null;
        this.f9859p = i;
        this.f9860q = 1;
        this.f9861r = null;
        this.f9862s = zzcjf;
        this.f9863t = str;
        this.f9864u = zzj;
        this.f9866w = null;
        this.f9846B = null;
        this.f9867x = null;
        this.f9868y = null;
        this.f9869z = null;
        this.f9845A = null;
        this.f9847C = str4;
        this.f9848D = s81;
        this.f9849E = null;
    }

    public AdOverlayInfoParcel(C5497qt qtVar, C2958q qVar, C2966y yVar, pr0 pr0, boolean z, int i, zzcjf zzcjf, yf1 yf1) {
        this.f9850g = null;
        this.f9851h = qtVar;
        this.f9852i = qVar;
        this.f9853j = pr0;
        this.f9865v = null;
        this.f9854k = null;
        this.f9855l = null;
        this.f9856m = z;
        this.f9857n = null;
        this.f9858o = yVar;
        this.f9859p = i;
        this.f9860q = 2;
        this.f9861r = null;
        this.f9862s = zzcjf;
        this.f9863t = null;
        this.f9864u = null;
        this.f9866w = null;
        this.f9846B = null;
        this.f9867x = null;
        this.f9868y = null;
        this.f9869z = null;
        this.f9845A = null;
        this.f9847C = null;
        this.f9848D = null;
        this.f9849E = yf1;
    }

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzcjf zzcjf, String str4, zzj zzj, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6, String str7, IBinder iBinder11, IBinder iBinder12) {
        this.f9850g = zzc;
        this.f9851h = (C5497qt) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder));
        this.f9852i = (C2958q) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder2));
        this.f9853j = (pr0) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder3));
        this.f9865v = (x40) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder6));
        this.f9854k = (z40) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder4));
        this.f9855l = str;
        this.f9856m = z;
        this.f9857n = str2;
        this.f9858o = (C2966y) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder5));
        this.f9859p = i;
        this.f9860q = i2;
        this.f9861r = str3;
        this.f9862s = zzcjf;
        this.f9863t = str4;
        this.f9864u = zzj;
        this.f9866w = str5;
        this.f9846B = str6;
        this.f9867x = (y12) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder7));
        this.f9868y = (gt1) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder8));
        this.f9869z = (gu2) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder9));
        this.f9845A = (C3041u0) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder10));
        this.f9847C = str7;
        this.f9848D = (s81) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder11));
        this.f9849E = (yf1) C4865b.m20502K0(C4863a.C4864a.m20501C0(iBinder12));
    }

    public AdOverlayInfoParcel(zzc zzc, C5497qt qtVar, C2958q qVar, C2966y yVar, zzcjf zzcjf, pr0 pr0, yf1 yf1) {
        this.f9850g = zzc;
        this.f9851h = qtVar;
        this.f9852i = qVar;
        this.f9853j = pr0;
        this.f9865v = null;
        this.f9854k = null;
        this.f9855l = null;
        this.f9856m = false;
        this.f9857n = null;
        this.f9858o = yVar;
        this.f9859p = -1;
        this.f9860q = 4;
        this.f9861r = null;
        this.f9862s = zzcjf;
        this.f9863t = null;
        this.f9864u = null;
        this.f9866w = null;
        this.f9846B = null;
        this.f9867x = null;
        this.f9868y = null;
        this.f9869z = null;
        this.f9845A = null;
        this.f9847C = null;
        this.f9848D = null;
        this.f9849E = yf1;
    }

    public AdOverlayInfoParcel(C2958q qVar, pr0 pr0, int i, zzcjf zzcjf) {
        this.f9852i = qVar;
        this.f9853j = pr0;
        this.f9859p = 1;
        this.f9862s = zzcjf;
        this.f9850g = null;
        this.f9851h = null;
        this.f9865v = null;
        this.f9854k = null;
        this.f9855l = null;
        this.f9856m = false;
        this.f9857n = null;
        this.f9858o = null;
        this.f9860q = 1;
        this.f9861r = null;
        this.f9863t = null;
        this.f9864u = null;
        this.f9866w = null;
        this.f9846B = null;
        this.f9867x = null;
        this.f9868y = null;
        this.f9869z = null;
        this.f9845A = null;
        this.f9847C = null;
        this.f9848D = null;
        this.f9849E = null;
    }

    public AdOverlayInfoParcel(pr0 pr0, zzcjf zzcjf, C3041u0 u0Var, y12 y12, gt1 gt1, gu2 gu2, String str, String str2, int i) {
        this.f9850g = null;
        this.f9851h = null;
        this.f9852i = null;
        this.f9853j = pr0;
        this.f9865v = null;
        this.f9854k = null;
        this.f9855l = null;
        this.f9856m = false;
        this.f9857n = null;
        this.f9858o = null;
        this.f9859p = i;
        this.f9860q = 5;
        this.f9861r = null;
        this.f9862s = zzcjf;
        this.f9863t = null;
        this.f9864u = null;
        this.f9866w = str;
        this.f9846B = str2;
        this.f9867x = y12;
        this.f9868y = gt1;
        this.f9869z = gu2;
        this.f9845A = u0Var;
        this.f9847C = null;
        this.f9848D = null;
        this.f9849E = null;
    }
}
