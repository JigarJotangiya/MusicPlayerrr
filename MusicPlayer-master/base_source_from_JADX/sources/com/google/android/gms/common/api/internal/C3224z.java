package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3147a.C3151d;
import com.google.android.gms.common.api.C3161e;
import com.google.android.gms.common.api.C3164f;
import com.google.android.gms.common.api.C3165g;
import com.google.android.gms.common.api.C3230n;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3289k;
import com.google.android.gms.common.internal.C3292l;
import com.google.android.gms.common.internal.p077q.C3307e;
import com.google.android.gms.common.util.C3356a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import p082e.p098e.C3465a;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.z */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3224z<O extends C3147a.C3151d> implements C3164f, C3165g {

    /* renamed from: g */
    private final Queue<C3219w0> f10466g = new LinkedList();
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final C3147a.C3156f f10467h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C3173b<O> f10468i;

    /* renamed from: j */
    private final C3206q f10469j;

    /* renamed from: k */
    private final Set<C3221x0> f10470k = new HashSet();

    /* renamed from: l */
    private final Map<C3187h<?>, C3194k0> f10471l = new HashMap();

    /* renamed from: m */
    private final int f10472m;

    /* renamed from: n */
    private final C3203o0 f10473n;

    /* renamed from: o */
    private boolean f10474o;

    /* renamed from: p */
    private final List<C3171a0> f10475p = new ArrayList();

    /* renamed from: q */
    private ConnectionResult f10476q = null;

    /* renamed from: r */
    private int f10477r = 0;

    /* renamed from: s */
    final /* synthetic */ C3181e f10478s;

    public C3224z(C3181e eVar, C3161e<O> eVar2) {
        this.f10478s = eVar;
        C3147a.C3156f h = eVar2.mo11528h(eVar.f10392v.getLooper(), this);
        this.f10467h = h;
        this.f10468i = eVar2.mo11523c();
        this.f10469j = new C3206q();
        this.f10472m = eVar2.mo11529i();
        if (h.mo11516p()) {
            this.f10473n = eVar2.mo11530j(eVar.f10383m, eVar.f10392v);
        } else {
            this.f10473n = null;
        }
    }

    /* renamed from: I */
    static /* synthetic */ void m13970I(C3224z zVar, C3171a0 a0Var) {
        if (!zVar.f10475p.contains(a0Var) || zVar.f10474o) {
            return;
        }
        if (!zVar.f10467h.mo11511i()) {
            zVar.mo11638A();
        } else {
            zVar.m13980e();
        }
    }

    /* renamed from: J */
    static /* synthetic */ void m13971J(C3224z zVar, C3171a0 a0Var) {
        Feature[] f;
        if (zVar.f10475p.remove(a0Var)) {
            zVar.f10478s.f10392v.removeMessages(15, a0Var);
            zVar.f10478s.f10392v.removeMessages(16, a0Var);
            Feature b = a0Var.f10352b;
            ArrayList arrayList = new ArrayList(zVar.f10466g.size());
            for (C3219w0 w0Var : zVar.f10466g) {
                if ((w0Var instanceof C3188h0) && (f = ((C3188h0) w0Var).mo11590f(zVar)) != null && C3356a.m14426b(f, b)) {
                    arrayList.add(w0Var);
                }
            }
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C3219w0 w0Var2 = (C3219w0) arrayList.get(i);
                zVar.f10466g.remove(w0Var2);
                w0Var2.mo11627b(new C3230n(b));
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m13977b() {
        mo11651u();
        m13988m(ConnectionResult.f10295k);
        m13985j();
        Iterator<C3194k0> it = this.f10471l.values().iterator();
        while (it.hasNext()) {
            C3194k0 next = it.next();
            if (m13989n(next.f10420a.mo11600b()) != null) {
                it.remove();
            } else {
                try {
                    next.f10420a.mo11601c(this.f10467h, new C7471i());
                } catch (DeadObjectException unused) {
                    mo11575z(3);
                    this.f10467h.mo11506d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException unused2) {
                    it.remove();
                }
            }
        }
        m13980e();
        m13986k();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m13978c(int i) {
        mo11651u();
        this.f10474o = true;
        this.f10469j.mo11622d(i, this.f10467h.mo11515n());
        this.f10478s.f10392v.sendMessageDelayed(Message.obtain(this.f10478s.f10392v, 9, this.f10468i), this.f10478s.f10377g);
        this.f10478s.f10392v.sendMessageDelayed(Message.obtain(this.f10478s.f10392v, 11, this.f10468i), this.f10478s.f10378h);
        this.f10478s.f10385o.mo11751c();
        for (C3194k0 k0Var : this.f10471l.values()) {
            k0Var.f10422c.run();
        }
    }

    /* renamed from: d */
    private final boolean m13979d(ConnectionResult connectionResult) {
        synchronized (C3181e.f10376z) {
            if (this.f10478s.f10389s != null) {
                if (this.f10478s.f10390t.contains(this.f10468i)) {
                    this.f10478s.f10389s.mo11637i(connectionResult, this.f10472m);
                    throw null;
                }
            }
        }
        return false;
    }

    /* renamed from: e */
    private final void m13980e() {
        ArrayList arrayList = new ArrayList(this.f10466g);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C3219w0 w0Var = (C3219w0) arrayList.get(i);
            if (this.f10467h.mo11511i()) {
                if (m13981f(w0Var)) {
                    this.f10466g.remove(w0Var);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: f */
    private final boolean m13981f(C3219w0 w0Var) {
        if (!(w0Var instanceof C3188h0)) {
            m13982g(w0Var);
            return true;
        }
        C3188h0 h0Var = (C3188h0) w0Var;
        Feature n = m13989n(h0Var.mo11590f(this));
        if (n == null) {
            m13982g(w0Var);
            return true;
        }
        String name = this.f10467h.getClass().getName();
        String Y = n.mo11455Y();
        long m0 = n.mo11458m0();
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(Y).length());
        sb.append(name);
        sb.append(" could not execute call because it requires feature (");
        sb.append(Y);
        sb.append(", ");
        sb.append(m0);
        sb.append(").");
        Log.w("GoogleApiManager", sb.toString());
        if (!this.f10478s.f10393w || !h0Var.mo11591g(this)) {
            h0Var.mo11627b(new C3230n(n));
            return true;
        }
        C3171a0 a0Var = new C3171a0(this.f10468i, n, (C3214u) null);
        int indexOf = this.f10475p.indexOf(a0Var);
        if (indexOf >= 0) {
            C3171a0 a0Var2 = this.f10475p.get(indexOf);
            this.f10478s.f10392v.removeMessages(15, a0Var2);
            this.f10478s.f10392v.sendMessageDelayed(Message.obtain(this.f10478s.f10392v, 15, a0Var2), this.f10478s.f10377g);
            return false;
        }
        this.f10475p.add(a0Var);
        this.f10478s.f10392v.sendMessageDelayed(Message.obtain(this.f10478s.f10392v, 15, a0Var), this.f10478s.f10377g);
        this.f10478s.f10392v.sendMessageDelayed(Message.obtain(this.f10478s.f10392v, 16, a0Var), this.f10478s.f10378h);
        ConnectionResult connectionResult = new ConnectionResult(2, (PendingIntent) null);
        if (m13979d(connectionResult)) {
            return false;
        }
        this.f10478s.mo11584t(connectionResult, this.f10472m);
        return false;
    }

    /* renamed from: g */
    private final void m13982g(C3219w0 w0Var) {
        w0Var.mo11630c(this.f10469j, mo11641D());
        try {
            w0Var.mo11628d(this);
        } catch (DeadObjectException unused) {
            mo11575z(1);
            this.f10467h.mo11506d("DeadObjectException thrown while running ApiCallRunner.");
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", new Object[]{this.f10467h.getClass().getName()}), th);
        }
    }

    /* renamed from: h */
    private final void m13983h(Status status, Exception exc, boolean z) {
        C3292l.m14235c(this.f10478s.f10392v);
        boolean z2 = false;
        boolean z3 = status == null;
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.f10466g.iterator();
            while (it.hasNext()) {
                C3219w0 w0Var = (C3219w0) it.next();
                if (!z || w0Var.f10458a == 2) {
                    if (status != null) {
                        w0Var.mo11626a(status);
                    } else {
                        w0Var.mo11627b(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw new IllegalArgumentException("Status XOR exception should be null");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final void m13984i(Status status) {
        C3292l.m14235c(this.f10478s.f10392v);
        m13983h(status, (Exception) null, false);
    }

    /* renamed from: j */
    private final void m13985j() {
        if (this.f10474o) {
            this.f10478s.f10392v.removeMessages(11, this.f10468i);
            this.f10478s.f10392v.removeMessages(9, this.f10468i);
            this.f10474o = false;
        }
    }

    /* renamed from: k */
    private final void m13986k() {
        this.f10478s.f10392v.removeMessages(12, this.f10468i);
        this.f10478s.f10392v.sendMessageDelayed(this.f10478s.f10392v.obtainMessage(12, this.f10468i), this.f10478s.f10379i);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final boolean m13987l(boolean z) {
        C3292l.m14235c(this.f10478s.f10392v);
        if (!this.f10467h.mo11511i() || this.f10471l.size() != 0) {
            return false;
        }
        if (this.f10469j.mo11620b()) {
            if (z) {
                m13986k();
            }
            return false;
        }
        this.f10467h.mo11506d("Timing out service connection.");
        return true;
    }

    /* renamed from: m */
    private final void m13988m(ConnectionResult connectionResult) {
        for (C3221x0 b : this.f10470k) {
            b.mo11635b(this.f10468i, connectionResult, C3289k.m14227a(connectionResult, ConnectionResult.f10295k) ? this.f10467h.mo11508f() : null);
        }
        this.f10470k.clear();
    }

    /* renamed from: n */
    private final Feature m13989n(Feature[] featureArr) {
        if (!(featureArr == null || featureArr.length == 0)) {
            Feature[] m = this.f10467h.mo11514m();
            if (m == null) {
                m = new Feature[0];
            }
            C3465a aVar = new C3465a(r3);
            for (Feature feature : m) {
                aVar.put(feature.mo11455Y(), Long.valueOf(feature.mo11458m0()));
            }
            for (Feature feature2 : featureArr) {
                Long l = (Long) aVar.get(feature2.mo11455Y());
                if (l == null || l.longValue() < feature2.mo11458m0()) {
                    return feature2;
                }
            }
        }
        return null;
    }

    /* renamed from: A */
    public final void mo11638A() {
        C3292l.m14235c(this.f10478s.f10392v);
        if (!this.f10467h.mo11511i() && !this.f10467h.mo11507e()) {
            try {
                int a = this.f10478s.f10385o.mo11749a(this.f10478s.f10383m, this.f10467h);
                if (a != 0) {
                    ConnectionResult connectionResult = new ConnectionResult(a, (PendingIntent) null);
                    String name = this.f10467h.getClass().getName();
                    String valueOf = String.valueOf(connectionResult);
                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 35 + String.valueOf(valueOf).length());
                    sb.append("The service for ");
                    sb.append(name);
                    sb.append(" is not available: ");
                    sb.append(valueOf);
                    Log.w("GoogleApiManager", sb.toString());
                    mo11646p(connectionResult, (Exception) null);
                    return;
                }
                C3181e eVar = this.f10478s;
                C3147a.C3156f fVar = this.f10467h;
                C3178c0 c0Var = new C3178c0(eVar, fVar, this.f10468i);
                if (fVar.mo11516p()) {
                    C3203o0 o0Var = this.f10473n;
                    C3292l.m14240h(o0Var);
                    o0Var.mo11616l3(c0Var);
                }
                try {
                    this.f10467h.mo11509g(c0Var);
                } catch (SecurityException e) {
                    mo11646p(new ConnectionResult(10), e);
                }
            } catch (IllegalStateException e2) {
                mo11646p(new ConnectionResult(10), e2);
            }
        }
    }

    /* renamed from: B */
    public final void mo11639B(C3221x0 x0Var) {
        C3292l.m14235c(this.f10478s.f10392v);
        this.f10470k.add(x0Var);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: C */
    public final boolean mo11640C() {
        return this.f10467h.mo11511i();
    }

    /* renamed from: C0 */
    public final void mo11598C0(ConnectionResult connectionResult) {
        mo11646p(connectionResult, (Exception) null);
    }

    /* renamed from: D */
    public final boolean mo11641D() {
        return this.f10467h.mo11516p();
    }

    /* renamed from: E */
    public final int mo11642E() {
        return this.f10472m;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: F */
    public final int mo11643F() {
        return this.f10477r;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: G */
    public final void mo11644G() {
        this.f10477r++;
    }

    /* renamed from: K0 */
    public final void mo11574K0(Bundle bundle) {
        if (Looper.myLooper() == this.f10478s.f10392v.getLooper()) {
            m13977b();
        } else {
            this.f10478s.f10392v.post(new C3216v(this));
        }
    }

    /* renamed from: o */
    public final void mo11645o(ConnectionResult connectionResult) {
        C3292l.m14235c(this.f10478s.f10392v);
        C3147a.C3156f fVar = this.f10467h;
        String name = fVar.getClass().getName();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
        sb.append("onSignInFailed for ");
        sb.append(name);
        sb.append(" with ");
        sb.append(valueOf);
        fVar.mo11506d(sb.toString());
        mo11646p(connectionResult, (Exception) null);
    }

    /* renamed from: p */
    public final void mo11646p(ConnectionResult connectionResult, Exception exc) {
        C3292l.m14235c(this.f10478s.f10392v);
        C3203o0 o0Var = this.f10473n;
        if (o0Var != null) {
            o0Var.mo11617y3();
        }
        mo11651u();
        this.f10478s.f10385o.mo11751c();
        m13988m(connectionResult);
        if ((this.f10467h instanceof C3307e) && connectionResult.mo11443Y() != 24) {
            boolean unused = this.f10478s.f10380j = true;
            this.f10478s.f10392v.sendMessageDelayed(this.f10478s.f10392v.obtainMessage(19), 300000);
        }
        if (connectionResult.mo11443Y() == 4) {
            m13984i(C3181e.f10375y);
        } else if (this.f10466g.isEmpty()) {
            this.f10476q = connectionResult;
        } else if (exc != null) {
            C3292l.m14235c(this.f10478s.f10392v);
            m13983h((Status) null, exc, false);
        } else if (this.f10478s.f10393w) {
            m13983h(C3181e.m13865j(this.f10468i, connectionResult), (Exception) null, true);
            if (!this.f10466g.isEmpty() && !m13979d(connectionResult) && !this.f10478s.mo11584t(connectionResult, this.f10472m)) {
                if (connectionResult.mo11443Y() == 18) {
                    this.f10474o = true;
                }
                if (this.f10474o) {
                    this.f10478s.f10392v.sendMessageDelayed(Message.obtain(this.f10478s.f10392v, 9, this.f10468i), this.f10478s.f10377g);
                } else {
                    m13984i(C3181e.m13865j(this.f10468i, connectionResult));
                }
            }
        } else {
            m13984i(C3181e.m13865j(this.f10468i, connectionResult));
        }
    }

    /* renamed from: q */
    public final void mo11647q(C3219w0 w0Var) {
        C3292l.m14235c(this.f10478s.f10392v);
        if (!this.f10467h.mo11511i()) {
            this.f10466g.add(w0Var);
            ConnectionResult connectionResult = this.f10476q;
            if (connectionResult == null || !connectionResult.mo11448o0()) {
                mo11638A();
            } else {
                mo11646p(this.f10476q, (Exception) null);
            }
        } else if (m13981f(w0Var)) {
            m13986k();
        } else {
            this.f10466g.add(w0Var);
        }
    }

    /* renamed from: r */
    public final void mo11648r() {
        C3292l.m14235c(this.f10478s.f10392v);
        m13984i(C3181e.f10374x);
        this.f10469j.mo11621c();
        for (C3187h v0Var : (C3187h[]) this.f10471l.keySet().toArray(new C3187h[0])) {
            mo11647q(new C3217v0(v0Var, new C7471i()));
        }
        m13988m(new ConnectionResult(4));
        if (this.f10467h.mo11511i()) {
            this.f10467h.mo11510h(new C3222y(this));
        }
    }

    /* renamed from: s */
    public final C3147a.C3156f mo11649s() {
        return this.f10467h;
    }

    /* renamed from: t */
    public final Map<C3187h<?>, C3194k0> mo11650t() {
        return this.f10471l;
    }

    /* renamed from: u */
    public final void mo11651u() {
        C3292l.m14235c(this.f10478s.f10392v);
        this.f10476q = null;
    }

    /* renamed from: v */
    public final ConnectionResult mo11652v() {
        C3292l.m14235c(this.f10478s.f10392v);
        return this.f10476q;
    }

    /* renamed from: w */
    public final void mo11653w() {
        C3292l.m14235c(this.f10478s.f10392v);
        if (this.f10474o) {
            mo11638A();
        }
    }

    /* renamed from: x */
    public final void mo11654x() {
        Status status;
        C3292l.m14235c(this.f10478s.f10392v);
        if (this.f10474o) {
            m13985j();
            if (this.f10478s.f10384n.mo11679g(this.f10478s.f10383m) == 18) {
                status = new Status(21, "Connection timed out waiting for Google Play services update to complete.");
            } else {
                status = new Status(22, "API failed to connect while resuming due to an unknown error.");
            }
            m13984i(status);
            this.f10467h.mo11506d("Timing out connection while resuming.");
        }
    }

    /* renamed from: y */
    public final boolean mo11655y() {
        return m13987l(true);
    }

    /* renamed from: z */
    public final void mo11575z(int i) {
        if (Looper.myLooper() == this.f10478s.f10392v.getLooper()) {
            m13978c(i);
        } else {
            this.f10478s.f10392v.post(new C3218w(this, i));
        }
    }
}
