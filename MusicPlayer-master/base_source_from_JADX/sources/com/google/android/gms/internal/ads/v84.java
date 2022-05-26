package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class v84 {

    /* renamed from: a */
    public final String f24638a;

    private v84(int i, int i2, String str) {
        this.f24638a = str;
    }

    /* renamed from: a */
    public static v84 m32207a(no2 no2) {
        String str;
        no2.mo19780g(2);
        int s = no2.mo19792s();
        int i = s >> 1;
        int s2 = (no2.mo19792s() >> 3) | ((s & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = "hev1";
        } else if (i != 9) {
            return null;
        } else {
            str = "avc3";
        }
        String str2 = s2 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(str.length() + 24 + str2.length());
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(str2);
        sb.append(s2);
        return new v84(i, s2, sb.toString());
    }
}
