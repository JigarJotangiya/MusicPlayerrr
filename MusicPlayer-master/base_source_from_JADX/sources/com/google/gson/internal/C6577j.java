package com.google.gson.internal;

import java.lang.reflect.Type;

/* renamed from: com.google.gson.internal.j */
/* compiled from: Primitives */
public final class C6577j {
    /* renamed from: a */
    public static boolean m38027a(Type type) {
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    /* renamed from: b */
    public static <T> Class<T> m38028b(Class<T> cls) {
        if (cls == Integer.TYPE) {
            return Integer.class;
        }
        if (cls == Float.TYPE) {
            return Float.class;
        }
        if (cls == Byte.TYPE) {
            return Byte.class;
        }
        if (cls == Double.TYPE) {
            return Double.class;
        }
        if (cls == Long.TYPE) {
            return Long.class;
        }
        if (cls == Character.TYPE) {
            return Character.class;
        }
        if (cls == Boolean.TYPE) {
            return Boolean.class;
        }
        if (cls == Short.TYPE) {
            return Short.class;
        }
        return cls == Void.TYPE ? Void.class : cls;
    }
}
