package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zam extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zam> CREATOR = new C3348b();

    /* renamed from: g */
    final int f10739g;

    /* renamed from: h */
    final String f10740h;

    /* renamed from: i */
    final FastJsonResponse.Field<?, ?> f10741i;

    zam(int i, String str, FastJsonResponse.Field<?, ?> field) {
        this.f10739g = i;
        this.f10740h = str;
        this.f10741i = field;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10739g);
        C3315b.m14322n(parcel, 2, this.f10740h, false);
        C3315b.m14321m(parcel, 3, this.f10741i, i, false);
        C3315b.m14310b(parcel, a);
    }

    zam(String str, FastJsonResponse.Field<?, ?> field) {
        this.f10739g = 1;
        this.f10740h = str;
        this.f10741i = field;
    }
}
