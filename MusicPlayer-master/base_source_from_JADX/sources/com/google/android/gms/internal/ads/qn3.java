package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class qn3 implements xn3 {

    /* renamed from: a */
    private final xn3[] f21978a;

    qn3(xn3... xn3Arr) {
        this.f21978a = xn3Arr;
    }

    /* renamed from: a */
    public final wn3 mo19456a(Class<?> cls) {
        xn3[] xn3Arr = this.f21978a;
        for (int i = 0; i < 2; i++) {
            xn3 xn3 = xn3Arr[i];
            if (xn3.mo19457b(cls)) {
                return xn3.mo19456a(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }

    /* renamed from: b */
    public final boolean mo19457b(Class<?> cls) {
        xn3[] xn3Arr = this.f21978a;
        for (int i = 0; i < 2; i++) {
            if (xn3Arr[i].mo19457b(cls)) {
                return true;
            }
        }
        return false;
    }
}
