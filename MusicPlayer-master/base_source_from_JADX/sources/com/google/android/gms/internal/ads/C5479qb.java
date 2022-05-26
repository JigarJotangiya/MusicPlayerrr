package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.qb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5479qb implements zz2 {

    /* renamed from: a */
    private final fy2 f21891a;

    /* renamed from: b */
    private final xy2 f21892b;

    /* renamed from: c */
    private final C4998dc f21893c;

    /* renamed from: d */
    private final zzaml f21894d;

    /* renamed from: e */
    private final C4886ab f21895e;

    C5479qb(fy2 fy2, xy2 xy2, C4998dc dcVar, zzaml zzaml, C4886ab abVar) {
        this.f21891a = fy2;
        this.f21892b = xy2;
        this.f21893c = dcVar;
        this.f21894d = zzaml;
        this.f21895e = abVar;
    }

    /* renamed from: d */
    private final Map<String, Object> m29440d() {
        HashMap hashMap = new HashMap();
        C5513r8 b = this.f21892b.mo22118b();
        hashMap.put("v", this.f21891a.mo17769b());
        hashMap.put("gms", Boolean.valueOf(this.f21891a.mo17770c()));
        hashMap.put("int", b.mo20607y0());
        hashMap.put("up", Boolean.valueOf(this.f21894d.mo22478a()));
        hashMap.put("t", new Throwable());
        return hashMap;
    }

    /* renamed from: a */
    public final Map<String, Object> mo20417a() {
        Map<String, Object> d = m29440d();
        C5513r8 a = this.f21892b.mo22117a();
        d.put("gai", Boolean.valueOf(this.f21891a.mo17771d()));
        d.put("did", a.mo20606x0());
        d.put("dst", Integer.valueOf(a.mo20604m0() - 1));
        d.put("doo", Boolean.valueOf(a.mo20601j0()));
        C4886ab abVar = this.f21895e;
        if (abVar != null) {
            d.put("nt", Long.valueOf(abVar.mo15734a()));
        }
        return d;
    }

    /* renamed from: b */
    public final Map<String, Object> mo20418b() {
        return m29440d();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo20419c(View view) {
        this.f21893c.mo16893d(view);
    }

    public final Map<String, Object> zza() {
        Map<String, Object> d = m29440d();
        d.put("lts", Long.valueOf(this.f21893c.mo16891a()));
        return d;
    }
}
