package p159f.p334h.p335a;

import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Properties;
import p159f.p334h.p335a.p336v.C7801b;

/* renamed from: f.h.a.u */
/* compiled from: Types */
public final class C7799u {
    /* renamed from: a */
    static Type m42763a(Type type) {
        if (type instanceof GenericArrayType) {
            return ((GenericArrayType) type).getGenericComponentType();
        }
        if (type instanceof Class) {
            return ((Class) type).getComponentType();
        }
        return null;
    }

    /* renamed from: b */
    public static GenericArrayType m42764b(Type type) {
        return new C7801b.C7802a(type);
    }

    /* renamed from: c */
    public static Type m42765c(Type type, Class<?> cls) {
        Type h = m42770h(type, cls, Collection.class);
        if (h instanceof WildcardType) {
            h = ((WildcardType) h).getUpperBounds()[0];
        }
        if (h instanceof ParameterizedType) {
            return ((ParameterizedType) h).getActualTypeArguments()[0];
        }
        return Object.class;
    }

    /* renamed from: d */
    public static boolean m42766d(Type type, Type type2) {
        Type[] typeArr;
        Type[] typeArr2;
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            if (type2 instanceof GenericArrayType) {
                return m42766d(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return type.equals(type2);
        } else if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            if (parameterizedType instanceof C7801b.C7803b) {
                typeArr = ((C7801b.C7803b) parameterizedType).f33205i;
            } else {
                typeArr = parameterizedType.getActualTypeArguments();
            }
            if (parameterizedType2 instanceof C7801b.C7803b) {
                typeArr2 = ((C7801b.C7803b) parameterizedType2).f33205i;
            } else {
                typeArr2 = parameterizedType2.getActualTypeArguments();
            }
            if (!m42766d(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) || !parameterizedType.getRawType().equals(parameterizedType2.getRawType()) || !Arrays.equals(typeArr, typeArr2)) {
                return false;
            }
            return true;
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return m42766d(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return m42766d(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
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

    /* renamed from: e */
    public static String m42767e(String str) {
        return str.replace("$", "_") + "JsonAdapter";
    }

    /* renamed from: f */
    static Type m42768f(Type type) {
        Class<?> g = m42769g(type);
        return C7801b.m42787m(type, g, g.getGenericSuperclass());
    }

    /* renamed from: g */
    public static Class<?> m42769g(Type type) {
        String str;
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(m42769g(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return m42769g(((WildcardType) type).getUpperBounds()[0]);
        }
        if (type == null) {
            str = "null";
        } else {
            str = type.getClass().getName();
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + str);
    }

    /* renamed from: h */
    static Type m42770h(Type type, Class<?> cls, Class<?> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return C7801b.m42787m(type, cls, C7801b.m42779e(type, cls, cls2));
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: i */
    static Type[] m42771i(Type type, Class<?> cls) {
        Class<Object> cls2 = Object.class;
        Class<String> cls3 = String.class;
        if (type == Properties.class) {
            return new Type[]{cls3, cls3};
        }
        Type h = m42770h(type, cls, Map.class);
        if (h instanceof ParameterizedType) {
            return ((ParameterizedType) h).getActualTypeArguments();
        }
        return new Type[]{cls2, cls2};
    }

    /* renamed from: j */
    public static WildcardType m42772j(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getUpperBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C7801b.C7804c(typeArr, C7801b.f33200b);
    }

    /* renamed from: k */
    public static WildcardType m42773k(Type type) {
        Type[] typeArr;
        if (type instanceof WildcardType) {
            typeArr = ((WildcardType) type).getLowerBounds();
        } else {
            typeArr = new Type[]{type};
        }
        return new C7801b.C7804c(new Type[]{Object.class}, typeArr);
    }
}
