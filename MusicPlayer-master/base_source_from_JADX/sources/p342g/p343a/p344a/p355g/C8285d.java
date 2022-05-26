package p342g.p343a.p344a.p355g;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import p342g.p343a.p344a.p346c.C7954g;

/* renamed from: g.a.a.g.d */
/* compiled from: HandlerTimeManager */
public class C8285d {

    /* renamed from: e */
    private static C8285d f34678e;

    /* renamed from: a */
    private int f34679a = 3000;

    /* renamed from: b */
    private C7954g f34680b;

    /* renamed from: c */
    private boolean f34681c = false;

    /* renamed from: d */
    private Handler f34682d = new C8286a();

    /* renamed from: g.a.a.g.d$a */
    /* compiled from: HandlerTimeManager */
    class C8286a extends Handler {
        C8286a() {
        }

        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i == 1) {
                C8285d.this.m45766d();
                Log.e("handler", "EndCallBack");
            } else if (i == 2) {
                C8285d.this.mo29985c();
                Log.e("handler", "CancelCallBack");
            }
        }
    }

    /* renamed from: b */
    public static synchronized C8285d m45765b() {
        C8285d dVar;
        synchronized (C8285d.class) {
            if (f34678e == null) {
                f34678e = new C8285d();
            }
            dVar = f34678e;
        }
        return dVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m45766d() {
        this.f34681c = false;
        this.f34680b.mo26724b();
    }

    /* renamed from: c */
    public void mo29985c() {
        this.f34682d.removeCallbacksAndMessages((Object) null);
        this.f34680b.mo26723a();
        if (this.f34681c) {
            mo29987f();
        }
    }

    /* renamed from: e */
    public void mo29986e(C7954g gVar) {
        this.f34680b = gVar;
    }

    /* renamed from: f */
    public void mo29987f() {
        this.f34681c = true;
        this.f34682d.sendEmptyMessageDelayed(1, (long) this.f34679a);
        this.f34680b.mo26725c();
        Log.e("handler", "StartCallBack");
    }
}
