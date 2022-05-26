package p082e.p126k.p129c.p130i;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p082e.p126k.p127b.C3813a;
import p082e.p126k.p127b.C3828k;
import p082e.p126k.p129c.C3867d;
import p082e.p126k.p129c.C3870f;
import p082e.p126k.p129c.C3873g;
import p082e.p126k.p129c.C3875h;
import p082e.p126k.p129c.p130i.C3884d;
import p082e.p126k.p129c.p131j.C4056z;
import p369i.C8445j;
import p369i.C8457t;
import p369i.p379w.C8508d;
import p369i.p387z.p389d.C8589g;
import p369i.p387z.p389d.C8594l;

/* renamed from: e.k.c.i.h */
/* compiled from: PreferencesSerializer.kt */
public final class C3891h implements C3828k<C3884d> {

    /* renamed from: a */
    public static final C3891h f11974a = new C3891h();

    /* renamed from: b */
    private static final String f11975b = "preferences_pb";

    /* renamed from: e.k.c.i.h$a */
    /* compiled from: PreferencesSerializer.kt */
    public /* synthetic */ class C3892a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f11976a;

        static {
            int[] iArr = new int[C3875h.C3877b.values().length];
            iArr[C3875h.C3877b.BOOLEAN.ordinal()] = 1;
            iArr[C3875h.C3877b.FLOAT.ordinal()] = 2;
            iArr[C3875h.C3877b.DOUBLE.ordinal()] = 3;
            iArr[C3875h.C3877b.INTEGER.ordinal()] = 4;
            iArr[C3875h.C3877b.LONG.ordinal()] = 5;
            iArr[C3875h.C3877b.STRING.ordinal()] = 6;
            iArr[C3875h.C3877b.STRING_SET.ordinal()] = 7;
            iArr[C3875h.C3877b.VALUE_NOT_SET.ordinal()] = 8;
            f11976a = iArr;
        }
    }

    private C3891h() {
    }

    /* renamed from: d */
    private final void m16604d(String str, C3875h hVar, C3878a aVar) {
        C3875h.C3877b b0 = hVar.mo13367b0();
        switch (b0 == null ? -1 : C3892a.f11976a[b0.ordinal()]) {
            case -1:
                throw new C3813a("Value case is null.", (Throwable) null, 2, (C8589g) null);
            case 1:
                aVar.mo13384i(C3888f.m16596a(str), Boolean.valueOf(hVar.mo13360T()));
                return;
            case 2:
                aVar.mo13384i(C3888f.m16598c(str), Float.valueOf(hVar.mo13362W()));
                return;
            case 3:
                aVar.mo13384i(C3888f.m16597b(str), Double.valueOf(hVar.mo13361V()));
                return;
            case 4:
                aVar.mo13384i(C3888f.m16599d(str), Integer.valueOf(hVar.mo13363X()));
                return;
            case 5:
                aVar.mo13384i(C3888f.m16600e(str), Long.valueOf(hVar.mo13364Y()));
                return;
            case 6:
                C3884d.C3885a<String> f = C3888f.m16601f(str);
                String Z = hVar.mo13365Z();
                C8594l.m46770d(Z, "value.string");
                aVar.mo13384i(f, Z);
                return;
            case 7:
                C3884d.C3885a<Set<String>> g = C3888f.m16602g(str);
                List<String> Q = hVar.mo13366a0().mo13358Q();
                C8594l.m46770d(Q, "value.stringSet.stringsList");
                aVar.mo13384i(g, C8490t.m46679D(Q));
                return;
            case 8:
                throw new C3813a("Value not set.", (Throwable) null, 2, (C8589g) null);
            default:
                throw new C8445j();
        }
    }

    /* renamed from: g */
    private final C3875h m16605g(Object obj) {
        if (obj instanceof Boolean) {
            C3875h.C3876a c0 = C3875h.m16552c0();
            c0.mo13373y(((Boolean) obj).booleanValue());
            C4056z o = c0.mo13957d();
            C8594l.m46770d(o, "newBuilder().setBoolean(value).build()");
            return (C3875h) o;
        } else if (obj instanceof Float) {
            C3875h.C3876a c02 = C3875h.m16552c0();
            c02.mo13368A(((Number) obj).floatValue());
            C4056z o2 = c02.mo13957d();
            C8594l.m46770d(o2, "newBuilder().setFloat(value).build()");
            return (C3875h) o2;
        } else if (obj instanceof Double) {
            C3875h.C3876a c03 = C3875h.m16552c0();
            c03.mo13374z(((Number) obj).doubleValue());
            C4056z o3 = c03.mo13957d();
            C8594l.m46770d(o3, "newBuilder().setDouble(value).build()");
            return (C3875h) o3;
        } else if (obj instanceof Integer) {
            C3875h.C3876a c04 = C3875h.m16552c0();
            c04.mo13369B(((Number) obj).intValue());
            C4056z o4 = c04.mo13957d();
            C8594l.m46770d(o4, "newBuilder().setInteger(value).build()");
            return (C3875h) o4;
        } else if (obj instanceof Long) {
            C3875h.C3876a c05 = C3875h.m16552c0();
            c05.mo13370C(((Number) obj).longValue());
            C4056z o5 = c05.mo13957d();
            C8594l.m46770d(o5, "newBuilder().setLong(value).build()");
            return (C3875h) o5;
        } else if (obj instanceof String) {
            C3875h.C3876a c06 = C3875h.m16552c0();
            c06.mo13371D((String) obj);
            C4056z o6 = c06.mo13957d();
            C8594l.m46770d(o6, "newBuilder().setString(value).build()");
            return (C3875h) o6;
        } else if (obj instanceof Set) {
            C3875h.C3876a c07 = C3875h.m16552c0();
            C3873g.C3874a R = C3873g.m16539R();
            R.mo13359y((Set) obj);
            c07.mo13372E(R);
            C4056z o7 = c07.mo13957d();
            C8594l.m46770d(o7, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
            return (C3875h) o7;
        } else {
            throw new IllegalStateException(C8594l.m46777k("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
    }

    /* renamed from: c */
    public Object mo13328c(InputStream inputStream, C8508d<? super C3884d> dVar) throws IOException, C3813a {
        C3870f a = C3867d.f11963a.mo13354a(inputStream);
        C3878a b = C3887e.m16595b(new C3884d.C3886b[0]);
        Map<String, C3875h> O = a.mo13355O();
        C8594l.m46770d(O, "preferencesProto.preferencesMap");
        for (Map.Entry next : O.entrySet()) {
            String str = (String) next.getKey();
            C3875h hVar = (C3875h) next.getValue();
            C3891h hVar2 = f11974a;
            C8594l.m46770d(str, "name");
            C8594l.m46770d(hVar, "value");
            hVar2.m16604d(str, hVar, b);
        }
        return b.mo13391d();
    }

    /* renamed from: e */
    public C3884d mo13326a() {
        return C3887e.m16594a();
    }

    /* renamed from: f */
    public final String mo13400f() {
        return f11975b;
    }

    /* renamed from: h */
    public Object mo13327b(C3884d dVar, OutputStream outputStream, C8508d<? super C8457t> dVar2) throws IOException, C3813a {
        Map<C3884d.C3885a<?>, Object> a = dVar.mo13376a();
        C3870f.C3871a R = C3870f.m16529R();
        for (Map.Entry next : a.entrySet()) {
            R.mo13357y(((C3884d.C3885a) next.getKey()).mo13392a(), m16605g(next.getValue()));
        }
        ((C3870f) R.mo13957d()).mo13407q(outputStream);
        return C8457t.f34900a;
    }
}
