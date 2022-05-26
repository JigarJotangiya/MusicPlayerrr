package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class h84 {

    /* renamed from: a */
    public final List<byte[]> f17576a;

    /* renamed from: b */
    public final int f17577b;

    /* renamed from: c */
    public final int f17578c;

    /* renamed from: d */
    public final int f17579d;

    /* renamed from: e */
    public final float f17580e;

    /* renamed from: f */
    public final String f17581f;

    private h84(List<byte[]> list, int i, int i2, int i3, float f, String str) {
        this.f17576a = list;
        this.f17577b = i;
        this.f17578c = i2;
        this.f17579d = i3;
        this.f17580e = f;
        this.f17581f = str;
    }

    /* renamed from: a */
    public static h84 m24729a(no2 no2) throws C5464px {
        String str;
        float f;
        int i;
        int i2;
        try {
            no2.mo19780g(4);
            int s = (no2.mo19792s() & 3) + 1;
            if (s != 3) {
                ArrayList arrayList = new ArrayList();
                int s2 = no2.mo19792s() & 31;
                for (int i3 = 0; i3 < s2; i3++) {
                    arrayList.add(m24730b(no2));
                }
                int s3 = no2.mo19792s();
                for (int i4 = 0; i4 < s3; i4++) {
                    arrayList.add(m24730b(no2));
                }
                if (s2 > 0) {
                    ce2 d = df2.m22491d((byte[]) arrayList.get(0), s + 1, ((byte[]) arrayList.get(0)).length);
                    int i5 = d.f14955e;
                    int i6 = d.f14956f;
                    float f2 = d.f14957g;
                    str = ju1.m25964a(d.f14951a, d.f14952b, d.f14953c);
                    i2 = i5;
                    i = i6;
                    f = f2;
                } else {
                    str = null;
                    i2 = -1;
                    i = -1;
                    f = 1.0f;
                }
                return new h84(arrayList, s, i2, i, f, str);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw C5464px.zza("Error parsing AVC config", e);
        }
    }

    /* renamed from: b */
    private static byte[] m24730b(no2 no2) {
        int w = no2.mo19796w();
        int k = no2.mo19784k();
        no2.mo19780g(w);
        return ju1.m25966c(no2.mo19781h(), k, w);
    }
}
