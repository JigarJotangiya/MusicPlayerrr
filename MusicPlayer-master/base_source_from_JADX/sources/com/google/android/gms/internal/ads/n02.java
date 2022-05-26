package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class n02 implements xt2 {

    /* renamed from: g */
    private final Map<pt2, String> f20438g = new HashMap();

    /* renamed from: h */
    private final Map<pt2, String> f20439h = new HashMap();

    /* renamed from: i */
    private final fu2 f20440i;

    public n02(Set<m02> set, fu2 fu2) {
        this.f20440i = fu2;
        for (m02 next : set) {
            this.f20438g.put(next.f19688b, next.f19687a);
            this.f20439h.put(next.f19689c, next.f19687a);
        }
    }

    /* renamed from: a */
    public final void mo17079a(pt2 pt2, String str) {
        String str2;
        fu2 fu2 = this.f20440i;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "task.".concat(valueOf);
        } else {
            str2 = new String("task.");
        }
        fu2.mo17739d(str2);
        if (this.f20438g.containsKey(pt2)) {
            fu2 fu22 = this.f20440i;
            String valueOf2 = String.valueOf(this.f20438g.get(pt2));
            fu22.mo17739d(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."));
        }
    }

    /* renamed from: e */
    public final void mo17080e(pt2 pt2, String str, Throwable th) {
        String str2;
        fu2 fu2 = this.f20440i;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "task.".concat(valueOf);
        } else {
            str2 = new String("task.");
        }
        fu2.mo17740e(str2, "f.");
        if (this.f20439h.containsKey(pt2)) {
            fu2 fu22 = this.f20440i;
            String valueOf2 = String.valueOf(this.f20439h.get(pt2));
            fu22.mo17740e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "f.");
        }
    }

    /* renamed from: g */
    public final void mo17081g(pt2 pt2, String str) {
        String str2;
        fu2 fu2 = this.f20440i;
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = "task.".concat(valueOf);
        } else {
            str2 = new String("task.");
        }
        fu2.mo17740e(str2, "s.");
        if (this.f20439h.containsKey(pt2)) {
            fu2 fu22 = this.f20440i;
            String valueOf2 = String.valueOf(this.f20439h.get(pt2));
            fu22.mo17740e(valueOf2.length() != 0 ? "label.".concat(valueOf2) : new String("label."), "s.");
        }
    }

    /* renamed from: r */
    public final void mo17082r(pt2 pt2, String str) {
    }
}
