package p402l.p406b.p407a.p409f.p411d;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import p402l.p406b.p407a.p409f.p410c.C8978l;

/* renamed from: l.b.a.f.d.r */
/* compiled from: ModificationResult */
final class C9005r {

    /* renamed from: a */
    private final long f35462a;

    /* renamed from: b */
    private final int f35463b;

    /* renamed from: c */
    private final Set<C8978l> f35464c;

    public C9005r(int i, long j, C8978l... lVarArr) {
        HashSet hashSet = new HashSet();
        this.f35464c = hashSet;
        this.f35463b = i;
        this.f35462a = j;
        hashSet.addAll(Arrays.asList(lVarArr));
    }

    /* renamed from: a */
    public long mo31473a() {
        return this.f35462a;
    }

    /* renamed from: b */
    public int mo31474b() {
        return this.f35463b;
    }

    /* renamed from: c */
    public Set<C8978l> mo31475c() {
        return new HashSet(this.f35464c);
    }

    public C9005r(int i, long j, Set<C8978l> set) {
        HashSet hashSet = new HashSet();
        this.f35464c = hashSet;
        this.f35463b = i;
        this.f35462a = j;
        hashSet.addAll(set);
    }
}
