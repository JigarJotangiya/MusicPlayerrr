package com.google.android.gms.internal.ads;

import android.os.Binder;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.C3261d;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class ey1 implements C3261d.C3262a, C3261d.C3263b {

    /* renamed from: a */
    protected final mm0<InputStream> f16370a = new mm0<>();

    /* renamed from: b */
    protected final Object f16371b = new Object();

    /* renamed from: c */
    protected boolean f16372c = false;

    /* renamed from: d */
    protected boolean f16373d = false;

    /* renamed from: e */
    protected zzcdq f16374e;

    /* renamed from: f */
    protected dg0 f16375f;

    /* renamed from: C0 */
    public void mo11815C0(ConnectionResult connectionResult) {
        ul0.m31857b("Disconnected from remote ad request service.");
        this.f16370a.mo19451e(new uy1(1));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo17431a() {
        synchronized (this.f16371b) {
            this.f16373d = true;
            if (this.f16375f.mo11797i() || this.f16375f.mo11793e()) {
                this.f16375f.mo11791c();
            }
            Binder.flushPendingCommands();
        }
    }

    /* renamed from: z */
    public final void mo11814z(int i) {
        ul0.m31857b("Cannot connect to remote service, fallback to local instance.");
    }
}
