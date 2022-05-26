package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class wg1 {

    /* renamed from: a */
    private final yh1 f25386a;

    /* renamed from: b */
    private final pr0 f25387b;

    public wg1(yh1 yh1, pr0 pr0) {
        this.f25386a = yh1;
        this.f25387b = pr0;
    }

    /* renamed from: h */
    public static final qf1<if1> m33134h(di1 di1) {
        return new qf1<>(di1, hm0.f17713f);
    }

    /* renamed from: a */
    public final View mo21817a() {
        pr0 pr0 = this.f25387b;
        if (pr0 == null) {
            return null;
        }
        return pr0.mo17664K();
    }

    /* renamed from: b */
    public final View mo21818b() {
        pr0 pr0 = this.f25387b;
        if (pr0 != null) {
            return pr0.mo17664K();
        }
        return null;
    }

    /* renamed from: c */
    public final pr0 mo21819c() {
        return this.f25387b;
    }

    /* renamed from: d */
    public final qf1<zc1> mo21820d(Executor executor) {
        return new qf1<>(new ug1(this.f25387b), executor);
    }

    /* renamed from: e */
    public final yh1 mo21821e() {
        return this.f25386a;
    }

    /* renamed from: f */
    public Set<qf1<e81>> mo18562f(d71 d71) {
        return Collections.singleton(new qf1(d71, hm0.f17713f));
    }

    /* renamed from: g */
    public Set<qf1<if1>> mo18563g(d71 d71) {
        return Collections.singleton(new qf1(d71, hm0.f17713f));
    }
}
