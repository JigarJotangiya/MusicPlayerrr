package com.google.android.gms.internal.ads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* renamed from: com.google.android.gms.internal.ads.s6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5548s6 extends FilterInputStream {

    /* renamed from: g */
    private final HttpURLConnection f23347g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C5548s6(java.net.HttpURLConnection r2) {
        /*
            r1 = this;
            java.io.InputStream r0 = r2.getInputStream()     // Catch:{ IOException -> 0x0005 }
            goto L_0x0009
        L_0x0005:
            java.io.InputStream r0 = r2.getErrorStream()
        L_0x0009:
            r1.<init>(r0)
            r1.f23347g = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5548s6.<init>(java.net.HttpURLConnection):void");
    }

    public final void close() throws IOException {
        super.close();
        this.f23347g.disconnect();
    }
}
