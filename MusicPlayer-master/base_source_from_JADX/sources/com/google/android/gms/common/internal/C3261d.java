package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.C3237c;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.common.internal.d */
/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
public abstract class C3261d<T extends IInterface> {

    /* renamed from: D */
    private static final Feature[] f10583D = new Feature[0];
    /* access modifiers changed from: private */

    /* renamed from: A */
    public boolean f10584A;

    /* renamed from: B */
    private volatile zzi f10585B;
    @RecentlyNonNull

    /* renamed from: C */
    protected AtomicInteger f10586C;

    /* renamed from: g */
    private volatile String f10587g;

    /* renamed from: h */
    C3275f1 f10588h;

    /* renamed from: i */
    private final Context f10589i;

    /* renamed from: j */
    private final C3276g f10590j;

    /* renamed from: k */
    private final C3237c f10591k;

    /* renamed from: l */
    final Handler f10592l;

    /* renamed from: m */
    private final Object f10593m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Object f10594n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C3286j f10595o;
    @RecentlyNonNull

    /* renamed from: p */
    protected C3264c f10596p;

    /* renamed from: q */
    private T f10597q;
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final ArrayList<C3302p0<?>> f10598r;

    /* renamed from: s */
    private C3310r0 f10599s;

    /* renamed from: t */
    private int f10600t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public final C3262a f10601u;
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final C3263b f10602v;

    /* renamed from: w */
    private final int f10603w;

    /* renamed from: x */
    private final String f10604x;

    /* renamed from: y */
    private volatile String f10605y;
    /* access modifiers changed from: private */

    /* renamed from: z */
    public ConnectionResult f10606z;

    /* renamed from: com.google.android.gms.common.internal.d$a */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface C3262a {
        /* renamed from: K0 */
        void mo11813K0(Bundle bundle);

        /* renamed from: z */
        void mo11814z(int i);
    }

    /* renamed from: com.google.android.gms.common.internal.d$b */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface C3263b {
        /* renamed from: C0 */
        void mo11815C0(@RecentlyNonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$c */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface C3264c {
        /* renamed from: a */
        void mo11571a(@RecentlyNonNull ConnectionResult connectionResult);
    }

    /* renamed from: com.google.android.gms.common.internal.d$d */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    protected class C3265d implements C3264c {
        public C3265d() {
        }

        /* renamed from: a */
        public final void mo11571a(@RecentlyNonNull ConnectionResult connectionResult) {
            if (connectionResult.mo11450v0()) {
                C3261d dVar = C3261d.this;
                dVar.mo11790b((C3279h) null, dVar.mo11771B());
            } else if (C3261d.this.f10602v != null) {
                C3261d.this.f10602v.mo11815C0(connectionResult);
            }
        }
    }

    /* renamed from: com.google.android.gms.common.internal.d$e */
    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    public interface C3266e {
        /* renamed from: a */
        void mo11636a();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected C3261d(@androidx.annotation.RecentlyNonNull android.content.Context r10, @androidx.annotation.RecentlyNonNull android.os.Looper r11, int r12, com.google.android.gms.common.internal.C3261d.C3262a r13, com.google.android.gms.common.internal.C3261d.C3263b r14, java.lang.String r15) {
        /*
            r9 = this;
            com.google.android.gms.common.internal.g r3 = com.google.android.gms.common.internal.C3276g.m14204b(r10)
            com.google.android.gms.common.c r4 = com.google.android.gms.common.C3237c.m14031f()
            com.google.android.gms.common.internal.C3292l.m14240h(r13)
            com.google.android.gms.common.internal.C3292l.m14240h(r14)
            r0 = r9
            r1 = r10
            r2 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r8 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.internal.C3261d.<init>(android.content.Context, android.os.Looper, int, com.google.android.gms.common.internal.d$a, com.google.android.gms.common.internal.d$b, java.lang.String):void");
    }

    /* renamed from: U */
    static /* synthetic */ void m14114U(C3261d dVar, int i) {
        int i2;
        int i3;
        synchronized (dVar.f10593m) {
            i2 = dVar.f10600t;
        }
        if (i2 == 3) {
            dVar.f10584A = true;
            i3 = 5;
        } else {
            i3 = 4;
        }
        Handler handler = dVar.f10592l;
        handler.sendMessage(handler.obtainMessage(i3, dVar.f10586C.get(), 16));
    }

    /* renamed from: Y */
    static /* synthetic */ boolean m14118Y(C3261d dVar) {
        if (dVar.f10584A || TextUtils.isEmpty(dVar.mo11773D()) || TextUtils.isEmpty(dVar.mo11770A())) {
            return false;
        }
        try {
            Class.forName(dVar.mo11773D());
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d0 */
    static /* synthetic */ boolean m14123d0(C3261d dVar, int i, int i2, IInterface iInterface) {
        synchronized (dVar.f10593m) {
            if (dVar.f10600t != i) {
                return false;
            }
            dVar.m14127h0(i2, iInterface);
            return true;
        }
    }

    /* renamed from: g0 */
    static /* synthetic */ void m14126g0(C3261d dVar, zzi zzi) {
        dVar.f10585B = zzi;
        if (dVar.mo11787R()) {
            ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzi.f10696j;
            C3294m.m14245b().mo11859c(connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.mo11735z0());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h0 */
    public final void m14127h0(int i, T t) {
        C3275f1 f1Var;
        String str;
        C3275f1 f1Var2;
        boolean z = false;
        if ((i == 4) == (t != null)) {
            z = true;
        }
        C3292l.m14233a(z);
        synchronized (this.f10593m) {
            this.f10600t = i;
            this.f10597q = t;
            if (i == 1) {
                C3310r0 r0Var = this.f10599s;
                if (r0Var != null) {
                    C3276g gVar = this.f10590j;
                    String a = this.f10588h.mo11837a();
                    C3292l.m14240h(a);
                    gVar.mo11841c(a, this.f10588h.mo11838b(), this.f10588h.mo11839c(), r0Var, mo11788S(), this.f10588h.mo11840d());
                    this.f10599s = null;
                }
            } else if (i == 2 || i == 3) {
                C3310r0 r0Var2 = this.f10599s;
                if (!(r0Var2 == null || (f1Var2 = this.f10588h) == null)) {
                    String a2 = f1Var2.mo11837a();
                    String b = this.f10588h.mo11838b();
                    StringBuilder sb = new StringBuilder(String.valueOf(a2).length() + 70 + String.valueOf(b).length());
                    sb.append("Calling connect() while still connected, missing disconnect() for ");
                    sb.append(a2);
                    sb.append(" on ");
                    sb.append(b);
                    Log.e("GmsClient", sb.toString());
                    C3276g gVar2 = this.f10590j;
                    String a3 = this.f10588h.mo11837a();
                    C3292l.m14240h(a3);
                    gVar2.mo11841c(a3, this.f10588h.mo11838b(), this.f10588h.mo11839c(), r0Var2, mo11788S(), this.f10588h.mo11840d());
                    this.f10586C.incrementAndGet();
                }
                C3310r0 r0Var3 = new C3310r0(this, this.f10586C.get());
                this.f10599s = r0Var3;
                if (this.f10600t != 3 || mo11770A() == null) {
                    f1Var = new C3275f1(mo11775F(), mo11774E(), false, C3276g.m14203a(), mo11777H());
                } else {
                    f1Var = new C3275f1(mo11810x().getPackageName(), mo11770A(), true, C3276g.m14203a(), false);
                }
                this.f10588h = f1Var;
                if (!f1Var.mo11840d() || mo11799l() >= 17895000) {
                    C3276g gVar3 = this.f10590j;
                    String a4 = this.f10588h.mo11837a();
                    C3292l.m14240h(a4);
                    if (!gVar3.mo11768d(new C3327y0(a4, this.f10588h.mo11838b(), this.f10588h.mo11839c(), this.f10588h.mo11840d()), r0Var3, mo11788S())) {
                        String a5 = this.f10588h.mo11837a();
                        String b2 = this.f10588h.mo11838b();
                        StringBuilder sb2 = new StringBuilder(String.valueOf(a5).length() + 34 + String.valueOf(b2).length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(a5);
                        sb2.append(" on ");
                        sb2.append(b2);
                        Log.e("GmsClient", sb2.toString());
                        mo11789T(16, (Bundle) null, this.f10586C.get());
                    }
                } else {
                    String valueOf = String.valueOf(this.f10588h.mo11837a());
                    if (valueOf.length() != 0) {
                        str = "Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(valueOf);
                    } else {
                        str = new String("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ");
                    }
                    throw new IllegalStateException(str);
                }
            } else if (i == 4) {
                C3292l.m14240h(t);
                mo11779J(t);
            }
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: A */
    public String mo11770A() {
        return null;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: B */
    public Set<Scope> mo11771B() {
        return Collections.emptySet();
    }

    @RecentlyNonNull
    /* renamed from: C */
    public final T mo11772C() throws DeadObjectException {
        T t;
        synchronized (this.f10593m) {
            if (this.f10600t != 5) {
                mo11804r();
                t = this.f10597q;
                C3292l.m14241i(t, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract String mo11773D();

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public abstract String mo11774E();

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: F */
    public String mo11775F() {
        return "com.google.android.gms";
    }

    @RecentlyNullable
    /* renamed from: G */
    public ConnectionTelemetryConfiguration mo11776G() {
        zzi zzi = this.f10585B;
        if (zzi == null) {
            return null;
        }
        return zzi.f10696j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: H */
    public boolean mo11777H() {
        return false;
    }

    /* renamed from: I */
    public boolean mo11778I() {
        return this.f10585B != null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public void mo11779J(@RecentlyNonNull T t) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: K */
    public void mo11780K(@RecentlyNonNull ConnectionResult connectionResult) {
        connectionResult.mo11443Y();
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: L */
    public void mo11781L(int i) {
        System.currentTimeMillis();
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo11782M(int i, IBinder iBinder, Bundle bundle, int i2) {
        Handler handler = this.f10592l;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new C3312s0(this, i, iBinder, bundle)));
    }

    /* renamed from: N */
    public boolean mo11783N() {
        return false;
    }

    /* renamed from: O */
    public void mo11784O(@RecentlyNonNull String str) {
        this.f10605y = str;
    }

    /* renamed from: P */
    public void mo11785P(int i) {
        Handler handler = this.f10592l;
        handler.sendMessage(handler.obtainMessage(6, this.f10586C.get(), i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo11786Q(@RecentlyNonNull C3264c cVar, int i, PendingIntent pendingIntent) {
        C3292l.m14241i(cVar, "Connection progress callbacks cannot be null.");
        this.f10596p = cVar;
        Handler handler = this.f10592l;
        handler.sendMessage(handler.obtainMessage(3, this.f10586C.get(), i, pendingIntent));
    }

    /* renamed from: R */
    public boolean mo11787R() {
        return false;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: S */
    public final String mo11788S() {
        String str = this.f10604x;
        return str == null ? this.f10589i.getClass().getName() : str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: T */
    public final void mo11789T(int i, Bundle bundle, int i2) {
        Handler handler = this.f10592l;
        handler.sendMessage(handler.obtainMessage(7, i2, -1, new C3317t0(this, i, (Bundle) null)));
    }

    /* renamed from: b */
    public void mo11790b(C3279h hVar, @RecentlyNonNull Set<Scope> set) {
        Bundle z = mo11812z();
        GetServiceRequest getServiceRequest = new GetServiceRequest(this.f10603w, this.f10605y);
        getServiceRequest.f10541j = this.f10589i.getPackageName();
        getServiceRequest.f10544m = z;
        if (set != null) {
            getServiceRequest.f10543l = (Scope[]) set.toArray(new Scope[set.size()]);
        }
        if (mo11802p()) {
            Account u = mo11807u();
            if (u == null) {
                u = new Account("<<default account>>", "com.google");
            }
            getServiceRequest.f10545n = u;
            if (hVar != null) {
                getServiceRequest.f10542k = hVar.asBinder();
            }
        } else if (mo11783N()) {
            getServiceRequest.f10545n = mo11807u();
        }
        getServiceRequest.f10546o = f10583D;
        getServiceRequest.f10547p = mo11808v();
        if (mo11787R()) {
            getServiceRequest.f10550s = true;
        }
        try {
            synchronized (this.f10594n) {
                C3286j jVar = this.f10595o;
                if (jVar != null) {
                    jVar.mo11854H1(new C3308q0(this, this.f10586C.get()), getServiceRequest);
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            mo11785P(3);
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            mo11782M(8, (IBinder) null, (Bundle) null, this.f10586C.get());
        }
    }

    /* renamed from: c */
    public void mo11791c() {
        this.f10586C.incrementAndGet();
        synchronized (this.f10598r) {
            int size = this.f10598r.size();
            for (int i = 0; i < size; i++) {
                this.f10598r.get(i).mo11872e();
            }
            this.f10598r.clear();
        }
        synchronized (this.f10594n) {
            this.f10595o = null;
        }
        m14127h0(1, (IInterface) null);
    }

    /* renamed from: d */
    public void mo11792d(@RecentlyNonNull String str) {
        this.f10587g = str;
        mo11791c();
    }

    /* renamed from: e */
    public boolean mo11793e() {
        boolean z;
        synchronized (this.f10593m) {
            int i = this.f10600t;
            z = true;
            if (i != 2) {
                if (i != 3) {
                    z = false;
                }
            }
        }
        return z;
    }

    @RecentlyNonNull
    /* renamed from: f */
    public String mo11794f() {
        C3275f1 f1Var;
        if (mo11797i() && (f1Var = this.f10588h) != null) {
            return f1Var.mo11838b();
        }
        throw new RuntimeException("Failed to connect when checking package");
    }

    /* renamed from: g */
    public void mo11795g(@RecentlyNonNull C3264c cVar) {
        C3292l.m14241i(cVar, "Connection progress callbacks cannot be null.");
        this.f10596p = cVar;
        m14127h0(2, (IInterface) null);
    }

    /* renamed from: h */
    public void mo11796h(@RecentlyNonNull C3266e eVar) {
        eVar.mo11636a();
    }

    /* renamed from: i */
    public boolean mo11797i() {
        boolean z;
        synchronized (this.f10593m) {
            z = this.f10600t == 4;
        }
        return z;
    }

    /* renamed from: j */
    public boolean mo11798j() {
        return true;
    }

    /* renamed from: l */
    public int mo11799l() {
        return C3237c.f10485a;
    }

    @RecentlyNullable
    /* renamed from: m */
    public final Feature[] mo11800m() {
        zzi zzi = this.f10585B;
        if (zzi == null) {
            return null;
        }
        return zzi.f10694h;
    }

    @RecentlyNullable
    /* renamed from: n */
    public String mo11801n() {
        return this.f10587g;
    }

    /* renamed from: p */
    public boolean mo11802p() {
        return false;
    }

    /* renamed from: q */
    public void mo11803q() {
        int h = this.f10591k.mo11680h(this.f10589i, mo11799l());
        if (h != 0) {
            m14127h0(1, (IInterface) null);
            mo11786Q(new C3265d(), h, (PendingIntent) null);
            return;
        }
        mo11795g(new C3265d());
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo11804r() {
        if (!mo11797i()) {
            throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }

    /* access modifiers changed from: protected */
    @RecentlyNullable
    /* renamed from: s */
    public abstract T mo11805s(@RecentlyNonNull IBinder iBinder);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public boolean mo11806t() {
        return false;
    }

    @RecentlyNullable
    /* renamed from: u */
    public Account mo11807u() {
        return null;
    }

    @RecentlyNonNull
    /* renamed from: v */
    public Feature[] mo11808v() {
        return f10583D;
    }

    @RecentlyNullable
    /* renamed from: w */
    public Bundle mo11809w() {
        return null;
    }

    @RecentlyNonNull
    /* renamed from: x */
    public final Context mo11810x() {
        return this.f10589i;
    }

    /* renamed from: y */
    public int mo11811y() {
        return this.f10603w;
    }

    /* access modifiers changed from: protected */
    @RecentlyNonNull
    /* renamed from: z */
    public Bundle mo11812z() {
        return new Bundle();
    }

    protected C3261d(@RecentlyNonNull Context context, @RecentlyNonNull Looper looper, @RecentlyNonNull C3276g gVar, @RecentlyNonNull C3237c cVar, int i, C3262a aVar, C3263b bVar, String str) {
        this.f10587g = null;
        this.f10593m = new Object();
        this.f10594n = new Object();
        this.f10598r = new ArrayList<>();
        this.f10600t = 1;
        this.f10606z = null;
        this.f10584A = false;
        this.f10585B = null;
        this.f10586C = new AtomicInteger(0);
        C3292l.m14241i(context, "Context must not be null");
        this.f10589i = context;
        C3292l.m14241i(looper, "Looper must not be null");
        C3292l.m14241i(gVar, "Supervisor must not be null");
        this.f10590j = gVar;
        C3292l.m14241i(cVar, "API availability must not be null");
        this.f10591k = cVar;
        this.f10592l = new C3299o0(this, looper);
        this.f10603w = i;
        this.f10601u = aVar;
        this.f10602v = bVar;
        this.f10604x = str;
    }
}
