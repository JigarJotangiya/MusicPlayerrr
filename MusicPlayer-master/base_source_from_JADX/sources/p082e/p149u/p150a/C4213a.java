package p082e.p149u.p150a;

/* renamed from: e.u.a.a */
/* compiled from: SimpleSQLiteQuery */
public final class C4213a implements C4221e {

    /* renamed from: g */
    private final String f12593g;

    /* renamed from: h */
    private final Object[] f12594h;

    public C4213a(String str, Object[] objArr) {
        this.f12593g = str;
        this.f12594h = objArr;
    }

    /* renamed from: a */
    private static void m18549a(C4220d dVar, int i, Object obj) {
        if (obj == null) {
            dVar.mo5561k0(i);
        } else if (obj instanceof byte[]) {
            dVar.mo5558S(i, (byte[]) obj);
        } else if (obj instanceof Float) {
            dVar.mo5563y(i, (double) ((Float) obj).floatValue());
        } else if (obj instanceof Double) {
            dVar.mo5563y(i, ((Double) obj).doubleValue());
        } else if (obj instanceof Long) {
            dVar.mo5557L(i, ((Long) obj).longValue());
        } else if (obj instanceof Integer) {
            dVar.mo5557L(i, (long) ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            dVar.mo5557L(i, (long) ((Short) obj).shortValue());
        } else if (obj instanceof Byte) {
            dVar.mo5557L(i, (long) ((Byte) obj).byteValue());
        } else if (obj instanceof String) {
            dVar.mo5562r(i, (String) obj);
        } else if (obj instanceof Boolean) {
            dVar.mo5557L(i, ((Boolean) obj).booleanValue() ? 1 : 0);
        } else {
            throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
        }
    }

    /* renamed from: b */
    public static void m18550b(C4220d dVar, Object[] objArr) {
        if (objArr != null) {
            int length = objArr.length;
            int i = 0;
            while (i < length) {
                Object obj = objArr[i];
                i++;
                m18549a(dVar, i, obj);
            }
        }
    }

    /* renamed from: c */
    public String mo5623c() {
        return this.f12593g;
    }

    /* renamed from: d */
    public void mo5625d(C4220d dVar) {
        m18550b(dVar, this.f12594h);
    }

    public C4213a(String str) {
        this(str, (Object[]) null);
    }
}
