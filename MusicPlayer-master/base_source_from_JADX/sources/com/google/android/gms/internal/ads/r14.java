package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r14 implements w34 {

    /* renamed from: g */
    protected final w34[] f22704g;

    public r14(w34[] w34Arr) {
        this.f22704g = w34Arr;
    }

    /* renamed from: a */
    public final long mo17092a() {
        long j = Long.MAX_VALUE;
        for (w34 a : this.f22704g) {
            long a2 = a.mo17092a();
            if (a2 != Long.MIN_VALUE) {
                j = Math.min(j, a2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: b */
    public final long mo17093b() {
        long j = Long.MAX_VALUE;
        for (w34 b : this.f22704g) {
            long b2 = b.mo17093b();
            if (b2 != Long.MIN_VALUE) {
                j = Math.min(j, b2);
            }
        }
        if (j == Long.MAX_VALUE) {
            return Long.MIN_VALUE;
        }
        return j;
    }

    /* renamed from: d */
    public final boolean mo17095d(long j) {
        long j2 = j;
        boolean z = false;
        while (true) {
            long b = mo17093b();
            if (b != Long.MIN_VALUE) {
                boolean z2 = false;
                for (w34 w34 : this.f22704g) {
                    long b2 = w34.mo17093b();
                    boolean z3 = b2 != Long.MIN_VALUE && b2 <= j2;
                    if (b2 == b || z3) {
                        z2 |= w34.mo17095d(j2);
                    }
                }
                z |= z2;
                if (!z2) {
                    break;
                }
            } else {
                break;
            }
        }
        return z;
    }

    /* renamed from: e */
    public final void mo17096e(long j) {
        for (w34 e : this.f22704g) {
            e.mo17096e(j);
        }
    }

    /* renamed from: l */
    public final boolean mo17101l() {
        for (w34 l : this.f22704g) {
            if (l.mo17101l()) {
                return true;
            }
        }
        return false;
    }
}
