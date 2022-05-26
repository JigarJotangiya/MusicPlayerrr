package p082e.p109h.p110h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.util.Log;
import androidx.core.content.p003d.C0516c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;
import p082e.p109h.p116m.C3670f;

/* renamed from: e.h.h.j */
/* compiled from: TypefaceCompatBaseImpl */
class C3633j {
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: a */
    private ConcurrentHashMap<Long, C0516c.C0518b> f11616a = new ConcurrentHashMap<>();

    /* renamed from: e.h.h.j$a */
    /* compiled from: TypefaceCompatBaseImpl */
    class C3634a implements C3636c<C3670f.C3672b> {
        C3634a(C3633j jVar) {
        }

        /* renamed from: c */
        public int mo12899a(C3670f.C3672b bVar) {
            return bVar.mo12950e();
        }

        /* renamed from: d */
        public boolean mo12900b(C3670f.C3672b bVar) {
            return bVar.mo12951f();
        }
    }

    /* renamed from: e.h.h.j$b */
    /* compiled from: TypefaceCompatBaseImpl */
    class C3635b implements C3636c<C0516c.C0519c> {
        C3635b(C3633j jVar) {
        }

        /* renamed from: c */
        public int mo12899a(C0516c.C0519c cVar) {
            return cVar.mo3281e();
        }

        /* renamed from: d */
        public boolean mo12900b(C0516c.C0519c cVar) {
            return cVar.mo3282f();
        }
    }

    /* renamed from: e.h.h.j$c */
    /* compiled from: TypefaceCompatBaseImpl */
    private interface C3636c<T> {
        /* renamed from: a */
        int mo12899a(T t);

        /* renamed from: b */
        boolean mo12900b(T t);
    }

    C3633j() {
    }

    /* renamed from: a */
    private void m15663a(Typeface typeface, C0516c.C0518b bVar) {
        long j = m15666j(typeface);
        if (j != 0) {
            this.f11616a.put(Long.valueOf(j), bVar);
        }
    }

    /* renamed from: f */
    private C0516c.C0519c m15664f(C0516c.C0518b bVar, int i) {
        return (C0516c.C0519c) m15665g(bVar.mo3276a(), i, new C3635b(this));
    }

    /* renamed from: g */
    private static <T> T m15665g(T[] tArr, int i, C3636c<T> cVar) {
        int i2 = (i & 1) == 0 ? 400 : 700;
        boolean z = (i & 2) != 0;
        T t = null;
        int i3 = Integer.MAX_VALUE;
        for (T t2 : tArr) {
            int abs = (Math.abs(cVar.mo12899a(t2) - i2) * 2) + (cVar.mo12900b(t2) == z ? 0 : 1);
            if (t == null || i3 > abs) {
                t = t2;
                i3 = abs;
            }
        }
        return t;
    }

    /* renamed from: j */
    private static long m15666j(Typeface typeface) {
        if (typeface == null) {
            return 0;
        }
        try {
            Field declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
            return ((Number) declaredField.get(typeface)).longValue();
        } catch (NoSuchFieldException e) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e);
            return 0;
        } catch (IllegalAccessException e2) {
            Log.e("TypefaceCompatBaseImpl", "Could not retrieve font from family.", e2);
            return 0;
        }
    }

    /* renamed from: b */
    public Typeface mo12885b(Context context, C0516c.C0518b bVar, Resources resources, int i) {
        C0516c.C0519c f = m15664f(bVar, i);
        if (f == null) {
            return null;
        }
        Typeface d = C3626d.m15619d(context, resources, f.mo3278b(), f.mo3277a(), i);
        m15663a(d, bVar);
        return d;
    }

    /* renamed from: c */
    public Typeface mo12886c(Context context, CancellationSignal cancellationSignal, C3670f.C3672b[] bVarArr, int i) {
        InputStream inputStream;
        InputStream inputStream2 = null;
        if (bVarArr.length < 1) {
            return null;
        }
        try {
            inputStream = context.getContentResolver().openInputStream(mo12897h(bVarArr, i).mo12949d());
            try {
                Typeface d = mo12896d(context, inputStream);
                C3637k.m15683a(inputStream);
                return d;
            } catch (IOException unused) {
                C3637k.m15683a(inputStream);
                return null;
            } catch (Throwable th) {
                th = th;
                inputStream2 = inputStream;
                C3637k.m15683a(inputStream2);
                throw th;
            }
        } catch (IOException unused2) {
            inputStream = null;
            C3637k.m15683a(inputStream);
            return null;
        } catch (Throwable th2) {
            th = th2;
            C3637k.m15683a(inputStream2);
            throw th;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Typeface mo12896d(Context context, InputStream inputStream) {
        File e = C3637k.m15687e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C3637k.m15686d(e, inputStream)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* renamed from: e */
    public Typeface mo12888e(Context context, Resources resources, int i, String str, int i2) {
        File e = C3637k.m15687e(context);
        if (e == null) {
            return null;
        }
        try {
            if (!C3637k.m15685c(e, resources, i)) {
                return null;
            }
            Typeface createFromFile = Typeface.createFromFile(e.getPath());
            e.delete();
            return createFromFile;
        } catch (RuntimeException unused) {
            return null;
        } finally {
            e.delete();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public C3670f.C3672b mo12897h(C3670f.C3672b[] bVarArr, int i) {
        return (C3670f.C3672b) m15665g(bVarArr, i, new C3634a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C0516c.C0518b mo12898i(Typeface typeface) {
        long j = m15666j(typeface);
        if (j == 0) {
            return null;
        }
        return this.f11616a.get(Long.valueOf(j));
    }
}
