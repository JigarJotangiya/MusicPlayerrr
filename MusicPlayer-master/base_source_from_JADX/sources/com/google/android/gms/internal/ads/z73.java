package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class z73<V> extends c83<V, List<V>> {
    z73(b43<? extends d93<? extends V>> b43, boolean z) {
        super(b43, true);
        mo20407U();
    }

    /* renamed from: X */
    public final /* bridge */ /* synthetic */ Object mo16550X(List list) {
        ArrayList a = z43.m34424a(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            a83 a83 = (a83) it.next();
            a.add(a83 != null ? a83.f13820a : null);
        }
        return Collections.unmodifiableList(a);
    }
}
