package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.internal.c0 */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3259c0 implements Parcelable.Creator<MethodInvocation> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z)) {
                case 1:
                    i = C3313a.m14277B(parcel2, z);
                    break;
                case 2:
                    i2 = C3313a.m14277B(parcel2, z);
                    break;
                case 3:
                    i3 = C3313a.m14277B(parcel2, z);
                    break;
                case 4:
                    j = C3313a.m14278C(parcel2, z);
                    break;
                case 5:
                    j2 = C3313a.m14278C(parcel2, z);
                    break;
                case 6:
                    str = C3313a.m14298p(parcel2, z);
                    break;
                case 7:
                    str2 = C3313a.m14298p(parcel2, z);
                    break;
                case 8:
                    i4 = C3313a.m14277B(parcel2, z);
                    break;
                default:
                    C3313a.m14280E(parcel2, z);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new MethodInvocation(i, i2, i3, j, j2, str, str2, i4);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new MethodInvocation[i];
    }
}
