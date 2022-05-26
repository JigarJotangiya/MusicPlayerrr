package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class ClientIdentity extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new C3309r();

    /* renamed from: g */
    public final int f10530g;
    @RecentlyNullable

    /* renamed from: h */
    public final String f10531h;

    public ClientIdentity(int i, String str) {
        this.f10530g = i;
        this.f10531h = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ClientIdentity)) {
            return false;
        }
        ClientIdentity clientIdentity = (ClientIdentity) obj;
        return clientIdentity.f10530g == this.f10530g && C3289k.m14227a(clientIdentity.f10531h, this.f10531h);
    }

    public final int hashCode() {
        return this.f10530g;
    }

    @RecentlyNonNull
    public final String toString() {
        int i = this.f10530g;
        String str = this.f10531h;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(i);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10530g);
        C3315b.m14322n(parcel, 2, this.f10531h, false);
        C3315b.m14310b(parcel, a);
    }
}
