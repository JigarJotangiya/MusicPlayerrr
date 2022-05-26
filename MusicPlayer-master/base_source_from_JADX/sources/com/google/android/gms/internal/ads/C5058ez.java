package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.os.Bundle;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.ez */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C5058ez extends C5207iz<Float> {
    C5058ez(int i, String str, Float f) {
        super(1, str, f, (C5170hz) null);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo16428a(JSONObject jSONObject) {
        return Float.valueOf((float) jSONObject.optDouble(mo18524m(), (double) ((Float) mo18523l()).floatValue()));
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
            return (Float) mo18523l();
        }
        String m2 = mo18524m();
        return Float.valueOf(bundle.getFloat(m2.length() != 0 ? "com.google.android.gms.ads.flag.".concat(m2) : new String("com.google.android.gms.ads.flag.")));
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo16430c(SharedPreferences sharedPreferences) {
        return Float.valueOf(sharedPreferences.getFloat(mo18524m(), ((Float) mo18523l()).floatValue()));
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo16431d(SharedPreferences.Editor editor, Object obj) {
        editor.putFloat(mo18524m(), ((Float) obj).floatValue());
    }
}
