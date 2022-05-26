package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C3228l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zag extends AbstractSafeParcelable implements C3228l {
    public static final Parcelable.Creator<zag> CREATOR = new C5888g();

    /* renamed from: g */
    private final List<String> f27592g;

    /* renamed from: h */
    private final String f27593h;

    public zag(List<String> list, String str) {
        this.f27592g = list;
        this.f27593h = str;
    }

    /* renamed from: Q */
    public final Status mo11486Q() {
        if (this.f27593h != null) {
            return Status.f10315l;
        }
        return Status.f10317n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14324p(parcel, 1, this.f27592g, false);
        C3315b.m14322n(parcel, 2, this.f27593h, false);
        C3315b.m14310b(parcel, a);
    }
}
