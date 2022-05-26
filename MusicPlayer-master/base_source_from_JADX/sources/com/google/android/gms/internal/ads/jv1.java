package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jv1 implements o83<String> {

    /* renamed from: a */
    final /* synthetic */ mv1 f18651a;

    jv1(mv1 mv1) {
        this.f18651a = mv1;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        String str = (String) obj;
        synchronized (this) {
            this.f18651a.f20295c = true;
            this.f18651a.m27503u("com.google.android.gms.ads.MobileAds", true, BuildConfig.FLAVOR, (int) (C2971s.m13198a().mo11989b() - this.f18651a.f20296d));
            this.f18651a.f20301i.execute(new iv1(this, str));
        }
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
        synchronized (this) {
            this.f18651a.f20295c = true;
            this.f18651a.m27503u("com.google.android.gms.ads.MobileAds", false, "Internal Error.", (int) (C2971s.m13198a().mo11989b() - this.f18651a.f20296d));
            this.f18651a.f20297e.mo19451e(new Exception());
        }
    }
}
