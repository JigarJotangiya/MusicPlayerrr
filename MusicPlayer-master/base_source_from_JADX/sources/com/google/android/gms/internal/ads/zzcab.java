package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.mediation.C3094w;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class zzcab extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcab> CREATOR = new pd0();

    /* renamed from: g */
    public final int f27277g;

    /* renamed from: h */
    public final int f27278h;

    /* renamed from: i */
    public final int f27279i;

    zzcab(int i, int i2, int i3) {
        this.f27277g = i;
        this.f27278h = i2;
        this.f27279i = i3;
    }

    /* renamed from: Y */
    public static zzcab m34959Y(C3094w wVar) {
        wVar.mo11273a();
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzcab)) {
            zzcab zzcab = (zzcab) obj;
            if (zzcab.f27279i == this.f27279i && zzcab.f27278h == this.f27278h && zzcab.f27277g == this.f27277g) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.f27277g, this.f27278h, this.f27279i});
    }

    public final String toString() {
        int i = this.f27277g;
        int i2 = this.f27278h;
        int i3 = this.f27279i;
        StringBuilder sb = new StringBuilder(35);
        sb.append(i);
        sb.append(".");
        sb.append(i2);
        sb.append(".");
        sb.append(i3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27277g);
        C3315b.m14316h(parcel, 2, this.f27278h);
        C3315b.m14316h(parcel, 3, this.f27279i);
        C3315b.m14310b(parcel, a);
    }
}
