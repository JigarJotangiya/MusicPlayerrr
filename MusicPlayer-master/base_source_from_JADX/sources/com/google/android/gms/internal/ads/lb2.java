package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class lb2 implements sg2<rg2<Bundle>> {

    /* renamed from: a */
    private final Set<String> f19294a;

    lb2(Set<String> set) {
        this.f19294a = set;
    }

    /* renamed from: a */
    public final d93<rg2<Bundle>> mo15767a() {
        ArrayList arrayList = new ArrayList();
        for (String add : this.f19294a) {
            arrayList.add(add);
        }
        return s83.m30607i(new kb2(arrayList));
    }
}
