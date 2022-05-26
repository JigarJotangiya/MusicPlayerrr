package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yq1 {

    /* renamed from: a */
    private final Map<String, xq1> f26492a = new HashMap();

    yq1() {
    }

    /* renamed from: a */
    public final synchronized xq1 mo22275a(String str) {
        return this.f26492a.get(str);
    }

    /* renamed from: b */
    public final xq1 mo22276b(List<String> list) {
        for (String a : list) {
            xq1 a2 = mo22275a(a);
            if (a2 != null) {
                return a2;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized void mo22277c(String str, kq2 kq2) {
        if (!this.f26492a.containsKey(str)) {
            try {
                this.f26492a.put(str, new xq1(str, kq2.mo18970h(), kq2.mo18971i()));
            } catch (zp2 unused) {
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final synchronized void mo22278d(String str, bd0 bd0) {
        if (!this.f26492a.containsKey(str)) {
            try {
                this.f26492a.put(str, new xq1(str, bd0.mo16208c(), bd0.mo16209d()));
            } catch (Throwable unused) {
            }
        }
    }
}
