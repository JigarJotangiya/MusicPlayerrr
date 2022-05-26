package com.google.android.gms.ads.internal;

import android.app.Activity;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.internal.ads.C4980cv;
import com.google.android.gms.internal.ads.C5054ev;
import com.google.android.gms.internal.ads.C5478qa;
import com.google.android.gms.internal.ads.C5503qz;
import com.google.android.gms.internal.ads.C5589ta;
import com.google.android.gms.internal.ads.C5700wa;
import com.google.android.gms.internal.ads.dy2;
import com.google.android.gms.internal.ads.gz2;
import com.google.android.gms.internal.ads.hm0;
import com.google.android.gms.internal.ads.nl0;
import com.google.android.gms.internal.ads.ul0;
import com.google.android.gms.internal.ads.wz2;
import com.google.android.gms.internal.ads.zzcjf;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.ads.internal.i */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2933i implements Runnable, C5589ta {

    /* renamed from: g */
    private final List<Object[]> f9825g = new Vector();

    /* renamed from: h */
    private final AtomicReference<C5589ta> f9826h = new AtomicReference<>();

    /* renamed from: i */
    private final AtomicReference<C5589ta> f9827i = new AtomicReference<>();

    /* renamed from: j */
    protected boolean f9828j;

    /* renamed from: k */
    private final boolean f9829k;

    /* renamed from: l */
    private final boolean f9830l;

    /* renamed from: m */
    private final Executor f9831m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final dy2 f9832n;

    /* renamed from: o */
    private Context f9833o;

    /* renamed from: p */
    private final Context f9834p;

    /* renamed from: q */
    private zzcjf f9835q;

    /* renamed from: r */
    private final zzcjf f9836r;

    /* renamed from: s */
    private final boolean f9837s;

    /* renamed from: t */
    final CountDownLatch f9838t = new CountDownLatch(1);

    /* renamed from: u */
    private int f9839u;

    public C2933i(Context context, zzcjf zzcjf) {
        this.f9833o = context;
        this.f9834p = context;
        this.f9835q = zzcjf;
        this.f9836r = zzcjf;
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        this.f9831m = newCachedThreadPool;
        boolean booleanValue = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22634u1)).booleanValue();
        this.f9837s = booleanValue;
        this.f9832n = dy2.m22747a(context, newCachedThreadPool, booleanValue);
        this.f9829k = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22610r1)).booleanValue();
        this.f9830l = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22642v1)).booleanValue();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22626t1)).booleanValue()) {
            this.f9839u = 2;
        } else {
            this.f9839u = 1;
        }
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22418S1)).booleanValue()) {
            this.f9828j = mo10847j();
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22390O1)).booleanValue()) {
            hm0.f17708a.execute(this);
            return;
        }
        C4980cv.m22123b();
        if (nl0.m27924p()) {
            hm0.f17708a.execute(this);
        } else {
            run();
        }
    }

    /* renamed from: m */
    private final C5589ta m13062m() {
        if (mo10849l() == 2) {
            return this.f9827i.get();
        }
        return this.f9826h.get();
    }

    /* renamed from: n */
    private final void m13063n() {
        C5589ta m = m13062m();
        if (!this.f9825g.isEmpty() && m != null) {
            for (Object[] next : this.f9825g) {
                int length = next.length;
                if (length == 1) {
                    m.mo10843e((MotionEvent) next[0]);
                } else if (length == 3) {
                    m.mo10841c(((Integer) next[0]).intValue(), ((Integer) next[1]).intValue(), ((Integer) next[2]).intValue());
                }
            }
            this.f9825g.clear();
        }
    }

    /* renamed from: o */
    private final void m13064o(boolean z) {
        this.f9826h.set(C5700wa.m33023w(this.f9835q.f27376g, m13065p(this.f9833o), z, this.f9839u));
    }

    /* renamed from: p */
    private static final Context m13065p(Context context) {
        Context applicationContext = context.getApplicationContext();
        return applicationContext == null ? context : applicationContext;
    }

    /* renamed from: a */
    public final void mo10839a(View view) {
        C5589ta m = m13062m();
        if (m != null) {
            m.mo10839a(view);
        }
    }

    /* renamed from: b */
    public final String mo10840b(Context context) {
        C5589ta m;
        if (!mo10848k() || (m = m13062m()) == null) {
            return BuildConfig.FLAVOR;
        }
        m13063n();
        return m.mo10840b(m13065p(context));
    }

    /* renamed from: c */
    public final void mo10841c(int i, int i2, int i3) {
        C5589ta m = m13062m();
        if (m != null) {
            m13063n();
            m.mo10841c(i, i2, i3);
            return;
        }
        this.f9825g.add(new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    /* renamed from: d */
    public final String mo10842d(Context context, String str, View view, Activity activity) {
        if (!mo10848k()) {
            return BuildConfig.FLAVOR;
        }
        C5589ta m = m13062m();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22655w6)).booleanValue()) {
            C2971s.m13214q();
            C2979b2.m13266n(view, 4, (MotionEvent) null);
        }
        if (m == null) {
            return BuildConfig.FLAVOR;
        }
        m13063n();
        return m.mo10842d(m13065p(context), str, view, activity);
    }

    /* renamed from: e */
    public final void mo10843e(MotionEvent motionEvent) {
        C5589ta m = m13062m();
        if (m != null) {
            m13063n();
            m.mo10843e(motionEvent);
            return;
        }
        this.f9825g.add(new Object[]{motionEvent});
    }

    /* renamed from: f */
    public final String mo10844f(Context context, View view, Activity activity) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22647v6)).booleanValue()) {
            C5589ta m = m13062m();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22655w6)).booleanValue()) {
                C2971s.m13214q();
                C2979b2.m13266n(view, 2, (MotionEvent) null);
            }
            return m != null ? m.mo10844f(context, view, (Activity) null) : BuildConfig.FLAVOR;
        } else if (!mo10848k()) {
            return BuildConfig.FLAVOR;
        } else {
            C5589ta m2 = m13062m();
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22655w6)).booleanValue()) {
                C2971s.m13214q();
                C2979b2.m13266n(view, 2, (MotionEvent) null);
            }
            if (m2 != null) {
                return m2.mo10844f(context, view, (Activity) null);
            }
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: g */
    public final String mo10845g(Context context, String str, View view) {
        return mo10842d(context, str, view, (Activity) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final /* synthetic */ void mo10846i(boolean z) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            C5478qa.m29416h(this.f9836r.f27376g, m13065p(this.f9834p), z, this.f9837s).mo20413o();
        } catch (NullPointerException e) {
            this.f9832n.mo17048c(2027, System.currentTimeMillis() - currentTimeMillis, e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final boolean mo10847j() {
        Context context = this.f9833o;
        dy2 dy2 = this.f9832n;
        C2932h hVar = new C2932h(this);
        return new wz2(this.f9833o, gz2.m24600b(context, dy2), hVar, ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22618s1)).booleanValue()).mo21946d(1);
    }

    /* renamed from: k */
    public final boolean mo10848k() {
        try {
            this.f9838t.await();
            return true;
        } catch (InterruptedException e) {
            ul0.m31863h("Interrupted during GADSignals creation.", e);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final int mo10849l() {
        if (!this.f9829k || this.f9828j) {
            return this.f9839u;
        }
        return 1;
    }

    public final void run() {
        boolean z;
        long currentTimeMillis;
        try {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22418S1)).booleanValue()) {
                this.f9828j = mo10847j();
            }
            boolean z2 = this.f9835q.f27379j;
            z = false;
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22307D0)).booleanValue() && z2) {
                z = true;
            }
            if (mo10849l() == 1) {
                m13064o(z);
                if (this.f9839u == 2) {
                    this.f9831m.execute(new C2931g(this, z));
                }
            } else {
                currentTimeMillis = System.currentTimeMillis();
                C5478qa h = C5478qa.m29416h(this.f9835q.f27376g, m13065p(this.f9833o), z, this.f9837s);
                this.f9827i.set(h);
                if (this.f9830l && !h.mo20414q()) {
                    this.f9839u = 1;
                    m13064o(z);
                }
            }
        } catch (NullPointerException e) {
            this.f9839u = 1;
            m13064o(z);
            this.f9832n.mo17048c(2031, System.currentTimeMillis() - currentTimeMillis, e);
        } catch (Throwable th) {
            this.f9838t.countDown();
            this.f9833o = null;
            this.f9835q = null;
            throw th;
        }
        this.f9838t.countDown();
        this.f9833o = null;
        this.f9835q = null;
    }
}
