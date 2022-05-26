package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.images.d */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3251d implements Parcelable.Creator<WebImage> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                uri = (Uri) C3313a.m14297o(parcel, z, Uri.CREATOR);
            } else if (v == 3) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z);
            } else {
                i3 = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new WebImage(i, uri, i2, i3);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WebImage[i];
    }
}