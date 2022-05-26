package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.internal.ads.k9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5255k9 implements Runnable {
    /* synthetic */ C5255k9(C5218j9 j9Var) {
    }

    public final void run() {
        CountDownLatch countDownLatch;
        try {
            C5292l9.f19258b = MessageDigest.getInstance("MD5");
            countDownLatch = C5292l9.f19261e;
        } catch (NoSuchAlgorithmException unused) {
            countDownLatch = C5292l9.f19261e;
        } catch (Throwable th) {
            C5292l9.f19261e.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }
}
