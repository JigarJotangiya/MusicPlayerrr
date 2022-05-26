package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.p068a0.p069a.C2876o;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rs1 implements ed1, C5497qt, z81, i81 {

    /* renamed from: g */
    private final Context f22977g;

    /* renamed from: h */
    private final gq2 f22978h;

    /* renamed from: i */
    private final gt1 f22979i;

    /* renamed from: j */
    private final np2 f22980j;

    /* renamed from: k */
    private final bp2 f22981k;

    /* renamed from: l */
    private final y12 f22982l;

    /* renamed from: m */
    private Boolean f22983m;

    /* renamed from: n */
    private final boolean f22984n = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22319E4)).booleanValue();

    public rs1(Context context, gq2 gq2, gt1 gt1, np2 np2, bp2 bp2, y12 y12) {
        this.f22977g = context;
        this.f22978h = gq2;
        this.f22979i = gt1;
        this.f22980j = np2;
        this.f22981k = bp2;
        this.f22982l = y12;
    }

    /* renamed from: d */
    private final ft1 m30305d(String str) {
        ft1 a = this.f22979i.mo18022a();
        a.mo17732d(this.f22980j.f20683b.f20121b);
        a.mo17731c(this.f22981k);
        a.mo17730b("action", str);
        if (!this.f22981k.f14666u.isEmpty()) {
            a.mo17730b("ancn", this.f22981k.f14666u.get(0));
        }
        if (this.f22981k.f14648g0) {
            C2971s.m13214q();
            a.mo17730b("device_connectivity", true != C2979b2.m13262j(this.f22977g) ? "offline" : "online");
            a.mo17730b("event_timestamp", String.valueOf(C2971s.m13198a().mo11988a()));
            a.mo17730b("offline_ad", "1");
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            boolean d = C2876o.m12914d(this.f22980j);
            a.mo17730b("scar", String.valueOf(d));
            if (d) {
                String b = C2876o.m12912b(this.f22980j);
                if (!TextUtils.isEmpty(b)) {
                    a.mo17730b("ragent", b);
                }
                String a2 = C2876o.m12911a(this.f22980j);
                if (!TextUtils.isEmpty(a2)) {
                    a.mo17730b("rtype", a2);
                }
            }
        }
        return a;
    }

    /* renamed from: e */
    private final void m30306e(ft1 ft1) {
        if (this.f22981k.f14648g0) {
            this.f22982l.mo22137x(new a22(C2971s.m13198a().mo11988a(), this.f22980j.f20683b.f20121b.f16050b, ft1.mo17733e(), 2));
            return;
        }
        ft1.mo17734f();
    }

    /* renamed from: g */
    private final boolean m30307g() {
        if (this.f22983m == null) {
            synchronized (this) {
                if (this.f22983m == null) {
                    String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22445W0);
                    C2971s.m13214q();
                    String d0 = C2979b2.m13252d0(this.f22977g);
                    boolean z = false;
                    if (!(str == null || d0 == null)) {
                        try {
                            z = Pattern.matches(str, d0);
                        } catch (RuntimeException e) {
                            C2971s.m13213p().mo17571s(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f22983m = Boolean.valueOf(z);
                }
            }
        }
        return this.f22983m.booleanValue();
    }

    /* renamed from: A0 */
    public final void mo17073A0(xh1 xh1) {
        if (this.f22984n) {
            ft1 d = m30305d("ifts");
            d.mo17730b("reason", "exception");
            if (!TextUtils.isEmpty(xh1.getMessage())) {
                d.mo17730b("msg", xh1.getMessage());
            }
            d.mo17734f();
        }
    }

    /* renamed from: a */
    public final void mo17074a() {
        if (this.f22984n) {
            ft1 d = m30305d("ifts");
            d.mo17730b("reason", "blocked");
            d.mo17734f();
        }
    }

    /* renamed from: b */
    public final void mo16874b() {
        if (m30307g()) {
            m30305d("adapter_shown").mo17734f();
        }
    }

    /* renamed from: c */
    public final void mo17075c(zzbew zzbew) {
        zzbew zzbew2;
        if (this.f22984n) {
            ft1 d = m30305d("ifts");
            d.mo17730b("reason", "adapter");
            int i = zzbew.f27186g;
            String str = zzbew.f27187h;
            if (zzbew.f27188i.equals("com.google.android.gms.ads") && (zzbew2 = zzbew.f27189j) != null && !zzbew2.f27188i.equals("com.google.android.gms.ads")) {
                zzbew zzbew3 = zzbew.f27189j;
                i = zzbew3.f27186g;
                str = zzbew3.f27187h;
            }
            if (i >= 0) {
                d.mo17730b("arec", String.valueOf(i));
            }
            String a = this.f22978h.mo18005a(str);
            if (a != null) {
                d.mo17730b("areec", a);
            }
            d.mo17734f();
        }
    }

    /* renamed from: f */
    public final void mo16877f() {
        if (m30307g()) {
            m30305d("adapter_impression").mo17734f();
        }
    }

    /* renamed from: j */
    public final void mo15614j() {
        if (m30307g() || this.f22981k.f14648g0) {
            m30306e(m30305d("impression"));
        }
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        if (this.f22981k.f14648g0) {
            m30306e(m30305d("click"));
        }
    }
}
