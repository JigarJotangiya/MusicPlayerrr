package com.bumptech.glide.manager;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;

/* renamed from: com.bumptech.glide.manager.i */
/* compiled from: FirstFrameAndAfterTrimMemoryWaiter */
final class C2111i implements C2113k, ComponentCallbacks2 {
    C2111i() {
    }

    /* renamed from: a */
    public void mo8279a(Activity activity) {
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    public void onLowMemory() {
        onTrimMemory(20);
    }

    public void onTrimMemory(int i) {
    }
}
