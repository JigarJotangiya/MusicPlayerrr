package com.coocent.video.videoplayercore.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* compiled from: BlueNotificationReceiver.kt */
public final class BlueNotificationReceiver extends BroadcastReceiver {
    private String TAG = "BlueNotificationReceiver";

    public void onReceive(Context context, Intent intent) {
        if (intent != null) {
            intent.getAction();
        }
    }
}
