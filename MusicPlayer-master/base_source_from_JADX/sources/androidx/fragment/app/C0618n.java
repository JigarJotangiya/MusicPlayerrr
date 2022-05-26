package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.C0697n;
import androidx.viewpager.widget.C1184a;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.n */
/* compiled from: FragmentStatePagerAdapter */
public abstract class C0618n extends C1184a {

    /* renamed from: c */
    private final C0602j f3127c;

    /* renamed from: d */
    private final int f3128d;

    /* renamed from: e */
    private C0620p f3129e;

    /* renamed from: f */
    private ArrayList<Fragment.SavedState> f3130f;

    /* renamed from: g */
    private ArrayList<Fragment> f3131g;

    /* renamed from: h */
    private Fragment f3132h;

    @Deprecated
    public C0618n(C0602j jVar) {
        this(jVar, 0);
    }

    /* renamed from: b */
    public void mo4039b(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        if (this.f3129e == null) {
            this.f3129e = this.f3127c.mo3957i();
        }
        while (this.f3130f.size() <= i) {
            this.f3130f.add((Object) null);
        }
        this.f3130f.set(i, fragment.mo3622Q0() ? this.f3127c.mo3937X0(fragment) : null);
        this.f3131g.set(i, (Object) null);
        this.f3129e.mo3823r(fragment);
        if (fragment.equals(this.f3132h)) {
            this.f3132h = null;
        }
    }

    /* renamed from: d */
    public void mo4040d(ViewGroup viewGroup) {
        C0620p pVar = this.f3129e;
        if (pVar != null) {
            try {
                pVar.mo3818l();
            } catch (IllegalStateException unused) {
                this.f3129e.mo3816j();
            }
            this.f3129e = null;
        }
    }

    /* renamed from: j */
    public Object mo4041j(ViewGroup viewGroup, int i) {
        Fragment.SavedState savedState;
        Fragment fragment;
        if (this.f3131g.size() > i && (fragment = this.f3131g.get(i)) != null) {
            return fragment;
        }
        if (this.f3129e == null) {
            this.f3129e = this.f3127c.mo3957i();
        }
        Fragment v = mo4047v(i);
        if (this.f3130f.size() > i && (savedState = this.f3130f.get(i)) != null) {
            v.mo3596H2(savedState);
        }
        while (this.f3131g.size() <= i) {
            this.f3131g.add((Object) null);
        }
        v.mo3599I2(false);
        if (this.f3128d == 0) {
            v.mo3624Q2(false);
        }
        this.f3131g.set(i, v);
        this.f3129e.mo4068b(viewGroup.getId(), v);
        if (this.f3128d == 1) {
            this.f3129e.mo3824t(v, C0697n.C0700c.STARTED);
        }
        return v;
    }

    /* renamed from: k */
    public boolean mo4042k(View view, Object obj) {
        return ((Fragment) obj).mo3600J0() == view;
    }

    /* renamed from: n */
    public void mo4043n(Parcelable parcelable, ClassLoader classLoader) {
        if (parcelable != null) {
            Bundle bundle = (Bundle) parcelable;
            bundle.setClassLoader(classLoader);
            Parcelable[] parcelableArray = bundle.getParcelableArray("states");
            this.f3130f.clear();
            this.f3131g.clear();
            if (parcelableArray != null) {
                for (Parcelable parcelable2 : parcelableArray) {
                    this.f3130f.add((Fragment.SavedState) parcelable2);
                }
            }
            for (String str : bundle.keySet()) {
                if (str.startsWith("f")) {
                    int parseInt = Integer.parseInt(str.substring(1));
                    Fragment e0 = this.f3127c.mo3950e0(bundle, str);
                    if (e0 != null) {
                        while (this.f3131g.size() <= parseInt) {
                            this.f3131g.add((Object) null);
                        }
                        e0.mo3599I2(false);
                        this.f3131g.set(parseInt, e0);
                    } else {
                        Log.w("FragmentStatePagerAdapt", "Bad fragment at key " + str);
                    }
                }
            }
        }
    }

    /* renamed from: o */
    public Parcelable mo4044o() {
        Bundle bundle;
        if (this.f3130f.size() > 0) {
            bundle = new Bundle();
            Fragment.SavedState[] savedStateArr = new Fragment.SavedState[this.f3130f.size()];
            this.f3130f.toArray(savedStateArr);
            bundle.putParcelableArray("states", savedStateArr);
        } else {
            bundle = null;
        }
        for (int i = 0; i < this.f3131g.size(); i++) {
            Fragment fragment = this.f3131g.get(i);
            if (fragment != null && fragment.mo3622Q0()) {
                if (bundle == null) {
                    bundle = new Bundle();
                }
                this.f3127c.mo3924N0(bundle, "f" + i, fragment);
            }
        }
        return bundle;
    }

    /* renamed from: q */
    public void mo4045q(ViewGroup viewGroup, int i, Object obj) {
        Fragment fragment = (Fragment) obj;
        Fragment fragment2 = this.f3132h;
        if (fragment != fragment2) {
            if (fragment2 != null) {
                fragment2.mo3599I2(false);
                if (this.f3128d == 1) {
                    if (this.f3129e == null) {
                        this.f3129e = this.f3127c.mo3957i();
                    }
                    this.f3129e.mo3824t(this.f3132h, C0697n.C0700c.STARTED);
                } else {
                    this.f3132h.mo3624Q2(false);
                }
            }
            fragment.mo3599I2(true);
            if (this.f3128d == 1) {
                if (this.f3129e == null) {
                    this.f3129e = this.f3127c.mo3957i();
                }
                this.f3129e.mo3824t(fragment, C0697n.C0700c.RESUMED);
            } else {
                fragment.mo3624Q2(true);
            }
            this.f3132h = fragment;
        }
    }

    /* renamed from: t */
    public void mo4046t(ViewGroup viewGroup) {
        if (viewGroup.getId() == -1) {
            throw new IllegalStateException("ViewPager with adapter " + this + " requires a view id");
        }
    }

    /* renamed from: v */
    public abstract Fragment mo4047v(int i);

    public C0618n(C0602j jVar, int i) {
        this.f3129e = null;
        this.f3130f = new ArrayList<>();
        this.f3131g = new ArrayList<>();
        this.f3132h = null;
        this.f3127c = jVar;
        this.f3128d = i;
    }
}
