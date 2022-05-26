package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class d63<T> extends u53<T> implements Serializable {
    final u53<? super T> zza;

    d63(u53<? super T> u53) {
        this.zza = u53;
    }

    public final int compare(T t, T t2) {
        return this.zza.compare(t2, t);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d63) {
            return this.zza.equals(((d63) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return -this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString().concat(".reverse()");
    }

    public final <S extends T> u53<S> zza() {
        return this.zza;
    }
}
