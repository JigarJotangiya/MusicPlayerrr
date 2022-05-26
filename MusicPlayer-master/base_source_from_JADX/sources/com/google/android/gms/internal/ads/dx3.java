package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class dx3 {

    /* renamed from: a */
    private final od0 f15767a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public g43<f24> f15768b = g43.zzo();

    /* renamed from: c */
    private k43<f24, bg0> f15769c = k43.zzd();

    /* renamed from: d */
    private f24 f15770d;

    /* renamed from: e */
    private f24 f15771e;

    /* renamed from: f */
    private f24 f15772f;

    public dx3(od0 od0) {
        this.f15767a = od0;
    }

    /* renamed from: j */
    private static f24 m22731j(t90 t90, g43<f24> g43, f24 f24, od0 od0) {
        bg0 m = t90.mo17328m();
        int e = t90.mo17322e();
        Object f = m.mo16242o() ? null : m.mo15667f(e);
        int b = (t90.zzp() || m.mo16242o()) ? -1 : m.mo15665d(e, od0, false).mo19965b(bw3.m21569c(t90.mo17325i()));
        for (int i = 0; i < g43.size(); i++) {
            f24 f242 = g43.get(i);
            if (m22734m(f242, f, t90.zzp(), t90.zze(), t90.mo17320c(), b)) {
                return f242;
            }
        }
        if (g43.isEmpty() && f24 != null) {
            if (m22734m(f24, f, t90.zzp(), t90.zze(), t90.mo17320c(), b)) {
                return f24;
            }
        }
        return null;
    }

    /* renamed from: k */
    private final void m22732k(j43<f24, bg0> j43, f24 f24, bg0 bg0) {
        if (f24 != null) {
            if (bg0.mo15662a(f24.f25531a) != -1) {
                j43.mo18541a(f24, bg0);
                return;
            }
            bg0 bg02 = this.f15769c.get(f24);
            if (bg02 != null) {
                j43.mo18541a(f24, bg02);
            }
        }
    }

    /* renamed from: l */
    private final void m22733l(bg0 bg0) {
        j43 j43 = new j43();
        if (this.f15768b.isEmpty()) {
            m22732k(j43, this.f15771e, bg0);
            if (!q13.m29306a(this.f15772f, this.f15771e)) {
                m22732k(j43, this.f15772f, bg0);
            }
            if (!q13.m29306a(this.f15770d, this.f15771e) && !q13.m29306a(this.f15770d, this.f15772f)) {
                m22732k(j43, this.f15770d, bg0);
            }
        } else {
            for (int i = 0; i < this.f15768b.size(); i++) {
                m22732k(j43, this.f15768b.get(i), bg0);
            }
            if (!this.f15768b.contains(this.f15770d)) {
                m22732k(j43, this.f15770d, bg0);
            }
        }
        this.f15769c = j43.mo18543c();
    }

    /* renamed from: m */
    private static boolean m22734m(f24 f24, Object obj, boolean z, int i, int i2, int i3) {
        if (!f24.f25531a.equals(obj)) {
            return false;
        }
        if (z) {
            if (!(f24.f25532b == i && f24.f25533c == i2)) {
                return false;
            }
        } else if (!(f24.f25532b == -1 && f24.f25535e == i3)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final bg0 mo17035a(f24 f24) {
        return this.f15769c.get(f24);
    }

    /* renamed from: b */
    public final f24 mo17036b() {
        return this.f15770d;
    }

    /* renamed from: c */
    public final f24 mo17037c() {
        T t;
        T next;
        if (this.f15768b.isEmpty()) {
            return null;
        }
        g43<f24> g43 = this.f15768b;
        if (!(g43 instanceof List)) {
            Iterator<T> it = g43.iterator();
            do {
                next = it.next();
            } while (it.hasNext());
            t = next;
        } else if (!g43.isEmpty()) {
            t = g43.get(g43.size() - 1);
        } else {
            throw new NoSuchElementException();
        }
        return (f24) t;
    }

    /* renamed from: d */
    public final f24 mo17038d() {
        return this.f15771e;
    }

    /* renamed from: e */
    public final f24 mo17039e() {
        return this.f15772f;
    }

    /* renamed from: g */
    public final void mo17040g(t90 t90) {
        this.f15770d = m22731j(t90, this.f15768b, this.f15771e, this.f15767a);
    }

    /* renamed from: h */
    public final void mo17041h(List<f24> list, f24 f24, t90 t90) {
        this.f15768b = g43.zzm(list);
        if (!list.isEmpty()) {
            this.f15771e = list.get(0);
            Objects.requireNonNull(f24);
            this.f15772f = f24;
        }
        if (this.f15770d == null) {
            this.f15770d = m22731j(t90, this.f15768b, this.f15771e, this.f15767a);
        }
        m22733l(t90.mo17328m());
    }

    /* renamed from: i */
    public final void mo17042i(t90 t90) {
        this.f15770d = m22731j(t90, this.f15768b, this.f15771e, this.f15767a);
        m22733l(t90.mo17328m());
    }
}
