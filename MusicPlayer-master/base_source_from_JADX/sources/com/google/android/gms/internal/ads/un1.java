package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class un1 {

    /* renamed from: a */
    private final Executor f24381a;

    /* renamed from: b */
    private final w01 f24382b;

    /* renamed from: c */
    private final sf1 f24383c;

    un1(Executor executor, w01 w01, sf1 sf1) {
        this.f24381a = executor;
        this.f24383c = sf1;
        this.f24382b = w01;
    }

    /* renamed from: a */
    public final void mo21338a(pr0 pr0) {
        if (pr0 != null) {
            this.f24383c.mo20839N0(pr0.mo15939Z());
            this.f24383c.mo21251D0(new qn1(pr0), this.f24381a);
            this.f24383c.mo21251D0(new rn1(pr0), this.f24381a);
            this.f24383c.mo21251D0(this.f24382b, this.f24381a);
            this.f24382b.mo21676e(pr0);
            pr0.mo17686d0("/trackActiveViewUnit", new sn1(this));
            pr0.mo17686d0("/untrackActiveViewUnit", new tn1(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ void mo21339b(pr0 pr0, Map map) {
        this.f24382b.mo21673b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo21340c(pr0 pr0, Map map) {
        this.f24382b.mo21672a();
    }
}
