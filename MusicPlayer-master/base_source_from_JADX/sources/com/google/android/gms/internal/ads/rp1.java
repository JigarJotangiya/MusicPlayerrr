package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.lang.ref.WeakReference;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rp1 extends g41 {

    /* renamed from: i */
    private final Context f22945i;

    /* renamed from: j */
    private final WeakReference<pr0> f22946j;

    /* renamed from: k */
    private final yh1 f22947k;

    /* renamed from: l */
    private final hf1 f22948l;

    /* renamed from: m */
    private final s81 f22949m;

    /* renamed from: n */
    private final aa1 f22950n;

    /* renamed from: o */
    private final b51 f22951o;

    /* renamed from: p */
    private final th0 f22952p;

    /* renamed from: q */
    private final oy2 f22953q;

    /* renamed from: r */
    private boolean f22954r = false;

    rp1(f41 f41, Context context, pr0 pr0, yh1 yh1, hf1 hf1, s81 s81, aa1 aa1, b51 b51, bp2 bp2, oy2 oy2) {
        super(f41);
        this.f22945i = context;
        this.f22947k = yh1;
        this.f22946j = new WeakReference<>(pr0);
        this.f22948l = hf1;
        this.f22949m = s81;
        this.f22950n = aa1;
        this.f22951o = b51;
        this.f22953q = oy2;
        zzces zzces = bp2.f14658m;
        this.f22952p = new mi0(zzces != null ? zzces.f27360g : BuildConfig.FLAVOR, zzces != null ? zzces.f27361h : 1);
    }

    public final void finalize() throws Throwable {
        try {
            pr0 pr0 = (pr0) this.f22946j.get();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22295B4)).booleanValue()) {
                if (!this.f22954r && pr0 != null) {
                    hm0.f17712e.execute(new qp1(pr0));
                }
            } else if (pr0 != null) {
                pr0.destroy();
            }
        } finally {
            super.finalize();
        }
    }

    /* renamed from: h */
    public final Bundle mo20726h() {
        return this.f22950n.mo15726N0();
    }

    /* renamed from: i */
    public final th0 mo20727i() {
        return this.f22952p;
    }

    /* renamed from: j */
    public final boolean mo20728j() {
        return this.f22951o.mo16065b();
    }

    /* renamed from: k */
    public final boolean mo20729k() {
        return this.f22954r;
    }

    /* renamed from: l */
    public final boolean mo20730l() {
        pr0 pr0 = (pr0) this.f22946j.get();
        return pr0 != null && !pr0.mo17705q0();
    }

    /* renamed from: m */
    public final boolean mo20731m(boolean z, Activity activity) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22585o0)).booleanValue()) {
            C2971s.m13214q();
            if (C2979b2.m13263k(this.f22945i)) {
                ul0.m31862g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f22949m.mo17074a();
                if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22593p0)).booleanValue()) {
                    this.f22953q.mo20152a(this.f16934a.f20683b.f20121b.f16050b);
                }
                return false;
            }
        }
        if (this.f22954r) {
            ul0.m31862g("The rewarded ad have been showed.");
            this.f22949m.mo17075c(nq2.m28048d(10, (String) null, (zzbew) null));
            return false;
        }
        this.f22954r = true;
        this.f22948l.mo18136a();
        Context context = activity;
        if (activity == null) {
            context = this.f22945i;
        }
        try {
            this.f22947k.mo15674a(z, context, this.f22949m);
            this.f22948l.zza();
            return true;
        } catch (xh1 e) {
            this.f22949m.mo17073A0(e);
            return false;
        }
    }
}
