package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: com.google.android.gms.common.internal.h0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
abstract class C3281h0 extends C3302p0<Boolean> {

    /* renamed from: d */
    public final int f10633d;

    /* renamed from: e */
    public final Bundle f10634e;

    /* renamed from: f */
    final /* synthetic */ C3261d f10635f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected C3281h0(C3261d dVar, int i, Bundle bundle) {
        super(dVar, Boolean.TRUE);
        this.f10635f = dVar;
        this.f10633d = i;
        this.f10634e = bundle;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo11844a() {
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [android.os.Parcelable] */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo11845b(java.lang.Object r3) {
        /*
            r2 = this;
            int r3 = r2.f10633d
            r0 = 1
            r1 = 0
            if (r3 != 0) goto L_0x001c
            boolean r3 = r2.mo11846f()
            if (r3 != 0) goto L_0x001b
            com.google.android.gms.common.internal.d r3 = r2.f10635f
            r3.m14127h0(r0, null)
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            r0 = 8
            r3.<init>(r0, r1)
        L_0x0018:
            r2.mo11847g(r3)
        L_0x001b:
            return
        L_0x001c:
            com.google.android.gms.common.internal.d r3 = r2.f10635f
            r3.m14127h0(r0, null)
            android.os.Bundle r3 = r2.f10634e
            if (r3 == 0) goto L_0x002e
            java.lang.String r0 = "pendingIntent"
            android.os.Parcelable r3 = r3.getParcelable(r0)
            r1 = r3
            android.app.PendingIntent r1 = (android.app.PendingIntent) r1
        L_0x002e:
            com.google.android.gms.common.ConnectionResult r3 = new com.google.android.gms.common.ConnectionResult
            int r0 = r2.f10633d
            r3.<init>(r0, r1)
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3281h0.mo11845b(java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract boolean mo11846f();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo11847g(ConnectionResult connectionResult);
}
