package p159f.p334h.p337b;

import p159f.p334h.p337b.p338z.C7859h;

/* renamed from: f.h.b.g */
/* compiled from: Challenge */
public final class C7816g {

    /* renamed from: a */
    private final String f33250a;

    /* renamed from: b */
    private final String f33251b;

    public C7816g(String str, String str2) {
        this.f33250a = str;
        this.f33251b = str2;
    }

    /* renamed from: a */
    public String mo29105a() {
        return this.f33251b;
    }

    /* renamed from: b */
    public String mo29106b() {
        return this.f33250a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C7816g) {
            C7816g gVar = (C7816g) obj;
            return C7859h.m43082f(this.f33250a, gVar.f33250a) && C7859h.m43082f(this.f33251b, gVar.f33251b);
        }
    }

    public int hashCode() {
        String str = this.f33251b;
        int i = 0;
        int hashCode = (899 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f33250a;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return this.f33250a + " realm=\"" + this.f33251b + "\"";
    }
}
