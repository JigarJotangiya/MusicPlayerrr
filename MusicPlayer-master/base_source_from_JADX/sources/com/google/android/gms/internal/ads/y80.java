package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C2982c1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y80 implements y50<n90> {

    /* renamed from: a */
    final /* synthetic */ g80 f26294a;

    /* renamed from: b */
    final /* synthetic */ C2982c1 f26295b;

    /* renamed from: c */
    final /* synthetic */ m90 f26296c;

    y80(m90 m90, C5737xa xaVar, g80 g80, C2982c1 c1Var) {
        this.f26296c = m90;
        this.f26294a = g80;
        this.f26295b = c1Var;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.y50, java.lang.Object] */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        n90 n90 = (n90) obj;
        synchronized (this.f26296c.f19804a) {
            ul0.m31861f("JS Engine is requesting an update");
            if (this.f26296c.f19810g == 0) {
                ul0.m31861f("Starting reload.");
                this.f26296c.f19810g = 2;
                this.f26296c.mo19355d((C5737xa) null);
            }
            this.f26294a.mo19655Y0("/requestReload", this.f26295b.mo11004a());
        }
    }
}
