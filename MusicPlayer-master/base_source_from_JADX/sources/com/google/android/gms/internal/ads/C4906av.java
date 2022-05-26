package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;

/* renamed from: com.google.android.gms.internal.ads.av */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4906av {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C5831zt f14086a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5756xt f14087b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final C5132gy f14088c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final o40 f14089d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final ue0 f14090e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public wf0 f14091f;

    public C4906av(C5831zt ztVar, C5756xt xtVar, C5132gy gyVar, o40 o40, ji0 ji0, ue0 ue0, p40 p40) {
        this.f14086a = ztVar;
        this.f14087b = xtVar;
        this.f14088c = gyVar;
        this.f14089d = o40;
        this.f14090e = ue0;
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m20976p(Context context, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("action", "no_ads_fallback");
        bundle.putString("flow", str);
        C4980cv.m22123b().mo19752i(context, C4980cv.m22124c().f27376g, "gmob-apps", bundle, true);
    }

    /* renamed from: c */
    public final C5684vv mo15965c(Context context, String str, cb0 cb0) {
        return (C5684vv) new C5646uu(this, context, str, cb0).mo16392d(context, false);
    }

    /* renamed from: d */
    public final C5833zv mo15966d(Context context, zzbfi zzbfi, String str, cb0 cb0) {
        return (C5833zv) new C5498qu(this, context, zzbfi, str, cb0).mo16392d(context, false);
    }

    /* renamed from: e */
    public final C5833zv mo15967e(Context context, zzbfi zzbfi, String str, cb0 cb0) {
        return (C5833zv) new C5572su(this, context, zzbfi, str, cb0).mo16392d(context, false);
    }

    /* renamed from: g */
    public final u20 mo15968g(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        return (u20) new C5795yu(this, frameLayout, frameLayout2, context).mo16392d(context, false);
    }

    /* renamed from: i */
    public final le0 mo15969i(Context context, cb0 cb0) {
        return (le0) new C5387nu(this, context, cb0).mo16392d(context, false);
    }

    /* renamed from: k */
    public final xe0 mo15970k(Activity activity) {
        C5239ju juVar = new C5239ju(this, activity);
        Intent intent = activity.getIntent();
        boolean z = false;
        if (!intent.hasExtra("com.google.android.gms.ads.internal.overlay.useClientJar")) {
            ul0.m31859d("useClientJar flag not found in activity intent extras.");
        } else {
            z = intent.getBooleanExtra("com.google.android.gms.ads.internal.overlay.useClientJar", false);
        }
        return (xe0) juVar.mo16392d(activity, z);
    }

    /* renamed from: m */
    public final wh0 mo15971m(Context context, String str, cb0 cb0) {
        return (wh0) new C5832zu(this, context, str, cb0).mo16392d(context, false);
    }

    /* renamed from: n */
    public final ok0 mo15972n(Context context, cb0 cb0) {
        return (ok0) new C5313lu(this, context, cb0).mo16392d(context, false);
    }
}
