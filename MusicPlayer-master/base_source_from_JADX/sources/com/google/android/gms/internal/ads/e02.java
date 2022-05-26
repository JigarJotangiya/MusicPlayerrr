package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.regex.Pattern;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e02 implements ed1, C5497qt, z81, i81 {

    /* renamed from: g */
    private final Context f15807g;

    /* renamed from: h */
    private final gq2 f15808h;

    /* renamed from: i */
    private final np2 f15809i;

    /* renamed from: j */
    private final bp2 f15810j;

    /* renamed from: k */
    private final y12 f15811k;

    /* renamed from: l */
    private Boolean f15812l;

    /* renamed from: m */
    private final boolean f15813m = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22319E4)).booleanValue();

    /* renamed from: n */
    private final gu2 f15814n;

    /* renamed from: o */
    private final String f15815o;

    public e02(Context context, gq2 gq2, np2 np2, bp2 bp2, y12 y12, gu2 gu2, String str) {
        this.f15807g = context;
        this.f15808h = gq2;
        this.f15809i = np2;
        this.f15810j = bp2;
        this.f15811k = y12;
        this.f15814n = gu2;
        this.f15815o = str;
    }

    /* renamed from: d */
    private final fu2 m22781d(String str) {
        fu2 b = fu2.m23966b(str);
        b.mo17743h(this.f15809i, (jl0) null);
        b.mo17741f(this.f15810j);
        b.mo17738a("request_id", this.f15815o);
        if (!this.f15810j.f14666u.isEmpty()) {
            b.mo17738a("ancn", this.f15810j.f14666u.get(0));
        }
        if (this.f15810j.f14648g0) {
            C2971s.m13214q();
            b.mo17738a("device_connectivity", true != C2979b2.m13262j(this.f15807g) ? "offline" : "online");
            b.mo17738a("event_timestamp", String.valueOf(C2971s.m13198a().mo11988a()));
            b.mo17738a("offline_ad", "1");
        }
        return b;
    }

    /* renamed from: e */
    private final void m22782e(fu2 fu2) {
        if (this.f15810j.f14648g0) {
            this.f15811k.mo22137x(new a22(C2971s.m13198a().mo11988a(), this.f15809i.f20683b.f20121b.f16050b, this.f15814n.mo18030b(fu2), 2));
            return;
        }
        this.f15814n.mo18029a(fu2);
    }

    /* renamed from: g */
    private final boolean m22783g() {
        if (this.f15812l == null) {
            synchronized (this) {
                if (this.f15812l == null) {
                    String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22445W0);
                    C2971s.m13214q();
                    String d0 = C2979b2.m13252d0(this.f15807g);
                    boolean z = false;
                    if (!(str == null || d0 == null)) {
                        try {
                            z = Pattern.matches(str, d0);
                        } catch (RuntimeException e) {
                            C2971s.m13213p().mo17571s(e, "CsiActionsListener.isPatternMatched");
                        }
                    }
                    this.f15812l = Boolean.valueOf(z);
                }
            }
        }
        return this.f15812l.booleanValue();
    }

    /* renamed from: A0 */
    public final void mo17073A0(xh1 xh1) {
        if (this.f15813m) {
            fu2 d = m22781d("ifts");
            d.mo17738a("reason", "exception");
            if (!TextUtils.isEmpty(xh1.getMessage())) {
                d.mo17738a("msg", xh1.getMessage());
            }
            this.f15814n.mo18029a(d);
        }
    }

    /* renamed from: a */
    public final void mo17074a() {
        if (this.f15813m) {
            gu2 gu2 = this.f15814n;
            fu2 d = m22781d("ifts");
            d.mo17738a("reason", "blocked");
            gu2.mo18029a(d);
        }
    }

    /* renamed from: b */
    public final void mo16874b() {
        if (m22783g()) {
            this.f15814n.mo18029a(m22781d("adapter_shown"));
        }
    }

    /* renamed from: c */
    public final void mo17075c(zzbew zzbew) {
        zzbew zzbew2;
        if (this.f15813m) {
            int i = zzbew.f27186g;
            String str = zzbew.f27187h;
            if (zzbew.f27188i.equals("com.google.android.gms.ads") && (zzbew2 = zzbew.f27189j) != null && !zzbew2.f27188i.equals("com.google.android.gms.ads")) {
                zzbew zzbew3 = zzbew.f27189j;
                i = zzbew3.f27186g;
                str = zzbew3.f27187h;
            }
            String a = this.f15808h.mo18005a(str);
            fu2 d = m22781d("ifts");
            d.mo17738a("reason", "adapter");
            if (i >= 0) {
                d.mo17738a("arec", String.valueOf(i));
            }
            if (a != null) {
                d.mo17738a("areec", a);
            }
            this.f15814n.mo18029a(d);
        }
    }

    /* renamed from: f */
    public final void mo16877f() {
        if (m22783g()) {
            this.f15814n.mo18029a(m22781d("adapter_impression"));
        }
    }

    /* renamed from: j */
    public final void mo15614j() {
        if (m22783g() || this.f15810j.f14648g0) {
            m22782e(m22781d("impression"));
        }
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        if (this.f15810j.f14648g0) {
            m22782e(m22781d("click"));
        }
    }
}
