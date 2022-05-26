package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a60 implements y50<pr0> {

    /* renamed from: a */
    private final b60 f13782a;

    public a60(b60 b60, byte[] bArr) {
        this.f13782a = b60;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        boolean equals = "1".equals(map.get("transparentBackground"));
        boolean equals2 = "1".equals(map.get("blur"));
        float f = 0.0f;
        try {
            if (map.get("blurRadius") != null) {
                f = Float.parseFloat((String) map.get("blurRadius"));
            }
        } catch (NumberFormatException e) {
            ul0.m31860e("Fail to parse float", e);
        }
        this.f13782a.mo16080c(equals);
        this.f13782a.mo16079b(equals2, f);
        pr0.mo17675S(equals);
    }
}
