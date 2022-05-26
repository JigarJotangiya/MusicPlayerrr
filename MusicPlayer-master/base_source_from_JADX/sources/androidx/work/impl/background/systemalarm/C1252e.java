package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.text.TextUtils;
import androidx.work.C1405l;
import androidx.work.impl.C1246b;
import androidx.work.impl.C1262d;
import androidx.work.impl.C1285j;
import androidx.work.impl.utils.C1368g;
import androidx.work.impl.utils.C1372j;
import androidx.work.impl.utils.C1380n;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.work.impl.background.systemalarm.e */
/* compiled from: SystemAlarmDispatcher */
public class C1252e implements C1246b {

    /* renamed from: q */
    static final String f5092q = C1405l.m7462f("SystemAlarmDispatcher");

    /* renamed from: g */
    final Context f5093g;

    /* renamed from: h */
    private final C1397a f5094h;

    /* renamed from: i */
    private final C1380n f5095i;

    /* renamed from: j */
    private final C1262d f5096j;

    /* renamed from: k */
    private final C1285j f5097k;

    /* renamed from: l */
    final C1249b f5098l;

    /* renamed from: m */
    private final Handler f5099m;

    /* renamed from: n */
    final List<Intent> f5100n;

    /* renamed from: o */
    Intent f5101o;

    /* renamed from: p */
    private C1255c f5102p;

    /* renamed from: androidx.work.impl.background.systemalarm.e$a */
    /* compiled from: SystemAlarmDispatcher */
    class C1253a implements Runnable {
        C1253a() {
        }

        public void run() {
            C1256d dVar;
            C1252e eVar;
            synchronized (C1252e.this.f5100n) {
                C1252e eVar2 = C1252e.this;
                eVar2.f5101o = eVar2.f5100n.get(0);
            }
            Intent intent = C1252e.this.f5101o;
            if (intent != null) {
                String action = intent.getAction();
                int intExtra = C1252e.this.f5101o.getIntExtra("KEY_START_ID", 0);
                C1405l c = C1405l.m7460c();
                String str = C1252e.f5092q;
                c.mo6816a(str, String.format("Processing command %s, %s", new Object[]{C1252e.this.f5101o, Integer.valueOf(intExtra)}), new Throwable[0]);
                PowerManager.WakeLock b = C1372j.m7391b(C1252e.this.f5093g, String.format("%s (%s)", new Object[]{action, Integer.valueOf(intExtra)}));
                try {
                    C1405l.m7460c().mo6816a(str, String.format("Acquiring operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.acquire();
                    C1252e eVar3 = C1252e.this;
                    eVar3.f5098l.mo6538p(eVar3.f5101o, intExtra, eVar3);
                    C1405l.m7460c().mo6816a(str, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    eVar = C1252e.this;
                    dVar = new C1256d(eVar);
                } catch (Throwable th) {
                    C1405l.m7460c().mo6816a(C1252e.f5092q, String.format("Releasing operation wake lock (%s) %s", new Object[]{action, b}), new Throwable[0]);
                    b.release();
                    C1252e eVar4 = C1252e.this;
                    eVar4.mo6551k(new C1256d(eVar4));
                    throw th;
                }
                eVar.mo6551k(dVar);
            }
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$b */
    /* compiled from: SystemAlarmDispatcher */
    static class C1254b implements Runnable {

        /* renamed from: g */
        private final C1252e f5104g;

        /* renamed from: h */
        private final Intent f5105h;

        /* renamed from: i */
        private final int f5106i;

        C1254b(C1252e eVar, Intent intent, int i) {
            this.f5104g = eVar;
            this.f5105h = intent;
            this.f5106i = i;
        }

        public void run() {
            this.f5104g.mo6544a(this.f5105h, this.f5106i);
        }
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$c */
    /* compiled from: SystemAlarmDispatcher */
    interface C1255c {
        /* renamed from: a */
        void mo6536a();
    }

    /* renamed from: androidx.work.impl.background.systemalarm.e$d */
    /* compiled from: SystemAlarmDispatcher */
    static class C1256d implements Runnable {

        /* renamed from: g */
        private final C1252e f5107g;

        C1256d(C1252e eVar) {
            this.f5107g = eVar;
        }

        public void run() {
            this.f5107g.mo6545c();
        }
    }

    C1252e(Context context) {
        this(context, (C1262d) null, (C1285j) null);
    }

    /* renamed from: b */
    private void m6993b() {
        if (this.f5099m.getLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException("Needs to be invoked on the main thread.");
        }
    }

    /* renamed from: i */
    private boolean m6994i(String str) {
        m6993b();
        synchronized (this.f5100n) {
            for (Intent action : this.f5100n) {
                if (str.equals(action.getAction())) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: l */
    private void m6995l() {
        m6993b();
        PowerManager.WakeLock b = C1372j.m7391b(this.f5093g, "ProcessCommand");
        try {
            b.acquire();
            this.f5097k.mo6612p().mo6804b(new C1253a());
        } finally {
            b.release();
        }
    }

    /* renamed from: a */
    public boolean mo6544a(Intent intent, int i) {
        C1405l c = C1405l.m7460c();
        String str = f5092q;
        boolean z = false;
        c.mo6816a(str, String.format("Adding command %s (%s)", new Object[]{intent, Integer.valueOf(i)}), new Throwable[0]);
        m6993b();
        String action = intent.getAction();
        if (TextUtils.isEmpty(action)) {
            C1405l.m7460c().mo6820h(str, "Unknown command. Ignoring", new Throwable[0]);
            return false;
        } else if ("ACTION_CONSTRAINTS_CHANGED".equals(action) && m6994i("ACTION_CONSTRAINTS_CHANGED")) {
            return false;
        } else {
            intent.putExtra("KEY_START_ID", i);
            synchronized (this.f5100n) {
                if (!this.f5100n.isEmpty()) {
                    z = true;
                }
                this.f5100n.add(intent);
                if (!z) {
                    m6995l();
                }
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo6545c() {
        C1405l c = C1405l.m7460c();
        String str = f5092q;
        c.mo6816a(str, "Checking if commands are complete.", new Throwable[0]);
        m6993b();
        synchronized (this.f5100n) {
            if (this.f5101o != null) {
                C1405l.m7460c().mo6816a(str, String.format("Removing command %s", new Object[]{this.f5101o}), new Throwable[0]);
                if (this.f5100n.remove(0).equals(this.f5101o)) {
                    this.f5101o = null;
                } else {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
            }
            C1368g c2 = this.f5094h.mo6805c();
            if (!this.f5098l.mo6537o() && this.f5100n.isEmpty() && !c2.mo6761a()) {
                C1405l.m7460c().mo6816a(str, "No more commands & intents.", new Throwable[0]);
                C1255c cVar = this.f5102p;
                if (cVar != null) {
                    cVar.mo6536a();
                }
            } else if (!this.f5100n.isEmpty()) {
                m6995l();
            }
        }
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        mo6551k(new C1254b(this, C1249b.m6971c(this.f5093g, str, z), 0));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C1262d mo6546e() {
        return this.f5096j;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C1397a mo6547f() {
        return this.f5094h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C1285j mo6548g() {
        return this.f5097k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public C1380n mo6549h() {
        return this.f5095i;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: j */
    public void mo6550j() {
        C1405l.m7460c().mo6816a(f5092q, "Destroying SystemAlarmDispatcher", new Throwable[0]);
        this.f5096j.mo6572i(this);
        this.f5095i.mo6774a();
        this.f5102p = null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public void mo6551k(Runnable runnable) {
        this.f5099m.post(runnable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: m */
    public void mo6552m(C1255c cVar) {
        if (this.f5102p != null) {
            C1405l.m7460c().mo6817b(f5092q, "A completion listener for SystemAlarmDispatcher already exists.", new Throwable[0]);
        } else {
            this.f5102p = cVar;
        }
    }

    C1252e(Context context, C1262d dVar, C1285j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5093g = applicationContext;
        this.f5098l = new C1249b(applicationContext);
        this.f5095i = new C1380n();
        jVar = jVar == null ? C1285j.m7100k(context) : jVar;
        this.f5097k = jVar;
        dVar = dVar == null ? jVar.mo6609m() : dVar;
        this.f5096j = dVar;
        this.f5094h = jVar.mo6612p();
        dVar.mo6568c(this);
        this.f5100n = new ArrayList();
        this.f5101o = null;
        this.f5099m = new Handler(Looper.getMainLooper());
    }
}
