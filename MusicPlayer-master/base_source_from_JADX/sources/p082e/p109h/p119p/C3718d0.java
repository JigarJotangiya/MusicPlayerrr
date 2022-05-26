package p082e.p109h.p119p;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import p082e.p109h.p110h.C3622b;
import p082e.p109h.p118o.C3698d;
import p082e.p109h.p118o.C3703i;

/* renamed from: e.h.p.d0 */
/* compiled from: WindowInsetsCompat */
public class C3718d0 {

    /* renamed from: b */
    public static final C3718d0 f11751b;

    /* renamed from: a */
    private final C3730l f11752a;

    /* renamed from: e.h.p.d0$a */
    /* compiled from: WindowInsetsCompat */
    static class C3719a {

        /* renamed from: a */
        private static Field f11753a;

        /* renamed from: b */
        private static Field f11754b;

        /* renamed from: c */
        private static Field f11755c;

        /* renamed from: d */
        private static boolean f11756d = true;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f11753a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f11754b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f11755c = declaredField3;
                declaredField3.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        /* renamed from: a */
        public static C3718d0 m15901a(View view) {
            if (f11756d && view.isAttachedToWindow()) {
                try {
                    Object obj = f11753a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f11754b.get(obj);
                        Rect rect2 = (Rect) f11755c.get(obj);
                        if (!(rect == null || rect2 == null)) {
                            C3720b bVar = new C3720b();
                            bVar.mo13049b(C3622b.m15598c(rect));
                            bVar.mo13050c(C3622b.m15598c(rect2));
                            C3718d0 a = bVar.mo13048a();
                            a.mo13045t(a);
                            a.mo13028d(view.getRootView());
                            return a;
                        }
                    }
                } catch (IllegalAccessException e) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }

    /* renamed from: e.h.p.d0$e */
    /* compiled from: WindowInsetsCompat */
    private static class C3723e extends C3722d {
        C3723e() {
        }

        C3723e(C3718d0 d0Var) {
            super(d0Var);
        }
    }

    /* renamed from: e.h.p.d0$f */
    /* compiled from: WindowInsetsCompat */
    private static class C3724f {

        /* renamed from: a */
        private final C3718d0 f11765a;

        /* renamed from: b */
        C3622b[] f11766b;

        C3724f() {
            this(new C3718d0((C3718d0) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo13057a() {
            C3622b[] bVarArr = this.f11766b;
            if (bVarArr != null) {
                C3622b bVar = bVarArr[C3731m.m15969a(1)];
                C3622b bVar2 = this.f11766b[C3731m.m15969a(2)];
                if (bVar2 == null) {
                    bVar2 = this.f11765a.mo13031f(2);
                }
                if (bVar == null) {
                    bVar = this.f11765a.mo13031f(1);
                }
                mo13053f(C3622b.m15596a(bVar, bVar2));
                C3622b bVar3 = this.f11766b[C3731m.m15969a(16)];
                if (bVar3 != null) {
                    mo13055e(bVar3);
                }
                C3622b bVar4 = this.f11766b[C3731m.m15969a(32)];
                if (bVar4 != null) {
                    mo13054c(bVar4);
                }
                C3622b bVar5 = this.f11766b[C3731m.m15969a(64)];
                if (bVar5 != null) {
                    mo13056g(bVar5);
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3718d0 mo13051b() {
            mo13057a();
            return this.f11765a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo13054c(C3622b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo13052d(C3622b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo13055e(C3622b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo13053f(C3622b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo13056g(C3622b bVar) {
        }

        C3724f(C3718d0 d0Var) {
            this.f11765a = d0Var;
        }
    }

    /* renamed from: e.h.p.d0$i */
    /* compiled from: WindowInsetsCompat */
    private static class C3727i extends C3726h {
        C3727i(C3718d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3718d0 mo13074a() {
            return C3718d0.m15878w(this.f11773c.consumeDisplayCutout());
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3727i)) {
                return false;
            }
            C3727i iVar = (C3727i) obj;
            if (!Objects.equals(this.f11773c, iVar.f11773c) || !Objects.equals(this.f11777g, iVar.f11777g)) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3711c mo13075f() {
            return C3711c.m15861e(this.f11773c.getDisplayCutout());
        }

        public int hashCode() {
            return this.f11773c.hashCode();
        }

        C3727i(C3718d0 d0Var, C3727i iVar) {
            super(d0Var, (C3726h) iVar);
        }
    }

    /* renamed from: e.h.p.d0$k */
    /* compiled from: WindowInsetsCompat */
    private static class C3729k extends C3728j {

        /* renamed from: r */
        static final C3718d0 f11782r = C3718d0.m15878w(WindowInsets.CONSUMED);

        C3729k(C3718d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public final void mo13058d(View view) {
        }

        /* renamed from: g */
        public C3622b mo13061g(int i) {
            return C3622b.m15599d(this.f11773c.getInsets(C3732n.m15970a(i)));
        }

        C3729k(C3718d0 d0Var, C3729k kVar) {
            super(d0Var, (C3728j) kVar);
        }
    }

    /* renamed from: e.h.p.d0$l */
    /* compiled from: WindowInsetsCompat */
    private static class C3730l {

        /* renamed from: b */
        static final C3718d0 f11783b = new C3720b().mo13048a().mo13025a().mo13026b().mo13027c();

        /* renamed from: a */
        final C3718d0 f11784a;

        C3730l(C3718d0 d0Var) {
            this.f11784a = d0Var;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C3718d0 mo13074a() {
            return this.f11784a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3718d0 mo13069b() {
            return this.f11784a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3718d0 mo13070c() {
            return this.f11784a;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo13058d(View view) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo13059e(C3718d0 d0Var) {
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C3730l)) {
                return false;
            }
            C3730l lVar = (C3730l) obj;
            if (mo13064o() != lVar.mo13064o() || mo13072n() != lVar.mo13072n() || !C3698d.m15814a(mo13062k(), lVar.mo13062k()) || !C3698d.m15814a(mo13071i(), lVar.mo13071i()) || !C3698d.m15814a(mo13075f(), lVar.mo13075f())) {
                return false;
            }
            return true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public C3711c mo13075f() {
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public C3622b mo13061g(int i) {
            return C3622b.f11588e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3622b mo13077h() {
            return mo13062k();
        }

        public int hashCode() {
            return C3698d.m15815b(Boolean.valueOf(mo13064o()), Boolean.valueOf(mo13072n()), mo13062k(), mo13071i(), mo13075f());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public C3622b mo13071i() {
            return C3622b.f11588e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C3622b mo13078j() {
            return mo13062k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public C3622b mo13062k() {
            return C3622b.f11588e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C3622b mo13079l() {
            return mo13062k();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C3718d0 mo13063m(int i, int i2, int i3, int i4) {
            return f11783b;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo13072n() {
            return false;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo13064o() {
            return false;
        }

        /* renamed from: p */
        public void mo13065p(C3622b[] bVarArr) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo13066q(C3622b bVar) {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo13067r(C3718d0 d0Var) {
        }

        /* renamed from: s */
        public void mo13073s(C3622b bVar) {
        }
    }

    /* renamed from: e.h.p.d0$m */
    /* compiled from: WindowInsetsCompat */
    public static final class C3731m {
        /* renamed from: a */
        static int m15969a(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    /* renamed from: e.h.p.d0$n */
    /* compiled from: WindowInsetsCompat */
    private static final class C3732n {
        /* renamed from: a */
        static int m15970a(int i) {
            int i2;
            int i3 = 0;
            for (int i4 = 1; i4 <= 256; i4 <<= 1) {
                if ((i & i4) != 0) {
                    if (i4 == 1) {
                        i2 = WindowInsets.Type.statusBars();
                    } else if (i4 == 2) {
                        i2 = WindowInsets.Type.navigationBars();
                    } else if (i4 == 4) {
                        i2 = WindowInsets.Type.captionBar();
                    } else if (i4 == 8) {
                        i2 = WindowInsets.Type.ime();
                    } else if (i4 == 16) {
                        i2 = WindowInsets.Type.systemGestures();
                    } else if (i4 == 32) {
                        i2 = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i4 == 64) {
                        i2 = WindowInsets.Type.tappableElement();
                    } else if (i4 == 128) {
                        i2 = WindowInsets.Type.displayCutout();
                    }
                    i3 |= i2;
                }
            }
            return i3;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f11751b = C3729k.f11782r;
        } else {
            f11751b = C3730l.f11783b;
        }
    }

    private C3718d0(WindowInsets windowInsets) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 30) {
            this.f11752a = new C3729k(this, windowInsets);
        } else if (i >= 29) {
            this.f11752a = new C3728j(this, windowInsets);
        } else if (i >= 28) {
            this.f11752a = new C3727i(this, windowInsets);
        } else if (i >= 21) {
            this.f11752a = new C3726h(this, windowInsets);
        } else if (i >= 20) {
            this.f11752a = new C3725g(this, windowInsets);
        } else {
            this.f11752a = new C3730l(this);
        }
    }

    /* renamed from: o */
    static C3622b m15877o(C3622b bVar, int i, int i2, int i3, int i4) {
        int max = Math.max(0, bVar.f11589a - i);
        int max2 = Math.max(0, bVar.f11590b - i2);
        int max3 = Math.max(0, bVar.f11591c - i3);
        int max4 = Math.max(0, bVar.f11592d - i4);
        if (max == i && max2 == i2 && max3 == i3 && max4 == i4) {
            return bVar;
        }
        return C3622b.m15597b(max, max2, max3, max4);
    }

    /* renamed from: w */
    public static C3718d0 m15878w(WindowInsets windowInsets) {
        return m15879x(windowInsets, (View) null);
    }

    /* renamed from: x */
    public static C3718d0 m15879x(WindowInsets windowInsets, View view) {
        C3703i.m15827d(windowInsets);
        C3718d0 d0Var = new C3718d0(windowInsets);
        if (view != null && view.isAttachedToWindow()) {
            d0Var.mo13045t(C3774v.m16165I(view));
            d0Var.mo13028d(view.getRootView());
        }
        return d0Var;
    }

    @Deprecated
    /* renamed from: a */
    public C3718d0 mo13025a() {
        return this.f11752a.mo13074a();
    }

    @Deprecated
    /* renamed from: b */
    public C3718d0 mo13026b() {
        return this.f11752a.mo13069b();
    }

    @Deprecated
    /* renamed from: c */
    public C3718d0 mo13027c() {
        return this.f11752a.mo13070c();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo13028d(View view) {
        this.f11752a.mo13058d(view);
    }

    /* renamed from: e */
    public C3711c mo13029e() {
        return this.f11752a.mo13075f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3718d0)) {
            return false;
        }
        return C3698d.m15814a(this.f11752a, ((C3718d0) obj).f11752a);
    }

    /* renamed from: f */
    public C3622b mo13031f(int i) {
        return this.f11752a.mo13061g(i);
    }

    @Deprecated
    /* renamed from: g */
    public C3622b mo13032g() {
        return this.f11752a.mo13077h();
    }

    @Deprecated
    /* renamed from: h */
    public C3622b mo13033h() {
        return this.f11752a.mo13071i();
    }

    public int hashCode() {
        C3730l lVar = this.f11752a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @Deprecated
    /* renamed from: i */
    public int mo13035i() {
        return this.f11752a.mo13062k().f11592d;
    }

    @Deprecated
    /* renamed from: j */
    public int mo13036j() {
        return this.f11752a.mo13062k().f11589a;
    }

    @Deprecated
    /* renamed from: k */
    public int mo13037k() {
        return this.f11752a.mo13062k().f11591c;
    }

    @Deprecated
    /* renamed from: l */
    public int mo13038l() {
        return this.f11752a.mo13062k().f11590b;
    }

    @Deprecated
    /* renamed from: m */
    public boolean mo13039m() {
        return !this.f11752a.mo13062k().equals(C3622b.f11588e);
    }

    /* renamed from: n */
    public C3718d0 mo13040n(int i, int i2, int i3, int i4) {
        return this.f11752a.mo13063m(i, i2, i3, i4);
    }

    /* renamed from: p */
    public boolean mo13041p() {
        return this.f11752a.mo13072n();
    }

    @Deprecated
    /* renamed from: q */
    public C3718d0 mo13042q(int i, int i2, int i3, int i4) {
        C3720b bVar = new C3720b(this);
        bVar.mo13050c(C3622b.m15597b(i, i2, i3, i4));
        return bVar.mo13048a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo13043r(C3622b[] bVarArr) {
        this.f11752a.mo13065p(bVarArr);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public void mo13044s(C3622b bVar) {
        this.f11752a.mo13066q(bVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public void mo13045t(C3718d0 d0Var) {
        this.f11752a.mo13067r(d0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public void mo13046u(C3622b bVar) {
        this.f11752a.mo13073s(bVar);
    }

    /* renamed from: v */
    public WindowInsets mo13047v() {
        C3730l lVar = this.f11752a;
        if (lVar instanceof C3725g) {
            return ((C3725g) lVar).f11773c;
        }
        return null;
    }

    /* renamed from: e.h.p.d0$c */
    /* compiled from: WindowInsetsCompat */
    private static class C3721c extends C3724f {

        /* renamed from: e */
        private static Field f11758e = null;

        /* renamed from: f */
        private static boolean f11759f = false;

        /* renamed from: g */
        private static Constructor<WindowInsets> f11760g = null;

        /* renamed from: h */
        private static boolean f11761h = false;

        /* renamed from: c */
        private WindowInsets f11762c;

        /* renamed from: d */
        private C3622b f11763d;

        C3721c() {
            this.f11762c = m15905h();
        }

        /* renamed from: h */
        private static WindowInsets m15905h() {
            if (!f11759f) {
                try {
                    f11758e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                f11759f = true;
            }
            Field field = f11758e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get((Object) null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e2) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!f11761h) {
                try {
                    f11760g = WindowInsets.class.getConstructor(new Class[]{Rect.class});
                } catch (ReflectiveOperationException e3) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                f11761h = true;
            }
            Constructor<WindowInsets> constructor = f11760g;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new Object[]{new Rect()});
                } catch (ReflectiveOperationException e4) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3718d0 mo13051b() {
            mo13057a();
            C3718d0 w = C3718d0.m15878w(this.f11762c);
            w.mo13043r(this.f11766b);
            w.mo13046u(this.f11763d);
            return w;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo13052d(C3622b bVar) {
            this.f11763d = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo13053f(C3622b bVar) {
            WindowInsets windowInsets = this.f11762c;
            if (windowInsets != null) {
                this.f11762c = windowInsets.replaceSystemWindowInsets(bVar.f11589a, bVar.f11590b, bVar.f11591c, bVar.f11592d);
            }
        }

        C3721c(C3718d0 d0Var) {
            super(d0Var);
            this.f11762c = d0Var.mo13047v();
        }
    }

    /* renamed from: e.h.p.d0$d */
    /* compiled from: WindowInsetsCompat */
    private static class C3722d extends C3724f {

        /* renamed from: c */
        final WindowInsets.Builder f11764c;

        C3722d() {
            this.f11764c = new WindowInsets.Builder();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3718d0 mo13051b() {
            mo13057a();
            C3718d0 w = C3718d0.m15878w(this.f11764c.build());
            w.mo13043r(this.f11766b);
            return w;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo13054c(C3622b bVar) {
            this.f11764c.setMandatorySystemGestureInsets(bVar.mo12878e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo13052d(C3622b bVar) {
            this.f11764c.setStableInsets(bVar.mo12878e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo13055e(C3622b bVar) {
            this.f11764c.setSystemGestureInsets(bVar.mo12878e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: f */
        public void mo13053f(C3622b bVar) {
            this.f11764c.setSystemWindowInsets(bVar.mo12878e());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo13056g(C3622b bVar) {
            this.f11764c.setTappableElementInsets(bVar.mo12878e());
        }

        C3722d(C3718d0 d0Var) {
            super(d0Var);
            WindowInsets.Builder builder;
            WindowInsets v = d0Var.mo13047v();
            if (v != null) {
                builder = new WindowInsets.Builder(v);
            } else {
                builder = new WindowInsets.Builder();
            }
            this.f11764c = builder;
        }
    }

    /* renamed from: e.h.p.d0$h */
    /* compiled from: WindowInsetsCompat */
    private static class C3726h extends C3725g {

        /* renamed from: n */
        private C3622b f11778n = null;

        C3726h(C3718d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public C3718d0 mo13069b() {
            return C3718d0.m15878w(this.f11773c.consumeStableInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C3718d0 mo13070c() {
            return C3718d0.m15878w(this.f11773c.consumeSystemWindowInsets());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: i */
        public final C3622b mo13071i() {
            if (this.f11778n == null) {
                this.f11778n = C3622b.m15597b(this.f11773c.getStableInsetLeft(), this.f11773c.getStableInsetTop(), this.f11773c.getStableInsetRight(), this.f11773c.getStableInsetBottom());
            }
            return this.f11778n;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: n */
        public boolean mo13072n() {
            return this.f11773c.isConsumed();
        }

        /* renamed from: s */
        public void mo13073s(C3622b bVar) {
            this.f11778n = bVar;
        }

        C3726h(C3718d0 d0Var, C3726h hVar) {
            super(d0Var, (C3725g) hVar);
            this.f11778n = hVar.f11778n;
        }
    }

    /* renamed from: e.h.p.d0$g */
    /* compiled from: WindowInsetsCompat */
    private static class C3725g extends C3730l {

        /* renamed from: h */
        private static boolean f11767h = false;

        /* renamed from: i */
        private static Method f11768i;

        /* renamed from: j */
        private static Class<?> f11769j;

        /* renamed from: k */
        private static Class<?> f11770k;

        /* renamed from: l */
        private static Field f11771l;

        /* renamed from: m */
        private static Field f11772m;

        /* renamed from: c */
        final WindowInsets f11773c;

        /* renamed from: d */
        private C3622b[] f11774d;

        /* renamed from: e */
        private C3622b f11775e;

        /* renamed from: f */
        private C3718d0 f11776f;

        /* renamed from: g */
        C3622b f11777g;

        C3725g(C3718d0 d0Var, WindowInsets windowInsets) {
            super(d0Var);
            this.f11775e = null;
            this.f11773c = windowInsets;
        }

        @SuppressLint({"WrongConstant"})
        /* renamed from: t */
        private C3622b m15922t(int i, boolean z) {
            C3622b bVar = C3622b.f11588e;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    bVar = C3622b.m15596a(bVar, mo13068u(i2, z));
                }
            }
            return bVar;
        }

        /* renamed from: v */
        private C3622b m15923v() {
            C3718d0 d0Var = this.f11776f;
            if (d0Var != null) {
                return d0Var.mo13033h();
            }
            return C3622b.f11588e;
        }

        /* renamed from: w */
        private C3622b m15924w(View view) {
            if (Build.VERSION.SDK_INT < 30) {
                if (!f11767h) {
                    m15925x();
                }
                Method method = f11768i;
                if (!(method == null || f11770k == null || f11771l == null)) {
                    try {
                        Object invoke = method.invoke(view, new Object[0]);
                        if (invoke == null) {
                            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                            return null;
                        }
                        Rect rect = (Rect) f11771l.get(f11772m.get(invoke));
                        if (rect != null) {
                            return C3622b.m15598c(rect);
                        }
                        return null;
                    } catch (ReflectiveOperationException e) {
                        Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                    }
                }
                return null;
            }
            throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
        }

        @SuppressLint({"PrivateApi"})
        /* renamed from: x */
        private static void m15925x() {
            try {
                f11768i = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                f11769j = Class.forName("android.view.ViewRootImpl");
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f11770k = cls;
                f11771l = cls.getDeclaredField("mVisibleInsets");
                f11772m = f11769j.getDeclaredField("mAttachInfo");
                f11771l.setAccessible(true);
                f11772m.setAccessible(true);
            } catch (ReflectiveOperationException e) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            f11767h = true;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo13058d(View view) {
            C3622b w = m15924w(view);
            if (w == null) {
                w = C3622b.f11588e;
            }
            mo13066q(w);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public void mo13059e(C3718d0 d0Var) {
            d0Var.mo13045t(this.f11776f);
            d0Var.mo13044s(this.f11777g);
        }

        public boolean equals(Object obj) {
            if (!super.equals(obj)) {
                return false;
            }
            return Objects.equals(this.f11777g, ((C3725g) obj).f11777g);
        }

        /* renamed from: g */
        public C3622b mo13061g(int i) {
            return m15922t(i, false);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: k */
        public final C3622b mo13062k() {
            if (this.f11775e == null) {
                this.f11775e = C3622b.m15597b(this.f11773c.getSystemWindowInsetLeft(), this.f11773c.getSystemWindowInsetTop(), this.f11773c.getSystemWindowInsetRight(), this.f11773c.getSystemWindowInsetBottom());
            }
            return this.f11775e;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C3718d0 mo13063m(int i, int i2, int i3, int i4) {
            C3720b bVar = new C3720b(C3718d0.m15878w(this.f11773c));
            bVar.mo13050c(C3718d0.m15877o(mo13062k(), i, i2, i3, i4));
            bVar.mo13049b(C3718d0.m15877o(mo13071i(), i, i2, i3, i4));
            return bVar.mo13048a();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: o */
        public boolean mo13064o() {
            return this.f11773c.isRound();
        }

        /* renamed from: p */
        public void mo13065p(C3622b[] bVarArr) {
            this.f11774d = bVarArr;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: q */
        public void mo13066q(C3622b bVar) {
            this.f11777g = bVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: r */
        public void mo13067r(C3718d0 d0Var) {
            this.f11776f = d0Var;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public C3622b mo13068u(int i, boolean z) {
            int i2;
            C3711c cVar;
            if (i != 1) {
                C3622b bVar = null;
                if (i != 2) {
                    if (i == 8) {
                        C3622b[] bVarArr = this.f11774d;
                        if (bVarArr != null) {
                            bVar = bVarArr[C3731m.m15969a(8)];
                        }
                        if (bVar != null) {
                            return bVar;
                        }
                        C3622b k = mo13062k();
                        C3622b v = m15923v();
                        int i3 = k.f11592d;
                        if (i3 > v.f11592d) {
                            return C3622b.m15597b(0, 0, 0, i3);
                        }
                        C3622b bVar2 = this.f11777g;
                        if (bVar2 == null || bVar2.equals(C3622b.f11588e) || (i2 = this.f11777g.f11592d) <= v.f11592d) {
                            return C3622b.f11588e;
                        }
                        return C3622b.m15597b(0, 0, 0, i2);
                    } else if (i == 16) {
                        return mo13078j();
                    } else {
                        if (i == 32) {
                            return mo13077h();
                        }
                        if (i == 64) {
                            return mo13079l();
                        }
                        if (i != 128) {
                            return C3622b.f11588e;
                        }
                        C3718d0 d0Var = this.f11776f;
                        if (d0Var != null) {
                            cVar = d0Var.mo13029e();
                        } else {
                            cVar = mo13075f();
                        }
                        if (cVar != null) {
                            return C3622b.m15597b(cVar.mo13014b(), cVar.mo13016d(), cVar.mo13015c(), cVar.mo13013a());
                        }
                        return C3622b.f11588e;
                    }
                } else if (z) {
                    C3622b v2 = m15923v();
                    C3622b i4 = mo13071i();
                    return C3622b.m15597b(Math.max(v2.f11589a, i4.f11589a), 0, Math.max(v2.f11591c, i4.f11591c), Math.max(v2.f11592d, i4.f11592d));
                } else {
                    C3622b k2 = mo13062k();
                    C3718d0 d0Var2 = this.f11776f;
                    if (d0Var2 != null) {
                        bVar = d0Var2.mo13033h();
                    }
                    int i5 = k2.f11592d;
                    if (bVar != null) {
                        i5 = Math.min(i5, bVar.f11592d);
                    }
                    return C3622b.m15597b(k2.f11589a, 0, k2.f11591c, i5);
                }
            } else if (z) {
                return C3622b.m15597b(0, Math.max(m15923v().f11590b, mo13062k().f11590b), 0, 0);
            } else {
                return C3622b.m15597b(0, mo13062k().f11590b, 0, 0);
            }
        }

        C3725g(C3718d0 d0Var, C3725g gVar) {
            this(d0Var, new WindowInsets(gVar.f11773c));
        }
    }

    /* renamed from: e.h.p.d0$j */
    /* compiled from: WindowInsetsCompat */
    private static class C3728j extends C3727i {

        /* renamed from: o */
        private C3622b f11779o = null;

        /* renamed from: p */
        private C3622b f11780p = null;

        /* renamed from: q */
        private C3622b f11781q = null;

        C3728j(C3718d0 d0Var, WindowInsets windowInsets) {
            super(d0Var, windowInsets);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: h */
        public C3622b mo13077h() {
            if (this.f11780p == null) {
                this.f11780p = C3622b.m15599d(this.f11773c.getMandatorySystemGestureInsets());
            }
            return this.f11780p;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: j */
        public C3622b mo13078j() {
            if (this.f11779o == null) {
                this.f11779o = C3622b.m15599d(this.f11773c.getSystemGestureInsets());
            }
            return this.f11779o;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: l */
        public C3622b mo13079l() {
            if (this.f11781q == null) {
                this.f11781q = C3622b.m15599d(this.f11773c.getTappableElementInsets());
            }
            return this.f11781q;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: m */
        public C3718d0 mo13063m(int i, int i2, int i3, int i4) {
            return C3718d0.m15878w(this.f11773c.inset(i, i2, i3, i4));
        }

        /* renamed from: s */
        public void mo13073s(C3622b bVar) {
        }

        C3728j(C3718d0 d0Var, C3728j jVar) {
            super(d0Var, (C3727i) jVar);
        }
    }

    /* renamed from: e.h.p.d0$b */
    /* compiled from: WindowInsetsCompat */
    public static final class C3720b {

        /* renamed from: a */
        private final C3724f f11757a;

        public C3720b() {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f11757a = new C3723e();
            } else if (i >= 29) {
                this.f11757a = new C3722d();
            } else if (i >= 20) {
                this.f11757a = new C3721c();
            } else {
                this.f11757a = new C3724f();
            }
        }

        /* renamed from: a */
        public C3718d0 mo13048a() {
            return this.f11757a.mo13051b();
        }

        @Deprecated
        /* renamed from: b */
        public C3720b mo13049b(C3622b bVar) {
            this.f11757a.mo13052d(bVar);
            return this;
        }

        @Deprecated
        /* renamed from: c */
        public C3720b mo13050c(C3622b bVar) {
            this.f11757a.mo13053f(bVar);
            return this;
        }

        public C3720b(C3718d0 d0Var) {
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                this.f11757a = new C3723e(d0Var);
            } else if (i >= 29) {
                this.f11757a = new C3722d(d0Var);
            } else if (i >= 20) {
                this.f11757a = new C3721c(d0Var);
            } else {
                this.f11757a = new C3724f(d0Var);
            }
        }
    }

    public C3718d0(C3718d0 d0Var) {
        if (d0Var != null) {
            C3730l lVar = d0Var.f11752a;
            int i = Build.VERSION.SDK_INT;
            if (i >= 30 && (lVar instanceof C3729k)) {
                this.f11752a = new C3729k(this, (C3729k) lVar);
            } else if (i >= 29 && (lVar instanceof C3728j)) {
                this.f11752a = new C3728j(this, (C3728j) lVar);
            } else if (i >= 28 && (lVar instanceof C3727i)) {
                this.f11752a = new C3727i(this, (C3727i) lVar);
            } else if (i >= 21 && (lVar instanceof C3726h)) {
                this.f11752a = new C3726h(this, (C3726h) lVar);
            } else if (i < 20 || !(lVar instanceof C3725g)) {
                this.f11752a = new C3730l(this);
            } else {
                this.f11752a = new C3725g(this, (C3725g) lVar);
            }
            lVar.mo13059e(this);
            return;
        }
        this.f11752a = new C3730l(this);
    }
}
