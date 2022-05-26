package com.bumptech.glide.manager;

import android.util.Log;
import com.bumptech.glide.p047q.C2147d;
import com.bumptech.glide.p051s.C2194k;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.bumptech.glide.manager.q */
/* compiled from: RequestTracker */
public class C2121q {

    /* renamed from: a */
    private final Set<C2147d> f7229a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b */
    private final List<C2147d> f7230b = new ArrayList();

    /* renamed from: c */
    private boolean f7231c;

    /* renamed from: a */
    public boolean mo8293a(C2147d dVar) {
        boolean z = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f7229a.remove(dVar);
        if (!this.f7230b.remove(dVar) && !remove) {
            z = false;
        }
        if (z) {
            dVar.clear();
        }
        return z;
    }

    /* renamed from: b */
    public void mo8294b() {
        for (T a : C2194k.m10280j(this.f7229a)) {
            mo8293a(a);
        }
        this.f7230b.clear();
    }

    /* renamed from: c */
    public void mo8295c() {
        this.f7231c = true;
        for (T t : C2194k.m10280j(this.f7229a)) {
            if (t.isRunning() || t.mo8423j()) {
                t.clear();
                this.f7230b.add(t);
            }
        }
    }

    /* renamed from: d */
    public void mo8296d() {
        this.f7231c = true;
        for (T t : C2194k.m10280j(this.f7229a)) {
            if (t.isRunning()) {
                t.mo8411Q();
                this.f7230b.add(t);
            }
        }
    }

    /* renamed from: e */
    public void mo8297e() {
        for (T t : C2194k.m10280j(this.f7229a)) {
            if (!t.mo8423j() && !t.mo8418f()) {
                t.clear();
                if (!this.f7231c) {
                    t.mo8420h();
                } else {
                    this.f7230b.add(t);
                }
            }
        }
    }

    /* renamed from: f */
    public void mo8298f() {
        this.f7231c = false;
        for (T t : C2194k.m10280j(this.f7229a)) {
            if (!t.mo8423j() && !t.isRunning()) {
                t.mo8420h();
            }
        }
        this.f7230b.clear();
    }

    /* renamed from: g */
    public void mo8299g(C2147d dVar) {
        this.f7229a.add(dVar);
        if (!this.f7231c) {
            dVar.mo8420h();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f7230b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f7229a.size() + ", isPaused=" + this.f7231c + "}";
    }
}
