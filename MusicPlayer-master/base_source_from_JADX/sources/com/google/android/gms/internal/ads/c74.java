package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaCodecInfo;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c74 extends o04 {

    /* renamed from: j1 */
    private static final int[] f14850j1 = {1920, 1600, 1440, 1280, 960, 854, 640, 540, 480};

    /* renamed from: k1 */
    private static boolean f14851k1;

    /* renamed from: l1 */
    private static boolean f14852l1;

    /* renamed from: E0 */
    private final Context f14853E0;

    /* renamed from: F0 */
    private final l74 f14854F0;

    /* renamed from: G0 */
    private final w74 f14855G0;

    /* renamed from: H0 */
    private final boolean f14856H0 = "NVIDIA".equals(wy2.f25581c);

    /* renamed from: I0 */
    private b74 f14857I0;

    /* renamed from: J0 */
    private boolean f14858J0;

    /* renamed from: K0 */
    private boolean f14859K0;

    /* renamed from: L0 */
    private Surface f14860L0;

    /* renamed from: M0 */
    private zzuq f14861M0;

    /* renamed from: N0 */
    private boolean f14862N0;

    /* renamed from: O0 */
    private int f14863O0 = 1;

    /* renamed from: P0 */
    private boolean f14864P0;

    /* renamed from: Q0 */
    private boolean f14865Q0;

    /* renamed from: R0 */
    private boolean f14866R0;

    /* renamed from: S0 */
    private long f14867S0;

    /* renamed from: T0 */
    private long f14868T0 = -9223372036854775807L;

    /* renamed from: U0 */
    private long f14869U0;

    /* renamed from: V0 */
    private int f14870V0;

    /* renamed from: W0 */
    private int f14871W0;

    /* renamed from: X0 */
    private int f14872X0;

    /* renamed from: Y0 */
    private long f14873Y0;

    /* renamed from: Z0 */
    private long f14874Z0;

    /* renamed from: a1 */
    private long f14875a1;

    /* renamed from: b1 */
    private int f14876b1;

    /* renamed from: c1 */
    private int f14877c1 = -1;

    /* renamed from: d1 */
    private int f14878d1 = -1;

    /* renamed from: e1 */
    private int f14879e1;

    /* renamed from: f1 */
    private float f14880f1 = -1.0f;

    /* renamed from: g1 */
    private cw0 f14881g1 = null;

    /* renamed from: h1 */
    private int f14882h1 = 0;

    /* renamed from: i1 */
    private d74 f14883i1;

    public c74(Context context, j04 j04, q04 q04, long j, boolean z, Handler handler, x74 x74, int i) {
        super(2, j04, q04, false, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f14853E0 = applicationContext;
        this.f14854F0 = new l74(applicationContext);
        this.f14855G0 = new w74(handler, x74);
    }

    /* renamed from: F0 */
    protected static int m21697F0(m04 m04, C5689w wVar) {
        if (wVar.f25134m == -1) {
            return m21698G0(m04, wVar);
        }
        int size = wVar.f25135n.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += wVar.f25135n.get(i2).length;
        }
        return wVar.f25134m + i;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0021, code lost:
        r12 = ((java.lang.Integer) r12.first).intValue();
     */
    /* renamed from: G0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int m21698G0(com.google.android.gms.internal.ads.m04 r11, com.google.android.gms.internal.ads.C5689w r12) {
        /*
            int r0 = r12.f25138q
            int r1 = r12.f25139r
            r2 = -1
            if (r0 == r2) goto L_0x00c8
            if (r1 != r2) goto L_0x000b
            goto L_0x00c8
        L_0x000b:
            java.lang.String r3 = r12.f25133l
            java.lang.String r4 = "video/dolby-vision"
            boolean r4 = r4.equals(r3)
            java.lang.String r5 = "video/avc"
            java.lang.String r6 = "video/hevc"
            r7 = 1
            r8 = 2
            if (r4 == 0) goto L_0x0034
            android.util.Pair r12 = com.google.android.gms.internal.ads.d14.m22295b(r12)
            if (r12 == 0) goto L_0x0033
            java.lang.Object r12 = r12.first
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            r3 = 512(0x200, float:7.175E-43)
            if (r12 == r3) goto L_0x0031
            if (r12 == r7) goto L_0x0031
            if (r12 != r8) goto L_0x0033
        L_0x0031:
            r3 = r5
            goto L_0x0034
        L_0x0033:
            r3 = r6
        L_0x0034:
            int r12 = r3.hashCode()
            r4 = 5
            r9 = 4
            r10 = 3
            switch(r12) {
                case -1664118616: goto L_0x006d;
                case -1662541442: goto L_0x0065;
                case 1187890754: goto L_0x005b;
                case 1331836730: goto L_0x0053;
                case 1599127256: goto L_0x0049;
                case 1599127257: goto L_0x003f;
                default: goto L_0x003e;
            }
        L_0x003e:
            goto L_0x0077
        L_0x003f:
            java.lang.String r12 = "video/x-vnd.on2.vp9"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 5
            goto L_0x0078
        L_0x0049:
            java.lang.String r12 = "video/x-vnd.on2.vp8"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 3
            goto L_0x0078
        L_0x0053:
            boolean r12 = r3.equals(r5)
            if (r12 == 0) goto L_0x0077
            r12 = 2
            goto L_0x0078
        L_0x005b:
            java.lang.String r12 = "video/mp4v-es"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 1
            goto L_0x0078
        L_0x0065:
            boolean r12 = r3.equals(r6)
            if (r12 == 0) goto L_0x0077
            r12 = 4
            goto L_0x0078
        L_0x006d:
            java.lang.String r12 = "video/3gpp"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x0077
            r12 = 0
            goto L_0x0078
        L_0x0077:
            r12 = -1
        L_0x0078:
            if (r12 == 0) goto L_0x00c1
            if (r12 == r7) goto L_0x00c1
            if (r12 == r8) goto L_0x0089
            if (r12 == r10) goto L_0x00c1
            if (r12 == r9) goto L_0x0085
            if (r12 == r4) goto L_0x0085
            return r2
        L_0x0085:
            int r0 = r0 * r1
            r8 = 4
            goto L_0x00c3
        L_0x0089:
            java.lang.String r12 = com.google.android.gms.internal.ads.wy2.f25582d
            java.lang.String r3 = "BRAVIA 4K 2015"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = com.google.android.gms.internal.ads.wy2.f25581c
            java.lang.String r4 = "Amazon"
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L_0x00b1
            java.lang.String r3 = "KFSOWI"
            boolean r3 = r3.equals(r12)
            if (r3 != 0) goto L_0x00c0
            java.lang.String r3 = "AFTS"
            boolean r12 = r3.equals(r12)
            if (r12 == 0) goto L_0x00b1
            boolean r11 = r11.f19697f
            if (r11 != 0) goto L_0x00c0
        L_0x00b1:
            r11 = 16
            int r12 = com.google.android.gms.internal.ads.wy2.m33416K(r0, r11)
            int r11 = com.google.android.gms.internal.ads.wy2.m33416K(r1, r11)
            int r12 = r12 * r11
            int r0 = r12 * 256
            goto L_0x00c3
        L_0x00c0:
            return r2
        L_0x00c1:
            int r0 = r0 * r1
        L_0x00c3:
            int r0 = r0 * 3
            int r8 = r8 + r8
            int r0 = r0 / r8
            return r0
        L_0x00c8:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c74.m21698G0(com.google.android.gms.internal.ads.m04, com.google.android.gms.internal.ads.w):int");
    }

    /* renamed from: H0 */
    private static List<m04> m21699H0(q04 q04, C5689w wVar, boolean z, boolean z2) throws x04 {
        Pair<Integer, Integer> b;
        String str = wVar.f25133l;
        if (str == null) {
            return Collections.emptyList();
        }
        List<m04> f = d14.m22299f(d14.m22298e(str, z, z2), wVar);
        if ("video/dolby-vision".equals(str) && (b = d14.m22295b(wVar)) != null) {
            int intValue = ((Integer) b.first).intValue();
            if (intValue == 16 || intValue == 256) {
                f.addAll(d14.m22298e("video/hevc", z, z2));
            } else if (intValue == 512) {
                f.addAll(d14.m22298e("video/avc", z, z2));
            }
        }
        return Collections.unmodifiableList(f);
    }

    /* renamed from: I0 */
    private final void m21700I0() {
        int i = this.f14877c1;
        if (i == -1) {
            if (this.f14878d1 != -1) {
                i = -1;
            } else {
                return;
            }
        }
        cw0 cw0 = this.f14881g1;
        if (cw0 == null || cw0.f15355a != i || cw0.f15356b != this.f14878d1 || cw0.f15357c != this.f14879e1 || cw0.f15358d != this.f14880f1) {
            cw0 cw02 = new cw0(i, this.f14878d1, this.f14879e1, this.f14880f1);
            this.f14881g1 = cw02;
            this.f14855G0.mo21765t(cw02);
        }
    }

    /* renamed from: J0 */
    private final void m21701J0() {
        cw0 cw0 = this.f14881g1;
        if (cw0 != null) {
            this.f14855G0.mo21765t(cw0);
        }
    }

    /* renamed from: K0 */
    private final void m21702K0() {
        Surface surface = this.f14860L0;
        zzuq zzuq = this.f14861M0;
        if (surface == zzuq) {
            this.f14860L0 = null;
        }
        zzuq.release();
        this.f14861M0 = null;
    }

    /* renamed from: L0 */
    private static boolean m21703L0(long j) {
        return j < -30000;
    }

    /* renamed from: M0 */
    private final boolean m21704M0(m04 m04) {
        if (wy2.f25579a < 23 || m21705S0(m04.f19692a) || (m04.f19697f && !zzuq.m34976b(this.f14853E0))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0351, code lost:
        if (r1.equals("602LV") != false) goto L_0x0713;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:487:0x074d, code lost:
        if (r7 != 2) goto L_0x074f;
     */
    /* renamed from: S0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static final boolean m21705S0(java.lang.String r13) {
        /*
            java.lang.String r0 = "OMX.google"
            boolean r13 = r13.startsWith(r0)
            r0 = 0
            if (r13 == 0) goto L_0x000a
            return r0
        L_0x000a:
            java.lang.Class<com.google.android.gms.internal.ads.c74> r13 = com.google.android.gms.internal.ads.c74.class
            monitor-enter(r13)
            boolean r1 = f14851k1     // Catch:{ all -> 0x0757 }
            if (r1 != 0) goto L_0x0753
            int r1 = com.google.android.gms.internal.ads.wy2.f25579a     // Catch:{ all -> 0x0757 }
            r2 = 4
            r3 = 5
            r4 = 3
            r5 = 6
            r6 = 28
            r7 = -1
            r8 = 2
            r9 = 1
            if (r1 > r6) goto L_0x0076
            java.lang.String r10 = com.google.android.gms.internal.ads.wy2.f25580b     // Catch:{ all -> 0x0757 }
            int r11 = r10.hashCode()     // Catch:{ all -> 0x0757 }
            switch(r11) {
                case -1339091551: goto L_0x0064;
                case -1220081023: goto L_0x005a;
                case -1220066608: goto L_0x0050;
                case -1012436106: goto L_0x0046;
                case -64886864: goto L_0x003c;
                case 3415681: goto L_0x0032;
                case 825323514: goto L_0x0028;
                default: goto L_0x0027;
            }
        L_0x0027:
            goto L_0x006e
        L_0x0028:
            java.lang.String r11 = "machuca"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 4
            goto L_0x006f
        L_0x0032:
            java.lang.String r11 = "once"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 5
            goto L_0x006f
        L_0x003c:
            java.lang.String r11 = "magnolia"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 3
            goto L_0x006f
        L_0x0046:
            java.lang.String r11 = "oneday"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 6
            goto L_0x006f
        L_0x0050:
            java.lang.String r11 = "dangalUHD"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 1
            goto L_0x006f
        L_0x005a:
            java.lang.String r11 = "dangalFHD"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 2
            goto L_0x006f
        L_0x0064:
            java.lang.String r11 = "dangal"
            boolean r10 = r10.equals(r11)
            if (r10 == 0) goto L_0x006e
            r10 = 0
            goto L_0x006f
        L_0x006e:
            r10 = -1
        L_0x006f:
            switch(r10) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x0073;
                case 5: goto L_0x0073;
                case 6: goto L_0x0073;
                default: goto L_0x0072;
            }
        L_0x0072:
            goto L_0x0076
        L_0x0073:
            r0 = 1
            goto L_0x074f
        L_0x0076:
            r10 = 27
            if (r1 > r10) goto L_0x0085
            java.lang.String r11 = "HWEML"
            java.lang.String r12 = com.google.android.gms.internal.ads.wy2.f25580b     // Catch:{ all -> 0x0757 }
            boolean r11 = r11.equals(r12)     // Catch:{ all -> 0x0757 }
            if (r11 == 0) goto L_0x0085
            goto L_0x0073
        L_0x0085:
            r11 = 26
            if (r1 > r11) goto L_0x074f
            java.lang.String r1 = com.google.android.gms.internal.ads.wy2.f25580b     // Catch:{ all -> 0x0757 }
            int r12 = r1.hashCode()     // Catch:{ all -> 0x0757 }
            switch(r12) {
                case -2144781245: goto L_0x0707;
                case -2144781185: goto L_0x06fc;
                case -2144781160: goto L_0x06f1;
                case -2097309513: goto L_0x06e6;
                case -2022874474: goto L_0x06db;
                case -1978993182: goto L_0x06d0;
                case -1978990237: goto L_0x06c5;
                case -1936688988: goto L_0x06ba;
                case -1936688066: goto L_0x06af;
                case -1936688065: goto L_0x06a3;
                case -1931988508: goto L_0x0697;
                case -1885099851: goto L_0x068b;
                case -1696512866: goto L_0x067f;
                case -1680025915: goto L_0x0673;
                case -1615810839: goto L_0x0667;
                case -1600724499: goto L_0x065b;
                case -1554255044: goto L_0x064f;
                case -1481772737: goto L_0x0643;
                case -1481772730: goto L_0x0637;
                case -1481772729: goto L_0x062b;
                case -1320080169: goto L_0x061f;
                case -1217592143: goto L_0x0613;
                case -1180384755: goto L_0x0607;
                case -1139198265: goto L_0x05fb;
                case -1052835013: goto L_0x05ef;
                case -993250464: goto L_0x05e4;
                case -993250458: goto L_0x05d9;
                case -965403638: goto L_0x05cd;
                case -958336948: goto L_0x05c1;
                case -879245230: goto L_0x05b5;
                case -842500323: goto L_0x05a9;
                case -821392978: goto L_0x059d;
                case -797483286: goto L_0x0591;
                case -794946968: goto L_0x0585;
                case -788334647: goto L_0x0579;
                case -782144577: goto L_0x056d;
                case -575125681: goto L_0x0561;
                case -521118391: goto L_0x0555;
                case -430914369: goto L_0x0549;
                case -290434366: goto L_0x053d;
                case -282781963: goto L_0x0531;
                case -277133239: goto L_0x0525;
                case -173639913: goto L_0x0519;
                case -56598463: goto L_0x050d;
                case 2126: goto L_0x0501;
                case 2564: goto L_0x04f5;
                case 2715: goto L_0x04e9;
                case 2719: goto L_0x04dd;
                case 3091: goto L_0x04d1;
                case 3483: goto L_0x04c5;
                case 73405: goto L_0x04b9;
                case 75537: goto L_0x04ad;
                case 75739: goto L_0x04a1;
                case 76779: goto L_0x0495;
                case 78669: goto L_0x0489;
                case 79305: goto L_0x047d;
                case 80618: goto L_0x0471;
                case 88274: goto L_0x0465;
                case 98846: goto L_0x0459;
                case 98848: goto L_0x044d;
                case 99329: goto L_0x0441;
                case 101481: goto L_0x0435;
                case 1513190: goto L_0x042a;
                case 1514184: goto L_0x041f;
                case 1514185: goto L_0x0414;
                case 2133089: goto L_0x0408;
                case 2133091: goto L_0x03fc;
                case 2133120: goto L_0x03f0;
                case 2133151: goto L_0x03e4;
                case 2133182: goto L_0x03d8;
                case 2133184: goto L_0x03cc;
                case 2436959: goto L_0x03c0;
                case 2463773: goto L_0x03b4;
                case 2464648: goto L_0x03a8;
                case 2689555: goto L_0x039c;
                case 3154429: goto L_0x0390;
                case 3284551: goto L_0x0384;
                case 3351335: goto L_0x0378;
                case 3386211: goto L_0x036c;
                case 41325051: goto L_0x0360;
                case 51349633: goto L_0x0355;
                case 51350594: goto L_0x034b;
                case 55178625: goto L_0x033f;
                case 61542055: goto L_0x0334;
                case 65355429: goto L_0x0328;
                case 66214468: goto L_0x031c;
                case 66214470: goto L_0x0310;
                case 66214473: goto L_0x0304;
                case 66215429: goto L_0x02f8;
                case 66215431: goto L_0x02ec;
                case 66215433: goto L_0x02e0;
                case 66216390: goto L_0x02d4;
                case 76402249: goto L_0x02c8;
                case 76404105: goto L_0x02bc;
                case 76404911: goto L_0x02b0;
                case 80963634: goto L_0x02a4;
                case 82882791: goto L_0x0298;
                case 98715550: goto L_0x028c;
                case 101370885: goto L_0x0280;
                case 102844228: goto L_0x0274;
                case 165221241: goto L_0x0268;
                case 182191441: goto L_0x025c;
                case 245388979: goto L_0x0250;
                case 287431619: goto L_0x0244;
                case 307593612: goto L_0x0238;
                case 308517133: goto L_0x022c;
                case 316215098: goto L_0x0220;
                case 316215116: goto L_0x0214;
                case 316246811: goto L_0x0208;
                case 316246818: goto L_0x01fc;
                case 407160593: goto L_0x01f0;
                case 507412548: goto L_0x01e4;
                case 793982701: goto L_0x01d8;
                case 794038622: goto L_0x01cc;
                case 794040393: goto L_0x01c0;
                case 835649806: goto L_0x01b4;
                case 917340916: goto L_0x01a8;
                case 958008161: goto L_0x019c;
                case 1060579533: goto L_0x0190;
                case 1150207623: goto L_0x0184;
                case 1176899427: goto L_0x0178;
                case 1280332038: goto L_0x016c;
                case 1306947716: goto L_0x0160;
                case 1349174697: goto L_0x0154;
                case 1522194893: goto L_0x0148;
                case 1691543273: goto L_0x013c;
                case 1691544261: goto L_0x0130;
                case 1709443163: goto L_0x0124;
                case 1865889110: goto L_0x0118;
                case 1906253259: goto L_0x010c;
                case 1977196784: goto L_0x0100;
                case 2006372676: goto L_0x00f4;
                case 2019281702: goto L_0x00e8;
                case 2029784656: goto L_0x00dc;
                case 2030379515: goto L_0x00d0;
                case 2033393791: goto L_0x00c4;
                case 2047190025: goto L_0x00b8;
                case 2047252157: goto L_0x00ac;
                case 2048319463: goto L_0x00a0;
                case 2048855701: goto L_0x0094;
                default: goto L_0x0092;
            }
        L_0x0092:
            goto L_0x0712
        L_0x0094:
            java.lang.String r2 = "HWWAS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 66
            goto L_0x0713
        L_0x00a0:
            java.lang.String r2 = "HWVNS-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 65
            goto L_0x0713
        L_0x00ac:
            java.lang.String r2 = "ELUGA_Prim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 33
            goto L_0x0713
        L_0x00b8:
            java.lang.String r2 = "ELUGA_Note"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 32
            goto L_0x0713
        L_0x00c4:
            java.lang.String r2 = "ASUS_X00AD_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 14
            goto L_0x0713
        L_0x00d0:
            java.lang.String r2 = "HWCAM-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 64
            goto L_0x0713
        L_0x00dc:
            java.lang.String r2 = "HWBLN-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 63
            goto L_0x0713
        L_0x00e8:
            java.lang.String r2 = "DM-01K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 29
            goto L_0x0713
        L_0x00f4:
            java.lang.String r2 = "BRAVIA_ATV3_4K"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 19
            goto L_0x0713
        L_0x0100:
            java.lang.String r2 = "Infinix-X572"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 69
            goto L_0x0713
        L_0x010c:
            java.lang.String r2 = "PB2-670M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 100
            goto L_0x0713
        L_0x0118:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 117(0x75, float:1.64E-43)
            goto L_0x0713
        L_0x0124:
            java.lang.String r2 = "iball8735_9806"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 68
            goto L_0x0713
        L_0x0130:
            java.lang.String r2 = "CPH1715"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 24
            goto L_0x0713
        L_0x013c:
            java.lang.String r2 = "CPH1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 23
            goto L_0x0713
        L_0x0148:
            java.lang.String r2 = "woods_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 133(0x85, float:1.86E-43)
            goto L_0x0713
        L_0x0154:
            java.lang.String r2 = "htc_e56ml_dtul"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 61
            goto L_0x0713
        L_0x0160:
            java.lang.String r2 = "EverStar_S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 35
            goto L_0x0713
        L_0x016c:
            java.lang.String r2 = "hwALE-H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 62
            goto L_0x0713
        L_0x0178:
            java.lang.String r2 = "itel_S41"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 71
            goto L_0x0713
        L_0x0184:
            java.lang.String r2 = "LS-5017"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 78
            goto L_0x0713
        L_0x0190:
            java.lang.String r2 = "panell_d"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 96
            goto L_0x0713
        L_0x019c:
            java.lang.String r2 = "j2xlteins"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 72
            goto L_0x0713
        L_0x01a8:
            java.lang.String r2 = "A7000plus"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 10
            goto L_0x0713
        L_0x01b4:
            java.lang.String r2 = "manning"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 81
            goto L_0x0713
        L_0x01c0:
            java.lang.String r2 = "GIONEE_WBL7519"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 59
            goto L_0x0713
        L_0x01cc:
            java.lang.String r2 = "GIONEE_WBL7365"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 58
            goto L_0x0713
        L_0x01d8:
            java.lang.String r2 = "GIONEE_WBL5708"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 57
            goto L_0x0713
        L_0x01e4:
            java.lang.String r2 = "QM16XE_U"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 114(0x72, float:1.6E-43)
            goto L_0x0713
        L_0x01f0:
            java.lang.String r2 = "Pixi5-10_4G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 106(0x6a, float:1.49E-43)
            goto L_0x0713
        L_0x01fc:
            java.lang.String r2 = "TB3-850M"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 125(0x7d, float:1.75E-43)
            goto L_0x0713
        L_0x0208:
            java.lang.String r2 = "TB3-850F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 124(0x7c, float:1.74E-43)
            goto L_0x0713
        L_0x0214:
            java.lang.String r2 = "TB3-730X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 123(0x7b, float:1.72E-43)
            goto L_0x0713
        L_0x0220:
            java.lang.String r2 = "TB3-730F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 122(0x7a, float:1.71E-43)
            goto L_0x0713
        L_0x022c:
            java.lang.String r2 = "A7020a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 12
            goto L_0x0713
        L_0x0238:
            java.lang.String r2 = "A7010a48"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 11
            goto L_0x0713
        L_0x0244:
            java.lang.String r2 = "griffin"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 60
            goto L_0x0713
        L_0x0250:
            java.lang.String r2 = "marino_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 82
            goto L_0x0713
        L_0x025c:
            java.lang.String r2 = "CPY83_I00"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 25
            goto L_0x0713
        L_0x0268:
            java.lang.String r2 = "A2016a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 8
            goto L_0x0713
        L_0x0274:
            java.lang.String r2 = "le_x6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 77
            goto L_0x0713
        L_0x0280:
            java.lang.String r2 = "l5460"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 76
            goto L_0x0713
        L_0x028c:
            java.lang.String r2 = "i9031"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 67
            goto L_0x0713
        L_0x0298:
            java.lang.String r2 = "X3_HK"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 135(0x87, float:1.89E-43)
            goto L_0x0713
        L_0x02a4:
            java.lang.String r2 = "V23GB"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 128(0x80, float:1.794E-43)
            goto L_0x0713
        L_0x02b0:
            java.lang.String r2 = "Q4310"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 112(0x70, float:1.57E-43)
            goto L_0x0713
        L_0x02bc:
            java.lang.String r2 = "Q4260"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 110(0x6e, float:1.54E-43)
            goto L_0x0713
        L_0x02c8:
            java.lang.String r2 = "PRO7S"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 108(0x6c, float:1.51E-43)
            goto L_0x0713
        L_0x02d4:
            java.lang.String r2 = "F3311"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 48
            goto L_0x0713
        L_0x02e0:
            java.lang.String r2 = "F3215"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 47
            goto L_0x0713
        L_0x02ec:
            java.lang.String r2 = "F3213"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 46
            goto L_0x0713
        L_0x02f8:
            java.lang.String r2 = "F3211"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 45
            goto L_0x0713
        L_0x0304:
            java.lang.String r2 = "F3116"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 44
            goto L_0x0713
        L_0x0310:
            java.lang.String r2 = "F3113"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 43
            goto L_0x0713
        L_0x031c:
            java.lang.String r2 = "F3111"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 42
            goto L_0x0713
        L_0x0328:
            java.lang.String r2 = "E5643"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 30
            goto L_0x0713
        L_0x0334:
            java.lang.String r2 = "A1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 7
            goto L_0x0713
        L_0x033f:
            java.lang.String r2 = "Aura_Note_2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 15
            goto L_0x0713
        L_0x034b:
            java.lang.String r3 = "602LV"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0712
            goto L_0x0713
        L_0x0355:
            java.lang.String r2 = "601LV"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 3
            goto L_0x0713
        L_0x0360:
            java.lang.String r2 = "MEIZU_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 83
            goto L_0x0713
        L_0x036c:
            java.lang.String r2 = "p212"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 92
            goto L_0x0713
        L_0x0378:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 85
            goto L_0x0713
        L_0x0384:
            java.lang.String r2 = "kate"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 75
            goto L_0x0713
        L_0x0390:
            java.lang.String r2 = "fugu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 50
            goto L_0x0713
        L_0x039c:
            java.lang.String r2 = "XE2X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 136(0x88, float:1.9E-43)
            goto L_0x0713
        L_0x03a8:
            java.lang.String r2 = "Q427"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 111(0x6f, float:1.56E-43)
            goto L_0x0713
        L_0x03b4:
            java.lang.String r2 = "Q350"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 109(0x6d, float:1.53E-43)
            goto L_0x0713
        L_0x03c0:
            java.lang.String r2 = "P681"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 93
            goto L_0x0713
        L_0x03cc:
            java.lang.String r2 = "F04J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 41
            goto L_0x0713
        L_0x03d8:
            java.lang.String r2 = "F04H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 40
            goto L_0x0713
        L_0x03e4:
            java.lang.String r2 = "F03H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 39
            goto L_0x0713
        L_0x03f0:
            java.lang.String r2 = "F02H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 38
            goto L_0x0713
        L_0x03fc:
            java.lang.String r2 = "F01J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 37
            goto L_0x0713
        L_0x0408:
            java.lang.String r2 = "F01H"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 36
            goto L_0x0713
        L_0x0414:
            java.lang.String r2 = "1714"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 2
            goto L_0x0713
        L_0x041f:
            java.lang.String r2 = "1713"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 1
            goto L_0x0713
        L_0x042a:
            java.lang.String r2 = "1601"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 0
            goto L_0x0713
        L_0x0435:
            java.lang.String r2 = "flo"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 49
            goto L_0x0713
        L_0x0441:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 28
            goto L_0x0713
        L_0x044d:
            java.lang.String r2 = "cv3"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 27
            goto L_0x0713
        L_0x0459:
            java.lang.String r2 = "cv1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 26
            goto L_0x0713
        L_0x0465:
            java.lang.String r2 = "Z80"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 139(0x8b, float:1.95E-43)
            goto L_0x0713
        L_0x0471:
            java.lang.String r2 = "QX1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 115(0x73, float:1.61E-43)
            goto L_0x0713
        L_0x047d:
            java.lang.String r2 = "PLE"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 107(0x6b, float:1.5E-43)
            goto L_0x0713
        L_0x0489:
            java.lang.String r2 = "P85"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 94
            goto L_0x0713
        L_0x0495:
            java.lang.String r2 = "MX6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 86
            goto L_0x0713
        L_0x04a1:
            java.lang.String r2 = "M5c"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 80
            goto L_0x0713
        L_0x04ad:
            java.lang.String r2 = "M04"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 79
            goto L_0x0713
        L_0x04b9:
            java.lang.String r2 = "JGZ"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 73
            goto L_0x0713
        L_0x04c5:
            java.lang.String r2 = "mh"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 84
            goto L_0x0713
        L_0x04d1:
            java.lang.String r2 = "b5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 16
            goto L_0x0713
        L_0x04dd:
            java.lang.String r2 = "V5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 129(0x81, float:1.81E-43)
            goto L_0x0713
        L_0x04e9:
            java.lang.String r2 = "V1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 127(0x7f, float:1.78E-43)
            goto L_0x0713
        L_0x04f5:
            java.lang.String r2 = "Q5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 113(0x71, float:1.58E-43)
            goto L_0x0713
        L_0x0501:
            java.lang.String r2 = "C1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 20
            goto L_0x0713
        L_0x050d:
            java.lang.String r2 = "woods_fn"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 134(0x86, float:1.88E-43)
            goto L_0x0713
        L_0x0519:
            java.lang.String r2 = "ELUGA_A3_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 31
            goto L_0x0713
        L_0x0525:
            java.lang.String r2 = "Z12_PRO"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 138(0x8a, float:1.93E-43)
            goto L_0x0713
        L_0x0531:
            java.lang.String r2 = "BLACK-1X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 17
            goto L_0x0713
        L_0x053d:
            java.lang.String r2 = "taido_row"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0713
        L_0x0549:
            java.lang.String r2 = "Pixi4-7_3G"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 105(0x69, float:1.47E-43)
            goto L_0x0713
        L_0x0555:
            java.lang.String r2 = "GIONEE_GBL7360"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 53
            goto L_0x0713
        L_0x0561:
            java.lang.String r2 = "GiONEE_CBL7513"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 51
            goto L_0x0713
        L_0x056d:
            java.lang.String r2 = "OnePlus5T"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 91
            goto L_0x0713
        L_0x0579:
            java.lang.String r2 = "whyred"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 132(0x84, float:1.85E-43)
            goto L_0x0713
        L_0x0585:
            java.lang.String r2 = "watson"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 131(0x83, float:1.84E-43)
            goto L_0x0713
        L_0x0591:
            java.lang.String r2 = "SVP-DTV15"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 119(0x77, float:1.67E-43)
            goto L_0x0713
        L_0x059d:
            java.lang.String r2 = "A7000-a"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 9
            goto L_0x0713
        L_0x05a9:
            java.lang.String r2 = "nicklaus_f"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 88
            goto L_0x0713
        L_0x05b5:
            java.lang.String r2 = "tcl_eu"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 126(0x7e, float:1.77E-43)
            goto L_0x0713
        L_0x05c1:
            java.lang.String r2 = "ELUGA_Ray_X"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 34
            goto L_0x0713
        L_0x05cd:
            java.lang.String r2 = "s905x018"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 120(0x78, float:1.68E-43)
            goto L_0x0713
        L_0x05d9:
            java.lang.String r2 = "A10-70L"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 6
            goto L_0x0713
        L_0x05e4:
            java.lang.String r2 = "A10-70F"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 5
            goto L_0x0713
        L_0x05ef:
            java.lang.String r2 = "namath"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 87
            goto L_0x0713
        L_0x05fb:
            java.lang.String r2 = "Slate_Pro"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 118(0x76, float:1.65E-43)
            goto L_0x0713
        L_0x0607:
            java.lang.String r2 = "iris60"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 70
            goto L_0x0713
        L_0x0613:
            java.lang.String r2 = "BRAVIA_ATV2"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 18
            goto L_0x0713
        L_0x061f:
            java.lang.String r2 = "GiONEE_GBL7319"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 52
            goto L_0x0713
        L_0x062b:
            java.lang.String r2 = "panell_dt"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 99
            goto L_0x0713
        L_0x0637:
            java.lang.String r2 = "panell_ds"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 98
            goto L_0x0713
        L_0x0643:
            java.lang.String r2 = "panell_dl"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 97
            goto L_0x0713
        L_0x064f:
            java.lang.String r2 = "vernee_M5"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 130(0x82, float:1.82E-43)
            goto L_0x0713
        L_0x065b:
            java.lang.String r2 = "pacificrim"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 95
            goto L_0x0713
        L_0x0667:
            java.lang.String r2 = "Phantom6"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 104(0x68, float:1.46E-43)
            goto L_0x0713
        L_0x0673:
            java.lang.String r2 = "ComioS1"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 21
            goto L_0x0713
        L_0x067f:
            java.lang.String r2 = "XT1663"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 137(0x89, float:1.92E-43)
            goto L_0x0713
        L_0x068b:
            java.lang.String r2 = "RAIJIN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 116(0x74, float:1.63E-43)
            goto L_0x0713
        L_0x0697:
            java.lang.String r2 = "AquaPowerM"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 13
            goto L_0x0713
        L_0x06a3:
            java.lang.String r2 = "PGN611"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 103(0x67, float:1.44E-43)
            goto L_0x0713
        L_0x06af:
            java.lang.String r2 = "PGN610"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 102(0x66, float:1.43E-43)
            goto L_0x0713
        L_0x06ba:
            java.lang.String r2 = "PGN528"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 101(0x65, float:1.42E-43)
            goto L_0x0713
        L_0x06c5:
            java.lang.String r2 = "NX573J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 90
            goto L_0x0713
        L_0x06d0:
            java.lang.String r2 = "NX541J"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 89
            goto L_0x0713
        L_0x06db:
            java.lang.String r2 = "CP8676_I02"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 22
            goto L_0x0713
        L_0x06e6:
            java.lang.String r2 = "K50a40"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 74
            goto L_0x0713
        L_0x06f1:
            java.lang.String r2 = "GIONEE_SWW1631"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 56
            goto L_0x0713
        L_0x06fc:
            java.lang.String r2 = "GIONEE_SWW1627"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 55
            goto L_0x0713
        L_0x0707:
            java.lang.String r2 = "GIONEE_SWW1609"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0712
            r2 = 54
            goto L_0x0713
        L_0x0712:
            r2 = -1
        L_0x0713:
            switch(r2) {
                case 0: goto L_0x0073;
                case 1: goto L_0x0073;
                case 2: goto L_0x0073;
                case 3: goto L_0x0073;
                case 4: goto L_0x0073;
                case 5: goto L_0x0073;
                case 6: goto L_0x0073;
                case 7: goto L_0x0073;
                case 8: goto L_0x0073;
                case 9: goto L_0x0073;
                case 10: goto L_0x0073;
                case 11: goto L_0x0073;
                case 12: goto L_0x0073;
                case 13: goto L_0x0073;
                case 14: goto L_0x0073;
                case 15: goto L_0x0073;
                case 16: goto L_0x0073;
                case 17: goto L_0x0073;
                case 18: goto L_0x0073;
                case 19: goto L_0x0073;
                case 20: goto L_0x0073;
                case 21: goto L_0x0073;
                case 22: goto L_0x0073;
                case 23: goto L_0x0073;
                case 24: goto L_0x0073;
                case 25: goto L_0x0073;
                case 26: goto L_0x0073;
                case 27: goto L_0x0073;
                case 28: goto L_0x0073;
                case 29: goto L_0x0073;
                case 30: goto L_0x0073;
                case 31: goto L_0x0073;
                case 32: goto L_0x0073;
                case 33: goto L_0x0073;
                case 34: goto L_0x0073;
                case 35: goto L_0x0073;
                case 36: goto L_0x0073;
                case 37: goto L_0x0073;
                case 38: goto L_0x0073;
                case 39: goto L_0x0073;
                case 40: goto L_0x0073;
                case 41: goto L_0x0073;
                case 42: goto L_0x0073;
                case 43: goto L_0x0073;
                case 44: goto L_0x0073;
                case 45: goto L_0x0073;
                case 46: goto L_0x0073;
                case 47: goto L_0x0073;
                case 48: goto L_0x0073;
                case 49: goto L_0x0073;
                case 50: goto L_0x0073;
                case 51: goto L_0x0073;
                case 52: goto L_0x0073;
                case 53: goto L_0x0073;
                case 54: goto L_0x0073;
                case 55: goto L_0x0073;
                case 56: goto L_0x0073;
                case 57: goto L_0x0073;
                case 58: goto L_0x0073;
                case 59: goto L_0x0073;
                case 60: goto L_0x0073;
                case 61: goto L_0x0073;
                case 62: goto L_0x0073;
                case 63: goto L_0x0073;
                case 64: goto L_0x0073;
                case 65: goto L_0x0073;
                case 66: goto L_0x0073;
                case 67: goto L_0x0073;
                case 68: goto L_0x0073;
                case 69: goto L_0x0073;
                case 70: goto L_0x0073;
                case 71: goto L_0x0073;
                case 72: goto L_0x0073;
                case 73: goto L_0x0073;
                case 74: goto L_0x0073;
                case 75: goto L_0x0073;
                case 76: goto L_0x0073;
                case 77: goto L_0x0073;
                case 78: goto L_0x0073;
                case 79: goto L_0x0073;
                case 80: goto L_0x0073;
                case 81: goto L_0x0073;
                case 82: goto L_0x0073;
                case 83: goto L_0x0073;
                case 84: goto L_0x0073;
                case 85: goto L_0x0073;
                case 86: goto L_0x0073;
                case 87: goto L_0x0073;
                case 88: goto L_0x0073;
                case 89: goto L_0x0073;
                case 90: goto L_0x0073;
                case 91: goto L_0x0073;
                case 92: goto L_0x0073;
                case 93: goto L_0x0073;
                case 94: goto L_0x0073;
                case 95: goto L_0x0073;
                case 96: goto L_0x0073;
                case 97: goto L_0x0073;
                case 98: goto L_0x0073;
                case 99: goto L_0x0073;
                case 100: goto L_0x0073;
                case 101: goto L_0x0073;
                case 102: goto L_0x0073;
                case 103: goto L_0x0073;
                case 104: goto L_0x0073;
                case 105: goto L_0x0073;
                case 106: goto L_0x0073;
                case 107: goto L_0x0073;
                case 108: goto L_0x0073;
                case 109: goto L_0x0073;
                case 110: goto L_0x0073;
                case 111: goto L_0x0073;
                case 112: goto L_0x0073;
                case 113: goto L_0x0073;
                case 114: goto L_0x0073;
                case 115: goto L_0x0073;
                case 116: goto L_0x0073;
                case 117: goto L_0x0073;
                case 118: goto L_0x0073;
                case 119: goto L_0x0073;
                case 120: goto L_0x0073;
                case 121: goto L_0x0073;
                case 122: goto L_0x0073;
                case 123: goto L_0x0073;
                case 124: goto L_0x0073;
                case 125: goto L_0x0073;
                case 126: goto L_0x0073;
                case 127: goto L_0x0073;
                case 128: goto L_0x0073;
                case 129: goto L_0x0073;
                case 130: goto L_0x0073;
                case 131: goto L_0x0073;
                case 132: goto L_0x0073;
                case 133: goto L_0x0073;
                case 134: goto L_0x0073;
                case 135: goto L_0x0073;
                case 136: goto L_0x0073;
                case 137: goto L_0x0073;
                case 138: goto L_0x0073;
                case 139: goto L_0x0073;
                default: goto L_0x0716;
            }
        L_0x0716:
            java.lang.String r1 = com.google.android.gms.internal.ads.wy2.f25582d     // Catch:{ all -> 0x0757 }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x0757 }
            r3 = -594534941(0xffffffffdc901de3, float:-3.2452206E17)
            if (r2 == r3) goto L_0x0740
            r3 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r3) goto L_0x0736
            r3 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r3) goto L_0x072c
            goto L_0x0749
        L_0x072c:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0749
            r7 = 1
            goto L_0x0749
        L_0x0736:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0749
            r7 = 0
            goto L_0x0749
        L_0x0740:
            java.lang.String r2 = "JSN-L21"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0749
            r7 = 2
        L_0x0749:
            if (r7 == 0) goto L_0x0073
            if (r7 == r9) goto L_0x0073
            if (r7 == r8) goto L_0x0073
        L_0x074f:
            f14852l1 = r0     // Catch:{ all -> 0x0757 }
            f14851k1 = r9     // Catch:{ all -> 0x0757 }
        L_0x0753:
            monitor-exit(r13)     // Catch:{ all -> 0x0757 }
            boolean r13 = f14852l1
            return r13
        L_0x0757:
            r0 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0757 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c74.m21705S0(java.lang.String):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final void mo16485A() {
        this.f14881g1 = null;
        this.f14864P0 = false;
        int i = wy2.f25579a;
        this.f14862N0 = false;
        this.f14854F0.mo19092c();
        try {
            super.mo16485A();
        } finally {
            this.f14855G0.mo21748c(this.f20844x0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final void mo16513D(boolean z, boolean z2) throws ji3 {
        super.mo16513D(z, z2);
        mo16576z();
        this.f14855G0.mo21750e(this.f20844x0);
        this.f14854F0.mo19093d();
        this.f14865Q0 = z2;
        this.f14866R0 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo16487G(long j, boolean z) throws ji3 {
        super.mo16487G(j, z);
        this.f14864P0 = false;
        int i = wy2.f25579a;
        this.f14854F0.mo19097h();
        this.f14873Y0 = -9223372036854775807L;
        this.f14867S0 = -9223372036854775807L;
        this.f14871W0 = 0;
        this.f14868T0 = -9223372036854775807L;
    }

    /* access modifiers changed from: protected */
    @TargetApi(17)
    /* renamed from: H */
    public final void mo16514H() {
        try {
            super.mo16514H();
            if (this.f14861M0 != null) {
                m21702K0();
            }
        } catch (Throwable th) {
            if (this.f14861M0 != null) {
                m21702K0();
            }
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final void mo16515I() {
        this.f14870V0 = 0;
        this.f14869U0 = SystemClock.elapsedRealtime();
        this.f14874Z0 = SystemClock.elapsedRealtime() * 1000;
        this.f14875a1 = 0;
        this.f14876b1 = 0;
        this.f14854F0.mo19098i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo16516J() {
        this.f14868T0 = -9223372036854775807L;
        if (this.f14870V0 > 0) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            this.f14855G0.mo21749d(this.f14870V0, elapsedRealtime - this.f14869U0);
            this.f14870V0 = 0;
            this.f14869U0 = elapsedRealtime;
        }
        int i = this.f14876b1;
        if (i != 0) {
            this.f14855G0.mo21763r(this.f14875a1, i);
            this.f14875a1 = 0;
            this.f14876b1 = 0;
        }
        this.f14854F0.mo19099j();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public final float mo16517L(float f, C5689w wVar, C5689w[] wVarArr) {
        float f2 = -1.0f;
        for (C5689w wVar2 : wVarArr) {
            float f3 = wVar2.f25140s;
            if (f3 != -1.0f) {
                f2 = Math.max(f2, f3);
            }
        }
        if (f2 == -1.0f) {
            return -1.0f;
        }
        return f2 * f;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public final int mo16518M(q04 q04, C5689w wVar) throws x04 {
        int i = 0;
        if (!C5463pw.m29204h(wVar.f25133l)) {
            return 0;
        }
        boolean z = wVar.f25136o != null;
        List<m04> H0 = m21699H0(q04, wVar, z, false);
        if (z && H0.isEmpty()) {
            H0 = m21699H0(q04, wVar, false, false);
        }
        if (H0.isEmpty()) {
            return 1;
        }
        if (!o04.m28210z0(wVar)) {
            return 2;
        }
        m04 m04 = H0.get(0);
        boolean d = m04.mo19318d(wVar);
        int i2 = true != m04.mo19319e(wVar) ? 8 : 16;
        if (d) {
            List<m04> H02 = m21699H0(q04, wVar, z, true);
            if (!H02.isEmpty()) {
                m04 m042 = H02.get(0);
                if (m042.mo19318d(wVar) && m042.mo19319e(wVar)) {
                    i = 32;
                }
            }
        }
        return (true != d ? 3 : 4) | i2 | i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public final eb3 mo16519N(m04 m04, C5689w wVar, C5689w wVar2) {
        int i;
        int i2;
        eb3 b = m04.mo19317b(wVar, wVar2);
        int i3 = b.f15917e;
        int i4 = wVar2.f25138q;
        b74 b74 = this.f14857I0;
        if (i4 > b74.f14360a || wVar2.f25139r > b74.f14361b) {
            i3 |= 256;
        }
        if (m21697F0(m04, wVar2) > this.f14857I0.f14362c) {
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
    /* renamed from: N0 */
    public final void mo16520N0(k04 k04, int i, long j) {
        m21700I0();
        uw2.m32078a("releaseOutputBuffer");
        k04.mo17800f(i, true);
        uw2.m32079b();
        this.f14874Z0 = SystemClock.elapsedRealtime() * 1000;
        this.f20844x0.f15559e++;
        this.f14871W0 = 0;
        mo16524Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public final eb3 mo16521O(qt3 qt3) throws ji3 {
        eb3 O = super.mo16521O(qt3);
        this.f14855G0.mo21751f(qt3.f22027a, O);
        return O;
    }

    /* access modifiers changed from: protected */
    /* renamed from: O0 */
    public final void mo16522O0(k04 k04, int i, long j, long j2) {
        m21700I0();
        uw2.m32078a("releaseOutputBuffer");
        k04.mo17803i(i, j2);
        uw2.m32079b();
        this.f14874Z0 = SystemClock.elapsedRealtime() * 1000;
        this.f20844x0.f15559e++;
        this.f14871W0 = 0;
        mo16524Q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P0 */
    public final void mo16523P0(k04 k04, int i, long j) {
        uw2.m32078a("skipVideoBuffer");
        k04.mo17800f(i, false);
        uw2.m32079b();
        this.f20844x0.f15560f++;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Q */
    public final void mo16524Q() {
        this.f14866R0 = true;
        if (!this.f14864P0) {
            this.f14864P0 = true;
            this.f14855G0.mo21762q(this.f14860L0);
            this.f14862N0 = true;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q0 */
    public final void mo16525Q0(int i) {
        da3 da3 = this.f20844x0;
        da3.f15561g += i;
        this.f14870V0 += i;
        int i2 = this.f14871W0 + i;
        this.f14871W0 = i2;
        da3.f15562h = Math.max(i2, da3.f15562h);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0131, code lost:
        r20 = r9;
        r21 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0138  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01bd  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0217  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x022a  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x023a  */
    @android.annotation.TargetApi(17)
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.i04 mo16526R(com.google.android.gms.internal.ads.m04 r23, com.google.android.gms.internal.ads.C5689w r24, android.media.MediaCrypto r25, float r26) {
        /*
            r22 = this;
            r0 = r22
            r1 = r23
            r2 = r24
            r3 = r26
            com.google.android.gms.internal.ads.zzuq r4 = r0.f14861M0
            if (r4 == 0) goto L_0x0015
            boolean r4 = r4.f27421g
            boolean r5 = r1.f19697f
            if (r4 == r5) goto L_0x0015
            r22.m21702K0()
        L_0x0015:
            java.lang.String r4 = r1.f19694c
            com.google.android.gms.internal.ads.w[] r5 = r22.mo16569r()
            int r6 = r2.f25138q
            int r7 = r2.f25139r
            int r8 = m21697F0(r23, r24)
            int r9 = r5.length
            r10 = -1
            r13 = 1
            if (r9 != r13) goto L_0x0043
            if (r8 == r10) goto L_0x003a
            int r5 = m21698G0(r23, r24)
            if (r5 == r10) goto L_0x003a
            float r8 = (float) r8
            r9 = 1069547520(0x3fc00000, float:1.5)
            float r8 = r8 * r9
            int r8 = (int) r8
            int r8 = java.lang.Math.min(r8, r5)
        L_0x003a:
            com.google.android.gms.internal.ads.b74 r5 = new com.google.android.gms.internal.ads.b74
            r5.<init>(r6, r7, r8)
            r16 = r4
            goto L_0x0182
        L_0x0043:
            r14 = 0
            r15 = 0
        L_0x0045:
            if (r14 >= r9) goto L_0x0089
            r11 = r5[r14]
            com.google.android.gms.internal.ads.dy3 r13 = r2.f25145x
            if (r13 == 0) goto L_0x005e
            com.google.android.gms.internal.ads.dy3 r13 = r11.f25145x
            if (r13 != 0) goto L_0x005e
            com.google.android.gms.internal.ads.jb4 r11 = r11.mo21657b()
            com.google.android.gms.internal.ads.dy3 r13 = r2.f25145x
            r11.mo18586g0(r13)
            com.google.android.gms.internal.ads.w r11 = r11.mo18605y()
        L_0x005e:
            com.google.android.gms.internal.ads.eb3 r13 = r1.mo19317b(r2, r11)
            int r13 = r13.f15916d
            if (r13 == 0) goto L_0x0085
            int r13 = r11.f25138q
            if (r13 == r10) goto L_0x0071
            int r12 = r11.f25139r
            if (r12 != r10) goto L_0x006f
            goto L_0x0071
        L_0x006f:
            r12 = 0
            goto L_0x0072
        L_0x0071:
            r12 = 1
        L_0x0072:
            r15 = r15 | r12
            int r6 = java.lang.Math.max(r6, r13)
            int r12 = r11.f25139r
            int r7 = java.lang.Math.max(r7, r12)
            int r11 = m21697F0(r1, r11)
            int r8 = java.lang.Math.max(r8, r11)
        L_0x0085:
            int r14 = r14 + 1
            r13 = 1
            goto L_0x0045
        L_0x0089:
            if (r15 == 0) goto L_0x017b
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r9 = 66
            r5.<init>(r9)
            java.lang.String r9 = "Resolutions unknown. Codec max resolution: "
            r5.append(r9)
            r5.append(r6)
            java.lang.String r9 = "x"
            r5.append(r9)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            java.lang.String r10 = "MediaCodecVideoRenderer"
            android.util.Log.w(r10, r5)
            int r5 = r2.f25139r
            int r11 = r2.f25138q
            if (r5 <= r11) goto L_0x00b3
            r12 = r5
            goto L_0x00b4
        L_0x00b3:
            r12 = r11
        L_0x00b4:
            if (r5 > r11) goto L_0x00b8
            r13 = r5
            goto L_0x00b9
        L_0x00b8:
            r13 = r11
        L_0x00b9:
            float r14 = (float) r13
            float r15 = (float) r12
            float r14 = r14 / r15
            int[] r15 = f14850j1
            r16 = r4
            r3 = 0
        L_0x00c1:
            r4 = 9
            if (r3 >= r4) goto L_0x0131
            r4 = r15[r3]
            r17 = r15
            float r15 = (float) r4
            float r15 = r15 * r14
            int r15 = (int) r15
            if (r4 <= r12) goto L_0x0131
            if (r15 > r13) goto L_0x00d3
            goto L_0x0131
        L_0x00d3:
            r18 = r12
            int r12 = com.google.android.gms.internal.ads.wy2.f25579a
            r19 = r13
            r13 = 21
            if (r12 < r13) goto L_0x00fb
            if (r5 > r11) goto L_0x00e1
            r12 = r4
            goto L_0x00e2
        L_0x00e1:
            r12 = r15
        L_0x00e2:
            if (r5 > r11) goto L_0x00e5
            r4 = r15
        L_0x00e5:
            android.graphics.Point r4 = r1.mo19316a(r12, r4)
            float r12 = r2.f25140s
            int r13 = r4.x
            int r15 = r4.y
            r20 = r9
            r21 = r10
            double r9 = (double) r12
            boolean r9 = r1.mo19320f(r13, r15, r9)
            if (r9 == 0) goto L_0x0124
            goto L_0x0136
        L_0x00fb:
            r20 = r9
            r21 = r10
            r9 = 16
            int r4 = com.google.android.gms.internal.ads.wy2.m33416K(r4, r9)     // Catch:{ x04 -> 0x0135 }
            int r4 = r4 * 16
            int r10 = com.google.android.gms.internal.ads.wy2.m33416K(r15, r9)     // Catch:{ x04 -> 0x0135 }
            int r10 = r10 * 16
            int r9 = r4 * r10
            int r12 = com.google.android.gms.internal.ads.d14.m22294a()     // Catch:{ x04 -> 0x0135 }
            if (r9 > r12) goto L_0x0124
            android.graphics.Point r3 = new android.graphics.Point     // Catch:{ x04 -> 0x0135 }
            if (r5 > r11) goto L_0x011b
            r9 = r4
            goto L_0x011c
        L_0x011b:
            r9 = r10
        L_0x011c:
            if (r5 > r11) goto L_0x011f
            r4 = r10
        L_0x011f:
            r3.<init>(r9, r4)     // Catch:{ x04 -> 0x0135 }
            r4 = r3
            goto L_0x0136
        L_0x0124:
            int r3 = r3 + 1
            r15 = r17
            r12 = r18
            r13 = r19
            r9 = r20
            r10 = r21
            goto L_0x00c1
        L_0x0131:
            r20 = r9
            r21 = r10
        L_0x0135:
            r4 = 0
        L_0x0136:
            if (r4 == 0) goto L_0x017d
            int r3 = r4.x
            int r6 = java.lang.Math.max(r6, r3)
            int r3 = r4.y
            int r7 = java.lang.Math.max(r7, r3)
            com.google.android.gms.internal.ads.jb4 r3 = r24.mo21657b()
            r3.mo18604x(r6)
            r3.mo18583f(r7)
            com.google.android.gms.internal.ads.w r3 = r3.mo18605y()
            int r3 = m21698G0(r1, r3)
            int r8 = java.lang.Math.max(r8, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r4 = 57
            r3.<init>(r4)
            java.lang.String r4 = "Codec max resolution adjusted to: "
            r3.append(r4)
            r3.append(r6)
            r4 = r20
            r3.append(r4)
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            r4 = r21
            android.util.Log.w(r4, r3)
            goto L_0x017d
        L_0x017b:
            r16 = r4
        L_0x017d:
            com.google.android.gms.internal.ads.b74 r5 = new com.google.android.gms.internal.ads.b74
            r5.<init>(r6, r7, r8)
        L_0x0182:
            r0.f14857I0 = r5
            boolean r3 = r0.f14856H0
            android.media.MediaFormat r4 = new android.media.MediaFormat
            r4.<init>()
            java.lang.String r6 = "mime"
            r7 = r16
            r4.setString(r6, r7)
            int r6 = r2.f25138q
            java.lang.String r7 = "width"
            r4.setInteger(r7, r6)
            int r6 = r2.f25139r
            java.lang.String r7 = "height"
            r4.setInteger(r7, r6)
            java.util.List<byte[]> r6 = r2.f25135n
            com.google.android.gms.internal.ads.ac2.m20670b(r4, r6)
            float r6 = r2.f25140s
            r7 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r8 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r8 == 0) goto L_0x01b2
            java.lang.String r8 = "frame-rate"
            r4.setFloat(r8, r6)
        L_0x01b2:
            int r6 = r2.f25141t
            java.lang.String r8 = "rotation-degrees"
            com.google.android.gms.internal.ads.ac2.m20669a(r4, r8, r6)
            com.google.android.gms.internal.ads.dy3 r6 = r2.f25145x
            if (r6 == 0) goto L_0x01df
            int r8 = r6.f15785c
            java.lang.String r9 = "color-transfer"
            com.google.android.gms.internal.ads.ac2.m20669a(r4, r9, r8)
            int r8 = r6.f15783a
            java.lang.String r9 = "color-standard"
            com.google.android.gms.internal.ads.ac2.m20669a(r4, r9, r8)
            int r8 = r6.f15784b
            java.lang.String r9 = "color-range"
            com.google.android.gms.internal.ads.ac2.m20669a(r4, r9, r8)
            byte[] r6 = r6.f15786d
            if (r6 == 0) goto L_0x01df
            java.nio.ByteBuffer r6 = java.nio.ByteBuffer.wrap(r6)
            java.lang.String r8 = "hdr-static-info"
            r4.setByteBuffer(r8, r6)
        L_0x01df:
            java.lang.String r6 = r2.f25133l
            java.lang.String r8 = "video/dolby-vision"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L_0x01fc
            android.util.Pair r6 = com.google.android.gms.internal.ads.d14.m22295b(r24)
            if (r6 == 0) goto L_0x01fc
            java.lang.Object r6 = r6.first
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            java.lang.String r8 = "profile"
            com.google.android.gms.internal.ads.ac2.m20669a(r4, r8, r6)
        L_0x01fc:
            int r6 = r5.f14360a
            java.lang.String r8 = "max-width"
            r4.setInteger(r8, r6)
            int r6 = r5.f14361b
            java.lang.String r8 = "max-height"
            r4.setInteger(r8, r6)
            int r5 = r5.f14362c
            java.lang.String r6 = "max-input-size"
            com.google.android.gms.internal.ads.ac2.m20669a(r4, r6, r5)
            int r5 = com.google.android.gms.internal.ads.wy2.f25579a
            r6 = 23
            if (r5 < r6) goto L_0x0228
            java.lang.String r5 = "priority"
            r6 = 0
            r4.setInteger(r5, r6)
            r5 = r26
            int r6 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = "operating-rate"
            r4.setFloat(r6, r5)
        L_0x0228:
            if (r3 == 0) goto L_0x0236
            java.lang.String r3 = "no-post-process"
            r5 = 1
            r4.setInteger(r3, r5)
            java.lang.String r3 = "auto-frc"
            r5 = 0
            r4.setInteger(r3, r5)
        L_0x0236:
            android.view.Surface r3 = r0.f14860L0
            if (r3 != 0) goto L_0x0259
            boolean r3 = r22.m21704M0(r23)
            if (r3 == 0) goto L_0x0253
            com.google.android.gms.internal.ads.zzuq r3 = r0.f14861M0
            if (r3 != 0) goto L_0x024e
            android.content.Context r3 = r0.f14853E0
            boolean r5 = r1.f19697f
            com.google.android.gms.internal.ads.zzuq r3 = com.google.android.gms.internal.ads.zzuq.m34975a(r3, r5)
            r0.f14861M0 = r3
        L_0x024e:
            com.google.android.gms.internal.ads.zzuq r3 = r0.f14861M0
            r0.f14860L0 = r3
            goto L_0x0259
        L_0x0253:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
        L_0x0259:
            android.view.Surface r3 = r0.f14860L0
            r5 = 0
            com.google.android.gms.internal.ads.i04 r1 = com.google.android.gms.internal.ads.i04.m25003b(r1, r4, r2, r3, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c74.mo16526R(com.google.android.gms.internal.ads.m04, com.google.android.gms.internal.ads.w, android.media.MediaCrypto, float):com.google.android.gms.internal.ads.i04");
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public final void mo16527R0(long j) {
        da3 da3 = this.f20844x0;
        da3.f15564j += j;
        da3.f15565k++;
        this.f14875a1 += j;
        this.f14876b1++;
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final List<m04> mo16528S(q04 q04, C5689w wVar, boolean z) throws x04 {
        return m21699H0(q04, wVar, false, false);
    }

    /* renamed from: U */
    public final boolean mo16489U() {
        zzuq zzuq;
        if (super.mo16489U() && (this.f14864P0 || (((zzuq = this.f14861M0) != null && this.f14860L0 == zzuq) || mo19877n0() == null))) {
            this.f14868T0 = -9223372036854775807L;
            return true;
        } else if (this.f14868T0 == -9223372036854775807L) {
            return false;
        } else {
            if (SystemClock.elapsedRealtime() < this.f14868T0) {
                return true;
            }
            this.f14868T0 = -9223372036854775807L;
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W */
    public final void mo16529W(Exception exc) {
        y92.m34067a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f14855G0.mo21764s(exc);
    }

    /* access modifiers changed from: protected */
    /* renamed from: X */
    public final void mo16530X(String str, long j, long j2) {
        this.f14855G0.mo21746a(str, j, j2);
        this.f14858J0 = m21705S0(str);
        m04 p0 = mo19878p0();
        Objects.requireNonNull(p0);
        boolean z = false;
        if (wy2.f25579a >= 29 && "video/x-vnd.on2.vp9".equals(p0.f19693b)) {
            MediaCodecInfo.CodecProfileLevel[] g = p0.mo19321g();
            int length = g.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (g[i].profile == 16384) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
        }
        this.f14859K0 = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: Y */
    public final void mo16531Y(String str) {
        this.f14855G0.mo21747b(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo16532Z(C5689w wVar, MediaFormat mediaFormat) {
        int i;
        int i2;
        k04 n0 = mo19877n0();
        if (n0 != null) {
            n0.mo17799e(this.f14863O0);
        }
        Objects.requireNonNull(mediaFormat);
        boolean z = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z = true;
        }
        if (z) {
            i = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
        } else {
            i = mediaFormat.getInteger("width");
        }
        this.f14877c1 = i;
        if (z) {
            i2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
        } else {
            i2 = mediaFormat.getInteger("height");
        }
        this.f14878d1 = i2;
        float f = wVar.f25142u;
        this.f14880f1 = f;
        if (wy2.f25579a >= 21) {
            int i3 = wVar.f25141t;
            if (i3 == 90 || i3 == 270) {
                int i4 = this.f14877c1;
                this.f14877c1 = i2;
                this.f14878d1 = i4;
                this.f14880f1 = 1.0f / f;
            }
        } else {
            this.f14879e1 = wVar.f25141t;
        }
        this.f14854F0.mo19094e(wVar.f25140s);
    }

    /* renamed from: e */
    public final void mo16533e(float f, float f2) throws ji3 {
        super.mo16533e(f, f2);
        this.f14854F0.mo19096g(f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g0 */
    public final void mo16534g0() {
        this.f14864P0 = false;
        int i = wy2.f25579a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h0 */
    public final void mo16535h0(k31 k31) throws ji3 {
        this.f14872X0++;
        int i = wy2.f25579a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j0 */
    public final boolean mo16536j0(long j, long j2, k04 k04, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C5689w wVar) throws ji3 {
        boolean z3;
        int v;
        long j4 = j;
        k04 k042 = k04;
        int i4 = i;
        long j5 = j3;
        Objects.requireNonNull(k04);
        if (this.f14867S0 == -9223372036854775807L) {
            this.f14867S0 = j4;
        }
        if (j5 != this.f14873Y0) {
            this.f14854F0.mo19095f(j5);
            this.f14873Y0 = j5;
        }
        long m0 = mo19876m0();
        long j6 = j5 - m0;
        if (!z || z2) {
            float l0 = mo19875l0();
            int p = mo16567p();
            long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
            long j7 = (long) (((double) (j5 - j4)) / ((double) l0));
            if (p == 2) {
                j7 -= elapsedRealtime - j2;
            }
            if (this.f14860L0 != this.f14861M0) {
                long j8 = elapsedRealtime - this.f14874Z0;
                boolean z4 = this.f14866R0 ? !this.f14864P0 : !(p != 2 && !this.f14865Q0);
                if (this.f14868T0 == -9223372036854775807L && j4 >= m0 && (z4 || (p == 2 && m21703L0(j7) && j8 > 100000))) {
                    long nanoTime = System.nanoTime();
                    if (wy2.f25579a >= 21) {
                        mo16522O0(k04, i, j6, nanoTime);
                    } else {
                        mo16520N0(k042, i4, j6);
                    }
                    mo16527R0(j7);
                    return true;
                } else if (p != 2 || j4 == this.f14867S0) {
                    return false;
                } else {
                    long nanoTime2 = System.nanoTime();
                    long a = this.f14854F0.mo19091a((j7 * 1000) + nanoTime2);
                    long j9 = (a - nanoTime2) / 1000;
                    long j10 = this.f14868T0;
                    if (j9 < -500000 && !z2 && (v = mo16572v(j)) != 0) {
                        da3 da3 = this.f20844x0;
                        da3.f15563i++;
                        int i5 = this.f14872X0 + v;
                        if (j10 != -9223372036854775807L) {
                            da3.f15560f += i5;
                        } else {
                            mo16525Q0(i5);
                        }
                        mo19882w0();
                        return false;
                    } else if (m21703L0(j9) && !z2) {
                        if (j10 != -9223372036854775807L) {
                            mo16523P0(k042, i4, j6);
                            z3 = true;
                        } else {
                            uw2.m32078a("dropVideoBuffer");
                            k042.mo17800f(i4, false);
                            uw2.m32079b();
                            z3 = true;
                            mo16525Q0(1);
                        }
                        mo16527R0(j9);
                        return z3;
                    } else if (wy2.f25579a >= 21) {
                        if (j9 >= 50000) {
                            return false;
                        }
                        mo16522O0(k04, i, j6, a);
                        mo16527R0(j9);
                        return true;
                    } else if (j9 >= 30000) {
                        return false;
                    } else {
                        if (j9 > 11000) {
                            try {
                                Thread.sleep((-10000 + j9) / 1000);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                                return false;
                            }
                        }
                        mo16520N0(k042, i4, j6);
                        mo16527R0(j9);
                        return true;
                    }
                }
            } else if (!m21703L0(j7)) {
                return false;
            } else {
                mo16523P0(k042, i4, j6);
                mo16527R0(j7);
                return true;
            }
        } else {
            mo16523P0(k042, i4, j6);
            return true;
        }
    }

    /* JADX WARNING: Failed to insert additional move for type inference */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo16537n(int r6, java.lang.Object r7) throws com.google.android.gms.internal.ads.ji3 {
        /*
            r5 = this;
            r0 = 1
            if (r6 == r0) goto L_0x0044
            r0 = 7
            if (r6 == r0) goto L_0x003f
            r0 = 10
            if (r6 == r0) goto L_0x0032
            r0 = 4
            if (r6 == r0) goto L_0x001e
            r0 = 5
            if (r6 == r0) goto L_0x0012
            goto L_0x00cc
        L_0x0012:
            com.google.android.gms.internal.ads.l74 r6 = r5.f14854F0
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            r6.mo19101l(r7)
            return
        L_0x001e:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            r5.f14863O0 = r6
            com.google.android.gms.internal.ads.k04 r6 = r5.mo19877n0()
            if (r6 == 0) goto L_0x00cc
            int r7 = r5.f14863O0
            r6.mo17799e(r7)
            return
        L_0x0032:
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r6 = r7.intValue()
            int r7 = r5.f14882h1
            if (r7 == r6) goto L_0x00cc
            r5.f14882h1 = r6
            return
        L_0x003f:
            com.google.android.gms.internal.ads.d74 r7 = (com.google.android.gms.internal.ads.d74) r7
            r5.f14883i1 = r7
            return
        L_0x0044:
            boolean r6 = r7 instanceof android.view.Surface
            r0 = 0
            if (r6 == 0) goto L_0x004c
            android.view.Surface r7 = (android.view.Surface) r7
            goto L_0x004d
        L_0x004c:
            r7 = r0
        L_0x004d:
            if (r7 != 0) goto L_0x006b
            com.google.android.gms.internal.ads.zzuq r6 = r5.f14861M0
            if (r6 == 0) goto L_0x0055
            r7 = r6
            goto L_0x006b
        L_0x0055:
            com.google.android.gms.internal.ads.m04 r6 = r5.mo19878p0()
            if (r6 == 0) goto L_0x006b
            boolean r1 = r5.m21704M0(r6)
            if (r1 == 0) goto L_0x006b
            android.content.Context r7 = r5.f14853E0
            boolean r6 = r6.f19697f
            com.google.android.gms.internal.ads.zzuq r7 = com.google.android.gms.internal.ads.zzuq.m34975a(r7, r6)
            r5.f14861M0 = r7
        L_0x006b:
            android.view.Surface r6 = r5.f14860L0
            if (r6 == r7) goto L_0x00b8
            r5.f14860L0 = r7
            com.google.android.gms.internal.ads.l74 r6 = r5.f14854F0
            r6.mo19100k(r7)
            r6 = 0
            r5.f14862N0 = r6
            int r1 = r5.mo16567p()
            com.google.android.gms.internal.ads.k04 r2 = r5.mo19877n0()
            if (r2 == 0) goto L_0x0099
            int r3 = com.google.android.gms.internal.ads.wy2.f25579a
            r4 = 23
            if (r3 < r4) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            boolean r3 = r5.f14858J0
            if (r3 != 0) goto L_0x0093
            r2.mo17797c(r7)
            goto L_0x0099
        L_0x0093:
            r5.mo19880t0()
            r5.mo19879r0()
        L_0x0099:
            if (r7 == 0) goto L_0x00b1
            com.google.android.gms.internal.ads.zzuq r2 = r5.f14861M0
            if (r7 == r2) goto L_0x00b1
            r5.m21701J0()
            r5.f14864P0 = r6
            int r6 = com.google.android.gms.internal.ads.wy2.f25579a
            r6 = 2
            if (r1 != r6) goto L_0x00cc
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5.f14868T0 = r6
            return
        L_0x00b1:
            r5.f14881g1 = r0
            r5.f14864P0 = r6
            int r6 = com.google.android.gms.internal.ads.wy2.f25579a
            return
        L_0x00b8:
            if (r7 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.zzuq r6 = r5.f14861M0
            if (r7 == r6) goto L_0x00cc
            r5.m21701J0()
            boolean r6 = r5.f14862N0
            if (r6 == 0) goto L_0x00cc
            com.google.android.gms.internal.ads.w74 r6 = r5.f14855G0
            android.view.Surface r7 = r5.f14860L0
            r6.mo21762q(r7)
        L_0x00cc:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.c74.mo16537n(int, java.lang.Object):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: o0 */
    public final l04 mo16538o0(Throwable th, m04 m04) {
        return new a74(th, m04, this.f14860L0);
    }

    /* access modifiers changed from: protected */
    @TargetApi(29)
    /* renamed from: q0 */
    public final void mo16539q0(k31 k31) throws ji3 {
        if (this.f14859K0) {
            ByteBuffer byteBuffer = k31.f18746f;
            Objects.requireNonNull(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b2 = byteBuffer.get();
                byte b3 = byteBuffer.get();
                byteBuffer.position(0);
                if (b == -75 && s == 60 && s2 == 1 && b2 == 4 && b3 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    k04 n0 = mo19877n0();
                    Bundle bundle = new Bundle();
                    bundle.putByteArray("hdr10-plus-info", bArr);
                    n0.mo17794N(bundle);
                }
            }
        }
    }

    /* renamed from: s */
    public final String mo16493s() {
        return "MediaCodecVideoRenderer";
    }

    /* access modifiers changed from: protected */
    /* renamed from: s0 */
    public final void mo16540s0(long j) {
        super.mo16540s0(j);
        this.f14872X0--;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u0 */
    public final void mo16541u0() {
        super.mo16541u0();
        this.f14872X0 = 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y0 */
    public final boolean mo16542y0(m04 m04) {
        return this.f14860L0 != null || m21704M0(m04);
    }
}
