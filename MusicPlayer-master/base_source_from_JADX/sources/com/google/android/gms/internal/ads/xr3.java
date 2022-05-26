package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xr3<T> implements ms3, sr3 {

    /* renamed from: c */
    private static final Object f25936c = new Object();

    /* renamed from: a */
    private volatile ms3<T> f25937a;

    /* renamed from: b */
    private volatile Object f25938b = f25936c;

    private xr3(ms3<T> ms3) {
        this.f25937a = ms3;
    }

    /* renamed from: b */
    public static <P extends ms3<T>, T> sr3<T> m33786b(P p) {
        if (p instanceof sr3) {
            return (sr3) p;
        }
        Objects.requireNonNull(p);
        return new xr3(p);
    }

    /* renamed from: c */
    public static <P extends ms3<T>, T> ms3<T> m33787c(P p) {
        Objects.requireNonNull(p);
        if (p instanceof xr3) {
            return p;
        }
        return new xr3(p);
    }

    /* renamed from: a */
    public final T mo10679a() {
        T t = this.f25938b;
        T t2 = f25936c;
        if (t == t2) {
            synchronized (this) {
                t = this.f25938b;
                if (t == t2) {
                    t = this.f25937a.mo10679a();
                    T t3 = this.f25938b;
                    if (t3 != t2) {
                        if (t3 != t) {
                            String valueOf = String.valueOf(t3);
                            String valueOf2 = String.valueOf(t);
                            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 118 + String.valueOf(valueOf2).length());
                            sb.append("Scoped provider was invoked recursively returning different results: ");
                            sb.append(valueOf);
                            sb.append(" & ");
                            sb.append(valueOf2);
                            sb.append(". This is likely due to a circular dependency.");
                            throw new IllegalStateException(sb.toString());
                        }
                    }
                    this.f25938b = t;
                    this.f25937a = null;
                }
            }
        }
        return t;
    }
}
