package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.play.core.review.a */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6464a implements Parcelable.Creator<ReviewInfo> {
    C6464a() {
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zza((PendingIntent) parcel.readParcelable(ReviewInfo.class.getClassLoader()), parcel.readInt() != 0);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ReviewInfo[i];
    }
}
