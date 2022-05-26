package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import java.io.IOException;

/* renamed from: com.google.android.gms.internal.ads.ij */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5191ij implements C5339mj, C5302lj {

    /* renamed from: g */
    private final Uri f18043g;

    /* renamed from: h */
    private final C5636uk f18044h;

    /* renamed from: i */
    private final C5521rg f18045i;

    /* renamed from: j */
    private final int f18046j;

    /* renamed from: k */
    private final Handler f18047k;

    /* renamed from: l */
    private final C5154hj f18048l;

    /* renamed from: m */
    private final C5667ve f18049m = new C5667ve();

    /* renamed from: n */
    private final int f18050n;

    /* renamed from: o */
    private C5302lj f18051o;

    /* renamed from: p */
    private C5741xe f18052p;

    /* renamed from: q */
    private boolean f18053q;

    public C5191ij(Uri uri, C5636uk ukVar, C5521rg rgVar, int i, Handler handler, C5154hj hjVar, String str, int i2) {
        this.f18043g = uri;
        this.f18044h = ukVar;
        this.f18045i = rgVar;
        this.f18046j = i;
        this.f18047k = handler;
        this.f18048l = hjVar;
        this.f18050n = i2;
    }

    /* renamed from: a */
    public final void mo18381a(C5265kj kjVar) {
        ((C5117gj) kjVar).mo17933E();
    }

    /* renamed from: b */
    public final void mo18382b(C5741xe xeVar, Object obj) {
        C5667ve veVar = this.f18049m;
        boolean z = false;
        xeVar.mo15825d(0, veVar, false);
        if (veVar.f24698c != -9223372036854775807L) {
            z = true;
        }
        if (!this.f18053q || z) {
            this.f18052p = xeVar;
            this.f18053q = z;
            this.f18051o.mo18382b(xeVar, (Object) null);
        }
    }

    /* renamed from: c */
    public final C5265kj mo18383c(int i, C5785yk ykVar) {
        C5304ll.m26774c(i == 0);
        return new C5117gj(this.f18043g, this.f18044h.zza(), this.f18045i.zza(), this.f18046j, this.f18047k, this.f18048l, this, ykVar, (String) null, this.f18050n, (byte[]) null);
    }

    /* renamed from: d */
    public final void mo18384d(C4963ce ceVar, boolean z, C5302lj ljVar) {
        this.f18051o = ljVar;
        C4895ak akVar = new C4895ak(-9223372036854775807L, false);
        this.f18052p = akVar;
        ljVar.mo18382b(akVar, (Object) null);
    }

    /* renamed from: f */
    public final void mo18385f() {
        this.f18051o = null;
    }

    public final void zza() throws IOException {
    }
}
