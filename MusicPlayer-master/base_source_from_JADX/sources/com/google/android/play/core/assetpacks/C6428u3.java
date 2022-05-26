package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.u3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final /* synthetic */ class C6428u3 implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6428u3 f29677a = new C6428u3();

    private /* synthetic */ C6428u3() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "UpdateListenerExecutor");
    }
}
