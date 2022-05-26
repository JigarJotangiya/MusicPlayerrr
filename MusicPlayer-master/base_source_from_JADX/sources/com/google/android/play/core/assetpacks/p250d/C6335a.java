package com.google.android.play.core.assetpacks.p250d;

import java.util.HashMap;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.play.core.assetpacks.d.a */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C6335a {

    /* renamed from: a */
    private static final Map<Integer, String> f29415a;

    /* renamed from: b */
    private static final Map<Integer, String> f29416b;

    static {
        HashMap hashMap = new HashMap();
        f29415a = hashMap;
        HashMap hashMap2 = new HashMap();
        f29416b = hashMap2;
        hashMap.put(-1, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).");
        hashMap.put(-2, "The requested pack is not available.");
        hashMap.put(-3, "The request is invalid.");
        hashMap.put(-4, "The requested download is not found.");
        hashMap.put(-5, "The Asset Delivery API is not available.");
        hashMap.put(-6, "Network error. Unable to obtain the asset pack details.");
        hashMap.put(-7, "Download not permitted under current device circumstances (e.g. in background).");
        hashMap.put(-10, "Asset pack download failed due to insufficient storage.");
        hashMap.put(-11, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-12, "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.");
        hashMap.put(-13, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.");
        hashMap.put(-100, "Unknown error downloading an asset pack.");
        hashMap2.put(-1, "APP_UNAVAILABLE");
        hashMap2.put(-2, "PACK_UNAVAILABLE");
        hashMap2.put(-3, "INVALID_REQUEST");
        hashMap2.put(-4, "DOWNLOAD_NOT_FOUND");
        hashMap2.put(-5, "API_NOT_AVAILABLE");
        hashMap2.put(-6, "NETWORK_ERROR");
        hashMap2.put(-7, "ACCESS_DENIED");
        hashMap2.put(-10, "INSUFFICIENT_STORAGE");
        hashMap2.put(-11, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-12, "NETWORK_UNRESTRICTED");
        hashMap2.put(-13, "APP_NOT_OWNED");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }

    /* renamed from: a */
    public static String m37591a(int i) {
        Map<Integer, String> map = f29415a;
        Integer valueOf = Integer.valueOf(i);
        if (!map.containsKey(valueOf)) {
            return BuildConfig.FLAVOR;
        }
        String str = map.get(valueOf);
        String str2 = f29416b.get(valueOf);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 113 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(" (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}