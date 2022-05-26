package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3024o1;
import com.google.android.gms.common.util.C3359d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jl0 implements C5565sn {

    /* renamed from: a */
    private final Object f18512a = new Object();

    /* renamed from: b */
    private final C3024o1 f18513b;

    /* renamed from: c */
    private final hl0 f18514c;

    /* renamed from: d */
    final gl0 f18515d;

    /* renamed from: e */
    final HashSet<zk0> f18516e = new HashSet<>();

    /* renamed from: f */
    final HashSet<il0> f18517f = new HashSet<>();

    /* renamed from: g */
    private boolean f18518g = false;

    public jl0(String str, C3024o1 o1Var) {
        this.f18515d = new gl0(str, o1Var);
        this.f18513b = o1Var;
        this.f18514c = new hl0();
    }

    /* renamed from: B */
    public final void mo17587B(boolean z) {
        long a = C2971s.m13198a().mo11988a();
        if (z) {
            if (a - this.f18513b.mo11084b() > ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22283A0)).longValue()) {
                this.f18515d.f17177d = -1;
            } else {
                this.f18515d.f17177d = this.f18513b.mo11082a();
            }
            this.f18518g = true;
            return;
        }
        this.f18513b.mo11083a0(a);
        this.f18513b.mo11091e0(this.f18515d.f17177d);
    }

    /* renamed from: a */
    public final zk0 mo18652a(C3359d dVar, String str) {
        return new zk0(dVar, this, this.f18514c.mo18166a(), str);
    }

    /* renamed from: b */
    public final void mo18653b(zk0 zk0) {
        synchronized (this.f18512a) {
            this.f18516e.add(zk0);
        }
    }

    /* renamed from: c */
    public final void mo18654c() {
        synchronized (this.f18512a) {
            this.f18515d.mo17967b();
        }
    }

    /* renamed from: d */
    public final void mo18655d() {
        synchronized (this.f18512a) {
            this.f18515d.mo17968c();
        }
    }

    /* renamed from: e */
    public final void mo18656e() {
        synchronized (this.f18512a) {
            this.f18515d.mo17969d();
        }
    }

    /* renamed from: f */
    public final void mo18657f() {
        synchronized (this.f18512a) {
            this.f18515d.mo17970e();
        }
    }

    /* renamed from: g */
    public final void mo18658g(zzbfd zzbfd, long j) {
        synchronized (this.f18512a) {
            this.f18515d.mo17971f(zzbfd, j);
        }
    }

    /* renamed from: h */
    public final void mo18659h(HashSet<zk0> hashSet) {
        synchronized (this.f18512a) {
            this.f18516e.addAll(hashSet);
        }
    }

    /* renamed from: i */
    public final boolean mo18660i() {
        return this.f18518g;
    }

    /* renamed from: j */
    public final Bundle mo18661j(Context context, tq2 tq2) {
        HashSet hashSet = new HashSet();
        synchronized (this.f18512a) {
            hashSet.addAll(this.f18516e);
            this.f18516e.clear();
        }
        Bundle bundle = new Bundle();
        bundle.putBundle("app", this.f18515d.mo17966a(context, this.f18514c.mo18167b()));
        Bundle bundle2 = new Bundle();
        Iterator<il0> it = this.f18517f.iterator();
        if (!it.hasNext()) {
            bundle.putBundle("slots", bundle2);
            ArrayList arrayList = new ArrayList();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                arrayList.add(((zk0) it2.next()).mo22372a());
            }
            bundle.putParcelableArrayList("ads", arrayList);
            tq2.mo21142b(hashSet);
            return bundle;
        }
        il0 next = it.next();
        throw null;
    }
}
