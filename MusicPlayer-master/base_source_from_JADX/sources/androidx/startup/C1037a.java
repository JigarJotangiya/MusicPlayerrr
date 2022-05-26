package androidx.startup;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p082e.p153w.C4233a;

/* renamed from: androidx.startup.a */
/* compiled from: AppInitializer */
public final class C1037a {

    /* renamed from: d */
    private static volatile C1037a f4381d;

    /* renamed from: e */
    private static final Object f4382e = new Object();

    /* renamed from: a */
    final Map<Class<?>, Object> f4383a = new HashMap();

    /* renamed from: b */
    final Set<Class<? extends C1038b<?>>> f4384b = new HashSet();

    /* renamed from: c */
    final Context f4385c;

    C1037a(Context context) {
        this.f4385c = context.getApplicationContext();
    }

    /* renamed from: c */
    public static C1037a m6026c(Context context) {
        if (f4381d == null) {
            synchronized (f4382e) {
                if (f4381d == null) {
                    f4381d = new C1037a(context);
                }
            }
        }
        return f4381d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo5764a() {
        try {
            C4233a.m18619a("Startup");
            Bundle bundle = this.f4385c.getPackageManager().getProviderInfo(new ComponentName(this.f4385c.getPackageName(), InitializationProvider.class.getName()), 128).metaData;
            String string = this.f4385c.getString(C1039c.androidx_startup);
            if (bundle != null) {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, (String) null))) {
                        Class<?> cls = Class.forName(str);
                        if (C1038b.class.isAssignableFrom(cls)) {
                            this.f4384b.add(cls);
                            mo5765b(cls, hashSet);
                        }
                    }
                }
            }
            C4233a.m18620b();
        } catch (PackageManager.NameNotFoundException | ClassNotFoundException e) {
            throw new C1040d(e);
        } catch (Throwable th) {
            C4233a.m18620b();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public <T> T mo5765b(Class<? extends C1038b<?>> cls, Set<Class<?>> set) {
        T t;
        synchronized (f4382e) {
            if (C4233a.m18622d()) {
                try {
                    C4233a.m18619a(cls.getSimpleName());
                } catch (Throwable th) {
                    C4233a.m18620b();
                    throw th;
                }
            }
            if (!set.contains(cls)) {
                if (!this.f4383a.containsKey(cls)) {
                    set.add(cls);
                    C1038b bVar = (C1038b) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                    List<Class<? extends C1038b<?>>> a = bVar.mo5766a();
                    if (!a.isEmpty()) {
                        for (Class next : a) {
                            if (!this.f4383a.containsKey(next)) {
                                mo5765b(next, set);
                            }
                        }
                    }
                    t = bVar.mo5767b(this.f4385c);
                    set.remove(cls);
                    this.f4383a.put(cls, t);
                } else {
                    t = this.f4383a.get(cls);
                }
                C4233a.m18620b();
            } else {
                throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", new Object[]{cls.getName()}));
            }
        }
        return t;
    }
}
