package com.google.android.gms.internal.ads;

import com.un4seen.bass.BASS;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class w84 {

    /* renamed from: a */
    private static final int[] f25281a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b */
    private static final int[] f25282b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c */
    private static final int[] f25283c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, BASS.BASS_ATTRIB_MUSIC_VOL_INST, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    /* renamed from: d */
    public static final /* synthetic */ int f25284d = 0;

    /* renamed from: a */
    public static C5689w m33016a(byte[] bArr, String str, String str2, zzs zzs) {
        mn2 mn2;
        int i = 0;
        int i2 = -1;
        if (bArr[0] == Byte.MAX_VALUE) {
            mn2 = new mn2(bArr, bArr.length);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b = copyOf[0];
            if (b == -2 || b == -1) {
                for (int i3 = 0; i3 < copyOf.length - 1; i3 += 2) {
                    byte b2 = copyOf[i3];
                    int i4 = i3 + 1;
                    copyOf[i3] = copyOf[i4];
                    copyOf[i4] = b2;
                }
            }
            int length = copyOf.length;
            mn2 = new mn2(copyOf, length);
            if (copyOf[0] == 31) {
                mn2 mn22 = new mn2(copyOf, length);
                while (mn22.mo19467a() >= 16) {
                    mn22.mo19476j(2);
                    mn2.mo19471e(mn22.mo19469c(14), 14);
                }
            }
            mn2.mo19473g(copyOf, copyOf.length);
        }
        mn2.mo19476j(60);
        int i5 = f25281a[mn2.mo19469c(6)];
        int i6 = f25282b[mn2.mo19469c(4)];
        int c = mn2.mo19469c(5);
        if (c < 29) {
            i2 = (f25283c[c] * 1000) / 2;
        }
        mn2.mo19476j(10);
        if (mn2.mo19469c(2) > 0) {
            i = 1;
        }
        jb4 jb4 = new jb4();
        jb4.mo18587h(str);
        jb4.mo18599s("audio/vnd.dts");
        jb4.mo18580d0(i2);
        jb4.mo18582e0(i5 + i);
        jb4.mo18600t(i6);
        jb4.mo18576b((zzs) null);
        jb4.mo18591k(str2);
        return jb4.mo18605y();
    }
}
