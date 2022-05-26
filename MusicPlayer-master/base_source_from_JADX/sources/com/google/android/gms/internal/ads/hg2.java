package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C2992f;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class hg2 implements sg2<ig2> {

    /* renamed from: a */
    private final e93 f17660a;

    /* renamed from: b */
    private final Context f17661b;

    /* renamed from: c */
    private final zzcjf f17662c;

    public hg2(e93 e93, Context context, zzcjf zzcjf) {
        this.f17660a = e93;
        this.f17661b = context;
        this.f17662c = zzcjf;
    }

    /* renamed from: a */
    public final d93<ig2> mo15767a() {
        return this.f17660a.mo17138A0(new gg2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ ig2 mo18141b() throws Exception {
        int i;
        boolean g = C3334c.m14368a(this.f17661b).mo11914g();
        C2971s.m13214q();
        boolean i2 = C2979b2.m13261i(this.f17661b);
        String str = this.f17662c.f27376g;
        C2971s.m13215r();
        boolean s = C2992f.m13326s();
        C2971s.m13214q();
        ApplicationInfo applicationInfo = this.f17661b.getApplicationInfo();
        if (applicationInfo == null) {
            i = 0;
        } else {
            i = applicationInfo.targetSdkVersion;
        }
        return new ig2(g, i2, str, s, i, DynamiteModule.m14488c(this.f17661b, ModuleDescriptor.MODULE_ID), DynamiteModule.m14487a(this.f17661b, ModuleDescriptor.MODULE_ID));
    }
}
