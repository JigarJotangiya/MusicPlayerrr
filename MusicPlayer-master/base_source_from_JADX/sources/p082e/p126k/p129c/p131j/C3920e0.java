package p082e.p126k.p129c.p131j;

import java.util.Iterator;
import java.util.Map;

/* renamed from: e.k.c.j.e0 */
/* compiled from: LazyField */
public class C3920e0 extends C3926f0 {

    /* renamed from: e */
    private final C4012s0 f11996e;

    /* renamed from: e.k.c.j.e0$b */
    /* compiled from: LazyField */
    static class C3922b<K> implements Map.Entry<K, Object> {

        /* renamed from: g */
        private Map.Entry<K, C3920e0> f11997g;

        /* renamed from: a */
        public C3920e0 mo13529a() {
            return this.f11997g.getValue();
        }

        public K getKey() {
            return this.f11997g.getKey();
        }

        public Object getValue() {
            C3920e0 value = this.f11997g.getValue();
            if (value == null) {
                return null;
            }
            return value.mo13526f();
        }

        public Object setValue(Object obj) {
            if (obj instanceof C4012s0) {
                return this.f11997g.getValue().mo13559d((C4012s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private C3922b(Map.Entry<K, C3920e0> entry) {
            this.f11997g = entry;
        }
    }

    /* renamed from: e.k.c.j.e0$c */
    /* compiled from: LazyField */
    static class C3923c<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: g */
        private Iterator<Map.Entry<K, Object>> f11998g;

        public C3923c(Iterator<Map.Entry<K, Object>> it) {
            this.f11998g = it;
        }

        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f11998g.next();
            return next.getValue() instanceof C3920e0 ? new C3922b(next) : next;
        }

        public boolean hasNext() {
            return this.f11998g.hasNext();
        }

        public void remove() {
            this.f11998g.remove();
        }
    }

    public boolean equals(Object obj) {
        return mo13526f().equals(obj);
    }

    /* renamed from: f */
    public C4012s0 mo13526f() {
        return mo13558c(this.f11996e);
    }

    public int hashCode() {
        return mo13526f().hashCode();
    }

    public String toString() {
        return mo13526f().toString();
    }
}
