package com.google.android.play.core.assetpacks;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7620y;
import p159f.p243f.p245b.p318c.p319a.p321b.C7625d;

/* renamed from: com.google.android.play.core.assetpacks.a0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6318a0 extends C7625d<AssetPackState> {

    /* renamed from: g */
    private final C6320a2 f29327g;

    /* renamed from: h */
    private final C6366i1 f29328h;

    /* renamed from: i */
    private final C7620y<C6347e4> f29329i;

    /* renamed from: j */
    private final C6420t0 f29330j;

    /* renamed from: k */
    private final C6381l1 f29331k;

    /* renamed from: l */
    private final C7620y<Executor> f29332l;

    /* renamed from: m */
    private final C7620y<Executor> f29333m;

    /* renamed from: n */
    private final C6432v2 f29334n;

    /* renamed from: o */
    private final Handler f29335o = new Handler(Looper.getMainLooper());

    C6318a0(Context context, C6320a2 a2Var, C6366i1 i1Var, C7620y<C6347e4> yVar, C6381l1 l1Var, C6420t0 t0Var, C7620y<Executor> yVar2, C7620y<Executor> yVar3, C6432v2 v2Var) {
        super(new C7577a("AssetPackServiceListenerRegistry"), new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE"), context);
        this.f29327g = a2Var;
        this.f29328h = i1Var;
        this.f29329i = yVar;
        this.f29331k = l1Var;
        this.f29330j = t0Var;
        this.f29332l = yVar2;
        this.f29333m = yVar3;
        this.f29334n = v2Var;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo25166a(Context context, Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
        if (bundleExtra != null) {
            ArrayList<String> stringArrayList = bundleExtra.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                this.f32982a.mo28575b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            AssetPackState i = AssetPackState.m37541i(bundleExtra, stringArrayList.get(0), this.f29331k, this.f29334n, C6330c0.f29401a);
            this.f32982a.mo28574a("ListenerRegistryBroadcastReceiver.onReceive: %s", i);
            PendingIntent pendingIntent = (PendingIntent) bundleExtra.getParcelable("confirmation_intent");
            if (pendingIntent != null) {
                this.f29330j.mo25364a(pendingIntent);
            }
            this.f29333m.zza().execute(new C6439x(this, bundleExtra, i));
            this.f29332l.zza().execute(new C6434w(this, bundleExtra));
            return;
        }
        this.f32982a.mo28575b("Empty bundle received from broadcast.", new Object[0]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final /* synthetic */ void mo25195h(Bundle bundle) {
        if (this.f29327g.mo25212n(bundle)) {
            this.f29328h.mo25290a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo25196i(Bundle bundle, AssetPackState assetPackState) {
        if (this.f29327g.mo25211m(bundle)) {
            mo25197j(assetPackState);
            this.f29329i.zza().mo25230c();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo25197j(AssetPackState assetPackState) {
        this.f29335o.post(new C6449z(this, assetPackState));
    }
}
