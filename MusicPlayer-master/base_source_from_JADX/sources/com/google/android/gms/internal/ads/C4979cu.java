package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.C3110r;
import java.util.Comparator;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.cu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class C4979cu implements Comparator {

    /* renamed from: g */
    public static final /* synthetic */ C4979cu f15149g = new C4979cu();

    private /* synthetic */ C4979cu() {
    }

    public final int compare(Object obj, Object obj2) {
        List<String> list = C3110r.f10196e;
        return list.indexOf((String) obj) - list.indexOf((String) obj2);
    }
}
