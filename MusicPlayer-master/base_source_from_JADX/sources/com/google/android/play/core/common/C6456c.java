package com.google.android.play.core.common;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;

/* renamed from: com.google.android.play.core.common.c */
/* compiled from: com.google.android.play:core@@1.10.2 */
public class C6456c {

    /* renamed from: a */
    private static final Map<String, Map<String, Integer>> f29744a = new HashMap();

    static {
        new HashSet(Arrays.asList(new String[]{"app_update", "review"}));
        new HashSet(Arrays.asList(new String[]{"native", "unity"}));
        new C7577a("PlayCoreVersion");
    }

    /* renamed from: a */
    public static Bundle m37825a(String str) {
        Bundle bundle = new Bundle();
        Map<String, Integer> b = m37826b(str);
        bundle.putInt("playcore_version_code", b.get("java").intValue());
        if (b.containsKey("native")) {
            bundle.putInt("playcore_native_version", b.get("native").intValue());
        }
        if (b.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", b.get("unity").intValue());
        }
        return bundle;
    }

    /* renamed from: b */
    public static synchronized Map<String, Integer> m37826b(String str) {
        Map<String, Integer> map;
        synchronized (C6456c.class) {
            Map<String, Map<String, Integer>> map2 = f29744a;
            if (!map2.containsKey(str)) {
                HashMap hashMap = new HashMap();
                hashMap.put("java", 11002);
                map2.put(str, hashMap);
            }
            map = map2.get(str);
        }
        return map;
    }
}
