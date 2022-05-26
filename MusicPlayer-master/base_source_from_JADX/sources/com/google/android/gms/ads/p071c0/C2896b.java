package com.google.android.gms.ads.p071c0;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.ads.C3108p;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.internal.ads.gi0;

/* renamed from: com.google.android.gms.ads.c0.b */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C2896b {
    /* renamed from: a */
    public static void m12935a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C2903f fVar, @RecentlyNonNull C2897c cVar) {
        C3292l.m14241i(context, "Context cannot be null.");
        C3292l.m14241i(str, "AdUnitId cannot be null.");
        C3292l.m14241i(fVar, "AdRequest cannot be null.");
        C3292l.m14241i(cVar, "LoadCallback cannot be null.");
        new gi0(context, str).mo17929d(fVar.mo10733a(), cVar);
    }

    /* renamed from: b */
    public abstract void mo10721b(C3059k kVar);

    /* renamed from: c */
    public abstract void mo10722c(@RecentlyNonNull Activity activity, @RecentlyNonNull C3108p pVar);
}
