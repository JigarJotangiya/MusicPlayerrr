package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class TelemetryData extends AbstractSafeParcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<TelemetryData> CREATOR = new C3311s();

    /* renamed from: g */
    private final int f10565g;

    /* renamed from: h */
    private List<MethodInvocation> f10566h;

    public TelemetryData(int i, List<MethodInvocation> list) {
        this.f10565g = i;
        this.f10566h = list;
    }

    /* renamed from: Y */
    public final int mo11745Y() {
        return this.f10565g;
    }

    @RecentlyNullable
    /* renamed from: m0 */
    public final List<MethodInvocation> mo11746m0() {
        return this.f10566h;
    }

    /* renamed from: n0 */
    public final void mo11747n0(@RecentlyNonNull MethodInvocation methodInvocation) {
        if (this.f10566h == null) {
            this.f10566h = new ArrayList();
        }
        this.f10566h.add(methodInvocation);
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f10565g);
        C3315b.m14326r(parcel, 2, this.f10566h, false);
        C3315b.m14310b(parcel, a);
    }
}
