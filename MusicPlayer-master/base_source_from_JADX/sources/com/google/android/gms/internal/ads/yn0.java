package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.concurrent.TimeUnit;

@TargetApi(14)
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class yn0 {

    /* renamed from: a */
    private final long f26424a = TimeUnit.MILLISECONDS.toNanos(((Long) C5054ev.m23225c().mo20153b(C5503qz.f22640v)).longValue());

    /* renamed from: b */
    private long f26425b;

    /* renamed from: c */
    private boolean f26426c = true;

    yn0() {
    }

    /* renamed from: a */
    public final void mo22266a(SurfaceTexture surfaceTexture, jn0 jn0) {
        if (jn0 != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.f26426c || Math.abs(timestamp - this.f26425b) >= this.f26424a) {
                this.f26426c = false;
                this.f26425b = timestamp;
                C2979b2.f9980i.post(new xn0(this, jn0));
            }
        }
    }

    /* renamed from: b */
    public final void mo22267b() {
        this.f26426c = true;
    }
}
