package p082e.p126k.p129c.p131j;

import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* renamed from: e.k.c.j.w */
/* compiled from: FieldType */
public enum C4038w {
    DOUBLE(0, r4, r8),
    FLOAT(1, r4, r9),
    INT64(2, r4, r5),
    UINT64(3, r4, r5),
    INT32(4, r4, r11),
    FIXED64(5, r4, r10),
    FIXED32(6, r4, r11),
    BOOL(7, r4, r12),
    STRING(8, r4, r13),
    MESSAGE(9, r4, r14),
    BYTES(10, r4, r15),
    UINT32(11, r4, r11),
    ENUM(12, r4, r16),
    SFIXED32(13, r4, r11),
    SFIXED64(14, r4, r10),
    SINT32(15, r4, r11),
    SINT64(16, r4, r10),
    GROUP(17, r4, r14),
    DOUBLE_LIST(18, r4, r8),
    FLOAT_LIST(19, r4, r9),
    INT64_LIST(20, r4, r5),
    UINT64_LIST(21, r4, r5),
    INT32_LIST(22, r4, r11),
    FIXED64_LIST(23, r4, r10),
    FIXED32_LIST(24, r4, r11),
    BOOL_LIST(25, r4, r12),
    STRING_LIST(26, r4, r13),
    MESSAGE_LIST(27, r4, r14),
    BYTES_LIST(28, r4, r15),
    UINT32_LIST(29, r4, r11),
    ENUM_LIST(30, r4, r16),
    SFIXED32_LIST(31, r4, r11),
    SFIXED64_LIST(32, r4, r10),
    SINT32_LIST(33, r4, r11),
    SINT64_LIST(34, r4, r10),
    DOUBLE_LIST_PACKED(35, r4, r8),
    FLOAT_LIST_PACKED(36, r4, r9),
    INT64_LIST_PACKED(37, r4, r5),
    UINT64_LIST_PACKED(38, r4, r5),
    INT32_LIST_PACKED(39, r4, r11),
    FIXED64_LIST_PACKED(40, r4, r10),
    FIXED32_LIST_PACKED(41, r4, r11),
    BOOL_LIST_PACKED(42, r4, r12),
    UINT32_LIST_PACKED(43, r4, r11),
    ENUM_LIST_PACKED(44, r4, r16),
    SFIXED32_LIST_PACKED(45, r4, r11),
    SFIXED64_LIST_PACKED(46, r4, r8),
    SINT32_LIST_PACKED(47, r4, C3915d0.INT),
    SINT64_LIST_PACKED(48, r4, r8),
    GROUP_LIST(49, r7, r14),
    MAP(50, C4040b.MAP, C3915d0.VOID);
    

    /* renamed from: g */
    private static final C4038w[] f12210g = null;

    /* renamed from: h */
    private static final Type[] f12211h = null;
    private final C4040b collection;
    private final Class<?> elementType;

    /* renamed from: id */
    private final int f12213id;
    private final C3915d0 javaType;
    private final boolean primitiveScalar;

    /* renamed from: e.k.c.j.w$a */
    /* compiled from: FieldType */
    static /* synthetic */ class C4039a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12214a = null;

        /* renamed from: b */
        static final /* synthetic */ int[] f12215b = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(15:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|20) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        static {
            /*
                e.k.c.j.d0[] r0 = p082e.p126k.p129c.p131j.C3915d0.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f12215b = r0
                r1 = 1
                e.k.c.j.d0 r2 = p082e.p126k.p129c.p131j.C3915d0.BYTE_STRING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f12215b     // Catch:{ NoSuchFieldError -> 0x001d }
                e.k.c.j.d0 r3 = p082e.p126k.p129c.p131j.C3915d0.MESSAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f12215b     // Catch:{ NoSuchFieldError -> 0x0028 }
                e.k.c.j.d0 r4 = p082e.p126k.p129c.p131j.C3915d0.STRING     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                e.k.c.j.w$b[] r3 = p082e.p126k.p129c.p131j.C4038w.C4040b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f12214a = r3
                e.k.c.j.w$b r4 = p082e.p126k.p129c.p131j.C4038w.C4040b.MAP     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f12214a     // Catch:{ NoSuchFieldError -> 0x0043 }
                e.k.c.j.w$b r3 = p082e.p126k.p129c.p131j.C4038w.C4040b.VECTOR     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f12214a     // Catch:{ NoSuchFieldError -> 0x004d }
                e.k.c.j.w$b r1 = p082e.p126k.p129c.p131j.C4038w.C4040b.SCALAR     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4038w.C4039a.<clinit>():void");
        }
    }

    /* renamed from: e.k.c.j.w$b */
    /* compiled from: FieldType */
    enum C4040b {
        SCALAR(false),
        VECTOR(true),
        PACKED_VECTOR(true),
        MAP(false);
        
        private final boolean isList;

        private C4040b(boolean z) {
            this.isList = z;
        }

        public boolean isList() {
            return this.isList;
        }
    }

    static {
        int i;
        f12211h = new Type[0];
        C4038w[] values = values();
        f12210g = new C4038w[values.length];
        for (C4038w wVar : values) {
            f12210g[wVar.f12213id] = wVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        r5 = p082e.p126k.p129c.p131j.C4038w.C4039a.f12215b[r6.ordinal()];
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C4038w(int r4, p082e.p126k.p129c.p131j.C4038w.C4040b r5, p082e.p126k.p129c.p131j.C3915d0 r6) {
        /*
            r1 = this;
            r1.<init>(r2, r3)
            r1.f12213id = r4
            r1.collection = r5
            r1.javaType = r6
            int[] r2 = p082e.p126k.p129c.p131j.C4038w.C4039a.f12214a
            int r3 = r5.ordinal()
            r2 = r2[r3]
            r3 = 2
            r4 = 1
            if (r2 == r4) goto L_0x0022
            if (r2 == r3) goto L_0x001b
            r2 = 0
            r1.elementType = r2
            goto L_0x0028
        L_0x001b:
            java.lang.Class r2 = r6.getBoxedType()
            r1.elementType = r2
            goto L_0x0028
        L_0x0022:
            java.lang.Class r2 = r6.getBoxedType()
            r1.elementType = r2
        L_0x0028:
            r2 = 0
            e.k.c.j.w$b r0 = p082e.p126k.p129c.p131j.C4038w.C4040b.SCALAR
            if (r5 != r0) goto L_0x003d
            int[] r5 = p082e.p126k.p129c.p131j.C4038w.C4039a.f12215b
            int r6 = r6.ordinal()
            r5 = r5[r6]
            if (r5 == r4) goto L_0x003d
            if (r5 == r3) goto L_0x003d
            r3 = 3
            if (r5 == r3) goto L_0x003d
            goto L_0x003e
        L_0x003d:
            r4 = 0
        L_0x003e:
            r1.primitiveScalar = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C4038w.<init>(java.lang.String, int, int, e.k.c.j.w$b, e.k.c.j.d0):void");
    }

    /* renamed from: c */
    private static Type m17884c(Class<?> cls) {
        for (Type type : cls.getGenericInterfaces()) {
            if (type instanceof ParameterizedType) {
                if (List.class.isAssignableFrom((Class) ((ParameterizedType) type).getRawType())) {
                    return type;
                }
            }
        }
        Type genericSuperclass = cls.getGenericSuperclass();
        if (!(genericSuperclass instanceof ParameterizedType)) {
            return null;
        }
        if (List.class.isAssignableFrom((Class) ((ParameterizedType) genericSuperclass).getRawType())) {
            return genericSuperclass;
        }
        return null;
    }

    /* renamed from: d */
    private static Type m17885d(Class<?> cls, Type[] typeArr) {
        Class<? super Object> cls2;
        boolean z;
        while (true) {
            int i = 0;
            Class<? super Object> cls3 = cls;
            if (cls3 != List.class) {
                Type c = m17884c(cls3);
                if (!(c instanceof ParameterizedType)) {
                    typeArr = f12211h;
                    Class<? super Object>[] interfaces = cls3.getInterfaces();
                    int length = interfaces.length;
                    while (true) {
                        if (i >= length) {
                            cls2 = cls3.getSuperclass();
                            break;
                        }
                        Class<? super Object> cls4 = interfaces[i];
                        if (List.class.isAssignableFrom(cls4)) {
                            cls2 = cls4;
                            break;
                        }
                        i++;
                    }
                } else {
                    ParameterizedType parameterizedType = (ParameterizedType) c;
                    Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                    for (int i2 = 0; i2 < actualTypeArguments.length; i2++) {
                        Type type = actualTypeArguments[i2];
                        if (type instanceof TypeVariable) {
                            TypeVariable[] typeParameters = cls3.getTypeParameters();
                            if (typeArr.length == typeParameters.length) {
                                int i3 = 0;
                                while (true) {
                                    if (i3 >= typeParameters.length) {
                                        z = false;
                                        break;
                                    } else if (type == typeParameters[i3]) {
                                        actualTypeArguments[i2] = typeArr[i3];
                                        z = true;
                                        break;
                                    } else {
                                        i3++;
                                    }
                                }
                                if (!z) {
                                    throw new RuntimeException("Unable to find replacement for " + type);
                                }
                            } else {
                                throw new RuntimeException("Type array mismatch");
                            }
                        }
                    }
                    typeArr = actualTypeArguments;
                    cls2 = (Class) parameterizedType.getRawType();
                }
                cls3 = cls2;
            } else if (typeArr.length == 1) {
                return typeArr[0];
            } else {
                throw new RuntimeException("Unable to identify parameter type for List<T>");
            }
        }
    }

    public static C4038w forId(int i) {
        if (i < 0) {
            return null;
        }
        C4038w[] wVarArr = f12210g;
        if (i >= wVarArr.length) {
            return null;
        }
        return wVarArr[i];
    }

    /* renamed from: h */
    private boolean m17886h(Field field) {
        Class<?> type = field.getType();
        if (!this.javaType.getType().isAssignableFrom(type)) {
            return false;
        }
        Type[] typeArr = f12211h;
        if (field.getGenericType() instanceof ParameterizedType) {
            typeArr = ((ParameterizedType) field.getGenericType()).getActualTypeArguments();
        }
        Type d = m17885d(type, typeArr);
        if (!(d instanceof Class)) {
            return true;
        }
        return this.elementType.isAssignableFrom((Class) d);
    }

    public C3915d0 getJavaType() {
        return this.javaType;
    }

    /* renamed from: id */
    public int mo14057id() {
        return this.f12213id;
    }

    public boolean isList() {
        return this.collection.isList();
    }

    public boolean isMap() {
        return this.collection == C4040b.MAP;
    }

    public boolean isPacked() {
        return C4040b.PACKED_VECTOR.equals(this.collection);
    }

    public boolean isPrimitiveScalar() {
        return this.primitiveScalar;
    }

    public boolean isScalar() {
        return this.collection == C4040b.SCALAR;
    }

    public boolean isValidForField(Field field) {
        if (C4040b.VECTOR.equals(this.collection)) {
            return m17886h(field);
        }
        return this.javaType.getType().isAssignableFrom(field.getType());
    }
}
