package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class b24 extends q14<Void> {

    /* renamed from: j */
    private final i24 f14280j;

    /* renamed from: k */
    private final boolean f14281k;

    /* renamed from: l */
    private final ff0 f14282l;

    /* renamed from: m */
    private final od0 f14283m;

    /* renamed from: n */
    private z14 f14284n;

    /* renamed from: o */
    private y14 f14285o;

    /* renamed from: p */
    private boolean f14286p;

    /* renamed from: q */
    private boolean f14287q;

    /* renamed from: r */
    private boolean f14288r;

    public b24(i24 i24, boolean z) {
        boolean z2;
        this.f14280j = i24;
        if (z) {
            i24.mo18267n();
            z2 = true;
        } else {
            z2 = false;
        }
        this.f14281k = z2;
        this.f14282l = new ff0();
        this.f14283m = new od0();
        i24.mo18273w();
        this.f14284n = z14.m34389q(i24.mo16027x());
    }

    /* renamed from: D */
    private final Object m21047D(Object obj) {
        return (this.f14284n.f26625d == null || !obj.equals(z14.f26623e)) ? obj : this.f14284n.f26625d;
    }

    /* renamed from: E */
    private final void m21048E(long j) {
        y14 y14 = this.f14285o;
        int a = this.f14284n.mo15662a(y14.f26205g.f25531a);
        if (a != -1) {
            z14 z14 = this.f14284n;
            od0 od0 = this.f14283m;
            z14.mo15665d(a, od0, false);
            long j2 = od0.f20977d;
            if (j2 != -9223372036854775807L && j >= j2) {
                j = Math.max(0, j2 - 1);
            }
            y14.mo22143s(j);
        }
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0090  */
    /* renamed from: A */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void mo16019A(java.lang.Object r12, com.google.android.gms.internal.ads.i24 r13, com.google.android.gms.internal.ads.bg0 r14) {
        /*
            r11 = this;
            java.lang.Void r12 = (java.lang.Void) r12
            boolean r12 = r11.f14287q
            r13 = 0
            if (r12 == 0) goto L_0x001c
            com.google.android.gms.internal.ads.z14 r12 = r11.f14284n
            com.google.android.gms.internal.ads.z14 r12 = r12.mo22320p(r14)
            r11.f14284n = r12
            com.google.android.gms.internal.ads.y14 r12 = r11.f14285o
            if (r12 == 0) goto L_0x009f
            long r0 = r12.mo22140n()
            r11.m21048E(r0)
            goto L_0x009f
        L_0x001c:
            boolean r12 = r14.mo16242o()
            if (r12 == 0) goto L_0x0038
            boolean r12 = r11.f14288r
            if (r12 == 0) goto L_0x002d
            com.google.android.gms.internal.ads.z14 r12 = r11.f14284n
            com.google.android.gms.internal.ads.z14 r12 = r12.mo22320p(r14)
            goto L_0x0035
        L_0x002d:
            java.lang.Object r12 = com.google.android.gms.internal.ads.ff0.f16561o
            java.lang.Object r0 = com.google.android.gms.internal.ads.z14.f26623e
            com.google.android.gms.internal.ads.z14 r12 = com.google.android.gms.internal.ads.z14.m34390r(r14, r12, r0)
        L_0x0035:
            r11.f14284n = r12
            goto L_0x009f
        L_0x0038:
            com.google.android.gms.internal.ads.ff0 r12 = r11.f14282l
            r0 = 0
            r1 = 0
            r14.mo15666e(r0, r12, r1)
            com.google.android.gms.internal.ads.ff0 r12 = r11.f14282l
            java.lang.Object r12 = r12.f16563a
            com.google.android.gms.internal.ads.y14 r3 = r11.f14285o
            if (r3 == 0) goto L_0x0066
            long r3 = r3.mo22141p()
            com.google.android.gms.internal.ads.z14 r5 = r11.f14284n
            com.google.android.gms.internal.ads.y14 r6 = r11.f14285o
            com.google.android.gms.internal.ads.f24 r6 = r6.f26205g
            java.lang.Object r6 = r6.f25531a
            com.google.android.gms.internal.ads.od0 r7 = r11.f14283m
            r5.mo16241n(r6, r7)
            com.google.android.gms.internal.ads.z14 r5 = r11.f14284n
            com.google.android.gms.internal.ads.ff0 r6 = r11.f14282l
            r5.mo15666e(r0, r6, r1)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0066
            r9 = r3
            goto L_0x0067
        L_0x0066:
            r9 = r1
        L_0x0067:
            com.google.android.gms.internal.ads.ff0 r6 = r11.f14282l
            com.google.android.gms.internal.ads.od0 r7 = r11.f14283m
            r8 = 0
            r5 = r14
            android.util.Pair r0 = r5.mo16239l(r6, r7, r8, r9)
            java.lang.Object r1 = r0.first
            java.lang.Object r0 = r0.second
            java.lang.Long r0 = (java.lang.Long) r0
            long r2 = r0.longValue()
            boolean r0 = r11.f14288r
            if (r0 == 0) goto L_0x0086
            com.google.android.gms.internal.ads.z14 r12 = r11.f14284n
            com.google.android.gms.internal.ads.z14 r12 = r12.mo22320p(r14)
            goto L_0x008a
        L_0x0086:
            com.google.android.gms.internal.ads.z14 r12 = com.google.android.gms.internal.ads.z14.m34390r(r14, r12, r1)
        L_0x008a:
            r11.f14284n = r12
            com.google.android.gms.internal.ads.y14 r12 = r11.f14285o
            if (r12 == 0) goto L_0x009f
            r11.m21048E(r2)
            com.google.android.gms.internal.ads.f24 r12 = r12.f26205g
            java.lang.Object r13 = r12.f25531a
            java.lang.Object r13 = r11.m21047D(r13)
            com.google.android.gms.internal.ads.f24 r13 = r12.mo17463c(r13)
        L_0x009f:
            r12 = 1
            r11.f14288r = r12
            r11.f14287q = r12
            com.google.android.gms.internal.ads.z14 r12 = r11.f14284n
            r11.mo18272u(r12)
            if (r13 == 0) goto L_0x00b3
            com.google.android.gms.internal.ads.y14 r12 = r11.f14285o
            java.util.Objects.requireNonNull(r12)
            r12.mo22142r(r13)
        L_0x00b3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.b24.mo16019A(java.lang.Object, com.google.android.gms.internal.ads.i24, com.google.android.gms.internal.ads.bg0):void");
    }

    /* renamed from: C */
    public final y14 mo16023i(f24 f24, r54 r54, long j) {
        y14 y14 = new y14(f24, r54, j, (byte[]) null);
        y14.mo22145u(this.f14280j);
        if (this.f14287q) {
            y14.mo22142r(f24.mo17463c(m21047D(f24.f25531a)));
        } else {
            this.f14285o = y14;
            if (!this.f14286p) {
                this.f14286p = true;
                mo20358B(null, this.f14280j);
            }
        }
        return y14;
    }

    /* renamed from: F */
    public final bg0 mo16021F() {
        return this.f14284n;
    }

    /* renamed from: e */
    public final void mo16022e(e24 e24) {
        ((y14) e24).mo22144t();
        if (e24 == this.f14285o) {
            this.f14285o = null;
        }
    }

    /* renamed from: s */
    public final void mo16024s(fr1 fr1) {
        super.mo16024s(fr1);
        if (!this.f14281k) {
            this.f14286p = true;
            mo20358B(null, this.f14280j);
        }
    }

    /* renamed from: t */
    public final void mo16025t() {
    }

    /* renamed from: v */
    public final void mo16026v() {
        this.f14287q = false;
        this.f14286p = false;
        super.mo16026v();
    }

    /* renamed from: x */
    public final C5825zn mo16027x() {
        return this.f14280j.mo16027x();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final /* bridge */ /* synthetic */ f24 mo16028z(Object obj, f24 f24) {
        Void voidR = (Void) obj;
        Object obj2 = f24.f25531a;
        if (this.f14284n.f26625d != null && this.f14284n.f26625d.equals(obj2)) {
            obj2 = z14.f26623e;
        }
        return f24.mo17463c(obj2);
    }
}
