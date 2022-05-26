package com.google.android.play.core.assetpacks;

import android.content.Context;
import java.io.File;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7578a0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7582c0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;

/* renamed from: com.google.android.play.core.assetpacks.j2 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6372j2 implements C7582c0<C6367i2> {

    /* renamed from: a */
    private final C7582c0<String> f29524a;

    /* renamed from: b */
    private final C7582c0<C6318a0> f29525b;

    /* renamed from: c */
    private final C7582c0<C6381l1> f29526c;

    /* renamed from: d */
    private final C7582c0<Context> f29527d;

    /* renamed from: e */
    private final C7582c0<C6442x2> f29528e;

    /* renamed from: f */
    private final C7582c0<Executor> f29529f;

    /* renamed from: g */
    private final C7582c0<C6432v2> f29530g;

    public C6372j2(C7582c0<String> c0Var, C7582c0<C6318a0> c0Var2, C7582c0<C6381l1> c0Var3, C7582c0<Context> c0Var4, C7582c0<C6442x2> c0Var5, C7582c0<Executor> c0Var6, C7582c0<C6432v2> c0Var7) {
        this.f29524a = c0Var;
        this.f29525b = c0Var2;
        this.f29526c = c0Var3;
        this.f29527d = c0Var4;
        this.f29528e = c0Var5;
        this.f29529f = c0Var6;
        this.f29530g = c0Var7;
    }

    public final /* bridge */ /* synthetic */ Object zza() {
        File file;
        String zza = this.f29524a.zza();
        C6318a0 zza2 = this.f29525b.zza();
        C6381l1 zza3 = this.f29526c.zza();
        Context a = ((C6322a4) this.f29527d).mo25214a();
        C6442x2 zza4 = this.f29528e.zza();
        C7620y<Executor> a2 = C7578a0.m42330a(this.f29529f);
        C6318a0 a0Var = zza2;
        C6381l1 l1Var = zza3;
        C6442x2 x2Var = zza4;
        C6432v2 zza5 = this.f29530g.zza();
        if (zza != null) {
            file = new File(a.getExternalFilesDir((String) null), zza);
        } else {
            file = a.getExternalFilesDir((String) null);
        }
        return new C6367i2(file, a0Var, l1Var, a, x2Var, a2, zza5);
    }
}
