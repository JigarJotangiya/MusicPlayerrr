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
public final class sq0 extends n81 {

    /* renamed from: e */
    private final Context f23592e;

    /* renamed from: f */
    private final qb1 f23593f;

    /* renamed from: g */
    private final String f23594g;

    /* renamed from: h */
    private final int f23595h;

    /* renamed from: i */
    private final boolean f23596i = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue();

    /* renamed from: j */
    private InputStream f23597j;

    /* renamed from: k */
    private boolean f23598k;

    /* renamed from: l */
    private Uri f23599l;

    /* renamed from: m */
    private volatile zzbak f23600m;

    /* renamed from: n */
    private boolean f23601n = false;

    /* renamed from: o */
    private boolean f23602o = false;

    /* renamed from: p */
    private boolean f23603p = false;

    /* renamed from: q */
    private boolean f23604q = false;

    /* renamed from: r */
    private long f23605r = 0;

    /* renamed from: s */
    private d93<Long> f23606s = null;

    /* renamed from: t */
    private final AtomicLong f23607t = new AtomicLong(-1);

    /* renamed from: u */
    private final dr0 f23608u;

    public sq0(Context context, qb1 qb1, String str, int i, fr1 fr1, dr0 dr0, byte[] bArr) {
        super(false);
        this.f23592e = context;
        this.f23593f = qb1;
        this.f23608u = dr0;
        this.f23594g = str;
        this.f23595h = i;
        mo19648l(fr1);
    }

    /* renamed from: y */
    private final boolean m30905y() {
        if (!this.f23596i) {
            return false;
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22285A2)).booleanValue() && !this.f23603p) {
            return true;
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22293B2)).booleanValue() || this.f23604q) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public final int mo15695c(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        if (this.f23598k) {
            InputStream inputStream = this.f23597j;
            if (inputStream != null) {
                i3 = inputStream.read(bArr, i, i2);
            } else {
                i3 = this.f23593f.mo15695c(bArr, i, i2);
            }
            if (!this.f23596i || this.f23597j != null) {
                mo19649n(i3);
            }
            return i3;
        }
        throw new IOException("Attempt to read closed GcacheDataSource.");
    }

    /* renamed from: g */
    public final Uri mo15696g() {
        return this.f23599l;
    }

    /* renamed from: h */
    public final void mo15697h() throws IOException {
        if (this.f23598k) {
            boolean z = false;
            this.f23598k = false;
            this.f23599l = null;
            if (!this.f23596i || this.f23597j != null) {
                z = true;
            }
            InputStream inputStream = this.f23597j;
            if (inputStream != null) {
                C3365j.m14462a(inputStream);
                this.f23597j = null;
            } else {
                this.f23593f.mo15697h();
            }
            if (z) {
                mo19650o();
                return;
            }
            return;
        }
        throw new IOException("Attempt to close an already closed GcacheDataSource.");
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x01ea  */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:39:0x0132=Splitter:B:39:0x0132, B:34:0x010f=Splitter:B:34:0x010f} */
    /* renamed from: m */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo15698m(com.google.android.gms.internal.ads.uf1 r15) throws java.io.IOException {
        /*
            r14 = this;
            java.lang.String r0 = "ms"
            java.lang.String r1 = "Cache connection took "
            boolean r2 = r14.f23598k
            if (r2 != 0) goto L_0x020e
            r2 = 1
            r14.f23598k = r2
            android.net.Uri r3 = r15.f24320a
            r14.f23599l = r3
            boolean r3 = r14.f23596i
            if (r3 != 0) goto L_0x0016
            r14.mo19652q(r15)
        L_0x0016:
            android.net.Uri r3 = r15.f24320a
            com.google.android.gms.internal.ads.zzbak r3 = com.google.android.gms.internal.ads.zzbak.m34945Y(r3)
            r14.f23600m = r3
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r3 = com.google.android.gms.internal.ads.C5503qz.f22659x2
            com.google.android.gms.internal.ads.oz r4 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r3 = r4.mo20153b(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            r4 = -1
            r6 = 0
            if (r3 == 0) goto L_0x0188
            com.google.android.gms.internal.ads.zzbak r3 = r14.f23600m
            if (r3 == 0) goto L_0x01e4
            com.google.android.gms.internal.ads.zzbak r3 = r14.f23600m
            long r7 = r15.f24325f
            r3.f27181n = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f23600m
            java.lang.String r7 = r14.f23594g
            java.lang.String r7 = com.google.android.gms.internal.ads.d23.m22315c(r7)
            r3.f27182o = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f23600m
            int r7 = r14.f23595h
            r3.f27183p = r7
            com.google.android.gms.internal.ads.zzbak r3 = r14.f23600m
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
            android.content.Context r3 = r14.f23592e
            com.google.android.gms.internal.ads.zzbak r11 = r14.f23600m
            java.util.concurrent.Future r3 = com.google.android.gms.internal.ads.C5678vp.m32617a(r3, r11)
            r11 = 44
            java.util.concurrent.TimeUnit r12 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            java.lang.Object r7 = r3.get(r7, r12)     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            com.google.android.gms.internal.ads.wp r7 = (com.google.android.gms.internal.ads.C5715wp) r7     // Catch:{ ExecutionException | TimeoutException -> 0x0131, InterruptedException -> 0x010e, all -> 0x010b }
            boolean r8 = r7.mo21865d()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f23601n = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo21867f()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f23603p = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r7.mo21866e()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f23604q = r8     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            long r12 = r7.mo21863a()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f23605r = r12     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r8 = r14.m30905y()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r8 != 0) goto L_0x00e0
            java.io.InputStream r7 = r7.mo21864c()     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            r14.f23597j = r7     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            boolean r7 = r14.f23596i     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
            if (r7 == 0) goto L_0x00b8
            r14.mo19652q(r15)     // Catch:{ ExecutionException | TimeoutException -> 0x0109, InterruptedException -> 0x0107, all -> 0x0105 }
        L_0x00b8:
            com.google.android.gms.common.util.d r15 = com.google.android.gms.ads.internal.C2971s.m13198a()
            long r6 = r15.mo11989b()
            long r6 = r6 - r9
            com.google.android.gms.internal.ads.dr0 r15 = r14.f23608u
            com.google.android.gms.internal.ads.fr0 r15 = r15.f15734a
            r15.mo17632d0(r2, r6)
            r14.f23602o = r2
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
            com.google.android.gms.internal.ads.dr0 r5 = r14.f23608u
            com.google.android.gms.internal.ads.fr0 r5 = r5.f15734a
            r5.mo17632d0(r2, r3)
            r14.f23602o = r2
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
            com.google.android.gms.internal.ads.dr0 r5 = r14.f23608u
            com.google.android.gms.internal.ads.fr0 r5 = r5.f15734a
            r5.mo17632d0(r4, r2)
            r14.f23602o = r4
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
            com.google.android.gms.internal.ads.dr0 r5 = r14.f23608u
            com.google.android.gms.internal.ads.fr0 r5 = r5.f15734a
            r5.mo17632d0(r4, r2)
            r14.f23602o = r4
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
            com.google.android.gms.internal.ads.dr0 r5 = r14.f23608u
            com.google.android.gms.internal.ads.fr0 r5 = r5.f15734a
            r5.mo17632d0(r2, r3)
            r14.f23602o = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r11)
            r2.append(r1)
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.google.android.gms.ads.internal.util.C3018m1.m13388k(r0)
            throw r15
        L_0x0188:
            com.google.android.gms.internal.ads.zzbak r0 = r14.f23600m
            if (r0 == 0) goto L_0x01ad
            com.google.android.gms.internal.ads.zzbak r0 = r14.f23600m
            long r7 = r15.f24325f
            r0.f27181n = r7
            com.google.android.gms.internal.ads.zzbak r0 = r14.f23600m
            java.lang.String r1 = r14.f23594g
            java.lang.String r1 = com.google.android.gms.internal.ads.d23.m22315c(r1)
            r0.f27182o = r1
            com.google.android.gms.internal.ads.zzbak r0 = r14.f23600m
            int r1 = r14.f23595h
            r0.f27183p = r1
            com.google.android.gms.internal.ads.ip r0 = com.google.android.gms.ads.internal.C2971s.m13201d()
            com.google.android.gms.internal.ads.zzbak r1 = r14.f23600m
            com.google.android.gms.internal.ads.zzbah r0 = r0.mo18469b(r1)
            goto L_0x01ae
        L_0x01ad:
            r0 = 0
        L_0x01ae:
            if (r0 == 0) goto L_0x01e4
            boolean r1 = r0.mo22528v0()
            if (r1 == 0) goto L_0x01e4
            boolean r1 = r0.mo22527o0()
            r14.f23601n = r1
            boolean r1 = r0.mo22523A0()
            r14.f23603p = r1
            boolean r1 = r0.mo22530z0()
            r14.f23604q = r1
            long r7 = r0.mo22524Y()
            r14.f23605r = r7
            r14.f23602o = r2
            boolean r1 = r14.m30905y()
            if (r1 != 0) goto L_0x01e4
            java.io.InputStream r0 = r0.mo22526n0()
            r14.f23597j = r0
            boolean r0 = r14.f23596i
            if (r0 == 0) goto L_0x01e3
            r14.mo19652q(r15)
        L_0x01e3:
            return r4
        L_0x01e4:
            r14.f23602o = r6
            com.google.android.gms.internal.ads.zzbak r0 = r14.f23600m
            if (r0 == 0) goto L_0x0207
            com.google.android.gms.internal.ads.uf1 r0 = new com.google.android.gms.internal.ads.uf1
            com.google.android.gms.internal.ads.zzbak r1 = r14.f23600m
            java.lang.String r1 = r1.f27174g
            android.net.Uri r2 = android.net.Uri.parse(r1)
            byte[] r1 = r15.f24322c
            long r4 = r15.f24324e
            long r6 = r15.f24325f
            long r8 = r15.f24326g
            java.lang.String r1 = r15.f24327h
            r3 = 0
            r10 = 0
            int r11 = r15.f24328i
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r8, r10, r11)
            r15 = r0
        L_0x0207:
            com.google.android.gms.internal.ads.qb1 r0 = r14.f23593f
            long r0 = r0.mo15698m(r15)
            return r0
        L_0x020e:
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Attempt to open an already open GcacheDataSource."
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.sq0.mo15698m(com.google.android.gms.internal.ads.uf1):long");
    }

    /* renamed from: r */
    public final long mo20943r() {
        return this.f23605r;
    }

    /* renamed from: s */
    public final long mo20944s() {
        if (this.f23600m == null) {
            return -1;
        }
        if (this.f23607t.get() != -1) {
            return this.f23607t.get();
        }
        synchronized (this) {
            if (this.f23606s == null) {
                this.f23606s = hm0.f17708a.mo17138A0(new rq0(this));
            }
        }
        if (!this.f23606s.isDone()) {
            return -1;
        }
        try {
            this.f23607t.compareAndSet(-1, this.f23606s.get().longValue());
            return this.f23607t.get();
        } catch (InterruptedException | ExecutionException unused) {
            return -1;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final /* synthetic */ Long mo20945t() throws Exception {
        return Long.valueOf(C2971s.m13201d().mo18468a(this.f23600m));
    }

    /* renamed from: u */
    public final boolean mo20946u() {
        return this.f23601n;
    }

    /* renamed from: v */
    public final boolean mo20947v() {
        return this.f23604q;
    }

    /* renamed from: w */
    public final boolean mo20948w() {
        return this.f23603p;
    }

    /* renamed from: x */
    public final boolean mo20949x() {
        return this.f23602o;
    }
}
