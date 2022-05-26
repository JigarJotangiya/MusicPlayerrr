package com.google.android.gms.internal.ads;

import p082e.p098e.C3478g;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kk1 {

    /* renamed from: a */
    q30 f18898a;

    /* renamed from: b */
    n30 f18899b;

    /* renamed from: c */
    d40 f18900c;

    /* renamed from: d */
    a40 f18901d;

    /* renamed from: e */
    b80 f18902e;

    /* renamed from: f */
    final C3478g<String, w30> f18903f = new C3478g<>();

    /* renamed from: g */
    final C3478g<String, t30> f18904g = new C3478g<>();

    /* renamed from: a */
    public final kk1 mo18895a(n30 n30) {
        this.f18899b = n30;
        return this;
    }

    /* renamed from: b */
    public final kk1 mo18896b(q30 q30) {
        this.f18898a = q30;
        return this;
    }

    /* renamed from: c */
    public final kk1 mo18897c(String str, w30 w30, t30 t30) {
        this.f18903f.put(str, w30);
        if (t30 != null) {
            this.f18904g.put(str, t30);
        }
        return this;
    }

    /* renamed from: d */
    public final kk1 mo18898d(b80 b80) {
        this.f18902e = b80;
        return this;
    }

    /* renamed from: e */
    public final kk1 mo18899e(a40 a40) {
        this.f18901d = a40;
        return this;
    }

    /* renamed from: f */
    public final kk1 mo18900f(d40 d40) {
        this.f18900c = d40;
        return this;
    }

    /* renamed from: g */
    public final mk1 mo18901g() {
        return new mk1(this);
    }
}
