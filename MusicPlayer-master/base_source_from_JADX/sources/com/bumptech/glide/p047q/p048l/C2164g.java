package com.bumptech.glide.p047q.p048l;

import com.bumptech.glide.p051s.C2194k;

@Deprecated
/* renamed from: com.bumptech.glide.q.l.g */
/* compiled from: SimpleTarget */
public abstract class C2164g<Z> extends C2158a<Z> {

    /* renamed from: h */
    private final int f7394h;

    /* renamed from: i */
    private final int f7395i;

    public C2164g() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: b */
    public void mo8427b(C2165h hVar) {
    }

    /* renamed from: l */
    public final void mo8437l(C2165h hVar) {
        if (C2194k.m10290t(this.f7394h, this.f7395i)) {
            hVar.mo8445e(this.f7394h, this.f7395i);
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + this.f7394h + " and height: " + this.f7395i + ", either provide dimensions in the constructor or call override()");
    }

    public C2164g(int i, int i2) {
        this.f7394h = i;
        this.f7395i = i2;
    }
}
