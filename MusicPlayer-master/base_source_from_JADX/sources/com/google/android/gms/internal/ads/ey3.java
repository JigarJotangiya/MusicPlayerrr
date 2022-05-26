package com.google.android.gms.internal.ads;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ey3 {

    /* renamed from: a */
    private final AudioTrack f16376a;

    /* renamed from: b */
    private final AudioTimestamp f16377b = new AudioTimestamp();

    /* renamed from: c */
    private long f16378c;

    /* renamed from: d */
    private long f16379d;

    /* renamed from: e */
    private long f16380e;

    public ey3(AudioTrack audioTrack) {
        this.f16376a = audioTrack;
    }

    /* renamed from: a */
    public final long mo17436a() {
        return this.f16380e;
    }

    /* renamed from: b */
    public final long mo17437b() {
        return this.f16377b.nanoTime / 1000;
    }

    /* renamed from: c */
    public final boolean mo17438c() {
        boolean timestamp = this.f16376a.getTimestamp(this.f16377b);
        if (timestamp) {
            long j = this.f16377b.framePosition;
            if (this.f16379d > j) {
                this.f16378c++;
            }
            this.f16379d = j;
            this.f16380e = j + (this.f16378c << 32);
        }
        return timestamp;
    }
}
