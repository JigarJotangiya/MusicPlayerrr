package p159f.p334h.p337b;

import java.io.IOException;

/* renamed from: f.h.b.s */
/* compiled from: Protocol */
public enum C7835s {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String protocol;

    private C7835s(String str) {
        this.protocol = str;
    }

    public static C7835s get(String str) throws IOException {
        C7835s sVar = HTTP_1_0;
        if (str.equals(sVar.protocol)) {
            return sVar;
        }
        C7835s sVar2 = HTTP_1_1;
        if (str.equals(sVar2.protocol)) {
            return sVar2;
        }
        C7835s sVar3 = HTTP_2;
        if (str.equals(sVar3.protocol)) {
            return sVar3;
        }
        C7835s sVar4 = SPDY_3;
        if (str.equals(sVar4.protocol)) {
            return sVar4;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    public String toString() {
        return this.protocol;
    }
}
