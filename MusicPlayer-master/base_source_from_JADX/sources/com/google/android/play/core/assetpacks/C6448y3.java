package com.google.android.play.core.assetpacks;

import android.content.ComponentName;
import android.content.Context;
import p159f.p243f.p245b.p318c.p319a.p320a.C7580b0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7582c0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7605o;

/* renamed from: com.google.android.play.core.assetpacks.y3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6448y3 implements C7582c0<Object> {

    /* renamed from: a */
    private final C7582c0<C6413r3> f29726a;

    /* renamed from: b */
    private final C7582c0<Context> f29727b;

    public C6448y3(C7582c0<C6413r3> c0Var, C7582c0<Context> c0Var2) {
        this.f29726a = c0Var;
        this.f29727b = c0Var2;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        C6413r3 zza = this.f29726a.zza();
        Context a = ((C6322a4) this.f29727b).mo25214a();
        C6413r3 r3Var = zza;
        C7605o.m42393a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.AssetPackExtractionService"), 4);
        C7605o.m42393a(a.getPackageManager(), new ComponentName(a.getPackageName(), "com.google.android.play.core.assetpacks.ExtractionForegroundService"), 4);
        C7580b0.m42335a(r3Var);
        return r3Var;
    }
}
