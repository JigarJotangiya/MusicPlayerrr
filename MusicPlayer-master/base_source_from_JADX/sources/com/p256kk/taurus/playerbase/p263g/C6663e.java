package com.p256kk.taurus.playerbase.p263g;

import java.util.Comparator;

/* renamed from: com.kk.taurus.playerbase.g.e */
/* compiled from: CoverComparator */
public class C6663e implements Comparator<C6667i> {
    /* renamed from: a */
    public int compare(C6667i iVar, C6667i iVar2) {
        int D = iVar instanceof C6660b ? ((C6660b) iVar).mo10293D() : 0;
        int D2 = iVar2 instanceof C6660b ? ((C6660b) iVar2).mo10293D() : 0;
        if (D < D2) {
            return -1;
        }
        if (D == D2) {
            return 0;
        }
        return 1;
    }
}
