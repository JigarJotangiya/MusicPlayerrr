package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.2 */
public class AssetPackExtractionService extends Service {

    /* renamed from: g */
    C6444y f29325g;

    public final IBinder onBind(Intent intent) {
        return this.f29325g;
    }

    public final void onCreate() {
        super.onCreate();
        C6431v1.m37811a(getApplicationContext()).mo25198a(this);
    }
}
