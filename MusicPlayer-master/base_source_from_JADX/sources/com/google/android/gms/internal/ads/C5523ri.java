package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.ri */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5523ri implements C5412oi {

    /* renamed from: a */
    private final int f22862a;

    /* renamed from: b */
    private MediaCodecInfo[] f22863b;

    public C5523ri(boolean z) {
        this.f22862a = z ? 1 : 0;
    }

    /* renamed from: b */
    private final void m30141b() {
        if (this.f22863b == null) {
            this.f22863b = new MediaCodecList(this.f22862a).getCodecInfos();
        }
    }

    /* renamed from: A */
    public final MediaCodecInfo mo20001A(int i) {
        m30141b();
        return this.f22863b[i];
    }

    /* renamed from: a */
    public final boolean mo20002a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported("secure-playback");
    }

    /* renamed from: f */
    public final boolean mo20003f() {
        return true;
    }

    public final int zza() {
        m30141b();
        return this.f22863b.length;
    }
}
