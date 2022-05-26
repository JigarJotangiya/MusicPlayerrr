package androidx.viewpager2.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.C0602j;
import androidx.fragment.app.C0620p;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.C0697n;
import androidx.lifecycle.C0715s;
import androidx.lifecycle.C0718v;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import p082e.p098e.C3467b;
import p082e.p098e.C3470d;
import p082e.p109h.p118o.C3703i;
import p082e.p109h.p119p.C3774v;

public abstract class FragmentStateAdapter extends RecyclerView.C0797h<C1194a> implements C1195b {

    /* renamed from: a */
    final C0697n f4886a;

    /* renamed from: b */
    final C0602j f4887b;

    /* renamed from: c */
    final C3470d<Fragment> f4888c;

    /* renamed from: d */
    private final C3470d<Fragment.SavedState> f4889d;

    /* renamed from: e */
    private final C3470d<Integer> f4890e;

    /* renamed from: f */
    private FragmentMaxLifecycleEnforcer f4891f;

    /* renamed from: g */
    boolean f4892g;

    /* renamed from: h */
    private boolean f4893h;

    class FragmentMaxLifecycleEnforcer {

        /* renamed from: a */
        private ViewPager2.C1205i f4898a;

        /* renamed from: b */
        private RecyclerView.C0800j f4899b;

        /* renamed from: c */
        private C0715s f4900c;

        /* renamed from: d */
        private ViewPager2 f4901d;

        /* renamed from: e */
        private long f4902e = -1;

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$a */
        class C1188a extends ViewPager2.C1205i {
            C1188a() {
            }

            /* renamed from: a */
            public void mo6322a(int i) {
                FragmentMaxLifecycleEnforcer.this.mo6321d(false);
            }

            /* renamed from: c */
            public void mo6323c(int i) {
                FragmentMaxLifecycleEnforcer.this.mo6321d(false);
            }
        }

        /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$FragmentMaxLifecycleEnforcer$b */
        class C1189b extends C1193d {
            C1189b() {
                super((C1190a) null);
            }

            /* renamed from: a */
            public void mo4834a() {
                FragmentMaxLifecycleEnforcer.this.mo6321d(true);
            }
        }

        FragmentMaxLifecycleEnforcer() {
        }

        /* renamed from: a */
        private ViewPager2 m6694a(RecyclerView recyclerView) {
            ViewParent parent = recyclerView.getParent();
            if (parent instanceof ViewPager2) {
                return (ViewPager2) parent;
            }
            throw new IllegalStateException("Expected ViewPager2 instance. Got: " + parent);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo6319b(RecyclerView recyclerView) {
            ViewPager2 a = m6694a(recyclerView);
            this.f4901d = a;
            C1188a aVar = new C1188a();
            this.f4898a = aVar;
            a.mo6333g(aVar);
            C1189b bVar = new C1189b();
            this.f4899b = bVar;
            FragmentStateAdapter.this.registerAdapterDataObserver(bVar);
            C11873 r2 = new C0715s() {
                /* renamed from: c */
                public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                    FragmentMaxLifecycleEnforcer.this.mo6321d(false);
                }
            };
            this.f4900c = r2;
            FragmentStateAdapter.this.f4886a.mo4256a(r2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo6320c(RecyclerView recyclerView) {
            m6694a(recyclerView).mo6345n(this.f4898a);
            FragmentStateAdapter.this.unregisterAdapterDataObserver(this.f4899b);
            FragmentStateAdapter.this.f4886a.mo4258c(this.f4900c);
            this.f4901d = null;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo6321d(boolean z) {
            int currentItem;
            Fragment h;
            if (!FragmentStateAdapter.this.mo6318v() && this.f4901d.getScrollState() == 0 && !FragmentStateAdapter.this.f4888c.mo12307k() && FragmentStateAdapter.this.getItemCount() != 0 && (currentItem = this.f4901d.getCurrentItem()) < FragmentStateAdapter.this.getItemCount()) {
                long itemId = FragmentStateAdapter.this.getItemId(currentItem);
                if ((itemId != this.f4902e || z) && (h = FragmentStateAdapter.this.f4888c.mo12304h(itemId)) != null && h.mo3622Q0()) {
                    this.f4902e = itemId;
                    C0620p i = FragmentStateAdapter.this.f4887b.mo3957i();
                    Fragment fragment = null;
                    for (int i2 = 0; i2 < FragmentStateAdapter.this.f4888c.mo12312q(); i2++) {
                        long l = FragmentStateAdapter.this.f4888c.mo12308l(i2);
                        Fragment r = FragmentStateAdapter.this.f4888c.mo12313r(i2);
                        if (r.mo3622Q0()) {
                            if (l != this.f4902e) {
                                i.mo3824t(r, C0697n.C0700c.STARTED);
                            } else {
                                fragment = r;
                            }
                            r.mo3599I2(l == this.f4902e);
                        }
                    }
                    if (fragment != null) {
                        i.mo3824t(fragment, C0697n.C0700c.RESUMED);
                    }
                    if (!i.mo3822q()) {
                        i.mo3817k();
                    }
                }
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$a */
    class C1190a implements View.OnLayoutChangeListener {

        /* renamed from: a */
        final /* synthetic */ FrameLayout f4907a;

        /* renamed from: b */
        final /* synthetic */ C1194a f4908b;

        C1190a(FrameLayout frameLayout, C1194a aVar) {
            this.f4907a = frameLayout;
            this.f4908b = aVar;
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (this.f4907a.getParent() != null) {
                this.f4907a.removeOnLayoutChangeListener(this);
                FragmentStateAdapter.this.mo6317r(this.f4908b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$b */
    class C1191b extends C0602j.C0608f {

        /* renamed from: a */
        final /* synthetic */ Fragment f4910a;

        /* renamed from: b */
        final /* synthetic */ FrameLayout f4911b;

        C1191b(Fragment fragment, FrameLayout frameLayout) {
            this.f4910a = fragment;
            this.f4911b = frameLayout;
        }

        /* renamed from: m */
        public void mo4000m(C0602j jVar, Fragment fragment, View view, Bundle bundle) {
            if (fragment == this.f4910a) {
                jVar.mo3954g1(this);
                FragmentStateAdapter.this.mo6308c(view, this.f4911b);
            }
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$c */
    class C1192c implements Runnable {
        C1192c() {
        }

        public void run() {
            FragmentStateAdapter fragmentStateAdapter = FragmentStateAdapter.this;
            fragmentStateAdapter.f4892g = false;
            fragmentStateAdapter.mo6311h();
        }
    }

    /* renamed from: androidx.viewpager2.adapter.FragmentStateAdapter$d */
    private static abstract class C1193d extends RecyclerView.C0800j {
        private C1193d() {
        }

        /* renamed from: b */
        public final void mo4835b(int i, int i2) {
            mo4834a();
        }

        /* renamed from: c */
        public final void mo4836c(int i, int i2, Object obj) {
            mo4834a();
        }

        /* renamed from: d */
        public final void mo4837d(int i, int i2) {
            mo4834a();
        }

        /* renamed from: e */
        public final void mo4838e(int i, int i2, int i3) {
            mo4834a();
        }

        /* renamed from: f */
        public final void mo4839f(int i, int i2) {
            mo4834a();
        }

        /* synthetic */ C1193d(C1190a aVar) {
            this();
        }
    }

    public FragmentStateAdapter(FragmentActivity fragmentActivity) {
        this(fragmentActivity.mo3730H1(), fragmentActivity.mo390v());
    }

    /* renamed from: f */
    private static String m6670f(String str, long j) {
        return str + j;
    }

    /* renamed from: g */
    private void m6671g(int i) {
        long itemId = getItemId(i);
        if (!this.f4888c.mo12302e(itemId)) {
            Fragment e = mo6310e(i);
            e.mo3596H2(this.f4889d.mo12304h(itemId));
            this.f4888c.mo12309m(itemId, e);
        }
    }

    /* renamed from: i */
    private boolean m6672i(long j) {
        View J0;
        if (this.f4890e.mo12302e(j)) {
            return true;
        }
        Fragment h = this.f4888c.mo12304h(j);
        if (h == null || (J0 = h.mo3600J0()) == null || J0.getParent() == null) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static boolean m6673j(String str, String str2) {
        return str.startsWith(str2) && str.length() > str2.length();
    }

    /* renamed from: k */
    private Long m6674k(int i) {
        Long l = null;
        for (int i2 = 0; i2 < this.f4890e.mo12312q(); i2++) {
            if (this.f4890e.mo12313r(i2).intValue() == i) {
                if (l == null) {
                    l = Long.valueOf(this.f4890e.mo12308l(i2));
                } else {
                    throw new IllegalStateException("Design assumption violated: a ViewHolder can only be bound to one item at a time.");
                }
            }
        }
        return l;
    }

    /* renamed from: q */
    private static long m6675q(String str, String str2) {
        return Long.parseLong(str.substring(str2.length()));
    }

    /* renamed from: s */
    private void m6676s(long j) {
        ViewParent parent;
        Fragment h = this.f4888c.mo12304h(j);
        if (h != null) {
            if (!(h.mo3600J0() == null || (parent = h.mo3600J0().getParent()) == null)) {
                ((FrameLayout) parent).removeAllViews();
            }
            if (!mo6309d(j)) {
                this.f4889d.mo12310n(j);
            }
            if (!h.mo3622Q0()) {
                this.f4888c.mo12310n(j);
            } else if (mo6318v()) {
                this.f4893h = true;
            } else {
                if (h.mo3622Q0() && mo6309d(j)) {
                    this.f4889d.mo12309m(j, this.f4887b.mo3937X0(h));
                }
                C0620p i = this.f4887b.mo3957i();
                i.mo3823r(h);
                i.mo3817k();
                this.f4888c.mo12310n(j);
            }
        }
    }

    /* renamed from: t */
    private void m6677t() {
        final Handler handler = new Handler(Looper.getMainLooper());
        final C1192c cVar = new C1192c();
        this.f4886a.mo4256a(new C0715s(this) {
            /* renamed from: c */
            public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                if (bVar == C0697n.C0699b.ON_DESTROY) {
                    handler.removeCallbacks(cVar);
                    vVar.mo390v().mo4258c(this);
                }
            }
        });
        handler.postDelayed(cVar, 10000);
    }

    /* renamed from: u */
    private void m6678u(Fragment fragment, FrameLayout frameLayout) {
        this.f4887b.mo3926O0(new C1191b(fragment, frameLayout), false);
    }

    /* renamed from: a */
    public final Parcelable mo6306a() {
        Bundle bundle = new Bundle(this.f4888c.mo12312q() + this.f4889d.mo12312q());
        for (int i = 0; i < this.f4888c.mo12312q(); i++) {
            long l = this.f4888c.mo12308l(i);
            Fragment h = this.f4888c.mo12304h(l);
            if (h != null && h.mo3622Q0()) {
                this.f4887b.mo3924N0(bundle, m6670f("f#", l), h);
            }
        }
        for (int i2 = 0; i2 < this.f4889d.mo12312q(); i2++) {
            long l2 = this.f4889d.mo12308l(i2);
            if (mo6309d(l2)) {
                bundle.putParcelable(m6670f("s#", l2), this.f4889d.mo12304h(l2));
            }
        }
        return bundle;
    }

    /* renamed from: b */
    public final void mo6307b(Parcelable parcelable) {
        if (!this.f4889d.mo12307k() || !this.f4888c.mo12307k()) {
            throw new IllegalStateException("Expected the adapter to be 'fresh' while restoring state.");
        }
        Bundle bundle = (Bundle) parcelable;
        if (bundle.getClassLoader() == null) {
            bundle.setClassLoader(getClass().getClassLoader());
        }
        for (String str : bundle.keySet()) {
            if (m6673j(str, "f#")) {
                this.f4888c.mo12309m(m6675q(str, "f#"), this.f4887b.mo3950e0(bundle, str));
            } else if (m6673j(str, "s#")) {
                long q = m6675q(str, "s#");
                Fragment.SavedState savedState = (Fragment.SavedState) bundle.getParcelable(str);
                if (mo6309d(q)) {
                    this.f4889d.mo12309m(q, savedState);
                }
            } else {
                throw new IllegalArgumentException("Unexpected key in savedState: " + str);
            }
        }
        if (!this.f4888c.mo12307k()) {
            this.f4893h = true;
            this.f4892g = true;
            mo6311h();
            m6677t();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6308c(View view, FrameLayout frameLayout) {
        if (frameLayout.getChildCount() > 1) {
            throw new IllegalStateException("Design assumption violated.");
        } else if (view.getParent() != frameLayout) {
            if (frameLayout.getChildCount() > 0) {
                frameLayout.removeAllViews();
            }
            if (view.getParent() != null) {
                ((ViewGroup) view.getParent()).removeView(view);
            }
            frameLayout.addView(view);
        }
    }

    /* renamed from: d */
    public boolean mo6309d(long j) {
        return j >= 0 && j < ((long) getItemCount());
    }

    /* renamed from: e */
    public abstract Fragment mo6310e(int i);

    public long getItemId(int i) {
        return (long) i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public void mo6311h() {
        if (this.f4893h && !mo6318v()) {
            C3467b<Long> bVar = new C3467b<>();
            for (int i = 0; i < this.f4888c.mo12312q(); i++) {
                long l = this.f4888c.mo12308l(i);
                if (!mo6309d(l)) {
                    bVar.add(Long.valueOf(l));
                    this.f4890e.mo12310n(l);
                }
            }
            if (!this.f4892g) {
                this.f4893h = false;
                for (int i2 = 0; i2 < this.f4888c.mo12312q(); i2++) {
                    long l2 = this.f4888c.mo12308l(i2);
                    if (!m6672i(l2)) {
                        bVar.add(Long.valueOf(l2));
                    }
                }
            }
            for (Long longValue : bVar) {
                m6676s(longValue.longValue());
            }
        }
    }

    /* renamed from: l */
    public final void onBindViewHolder(C1194a aVar, int i) {
        long itemId = aVar.getItemId();
        int id = aVar.mo6326b().getId();
        Long k = m6674k(id);
        if (!(k == null || k.longValue() == itemId)) {
            m6676s(k.longValue());
            this.f4890e.mo12310n(k.longValue());
        }
        this.f4890e.mo12309m(itemId, Integer.valueOf(id));
        m6671g(i);
        FrameLayout b = aVar.mo6326b();
        if (C3774v.m16180S(b)) {
            if (b.getParent() == null) {
                b.addOnLayoutChangeListener(new C1190a(b, aVar));
            } else {
                throw new IllegalStateException("Design assumption violated.");
            }
        }
        mo6311h();
    }

    /* renamed from: m */
    public final C1194a onCreateViewHolder(ViewGroup viewGroup, int i) {
        return C1194a.m6708a(viewGroup);
    }

    /* renamed from: n */
    public final boolean onFailedToRecycleView(C1194a aVar) {
        return true;
    }

    /* renamed from: o */
    public final void onViewAttachedToWindow(C1194a aVar) {
        mo6317r(aVar);
        mo6311h();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C3703i.m15824a(this.f4891f == null);
        FragmentMaxLifecycleEnforcer fragmentMaxLifecycleEnforcer = new FragmentMaxLifecycleEnforcer();
        this.f4891f = fragmentMaxLifecycleEnforcer;
        fragmentMaxLifecycleEnforcer.mo6319b(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        this.f4891f.mo6320c(recyclerView);
        this.f4891f = null;
    }

    /* renamed from: p */
    public final void onViewRecycled(C1194a aVar) {
        Long k = m6674k(aVar.mo6326b().getId());
        if (k != null) {
            m6676s(k.longValue());
            this.f4890e.mo12310n(k.longValue());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public void mo6317r(final C1194a aVar) {
        Fragment h = this.f4888c.mo12304h(aVar.getItemId());
        if (h != null) {
            FrameLayout b = aVar.mo6326b();
            View J0 = h.mo3600J0();
            if (!h.mo3622Q0() && J0 != null) {
                throw new IllegalStateException("Design assumption violated.");
            } else if (h.mo3622Q0() && J0 == null) {
                m6678u(h, b);
            } else if (!h.mo3622Q0() || J0.getParent() == null) {
                if (h.mo3622Q0()) {
                    mo6308c(J0, b);
                } else if (!mo6318v()) {
                    m6678u(h, b);
                    C0620p i = this.f4887b.mo3957i();
                    i.mo4071e(h, "f" + aVar.getItemId());
                    i.mo3824t(h, C0697n.C0700c.STARTED);
                    i.mo3817k();
                    this.f4891f.mo6321d(false);
                } else if (!this.f4887b.mo3968q0()) {
                    this.f4886a.mo4256a(new C0715s() {
                        /* renamed from: c */
                        public void mo393c(C0718v vVar, C0697n.C0699b bVar) {
                            if (!FragmentStateAdapter.this.mo6318v()) {
                                vVar.mo390v().mo4258c(this);
                                if (C3774v.m16180S(aVar.mo6326b())) {
                                    FragmentStateAdapter.this.mo6317r(aVar);
                                }
                            }
                        }
                    });
                }
            } else if (J0.getParent() != b) {
                mo6308c(J0, b);
            }
        } else {
            throw new IllegalStateException("Design assumption violated.");
        }
    }

    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Stable Ids are required for the adapter to function properly, and the adapter takes care of setting the flag.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public boolean mo6318v() {
        return this.f4887b.mo3977v0();
    }

    public FragmentStateAdapter(C0602j jVar, C0697n nVar) {
        this.f4888c = new C3470d<>();
        this.f4889d = new C3470d<>();
        this.f4890e = new C3470d<>();
        this.f4892g = false;
        this.f4893h = false;
        this.f4887b = jVar;
        this.f4886a = nVar;
        super.setHasStableIds(true);
    }
}
