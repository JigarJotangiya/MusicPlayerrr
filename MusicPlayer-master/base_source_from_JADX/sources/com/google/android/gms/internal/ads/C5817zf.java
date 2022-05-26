package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;

@TargetApi(16)
/* renamed from: com.google.android.gms.internal.ads.zf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5817zf extends C5190ii implements C5452pl {
    /* access modifiers changed from: private */

    /* renamed from: Q */
    public final C5224jf f26747Q;

    /* renamed from: R */
    private final C5668vf f26748R = new C5668vf((C5816ze) null, new C4927bf[0], new C5780yf(this, (C5742xf) null));

    /* renamed from: S */
    private boolean f26749S;

    /* renamed from: T */
    private int f26750T;

    /* renamed from: U */
    private int f26751U;

    /* renamed from: V */
    private long f26752V;
    /* access modifiers changed from: private */

    /* renamed from: W */
    public boolean f26753W;

    public C5817zf(C5264ki kiVar, C5336mg mgVar, boolean z, Handler handler, C5261kf kfVar) {
        super(1, kiVar, (C5336mg) null, true);
        this.f26747Q = new C5224jf(handler, kfVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C5116gi mo18355D(C5264ki kiVar, zzapg zzapg, boolean z) throws C5375ni {
        return super.mo18355D(kiVar, zzapg, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0034, code lost:
        if (r4.startsWith("heroqlte") == false) goto L_0x0037;
     */
    /* renamed from: E */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo18356E(com.google.android.gms.internal.ads.C5116gi r4, android.media.MediaCodec r5, com.google.android.gms.internal.ads.zzapg r6, android.media.MediaCrypto r7) {
        /*
            r3 = this;
            java.lang.String r4 = r4.f17102a
            int r7 = com.google.android.gms.internal.ads.C4934bm.f14552a
            r0 = 1
            r1 = 0
            r2 = 24
            if (r7 >= r2) goto L_0x0037
            java.lang.String r7 = "OMX.SEC.aac.dec"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C4934bm.f14554c
            java.lang.String r7 = "samsung"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L_0x0037
            java.lang.String r4 = com.google.android.gms.internal.ads.C4934bm.f14553b
            java.lang.String r7 = "zeroflte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "herolte"
            boolean r7 = r4.startsWith(r7)
            if (r7 != 0) goto L_0x0038
            java.lang.String r7 = "heroqlte"
            boolean r4 = r4.startsWith(r7)
            if (r4 == 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r0 = 0
        L_0x0038:
            r3.f26749S = r0
            android.media.MediaFormat r4 = r6.mo22481b()
            r6 = 0
            r5.configure(r4, r6, r6, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5817zf.mo18356E(com.google.android.gms.internal.ads.gi, android.media.MediaCodec, com.google.android.gms.internal.ads.zzapg, android.media.MediaCrypto):void");
    }

    /* renamed from: F */
    public final boolean mo18357F() {
        return super.mo18357F() && this.f26748R.mo21492o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo18358G(String str, long j, long j2) {
        this.f26747Q.mo18610d(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo18359H(zzapg zzapg) throws C5778yd {
        super.mo18359H(zzapg);
        this.f26747Q.mo18613g(zzapg);
        this.f26750T = "audio/raw".equals(zzapg.f27126l) ? zzapg.f27140z : 2;
        this.f26751U = zzapg.f27138x;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo18360J(MediaCodec mediaCodec, MediaFormat mediaFormat) throws C5778yd {
        int[] iArr;
        int i;
        int integer = mediaFormat.getInteger("channel-count");
        int integer2 = mediaFormat.getInteger("sample-rate");
        if (!this.f26749S || integer != 6) {
            i = integer;
            iArr = null;
        } else {
            int i2 = this.f26751U;
            if (i2 < 6) {
                int[] iArr2 = new int[i2];
                for (int i3 = 0; i3 < this.f26751U; i3++) {
                    iArr2[i3] = i3;
                }
                iArr = iArr2;
            } else {
                iArr = null;
            }
            i = 6;
        }
        try {
            this.f26748R.mo21482e("audio/raw", i, integer2, this.f26750T, 0, iArr);
        } catch (C5446pf e) {
            throw C5778yd.zza(e, mo21800k());
        }
    }

    /* renamed from: K */
    public final long mo20279K() {
        long a = this.f26748R.mo21479a(mo18357F());
        if (a != Long.MIN_VALUE) {
            if (!this.f26753W) {
                a = Math.max(this.f26752V, a);
            }
            this.f26752V = a;
            this.f26753W = false;
        }
        return this.f26752V;
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final void mo18361L() throws C5778yd {
        try {
            this.f26748R.mo21486i();
        } catch (C5631uf e) {
            throw C5778yd.zza(e, mo21800k());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final boolean mo18362M(long j, long j2, MediaCodec mediaCodec, ByteBuffer byteBuffer, int i, int i2, long j3, boolean z) throws C5778yd {
        if (z) {
            mediaCodec.releaseOutputBuffer(i, false);
            this.f18020O.f17982e++;
            this.f26748R.mo21483f();
            return true;
        }
        try {
            if (!this.f26748R.mo21490m(byteBuffer, j3)) {
                return false;
            }
            mediaCodec.releaseOutputBuffer(i, false);
            this.f18020O.f17981d++;
            return true;
        } catch (C5483qf | C5631uf e) {
            throw C5778yd.zza(e, mo21800k());
        }
    }

    /* renamed from: d */
    public final C5482qe mo20280d(C5482qe qeVar) {
        return this.f26748R.mo21481d(qeVar);
    }

    /* renamed from: g */
    public final C5452pl mo20637g() {
        return this;
    }

    /* renamed from: i */
    public final void mo15757i(int i, Object obj) throws C5778yd {
        if (i == 2) {
            this.f26748R.mo21489l(((Float) obj).floatValue());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final void mo18372o() {
        try {
            this.f26748R.mo21487j();
            try {
                super.mo18372o();
            } finally {
                this.f18020O.mo18329a();
                this.f26747Q.mo18611e(this.f18020O);
            }
        } catch (Throwable th) {
            super.mo18372o();
            throw th;
        } finally {
            this.f18020O.mo18329a();
            this.f26747Q.mo18611e(this.f18020O);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo18373p(boolean z) throws C5778yd {
        super.mo18373p(z);
        this.f26747Q.mo18612f(this.f18020O);
        int i = mo21802n().f23833a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo18374q(long j, boolean z) throws C5778yd {
        super.mo18374q(j, z);
        this.f26748R.mo21488k();
        this.f26752V = j;
        this.f26753W = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo18407r() {
        this.f26748R.mo21485h();
    }

    /* renamed from: s */
    public final C5482qe mo20281s() {
        return this.f26748R.mo21480c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public final void mo18408u() {
        this.f26748R.mo21484g();
    }

    /* renamed from: w */
    public final boolean mo18375w() {
        return this.f26748R.mo21491n() || super.mo18375w();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public final int mo18376z(C5264ki kiVar, zzapg zzapg) throws C5375ni {
        int i;
        int i2;
        String str = zzapg.f27126l;
        if (!C5489ql.m29556a(str)) {
            return 0;
        }
        int i3 = C4934bm.f14552a;
        int i4 = i3 >= 21 ? 16 : 0;
        C5116gi c = C5560si.m30725c(str, false);
        if (c == null) {
            return 1;
        }
        int i5 = 2;
        if (i3 < 21 || (((i = zzapg.f27139y) == -1 || c.mo17925d(i)) && ((i2 = zzapg.f27138x) == -1 || c.mo17924c(i2)))) {
            i5 = 3;
        }
        return i4 | 4 | i5;
    }
}
