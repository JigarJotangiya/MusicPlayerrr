package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import androidx.annotation.RecentlyNonNull;

/* renamed from: com.google.android.gms.common.api.k */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public class C3227k extends C3158b {
    public C3227k(@RecentlyNonNull Status status) {
        super(status);
    }

    @RecentlyNonNull
    public PendingIntent getResolution() {
        return getStatus().mo11490m0();
    }

    public void startResolutionForResult(@RecentlyNonNull Activity activity, int i) throws IntentSender.SendIntentException {
        getStatus().mo11484A0(activity, i);
    }
}
