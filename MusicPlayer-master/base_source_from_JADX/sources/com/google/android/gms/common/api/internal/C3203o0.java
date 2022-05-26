package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3164f;
import com.google.android.gms.common.api.C3165g;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3269e;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.zav;
import com.google.android.gms.signin.internal.C5884c;
import com.google.android.gms.signin.internal.zak;
import java.util.Set;
import p159f.p243f.p245b.p246a.p302e.C7453a;
import p159f.p243f.p245b.p246a.p302e.C7457e;
import p159f.p243f.p245b.p246a.p302e.C7458f;

/* renamed from: com.google.android.gms.common.api.internal.o0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3203o0 extends C5884c implements C3164f, C3165g {

    /* renamed from: n */
    private static final C3147a.C3148a<? extends C7458f, C7453a> f10433n = C7457e.f32633c;

    /* renamed from: g */
    private final Context f10434g;

    /* renamed from: h */
    private final Handler f10435h;

    /* renamed from: i */
    private final C3147a.C3148a<? extends C7458f, C7453a> f10436i;

    /* renamed from: j */
    private final Set<Scope> f10437j;

    /* renamed from: k */
    private final C3269e f10438k;

    /* renamed from: l */
    private C7458f f10439l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public C3201n0 f10440m;

    public C3203o0(Context context, Handler handler, C3269e eVar) {
        C3147a.C3148a<? extends C7458f, C7453a> aVar = f10433n;
        this.f10434g = context;
        this.f10435h = handler;
        C3292l.m14241i(eVar, "ClientSettings must not be null");
        this.f10438k = eVar;
        this.f10437j = eVar.mo11822e();
        this.f10436i = aVar;
    }

    /* renamed from: F5 */
    static /* synthetic */ void m13926F5(C3203o0 o0Var, zak zak) {
        ConnectionResult Y = zak.mo22739Y();
        if (Y.mo11450v0()) {
            zav m0 = zak.mo22740m0();
            C3292l.m14240h(m0);
            zav zav = m0;
            Y = zav.mo11902m0();
            if (!Y.mo11450v0()) {
                String valueOf = String.valueOf(Y);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48);
                sb.append("Sign-in succeeded with resolve account failure: ");
                sb.append(valueOf);
                Log.wtf("SignInCoordinator", sb.toString(), new Exception());
            } else {
                o0Var.f10440m.mo11572b(zav.mo11900Y(), o0Var.f10437j);
                o0Var.f10439l.mo11505c();
            }
        }
        o0Var.f10440m.mo11573c(Y);
        o0Var.f10439l.mo11505c();
    }

    /* renamed from: C0 */
    public final void mo11598C0(ConnectionResult connectionResult) {
        this.f10440m.mo11573c(connectionResult);
    }

    /* renamed from: K0 */
    public final void mo11574K0(Bundle bundle) {
        this.f10439l.mo22725o(this);
    }

    /* renamed from: M1 */
    public final void mo11615M1(zak zak) {
        this.f10435h.post(new C3198m0(this, zak));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [com.google.android.gms.common.api.a$f, f.f.b.a.e.f] */
    /* renamed from: l3 */
    public final void mo11616l3(C3201n0 n0Var) {
        C7458f fVar = this.f10439l;
        if (fVar != null) {
            fVar.mo11505c();
        }
        this.f10438k.mo11826i(Integer.valueOf(System.identityHashCode(this)));
        C3147a.C3148a aVar = this.f10436i;
        Context context = this.f10434g;
        Looper looper = this.f10435h.getLooper();
        C3269e eVar = this.f10438k;
        this.f10439l = aVar.mo11499a(context, looper, eVar, eVar.mo11824g(), this, this);
        this.f10440m = n0Var;
        Set<Scope> set = this.f10437j;
        if (set == null || set.isEmpty()) {
            this.f10435h.post(new C3196l0(this));
        } else {
            this.f10439l.mo22724k();
        }
    }

    /* renamed from: y3 */
    public final void mo11617y3() {
        C7458f fVar = this.f10439l;
        if (fVar != null) {
            fVar.mo11505c();
        }
    }

    /* renamed from: z */
    public final void mo11575z(int i) {
        this.f10439l.mo11505c();
    }
}
