package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class aa1 extends ud1<xx2> implements x40 {

    /* renamed from: h */
    private final Bundle f13829h = new Bundle();

    public aa1(Set<qf1<xx2>> set) {
        super(set);
    }

    /* renamed from: N0 */
    public final synchronized Bundle mo15726N0() {
        return new Bundle(this.f13829h);
    }

    /* renamed from: n */
    public final synchronized void mo15727n(String str, Bundle bundle) {
        this.f13829h.putAll(bundle);
        mo21253K0(z91.f26711a);
    }
}
