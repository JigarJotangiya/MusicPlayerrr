package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.g41;
import com.google.android.gms.internal.ads.n71;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fs2<R extends n71<AdT>, AdT extends g41> {

    /* renamed from: a */
    private final yr2<R, AdT> f16749a;

    /* renamed from: b */
    private final d93<wr2<R, AdT>> f16750b;

    /* renamed from: c */
    private boolean f16751c = false;

    /* renamed from: d */
    private boolean f16752d = false;

    public fs2(dr2 dr2, xr2<R, AdT> xr2, yr2<R, AdT> yr2) {
        this.f16749a = yr2;
        this.f16750b = s83.m30605g(s83.m30612n(xr2.mo20673a(yr2), new ds2(this, xr2, dr2, yr2), yr2.mo20872a()), Exception.class, new cs2(this, xr2), yr2.mo20872a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0034, code lost:
        return null;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.google.android.gms.internal.ads.d93<com.google.android.gms.internal.ads.wr2<R, AdT>> mo17720a(com.google.android.gms.internal.ads.yr2<R, AdT> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.f16752d     // Catch:{ all -> 0x0035 }
            r1 = 0
            if (r0 != 0) goto L_0x0033
            boolean r0 = r2.f16751c     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x000b
            goto L_0x0033
        L_0x000b:
            com.google.android.gms.internal.ads.yr2<R, AdT> r0 = r2.f16749a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.mr2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.mr2 r0 = r3.zza()     // Catch:{ all -> 0x0035 }
            if (r0 == 0) goto L_0x0031
            com.google.android.gms.internal.ads.yr2<R, AdT> r0 = r2.f16749a     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.mr2 r0 = r0.zza()     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.mr2 r3 = r3.zza()     // Catch:{ all -> 0x0035 }
            boolean r3 = r0.equals(r3)     // Catch:{ all -> 0x0035 }
            if (r3 != 0) goto L_0x002a
            goto L_0x0031
        L_0x002a:
            r3 = 1
            r2.f16751c = r3     // Catch:{ all -> 0x0035 }
            com.google.android.gms.internal.ads.d93<com.google.android.gms.internal.ads.wr2<R, AdT>> r3 = r2.f16750b     // Catch:{ all -> 0x0035 }
            monitor-exit(r2)
            return r3
        L_0x0031:
            monitor-exit(r2)
            return r1
        L_0x0033:
            monitor-exit(r2)
            return r1
        L_0x0035:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fs2.mo17720a(com.google.android.gms.internal.ads.yr2):com.google.android.gms.internal.ads.d93");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final /* synthetic */ d93 mo17721b(xr2 xr2, dr2 dr2, yr2 yr2, lr2 lr2) throws Exception {
        synchronized (this) {
            this.f16752d = true;
            xr2.mo20674b(lr2);
            if (!this.f16751c) {
                dr2.mo16995c(yr2.zza(), lr2);
                d93 i = s83.m30607i(null);
                return i;
            }
            d93 i2 = s83.m30607i(new wr2(lr2, yr2));
            return i2;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo17722c(xr2 xr2, Exception exc) throws Exception {
        synchronized (this) {
            this.f16752d = true;
            throw exc;
        }
    }

    /* renamed from: d */
    public final synchronized void mo17723d(o83<Void> o83) {
        s83.m30616r(s83.m30612n(this.f16750b, es2.f16084a, this.f16749a.mo20872a()), o83, this.f16749a.mo20872a());
    }
}
