package p402l.p406b.p407a.p420l.p421g;

import java.util.logging.Logger;

/* renamed from: l.b.a.l.g.a */
/* compiled from: OggCRCFactory */
public class C9100a {

    /* renamed from: a */
    private static long[] f35685a = new long[256];

    /* renamed from: b */
    private static boolean f35686b = false;

    static {
        Logger.getLogger("org.jaudiotagger.audio.ogg");
    }

    /* renamed from: a */
    public static byte[] m48505a(byte[] bArr) {
        if (!f35686b) {
            m48506b();
        }
        long j = 0;
        for (byte c : bArr) {
            j = ((j << 8) ^ f35685a[(int) ((255 & (j >>> 24)) ^ ((long) m48507c(c)))]) & -1;
        }
        return new byte[]{(byte) ((int) (j & 255)), (byte) ((int) ((j >>> 8) & 255)), (byte) ((int) ((j >>> 16) & 255)), (byte) ((int) ((j >>> 24) & 255))};
    }

    /* renamed from: b */
    public static void m48506b() {
        for (int i = 0; i < 256; i++) {
            long j = (long) (i << 24);
            for (int i2 = 0; i2 < 8; i2++) {
                j = (2147483648L & j) != 0 ? (j << 1) ^ 79764919 : j << 1;
            }
            f35685a[i] = j;
        }
        f35686b = true;
    }

    /* renamed from: c */
    private static int m48507c(int i) {
        return i & 255;
    }
}
