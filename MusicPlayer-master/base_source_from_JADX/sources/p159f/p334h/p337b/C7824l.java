package p159f.p334h.p337b;

import java.io.UnsupportedEncodingException;
import p394k.C8638h;

/* renamed from: f.h.b.l */
/* compiled from: Credentials */
public final class C7824l {
    /* renamed from: a */
    public static String m42876a(String str, String str2) {
        try {
            String base64 = C8638h.m46960of((str + ":" + str2).getBytes("ISO-8859-1")).base64();
            return "Basic " + base64;
        } catch (UnsupportedEncodingException unused) {
            throw new AssertionError();
        }
    }
}
