package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yu1 implements gu1 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f26525a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final nu1 f26526b;

    /* renamed from: c */
    private final so2 f26527c;

    yu1(long j, Context context, nu1 nu1, mt0 mt0, String str) {
        this.f26525a = j;
        this.f26526b = nu1;
        uo2 B = mt0.mo19507B();
        B.mo21342a(context);
        B.mo21344p(str);
        this.f26527c = B.mo21343b().zza();
    }

    /* renamed from: a */
    public final void mo18026a(zzbfd zzbfd) {
        try {
            this.f26527c.mo20892Q1(zzbfd, new wu1(this));
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    /* renamed from: b */
    public final void mo18027b() {
        try {
            this.f26527c.mo20896d3(new xu1(this));
            this.f26527c.mo20890G5(C4865b.m20503f2(null));
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }

    public final void zza() {
    }
}
