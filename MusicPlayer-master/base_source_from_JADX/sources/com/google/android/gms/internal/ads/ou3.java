package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ou3 {

    /* renamed from: c */
    public static final ou3 f21193c;

    /* renamed from: d */
    public static final ou3 f21194d;

    /* renamed from: a */
    public final long f21195a;

    /* renamed from: b */
    public final long f21196b;

    static {
        ou3 ou3 = new ou3(0, 0);
        f21193c = ou3;
        new ou3(Long.MAX_VALUE, Long.MAX_VALUE);
        new ou3(Long.MAX_VALUE, 0);
        new ou3(0, Long.MAX_VALUE);
        f21194d = ou3;
    }

    public ou3(long j, long j2) {
        boolean z = true;
        gs1.m24486d(j >= 0);
        gs1.m24486d(j2 < 0 ? false : z);
        this.f21195a = j;
        this.f21196b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ou3.class == obj.getClass()) {
            ou3 ou3 = (ou3) obj;
            return this.f21195a == ou3.f21195a && this.f21196b == ou3.f21196b;
        }
    }

    public final int hashCode() {
        return (((int) this.f21195a) * 31) + ((int) this.f21196b);
    }
}
