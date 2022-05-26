package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.ads.internal.C2971s;
import java.util.concurrent.Future;

/* renamed from: com.google.android.gms.internal.ads.up */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5641up {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public C5271kp f24387a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f24388b;

    /* renamed from: c */
    private final Context f24389c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f24390d = new Object();

    C5641up(Context context) {
        this.f24389c = context;
    }

    /* renamed from: e */
    static /* bridge */ /* synthetic */ void m31946e(C5641up upVar) {
        synchronized (upVar.f24390d) {
            C5271kp kpVar = upVar.f24387a;
            if (kpVar != null) {
                kpVar.mo11791c();
                upVar.f24387a = null;
                Binder.flushPendingCommands();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final Future<C5715wp> mo21345c(zzbak zzbak) {
        C5419op opVar = new C5419op(this);
        C5567sp spVar = new C5567sp(this, zzbak, opVar);
        C5604tp tpVar = new C5604tp(this, opVar);
        synchronized (this.f24390d) {
            C5271kp kpVar = new C5271kp(this.f24389c, C2971s.m13218u().mo11123b(), spVar, tpVar);
            this.f24387a = kpVar;
            kpVar.mo11803q();
        }
        return opVar;
    }
}
