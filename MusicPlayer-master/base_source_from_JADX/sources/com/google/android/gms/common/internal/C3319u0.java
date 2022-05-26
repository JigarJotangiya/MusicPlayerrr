package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.common.internal.u0 */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
final class C3319u0 implements Parcelable.Creator<BinderWrapper> {
    C3319u0() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new BinderWrapper(parcel, (C3319u0) null);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BinderWrapper[i];
    }
}
