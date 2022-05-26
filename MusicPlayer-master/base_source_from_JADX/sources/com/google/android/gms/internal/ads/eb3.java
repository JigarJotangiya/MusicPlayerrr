package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class eb3 {

    /* renamed from: a */
    public final String f15913a;

    /* renamed from: b */
    public final C5689w f15914b;

    /* renamed from: c */
    public final C5689w f15915c;

    /* renamed from: d */
    public final int f15916d;

    /* renamed from: e */
    public final int f15917e;

    public eb3(String str, C5689w wVar, C5689w wVar2, int i, int i2) {
        boolean z = false;
        if (i != 0) {
            i2 = i2 == 0 ? 0 : i2;
            gs1.m24486d(z);
            gs1.m24485c(str);
            this.f15913a = str;
            Objects.requireNonNull(wVar);
            this.f15914b = wVar;
            Objects.requireNonNull(wVar2);
            this.f15915c = wVar2;
            this.f15916d = i;
            this.f15917e = i2;
        }
        z = true;
        gs1.m24486d(z);
        gs1.m24485c(str);
        this.f15913a = str;
        Objects.requireNonNull(wVar);
        this.f15914b = wVar;
        Objects.requireNonNull(wVar2);
        this.f15915c = wVar2;
        this.f15916d = i;
        this.f15917e = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && eb3.class == obj.getClass()) {
            eb3 eb3 = (eb3) obj;
            return this.f15916d == eb3.f15916d && this.f15917e == eb3.f15917e && this.f15913a.equals(eb3.f15913a) && this.f15914b.equals(eb3.f15914b) && this.f15915c.equals(eb3.f15915c);
        }
    }

    public final int hashCode() {
        return ((((((((this.f15916d + 527) * 31) + this.f15917e) * 31) + this.f15913a.hashCode()) * 31) + this.f15914b.hashCode()) * 31) + this.f15915c.hashCode();
    }
}
