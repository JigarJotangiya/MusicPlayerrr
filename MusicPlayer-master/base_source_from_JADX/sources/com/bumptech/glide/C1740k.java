package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.bumptech.glide.load.p030n.C1873j;
import com.bumptech.glide.load.p036p.p041h.C2070c;
import com.bumptech.glide.manager.C2103c;
import com.bumptech.glide.manager.C2105d;
import com.bumptech.glide.manager.C2114l;
import com.bumptech.glide.manager.C2115m;
import com.bumptech.glide.manager.C2120p;
import com.bumptech.glide.manager.C2121q;
import com.bumptech.glide.manager.C2124s;
import com.bumptech.glide.p047q.C2147d;
import com.bumptech.glide.p047q.C2152g;
import com.bumptech.glide.p047q.C2153h;
import com.bumptech.glide.p047q.p048l.C2166i;
import com.bumptech.glide.p051s.C2194k;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: com.bumptech.glide.k */
/* compiled from: RequestManager */
public class C1740k implements ComponentCallbacks2, C2115m {

    /* renamed from: r */
    private static final C2153h f6500r;

    /* renamed from: g */
    protected final C1719b f6501g;

    /* renamed from: h */
    protected final Context f6502h;

    /* renamed from: i */
    final C2114l f6503i;

    /* renamed from: j */
    private final C2121q f6504j;

    /* renamed from: k */
    private final C2120p f6505k;

    /* renamed from: l */
    private final C2124s f6506l;

    /* renamed from: m */
    private final Runnable f6507m;

    /* renamed from: n */
    private final C2103c f6508n;

    /* renamed from: o */
    private final CopyOnWriteArrayList<C2152g<Object>> f6509o;

    /* renamed from: p */
    private C2153h f6510p;

    /* renamed from: q */
    private boolean f6511q;

    /* renamed from: com.bumptech.glide.k$a */
    /* compiled from: RequestManager */
    class C1741a implements Runnable {
        C1741a() {
        }

        public void run() {
            C1740k kVar = C1740k.this;
            kVar.f6503i.mo8271a(kVar);
        }
    }

    /* renamed from: com.bumptech.glide.k$b */
    /* compiled from: RequestManager */
    private class C1742b implements C2103c.C2104a {

        /* renamed from: a */
        private final C2121q f6513a;

        C1742b(C2121q qVar) {
            this.f6513a = qVar;
        }

        /* renamed from: a */
        public void mo7672a(boolean z) {
            if (z) {
                synchronized (C1740k.this) {
                    this.f6513a.mo8297e();
                }
            }
        }
    }

    static {
        C2153h o0 = C2153h.m10109o0(Bitmap.class);
        o0.mo8369R();
        f6500r = o0;
        C2153h o02 = C2153h.m10109o0(C2070c.class);
        o02.mo8369R();
        C2153h hVar = o02;
        C2153h hVar2 = (C2153h) ((C2153h) C2153h.m10110p0(C1873j.f6767b).mo8378b0(C1730g.LOW)).mo8390i0(true);
    }

    public C1740k(C1719b bVar, C2114l lVar, C2120p pVar, Context context) {
        this(bVar, lVar, pVar, new C2121q(), bVar.mo7585g(), context);
    }

    /* renamed from: C */
    private void m8670C(C2166i<?> iVar) {
        boolean B = mo7647B(iVar);
        C2147d j = iVar.mo8436j();
        if (!B && !this.f6501g.mo7594p(iVar) && j != null) {
            iVar.mo8429e((C2147d) null);
            j.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: A */
    public synchronized void mo7646A(C2166i<?> iVar, C2147d dVar) {
        this.f6506l.mo8310m(iVar);
        this.f6504j.mo8299g(dVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public synchronized boolean mo7647B(C2166i<?> iVar) {
        C2147d j = iVar.mo8436j();
        if (j == null) {
            return true;
        }
        if (!this.f6504j.mo8293a(j)) {
            return false;
        }
        this.f6506l.mo8311n(iVar);
        iVar.mo8429e((C2147d) null);
        return true;
    }

    /* renamed from: a */
    public synchronized void mo7648a() {
        mo7669y();
        this.f6506l.mo7648a();
    }

    /* renamed from: d */
    public <ResourceType> C1738j<ResourceType> mo7649d(Class<ResourceType> cls) {
        return new C1738j<>(this.f6501g, this, cls, this.f6502h);
    }

    /* renamed from: g */
    public synchronized void mo7650g() {
        mo7668x();
        this.f6506l.mo7650g();
    }

    /* renamed from: h */
    public C1738j<Bitmap> mo7651h() {
        return mo7649d(Bitmap.class).mo7637a(f6500r);
    }

    /* renamed from: m */
    public C1738j<Drawable> mo7652m() {
        return mo7649d(Drawable.class);
    }

    /* renamed from: n */
    public void mo7653n(C2166i<?> iVar) {
        if (iVar != null) {
            m8670C(iVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: o */
    public List<C2152g<Object>> mo7654o() {
        return this.f6509o;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public synchronized void onDestroy() {
        this.f6506l.onDestroy();
        for (C2166i<?> n : this.f6506l.mo8309h()) {
            mo7653n(n);
        }
        this.f6506l.mo8308d();
        this.f6504j.mo8294b();
        this.f6503i.mo8272b(this);
        this.f6503i.mo8272b(this.f6508n);
        C2194k.m10292v(this.f6507m);
        this.f6501g.mo7596s(this);
    }

    public void onLowMemory() {
    }

    public void onTrimMemory(int i) {
        if (i == 60 && this.f6511q) {
            mo7667w();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public synchronized C2153h mo7659p() {
        return this.f6510p;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public <T> C1743l<?, T> mo7660q(Class<T> cls) {
        return this.f6501g.mo7587i().mo7604e(cls);
    }

    /* renamed from: r */
    public C1738j<Drawable> mo7661r(Uri uri) {
        return mo7652m().mo7630C0(uri);
    }

    /* renamed from: s */
    public C1738j<Drawable> mo7662s(Integer num) {
        return mo7652m().mo7631D0(num);
    }

    /* renamed from: t */
    public C1738j<Drawable> mo7663t(Object obj) {
        return mo7652m().mo7632E0(obj);
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f6504j + ", treeNode=" + this.f6505k + "}";
    }

    /* renamed from: u */
    public C1738j<Drawable> mo7665u(String str) {
        return mo7652m().mo7633F0(str);
    }

    /* renamed from: v */
    public synchronized void mo7666v() {
        this.f6504j.mo8295c();
    }

    /* renamed from: w */
    public synchronized void mo7667w() {
        mo7666v();
        for (C1740k v : this.f6505k.mo8269a()) {
            v.mo7666v();
        }
    }

    /* renamed from: x */
    public synchronized void mo7668x() {
        this.f6504j.mo8296d();
    }

    /* renamed from: y */
    public synchronized void mo7669y() {
        this.f6504j.mo8298f();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public synchronized void mo7670z(C2153h hVar) {
        C2153h hVar2 = (C2153h) hVar.clone();
        hVar2.mo8377b();
        this.f6510p = hVar2;
    }

    C1740k(C1719b bVar, C2114l lVar, C2120p pVar, C2121q qVar, C2105d dVar, Context context) {
        this.f6506l = new C2124s();
        C1741a aVar = new C1741a();
        this.f6507m = aVar;
        this.f6501g = bVar;
        this.f6503i = lVar;
        this.f6505k = pVar;
        this.f6504j = qVar;
        this.f6502h = context;
        C2103c a = dVar.mo8276a(context.getApplicationContext(), new C1742b(qVar));
        this.f6508n = a;
        if (C2194k.m10287q()) {
            C2194k.m10291u(aVar);
        } else {
            lVar.mo8271a(this);
        }
        lVar.mo8271a(a);
        this.f6509o = new CopyOnWriteArrayList<>(bVar.mo7587i().mo7602c());
        mo7670z(bVar.mo7587i().mo7603d());
        bVar.mo7590o(this);
    }
}
