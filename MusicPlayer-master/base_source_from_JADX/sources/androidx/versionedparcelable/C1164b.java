package androidx.versionedparcelable;

import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p082e.p098e.C3465a;

/* renamed from: androidx.versionedparcelable.b */
/* compiled from: VersionedParcel */
public abstract class C1164b {

    /* renamed from: a */
    protected final C3465a<String, Method> f4759a;

    /* renamed from: b */
    protected final C3465a<String, Method> f4760b;

    /* renamed from: c */
    protected final C3465a<String, Class> f4761c;

    public C1164b(C3465a<String, Method> aVar, C3465a<String, Method> aVar2, C3465a<String, Class> aVar3) {
        this.f4759a = aVar;
        this.f4760b = aVar2;
        this.f4761c = aVar3;
    }

    /* renamed from: N */
    private void m6522N(C1166d dVar) {
        try {
            mo6150I(m6523c(dVar.getClass()).getName());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(dVar.getClass().getSimpleName() + " does not have a Parcelizer", e);
        }
    }

    /* renamed from: c */
    private Class m6523c(Class<? extends C1166d> cls) throws ClassNotFoundException {
        Class cls2 = this.f4761c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", new Object[]{cls.getPackage().getName(), cls.getSimpleName()}), false, cls.getClassLoader());
        this.f4761c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    private Method m6524d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<C1164b> cls = C1164b.class;
        Method method = this.f4759a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, cls.getClassLoader()).getDeclaredMethod("read", new Class[]{cls});
        this.f4759a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* renamed from: e */
    private Method m6525e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f4760b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class c = m6523c(cls);
        System.currentTimeMillis();
        Method declaredMethod = c.getDeclaredMethod("write", new Class[]{cls, C1164b.class});
        this.f4760b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo6142A(byte[] bArr);

    /* renamed from: B */
    public void mo6143B(byte[] bArr, int i) {
        mo6174w(i);
        mo6142A(bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract void mo6144C(CharSequence charSequence);

    /* renamed from: D */
    public void mo6145D(CharSequence charSequence, int i) {
        mo6174w(i);
        mo6144C(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract void mo6146E(int i);

    /* renamed from: F */
    public void mo6147F(int i, int i2) {
        mo6174w(i2);
        mo6146E(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public abstract void mo6148G(Parcelable parcelable);

    /* renamed from: H */
    public void mo6149H(Parcelable parcelable, int i) {
        mo6174w(i);
        mo6148G(parcelable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public abstract void mo6150I(String str);

    /* renamed from: J */
    public void mo6151J(String str, int i) {
        mo6174w(i);
        mo6150I(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public <T extends C1166d> void mo6152K(T t, C1164b bVar) {
        try {
            m6525e(t.getClass()).invoke((Object) null, new Object[]{t, bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo6153L(C1166d dVar) {
        if (dVar == null) {
            mo6150I((String) null);
            return;
        }
        m6522N(dVar);
        C1164b b = mo6156b();
        mo6152K(dVar, b);
        b.mo6155a();
    }

    /* renamed from: M */
    public void mo6154M(C1166d dVar, int i) {
        mo6174w(i);
        mo6153L(dVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo6155a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C1164b mo6156b();

    /* renamed from: f */
    public boolean mo6157f() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract boolean mo6158g();

    /* renamed from: h */
    public boolean mo6159h(boolean z, int i) {
        if (!mo6164m(i)) {
            return z;
        }
        return mo6158g();
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract byte[] mo6160i();

    /* renamed from: j */
    public byte[] mo6161j(byte[] bArr, int i) {
        if (!mo6164m(i)) {
            return bArr;
        }
        return mo6160i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public abstract CharSequence mo6162k();

    /* renamed from: l */
    public CharSequence mo6163l(CharSequence charSequence, int i) {
        if (!mo6164m(i)) {
            return charSequence;
        }
        return mo6162k();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract boolean mo6164m(int i);

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public <T extends C1166d> T mo6165n(String str, C1164b bVar) {
        try {
            return (C1166d) m6524d(str).invoke((Object) null, new Object[]{bVar});
        } catch (IllegalAccessException e) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e);
        } catch (InvocationTargetException e2) {
            if (e2.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e2.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e3);
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e4);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo6166o();

    /* renamed from: p */
    public int mo6167p(int i, int i2) {
        if (!mo6164m(i2)) {
            return i;
        }
        return mo6166o();
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract <T extends Parcelable> T mo6168q();

    /* renamed from: r */
    public <T extends Parcelable> T mo6169r(T t, int i) {
        if (!mo6164m(i)) {
            return t;
        }
        return mo6168q();
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract String mo6170s();

    /* renamed from: t */
    public String mo6171t(String str, int i) {
        if (!mo6164m(i)) {
            return str;
        }
        return mo6170s();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public <T extends C1166d> T mo6172u() {
        String s = mo6170s();
        if (s == null) {
            return null;
        }
        return mo6165n(s, mo6156b());
    }

    /* renamed from: v */
    public <T extends C1166d> T mo6173v(T t, int i) {
        if (!mo6164m(i)) {
            return t;
        }
        return mo6172u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public abstract void mo6174w(int i);

    /* renamed from: x */
    public void mo6175x(boolean z, boolean z2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public abstract void mo6176y(boolean z);

    /* renamed from: z */
    public void mo6177z(boolean z, int i) {
        mo6174w(i);
        mo6176y(z);
    }
}
