package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class t00<T> {

    /* renamed from: a */
    private final String f23669a;

    /* renamed from: b */
    private final T f23670b;

    /* renamed from: c */
    private final int f23671c;

    protected t00(String str, T t, int i) {
        this.f23669a = str;
        this.f23670b = t;
        this.f23671c = i;
    }

    /* renamed from: a */
    public static t00<Double> m31010a(String str, double d) {
        return new t00<>(str, Double.valueOf(d), 3);
    }

    /* renamed from: b */
    public static t00<Long> m31011b(String str, long j) {
        return new t00<>(str, Long.valueOf(j), 2);
    }

    /* renamed from: c */
    public static t00<String> m31012c(String str, String str2) {
        return new t00<>(str, str2, 4);
    }

    /* renamed from: d */
    public static t00<Boolean> m31013d(String str, boolean z) {
        return new t00<>(str, Boolean.valueOf(z), 1);
    }

    /* renamed from: e */
    public final T mo20989e() {
        u10 a = w10.m32858a();
        if (a == null) {
            if (w10.m32859b() != null) {
                w10.m32859b().zza();
            }
            return this.f23670b;
        }
        int i = this.f23671c - 1;
        if (i == 0) {
            return a.mo19868d(this.f23669a, ((Boolean) this.f23670b).booleanValue());
        }
        if (i == 1) {
            return a.mo19867c(this.f23669a, ((Long) this.f23670b).longValue());
        }
        if (i != 2) {
            return a.mo19865a(this.f23669a, (String) this.f23670b);
        }
        return a.mo19866b(this.f23669a, ((Double) this.f23670b).doubleValue());
    }
}
