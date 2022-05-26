package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C2958q;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b51 implements C2958q {

    /* renamed from: g */
    private final m91 f14327g;

    /* renamed from: h */
    private final AtomicBoolean f14328h = new AtomicBoolean(false);

    /* renamed from: i */
    private final AtomicBoolean f14329i = new AtomicBoolean(false);

    public b51(m91 m91) {
        this.f14327g = m91;
    }

    /* renamed from: c */
    private final void m21091c() {
        if (!this.f14329i.get()) {
            this.f14329i.set(true);
            this.f14327g.zza();
        }
    }

    /* renamed from: F5 */
    public final void mo10899F5() {
    }

    /* renamed from: a */
    public final void mo10900a() {
        this.f14327g.mo19362b();
    }

    /* renamed from: b */
    public final boolean mo16065b() {
        return this.f14328h.get();
    }

    /* renamed from: o5 */
    public final void mo10901o5() {
        m21091c();
    }

    /* renamed from: y3 */
    public final void mo10902y3() {
    }

    /* renamed from: z */
    public final void mo10903z(int i) {
        this.f14328h.set(true);
        m21091c();
    }

    public final void zze() {
    }
}
