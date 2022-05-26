package androidx.work.impl.p012n;

import androidx.work.C1227a;
import androidx.work.C1232c;
import androidx.work.C1236e;
import androidx.work.C1405l;
import androidx.work.C1416p;
import androidx.work.C1421u;

/* renamed from: androidx.work.impl.n.p */
/* compiled from: WorkSpec */
public final class C1340p {

    /* renamed from: a */
    public String f5313a;

    /* renamed from: b */
    public C1421u f5314b = C1421u.ENQUEUED;

    /* renamed from: c */
    public String f5315c;

    /* renamed from: d */
    public String f5316d;

    /* renamed from: e */
    public C1236e f5317e;

    /* renamed from: f */
    public C1236e f5318f;

    /* renamed from: g */
    public long f5319g;

    /* renamed from: h */
    public long f5320h;

    /* renamed from: i */
    public long f5321i;

    /* renamed from: j */
    public C1232c f5322j;

    /* renamed from: k */
    public int f5323k;

    /* renamed from: l */
    public C1227a f5324l;

    /* renamed from: m */
    public long f5325m;

    /* renamed from: n */
    public long f5326n;

    /* renamed from: o */
    public long f5327o;

    /* renamed from: p */
    public long f5328p;

    /* renamed from: q */
    public boolean f5329q;

    /* renamed from: r */
    public C1416p f5330r;

    /* renamed from: androidx.work.impl.n.p$a */
    /* compiled from: WorkSpec */
    public static class C1341a {

        /* renamed from: a */
        public String f5331a;

        /* renamed from: b */
        public C1421u f5332b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1341a)) {
                return false;
            }
            C1341a aVar = (C1341a) obj;
            if (this.f5332b != aVar.f5332b) {
                return false;
            }
            return this.f5331a.equals(aVar.f5331a);
        }

        public int hashCode() {
            return (this.f5331a.hashCode() * 31) + this.f5332b.hashCode();
        }
    }

    static {
        C1405l.m7462f("WorkSpec");
    }

    public C1340p(String str, String str2) {
        C1236e eVar = C1236e.f5045c;
        this.f5317e = eVar;
        this.f5318f = eVar;
        this.f5322j = C1232c.f5024i;
        this.f5324l = C1227a.EXPONENTIAL;
        this.f5325m = 30000;
        this.f5328p = -1;
        this.f5330r = C1416p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f5313a = str;
        this.f5315c = str2;
    }

    /* renamed from: a */
    public long mo6706a() {
        long j;
        boolean z = false;
        if (mo6708c()) {
            if (this.f5324l == C1227a.LINEAR) {
                z = true;
            }
            if (z) {
                j = this.f5325m * ((long) this.f5323k);
            } else {
                j = (long) Math.scalb((float) this.f5325m, this.f5323k - 1);
            }
            return this.f5326n + Math.min(18000000, j);
        }
        long j2 = 0;
        if (mo6709d()) {
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = this.f5326n;
            long j4 = j3 == 0 ? currentTimeMillis + this.f5319g : j3;
            long j5 = this.f5321i;
            long j6 = this.f5320h;
            if (j5 != j6) {
                z = true;
            }
            if (z) {
                if (j3 == 0) {
                    j2 = j5 * -1;
                }
                return j4 + j6 + j2;
            }
            if (j3 != 0) {
                j2 = j6;
            }
            return j4 + j2;
        }
        long j7 = this.f5326n;
        if (j7 == 0) {
            j7 = System.currentTimeMillis();
        }
        return j7 + this.f5319g;
    }

    /* renamed from: b */
    public boolean mo6707b() {
        return !C1232c.f5024i.equals(this.f5322j);
    }

    /* renamed from: c */
    public boolean mo6708c() {
        return this.f5314b == C1421u.ENQUEUED && this.f5323k > 0;
    }

    /* renamed from: d */
    public boolean mo6709d() {
        return this.f5320h != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1340p.class != obj.getClass()) {
            return false;
        }
        C1340p pVar = (C1340p) obj;
        if (this.f5319g != pVar.f5319g || this.f5320h != pVar.f5320h || this.f5321i != pVar.f5321i || this.f5323k != pVar.f5323k || this.f5325m != pVar.f5325m || this.f5326n != pVar.f5326n || this.f5327o != pVar.f5327o || this.f5328p != pVar.f5328p || this.f5329q != pVar.f5329q || !this.f5313a.equals(pVar.f5313a) || this.f5314b != pVar.f5314b || !this.f5315c.equals(pVar.f5315c)) {
            return false;
        }
        String str = this.f5316d;
        if (str == null ? pVar.f5316d != null : !str.equals(pVar.f5316d)) {
            return false;
        }
        if (this.f5317e.equals(pVar.f5317e) && this.f5318f.equals(pVar.f5318f) && this.f5322j.equals(pVar.f5322j) && this.f5324l == pVar.f5324l && this.f5330r == pVar.f5330r) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((this.f5313a.hashCode() * 31) + this.f5314b.hashCode()) * 31) + this.f5315c.hashCode()) * 31;
        String str = this.f5316d;
        int hashCode2 = str != null ? str.hashCode() : 0;
        long j = this.f5319g;
        long j2 = this.f5320h;
        long j3 = this.f5321i;
        long j4 = this.f5325m;
        long j5 = this.f5326n;
        long j6 = this.f5327o;
        long j7 = this.f5328p;
        return ((((((((((((((((((((((((((((hashCode + hashCode2) * 31) + this.f5317e.hashCode()) * 31) + this.f5318f.hashCode()) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + this.f5322j.hashCode()) * 31) + this.f5323k) * 31) + this.f5324l.hashCode()) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j7 ^ (j7 >>> 32)))) * 31) + (this.f5329q ? 1 : 0)) * 31) + this.f5330r.hashCode();
    }

    public String toString() {
        return "{WorkSpec: " + this.f5313a + "}";
    }

    public C1340p(C1340p pVar) {
        C1236e eVar = C1236e.f5045c;
        this.f5317e = eVar;
        this.f5318f = eVar;
        this.f5322j = C1232c.f5024i;
        this.f5324l = C1227a.EXPONENTIAL;
        this.f5325m = 30000;
        this.f5328p = -1;
        this.f5330r = C1416p.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        this.f5313a = pVar.f5313a;
        this.f5315c = pVar.f5315c;
        this.f5314b = pVar.f5314b;
        this.f5316d = pVar.f5316d;
        this.f5317e = new C1236e(pVar.f5317e);
        this.f5318f = new C1236e(pVar.f5318f);
        this.f5319g = pVar.f5319g;
        this.f5320h = pVar.f5320h;
        this.f5321i = pVar.f5321i;
        this.f5322j = new C1232c(pVar.f5322j);
        this.f5323k = pVar.f5323k;
        this.f5324l = pVar.f5324l;
        this.f5325m = pVar.f5325m;
        this.f5326n = pVar.f5326n;
        this.f5327o = pVar.f5327o;
        this.f5328p = pVar.f5328p;
        this.f5329q = pVar.f5329q;
        this.f5330r = pVar.f5330r;
    }
}
