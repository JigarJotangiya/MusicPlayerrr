package p082e.p109h.p110h;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.p003d.C0516c;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.h.g */
/* compiled from: TypefaceCompatApi26Impl */
public class C3630g extends C3628e {

    /* renamed from: g */
    protected final Class<?> f11609g;

    /* renamed from: h */
    protected final Constructor<?> f11610h;

    /* renamed from: i */
    protected final Method f11611i;

    /* renamed from: j */
    protected final Method f11612j;

    /* renamed from: k */
    protected final Method f11613k;

    /* renamed from: l */
    protected final Method f11614l;

    /* renamed from: m */
    protected final Method f11615m;

    public C3630g() {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Constructor<?> constructor;
        Method method5;
        Class<?> cls = null;
        try {
            Class<?> y = mo12894y();
            constructor = mo12895z(y);
            method4 = mo12891v(y);
            method3 = mo12892w(y);
            method2 = mo12887A(y);
            method = mo12890u(y);
            Class<?> cls2 = y;
            method5 = mo12893x(y);
            cls = cls2;
        } catch (ClassNotFoundException | NoSuchMethodException e) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e.getClass().getName(), e);
            method5 = null;
            constructor = null;
            method4 = null;
            method3 = null;
            method2 = null;
            method = null;
        }
        this.f11609g = cls;
        this.f11610h = constructor;
        this.f11611i = method4;
        this.f11612j = method3;
        this.f11613k = method2;
        this.f11614l = method;
        this.f11615m = method5;
    }

    /* renamed from: o */
    private Object m15639o() {
        try {
            return this.f11610h.newInstance(new Object[0]);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: p */
    private void m15640p(Object obj) {
        try {
            this.f11614l.invoke(obj, new Object[0]);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: q */
    private boolean m15641q(Context context, Object obj, String str, int i, int i2, int i3, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f11611i.invoke(obj, new Object[]{context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), fontVariationAxisArr})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: r */
    private boolean m15642r(Object obj, ByteBuffer byteBuffer, int i, int i2, int i3) {
        try {
            return ((Boolean) this.f11612j.invoke(obj, new Object[]{byteBuffer, Integer.valueOf(i), null, Integer.valueOf(i2), Integer.valueOf(i3)})).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: s */
    private boolean m15643s(Object obj) {
        try {
            return ((Boolean) this.f11613k.invoke(obj, new Object[0])).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    /* renamed from: t */
    private boolean m15644t() {
        if (this.f11611i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f11611i != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public Method mo12887A(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("freeze", new Class[0]);
    }

    /* renamed from: b */
    public Typeface mo12885b(Context context, C0516c.C0518b bVar, Resources resources, int i) {
        if (!m15644t()) {
            return super.mo12885b(context, bVar, resources, i);
        }
        Object o = m15639o();
        if (o == null) {
            return null;
        }
        for (C0516c.C0519c cVar : bVar.mo3276a()) {
            if (!m15641q(context, o, cVar.mo3277a(), cVar.mo3279c(), cVar.mo3281e(), cVar.mo3282f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(cVar.mo3280d()))) {
                m15640p(o);
                return null;
            }
        }
        if (!m15643s(o)) {
            return null;
        }
        return mo12889l(o);
    }

    /* renamed from: c */
    public Typeface mo12886c(Context context, CancellationSignal cancellationSignal, C3670f.C3672b[] bVarArr, int i) {
        Typeface l;
        ParcelFileDescriptor openFileDescriptor;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!m15644t()) {
            C3670f.C3672b h = mo12897h(bVarArr, i);
            try {
                openFileDescriptor = context.getContentResolver().openFileDescriptor(h.mo12949d(), "r", cancellationSignal);
                if (openFileDescriptor == null) {
                    if (openFileDescriptor != null) {
                        openFileDescriptor.close();
                    }
                    return null;
                }
                Typeface build = new Typeface.Builder(openFileDescriptor.getFileDescriptor()).setWeight(h.mo12950e()).setItalic(h.mo12951f()).build();
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return build;
            } catch (IOException unused) {
                return null;
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        } else {
            Map<Uri, ByteBuffer> h2 = C3637k.m15690h(context, bVarArr, cancellationSignal);
            Object o = m15639o();
            if (o == null) {
                return null;
            }
            boolean z = false;
            for (C3670f.C3672b bVar : bVarArr) {
                ByteBuffer byteBuffer = h2.get(bVar.mo12949d());
                if (byteBuffer != null) {
                    if (!m15642r(o, byteBuffer, bVar.mo12948c(), bVar.mo12950e(), bVar.mo12951f() ? 1 : 0)) {
                        m15640p(o);
                        return null;
                    }
                    z = true;
                }
            }
            if (!z) {
                m15640p(o);
                return null;
            } else if (m15643s(o) && (l = mo12889l(o)) != null) {
                return Typeface.create(l, i);
            } else {
                return null;
            }
        }
        throw th;
    }

    /* renamed from: e */
    public Typeface mo12888e(Context context, Resources resources, int i, String str, int i2) {
        if (!m15644t()) {
            return super.mo12888e(context, resources, i, str, i2);
        }
        Object o = m15639o();
        if (o == null) {
            return null;
        }
        if (!m15641q(context, o, str, 0, -1, -1, (FontVariationAxis[]) null)) {
            m15640p(o);
            return null;
        } else if (!m15643s(o)) {
            return null;
        } else {
            return mo12889l(o);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Typeface mo12889l(Object obj) {
        try {
            Object newInstance = Array.newInstance(this.f11609g, 1);
            Array.set(newInstance, 0, obj);
            return (Typeface) this.f11615m.invoke((Object) null, new Object[]{newInstance, -1, -1});
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public Method mo12890u(Class<?> cls) throws NoSuchMethodException {
        return cls.getMethod("abortCreation", new Class[0]);
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public Method mo12891v(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", new Class[]{AssetManager.class, String.class, cls2, Boolean.TYPE, cls2, cls2, cls2, FontVariationAxis[].class});
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public Method mo12892w(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", new Class[]{ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public Method mo12893x(Class<?> cls) throws NoSuchMethodException {
        Class cls2 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", new Class[]{Array.newInstance(cls, 1).getClass(), cls2, cls2});
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public Class<?> mo12894y() throws ClassNotFoundException {
        return Class.forName("android.graphics.FontFamily");
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public Constructor<?> mo12895z(Class<?> cls) throws NoSuchMethodException {
        return cls.getConstructor(new Class[0]);
    }
}
