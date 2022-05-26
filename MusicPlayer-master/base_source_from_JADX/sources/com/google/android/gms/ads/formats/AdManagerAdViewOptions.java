package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.internal.ads.f40;
import com.google.android.gms.internal.ads.g40;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new C2916g();

    /* renamed from: g */
    private final boolean f9773g;

    /* renamed from: h */
    private final IBinder f9774h;

    AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.f9773g = z;
        this.f9774h = iBinder;
    }

    /* renamed from: Y */
    public boolean mo10743Y() {
        return this.f9773g;
    }

    /* renamed from: m0 */
    public final g40 mo10744m0() {
        IBinder iBinder = this.f9774h;
        if (iBinder == null) {
            return null;
        }
        return f40.m23459e7(iBinder);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 1, mo10743Y());
        C3315b.m14315g(parcel, 2, this.f9774h, false);
        C3315b.m14310b(parcel, a);
    }
}
