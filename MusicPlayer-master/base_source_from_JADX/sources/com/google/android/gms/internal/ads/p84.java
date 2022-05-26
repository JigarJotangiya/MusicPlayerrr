package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class p84 {

    /* renamed from: a */
    protected final j84 f21369a;

    /* renamed from: b */
    protected final o84 f21370b;

    /* renamed from: c */
    protected l84 f21371c;

    /* renamed from: d */
    private final int f21372d;

    protected p84(m84 m84, o84 o84, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f21370b = o84;
        this.f21372d = i;
        this.f21369a = new j84(m84, j, 0, j3, j4, j5, j6);
    }

    /* renamed from: f */
    protected static final int m28933f(z84 z84, long j, w94 w94) {
        if (j == z84.zze()) {
            return 0;
        }
        w94.f25288a = j;
        return 1;
    }

    /* renamed from: g */
    protected static final boolean m28934g(z84 z84, long j) throws IOException {
        long zze = j - z84.zze();
        if (zze < 0 || zze > 262144) {
            return false;
        }
        ((t84) z84).mo21042o((int) zze, false);
        return true;
    }

    /* renamed from: a */
    public final int mo20237a(z84 z84, w94 w94) throws IOException {
        while (true) {
            l84 l84 = this.f21371c;
            gs1.m24484b(l84);
            long b = l84.f19254f;
            long a = l84.f19255g;
            long c = l84.f19256h;
            if (a - b <= ((long) this.f21372d)) {
                mo20239c(false, b);
                return m28933f(z84, b, w94);
            } else if (!m28934g(z84, c)) {
                return m28933f(z84, c, w94);
            } else {
                z84.mo19928h();
                n84 b2 = this.f21370b.mo18284b(z84, l84.f19250b);
                int a2 = b2.f20550a;
                if (a2 == -3) {
                    mo20239c(false, c);
                    return m28933f(z84, c, w94);
                } else if (a2 == -2) {
                    l84.m26586h(l84, b2.f20551b, b2.f20552c);
                } else if (a2 != -1) {
                    m28934g(z84, b2.f20552c);
                    mo20239c(true, b2.f20552c);
                    return m28933f(z84, b2.f20552c, w94);
                } else {
                    l84.m26585g(l84, b2.f20551b, b2.f20552c);
                }
            }
        }
    }

    /* renamed from: b */
    public final z94 mo20238b() {
        return this.f21369a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo20239c(boolean z, long j) {
        this.f21371c = null;
        this.f21370b.mo18283a();
    }

    /* renamed from: d */
    public final void mo20240d(long j) {
        long j2 = j;
        l84 l84 = this.f21371c;
        if (l84 == null || l84.f19249a != j2) {
            l84 l842 = r1;
            l84 l843 = new l84(j, this.f21369a.mo18564i(j2), 0, this.f21369a.f18394c, this.f21369a.f18395d, this.f21369a.f18396e, this.f21369a.f18397f);
            this.f21371c = l842;
        }
    }

    /* renamed from: e */
    public final boolean mo20241e() {
        return this.f21371c != null;
    }
}
