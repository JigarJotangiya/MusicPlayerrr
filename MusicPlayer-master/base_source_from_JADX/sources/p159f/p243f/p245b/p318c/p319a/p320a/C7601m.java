package p159f.p243f.p245b.p318c.p319a.p320a;

import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import p159f.p243f.p245b.p318c.p319a.p323d.C7632e;
import p159f.p243f.p245b.p318c.p319a.p323d.C7643p;

/* renamed from: f.f.b.c.a.a.m */
/* compiled from: com.google.android.play:core@@1.10.2 */
public final class C7601m<T extends IInterface> {

    /* renamed from: o */
    private static final Map<String, Handler> f32961o = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final Context f32962a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final C7577a f32963b;

    /* renamed from: c */
    private final String f32964c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final List<C7579b> f32965d = new ArrayList();

    /* renamed from: e */
    private final Set<C7643p<?>> f32966e = new HashSet();

    /* renamed from: f */
    private final Object f32967f = new Object();
    /* access modifiers changed from: private */

    /* renamed from: g */
    public boolean f32968g;

    /* renamed from: h */
    private final Intent f32969h;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final C7591h<T> f32970i;

    /* renamed from: j */
    private final WeakReference<C7589g> f32971j;

    /* renamed from: k */
    private final IBinder.DeathRecipient f32972k = new C7581c(this);

    /* renamed from: l */
    private final AtomicInteger f32973l = new AtomicInteger(0);
    /* access modifiers changed from: private */

    /* renamed from: m */
    public ServiceConnection f32974m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public T f32975n;

    public C7601m(Context context, C7577a aVar, String str, Intent intent, C7591h<T> hVar, C7589g gVar) {
        this.f32962a = context;
        this.f32963b = aVar;
        this.f32964c = str;
        this.f32969h = intent;
        this.f32970i = hVar;
        this.f32971j = new WeakReference<>((Object) null);
    }

    /* renamed from: i */
    public static /* synthetic */ void m42370i(C7601m mVar) {
        mVar.f32963b.mo28577d("reportBinderDeath", new Object[0]);
        C7589g gVar = (C7589g) mVar.f32971j.get();
        if (gVar != null) {
            mVar.f32963b.mo28577d("calling onBinderDied", new Object[0]);
            gVar.zza();
        } else {
            mVar.f32963b.mo28577d("%s : Binder has died.", mVar.f32964c);
            for (C7579b c : mVar.f32965d) {
                c.mo28580c(mVar.m42378t());
            }
            mVar.f32965d.clear();
        }
        mVar.m42379u();
    }

    /* renamed from: n */
    static /* bridge */ /* synthetic */ void m42375n(C7601m mVar, C7579b bVar) {
        if (mVar.f32975n == null && !mVar.f32968g) {
            mVar.f32963b.mo28577d("Initiate binding to the service.", new Object[0]);
            mVar.f32965d.add(bVar);
            C7599l lVar = new C7599l(mVar, (C7597k) null);
            mVar.f32974m = lVar;
            mVar.f32968g = true;
            if (!mVar.f32962a.bindService(mVar.f32969h, lVar, 1)) {
                mVar.f32963b.mo28577d("Failed to bind to the service.", new Object[0]);
                mVar.f32968g = false;
                for (C7579b c : mVar.f32965d) {
                    c.mo28580c(new C7603n());
                }
                mVar.f32965d.clear();
            }
        } else if (mVar.f32968g) {
            mVar.f32963b.mo28577d("Waiting to bind to the service.", new Object[0]);
            mVar.f32965d.add(bVar);
        } else {
            bVar.run();
        }
    }

    /* renamed from: o */
    static /* bridge */ /* synthetic */ void m42376o(C7601m mVar) {
        mVar.f32963b.mo28577d("linkToDeath", new Object[0]);
        try {
            mVar.f32975n.asBinder().linkToDeath(mVar.f32972k, 0);
        } catch (RemoteException e) {
            mVar.f32963b.mo28576c(e, "linkToDeath failed", new Object[0]);
        }
    }

    /* renamed from: p */
    static /* bridge */ /* synthetic */ void m42377p(C7601m mVar) {
        mVar.f32963b.mo28577d("unlinkToDeath", new Object[0]);
        mVar.f32975n.asBinder().unlinkToDeath(mVar.f32972k, 0);
    }

    /* renamed from: t */
    private final RemoteException m42378t() {
        if (Build.VERSION.SDK_INT < 15) {
            return new RemoteException();
        }
        return new RemoteException(String.valueOf(this.f32964c).concat(" : Binder has died."));
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public final void m42379u() {
        synchronized (this.f32967f) {
            for (C7643p<?> d : this.f32966e) {
                d.mo28635d(m42378t());
            }
            this.f32966e.clear();
        }
    }

    /* renamed from: c */
    public final Handler mo28602c() {
        Handler handler;
        Map<String, Handler> map = f32961o;
        synchronized (map) {
            if (!map.containsKey(this.f32964c)) {
                HandlerThread handlerThread = new HandlerThread(this.f32964c, 10);
                handlerThread.start();
                map.put(this.f32964c, new Handler(handlerThread.getLooper()));
            }
            handler = map.get(this.f32964c);
        }
        return handler;
    }

    /* renamed from: e */
    public final T mo28603e() {
        return this.f32975n;
    }

    /* renamed from: q */
    public final void mo28604q(C7579b bVar, C7643p<?> pVar) {
        synchronized (this.f32967f) {
            this.f32966e.add(pVar);
            pVar.mo28632a().mo28619a(new C7583d(this, pVar));
        }
        synchronized (this.f32967f) {
            if (this.f32973l.getAndIncrement() > 0) {
                this.f32963b.mo28574a("Already connected to the service.", new Object[0]);
            }
        }
        mo28602c().post(new C7585e(this, bVar.mo28579b(), bVar));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public final /* synthetic */ void mo28605r(C7643p pVar, C7632e eVar) {
        synchronized (this.f32967f) {
            this.f32966e.remove(pVar);
        }
    }

    /* renamed from: s */
    public final void mo28606s(C7643p<?> pVar) {
        synchronized (this.f32967f) {
            this.f32966e.remove(pVar);
        }
        synchronized (this.f32967f) {
            if (this.f32973l.decrementAndGet() > 0) {
                this.f32963b.mo28577d("Leaving the connection open for other ongoing calls.", new Object[0]);
                return;
            }
            mo28602c().post(new C7587f(this));
        }
    }
}
