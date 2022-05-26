package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.C3074e;
import java.util.Date;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class tb0 implements C3074e {

    /* renamed from: a */
    private final Date f23816a;

    /* renamed from: b */
    private final int f23817b;

    /* renamed from: c */
    private final Set<String> f23818c;

    /* renamed from: d */
    private final boolean f23819d;

    /* renamed from: e */
    private final Location f23820e;

    /* renamed from: f */
    private final int f23821f;

    /* renamed from: g */
    private final boolean f23822g;

    public tb0(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f23816a = date;
        this.f23817b = i;
        this.f23818c = set;
        this.f23820e = location;
        this.f23819d = z;
        this.f23821f = i2;
        this.f23822g = z2;
    }

    /* renamed from: c */
    public final int mo11194c() {
        return this.f23821f;
    }

    @Deprecated
    /* renamed from: e */
    public final boolean mo11195e() {
        return this.f23822g;
    }

    @Deprecated
    /* renamed from: f */
    public final Date mo11196f() {
        return this.f23816a;
    }

    /* renamed from: g */
    public final boolean mo11197g() {
        return this.f23819d;
    }

    /* renamed from: h */
    public final Set<String> mo11198h() {
        return this.f23818c;
    }

    /* renamed from: j */
    public final Location mo11199j() {
        return this.f23820e;
    }

    @Deprecated
    /* renamed from: k */
    public final int mo11200k() {
        return this.f23817b;
    }
}
