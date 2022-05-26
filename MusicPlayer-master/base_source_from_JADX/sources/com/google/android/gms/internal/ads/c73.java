package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class c73 extends w63 {
    /* synthetic */ c73(i73 i73) {
        super((v63) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo15703a(g73 g73, g73 g732) {
        g73.f16987b = g732;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo15704b(g73 g73, Thread thread) {
        g73.f16986a = thread;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo15705c(h73<?> h73, z63 z63, z63 z632) {
        synchronized (h73) {
            if (h73.f17572h != z63) {
                return false;
            }
            h73.f17572h = z632;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo15706d(h73<?> h73, Object obj, Object obj2) {
        synchronized (h73) {
            if (h73.f17571g != obj) {
                return false;
            }
            h73.f17571g = obj2;
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo15707e(h73<?> h73, g73 g73, g73 g732) {
        synchronized (h73) {
            if (h73.f17573i != g73) {
                return false;
            }
            h73.f17573i = g732;
            return true;
        }
    }
}
