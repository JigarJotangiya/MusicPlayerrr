package p159f.p334h.p337b.p338z.p339j;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.C7835s;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7842v;
import p159f.p334h.p337b.C7845w;
import p159f.p334h.p337b.p338z.C7859h;
import p159f.p334h.p337b.p338z.p340k.C7897d;
import p159f.p334h.p337b.p338z.p340k.C7921o;
import p159f.p334h.p337b.p338z.p340k.C7933p;
import p394k.C8638h;
import p394k.C8645n;
import p394k.C8659y;

/* renamed from: f.h.b.z.j.o */
/* compiled from: SpdyTransport */
public final class C7890o implements C7892q {

    /* renamed from: d */
    private static final List<C8638h> f33492d = C7859h.m43088l(C8638h.encodeUtf8("connection"), C8638h.encodeUtf8("host"), C8638h.encodeUtf8("keep-alive"), C8638h.encodeUtf8("proxy-connection"), C8638h.encodeUtf8("transfer-encoding"));

    /* renamed from: e */
    private static final List<C8638h> f33493e = C7859h.m43088l(C8638h.encodeUtf8("connection"), C8638h.encodeUtf8("host"), C8638h.encodeUtf8("keep-alive"), C8638h.encodeUtf8("proxy-connection"), C8638h.encodeUtf8("te"), C8638h.encodeUtf8("transfer-encoding"), C8638h.encodeUtf8("encoding"), C8638h.encodeUtf8("upgrade"));

    /* renamed from: a */
    private final C7878g f33494a;

    /* renamed from: b */
    private final C7921o f33495b;

    /* renamed from: c */
    private C7933p f33496c;

    public C7890o(C7878g gVar, C7921o oVar) {
        this.f33494a = gVar;
        this.f33495b = oVar;
    }

    /* renamed from: i */
    private static boolean m43233i(C7835s sVar, C8638h hVar) {
        if (sVar == C7835s.SPDY_3) {
            return f33492d.contains(hVar);
        }
        if (sVar == C7835s.HTTP_2) {
            return f33493e.contains(hVar);
        }
        throw new AssertionError(sVar);
    }

    /* renamed from: j */
    private static String m43234j(String str, String str2) {
        return str + 0 + str2;
    }

    /* renamed from: k */
    public static C7842v.C7844b m43235k(List<C7897d> list, C7835s sVar) throws IOException {
        C7827o.C7829b bVar = new C7827o.C7829b();
        bVar.mo29167g(C7884j.f33470e, sVar.toString());
        int size = list.size();
        String str = null;
        String str2 = "HTTP/1.1";
        for (int i = 0; i < size; i++) {
            C8638h hVar = list.get(i).f33508a;
            String utf8 = list.get(i).f33509b.utf8();
            int i2 = 0;
            while (i2 < utf8.length()) {
                int indexOf = utf8.indexOf(0, i2);
                if (indexOf == -1) {
                    indexOf = utf8.length();
                }
                String substring = utf8.substring(i2, indexOf);
                if (hVar.equals(C7897d.f33501d)) {
                    str = substring;
                } else if (hVar.equals(C7897d.f33507j)) {
                    str2 = substring;
                } else if (!m43233i(sVar, hVar)) {
                    bVar.mo29163b(hVar.utf8(), substring);
                }
                i2 = indexOf + 1;
            }
        }
        if (str != null) {
            C7891p a = C7891p.m43245a(str2 + " " + str);
            C7842v.C7844b bVar2 = new C7842v.C7844b();
            bVar2.mo29259x(sVar);
            bVar2.mo29252q(a.f33498b);
            bVar2.mo29256u(a.f33499c);
            bVar2.mo29255t(bVar.mo29165e());
            return bVar2;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: l */
    public static List<C7897d> m43236l(C7836t tVar, C7835s sVar, String str) {
        C7827o j = tVar.mo29217j();
        ArrayList arrayList = new ArrayList(j.mo29160f() + 10);
        arrayList.add(new C7897d(C7897d.f33502e, tVar.mo29219l()));
        arrayList.add(new C7897d(C7897d.f33503f, C7887l.m43211c(tVar.mo29222o())));
        String q = C7878g.m43157q(tVar.mo29222o());
        if (C7835s.SPDY_3 == sVar) {
            arrayList.add(new C7897d(C7897d.f33507j, str));
            arrayList.add(new C7897d(C7897d.f33506i, q));
        } else if (C7835s.HTTP_2 == sVar) {
            arrayList.add(new C7897d(C7897d.f33505h, q));
        } else {
            throw new AssertionError();
        }
        arrayList.add(new C7897d(C7897d.f33504g, tVar.mo29222o().getProtocol()));
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int f = j.mo29160f();
        for (int i = 0; i < f; i++) {
            C8638h encodeUtf8 = C8638h.encodeUtf8(j.mo29158d(i).toLowerCase(Locale.US));
            String g = j.mo29161g(i);
            if (!m43233i(sVar, encodeUtf8) && !encodeUtf8.equals(C7897d.f33502e) && !encodeUtf8.equals(C7897d.f33503f) && !encodeUtf8.equals(C7897d.f33504g) && !encodeUtf8.equals(C7897d.f33505h) && !encodeUtf8.equals(C7897d.f33506i) && !encodeUtf8.equals(C7897d.f33507j)) {
                if (linkedHashSet.add(encodeUtf8)) {
                    arrayList.add(new C7897d(encodeUtf8, g));
                } else {
                    int i2 = 0;
                    while (true) {
                        if (i2 >= arrayList.size()) {
                            break;
                        } else if (((C7897d) arrayList.get(i2)).f33508a.equals(encodeUtf8)) {
                            arrayList.set(i2, new C7897d(encodeUtf8, m43234j(((C7897d) arrayList.get(i2)).f33509b.utf8(), g)));
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public C8659y mo29344a(C7836t tVar, long j) throws IOException {
        return this.f33496c.mo29455q();
    }

    /* renamed from: b */
    public void mo29345b() {
    }

    /* renamed from: c */
    public void mo29346c(C7836t tVar) throws IOException {
        if (this.f33496c == null) {
            this.f33494a.mo29332G();
            boolean v = this.f33494a.mo29339v();
            String d = C7887l.m43212d(this.f33494a.mo29335l().mo29115f());
            C7921o oVar = this.f33495b;
            C7933p W0 = oVar.mo29438W0(m43236l(tVar, oVar.mo29435S0(), d), v, true);
            this.f33496c = W0;
            W0.mo29459u().mo30650f((long) this.f33494a.f33437a.mo29195t(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    public void mo29347d() throws IOException {
        this.f33496c.mo29455q().close();
    }

    /* renamed from: e */
    public void mo29348e(C7888m mVar) throws IOException {
        mVar.mo29355d(this.f33496c.mo29455q());
    }

    /* renamed from: f */
    public C7842v.C7844b mo29349f() throws IOException {
        return m43235k(this.f33496c.mo29454p(), this.f33495b.mo29435S0());
    }

    /* renamed from: g */
    public boolean mo29350g() {
        return true;
    }

    /* renamed from: h */
    public C7845w mo29351h(C7842v vVar) throws IOException {
        return new C7886k(vVar.mo29242r(), C8645n.m46985b(this.f33496c.mo29456r()));
    }
}
