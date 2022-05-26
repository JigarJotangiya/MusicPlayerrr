package androidx.fragment.app;

import android.view.ViewGroup;
import androidx.lifecycle.C0697n;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.p */
/* compiled from: FragmentTransaction */
public abstract class C0620p {

    /* renamed from: a */
    ArrayList<C0621a> f3135a = new ArrayList<>();

    /* renamed from: b */
    int f3136b;

    /* renamed from: c */
    int f3137c;

    /* renamed from: d */
    int f3138d;

    /* renamed from: e */
    int f3139e;

    /* renamed from: f */
    int f3140f;

    /* renamed from: g */
    boolean f3141g;

    /* renamed from: h */
    boolean f3142h = true;

    /* renamed from: i */
    String f3143i;

    /* renamed from: j */
    int f3144j;

    /* renamed from: k */
    CharSequence f3145k;

    /* renamed from: l */
    int f3146l;

    /* renamed from: m */
    CharSequence f3147m;

    /* renamed from: n */
    ArrayList<String> f3148n;

    /* renamed from: o */
    ArrayList<String> f3149o;

    /* renamed from: p */
    boolean f3150p = false;

    /* renamed from: q */
    ArrayList<Runnable> f3151q;

    /* renamed from: androidx.fragment.app.p$a */
    /* compiled from: FragmentTransaction */
    static final class C0621a {

        /* renamed from: a */
        int f3152a;

        /* renamed from: b */
        Fragment f3153b;

        /* renamed from: c */
        int f3154c;

        /* renamed from: d */
        int f3155d;

        /* renamed from: e */
        int f3156e;

        /* renamed from: f */
        int f3157f;

        /* renamed from: g */
        C0697n.C0700c f3158g;

        /* renamed from: h */
        C0697n.C0700c f3159h;

        C0621a() {
        }

        C0621a(int i, Fragment fragment) {
            this.f3152a = i;
            this.f3153b = fragment;
            C0697n.C0700c cVar = C0697n.C0700c.RESUMED;
            this.f3158g = cVar;
            this.f3159h = cVar;
        }

        C0621a(int i, Fragment fragment, C0697n.C0700c cVar) {
            this.f3152a = i;
            this.f3153b = fragment;
            this.f3158g = fragment.f2929V;
            this.f3159h = cVar;
        }
    }

    C0620p(C0597f fVar, ClassLoader classLoader) {
    }

    /* renamed from: b */
    public C0620p mo4068b(int i, Fragment fragment) {
        mo3820o(i, fragment, (String) null, 1);
        return this;
    }

    /* renamed from: c */
    public C0620p mo4069c(int i, Fragment fragment, String str) {
        mo3820o(i, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public C0620p mo4070d(ViewGroup viewGroup, Fragment fragment, String str) {
        fragment.f2919L = viewGroup;
        mo4069c(viewGroup.getId(), fragment, str);
        return this;
    }

    /* renamed from: e */
    public C0620p mo4071e(Fragment fragment, String str) {
        mo3820o(0, fragment, str, 1);
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public void mo4072f(C0621a aVar) {
        this.f3135a.add(aVar);
        aVar.f3154c = this.f3136b;
        aVar.f3155d = this.f3137c;
        aVar.f3156e = this.f3138d;
        aVar.f3157f = this.f3139e;
    }

    /* renamed from: g */
    public C0620p mo4073g(String str) {
        if (this.f3142h) {
            this.f3141g = true;
            this.f3143i = str;
            return this;
        }
        throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
    }

    /* renamed from: h */
    public C0620p mo4074h(Fragment fragment) {
        mo4072f(new C0621a(7, fragment));
        return this;
    }

    /* renamed from: i */
    public abstract int mo3815i();

    /* renamed from: j */
    public abstract int mo3816j();

    /* renamed from: k */
    public abstract void mo3817k();

    /* renamed from: l */
    public abstract void mo3818l();

    /* renamed from: m */
    public C0620p mo3819m(Fragment fragment) {
        mo4072f(new C0621a(6, fragment));
        return this;
    }

    /* renamed from: n */
    public C0620p mo4075n() {
        if (!this.f3141g) {
            this.f3142h = false;
            return this;
        }
        throw new IllegalStateException("This transaction is already being added to the back stack");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public void mo3820o(int i, Fragment fragment, String str, int i2) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.f2911D;
            if (str2 == null || str.equals(str2)) {
                fragment.f2911D = str;
            } else {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.f2911D + " now " + str);
            }
        }
        if (i != 0) {
            if (i != -1) {
                int i3 = fragment.f2909B;
                if (i3 == 0 || i3 == i) {
                    fragment.f2909B = i;
                    fragment.f2910C = i;
                } else {
                    throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.f2909B + " now " + i);
                }
            } else {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
        }
        mo4072f(new C0621a(i2, fragment));
    }

    /* renamed from: p */
    public C0620p mo3821p(Fragment fragment) {
        mo4072f(new C0621a(4, fragment));
        return this;
    }

    /* renamed from: q */
    public abstract boolean mo3822q();

    /* renamed from: r */
    public C0620p mo3823r(Fragment fragment) {
        mo4072f(new C0621a(3, fragment));
        return this;
    }

    /* renamed from: s */
    public C0620p mo4076s(int i, Fragment fragment, String str) {
        if (i != 0) {
            mo3820o(i, fragment, str, 2);
            return this;
        }
        throw new IllegalArgumentException("Must use non-zero containerViewId");
    }

    /* renamed from: t */
    public C0620p mo3824t(Fragment fragment, C0697n.C0700c cVar) {
        mo4072f(new C0621a(10, fragment, cVar));
        return this;
    }

    /* renamed from: u */
    public C0620p mo4077u(boolean z) {
        this.f3150p = z;
        return this;
    }

    /* renamed from: v */
    public C0620p mo3826v(Fragment fragment) {
        mo4072f(new C0621a(5, fragment));
        return this;
    }
}
