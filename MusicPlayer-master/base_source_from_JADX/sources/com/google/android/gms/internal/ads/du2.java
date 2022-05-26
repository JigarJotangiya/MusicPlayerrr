package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class du2 {

    /* renamed from: a */
    private final Executor f15754a;

    /* renamed from: b */
    private final am0 f15755b;

    public du2(Executor executor, am0 am0) {
        this.f15754a = executor;
        this.f15755b = am0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo17017a(String str) {
        this.f15755b.mo11120p(str);
    }

    /* renamed from: b */
    public final void mo17018b(String str) {
        this.f15754a.execute(new cu2(this, str));
    }
}
