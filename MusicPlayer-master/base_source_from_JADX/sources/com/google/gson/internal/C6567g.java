package com.google.gson.internal;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: com.google.gson.internal.g */
/* compiled from: LinkedTreeMap */
public final class C6567g<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: g */
    private static final Comparator<Comparable> f29923g = new C6568a();
    Comparator<? super K> comparator;
    private C6567g<K, V>.C1427b entrySet;
    final C6574e<K, V> header;
    private C6567g<K, V>.C1428c keySet;
    int modCount;
    C6574e<K, V> root;
    int size;

    /* renamed from: com.google.gson.internal.g$a */
    /* compiled from: LinkedTreeMap */
    class C6568a implements Comparator<Comparable> {
        C6568a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: com.google.gson.internal.g$b */
    /* compiled from: LinkedTreeMap */
    class C6569b extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: com.google.gson.internal.g$b$a */
        /* compiled from: LinkedTreeMap */
        class C6570a extends C6567g<K, V>.d<Map.Entry<K, V>> {
            C6570a(C6569b bVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo25754a();
            }
        }

        C6569b() {
        }

        public void clear() {
            C6567g.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C6567g.this.findByEntry((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C6570a(this);
        }

        public boolean remove(Object obj) {
            C6574e findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = C6567g.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            C6567g.this.removeInternal(findByEntry, true);
            return true;
        }

        public int size() {
            return C6567g.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.g$c */
    /* compiled from: LinkedTreeMap */
    final class C6571c extends AbstractSet<K> {

        /* renamed from: com.google.gson.internal.g$c$a */
        /* compiled from: LinkedTreeMap */
        class C6572a extends C6567g<K, V>.d<K> {
            C6572a(C6571c cVar) {
                super();
            }

            public K next() {
                return mo25754a().f29935l;
            }
        }

        C6571c() {
        }

        public void clear() {
            C6567g.this.clear();
        }

        public boolean contains(Object obj) {
            return C6567g.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C6572a(this);
        }

        public boolean remove(Object obj) {
            return C6567g.this.removeInternalByKey(obj) != null;
        }

        public int size() {
            return C6567g.this.size;
        }
    }

    /* renamed from: com.google.gson.internal.g$d */
    /* compiled from: LinkedTreeMap */
    private abstract class C6573d<T> implements Iterator<T> {

        /* renamed from: g */
        C6574e<K, V> f29926g;

        /* renamed from: h */
        C6574e<K, V> f29927h = null;

        /* renamed from: i */
        int f29928i;

        C6573d() {
            this.f29926g = C6567g.this.header.f29933j;
            this.f29928i = C6567g.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C6574e<K, V> mo25754a() {
            C6574e<K, V> eVar = this.f29926g;
            C6567g gVar = C6567g.this;
            if (eVar == gVar.header) {
                throw new NoSuchElementException();
            } else if (gVar.modCount == this.f29928i) {
                this.f29926g = eVar.f29933j;
                this.f29927h = eVar;
                return eVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f29926g != C6567g.this.header;
        }

        public final void remove() {
            C6574e<K, V> eVar = this.f29927h;
            if (eVar != null) {
                C6567g.this.removeInternal(eVar, true);
                this.f29927h = null;
                this.f29928i = C6567g.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<C6567g> cls = C6567g.class;
    }

    public C6567g() {
        this(f29923g);
    }

    /* renamed from: a */
    private boolean m38013a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: b */
    private void m38014b(C6574e<K, V> eVar, boolean z) {
        while (eVar != null) {
            C6574e<K, V> eVar2 = eVar.f29931h;
            C6574e<K, V> eVar3 = eVar.f29932i;
            int i = 0;
            int i2 = eVar2 != null ? eVar2.f29937n : 0;
            int i3 = eVar3 != null ? eVar3.f29937n : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C6574e<K, V> eVar4 = eVar3.f29931h;
                C6574e<K, V> eVar5 = eVar3.f29932i;
                int i5 = eVar5 != null ? eVar5.f29937n : 0;
                if (eVar4 != null) {
                    i = eVar4.f29937n;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m38016d(eVar);
                } else {
                    m38017e(eVar3);
                    m38016d(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C6574e<K, V> eVar6 = eVar2.f29931h;
                C6574e<K, V> eVar7 = eVar2.f29932i;
                int i7 = eVar7 != null ? eVar7.f29937n : 0;
                if (eVar6 != null) {
                    i = eVar6.f29937n;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m38017e(eVar);
                } else {
                    m38016d(eVar2);
                    m38017e(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f29937n = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f29937n = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f29930g;
        }
    }

    /* renamed from: c */
    private void m38015c(C6574e<K, V> eVar, C6574e<K, V> eVar2) {
        C6574e<K, V> eVar3 = eVar.f29930g;
        eVar.f29930g = null;
        if (eVar2 != null) {
            eVar2.f29930g = eVar3;
        }
        if (eVar3 == null) {
            this.root = eVar2;
        } else if (eVar3.f29931h == eVar) {
            eVar3.f29931h = eVar2;
        } else {
            eVar3.f29932i = eVar2;
        }
    }

    /* renamed from: d */
    private void m38016d(C6574e<K, V> eVar) {
        C6574e<K, V> eVar2 = eVar.f29931h;
        C6574e<K, V> eVar3 = eVar.f29932i;
        C6574e<K, V> eVar4 = eVar3.f29931h;
        C6574e<K, V> eVar5 = eVar3.f29932i;
        eVar.f29932i = eVar4;
        if (eVar4 != null) {
            eVar4.f29930g = eVar;
        }
        m38015c(eVar, eVar3);
        eVar3.f29931h = eVar;
        eVar.f29930g = eVar3;
        int i = 0;
        int max = Math.max(eVar2 != null ? eVar2.f29937n : 0, eVar4 != null ? eVar4.f29937n : 0) + 1;
        eVar.f29937n = max;
        if (eVar5 != null) {
            i = eVar5.f29937n;
        }
        eVar3.f29937n = Math.max(max, i) + 1;
    }

    /* renamed from: e */
    private void m38017e(C6574e<K, V> eVar) {
        C6574e<K, V> eVar2 = eVar.f29931h;
        C6574e<K, V> eVar3 = eVar.f29932i;
        C6574e<K, V> eVar4 = eVar2.f29931h;
        C6574e<K, V> eVar5 = eVar2.f29932i;
        eVar.f29931h = eVar5;
        if (eVar5 != null) {
            eVar5.f29930g = eVar;
        }
        m38015c(eVar, eVar2);
        eVar2.f29932i = eVar;
        eVar.f29930g = eVar2;
        int i = 0;
        int max = Math.max(eVar3 != null ? eVar3.f29937n : 0, eVar5 != null ? eVar5.f29937n : 0) + 1;
        eVar.f29937n = max;
        if (eVar4 != null) {
            i = eVar4.f29937n;
        }
        eVar2.f29937n = Math.max(max, i) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        C6574e<K, V> eVar = this.header;
        eVar.f29934k = eVar;
        eVar.f29933j = eVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C6567g<K, V>.C1427b bVar = this.entrySet;
        if (bVar != null) {
            return bVar;
        }
        C6567g<K, V>.C1427b bVar2 = new C6569b();
        this.entrySet = bVar2;
        return bVar2;
    }

    /* access modifiers changed from: package-private */
    public C6574e<K, V> find(K k, boolean z) {
        int i;
        C6574e<K, V> eVar;
        Comparator<? super K> comparator2 = this.comparator;
        C6574e<K, V> eVar2 = this.root;
        if (eVar2 != null) {
            Comparable comparable = comparator2 == f29923g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(eVar2.f29935l);
                } else {
                    i = comparator2.compare(k, eVar2.f29935l);
                }
                if (i == 0) {
                    return eVar2;
                }
                C6574e<K, V> eVar3 = i < 0 ? eVar2.f29931h : eVar2.f29932i;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C6574e<K, V> eVar4 = this.header;
        if (eVar2 != null) {
            eVar = new C6574e<>(eVar2, k, eVar4, eVar4.f29934k);
            if (i < 0) {
                eVar2.f29931h = eVar;
            } else {
                eVar2.f29932i = eVar;
            }
            m38014b(eVar2, true);
        } else if (comparator2 != f29923g || (k instanceof Comparable)) {
            eVar = new C6574e<>(eVar2, k, eVar4, eVar4.f29934k);
            this.root = eVar;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        this.size++;
        this.modCount++;
        return eVar;
    }

    /* access modifiers changed from: package-private */
    public C6574e<K, V> findByEntry(Map.Entry<?, ?> entry) {
        C6574e<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && m38013a(findByObject.f29936m, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C6574e<K, V> findByObject(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return find(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public V get(Object obj) {
        C6574e findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f29936m;
        }
        return null;
    }

    public Set<K> keySet() {
        C6567g<K, V>.C1428c cVar = this.keySet;
        if (cVar != null) {
            return cVar;
        }
        C6567g<K, V>.C1428c cVar2 = new C6571c();
        this.keySet = cVar2;
        return cVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C6574e find = find(k, true);
        V v2 = find.f29936m;
        find.f29936m = v;
        return v2;
    }

    public V remove(Object obj) {
        C6574e removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f29936m;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void removeInternal(C6574e<K, V> eVar, boolean z) {
        int i;
        if (z) {
            C6574e<K, V> eVar2 = eVar.f29934k;
            eVar2.f29933j = eVar.f29933j;
            eVar.f29933j.f29934k = eVar2;
        }
        C6574e<K, V> eVar3 = eVar.f29931h;
        C6574e<K, V> eVar4 = eVar.f29932i;
        C6574e<K, V> eVar5 = eVar.f29930g;
        int i2 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                m38015c(eVar, eVar3);
                eVar.f29931h = null;
            } else if (eVar4 != null) {
                m38015c(eVar, eVar4);
                eVar.f29932i = null;
            } else {
                m38015c(eVar, (C6574e<K, V>) null);
            }
            m38014b(eVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        C6574e<K, V> b = eVar3.f29937n > eVar4.f29937n ? eVar3.mo25758b() : eVar4.mo25757a();
        removeInternal(b, false);
        C6574e<K, V> eVar6 = eVar.f29931h;
        if (eVar6 != null) {
            i = eVar6.f29937n;
            b.f29931h = eVar6;
            eVar6.f29930g = b;
            eVar.f29931h = null;
        } else {
            i = 0;
        }
        C6574e<K, V> eVar7 = eVar.f29932i;
        if (eVar7 != null) {
            i2 = eVar7.f29937n;
            b.f29932i = eVar7;
            eVar7.f29930g = b;
            eVar.f29932i = null;
        }
        b.f29937n = Math.max(i, i2) + 1;
        m38015c(eVar, b);
    }

    /* access modifiers changed from: package-private */
    public C6574e<K, V> removeInternalByKey(Object obj) {
        C6574e<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }

    public C6567g(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.header = new C6574e<>();
        this.comparator = comparator2 == null ? f29923g : comparator2;
    }

    /* renamed from: com.google.gson.internal.g$e */
    /* compiled from: LinkedTreeMap */
    static final class C6574e<K, V> implements Map.Entry<K, V> {

        /* renamed from: g */
        C6574e<K, V> f29930g;

        /* renamed from: h */
        C6574e<K, V> f29931h;

        /* renamed from: i */
        C6574e<K, V> f29932i;

        /* renamed from: j */
        C6574e<K, V> f29933j;

        /* renamed from: k */
        C6574e<K, V> f29934k;

        /* renamed from: l */
        final K f29935l;

        /* renamed from: m */
        V f29936m;

        /* renamed from: n */
        int f29937n;

        C6574e() {
            this.f29935l = null;
            this.f29934k = this;
            this.f29933j = this;
        }

        /* renamed from: a */
        public C6574e<K, V> mo25757a() {
            C6574e<K, V> eVar = this;
            for (C6574e<K, V> eVar2 = this.f29931h; eVar2 != null; eVar2 = eVar2.f29931h) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* renamed from: b */
        public C6574e<K, V> mo25758b() {
            C6574e<K, V> eVar = this;
            for (C6574e<K, V> eVar2 = this.f29932i; eVar2 != null; eVar2 = eVar2.f29932i) {
                eVar = eVar2;
            }
            return eVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0031 A[ORIG_RETURN, RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean equals(java.lang.Object r4) {
            /*
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L_0x0032
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.f29935l
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f29936m
                if (r0 != 0) goto L_0x0027
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L_0x0032
                goto L_0x0031
            L_0x0027:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L_0x0032
            L_0x0031:
                r1 = 1
            L_0x0032:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C6567g.C6574e.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f29935l;
        }

        public V getValue() {
            return this.f29936m;
        }

        public int hashCode() {
            K k = this.f29935l;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f29936m;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f29936m;
            this.f29936m = v;
            return v2;
        }

        public String toString() {
            return this.f29935l + "=" + this.f29936m;
        }

        C6574e(C6574e<K, V> eVar, K k, C6574e<K, V> eVar2, C6574e<K, V> eVar3) {
            this.f29930g = eVar;
            this.f29935l = k;
            this.f29937n = 1;
            this.f29933j = eVar2;
            this.f29934k = eVar3;
            eVar3.f29933j = this;
            eVar2.f29934k = this;
        }
    }
}
