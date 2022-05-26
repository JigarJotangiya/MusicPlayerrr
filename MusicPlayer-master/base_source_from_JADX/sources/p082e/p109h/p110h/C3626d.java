package p082e.p109h.p110h;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import androidx.core.content.p003d.C0516c;
import androidx.core.content.p003d.C0524f;
import p082e.p098e.C3471e;
import p082e.p109h.p116m.C3670f;

@SuppressLint({"NewApi"})
/* renamed from: e.h.h.d */
/* compiled from: TypefaceCompat */
public class C3626d {

    /* renamed from: a */
    private static final C3633j f11597a;

    /* renamed from: b */
    private static final C3471e<String, Typeface> f11598b = new C3471e<>(16);

    /* renamed from: e.h.h.d$a */
    /* compiled from: TypefaceCompat */
    public static class C3627a extends C3670f.C3673c {

        /* renamed from: a */
        private C0524f.C0527c f11599a;

        public C3627a(C0524f.C0527c cVar) {
            this.f11599a = cVar;
        }

        /* renamed from: a */
        public void mo12883a(int i) {
            C0524f.C0527c cVar = this.f11599a;
            if (cVar != null) {
                cVar.mo2084d(i);
            }
        }

        /* renamed from: b */
        public void mo12884b(Typeface typeface) {
            C0524f.C0527c cVar = this.f11599a;
            if (cVar != null) {
                cVar.mo2085e(typeface);
            }
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            f11597a = new C3632i();
        } else if (i >= 28) {
            f11597a = new C3631h();
        } else if (i >= 26) {
            f11597a = new C3630g();
        } else if (i >= 24 && C3629f.m15635m()) {
            f11597a = new C3629f();
        } else if (i >= 21) {
            f11597a = new C3628e();
        } else {
            f11597a = new C3633j();
        }
    }

    /* renamed from: a */
    public static Typeface m15616a(Context context, Typeface typeface, int i) {
        Typeface g;
        if (context == null) {
            throw new IllegalArgumentException("Context cannot be null");
        } else if (Build.VERSION.SDK_INT >= 21 || (g = m15622g(context, typeface, i)) == null) {
            return Typeface.create(typeface, i);
        } else {
            return g;
        }
    }

    /* renamed from: b */
    public static Typeface m15617b(Context context, CancellationSignal cancellationSignal, C3670f.C3672b[] bVarArr, int i) {
        return f11597a.mo12886c(context, cancellationSignal, bVarArr, i);
    }

    /* renamed from: c */
    public static Typeface m15618c(Context context, C0516c.C0517a aVar, Resources resources, int i, int i2, C0524f.C0527c cVar, Handler handler, boolean z) {
        Typeface typeface;
        C0516c.C0517a aVar2 = aVar;
        C0524f.C0527c cVar2 = cVar;
        Handler handler2 = handler;
        if (aVar2 instanceof C0516c.C0520d) {
            C0516c.C0520d dVar = (C0516c.C0520d) aVar2;
            Typeface h = m15623h(dVar.mo3285c());
            if (h != null) {
                if (cVar2 != null) {
                    cVar2.mo3290b(h, handler2);
                }
                return h;
            }
            typeface = C3670f.m15747a(context, dVar.mo3284b(), i2, !z ? cVar2 == null : dVar.mo3283a() == 0, z ? dVar.mo3286d() : -1, C0524f.C0527c.m3234c(handler), new C3627a(cVar2));
            Resources resources2 = resources;
            int i3 = i2;
        } else {
            Context context2 = context;
            Resources resources3 = resources;
            typeface = f11597a.mo12885b(context, (C0516c.C0518b) aVar2, resources, i2);
            if (cVar2 != null) {
                if (typeface != null) {
                    cVar2.mo3290b(typeface, handler2);
                } else {
                    cVar2.mo3289a(-3, handler2);
                }
            }
        }
        if (typeface != null) {
            f11598b.mo12319e(m15620e(resources, i, i2), typeface);
        }
        return typeface;
    }

    /* renamed from: d */
    public static Typeface m15619d(Context context, Resources resources, int i, String str, int i2) {
        Typeface e = f11597a.mo12888e(context, resources, i, str, i2);
        if (e != null) {
            f11598b.mo12319e(m15620e(resources, i, i2), e);
        }
        return e;
    }

    /* renamed from: e */
    private static String m15620e(Resources resources, int i, int i2) {
        return resources.getResourcePackageName(i) + "-" + i + "-" + i2;
    }

    /* renamed from: f */
    public static Typeface m15621f(Resources resources, int i, int i2) {
        return f11598b.mo12318d(m15620e(resources, i, i2));
    }

    /* renamed from: g */
    private static Typeface m15622g(Context context, Typeface typeface, int i) {
        C3633j jVar = f11597a;
        C0516c.C0518b i2 = jVar.mo12898i(typeface);
        if (i2 == null) {
            return null;
        }
        return jVar.mo12885b(context, i2, context.getResources(), i);
    }

    /* renamed from: h */
    private static Typeface m15623h(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        Typeface create = Typeface.create(str, 0);
        Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
        if (create == null || create.equals(create2)) {
            return null;
        }
        return create;
    }
}
