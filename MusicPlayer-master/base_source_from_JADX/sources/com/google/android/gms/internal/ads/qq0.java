package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qq0 implements rt3 {

    /* renamed from: a */
    private final r54 f21993a = new r54(true, 65536);

    /* renamed from: b */
    private long f21994b = 15000000;

    /* renamed from: c */
    private long f21995c = 30000000;

    /* renamed from: d */
    private long f21996d = 2500000;

    /* renamed from: e */
    private long f21997e = 5000000;

    /* renamed from: f */
    private int f21998f;

    /* renamed from: g */
    private boolean f21999g;

    qq0() {
    }

    /* renamed from: a */
    public final void mo18317a() {
        mo20493h(false);
    }

    /* renamed from: b */
    public final void mo18318b() {
        mo20493h(true);
    }

    /* renamed from: c */
    public final void mo18319c(lu3[] lu3Arr, uj0 uj0, h44[] h44Arr) {
        this.f21998f = 0;
        for (int i = 0; i < 2; i++) {
            if (h44Arr[i] != null) {
                this.f21998f += lu3Arr[i].mo16557a() != 1 ? 131072000 : 13107200;
            }
        }
        this.f21993a.mo20592f(this.f21998f);
    }

    /* renamed from: d */
    public final boolean mo18320d(long j, float f, boolean z, long j2) {
        long j3 = z ? this.f21997e : this.f21996d;
        return j3 <= 0 || j >= j3;
    }

    /* renamed from: e */
    public final r54 mo18321e() {
        return this.f21993a;
    }

    /* renamed from: f */
    public final void mo18322f() {
        mo20493h(true);
    }

    /* renamed from: g */
    public final boolean mo18323g(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.f21995c ? 0 : j2 < this.f21994b ? (char) 2 : 1;
        int a = this.f21993a.mo20587a();
        int i = this.f21998f;
        if (c != 2 && (c != 1 || !this.f21999g || a >= i)) {
            z = false;
        }
        this.f21999g = z;
        return z;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo20493h(boolean z) {
        this.f21998f = 0;
        this.f21999g = false;
        if (z) {
            this.f21993a.mo20591e();
        }
    }

    /* renamed from: i */
    public final synchronized void mo20494i(int i) {
        this.f21996d = ((long) i) * 1000;
    }

    /* renamed from: j */
    public final synchronized void mo20495j(int i) {
        this.f21997e = ((long) i) * 1000;
    }

    /* renamed from: k */
    public final synchronized void mo20496k(int i) {
        this.f21995c = ((long) i) * 1000;
    }

    /* renamed from: l */
    public final synchronized void mo20497l(int i) {
        this.f21994b = ((long) i) * 1000;
    }

    public final long zza() {
        return 0;
    }

    public final boolean zze() {
        return false;
    }
}
