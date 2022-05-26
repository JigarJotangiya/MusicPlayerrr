package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class q14<T> extends i14 {

    /* renamed from: g */
    private final HashMap<T, p14<T>> f21792g = new HashMap<>();

    /* renamed from: h */
    private Handler f21793h;

    /* renamed from: i */
    private fr1 f21794i;

    protected q14() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public abstract void mo16019A(T t, i24 i24, bg0 bg0);

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo20358B(T t, i24 i24) {
        gs1.m24486d(!this.f21792g.containsKey(t));
        n14 n14 = new n14(this, t);
        o14 o14 = new o14(this, t);
        this.f21792g.put(t, new p14(i24, n14, o14));
        Handler handler = this.f21793h;
        Objects.requireNonNull(handler);
        i24.mo18261g(handler, o14);
        Handler handler2 = this.f21793h;
        Objects.requireNonNull(handler2);
        i24.mo18257a(handler2, o14);
        i24.mo18263j(n14, this.f21794i);
        if (!mo18274y()) {
            i24.mo18264k(n14);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final void mo18270q() {
        for (p14 next : this.f21792g.values()) {
            next.f21288a.mo18264k(next.f21289b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo18271r() {
        for (p14 next : this.f21792g.values()) {
            next.f21288a.mo18258b(next.f21289b);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo16024s(fr1 fr1) {
        this.f21794i = fr1;
        this.f21793h = wy2.m33443f0((Handler.Callback) null);
    }

    /* renamed from: t */
    public void mo16025t() throws IOException {
        for (p14<T> p14 : this.f21792g.values()) {
            p14.f21288a.mo16025t();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public void mo16026v() {
        for (p14 next : this.f21792g.values()) {
            next.f21288a.mo18260f(next.f21289b);
            next.f21288a.mo18259c(next.f21290c);
            next.f21288a.mo18262h(next.f21290c);
        }
        this.f21792g.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public abstract f24 mo16028z(T t, f24 f24);
}
