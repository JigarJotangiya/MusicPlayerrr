package p159f.p334h.p335a;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* renamed from: f.h.a.q */
/* compiled from: LinkedHashTreeMap */
final class C7769q<K, V> extends AbstractMap<K, V> implements Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    /* renamed from: g */
    private static final Comparator<Comparable> f33140g = new C7770a();
    Comparator<? super K> comparator;
    private C7769q<K, V>.d entrySet;
    final C7778g<K, V> header;
    private C7769q<K, V>.e keySet;
    int modCount;
    int size;
    C7778g<K, V>[] table;
    int threshold;

    /* renamed from: f.h.a.q$a */
    /* compiled from: LinkedHashTreeMap */
    class C7770a implements Comparator<Comparable> {
        C7770a() {
        }

        /* renamed from: a */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    /* renamed from: f.h.a.q$b */
    /* compiled from: LinkedHashTreeMap */
    static final class C7771b<K, V> {

        /* renamed from: a */
        private C7778g<K, V> f33141a;

        /* renamed from: b */
        private int f33142b;

        /* renamed from: c */
        private int f33143c;

        /* renamed from: d */
        private int f33144d;

        C7771b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo28997a(C7778g<K, V> gVar) {
            gVar.f33154i = null;
            gVar.f33152g = null;
            gVar.f33153h = null;
            gVar.f33160o = 1;
            int i = this.f33142b;
            if (i > 0) {
                int i2 = this.f33144d;
                if ((i2 & 1) == 0) {
                    this.f33144d = i2 + 1;
                    this.f33142b = i - 1;
                    this.f33143c++;
                }
            }
            gVar.f33152g = this.f33141a;
            this.f33141a = gVar;
            int i3 = this.f33144d + 1;
            this.f33144d = i3;
            int i4 = this.f33142b;
            if (i4 > 0 && (i3 & 1) == 0) {
                this.f33144d = i3 + 1;
                this.f33142b = i4 - 1;
                this.f33143c++;
            }
            int i5 = 4;
            while (true) {
                int i6 = i5 - 1;
                if ((this.f33144d & i6) == i6) {
                    int i7 = this.f33143c;
                    if (i7 == 0) {
                        C7778g<K, V> gVar2 = this.f33141a;
                        C7778g<K, V> gVar3 = gVar2.f33152g;
                        C7778g<K, V> gVar4 = gVar3.f33152g;
                        gVar3.f33152g = gVar4.f33152g;
                        this.f33141a = gVar3;
                        gVar3.f33153h = gVar4;
                        gVar3.f33154i = gVar2;
                        gVar3.f33160o = gVar2.f33160o + 1;
                        gVar4.f33152g = gVar3;
                        gVar2.f33152g = gVar3;
                    } else if (i7 == 1) {
                        C7778g<K, V> gVar5 = this.f33141a;
                        C7778g<K, V> gVar6 = gVar5.f33152g;
                        this.f33141a = gVar6;
                        gVar6.f33154i = gVar5;
                        gVar6.f33160o = gVar5.f33160o + 1;
                        gVar5.f33152g = gVar6;
                        this.f33143c = 0;
                    } else if (i7 == 2) {
                        this.f33143c = 0;
                    }
                    i5 *= 2;
                } else {
                    return;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo28998b(int i) {
            this.f33142b = ((Integer.highestOneBit(i) * 2) - 1) - i;
            this.f33144d = 0;
            this.f33143c = 0;
            this.f33141a = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C7778g<K, V> mo28999c() {
            C7778g<K, V> gVar = this.f33141a;
            if (gVar.f33152g == null) {
                return gVar;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: f.h.a.q$c */
    /* compiled from: LinkedHashTreeMap */
    static class C7772c<K, V> {

        /* renamed from: a */
        private C7778g<K, V> f33145a;

        C7772c() {
        }

        /* renamed from: a */
        public C7778g<K, V> mo29000a() {
            C7778g<K, V> gVar = this.f33145a;
            if (gVar == null) {
                return null;
            }
            C7778g<K, V> gVar2 = gVar.f33152g;
            gVar.f33152g = null;
            C7778g<K, V> gVar3 = gVar.f33154i;
            while (true) {
                C7778g<K, V> gVar4 = gVar2;
                gVar2 = gVar3;
                C7778g<K, V> gVar5 = gVar4;
                if (gVar2 != null) {
                    gVar2.f33152g = gVar5;
                    gVar3 = gVar2.f33153h;
                } else {
                    this.f33145a = gVar5;
                    return gVar;
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo29001b(C7778g<K, V> gVar) {
            C7778g<K, V> gVar2 = null;
            while (gVar != null) {
                gVar.f33152g = gVar2;
                gVar2 = gVar;
                gVar = gVar.f33153h;
            }
            this.f33145a = gVar2;
        }
    }

    /* renamed from: f.h.a.q$d */
    /* compiled from: LinkedHashTreeMap */
    final class C7773d extends AbstractSet<Map.Entry<K, V>> {

        /* renamed from: f.h.a.q$d$a */
        /* compiled from: LinkedHashTreeMap */
        class C7774a extends C7769q<K, V>.f<Map.Entry<K, V>> {
            C7774a(C7773d dVar) {
                super();
            }

            /* renamed from: b */
            public Map.Entry<K, V> next() {
                return mo29015a();
            }
        }

        C7773d() {
        }

        public void clear() {
            C7769q.this.clear();
        }

        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && C7769q.this.findByEntry((Map.Entry) obj) != null;
        }

        public Iterator<Map.Entry<K, V>> iterator() {
            return new C7774a(this);
        }

        public boolean remove(Object obj) {
            C7778g findByEntry;
            if (!(obj instanceof Map.Entry) || (findByEntry = C7769q.this.findByEntry((Map.Entry) obj)) == null) {
                return false;
            }
            C7769q.this.removeInternal(findByEntry, true);
            return true;
        }

        public int size() {
            return C7769q.this.size;
        }
    }

    /* renamed from: f.h.a.q$e */
    /* compiled from: LinkedHashTreeMap */
    final class C7775e extends AbstractSet<K> {

        /* renamed from: f.h.a.q$e$a */
        /* compiled from: LinkedHashTreeMap */
        class C7776a extends C7769q<K, V>.f<K> {
            C7776a(C7775e eVar) {
                super();
            }

            public K next() {
                return mo29015a().f33157l;
            }
        }

        C7775e() {
        }

        public void clear() {
            C7769q.this.clear();
        }

        public boolean contains(Object obj) {
            return C7769q.this.containsKey(obj);
        }

        public Iterator<K> iterator() {
            return new C7776a(this);
        }

        public boolean remove(Object obj) {
            return C7769q.this.removeInternalByKey(obj) != null;
        }

        public int size() {
            return C7769q.this.size;
        }
    }

    /* renamed from: f.h.a.q$f */
    /* compiled from: LinkedHashTreeMap */
    abstract class C7777f<T> implements Iterator<T> {

        /* renamed from: g */
        C7778g<K, V> f33148g;

        /* renamed from: h */
        C7778g<K, V> f33149h = null;

        /* renamed from: i */
        int f33150i;

        C7777f() {
            this.f33148g = C7769q.this.header.f33155j;
            this.f33150i = C7769q.this.modCount;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public final C7778g<K, V> mo29015a() {
            C7778g<K, V> gVar = this.f33148g;
            C7769q qVar = C7769q.this;
            if (gVar == qVar.header) {
                throw new NoSuchElementException();
            } else if (qVar.modCount == this.f33150i) {
                this.f33148g = gVar.f33155j;
                this.f33149h = gVar;
                return gVar;
            } else {
                throw new ConcurrentModificationException();
            }
        }

        public final boolean hasNext() {
            return this.f33148g != C7769q.this.header;
        }

        public final void remove() {
            C7778g<K, V> gVar = this.f33149h;
            if (gVar != null) {
                C7769q.this.removeInternal(gVar, true);
                this.f33149h = null;
                this.f33150i = C7769q.this.modCount;
                return;
            }
            throw new IllegalStateException();
        }
    }

    static {
        Class<C7769q> cls = C7769q.class;
    }

    C7769q() {
        this((Comparator) null);
    }

    /* renamed from: a */
    private void m42705a() {
        C7778g<K, V>[] doubleCapacity = doubleCapacity(this.table);
        this.table = doubleCapacity;
        this.threshold = (doubleCapacity.length / 2) + (doubleCapacity.length / 4);
    }

    /* renamed from: b */
    private boolean m42706b(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: c */
    private void m42707c(C7778g<K, V> gVar, boolean z) {
        while (gVar != null) {
            C7778g<K, V> gVar2 = gVar.f33153h;
            C7778g<K, V> gVar3 = gVar.f33154i;
            int i = 0;
            int i2 = gVar2 != null ? gVar2.f33160o : 0;
            int i3 = gVar3 != null ? gVar3.f33160o : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C7778g<K, V> gVar4 = gVar3.f33153h;
                C7778g<K, V> gVar5 = gVar3.f33154i;
                int i5 = gVar5 != null ? gVar5.f33160o : 0;
                if (gVar4 != null) {
                    i = gVar4.f33160o;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m42709e(gVar);
                } else {
                    m42710f(gVar3);
                    m42709e(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C7778g<K, V> gVar6 = gVar2.f33153h;
                C7778g<K, V> gVar7 = gVar2.f33154i;
                int i7 = gVar7 != null ? gVar7.f33160o : 0;
                if (gVar6 != null) {
                    i = gVar6.f33160o;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m42710f(gVar);
                } else {
                    m42709e(gVar2);
                    m42710f(gVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                gVar.f33160o = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                gVar.f33160o = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            gVar = gVar.f33152g;
        }
    }

    /* renamed from: d */
    private void m42708d(C7778g<K, V> gVar, C7778g<K, V> gVar2) {
        C7778g<K, V> gVar3 = gVar.f33152g;
        gVar.f33152g = null;
        if (gVar2 != null) {
            gVar2.f33152g = gVar3;
        }
        if (gVar3 == null) {
            int i = gVar.f33158m;
            C7778g<K, V>[] gVarArr = this.table;
            gVarArr[i & (gVarArr.length - 1)] = gVar2;
        } else if (gVar3.f33153h == gVar) {
            gVar3.f33153h = gVar2;
        } else {
            gVar3.f33154i = gVar2;
        }
    }

    static <K, V> C7778g<K, V>[] doubleCapacity(C7778g<K, V>[] gVarArr) {
        int length = gVarArr.length;
        C7778g<K, V>[] gVarArr2 = new C7778g[(length * 2)];
        C7772c cVar = new C7772c();
        C7771b bVar = new C7771b();
        C7771b bVar2 = new C7771b();
        for (int i = 0; i < length; i++) {
            C7778g<K, V> gVar = gVarArr[i];
            if (gVar != null) {
                cVar.mo29001b(gVar);
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    C7778g a = cVar.mo29000a();
                    if (a == null) {
                        break;
                    } else if ((a.f33158m & length) == 0) {
                        i2++;
                    } else {
                        i3++;
                    }
                }
                bVar.mo28998b(i2);
                bVar2.mo28998b(i3);
                cVar.mo29001b(gVar);
                while (true) {
                    C7778g a2 = cVar.mo29000a();
                    if (a2 == null) {
                        break;
                    } else if ((a2.f33158m & length) == 0) {
                        bVar.mo28997a(a2);
                    } else {
                        bVar2.mo28997a(a2);
                    }
                }
                C7778g<K, V> gVar2 = null;
                gVarArr2[i] = i2 > 0 ? bVar.mo28999c() : null;
                int i4 = i + length;
                if (i3 > 0) {
                    gVar2 = bVar2.mo28999c();
                }
                gVarArr2[i4] = gVar2;
            }
        }
        return gVarArr2;
    }

    /* renamed from: e */
    private void m42709e(C7778g<K, V> gVar) {
        C7778g<K, V> gVar2 = gVar.f33153h;
        C7778g<K, V> gVar3 = gVar.f33154i;
        C7778g<K, V> gVar4 = gVar3.f33153h;
        C7778g<K, V> gVar5 = gVar3.f33154i;
        gVar.f33154i = gVar4;
        if (gVar4 != null) {
            gVar4.f33152g = gVar;
        }
        m42708d(gVar, gVar3);
        gVar3.f33153h = gVar;
        gVar.f33152g = gVar3;
        int i = 0;
        int max = Math.max(gVar2 != null ? gVar2.f33160o : 0, gVar4 != null ? gVar4.f33160o : 0) + 1;
        gVar.f33160o = max;
        if (gVar5 != null) {
            i = gVar5.f33160o;
        }
        gVar3.f33160o = Math.max(max, i) + 1;
    }

    /* renamed from: f */
    private void m42710f(C7778g<K, V> gVar) {
        C7778g<K, V> gVar2 = gVar.f33153h;
        C7778g<K, V> gVar3 = gVar.f33154i;
        C7778g<K, V> gVar4 = gVar2.f33153h;
        C7778g<K, V> gVar5 = gVar2.f33154i;
        gVar.f33153h = gVar5;
        if (gVar5 != null) {
            gVar5.f33152g = gVar;
        }
        m42708d(gVar, gVar2);
        gVar2.f33154i = gVar;
        gVar.f33152g = gVar2;
        int i = 0;
        int max = Math.max(gVar3 != null ? gVar3.f33160o : 0, gVar5 != null ? gVar5.f33160o : 0) + 1;
        gVar.f33160o = max;
        if (gVar4 != null) {
            i = gVar4.f33160o;
        }
        gVar2.f33160o = Math.max(max, i) + 1;
    }

    /* renamed from: g */
    private static int m42711g(int i) {
        int i2 = i ^ ((i >>> 20) ^ (i >>> 12));
        return (i2 >>> 4) ^ ((i2 >>> 7) ^ i2);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        C7778g<K, V> gVar = this.header;
        C7778g<K, V> gVar2 = gVar.f33155j;
        while (gVar2 != gVar) {
            C7778g<K, V> gVar3 = gVar2.f33155j;
            gVar2.f33156k = null;
            gVar2.f33155j = null;
            gVar2 = gVar3;
        }
        gVar.f33156k = gVar;
        gVar.f33155j = gVar;
    }

    public boolean containsKey(Object obj) {
        return findByObject(obj) != null;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        C7769q<K, V>.d dVar = this.entrySet;
        if (dVar != null) {
            return dVar;
        }
        C7769q<K, V>.d dVar2 = new C7773d();
        this.entrySet = dVar2;
        return dVar2;
    }

    /* access modifiers changed from: package-private */
    public C7778g<K, V> find(K k, boolean z) {
        int i;
        C7778g<K, V> gVar;
        C7778g<K, V> gVar2;
        int i2;
        Comparator<? super K> comparator2 = this.comparator;
        C7778g<K, V>[] gVarArr = this.table;
        int g = m42711g(k.hashCode());
        int length = (gVarArr.length - 1) & g;
        C7778g<K, V> gVar3 = gVarArr[length];
        if (gVar3 != null) {
            Comparable comparable = comparator2 == f33140g ? (Comparable) k : null;
            while (true) {
                if (comparable != null) {
                    i2 = comparable.compareTo(gVar3.f33157l);
                } else {
                    i2 = comparator2.compare(k, gVar3.f33157l);
                }
                if (i2 == 0) {
                    return gVar3;
                }
                C7778g<K, V> gVar4 = i2 < 0 ? gVar3.f33153h : gVar3.f33154i;
                if (gVar4 == null) {
                    gVar = gVar3;
                    i = i2;
                    break;
                }
                gVar3 = gVar4;
            }
        } else {
            gVar = gVar3;
            i = 0;
        }
        if (!z) {
            return null;
        }
        C7778g<K, V> gVar5 = this.header;
        if (gVar != null) {
            gVar2 = new C7778g<>(gVar, k, g, gVar5, gVar5.f33156k);
            if (i < 0) {
                gVar.f33153h = gVar2;
            } else {
                gVar.f33154i = gVar2;
            }
            m42707c(gVar, true);
        } else if (comparator2 != f33140g || (k instanceof Comparable)) {
            gVar2 = new C7778g<>(gVar, k, g, gVar5, gVar5.f33156k);
            gVarArr[length] = gVar2;
        } else {
            throw new ClassCastException(k.getClass().getName() + " is not Comparable");
        }
        int i3 = this.size;
        this.size = i3 + 1;
        if (i3 > this.threshold) {
            m42705a();
        }
        this.modCount++;
        return gVar2;
    }

    /* access modifiers changed from: package-private */
    public C7778g<K, V> findByEntry(Map.Entry<?, ?> entry) {
        C7778g<K, V> findByObject = findByObject(entry.getKey());
        if (findByObject != null && m42706b(findByObject.f33159n, entry.getValue())) {
            return findByObject;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public C7778g<K, V> findByObject(Object obj) {
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
        C7778g findByObject = findByObject(obj);
        if (findByObject != null) {
            return findByObject.f33159n;
        }
        return null;
    }

    public Set<K> keySet() {
        C7769q<K, V>.e eVar = this.keySet;
        if (eVar != null) {
            return eVar;
        }
        C7769q<K, V>.e eVar2 = new C7775e();
        this.keySet = eVar2;
        return eVar2;
    }

    public V put(K k, V v) {
        Objects.requireNonNull(k, "key == null");
        C7778g find = find(k, true);
        V v2 = find.f33159n;
        find.f33159n = v;
        return v2;
    }

    public V remove(Object obj) {
        C7778g removeInternalByKey = removeInternalByKey(obj);
        if (removeInternalByKey != null) {
            return removeInternalByKey.f33159n;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void removeInternal(C7778g<K, V> gVar, boolean z) {
        int i;
        if (z) {
            C7778g<K, V> gVar2 = gVar.f33156k;
            gVar2.f33155j = gVar.f33155j;
            gVar.f33155j.f33156k = gVar2;
            gVar.f33156k = null;
            gVar.f33155j = null;
        }
        C7778g<K, V> gVar3 = gVar.f33153h;
        C7778g<K, V> gVar4 = gVar.f33154i;
        C7778g<K, V> gVar5 = gVar.f33152g;
        int i2 = 0;
        if (gVar3 == null || gVar4 == null) {
            if (gVar3 != null) {
                m42708d(gVar, gVar3);
                gVar.f33153h = null;
            } else if (gVar4 != null) {
                m42708d(gVar, gVar4);
                gVar.f33154i = null;
            } else {
                m42708d(gVar, (C7778g<K, V>) null);
            }
            m42707c(gVar5, false);
            this.size--;
            this.modCount++;
            return;
        }
        C7778g<K, V> b = gVar3.f33160o > gVar4.f33160o ? gVar3.mo29019b() : gVar4.mo29018a();
        removeInternal(b, false);
        C7778g<K, V> gVar6 = gVar.f33153h;
        if (gVar6 != null) {
            i = gVar6.f33160o;
            b.f33153h = gVar6;
            gVar6.f33152g = b;
            gVar.f33153h = null;
        } else {
            i = 0;
        }
        C7778g<K, V> gVar7 = gVar.f33154i;
        if (gVar7 != null) {
            i2 = gVar7.f33160o;
            b.f33154i = gVar7;
            gVar7.f33152g = b;
            gVar.f33154i = null;
        }
        b.f33160o = Math.max(i, i2) + 1;
        m42708d(gVar, b);
    }

    /* access modifiers changed from: package-private */
    public C7778g<K, V> removeInternalByKey(Object obj) {
        C7778g<K, V> findByObject = findByObject(obj);
        if (findByObject != null) {
            removeInternal(findByObject, true);
        }
        return findByObject;
    }

    public int size() {
        return this.size;
    }

    C7769q(Comparator<? super K> comparator2) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = comparator2 == null ? f33140g : comparator2;
        this.header = new C7778g<>();
        C7778g<K, V>[] gVarArr = new C7778g[16];
        this.table = gVarArr;
        this.threshold = (gVarArr.length / 2) + (gVarArr.length / 4);
    }

    /* renamed from: f.h.a.q$g */
    /* compiled from: LinkedHashTreeMap */
    static final class C7778g<K, V> implements Map.Entry<K, V> {

        /* renamed from: g */
        C7778g<K, V> f33152g;

        /* renamed from: h */
        C7778g<K, V> f33153h;

        /* renamed from: i */
        C7778g<K, V> f33154i;

        /* renamed from: j */
        C7778g<K, V> f33155j;

        /* renamed from: k */
        C7778g<K, V> f33156k;

        /* renamed from: l */
        final K f33157l;

        /* renamed from: m */
        final int f33158m;

        /* renamed from: n */
        V f33159n;

        /* renamed from: o */
        int f33160o;

        C7778g() {
            this.f33157l = null;
            this.f33158m = -1;
            this.f33156k = this;
            this.f33155j = this;
        }

        /* renamed from: a */
        public C7778g<K, V> mo29018a() {
            C7778g<K, V> gVar = this;
            for (C7778g<K, V> gVar2 = this.f33153h; gVar2 != null; gVar2 = gVar2.f33153h) {
                gVar = gVar2;
            }
            return gVar;
        }

        /* renamed from: b */
        public C7778g<K, V> mo29019b() {
            C7778g<K, V> gVar = this;
            for (C7778g<K, V> gVar2 = this.f33154i; gVar2 != null; gVar2 = gVar2.f33154i) {
                gVar = gVar2;
            }
            return gVar;
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
                K r0 = r3.f33157l
                if (r0 != 0) goto L_0x0012
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L_0x0032
                goto L_0x001c
            L_0x0012:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L_0x0032
            L_0x001c:
                V r0 = r3.f33159n
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
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p335a.C7769q.C7778g.equals(java.lang.Object):boolean");
        }

        public K getKey() {
            return this.f33157l;
        }

        public V getValue() {
            return this.f33159n;
        }

        public int hashCode() {
            K k = this.f33157l;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f33159n;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            V v2 = this.f33159n;
            this.f33159n = v;
            return v2;
        }

        public String toString() {
            return this.f33157l + "=" + this.f33159n;
        }

        C7778g(C7778g<K, V> gVar, K k, int i, C7778g<K, V> gVar2, C7778g<K, V> gVar3) {
            this.f33152g = gVar;
            this.f33157l = k;
            this.f33158m = i;
            this.f33160o = 1;
            this.f33155j = gVar2;
            this.f33156k = gVar3;
            gVar3.f33155j = this;
            gVar2.f33156k = this;
        }
    }
}
