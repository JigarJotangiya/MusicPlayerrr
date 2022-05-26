package com.google.android.gms.internal.ads;

import android.util.Log;

/* renamed from: com.google.android.gms.internal.ads.o0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5394o0 implements C5320m0 {

    /* renamed from: a */
    private final int f20775a;

    /* renamed from: b */
    private final int f20776b;

    /* renamed from: c */
    private final no2 f20777c;

    public C5394o0(C5209j0 j0Var, C5689w wVar) {
        no2 no2 = j0Var.f18291b;
        this.f20777c = no2;
        no2.mo19779f(12);
        int v = no2.mo19795v();
        if ("audio/raw".equals(wVar.f25133l)) {
            int S = wy2.m33424S(wVar.f25116A, wVar.f25146y);
            if (v == 0 || v % S != 0) {
                StringBuilder sb = new StringBuilder(88);
                sb.append("Audio sample size mismatch. stsd sample size: ");
                sb.append(S);
                sb.append(", stsz sample size: ");
                sb.append(v);
                Log.w("AtomParsers", sb.toString());
                v = S;
            }
        }
        this.f20775a = v == 0 ? -1 : v;
        this.f20776b = no2.mo19795v();
    }

    /* renamed from: a */
    public final int mo19309a() {
        return this.f20776b;
    }

    /* renamed from: b */
    public final int mo19310b() {
        int i = this.f20775a;
        return i == -1 ? this.f20777c.mo19795v() : i;
    }

    public final int zza() {
        return this.f20775a;
    }
}
