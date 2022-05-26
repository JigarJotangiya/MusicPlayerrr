package p159f.p240e.p241a.p242a;

import java.util.List;
import p402l.p403a.p405b.C8941b;

/* renamed from: f.e.a.a.b */
/* compiled from: Pinyin */
public final class C4850b {

    /* renamed from: a */
    static C8941b f13666a;

    /* renamed from: b */
    static C4855g f13667b;

    /* renamed from: c */
    static List<Object> f13668c;

    /* renamed from: a */
    private static short m20494a(byte[] bArr, byte[] bArr2, int i) {
        int i2 = i % 8;
        short s = (short) (bArr2[i] & 255);
        return (bArr[i / 8] & C4854f.f13675a[i2]) != 0 ? (short) (s | 256) : s;
    }

    /* renamed from: b */
    private static int m20495b(char c) {
        int i = c - 19968;
        if (i >= 0 && i < 7000) {
            return m20494a(C4851c.f13669a, C4851c.f13670b, i);
        }
        if (7000 > i || i >= 14000) {
            return m20494a(C4853e.f13673a, C4853e.f13674b, i - 14000);
        }
        return m20494a(C4852d.f13671a, C4852d.f13672b, i - 7000);
    }

    /* renamed from: c */
    public static boolean m20496c(char c) {
        return (19968 <= c && c <= 40869 && m20495b(c) > 0) || 12295 == c;
    }

    /* renamed from: d */
    public static String m20497d(char c) {
        if (!m20496c(c)) {
            return String.valueOf(c);
        }
        if (c == 12295) {
            return "LING";
        }
        return C4854f.f13676b[m20495b(c)];
    }

    /* renamed from: e */
    public static String m20498e(String str, String str2) {
        return C4848a.m20492a(str, f13666a, f13668c, str2, f13667b);
    }
}
