package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class u94 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final String[] f24237a = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final int[] f24238b = {44100, 48000, 32000};
    /* access modifiers changed from: private */

    /* renamed from: c */
    public static final int[] f24239c = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final int[] f24240d = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final int[] f24241e = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static final int[] f24242f = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final int[] f24243g = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: b */
    public static int m31711b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if (!m31722m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f24238b[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 == 3) {
            return ((((i2 == 3 ? f24239c[i4 - 1] : f24240d[i4 - 1]) * 12) / i7) + i8) * 4;
        }
        if (i2 == 3) {
            i6 = i3 == 2 ? f24241e[i4 - 1] : f24242f[i4 - 1];
        } else {
            i6 = f24243g[i4 - 1];
        }
        int i9 = 144;
        if (i2 == 3) {
            return ((i6 * 144) / i7) + i8;
        }
        if (i3 == 1) {
            i9 = 72;
        }
        return ((i9 * i6) / i7) + i8;
    }

    /* renamed from: c */
    public static int m31712c(int i) {
        int i2;
        int i3;
        if (!m31722m(i) || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0) {
            return -1;
        }
        int i4 = (i >>> 12) & 15;
        int i5 = (i >>> 10) & 3;
        if (i4 == 0 || i4 == 15 || i5 == 3) {
            return -1;
        }
        return m31721l(i2, i3);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static int m31721l(int i, int i2) {
        return i2 != 1 ? i2 != 2 ? 384 : 1152 : i == 3 ? 1152 : 576;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static boolean m31722m(int i) {
        return (i & -2097152) == -2097152;
    }
}
