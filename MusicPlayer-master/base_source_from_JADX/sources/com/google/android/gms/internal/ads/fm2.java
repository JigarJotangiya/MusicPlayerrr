package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fm2 implements i13<uy1, im2> {

    /* renamed from: a */
    final /* synthetic */ jm2 f16682a;

    fm2(jm2 jm2) {
        this.f16682a = jm2;
    }

    @NullableDecl
    public final /* bridge */ /* synthetic */ Object apply(@NullableDecl Object obj) {
        ul0.m31860e(BuildConfig.FLAVOR, (uy1) obj);
        C3018m1.m13388k("Failed to get a cache key, reverting to legacy flow.");
        jm2 jm2 = this.f16682a;
        jm2.f18538d = new im2((zzcdq) null, jm2.m25782e(), (hm2) null);
        return this.f16682a.f18538d;
    }
}
