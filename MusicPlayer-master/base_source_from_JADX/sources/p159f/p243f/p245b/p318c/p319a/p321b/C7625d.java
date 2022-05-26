package p159f.p243f.p245b.p318c.p319a.p321b;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import p159f.p243f.p245b.p318c.p319a.p320a.C7577a;
import p159f.p243f.p245b.p318c.p319a.p320a.C7607p;
import p159f.p243f.p245b.p318c.p319a.p320a.C7613s;

/* renamed from: f.f.b.c.a.b.d */
/* compiled from: com.google.android.play:core@@1.10.2 */
public abstract class C7625d<StateT> {

    /* renamed from: a */
    protected final C7577a f32982a;

    /* renamed from: b */
    private final IntentFilter f32983b;

    /* renamed from: c */
    private final Context f32984c;

    /* renamed from: d */
    protected final Set<C7622a<StateT>> f32985d = new HashSet();

    /* renamed from: e */
    private C7624c f32986e = null;

    /* renamed from: f */
    private volatile boolean f32987f = false;

    protected C7625d(C7577a aVar, IntentFilter intentFilter, Context context) {
        this.f32982a = aVar;
        this.f32983b = intentFilter;
        this.f32984c = C7607p.m42395a(context);
    }

    /* renamed from: b */
    private final void m42431b() {
        C7624c cVar;
        if ((this.f32987f || !this.f32985d.isEmpty()) && this.f32986e == null) {
            C7624c cVar2 = new C7624c(this, (C7623b) null);
            this.f32986e = cVar2;
            this.f32984c.registerReceiver(cVar2, this.f32983b);
        }
        if (!this.f32987f && this.f32985d.isEmpty() && (cVar = this.f32986e) != null) {
            this.f32984c.unregisterReceiver(cVar);
            this.f32986e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo25166a(Context context, Intent intent);

    /* renamed from: c */
    public final synchronized void mo28614c(C7622a<StateT> aVar) {
        this.f32982a.mo28577d("registerListener", new Object[0]);
        C7613s.m42415a(aVar, "Registered Play Core listener should not be null.");
        this.f32985d.add(aVar);
        m42431b();
    }

    /* renamed from: d */
    public final synchronized void mo28615d(boolean z) {
        this.f32987f = z;
        m42431b();
    }

    /* renamed from: e */
    public final synchronized void mo28616e(C7622a<StateT> aVar) {
        this.f32982a.mo28577d("unregisterListener", new Object[0]);
        C7613s.m42415a(aVar, "Unregistered Play Core listener should not be null.");
        this.f32985d.remove(aVar);
        m42431b();
    }

    /* renamed from: f */
    public final synchronized void mo28617f(StateT statet) {
        Iterator it = new HashSet(this.f32985d).iterator();
        while (it.hasNext()) {
            ((C7622a) it.next()).onStateUpdate(statet);
        }
    }

    /* renamed from: g */
    public final synchronized boolean mo28618g() {
        return this.f32986e != null;
    }
}
