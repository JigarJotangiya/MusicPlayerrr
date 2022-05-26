package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.cq */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C4975cq {

    /* renamed from: a */
    private final byte[] f15124a;

    /* renamed from: b */
    private int f15125b;

    /* renamed from: c */
    final /* synthetic */ C5012dq f15126c;

    /* synthetic */ C4975cq(C5012dq dqVar, byte[] bArr, C4938bq bqVar) {
        this.f15126c = dqVar;
        this.f15124a = bArr;
    }

    /* renamed from: a */
    public final C4975cq mo16721a(int i) {
        this.f15125b = i;
        return this;
    }

    /* renamed from: b */
    public final synchronized void mo16722b() {
        try {
            C5012dq dqVar = this.f15126c;
            if (dqVar.f15723b) {
                dqVar.f15722a.mo20827j0(this.f15124a);
                this.f15126c.f15722a.mo20824H(0);
                this.f15126c.f15722a.mo20828w(this.f15125b);
                this.f15126c.f15722a.mo20823B0((int[]) null);
                this.f15126c.f15722a.mo20826c();
            }
        } catch (RemoteException e) {
            ul0.m31858c("Clearcut log failed", e);
        }
    }
}
