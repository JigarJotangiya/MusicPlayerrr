package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.play.core.assetpacks.c */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C6329c {
    /* renamed from: c */
    public static C6329c m37583c(Bundle bundle, C6381l1 l1Var, C6432v2 v2Var) {
        return m37584d(bundle, l1Var, v2Var, new ArrayList(), C6343e0.f29429a);
    }

    /* renamed from: d */
    private static C6329c m37584d(Bundle bundle, C6381l1 l1Var, C6432v2 v2Var, List<String> list, C6337d0 d0Var) {
        Bundle bundle2 = bundle;
        ArrayList<String> stringArrayList = bundle2.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m37541i(bundle2, str, l1Var, v2Var, d0Var));
        }
        for (String next : list) {
            hashMap.put(next, AssetPackState.m37540h(next, 4, 0, 0, 0, 0.0d, 1, BuildConfig.FLAVOR, BuildConfig.FLAVOR));
        }
        return new C6385m0(bundle2.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: a */
    public abstract Map<String, AssetPackState> mo25219a();

    /* renamed from: b */
    public abstract long mo25220b();
}
