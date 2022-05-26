package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C3289k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ch0 extends eh0 {

    /* renamed from: g */
    private final String f14978g;

    /* renamed from: h */
    private final int f14979h;

    public ch0(String str, int i) {
        this.f14978g = str;
        this.f14979h = i;
    }

    /* renamed from: a */
    public final int mo16632a() {
        return this.f14979h;
    }

    /* renamed from: b */
    public final String mo16633b() {
        return this.f14978g;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof ch0)) {
            ch0 ch0 = (ch0) obj;
            if (!C3289k.m14227a(this.f14978g, ch0.f14978g) || !C3289k.m14227a(Integer.valueOf(this.f14979h), Integer.valueOf(ch0.f14979h))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
