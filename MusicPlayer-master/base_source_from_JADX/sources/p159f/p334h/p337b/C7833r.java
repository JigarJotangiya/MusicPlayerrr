package p159f.p334h.p337b;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.p338z.C7848a;
import p159f.p334h.p337b.p338z.C7849b;
import p159f.p334h.p337b.p338z.C7851d;
import p159f.p334h.p337b.p338z.C7858g;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.p339j.C7862a;
import p159f.p334h.p337b.p338z.p339j.C7878g;
import p159f.p334h.p337b.p338z.p339j.C7892q;
import p159f.p334h.p337b.p338z.p341l.C7940b;

/* renamed from: f.h.b.r */
/* compiled from: OkHttpClient */
public class C7833r implements Cloneable {

    /* renamed from: E */
    private static final List<C7835s> f33292E = C7859h.m43088l(C7835s.HTTP_2, C7835s.SPDY_3, C7835s.HTTP_1_1);

    /* renamed from: F */
    private static final List<C7821k> f33293F = C7859h.m43088l(C7821k.f33271e, C7821k.f33272f, C7821k.f33273g);

    /* renamed from: G */
    private static SSLSocketFactory f33294G;

    /* renamed from: A */
    private boolean f33295A;

    /* renamed from: B */
    private int f33296B;

    /* renamed from: C */
    private int f33297C;

    /* renamed from: D */
    private int f33298D;

    /* renamed from: g */
    private final C7858g f33299g;

    /* renamed from: h */
    private C7825m f33300h;

    /* renamed from: i */
    private Proxy f33301i;

    /* renamed from: j */
    private List<C7835s> f33302j;

    /* renamed from: k */
    private List<C7821k> f33303k;

    /* renamed from: l */
    private final List<C7830p> f33304l;

    /* renamed from: m */
    private final List<C7830p> f33305m;

    /* renamed from: n */
    private ProxySelector f33306n;

    /* renamed from: o */
    private CookieHandler f33307o;

    /* renamed from: p */
    private C7849b f33308p;

    /* renamed from: q */
    private C7807c f33309q;

    /* renamed from: r */
    private SocketFactory f33310r;

    /* renamed from: s */
    private SSLSocketFactory f33311s;

    /* renamed from: t */
    private HostnameVerifier f33312t;

    /* renamed from: u */
    private C7813f f33313u;

    /* renamed from: v */
    private C7806b f33314v;

    /* renamed from: w */
    private C7819j f33315w;
    /* access modifiers changed from: private */

    /* renamed from: x */
    public C7851d f33316x;

    /* renamed from: y */
    private boolean f33317y;

    /* renamed from: z */
    private boolean f33318z;

    /* renamed from: f.h.b.r$a */
    /* compiled from: OkHttpClient */
    static class C7834a extends C7848a {
        C7834a() {
        }

        /* renamed from: a */
        public void mo29201a(C7827o.C7829b bVar, String str) {
            bVar.mo29164c(str);
        }

        /* renamed from: b */
        public boolean mo29202b(C7818i iVar) {
            return iVar.mo29110a();
        }

        /* renamed from: c */
        public void mo29203c(C7833r rVar, C7818i iVar, C7878g gVar, C7836t tVar) throws IOException {
            iVar.mo29112c(rVar, gVar, tVar);
        }

        /* renamed from: d */
        public C7849b mo29204d(C7833r rVar) {
            return rVar.mo29173A();
        }

        /* renamed from: e */
        public boolean mo29205e(C7818i iVar) {
            return iVar.mo29122m();
        }

        /* renamed from: f */
        public C7851d mo29206f(C7833r rVar) {
            return rVar.f33316x;
        }

        /* renamed from: g */
        public C7892q mo29207g(C7818i iVar, C7878g gVar) throws IOException {
            return iVar.mo29124p(gVar);
        }

        /* renamed from: h */
        public void mo29208h(C7819j jVar, C7818i iVar) {
            jVar.mo29133f(iVar);
        }

        /* renamed from: i */
        public int mo29209i(C7818i iVar) {
            return iVar.mo29125q();
        }

        /* renamed from: j */
        public C7858g mo29210j(C7833r rVar) {
            return rVar.mo29176D();
        }

        /* renamed from: k */
        public void mo29211k(C7818i iVar, C7878g gVar) {
            iVar.mo29127s(gVar);
        }

        /* renamed from: l */
        public void mo29212l(C7818i iVar, C7835s sVar) {
            iVar.mo29128t(sVar);
        }
    }

    static {
        C7848a.f33368b = new C7834a();
    }

    public C7833r() {
        this.f33304l = new ArrayList();
        this.f33305m = new ArrayList();
        this.f33317y = true;
        this.f33318z = true;
        this.f33295A = true;
        this.f33299g = new C7858g();
        this.f33300h = new C7825m();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:4|5|6|7|8|9) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized javax.net.ssl.SSLSocketFactory m42901k() {
        /*
            r2 = this;
            monitor-enter(r2)
            javax.net.ssl.SSLSocketFactory r0 = f33294G     // Catch:{ all -> 0x0020 }
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch:{ GeneralSecurityException -> 0x0016 }
            r1 = 0
            r0.init(r1, r1, r1)     // Catch:{ GeneralSecurityException -> 0x0016 }
            javax.net.ssl.SSLSocketFactory r0 = r0.getSocketFactory()     // Catch:{ GeneralSecurityException -> 0x0016 }
            f33294G = r0     // Catch:{ GeneralSecurityException -> 0x0016 }
            goto L_0x001c
        L_0x0016:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ all -> 0x0020 }
            r0.<init>()     // Catch:{ all -> 0x0020 }
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x001c:
            javax.net.ssl.SSLSocketFactory r0 = f33294G     // Catch:{ all -> 0x0020 }
            monitor-exit(r2)
            return r0
        L_0x0020:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.C7833r.m42901k():javax.net.ssl.SSLSocketFactory");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public final C7849b mo29173A() {
        return this.f33308p;
    }

    /* renamed from: B */
    public List<C7830p> mo29174B() {
        return this.f33305m;
    }

    /* renamed from: C */
    public C7811e mo29175C(C7836t tVar) {
        return new C7811e(this, tVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: D */
    public final C7858g mo29176D() {
        return this.f33299g;
    }

    /* renamed from: E */
    public final void mo29177E(long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || i <= 0) {
                this.f33296B = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: F */
    public final void mo29178F(long j, TimeUnit timeUnit) {
        int i = (j > 0 ? 1 : (j == 0 ? 0 : -1));
        if (i < 0) {
            throw new IllegalArgumentException("timeout < 0");
        } else if (timeUnit != null) {
            long millis = timeUnit.toMillis(j);
            if (millis > 2147483647L) {
                throw new IllegalArgumentException("Timeout too large.");
            } else if (millis != 0 || i <= 0) {
                this.f33297C = (int) millis;
            } else {
                throw new IllegalArgumentException("Timeout too small.");
            }
        } else {
            throw new IllegalArgumentException("unit == null");
        }
    }

    /* renamed from: b */
    public final C7833r clone() {
        try {
            return (C7833r) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C7833r mo29180c() {
        C7833r rVar = new C7833r(this);
        if (rVar.f33306n == null) {
            rVar.f33306n = ProxySelector.getDefault();
        }
        if (rVar.f33307o == null) {
            rVar.f33307o = CookieHandler.getDefault();
        }
        if (rVar.f33310r == null) {
            rVar.f33310r = SocketFactory.getDefault();
        }
        if (rVar.f33311s == null) {
            rVar.f33311s = m42901k();
        }
        if (rVar.f33312t == null) {
            rVar.f33312t = C7940b.f33663a;
        }
        if (rVar.f33313u == null) {
            rVar.f33313u = C7813f.f33247b;
        }
        if (rVar.f33314v == null) {
            rVar.f33314v = C7862a.f33395a;
        }
        if (rVar.f33315w == null) {
            rVar.f33315w = C7819j.m42852d();
        }
        if (rVar.f33302j == null) {
            rVar.f33302j = f33292E;
        }
        if (rVar.f33303k == null) {
            rVar.f33303k = f33293F;
        }
        if (rVar.f33316x == null) {
            rVar.f33316x = C7851d.f33370a;
        }
        return rVar;
    }

    /* renamed from: e */
    public final C7806b mo29182e() {
        return this.f33314v;
    }

    /* renamed from: f */
    public final C7813f mo29183f() {
        return this.f33313u;
    }

    /* renamed from: g */
    public final int mo29184g() {
        return this.f33296B;
    }

    /* renamed from: h */
    public final C7819j mo29185h() {
        return this.f33315w;
    }

    /* renamed from: i */
    public final List<C7821k> mo29186i() {
        return this.f33303k;
    }

    /* renamed from: j */
    public final CookieHandler mo29187j() {
        return this.f33307o;
    }

    /* renamed from: l */
    public final C7825m mo29188l() {
        return this.f33300h;
    }

    /* renamed from: m */
    public final boolean mo29189m() {
        return this.f33318z;
    }

    /* renamed from: n */
    public final boolean mo29190n() {
        return this.f33317y;
    }

    /* renamed from: o */
    public final HostnameVerifier mo29191o() {
        return this.f33312t;
    }

    /* renamed from: q */
    public final List<C7835s> mo29192q() {
        return this.f33302j;
    }

    /* renamed from: r */
    public final Proxy mo29193r() {
        return this.f33301i;
    }

    /* renamed from: s */
    public final ProxySelector mo29194s() {
        return this.f33306n;
    }

    /* renamed from: t */
    public final int mo29195t() {
        return this.f33297C;
    }

    /* renamed from: u */
    public final boolean mo29196u() {
        return this.f33295A;
    }

    /* renamed from: v */
    public final SocketFactory mo29197v() {
        return this.f33310r;
    }

    /* renamed from: w */
    public final SSLSocketFactory mo29198w() {
        return this.f33311s;
    }

    /* renamed from: y */
    public final int mo29199y() {
        return this.f33298D;
    }

    /* renamed from: z */
    public List<C7830p> mo29200z() {
        return this.f33304l;
    }

    private C7833r(C7833r rVar) {
        ArrayList arrayList = new ArrayList();
        this.f33304l = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f33305m = arrayList2;
        this.f33317y = true;
        this.f33318z = true;
        this.f33295A = true;
        this.f33299g = rVar.f33299g;
        this.f33300h = rVar.f33300h;
        this.f33301i = rVar.f33301i;
        this.f33302j = rVar.f33302j;
        this.f33303k = rVar.f33303k;
        arrayList.addAll(rVar.f33304l);
        arrayList2.addAll(rVar.f33305m);
        this.f33306n = rVar.f33306n;
        this.f33307o = rVar.f33307o;
        C7807c cVar = rVar.f33309q;
        this.f33308p = cVar != null ? cVar.f33219a : rVar.f33308p;
        this.f33310r = rVar.f33310r;
        this.f33311s = rVar.f33311s;
        this.f33312t = rVar.f33312t;
        this.f33313u = rVar.f33313u;
        this.f33314v = rVar.f33314v;
        this.f33315w = rVar.f33315w;
        this.f33316x = rVar.f33316x;
        this.f33317y = rVar.f33317y;
        this.f33318z = rVar.f33318z;
        this.f33295A = rVar.f33295A;
        this.f33296B = rVar.f33296B;
        this.f33297C = rVar.f33297C;
        this.f33298D = rVar.f33298D;
    }
}
