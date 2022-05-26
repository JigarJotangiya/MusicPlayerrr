package androidx.work.impl.p012n;

/* renamed from: androidx.work.impl.n.d */
/* compiled from: Preference */
public class C1321d {

    /* renamed from: a */
    public String f5294a;

    /* renamed from: b */
    public Long f5295b;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C1321d(String str, boolean z) {
        this(str, z ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1321d)) {
            return false;
        }
        C1321d dVar = (C1321d) obj;
        if (!this.f5294a.equals(dVar.f5294a)) {
            return false;
        }
        Long l = this.f5295b;
        Long l2 = dVar.f5295b;
        if (l != null) {
            return l.equals(l2);
        }
        if (l2 == null) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f5294a.hashCode() * 31;
        Long l = this.f5295b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public C1321d(String str, long j) {
        this.f5294a = str;
        this.f5295b = Long.valueOf(j);
    }
}
