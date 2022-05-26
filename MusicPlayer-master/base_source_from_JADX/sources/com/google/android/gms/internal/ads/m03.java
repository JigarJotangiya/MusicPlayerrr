package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class m03 extends bg0 {

    /* renamed from: b */
    private final int f19690b;

    /* renamed from: c */
    private final x34 f19691c;

    public m03(boolean z, x34 x34, byte[] bArr) {
        this.f19691c = x34;
        this.f19690b = x34.mo21968c();
    }

    /* renamed from: w */
    private final int m27036w(int i, boolean z) {
        if (z) {
            return this.f19691c.mo21969d(i);
        }
        if (i >= this.f19690b - 1) {
            return -1;
        }
        return i + 1;
    }

    /* renamed from: x */
    private final int m27037x(int i, boolean z) {
        if (z) {
            return this.f19691c.mo21970e(i);
        }
        if (i <= 0) {
            return -1;
        }
        return i - 1;
    }

    /* renamed from: a */
    public final int mo15662a(Object obj) {
        int a;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo18736p(obj2);
        if (p == -1 || (a = mo18741u(p).mo15662a(obj3)) == -1) {
            return -1;
        }
        return mo18739s(p) + a;
    }

    /* renamed from: d */
    public final od0 mo15665d(int i, od0 od0, boolean z) {
        int q = mo18737q(i);
        int t = mo18740t(q);
        mo18741u(q).mo15665d(i - mo18739s(q), od0, z);
        od0.f20976c += t;
        if (z) {
            Object v = mo18742v(q);
            Object obj = od0.f20975b;
            Objects.requireNonNull(obj);
            od0.f20975b = Pair.create(v, obj);
        }
        return od0;
    }

    /* renamed from: e */
    public final ff0 mo15666e(int i, ff0 ff0, long j) {
        int r = mo18738r(i);
        int t = mo18740t(r);
        int s = mo18739s(r);
        mo18741u(r).mo15666e(i - t, ff0, j);
        Object v = mo18742v(r);
        if (!ff0.f16561o.equals(ff0.f16563a)) {
            v = Pair.create(v, ff0.f16563a);
        }
        ff0.f16563a = v;
        ff0.f16575m += s;
        ff0.f16576n += s;
        return ff0;
    }

    /* renamed from: f */
    public final Object mo15667f(int i) {
        int q = mo18737q(i);
        return Pair.create(mo18742v(q), mo18741u(q).mo15667f(i - mo18739s(q)));
    }

    /* renamed from: g */
    public final int mo16233g(boolean z) {
        if (this.f19690b == 0) {
            return -1;
        }
        int a = z ? this.f19691c.mo21966a() : 0;
        while (mo18741u(a).mo16242o()) {
            a = m27036w(a, z);
            if (a == -1) {
                return -1;
            }
        }
        return mo18740t(a) + mo18741u(a).mo16233g(z);
    }

    /* renamed from: h */
    public final int mo16234h(boolean z) {
        int i = this.f19690b;
        if (i == 0) {
            return -1;
        }
        int b = z ? this.f19691c.mo21967b() : i - 1;
        while (mo18741u(b).mo16242o()) {
            b = m27037x(b, z);
            if (b == -1) {
                return -1;
            }
        }
        return mo18740t(b) + mo18741u(b).mo16234h(z);
    }

    /* renamed from: j */
    public final int mo16237j(int i, int i2, boolean z) {
        int r = mo18738r(i);
        int t = mo18740t(r);
        int j = mo18741u(r).mo16237j(i - t, i2 == 2 ? 0 : i2, z);
        if (j != -1) {
            return t + j;
        }
        int w = m27036w(r, z);
        while (w != -1 && mo18741u(w).mo16242o()) {
            w = m27036w(w, z);
        }
        if (w != -1) {
            return mo18740t(w) + mo18741u(w).mo16233g(z);
        }
        if (i2 == 2) {
            return mo16233g(z);
        }
        return -1;
    }

    /* renamed from: k */
    public final int mo16238k(int i, int i2, boolean z) {
        int r = mo18738r(i);
        int t = mo18740t(r);
        int k = mo18741u(r).mo16238k(i - t, 0, false);
        if (k != -1) {
            return t + k;
        }
        int x = m27037x(r, false);
        while (x != -1 && mo18741u(x).mo16242o()) {
            x = m27037x(x, false);
        }
        if (x != -1) {
            return mo18740t(x) + mo18741u(x).mo16234h(false);
        }
        return -1;
    }

    /* renamed from: n */
    public final od0 mo16241n(Object obj, od0 od0) {
        Pair pair = (Pair) obj;
        Object obj2 = pair.first;
        Object obj3 = pair.second;
        int p = mo18736p(obj2);
        int t = mo18740t(p);
        mo18741u(p).mo16241n(obj3, od0);
        od0.f20976c += t;
        od0.f20975b = obj;
        return od0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract int mo18736p(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public abstract int mo18737q(int i);

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public abstract int mo18738r(int i);

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract int mo18739s(int i);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract int mo18740t(int i);

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract bg0 mo18741u(int i);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract Object mo18742v(int i);
}
