package androidx.work.impl;

import android.os.Handler;
import android.os.Looper;
import androidx.work.C1419s;
import p082e.p109h.p115l.C3647d;

/* renamed from: androidx.work.impl.a */
/* compiled from: DefaultRunnableScheduler */
public class C1245a implements C1419s {

    /* renamed from: a */
    private final Handler f5062a = C3647d.m15706a(Looper.getMainLooper());

    /* renamed from: a */
    public void mo6529a(long j, Runnable runnable) {
        this.f5062a.postDelayed(runnable, j);
    }

    /* renamed from: b */
    public void mo6530b(Runnable runnable) {
        this.f5062a.removeCallbacks(runnable);
    }
}
