package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3024o1;
import com.google.android.gms.ads.internal.util.C3033r1;
import com.google.android.gms.common.p078l.C3334c;
import com.google.android.gms.common.util.C3369n;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fl0 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Object f16663a = new Object();

    /* renamed from: b */
    private final C3033r1 f16664b;

    /* renamed from: c */
    private final jl0 f16665c;

    /* renamed from: d */
    private boolean f16666d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public Context f16667e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public zzcjf f16668f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C5688vz f16669g;

    /* renamed from: h */
    private Boolean f16670h;

    /* renamed from: i */
    private final AtomicInteger f16671i;

    /* renamed from: j */
    private final el0 f16672j;

    /* renamed from: k */
    private final Object f16673k;

    /* renamed from: l */
    private d93<ArrayList<String>> f16674l;

    public fl0() {
        C3033r1 r1Var = new C3033r1();
        this.f16664b = r1Var;
        this.f16665c = new jl0(C4980cv.m22125d(), r1Var);
        this.f16666d = false;
        this.f16669g = null;
        this.f16670h = null;
        this.f16671i = new AtomicInteger(0);
        this.f16672j = new el0((dl0) null);
        this.f16673k = new Object();
    }

    /* renamed from: a */
    public final int mo17557a() {
        return this.f16671i.get();
    }

    /* renamed from: c */
    public final Context mo17558c() {
        return this.f16667e;
    }

    /* renamed from: d */
    public final Resources mo17559d() {
        if (this.f16668f.f27379j) {
            return this.f16667e.getResources();
        }
        try {
            if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22321E6)).booleanValue()) {
                return zl0.m34658a(this.f16667e).getResources();
            }
            zl0.m34658a(this.f16667e).getResources();
            return null;
        } catch (yl0 e) {
            ul0.m31863h("Cannot load resource from dynamite apk or local jar", e);
            return null;
        }
    }

    /* renamed from: f */
    public final C5688vz mo17560f() {
        C5688vz vzVar;
        synchronized (this.f16663a) {
            vzVar = this.f16669g;
        }
        return vzVar;
    }

    /* renamed from: g */
    public final jl0 mo17561g() {
        return this.f16665c;
    }

    /* renamed from: h */
    public final C3024o1 mo17562h() {
        C3033r1 r1Var;
        synchronized (this.f16663a) {
            r1Var = this.f16664b;
        }
        return r1Var;
    }

    /* renamed from: j */
    public final d93<ArrayList<String>> mo17563j() {
        if (C3369n.m14470b() && this.f16667e != null) {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22348I1)).booleanValue()) {
                synchronized (this.f16673k) {
                    d93<ArrayList<String>> d93 = this.f16674l;
                    if (d93 != null) {
                        return d93;
                    }
                    d93<ArrayList<String>> A0 = hm0.f17708a.mo17138A0(new bl0(this));
                    this.f16674l = A0;
                    return A0;
                }
            }
        }
        return s83.m30607i(new ArrayList());
    }

    /* renamed from: k */
    public final Boolean mo17564k() {
        Boolean bool;
        synchronized (this.f16663a) {
            bool = this.f16670h;
        }
        return bool;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public final /* synthetic */ ArrayList mo17565m() throws Exception {
        Context a = dh0.m22514a(this.f16667e);
        ArrayList arrayList = new ArrayList();
        try {
            PackageInfo f = C3334c.m14368a(a).mo11913f(a.getApplicationInfo().packageName, 4096);
            if (f.requestedPermissions != null && f.requestedPermissionsFlags != null) {
                int i = 0;
                while (true) {
                    String[] strArr = f.requestedPermissions;
                    if (i >= strArr.length) {
                        break;
                    }
                    if ((f.requestedPermissionsFlags[i] & 2) != 0) {
                        arrayList.add(strArr[i]);
                    }
                    i++;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* renamed from: n */
    public final void mo17566n() {
        this.f16672j.mo17202a();
    }

    /* renamed from: o */
    public final void mo17567o() {
        this.f16671i.decrementAndGet();
    }

    /* renamed from: p */
    public final void mo17568p() {
        this.f16671i.incrementAndGet();
    }

    @TargetApi(23)
    /* renamed from: q */
    public final void mo17569q(Context context, zzcjf zzcjf) {
        C5688vz vzVar;
        synchronized (this.f16663a) {
            if (!this.f16666d) {
                this.f16667e = context.getApplicationContext();
                this.f16668f = zzcjf;
                C2971s.m13200c().mo21123c(this.f16665c);
                this.f16664b.mo11071P(this.f16667e);
                uf0.m31801d(this.f16667e, this.f16668f);
                C2971s.m13203f();
                if (!a10.f13719c.mo20989e().booleanValue()) {
                    C3018m1.m13388k("CsiReporterFactory: CSI is not enabled. No CSI reporter created.");
                    vzVar = null;
                } else {
                    vzVar = new C5688vz();
                }
                this.f16669g = vzVar;
                if (vzVar != null) {
                    km0.m26271a(new cl0(this).mo10973b(), "AppState.registerCsiReporter");
                }
                this.f16666d = true;
                mo17563j();
            }
        }
        C2971s.m13214q().mo10977L(context, zzcjf.f27376g);
    }

    /* renamed from: r */
    public final void mo17570r(Throwable th, String str) {
        uf0.m31801d(this.f16667e, this.f16668f).mo21259a(th, str, n10.f20449g.mo20989e().floatValue());
    }

    /* renamed from: s */
    public final void mo17571s(Throwable th, String str) {
        uf0.m31801d(this.f16667e, this.f16668f).mo21260b(th, str);
    }

    /* renamed from: t */
    public final void mo17572t(Boolean bool) {
        synchronized (this.f16663a) {
            this.f16670h = bool;
        }
    }
}
