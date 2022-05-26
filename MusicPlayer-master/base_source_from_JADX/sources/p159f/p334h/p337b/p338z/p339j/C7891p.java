package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.net.ProtocolException;
import p159f.p334h.p337b.C7835s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.h.b.z.j.p */
/* compiled from: StatusLine */
public final class C7891p {

    /* renamed from: a */
    public final C7835s f33497a;

    /* renamed from: b */
    public final int f33498b;

    /* renamed from: c */
    public final String f33499c;

    public C7891p(C7835s sVar, int i, String str) {
        this.f33497a = sVar;
        this.f33498b = i;
        this.f33499c = str;
    }

    /* renamed from: a */
    public static C7891p m43245a(String str) throws IOException {
        C7835s sVar;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                sVar = C7835s.HTTP_1_0;
            } else if (charAt == 1) {
                sVar = C7835s.HTTP_1_1;
            } else {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else if (str.startsWith("ICY ")) {
            sVar = C7835s.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                int parseInt = Integer.parseInt(str.substring(i, i2));
                if (str.length() <= i2) {
                    str2 = BuildConfig.FLAVOR;
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                } else {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                return new C7891p(sVar, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
        } else {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33497a == C7835s.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f33498b);
        if (this.f33499c != null) {
            sb.append(' ');
            sb.append(this.f33499c);
        }
        return sb.toString();
    }
}
