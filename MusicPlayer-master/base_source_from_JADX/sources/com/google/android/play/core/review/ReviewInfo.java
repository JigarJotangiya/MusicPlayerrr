package com.google.android.play.core.review;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"RestrictedApi"})
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new C6464a();

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract PendingIntent mo25395a();

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract boolean mo25396b();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(mo25395a(), 0);
        parcel.writeInt(mo25396b() ? 1 : 0);
    }
}
