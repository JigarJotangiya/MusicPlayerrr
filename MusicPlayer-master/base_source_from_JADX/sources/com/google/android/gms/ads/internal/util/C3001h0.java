package com.google.android.gms.ads.internal.util;

import com.google.android.gms.common.internal.C3289k;

/* renamed from: com.google.android.gms.ads.internal.util.h0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3001h0 {

    /* renamed from: a */
    public final String f10010a;

    /* renamed from: b */
    public final double f10011b;

    /* renamed from: c */
    public final double f10012c;

    /* renamed from: d */
    public final double f10013d;

    /* renamed from: e */
    public final int f10014e;

    public C3001h0(String str, double d, double d2, double d3, int i) {
        this.f10010a = str;
        this.f10012c = d;
        this.f10011b = d2;
        this.f10013d = d3;
        this.f10014e = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3001h0)) {
            return false;
        }
        C3001h0 h0Var = (C3001h0) obj;
        if (C3289k.m14227a(this.f10010a, h0Var.f10010a) && this.f10011b == h0Var.f10011b && this.f10012c == h0Var.f10012c && this.f10014e == h0Var.f10014e && Double.compare(this.f10013d, h0Var.f10013d) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3289k.m14228b(this.f10010a, Double.valueOf(this.f10011b), Double.valueOf(this.f10012c), Double.valueOf(this.f10013d), Integer.valueOf(this.f10014e));
    }

    public final String toString() {
        C3289k.C3290a c = C3289k.m14229c(this);
        c.mo11856a("name", this.f10010a);
        c.mo11856a("minBound", Double.valueOf(this.f10012c));
        c.mo11856a("maxBound", Double.valueOf(this.f10011b));
        c.mo11856a("percent", Double.valueOf(this.f10013d));
        c.mo11856a("count", Integer.valueOf(this.f10014e));
        return c.toString();
    }
}
