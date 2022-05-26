package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jg3 implements st3 {

    /* renamed from: g */
    private final vu3 f18479g;

    /* renamed from: h */
    private final jf3 f18480h;

    /* renamed from: i */
    private lu3 f18481i;

    /* renamed from: j */
    private st3 f18482j;

    /* renamed from: k */
    private boolean f18483k = true;

    /* renamed from: l */
    private boolean f18484l;

    public jg3(jf3 jf3, ht1 ht1) {
        this.f18480h = jf3;
        this.f18479g = new vu3(ht1);
    }

    /* renamed from: V */
    public final void mo18617V(i10 i10) {
        st3 st3 = this.f18482j;
        if (st3 != null) {
            st3.mo18617V(i10);
            i10 = this.f18482j.mo18619b();
        }
        this.f18479g.mo18617V(i10);
    }

    /* renamed from: a */
    public final long mo18618a(boolean z) {
        lu3 lu3 = this.f18481i;
        if (lu3 == null || lu3.mo16486E() || (!this.f18481i.mo16489U() && (z || this.f18481i.mo16573w()))) {
            this.f18483k = true;
            if (this.f18484l) {
                this.f18479g.mo21601c();
            }
        } else {
            st3 st3 = this.f18482j;
            Objects.requireNonNull(st3);
            long zza = st3.zza();
            if (this.f18483k) {
                if (zza < this.f18479g.zza()) {
                    this.f18479g.mo21602d();
                } else {
                    this.f18483k = false;
                    if (this.f18484l) {
                        this.f18479g.mo21601c();
                    }
                }
            }
            this.f18479g.mo21600a(zza);
            i10 b = st3.mo18619b();
            if (!b.equals(this.f18479g.mo18619b())) {
                this.f18479g.mo18617V(b);
                this.f18480h.mo18614a(b);
            }
        }
        if (this.f18483k) {
            return this.f18479g.zza();
        }
        st3 st32 = this.f18482j;
        Objects.requireNonNull(st32);
        return st32.zza();
    }

    /* renamed from: b */
    public final i10 mo18619b() {
        st3 st3 = this.f18482j;
        return st3 != null ? st3.mo18619b() : this.f18479g.mo18619b();
    }

    /* renamed from: c */
    public final void mo18620c(lu3 lu3) {
        if (lu3 == this.f18481i) {
            this.f18482j = null;
            this.f18481i = null;
            this.f18483k = true;
        }
    }

    /* renamed from: d */
    public final void mo18621d(lu3 lu3) throws ji3 {
        st3 st3;
        st3 g = lu3.mo16561g();
        if (g != null && g != (st3 = this.f18482j)) {
            if (st3 == null) {
                this.f18482j = g;
                this.f18481i = lu3;
                g.mo18617V(this.f18479g.mo18619b());
                return;
            }
            throw ji3.zzd(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
    }

    /* renamed from: e */
    public final void mo18622e(long j) {
        this.f18479g.mo21600a(j);
    }

    /* renamed from: f */
    public final void mo18623f() {
        this.f18484l = true;
        this.f18479g.mo21601c();
    }

    /* renamed from: g */
    public final void mo18624g() {
        this.f18484l = false;
        this.f18479g.mo21602d();
    }

    public final long zza() {
        throw null;
    }
}
