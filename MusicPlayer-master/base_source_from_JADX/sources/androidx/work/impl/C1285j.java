package androidx.work.impl;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Build;
import androidx.work.C1228b;
import androidx.work.C1405l;
import androidx.work.C1410o;
import androidx.work.C1418r;
import androidx.work.C1422v;
import androidx.work.C1423w;
import androidx.work.WorkerParameters;
import androidx.work.impl.background.systemjob.C1260b;
import androidx.work.impl.p007l.p008a.C1292b;
import androidx.work.impl.utils.C1359a;
import androidx.work.impl.utils.C1366e;
import androidx.work.impl.utils.C1370h;
import androidx.work.impl.utils.C1371i;
import androidx.work.impl.utils.ForceStopRunnable;
import androidx.work.impl.utils.p014p.C1397a;
import androidx.work.impl.utils.p014p.C1398b;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

/* renamed from: androidx.work.impl.j */
/* compiled from: WorkManagerImpl */
public class C1285j extends C1422v {

    /* renamed from: j */
    private static C1285j f5189j = null;

    /* renamed from: k */
    private static C1285j f5190k = null;

    /* renamed from: l */
    private static final Object f5191l = new Object();

    /* renamed from: a */
    private Context f5192a;

    /* renamed from: b */
    private C1228b f5193b;

    /* renamed from: c */
    private WorkDatabase f5194c;

    /* renamed from: d */
    private C1397a f5195d;

    /* renamed from: e */
    private List<C1264e> f5196e;

    /* renamed from: f */
    private C1262d f5197f;

    /* renamed from: g */
    private C1366e f5198g;

    /* renamed from: h */
    private boolean f5199h;

    /* renamed from: i */
    private BroadcastReceiver.PendingResult f5200i;

    static {
        C1405l.m7462f("WorkManagerImpl");
    }

    public C1285j(Context context, C1228b bVar, C1397a aVar) {
        this(context, bVar, aVar, context.getResources().getBoolean(C1418r.workmanager_test_configuration));
    }

    /* renamed from: e */
    public static void m7098e(Context context, C1228b bVar) {
        synchronized (f5191l) {
            C1285j jVar = f5189j;
            if (jVar != null) {
                if (f5190k != null) {
                    throw new IllegalStateException("WorkManager is already initialized.  Did you try to initialize it manually without disabling WorkManagerInitializer? See WorkManager#initialize(Context, Configuration) or the class level Javadoc for more information.");
                }
            }
            if (jVar == null) {
                Context applicationContext = context.getApplicationContext();
                if (f5190k == null) {
                    f5190k = new C1285j(applicationContext, bVar, new C1398b(bVar.mo6468l()));
                }
                f5189j = f5190k;
            }
        }
    }

    @Deprecated
    /* renamed from: j */
    public static C1285j m7099j() {
        synchronized (f5191l) {
            C1285j jVar = f5189j;
            if (jVar != null) {
                return jVar;
            }
            C1285j jVar2 = f5190k;
            return jVar2;
        }
    }

    /* renamed from: k */
    public static C1285j m7100k(Context context) {
        C1285j j;
        synchronized (f5191l) {
            j = m7099j();
            if (j == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext instanceof C1228b.C1231c) {
                    m7098e(applicationContext, ((C1228b.C1231c) applicationContext).mo6472a());
                    j = m7100k(applicationContext);
                } else {
                    throw new IllegalStateException("WorkManager is not initialized properly.  You have explicitly disabled WorkManagerInitializer in your manifest, have not manually called WorkManager#initialize at this point, and your Application does not implement Configuration.Provider.");
                }
            }
        }
        return j;
    }

    /* renamed from: q */
    private void m7101q(Context context, C1228b bVar, C1397a aVar, WorkDatabase workDatabase, List<C1264e> list, C1262d dVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5192a = applicationContext;
        this.f5193b = bVar;
        this.f5195d = aVar;
        this.f5194c = workDatabase;
        this.f5196e = list;
        this.f5197f = dVar;
        this.f5198g = new C1366e(workDatabase);
        this.f5199h = false;
        if (Build.VERSION.SDK_INT < 24 || !applicationContext.isDeviceProtectedStorage()) {
            this.f5195d.mo6804b(new ForceStopRunnable(applicationContext, this));
            return;
        }
        throw new IllegalStateException("Cannot initialize WorkManager in direct boot mode");
    }

    /* renamed from: a */
    public C1410o mo6602a(String str) {
        C1359a d = C1359a.m7360d(str, this);
        this.f5195d.mo6804b(d);
        return d.mo6749e();
    }

    /* renamed from: c */
    public C1410o mo6603c(List<? extends C1423w> list) {
        if (!list.isEmpty()) {
            return new C1273g(this, list).mo6592a();
        }
        throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
    }

    /* renamed from: f */
    public C1410o mo6604f(UUID uuid) {
        C1359a b = C1359a.m7358b(uuid, this);
        this.f5195d.mo6804b(b);
        return b.mo6749e();
    }

    /* renamed from: g */
    public List<C1264e> mo6605g(Context context, C1228b bVar, C1397a aVar) {
        return Arrays.asList(new C1264e[]{C1265f.m7046a(context, this), new C1292b(context, bVar, aVar, this)});
    }

    /* renamed from: h */
    public Context mo6606h() {
        return this.f5192a;
    }

    /* renamed from: i */
    public C1228b mo6607i() {
        return this.f5193b;
    }

    /* renamed from: l */
    public C1366e mo6608l() {
        return this.f5198g;
    }

    /* renamed from: m */
    public C1262d mo6609m() {
        return this.f5197f;
    }

    /* renamed from: n */
    public List<C1264e> mo6610n() {
        return this.f5196e;
    }

    /* renamed from: o */
    public WorkDatabase mo6611o() {
        return this.f5194c;
    }

    /* renamed from: p */
    public C1397a mo6612p() {
        return this.f5195d;
    }

    /* renamed from: r */
    public void mo6613r() {
        synchronized (f5191l) {
            this.f5199h = true;
            BroadcastReceiver.PendingResult pendingResult = this.f5200i;
            if (pendingResult != null) {
                pendingResult.finish();
                this.f5200i = null;
            }
        }
    }

    /* renamed from: s */
    public void mo6614s() {
        if (Build.VERSION.SDK_INT >= 23) {
            C1260b.m7017b(mo6606h());
        }
        mo6611o().mo6527N().mo6735u();
        C1265f.m7047b(mo6607i(), mo6611o(), mo6610n());
    }

    /* renamed from: t */
    public void mo6615t(BroadcastReceiver.PendingResult pendingResult) {
        synchronized (f5191l) {
            this.f5200i = pendingResult;
            if (this.f5199h) {
                pendingResult.finish();
                this.f5200i = null;
            }
        }
    }

    /* renamed from: u */
    public void mo6616u(String str) {
        mo6617v(str, (WorkerParameters.C1226a) null);
    }

    /* renamed from: v */
    public void mo6617v(String str, WorkerParameters.C1226a aVar) {
        this.f5195d.mo6804b(new C1370h(this, str, aVar));
    }

    /* renamed from: w */
    public void mo6618w(String str) {
        this.f5195d.mo6804b(new C1371i(this, str, true));
    }

    /* renamed from: x */
    public void mo6619x(String str) {
        this.f5195d.mo6804b(new C1371i(this, str, false));
    }

    public C1285j(Context context, C1228b bVar, C1397a aVar, boolean z) {
        this(context, bVar, aVar, WorkDatabase.m6918E(context.getApplicationContext(), aVar.mo6805c(), z));
    }

    public C1285j(Context context, C1228b bVar, C1397a aVar, WorkDatabase workDatabase) {
        Context applicationContext = context.getApplicationContext();
        C1405l.m7461e(new C1405l.C1406a(bVar.mo6466j()));
        Context context2 = context;
        C1228b bVar2 = bVar;
        C1397a aVar2 = aVar;
        WorkDatabase workDatabase2 = workDatabase;
        List<C1264e> g = mo6605g(applicationContext, bVar, aVar);
        m7101q(context2, bVar2, aVar2, workDatabase2, g, new C1262d(context2, bVar2, aVar2, workDatabase2, g));
    }
}
