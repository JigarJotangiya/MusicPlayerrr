package com.google.android.material.tabs;

import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.material.tabs.c */
/* compiled from: TabLayoutMediator */
public final class C6210c {

    /* renamed from: a */
    private final TabLayout f28975a;

    /* renamed from: b */
    private final ViewPager2 f28976b;

    /* renamed from: c */
    private final boolean f28977c;

    /* renamed from: d */
    private final boolean f28978d;

    /* renamed from: e */
    private final C6212b f28979e;

    /* renamed from: f */
    private RecyclerView.C0797h<?> f28980f;

    /* renamed from: g */
    private boolean f28981g;

    /* renamed from: h */
    private C6213c f28982h;

    /* renamed from: i */
    private TabLayout.C6198d f28983i;

    /* renamed from: j */
    private RecyclerView.C0800j f28984j;

    /* renamed from: com.google.android.material.tabs.c$a */
    /* compiled from: TabLayoutMediator */
    private class C6211a extends RecyclerView.C0800j {
        C6211a() {
        }

        /* renamed from: a */
        public void mo4834a() {
            C6210c.this.mo24837b();
        }

        /* renamed from: b */
        public void mo4835b(int i, int i2) {
            C6210c.this.mo24837b();
        }

        /* renamed from: c */
        public void mo4836c(int i, int i2, Object obj) {
            C6210c.this.mo24837b();
        }

        /* renamed from: d */
        public void mo4837d(int i, int i2) {
            C6210c.this.mo24837b();
        }

        /* renamed from: e */
        public void mo4838e(int i, int i2, int i3) {
            C6210c.this.mo24837b();
        }

        /* renamed from: f */
        public void mo4839f(int i, int i2) {
            C6210c.this.mo24837b();
        }
    }

    /* renamed from: com.google.android.material.tabs.c$b */
    /* compiled from: TabLayoutMediator */
    public interface C6212b {
        /* renamed from: a */
        void mo24838a(TabLayout.C6203g gVar, int i);
    }

    /* renamed from: com.google.android.material.tabs.c$c */
    /* compiled from: TabLayoutMediator */
    private static class C6213c extends ViewPager2.C1205i {

        /* renamed from: a */
        private final WeakReference<TabLayout> f28986a;

        /* renamed from: b */
        private int f28987b;

        /* renamed from: c */
        private int f28988c;

        C6213c(TabLayout tabLayout) {
            this.f28986a = new WeakReference<>(tabLayout);
            mo24839d();
        }

        /* renamed from: a */
        public void mo6322a(int i) {
            this.f28987b = this.f28988c;
            this.f28988c = i;
        }

        /* renamed from: b */
        public void mo6387b(int i, float f, int i2) {
            TabLayout tabLayout = (TabLayout) this.f28986a.get();
            if (tabLayout != null) {
                int i3 = this.f28988c;
                boolean z = false;
                boolean z2 = i3 != 2 || this.f28987b == 1;
                if (!(i3 == 2 && this.f28987b == 0)) {
                    z = true;
                }
                tabLayout.mo24727J(i, f, z2, z);
            }
        }

        /* renamed from: c */
        public void mo6323c(int i) {
            TabLayout tabLayout = (TabLayout) this.f28986a.get();
            if (tabLayout != null && tabLayout.getSelectedTabPosition() != i && i < tabLayout.getTabCount()) {
                int i2 = this.f28988c;
                tabLayout.mo24724G(tabLayout.mo24783x(i), i2 == 0 || (i2 == 2 && this.f28987b == 0));
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo24839d() {
            this.f28988c = 0;
            this.f28987b = 0;
        }
    }

    /* renamed from: com.google.android.material.tabs.c$d */
    /* compiled from: TabLayoutMediator */
    private static class C6214d implements TabLayout.C6198d {

        /* renamed from: a */
        private final ViewPager2 f28989a;

        /* renamed from: b */
        private final boolean f28990b;

        C6214d(ViewPager2 viewPager2, boolean z) {
            this.f28989a = viewPager2;
            this.f28990b = z;
        }

        /* renamed from: a */
        public void mo24788a(TabLayout.C6203g gVar) {
        }

        /* renamed from: b */
        public void mo24789b(TabLayout.C6203g gVar) {
            this.f28989a.mo6343j(gVar.mo24806g(), this.f28990b);
        }

        /* renamed from: c */
        public void mo24790c(TabLayout.C6203g gVar) {
        }
    }

    public C6210c(TabLayout tabLayout, ViewPager2 viewPager2, C6212b bVar) {
        this(tabLayout, viewPager2, true, bVar);
    }

    /* renamed from: a */
    public void mo24836a() {
        if (!this.f28981g) {
            RecyclerView.C0797h<?> adapter = this.f28976b.getAdapter();
            this.f28980f = adapter;
            if (adapter != null) {
                this.f28981g = true;
                C6213c cVar = new C6213c(this.f28975a);
                this.f28982h = cVar;
                this.f28976b.mo6333g(cVar);
                C6214d dVar = new C6214d(this.f28976b, this.f28978d);
                this.f28983i = dVar;
                this.f28975a.mo24736d(dVar);
                if (this.f28977c) {
                    C6211a aVar = new C6211a();
                    this.f28984j = aVar;
                    this.f28980f.registerAdapterDataObserver(aVar);
                }
                mo24837b();
                this.f28975a.mo24726I(this.f28976b.getCurrentItem(), 0.0f, true);
                return;
            }
            throw new IllegalStateException("TabLayoutMediator attached before ViewPager2 has an adapter");
        }
        throw new IllegalStateException("TabLayoutMediator is already attached");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo24837b() {
        int min;
        this.f28975a.mo24721C();
        RecyclerView.C0797h<?> hVar = this.f28980f;
        if (hVar != null) {
            int itemCount = hVar.getItemCount();
            for (int i = 0; i < itemCount; i++) {
                TabLayout.C6203g z = this.f28975a.mo24785z();
                this.f28979e.mo24838a(z, i);
                this.f28975a.mo24739g(z, false);
            }
            if (itemCount > 0 && (min = Math.min(this.f28976b.getCurrentItem(), this.f28975a.getTabCount() - 1)) != this.f28975a.getSelectedTabPosition()) {
                TabLayout tabLayout = this.f28975a;
                tabLayout.mo24723F(tabLayout.mo24783x(min));
            }
        }
    }

    public C6210c(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, C6212b bVar) {
        this(tabLayout, viewPager2, z, true, bVar);
    }

    public C6210c(TabLayout tabLayout, ViewPager2 viewPager2, boolean z, boolean z2, C6212b bVar) {
        this.f28975a = tabLayout;
        this.f28976b = viewPager2;
        this.f28977c = z;
        this.f28978d = z2;
        this.f28979e = bVar;
    }
}
