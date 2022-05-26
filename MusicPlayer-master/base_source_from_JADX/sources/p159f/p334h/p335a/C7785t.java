package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p159f.p334h.p335a.C7755f;
import p159f.p334h.p335a.C7761k;
import p159f.p334h.p335a.p336v.C7801b;

/* renamed from: f.h.a.t */
/* compiled from: StandardJsonAdapters */
final class C7785t {

    /* renamed from: a */
    public static final C7755f.C7756a f33178a = new C7788c();

    /* renamed from: b */
    static final C7755f<Boolean> f33179b = new C7789d();

    /* renamed from: c */
    static final C7755f<Byte> f33180c = new C7790e();

    /* renamed from: d */
    static final C7755f<Character> f33181d = new C7791f();

    /* renamed from: e */
    static final C7755f<Double> f33182e = new C7792g();

    /* renamed from: f */
    static final C7755f<Float> f33183f = new C7793h();

    /* renamed from: g */
    static final C7755f<Integer> f33184g = new C7794i();

    /* renamed from: h */
    static final C7755f<Long> f33185h = new C7795j();

    /* renamed from: i */
    static final C7755f<Short> f33186i = new C7796k();

    /* renamed from: j */
    static final C7755f<String> f33187j = new C7786a();

    /* renamed from: f.h.a.t$a */
    /* compiled from: StandardJsonAdapters */
    class C7786a extends C7755f<String> {
        C7786a() {
        }

        /* renamed from: d */
        public String mo15563a(C7761k kVar) throws IOException {
            return kVar.mo28972m0();
        }

        public String toString() {
            return "JsonAdapter(String)";
        }
    }

    /* renamed from: f.h.a.t$b */
    /* compiled from: StandardJsonAdapters */
    static /* synthetic */ class C7787b {

        /* renamed from: a */
        static final /* synthetic */ int[] f33188a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                f.h.a.k$b[] r0 = p159f.p334h.p335a.C7761k.C7763b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f33188a = r0
                f.h.a.k$b r1 = p159f.p334h.p335a.C7761k.C7763b.BEGIN_ARRAY     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f33188a     // Catch:{ NoSuchFieldError -> 0x001d }
                f.h.a.k$b r1 = p159f.p334h.p335a.C7761k.C7763b.BEGIN_OBJECT     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f33188a     // Catch:{ NoSuchFieldError -> 0x0028 }
                f.h.a.k$b r1 = p159f.p334h.p335a.C7761k.C7763b.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f33188a     // Catch:{ NoSuchFieldError -> 0x0033 }
                f.h.a.k$b r1 = p159f.p334h.p335a.C7761k.C7763b.NUMBER     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f33188a     // Catch:{ NoSuchFieldError -> 0x003e }
                f.h.a.k$b r1 = p159f.p334h.p335a.C7761k.C7763b.BOOLEAN     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = f33188a     // Catch:{ NoSuchFieldError -> 0x0049 }
                f.h.a.k$b r1 = p159f.p334h.p335a.C7761k.C7763b.NULL     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p335a.C7785t.C7787b.<clinit>():void");
        }
    }

    /* renamed from: f.h.a.t$c */
    /* compiled from: StandardJsonAdapters */
    class C7788c implements C7755f.C7756a {
        C7788c() {
        }

        /* renamed from: a */
        public C7755f<?> mo15565a(Type type, Set<? extends Annotation> set, C7781s sVar) {
            if (!set.isEmpty()) {
                return null;
            }
            if (type == Boolean.TYPE) {
                return C7785t.f33179b;
            }
            if (type == Byte.TYPE) {
                return C7785t.f33180c;
            }
            if (type == Character.TYPE) {
                return C7785t.f33181d;
            }
            if (type == Double.TYPE) {
                return C7785t.f33182e;
            }
            if (type == Float.TYPE) {
                return C7785t.f33183f;
            }
            if (type == Integer.TYPE) {
                return C7785t.f33184g;
            }
            if (type == Long.TYPE) {
                return C7785t.f33185h;
            }
            if (type == Short.TYPE) {
                return C7785t.f33186i;
            }
            if (type == Boolean.class) {
                return C7785t.f33179b.mo28954c();
            }
            if (type == Byte.class) {
                return C7785t.f33180c.mo28954c();
            }
            if (type == Character.class) {
                return C7785t.f33181d.mo28954c();
            }
            if (type == Double.class) {
                return C7785t.f33182e.mo28954c();
            }
            if (type == Float.class) {
                return C7785t.f33183f.mo28954c();
            }
            if (type == Integer.class) {
                return C7785t.f33184g.mo28954c();
            }
            if (type == Long.class) {
                return C7785t.f33185h.mo28954c();
            }
            if (type == Short.class) {
                return C7785t.f33186i.mo28954c();
            }
            if (type == String.class) {
                return C7785t.f33187j.mo28954c();
            }
            if (type == Object.class) {
                return new C7798m(sVar).mo28954c();
            }
            Class<?> g = C7799u.m42769g(type);
            C7755f<?> d = C7801b.m42778d(sVar, type, g);
            if (d != null) {
                return d;
            }
            if (g.isEnum()) {
                return new C7797l(g).mo28954c();
            }
            return null;
        }
    }

    /* renamed from: f.h.a.t$d */
    /* compiled from: StandardJsonAdapters */
    class C7789d extends C7755f<Boolean> {
        C7789d() {
        }

        /* renamed from: d */
        public Boolean mo15563a(C7761k kVar) throws IOException {
            return Boolean.valueOf(kVar.mo28961K());
        }

        public String toString() {
            return "JsonAdapter(Boolean)";
        }
    }

    /* renamed from: f.h.a.t$e */
    /* compiled from: StandardJsonAdapters */
    class C7790e extends C7755f<Byte> {
        C7790e() {
        }

        /* renamed from: d */
        public Byte mo15563a(C7761k kVar) throws IOException {
            return Byte.valueOf((byte) C7785t.m42740a(kVar, "a byte", -128, 255));
        }

        public String toString() {
            return "JsonAdapter(Byte)";
        }
    }

    /* renamed from: f.h.a.t$f */
    /* compiled from: StandardJsonAdapters */
    class C7791f extends C7755f<Character> {
        C7791f() {
        }

        /* renamed from: d */
        public Character mo15563a(C7761k kVar) throws IOException {
            String m0 = kVar.mo28972m0();
            if (m0.length() <= 1) {
                return Character.valueOf(m0.charAt(0));
            }
            throw new C7758h(String.format("Expected %s but was %s at path %s", new Object[]{"a char", '\"' + m0 + '\"', kVar.getPath()}));
        }

        public String toString() {
            return "JsonAdapter(Character)";
        }
    }

    /* renamed from: f.h.a.t$g */
    /* compiled from: StandardJsonAdapters */
    class C7792g extends C7755f<Double> {
        C7792g() {
        }

        /* renamed from: d */
        public Double mo15563a(C7761k kVar) throws IOException {
            return Double.valueOf(kVar.mo28965Q());
        }

        public String toString() {
            return "JsonAdapter(Double)";
        }
    }

    /* renamed from: f.h.a.t$h */
    /* compiled from: StandardJsonAdapters */
    class C7793h extends C7755f<Float> {
        C7793h() {
        }

        /* renamed from: d */
        public Float mo15563a(C7761k kVar) throws IOException {
            float Q = (float) kVar.mo28965Q();
            if (kVar.mo28959H() || !Float.isInfinite(Q)) {
                return Float.valueOf(Q);
            }
            throw new C7758h("JSON forbids NaN and infinities: " + Q + " at path " + kVar.getPath());
        }

        public String toString() {
            return "JsonAdapter(Float)";
        }
    }

    /* renamed from: f.h.a.t$i */
    /* compiled from: StandardJsonAdapters */
    class C7794i extends C7755f<Integer> {
        C7794i() {
        }

        /* renamed from: d */
        public Integer mo15563a(C7761k kVar) throws IOException {
            return Integer.valueOf(kVar.mo28966T());
        }

        public String toString() {
            return "JsonAdapter(Integer)";
        }
    }

    /* renamed from: f.h.a.t$j */
    /* compiled from: StandardJsonAdapters */
    class C7795j extends C7755f<Long> {
        C7795j() {
        }

        /* renamed from: d */
        public Long mo15563a(C7761k kVar) throws IOException {
            return Long.valueOf(kVar.mo28967Y());
        }

        public String toString() {
            return "JsonAdapter(Long)";
        }
    }

    /* renamed from: f.h.a.t$k */
    /* compiled from: StandardJsonAdapters */
    class C7796k extends C7755f<Short> {
        C7796k() {
        }

        /* renamed from: d */
        public Short mo15563a(C7761k kVar) throws IOException {
            return Short.valueOf((short) C7785t.m42740a(kVar, "a short", -32768, 32767));
        }

        public String toString() {
            return "JsonAdapter(Short)";
        }
    }

    /* renamed from: f.h.a.t$l */
    /* compiled from: StandardJsonAdapters */
    static final class C7797l<T extends Enum<T>> extends C7755f<T> {

        /* renamed from: a */
        private final Class<T> f33189a;

        /* renamed from: b */
        private final String[] f33190b;

        /* renamed from: c */
        private final T[] f33191c;

        /* renamed from: d */
        private final C7761k.C7762a f33192d;

        C7797l(Class<T> cls) {
            this.f33189a = cls;
            try {
                T[] tArr = (Enum[]) cls.getEnumConstants();
                this.f33191c = tArr;
                this.f33190b = new String[tArr.length];
                int i = 0;
                while (true) {
                    T[] tArr2 = this.f33191c;
                    if (i < tArr2.length) {
                        T t = tArr2[i];
                        C7754e eVar = (C7754e) cls.getField(t.name()).getAnnotation(C7754e.class);
                        this.f33190b[i] = eVar != null ? eVar.name() : t.name();
                        i++;
                    } else {
                        this.f33192d = C7761k.C7762a.m42667a(this.f33190b);
                        return;
                    }
                }
            } catch (NoSuchFieldException e) {
                throw new AssertionError("Missing field in " + cls.getName(), e);
            }
        }

        /* renamed from: d */
        public T mo15563a(C7761k kVar) throws IOException {
            int H0 = kVar.mo28960H0(this.f33192d);
            if (H0 != -1) {
                return this.f33191c[H0];
            }
            String path = kVar.getPath();
            String m0 = kVar.mo28972m0();
            throw new C7758h("Expected one of " + Arrays.asList(this.f33190b) + " but was " + m0 + " at path " + path);
        }

        public String toString() {
            return "JsonAdapter(" + this.f33189a.getName() + ")";
        }
    }

    /* renamed from: f.h.a.t$m */
    /* compiled from: StandardJsonAdapters */
    static final class C7798m extends C7755f<Object> {

        /* renamed from: a */
        private final C7755f<List> f33193a;

        /* renamed from: b */
        private final C7755f<Map> f33194b;

        /* renamed from: c */
        private final C7755f<String> f33195c;

        /* renamed from: d */
        private final C7755f<Double> f33196d;

        /* renamed from: e */
        private final C7755f<Boolean> f33197e;

        C7798m(C7781s sVar) {
            this.f33193a = sVar.mo29028c(List.class);
            this.f33194b = sVar.mo29028c(Map.class);
            this.f33195c = sVar.mo29028c(String.class);
            this.f33196d = sVar.mo29028c(Double.class);
            this.f33197e = sVar.mo29028c(Boolean.class);
        }

        /* renamed from: a */
        public Object mo15563a(C7761k kVar) throws IOException {
            switch (C7787b.f33188a[kVar.mo28973o0().ordinal()]) {
                case 1:
                    return this.f33193a.mo15563a(kVar);
                case 2:
                    return this.f33194b.mo15563a(kVar);
                case 3:
                    return this.f33195c.mo15563a(kVar);
                case 4:
                    return this.f33196d.mo15563a(kVar);
                case 5:
                    return this.f33197e.mo15563a(kVar);
                case 6:
                    return kVar.mo28971i0();
                default:
                    throw new IllegalStateException("Expected a value but was " + kVar.mo28973o0() + " at path " + kVar.getPath());
            }
        }

        public String toString() {
            return "JsonAdapter(Object)";
        }
    }

    /* renamed from: a */
    static int m42740a(C7761k kVar, String str, int i, int i2) throws IOException {
        int T = kVar.mo28966T();
        if (T >= i && T <= i2) {
            return T;
        }
        throw new C7758h(String.format("Expected %s but was %s at path %s", new Object[]{str, Integer.valueOf(T), kVar.getPath()}));
    }
}
