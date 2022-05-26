package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.WindowManager;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bx2 {

    /* renamed from: a */
    private static WindowManager f14728a;

    /* renamed from: b */
    private static final String[] f14729b = {"x", "y", "width", "height"};

    /* renamed from: c */
    static float f14730c = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: a */
    public static JSONObject m21580a(int i, int i2, int i3, int i4) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("x", (double) (((float) i) / f14730c));
            jSONObject.put("y", (double) (((float) i2) / f14730c));
            jSONObject.put("width", (double) (((float) i3) / f14730c));
            jSONObject.put("height", (double) (((float) i4) / f14730c));
        } catch (JSONException e) {
            cx2.m22196a("Error with creating viewStateObject", e);
        }
        return jSONObject;
    }

    /* renamed from: b */
    public static void m21581b(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("adSessionId", str);
        } catch (JSONException e) {
            cx2.m22196a("Error with setting ad session id", e);
        }
    }

    /* renamed from: c */
    public static void m21582c(JSONObject jSONObject, JSONObject jSONObject2) {
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("childViews");
            if (optJSONArray == null) {
                optJSONArray = new JSONArray();
                jSONObject.put("childViews", optJSONArray);
            }
            optJSONArray.put(jSONObject2);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: d */
    public static void m21583d(JSONObject jSONObject, fx2 fx2) {
        mw2 a = fx2.mo17762a();
        JSONArray jSONArray = new JSONArray();
        ArrayList<String> b = fx2.mo17763b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            jSONArray.put(b.get(i));
        }
        try {
            jSONObject.put("isFriendlyObstructionFor", jSONArray);
            jSONObject.put("friendlyObstructionClass", a.mo19569d());
            jSONObject.put("friendlyObstructionPurpose", a.mo19566a());
            jSONObject.put("friendlyObstructionReason", a.mo19568c());
        } catch (JSONException e) {
            cx2.m22196a("Error with setting friendly obstruction", e);
        }
    }

    /* renamed from: e */
    public static void m21584e(JSONObject jSONObject, String str) {
        try {
            jSONObject.put("notVisibleReason", str);
        } catch (JSONException e) {
            cx2.m22196a("Error with setting not visible reason", e);
        }
    }

    /* renamed from: f */
    public static void m21585f(Context context) {
        if (context != null) {
            f14730c = context.getResources().getDisplayMetrics().density;
            f14728a = (WindowManager) context.getSystemService("window");
        }
    }

    /* renamed from: g */
    public static void m21586g(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 47);
            sb.append("JSONException during JSONObject.put for name [");
            sb.append(str);
            sb.append("]");
            cx2.m22196a(sb.toString(), e);
        }
    }

    /* renamed from: h */
    public static void m21587h(JSONObject jSONObject) {
        float f;
        JSONObject jSONObject2 = jSONObject;
        float f2 = 0.0f;
        if (Build.VERSION.SDK_INT < 17) {
            JSONArray optJSONArray = jSONObject2.optJSONArray("childViews");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                f = 0.0f;
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        double optDouble = optJSONObject.optDouble("x");
                        double optDouble2 = optJSONObject.optDouble("y");
                        double optDouble3 = optJSONObject.optDouble("width");
                        double optDouble4 = optJSONObject.optDouble("height");
                        f2 = Math.max(f2, (float) (optDouble + optDouble3));
                        f = Math.max(f, (float) (optDouble2 + optDouble4));
                    }
                }
                jSONObject2.put("width", (double) f2);
                jSONObject2.put("height", (double) f);
            }
        } else if (f14728a != null) {
            Point point = new Point(0, 0);
            f14728a.getDefaultDisplay().getRealSize(point);
            float f3 = f14730c;
            float f4 = ((float) point.x) / f3;
            f = ((float) point.y) / f3;
            f2 = f4;
            jSONObject2.put("width", (double) f2);
            jSONObject2.put("height", (double) f);
        }
        f = 0.0f;
        try {
            jSONObject2.put("width", (double) f2);
            jSONObject2.put("height", (double) f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: i */
    public static boolean m21588i(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null && jSONObject2 == null) {
            return true;
        }
        if (jSONObject != null && jSONObject2 != null) {
            String[] strArr = f14729b;
            int i = 0;
            while (true) {
                if (i < 4) {
                    String str = strArr[i];
                    if (jSONObject.optDouble(str) != jSONObject2.optDouble(str)) {
                        break;
                    }
                    i++;
                } else if (jSONObject.optString("adSessionId", BuildConfig.FLAVOR).equals(jSONObject2.optString("adSessionId", BuildConfig.FLAVOR))) {
                    JSONArray optJSONArray = jSONObject.optJSONArray("isFriendlyObstructionFor");
                    JSONArray optJSONArray2 = jSONObject2.optJSONArray("isFriendlyObstructionFor");
                    if (optJSONArray != null || optJSONArray2 != null) {
                        if (m21589j(optJSONArray, optJSONArray2)) {
                            int i2 = 0;
                            while (true) {
                                if (i2 < optJSONArray.length()) {
                                    if (!optJSONArray.optString(i2, BuildConfig.FLAVOR).equals(optJSONArray2.optString(i2, BuildConfig.FLAVOR))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    break;
                                }
                            }
                        }
                    }
                    JSONArray optJSONArray3 = jSONObject.optJSONArray("childViews");
                    JSONArray optJSONArray4 = jSONObject2.optJSONArray("childViews");
                    if (!(optJSONArray3 == null && optJSONArray4 == null)) {
                        if (m21589j(optJSONArray3, optJSONArray4)) {
                            int i3 = 0;
                            while (i3 < optJSONArray3.length()) {
                                if (m21588i(optJSONArray3.optJSONObject(i3), optJSONArray4.optJSONObject(i3))) {
                                    i3++;
                                }
                            }
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: j */
    private static boolean m21589j(JSONArray jSONArray, JSONArray jSONArray2) {
        if (jSONArray == null && jSONArray2 == null) {
            return true;
        }
        return (jSONArray == null || jSONArray2 == null || jSONArray.length() != jSONArray2.length()) ? false : true;
    }
}
