package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.p2 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5433p2 implements C5470q2 {

    /* renamed from: a */
    private final List<C5805z3> f21291a;

    /* renamed from: b */
    private final da4[] f21292b;

    /* renamed from: c */
    private boolean f21293c;

    /* renamed from: d */
    private int f21294d;

    /* renamed from: e */
    private int f21295e;

    /* renamed from: f */
    private long f21296f = -9223372036854775807L;

    public C5433p2(List<C5805z3> list) {
        this.f21291a = list;
        this.f21292b = new da4[list.size()];
    }

    /* renamed from: e */
    private final boolean m28829e(no2 no2, int i) {
        if (no2.mo19782i() == 0) {
            return false;
        }
        if (no2.mo19792s() != i) {
            this.f21293c = false;
        }
        this.f21294d--;
        return this.f21293c;
    }

    /* renamed from: a */
    public final void mo15668a(no2 no2) {
        if (!this.f21293c) {
            return;
        }
        if (this.f21294d != 2 || m28829e(no2, 32)) {
            if (this.f21294d != 1 || m28829e(no2, 0)) {
                int k = no2.mo19784k();
                int i = no2.mo19782i();
                for (da4 d : this.f21292b) {
                    no2.mo19779f(k);
                    d.mo16888d(no2, i);
                }
                this.f21295e += i;
            }
        }
    }

    /* renamed from: b */
    public final void mo15669b() {
        if (this.f21293c) {
            if (this.f21296f != -9223372036854775807L) {
                for (da4 e : this.f21292b) {
                    e.mo16889e(this.f21296f, 1, this.f21295e, 0, (ca4) null);
                }
            }
            this.f21293c = false;
        }
    }

    /* renamed from: c */
    public final void mo15670c(b94 b94, C4953c4 c4Var) {
        for (int i = 0; i < this.f21292b.length; i++) {
            C5805z3 z3Var = this.f21291a.get(i);
            c4Var.mo16483c();
            da4 s = b94.mo15724s(c4Var.mo16481a(), 3);
            jb4 jb4 = new jb4();
            jb4.mo18587h(c4Var.mo16482b());
            jb4.mo18599s("application/dvbsubs");
            jb4.mo18589i(Collections.singletonList(z3Var.f26651b));
            jb4.mo18591k(z3Var.f26650a);
            s.mo16885a(jb4.mo18605y());
            this.f21292b[i] = s;
        }
    }

    /* renamed from: d */
    public final void mo15671d(long j, int i) {
        if ((i & 4) != 0) {
            this.f21293c = true;
            if (j != -9223372036854775807L) {
                this.f21296f = j;
            }
            this.f21295e = 0;
            this.f21294d = 2;
        }
    }

    public final void zze() {
        this.f21293c = false;
        this.f21296f = -9223372036854775807L;
    }
}
