package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import com.google.android.gms.internal.ads.C5093fw;
import com.google.android.gms.internal.ads.C5130gw;
import com.google.android.gms.internal.ads.f40;
import com.google.android.gms.internal.ads.g40;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new C2919j();

    /* renamed from: g */
    private final boolean f9775g;

    /* renamed from: h */
    private final C5130gw f9776h;

    /* renamed from: i */
    private final IBinder f9777i;

    PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.f9775g = z;
        this.f9776h = iBinder != null ? C5093fw.m23991e7(iBinder) : null;
        this.f9777i = iBinder2;
    }

    /* renamed from: Y */
    public final C5130gw mo10748Y() {
        return this.f9776h;
    }

    /* renamed from: m0 */
    public final g40 mo10749m0() {
        IBinder iBinder = this.f9777i;
        if (iBinder == null) {
            return null;
        }
        return f40.m23459e7(iBinder);
    }

    /* renamed from: n0 */
    public final boolean mo10750n0() {
        return this.f9775g;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        IBinder iBinder;
        int a = C3315b.m14309a(parcel);
        C3315b.m14311c(parcel, 1, this.f9775g);
        C5130gw gwVar = this.f9776h;
        if (gwVar == null) {
            iBinder = null;
        } else {
            iBinder = gwVar.asBinder();
        }
        C3315b.m14315g(parcel, 2, iBinder, false);
        C3315b.m14315g(parcel, 3, this.f9777i, false);
        C3315b.m14310b(parcel, a);
    }
}
