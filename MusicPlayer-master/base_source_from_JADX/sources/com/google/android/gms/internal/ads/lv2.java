package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class lv2 {

    /* renamed from: a */
    private final Executor f19537a;

    /* renamed from: b */
    private final am0 f19538b;

    public lv2(Executor executor, am0 am0) {
        this.f19537a = executor;
        this.f19538b = am0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ void mo19284a(String str) {
        this.f19538b.mo11120p(str);
    }

    /* renamed from: b */
    public final void mo19285b(String str) {
        this.f19537a.execute(new kv2(this, str));
    }

    /* renamed from: c */
    public final void mo19286c(List<String> list) {
        for (String b : list) {
            mo19285b(b);
        }
    }
}
