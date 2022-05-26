package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class n81 implements qb1 {

    /* renamed from: a */
    private final boolean f20543a;

    /* renamed from: b */
    private final ArrayList<fr1> f20544b = new ArrayList<>(1);

    /* renamed from: c */
    private int f20545c;

    /* renamed from: d */
    private uf1 f20546d;

    protected n81(boolean z) {
        this.f20543a = z;
    }

    /* renamed from: l */
    public final void mo19648l(fr1 fr1) {
        Objects.requireNonNull(fr1);
        if (!this.f20544b.contains(fr1)) {
            this.f20544b.add(fr1);
            this.f20545c++;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo19649n(int i) {
        uf1 uf1 = this.f20546d;
        int i2 = wy2.f25579a;
        for (int i3 = 0; i3 < this.f20545c; i3++) {
            this.f20544b.get(i3).mo17629b(this, uf1, this.f20543a, i);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo19650o() {
        uf1 uf1 = this.f20546d;
        int i = wy2.f25579a;
        for (int i2 = 0; i2 < this.f20545c; i2++) {
            this.f20544b.get(i2).mo17644p(this, uf1, this.f20543a);
        }
        this.f20546d = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo19651p(uf1 uf1) {
        for (int i = 0; i < this.f20545c; i++) {
            this.f20544b.get(i).mo17643o(this, uf1, this.f20543a);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo19652q(uf1 uf1) {
        this.f20546d = uf1;
        for (int i = 0; i < this.f20545c; i++) {
            this.f20544b.get(i).mo17647x(this, uf1, this.f20543a);
        }
    }

    public /* synthetic */ Map zza() {
        return Collections.emptyMap();
    }
}
