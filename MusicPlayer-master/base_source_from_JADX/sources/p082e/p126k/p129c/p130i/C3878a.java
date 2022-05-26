package p082e.p126k.p129c.p130i;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import p082e.p126k.p129c.p130i.C3884d;
import p369i.p387z.p388c.C8570l;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;
import p369i.p387z.p389d.C8595m;

/* renamed from: e.k.c.i.a */
/* compiled from: Preferences.kt */
public final class C3878a extends C3884d {

    /* renamed from: a */
    private final Map<C3884d.C3885a<?>, Object> f11967a;

    /* renamed from: b */
    private final AtomicBoolean f11968b;

    /* renamed from: e.k.c.i.a$a */
    /* compiled from: Preferences.kt */
    static final class C3879a extends C8595m implements C8570l<Map.Entry<C3884d.C3885a<?>, Object>, CharSequence> {
        public static final C3879a INSTANCE = new C3879a();

        C3879a() {
            super(1);
        }

        public final CharSequence invoke(Map.Entry<C3884d.C3885a<?>, Object> entry) {
            C8594l.m46771e(entry, "entry");
            return "  " + entry.getKey().mo13392a() + " = " + entry.getValue();
        }
    }

    public C3878a() {
        this((Map) null, false, 3, (C8589g) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3878a(Map map, boolean z, int i, C8589g gVar) {
        this((i & 1) != 0 ? new LinkedHashMap() : map, (i & 2) != 0 ? true : z);
    }

    /* renamed from: a */
    public Map<C3884d.C3885a<?>, Object> mo13376a() {
        Map<C3884d.C3885a<?>, Object> unmodifiableMap = Collections.unmodifiableMap(this.f11967a);
        C8594l.m46770d(unmodifiableMap, "unmodifiableMap(preferencesMap)");
        return unmodifiableMap;
    }

    /* renamed from: b */
    public <T> T mo13377b(C3884d.C3885a<T> aVar) {
        C8594l.m46771e(aVar, "key");
        return this.f11967a.get(aVar);
    }

    /* renamed from: e */
    public final void mo13378e() {
        if (!(!this.f11968b.get())) {
            throw new IllegalStateException("Do mutate preferences once returned to DataStore.".toString());
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof C3878a) {
            return C8594l.m46767a(this.f11967a, ((C3878a) obj).f11967a);
        }
        return false;
    }

    /* renamed from: f */
    public final void mo13380f() {
        this.f11968b.set(true);
    }

    /* renamed from: g */
    public final void mo13381g(C3884d.C3886b<?>... bVarArr) {
        C8594l.m46771e(bVarArr, "pairs");
        mo13378e();
        for (C3884d.C3886b<?> bVar : bVarArr) {
            mo13385j(bVar.mo13396a(), bVar.mo13397b());
        }
    }

    /* renamed from: h */
    public final <T> T mo13382h(C3884d.C3885a<T> aVar) {
        C8594l.m46771e(aVar, "key");
        mo13378e();
        return this.f11967a.remove(aVar);
    }

    public int hashCode() {
        return this.f11967a.hashCode();
    }

    /* renamed from: i */
    public final <T> void mo13384i(C3884d.C3885a<T> aVar, T t) {
        C8594l.m46771e(aVar, "key");
        mo13385j(aVar, t);
    }

    /* renamed from: j */
    public final void mo13385j(C3884d.C3885a<?> aVar, Object obj) {
        C8594l.m46771e(aVar, "key");
        mo13378e();
        if (obj == null) {
            mo13382h(aVar);
        } else if (obj instanceof Set) {
            Map<C3884d.C3885a<?>, Object> map = this.f11967a;
            Set unmodifiableSet = Collections.unmodifiableSet(C8490t.m46679D((Iterable) obj));
            C8594l.m46770d(unmodifiableSet, "unmodifiableSet(value.toSet())");
            map.put(aVar, unmodifiableSet);
        } else {
            this.f11967a.put(aVar, obj);
        }
    }

    public String toString() {
        return C8490t.m46683t(this.f11967a.entrySet(), ",\n", "{\n", "\n}", 0, (CharSequence) null, C3879a.INSTANCE, 24, (Object) null);
    }

    public C3878a(Map<C3884d.C3885a<?>, Object> map, boolean z) {
        C8594l.m46771e(map, "preferencesMap");
        this.f11967a = map;
        this.f11968b = new AtomicBoolean(z);
    }
}
