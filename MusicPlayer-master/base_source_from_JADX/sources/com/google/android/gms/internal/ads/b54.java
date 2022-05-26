package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class b54 {

    /* renamed from: a */
    private a54 f14330a;

    /* renamed from: b */
    private l54 f14331b;

    /* renamed from: a */
    public abstract c54 mo16073a(mu3[] mu3Arr, uj0 uj0, f24 f24, bg0 bg0) throws ji3;

    /* renamed from: b */
    public abstract void mo16074b(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final l54 mo16075c() {
        l54 l54 = this.f14331b;
        Objects.requireNonNull(l54);
        return l54;
    }

    /* renamed from: d */
    public final void mo16076d(a54 a54, l54 l54) {
        this.f14330a = a54;
        this.f14331b = l54;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final void mo16077e() {
        a54 a54 = this.f14330a;
        if (a54 != null) {
            a54.mo15689h();
        }
    }
}
