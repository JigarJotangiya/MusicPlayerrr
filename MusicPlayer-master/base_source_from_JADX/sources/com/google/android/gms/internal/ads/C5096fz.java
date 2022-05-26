package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.fz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5096fz extends C5207iz<String> {
    C5096fz(int i, String str, String str2) {
        super(1, str, str2, (C5170hz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16428a(JSONObject jSONObject) {
        return jSONObject.optString(mo18524m(), (String) mo18523l());
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
            return (String) mo18523l();
        }
        String m2 = mo18524m();
        return bundle.getString(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag."));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16430c(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString(mo18524m(), (String) mo18523l());
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo16431d(SharedPreferences.Editor editor, Object obj) {
        editor.putString(mo18524m(), (String) obj);
    }
}
