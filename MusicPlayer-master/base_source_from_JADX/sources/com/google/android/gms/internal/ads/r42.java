package com.google.android.gms.internal.ads;

import android.content.Context;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r42 implements yh1 {

    /* renamed from: a */
    private final bp2 f22730a;

    /* renamed from: b */
    private final bd0 f22731b;

    /* renamed from: c */
    private final boolean f22732c;

    /* renamed from: d */
    private x81 f22733d = null;

    r42(bp2 bp2, bd0 bd0, boolean z) {
        this.f22730a = bp2;
        this.f22731b = bd0;
        this.f22732c = z;
    }

    /* renamed from: a */
    public final void mo15674a(boolean z, Context context, s81 s81) throws xh1 {
        boolean z2;
        try {
            if (this.f22732c) {
                z2 = this.f22731b.mo16202A0(C4865b.m20503f2(context));
            } else {
                z2 = this.f22731b.mo16211k0(C4865b.m20503f2(context));
            }
            if (!z2) {
                throw new xh1("Adapter failed to show.");
            } else if (this.f22733d != null) {
                if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22459Y0)).booleanValue() && this.f22730a.f14630V == 2) {
                    this.f22733d.zza();
                }
            }
        } catch (Throwable th) {
            throw new xh1(th);
        }
    }

    /* renamed from: b */
    public final void mo20584b(x81 x81) {
        this.f22733d = x81;
    }
}
