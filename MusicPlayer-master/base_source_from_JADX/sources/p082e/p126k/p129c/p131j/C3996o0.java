package p082e.p126k.p129c.p131j;

import java.util.Map;
import p082e.p126k.p129c.p131j.C3976l0;

/* renamed from: e.k.c.j.o0 */
/* compiled from: MapFieldSchemaLite */
class C3996o0 implements C3993n0 {
    C3996o0() {
    }

    /* renamed from: i */
    private static <K, V> int m17460i(int i, Object obj, Object obj2) {
        C3981m0 m0Var = (C3981m0) obj;
        C3976l0 l0Var = (C3976l0) obj2;
        int i2 = 0;
        if (m0Var.isEmpty()) {
            return 0;
        }
        for (Map.Entry entry : m0Var.entrySet()) {
            i2 += l0Var.mo13780a(i, entry.getKey(), entry.getValue());
        }
        return i2;
    }

    /* renamed from: j */
    private static <K, V> C3981m0<K, V> m17461j(Object obj, Object obj2) {
        C3981m0<K, V> m0Var = (C3981m0) obj;
        C3981m0 m0Var2 = (C3981m0) obj2;
        if (!m0Var2.isEmpty()) {
            if (!m0Var.isMutable()) {
                m0Var = m0Var.mutableCopy();
            }
            m0Var.mergeFrom(m0Var2);
        }
        return m0Var;
    }

    /* renamed from: a */
    public Object mo13895a(Object obj, Object obj2) {
        return m17461j(obj, obj2);
    }

    /* renamed from: b */
    public Object mo13896b(Object obj) {
        ((C3981m0) obj).makeImmutable();
        return obj;
    }

    /* renamed from: c */
    public C3976l0.C3977a<?, ?> mo13897c(Object obj) {
        return ((C3976l0) obj).mo13781c();
    }

    /* renamed from: d */
    public Map<?, ?> mo13898d(Object obj) {
        return (C3981m0) obj;
    }

    /* renamed from: e */
    public Object mo13899e(Object obj) {
        return C3981m0.emptyMapField().mutableCopy();
    }

    /* renamed from: f */
    public int mo13900f(int i, Object obj, Object obj2) {
        return m17460i(i, obj, obj2);
    }

    /* renamed from: g */
    public boolean mo13901g(Object obj) {
        return !((C3981m0) obj).isMutable();
    }

    /* renamed from: h */
    public Map<?, ?> mo13902h(Object obj) {
        return (C3981m0) obj;
    }
}
