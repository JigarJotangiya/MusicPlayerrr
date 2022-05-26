package com.p256kk.taurus.playerbase.extension;

import com.p256kk.taurus.playerbase.p263g.C6668j;

/* renamed from: com.kk.taurus.playerbase.extension.f */
/* compiled from: ProducerEventSender */
public final class C6648f implements C6656h {

    /* renamed from: a */
    private C6644b f30042a;

    public C6648f(C6644b bVar) {
        this.f30042a = bVar;
    }

    /* renamed from: a */
    public void mo25954a(String str, int i) {
        mo25955b(str, Integer.valueOf(i));
    }

    /* renamed from: b */
    public void mo25955b(String str, Object obj) {
        mo25956c(str, obj, (C6668j.C6671c) null);
    }

    /* renamed from: c */
    public void mo25956c(String str, Object obj, C6668j.C6671c cVar) {
        C6644b bVar = this.f30042a;
        if (bVar != null) {
            bVar.mo25946a(str, obj, cVar);
        }
    }
}
