package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class mt2<O> {

    /* renamed from: a */
    private final Object f20159a;

    /* renamed from: b */
    private final String f20160b;

    /* renamed from: c */
    private final d93<?> f20161c;

    /* renamed from: d */
    private final List<d93<?>> f20162d;

    /* renamed from: e */
    private final d93<O> f20163e;

    /* renamed from: f */
    final /* synthetic */ nt2 f20164f;

    private mt2(nt2 nt2, nt2 nt22, String str, d93 d93, List<d93> list, d93<O> d932) {
        this.f20164f = nt2;
        this.f20159a = nt22;
        this.f20160b = str;
        this.f20161c = d93;
        this.f20162d = list;
        this.f20163e = d932;
    }

    /* synthetic */ mt2(nt2 nt2, Object obj, String str, d93 d93, List list, d93 d932, lt2 lt2) {
        this(nt2, obj, (String) null, d93, list, d932);
    }

    /* renamed from: a */
    public final at2 mo19534a() {
        Object obj = this.f20159a;
        String str = this.f20160b;
        if (str == null) {
            str = this.f20164f.mo19825f(obj);
        }
        at2 at2 = new at2(obj, str, this.f20163e);
        this.f20164f.f20723c.mo20118u(at2);
        d93<?> d93 = this.f20161c;
        jt2 jt2 = new jt2(this, at2);
        e93 e93 = hm0.f17713f;
        d93.mo15945h(jt2, e93);
        s83.m30616r(at2, new kt2(this, at2), e93);
        return at2;
    }

    /* renamed from: b */
    public final mt2<O> mo19535b(Object obj) {
        return this.f20164f.mo19824b(obj, mo19534a());
    }

    /* renamed from: c */
    public final <T extends Throwable> mt2<O> mo19536c(Class<T> cls, y73<T, O> y73) {
        nt2 nt2 = this.f20164f;
        return new mt2(nt2, this.f20159a, this.f20160b, this.f20161c, this.f20162d, s83.m30605g(this.f20163e, cls, y73, nt2.f20721a));
    }

    /* renamed from: d */
    public final <O2> mt2<O2> mo19537d(d93<O2> d93) {
        return mo19540g(new it2(d93), hm0.f17713f);
    }

    /* renamed from: e */
    public final <O2> mt2<O2> mo19538e(ys2<O, O2> ys2) {
        return mo19539f(new gt2(ys2));
    }

    /* renamed from: f */
    public final <O2> mt2<O2> mo19539f(y73<O, O2> y73) {
        return mo19540g(y73, this.f20164f.f20721a);
    }

    /* renamed from: g */
    public final <O2> mt2<O2> mo19540g(y73<O, O2> y73, Executor executor) {
        return new mt2(this.f20164f, this.f20159a, this.f20160b, this.f20161c, this.f20162d, s83.m30612n(this.f20163e, y73, executor));
    }

    /* renamed from: h */
    public final mt2<O> mo19541h(String str) {
        return new mt2(this.f20164f, this.f20159a, str, this.f20161c, this.f20162d, this.f20163e);
    }

    /* renamed from: i */
    public final mt2<O> mo19542i(long j, TimeUnit timeUnit) {
        nt2 nt2 = this.f20164f;
        return new mt2(nt2, this.f20159a, this.f20160b, this.f20161c, this.f20162d, s83.m30613o(this.f20163e, j, timeUnit, nt2.f20722b));
    }
}
