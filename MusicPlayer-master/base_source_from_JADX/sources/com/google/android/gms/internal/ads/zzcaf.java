package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.C0346c;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2964w;
import com.google.android.gms.ads.internal.overlay.C2966y;
import com.google.android.gms.ads.internal.overlay.zzc;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.mediation.C3074e;
import com.google.android.gms.ads.mediation.C3083n;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.common.util.C3369n;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcaf implements MediationInterstitialAdapter {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public Activity f27280a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public C3083n f27281b;

    /* renamed from: c */
    private Uri f27282c;

    public final void onDestroy() {
        ul0.m31857b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    public final void onPause() {
        ul0.m31857b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    public final void onResume() {
        ul0.m31857b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    public final void requestInterstitialAd(Context context, C3083n nVar, Bundle bundle, C3074e eVar, Bundle bundle2) {
        this.f27281b = nVar;
        if (nVar == null) {
            ul0.m31862g("Listener not set for mediation. Returning.");
        } else if (!(context instanceof Activity)) {
            ul0.m31862g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f27281b.mo11210d(this, 0);
        } else if (!C3369n.m14469a() || !p00.m28808g(context)) {
            ul0.m31862g("Default browser does not support custom tabs. Bailing out.");
            this.f27281b.mo11210d(this, 0);
        } else {
            String string = bundle.getString("tab_url");
            if (TextUtils.isEmpty(string)) {
                ul0.m31862g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
                this.f27281b.mo11210d(this, 0);
                return;
            }
            this.f27280a = (Activity) context;
            this.f27282c = Uri.parse(string);
            this.f27281b.mo11212m(this);
        }
    }

    public final void showInterstitial() {
        C0346c a = new C0346c.C0347a().mo2276a();
        a.f1502a.setData(this.f27282c);
        C2979b2.f9980i.post(new rd0(this, new AdOverlayInfoParcel(new zzc(a.f1502a, (C2964w) null), (C5497qt) null, new qd0(this), (C2966y) null, new zzcjf(0, 0, false, false, false), (pr0) null, (yf1) null)));
        C2971s.m13213p().mo17566n();
    }
}
