package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class rd1 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ td1 f22824g;

    /* renamed from: h */
    public final /* synthetic */ Object f22825h;

    public /* synthetic */ rd1(td1 td1, Object obj) {
        this.f22824g = td1;
        this.f22825h = obj;
    }

    public final void run() {
        try {
            this.f22824g.mo15752b(this.f22825h);
        } catch (Throwable th) {
            C2971s.m13213p().mo17570r(th, "EventEmitter.notify");
            C3018m1.m13389l("Event emitter exception.", th);
        }
    }
}
