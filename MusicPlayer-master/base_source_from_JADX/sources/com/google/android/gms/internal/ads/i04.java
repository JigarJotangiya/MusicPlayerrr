package com.google.android.gms.internal.ads;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i04 {

    /* renamed from: a */
    public final m04 f17838a;

    /* renamed from: b */
    public final MediaFormat f17839b;

    /* renamed from: c */
    public final C5689w f17840c;

    /* renamed from: d */
    public final Surface f17841d;

    private i04(m04 m04, MediaFormat mediaFormat, C5689w wVar, Surface surface, MediaCrypto mediaCrypto, int i, boolean z) {
        this.f17838a = m04;
        this.f17839b = mediaFormat;
        this.f17840c = wVar;
        this.f17841d = surface;
    }

    /* renamed from: a */
    public static i04 m25002a(m04 m04, MediaFormat mediaFormat, C5689w wVar, MediaCrypto mediaCrypto) {
        return new i04(m04, mediaFormat, wVar, (Surface) null, (MediaCrypto) null, 0, false);
    }

    /* renamed from: b */
    public static i04 m25003b(m04 m04, MediaFormat mediaFormat, C5689w wVar, Surface surface, MediaCrypto mediaCrypto) {
        return new i04(m04, mediaFormat, wVar, surface, (MediaCrypto) null, 0, false);
    }
}
