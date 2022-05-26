package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class eu3 {

    /* renamed from: a */
    private final List<cu3> f16120a = new ArrayList();

    /* renamed from: b */
    private final IdentityHashMap<e24, cu3> f16121b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, cu3> f16122c = new HashMap();

    /* renamed from: d */
    private final du3 f16123d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final p24 f16124e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public final iz3 f16125f;

    /* renamed from: g */
    private final HashMap<cu3, bu3> f16126g;

    /* renamed from: h */
    private final Set<cu3> f16127h;

    /* renamed from: i */
    private boolean f16128i;

    /* renamed from: j */
    private fr1 f16129j;

    /* renamed from: k */
    private x34 f16130k = new x34(0);

    public eu3(du3 du3, ex3 ex3, Handler handler) {
        this.f16123d = du3;
        p24 p24 = new p24();
        this.f16124e = p24;
        iz3 iz3 = new iz3();
        this.f16125f = iz3;
        this.f16126g = new HashMap<>();
        this.f16127h = new HashSet();
        p24.mo20191b(handler, ex3);
        iz3.mo18526b(handler, ex3);
    }

    /* renamed from: p */
    private final void m23204p(int i, int i2) {
        while (i < this.f16120a.size()) {
            this.f16120a.get(i).f15158d += i2;
            i++;
        }
    }

    /* renamed from: q */
    private final void m23205q(cu3 cu3) {
        bu3 bu3 = this.f16126g.get(cu3);
        if (bu3 != null) {
            bu3.f14705a.mo18264k(bu3.f14706b);
        }
    }

    /* renamed from: r */
    private final void m23206r() {
        Iterator<cu3> it = this.f16127h.iterator();
        while (it.hasNext()) {
            cu3 next = it.next();
            if (next.f15157c.isEmpty()) {
                m23205q(next);
                it.remove();
            }
        }
    }

    /* renamed from: s */
    private final void m23207s(cu3 cu3) {
        if (cu3.f15159e && cu3.f15157c.isEmpty()) {
            bu3 remove = this.f16126g.remove(cu3);
            Objects.requireNonNull(remove);
            remove.f14705a.mo18260f(remove.f14706b);
            remove.f14705a.mo18259c(remove.f14707c);
            remove.f14705a.mo18262h(remove.f14707c);
            this.f16127h.remove(cu3);
        }
    }

    /* renamed from: t */
    private final void m23208t(cu3 cu3) {
        b24 b24 = cu3.f15155a;
        yt3 yt3 = new yt3(this);
        au3 au3 = new au3(this, cu3);
        this.f16126g.put(cu3, new bu3(b24, yt3, au3));
        b24.mo18261g(new Handler(wy2.m33432a(), (Handler.Callback) null), au3);
        b24.mo18257a(new Handler(wy2.m33432a(), (Handler.Callback) null), au3);
        b24.mo18263j(yt3, this.f16129j);
    }

    /* renamed from: u */
    private final void m23209u(int i, int i2) {
        while (true) {
            i2--;
            if (i2 >= i) {
                cu3 remove = this.f16120a.remove(i2);
                this.f16122c.remove(remove.f15156b);
                m23204p(i2, -remove.f15155a.mo16021F().mo15664c());
                remove.f15159e = true;
                if (this.f16128i) {
                    m23207s(remove);
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo17342a() {
        return this.f16120a.size();
    }

    /* renamed from: b */
    public final bg0 mo17343b() {
        if (this.f16120a.isEmpty()) {
            return bg0.f14455a;
        }
        int i = 0;
        for (int i2 = 0; i2 < this.f16120a.size(); i2++) {
            cu3 cu3 = this.f16120a.get(i2);
            cu3.f15158d = i;
            i += cu3.f15155a.mo16021F().mo15664c();
        }
        return new ju3(this.f16120a, this.f16130k, (x34) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final /* synthetic */ void mo17344e(i24 i24, bg0 bg0) {
        this.f16123d.mo17019e();
    }

    /* renamed from: f */
    public final void mo17345f(fr1 fr1) {
        gs1.m24488f(!this.f16128i);
        this.f16129j = fr1;
        for (int i = 0; i < this.f16120a.size(); i++) {
            cu3 cu3 = this.f16120a.get(i);
            m23208t(cu3);
            this.f16127h.add(cu3);
        }
        this.f16128i = true;
    }

    /* renamed from: g */
    public final void mo17346g() {
        for (bu3 next : this.f16126g.values()) {
            try {
                next.f14705a.mo18260f(next.f14706b);
            } catch (RuntimeException e) {
                y92.m34067a("MediaSourceList", "Failed to release child source.", e);
            }
            next.f14705a.mo18259c(next.f14707c);
            next.f14705a.mo18262h(next.f14707c);
        }
        this.f16126g.clear();
        this.f16127h.clear();
        this.f16128i = false;
    }

    /* renamed from: h */
    public final void mo17347h(e24 e24) {
        cu3 remove = this.f16121b.remove(e24);
        Objects.requireNonNull(remove);
        remove.f15155a.mo16022e(e24);
        remove.f15157c.remove(((y14) e24).f26205g);
        if (!this.f16121b.isEmpty()) {
            m23206r();
        }
        m23207s(remove);
    }

    /* renamed from: i */
    public final boolean mo17348i() {
        return this.f16128i;
    }

    /* renamed from: j */
    public final bg0 mo17349j(int i, List<cu3> list, x34 x34) {
        if (!list.isEmpty()) {
            this.f16130k = x34;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                cu3 cu3 = list.get(i2 - i);
                if (i2 > 0) {
                    cu3 cu32 = this.f16120a.get(i2 - 1);
                    cu3.mo16752b(cu32.f15158d + cu32.f15155a.mo16021F().mo15664c());
                } else {
                    cu3.mo16752b(0);
                }
                m23204p(i2, cu3.f15155a.mo16021F().mo15664c());
                this.f16120a.add(i2, cu3);
                this.f16122c.put(cu3.f15156b, cu3);
                if (this.f16128i) {
                    m23208t(cu3);
                    if (this.f16121b.isEmpty()) {
                        this.f16127h.add(cu3);
                    } else {
                        m23205q(cu3);
                    }
                }
            }
        }
        return mo17343b();
    }

    /* renamed from: k */
    public final bg0 mo17350k(int i, int i2, int i3, x34 x34) {
        gs1.m24486d(mo17342a() >= 0);
        this.f16130k = null;
        return mo17343b();
    }

    /* renamed from: l */
    public final bg0 mo17351l(int i, int i2, x34 x34) {
        boolean z = false;
        if (i >= 0 && i <= i2 && i2 <= mo17342a()) {
            z = true;
        }
        gs1.m24486d(z);
        this.f16130k = x34;
        m23209u(i, i2);
        return mo17343b();
    }

    /* renamed from: m */
    public final bg0 mo17352m(List<cu3> list, x34 x34) {
        m23209u(0, this.f16120a.size());
        return mo17349j(this.f16120a.size(), list, x34);
    }

    /* renamed from: n */
    public final bg0 mo17353n(x34 x34) {
        int a = mo17342a();
        if (x34.mo21968c() != a) {
            x34 = x34.mo21971f().mo21972g(0, a);
        }
        this.f16130k = x34;
        return mo17343b();
    }

    /* renamed from: o */
    public final e24 mo17354o(f24 f24, r54 r54, long j) {
        Object obj = f24.f25531a;
        Object obj2 = ((Pair) obj).first;
        f24 c = f24.mo17463c(((Pair) obj).second);
        cu3 cu3 = this.f16122c.get(obj2);
        Objects.requireNonNull(cu3);
        this.f16127h.add(cu3);
        bu3 bu3 = this.f16126g.get(cu3);
        if (bu3 != null) {
            bu3.f14705a.mo18258b(bu3.f14706b);
        }
        cu3.f15157c.add(c);
        y14 C = cu3.f15155a.mo16023i(c, r54, j);
        this.f16121b.put(C, cu3);
        m23206r();
        return C;
    }
}
