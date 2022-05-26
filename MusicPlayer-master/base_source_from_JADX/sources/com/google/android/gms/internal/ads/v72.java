package com.google.android.gms.internal.ads;

import android.view.View;
import com.google.android.gms.ads.internal.C2930f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v72 implements C2930f {

    /* renamed from: a */
    private final c81 f24622a;

    /* renamed from: b */
    private final x81 f24623b;

    /* renamed from: c */
    private final ag1 f24624c;

    /* renamed from: d */
    private final sf1 f24625d;

    /* renamed from: e */
    private final m01 f24626e;

    /* renamed from: f */
    final AtomicBoolean f24627f = new AtomicBoolean(false);

    v72(c81 c81, x81 x81, ag1 ag1, sf1 sf1, m01 m01) {
        this.f24622a = c81;
        this.f24623b = x81;
        this.f24624c = ag1;
        this.f24625d = sf1;
        this.f24626e = m01;
    }

    /* renamed from: a */
    public final void mo10833a() {
        if (this.f24627f.get()) {
            this.f24622a.mo10632u0();
        }
    }

    /* renamed from: b */
    public final void mo10834b() {
        if (this.f24627f.get()) {
            this.f24623b.zza();
            this.f24624c.zza();
        }
    }

    /* renamed from: c */
    public final synchronized void mo10835c(View view) {
        if (this.f24627f.compareAndSet(false, true)) {
            this.f24626e.mo15614j();
            this.f24625d.mo20839N0(view);
        }
    }
}
