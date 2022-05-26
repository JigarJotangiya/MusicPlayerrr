package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new C3295m0();

    /* renamed from: g */
    private final int f10560g;

    /* renamed from: h */
    private final boolean f10561h;

    /* renamed from: i */
    private final boolean f10562i;

    /* renamed from: j */
    private final int f10563j;

    /* renamed from: k */
    private final int f10564k;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.f10560g = i;
        this.f10561h = z;
        this.f10562i = z2;
        this.f10563j = i2;
        this.f10564k = i3;
    }

    /* renamed from: Y */
    public int mo11739Y() {
        return this.f10563j;
    }

    /* renamed from: m0 */
    public int mo11740m0() {
        return this.f10564k;
    }

    /* renamed from: n0 */
    public boolean mo11741n0() {
        return this.f10561h;
    }

    /* renamed from: o0 */
    public boolean mo11742o0() {
        return this.f10562i;
    }

    /* renamed from: v0 */
    public int mo11743v0() {
        return this.f10560g;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, mo11743v0());
        C3315b.m14311c(parcel, 2, mo11741n0());
        C3315b.m14311c(parcel, 3, mo11742o0());
        C3315b.m14316h(parcel, 4, mo11739Y());
        C3315b.m14316h(parcel, 5, mo11740m0());
        C3315b.m14310b(parcel, a);
    }
}
