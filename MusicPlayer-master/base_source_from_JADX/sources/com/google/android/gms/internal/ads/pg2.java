package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pg2 implements sg2<rg2<Bundle>> {

    /* renamed from: a */
    private final e93 f21405a;

    /* renamed from: b */
    private final Context f21406b;

    pg2(e93 e93, Context context) {
        this.f21405a = e93;
        this.f21406b = context;
    }

    /* renamed from: b */
    public static Bundle m29011b(Context context, JSONArray jSONArray) {
        SharedPreferences sharedPreferences;
        String str;
        Bundle bundle = new Bundle();
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            String optString = optJSONObject.optString("bk");
            String optString2 = optJSONObject.optString("sk");
            int optInt = optJSONObject.optInt("type", -1);
            int i2 = optInt != 0 ? optInt != 1 ? optInt != 2 ? 0 : 3 : 2 : 1;
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && i2 != 0) {
                String[] split = optString2.split("/");
                int length = split.length;
                Object obj = null;
                if (length <= 2 && length != 0) {
                    if (length == 1) {
                        sharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
                        str = split[0];
                    } else {
                        sharedPreferences = context.getSharedPreferences(split[0], 0);
                        str = split[1];
                    }
                    obj = sharedPreferences.getAll().get(str);
                }
                if (obj != null) {
                    int i3 = i2 - 1;
                    if (i3 != 0) {
                        if (i3 != 1) {
                            if (obj instanceof Boolean) {
                                bundle.putBoolean(optString, ((Boolean) obj).booleanValue());
                            }
                        } else if (obj instanceof Integer) {
                            bundle.putInt(optString, ((Integer) obj).intValue());
                        } else if (obj instanceof Long) {
                            bundle.putLong(optString, ((Long) obj).longValue());
                        } else if (obj instanceof Float) {
                            bundle.putFloat(optString, ((Float) obj).floatValue());
                        }
                    } else if (obj instanceof String) {
                        bundle.putString(optString, (String) obj);
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public final d93<rg2<Bundle>> mo15767a() {
        return this.f21405a.mo17138A0(new og2(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ rg2 mo20268c() throws Exception {
        String str = (String) C5054ev.m23225c().mo20153b(C5503qz.f22441V3);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return new ng2(m29011b(this.f21406b, new JSONArray(str)));
        } catch (JSONException e) {
            ul0.m31858c("JSON parsing error", e);
            return null;
        }
    }
}
