package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfnr extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfnr> CREATOR = new mz2();

    /* renamed from: g */
    public final int f27400g;

    /* renamed from: h */
    private C5513r8 f27401h = null;

    /* renamed from: i */
    private byte[] f27402i;

    zzfnr(int i, byte[] bArr) {
        this.f27400g = i;
        this.f27402i = bArr;
        m34972m0();
    }

    /* renamed from: m0 */
    private final void m34972m0() {
        C5513r8 r8Var = this.f27401h;
        if (r8Var == null && this.f27402i != null) {
            return;
        }
        if (r8Var != null && this.f27402i == null) {
            return;
        }
        if (r8Var != null && this.f27402i != null) {
            throw new IllegalStateException("Invalid internal representation - full");
        } else if (r8Var == null && this.f27402i == null) {
            throw new IllegalStateException("Invalid internal representation - empty");
        } else {
            throw new IllegalStateException("Impossible");
        }
    }

    /* renamed from: Y */
    public final C5513r8 mo22593Y() {
        if (this.f27401h == null) {
            try {
                this.f27401h = C5513r8.m29969v0(this.f27402i, cm3.m21985a());
                this.f27402i = null;
            } catch (bn3 | NullPointerException e) {
                throw new IllegalStateException(e);
            }
        }
        m34972m0();
        return this.f27401h;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27400g);
        byte[] bArr = this.f27402i;
        if (bArr == null) {
            bArr = this.f27401h.mo21561e();
        }
        C3315b.m14313e(parcel, 2, bArr, false);
        C3315b.m14310b(parcel, a);
    }
}
