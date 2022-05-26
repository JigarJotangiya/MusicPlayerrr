package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public final class BinderWrapper implements Parcelable {
    @RecentlyNonNull
    public static final Parcelable.Creator<BinderWrapper> CREATOR = new C3319u0();

    /* renamed from: g */
    private IBinder f10529g;

    /* synthetic */ BinderWrapper(Parcel parcel, C3319u0 u0Var) {
        this.f10529g = parcel.readStrongBinder();
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(@RecentlyNonNull Parcel parcel, int i) {
        parcel.writeStrongBinder(this.f10529g);
    }
}
