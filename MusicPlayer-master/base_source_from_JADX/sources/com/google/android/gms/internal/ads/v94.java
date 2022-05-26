package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v94 {
    /* renamed from: a */
    public static List<byte[]> m32233a(byte[] bArr) {
        byte b = bArr[11];
        byte b2 = bArr[10];
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(m32235c(m32234b((long) (((b & 255) << 8) | (b2 & 255)))));
        arrayList.add(m32235c(m32234b(3840)));
        return arrayList;
    }

    /* renamed from: b */
    private static long m32234b(long j) {
        return (j * 1000000000) / 48000;
    }

    /* renamed from: c */
    private static byte[] m32235c(long j) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j).array();
    }
}
