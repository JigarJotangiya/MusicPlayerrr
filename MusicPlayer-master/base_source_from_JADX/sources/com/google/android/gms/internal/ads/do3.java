package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class do3<T> implements to3<T> {

    /* renamed from: a */
    private final zn3 f15708a;

    /* renamed from: b */
    private final lp3<?, ?> f15709b;

    /* renamed from: c */
    private final boolean f15710c;

    /* renamed from: d */
    private final dm3<?> f15711d;

    private do3(lp3<?, ?> lp3, dm3<?> dm3, zn3 zn3) {
        this.f15709b = lp3;
        this.f15710c = dm3.mo16960h(zn3);
        this.f15711d = dm3;
        this.f15708a = zn3;
    }

    /* renamed from: j */
    static <T> do3<T> m22624j(lp3<?, ?> lp3, dm3<?> dm3, zn3 zn3) {
        return new do3<>(lp3, dm3, zn3);
    }

    /* renamed from: a */
    public final int mo16702a(T t) {
        int hashCode = this.f15709b.mo19254d(t).hashCode();
        if (!this.f15710c) {
            return hashCode;
        }
        this.f15711d.mo16953a(t);
        throw null;
    }

    /* renamed from: b */
    public final int mo16703b(T t) {
        lp3<?, ?> lp3 = this.f15709b;
        int b = lp3.mo19252b(lp3.mo19254d(t));
        if (!this.f15710c) {
            return b;
        }
        this.f15711d.mo16953a(t);
        throw null;
    }

    /* renamed from: c */
    public final void mo16704c(T t) {
        this.f15709b.mo19263m(t);
        this.f15711d.mo16957e(t);
    }

    /* renamed from: d */
    public final void mo16705d(T t, lo3 lo3, cm3 cm3) throws IOException {
        boolean z;
        lp3<?, ?> lp3 = this.f15709b;
        dm3<?> dm3 = this.f15711d;
        Object c = lp3.mo19253c(t);
        im3<?> b = dm3.mo16954b(t);
        while (lo3.mo19202b() != Integer.MAX_VALUE) {
            int f = lo3.mo19206f();
            if (f != 11) {
                if ((f & 7) == 2) {
                    Object c2 = dm3.mo16955c(cm3, this.f15708a, f >>> 3);
                    if (c2 != null) {
                        dm3.mo16958f(lo3, c2, cm3, b);
                    } else {
                        z = lp3.mo19266p(c, lo3);
                    }
                } else {
                    z = lo3.mo19217q();
                }
                if (!z) {
                    lp3.mo19264n(t, c);
                    return;
                }
            } else {
                int i = 0;
                Object obj = null;
                kl3 kl3 = null;
                while (true) {
                    try {
                        if (lo3.mo19202b() == Integer.MAX_VALUE) {
                            break;
                        }
                        int f2 = lo3.mo19206f();
                        if (f2 == 16) {
                            i = lo3.mo19208h();
                            obj = dm3.mo16955c(cm3, this.f15708a, i);
                        } else if (f2 == 26) {
                            if (obj != null) {
                                dm3.mo16958f(lo3, obj, cm3, b);
                            } else {
                                kl3 = lo3.zzp();
                            }
                        } else if (!lo3.mo19217q()) {
                            break;
                        }
                    } catch (Throwable th) {
                        lp3.mo19264n(t, c);
                        throw th;
                    }
                }
                if (lo3.mo19206f() != 12) {
                    throw bn3.zzb();
                } else if (kl3 != null) {
                    if (obj != null) {
                        dm3.mo16959g(kl3, obj, cm3, b);
                    } else {
                        lp3.mo19261k(c, i, kl3);
                    }
                }
            }
        }
        lp3.mo19264n(t, c);
    }

    /* renamed from: e */
    public final void mo16706e(T t, yl3 yl3) throws IOException {
        this.f15711d.mo16953a(t);
        throw null;
    }

    /* renamed from: f */
    public final void mo16707f(T t, byte[] bArr, int i, int i2, yk3 yk3) throws IOException {
        qm3 qm3 = (qm3) t;
        if (qm3.zzc == mp3.m27385c()) {
            qm3.zzc = mp3.m27387e();
        }
        om3 om3 = (om3) t;
        throw null;
    }

    /* renamed from: g */
    public final boolean mo16708g(T t) {
        this.f15711d.mo16953a(t);
        throw null;
    }

    /* renamed from: h */
    public final void mo16709h(T t, T t2) {
        vo3.m32596f(this.f15709b, t, t2);
        if (this.f15710c) {
            vo3.m32595e(this.f15711d, t, t2);
            throw null;
        }
    }

    /* renamed from: i */
    public final boolean mo16710i(T t, T t2) {
        if (!this.f15709b.mo19254d(t).equals(this.f15709b.mo19254d(t2))) {
            return false;
        }
        if (!this.f15710c) {
            return true;
        }
        this.f15711d.mo16953a(t);
        this.f15711d.mo16953a(t2);
        throw null;
    }

    public final T zze() {
        return this.f15708a.mo20470f().mo19755Q();
    }
}
