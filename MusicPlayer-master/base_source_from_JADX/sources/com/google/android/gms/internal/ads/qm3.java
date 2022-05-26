package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.nm3;
import com.google.android.gms.internal.ads.qm3;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class qm3<MessageType extends qm3<MessageType, BuilderType>, BuilderType extends nm3<MessageType, BuilderType>> extends vk3<MessageType, BuilderType> {
    private static final Map<Object, qm3<?, ?>> zzb = new ConcurrentHashMap();
    protected mp3 zzc = mp3.m27385c();
    protected int zzd = -1;

    /* renamed from: A */
    protected static <T extends qm3<T, ?>> T m29605A(T t, kl3 kl3, cm3 cm3) throws bn3 {
        T t2;
        try {
            sl3 zzl = kl3.zzl();
            t2 = (qm3) t.mo15709C(4, (Object) null, (Object) null);
            to3<?> b = io3.m25345a().mo18467b(t2.getClass());
            b.mo16705d(t2, tl3.m31342R(zzl), cm3);
            b.mo16704c(t2);
            zzl.mo19417A(0);
            m29607k(t2);
            return t2;
        } catch (bn3 e) {
            e = e;
            if (e.zzl()) {
                e = new bn3((IOException) e);
            }
            e.zzh(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bn3) {
                throw ((bn3) e2.getCause());
            }
            bn3 bn3 = new bn3(e2);
            bn3.zzh(t2);
            throw bn3;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof bn3) {
                throw ((bn3) e3.getCause());
            }
            throw e3;
        } catch (bn3 e4) {
            e4.zzh(t2);
            throw e4;
        } catch (bn3 e5) {
            throw e5;
        }
    }

    /* renamed from: B */
    protected static <T extends qm3<T, ?>> T m29606B(T t, byte[] bArr, cm3 cm3) throws bn3 {
        T l = m29608l(t, bArr, 0, bArr.length, cm3);
        m29607k(l);
        return l;
    }

    /* renamed from: k */
    private static <T extends qm3<T, ?>> T m29607k(T t) throws bn3 {
        if (t == null || t.mo20476u()) {
            return t;
        }
        bn3 bn3 = new bn3(new kp3(t).getMessage());
        bn3.zzh(t);
        throw bn3;
    }

    /* renamed from: l */
    static <T extends qm3<T, ?>> T m29608l(T t, byte[] bArr, int i, int i2, cm3 cm3) throws bn3 {
        T t2 = (qm3) t.mo15709C(4, (Object) null, (Object) null);
        try {
            to3<?> b = io3.m25345a().mo18467b(t2.getClass());
            b.mo16707f(t2, bArr, 0, i2, new yk3(cm3));
            b.mo16704c(t2);
            if (t2.zza == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (bn3 e) {
            e = e;
            if (e.zzl()) {
                e = new bn3((IOException) e);
            }
            e.zzh(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bn3) {
                throw ((bn3) e2.getCause());
            }
            bn3 bn3 = new bn3(e2);
            bn3.zzh(t2);
            throw bn3;
        } catch (IndexOutOfBoundsException unused) {
            bn3 zzj = bn3.zzj();
            zzj.zzh(t2);
            throw zzj;
        }
    }

    /* renamed from: m */
    protected static um3 m29609m() {
        return rm3.m30220s();
    }

    /* renamed from: n */
    protected static um3 m29610n(um3 um3) {
        int size = um3.size();
        return um3.mo20686w(size == 0 ? 10 : size + size);
    }

    /* renamed from: o */
    protected static xm3 m29611o() {
        return on3.m28612s();
    }

    /* renamed from: p */
    protected static <E> ym3<E> m29612p() {
        return jo3.m25807p();
    }

    /* renamed from: q */
    protected static <E> ym3<E> m29613q(ym3<E> ym3) {
        int size = ym3.size();
        return ym3.mo15868f(size == 0 ? 10 : size + size);
    }

    /* renamed from: r */
    static Object m29614r(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else if (cause instanceof Error) {
                throw ((Error) cause);
            } else {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
        }
    }

    /* renamed from: s */
    protected static Object m29615s(zn3 zn3, String str, Object[] objArr) {
        return new ko3(zn3, str, objArr);
    }

    /* renamed from: t */
    protected static <T extends qm3> void m29616t(Class<T> cls, T t) {
        zzb.put(cls, t);
    }

    /* renamed from: x */
    static <T extends qm3> T m29617x(Class<T> cls) {
        Map<Object, qm3<?, ?>> map = zzb;
        T t = (qm3) map.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (qm3) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (t == null) {
            t = (qm3) ((qm3) vp3.m32647o(cls)).mo15709C(6, (Object) null, (Object) null);
            if (t != null) {
                map.put(cls, t);
            } else {
                throw new IllegalStateException();
            }
        }
        return t;
    }

    /* renamed from: y */
    protected static <T extends qm3<T, ?>> T m29618y(T t, kl3 kl3) throws bn3 {
        T t2;
        cm3 a = cm3.m21985a();
        try {
            sl3 zzl = kl3.zzl();
            t2 = (qm3) t.mo15709C(4, (Object) null, (Object) null);
            to3<?> b = io3.m25345a().mo18467b(t2.getClass());
            b.mo16705d(t2, tl3.m31342R(zzl), a);
            b.mo16704c(t2);
            zzl.mo19417A(0);
            m29607k(t2);
            m29607k(t2);
            return t2;
        } catch (bn3 e) {
            e = e;
            if (e.zzl()) {
                e = new bn3((IOException) e);
            }
            e.zzh(t2);
            throw e;
        } catch (IOException e2) {
            if (e2.getCause() instanceof bn3) {
                throw ((bn3) e2.getCause());
            }
            bn3 bn3 = new bn3(e2);
            bn3.zzh(t2);
            throw bn3;
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof bn3) {
                throw ((bn3) e3.getCause());
            }
            throw e3;
        } catch (bn3 e4) {
            e4.zzh(t2);
            throw e4;
        } catch (bn3 e5) {
            throw e5;
        }
    }

    /* renamed from: z */
    protected static <T extends qm3<T, ?>> T m29619z(T t, byte[] bArr) throws bn3 {
        T l = m29608l(t, bArr, 0, bArr.length, cm3.m21985a());
        m29607k(l);
        return l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract Object mo15709C(int i, Object obj, Object obj2);

    /* renamed from: a */
    public final void mo20467a(xl3 xl3) throws IOException {
        io3.m25345a().mo18467b(getClass()).mo16706e(this, yl3.m34157l(xl3));
    }

    /* renamed from: c */
    public final /* synthetic */ zn3 mo15911c() {
        return (qm3) mo15709C(6, (Object) null, (Object) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final int mo20468d() {
        return this.zzd;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return io3.m25345a().mo18467b(getClass()).mo16710i(this, (qm3) obj);
        }
        return false;
    }

    /* renamed from: f */
    public final /* synthetic */ yn3 mo20470f() {
        return (nm3) mo15709C(5, (Object) null, (Object) null);
    }

    /* renamed from: g */
    public final int mo20471g() {
        int i = this.zzd;
        if (i != -1) {
            return i;
        }
        int b = io3.m25345a().mo18467b(getClass()).mo16703b(this);
        this.zzd = b;
        return b;
    }

    /* renamed from: h */
    public final /* synthetic */ yn3 mo20472h() {
        nm3 nm3 = (nm3) mo15709C(5, (Object) null, (Object) null);
        nm3.mo19759l(this);
        return nm3;
    }

    public final int hashCode() {
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int a = io3.m25345a().mo18467b(getClass()).mo16702a(this);
        this.zza = a;
        return a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public final void mo20474j(int i) {
        this.zzd = i;
    }

    public final String toString() {
        return bo3.m21460a(this, super.toString());
    }

    /* renamed from: u */
    public final boolean mo20476u() {
        byte byteValue = ((Byte) mo15709C(1, (Object) null, (Object) null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g = io3.m25345a().mo18467b(getClass()).mo16708g(this);
        mo15709C(2, true != g ? null : this, (Object) null);
        return g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final <MessageType extends qm3<MessageType, BuilderType>, BuilderType extends nm3<MessageType, BuilderType>> BuilderType mo20477v() {
        return (nm3) mo15709C(5, (Object) null, (Object) null);
    }

    /* renamed from: w */
    public final BuilderType mo20478w() {
        BuilderType buildertype = (nm3) mo15709C(5, (Object) null, (Object) null);
        buildertype.mo19759l(this);
        return buildertype;
    }
}
