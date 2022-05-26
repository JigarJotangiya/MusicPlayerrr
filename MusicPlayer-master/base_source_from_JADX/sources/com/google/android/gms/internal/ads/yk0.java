package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class yk0 {

    /* renamed from: a */
    private long f26389a = -1;

    /* renamed from: b */
    private long f26390b = -1;

    /* renamed from: c */
    final /* synthetic */ zk0 f26391c;

    public yk0(zk0 zk0) {
        this.f26391c = zk0;
    }

    /* renamed from: a */
    public final long mo22212a() {
        return this.f26390b;
    }

    /* renamed from: b */
    public final Bundle mo22213b() {
        Bundle bundle = new Bundle();
        bundle.putLong("topen", this.f26389a);
        bundle.putLong("tclose", this.f26390b);
        return bundle;
    }

    /* renamed from: c */
    public final void mo22214c() {
        this.f26390b = this.f26391c.f26799a.mo11989b();
    }

    /* renamed from: d */
    public final void mo22215d() {
        this.f26389a = this.f26391c.f26799a.mo11989b();
    }
}
