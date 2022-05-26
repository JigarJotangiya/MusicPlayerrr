package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.q91;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class p72<AdT, AdapterT, ListenerT extends q91> implements k22<AdT> {

    /* renamed from: a */
    private final m22<AdapterT, ListenerT> f21356a;

    /* renamed from: b */
    private final t22<AdT, AdapterT, ListenerT> f21357b;

    /* renamed from: c */
    private final wt2 f21358c;

    /* renamed from: d */
    private final e93 f21359d;

    public p72(wt2 wt2, e93 e93, m22<AdapterT, ListenerT> m22, t22<AdT, AdapterT, ListenerT> t22) {
        this.f21358c = wt2;
        this.f21359d = e93;
        this.f21357b = t22;
        this.f21356a = m22;
    }

    /* renamed from: e */
    static final String m28920e(String str, int i) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 31);
        sb.append("Error from: ");
        sb.append(str);
        sb.append(", code: ");
        sb.append(i);
        return sb.toString();
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        return !bp2.f14666u.isEmpty();
    }

    /* renamed from: b */
    public final d93<AdT> mo15701b(np2 np2, bp2 bp2) {
        n22<AdapterT, ListenerT> n22;
        Class<AdMobAdapter> cls = AdMobAdapter.class;
        Iterator<String> it = bp2.f14666u.iterator();
        while (true) {
            if (!it.hasNext()) {
                n22 = null;
                break;
            }
            try {
                n22 = this.f21356a.mo15687a(it.next(), bp2.f14668w);
                break;
            } catch (zp2 unused) {
            }
        }
        if (n22 == null) {
            return s83.m30606h(new p52("Unable to instantiate mediation adapter class."));
        }
        mm0 mm0 = new mm0();
        n22.f20468c.mo18293l3(new o72(this, n22, mm0));
        if (bp2.f14618J) {
            Bundle bundle = np2.f20682a.f18953a.f24395d.f27207s;
            Bundle bundle2 = bundle.getBundle(cls.getName());
            if (bundle2 == null) {
                bundle2 = new Bundle();
                bundle.putBundle(cls.getName(), bundle2);
            }
            bundle2.putBoolean("render_test_ad_label", true);
        }
        wt2 wt2 = this.f21358c;
        return ft2.m23963d(new n72(this, np2, bp2, n22), this.f21359d, pt2.ADAPTER_LOAD_AD_SYN, wt2).mo19535b(pt2.ADAPTER_LOAD_AD_ACK).mo19537d(mm0).mo19535b(pt2.ADAPTER_WRAP_ADAPTER).mo19538e(new m72(this, np2, bp2, n22)).mo19534a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ Object mo20226c(np2 np2, bp2 bp2, n22 n22, Void voidR) throws Exception {
        return this.f21357b.mo17870a(np2, bp2, n22);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo20227d(np2 np2, bp2 bp2, n22 n22) throws Exception {
        this.f21357b.mo17871b(np2, bp2, n22);
    }
}
