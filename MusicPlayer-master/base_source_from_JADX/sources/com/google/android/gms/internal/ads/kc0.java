package com.google.android.gms.internal.ads;

import com.google.ads.mediation.C2833a;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import p159f.p243f.p244a.C4856a;
import p159f.p243f.p244a.C4857b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class kc0 {
    /* renamed from: a */
    public static int m26189a(C4856a aVar) {
        C4856a aVar2 = C4856a.INVALID_REQUEST;
        C4857b bVar = C4857b.UNKNOWN;
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            return ordinal != 2 ? 0 : 2;
        }
        return 3;
    }

    /* renamed from: b */
    public static C2833a m26190b(zzbfd zzbfd, boolean z) {
        C4857b bVar;
        List<String> list = zzbfd.f27199k;
        HashSet hashSet = list != null ? new HashSet(list) : null;
        Date date = new Date(zzbfd.f27196h);
        int i = zzbfd.f27198j;
        if (i == 1) {
            bVar = C4857b.MALE;
        } else if (i != 2) {
            bVar = C4857b.UNKNOWN;
        } else {
            bVar = C4857b.FEMALE;
        }
        return new C2833a(date, bVar, hashSet, z, zzbfd.f27205q);
    }
}
