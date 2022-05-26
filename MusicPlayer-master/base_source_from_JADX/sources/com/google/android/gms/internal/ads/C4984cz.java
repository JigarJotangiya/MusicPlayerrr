package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4984cz extends C5207iz<Integer> {
    C4984cz(int i, String str, Integer num) {
        super(1, str, num, (C5170hz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16428a(JSONObject jSONObject) {
        return Integer.valueOf(jSONObject.optInt(mo18524m(), ((Integer) mo18523l()).intValue()));
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
            return (Integer) mo18523l();
        }
        String m2 = mo18524m();
        return Integer.valueOf(bundle.getInt(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16430c(SharedPreferences sharedPreferences) {
        return Integer.valueOf(sharedPreferences.getInt(mo18524m(), ((Integer) mo18523l()).intValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo16431d(SharedPreferences.Editor editor, Object obj) {
        editor.putInt(mo18524m(), ((Integer) obj).intValue());
    }
}
