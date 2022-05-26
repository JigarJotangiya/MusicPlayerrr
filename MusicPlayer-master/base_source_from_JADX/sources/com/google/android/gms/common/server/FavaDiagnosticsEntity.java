package com.google.android.gms.common.server;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class FavaDiagnosticsEntity extends AbstractSafeParcelable implements ReflectedParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<FavaDiagnosticsEntity> CREATOR = new C3342a();

    /* renamed from: g */
    final int f10707g;
    @RecentlyNonNull

    /* renamed from: h */
    public final String f10708h;

    /* renamed from: i */
    public final int f10709i;

    public FavaDiagnosticsEntity(int i, @RecentlyNonNull String str, int i2) {
        this.f10707g = i;
        this.f10708h = str;
        this.f10709i = i2;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10707g);
        C3315b.m14322n(parcel, 2, this.f10708h, false);
        C3315b.m14316h(parcel, 3, this.f10709i);
        C3315b.m14310b(parcel, a);
    }
}
