package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.rz */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5540rz {
    /* renamed from: a */
    static List<String> m30465a() {
        ArrayList arrayList = new ArrayList();
        m30467c(arrayList, t00.m31012c("gad:dynamite_module:experiment_id", BuildConfig.FLAVOR));
        m30467c(arrayList, d10.f15442a);
        m30467c(arrayList, d10.f15443b);
        m30467c(arrayList, d10.f15444c);
        m30467c(arrayList, d10.f15445d);
        m30467c(arrayList, d10.f15446e);
        m30467c(arrayList, d10.f15452k);
        m30467c(arrayList, d10.f15447f);
        m30467c(arrayList, d10.f15448g);
        m30467c(arrayList, d10.f15449h);
        m30467c(arrayList, d10.f15450i);
        m30467c(arrayList, d10.f15451j);
        return arrayList;
    }

    /* renamed from: b */
    static List<String> m30466b() {
        ArrayList arrayList = new ArrayList();
        m30467c(arrayList, p10.f21280a);
        return arrayList;
    }

    /* renamed from: c */
    private static void m30467c(List<String> list, t00<String> t00) {
        String e = t00.mo20989e();
        if (!TextUtils.isEmpty(e)) {
            list.add(e);
        }
    }
}
