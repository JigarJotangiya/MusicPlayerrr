package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C3315b;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zzfoa extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzfoa> CREATOR = new uz2();

    /* renamed from: g */
    public final int f27408g;

    /* renamed from: h */
    public final byte[] f27409h;

    /* renamed from: i */
    public final int f27410i;

    zzfoa(int i, byte[] bArr, int i2) {
        byte[] bArr2;
        this.f27408g = i;
        if (bArr == null) {
            bArr2 = null;
        } else {
            bArr2 = Arrays.copyOf(bArr, bArr.length);
        }
        this.f27409h = bArr2;
        this.f27410i = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C3315b.m14309a(parcel);
        C3315b.m14316h(parcel, 1, this.f27408g);
        C3315b.m14313e(parcel, 2, this.f27409h, false);
        C3315b.m14316h(parcel, 3, this.f27410i);
        C3315b.m14310b(parcel, a);
    }

    public zzfoa(byte[] bArr, int i) {
        this(1, (byte[]) null, 1);
    }
}
