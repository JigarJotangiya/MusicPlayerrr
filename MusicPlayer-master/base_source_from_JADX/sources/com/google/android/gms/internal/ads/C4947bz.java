package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.bz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4947bz extends C5207iz<Boolean> {
    C4947bz(int i, String str, Boolean bool) {
        super(i, str, bool, (C5170hz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16428a(JSONObject jSONObject) {
        return Boolean.valueOf(jSONObject.optBoolean(mo18524m(), ((Boolean) mo18523l()).booleanValue()));
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
            return (Boolean) mo18523l();
        }
        String m2 = mo18524m();
        return Boolean.valueOf(bundle.getBoolean(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16430c(SharedPreferences sharedPreferences) {
        return Boolean.valueOf(sharedPreferences.getBoolean(mo18524m(), ((Boolean) mo18523l()).booleanValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo16431d(SharedPreferences.Editor editor, Object obj) {
        editor.putBoolean(mo18524m(), ((Boolean) obj).booleanValue());
    }
}
