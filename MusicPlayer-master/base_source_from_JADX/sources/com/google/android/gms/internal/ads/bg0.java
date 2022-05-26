package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class bg0 {

    /* renamed from: a */
    public static final bg0 f14455a = new ub0();

    static {
        ua0 ua0 = ua0.f24264a;
    }

    protected bg0() {
    }

    /* renamed from: a */
    public abstract int mo15662a(Object obj);

    /* renamed from: b */
    public abstract int mo15663b();

    /* renamed from: c */
    public abstract int mo15664c();

    /* renamed from: d */
    public abstract od0 mo15665d(int i, od0 od0, boolean z);

    /* renamed from: e */
    public abstract ff0 mo15666e(int i, ff0 ff0, long j);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bg0)) {
            return false;
        }
        bg0 bg0 = (bg0) obj;
        if (bg0.mo15664c() != mo15664c() || bg0.mo15663b() != mo15663b()) {
            return false;
        }
        ff0 ff0 = new ff0();
        od0 od0 = new od0();
        ff0 ff02 = new ff0();
        od0 od02 = new od0();
        for (int i = 0; i < mo15664c(); i++) {
            if (!mo15666e(i, ff0, 0).equals(bg0.mo15666e(i, ff02, 0))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < mo15663b(); i2++) {
            if (!mo15665d(i2, od0, true).equals(bg0.mo15665d(i2, od02, true))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public abstract Object mo15667f(int i);

    /* renamed from: g */
    public int mo16233g(boolean z) {
        return mo16242o() ? -1 : 0;
    }

    /* renamed from: h */
    public int mo16234h(boolean z) {
        if (mo16242o()) {
            return -1;
        }
        return mo15664c() - 1;
    }

    public final int hashCode() {
        ff0 ff0 = new ff0();
        od0 od0 = new od0();
        int c = mo15664c() + 217;
        for (int i = 0; i < mo15664c(); i++) {
            c = (c * 31) + mo15666e(i, ff0, 0).hashCode();
        }
        int b = (c * 31) + mo15663b();
        for (int i2 = 0; i2 < mo15663b(); i2++) {
            b = (b * 31) + mo15665d(i2, od0, true).hashCode();
        }
        return b;
    }

    /* renamed from: i */
    public final int mo16236i(int i, od0 od0, ff0 ff0, int i2, boolean z) {
        int i3 = mo15665d(i, od0, false).f20976c;
        if (mo15666e(i3, ff0, 0).f16576n != i) {
            return i + 1;
        }
        int j = mo16237j(i3, i2, z);
        if (j == -1) {
            return -1;
        }
        return mo15666e(j, ff0, 0).f16575m;
    }

    /* renamed from: j */
    public int mo16237j(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 == 1) {
                return i;
            }
            if (i2 == 2) {
                return i == mo16234h(z) ? mo16233g(z) : i + 1;
            }
            throw new IllegalStateException();
        } else if (i == mo16234h(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    /* renamed from: k */
    public int mo16238k(int i, int i2, boolean z) {
        if (i == mo16233g(false)) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: l */
    public final Pair<Object, Long> mo16239l(ff0 ff0, od0 od0, int i, long j) {
        Pair<Object, Long> m = mo16240m(ff0, od0, i, j, 0);
        Objects.requireNonNull(m);
        return m;
    }

    /* renamed from: m */
    public final Pair<Object, Long> mo16240m(ff0 ff0, od0 od0, int i, long j, long j2) {
        gs1.m24483a(i, 0, mo15664c());
        mo15666e(i, ff0, j2);
        if (j == -9223372036854775807L) {
            long j3 = ff0.f16573k;
            j = 0;
        }
        int i2 = ff0.f16575m;
        mo15665d(i2, od0, false);
        while (i2 < ff0.f16576n) {
            long j4 = od0.f20978e;
            int i3 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
            if (i3 == 0) {
                break;
            }
            int i4 = i2 + 1;
            long j5 = mo15665d(i4, od0, false).f20978e;
            if (i3 < 0) {
                break;
            }
            i2 = i4;
        }
        mo15665d(i2, od0, true);
        long j6 = od0.f20978e;
        long j7 = od0.f20977d;
        if (j7 != -9223372036854775807L) {
            j = Math.min(j, j7 - 1);
        }
        long max = Math.max(0, j);
        Object obj = od0.f20975b;
        Objects.requireNonNull(obj);
        return Pair.create(obj, Long.valueOf(max));
    }

    /* renamed from: n */
    public od0 mo16241n(Object obj, od0 od0) {
        return mo15665d(mo15662a(obj), od0, true);
    }

    /* renamed from: o */
    public final boolean mo16242o() {
        return mo15664c() == 0;
    }
}
