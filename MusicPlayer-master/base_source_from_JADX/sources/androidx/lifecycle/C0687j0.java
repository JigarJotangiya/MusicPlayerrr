package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.C0703o0;
import androidx.savedstate.C1031b;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* renamed from: androidx.lifecycle.j0 */
/* compiled from: SavedStateViewModelFactory */
public final class C0687j0 extends C0703o0.C0706c {

    /* renamed from: f */
    private static final Class<?>[] f3304f;

    /* renamed from: g */
    private static final Class<?>[] f3305g;

    /* renamed from: a */
    private final Application f3306a;

    /* renamed from: b */
    private final C0703o0.C0704a f3307b;

    /* renamed from: c */
    private final Bundle f3308c;

    /* renamed from: d */
    private final C0697n f3309d;

    /* renamed from: e */
    private final SavedStateRegistry f3310e;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: java.lang.Class<?>[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            java.lang.Class<androidx.lifecycle.i0> r0 = androidx.lifecycle.C0682i0.class
            r1 = 2
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            r3 = 0
            r1[r3] = r2
            r2 = 1
            r1[r2] = r0
            f3304f = r1
            java.lang.Class[] r1 = new java.lang.Class[r2]
            r1[r3] = r0
            f3305g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C0687j0.<clinit>():void");
    }

    @SuppressLint({"LambdaLast"})
    public C0687j0(Application application, C1031b bVar, Bundle bundle) {
        this.f3310e = bVar.mo384K0();
        this.f3309d = bVar.mo390v();
        this.f3308c = bundle;
        this.f3306a = application;
        this.f3307b = C0703o0.C0704a.m4265c(application);
    }

    /* renamed from: d */
    private static <T> Constructor<T> m4232d(Class<T> cls, Class<?>[] clsArr) {
        for (Constructor<T> constructor : cls.getConstructors()) {
            if (Arrays.equals(clsArr, constructor.getParameterTypes())) {
                return constructor;
            }
        }
        return null;
    }

    /* renamed from: a */
    public <T extends C0696m0> T mo4019a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return mo4239c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo4238b(C0696m0 m0Var) {
        SavedStateHandleController.m4170h(m0Var, this.f3310e, this.f3309d);
    }

    /* renamed from: c */
    public <T extends C0696m0> T mo4239c(String str, Class<T> cls) {
        Constructor<T> constructor;
        T t;
        boolean isAssignableFrom = C0653a.class.isAssignableFrom(cls);
        if (isAssignableFrom) {
            constructor = m4232d(cls, f3304f);
        } else {
            constructor = m4232d(cls, f3305g);
        }
        if (constructor == null) {
            return this.f3307b.mo4019a(cls);
        }
        SavedStateHandleController j = SavedStateHandleController.m4171j(this.f3310e, this.f3309d, str, this.f3308c);
        if (isAssignableFrom) {
            try {
                t = (C0696m0) constructor.newInstance(new Object[]{this.f3306a, j.mo4192k()});
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Failed to access " + cls, e);
            } catch (InstantiationException e2) {
                throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
            } catch (InvocationTargetException e3) {
                throw new RuntimeException("An exception happened in constructor of " + cls, e3.getCause());
            }
        } else {
            t = (C0696m0) constructor.newInstance(new Object[]{j.mo4192k()});
        }
        t.mo4255e("androidx.lifecycle.savedstate.vm.tag", j);
        return t;
    }
}
