package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class h44 {

    /* renamed from: a */
    protected final xh0 f17527a;

    /* renamed from: b */
    protected final int f17528b;

    /* renamed from: c */
    protected final int[] f17529c;

    /* renamed from: d */
    private final C5689w[] f17530d;

    /* renamed from: e */
    private int f17531e;

    public h44(xh0 xh0, int[] iArr, int i) {
        int length = iArr.length;
        gs1.m24488f(length > 0);
        Objects.requireNonNull(xh0);
        this.f17527a = xh0;
        this.f17528b = length;
        this.f17530d = new C5689w[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.f17530d[i2] = xh0.mo22031b(iArr[i2]);
        }
        Arrays.sort(this.f17530d, g44.f16948g);
        this.f17529c = new int[this.f17528b];
        for (int i3 = 0; i3 < this.f17528b; i3++) {
            this.f17529c[i3] = xh0.mo22030a(this.f17530d[i3]);
        }
    }

    /* renamed from: a */
    public final int mo18076a(int i) {
        return this.f17529c[0];
    }

    /* renamed from: b */
    public final int mo18077b() {
        return this.f17529c.length;
    }

    /* renamed from: c */
    public final C5689w mo18078c(int i) {
        return this.f17530d[i];
    }

    /* renamed from: d */
    public final xh0 mo18079d() {
        return this.f17527a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h44 h44 = (h44) obj;
            return this.f17527a == h44.f17527a && Arrays.equals(this.f17529c, h44.f17529c);
        }
    }

    public final int hashCode() {
        int i = this.f17531e;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f17527a) * 31) + Arrays.hashCode(this.f17529c);
        this.f17531e = identityHashCode;
        return identityHashCode;
    }
}
