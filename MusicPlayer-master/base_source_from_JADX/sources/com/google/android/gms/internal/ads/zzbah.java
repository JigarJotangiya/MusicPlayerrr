package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.io.InputStream;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzbah extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzbah> CREATOR = new C5234jp();

    /* renamed from: g */
    private ParcelFileDescriptor f27169g;

    /* renamed from: h */
    private final boolean f27170h;

    /* renamed from: i */
    private final boolean f27171i;

    /* renamed from: j */
    private final long f27172j;

    /* renamed from: k */
    private final boolean f27173k;

    public zzbah() {
        this((ParcelFileDescriptor) null, false, false, 0, false);
    }

    /* renamed from: A0 */
    public final synchronized boolean mo22523A0() {
        return this.f27173k;
    }

    /* renamed from: Y */
    public final synchronized long mo22524Y() {
        return this.f27172j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m0 */
    public final synchronized ParcelFileDescriptor mo22525m0() {
        return this.f27169g;
    }

    /* renamed from: n0 */
    public final synchronized InputStream mo22526n0() {
        ParcelFileDescriptor parcelFileDescriptor = this.f27169g;
        if (parcelFileDescriptor == null) {
            return null;
        }
        ParcelFileDescriptor.AutoCloseInputStream autoCloseInputStream = new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        this.f27169g = null;
        return autoCloseInputStream;
    }

    /* renamed from: o0 */
    public final synchronized boolean mo22527o0() {
        return this.f27170h;
    }

    /* renamed from: v0 */
    public final synchronized boolean mo22528v0() {
        return this.f27169g != null;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14321m(parcel, 2, mo22525m0(), i, false);
        C3315b.m14311c(parcel, 3, mo22527o0());
        C3315b.m14311c(parcel, 4, mo22530z0());
        C3315b.m14319k(parcel, 5, mo22524Y());
        C3315b.m14311c(parcel, 6, mo22523A0());
        C3315b.m14310b(parcel, a);
    }

    /* renamed from: z0 */
    public final synchronized boolean mo22530z0() {
        return this.f27171i;
    }

    public zzbah(ParcelFileDescriptor parcelFileDescriptor, boolean z, boolean z2, long j, boolean z3) {
        this.f27169g = parcelFileDescriptor;
        this.f27170h = z;
        this.f27171i = z2;
        this.f27172j = j;
        this.f27173k = z3;
    }
}
