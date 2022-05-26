package com.bumptech.glide.manager;

import com.bumptech.glide.p047q.p048l.C2166i;
import com.bumptech.glide.p051s.C2194k;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.s */
/* compiled from: TargetTracker */
public final class C2124s implements C2115m {

    /* renamed from: g */
    private final Set<C2166i<?>> f7239g = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: a */
    public void mo7648a() {
        for (T a : C2194k.m10280j(this.f7239g)) {
            a.mo7648a();
        }
    }

    /* renamed from: d */
    public void mo8308d() {
        this.f7239g.clear();
    }

    /* renamed from: g */
    public void mo7650g() {
        for (T g : C2194k.m10280j(this.f7239g)) {
            g.mo7650g();
        }
    }

    /* renamed from: h */
    public List<C2166i<?>> mo8309h() {
        return C2194k.m10280j(this.f7239g);
    }

    /* renamed from: m */
    public void mo8310m(C2166i<?> iVar) {
        this.f7239g.add(iVar);
    }

    /* renamed from: n */
    public void mo8311n(C2166i<?> iVar) {
        this.f7239g.remove(iVar);
    }

    public void onDestroy() {
        for (T onDestroy : C2194k.m10280j(this.f7239g)) {
            onDestroy.onDestroy();
        }
    }
}
