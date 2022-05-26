package p082e.p109h.p110h;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p003d.C0516c;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import p082e.p098e.C3478g;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.h.f */
/* compiled from: TypefaceCompatApi24Impl */
class C3629f extends C3633j {

    /* renamed from: b */
    private static final Class<?> f11605b;

    /* renamed from: c */
    private static final Constructor<?> f11606c;

    /* renamed from: d */
    private static final Method f11607d;

    /* renamed from: e */
    private static final Method f11608e;

    static {
        Method method;
        Method method2;
        Class<?> cls;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(new Class[0]);
            Class cls2 = Integer.TYPE;
            method = cls.getMethod("addFontWeightStyle", new Class[]{ByteBuffer.class, cls2, List.class, cls2, Boolean.TYPE});
            method2 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass()});
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi24Impl", e.getClass().getName(), e);
            cls = null;
            method2 = null;
            method = null;
        }
        f11606c = constructor;
        f11605b = cls;
        f11607d = method;
        f11608e = method2;
    }

    C3629f() {
    }

    /* renamed from: k */
    private static boolean m15633k(Object obj, ByteBuffer byteBuffer, int i, int i2, boolean z) {
        try {
            return ((Boolean) f11607d.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Boolean.valueOf(z)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: l */
    private static Typeface m15634l(Object obj) {
        try {
            Object newInstance = Array.newInstance(f11605b, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) f11608e.invoke((Object) null, new Object[]{newInstance});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m15635m() {
        Method method = f11607d;
        if (method == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
        }
        return method != null;
    }

    /* renamed from: n */
    private static Object m15636n() {
        try {
            return f11606c.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public Typeface mo12885b(Context context, C0516c.C0518b bVar, Resources resources, int i) {
        Object n = m15636n();
        if (n == null) {
            return null;
        }
        for (C0516c.C0519c cVar : bVar.mo3276a()) {
            ByteBuffer b = C3637k.m15684b(context, resources, cVar.mo3278b());
            if (b == null || !m15633k(n, b, cVar.mo3279c(), cVar.mo3281e(), cVar.mo3282f())) {
                return null;
            }
        }
        return m15634l(n);
    }

    /* renamed from: c */
    public Typeface mo12886c(Context context, CancellationSignal cancellationSignal, C3670f.C3672b[] bVarArr, int i) {
        Object n = m15636n();
        if (n == null) {
            return null;
        }
        C3478g gVar = new C3478g();
        for (C3670f.C3672b bVar : bVarArr) {
            Uri d = bVar.mo12949d();
            ByteBuffer byteBuffer = (ByteBuffer) gVar.get(d);
            if (byteBuffer == null) {
                byteBuffer = C3637k.m15688f(context, cancellationSignal, d);
                gVar.put(d, byteBuffer);
            }
            if (byteBuffer == null || !m15633k(n, byteBuffer, bVar.mo12948c(), bVar.mo12950e(), bVar.mo12951f())) {
                return null;
            }
        }
        Typeface l = m15634l(n);
        if (l == null) {
            return null;
        }
        return Typeface.create(l, i);
    }
}
