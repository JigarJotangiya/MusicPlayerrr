package com.p256kk.taurus.playerbase.player;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.p256kk.taurus.playerbase.p261e.C6640b;

/* renamed from: com.kk.taurus.playerbase.player.e */
/* compiled from: TimerCounterProxy */
public class C6713e {

    /* renamed from: a */
    private int f30112a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public boolean f30113b = true;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public C6715b f30114c;

    /* renamed from: d */
    private Handler f30115d = new C6714a(Looper.getMainLooper());

    /* renamed from: com.kk.taurus.playerbase.player.e$a */
    /* compiled from: TimerCounterProxy */
    class C6714a extends Handler {
        C6714a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1 && C6713e.this.f30113b) {
                if (C6713e.this.f30114c != null) {
                    C6713e.this.f30114c.mo25831a();
                }
                C6713e.this.m38444e();
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.e$b */
    /* compiled from: TimerCounterProxy */
    public interface C6715b {
        /* renamed from: a */
        void mo25831a();
    }

    public C6713e(int i) {
        this.f30112a = i;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m38444e() {
        m38445h();
        this.f30115d.sendEmptyMessageDelayed(1, (long) this.f30112a);
    }

    /* renamed from: h */
    private void m38445h() {
        this.f30115d.removeMessages(1);
    }

    /* renamed from: d */
    public void mo26110d() {
        m38445h();
    }

    /* renamed from: f */
    public void mo26111f(int i, Bundle bundle) {
        mo26110d();
    }

    /* renamed from: g */
    public void mo26112g(int i, Bundle bundle) {
        switch (i) {
            case -99016:
            case -99009:
            case -99008:
            case -99007:
                mo26110d();
                return;
            case -99015:
            case -99014:
            case -99011:
            case -99010:
            case -99006:
            case -99005:
            case -99001:
                if (this.f30113b) {
                    mo26116l();
                    return;
                }
                return;
            default:
                return;
        }
    }

    /* renamed from: i */
    public void mo26113i(int i) {
        this.f30112a = i;
    }

    /* renamed from: j */
    public void mo26114j(C6715b bVar) {
        this.f30114c = bVar;
    }

    /* renamed from: k */
    public void mo26115k(boolean z) {
        this.f30113b = z;
        if (!z) {
            mo26110d();
            C6640b.m38217b("TimerCounterProxy", "Timer Stopped");
            return;
        }
        mo26116l();
        C6640b.m38217b("TimerCounterProxy", "Timer Started");
    }

    /* renamed from: l */
    public void mo26116l() {
        m38445h();
        this.f30115d.sendEmptyMessage(1);
    }
}
