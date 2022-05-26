package p082e.p098e;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: e.e.b */
/* compiled from: ArraySet */
public final class C3467b<E> implements Collection<E>, Set<E> {

    /* renamed from: k */
    private static final int[] f10993k = new int[0];

    /* renamed from: l */
    private static final Object[] f10994l = new Object[0];

    /* renamed from: m */
    private static Object[] f10995m;

    /* renamed from: n */
    private static int f10996n;

    /* renamed from: o */
    private static Object[] f10997o;

    /* renamed from: p */
    private static int f10998p;

    /* renamed from: g */
    private int[] f10999g;

    /* renamed from: h */
    Object[] f11000h;

    /* renamed from: i */
    int f11001i;

    /* renamed from: j */
    private C3472f<E, E> f11002j;

    /* renamed from: e.e.b$a */
    /* compiled from: ArraySet */
    class C3468a extends C3472f<E, E> {
        C3468a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public void mo12269a() {
            C3467b.this.clear();
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public Object mo12270b(int i, int i2) {
            return C3467b.this.f11000h[i];
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public Map<E, E> mo12271c() {
            throw new UnsupportedOperationException("not a map");
        }

        /* access modifiers changed from: protected */
        /* renamed from: d */
        public int mo12272d() {
            return C3467b.this.f11001i;
        }

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public int mo12273e(Object obj) {
            return C3467b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public int mo12274f(Object obj) {
            return C3467b.this.indexOf(obj);
        }

        /* access modifiers changed from: protected */
        /* renamed from: g */
        public void mo12275g(E e, E e2) {
            C3467b.this.add(e);
        }

        /* access modifiers changed from: protected */
        /* renamed from: h */
        public void mo12276h(int i) {
            C3467b.this.mo12296x(i);
        }

        /* access modifiers changed from: protected */
        /* renamed from: i */
        public E mo12277i(int i, E e) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public C3467b() {
        this(0);
    }

    /* renamed from: d */
    private void m14764d(int i) {
        if (i == 8) {
            synchronized (C3467b.class) {
                Object[] objArr = f10997o;
                if (objArr != null) {
                    this.f11000h = objArr;
                    f10997o = (Object[]) objArr[0];
                    this.f10999g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f10998p--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (C3467b.class) {
                Object[] objArr2 = f10995m;
                if (objArr2 != null) {
                    this.f11000h = objArr2;
                    f10995m = (Object[]) objArr2[0];
                    this.f10999g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f10996n--;
                    return;
                }
            }
        }
        this.f10999g = new int[i];
        this.f11000h = new Object[i];
    }

    /* renamed from: s */
    private static void m14765s(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (C3467b.class) {
                if (f10998p < 10) {
                    objArr[0] = f10997o;
                    objArr[1] = iArr;
                    for (int i2 = i - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f10997o = objArr;
                    f10998p++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (C3467b.class) {
                if (f10996n < 10) {
                    objArr[0] = f10995m;
                    objArr[1] = iArr;
                    for (int i3 = i - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f10995m = objArr;
                    f10996n++;
                }
            }
        }
    }

    /* renamed from: t */
    private C3472f<E, E> m14766t() {
        if (this.f11002j == null) {
            this.f11002j = new C3468a();
        }
        return this.f11002j;
    }

    /* renamed from: u */
    private int m14767u(Object obj, int i) {
        int i2 = this.f11001i;
        if (i2 == 0) {
            return -1;
        }
        int a = C3469c.m14781a(this.f10999g, i2, i);
        if (a < 0 || obj.equals(this.f11000h[a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.f10999g[i3] == i) {
            if (obj.equals(this.f11000h[i3])) {
                return i3;
            }
            i3++;
        }
        int i4 = a - 1;
        while (i4 >= 0 && this.f10999g[i4] == i) {
            if (obj.equals(this.f11000h[i4])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    /* renamed from: v */
    private int m14768v() {
        int i = this.f11001i;
        if (i == 0) {
            return -1;
        }
        int a = C3469c.m14781a(this.f10999g, i, 0);
        if (a < 0 || this.f11000h[a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.f10999g[i2] == 0) {
            if (this.f11000h[i2] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = a - 1;
        while (i3 >= 0 && this.f10999g[i3] == 0) {
            if (this.f11000h[i3] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public boolean add(E e) {
        int i;
        int i2;
        if (e == null) {
            i2 = m14768v();
            i = 0;
        } else {
            int hashCode = e.hashCode();
            i = hashCode;
            i2 = m14767u(e, hashCode);
        }
        if (i2 >= 0) {
            return false;
        }
        int i3 = ~i2;
        int i4 = this.f11001i;
        int[] iArr = this.f10999g;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f11000h;
            m14764d(i5);
            int[] iArr2 = this.f10999g;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f11000h, 0, objArr.length);
            }
            m14765s(iArr, objArr, this.f11001i);
        }
        int i6 = this.f11001i;
        if (i3 < i6) {
            int[] iArr3 = this.f10999g;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f11000h;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f11001i - i3);
        }
        this.f10999g[i3] = i;
        this.f11000h[i3] = e;
        this.f11001i++;
        return true;
    }

    public boolean addAll(Collection<? extends E> collection) {
        mo12288p(this.f11001i + collection.size());
        boolean z = false;
        for (Object add : collection) {
            z |= add(add);
        }
        return z;
    }

    public void clear() {
        int i = this.f11001i;
        if (i != 0) {
            m14765s(this.f10999g, this.f11000h, i);
            this.f10999g = f10993k;
            this.f11000h = f10994l;
            this.f11001i = 0;
        }
    }

    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    public boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f11001i) {
                try {
                    if (!set.contains(mo12297y(i))) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        int[] iArr = this.f10999g;
        int i = this.f11001i;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    public int indexOf(Object obj) {
        return obj == null ? m14768v() : m14767u(obj, obj.hashCode());
    }

    public boolean isEmpty() {
        return this.f11001i <= 0;
    }

    public Iterator<E> iterator() {
        return m14766t().mo12324m().iterator();
    }

    /* renamed from: p */
    public void mo12288p(int i) {
        int[] iArr = this.f10999g;
        if (iArr.length < i) {
            Object[] objArr = this.f11000h;
            m14764d(i);
            int i2 = this.f11001i;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.f10999g, 0, i2);
                System.arraycopy(objArr, 0, this.f11000h, 0, this.f11001i);
            }
            m14765s(iArr, objArr, this.f11001i);
        }
    }

    public boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf < 0) {
            return false;
        }
        mo12296x(indexOf);
        return true;
    }

    public boolean removeAll(Collection<?> collection) {
        boolean z = false;
        for (Object remove : collection) {
            z |= remove(remove);
        }
        return z;
    }

    public boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.f11001i - 1; i >= 0; i--) {
            if (!collection.contains(this.f11000h[i])) {
                mo12296x(i);
                z = true;
            }
        }
        return z;
    }

    public int size() {
        return this.f11001i;
    }

    public Object[] toArray() {
        int i = this.f11001i;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f11000h, 0, objArr, 0, i);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11001i * 14);
        sb.append('{');
        for (int i = 0; i < this.f11001i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object y = mo12297y(i);
            if (y != this) {
                sb.append(y);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: x */
    public E mo12296x(int i) {
        E[] eArr = this.f11000h;
        E e = eArr[i];
        int i2 = this.f11001i;
        if (i2 <= 1) {
            m14765s(this.f10999g, eArr, i2);
            this.f10999g = f10993k;
            this.f11000h = f10994l;
            this.f11001i = 0;
        } else {
            int[] iArr = this.f10999g;
            int i3 = 8;
            if (iArr.length <= 8 || i2 >= iArr.length / 3) {
                int i4 = i2 - 1;
                this.f11001i = i4;
                if (i < i4) {
                    int i5 = i + 1;
                    System.arraycopy(iArr, i5, iArr, i, i4 - i);
                    Object[] objArr = this.f11000h;
                    System.arraycopy(objArr, i5, objArr, i, this.f11001i - i);
                }
                this.f11000h[this.f11001i] = null;
            } else {
                if (i2 > 8) {
                    i3 = i2 + (i2 >> 1);
                }
                m14764d(i3);
                this.f11001i--;
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.f10999g, 0, i);
                    System.arraycopy(eArr, 0, this.f11000h, 0, i);
                }
                int i6 = this.f11001i;
                if (i < i6) {
                    int i7 = i + 1;
                    System.arraycopy(iArr, i7, this.f10999g, i, i6 - i);
                    System.arraycopy(eArr, i7, this.f11000h, i, this.f11001i - i);
                }
            }
        }
        return e;
    }

    /* renamed from: y */
    public E mo12297y(int i) {
        return this.f11000h[i];
    }

    public C3467b(int i) {
        if (i == 0) {
            this.f10999g = f10993k;
            this.f11000h = f10994l;
        } else {
            m14764d(i);
        }
        this.f11001i = 0;
    }

    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f11001i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f11001i);
        }
        System.arraycopy(this.f11000h, 0, tArr, 0, this.f11001i);
        int length = tArr.length;
        int i = this.f11001i;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
