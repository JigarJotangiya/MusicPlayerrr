package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.json.JSONArray;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jr1 {
    /* renamed from: a */
    public static String m25825a(JSONObject jSONObject, String str, String str2) {
        JSONArray optJSONArray;
        if (!(jSONObject == null || (optJSONArray = jSONObject.optJSONArray(str2)) == null)) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("including");
                    JSONArray optJSONArray3 = optJSONObject.optJSONArray("excluding");
                    if (m25826b(optJSONArray2, str) && !m25826b(optJSONArray3, str)) {
                        return optJSONObject.optString("effective_ad_unit_id", BuildConfig.FLAVOR);
                    }
                }
            }
        }
        return BuildConfig.FLAVOR;
    }

    /* renamed from: b */
    private static boolean m25826b(JSONArray jSONArray, String str) {
        Pattern pattern;
        if (!(jSONArray == null || str == null)) {
            int i = 0;
            while (i < jSONArray.length()) {
                String optString = jSONArray.optString(i);
                try {
                    if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22337G6)).booleanValue()) {
                        pattern = Pattern.compile(optString, 2);
                    } else {
                        pattern = Pattern.compile(optString);
                    }
                    if (pattern.matcher(str).lookingAt()) {
                        return true;
                    }
                    i++;
                } catch (PatternSyntaxException e) {
                    C2971s.m13213p().mo17571s(e, "RtbAdapterMap.hasAtleastOneRegexMatch");
                }
            }
        }
        return false;
    }
}
