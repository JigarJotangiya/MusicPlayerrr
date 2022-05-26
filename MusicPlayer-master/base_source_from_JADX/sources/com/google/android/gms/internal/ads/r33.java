package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class r33<T> extends u53<T> implements Serializable {
    final Comparator<T> zza;

    r33(Comparator<T> comparator) {
        Objects.requireNonNull(comparator);
        this.zza = comparator;
    }

    public final int compare(T t, T t2) {
        return this.zza.compare(t, t2);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r33) {
            return this.zza.equals(((r33) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode();
    }

    public final String toString() {
        return this.zza.toString();
    }
}
