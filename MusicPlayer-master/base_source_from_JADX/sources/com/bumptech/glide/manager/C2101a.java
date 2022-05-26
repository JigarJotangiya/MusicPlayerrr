package com.bumptech.glide.manager;

import com.bumptech.glide.p051s.C2194k;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.a */
/* compiled from: ActivityFragmentLifecycle */
class C2101a implements C2114l {

    /* renamed from: a */
    private final Set<C2115m> f7210a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private boolean f7211b;

    /* renamed from: c */
    private boolean f7212c;

    C2101a() {
    }

    /* renamed from: a */
    public void mo8271a(C2115m mVar) {
        this.f7210a.add(mVar);
        if (this.f7212c) {
            mVar.onDestroy();
        } else if (this.f7211b) {
            mVar.mo7648a();
        } else {
            mVar.mo7650g();
        }
    }

    /* renamed from: b */
    public void mo8272b(C2115m mVar) {
        this.f7210a.remove(mVar);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo8273c() {
        this.f7212c = true;
        for (T onDestroy : C2194k.m10280j(this.f7210a)) {
            onDestroy.onDestroy();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public void mo8274d() {
        this.f7211b = true;
        for (T a : C2194k.m10280j(this.f7210a)) {
            a.mo7648a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public void mo8275e() {
        this.f7211b = false;
        for (T g : C2194k.m10280j(this.f7210a)) {
            g.mo7650g();
        }
    }
}
