package com.google.android.gms.ads.p076z;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.ads.C2903f;
import com.google.android.gms.ads.C3059k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.internal.ads.c80;

/* renamed from: com.google.android.gms.ads.z.a */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C3130a {
    /* renamed from: a */
    public static void m13710a(@RecentlyNonNull Context context, @RecentlyNonNull String str, @RecentlyNonNull C2903f fVar, @RecentlyNonNull C3131b bVar) {
        C3292l.m14241i(context, "Context cannot be null.");
        C3292l.m14241i(str, "AdUnitId cannot be null.");
        C3292l.m14241i(fVar, "AdRequest cannot be null.");
        C3292l.m14241i(bVar, "LoadCallback cannot be null.");
        new c80(context, str).mo16545e(fVar.mo10733a(), bVar);
    }

    /* renamed from: b */
    public abstract void mo11388b(C3059k kVar);

    /* renamed from: c */
    public abstract void mo11389c(boolean z);

    /* renamed from: d */
    public abstract void mo11390d(@RecentlyNonNull Activity activity);
}
