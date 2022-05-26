package p159f.p334h.p337b;

import java.util.concurrent.TimeUnit;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: f.h.b.d */
/* compiled from: CacheControl */
public final class C7808d {

    /* renamed from: a */
    private final boolean f33220a;

    /* renamed from: b */
    private final boolean f33221b;

    /* renamed from: c */
    private final int f33222c;

    /* renamed from: d */
    private final int f33223d;

    /* renamed from: e */
    private final boolean f33224e;

    /* renamed from: f */
    private final boolean f33225f;

    /* renamed from: g */
    private final boolean f33226g;

    /* renamed from: h */
    private final int f33227h;

    /* renamed from: i */
    private final int f33228i;

    /* renamed from: j */
    private final boolean f33229j;

    /* renamed from: k */
    private final boolean f33230k;

    /* renamed from: l */
    String f33231l;

    /* renamed from: f.h.b.d$b */
    /* compiled from: CacheControl */
    public static final class C7810b {

        /* renamed from: a */
        boolean f33232a;

        /* renamed from: b */
        boolean f33233b;

        /* renamed from: c */
        int f33234c = -1;

        /* renamed from: d */
        int f33235d = -1;

        /* renamed from: e */
        int f33236e = -1;

        /* renamed from: f */
        boolean f33237f;

        /* renamed from: g */
        boolean f33238g;

        /* renamed from: a */
        public C7808d mo29096a() {
            return new C7808d(this);
        }

        /* renamed from: b */
        public C7810b mo29097b(int i, TimeUnit timeUnit) {
            if (i >= 0) {
                long seconds = timeUnit.toSeconds((long) i);
                this.f33235d = seconds > 2147483647L ? Integer.MAX_VALUE : (int) seconds;
                return this;
            }
            throw new IllegalArgumentException("maxStale < 0: " + i);
        }

        /* renamed from: c */
        public C7810b mo29098c() {
            this.f33232a = true;
            return this;
        }

        /* renamed from: d */
        public C7810b mo29099d() {
            this.f33237f = true;
            return this;
        }
    }

    static {
        C7810b bVar = new C7810b();
        bVar.mo29098c();
        bVar.mo29096a();
        C7810b bVar2 = new C7810b();
        bVar2.mo29099d();
        bVar2.mo29097b(Integer.MAX_VALUE, TimeUnit.SECONDS);
        bVar2.mo29096a();
    }

    /* renamed from: a */
    private String m42800a() {
        StringBuilder sb = new StringBuilder();
        if (this.f33220a) {
            sb.append("no-cache, ");
        }
        if (this.f33221b) {
            sb.append("no-store, ");
        }
        if (this.f33222c != -1) {
            sb.append("max-age=");
            sb.append(this.f33222c);
            sb.append(", ");
        }
        if (this.f33223d != -1) {
            sb.append("s-maxage=");
            sb.append(this.f33223d);
            sb.append(", ");
        }
        if (this.f33224e) {
            sb.append("private, ");
        }
        if (this.f33225f) {
            sb.append("public, ");
        }
        if (this.f33226g) {
            sb.append("must-revalidate, ");
        }
        if (this.f33227h != -1) {
            sb.append("max-stale=");
            sb.append(this.f33227h);
            sb.append(", ");
        }
        if (this.f33228i != -1) {
            sb.append("min-fresh=");
            sb.append(this.f33228i);
            sb.append(", ");
        }
        if (this.f33229j) {
            sb.append("only-if-cached, ");
        }
        if (this.f33230k) {
            sb.append("no-transform, ");
        }
        if (sb.length() == 0) {
            return BuildConfig.FLAVOR;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003f  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static p159f.p334h.p337b.C7808d m42801k(p159f.p334h.p337b.C7827o r21) {
        /*
            r0 = r21
            int r1 = r21.mo29160f()
            r6 = 0
            r7 = 1
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = -1
            r12 = -1
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = -1
            r17 = -1
            r18 = 0
            r19 = 0
        L_0x0018:
            if (r6 >= r1) goto L_0x0131
            java.lang.String r2 = r0.mo29158d(r6)
            java.lang.String r4 = r0.mo29161g(r6)
            java.lang.String r3 = "Cache-Control"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L_0x002f
            if (r8 == 0) goto L_0x002d
            goto L_0x0037
        L_0x002d:
            r8 = r4
            goto L_0x0038
        L_0x002f:
            java.lang.String r3 = "Pragma"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x012a
        L_0x0037:
            r7 = 0
        L_0x0038:
            r2 = 0
        L_0x0039:
            int r3 = r4.length()
            if (r2 >= r3) goto L_0x012a
            java.lang.String r3 = "=,;"
            int r3 = p159f.p334h.p337b.p338z.p339j.C7867d.m43107b(r4, r2, r3)
            java.lang.String r2 = r4.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            int r5 = r4.length()
            if (r3 == r5) goto L_0x0097
            char r5 = r4.charAt(r3)
            r0 = 44
            if (r5 == r0) goto L_0x0097
            char r0 = r4.charAt(r3)
            r5 = 59
            if (r0 != r5) goto L_0x0064
            goto L_0x0097
        L_0x0064:
            int r3 = r3 + 1
            int r0 = p159f.p334h.p337b.p338z.p339j.C7867d.m43108c(r4, r3)
            int r3 = r4.length()
            if (r0 >= r3) goto L_0x0087
            char r3 = r4.charAt(r0)
            r5 = 34
            if (r3 != r5) goto L_0x0087
            int r0 = r0 + 1
            java.lang.String r3 = "\""
            int r3 = p159f.p334h.p337b.p338z.p339j.C7867d.m43107b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            r5 = 1
            int r3 = r3 + r5
            goto L_0x009b
        L_0x0087:
            r5 = 1
            java.lang.String r3 = ",;"
            int r3 = p159f.p334h.p337b.p338z.p339j.C7867d.m43107b(r4, r0, r3)
            java.lang.String r0 = r4.substring(r0, r3)
            java.lang.String r0 = r0.trim()
            goto L_0x009b
        L_0x0097:
            r5 = 1
            int r3 = r3 + 1
            r0 = 0
        L_0x009b:
            java.lang.String r5 = "no-cache"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00a7
            r5 = -1
            r9 = 1
            goto L_0x0125
        L_0x00a7:
            java.lang.String r5 = "no-store"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00b3
            r5 = -1
            r10 = 1
            goto L_0x0125
        L_0x00b3:
            java.lang.String r5 = "max-age"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00c1
            r5 = -1
            int r11 = p159f.p334h.p337b.p338z.p339j.C7867d.m43106a(r0, r5)
            goto L_0x0125
        L_0x00c1:
            java.lang.String r5 = "s-maxage"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00cf
            r5 = -1
            int r12 = p159f.p334h.p337b.p338z.p339j.C7867d.m43106a(r0, r5)
            goto L_0x0125
        L_0x00cf:
            java.lang.String r5 = "private"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00da
            r5 = -1
            r13 = 1
            goto L_0x0125
        L_0x00da:
            java.lang.String r5 = "public"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00e5
            r5 = -1
            r14 = 1
            goto L_0x0125
        L_0x00e5:
            java.lang.String r5 = "must-revalidate"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x00f0
            r5 = -1
            r15 = 1
            goto L_0x0125
        L_0x00f0:
            java.lang.String r5 = "max-stale"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x0101
            r2 = 2147483647(0x7fffffff, float:NaN)
            int r16 = p159f.p334h.p337b.p338z.p339j.C7867d.m43106a(r0, r2)
            r5 = -1
            goto L_0x0125
        L_0x0101:
            java.lang.String r5 = "min-fresh"
            boolean r5 = r5.equalsIgnoreCase(r2)
            if (r5 == 0) goto L_0x010f
            r5 = -1
            int r17 = p159f.p334h.p337b.p338z.p339j.C7867d.m43106a(r0, r5)
            goto L_0x0125
        L_0x010f:
            r5 = -1
            java.lang.String r0 = "only-if-cached"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x011b
            r18 = 1
            goto L_0x0125
        L_0x011b:
            java.lang.String r0 = "no-transform"
            boolean r0 = r0.equalsIgnoreCase(r2)
            if (r0 == 0) goto L_0x0125
            r19 = 1
        L_0x0125:
            r0 = r21
            r2 = r3
            goto L_0x0039
        L_0x012a:
            r5 = -1
            int r6 = r6 + 1
            r0 = r21
            goto L_0x0018
        L_0x0131:
            if (r7 != 0) goto L_0x0136
            r20 = 0
            goto L_0x0138
        L_0x0136:
            r20 = r8
        L_0x0138:
            f.h.b.d r0 = new f.h.b.d
            r8 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p337b.C7808d.m42801k(f.h.b.o):f.h.b.d");
    }

    /* renamed from: b */
    public boolean mo29086b() {
        return this.f33224e;
    }

    /* renamed from: c */
    public boolean mo29087c() {
        return this.f33225f;
    }

    /* renamed from: d */
    public int mo29088d() {
        return this.f33222c;
    }

    /* renamed from: e */
    public int mo29089e() {
        return this.f33227h;
    }

    /* renamed from: f */
    public int mo29090f() {
        return this.f33228i;
    }

    /* renamed from: g */
    public boolean mo29091g() {
        return this.f33226g;
    }

    /* renamed from: h */
    public boolean mo29092h() {
        return this.f33220a;
    }

    /* renamed from: i */
    public boolean mo29093i() {
        return this.f33221b;
    }

    /* renamed from: j */
    public boolean mo29094j() {
        return this.f33229j;
    }

    public String toString() {
        String str = this.f33231l;
        if (str != null) {
            return str;
        }
        String a = m42800a();
        this.f33231l = a;
        return a;
    }

    private C7808d(boolean z, boolean z2, int i, int i2, boolean z3, boolean z4, boolean z5, int i3, int i4, boolean z6, boolean z7, String str) {
        this.f33220a = z;
        this.f33221b = z2;
        this.f33222c = i;
        this.f33223d = i2;
        this.f33224e = z3;
        this.f33225f = z4;
        this.f33226g = z5;
        this.f33227h = i3;
        this.f33228i = i4;
        this.f33229j = z6;
        this.f33230k = z7;
        this.f33231l = str;
    }

    private C7808d(C7810b bVar) {
        this.f33220a = bVar.f33232a;
        this.f33221b = bVar.f33233b;
        this.f33222c = bVar.f33234c;
        this.f33223d = -1;
        this.f33224e = false;
        this.f33225f = false;
        this.f33226g = false;
        this.f33227h = bVar.f33235d;
        this.f33228i = bVar.f33236e;
        this.f33229j = bVar.f33237f;
        this.f33230k = bVar.f33238g;
    }
}
