package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class a01 implements e81, u91, z81, C5497qt, v81 {
    /* access modifiers changed from: private */

    /* renamed from: g */
    public final Context f13693g;

    /* renamed from: h */
    private final Executor f13694h;

    /* renamed from: i */
    private final Executor f13695i;

    /* renamed from: j */
    private final ScheduledExecutorService f13696j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public final np2 f13697k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public final bp2 f13698l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final iv2 f13699m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final dq2 f13700n;

    /* renamed from: o */
    private final C5737xa f13701o;

    /* renamed from: p */
    private final q00 f13702p;

    /* renamed from: q */
    private final WeakReference<View> f13703q;

    /* renamed from: r */
    private boolean f13704r;

    /* renamed from: s */
    private final AtomicBoolean f13705s = new AtomicBoolean();

    public a01(Context context, Executor executor, Executor executor2, ScheduledExecutorService scheduledExecutorService, np2 np2, bp2 bp2, iv2 iv2, dq2 dq2, View view, C5737xa xaVar, q00 q00, s00 s00, byte[] bArr) {
        this.f13693g = context;
        this.f13694h = executor;
        this.f13695i = executor2;
        this.f13696j = scheduledExecutorService;
        this.f13697k = np2;
        this.f13698l = bp2;
        this.f13699m = iv2;
        this.f13700n = dq2;
        this.f13701o = xaVar;
        this.f13703q = new WeakReference<>(view);
        this.f13702p = q00;
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m20520v() {
        String f = ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22439V1)).booleanValue() ? this.f13701o.mo21999c().mo10844f(this.f13693g, (View) this.f13703q.get(), (Activity) null) : null;
        if ((!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22513f0)).booleanValue() || !this.f13697k.f20683b.f20121b.f16055g) && e10.f15826g.mo20989e().booleanValue()) {
            s83.m30616r((j83) s83.m30613o(j83.m25564E(s83.m30607i(null)), ((Long) C5054ev.m23225c().mo20153b(C5503qz.f22299C0)).longValue(), TimeUnit.MILLISECONDS, this.f13696j), new zz0(this, f), this.f13694h);
            return;
        }
        dq2 dq2 = this.f13700n;
        iv2 iv2 = this.f13699m;
        np2 np2 = this.f13697k;
        bp2 bp2 = this.f13698l;
        dq2.mo16987a(iv2.mo18514b(np2, bp2, false, f, (String) null, bp2.f14641d));
    }

    /* renamed from: x */
    private final void m20521x(int i, int i2) {
        View view;
        if (i <= 0 || !((view = (View) this.f13703q.get()) == null || view.getHeight() == 0 || view.getWidth() == 0)) {
            m20520v();
        } else {
            this.f13696j.schedule(new xz0(this, i, i2), (long) i2, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: d */
    public final void mo15612d(fh0 fh0, String str, String str2) {
        dq2 dq2 = this.f13700n;
        iv2 iv2 = this.f13699m;
        bp2 bp2 = this.f13698l;
        dq2.mo16987a(iv2.mo18515c(bp2, bp2.f14651i, fh0));
    }

    /* renamed from: h */
    public final void mo15613h() {
    }

    /* renamed from: j */
    public final void mo15614j() {
        if (this.f13705s.compareAndSet(false, true)) {
            int intValue = ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22460Y1)).intValue();
            if (intValue > 0) {
                m20521x(intValue, ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22467Z1)).intValue());
                return;
            }
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22453X1)).booleanValue()) {
                this.f13695i.execute(new uz0(this));
            } else {
                m20520v();
            }
        }
    }

    /* renamed from: k */
    public final synchronized void mo15615k() {
        if (this.f13704r) {
            ArrayList arrayList = new ArrayList(this.f13698l.f14641d);
            arrayList.addAll(this.f13698l.f14647g);
            this.f13700n.mo16987a(this.f13699m.mo18514b(this.f13697k, this.f13698l, true, (String) null, (String) null, arrayList));
        } else {
            dq2 dq2 = this.f13700n;
            iv2 iv2 = this.f13699m;
            np2 np2 = this.f13697k;
            bp2 bp2 = this.f13698l;
            dq2.mo16987a(iv2.mo18513a(np2, bp2, bp2.f14659n));
            dq2 dq22 = this.f13700n;
            iv2 iv22 = this.f13699m;
            np2 np22 = this.f13697k;
            bp2 bp22 = this.f13698l;
            dq22.mo16987a(iv22.mo18513a(np22, bp22, bp22.f14647g));
        }
        this.f13704r = true;
    }

    /* renamed from: l */
    public final void mo15616l() {
    }

    /* renamed from: m */
    public final void mo15617m() {
    }

    /* renamed from: n */
    public final void mo15618n() {
        dq2 dq2 = this.f13700n;
        iv2 iv2 = this.f13699m;
        np2 np2 = this.f13697k;
        bp2 bp2 = this.f13698l;
        dq2.mo16987a(iv2.mo18513a(np2, bp2, bp2.f14653j));
    }

    /* renamed from: n0 */
    public final void mo15619n0(zzbew zzbew) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22452X0)).booleanValue()) {
            this.f13700n.mo16987a(this.f13699m.mo18513a(this.f13697k, this.f13698l, iv2.m25421d(2, zzbew.f27186g, this.f13698l.f14661p)));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final /* synthetic */ void mo15620p() {
        this.f13694h.execute(new vz0(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo15621r(int i, int i2) {
        m20521x(i - 1, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final /* synthetic */ void mo15622u(int i, int i2) {
        this.f13694h.execute(new wz0(this, i, i2));
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        if ((!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22513f0)).booleanValue() || !this.f13697k.f20683b.f20121b.f16055g) && e10.f15823d.mo20989e().booleanValue()) {
            s83.m30616r(s83.m30604f(j83.m25564E(this.f13702p.mo20354a()), Throwable.class, tz0.f24067a, hm0.f17713f), new yz0(this), this.f13694h);
            return;
        }
        dq2 dq2 = this.f13700n;
        iv2 iv2 = this.f13699m;
        np2 np2 = this.f13697k;
        bp2 bp2 = this.f13698l;
        List<String> a = iv2.mo18513a(np2, bp2, bp2.f14639c);
        C2971s.m13214q();
        int i = 1;
        if (true == C2979b2.m13262j(this.f13693g)) {
            i = 2;
        }
        dq2.mo16989c(a, i);
    }

    public final void zzr() {
        dq2 dq2 = this.f13700n;
        iv2 iv2 = this.f13699m;
        np2 np2 = this.f13697k;
        bp2 bp2 = this.f13698l;
        dq2.mo16987a(iv2.mo18513a(np2, bp2, bp2.f14649h));
    }
}
