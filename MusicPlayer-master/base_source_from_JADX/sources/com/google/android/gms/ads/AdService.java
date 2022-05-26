package com.google.android.gms.ads;

import android.app.IntentService;
import android.content.Intent;
import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.za0;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public class AdService extends IntentService {
    public AdService() {
        super("AdService");
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(@RecentlyNonNull Intent intent) {
        try {
            C4980cv.m22122a().mo15969i(this, new za0()).mo17810M0(intent);
        } catch (RemoteException e) {
            ul0.m31859d("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
