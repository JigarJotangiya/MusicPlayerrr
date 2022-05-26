package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rg1 extends g41 {

    /* renamed from: i */
    private final Context f22849i;

    /* renamed from: j */
    private final WeakReference<pr0> f22850j;

    /* renamed from: k */
    private final hf1 f22851k;

    /* renamed from: l */
    private final yh1 f22852l;

    /* renamed from: m */
    private final b51 f22853m;

    /* renamed from: n */
    private final oy2 f22854n;

    /* renamed from: o */
    private final s81 f22855o;

    /* renamed from: p */
    private boolean f22856p = false;

    rg1(f41 f41, Context context, pr0 pr0, hf1 hf1, yh1 yh1, b51 b51, oy2 oy2, s81 s81) {
        super(f41);
        this.f22849i = context;
        this.f22850j = new WeakReference<>(pr0);
        this.f22851k = hf1;
        this.f22852l = yh1;
        this.f22853m = b51;
        this.f22854n = oy2;
        this.f22855o = s81;
    }

    public final void finalize() throws Throwable {
        try {
            pr0 pr0 = (pr0) this.f22850j.get();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22295B4)).booleanValue()) {
                if (!this.f22856p && pr0 != null) {
                    hm0.f17712e.execute(new qg1(pr0));
                }
            } else if (pr0 != null) {
                pr0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final boolean mo20659h() {
        return this.f22853m.mo16065b();
    }

    /* renamed from: i */
    public final boolean mo20660i(boolean z, Activity activity) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22585o0)).booleanValue()) {
            C2971s.m13214q();
            if (C2979b2.m13263k(this.f22849i)) {
                ul0.m31862g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f22855o.mo17074a();
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22593p0)).booleanValue()) {
                    this.f22854n.mo20152a(this.f16934a.f20683b.f20121b.f16050b);
                }
                return false;
            }
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22671y6)).booleanValue() && this.f22856p) {
            ul0.m31862g("The interstitial ad has been showed.");
            this.f22855o.mo17075c(nq2.m28048d(10, (String) null, (zzbew) null));
        }
        if (!this.f22856p) {
            this.f22851k.mo18136a();
            Context context = activity;
            if (activity == null) {
                context = this.f22849i;
            }
            try {
                this.f22852l.mo15674a(z, context, this.f22855o);
                this.f22851k.zza();
                this.f22856p = true;
                return true;
            } catch (xh1 e) {
                this.f22855o.mo17073A0(e);
            }
        }
        return false;
    }
}
