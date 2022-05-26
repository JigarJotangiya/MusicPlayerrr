package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ru2 {

    /* renamed from: a */
    private final String f23210a = a10.f13718b.mo20989e();

    /* renamed from: a */
    public final String mo20742a(Map<String, String> map) {
        Uri.Builder buildUpon = Uri.parse(this.f23210a).buildUpon();
        for (Map.Entry next : map.entrySet()) {
            buildUpon.appendQueryParameter((String) next.getKey(), (String) next.getValue());
        }
        return buildUpon.build().toString();
    }
}
