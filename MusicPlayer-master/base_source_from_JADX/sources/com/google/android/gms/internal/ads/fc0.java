package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.C3116u;
import com.google.android.gms.ads.formats.C2908c;
import com.google.android.gms.ads.mediation.C3090s;
import com.google.android.gms.ads.nativead.C3102b;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class fc0 implements C3090s {

    /* renamed from: a */
    private final Date f16517a;

    /* renamed from: b */
    private final int f16518b;

    /* renamed from: c */
    private final Set<String> f16519c;

    /* renamed from: d */
    private final boolean f16520d;

    /* renamed from: e */
    private final Location f16521e;

    /* renamed from: f */
    private final int f16522f;

    /* renamed from: g */
    private final zzbnw f16523g;

    /* renamed from: h */
    private final List<String> f16524h = new ArrayList();

    /* renamed from: i */
    private final boolean f16525i;

    /* renamed from: j */
    private final Map<String, Boolean> f16526j = new HashMap();

    public fc0(Date date, int i, Set<String> set, Location location, boolean z, int i2, zzbnw zzbnw, List<String> list, boolean z2, int i3, String str) {
        this.f16517a = date;
        this.f16518b = i;
        this.f16519c = set;
        this.f16521e = location;
        this.f16520d = z;
        this.f16522f = i2;
        this.f16523g = zzbnw;
        this.f16525i = z2;
        if (list != null) {
            for (String next : list) {
                if (next.startsWith("custom:")) {
                    String[] split = next.split(":", 3);
                    if (split.length == 3) {
                        if ("true".equals(split[2])) {
                            this.f16526j.put(split[1], Boolean.TRUE);
                        } else if ("false".equals(split[2])) {
                            this.f16526j.put(split[1], Boolean.FALSE);
                        }
                    }
                } else {
                    this.f16524h.add(next);
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo11231a() {
        return this.f16524h.contains("3");
    }

    /* renamed from: b */
    public final C3102b mo11232b() {
        return zzbnw.m34958Y(this.f16523g);
    }

    /* renamed from: c */
    public final int mo11194c() {
        return this.f16522f;
    }

    /* renamed from: d */
    public final boolean mo11233d() {
        return this.f16524h.contains("6");
    }

    @Deprecated
    /* renamed from: e */
    public final boolean mo11195e() {
        return this.f16525i;
    }

    @Deprecated
    /* renamed from: f */
    public final Date mo11196f() {
        return this.f16517a;
    }

    /* renamed from: g */
    public final boolean mo11197g() {
        return this.f16520d;
    }

    /* renamed from: h */
    public final Set<String> mo11198h() {
        return this.f16519c;
    }

    /* renamed from: i */
    public final C2908c mo11234i() {
        zzbnw zzbnw = this.f16523g;
        C2908c.C2909a aVar = new C2908c.C2909a();
        if (zzbnw == null) {
            return aVar.mo10764a();
        }
        int i = zzbnw.f27248g;
        if (i != 2) {
            if (i != 3) {
                if (i == 4) {
                    aVar.mo10768e(zzbnw.f27254m);
                    aVar.mo10767d(zzbnw.f27255n);
                }
                aVar.mo10770g(zzbnw.f27249h);
                aVar.mo10766c(zzbnw.f27250i);
                aVar.mo10769f(zzbnw.f27251j);
                return aVar.mo10764a();
            }
            zzbkq zzbkq = zzbnw.f27253l;
            if (zzbkq != null) {
                aVar.mo10771h(new C3116u(zzbkq));
            }
        }
        aVar.mo10765b(zzbnw.f27252k);
        aVar.mo10770g(zzbnw.f27249h);
        aVar.mo10766c(zzbnw.f27250i);
        aVar.mo10769f(zzbnw.f27251j);
        return aVar.mo10764a();
    }

    /* renamed from: j */
    public final Location mo11199j() {
        return this.f16521e;
    }

    @Deprecated
    /* renamed from: k */
    public final int mo11200k() {
        return this.f16518b;
    }

    public final Map<String, Boolean> zza() {
        return this.f16526j;
    }
}
