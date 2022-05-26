package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.ye */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5779ye {

    /* renamed from: a */
    private static final int[] f26344a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f26345b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f26346c = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: d */
    public static final /* synthetic */ int f26347d = 0;

    /* renamed from: a */
    public static int m34097a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f26344a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i * 256;
    }

    /* renamed from: b */
    public static zzapg m34098b(C5600tl tlVar, String str, String str2, zzarf zzarf) {
        int i = f26345b[(tlVar.mo21088g() & 192) >> 6];
        int g = tlVar.mo21088g();
        int i2 = f26346c[(g & 56) >> 3];
        if ((g & 4) != 0) {
            i2++;
        }
        return zzapg.m34919h(str, "audio/ac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, zzarf, 0, str2);
    }

    /* renamed from: c */
    public static zzapg m34099c(C5600tl tlVar, String str, String str2, zzarf zzarf) {
        C5600tl tlVar2 = tlVar;
        tlVar.mo21104w(2);
        int i = f26345b[(tlVar.mo21088g() & 192) >> 6];
        int g = tlVar.mo21088g();
        int i2 = f26346c[(g & 14) >> 1];
        if ((g & 1) != 0) {
            i2++;
        }
        return zzapg.m34919h(str, "audio/eac3", (String) null, -1, -1, i2, i, (List<byte[]>) null, zzarf, 0, str2);
    }
}
