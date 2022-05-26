package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* compiled from: com.google.android.play:core@@1.10.2 */
public class ExtractionForegroundService extends Service {

    /* renamed from: g */
    private final IBinder f29326g = new C6344e1(this);

    /* renamed from: a */
    public final synchronized void mo25192a() {
        stopForeground(true);
        stopSelf();
    }

    public final IBinder onBind(Intent intent) {
        return this.f29326g;
    }
}
