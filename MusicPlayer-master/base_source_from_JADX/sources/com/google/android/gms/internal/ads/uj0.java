package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uj0 {

    /* renamed from: d */
    public static final uj0 f24342d = new uj0(new xh0[0]);

    /* renamed from: a */
    public final int f24343a;

    /* renamed from: b */
    private final xh0[] f24344b;

    /* renamed from: c */
    private int f24345c;

    static {
        ui0 ui0 = ui0.f24339a;
    }

    public uj0(xh0... xh0Arr) {
        this.f24344b = xh0Arr;
        this.f24343a = xh0Arr.length;
    }

    /* renamed from: a */
    public final int mo21274a(xh0 xh0) {
        for (int i = 0; i < this.f24343a; i++) {
            if (this.f24344b[i] == xh0) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final xh0 mo21275b(int i) {
        return this.f24344b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && uj0.class == obj.getClass()) {
            uj0 uj0 = (uj0) obj;
            return this.f24343a == uj0.f24343a && Arrays.equals(this.f24344b, uj0.f24344b);
        }
    }

    public final int hashCode() {
        int i = this.f24345c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24344b);
        this.f24345c = hashCode;
        return hashCode;
    }
}
