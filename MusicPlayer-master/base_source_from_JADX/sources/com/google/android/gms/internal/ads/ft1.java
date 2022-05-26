package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ft1 {

    /* renamed from: a */
    private final Map<String, String> f16756a = new ConcurrentHashMap();

    /* renamed from: b */
    final /* synthetic */ gt1 f16757b;

    ft1(gt1 gt1) {
        this.f16757b = gt1;
    }

    /* renamed from: b */
    public final ft1 mo17730b(String str, String str2) {
        this.f16756a.put(str, str2);
        return this;
    }

    /* renamed from: c */
    public final ft1 mo17731c(bp2 bp2) {
        this.f16756a.put("aai", bp2.f14669x);
        return this;
    }

    /* renamed from: d */
    public final ft1 mo17732d(ep2 ep2) {
        this.f16756a.put("gqi", ep2.f16050b);
        return this;
    }

    /* renamed from: e */
    public final String mo17733e() {
        return this.f16757b.f17248a.mo20113a(this.f16756a);
    }

    /* renamed from: f */
    public final void mo17734f() {
        this.f16757b.f17249b.execute(new et1(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ void mo17735g() {
        this.f16757b.f17248a.mo20114b(this.f16756a);
    }
}
