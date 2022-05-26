package com.google.android.gms.common.api.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C3261d;
import com.google.android.gms.common.internal.C3276g;
import com.google.android.gms.common.internal.C3279h;
import com.google.android.gms.common.internal.C3292l;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.gms.common.api.internal.i */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3189i implements C3147a.C3156f, ServiceConnection {

    /* renamed from: g */
    private final String f10406g;

    /* renamed from: h */
    private final String f10407h;

    /* renamed from: i */
    private final ComponentName f10408i;

    /* renamed from: j */
    private final Context f10409j;

    /* renamed from: k */
    private final C3179d f10410k;

    /* renamed from: l */
    private final Handler f10411l;

    /* renamed from: m */
    private final C3191j f10412m;

    /* renamed from: n */
    private IBinder f10413n;

    /* renamed from: o */
    private boolean f10414o;

    /* renamed from: p */
    private String f10415p;

    static {
        Class<C3189i> cls = C3189i.class;
    }

    /* renamed from: k */
    private final void m13887k() {
        if (Thread.currentThread() != this.f10411l.getLooper().getThread()) {
            throw new IllegalStateException("This method should only run on the NonGmsServiceBrokerClient's handler thread.");
        }
    }

    /* renamed from: t */
    private final void m13888t(String str) {
        String valueOf = String.valueOf(this.f10413n);
        str.length();
        String.valueOf(valueOf).length();
    }

    /* renamed from: a */
    public final Set<Scope> mo11503a() {
        return Collections.emptySet();
    }

    /* renamed from: b */
    public final void mo11504b(C3279h hVar, Set<Scope> set) {
    }

    /* renamed from: c */
    public final void mo11505c() {
        m13887k();
        m13888t("Disconnect called.");
        try {
            this.f10409j.unbindService(this);
        } catch (IllegalArgumentException unused) {
        }
        this.f10414o = false;
        this.f10413n = null;
    }

    /* renamed from: d */
    public final void mo11506d(@RecentlyNonNull String str) {
        m13887k();
        this.f10415p = str;
        mo11505c();
    }

    /* renamed from: e */
    public final boolean mo11507e() {
        m13887k();
        return this.f10414o;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public final String mo11508f() {
        String str = this.f10406g;
        if (str != null) {
            return str;
        }
        C3292l.m14240h(this.f10408i);
        return this.f10408i.getPackageName();
    }

    /* renamed from: g */
    public final void mo11509g(@RecentlyNonNull C3261d.C3264c cVar) {
        m13887k();
        m13888t("Connect started.");
        if (mo11511i()) {
            try {
                mo11506d("connect() called when already connected");
            } catch (Exception unused) {
            }
        }
        try {
            Intent intent = new Intent();
            ComponentName componentName = this.f10408i;
            if (componentName != null) {
                intent.setComponent(componentName);
            } else {
                intent.setPackage(this.f10406g).setAction(this.f10407h);
            }
            boolean bindService = this.f10409j.bindService(intent, this, C3276g.m14203a());
            this.f10414o = bindService;
            if (!bindService) {
                this.f10413n = null;
                this.f10412m.mo11598C0(new ConnectionResult(16));
            }
            m13888t("Finished connect.");
        } catch (SecurityException e) {
            this.f10414o = false;
            this.f10413n = null;
            throw e;
        }
    }

    /* renamed from: h */
    public final void mo11510h(@RecentlyNonNull C3261d.C3266e eVar) {
    }

    /* renamed from: i */
    public final boolean mo11511i() {
        m13887k();
        return this.f10413n != null;
    }

    /* renamed from: j */
    public final boolean mo11512j() {
        return false;
    }

    /* renamed from: l */
    public final int mo11513l() {
        return 0;
    }

    @RecentlyNonNull
    /* renamed from: m */
    public final Feature[] mo11514m() {
        return new Feature[0];
    }

    @RecentlyNullable
    /* renamed from: n */
    public final String mo11515n() {
        return this.f10415p;
    }

    public final void onServiceConnected(@RecentlyNonNull ComponentName componentName, @RecentlyNonNull IBinder iBinder) {
        this.f10411l.post(new C3186g0(this, iBinder));
    }

    public final void onServiceDisconnected(@RecentlyNonNull ComponentName componentName) {
        this.f10411l.post(new C3190i0(this));
    }

    /* renamed from: p */
    public final boolean mo11516p() {
        return false;
    }

    /* renamed from: q */
    public final void mo11594q(String str) {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo11595r() {
        this.f10414o = false;
        this.f10413n = null;
        m13888t("Disconnected.");
        this.f10410k.mo11575z(1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final /* synthetic */ void mo11596s(IBinder iBinder) {
        this.f10414o = false;
        this.f10413n = iBinder;
        m13888t("Connected.");
        this.f10410k.mo11574K0(new Bundle());
    }
}
