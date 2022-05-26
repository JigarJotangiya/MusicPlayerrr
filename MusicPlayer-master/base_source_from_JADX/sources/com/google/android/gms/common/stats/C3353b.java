package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.stats.b */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class C3353b implements Parcelable.Creator<WakeLockEvent> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int F = C3313a.m14281F(parcel);
        long j = 0;
        long j2 = 0;
        long j3 = 0;
        String str = null;
        ArrayList<String> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        float f = 0.0f;
        boolean z = false;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z2)) {
                case 1:
                    i = C3313a.m14277B(parcel2, z2);
                    break;
                case 2:
                    j = C3313a.m14278C(parcel2, z2);
                    break;
                case 4:
                    str = C3313a.m14298p(parcel2, z2);
                    break;
                case 5:
                    i3 = C3313a.m14277B(parcel2, z2);
                    break;
                case 6:
                    arrayList = C3313a.m14300r(parcel2, z2);
                    break;
                case 8:
                    j2 = C3313a.m14278C(parcel2, z2);
                    break;
                case 10:
                    str3 = C3313a.m14298p(parcel2, z2);
                    break;
                case 11:
                    i2 = C3313a.m14277B(parcel2, z2);
                    break;
                case 12:
                    str2 = C3313a.m14298p(parcel2, z2);
                    break;
                case 13:
                    str4 = C3313a.m14298p(parcel2, z2);
                    break;
                case 14:
                    i4 = C3313a.m14277B(parcel2, z2);
                    break;
                case 15:
                    f = C3313a.m14307y(parcel2, z2);
                    break;
                case 16:
                    j3 = C3313a.m14278C(parcel2, z2);
                    break;
                case 17:
                    str5 = C3313a.m14298p(parcel2, z2);
                    break;
                case 18:
                    z = C3313a.m14305w(parcel2, z2);
                    break;
                default:
                    C3313a.m14280E(parcel2, z2);
                    break;
            }
        }
        C3313a.m14303u(parcel2, F);
        return new WakeLockEvent(i, j, i2, str, i3, arrayList, str2, j2, i4, str3, str4, f, j3, str5, z);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new WakeLockEvent[i];
    }
}
