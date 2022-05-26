package com.p256kk.taurus.playerbase.p264h;

import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.h.c */
/* compiled from: PlayRecord */
class C6679c {

    /* renamed from: b */
    private static C6679c f30073b;

    /* renamed from: a */
    private C6686g f30074a = new C6686g(C6680d.m38376b());

    private C6679c() {
    }

    /* renamed from: a */
    public static C6679c m38371a() {
        if (f30073b == null) {
            synchronized (C6679c.class) {
                if (f30073b == null) {
                    f30073b = new C6679c();
                }
            }
        }
        return f30073b;
    }

    /* renamed from: b */
    public int mo26022b(C6618a aVar) {
        if (aVar == null) {
            return 0;
        }
        int b = this.f30074a.mo26035b(aVar);
        C6640b.m38216a("PlayRecord", "<<Get>> : record = " + b);
        return b;
    }

    /* renamed from: c */
    public int mo26023c(C6618a aVar, int i) {
        if (aVar == null) {
            return -1;
        }
        int d = this.f30074a.mo26037d(aVar, i);
        C6640b.m38216a("PlayRecord", "<<Save>> : record = " + i);
        return d;
    }

    /* renamed from: d */
    public int mo26024d(C6618a aVar) {
        if (aVar == null) {
            return -1;
        }
        return this.f30074a.mo26036c(aVar);
    }
}
