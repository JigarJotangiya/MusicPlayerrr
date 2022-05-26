package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.dz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5021dz extends C5207iz<Long> {
    C5021dz(int i, String str, Long l) {
        super(1, str, l, (C5170hz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16428a(JSONObject jSONObject) {
        return Long.valueOf(jSONObject.optLong(mo18524m(), ((Long) mo18523l()).longValue()));
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo16429b(Bundle bundle) {
        String str;
        String m = mo18524m();
        if (m.length() != 0) {
            str = "com.google.android.gms.ads.flag.".concat(m);
        } else {
            str = new String("com.google.android.gms.ads.flag.");
        }
        if (!bundle.containsKey(str)) {
            return (Long) mo18523l();
        }
        String m2 = mo18524m();
        return Long.valueOf(bundle.getLong(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16430c(SharedPreferences sharedPreferences) {
        return Long.valueOf(sharedPreferences.getLong(mo18524m(), ((Long) mo18523l()).longValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo16431d(SharedPreferences.Editor editor, Object obj) {
        editor.putLong(mo18524m(), ((Long) obj).longValue());
    }
}
