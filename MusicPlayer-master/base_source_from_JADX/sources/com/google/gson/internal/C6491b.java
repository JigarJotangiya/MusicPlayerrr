package com.google.gson.internal;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* renamed from: com.google.gson.internal.b */
/* compiled from: $Gson$Types */
public final class C6491b {

    /* renamed from: a */
    static final Type[] f29771a = new Type[0];

    /* renamed from: com.google.gson.internal.b$a */
    /* compiled from: $Gson$Types */
    private static final class C6492a implements GenericArrayType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type componentType;

        public C6492a(Type type) {
            this.componentType = C6491b.m37869b(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && C6491b.m37873f(this, (GenericArrayType) obj);
        }

        public Type getGenericComponentType() {
            return this.componentType;
        }

        public int hashCode() {
            return this.componentType.hashCode();
        }

        public String toString() {
            return C6491b.m37888u(this.componentType) + "[]";
        }
    }

    /* renamed from: com.google.gson.internal.b$b */
    /* compiled from: $Gson$Types */
    private static final class C6493b implements ParameterizedType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type ownerType;
        private final Type rawType;
        private final Type[] typeArguments;

        public C6493b(Type type, Type type2, Type... typeArr) {
            Type type3;
            if (type2 instanceof Class) {
                Class cls = (Class) type2;
                boolean z = true;
                boolean z2 = Modifier.isStatic(cls.getModifiers()) || cls.getEnclosingClass() == null;
                if (type == null && !z2) {
                    z = false;
                }
                C6490a.m37866a(z);
            }
            if (type == null) {
                type3 = null;
            } else {
                type3 = C6491b.m37869b(type);
            }
            this.ownerType = type3;
            this.rawType = C6491b.m37869b(type2);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.typeArguments = typeArr2;
            int length = typeArr2.length;
            for (int i = 0; i < length; i++) {
                C6490a.m37867b(this.typeArguments[i]);
                C6491b.m37870c(this.typeArguments[i]);
                Type[] typeArr3 = this.typeArguments;
                typeArr3[i] = C6491b.m37869b(typeArr3[i]);
            }
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && C6491b.m37873f(this, (ParameterizedType) obj);
        }

        public Type[] getActualTypeArguments() {
            return (Type[]) this.typeArguments.clone();
        }

        public Type getOwnerType() {
            return this.ownerType;
        }

        public Type getRawType() {
            return this.rawType;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.typeArguments) ^ this.rawType.hashCode()) ^ C6491b.m37880m(this.ownerType);
        }

        public String toString() {
            int length = this.typeArguments.length;
            if (length == 0) {
                return C6491b.m37888u(this.rawType);
            }
            StringBuilder sb = new StringBuilder((length + 1) * 30);
            sb.append(C6491b.m37888u(this.rawType));
            sb.append("<");
            sb.append(C6491b.m37888u(this.typeArguments[0]));
            for (int i = 1; i < length; i++) {
                sb.append(", ");
                sb.append(C6491b.m37888u(this.typeArguments[i]));
            }
            sb.append(">");
            return sb.toString();
        }
    }

    /* renamed from: com.google.gson.internal.b$c */
    /* compiled from: $Gson$Types */
    private static final class C6494c implements WildcardType, Serializable {
        private static final long serialVersionUID = 0;
        private final Type lowerBound;
        private final Type upperBound;

        public C6494c(Type[] typeArr, Type[] typeArr2) {
            Class<Object> cls = Object.class;
            boolean z = true;
            C6490a.m37866a(typeArr2.length <= 1);
            C6490a.m37866a(typeArr.length == 1);
            if (typeArr2.length == 1) {
                C6490a.m37867b(typeArr2[0]);
                C6491b.m37870c(typeArr2[0]);
                C6490a.m37866a(typeArr[0] != cls ? false : z);
                this.lowerBound = C6491b.m37869b(typeArr2[0]);
                this.upperBound = cls;
                return;
            }
            C6490a.m37867b(typeArr[0]);
            C6491b.m37870c(typeArr[0]);
            this.lowerBound = null;
            this.upperBound = C6491b.m37869b(typeArr[0]);
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && C6491b.m37873f(this, (WildcardType) obj);
        }

        public Type[] getLowerBounds() {
            Type type = this.lowerBound;
            if (type == null) {
                return C6491b.f29771a;
            }
            return new Type[]{type};
        }

        public Type[] getUpperBounds() {
            return new Type[]{this.upperBound};
        }

        public int hashCode() {
            Type type = this.lowerBound;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.upperBound.hashCode() + 31);
        }

        public String toString() {
            if (this.lowerBound != null) {
                return "? super " + C6491b.m37888u(this.lowerBound);
            } else if (this.upperBound == Object.class) {
                return "?";
            } else {
                return "? extends " + C6491b.m37888u(this.upperBound);
            }
        }
    }

    /* renamed from: a */
    public static GenericArrayType m37868a(Type type) {
        return new C6492a(type);
    }

    /* renamed from: b */
    public static Type m37869b(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new C6492a(m37869b(cls.getComponentType())) : cls;
        } else if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new C6493b(parameterizedType.getOwnerType(), parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            return new C6492a(((GenericArrayType) type).getGenericComponentType());
        } else {
            if (!(type instanceof WildcardType)) {
                return type;
            }
            WildcardType wildcardType = (WildcardType) type;
            return new C6494c(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
        }
    }

    /* renamed from: c */
    static void m37870c(Type type) {
        C6490a.m37866a(!(type instanceof Class) || !((Class) type).isPrimitive());
    }

    /* renamed from: d */
    private static Class<?> m37871d(TypeVariable<?> typeVariable) {
        Object genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    /* renamed from: e */
    static boolean m37872e(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    /* renamed from: f */
    public static boolean m37873f(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (!m37872e(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments())) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m37873f(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            if (!Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) || !Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds())) {
                return false;
            }
            return true;
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            if (typeVariable.getGenericDeclaration() != typeVariable2.getGenericDeclaration() || !typeVariable.getName().equals(typeVariable2.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: g */
    public static Type m37874g(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        return ((Class) type).getComponentType();
    }

    /* renamed from: h */
    public static Type m37875h(Type type, Class<?> cls) {
        Type l = m37879l(type, cls, Collection.class);
        if (l instanceof WildcardType) {
            l = ((WildcardType) l).getUpperBounds()[0];
        }
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: i */
    static Type m37876i(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i = 0; i < length; i++) {
                if (interfaces[i] == cls2) {
                    return cls.getGenericInterfaces()[i];
                }
                if (cls2.isAssignableFrom(interfaces[i])) {
                    return m37876i(cls.getGenericInterfaces()[i], interfaces[i], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<? super Object> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return m37876i(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    /* renamed from: j */
    public static Type[] m37877j(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type l = m37879l(type, cls, Map.class);
        if (l instanceof ParameterizedType) {
            return ((ParameterizedType) l).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: k */
    public static Class<?> m37878k(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            C6490a.m37866a(rawType instanceof Class);
            return (Class) rawType;
        } else if (type instanceof GenericArrayType) {
            return Array.newInstance(m37878k(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        } else {
            if (type instanceof TypeVariable) {
                return Object.class;
            }
            if (type instanceof WildcardType) {
                return m37878k(((WildcardType) type).getUpperBounds()[0]);
            }
            if (type == null) {
                str = "null";
            } else {
                str = type.getClass().getName();
            }
            throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
        }
    }

    /* renamed from: l */
    static Type m37879l(Type type, Class<?> cls, Class<?> cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        C6490a.m37866a(cls2.isAssignableFrom(cls));
        return m37883p(type, cls, m37876i(type, cls, cls2));
    }

    /* renamed from: m */
    static int m37880m(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    /* renamed from: n */
    private static int m37881n(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (obj.equals(objArr[i])) {
                return i;
            }
        }
        throw new NoSuchElementException();
    }

    /* renamed from: o */
    public static ParameterizedType m37882o(Type type, Type type2, Type... typeArr) {
        return new C6493b(type, type2, typeArr);
    }

    /* renamed from: p */
    public static Type m37883p(Type type, Class<?> cls, Type type2) {
        return m37884q(type, cls, type2, new HashMap());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: java.lang.reflect.Type[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Class} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v16, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v17, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v19, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v20, resolved type: java.lang.reflect.WildcardType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v21, resolved type: java.lang.reflect.ParameterizedType} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v22, resolved type: java.lang.reflect.GenericArrayType} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.reflect.Type m37884q(java.lang.reflect.Type r9, java.lang.Class<?> r10, java.lang.reflect.Type r11, java.util.Map<java.lang.reflect.TypeVariable<?>, java.lang.reflect.Type> r12) {
        /*
            r0 = 0
        L_0x0001:
            boolean r1 = r11 instanceof java.lang.reflect.TypeVariable
            if (r1 == 0) goto L_0x0027
            r1 = r11
            java.lang.reflect.TypeVariable r1 = (java.lang.reflect.TypeVariable) r1
            java.lang.Object r2 = r12.get(r1)
            java.lang.reflect.Type r2 = (java.lang.reflect.Type) r2
            if (r2 == 0) goto L_0x0017
            java.lang.Class r9 = java.lang.Void.TYPE
            if (r2 != r9) goto L_0x0015
            goto L_0x0016
        L_0x0015:
            r11 = r2
        L_0x0016:
            return r11
        L_0x0017:
            java.lang.Class r11 = java.lang.Void.TYPE
            r12.put(r1, r11)
            if (r0 != 0) goto L_0x001f
            r0 = r1
        L_0x001f:
            java.lang.reflect.Type r11 = m37885r(r9, r10, r1)
            if (r11 != r1) goto L_0x0001
            goto L_0x00dc
        L_0x0027:
            boolean r1 = r11 instanceof java.lang.Class
            if (r1 == 0) goto L_0x004c
            r1 = r11
            java.lang.Class r1 = (java.lang.Class) r1
            boolean r2 = r1.isArray()
            if (r2 == 0) goto L_0x004c
            java.lang.Class r11 = r1.getComponentType()
            java.lang.reflect.Type r9 = m37884q(r9, r10, r11, r12)
            boolean r10 = m37872e(r11, r9)
            if (r10 == 0) goto L_0x0045
            r11 = r1
            goto L_0x00dc
        L_0x0045:
            java.lang.reflect.GenericArrayType r9 = m37868a(r9)
        L_0x0049:
            r11 = r9
            goto L_0x00dc
        L_0x004c:
            boolean r1 = r11 instanceof java.lang.reflect.GenericArrayType
            if (r1 == 0) goto L_0x0067
            java.lang.reflect.GenericArrayType r11 = (java.lang.reflect.GenericArrayType) r11
            java.lang.reflect.Type r1 = r11.getGenericComponentType()
            java.lang.reflect.Type r9 = m37884q(r9, r10, r1, r12)
            boolean r10 = m37872e(r1, r9)
            if (r10 == 0) goto L_0x0062
            goto L_0x00dc
        L_0x0062:
            java.lang.reflect.GenericArrayType r9 = m37868a(r9)
            goto L_0x0049
        L_0x0067:
            boolean r1 = r11 instanceof java.lang.reflect.ParameterizedType
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x00ab
            java.lang.reflect.ParameterizedType r11 = (java.lang.reflect.ParameterizedType) r11
            java.lang.reflect.Type r1 = r11.getOwnerType()
            java.lang.reflect.Type r4 = m37884q(r9, r10, r1, r12)
            boolean r1 = m37872e(r4, r1)
            r1 = r1 ^ r3
            java.lang.reflect.Type[] r5 = r11.getActualTypeArguments()
            int r6 = r5.length
        L_0x0081:
            if (r2 >= r6) goto L_0x00a0
            r7 = r5[r2]
            java.lang.reflect.Type r7 = m37884q(r9, r10, r7, r12)
            r8 = r5[r2]
            boolean r8 = m37872e(r7, r8)
            if (r8 != 0) goto L_0x009d
            if (r1 != 0) goto L_0x009b
            java.lang.Object r1 = r5.clone()
            r5 = r1
            java.lang.reflect.Type[] r5 = (java.lang.reflect.Type[]) r5
            r1 = 1
        L_0x009b:
            r5[r2] = r7
        L_0x009d:
            int r2 = r2 + 1
            goto L_0x0081
        L_0x00a0:
            if (r1 == 0) goto L_0x00dc
            java.lang.reflect.Type r9 = r11.getRawType()
            java.lang.reflect.ParameterizedType r9 = m37882o(r4, r9, r5)
            goto L_0x0049
        L_0x00ab:
            boolean r1 = r11 instanceof java.lang.reflect.WildcardType
            if (r1 == 0) goto L_0x00dc
            java.lang.reflect.WildcardType r11 = (java.lang.reflect.WildcardType) r11
            java.lang.reflect.Type[] r1 = r11.getLowerBounds()
            java.lang.reflect.Type[] r4 = r11.getUpperBounds()
            int r5 = r1.length
            if (r5 != r3) goto L_0x00cb
            r3 = r1[r2]
            java.lang.reflect.Type r9 = m37884q(r9, r10, r3, r12)
            r10 = r1[r2]
            if (r9 == r10) goto L_0x00dc
            java.lang.reflect.WildcardType r11 = m37887t(r9)
            goto L_0x00dc
        L_0x00cb:
            int r1 = r4.length
            if (r1 != r3) goto L_0x00dc
            r1 = r4[r2]
            java.lang.reflect.Type r9 = m37884q(r9, r10, r1, r12)     // Catch:{ all -> 0x00e2 }
            r10 = r4[r2]
            if (r9 == r10) goto L_0x00dc
            java.lang.reflect.WildcardType r11 = m37886s(r9)
        L_0x00dc:
            if (r0 == 0) goto L_0x00e1
            r12.put(r0, r11)
        L_0x00e1:
            return r11
        L_0x00e2:
            r9 = move-exception
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C6491b.m37884q(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    /* renamed from: r */
    static Type m37885r(Type type, Class<?> cls, TypeVariable<?> typeVariable) {
        Class<?> d = m37871d(typeVariable);
        if (d == null) {
            return typeVariable;
        }
        Type i = m37876i(type, cls, d);
        if (!(i instanceof ParameterizedType)) {
            return typeVariable;
        }
        return ((ParameterizedType) i).getActualTypeArguments()[m37881n(d.getTypeParameters(), typeVariable)];
    }

    /* renamed from: s */
    public static WildcardType m37886s(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C6494c(typeArr, f29771a);
    }

    /* renamed from: t */
    public static WildcardType m37887t(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C6494c(new Type[]{Object.class}, typeArr);
    }

    /* renamed from: u */
    public static String m37888u(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
