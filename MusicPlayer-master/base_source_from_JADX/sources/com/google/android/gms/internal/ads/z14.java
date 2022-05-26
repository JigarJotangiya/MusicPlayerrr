package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z14 extends u14 {

    /* renamed from: e */
    public static final Object f26623e = new Object();

    /* renamed from: c */
    private final Object f26624c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final Object f26625d;

    private z14(bg0 bg0, Object obj, Object obj2) {
        super(bg0);
        this.f26624c = obj;
        this.f26625d = obj2;
    }

    /* renamed from: q */
    public static z14 m34389q(C5825zn znVar) {
        return new z14(new a24(znVar), ff0.f16561o, f26623e);
    }

    /* renamed from: r */
    public static z14 m34390r(bg0 bg0, Object obj, Object obj2) {
        return new z14(bg0, obj, obj2);
    }

    /* renamed from: a */
    public final int mo15662a(Object obj) {
        Object obj2;
        bg0 bg0 = this.f24146b;
        if (f26623e.equals(obj) && (obj2 = this.f26625d) != null) {
            obj = obj2;
        }
        return bg0.mo15662a(obj);
    }

    /* renamed from: d */
    public final od0 mo15665d(int i, od0 od0, boolean z) {
        this.f24146b.mo15665d(i, od0, z);
        if (wy2.m33453p(od0.f20975b, this.f26625d) && z) {
            od0.f20975b = f26623e;
        }
        return od0;
    }

    /* renamed from: e */
    public final ff0 mo15666e(int i, ff0 ff0, long j) {
        this.f24146b.mo15666e(i, ff0, j);
        if (wy2.m33453p(ff0.f16563a, this.f26624c)) {
            ff0.f16563a = ff0.f16561o;
        }
        return ff0;
    }

    /* renamed from: f */
    public final Object mo15667f(int i) {
        Object f = this.f24146b.mo15667f(i);
        return wy2.m33453p(f, this.f26625d) ? f26623e : f;
    }

    /* renamed from: p */
    public final z14 mo22320p(bg0 bg0) {
        return new z14(bg0, this.f26624c, this.f26625d);
    }
}
