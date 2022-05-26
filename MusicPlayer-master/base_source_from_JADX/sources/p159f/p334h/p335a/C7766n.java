package p159f.p334h.p335a;

import java.io.IOException;
import p394k.C8636f;

/* renamed from: f.h.a.n */
/* compiled from: JsonUtf8Writer */
final class C7766n extends C7768p {

    /* renamed from: g */
    private static final String[] f33139g = new String[128];

    static {
        for (int i = 0; i <= 31; i++) {
            f33139g[i] = String.format("\\u%04x", new Object[]{Integer.valueOf(i)});
        }
        String[] strArr = f33139g;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    /* renamed from: c */
    static void m42703c(C8636f fVar, String str) throws IOException {
        String str2;
        String[] strArr = f33139g;
        fVar.mo30666B(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
            } else if (charAt == 8232) {
                str2 = "\\u2028";
            } else if (charAt == 8233) {
                str2 = "\\u2029";
            }
            if (i < i2) {
                fVar.mo30700d0(str, i, i2);
            }
            fVar.mo30687U(str2);
            i = i2 + 1;
        }
        if (i < length) {
            fVar.mo30700d0(str, i, length);
        }
        fVar.mo30666B(34);
    }
}
