package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zy3 extends o04 implements st3 {

    /* renamed from: E0 */
    private final Context f27073E0;
    /* access modifiers changed from: private */

    /* renamed from: F0 */
    public final vx3 f27074F0;

    /* renamed from: G0 */
    private final cy3 f27075G0;

    /* renamed from: H0 */
    private int f27076H0;

    /* renamed from: I0 */
    private boolean f27077I0;

    /* renamed from: J0 */
    private C5689w f27078J0;

    /* renamed from: K0 */
    private long f27079K0;

    /* renamed from: L0 */
    private boolean f27080L0;

    /* renamed from: M0 */
    private boolean f27081M0;

    /* renamed from: N0 */
    private boolean f27082N0;
    /* access modifiers changed from: private */

    /* renamed from: O0 */
    public ku3 f27083O0;

    public zy3(Context context, j04 j04, q04 q04, boolean z, Handler handler, wx3 wx3, cy3 cy3) {
        super(1, j04, q04, false, 44100.0f);
        this.f27073E0 = context.getApplicationContext();
        this.f27075G0 = cy3;
        this.f27074F0 = new vx3(handler, wx3);
        cy3.mo16786o(new yy3(this, (xy3) null));
    }

    /* renamed from: B0 */
    private final void m34874B0() {
        long S = this.f27075G0.mo16771S(mo16486E());
        if (S != Long.MIN_VALUE) {
            if (!this.f27081M0) {
                S = Math.max(this.f27079K0, S);
            }
            this.f27079K0 = S;
            this.f27081M0 = false;
        }
    }

    /* renamed from: H0 */
    private final int m34877H0(m04 m04, C5689w wVar) {
        int i;
        if (!"OMX.google.raw.decoder".equals(m04.f19692a) || (i = wy2.f25579a) >= 24 || (i == 23 && wy2.m33457t(this.f27073E0))) {
            return wVar.f25134m;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo16485A() {
        this.f27082N0 = true;
        try {
            this.f27075G0.zze();
            try {
                super.mo16485A();
            } finally {
                this.f27074F0.mo21630e(this.f20844x0);
            }
        } catch (Throwable th) {
            super.mo16485A();
            throw th;
        } finally {
            this.f27074F0.mo21630e(this.f20844x0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo16513D(boolean z, boolean z2) throws ji3 {
        super.mo16513D(z, z2);
        this.f27074F0.mo21631f(this.f20844x0);
        mo16576z();
    }

    /* renamed from: E */
    public final boolean mo16486E() {
        return super.mo16486E() && this.f27075G0.mo16785n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo16487G(long j, boolean z) throws ji3 {
        super.mo16487G(j, z);
        this.f27075G0.zze();
        this.f27079K0 = j;
        this.f27080L0 = true;
        this.f27081M0 = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public final void mo16514H() {
        try {
            super.mo16514H();
            if (this.f27082N0) {
                this.f27082N0 = false;
                this.f27075G0.mo16779h();
            }
        } catch (Throwable th) {
            if (this.f27082N0) {
                this.f27082N0 = false;
                this.f27075G0.mo16779h();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo16515I() {
        this.f27075G0.mo16776e();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo16516J() {
        m34874B0();
        this.f27075G0.mo16775d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final float mo16517L(float f, C5689w wVar, C5689w[] wVarArr) {
        int i = -1;
        for (C5689w wVar2 : wVarArr) {
            int i2 = wVar2.f25147z;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return ((float) i) * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final int mo16518M(q04 q04, C5689w wVar) throws x04 {
        if (!C5463pw.m29203g(wVar.f25133l)) {
            return 0;
        }
        int i = wy2.f25579a >= 21 ? 32 : 0;
        int i2 = wVar.f25120E;
        boolean z0 = o04.m28210z0(wVar);
        if (z0 && this.f27075G0.mo16781j(wVar) && (i2 == 0 || d14.m22297d() != null)) {
            return i | 12;
        }
        if (("audio/raw".equals(wVar.f25133l) && !this.f27075G0.mo16781j(wVar)) || !this.f27075G0.mo16781j(wy2.m33434b(2, wVar.f25146y, wVar.f25147z))) {
            return 1;
        }
        List<m04> S = mo16528S(q04, wVar, false);
        if (S.isEmpty()) {
            return 1;
        }
        if (!z0) {
            return 2;
        }
        m04 m04 = S.get(0);
        boolean d = m04.mo19318d(wVar);
        int i3 = 8;
        if (d && m04.mo19319e(wVar)) {
            i3 = 16;
        }
        return (true != d ? 3 : 4) | i3 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final eb3 mo16519N(m04 m04, C5689w wVar, C5689w wVar2) {
        int i;
        int i2;
        eb3 b = m04.mo19317b(wVar, wVar2);
        int i3 = b.f15917e;
        if (m34877H0(m04, wVar2) > this.f27076H0) {
            i3 |= 64;
        }
        String str = m04.f19692a;
        if (i3 != 0) {
            i = i3;
            i2 = 0;
        } else {
            i2 = b.f15916d;
            i = 0;
        }
        return new eb3(str, wVar, wVar2, i2, i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final eb3 mo16521O(qt3 qt3) throws ji3 {
        eb3 O = super.mo16521O(qt3);
        this.f27074F0.mo21632g(qt3.f22027a, O);
        return O;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a8, code lost:
        if ("AXON 7 mini".equals(r10) == false) goto L_0x00aa;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00f0  */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.i04 mo16526R(com.google.android.gms.internal.ads.m04 r8, com.google.android.gms.internal.ads.C5689w r9, android.media.MediaCrypto r10, float r11) {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.w[] r10 = r7.mo16569r()
            int r0 = r7.m34877H0(r8, r9)
            int r1 = r10.length
            r2 = 0
            r3 = 1
            if (r1 != r3) goto L_0x000e
            goto L_0x0026
        L_0x000e:
            r4 = 0
        L_0x000f:
            if (r4 >= r1) goto L_0x0026
            r5 = r10[r4]
            com.google.android.gms.internal.ads.eb3 r6 = r8.mo19317b(r9, r5)
            int r6 = r6.f15916d
            if (r6 == 0) goto L_0x0023
            int r5 = r7.m34877H0(r8, r5)
            int r0 = java.lang.Math.max(r0, r5)
        L_0x0023:
            int r4 = r4 + 1
            goto L_0x000f
        L_0x0026:
            r7.f27076H0 = r0
            java.lang.String r10 = r8.f19692a
            int r0 = com.google.android.gms.internal.ads.wy2.f25579a
            r1 = 24
            if (r0 >= r1) goto L_0x005e
            java.lang.String r4 = "OMX.SEC.aac.dec"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.wy2.f25581c
            java.lang.String r4 = "samsung"
            boolean r10 = r4.equals(r10)
            if (r10 == 0) goto L_0x005e
            java.lang.String r10 = com.google.android.gms.internal.ads.wy2.f25580b
            java.lang.String r4 = "zeroflte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "herolte"
            boolean r4 = r10.startsWith(r4)
            if (r4 != 0) goto L_0x005c
            java.lang.String r4 = "heroqlte"
            boolean r10 = r10.startsWith(r4)
            if (r10 == 0) goto L_0x005e
        L_0x005c:
            r10 = 1
            goto L_0x005f
        L_0x005e:
            r10 = 0
        L_0x005f:
            r7.f27077I0 = r10
            java.lang.String r10 = r8.f19694c
            int r4 = r7.f27076H0
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            java.lang.String r6 = "mime"
            r5.setString(r6, r10)
            int r10 = r9.f25146y
            java.lang.String r6 = "channel-count"
            r5.setInteger(r6, r10)
            int r10 = r9.f25147z
            java.lang.String r6 = "sample-rate"
            r5.setInteger(r6, r10)
            java.util.List<byte[]> r10 = r9.f25135n
            com.google.android.gms.internal.ads.ac2.m20670b(r5, r10)
            java.lang.String r10 = "max-input-size"
            com.google.android.gms.internal.ads.ac2.m20669a(r5, r10, r4)
            r10 = 23
            if (r0 < r10) goto L_0x00af
            java.lang.String r4 = "priority"
            r5.setInteger(r4, r2)
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x00af
            if (r0 != r10) goto L_0x00aa
            java.lang.String r10 = com.google.android.gms.internal.ads.wy2.f25582d
            java.lang.String r2 = "ZTE B2017G"
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L_0x00af
            java.lang.String r2 = "AXON 7 mini"
            boolean r10 = r2.equals(r10)
            if (r10 != 0) goto L_0x00af
        L_0x00aa:
            java.lang.String r10 = "operating-rate"
            r5.setFloat(r10, r11)
        L_0x00af:
            r10 = 28
            if (r0 > r10) goto L_0x00c2
            java.lang.String r10 = r9.f25133l
            java.lang.String r11 = "audio/ac4"
            boolean r10 = r11.equals(r10)
            if (r10 == 0) goto L_0x00c2
            java.lang.String r10 = "ac4-is-sync"
            r5.setInteger(r10, r3)
        L_0x00c2:
            if (r0 < r1) goto L_0x00db
            com.google.android.gms.internal.ads.cy3 r10 = r7.f27075G0
            int r11 = r9.f25146y
            int r0 = r9.f25147z
            r1 = 4
            com.google.android.gms.internal.ads.w r11 = com.google.android.gms.internal.ads.wy2.m33434b(r1, r11, r0)
            int r10 = r10.mo16772a(r11)
            r11 = 2
            if (r10 != r11) goto L_0x00db
            java.lang.String r10 = "pcm-encoding"
            r5.setInteger(r10, r1)
        L_0x00db:
            java.lang.String r10 = r8.f19693b
            java.lang.String r11 = "audio/raw"
            boolean r10 = r11.equals(r10)
            r0 = 0
            if (r10 == 0) goto L_0x00f0
            java.lang.String r10 = r9.f25133l
            boolean r10 = r11.equals(r10)
            if (r10 != 0) goto L_0x00f0
            r10 = r9
            goto L_0x00f1
        L_0x00f0:
            r10 = r0
        L_0x00f1:
            r7.f27078J0 = r10
            com.google.android.gms.internal.ads.i04 r8 = com.google.android.gms.internal.ads.i04.m25002a(r8, r5, r9, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zy3.mo16526R(com.google.android.gms.internal.ads.m04, com.google.android.gms.internal.ads.w, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.i04");
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final List<m04> mo16528S(q04 q04, C5689w wVar, boolean z) throws x04 {
        m04 d;
        String str = wVar.f25133l;
        if (str == null) {
            return Collections.emptyList();
        }
        if (this.f27075G0.mo16781j(wVar) && (d = d14.m22297d()) != null) {
            return Collections.singletonList(d);
        }
        List<m04> f = d14.m22299f(d14.m22298e(str, false, false), wVar);
        if ("audio/eac3-joc".equals(str)) {
            ArrayList arrayList = new ArrayList(f);
            arrayList.addAll(d14.m22298e("audio/eac3", false, false));
            f = arrayList;
        }
        return Collections.unmodifiableList(f);
    }

    /* renamed from: U */
    public final boolean mo16489U() {
        return this.f27075G0.zzs() || super.mo16489U();
    }

    /* renamed from: V */
    public final void mo18617V(i10 i10) {
        this.f27075G0.mo16782k(i10);
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo16529W(Exception exc) {
        y92.m34067a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f27074F0.mo21626a(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo16530X(String str, long j, long j2) {
        this.f27074F0.mo21628c(str, j, j2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo16531Y(String str) {
        this.f27074F0.mo21629d(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo16532Z(C5689w wVar, MediaFormat mediaFormat) throws ji3 {
        int i;
        int i2;
        C5689w wVar2 = this.f27078J0;
        int[] iArr = null;
        if (wVar2 != null) {
            wVar = wVar2;
        } else if (mo19877n0() != null) {
            if ("audio/raw".equals(wVar.f25133l)) {
                i = wVar.f25116A;
            } else if (wy2.f25579a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                i = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                i = wy2.m33423R(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                i = "audio/raw".equals(wVar.f25133l) ? wVar.f25116A : 2;
            }
            jb4 jb4 = new jb4();
            jb4.mo18599s("audio/raw");
            jb4.mo18594n(i);
            jb4.mo18577c(wVar.f25117B);
            jb4.mo18579d(wVar.f25118C);
            jb4.mo18582e0(mediaFormat.getInteger("channel-count"));
            jb4.mo18600t(mediaFormat.getInteger("sample-rate"));
            C5689w y = jb4.mo18605y();
            if (this.f27077I0 && y.f25146y == 6 && (i2 = wVar.f25146y) < 6) {
                iArr = new int[i2];
                for (int i3 = 0; i3 < wVar.f25146y; i3++) {
                    iArr[i3] = i3;
                }
            }
            wVar = y;
        }
        try {
            this.f27075G0.mo16787p(wVar, 0, iArr);
        } catch (xx3 e) {
            throw mo16571u(e, e.zza, false, 5001);
        }
    }

    /* renamed from: b */
    public final i10 mo18619b() {
        return this.f27075G0.mo16773b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f0 */
    public final void mo22450f0() {
        this.f27081M0 = true;
    }

    /* renamed from: g */
    public final st3 mo16561g() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public final void mo16534g0() {
        this.f27075G0.mo16774c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public final void mo16535h0(k31 k31) {
        if (this.f27080L0 && !k31.mo17032f()) {
            if (Math.abs(k31.f18745e - this.f27079K0) > 500000) {
                this.f27079K0 = k31.f18745e;
            }
            this.f27080L0 = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i0 */
    public final void mo19873i0() throws ji3 {
        try {
            this.f27075G0.mo16778g();
        } catch (by3 e) {
            throw mo16571u(e, e.zzb, e.zza, 5002);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final boolean mo16536j0(long j, long j2, k04 k04, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C5689w wVar) throws ji3 {
        Objects.requireNonNull(byteBuffer);
        if (this.f27078J0 != null && (i2 & 2) != 0) {
            Objects.requireNonNull(k04);
            k04.mo17800f(i, false);
            return true;
        } else if (z) {
            if (k04 != null) {
                k04.mo17800f(i, false);
            }
            this.f20844x0.f15560f += i3;
            this.f27075G0.mo16774c();
            return true;
        } else {
            try {
                if (!this.f27075G0.mo16784m(byteBuffer, j3, i3)) {
                    return false;
                }
                if (k04 != null) {
                    k04.mo17800f(i, false);
                }
                this.f20844x0.f15559e += i3;
                return true;
            } catch (yx3 e) {
                throw mo16571u(e, e.zzb, false, 5001);
            } catch (by3 e2) {
                throw mo16571u(e2, wVar, e2.zza, 5002);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: k0 */
    public final boolean mo19874k0(C5689w wVar) {
        return this.f27075G0.mo16781j(wVar);
    }

    /* renamed from: n */
    public final void mo16537n(int i, Object obj) throws ji3 {
        if (i == 2) {
            this.f27075G0.mo16783l(((Float) obj).floatValue());
        } else if (i == 3) {
            this.f27075G0.mo16788q((fc3) obj);
        } else if (i != 6) {
            switch (i) {
                case 9:
                    this.f27075G0.mo16789r(((Boolean) obj).booleanValue());
                    return;
                case 10:
                    this.f27075G0.mo16780i(((Integer) obj).intValue());
                    return;
                case 11:
                    this.f27083O0 = (ku3) obj;
                    return;
                default:
                    return;
            }
        } else {
            this.f27075G0.mo16777f((ys3) obj);
        }
    }

    /* renamed from: s */
    public final String mo16493s() {
        return "MediaCodecAudioRenderer";
    }

    public final long zza() {
        if (mo16567p() == 2) {
            m34874B0();
        }
        return this.f27079K0;
    }
}
