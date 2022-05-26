package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: com.google.android.gms.internal.ads.qi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5486qi implements C5412oi {
    /* synthetic */ C5486qi(C5449pi piVar) {
    }

    /* renamed from: A */
    public final MediaCodecInfo mo20001A(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo20002a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "video/avc".equals(str);
    }

    /* renamed from: f */
    public final boolean mo20003f() {
        return false;
    }

    public final int zza() {
        return MediaCodecList.getCodecCount();
    }
}
