package androidx.fragment.app;

import androidx.fragment.app.Fragment;
import p082e.p098e.C3478g;

/* renamed from: androidx.fragment.app.f */
/* compiled from: FragmentFactory */
public class C0597f {

    /* renamed from: a */
    private static final C3478g<String, Class<?>> f3060a = new C3478g<>();

    /* renamed from: b */
    static boolean m3792b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(m3793c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: c */
    private static Class<?> m3793c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C3478g<String, Class<?>> gVar = f3060a;
        Class<?> cls = gVar.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        gVar.put(str, cls2);
        return cls2;
    }

    /* renamed from: d */
    public static Class<? extends Fragment> m3794d(ClassLoader classLoader, String str) {
        try {
            return m3793c(classLoader, str);
        } catch (ClassNotFoundException e) {
            throw new Fragment.C0576d("Unable to instantiate fragment " + str + ": make sure class name exists", e);
        } catch (ClassCastException e2) {
            throw new Fragment.C0576d("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e2);
        }
    }

    /* renamed from: a */
    public Fragment mo3881a(ClassLoader classLoader, String str) {
        throw null;
    }
}
