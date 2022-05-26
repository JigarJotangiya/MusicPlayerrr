package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.C3359d;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kt1 implements xt2 {

    /* renamed from: g */
    private final Map<pt2, Long> f18981g = new HashMap();

    /* renamed from: h */
    private final ct1 f18982h;

    /* renamed from: i */
    private final C3359d f18983i;

    /* renamed from: j */
    private final Map<pt2, jt1> f18984j = new HashMap();

    public kt1(ct1 ct1, Set<jt1> set, C3359d dVar) {
        this.f18982h = ct1;
        for (jt1 next : set) {
            this.f18984j.put(next.f18631c, next);
        }
        this.f18983i = dVar;
    }

    /* renamed from: b */
    private final void m26418b(pt2 pt2, boolean z) {
        pt2 b = this.f18984j.get(pt2).f18630b;
        String str = true != z ? "f." : "s.";
        if (this.f18981g.containsKey(b)) {
            long b2 = this.f18983i.mo11989b() - this.f18981g.get(b).longValue();
            Map<String, String> a = this.f18982h.mo16745a();
            String c = this.f18984j.get(pt2).f18629a;
            String concat = c.length() != 0 ? "label.".concat(c) : new String("label.");
            String valueOf = String.valueOf(Long.toString(b2));
            a.put(concat, valueOf.length() != 0 ? str.concat(valueOf) : new String(str));
        }
    }

    /* renamed from: a */
    public final void mo17079a(pt2 pt2, String str) {
        this.f18981g.put(pt2, Long.valueOf(this.f18983i.mo11989b()));
    }

    /* renamed from: e */
    public final void mo17080e(pt2 pt2, String str, Throwable th) {
        String str2;
        if (this.f18981g.containsKey(pt2)) {
            long b = this.f18983i.mo11989b() - this.f18981g.get(pt2).longValue();
            Map<String, String> a = this.f18982h.mo16745a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b));
            if (valueOf2.length() != 0) {
                str2 = "f.".concat(valueOf2);
            } else {
                str2 = new String("f.");
            }
            a.put(concat, str2);
        }
        if (this.f18984j.containsKey(pt2)) {
            m26418b(pt2, false);
        }
    }

    /* renamed from: g */
    public final void mo17081g(pt2 pt2, String str) {
        String str2;
        if (this.f18981g.containsKey(pt2)) {
            long b = this.f18983i.mo11989b() - this.f18981g.get(pt2).longValue();
            Map<String, String> a = this.f18982h.mo16745a();
            String valueOf = String.valueOf(str);
            String concat = valueOf.length() != 0 ? "task.".concat(valueOf) : new String("task.");
            String valueOf2 = String.valueOf(Long.toString(b));
            if (valueOf2.length() != 0) {
                str2 = "s.".concat(valueOf2);
            } else {
                str2 = new String("s.");
            }
            a.put(concat, str2);
        }
        if (this.f18984j.containsKey(pt2)) {
            m26418b(pt2, true);
        }
    }

    /* renamed from: r */
    public final void mo17082r(pt2 pt2, String str) {
    }
}
