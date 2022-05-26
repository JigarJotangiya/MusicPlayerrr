package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzffu extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzffu> CREATOR = new kr2();

    /* renamed from: g */
    private final hr2[] f27382g;

    /* renamed from: h */
    public final Context f27383h;

    /* renamed from: i */
    private final int f27384i;

    /* renamed from: j */
    public final hr2 f27385j;

    /* renamed from: k */
    public final int f27386k;

    /* renamed from: l */
    public final int f27387l;

    /* renamed from: m */
    public final int f27388m;

    /* renamed from: n */
    public final String f27389n;

    /* renamed from: o */
    private final int f27390o;

    /* renamed from: p */
    private final int f27391p;

    /* renamed from: q */
    private final int[] f27392q;

    /* renamed from: r */
    private final int[] f27393r;

    /* renamed from: s */
    public final int f27394s;

    public zzffu(int i, int i2, int i3, int i4, String str, int i5, int i6) {
        hr2[] values = hr2.values();
        this.f27382g = values;
        int[] a = ir2.m25380a();
        this.f27392q = a;
        int[] a2 = jr2.m25827a();
        this.f27393r = a2;
        this.f27383h = null;
        this.f27384i = i;
        this.f27385j = values[i];
        this.f27386k = i2;
        this.f27387l = i3;
        this.f27388m = i4;
        this.f27389n = str;
        this.f27390o = i5;
        this.f27394s = a[i5];
        this.f27391p = i6;
        int i7 = a2[i6];
    }

    /* renamed from: Y */
    public static zzffu m34971Y(hr2 hr2, Context context) {
        if (hr2 == hr2.Rewarded) {
            return new zzffu(context, hr2, ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22549j4)).intValue(), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22597p4)).intValue(), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22613r4)).intValue(), (String) C5054ev.m23225c().mo20153b(C5503qz.f22629t4), (String) C5054ev.m23225c().mo20153b(C5503qz.f22565l4), (String) C5054ev.m23225c().mo20153b(C5503qz.f22581n4));
        } else if (hr2 == hr2.Interstitial) {
            return new zzffu(context, hr2, ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22557k4)).intValue(), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22605q4)).intValue(), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22621s4)).intValue(), (String) C5054ev.m23225c().mo20153b(C5503qz.f22637u4), (String) C5054ev.m23225c().mo20153b(C5503qz.f22573m4), (String) C5054ev.m23225c().mo20153b(C5503qz.f22589o4));
        } else if (hr2 != hr2.AppOpen) {
            return null;
        } else {
            return new zzffu(context, hr2, ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22661x4)).intValue(), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22677z4)).intValue(), ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22287A4)).intValue(), (String) C5054ev.m23225c().mo20153b(C5503qz.f22645v4), (String) C5054ev.m23225c().mo20153b(C5503qz.f22653w4), (String) C5054ev.m23225c().mo20153b(C5503qz.f22669y4));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27384i);
        C3315b.m14316h(parcel, 2, this.f27386k);
        C3315b.m14316h(parcel, 3, this.f27387l);
        C3315b.m14316h(parcel, 4, this.f27388m);
        C3315b.m14322n(parcel, 5, this.f27389n, false);
        C3315b.m14316h(parcel, 6, this.f27390o);
        C3315b.m14316h(parcel, 7, this.f27391p);
        C3315b.m14310b(parcel, a);
    }

    private zzffu(Context context, hr2 hr2, int i, int i2, int i3, String str, String str2, String str3) {
        this.f27382g = hr2.values();
        this.f27392q = ir2.m25380a();
        this.f27393r = jr2.m25827a();
        this.f27383h = context;
        this.f27384i = hr2.ordinal();
        this.f27385j = hr2;
        this.f27386k = i;
        this.f27387l = i2;
        this.f27388m = i3;
        this.f27389n = str;
        int i4 = 2;
        if ("oldest".equals(str2)) {
            i4 = 1;
        } else if (!"lru".equals(str2) && "lfu".equals(str2)) {
            i4 = 3;
        }
        this.f27394s = i4;
        this.f27390o = i4 - 1;
        "onAdClosed".equals(str3);
        this.f27391p = 0;
    }
}
