package com.google.android.gms.internal.ads;

import android.util.Log;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ie3 implements rt3 {

    /* renamed from: a */
    private final r54 f17968a;

    /* renamed from: b */
    private final long f17969b = bw3.m21569c(50000);

    /* renamed from: c */
    private final long f17970c = bw3.m21569c(50000);

    /* renamed from: d */
    private final long f17971d = bw3.m21569c(2500);

    /* renamed from: e */
    private final long f17972e = bw3.m21569c(5000);

    /* renamed from: f */
    private final long f17973f = bw3.m21569c(0);

    /* renamed from: g */
    private int f17974g = 13107200;

    /* renamed from: h */
    private boolean f17975h;

    public ie3() {
        r54 r54 = new r54(true, 65536);
        m25163h(2500, 0, "bufferForPlaybackMs", "0");
        m25163h(5000, 0, "bufferForPlaybackAfterRebufferMs", "0");
        m25163h(50000, 2500, "minBufferMs", "bufferForPlaybackMs");
        m25163h(50000, 5000, "minBufferMs", "bufferForPlaybackAfterRebufferMs");
        m25163h(50000, 50000, "maxBufferMs", "minBufferMs");
        m25163h(0, 0, "backBufferDurationMs", "0");
        this.f17968a = r54;
    }

    /* renamed from: h */
    private static void m25163h(int i, int i2, String str, String str2) {
        boolean z = i >= i2;
        StringBuilder sb = new StringBuilder(str.length() + 21 + str2.length());
        sb.append(str);
        sb.append(" cannot be less than ");
        sb.append(str2);
        gs1.m24487e(z, sb.toString());
    }

    /* renamed from: i */
    private final void m25164i(boolean z) {
        this.f17974g = 13107200;
        this.f17975h = false;
        if (z) {
            this.f17968a.mo20591e();
        }
    }

    /* renamed from: a */
    public final void mo18317a() {
        m25164i(false);
    }

    /* renamed from: b */
    public final void mo18318b() {
        m25164i(true);
    }

    /* renamed from: c */
    public final void mo18319c(lu3[] lu3Arr, uj0 uj0, h44[] h44Arr) {
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 13107200;
            if (i < 2) {
                if (h44Arr[i] != null) {
                    if (lu3Arr[i].mo16557a() != 1) {
                        i3 = 131072000;
                    }
                    i2 += i3;
                }
                i++;
            } else {
                int max = Math.max(13107200, i2);
                this.f17974g = max;
                this.f17968a.mo20592f(max);
                return;
            }
        }
    }

    /* renamed from: d */
    public final boolean mo18320d(long j, float f, boolean z, long j2) {
        long j3;
        long X = wy2.m33429X(j, f);
        if (z) {
            j3 = this.f17972e;
        } else {
            j3 = this.f17971d;
        }
        if (j2 != -9223372036854775807L) {
            j3 = Math.min(j2 / 2, j3);
        }
        return j3 <= 0 || X >= j3 || this.f17968a.mo20587a() >= this.f17974g;
    }

    /* renamed from: e */
    public final r54 mo18321e() {
        return this.f17968a;
    }

    /* renamed from: f */
    public final void mo18322f() {
        m25164i(true);
    }

    /* renamed from: g */
    public final boolean mo18323g(long j, long j2, float f) {
        int a = this.f17968a.mo20587a();
        int i = this.f17974g;
        long j3 = this.f17969b;
        if (f > 1.0f) {
            j3 = Math.min(wy2.m33427V(j3, f), this.f17970c);
        }
        boolean z = false;
        if (j2 < Math.max(j3, 500000)) {
            if (a < i) {
                z = true;
            }
            this.f17975h = z;
            if (!z && j2 < 500000) {
                Log.w("DefaultLoadControl", "Target buffer size reached with less than 500ms of buffered media data.");
            }
        } else if (j2 >= this.f17970c || a >= i) {
            this.f17975h = false;
        }
        return this.f17975h;
    }

    public final long zza() {
        return this.f17973f;
    }

    public final boolean zze() {
        return false;
    }
}
