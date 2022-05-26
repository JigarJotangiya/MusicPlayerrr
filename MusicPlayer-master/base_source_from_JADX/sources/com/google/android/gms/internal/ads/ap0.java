package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.common.util.C3365j;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ap0 implements C5673vk {

    /* renamed from: a */
    private final C5267kl<C5673vk> f14011a;

    /* renamed from: b */
    private final Context f14012b;

    /* renamed from: c */
    private final C5673vk f14013c;

    /* renamed from: d */
    private final String f14014d;

    /* renamed from: e */
    private final int f14015e;

    /* renamed from: f */
    private final boolean f14016f = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue();

    /* renamed from: g */
    private InputStream f14017g;

    /* renamed from: h */
    private boolean f14018h;

    /* renamed from: i */
    private Uri f14019i;

    /* renamed from: j */
    private volatile zzbak f14020j;

    /* renamed from: k */
    private boolean f14021k = false;

    /* renamed from: l */
    private boolean f14022l = false;

    /* renamed from: m */
    private boolean f14023m = false;

    /* renamed from: n */
    private boolean f14024n = false;

    /* renamed from: o */
    private long f14025o = 0;

    /* renamed from: p */
    private d93<Long> f14026p = null;

    /* renamed from: q */
    private final AtomicLong f14027q = new AtomicLong(-1);

    /* renamed from: r */
    private final jp0 f14028r;

    /* JADX WARNING: type inference failed for: r2v0, types: [android.content.Context, com.google.android.gms.internal.ads.vk] */
    /* JADX WARNING: type inference failed for: r3v0, types: [com.google.android.gms.internal.ads.vk, java.lang.String] */
    /* JADX WARNING: type inference failed for: r4v0, types: [int, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v0, types: [int, com.google.android.gms.internal.ads.kl<com.google.android.gms.internal.ads.vk>] */
    /* JADX WARNING: type inference failed for: r6v0, types: [com.google.android.gms.internal.ads.kl<com.google.android.gms.internal.ads.vk>, com.google.android.gms.internal.ads.jp0] */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ap0(android.content.Context r1, android.content.Context r2, com.google.android.gms.internal.ads.C5673vk r3, java.lang.String r4, int r5, com.google.android.gms.internal.ads.C5267kl<com.google.android.gms.internal.ads.C5673vk> r6, com.google.android.gms.internal.ads.jp0 r7) {
        /*
            r0 = this;
            r0.<init>()
            r0.f14012b = r1
            r0.f14013c = r2
            r0.f14011a = r5
            r0.f14028r = r6
            r0.f14014d = r3
            r0.f14015e = r4
            r1 = 0
            r0.f14021k = r1
            r0.f14022l = r1
            r0.f14023m = r1
            r0.f14024n = r1
            r1 = 0
            r0.f14025o = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r2 = -1
            r1.<init>(r2)
            r0.f14027q = r1
            r1 = 0
            r0.f14026p = r1
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r1 = com.google.android.gms.internal.ads.C5503qz.f22546j1
            com.google.android.gms.internal.ads.oz r2 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r1 = r2.mo20153b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            r0.f14016f = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ap0.<init>(android.content.Context, com.google.android.gms.internal.ads.vk, java.lang.String, int, com.google.android.gms.internal.ads.kl, com.google.android.gms.internal.ads.jp0, byte[]):void");
    }

    /* renamed from: l */
    private final void m20889l(C5747xk xkVar) {
        C5267kl<C5673vk> klVar = this.f14011a;
        if (klVar != null) {
            ((lp0) klVar).mo18905r(this, xkVar);
        }
    }

    /* renamed from: m */
    private final boolean m20890m() {
        if (!this.f14016f) {
            return false;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22285A2)).booleanValue() && !this.f14023m) {
            return true;
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22293B2)).booleanValue() || this.f14024n) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final int mo15842a(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        C5267kl<C5673vk> klVar;
        if (this.f14018h) {
            InputStream inputStream = this.f14017g;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f14013c.mo15842a(bArr, i, i2);
            }
            if ((!this.f14016f || this.f14017g != null) && (klVar = this.f14011a) != null) {
                ((lp0) klVar).mo19243h0(this, i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed CacheDataSource.");
    }

    /* renamed from: b */
    public final Uri mo15843b() {
        return this.f14019i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ea  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0132=Splitter:B:39:0x0132, B:34:0x010f=Splitter:B:34:0x010f} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15844c(com.google.android.gms.internal.ads.C5747xk r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.f14018h
            if (r2 != 0) goto L_0x0209
            r2 = 1
            r14.f14018h = r2
            android.net.Uri r3 = r15.f25862a
            r14.f14019i = r3
            boolean r3 = r14.f14016f
            if (r3 != 0) goto L_0x0016
            r14.m20889l(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f25862a
            com.google.android.gms.internal.ads.zzbak r3 = com.google.android.gms.internal.ads.zzbak.m34945Y(r3)
            r14.f14020j = r3
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22659x2
            com.google.android.gms.internal.ads.oz r4 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r4.mo20153b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0188
            com.google.android.gms.internal.ads.zzbak r3 = r14.f14020j
            if (r3 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.zzbak r3 = r14.f14020j
            long r7 = r15.f25864c
            r3.f27181n = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f14020j
            java.lang.String r7 = r14.f14014d
            java.lang.String r7 = com.google.android.gms.internal.ads.d23.m22315c(r7)
            r3.f27182o = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f14020j
            int r7 = r14.f14015e
            r3.f27183p = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f14020j
            boolean r3 = r3.f27180m
            if (r3 == 0) goto L_0x0060
            com.google.android.gms.internal.ads.iz<java.lang.Long> r3 = com.google.android.gms.internal.ads.C5503qz.f22675z2
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r7.mo20153b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
            goto L_0x006c
        L_0x0060:
            com.google.android.gms.internal.ads.iz<java.lang.Long> r3 = com.google.android.gms.internal.ads.C5503qz.f22667y2
            com.google.android.gms.internal.ads.oz r7 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r7.mo20153b(r3)
            java.lang.Long r3 = (java.lang.Long) r3
        L_0x006c:
            long r7 = r3.longValue()
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r9 = r3.mo11989b()
            com.google.android.gms.ads.internal.C2971s.m13202e()
            android.content.Context r3 = r14.f14012b
            com.google.android.gms.internal.ads.zzbak r11 = r14.f14020j
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C5678vp.m32617a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            com.google.android.gms.internal.ads.wp r7 = (com.google.android.gms.internal.ads.C5715wp) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            boolean r8 = r7.mo21865d()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f14021k = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo21867f()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f14023m = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo21866e()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f14024n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            long r12 = r7.mo21863a()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f14025o = r12     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r14.m20890m()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r8 != 0) goto L_0x00e0
            java.io.InputStream r7 = r7.mo21864c()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f14017g = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r7 = r14.f14016f     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r7 == 0) goto L_0x00b8
            r14.m20889l(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
        L_0x00b8:
            com.google.android.gms.common.util.d r15 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r6 = r15.mo11989b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.jp0 r15 = r14.f14028r
            com.google.android.gms.internal.ads.lp0 r15 = r15.f18557a
            r15.mo19242g0(r2, r6)
            r14.f14022l = r2
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r11)
            r15.append(r1)
            r15.append(r6)
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r15)
            return r4
        L_0x00e0:
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r3 = r3.mo11989b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.jp0 r5 = r14.f14028r
            com.google.android.gms.internal.ads.lp0 r5 = r5.f18557a
            r5.mo19242g0(r2, r3)
            r14.f14022l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L_0x0159
        L_0x0105:
            r15 = move-exception
            goto L_0x0160
        L_0x0107:
            r4 = 1
            goto L_0x010f
        L_0x0109:
            r4 = 1
            goto L_0x0132
        L_0x010b:
            r15 = move-exception
            r2 = 0
            goto L_0x0160
        L_0x010e:
            r4 = 0
        L_0x010f:
            r3.cancel(r2)     // Catch:{ all -> 0x015e }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x015e }
            r2.interrupt()     // Catch:{ all -> 0x015e }
            com.google.android.gms.common.util.d r2 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r2 = r2.mo11989b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.jp0 r5 = r14.f14028r
            com.google.android.gms.internal.ads.lp0 r5 = r5.f18557a
            r5.mo19242g0(r4, r2)
            r14.f14022l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
            goto L_0x014c
        L_0x0131:
            r4 = 0
        L_0x0132:
            r3.cancel(r2)     // Catch:{ all -> 0x015e }
            com.google.android.gms.common.util.d r2 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r2 = r2.mo11989b()
            long r2 = r2 - r9
            com.google.android.gms.internal.ads.jp0 r5 = r14.f14028r
            com.google.android.gms.internal.ads.lp0 r5 = r5.f18557a
            r5.mo19242g0(r4, r2)
            r14.f14022l = r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r11)
        L_0x014c:
            r4.append(r1)
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
        L_0x0159:
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)
            goto L_0x01e4
        L_0x015e:
            r15 = move-exception
            r2 = r4
        L_0x0160:
            com.google.android.gms.common.util.d r3 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r3 = r3.mo11989b()
            long r3 = r3 - r9
            com.google.android.gms.internal.ads.jp0 r5 = r14.f14028r
            com.google.android.gms.internal.ads.lp0 r5 = r5.f18557a
            r5.mo19242g0(r2, r3)
            r14.f14022l = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)
            throw r15
        L_0x0188:
            com.google.android.gms.internal.ads.zzbak r0 = r14.f14020j
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.zzbak r0 = r14.f14020j
            long r7 = r15.f25864c
            r0.f27181n = r7
            com.google.android.gms.internal.ads.zzbak r0 = r14.f14020j
            java.lang.String r1 = r14.f14014d
            java.lang.String r1 = com.google.android.gms.internal.ads.d23.m22315c(r1)
            r0.f27182o = r1
            com.google.android.gms.internal.ads.zzbak r0 = r14.f14020j
            int r1 = r14.f14015e
            r0.f27183p = r1
            com.google.android.gms.internal.ads.ip r0 = com.google.android.gms.ads.internal.C2971s.m13201d()
            com.google.android.gms.internal.ads.zzbak r1 = r14.f14020j
            com.google.android.gms.internal.ads.zzbah r0 = r0.mo18469b(r1)
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01e4
            boolean r1 = r0.mo22528v0()
            if (r1 == 0) goto L_0x01e4
            boolean r1 = r0.mo22527o0()
            r14.f14021k = r1
            boolean r1 = r0.mo22523A0()
            r14.f14023m = r1
            boolean r1 = r0.mo22530z0()
            r14.f14024n = r1
            long r7 = r0.mo22524Y()
            r14.f14025o = r7
            r14.f14022l = r2
            boolean r1 = r14.m20890m()
            if (r1 != 0) goto L_0x01e4
            java.io.InputStream r0 = r0.mo22526n0()
            r14.f14017g = r0
            boolean r0 = r14.f14016f
            if (r0 == 0) goto L_0x01e3
            r14.m20889l(r15)
        L_0x01e3:
            return r4
        L_0x01e4:
            r14.f14022l = r6
            com.google.android.gms.internal.ads.zzbak r0 = r14.f14020j
            if (r0 == 0) goto L_0x0202
            com.google.android.gms.internal.ads.xk r0 = new com.google.android.gms.internal.ads.xk
            com.google.android.gms.internal.ads.zzbak r1 = r14.f14020j
            java.lang.String r1 = r1.f27174g
            android.net.Uri r2 = android.net.Uri.parse(r1)
            r3 = 0
            long r4 = r15.f25863b
            long r6 = r15.f25864c
            long r8 = r15.f25865d
            r10 = 0
            r11 = 0
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x0202:
            com.google.android.gms.internal.ads.vk r0 = r14.f14013c
            long r0 = r0.mo15844c(r15)
            return r0
        L_0x0209:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open CacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ap0.mo15844c(com.google.android.gms.internal.ads.xk):long");
    }

    /* renamed from: d */
    public final long mo15912d() {
        return this.f14025o;
    }

    /* renamed from: e */
    public final long mo15913e() {
        if (this.f14020j == null) {
            return -1;
        }
        if (this.f14027q.get() != -1) {
            return this.f14027q.get();
        }
        synchronized (this) {
            if (this.f14026p == null) {
                this.f14026p = hm0.f17708a.mo17138A0(new zo0(this));
            }
        }
        if (!this.f14026p.isDone()) {
            return -1;
        }
        try {
            this.f14027q.compareAndSet(-1, this.f14026p.get().longValue());
            return this.f14027q.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public final void mo15845f() throws IOException {
        if (this.f14018h) {
            this.f14018h = false;
            this.f14019i = null;
            InputStream inputStream = this.f14017g;
            if (inputStream != null) {
                C3365j.m14462a(inputStream);
                this.f14017g = null;
                return;
            }
            this.f14013c.mo15845f();
            return;
        }
        throw new IOException("Attempt to close an already closed CacheDataSource.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final /* synthetic */ Long mo15914g() throws Exception {
        return Long.valueOf(C2971s.m13201d().mo18468a(this.f14020j));
    }

    /* renamed from: h */
    public final boolean mo15915h() {
        return this.f14021k;
    }

    /* renamed from: i */
    public final boolean mo15916i() {
        return this.f14024n;
    }

    /* renamed from: j */
    public final boolean mo15917j() {
        return this.f14023m;
    }

    /* renamed from: k */
    public final boolean mo15918k() {
        return this.f14022l;
    }
}
