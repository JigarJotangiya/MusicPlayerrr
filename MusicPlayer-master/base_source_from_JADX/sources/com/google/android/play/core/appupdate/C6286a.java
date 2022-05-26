package com.google.android.play.core.appupdate;

import android.app.PendingIntent;

/* renamed from: com.google.android.play.core.appupdate.a */
/* compiled from: com.google.android.play:core@@1.10.2 */
public class C6286a {

    /* renamed from: a */
    private final int f29269a;

    /* renamed from: b */
    private final int f29270b;

    /* renamed from: c */
    private final long f29271c;

    /* renamed from: d */
    private final long f29272d;

    /* renamed from: e */
    private final PendingIntent f29273e;

    /* renamed from: f */
    private final PendingIntent f29274f;

    /* renamed from: g */
    private final PendingIntent f29275g;

    /* renamed from: h */
    private final PendingIntent f29276h;

    /* renamed from: i */
    private boolean f29277i = false;

    private C6286a(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        this.f29269a = i2;
        this.f29270b = i3;
        this.f29271c = j3;
        this.f29272d = j4;
        this.f29273e = pendingIntent;
        this.f29274f = pendingIntent2;
        this.f29275g = pendingIntent3;
        this.f29276h = pendingIntent4;
    }

    /* renamed from: f */
    public static C6286a m37479f(String str, int i, int i2, int i3, Integer num, int i4, long j, long j2, long j3, long j4, PendingIntent pendingIntent, PendingIntent pendingIntent2, PendingIntent pendingIntent3, PendingIntent pendingIntent4) {
        return new C6286a(str, i, i2, i3, num, i4, j, j2, j3, j4, pendingIntent, pendingIntent2, pendingIntent3, pendingIntent4);
    }

    /* renamed from: i */
    private final boolean m37480i(C6292d dVar) {
        return dVar.mo25150a() && this.f29271c <= this.f29272d;
    }

    /* renamed from: a */
    public int mo25143a() {
        return this.f29270b;
    }

    /* renamed from: b */
    public boolean mo25144b(int i) {
        return mo25147e(C6292d.m37499c(i)) != null;
    }

    /* renamed from: c */
    public boolean mo25145c(C6292d dVar) {
        return mo25147e(dVar) != null;
    }

    /* renamed from: d */
    public int mo25146d() {
        return this.f29269a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final PendingIntent mo25147e(C6292d dVar) {
        if (dVar.mo25151b() == 0) {
            PendingIntent pendingIntent = this.f29274f;
            if (pendingIntent != null) {
                return pendingIntent;
            }
            if (m37480i(dVar)) {
                return this.f29276h;
            }
            return null;
        }
        if (dVar.mo25151b() == 1) {
            PendingIntent pendingIntent2 = this.f29273e;
            if (pendingIntent2 != null) {
                return pendingIntent2;
            }
            if (m37480i(dVar)) {
                return this.f29275g;
            }
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo25148g() {
        this.f29277i = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final boolean mo25149h() {
        return this.f29277i;
    }
}
