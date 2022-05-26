package com.bumptech.glide.p047q.p048l;

import android.graphics.drawable.Drawable;
import com.bumptech.glide.p047q.C2147d;
import com.bumptech.glide.p051s.C2194k;

/* renamed from: com.bumptech.glide.q.l.c */
/* compiled from: CustomTarget */
public abstract class C2160c<T> implements C2166i<T> {

    /* renamed from: g */
    private final int f7390g;

    /* renamed from: h */
    private final int f7391h;

    /* renamed from: i */
    private C2147d f7392i;

    public C2160c() {
        this(Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* renamed from: a */
    public void mo7648a() {
    }

    /* renamed from: b */
    public final void mo8427b(C2165h hVar) {
    }

    /* renamed from: e */
    public final void mo8429e(C2147d dVar) {
        this.f7392i = dVar;
    }

    /* renamed from: f */
    public void mo8430f(Drawable drawable) {
    }

    /* renamed from: g */
    public void mo7650g() {
    }

    /* renamed from: i */
    public void mo8433i(Drawable drawable) {
    }

    /* renamed from: j */
    public final C2147d mo8436j() {
        return this.f7392i;
    }

    /* renamed from: l */
    public final void mo8437l(C2165h hVar) {
        hVar.mo8445e(this.f7390g, this.f7391h);
    }

    public void onDestroy() {
    }

    public C2160c(int i, int i2) {
        if (C2194k.m10290t(i, i2)) {
            this.f7390g = i;
            this.f7391h = i2;
            return;
        }
        throw new IllegalArgumentException("Width and height must both be > 0 or Target#SIZE_ORIGINAL, but given width: " + i + " and height: " + i2);
    }
}
