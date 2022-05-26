package p082e.p109h.p110h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import androidx.core.content.p003d.C0516c;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.h.e */
/* compiled from: TypefaceCompatApi21Impl */
class C3628e extends C3633j {

    /* renamed from: b */
    private static Class<?> f11600b = null;

    /* renamed from: c */
    private static Constructor<?> f11601c = null;

    /* renamed from: d */
    private static Method f11602d = null;

    /* renamed from: e */
    private static Method f11603e = null;

    /* renamed from: f */
    private static boolean f11604f = false;

    C3628e() {
    }

    /* renamed from: k */
    private static boolean m15626k(Object obj, String str, int i, boolean z) {
        m15629n();
        try {
            return ((Boolean) f11602d.invoke(obj, new Object[]{str, Integer.valueOf(i), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: l */
    private static Typeface mo12889l(Object obj) {
        m15629n();
        try {
            Object newInstance = Array.newInstance(f11600b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f11603e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private File m15628m(ParcelFileDescriptor parcelFileDescriptor) {
        try {
            String readlink = Os.readlink("/proc/self/fd/" + parcelFileDescriptor.getFd());
            if (OsConstants.S_ISREG(Os.stat(readlink).st_mode)) {
                return new File(readlink);
            }
        } catch (ErrnoException unused) {
        }
        return null;
    }

    /* renamed from: n */
    private static void m15629n() {
        Method method;
        Class<?> cls;
        Method method2;
        if (!f11604f) {
            f11604f = true;
            Constructor<?> constructor = null;
            try {
                cls = Class.forName("android.graphics.FontFamily");
                Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
                method = cls.getMethod("addFontWeightStyle", new Class[]{String.class, Integer.TYPE, Boolean.TYPE});
                method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
                constructor = constructor2;
            } catch (ClassNotFoundException | NoSuchMethodException e) {
                Log.e("TypefaceCompatApi21Impl", e.getClass().getName(), e);
                method2 = null;
                cls = null;
                method = null;
            }
            f11601c = constructor;
            f11600b = cls;
            f11602d = method;
            f11603e = method2;
        }
    }

    /* renamed from: o */
    private static Object m15630o() {
        m15629n();
        try {
            return f11601c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public Typeface mo12885b(Context context, C0516c.C0518b bVar, Resources resources, int i) {
        Object o = m15630o();
        C0516c.C0519c[] a = bVar.mo3276a();
        int length = a.length;
        int i2 = 0;
        while (i2 < length) {
            C0516c.C0519c cVar = a[i2];
            File e = C3637k.m15687e(context);
            if (e == null) {
                return null;
            }
            try {
                if (!C3637k.m15685c(e, resources, cVar.mo3278b())) {
                    e.delete();
                    return null;
                } else if (!m15626k(o, e.getPath(), cVar.mo3281e(), cVar.mo3282f())) {
                    return null;
                } else {
                    e.delete();
                    i2++;
                }
            } catch (RuntimeException unused) {
                return null;
            } finally {
                e.delete();
            }
        }
        return mo12889l(o);
    }

    /* renamed from: c */
    public Typeface mo12886c(Context context, CancellationSignal cancellationSignal, C3670f.C3672b[] bVarArr, int i) {
        FileInputStream fileInputStream;
        if (bVarArr.length < 1) {
            return null;
        }
        C3670f.C3672b h = mo12897h(bVarArr, i);
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo12949d(), "r", cancellationSignal);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            try {
                File m = m15628m(openFileDescriptor);
                if (m != null) {
                    if (m.canRead()) {
                        Typeface createFromFile = Typeface.createFromFile(m);
                        if (openFileDescriptor != null) {
                            openFileDescriptor.close();
                        }
                        return createFromFile;
                    }
                }
                fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
                Typeface d = super.mo12896d(context, fileInputStream);
                fileInputStream.close();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return d;
            } catch (Throwable th) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }
}
