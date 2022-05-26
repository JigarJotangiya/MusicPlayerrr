package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.ads.mediation.AbstractAdViewAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class s52<AdT> implements k22<AdT> {
    /* renamed from: d */
    private static Bundle m30576d(Bundle bundle) {
        return bundle == null ? new Bundle() : new Bundle(bundle);
    }

    /* renamed from: a */
    public final boolean mo15700a(np2 np2, bp2 bp2) {
        return !TextUtils.isEmpty(bp2.f14668w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR));
    }

    /* renamed from: b */
    public final d93<AdT> mo15701b(np2 np2, bp2 bp2) {
        bp2 bp22 = bp2;
        String optString = bp22.f14668w.optString(AbstractAdViewAdapter.AD_UNIT_ID_PARAMETER, BuildConfig.FLAVOR);
        up2 up2 = np2.f20682a.f18953a;
        sp2 sp2 = new sp2();
        sp2.mo20912E(up2);
        sp2.mo20915H(optString);
        Bundle d = m30576d(up2.f24395d.f27207s);
        Bundle d2 = m30576d(d.getBundle("com.google.ads.mediation.admob.AdMobAdapter"));
        d2.putInt("gw", 1);
        String optString2 = bp22.f14668w.optString("mad_hac", (String) null);
        if (optString2 != null) {
            d2.putString("mad_hac", optString2);
        }
        String optString3 = bp22.f14668w.optString("adJson", (String) null);
        if (optString3 != null) {
            d2.putString("_ad", optString3);
        }
        d2.putBoolean("_noRefresh", true);
        Iterator<String> keys = bp22.f14613E.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString4 = bp22.f14613E.optString(next, (String) null);
            if (next != null) {
                d2.putString(next, optString4);
            }
        }
        d.putBundle("com.google.ads.mediation.admob.AdMobAdapter", d2);
        zzbfd zzbfd = up2.f24395d;
        zzbfd zzbfd2 = r5;
        zzbfd zzbfd3 = new zzbfd(zzbfd.f27195g, zzbfd.f27196h, d2, zzbfd.f27198j, zzbfd.f27199k, zzbfd.f27200l, zzbfd.f27201m, zzbfd.f27202n, zzbfd.f27203o, zzbfd.f27204p, zzbfd.f27205q, zzbfd.f27206r, d, zzbfd.f27208t, zzbfd.f27209u, zzbfd.f27210v, zzbfd.f27211w, zzbfd.f27212x, zzbfd.f27213y, zzbfd.f27214z, zzbfd.f27191A, zzbfd.f27192B, zzbfd.f27193C, zzbfd.f27194D);
        sp2.mo20926d(zzbfd2);
        up2 f = sp2.mo20928f();
        Bundle bundle = new Bundle();
        np2 np22 = np2;
        ep2 ep2 = np22.f20683b.f20121b;
        Bundle bundle2 = new Bundle();
        bundle2.putStringArrayList("nofill_urls", new ArrayList(ep2.f16049a));
        bundle2.putInt("refresh_interval", ep2.f16051c);
        bundle2.putString("gws_query_id", ep2.f16050b);
        bundle.putBundle("parent_common_config", bundle2);
        String str = np22.f20682a.f18953a.f24397f;
        Bundle bundle3 = new Bundle();
        bundle3.putString("initial_ad_unit_id", str);
        bp2 bp23 = bp2;
        bundle3.putString("allocation_id", bp23.f14669x);
        bundle3.putStringArrayList("click_urls", new ArrayList(bp23.f14639c));
        bundle3.putStringArrayList("imp_urls", new ArrayList(bp23.f14641d));
        bundle3.putStringArrayList("manual_tracking_urls", new ArrayList(bp23.f14662q));
        bundle3.putStringArrayList("fill_urls", new ArrayList(bp23.f14659n));
        bundle3.putStringArrayList("video_start_urls", new ArrayList(bp23.f14649h));
        bundle3.putStringArrayList("video_reward_urls", new ArrayList(bp23.f14651i));
        bundle3.putStringArrayList("video_complete_urls", new ArrayList(bp23.f14653j));
        bundle3.putString("transaction_id", bp23.f14655k);
        bundle3.putString("valid_from_timestamp", bp23.f14657l);
        bundle3.putBoolean("is_closable_area_disabled", bp23.f14621M);
        if (bp23.f14658m != null) {
            Bundle bundle4 = new Bundle();
            bundle4.putInt("rb_amount", bp23.f14658m.f27361h);
            bundle4.putString("rb_type", bp23.f14658m.f27360g);
            bundle3.putParcelableArray("rewards", new Bundle[]{bundle4});
        }
        bundle.putBundle("parent_ad_config", bundle3);
        return mo20398c(f, bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract d93<AdT> mo20398c(up2 up2, Bundle bundle);
}
