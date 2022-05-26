package androidx.work;

import android.os.Build;

/* renamed from: androidx.work.c */
/* compiled from: Constraints */
public final class C1232c {

    /* renamed from: i */
    public static final C1232c f5024i = new C1233a().mo6492a();

    /* renamed from: a */
    private C1407m f5025a = C1407m.NOT_REQUIRED;

    /* renamed from: b */
    private boolean f5026b;

    /* renamed from: c */
    private boolean f5027c;

    /* renamed from: d */
    private boolean f5028d;

    /* renamed from: e */
    private boolean f5029e;

    /* renamed from: f */
    private long f5030f = -1;

    /* renamed from: g */
    private long f5031g = -1;

    /* renamed from: h */
    private C1234d f5032h = new C1234d();

    /* renamed from: androidx.work.c$a */
    /* compiled from: Constraints */
    public static final class C1233a {

        /* renamed from: a */
        boolean f5033a = false;

        /* renamed from: b */
        boolean f5034b = false;

        /* renamed from: c */
        C1407m f5035c = C1407m.NOT_REQUIRED;

        /* renamed from: d */
        boolean f5036d = false;

        /* renamed from: e */
        boolean f5037e = false;

        /* renamed from: f */
        long f5038f = -1;

        /* renamed from: g */
        long f5039g = -1;

        /* renamed from: h */
        C1234d f5040h = new C1234d();

        /* renamed from: a */
        public C1232c mo6492a() {
            return new C1232c(this);
        }

        /* renamed from: b */
        public C1233a mo6493b(C1407m mVar) {
            this.f5035c = mVar;
            return this;
        }
    }

    public C1232c() {
    }

    /* renamed from: a */
    public C1234d mo6473a() {
        return this.f5032h;
    }

    /* renamed from: b */
    public C1407m mo6474b() {
        return this.f5025a;
    }

    /* renamed from: c */
    public long mo6475c() {
        return this.f5030f;
    }

    /* renamed from: d */
    public long mo6476d() {
        return this.f5031g;
    }

    /* renamed from: e */
    public boolean mo6477e() {
        return this.f5032h.mo6496c() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1232c.class != obj.getClass()) {
            return false;
        }
        C1232c cVar = (C1232c) obj;
        if (this.f5026b == cVar.f5026b && this.f5027c == cVar.f5027c && this.f5028d == cVar.f5028d && this.f5029e == cVar.f5029e && this.f5030f == cVar.f5030f && this.f5031g == cVar.f5031g && this.f5025a == cVar.f5025a) {
            return this.f5032h.equals(cVar.f5032h);
        }
        return false;
    }

    /* renamed from: f */
    public boolean mo6479f() {
        return this.f5028d;
    }

    /* renamed from: g */
    public boolean mo6480g() {
        return this.f5026b;
    }

    /* renamed from: h */
    public boolean mo6481h() {
        return this.f5027c;
    }

    public int hashCode() {
        long j = this.f5030f;
        long j2 = this.f5031g;
        return (((((((((((((this.f5025a.hashCode() * 31) + (this.f5026b ? 1 : 0)) * 31) + (this.f5027c ? 1 : 0)) * 31) + (this.f5028d ? 1 : 0)) * 31) + (this.f5029e ? 1 : 0)) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f5032h.hashCode();
    }

    /* renamed from: i */
    public boolean mo6483i() {
        return this.f5029e;
    }

    /* renamed from: j */
    public void mo6484j(C1234d dVar) {
        this.f5032h = dVar;
    }

    /* renamed from: k */
    public void mo6485k(C1407m mVar) {
        this.f5025a = mVar;
    }

    /* renamed from: l */
    public void mo6486l(boolean z) {
        this.f5028d = z;
    }

    /* renamed from: m */
    public void mo6487m(boolean z) {
        this.f5026b = z;
    }

    /* renamed from: n */
    public void mo6488n(boolean z) {
        this.f5027c = z;
    }

    /* renamed from: o */
    public void mo6489o(boolean z) {
        this.f5029e = z;
    }

    /* renamed from: p */
    public void mo6490p(long j) {
        this.f5030f = j;
    }

    /* renamed from: q */
    public void mo6491q(long j) {
        this.f5031g = j;
    }

    C1232c(C1233a aVar) {
        this.f5026b = aVar.f5033a;
        int i = Build.VERSION.SDK_INT;
        this.f5027c = i >= 23 && aVar.f5034b;
        this.f5025a = aVar.f5035c;
        this.f5028d = aVar.f5036d;
        this.f5029e = aVar.f5037e;
        if (i >= 24) {
            this.f5032h = aVar.f5040h;
            this.f5030f = aVar.f5038f;
            this.f5031g = aVar.f5039g;
        }
    }

    public C1232c(C1232c cVar) {
        this.f5026b = cVar.f5026b;
        this.f5027c = cVar.f5027c;
        this.f5025a = cVar.f5025a;
        this.f5028d = cVar.f5028d;
        this.f5029e = cVar.f5029e;
        this.f5032h = cVar.f5032h;
    }
}
