package com.bumptech.glide.load.p030n.p031a0;

import android.util.Log;
import com.bumptech.glide.p051s.C2193j;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

/* renamed from: com.bumptech.glide.load.n.a0.j */
/* compiled from: LruArrayPool */
public final class C1813j implements C1802b {

    /* renamed from: a */
    private final C1810h<C1814a, Object> f6603a = new C1810h<>();

    /* renamed from: b */
    private final C1815b f6604b = new C1815b();

    /* renamed from: c */
    private final Map<Class<?>, NavigableMap<Integer, Integer>> f6605c = new HashMap();

    /* renamed from: d */
    private final Map<Class<?>, C1801a<?>> f6606d = new HashMap();

    /* renamed from: e */
    private final int f6607e;

    /* renamed from: f */
    private int f6608f;

    /* renamed from: com.bumptech.glide.load.n.a0.j$a */
    /* compiled from: LruArrayPool */
    private static final class C1814a implements C1820m {

        /* renamed from: a */
        private final C1815b f6609a;

        /* renamed from: b */
        int f6610b;

        /* renamed from: c */
        private Class<?> f6611c;

        C1814a(C1815b bVar) {
            this.f6609a = bVar;
        }

        /* renamed from: a */
        public void mo7779a() {
            this.f6609a.mo7788c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7805b(int i, Class<?> cls) {
            this.f6610b = i;
            this.f6611c = cls;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1814a)) {
                return false;
            }
            C1814a aVar = (C1814a) obj;
            if (this.f6610b == aVar.f6610b && this.f6611c == aVar.f6611c) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            int i = this.f6610b * 31;
            Class<?> cls = this.f6611c;
            return i + (cls != null ? cls.hashCode() : 0);
        }

        public String toString() {
            return "Key{size=" + this.f6610b + "array=" + this.f6611c + '}';
        }
    }

    /* renamed from: com.bumptech.glide.load.n.a0.j$b */
    /* compiled from: LruArrayPool */
    private static final class C1815b extends C1806d<C1814a> {
        C1815b() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public C1814a mo7784a() {
            return new C1814a(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public C1814a mo7810e(int i, Class<?> cls) {
            C1814a aVar = (C1814a) mo7787b();
            aVar.mo7805b(i, cls);
            return aVar;
        }
    }

    public C1813j(int i) {
        this.f6607e = i;
    }

    /* renamed from: f */
    private void m8897f(int i, Class<?> cls) {
        NavigableMap<Integer, Integer> m = m8904m(cls);
        Integer num = (Integer) m.get(Integer.valueOf(i));
        if (num == null) {
            throw new NullPointerException("Tried to decrement empty size, size: " + i + ", this: " + this);
        } else if (num.intValue() == 1) {
            m.remove(Integer.valueOf(i));
        } else {
            m.put(Integer.valueOf(i), Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: g */
    private void m8898g() {
        m8899h(this.f6607e);
    }

    /* renamed from: h */
    private void m8899h(int i) {
        while (this.f6608f > i) {
            Object f = this.f6603a.mo7798f();
            C2193j.m10269d(f);
            C1801a i2 = m8900i(f);
            this.f6608f -= i2.mo7765b(f) * i2.mo7764a();
            m8897f(i2.mo7765b(f), f.getClass());
            if (Log.isLoggable(i2.mo7763W(), 2)) {
                Log.v(i2.mo7763W(), "evicted: " + i2.mo7765b(f));
            }
        }
    }

    /* renamed from: i */
    private <T> C1801a<T> m8900i(T t) {
        return m8901j(t.getClass());
    }

    /* renamed from: j */
    private <T> C1801a<T> m8901j(Class<T> cls) {
        C1801a<T> aVar = this.f6606d.get(cls);
        if (aVar == null) {
            if (cls.equals(int[].class)) {
                aVar = new C1812i();
            } else if (cls.equals(byte[].class)) {
                aVar = new C1809g();
            } else {
                throw new IllegalArgumentException("No array pool found for: " + cls.getSimpleName());
            }
            this.f6606d.put(cls, aVar);
        }
        return aVar;
    }

    /* renamed from: k */
    private <T> T m8902k(C1814a aVar) {
        return this.f6603a.mo7796a(aVar);
    }

    /* renamed from: l */
    private <T> T m8903l(C1814a aVar, Class<T> cls) {
        C1801a<T> j = m8901j(cls);
        T k = m8902k(aVar);
        if (k != null) {
            this.f6608f -= j.mo7765b(k) * j.mo7764a();
            m8897f(j.mo7765b(k), cls);
        }
        if (k != null) {
            return k;
        }
        if (Log.isLoggable(j.mo7763W(), 2)) {
            Log.v(j.mo7763W(), "Allocated " + aVar.f6610b + " bytes");
        }
        return j.newArray(aVar.f6610b);
    }

    /* renamed from: m */
    private NavigableMap<Integer, Integer> m8904m(Class<?> cls) {
        NavigableMap<Integer, Integer> navigableMap = this.f6605c.get(cls);
        if (navigableMap != null) {
            return navigableMap;
        }
        TreeMap treeMap = new TreeMap();
        this.f6605c.put(cls, treeMap);
        return treeMap;
    }

    /* renamed from: n */
    private boolean m8905n() {
        int i = this.f6608f;
        return i == 0 || this.f6607e / i >= 2;
    }

    /* renamed from: o */
    private boolean m8906o(int i) {
        return i <= this.f6607e / 2;
    }

    /* renamed from: p */
    private boolean m8907p(int i, Integer num) {
        return num != null && (m8905n() || num.intValue() <= i * 8);
    }

    /* renamed from: a */
    public synchronized void mo7767a(int i) {
        if (i >= 40) {
            try {
                mo7768b();
            } catch (Throwable th) {
                throw th;
            }
        } else if (i >= 20 || i == 15) {
            m8899h(this.f6607e / 2);
        }
    }

    /* renamed from: b */
    public synchronized void mo7768b() {
        m8899h(0);
    }

    /* renamed from: c */
    public synchronized <T> T mo7769c(int i, Class<T> cls) {
        return m8903l(this.f6604b.mo7810e(i, cls), cls);
    }

    /* renamed from: d */
    public synchronized <T> void mo7770d(T t) {
        Class<?> cls = t.getClass();
        C1801a<?> j = m8901j(cls);
        int b = j.mo7765b(t);
        int a = j.mo7764a() * b;
        if (m8906o(a)) {
            C1814a e = this.f6604b.mo7810e(b, cls);
            this.f6603a.mo7797d(e, t);
            NavigableMap<Integer, Integer> m = m8904m(cls);
            Integer num = (Integer) m.get(Integer.valueOf(e.f6610b));
            Integer valueOf = Integer.valueOf(e.f6610b);
            int i = 1;
            if (num != null) {
                i = 1 + num.intValue();
            }
            m.put(valueOf, Integer.valueOf(i));
            this.f6608f += a;
            m8898g();
        }
    }

    /* renamed from: e */
    public synchronized <T> T mo7771e(int i, Class<T> cls) {
        C1814a aVar;
        Integer ceilingKey = m8904m(cls).ceilingKey(Integer.valueOf(i));
        if (m8907p(i, ceilingKey)) {
            aVar = this.f6604b.mo7810e(ceilingKey.intValue(), cls);
        } else {
            aVar = this.f6604b.mo7810e(i, cls);
        }
        return m8903l(aVar, cls);
    }
}
