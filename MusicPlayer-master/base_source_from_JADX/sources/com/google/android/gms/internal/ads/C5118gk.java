package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Objects;

/* renamed from: com.google.android.gms.internal.ads.gk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public class C5118gk {

    /* renamed from: a */
    protected final C4932bk f17157a;

    /* renamed from: b */
    protected final int[] f17158b;

    /* renamed from: c */
    private final zzapg[] f17159c = new zzapg[1];

    /* renamed from: d */
    private int f17160d;

    public C5118gk(C4932bk bkVar, int... iArr) {
        Objects.requireNonNull(bkVar);
        this.f17157a = bkVar;
        for (int i = 0; i <= 0; i++) {
            this.f17159c[i] = bkVar.mo16252b(iArr[i]);
        }
        Arrays.sort(this.f17159c, new C5081fk((C5043ek) null));
        this.f17158b = new int[1];
        for (int i2 = 0; i2 <= 0; i2++) {
            this.f17158b[i2] = bkVar.mo16251a(this.f17159c[i2]);
        }
    }

    /* renamed from: a */
    public final int mo17954a(int i) {
        return this.f17158b[0];
    }

    /* renamed from: b */
    public final int mo17955b() {
        int length = this.f17158b.length;
        return 1;
    }

    /* renamed from: c */
    public final zzapg mo17956c(int i) {
        return this.f17159c[i];
    }

    /* renamed from: d */
    public final C4932bk mo17957d() {
        return this.f17157a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C5118gk gkVar = (C5118gk) obj;
            return this.f17157a == gkVar.f17157a && Arrays.equals(this.f17158b, gkVar.f17158b);
        }
    }

    public final int hashCode() {
        int i = this.f17160d;
        if (i != 0) {
            return i;
        }
        int identityHashCode = (System.identityHashCode(this.f17157a) * 31) + Arrays.hashCode(this.f17158b);
        this.f17160d = identityHashCode;
        return identityHashCode;
    }
}
