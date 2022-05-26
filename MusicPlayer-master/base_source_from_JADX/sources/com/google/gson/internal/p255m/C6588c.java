package com.google.gson.internal.p255m;

import com.google.gson.JsonIOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/* renamed from: com.google.gson.internal.m.c */
/* compiled from: UnsafeReflectionAccessor */
final class C6588c extends C6587b {

    /* renamed from: d */
    private static Class f29947d;

    /* renamed from: b */
    private final Object f29948b = m38043d();

    /* renamed from: c */
    private final Field f29949c = m38042c();

    C6588c() {
    }

    /* renamed from: c */
    private static Field m38042c() {
        try {
            return AccessibleObject.class.getDeclaredField("override");
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: d */
    private static Object m38043d() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            f29947d = cls;
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            return declaredField.get((Object) null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public void mo25773b(AccessibleObject accessibleObject) {
        if (!mo25774e(accessibleObject)) {
            try {
                accessibleObject.setAccessible(true);
            } catch (SecurityException e) {
                throw new JsonIOException("Gson couldn't modify fields for " + accessibleObject + "\nand sun.misc.Unsafe not found.\nEither write a custom type adapter, or make fields accessible, or include sun.misc.Unsafe.", e);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo25774e(AccessibleObject accessibleObject) {
        if (!(this.f29948b == null || this.f29949c == null)) {
            try {
                long longValue = ((Long) f29947d.getMethod("objectFieldOffset", new Class[]{Field.class}).invoke(this.f29948b, new Object[]{this.f29949c})).longValue();
                f29947d.getMethod("putBoolean", new Class[]{Object.class, Long.TYPE, Boolean.TYPE}).invoke(this.f29948b, new Object[]{accessibleObject, Long.valueOf(longValue), Boolean.TRUE});
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }
}
