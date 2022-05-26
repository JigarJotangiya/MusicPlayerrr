package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.internal.ads.u6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5622u6 extends C5141h6 {
    public C5622u6(C5585t6 t6Var, SSLSocketFactory sSLSocketFactory) {
    }

    /* renamed from: a */
    static List<C5251k5> m31680a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry next : map.entrySet()) {
            if (next.getKey() != null) {
                for (String k5Var : (List) next.getValue()) {
                    arrayList.add(new C5251k5((String) next.getKey(), k5Var));
                }
            }
        }
        return arrayList;
    }
}
