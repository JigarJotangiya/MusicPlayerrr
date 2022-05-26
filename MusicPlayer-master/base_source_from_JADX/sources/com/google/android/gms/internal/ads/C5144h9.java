package com.google.android.gms.internal.ads;

import android.util.Base64;

/* renamed from: com.google.android.gms.internal.ads.h9 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5144h9 {
    /* renamed from: a */
    public static String m24731a(byte[] bArr, boolean z) {
        return Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    /* renamed from: b */
    public static byte[] m24732b(String str, boolean z) throws IllegalArgumentException {
        byte[] decode = Base64.decode(str, true != z ? 2 : 11);
        if (decode.length != 0 || str.length() <= 0) {
            return decode;
        }
        String valueOf = String.valueOf(str);
        throw new IllegalArgumentException(valueOf.length() != 0 ? "Unable to decode ".concat(valueOf) : new String("Unable to decode "));
    }
}
