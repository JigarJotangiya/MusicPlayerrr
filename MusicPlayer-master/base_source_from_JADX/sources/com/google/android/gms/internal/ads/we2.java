package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class we2 implements sg2<xe2> {

    /* renamed from: a */
    private final e93 f25371a;

    /* renamed from: b */
    private final Context f25372b;

    /* renamed from: c */
    private final Set<String> f25373c;

    public we2(e93 e93, Context context, Set<String> set) {
        this.f25371a = e93;
        this.f25372b = context;
        this.f25373c = set;
    }

    /* renamed from: a */
    public final d93<xe2> mo15767a() {
        return this.f25371a.mo17138A0(new ve2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ xe2 mo21809b() throws Exception {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22524g3)).booleanValue()) {
            Set<String> set = this.f25373c;
            if (set.contains("rewarded") || set.contains("interstitial") || set.contains("native") || set.contains("banner")) {
                return new xe2(C2971s.m13206i().mo18276Q(this.f25372b));
            }
        }
        return new xe2((String) null);
    }
}
