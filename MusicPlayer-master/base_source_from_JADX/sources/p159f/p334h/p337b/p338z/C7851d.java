package p159f.p334h.p337b.p338z;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: f.h.b.z.d */
/* compiled from: Network */
public interface C7851d {

    /* renamed from: a */
    public static final C7851d f33370a = new C7852a();

    /* renamed from: f.h.b.z.d$a */
    /* compiled from: Network */
    static class C7852a implements C7851d {
        C7852a() {
        }

        /* renamed from: a */
        public InetAddress[] mo29279a(String str) throws UnknownHostException {
            if (str != null) {
                return InetAddress.getAllByName(str);
            }
            throw new UnknownHostException("host == null");
        }
    }

    /* renamed from: a */
    InetAddress[] mo29279a(String str) throws UnknownHostException;
}
