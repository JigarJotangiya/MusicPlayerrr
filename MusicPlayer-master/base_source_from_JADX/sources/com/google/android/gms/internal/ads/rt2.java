package com.google.android.gms.internal.ads;

import android.os.Handler;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rt2 implements r22 {

    /* renamed from: b */
    private static final List<qs2> f22993b = new ArrayList(50);

    /* renamed from: a */
    private final Handler f22994a;

    public rt2(Handler handler) {
        this.f22994a = handler;
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m30321h(qs2 qs2) {
        List<qs2> list = f22993b;
        synchronized (list) {
            if (list.size() < 50) {
                list.add(qs2);
            }
        }
    }

    /* renamed from: i */
    private static qs2 m30322i() {
        qs2 qs2;
        List<qs2> list = f22993b;
        synchronized (list) {
            if (list.isEmpty()) {
                qs2 = new qs2((pr2) null);
            } else {
                qs2 = list.remove(list.size() - 1);
            }
        }
        return qs2;
    }

    /* renamed from: L */
    public final boolean mo20552L(int i) {
        return this.f22994a.sendEmptyMessage(i);
    }

    /* renamed from: a */
    public final boolean mo20553a(Runnable runnable) {
        return this.f22994a.post(runnable);
    }

    /* renamed from: b */
    public final q12 mo20554b(int i, Object obj) {
        qs2 i2 = m30322i();
        i2.mo20503a(this.f22994a.obtainMessage(i, obj), this);
        return i2;
    }

    /* renamed from: c */
    public final q12 mo20555c(int i) {
        qs2 i2 = m30322i();
        i2.mo20503a(this.f22994a.obtainMessage(i), this);
        return i2;
    }

    /* renamed from: d */
    public final void mo20556d(Object obj) {
        this.f22994a.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: e */
    public final q12 mo20557e(int i, int i2, int i3) {
        qs2 i4 = m30322i();
        i4.mo20503a(this.f22994a.obtainMessage(1, i2, i3), this);
        return i4;
    }

    /* renamed from: f */
    public final boolean mo20558f(q12 q12) {
        return ((qs2) q12).mo20504b(this.f22994a);
    }

    /* renamed from: g */
    public final boolean mo20559g(int i, long j) {
        return this.f22994a.sendEmptyMessageAtTime(2, j);
    }

    /* renamed from: y */
    public final void mo20560y(int i) {
        this.f22994a.removeMessages(2);
    }

    /* renamed from: z */
    public final boolean mo20561z(int i) {
        return this.f22994a.hasMessages(0);
    }
}
