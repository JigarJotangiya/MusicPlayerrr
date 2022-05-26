package p402l.p403a.p404a;

/* renamed from: l.a.a.a */
/* compiled from: Interval */
public class C8938a implements C8939b {

    /* renamed from: g */
    private int f35324g;

    /* renamed from: h */
    private int f35325h;

    /* renamed from: c */
    public int mo31256c() {
        return (this.f35325h - this.f35324g) + 1;
    }

    public int compareTo(Object obj) {
        if (!(obj instanceof C8939b)) {
            return -1;
        }
        C8939b bVar = (C8939b) obj;
        int g = this.f35324g - bVar.mo31259g();
        return g != 0 ? g : this.f35325h - bVar.mo31261i();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C8939b)) {
            return false;
        }
        C8939b bVar = (C8939b) obj;
        if (this.f35324g == bVar.mo31259g() && this.f35325h == bVar.mo31261i()) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public int mo31259g() {
        return this.f35324g;
    }

    public int hashCode() {
        return (this.f35324g % 100) + (this.f35325h % 100);
    }

    /* renamed from: i */
    public int mo31261i() {
        return this.f35325h;
    }

    public String toString() {
        return this.f35324g + ":" + this.f35325h;
    }
}
