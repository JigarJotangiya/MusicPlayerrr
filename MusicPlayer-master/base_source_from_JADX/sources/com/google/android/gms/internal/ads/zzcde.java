package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzcde extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzcde> CREATOR = new fg0();

    /* renamed from: g */
    public final boolean f27343g;

    /* renamed from: h */
    public final List<String> f27344h;

    public zzcde() {
        this(false, Collections.emptyList());
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 2, this.f27343g);
        C3315b.m14324p(parcel, 3, this.f27344h, false);
        C3315b.m14310b(parcel, a);
    }

    public zzcde(boolean z, List<String> list) {
        this.f27343g = z;
        this.f27344h = list;
    }
}
