package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class r62 implements m22<kq2, j42> {

    /* renamed from: a */
    private final Map<String, n22<kq2, j42>> f22753a = new HashMap();

    /* renamed from: b */
    private final br1 f22754b;

    public r62(br1 br1) {
        this.f22754b = br1;
    }

    /* renamed from: a */
    public final n22<kq2, j42> mo15687a(String str, JSONObject jSONObject) throws zp2 {
        n22<kq2, j42> n22;
        synchronized (this) {
            n22 = this.f22753a.get(str);
            if (n22 == null) {
                n22 = new n22<>(this.f22754b.mo16361b(str, jSONObject), new j42(), str);
                this.f22753a.put(str, n22);
            }
        }
        return n22;
    }
}
