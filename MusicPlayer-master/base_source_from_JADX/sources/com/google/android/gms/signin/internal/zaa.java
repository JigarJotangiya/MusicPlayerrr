package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.C3228l;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class zaa extends AbstractSafeParcelable implements C3228l {
    public static final Parcelable.Creator<zaa> CREATOR = new C5883b();

    /* renamed from: g */
    final int f27589g;

    /* renamed from: h */
    private int f27590h;

    /* renamed from: i */
    private Intent f27591i;

    public zaa() {
        this(2, 0, (Intent) null);
    }

    /* renamed from: Q */
    public final Status mo11486Q() {
        if (this.f27590h == 0) {
            return Status.f10315l;
        }
        return Status.f10317n;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27589g);
        C3315b.m14316h(parcel, 2, this.f27590h);
        C3315b.m14321m(parcel, 3, this.f27591i, i, false);
        C3315b.m14310b(parcel, a);
    }

    zaa(int i, int i2, Intent intent) {
        this.f27589g = i;
        this.f27590h = i2;
        this.f27591i = intent;
    }
}
