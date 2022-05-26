package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l64 {

    /* renamed from: d */
    public static final e64 f19222d = new e64(2, -9223372036854775807L, (d64) null);

    /* renamed from: e */
    public static final e64 f19223e = new e64(3, -9223372036854775807L, (d64) null);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ExecutorService f19224a = wy2.m33449l("ExoPlayer:Loader:ProgressiveMediaPeriod");
    /* access modifiers changed from: private */

    /* renamed from: b */
    public f64<? extends g64> f19225b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public IOException f19226c;

    public l64(String str) {
    }

    /* renamed from: b */
    public static e64 m26539b(boolean z, long j) {
        return new e64(z ? 1 : 0, j, (d64) null);
    }

    /* renamed from: a */
    public final <T extends g64> long mo19081a(T t, c64<T> c64, int i) {
        Looper myLooper = Looper.myLooper();
        gs1.m24484b(myLooper);
        this.f19226c = null;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        new f64(this, myLooper, t, c64, i, elapsedRealtime).mo17491c(0);
        return elapsedRealtime;
    }

    /* renamed from: g */
    public final void mo19082g() {
        f64<? extends g64> f64 = this.f19225b;
        gs1.m24484b(f64);
        f64.mo17489a(false);
    }

    /* renamed from: h */
    public final void mo19083h() {
        this.f19226c = null;
    }

    /* renamed from: i */
    public final void mo19084i(int i) throws IOException {
        IOException iOException = this.f19226c;
        if (iOException == null) {
            f64<? extends g64> f64 = this.f19225b;
            if (f64 != null) {
                f64.mo17490b(i);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: j */
    public final void mo19085j(i64 i64) {
        f64<? extends g64> f64 = this.f19225b;
        if (f64 != null) {
            f64.mo17489a(true);
        }
        this.f19224a.execute(new j64(i64));
        this.f19224a.shutdown();
    }

    /* renamed from: k */
    public final boolean mo19086k() {
        return this.f19226c != null;
    }

    /* renamed from: l */
    public final boolean mo19087l() {
        return this.f19225b != null;
    }
}
