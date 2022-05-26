package com.p256kk.taurus.playerbase.p264h;

import android.os.Bundle;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.player.C6710b;

/* renamed from: com.kk.taurus.playerbase.h.i */
/* compiled from: RecordProxyPlayer */
public class C6688i implements C6710b {

    /* renamed from: a */
    private C6683e f30085a;

    /* renamed from: b */
    private C6618a f30086b;

    public C6688i(C6683e eVar) {
        this.f30085a = eVar;
    }

    /* renamed from: h */
    private int m38393h() {
        C6683e eVar = this.f30085a;
        if (eVar != null) {
            return eVar.mo25829a();
        }
        return 0;
    }

    /* renamed from: i */
    private int m38394i() {
        C6683e eVar = this.f30085a;
        if (eVar != null) {
            return eVar.getState();
        }
        return 0;
    }

    /* renamed from: j */
    private boolean m38395j() {
        int i = m38394i();
        return (i == -2 || i == -1 || i == 0 || i == 1 || i == 5) ? false : true;
    }

    /* renamed from: k */
    private void m38396k() {
        if (m38395j() && m38394i() != 6) {
            C6679c.m38371a().mo26023c(this.f30086b, m38393h());
        }
    }

    /* renamed from: a */
    public void mo26038a(int i, Bundle bundle) {
    }

    /* renamed from: b */
    public void mo26039b(int i, Bundle bundle) {
        if (i == -99016) {
            C6679c.m38371a().mo26024d(this.f30086b);
        } else if (i == -99005) {
            m38396k();
        }
    }

    /* renamed from: c */
    public int mo26040c(C6618a aVar) {
        return C6679c.m38371a().mo26022b(aVar);
    }

    /* renamed from: d */
    public void mo26041d() {
        m38396k();
    }

    /* renamed from: e */
    public void mo26042e() {
        m38396k();
    }

    /* renamed from: f */
    public void mo26043f(C6618a aVar) {
        m38396k();
        this.f30086b = aVar;
    }

    /* renamed from: g */
    public void mo26044g() {
        m38396k();
    }
}
