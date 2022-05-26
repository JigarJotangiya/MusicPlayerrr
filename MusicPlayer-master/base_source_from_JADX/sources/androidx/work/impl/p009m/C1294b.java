package androidx.work.impl.p009m;

/* renamed from: androidx.work.impl.m.b */
/* compiled from: NetworkState */
public class C1294b {

    /* renamed from: a */
    private boolean f5251a;

    /* renamed from: b */
    private boolean f5252b;

    /* renamed from: c */
    private boolean f5253c;

    /* renamed from: d */
    private boolean f5254d;

    public C1294b(boolean z, boolean z2, boolean z3, boolean z4) {
        this.f5251a = z;
        this.f5252b = z2;
        this.f5253c = z3;
        this.f5254d = z4;
    }

    /* renamed from: a */
    public boolean mo6634a() {
        return this.f5251a;
    }

    /* renamed from: b */
    public boolean mo6635b() {
        return this.f5253c;
    }

    /* renamed from: c */
    public boolean mo6636c() {
        return this.f5254d;
    }

    /* renamed from: d */
    public boolean mo6637d() {
        return this.f5252b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1294b)) {
            return false;
        }
        C1294b bVar = (C1294b) obj;
        if (this.f5251a == bVar.f5251a && this.f5252b == bVar.f5252b && this.f5253c == bVar.f5253c && this.f5254d == bVar.f5254d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int i = this.f5251a ? 1 : 0;
        if (this.f5252b) {
            i += 16;
        }
        if (this.f5253c) {
            i += 256;
        }
        return this.f5254d ? i + 4096 : i;
    }

    public String toString() {
        return String.format("[ Connected=%b Validated=%b Metered=%b NotRoaming=%b ]", new Object[]{Boolean.valueOf(this.f5251a), Boolean.valueOf(this.f5252b), Boolean.valueOf(this.f5253c), Boolean.valueOf(this.f5254d)});
    }
}
