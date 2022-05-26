package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.k0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class C5246k0 {

    /* renamed from: a */
    public final int f18688a;

    public C5246k0(int i) {
        this.f18688a = i;
    }

    /* renamed from: a */
    public static int m26039a(int i) {
        return (i >> 24) & 255;
    }

    /* renamed from: b */
    public static String m26040b(int i) {
        StringBuilder sb = new StringBuilder(4);
        sb.append((char) ((i >> 24) & 255));
        sb.append((char) ((i >> 16) & 255));
        sb.append((char) ((i >> 8) & 255));
        sb.append((char) (i & 255));
        return sb.toString();
    }

    public String toString() {
        return m26040b(this.f18688a);
    }
}
