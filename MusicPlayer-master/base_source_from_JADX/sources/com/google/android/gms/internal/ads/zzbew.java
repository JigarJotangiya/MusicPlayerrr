package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.C2851a;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.C3112s;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzbew extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbew> CREATOR = new C5608tt();

    /* renamed from: g */
    public final int f27186g;

    /* renamed from: h */
    public final String f27187h;

    /* renamed from: i */
    public final String f27188i;

    /* renamed from: j */
    public zzbew f27189j;

    /* renamed from: k */
    public IBinder f27190k;

    public zzbew(int i, String str, String str2, zzbew zzbew, IBinder iBinder) {
        this.f27186g = i;
        this.f27187h = str;
        this.f27188i = str2;
        this.f27189j = zzbew;
        this.f27190k = iBinder;
    }

    /* renamed from: Y */
    public final C2851a mo22533Y() {
        zzbew zzbew = this.f27189j;
        return new C2851a(this.f27186g, this.f27187h, this.f27188i, zzbew == null ? null : new C2851a(zzbew.f27186g, zzbew.f27187h, zzbew.f27188i));
    }

    /* renamed from: m0 */
    public final C3060l mo22534m0() {
        C2851a aVar;
        zzbew zzbew = this.f27189j;
        C5316lx lxVar = null;
        if (zzbew == null) {
            aVar = null;
        } else {
            aVar = new C2851a(zzbew.f27186g, zzbew.f27187h, zzbew.f27188i);
        }
        int i = this.f27186g;
        String str = this.f27187h;
        String str2 = this.f27188i;
        IBinder iBinder = this.f27190k;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IResponseInfo");
            lxVar = queryLocalInterface instanceof C5316lx ? (C5316lx) queryLocalInterface : new C5242jx(iBinder);
        }
        return new C3060l(i, str, str2, aVar, C3112s.m13667c(lxVar));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27186g);
        C3315b.m14322n(parcel, 2, this.f27187h, false);
        C3315b.m14322n(parcel, 3, this.f27188i, false);
        C3315b.m14321m(parcel, 4, this.f27189j, i, false);
        C3315b.m14315g(parcel, 5, this.f27190k, false);
        C3315b.m14310b(parcel, a);
    }
}
