package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.C3110r;
import com.google.android.gms.ads.p070b0.C2891a;
import com.google.android.gms.ads.search.C3113a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.ads.du */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5016du {

    /* renamed from: a */
    public static final C5016du f15749a = new C5016du();

    protected C5016du() {
    }

    /* renamed from: a */
    public final zzbfd mo17016a(Context context, C5686vx vxVar) {
        List list;
        Context context2;
        String str;
        C5686vx vxVar2 = vxVar;
        Date n = vxVar.mo21617n();
        long time = n != null ? n.getTime() : -1;
        String k = vxVar.mo21614k();
        int a = vxVar.mo21604a();
        Set<String> r = vxVar.mo21621r();
        if (!r.isEmpty()) {
            list = Collections.unmodifiableList(new ArrayList(r));
            context2 = context;
        } else {
            context2 = context;
            list = null;
        }
        boolean t = vxVar2.mo21623t(context2);
        Location d = vxVar.mo21607d();
        Bundle f = vxVar2.mo21609f(AdMobAdapter.class);
        C2891a h = vxVar.mo21611h();
        if (h == null) {
            String l = vxVar.mo21615l();
            C3113a i = vxVar.mo21612i();
            if (i == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    String packageName = applicationContext.getPackageName();
                    C4980cv.m22123b();
                    str = nl0.m27920l(Thread.currentThread().getStackTrace(), packageName);
                } else {
                    str = null;
                }
                boolean s = vxVar.mo21622s();
                C3110r a2 = C4983cy.m22198d().mo16763a();
                return new zzbfd(8, time, f, a, list, t, Math.max(vxVar.mo21606c(), a2.mo11341b()), false, l, (zzbkm) null, d, k, vxVar.mo21610g(), vxVar.mo21608e(), Collections.unmodifiableList(new ArrayList(vxVar.mo21620q())), vxVar.mo21616m(), str, s, (zzbeu) null, Math.max(-1, a2.mo11342c()), (String) Collections.max(Arrays.asList(new String[]{null, a2.mo11340a()}), C4979cu.f15149g), vxVar.mo21618o(), vxVar.mo21605b(), vxVar.mo21613j());
            }
            new zzbkm(i);
            throw null;
        }
        h.mo10719a();
        throw null;
    }
}
