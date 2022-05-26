package p402l.p406b.p426c.p429r;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: l.b.c.r.e */
/* compiled from: AbstractValuePair */
public abstract class C9150e<I, V> {

    /* renamed from: a */
    protected final Map<I, V> f35776a;

    /* renamed from: b */
    protected final Map<V, I> f35777b = new LinkedHashMap();

    /* renamed from: c */
    protected final List<V> f35778c = new ArrayList();

    /* renamed from: d */
    protected Iterator<I> f35779d;

    /* renamed from: e */
    protected String f35780e;

    public C9150e() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f35776a = linkedHashMap;
        this.f35779d = linkedHashMap.keySet().iterator();
    }

    /* renamed from: a */
    public Map<I, V> mo31790a() {
        return this.f35776a;
    }

    /* renamed from: b */
    public int mo31791b() {
        return this.f35778c.size();
    }

    /* renamed from: c */
    public Map<V, I> mo31792c() {
        return this.f35777b;
    }
}
