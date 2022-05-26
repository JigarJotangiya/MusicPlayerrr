package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b03 {

    /* renamed from: a */
    private final byte[] f14240a;

    /* renamed from: b */
    private int f14241b;

    /* renamed from: c */
    private int f14242c;

    /* renamed from: d */
    final /* synthetic */ c03 f14243d;

    /* synthetic */ b03(c03 c03, byte[] bArr, a03 a03) {
        this.f14243d = c03;
        this.f14240a = bArr;
    }

    /* renamed from: a */
    public final b03 mo15993a(int i) {
        this.f14242c = i;
        return this;
    }

    /* renamed from: b */
    public final b03 mo15994b(int i) {
        this.f14241b = i;
        return this;
    }

    /* renamed from: c */
    public final synchronized void mo15995c() {
        try {
            c03 c03 = this.f14243d;
            if (c03.f14755b) {
                c03.f14754a.mo16812j0(this.f14240a);
                this.f14243d.f14754a.mo16809H(this.f14241b);
                this.f14243d.f14754a.mo16813w(this.f14242c);
                this.f14243d.f14754a.mo16808B0((int[]) null);
                this.f14243d.f14754a.mo16810c();
            }
        } catch (RemoteException e) {
            Log.d("GASS", "Clearcut log failed", e);
        }
    }
}
