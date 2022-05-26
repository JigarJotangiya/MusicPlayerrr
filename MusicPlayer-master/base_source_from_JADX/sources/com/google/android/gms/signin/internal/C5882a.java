package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.C3143b;
import com.google.android.gms.common.C3245g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3164f;
import com.google.android.gms.common.api.C3165g;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.internal.C3269e;
import com.google.android.gms.common.internal.C3273f;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.zat;
import com.google.android.gms.common.internal.zav;
import p159f.p243f.p245b.p246a.p302e.C7458f;

/* renamed from: com.google.android.gms.signin.internal.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C5882a extends C3273f<C5887f> implements C7458f {

    /* renamed from: K */
    public static final /* synthetic */ int f27584K = 0;

    /* renamed from: G */
    private final boolean f27585G = true;

    /* renamed from: H */
    private final C3269e f27586H;

    /* renamed from: I */
    private final Bundle f27587I;

    /* renamed from: J */
    private final Integer f27588J;

    public C5882a(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, boolean z, @RecentlyNonNull C3269e eVar, @RecentlyNonNull Bundle bundle, @RecentlyNonNull C3164f fVar, @RecentlyNonNull C3165g gVar) {
        super(context, looper, 44, eVar, fVar, gVar);
        this.f27586H = eVar;
        this.f27587I = bundle;
        this.f27588J = eVar.mo11825h();
    }

    @RecentlyNonNull
    /* renamed from: k0 */
    public static Bundle m35124k0(@RecentlyNonNull C3269e eVar) {
        eVar.mo11824g();
        Integer h = eVar.mo11825h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", eVar.mo11818a());
        if (h != null) {
            bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", h.intValue());
        }
        bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
        bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
        bundle.putString("com.google.android.gms.signin.internal.serverClientId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
        bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
        bundle.putString("com.google.android.gms.signin.internal.hostedDomain", (String) null);
        bundle.putString("com.google.android.gms.signin.internal.logSessionId", (String) null);
        bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: D */
    public final String mo11773D() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: E */
    public final String mo11774E() {
        return "com.google.android.gms.signin.service.START";
    }

    /* renamed from: k */
    public final void mo22724k() {
        mo11795g(new C3261d.C3265d());
    }

    /* renamed from: l */
    public final int mo11799l() {
        return C3245g.f10501a;
    }

    /* renamed from: o */
    public final void mo22725o(C5886e eVar) {
        C3292l.m14241i(eVar, "Expecting a valid ISignInCallbacks");
        try {
            Account b = this.f27586H.mo11819b();
            GoogleSignInAccount b2 = "<<default account>>".equals(b.name) ? C3143b.m13749a(mo11810x()).mo11439b() : null;
            Integer num = this.f27588J;
            C3292l.m14240h(num);
            ((C5887f) mo11772C()).mo22729l3(new zai(1, new zat(b, num.intValue(), b2)), eVar);
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                eVar.mo11615M1(new zak(1, new ConnectionResult(8, (PendingIntent) null), (zav) null));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }

    /* renamed from: p */
    public final boolean mo11802p() {
        return this.f27585G;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ IInterface mo11805s(@RecentlyNonNull IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof C5887f ? (C5887f) queryLocalInterface : new C5887f(iBinder);
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: z */
    public final Bundle mo11812z() {
        if (!mo11810x().getPackageName().equals(this.f27586H.mo11821d())) {
            this.f27587I.putString("com.google.android.gms.signin.internal.realClientPackageName", this.f27586H.mo11821d());
        }
        return this.f27587I;
    }
}
