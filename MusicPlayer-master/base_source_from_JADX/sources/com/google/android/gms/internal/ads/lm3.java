package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.cm3;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
abstract class lm3<T extends cm3> {

    /* renamed from: a */
    private static final Logger f19464a = Logger.getLogger(xl3.class.getName());

    /* renamed from: b */
    private static final String f19465b = "com.google.protobuf.BlazeGeneratedExtensionRegistryLiteLoader";

    lm3() {
    }

    /* renamed from: b */
    static <T extends cm3> T m26789b(Class<T> cls) {
        String str;
        String str2;
        Class<lm3> cls2 = lm3.class;
        ClassLoader classLoader = cls2.getClassLoader();
        if (cls.equals(cm3.class)) {
            str = f19465b;
        } else if (cls.getPackage().equals(cls2.getPackage())) {
            str = String.format("%s.BlazeGenerated%sLoader", new Object[]{cls.getPackage().getName(), cls.getSimpleName()});
        } else {
            throw new IllegalArgumentException(cls.getName());
        }
        try {
            return (cm3) cls.cast(((lm3) Class.forName(str, true, classLoader).getConstructor(new Class[0]).newInstance(new Object[0])).mo19188a());
        } catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        } catch (IllegalAccessException e3) {
            throw new IllegalStateException(e3);
        } catch (InvocationTargetException e4) {
            throw new IllegalStateException(e4);
        } catch (ClassNotFoundException unused) {
            Iterator<S> it = ServiceLoader.load(cls2, classLoader).iterator();
            ArrayList arrayList = new ArrayList();
            while (it.hasNext()) {
                try {
                    arrayList.add(cls.cast(((lm3) it.next()).mo19188a()));
                } catch (ServiceConfigurationError e5) {
                    ServiceConfigurationError serviceConfigurationError = e5;
                    Logger logger = f19464a;
                    Level level = Level.SEVERE;
                    String valueOf = String.valueOf(cls.getSimpleName());
                    if (valueOf.length() != 0) {
                        str2 = "Unable to load ".concat(valueOf);
                    } else {
                        str2 = new String("Unable to load ");
                    }
                    logger.logp(level, "com.google.protobuf.GeneratedExtensionRegistryLoader", "load", str2, serviceConfigurationError);
                }
            }
            if (arrayList.size() == 1) {
                return (cm3) arrayList.get(0);
            }
            if (arrayList.size() == 0) {
                return null;
            }
            try {
                return (cm3) cls.getMethod("combine", new Class[]{Collection.class}).invoke((Object) null, new Object[]{arrayList});
            } catch (NoSuchMethodException e6) {
                throw new IllegalStateException(e6);
            } catch (IllegalAccessException e7) {
                throw new IllegalStateException(e7);
            } catch (InvocationTargetException e8) {
                throw new IllegalStateException(e8);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo19188a();
}
