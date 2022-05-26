package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lw2 {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: f */
    private static final lw2 f19644f = new lw2();

    /* renamed from: a */
    private Context f19645a;

    /* renamed from: b */
    private BroadcastReceiver f19646b;

    /* renamed from: c */
    private boolean f19647c;

    /* renamed from: d */
    private boolean f19648d;

    /* renamed from: e */
    private qw2 f19649e;

    private lw2() {
    }

    /* renamed from: a */
    public static lw2 m26991a() {
        return f19644f;
    }

    /* renamed from: b */
    static /* bridge */ /* synthetic */ void m26992b(lw2 lw2, boolean z) {
        if (lw2.f19648d != z) {
            lw2.f19648d = z;
            if (lw2.f19647c) {
                lw2.m26993h();
                if (lw2.f19649e == null) {
                    return;
                }
                if (lw2.mo19294f()) {
                    nx2.m28132d().mo19862i();
                } else {
                    nx2.m28132d().mo19861h();
                }
            }
        }
    }

    /* renamed from: h */
    private final void m26993h() {
        boolean z = this.f19648d;
        for (yv2 g : jw2.m26008a().mo18755c()) {
            xw2 g2 = g.mo22299g();
            if (g2.mo22090k()) {
                pw2.m29249a().mo20325b(g2.mo22083a(), "setState", true != z ? "foregrounded" : "backgrounded");
            }
        }
    }

    /* renamed from: c */
    public final void mo19291c(Context context) {
        this.f19645a = context.getApplicationContext();
    }

    /* renamed from: d */
    public final void mo19292d() {
        this.f19646b = new kw2(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.f19645a.registerReceiver(this.f19646b, intentFilter);
        this.f19647c = true;
        m26993h();
    }

    /* renamed from: e */
    public final void mo19293e() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.f19645a;
        if (!(context == null || (broadcastReceiver = this.f19646b) == null)) {
            context.unregisterReceiver(broadcastReceiver);
            this.f19646b = null;
        }
        this.f19647c = false;
        this.f19648d = false;
        this.f19649e = null;
    }

    /* renamed from: f */
    public final boolean mo19294f() {
        return !this.f19648d;
    }

    /* renamed from: g */
    public final void mo19295g(qw2 qw2) {
        this.f19649e = qw2;
    }
}
