package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p159f.p243f.p245b.p318c.p319a.p320a.C7580b0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7582c0;

/* renamed from: com.google.android.play.core.assetpacks.x3 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6443x3 implements C7582c0<Executor> {
    public final /* bridge */ /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C6423t3.f29659a);
        C7580b0.m42335a(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
