package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.StrictMode;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2935k;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cs0 {
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, com.google.android.gms.internal.ads.pr0] */
    /* renamed from: a */
    public static final pr0 m22106a(Context context, gt0 gt0, String str, boolean z, boolean z2, C5737xa xaVar, q00 q00, zzcjf zzcjf, f00 f00, C2935k kVar, C2925a aVar, C5790yp ypVar, bp2 bp2, ep2 ep2) throws bs0 {
        StrictMode.ThreadPolicy threadPolicy;
        C5503qz.m29790c(context);
        try {
            yr0 yr0 = new yr0(context, gt0, str, z, z2, xaVar, q00, zzcjf, (f00) null, kVar, aVar, ypVar, bp2, ep2);
            threadPolicy = StrictMode.getThreadPolicy();
            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskReads().permitDiskWrites().build());
            ? zza = yr0.zza();
            StrictMode.setThreadPolicy(threadPolicy);
            return zza;
        } catch (Throwable th) {
            throw new bs0("Webview initialization failed.", th);
        }
    }
}
