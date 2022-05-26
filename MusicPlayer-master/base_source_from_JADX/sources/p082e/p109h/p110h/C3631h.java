package p082e.p109h.p110h;

import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* renamed from: e.h.h.h */
/* compiled from: TypefaceCompatApi28Impl */
public class C3631h extends C3630g {
    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo12889l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f11609g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f11615m.invoke((Object) null, new Object[]{newInstance, "sans-serif", -1, -1});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo12893x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), String.class, cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }
}
