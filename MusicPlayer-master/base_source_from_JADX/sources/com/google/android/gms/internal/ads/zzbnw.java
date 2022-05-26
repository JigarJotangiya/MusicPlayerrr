package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.ads.formats.C2908c;
import com.google.android.gms.ads.nativead.C3102b;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbnw extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbnw> CREATOR = new f20();

    /* renamed from: g */
    public final int f27248g;

    /* renamed from: h */
    public final boolean f27249h;

    /* renamed from: i */
    public final int f27250i;

    /* renamed from: j */
    public final boolean f27251j;

    /* renamed from: k */
    public final int f27252k;

    /* renamed from: l */
    public final zzbkq f27253l;

    /* renamed from: m */
    public final boolean f27254m;

    /* renamed from: n */
    public final int f27255n;

    public zzbnw(int i, boolean z, int i2, boolean z2, int i3, zzbkq zzbkq, boolean z3, int i4) {
        this.f27248g = i;
        this.f27249h = z;
        this.f27250i = i2;
        this.f27251j = z2;
        this.f27252k = i3;
        this.f27253l = zzbkq;
        this.f27254m = z3;
        this.f27255n = i4;
    }

    /* renamed from: Y */
    public static C3102b m34958Y(zzbnw zzbnw) {
        C3102b.C3103a aVar = new C3102b.C3103a();
        if (zzbnw == null) {
            return aVar.mo11331a();
        }
        int i = zzbnw.f27248g;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    aVar.mo11334d(zzbnw.f27254m);
                    aVar.mo11333c(zzbnw.f27255n);
                }
                aVar.mo11336f(zzbnw.f27249h);
                aVar.mo11335e(zzbnw.f27251j);
                return aVar.mo11331a();
            }
            zzbkq zzbkq = zzbnw.f27253l;
            if (zzbkq != null) {
                aVar.mo11337g(new C3116u(zzbkq));
            }
        }
        aVar.mo11332b(zzbnw.f27252k);
        aVar.mo11336f(zzbnw.f27249h);
        aVar.mo11335e(zzbnw.f27251j);
        return aVar.mo11331a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27248g);
        C3315b.m14311c(parcel, 2, this.f27249h);
        C3315b.m14316h(parcel, 3, this.f27250i);
        C3315b.m14311c(parcel, 4, this.f27251j);
        C3315b.m14316h(parcel, 5, this.f27252k);
        C3315b.m14321m(parcel, 6, this.f27253l, i, false);
        C3315b.m14311c(parcel, 7, this.f27254m);
        C3315b.m14316h(parcel, 8, this.f27255n);
        C3315b.m14310b(parcel, a);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzbnw(C2908c cVar) {
        this(4, cVar.mo10762f(), cVar.mo10758b(), cVar.mo10761e(), cVar.mo10757a(), cVar.mo10760d() != null ? new zzbkq(cVar.mo10760d()) : null, cVar.mo10763g(), cVar.mo10759c());
    }
}
