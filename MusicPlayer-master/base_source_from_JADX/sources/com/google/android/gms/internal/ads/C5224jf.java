package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.jf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5224jf {

    /* renamed from: a */
    private final Handler f18469a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5261kf f18470b;

    public C5224jf(Handler handler, C5261kf kfVar) {
        Objects.requireNonNull(handler);
        this.f18469a = handler;
        this.f18470b = kfVar;
    }

    /* renamed from: b */
    public final void mo18608b(int i) {
        this.f18469a.post(new C5187if(this, i));
    }

    /* renamed from: c */
    public final void mo18609c(int i, long j, long j2) {
        this.f18469a.post(new C5076ff(this, i, j, j2));
    }

    /* renamed from: d */
    public final void mo18610d(String str, long j, long j2) {
        this.f18469a.post(new C5001df(this, str, j, j2));
    }

    /* renamed from: e */
    public final void mo18611e(C5188ig igVar) {
        this.f18469a.post(new C5150hf(this, igVar));
    }

    /* renamed from: f */
    public final void mo18612f(C5188ig igVar) {
        this.f18469a.post(new C4964cf(this, igVar));
    }

    /* renamed from: g */
    public final void mo18613g(zzapg zzapg) {
        this.f18469a.post(new C5038ef(this, zzapg));
    }
}
