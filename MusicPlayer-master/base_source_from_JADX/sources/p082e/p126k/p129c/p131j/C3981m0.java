package p082e.p126k.p129c.p131j;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.m0 */
/* compiled from: MapFieldLite */
public final class C3981m0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: g */
    private static final C3981m0 f12117g;
    private boolean isMutable = true;

    static {
        C3981m0 m0Var = new C3981m0();
        f12117g = m0Var;
        m0Var.makeImmutable();
    }

    private C3981m0() {
    }

    /* renamed from: a */
    private static int m17399a(Object obj) {
        if (obj instanceof byte[]) {
            return C3899b0.m16648d((byte[]) obj);
        }
        if (!(obj instanceof C3899b0.C3902c)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: b */
    private static void m17400b(Map<?, ?> map) {
        for (Object next : map.keySet()) {
            C3899b0.m16645a(next);
            C3899b0.m16645a(map.get(next));
        }
    }

    /* renamed from: c */
    private static Object m17401c(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    static <K, V> int calculateHashCodeForMap(Map<K, V> map) {
        int i = 0;
        for (Map.Entry next : map.entrySet()) {
            i += m17399a(next.getValue()) ^ m17399a(next.getKey());
        }
        return i;
    }

    static <K, V> Map<K, V> copy(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry next : map.entrySet()) {
            linkedHashMap.put(next.getKey(), m17401c(next.getValue()));
        }
        return linkedHashMap;
    }

    /* renamed from: e */
    private void m17402e() {
        if (!isMutable()) {
            throw new UnsupportedOperationException();
        }
    }

    public static <K, V> C3981m0<K, V> emptyMapField() {
        return f12117g;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x001e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static <K, V> boolean equals(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L_0x0004
            return r0
        L_0x0004:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L_0x0010
            return r3
        L_0x0010:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0018:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0042
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L_0x002f
            return r3
        L_0x002f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = m17403f(r2, r1)
            if (r1 != 0) goto L_0x0018
            return r3
        L_0x0042:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3981m0.equals(java.util.Map, java.util.Map):boolean");
    }

    /* renamed from: f */
    private static boolean m17403f(Object obj, Object obj2) {
        if (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) {
            return obj.equals(obj2);
        }
        return Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    public void clear() {
        m17402e();
        super.clear();
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public int hashCode() {
        return calculateHashCodeForMap(this);
    }

    public boolean isMutable() {
        return this.isMutable;
    }

    public void makeImmutable() {
        this.isMutable = false;
    }

    public void mergeFrom(C3981m0<K, V> m0Var) {
        m17402e();
        if (!m0Var.isEmpty()) {
            putAll(m0Var);
        }
    }

    public C3981m0<K, V> mutableCopy() {
        return isEmpty() ? new C3981m0<>() : new C3981m0<>(this);
    }

    public V put(K k, V v) {
        m17402e();
        C3899b0.m16645a(k);
        C3899b0.m16645a(v);
        return super.put(k, v);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        m17402e();
        m17400b(map);
        super.putAll(map);
    }

    public V remove(Object obj) {
        m17402e();
        return super.remove(obj);
    }

    private C3981m0(Map<K, V> map) {
        super(map);
    }

    public boolean equals(Object obj) {
        return (obj instanceof Map) && equals(this, (Map) obj);
    }

    public V put(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }
}
