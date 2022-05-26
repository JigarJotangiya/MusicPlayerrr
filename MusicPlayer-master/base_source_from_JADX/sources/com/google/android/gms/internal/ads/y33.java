package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class y33 {
    /* renamed from: a */
    static int m34009a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    /* renamed from: b */
    static int m34010b(Object obj) {
        return m34009a(obj == null ? 0 : obj.hashCode());
    }
}
