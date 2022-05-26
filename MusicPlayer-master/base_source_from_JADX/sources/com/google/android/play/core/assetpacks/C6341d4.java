package com.google.android.play.core.assetpacks;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import p159f.p243f.p245b.p318c.p319a.p320a.C7580b0;
import p159f.p243f.p245b.p318c.p319a.p320a.C7582c0;

/* renamed from: com.google.android.play.core.assetpacks.d4 */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6341d4 implements C7582c0<Executor> {
    public final /* bridge */ /* synthetic */ Object zza() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(C6428u3.f29677a);
        C7580b0.m42335a(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }
}
