package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a14 implements y04 {
    /* synthetic */ a14(z04 z04) {
    }

    /* renamed from: A */
    public final MediaCodecInfo mo15639A(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo15640a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }

    /* renamed from: b */
    public final boolean mo15641b(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }

    public final boolean zze() {
        return false;
    }
}
