package p082e.p126k.p129c.p131j;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p082e.p126k.p129c.p131j.C4028v;

/* renamed from: e.k.c.j.m1 */
/* compiled from: SmallSortedMap */
class C3982m1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    private final int f12118g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public List<C3982m1<K, V>.e> f12119h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public Map<K, V> f12120i;

    /* renamed from: j */
    private boolean f12121j;

    /* renamed from: k */
    private volatile C3982m1<K, V>.g f12122k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public Map<K, V> f12123l;

    /* renamed from: m */
    private volatile C3982m1<K, V>.C1428c f12124m;

    /* renamed from: e.k.c.j.m1$a */
    /* compiled from: SmallSortedMap */
    static class C3983a extends C3982m1<FieldDescriptorType, Object> {
        C3983a(int i) {
            super(i, (C3983a) null);
        }

        /* renamed from: p */
        public void mo13847p() {
            if (!mo13846o()) {
                for (int i = 0; i < mo13843k(); i++) {
                    Map.Entry j = mo13842j(i);
                    if (((C4028v.C4030b) j.getKey()).mo14039e()) {
                        j.setValue(Collections.unmodifiableList((List) j.getValue()));
                    }
                }
                for (Map.Entry entry : mo13845m()) {
                    if (((C4028v.C4030b) entry.getKey()).mo14039e()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C3982m1.super.mo13847p();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return C3982m1.super.put((C4028v.C4030b) obj, obj2);
        }
    }

    /* renamed from: e.k.c.j.m1$c */
    /* compiled from: SmallSortedMap */
    private class C3985c extends C3982m1<K, V>.g {
        private C3985c() {
            super(C3982m1.this, (C3983a) null);
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3984b(C3982m1.this, (C3983a) null);
        }

        /* synthetic */ C3985c(C3982m1 m1Var, C3983a aVar) {
            this();
        }
    }

    /* renamed from: e.k.c.j.m1$d */
    /* compiled from: SmallSortedMap */
    private static class C3986d {
        /* access modifiers changed from: private */

        /* renamed from: a */
        public static final Iterator<Object> f12129a = new C3987a();

        /* renamed from: b */
        private static final Iterable<Object> f12130b = new C3988b();

        /* renamed from: e.k.c.j.m1$d$a */
        /* compiled from: SmallSortedMap */
        static class C3987a implements Iterator<Object> {
            C3987a() {
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: e.k.c.j.m1$d$b */
        /* compiled from: SmallSortedMap */
        static class C3988b implements Iterable<Object> {
            C3988b() {
            }

            public Iterator<Object> iterator() {
                return C3986d.f12129a;
            }
        }

        /* renamed from: b */
        static <T> Iterable<T> m17427b() {
            return f12130b;
        }
    }

    /* renamed from: e.k.c.j.m1$e */
    /* compiled from: SmallSortedMap */
    private class C3989e implements Map.Entry<K, V>, Comparable<C3982m1<K, V>.e> {

        /* renamed from: g */
        private final K f12131g;

        /* renamed from: h */
        private V f12132h;

        C3989e(C3982m1 m1Var, Map.Entry<K, V> entry) {
            this((Comparable) entry.getKey(), entry.getValue());
        }

        /* renamed from: d */
        private boolean m17428d(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }

        /* renamed from: c */
        public int compareTo(C3982m1<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (!m17428d(this.f12131g, entry.getKey()) || !m17428d(this.f12132h, entry.getValue())) {
                return false;
            }
            return true;
        }

        public V getValue() {
            return this.f12132h;
        }

        /* renamed from: h */
        public K getKey() {
            return this.f12131g;
        }

        public int hashCode() {
            K k = this.f12131g;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f12132h;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C3982m1.this.m17410g();
            V v2 = this.f12132h;
            this.f12132h = v;
            return v2;
        }

        public String toString() {
            return this.f12131g + "=" + this.f12132h;
        }

        C3989e(K k, V v) {
            this.f12131g = k;
            this.f12132h = v;
        }
    }

    /* renamed from: e.k.c.j.m1$g */
    /* compiled from: SmallSortedMap */
    private class C3991g extends AbstractSet<Map.Entry<K, V>> {
        private C3991g() {
        }

        public void clear() {
            C3982m1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3982m1.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        /* renamed from: d */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            C3982m1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C3990f(C3982m1.this, (C3983a) null);
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3982m1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C3982m1.this.size();
        }

        /* synthetic */ C3991g(C3982m1 m1Var, C3983a aVar) {
            this();
        }
    }

    /* synthetic */ C3982m1(int i, C3983a aVar) {
        this(i);
    }

    /* renamed from: f */
    private int m17409f(K k) {
        int size = this.f12119h.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f12119h.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f12119h.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public void m17410g() {
        if (this.f12121j) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: i */
    private void m17411i() {
        m17410g();
        if (this.f12119h.isEmpty() && !(this.f12119h instanceof ArrayList)) {
            this.f12119h = new ArrayList(this.f12118g);
        }
    }

    /* renamed from: n */
    private SortedMap<K, V> m17412n() {
        m17410g();
        if (this.f12120i.isEmpty() && !(this.f12120i instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12120i = treeMap;
            this.f12123l = treeMap.descendingMap();
        }
        return (SortedMap) this.f12120i;
    }

    /* renamed from: q */
    static <FieldDescriptorType extends C4028v.C4030b<FieldDescriptorType>> C3982m1<FieldDescriptorType, Object> m17413q(int i) {
        return new C3983a(i);
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public V m17414s(int i) {
        m17410g();
        V value = this.f12119h.remove(i).getValue();
        if (!this.f12120i.isEmpty()) {
            Iterator it = m17412n().entrySet().iterator();
            this.f12119h.add(new C3989e(this, (Map.Entry) it.next()));
            it.remove();
        }
        return value;
    }

    public void clear() {
        m17410g();
        if (!this.f12119h.isEmpty()) {
            this.f12119h.clear();
        }
        if (!this.f12120i.isEmpty()) {
            this.f12120i.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m17409f(comparable) >= 0 || this.f12120i.containsKey(comparable);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f12122k == null) {
            this.f12122k = new C3991g(this, (C3983a) null);
        }
        return this.f12122k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3982m1)) {
            return super.equals(obj);
        }
        C3982m1 m1Var = (C3982m1) obj;
        int size = size();
        if (size != m1Var.size()) {
            return false;
        }
        int k = mo13843k();
        if (k != m1Var.mo13843k()) {
            return entrySet().equals(m1Var.entrySet());
        }
        for (int i = 0; i < k; i++) {
            if (!mo13842j(i).equals(m1Var.mo13842j(i))) {
                return false;
            }
        }
        if (k != size) {
            return this.f12120i.equals(m1Var.f12120i);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f = m17409f(comparable);
        if (f >= 0) {
            return this.f12119h.get(f).getValue();
        }
        return this.f12120i.get(comparable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public Set<Map.Entry<K, V>> mo13840h() {
        if (this.f12124m == null) {
            this.f12124m = new C3985c(this, (C3983a) null);
        }
        return this.f12124m;
    }

    public int hashCode() {
        int k = mo13843k();
        int i = 0;
        for (int i2 = 0; i2 < k; i2++) {
            i += this.f12119h.get(i2).hashCode();
        }
        return mo13844l() > 0 ? i + this.f12120i.hashCode() : i;
    }

    /* renamed from: j */
    public Map.Entry<K, V> mo13842j(int i) {
        return this.f12119h.get(i);
    }

    /* renamed from: k */
    public int mo13843k() {
        return this.f12119h.size();
    }

    /* renamed from: l */
    public int mo13844l() {
        return this.f12120i.size();
    }

    /* renamed from: m */
    public Iterable<Map.Entry<K, V>> mo13845m() {
        if (this.f12120i.isEmpty()) {
            return C3986d.m17427b();
        }
        return this.f12120i.entrySet();
    }

    /* renamed from: o */
    public boolean mo13846o() {
        return this.f12121j;
    }

    /* renamed from: p */
    public void mo13847p() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f12121j) {
            if (this.f12120i.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f12120i);
            }
            this.f12120i = map;
            if (this.f12123l.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f12123l);
            }
            this.f12123l = map2;
            this.f12121j = true;
        }
    }

    /* renamed from: r */
    public V put(K k, V v) {
        m17410g();
        int f = m17409f(k);
        if (f >= 0) {
            return this.f12119h.get(f).setValue(v);
        }
        m17411i();
        int i = -(f + 1);
        if (i >= this.f12118g) {
            return m17412n().put(k, v);
        }
        int size = this.f12119h.size();
        int i2 = this.f12118g;
        if (size == i2) {
            C3989e remove = this.f12119h.remove(i2 - 1);
            m17412n().put(remove.getKey(), remove.getValue());
        }
        this.f12119h.add(i, new C3989e(k, v));
        return null;
    }

    public V remove(Object obj) {
        m17410g();
        Comparable comparable = (Comparable) obj;
        int f = m17409f(comparable);
        if (f >= 0) {
            return m17414s(f);
        }
        if (this.f12120i.isEmpty()) {
            return null;
        }
        return this.f12120i.remove(comparable);
    }

    public int size() {
        return this.f12119h.size() + this.f12120i.size();
    }

    /* renamed from: e.k.c.j.m1$b */
    /* compiled from: SmallSortedMap */
    private class C3984b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: g */
        private int f12125g;

        /* renamed from: h */
        private Iterator<Map.Entry<K, V>> f12126h;

        private C3984b() {
            this.f12125g = C3982m1.this.f12119h.size();
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m17424a() {
            if (this.f12126h == null) {
                this.f12126h = C3982m1.this.f12123l.entrySet().iterator();
            }
            return this.f12126h;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            if (m17424a().hasNext()) {
                return (Map.Entry) m17424a().next();
            }
            List b = C3982m1.this.f12119h;
            int i = this.f12125g - 1;
            this.f12125g = i;
            return (Map.Entry) b.get(i);
        }

        public boolean hasNext() {
            int i = this.f12125g;
            return (i > 0 && i <= C3982m1.this.f12119h.size()) || m17424a().hasNext();
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ C3984b(C3982m1 m1Var, C3983a aVar) {
            this();
        }
    }

    /* renamed from: e.k.c.j.m1$f */
    /* compiled from: SmallSortedMap */
    private class C3990f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: g */
        private int f12134g;

        /* renamed from: h */
        private boolean f12135h;

        /* renamed from: i */
        private Iterator<Map.Entry<K, V>> f12136i;

        private C3990f() {
            this.f12134g = -1;
        }

        /* renamed from: a */
        private Iterator<Map.Entry<K, V>> m17431a() {
            if (this.f12136i == null) {
                this.f12136i = C3982m1.this.f12120i.entrySet().iterator();
            }
            return this.f12136i;
        }

        /* renamed from: b */
        public Map.Entry<K, V> next() {
            this.f12135h = true;
            int i = this.f12134g + 1;
            this.f12134g = i;
            if (i < C3982m1.this.f12119h.size()) {
                return (Map.Entry) C3982m1.this.f12119h.get(this.f12134g);
            }
            return (Map.Entry) m17431a().next();
        }

        public boolean hasNext() {
            if (this.f12134g + 1 < C3982m1.this.f12119h.size()) {
                return true;
            }
            if (C3982m1.this.f12120i.isEmpty() || !m17431a().hasNext()) {
                return false;
            }
            return true;
        }

        public void remove() {
            if (this.f12135h) {
                this.f12135h = false;
                C3982m1.this.m17410g();
                if (this.f12134g < C3982m1.this.f12119h.size()) {
                    C3982m1 m1Var = C3982m1.this;
                    int i = this.f12134g;
                    this.f12134g = i - 1;
                    Object unused = m1Var.m17414s(i);
                    return;
                }
                m17431a().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }

        /* synthetic */ C3990f(C3982m1 m1Var, C3983a aVar) {
            this();
        }
    }

    private C3982m1(int i) {
        this.f12118g = i;
        this.f12119h = Collections.emptyList();
        this.f12120i = Collections.emptyMap();
        this.f12123l = Collections.emptyMap();
    }
}
