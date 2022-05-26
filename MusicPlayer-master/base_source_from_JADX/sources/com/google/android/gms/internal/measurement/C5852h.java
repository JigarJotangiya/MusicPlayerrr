package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.dynamite.DynamiteModule;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p299d.p301b.C7451a;

/* renamed from: com.google.android.gms.internal.measurement.h */
/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.3 */
final class C5852h extends C5879x {

    /* renamed from: k */
    final /* synthetic */ String f27517k;

    /* renamed from: l */
    final /* synthetic */ String f27518l;

    /* renamed from: m */
    final /* synthetic */ Context f27519m;

    /* renamed from: n */
    final /* synthetic */ Bundle f27520n;

    /* renamed from: o */
    final /* synthetic */ C5851g0 f27521o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C5852h(C5851g0 g0Var, String str, String str2, Context context, Bundle bundle) {
        super(g0Var, true);
        this.f27521o = g0Var;
        this.f27517k = str;
        this.f27518l = str2;
        this.f27519m = context;
        this.f27520n = bundle;
    }

    /* renamed from: a */
    public final void mo22656a() {
        String str;
        String str2;
        String str3;
        try {
            if (C5851g0.m35007r(this.f27517k, this.f27518l)) {
                String str4 = this.f27518l;
                str2 = this.f27517k;
                str = str4;
                str3 = this.f27521o.f27509a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C3292l.m14240h(this.f27519m);
            C5851g0 g0Var = this.f27521o;
            C5869p0 unused = g0Var.f27516h = g0Var.mo22682u(this.f27519m, true);
            if (this.f27521o.f27516h == null) {
                Log.w(this.f27521o.f27509a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m14487a(this.f27519m, "com.google.android.gms.measurement.dynamite");
            int c = DynamiteModule.m14488c(this.f27519m, "com.google.android.gms.measurement.dynamite");
            zzz zzz = new zzz(39065, (long) Math.max(a, c), c < a, str3, str2, str, this.f27520n, C7451a.m41860a(this.f27519m));
            C5869p0 l = this.f27521o.f27516h;
            C3292l.m14240h(l);
            l.mo22717z6(C4865b.m20503f2(this.f27519m), zzz, this.f27567g);
        } catch (Exception e) {
            this.f27521o.m35005p(e, true, false);
        }
    }
}
