package p082e.p098e;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* renamed from: e.e.g */
/* compiled from: SimpleArrayMap */
public class C3478g<K, V> {

    /* renamed from: j */
    static Object[] f11035j;

    /* renamed from: k */
    static int f11036k;

    /* renamed from: l */
    static Object[] f11037l;

    /* renamed from: m */
    static int f11038m;

    /* renamed from: g */
    int[] f11039g;

    /* renamed from: h */
    Object[] f11040h;

    /* renamed from: i */
    int f11041i;

    public C3478g() {
        this.f11039g = C3469c.f11004a;
        this.f11040h = C3469c.f11006c;
        this.f11041i = 0;
    }

    /* renamed from: a */
    private void m14831a(int i) {
        Class<C3478g> cls = C3478g.class;
        if (i == 8) {
            synchronized (cls) {
                Object[] objArr = f11037l;
                if (objArr != null) {
                    this.f11040h = objArr;
                    f11037l = (Object[]) objArr[0];
                    this.f11039g = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f11038m--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (cls) {
                Object[] objArr2 = f11035j;
                if (objArr2 != null) {
                    this.f11040h = objArr2;
                    f11035j = (Object[]) objArr2[0];
                    this.f11039g = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f11036k--;
                    return;
                }
            }
        }
        this.f11039g = new int[i];
        this.f11040h = new Object[(i << 1)];
    }

    /* renamed from: b */
    private static int m14832b(int[] iArr, int i, int i2) {
        try {
            return C3469c.m14781a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    /* renamed from: d */
    private static void m14833d(int[] iArr, Object[] objArr, int i) {
        Class<C3478g> cls = C3478g.class;
        if (iArr.length == 8) {
            synchronized (cls) {
                if (f11038m < 10) {
                    objArr[0] = f11037l;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f11037l = objArr;
                    f11038m++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (cls) {
                if (f11036k < 10) {
                    objArr[0] = f11035j;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f11035j = objArr;
                    f11036k++;
                }
            }
        }
    }

    /* renamed from: c */
    public void mo12385c(int i) {
        int i2 = this.f11041i;
        int[] iArr = this.f11039g;
        if (iArr.length < i) {
            Object[] objArr = this.f11040h;
            m14831a(i);
            if (this.f11041i > 0) {
                System.arraycopy(iArr, 0, this.f11039g, 0, i2);
                System.arraycopy(objArr, 0, this.f11040h, 0, i2 << 1);
            }
            m14833d(iArr, objArr, i2);
        }
        if (this.f11041i != i2) {
            throw new ConcurrentModificationException();
        }
    }

    public void clear() {
        int i = this.f11041i;
        if (i > 0) {
            int[] iArr = this.f11039g;
            Object[] objArr = this.f11040h;
            this.f11039g = C3469c.f11004a;
            this.f11040h = C3469c.f11006c;
            this.f11041i = 0;
            m14833d(iArr, objArr, i);
        }
        if (this.f11041i > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(Object obj) {
        return mo12390f(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return mo12394h(obj) >= 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public int mo12388e(Object obj, int i) {
        int i2 = this.f11041i;
        if (i2 == 0) {
            return -1;
        }
        int b = m14832b(this.f11039g, i2, i);
        if (b < 0 || obj.equals(this.f11040h[b << 1])) {
            return b;
        }
        int i3 = b + 1;
        while (i3 < i2 && this.f11039g[i3] == i) {
            if (obj.equals(this.f11040h[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        int i4 = b - 1;
        while (i4 >= 0 && this.f11039g[i4] == i) {
            if (obj.equals(this.f11040h[i4 << 1])) {
                return i4;
            }
            i4--;
        }
        return ~i3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C3478g) {
            C3478g gVar = (C3478g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            int i = 0;
            while (i < this.f11041i) {
                try {
                    Object i2 = mo12395i(i);
                    Object m = mo12397m(i);
                    Object obj2 = gVar.get(i2);
                    if (m == null) {
                        if (obj2 != null || !gVar.containsKey(i2)) {
                            return false;
                        }
                    } else if (!m.equals(obj2)) {
                        return false;
                    }
                    i++;
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            int i3 = 0;
            while (i3 < this.f11041i) {
                try {
                    Object i4 = mo12395i(i3);
                    Object m2 = mo12397m(i3);
                    Object obj3 = map.get(i4);
                    if (m2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!m2.equals(obj3)) {
                        return false;
                    }
                    i3++;
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int mo12390f(Object obj) {
        return obj == null ? mo12391g() : mo12388e(obj, obj.hashCode());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public int mo12391g() {
        int i = this.f11041i;
        if (i == 0) {
            return -1;
        }
        int b = m14832b(this.f11039g, i, 0);
        if (b < 0 || this.f11040h[b << 1] == null) {
            return b;
        }
        int i2 = b + 1;
        while (i2 < i && this.f11039g[i2] == 0) {
            if (this.f11040h[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        int i3 = b - 1;
        while (i3 >= 0 && this.f11039g[i3] == 0) {
            if (this.f11040h[i3 << 1] == null) {
                return i3;
            }
            i3--;
        }
        return ~i2;
    }

    public V get(Object obj) {
        return getOrDefault(obj, (Object) null);
    }

    public V getOrDefault(Object obj, V v) {
        int f = mo12390f(obj);
        return f >= 0 ? this.f11040h[(f << 1) + 1] : v;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public int mo12394h(Object obj) {
        int i = this.f11041i * 2;
        Object[] objArr = this.f11040h;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public int hashCode() {
        int[] iArr = this.f11039g;
        Object[] objArr = this.f11040h;
        int i = this.f11041i;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    /* renamed from: i */
    public K mo12395i(int i) {
        return this.f11040h[i << 1];
    }

    public boolean isEmpty() {
        return this.f11041i <= 0;
    }

    /* renamed from: j */
    public void mo8471j(C3478g<? extends K, ? extends V> gVar) {
        int i = gVar.f11041i;
        mo12385c(this.f11041i + i);
        if (this.f11041i != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.mo12395i(i2), gVar.mo12397m(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f11039g, 0, this.f11039g, 0, i);
            System.arraycopy(gVar.f11040h, 0, this.f11040h, 0, i << 1);
            this.f11041i = i;
        }
    }

    /* renamed from: k */
    public V mo8472k(int i) {
        V[] vArr = this.f11040h;
        int i2 = i << 1;
        V v = vArr[i2 + 1];
        int i3 = this.f11041i;
        int i4 = 0;
        if (i3 <= 1) {
            m14833d(this.f11039g, vArr, i3);
            this.f11039g = C3469c.f11004a;
            this.f11040h = C3469c.f11006c;
        } else {
            int i5 = i3 - 1;
            int[] iArr = this.f11039g;
            int i6 = 8;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                if (i < i5) {
                    int i7 = i + 1;
                    int i8 = i5 - i;
                    System.arraycopy(iArr, i7, iArr, i, i8);
                    Object[] objArr = this.f11040h;
                    System.arraycopy(objArr, i7 << 1, objArr, i2, i8 << 1);
                }
                Object[] objArr2 = this.f11040h;
                int i9 = i5 << 1;
                objArr2[i9] = null;
                objArr2[i9 + 1] = null;
            } else {
                if (i3 > 8) {
                    i6 = i3 + (i3 >> 1);
                }
                m14831a(i6);
                if (i3 == this.f11041i) {
                    if (i > 0) {
                        System.arraycopy(iArr, 0, this.f11039g, 0, i);
                        System.arraycopy(vArr, 0, this.f11040h, 0, i2);
                    }
                    if (i < i5) {
                        int i10 = i + 1;
                        int i11 = i5 - i;
                        System.arraycopy(iArr, i10, this.f11039g, i, i11);
                        System.arraycopy(vArr, i10 << 1, this.f11040h, i2, i11 << 1);
                    }
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            i4 = i5;
        }
        if (i3 == this.f11041i) {
            this.f11041i = i4;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    /* renamed from: l */
    public V mo8473l(int i, V v) {
        int i2 = (i << 1) + 1;
        V[] vArr = this.f11040h;
        V v2 = vArr[i2];
        vArr[i2] = v;
        return v2;
    }

    /* renamed from: m */
    public V mo12397m(int i) {
        return this.f11040h[(i << 1) + 1];
    }

    public V put(K k, V v) {
        int i;
        int i2;
        int i3 = this.f11041i;
        if (k == null) {
            i2 = mo12391g();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            i2 = mo12388e(k, hashCode);
        }
        if (i2 >= 0) {
            int i4 = (i2 << 1) + 1;
            V[] vArr = this.f11040h;
            V v2 = vArr[i4];
            vArr[i4] = v;
            return v2;
        }
        int i5 = ~i2;
        int[] iArr = this.f11039g;
        if (i3 >= iArr.length) {
            int i6 = 4;
            if (i3 >= 8) {
                i6 = (i3 >> 1) + i3;
            } else if (i3 >= 4) {
                i6 = 8;
            }
            Object[] objArr = this.f11040h;
            m14831a(i6);
            if (i3 == this.f11041i) {
                int[] iArr2 = this.f11039g;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                    System.arraycopy(objArr, 0, this.f11040h, 0, objArr.length);
                }
                m14833d(iArr, objArr, i3);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i5 < i3) {
            int[] iArr3 = this.f11039g;
            int i7 = i5 + 1;
            System.arraycopy(iArr3, i5, iArr3, i7, i3 - i5);
            Object[] objArr2 = this.f11040h;
            System.arraycopy(objArr2, i5 << 1, objArr2, i7 << 1, (this.f11041i - i5) << 1);
        }
        int i8 = this.f11041i;
        if (i3 == i8) {
            int[] iArr4 = this.f11039g;
            if (i5 < iArr4.length) {
                iArr4[i5] = i;
                Object[] objArr3 = this.f11040h;
                int i9 = i5 << 1;
                objArr3[i9] = k;
                objArr3[i9 + 1] = v;
                this.f11041i = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int f = mo12390f(obj);
        if (f >= 0) {
            return mo8472k(f);
        }
        return null;
    }

    public V replace(K k, V v) {
        int f = mo12390f(k);
        if (f >= 0) {
            return mo8473l(f, v);
        }
        return null;
    }

    public int size() {
        return this.f11041i;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f11041i * 28);
        sb.append('{');
        for (int i = 0; i < this.f11041i; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            Object i2 = mo12395i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            Object m = mo12397m(i);
            if (m != this) {
                sb.append(m);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public boolean remove(Object obj, Object obj2) {
        int f = mo12390f(obj);
        if (f < 0) {
            return false;
        }
        Object m = mo12397m(f);
        if (obj2 != m && (obj2 == null || !obj2.equals(m))) {
            return false;
        }
        mo8472k(f);
        return true;
    }

    public boolean replace(K k, V v, V v2) {
        int f = mo12390f(k);
        if (f < 0) {
            return false;
        }
        V m = mo12397m(f);
        if (m != v && (v == null || !v.equals(m))) {
            return false;
        }
        mo8473l(f, v2);
        return true;
    }

    public C3478g(int i) {
        if (i == 0) {
            this.f11039g = C3469c.f11004a;
            this.f11040h = C3469c.f11006c;
        } else {
            m14831a(i);
        }
        this.f11041i = 0;
    }

    public C3478g(C3478g<K, V> gVar) {
        this();
        if (gVar != null) {
            mo8471j(gVar);
        }
    }
}
