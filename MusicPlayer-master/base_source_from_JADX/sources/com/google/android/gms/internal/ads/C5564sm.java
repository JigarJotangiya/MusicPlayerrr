package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.view.Surface;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.sm */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5564sm {

    /* renamed from: a */
    private final Handler f23546a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C5601tm f23547b;

    public C5564sm(Handler handler, C5601tm tmVar) {
        Objects.requireNonNull(handler);
        this.f23546a = handler;
        this.f23547b = tmVar;
    }

    /* renamed from: b */
    public final void mo20874b(String str, long j, long j2) {
        this.f23546a.post(new C5342mm(this, str, j, j2));
    }

    /* renamed from: c */
    public final void mo20875c(C5188ig igVar) {
        this.f23546a.post(new C5527rm(this, igVar));
    }

    /* renamed from: d */
    public final void mo20876d(int i, long j) {
        this.f23546a.post(new C5416om(this, i, j));
    }

    /* renamed from: e */
    public final void mo20877e(C5188ig igVar) {
        this.f23546a.post(new C5305lm(this, igVar));
    }

    /* renamed from: f */
    public final void mo20878f(zzapg zzapg) {
        this.f23546a.post(new C5379nm(this, zzapg));
    }

    /* renamed from: g */
    public final void mo20879g(Surface surface) {
        this.f23546a.post(new C5490qm(this, surface));
    }

    /* renamed from: h */
    public final void mo20880h(int i, int i2, int i3, float f) {
        this.f23546a.post(new C5453pm(this, i, i2, i3, f));
    }
}
