package p159f.p334h.p337b.p338z.p339j;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import p159f.p334h.p337b.C7808d;
import p159f.p334h.p337b.C7827o;
import p159f.p334h.p337b.C7836t;
import p159f.p334h.p337b.C7842v;

/* renamed from: f.h.b.z.j.c */
/* compiled from: CacheStrategy */
public final class C7864c {

    /* renamed from: a */
    public final C7836t f33396a;

    /* renamed from: b */
    public final C7842v f33397b;

    /* renamed from: f.h.b.z.j.c$b */
    /* compiled from: CacheStrategy */
    public static class C7866b {

        /* renamed from: a */
        final long f33398a;

        /* renamed from: b */
        final C7836t f33399b;

        /* renamed from: c */
        final C7842v f33400c;

        /* renamed from: d */
        private Date f33401d;

        /* renamed from: e */
        private String f33402e;

        /* renamed from: f */
        private Date f33403f;

        /* renamed from: g */
        private String f33404g;

        /* renamed from: h */
        private Date f33405h;

        /* renamed from: i */
        private long f33406i;

        /* renamed from: j */
        private long f33407j;

        /* renamed from: k */
        private String f33408k;

        /* renamed from: l */
        private int f33409l = -1;

        public C7866b(long j, C7836t tVar, C7842v vVar) {
            this.f33398a = j;
            this.f33399b = tVar;
            this.f33400c = vVar;
            if (vVar != null) {
                C7827o r = vVar.mo29242r();
                int f = r.mo29160f();
                for (int i = 0; i < f; i++) {
                    String d = r.mo29158d(i);
                    String g = r.mo29161g(i);
                    if ("Date".equalsIgnoreCase(d)) {
                        this.f33401d = C7876f.m43142b(g);
                        this.f33402e = g;
                    } else if ("Expires".equalsIgnoreCase(d)) {
                        this.f33405h = C7876f.m43142b(g);
                    } else if ("Last-Modified".equalsIgnoreCase(d)) {
                        this.f33403f = C7876f.m43142b(g);
                        this.f33404g = g;
                    } else if ("ETag".equalsIgnoreCase(d)) {
                        this.f33408k = g;
                    } else if ("Age".equalsIgnoreCase(d)) {
                        this.f33409l = C7867d.m43106a(g, -1);
                    } else if (C7884j.f33468c.equalsIgnoreCase(d)) {
                        this.f33406i = Long.parseLong(g);
                    } else if (C7884j.f33469d.equalsIgnoreCase(d)) {
                        this.f33407j = Long.parseLong(g);
                    }
                }
            }
        }

        /* renamed from: a */
        private long m43100a() {
            Date date = this.f33401d;
            long j = 0;
            if (date != null) {
                j = Math.max(0, this.f33407j - date.getTime());
            }
            int i = this.f33409l;
            if (i != -1) {
                j = Math.max(j, TimeUnit.SECONDS.toMillis((long) i));
            }
            long j2 = this.f33407j;
            return j + (j2 - this.f33406i) + (this.f33398a - j2);
        }

        /* renamed from: b */
        private long m43101b() {
            C7808d l = this.f33400c.mo29236l();
            if (l.mo29088d() != -1) {
                return TimeUnit.SECONDS.toMillis((long) l.mo29088d());
            }
            if (this.f33405h != null) {
                Date date = this.f33401d;
                long time = this.f33405h.getTime() - (date != null ? date.getTime() : this.f33407j);
                if (time > 0) {
                    return time;
                }
                return 0;
            } else if (this.f33403f == null || this.f33400c.mo29247v().mo29222o().getQuery() != null) {
                return 0;
            } else {
                Date date2 = this.f33401d;
                long time2 = (date2 != null ? date2.getTime() : this.f33406i) - this.f33403f.getTime();
                if (time2 > 0) {
                    return time2 / 10;
                }
                return 0;
            }
        }

        /* renamed from: d */
        private C7864c m43102d() {
            if (this.f33400c == null) {
                return new C7864c(this.f33399b, (C7842v) null);
            }
            if (this.f33399b.mo29218k() && this.f33400c.mo29239o() == null) {
                return new C7864c(this.f33399b, (C7842v) null);
            }
            if (!C7864c.m43099a(this.f33400c, this.f33399b)) {
                return new C7864c(this.f33399b, (C7842v) null);
            }
            C7808d h = this.f33399b.mo29215h();
            if (h.mo29092h() || m43103e(this.f33399b)) {
                return new C7864c(this.f33399b, (C7842v) null);
            }
            long a = m43100a();
            long b = m43101b();
            if (h.mo29088d() != -1) {
                b = Math.min(b, TimeUnit.SECONDS.toMillis((long) h.mo29088d()));
            }
            long j = 0;
            long millis = h.mo29090f() != -1 ? TimeUnit.SECONDS.toMillis((long) h.mo29090f()) : 0;
            C7808d l = this.f33400c.mo29236l();
            if (!l.mo29091g() && h.mo29089e() != -1) {
                j = TimeUnit.SECONDS.toMillis((long) h.mo29089e());
            }
            if (!l.mo29092h()) {
                long j2 = millis + a;
                if (j2 < j + b) {
                    C7842v.C7844b t = this.f33400c.mo29244t();
                    if (j2 >= b) {
                        t.mo29248k("Warning", "110 HttpURLConnection \"Response is stale\"");
                    }
                    if (a > 86400000 && m43104f()) {
                        t.mo29248k("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                    }
                    return new C7864c((C7836t) null, t.mo29250m());
                }
            }
            C7836t.C7838b m = this.f33399b.mo29220m();
            String str = this.f33408k;
            if (str != null) {
                m.mo29227i("If-None-Match", str);
            } else if (this.f33403f != null) {
                m.mo29227i("If-Modified-Since", this.f33404g);
            } else if (this.f33401d != null) {
                m.mo29227i("If-Modified-Since", this.f33402e);
            }
            C7836t h2 = m.mo29226h();
            return m43103e(h2) ? new C7864c(h2, this.f33400c) : new C7864c(h2, (C7842v) null);
        }

        /* renamed from: e */
        private static boolean m43103e(C7836t tVar) {
            return (tVar.mo29216i("If-Modified-Since") == null && tVar.mo29216i("If-None-Match") == null) ? false : true;
        }

        /* renamed from: f */
        private boolean m43104f() {
            return this.f33400c.mo29236l().mo29088d() == -1 && this.f33405h == null;
        }

        /* renamed from: c */
        public C7864c mo29301c() {
            C7864c d = m43102d();
            return (d.f33396a == null || !this.f33399b.mo29215h().mo29094j()) ? d : new C7864c((C7836t) null, (C7842v) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (r3.mo29236l().mo29086b() == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0059, code lost:
        return false;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m43099a(p159f.p334h.p337b.C7842v r3, p159f.p334h.p337b.C7836t r4) {
        /*
            int r0 = r3.mo29238n()
            r1 = 200(0xc8, float:2.8E-43)
            r2 = 0
            if (r0 == r1) goto L_0x005a
            r1 = 410(0x19a, float:5.75E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 414(0x19e, float:5.8E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 501(0x1f5, float:7.02E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 203(0xcb, float:2.84E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 204(0xcc, float:2.86E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L_0x0031
            r1 = 308(0x134, float:4.32E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 404(0x194, float:5.66E-43)
            if (r0 == r1) goto L_0x005a
            r1 = 405(0x195, float:5.68E-43)
            if (r0 == r1) goto L_0x005a
            switch(r0) {
                case 300: goto L_0x005a;
                case 301: goto L_0x005a;
                case 302: goto L_0x0031;
                default: goto L_0x0030;
            }
        L_0x0030:
            goto L_0x0059
        L_0x0031:
            java.lang.String r0 = "Expires"
            java.lang.String r0 = r3.mo29240p(r0)
            if (r0 != 0) goto L_0x005a
            f.h.b.d r0 = r3.mo29236l()
            int r0 = r0.mo29088d()
            r1 = -1
            if (r0 != r1) goto L_0x005a
            f.h.b.d r0 = r3.mo29236l()
            boolean r0 = r0.mo29087c()
            if (r0 != 0) goto L_0x005a
            f.h.b.d r0 = r3.mo29236l()
            boolean r0 = r0.mo29086b()
            if (r0 == 0) goto L_0x0059
            goto L_0x005a
        L_0x0059:
            return r2
        L_0x005a:
            f.h.b.d r3 = r3.mo29236l()
            boolean r3 = r3.mo29093i()
            if (r3 != 0) goto L_0x006f
            f.h.b.d r3 = r4.mo29215h()
            boolean r3 = r3.mo29093i()
            if (r3 != 0) goto L_0x006f
            r2 = 1
        L_0x006f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.p338z.p339j.C7864c.m43099a(f.h.b.v, f.h.b.t):boolean");
    }

    private C7864c(C7836t tVar, C7842v vVar) {
        this.f33396a = tVar;
        this.f33397b = vVar;
    }
}
