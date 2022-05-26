package com.google.android.gms.internal.ads;

import android.util.Log;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class f04 {

    /* renamed from: a */
    private long f16398a;

    /* renamed from: b */
    private long f16399b;

    /* renamed from: c */
    private boolean f16400c;

    f04() {
    }

    /* renamed from: d */
    private final long m23412d(long j) {
        return this.f16398a + Math.max(0, ((this.f16399b - 529) * 1000000) / j);
    }

    /* renamed from: a */
    public final long mo17450a(C5689w wVar) {
        return m23412d((long) wVar.f25147z);
    }

    /* renamed from: b */
    public final long mo17451b(C5689w wVar, k31 k31) {
        if (this.f16399b == 0) {
            this.f16398a = k31.f18745e;
        }
        if (this.f16400c) {
            return k31.f18745e;
        }
        ByteBuffer byteBuffer = k31.f18743c;
        Objects.requireNonNull(byteBuffer);
        byte b = 0;
        for (int i = 0; i < 4; i++) {
            b = (b << 8) | (byteBuffer.get(i) & 255);
        }
        int c = u94.m31712c(b);
        if (c == -1) {
            this.f16400c = true;
            this.f16399b = 0;
            this.f16398a = k31.f18745e;
            Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
            return k31.f18745e;
        }
        long d = m23412d((long) wVar.f25147z);
        this.f16399b += (long) c;
        return d;
    }

    /* renamed from: c */
    public final void mo17452c() {
        this.f16398a = 0;
        this.f16399b = 0;
        this.f16400c = false;
    }
}
