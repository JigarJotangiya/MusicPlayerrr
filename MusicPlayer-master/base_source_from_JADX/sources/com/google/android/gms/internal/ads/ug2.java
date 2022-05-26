package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class ug2 implements Callable {

    /* renamed from: a */
    public final /* synthetic */ List f24334a;

    /* renamed from: b */
    public final /* synthetic */ Object f24335b;

    public /* synthetic */ ug2(List list, Object obj) {
        this.f24334a = list;
        this.f24335b = obj;
    }

    public final Object call() {
        List<d93> list = this.f24334a;
        Object obj = this.f24335b;
        for (d93 d93 : list) {
            rg2 rg2 = (rg2) d93.get();
            if (rg2 != null) {
                rg2.mo15742b(obj);
            }
        }
        return obj;
    }
}
