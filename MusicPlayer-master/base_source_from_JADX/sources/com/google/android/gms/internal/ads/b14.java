package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class b14 implements y04 {

    /* renamed from: a */
    private final int f14259a;

    /* renamed from: b */
    private MediaCodecInfo[] f14260b;

    public b14(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f14259a = i;
    }

    /* renamed from: c */
    private final void m21026c() {
        if (this.f14260b == null) {
            this.f14260b = new MediaCodecList(this.f14259a).getCodecInfos();
        }
    }

    /* renamed from: A */
    public final MediaCodecInfo mo15639A(int i) {
        m21026c();
        return this.f14260b[i];
    }

    /* renamed from: a */
    public final boolean mo15640a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    /* renamed from: b */
    public final boolean mo15641b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final int zza() {
        m21026c();
        return this.f14260b.length;
    }

    public final boolean zze() {
        return true;
    }
}
