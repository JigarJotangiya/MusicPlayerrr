package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class Feature extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Feature> CREATOR = new C3337o();

    /* renamed from: g */
    private final String f10303g;
    @Deprecated

    /* renamed from: h */
    private final int f10304h;

    /* renamed from: i */
    private final long f10305i;

    public Feature(@RecentlyNonNull String str, int i, long j) {
        this.f10303g = str;
        this.f10304h = i;
        this.f10305i = j;
    }

    public Feature(@RecentlyNonNull String str, long j) {
        this.f10303g = str;
        this.f10305i = j;
        this.f10304h = -1;
    }

    @RecentlyNonNull
    /* renamed from: Y */
    public String mo11455Y() {
        return this.f10303g;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((mo11455Y() == null || !mo11455Y().equals(feature.mo11455Y())) && (mo11455Y() != null || feature.mo11455Y() != null)) || mo11458m0() != feature.mo11458m0()) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return C3289k.m14228b(mo11455Y(), Long.valueOf(mo11458m0()));
    }

    /* renamed from: m0 */
    public long mo11458m0() {
        long j = this.f10305i;
        return j == -1 ? (long) this.f10304h : j;
    }

    @RecentlyNonNull
    public final String toString() {
        C3289k.C3290a c = C3289k.m14229c(this);
        c.mo11856a("name", mo11455Y());
        c.mo11856a("version", Long.valueOf(mo11458m0()));
        return c.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14322n(parcel, 1, mo11455Y(), false);
        C3315b.m14316h(parcel, 2, this.f10304h);
        C3315b.m14319k(parcel, 3, mo11458m0());
        C3315b.m14310b(parcel, a);
    }
}
