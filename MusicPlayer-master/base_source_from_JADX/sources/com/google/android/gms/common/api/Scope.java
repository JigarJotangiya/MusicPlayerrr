package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<Scope> CREATOR = new C3233q();

    /* renamed from: g */
    final int f10313g;

    /* renamed from: h */
    private final String f10314h;

    Scope(int i, String str) {
        C3292l.m14238f(str, "scopeUri must not be null or empty");
        this.f10313g = i;
        this.f10314h = str;
    }

    @RecentlyNonNull
    /* renamed from: Y */
    public String mo11479Y() {
        return this.f10314h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f10314h.equals(((Scope) obj).f10314h);
    }

    public int hashCode() {
        return this.f10314h.hashCode();
    }

    @RecentlyNonNull
    public String toString() {
        return this.f10314h;
    }

    public void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10313g);
        C3315b.m14322n(parcel, 2, mo11479Y(), false);
        C3315b.m14310b(parcel, a);
    }

    public Scope(@RecentlyNonNull String str) {
        this(1, str);
    }
}
