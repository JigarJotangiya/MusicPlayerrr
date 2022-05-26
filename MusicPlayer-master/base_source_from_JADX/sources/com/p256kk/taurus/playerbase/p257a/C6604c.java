package com.p256kk.taurus.playerbase.p257a;

import android.os.Bundle;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.a.c */
/* compiled from: OnAssistPlayEventHandler */
public class C6604c extends C6603b<C6602a> {
    /* renamed from: j */
    public void mo25844a(C6602a aVar, Bundle bundle) {
        if (aVar.mo25839d()) {
            aVar.mo25835Q();
            return;
        }
        aVar.stop();
        aVar.mo25836a();
    }

    /* renamed from: k */
    public void mo25848e(C6602a aVar, Bundle bundle) {
        if (bundle != null) {
            C6618a aVar2 = (C6618a) bundle.getSerializable("serializable_data");
            if (aVar2 == null) {
                C6640b.m38217b("OnAssistPlayEventHandler", "requestPlayDataSource need legal data source");
                return;
            }
            aVar.stop();
            aVar.mo25841f(aVar2);
            aVar.mo25834D0();
        }
    }

    /* renamed from: l */
    public void mo25851h(C6602a aVar, Bundle bundle) {
        aVar.mo25840e(0);
    }

    /* renamed from: m */
    public void mo25850g(C6602a aVar, Bundle bundle) {
        aVar.mo25836a();
    }

    /* renamed from: n */
    public void mo25845b(C6602a aVar, Bundle bundle) {
        if (aVar.mo25839d()) {
            aVar.mo25837b();
        } else {
            mo25846c(aVar, bundle);
        }
    }

    /* renamed from: o */
    public void mo25846c(C6602a aVar, Bundle bundle) {
        aVar.mo25840e(bundle != null ? bundle.getInt("int_data") : 0);
    }

    /* renamed from: p */
    public void mo25849f(C6602a aVar, Bundle bundle) {
        aVar.mo25838c(bundle != null ? bundle.getInt("int_data") : 0);
    }

    /* renamed from: q */
    public void mo25847d(C6602a aVar, Bundle bundle) {
        aVar.stop();
    }
}
