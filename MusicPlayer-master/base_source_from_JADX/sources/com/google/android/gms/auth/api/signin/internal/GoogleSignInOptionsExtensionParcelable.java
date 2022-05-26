package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class GoogleSignInOptionsExtensionParcelable extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<GoogleSignInOptionsExtensionParcelable> CREATOR = new C3144c();

    /* renamed from: g */
    final int f10286g;

    /* renamed from: h */
    private int f10287h;

    /* renamed from: i */
    private Bundle f10288i;

    GoogleSignInOptionsExtensionParcelable(int i, int i2, Bundle bundle) {
        this.f10286g = i;
        this.f10287h = i2;
        this.f10288i = bundle;
    }

    /* renamed from: Y */
    public int mo11434Y() {
        return this.f10287h;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10286g);
        C3315b.m14316h(parcel, 2, mo11434Y());
        C3315b.m14312d(parcel, 3, this.f10288i, false);
        C3315b.m14310b(parcel, a);
    }
}
