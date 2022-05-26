package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class v73 extends s73 {
    /* synthetic */ v73(u73 u73) {
        super((r73) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo20802a(w73<?> w73) {
        int E;
        synchronized (w73) {
            E = w73.f25265o - 1;
            w73.f25265o = E;
        }
        return E;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo20803b(w73<?> w73, Set<Throwable> set, Set<Throwable> set2) {
        synchronized (w73) {
            if (w73.f25264n == null) {
                w73.f25264n = set2;
            }
        }
    }
}
