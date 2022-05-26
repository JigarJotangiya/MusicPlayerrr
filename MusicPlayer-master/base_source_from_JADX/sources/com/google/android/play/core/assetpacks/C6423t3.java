package com.google.android.play.core.assetpacks;

import java.util.concurrent.ThreadFactory;

/* renamed from: com.google.android.play.core.assetpacks.t3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final /* synthetic */ class C6423t3 implements ThreadFactory {

    /* renamed from: a */
    public static final /* synthetic */ C6423t3 f29659a = new C6423t3();

    private /* synthetic */ C6423t3() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "AssetPackBackgroundExecutor");
    }
}
