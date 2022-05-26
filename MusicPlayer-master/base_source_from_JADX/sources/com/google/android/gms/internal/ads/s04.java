package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class s04 implements c14 {

    /* renamed from: a */
    public static final /* synthetic */ s04 f23289a = new s04();

    private /* synthetic */ s04() {
    }

    /* renamed from: b */
    public final int mo16458b(Object obj) {
        int i = d14.f15458d;
        String str = ((m04) obj).f19692a;
        if (str.startsWith("OMX.google") || str.startsWith("c2.android")) {
            return 1;
        }
        if (wy2.f25579a >= 26 || !str.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
            return 0;
        }
        return -1;
    }
}
