package com.google.android.gms.ads.p072v;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2898d;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.internal.ads.C5011dp;

/* renamed from: com.google.android.gms.ads.v.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C3118a {

    /* renamed from: com.google.android.gms.ads.v.a$a */
    /* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
    public static abstract class C3119a extends C2898d<C3118a> {
    }

    /* renamed from: a */
    public static void m13689a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C2903f fVar, int i, @RecentlyNonNull C3119a aVar) {
        C3292l.m14241i(context, "Context cannot be null.");
        C3292l.m14241i(str, "adUnitId cannot be null.");
        C3292l.m14241i(fVar, "AdRequest cannot be null.");
        new C5011dp(context, str, fVar.mo10733a(), i, aVar).mo16982a();
    }

    /* renamed from: b */
    public abstract void mo11373b(C3059k kVar);

    /* renamed from: c */
    public abstract void mo11374c(@RecentlyNonNull Activity activity);
}
