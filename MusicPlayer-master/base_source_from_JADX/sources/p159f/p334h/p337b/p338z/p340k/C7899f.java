package p159f.p334h.p337b.p338z.p340k;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p394k.C8620a0;
import p394k.C8633e;
import p394k.C8637g;
import p394k.C8638h;
import p394k.C8645n;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.h.b.z.k.f */
/* compiled from: Hpack */
final class C7899f {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public static final C7897d[] f33512a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final Map<C8638h, Integer> f33513b = m43281e();

    /* renamed from: f.h.b.z.k.f$a */
    /* compiled from: Hpack */
    static final class C7900a {

        /* renamed from: a */
        private final List<C7897d> f33514a = new ArrayList();

        /* renamed from: b */
        private final C8637g f33515b;

        /* renamed from: c */
        private int f33516c;

        /* renamed from: d */
        private int f33517d;

        /* renamed from: e */
        C7897d[] f33518e;

        /* renamed from: f */
        int f33519f;

        /* renamed from: g */
        int f33520g;

        /* renamed from: h */
        int f33521h;

        C7900a(int i, C8620a0 a0Var) {
            C7897d[] dVarArr = new C7897d[8];
            this.f33518e = dVarArr;
            this.f33519f = dVarArr.length - 1;
            this.f33520g = 0;
            this.f33521h = 0;
            this.f33516c = i;
            this.f33517d = i;
            this.f33515b = C8645n.m46985b(a0Var);
        }

        /* renamed from: a */
        private void m43282a() {
            int i = this.f33517d;
            int i2 = this.f33521h;
            if (i >= i2) {
                return;
            }
            if (i == 0) {
                m43283b();
            } else {
                m43285d(i2 - i);
            }
        }

        /* renamed from: b */
        private void m43283b() {
            this.f33514a.clear();
            Arrays.fill(this.f33518e, (Object) null);
            this.f33519f = this.f33518e.length - 1;
            this.f33520g = 0;
            this.f33521h = 0;
        }

        /* renamed from: c */
        private int m43284c(int i) {
            return this.f33519f + 1 + i;
        }

        /* renamed from: d */
        private int m43285d(int i) {
            int i2;
            int i3 = 0;
            if (i > 0) {
                int length = this.f33518e.length;
                while (true) {
                    length--;
                    i2 = this.f33519f;
                    if (length < i2 || i <= 0) {
                        C7897d[] dVarArr = this.f33518e;
                        System.arraycopy(dVarArr, i2 + 1, dVarArr, i2 + 1 + i3, this.f33520g);
                        this.f33519f += i3;
                    } else {
                        C7897d[] dVarArr2 = this.f33518e;
                        i -= dVarArr2[length].f33510c;
                        this.f33521h -= dVarArr2[length].f33510c;
                        this.f33520g--;
                        i3++;
                    }
                }
                C7897d[] dVarArr3 = this.f33518e;
                System.arraycopy(dVarArr3, i2 + 1, dVarArr3, i2 + 1 + i3, this.f33520g);
                this.f33519f += i3;
            }
            return i3;
        }

        /* renamed from: f */
        private C8638h m43286f(int i) {
            if (m43288i(i)) {
                return C7899f.f33512a[i].f33508a;
            }
            return this.f33518e[m43284c(i - C7899f.f33512a.length)].f33508a;
        }

        /* renamed from: h */
        private void m43287h(int i, C7897d dVar) {
            this.f33514a.add(dVar);
            int i2 = dVar.f33510c;
            if (i != -1) {
                i2 -= this.f33518e[m43284c(i)].f33510c;
            }
            int i3 = this.f33517d;
            if (i2 > i3) {
                m43283b();
                return;
            }
            int d = m43285d((this.f33521h + i2) - i3);
            if (i == -1) {
                int i4 = this.f33520g + 1;
                C7897d[] dVarArr = this.f33518e;
                if (i4 > dVarArr.length) {
                    C7897d[] dVarArr2 = new C7897d[(dVarArr.length * 2)];
                    System.arraycopy(dVarArr, 0, dVarArr2, dVarArr.length, dVarArr.length);
                    this.f33519f = this.f33518e.length - 1;
                    this.f33518e = dVarArr2;
                }
                int i5 = this.f33519f;
                this.f33519f = i5 - 1;
                this.f33518e[i5] = dVar;
                this.f33520g++;
            } else {
                this.f33518e[i + m43284c(i) + d] = dVar;
            }
            this.f33521h += i2;
        }

        /* renamed from: i */
        private boolean m43288i(int i) {
            return i >= 0 && i <= C7899f.f33512a.length - 1;
        }

        /* renamed from: j */
        private int m43289j() throws IOException {
            return this.f33515b.readByte() & 255;
        }

        /* renamed from: m */
        private void m43290m(int i) throws IOException {
            if (m43288i(i)) {
                this.f33514a.add(C7899f.f33512a[i]);
                return;
            }
            int c = m43284c(i - C7899f.f33512a.length);
            if (c >= 0) {
                C7897d[] dVarArr = this.f33518e;
                if (c <= dVarArr.length - 1) {
                    this.f33514a.add(dVarArr[c]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i + 1));
        }

        /* renamed from: o */
        private void m43291o(int i) throws IOException {
            m43287h(-1, new C7897d(m43286f(i), mo29393k()));
        }

        /* renamed from: p */
        private void m43292p() throws IOException {
            C8638h k = mo29393k();
            C8638h unused = C7899f.m43280d(k);
            m43287h(-1, new C7897d(k, mo29393k()));
        }

        /* renamed from: q */
        private void m43293q(int i) throws IOException {
            this.f33514a.add(new C7897d(m43286f(i), mo29393k()));
        }

        /* renamed from: r */
        private void m43294r() throws IOException {
            C8638h k = mo29393k();
            C8638h unused = C7899f.m43280d(k);
            this.f33514a.add(new C7897d(k, mo29393k()));
        }

        /* renamed from: e */
        public List<C7897d> mo29391e() {
            ArrayList arrayList = new ArrayList(this.f33514a);
            this.f33514a.clear();
            return arrayList;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo29392g(int i) {
            this.f33516c = i;
            this.f33517d = i;
            m43282a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C8638h mo29393k() throws IOException {
            int j = m43289j();
            boolean z = (j & 128) == 128;
            int n = mo29395n(j, 127);
            if (z) {
                return C8638h.m46960of(C7907h.m43351d().mo29406c(this.f33515b.mo30721p0((long) n)));
            }
            return this.f33515b.mo30719o((long) n);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public void mo29394l() throws IOException {
            while (!this.f33515b.mo30664A()) {
                byte readByte = this.f33515b.readByte() & 255;
                if (readByte == 128) {
                    throw new IOException("index == 0");
                } else if ((readByte & 128) == 128) {
                    m43290m(mo29395n(readByte, 127) - 1);
                } else if (readByte == 64) {
                    m43292p();
                } else if ((readByte & 64) == 64) {
                    m43291o(mo29395n(readByte, 63) - 1);
                } else if ((readByte & 32) == 32) {
                    int n = mo29395n(readByte, 31);
                    this.f33517d = n;
                    if (n < 0 || n > this.f33516c) {
                        throw new IOException("Invalid dynamic table size update " + this.f33517d);
                    }
                    m43282a();
                } else if (readByte == 16 || readByte == 0) {
                    m43294r();
                } else {
                    m43293q(mo29395n(readByte, 15) - 1);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public int mo29395n(int i, int i2) throws IOException {
            int i3 = i & i2;
            if (i3 < i2) {
                return i3;
            }
            int i4 = 0;
            while (true) {
                int j = m43289j();
                if ((j & 128) == 0) {
                    return i2 + (j << i4);
                }
                i2 += (j & 127) << i4;
                i4 += 7;
            }
        }
    }

    /* renamed from: f.h.b.z.k.f$b */
    /* compiled from: Hpack */
    static final class C7901b {

        /* renamed from: a */
        private final C8633e f33522a;

        C7901b(C8633e eVar) {
            this.f33522a = eVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo29396a(C8638h hVar) throws IOException {
            mo29398c(hVar.size(), 127, 0);
            this.f33522a.mo30692Y0(hVar);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo29397b(List<C7897d> list) throws IOException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C8638h asciiLowercase = list.get(i).f33508a.toAsciiLowercase();
                Integer num = (Integer) C7899f.f33513b.get(asciiLowercase);
                if (num != null) {
                    mo29398c(num.intValue() + 1, 15, 0);
                    mo29396a(list.get(i).f33509b);
                } else {
                    this.f33522a.mo30696b1(0);
                    mo29396a(asciiLowercase);
                    mo29396a(list.get(i).f33509b);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo29398c(int i, int i2, int i3) throws IOException {
            if (i < i2) {
                this.f33522a.mo30696b1(i | i3);
                return;
            }
            this.f33522a.mo30696b1(i3 | i2);
            int i4 = i - i2;
            while (i4 >= 128) {
                this.f33522a.mo30696b1(128 | (i4 & 127));
                i4 >>>= 7;
            }
            this.f33522a.mo30696b1(i4);
        }
    }

    static {
        C8638h hVar = C7897d.f33502e;
        C8638h hVar2 = C7897d.f33503f;
        C8638h hVar3 = C7897d.f33504g;
        C8638h hVar4 = C7897d.f33501d;
        f33512a = new C7897d[]{new C7897d(C7897d.f33505h, (String) BuildConfig.FLAVOR), new C7897d(hVar, "GET"), new C7897d(hVar, "POST"), new C7897d(hVar2, "/"), new C7897d(hVar2, "/index.html"), new C7897d(hVar3, "http"), new C7897d(hVar3, "https"), new C7897d(hVar4, "200"), new C7897d(hVar4, "204"), new C7897d(hVar4, "206"), new C7897d(hVar4, "304"), new C7897d(hVar4, "400"), new C7897d(hVar4, "404"), new C7897d(hVar4, "500"), new C7897d("accept-charset", (String) BuildConfig.FLAVOR), new C7897d("accept-encoding", "gzip, deflate"), new C7897d("accept-language", (String) BuildConfig.FLAVOR), new C7897d("accept-ranges", (String) BuildConfig.FLAVOR), new C7897d("accept", (String) BuildConfig.FLAVOR), new C7897d("access-control-allow-origin", (String) BuildConfig.FLAVOR), new C7897d("age", (String) BuildConfig.FLAVOR), new C7897d("allow", (String) BuildConfig.FLAVOR), new C7897d("authorization", (String) BuildConfig.FLAVOR), new C7897d("cache-control", (String) BuildConfig.FLAVOR), new C7897d("content-disposition", (String) BuildConfig.FLAVOR), new C7897d("content-encoding", (String) BuildConfig.FLAVOR), new C7897d("content-language", (String) BuildConfig.FLAVOR), new C7897d("content-length", (String) BuildConfig.FLAVOR), new C7897d("content-location", (String) BuildConfig.FLAVOR), new C7897d("content-range", (String) BuildConfig.FLAVOR), new C7897d("content-type", (String) BuildConfig.FLAVOR), new C7897d("cookie", (String) BuildConfig.FLAVOR), new C7897d("date", (String) BuildConfig.FLAVOR), new C7897d("etag", (String) BuildConfig.FLAVOR), new C7897d("expect", (String) BuildConfig.FLAVOR), new C7897d("expires", (String) BuildConfig.FLAVOR), new C7897d("from", (String) BuildConfig.FLAVOR), new C7897d("host", (String) BuildConfig.FLAVOR), new C7897d("if-match", (String) BuildConfig.FLAVOR), new C7897d("if-modified-since", (String) BuildConfig.FLAVOR), new C7897d("if-none-match", (String) BuildConfig.FLAVOR), new C7897d("if-range", (String) BuildConfig.FLAVOR), new C7897d("if-unmodified-since", (String) BuildConfig.FLAVOR), new C7897d("last-modified", (String) BuildConfig.FLAVOR), new C7897d("link", (String) BuildConfig.FLAVOR), new C7897d("location", (String) BuildConfig.FLAVOR), new C7897d("max-forwards", (String) BuildConfig.FLAVOR), new C7897d("proxy-authenticate", (String) BuildConfig.FLAVOR), new C7897d("proxy-authorization", (String) BuildConfig.FLAVOR), new C7897d("range", (String) BuildConfig.FLAVOR), new C7897d("referer", (String) BuildConfig.FLAVOR), new C7897d("refresh", (String) BuildConfig.FLAVOR), new C7897d("retry-after", (String) BuildConfig.FLAVOR), new C7897d("server", (String) BuildConfig.FLAVOR), new C7897d("set-cookie", (String) BuildConfig.FLAVOR), new C7897d("strict-transport-security", (String) BuildConfig.FLAVOR), new C7897d("transfer-encoding", (String) BuildConfig.FLAVOR), new C7897d("user-agent", (String) BuildConfig.FLAVOR), new C7897d("vary", (String) BuildConfig.FLAVOR), new C7897d("via", (String) BuildConfig.FLAVOR), new C7897d("www-authenticate", (String) BuildConfig.FLAVOR)};
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static C8638h m43280d(C8638h hVar) throws IOException {
        int size = hVar.size();
        int i = 0;
        while (i < size) {
            byte b = hVar.getByte(i);
            if (b < 65 || b > 90) {
                i++;
            } else {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + hVar.utf8());
            }
        }
        return hVar;
    }

    /* renamed from: e */
    private static Map<C8638h, Integer> m43281e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f33512a.length);
        int i = 0;
        while (true) {
            C7897d[] dVarArr = f33512a;
            if (i >= dVarArr.length) {
                return Collections.unmodifiableMap(linkedHashMap);
            }
            if (!linkedHashMap.containsKey(dVarArr[i].f33508a)) {
                linkedHashMap.put(dVarArr[i].f33508a, Integer.valueOf(i));
            }
            i++;
        }
    }
}
