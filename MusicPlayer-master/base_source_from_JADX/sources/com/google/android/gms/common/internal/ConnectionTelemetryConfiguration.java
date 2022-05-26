package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new C3323w0();

    /* renamed from: g */
    private final RootTelemetryConfiguration f10532g;

    /* renamed from: h */
    private final boolean f10533h;

    /* renamed from: i */
    private final boolean f10534i;

    /* renamed from: j */
    private final int[] f10535j;

    /* renamed from: k */
    private final int f10536k;

    /* renamed from: l */
    private final int[] f10537l;

    public ConnectionTelemetryConfiguration(@RecentlyNonNull RootTelemetryConfiguration rootTelemetryConfiguration, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.f10532g = rootTelemetryConfiguration;
        this.f10533h = z;
        this.f10534i = z2;
        this.f10535j = iArr;
        this.f10536k = i;
        this.f10537l = iArr2;
    }

    /* renamed from: Y */
    public int mo11729Y() {
        return this.f10536k;
    }

    @RecentlyNullable
    /* renamed from: m0 */
    public int[] mo11730m0() {
        return this.f10535j;
    }

    @RecentlyNullable
    /* renamed from: n0 */
    public int[] mo11731n0() {
        return this.f10537l;
    }

    /* renamed from: o0 */
    public boolean mo11732o0() {
        return this.f10533h;
    }

    /* renamed from: v0 */
    public boolean mo11733v0() {
        return this.f10534i;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14321m(parcel, 1, mo11735z0(), i, false);
        C3315b.m14311c(parcel, 2, mo11732o0());
        C3315b.m14311c(parcel, 3, mo11733v0());
        C3315b.m14317i(parcel, 4, mo11730m0(), false);
        C3315b.m14316h(parcel, 5, mo11729Y());
        C3315b.m14317i(parcel, 6, mo11731n0(), false);
        C3315b.m14310b(parcel, a);
    }

    @RecentlyNonNull
    /* renamed from: z0 */
    public RootTelemetryConfiguration mo11735z0() {
        return this.f10532g;
    }
}
