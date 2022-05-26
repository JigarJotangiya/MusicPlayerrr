package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zn0 implements Runnable {
    zn0(bo0 bo0) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
