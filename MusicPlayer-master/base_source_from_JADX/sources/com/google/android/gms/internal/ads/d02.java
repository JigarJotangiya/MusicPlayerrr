package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.C3018m1;
import java.util.HashMap;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d02 implements ys2<c02, yz1> {

    /* renamed from: a */
    private final String f15416a;

    public d02(String str) {
        this.f15416a = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo15625b(Object obj) throws Exception {
        c02 c02 = (c02) obj;
        int optInt = c02.f14752a.optInt("http_timeout_millis", 60000);
        rg0 a = c02.f14753b;
        if (a.mo20649a() == -2) {
            HashMap hashMap = new HashMap();
            if (c02.f14753b.mo20656h() && !TextUtils.isEmpty(this.f15416a)) {
                hashMap.put("Cookie", this.f15416a);
            }
            boolean i = c02.f14753b.mo20657i();
            String str = BuildConfig.FLAVOR;
            if (i) {
                JSONObject optJSONObject = c02.f14752a.optJSONObject("pii");
                if (optJSONObject != null) {
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos", str))) {
                        hashMap.put("x-afma-drt-cookie", optJSONObject.optString("doritos", str));
                    }
                    if (!TextUtils.isEmpty(optJSONObject.optString("doritos_v2", str))) {
                        hashMap.put("x-afma-drt-v2-cookie", optJSONObject.optString("doritos_v2", str));
                    }
                } else {
                    C3018m1.m13388k("DSID signal does not exist.");
                }
            }
            if (c02.f14753b != null && !TextUtils.isEmpty(c02.f14753b.mo20652d())) {
                str = c02.f14753b.mo20652d();
            }
            return new yz1(c02.f14753b.mo20653e(), optInt, hashMap, str.getBytes(g13.f16857b), BuildConfig.FLAVOR);
        } else if (a.mo20649a() == 1) {
            if (a.mo20654f() != null) {
                ul0.m31859d(TextUtils.join(", ", a.mo20654f()));
            }
            throw new pw1(2, "Error building request URL.");
        } else {
            throw new pw1(1);
        }
    }
}
