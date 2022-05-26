package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yz0 implements o83<String> {

    /* renamed from: a */
    final /* synthetic */ a01 f26594a;

    yz0(a01 a01) {
        this.f26594a = a01;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo10677a(Object obj) {
        dq2 e = this.f26594a.f13700n;
        List<String> b = this.f26594a.f13699m.mo18514b(this.f26594a.f13697k, this.f26594a.f13698l, false, BuildConfig.FLAVOR, (String) obj, this.f26594a.f13698l.f14639c);
        C2971s.m13214q();
        int i = 1;
        if (true == C2979b2.m13262j(this.f26594a.f13693g)) {
            i = 2;
        }
        e.mo16989c(b, i);
    }

    /* renamed from: b */
    public final void mo10678b(Throwable th) {
    }
}
