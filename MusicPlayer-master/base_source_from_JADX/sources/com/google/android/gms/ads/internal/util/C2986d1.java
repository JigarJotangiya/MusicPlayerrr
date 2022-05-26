package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.internal.ads.uf0;
import com.google.android.gms.internal.ads.ul0;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.ads.internal.util.d1 */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C2986d1 {
    @Deprecated
    /* renamed from: a */
    public static <T> T m13315a(Context context, Callable<T> callable) {
        StrictMode.ThreadPolicy threadPolicy;
        try {
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            T call = callable.call();
            StrictMode.setThreadPolicy(threadPolicy);
            return call;
        } catch (Throwable th) {
            ul0.m31860e("Unexpected exception.", th);
            uf0.m31800c(context).mo21260b(th, "StrictModeUtil.runWithLaxStrictMode");
            return null;
        }
    }
}
