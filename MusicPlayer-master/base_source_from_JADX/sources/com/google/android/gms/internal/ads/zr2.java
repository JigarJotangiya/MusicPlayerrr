package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.internal.ads.g41;
import com.google.android.gms.internal.ads.n71;
import java.util.ArrayDeque;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zr2<R extends n71<AdT>, AdT extends g41> {

    /* renamed from: a */
    private final dr2 f26890a;

    /* renamed from: b */
    private final xr2<R, AdT> f26891b;

    /* renamed from: c */
    private final zq2 f26892c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final ArrayDeque<yr2<R, AdT>> f26893d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public fs2<R, AdT> f26894e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public int f26895f = 1;

    public zr2(dr2 dr2, zq2 zq2, xr2<R, AdT> xr2) {
        this.f26890a = dr2;
        this.f26892c = zq2;
        this.f26891b = xr2;
        this.f26893d = new ArrayDeque<>();
        zq2.mo22420b(new ur2(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public final synchronized void m34769h() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22517f4)).booleanValue()) {
            if (!C2971s.m13213p().mo17562h().mo11088d().mo15854h()) {
                this.f26893d.clear();
                return;
            }
        }
        if (m34770i()) {
            while (!this.f26893d.isEmpty()) {
                yr2 pollFirst = this.f26893d.pollFirst();
                if (pollFirst == null || (pollFirst.zza() != null && this.f26890a.mo16994b(pollFirst.zza()))) {
                    fs2<R, AdT> fs2 = new fs2<>(this.f26890a, this.f26891b, pollFirst);
                    this.f26894e = fs2;
                    fs2.mo17723d(new vr2(this, pollFirst));
                    return;
                }
            }
        }
    }

    /* renamed from: i */
    private final synchronized boolean m34770i() {
        return this.f26894e == null;
    }

    /* renamed from: a */
    public final synchronized d93<wr2<R, AdT>> mo22426a(yr2<R, AdT> yr2) {
        this.f26895f = 2;
        if (m34770i()) {
            return null;
        }
        return this.f26894e.mo17720a(yr2);
    }

    /* renamed from: e */
    public final synchronized void mo22427e(yr2<R, AdT> yr2) {
        this.f26893d.add(yr2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo22428f() {
        synchronized (this) {
            this.f26895f = 1;
            m34769h();
        }
    }
}
