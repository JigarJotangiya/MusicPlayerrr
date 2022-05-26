package com.google.android.gms.common.api.internal;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.C3235b;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.C3147a;
import com.google.android.gms.common.api.C3161e;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.C3253a0;
import com.google.android.gms.common.internal.C3294m;
import com.google.android.gms.common.internal.C3296n;
import com.google.android.gms.common.internal.C3298o;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.util.C3363h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import p082e.p098e.C3467b;
import p159f.p243f.p245b.p246a.p293c.p296c.C7444f;
import p159f.p243f.p245b.p246a.p303f.C7470h;
import p159f.p243f.p245b.p246a.p303f.C7471i;

/* renamed from: com.google.android.gms.common.api.internal.e */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public class C3181e implements Handler.Callback {

    /* renamed from: A */
    private static C3181e f10373A;
    @RecentlyNonNull

    /* renamed from: x */
    public static final Status f10374x = new Status(4, "Sign-out occurred while this API call was in progress.");
    /* access modifiers changed from: private */

    /* renamed from: y */
    public static final Status f10375y = new Status(4, "The user must be signed in to make this API call.");
    /* access modifiers changed from: private */

    /* renamed from: z */
    public static final Object f10376z = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f10377g = 5000;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f10378h = 120000;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public long f10379i = 10000;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public boolean f10380j = false;

    /* renamed from: k */
    private TelemetryData f10381k;

    /* renamed from: l */
    private C3298o f10382l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public final Context f10383m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final C3235b f10384n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final C3253a0 f10385o;

    /* renamed from: p */
    private final AtomicInteger f10386p = new AtomicInteger(1);

    /* renamed from: q */
    private final AtomicInteger f10387q = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: r */
    public final Map<C3173b<?>, C3224z<?>> f10388r = new ConcurrentHashMap(5, 0.75f, 1);
    /* access modifiers changed from: private */

    /* renamed from: s */
    public C3208r f10389s;
    /* access modifiers changed from: private */

    /* renamed from: t */
    public final Set<C3173b<?>> f10390t = new C3467b();

    /* renamed from: u */
    private final Set<C3173b<?>> f10391u = new C3467b();
    /* access modifiers changed from: private */

    /* renamed from: v */
    public final Handler f10392v;
    /* access modifiers changed from: private */

    /* renamed from: w */
    public volatile boolean f10393w = true;

    private C3181e(Context context, Looper looper, C3235b bVar) {
        this.f10383m = context;
        C7444f fVar = new C7444f(looper, this);
        this.f10392v = fVar;
        this.f10384n = bVar;
        this.f10385o = new C3253a0(bVar);
        if (C3363h.m14451a(context)) {
            this.f10393w = false;
        }
        fVar.sendMessage(fVar.obtainMessage(6));
    }

    /* renamed from: h */
    private final C3224z<?> m13863h(C3161e<?> eVar) {
        C3173b<?> c = eVar.mo11523c();
        C3224z<?> zVar = this.f10388r.get(c);
        if (zVar == null) {
            zVar = new C3224z<>(this, eVar);
            this.f10388r.put(c, zVar);
        }
        if (zVar.mo11641D()) {
            this.f10391u.add(c);
        }
        zVar.mo11638A();
        return zVar;
    }

    /* renamed from: i */
    private final <T> void m13864i(C7471i<T> iVar, int i, C3161e eVar) {
        C3182e0 b;
        if (i != 0 && (b = C3182e0.m13882b(this, i, eVar.mo11523c())) != null) {
            C7470h<T> a = iVar.mo28352a();
            Handler handler = this.f10392v;
            handler.getClass();
            a.mo28333c(C3212t.m13944a(handler), b);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static Status m13865j(C3173b<?> bVar, ConnectionResult connectionResult) {
        String b = bVar.mo11552b();
        String valueOf = String.valueOf(connectionResult);
        StringBuilder sb = new StringBuilder(String.valueOf(b).length() + 63 + String.valueOf(valueOf).length());
        sb.append("API: ");
        sb.append(b);
        sb.append(" is not available on this device. Connection failed with: ");
        sb.append(valueOf);
        return new Status(connectionResult, sb.toString());
    }

    /* renamed from: k */
    private final void m13866k() {
        TelemetryData telemetryData = this.f10381k;
        if (telemetryData != null) {
            if (telemetryData.mo11745Y() > 0 || mo11583s()) {
                m13867l().mo11864b(telemetryData);
            }
            this.f10381k = null;
        }
    }

    /* renamed from: l */
    private final C3298o m13867l() {
        if (this.f10382l == null) {
            this.f10382l = C3296n.m14248a(this.f10383m);
        }
        return this.f10382l;
    }

    @RecentlyNonNull
    /* renamed from: m */
    public static C3181e m13868m(@RecentlyNonNull Context context) {
        C3181e eVar;
        synchronized (f10376z) {
            if (f10373A == null) {
                HandlerThread handlerThread = new HandlerThread("GoogleApiHandler", 9);
                handlerThread.start();
                f10373A = new C3181e(context.getApplicationContext(), handlerThread.getLooper(), C3235b.m14015l());
            }
            eVar = f10373A;
        }
        return eVar;
    }

    public final boolean handleMessage(@RecentlyNonNull Message message) {
        int i = message.what;
        long j = 300000;
        C3224z zVar = null;
        switch (i) {
            case 1:
                if (true == ((Boolean) message.obj).booleanValue()) {
                    j = 10000;
                }
                this.f10379i = j;
                this.f10392v.removeMessages(12);
                for (C3173b<?> obtainMessage : this.f10388r.keySet()) {
                    Handler handler = this.f10392v;
                    handler.sendMessageDelayed(handler.obtainMessage(12, obtainMessage), this.f10379i);
                }
                break;
            case 2:
                C3221x0 x0Var = (C3221x0) message.obj;
                Iterator<C3173b<?>> it = x0Var.mo11634a().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    } else {
                        C3173b next = it.next();
                        C3224z zVar2 = this.f10388r.get(next);
                        if (zVar2 == null) {
                            x0Var.mo11635b(next, new ConnectionResult(13), (String) null);
                            break;
                        } else if (zVar2.mo11640C()) {
                            x0Var.mo11635b(next, ConnectionResult.f10295k, zVar2.mo11649s().mo11508f());
                        } else {
                            ConnectionResult v = zVar2.mo11652v();
                            if (v != null) {
                                x0Var.mo11635b(next, v, (String) null);
                            } else {
                                zVar2.mo11639B(x0Var);
                                zVar2.mo11638A();
                            }
                        }
                    }
                }
            case 3:
                for (C3224z next2 : this.f10388r.values()) {
                    next2.mo11651u();
                    next2.mo11638A();
                }
                break;
            case 4:
            case 8:
            case 13:
                C3192j0 j0Var = (C3192j0) message.obj;
                C3224z<?> zVar3 = this.f10388r.get(j0Var.f10419c.mo11523c());
                if (zVar3 == null) {
                    zVar3 = m13863h(j0Var.f10419c);
                }
                if (zVar3.mo11641D() && this.f10387q.get() != j0Var.f10418b) {
                    j0Var.f10417a.mo11626a(f10374x);
                    zVar3.mo11648r();
                    break;
                } else {
                    zVar3.mo11647q(j0Var.f10417a);
                    break;
                }
                break;
            case 5:
                int i2 = message.arg1;
                ConnectionResult connectionResult = (ConnectionResult) message.obj;
                Iterator<C3224z<?>> it2 = this.f10388r.values().iterator();
                while (true) {
                    if (it2.hasNext()) {
                        C3224z next3 = it2.next();
                        if (next3.mo11642E() == i2) {
                            zVar = next3;
                        }
                    }
                }
                if (zVar != null) {
                    if (connectionResult.mo11443Y() != 13) {
                        zVar.m13984i(m13865j(zVar.f10468i, connectionResult));
                        break;
                    } else {
                        String e = this.f10384n.mo11678e(connectionResult.mo11443Y());
                        String m0 = connectionResult.mo11446m0();
                        StringBuilder sb = new StringBuilder(String.valueOf(e).length() + 69 + String.valueOf(m0).length());
                        sb.append("Error resolution was canceled by the user, original error message: ");
                        sb.append(e);
                        sb.append(": ");
                        sb.append(m0);
                        zVar.m13984i(new Status(17, sb.toString()));
                        break;
                    }
                } else {
                    StringBuilder sb2 = new StringBuilder(76);
                    sb2.append("Could not find API instance ");
                    sb2.append(i2);
                    sb2.append(" while trying to fail enqueued calls.");
                    Log.wtf("GoogleApiManager", sb2.toString(), new Exception());
                    break;
                }
            case 6:
                if (this.f10383m.getApplicationContext() instanceof Application) {
                    C3176c.m13835c((Application) this.f10383m.getApplicationContext());
                    C3176c.m13834b().mo11557a(new C3214u(this));
                    if (!C3176c.m13834b().mo11559e(true)) {
                        this.f10379i = 300000;
                        break;
                    }
                }
                break;
            case 7:
                m13863h((C3161e) message.obj);
                break;
            case 9:
                if (this.f10388r.containsKey(message.obj)) {
                    this.f10388r.get(message.obj).mo11653w();
                    break;
                }
                break;
            case 10:
                for (C3173b<?> remove : this.f10391u) {
                    C3224z remove2 = this.f10388r.remove(remove);
                    if (remove2 != null) {
                        remove2.mo11648r();
                    }
                }
                this.f10391u.clear();
                break;
            case 11:
                if (this.f10388r.containsKey(message.obj)) {
                    this.f10388r.get(message.obj).mo11654x();
                    break;
                }
                break;
            case 12:
                if (this.f10388r.containsKey(message.obj)) {
                    this.f10388r.get(message.obj).mo11655y();
                    break;
                }
                break;
            case 14:
                C3210s sVar = (C3210s) message.obj;
                C3173b<?> a = sVar.mo11623a();
                if (this.f10388r.containsKey(a)) {
                    sVar.mo11624b().mo28354c(Boolean.valueOf(this.f10388r.get(a).m13987l(false)));
                    break;
                } else {
                    sVar.mo11624b().mo28354c(Boolean.FALSE);
                    break;
                }
            case 15:
                C3171a0 a0Var = (C3171a0) message.obj;
                if (this.f10388r.containsKey(a0Var.f10351a)) {
                    C3224z.m13970I(this.f10388r.get(a0Var.f10351a), a0Var);
                    break;
                }
                break;
            case 16:
                C3171a0 a0Var2 = (C3171a0) message.obj;
                if (this.f10388r.containsKey(a0Var2.f10351a)) {
                    C3224z.m13971J(this.f10388r.get(a0Var2.f10351a), a0Var2);
                    break;
                }
                break;
            case 17:
                m13866k();
                break;
            case 18:
                C3184f0 f0Var = (C3184f0) message.obj;
                if (f0Var.f10400c != 0) {
                    TelemetryData telemetryData = this.f10381k;
                    if (telemetryData != null) {
                        List<MethodInvocation> m02 = telemetryData.mo11746m0();
                        if (this.f10381k.mo11745Y() != f0Var.f10399b || (m02 != null && m02.size() >= f0Var.f10401d)) {
                            this.f10392v.removeMessages(17);
                            m13866k();
                        } else {
                            this.f10381k.mo11747n0(f0Var.f10398a);
                        }
                    }
                    if (this.f10381k == null) {
                        ArrayList arrayList = new ArrayList();
                        arrayList.add(f0Var.f10398a);
                        this.f10381k = new TelemetryData(f0Var.f10399b, arrayList);
                        Handler handler2 = this.f10392v;
                        handler2.sendMessageDelayed(handler2.obtainMessage(17), f0Var.f10400c);
                        break;
                    }
                } else {
                    m13867l().mo11864b(new TelemetryData(f0Var.f10399b, Arrays.asList(new MethodInvocation[]{f0Var.f10398a})));
                    break;
                }
                break;
            case 19:
                this.f10380j = false;
                break;
            default:
                StringBuilder sb3 = new StringBuilder(31);
                sb3.append("Unknown message id: ");
                sb3.append(i);
                Log.w("GoogleApiManager", sb3.toString());
                return false;
        }
        return true;
    }

    /* renamed from: n */
    public final int mo11578n() {
        return this.f10386p.getAndIncrement();
    }

    /* renamed from: o */
    public final void mo11579o(@RecentlyNonNull C3161e<?> eVar) {
        Handler handler = this.f10392v;
        handler.sendMessage(handler.obtainMessage(7, eVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: p */
    public final C3224z mo11580p(C3173b<?> bVar) {
        return this.f10388r.get(bVar);
    }

    /* renamed from: q */
    public final void mo11581q() {
        Handler handler = this.f10392v;
        handler.sendMessage(handler.obtainMessage(3));
    }

    /* renamed from: r */
    public final <O extends C3147a.C3151d, ResultT> void mo11582r(@RecentlyNonNull C3161e<O> eVar, int i, @RecentlyNonNull C3199n<C3147a.C3149b, ResultT> nVar, @RecentlyNonNull C7471i<ResultT> iVar, @RecentlyNonNull C3197m mVar) {
        m13864i(iVar, nVar.mo11609e(), eVar);
        C3215u0 u0Var = new C3215u0(i, nVar, iVar, mVar);
        Handler handler = this.f10392v;
        handler.sendMessage(handler.obtainMessage(4, new C3192j0(u0Var, this.f10387q.get(), eVar)));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean mo11583s() {
        if (this.f10380j) {
            return false;
        }
        RootTelemetryConfiguration a = C3294m.m14245b().mo11858a();
        if (a != null && !a.mo11741n0()) {
            return false;
        }
        int b = this.f10385o.mo11750b(this.f10383m, 203390000);
        if (b == -1 || b == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t */
    public final boolean mo11584t(ConnectionResult connectionResult, int i) {
        return this.f10384n.mo11687p(this.f10383m, connectionResult, i);
    }

    /* renamed from: u */
    public final void mo11585u(@RecentlyNonNull ConnectionResult connectionResult, int i) {
        if (!mo11584t(connectionResult, i)) {
            Handler handler = this.f10392v;
            handler.sendMessage(handler.obtainMessage(5, i, 0, connectionResult));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo11586v(MethodInvocation methodInvocation, int i, long j, int i2) {
        Handler handler = this.f10392v;
        handler.sendMessage(handler.obtainMessage(18, new C3184f0(methodInvocation, i, j, i2)));
    }
}
