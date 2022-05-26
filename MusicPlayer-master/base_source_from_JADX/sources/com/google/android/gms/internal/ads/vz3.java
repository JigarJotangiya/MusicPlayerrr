package com.google.android.gms.internal.ads;

import android.os.HandlerThread;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class vz3 implements j04 {

    /* renamed from: b */
    private final e23<HandlerThread> f25114b;

    /* renamed from: c */
    private final e23<HandlerThread> f25115c;

    public vz3(int i, boolean z) {
        tz3 tz3 = new tz3(i);
        uz3 uz3 = new uz3(i);
        this.f25114b = tz3;
        this.f25115c = uz3;
    }

    /* renamed from: a */
    static /* synthetic */ HandlerThread m32826a(int i) {
        return new HandlerThread(xz3.m33915n(i, "ExoPlayer:MediaCodecAsyncAdapter:"));
    }

    /* renamed from: b */
    static /* synthetic */ HandlerThread m32827b(int i) {
        return new HandlerThread(xz3.m33915n(i, "ExoPlayer:MediaCodecQueueingThread:"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x005e  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.xz3 mo21655c(com.google.android.gms.internal.ads.i04 r11) throws java.io.IOException {
        /*
            r10 = this;
            com.google.android.gms.internal.ads.m04 r0 = r11.f17838a
            java.lang.String r0 = r0.f19692a
            r1 = 0
            java.lang.String r2 = "createCodec:"
            java.lang.String r3 = java.lang.String.valueOf(r0)     // Catch:{ Exception -> 0x0054 }
            int r4 = r3.length()     // Catch:{ Exception -> 0x0054 }
            if (r4 == 0) goto L_0x0016
            java.lang.String r2 = r2.concat(r3)     // Catch:{ Exception -> 0x0054 }
            goto L_0x001c
        L_0x0016:
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x0054 }
            r3.<init>(r2)     // Catch:{ Exception -> 0x0054 }
            r2 = r3
        L_0x001c:
            com.google.android.gms.internal.ads.uw2.m32078a(r2)     // Catch:{ Exception -> 0x0054 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0054 }
            com.google.android.gms.internal.ads.xz3 r9 = new com.google.android.gms.internal.ads.xz3     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.e23<android.os.HandlerThread> r2 = r10.f25114b     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.tz3 r2 = (com.google.android.gms.internal.ads.tz3) r2     // Catch:{ Exception -> 0x0052 }
            int r2 = r2.f24072g     // Catch:{ Exception -> 0x0052 }
            android.os.HandlerThread r5 = m32826a(r2)     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.e23<android.os.HandlerThread> r2 = r10.f25115c     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.uz3 r2 = (com.google.android.gms.internal.ads.uz3) r2     // Catch:{ Exception -> 0x0052 }
            int r2 = r2.f24522g     // Catch:{ Exception -> 0x0052 }
            android.os.HandlerThread r6 = m32827b(r2)     // Catch:{ Exception -> 0x0052 }
            r7 = 0
            r8 = 0
            r3 = r9
            r4 = r0
            r3.<init>(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0052 }
            com.google.android.gms.internal.ads.uw2.m32079b()     // Catch:{ Exception -> 0x004f }
            android.media.MediaFormat r3 = r11.f17839b     // Catch:{ Exception -> 0x004f }
            android.view.Surface r4 = r11.f17841d     // Catch:{ Exception -> 0x004f }
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r9
            com.google.android.gms.internal.ads.xz3.m33914m(r2, r3, r4, r5, r6, r7)     // Catch:{ Exception -> 0x004f }
            return r9
        L_0x004f:
            r11 = move-exception
            r1 = r9
            goto L_0x0056
        L_0x0052:
            r11 = move-exception
            goto L_0x0056
        L_0x0054:
            r11 = move-exception
            r0 = r1
        L_0x0056:
            if (r1 != 0) goto L_0x005e
            if (r0 == 0) goto L_0x0061
            r0.release()
            goto L_0x0061
        L_0x005e:
            r1.mo17804j()
        L_0x0061:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.vz3.mo21655c(com.google.android.gms.internal.ads.i04):com.google.android.gms.internal.ads.xz3");
    }
}
