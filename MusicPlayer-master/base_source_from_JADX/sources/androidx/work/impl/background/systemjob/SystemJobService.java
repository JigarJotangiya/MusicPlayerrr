package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.C1405l;
import androidx.work.impl.C1246b;
import androidx.work.impl.C1285j;
import java.util.HashMap;
import java.util.Map;

public class SystemJobService extends JobService implements C1246b {

    /* renamed from: i */
    private static final String f5110i = C1405l.m7462f("SystemJobService");

    /* renamed from: g */
    private C1285j f5111g;

    /* renamed from: h */
    private final Map<String, JobParameters> f5112h = new HashMap();

    /* renamed from: a */
    private static String m7011a(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return extras.getString("EXTRA_WORK_SPEC_ID");
        } catch (NullPointerException unused) {
            return null;
        }
    }

    /* renamed from: d */
    public void mo6531d(String str, boolean z) {
        JobParameters remove;
        C1405l.m7460c().mo6816a(f5110i, String.format("%s executed on JobScheduler", new Object[]{str}), new Throwable[0]);
        synchronized (this.f5112h) {
            remove = this.f5112h.remove(str);
        }
        if (remove != null) {
            jobFinished(remove, z);
        }
    }

    public void onCreate() {
        super.onCreate();
        try {
            C1285j k = C1285j.m7100k(getApplicationContext());
            this.f5111g = k;
            k.mo6609m().mo6568c(this);
        } catch (IllegalStateException unused) {
            if (Application.class.equals(getApplication().getClass())) {
                C1405l.m7460c().mo6820h(f5110i, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.", new Throwable[0]);
                return;
            }
            throw new IllegalStateException("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C1285j jVar = this.f5111g;
        if (jVar != null) {
            jVar.mo6609m().mo6572i(this);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x006c, code lost:
        r2 = null;
        r3 = android.os.Build.VERSION.SDK_INT;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (r3 < 24) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0073, code lost:
        r2 = new androidx.work.WorkerParameters.C1226a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r9.getTriggeredContentUris() == null) goto L_0x0088;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x007e, code lost:
        r2.f4997b = java.util.Arrays.asList(r9.getTriggeredContentUris());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x008c, code lost:
        if (r9.getTriggeredContentAuthorities() == null) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008e, code lost:
        r2.f4996a = java.util.Arrays.asList(r9.getTriggeredContentAuthorities());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009a, code lost:
        if (r3 < 28) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009c, code lost:
        r2.f4998c = r9.getNetwork();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a2, code lost:
        r8.f5111g.mo6617v(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a7, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onStartJob(android.app.job.JobParameters r9) {
        /*
            r8 = this;
            androidx.work.impl.j r0 = r8.f5111g
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L_0x0017
            androidx.work.l r0 = androidx.work.C1405l.m7460c()
            java.lang.String r3 = f5110i
            java.lang.String r4 = "WorkManager is not initialized; requesting retry."
            java.lang.Throwable[] r5 = new java.lang.Throwable[r2]
            r0.mo6816a(r3, r4, r5)
            r8.jobFinished(r9, r1)
            return r2
        L_0x0017:
            java.lang.String r0 = m7011a(r9)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 == 0) goto L_0x002f
            androidx.work.l r9 = androidx.work.C1405l.m7460c()
            java.lang.String r0 = f5110i
            java.lang.String r1 = "WorkSpec id not found!"
            java.lang.Throwable[] r3 = new java.lang.Throwable[r2]
            r9.mo6817b(r0, r1, r3)
            return r2
        L_0x002f:
            java.util.Map<java.lang.String, android.app.job.JobParameters> r3 = r8.f5112h
            monitor-enter(r3)
            java.util.Map<java.lang.String, android.app.job.JobParameters> r4 = r8.f5112h     // Catch:{ all -> 0x00a8 }
            boolean r4 = r4.containsKey(r0)     // Catch:{ all -> 0x00a8 }
            if (r4 == 0) goto L_0x0051
            androidx.work.l r9 = androidx.work.C1405l.m7460c()     // Catch:{ all -> 0x00a8 }
            java.lang.String r4 = f5110i     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = "Job is already being executed by SystemJobService: %s"
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a8 }
            r1[r2] = r0     // Catch:{ all -> 0x00a8 }
            java.lang.String r0 = java.lang.String.format(r5, r1)     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable[] r1 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a8 }
            r9.mo6816a(r4, r0, r1)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            return r2
        L_0x0051:
            androidx.work.l r4 = androidx.work.C1405l.m7460c()     // Catch:{ all -> 0x00a8 }
            java.lang.String r5 = f5110i     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = "onStartJob for %s"
            java.lang.Object[] r7 = new java.lang.Object[r1]     // Catch:{ all -> 0x00a8 }
            r7[r2] = r0     // Catch:{ all -> 0x00a8 }
            java.lang.String r6 = java.lang.String.format(r6, r7)     // Catch:{ all -> 0x00a8 }
            java.lang.Throwable[] r2 = new java.lang.Throwable[r2]     // Catch:{ all -> 0x00a8 }
            r4.mo6816a(r5, r6, r2)     // Catch:{ all -> 0x00a8 }
            java.util.Map<java.lang.String, android.app.job.JobParameters> r2 = r8.f5112h     // Catch:{ all -> 0x00a8 }
            r2.put(r0, r9)     // Catch:{ all -> 0x00a8 }
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            r2 = 0
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 24
            if (r3 < r4) goto L_0x00a2
            androidx.work.WorkerParameters$a r2 = new androidx.work.WorkerParameters$a
            r2.<init>()
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            if (r4 == 0) goto L_0x0088
            android.net.Uri[] r4 = r9.getTriggeredContentUris()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f4997b = r4
        L_0x0088:
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            if (r4 == 0) goto L_0x0098
            java.lang.String[] r4 = r9.getTriggeredContentAuthorities()
            java.util.List r4 = java.util.Arrays.asList(r4)
            r2.f4996a = r4
        L_0x0098:
            r4 = 28
            if (r3 < r4) goto L_0x00a2
            android.net.Network r9 = r9.getNetwork()
            r2.f4998c = r9
        L_0x00a2:
            androidx.work.impl.j r9 = r8.f5111g
            r9.mo6617v(r0, r2)
            return r1
        L_0x00a8:
            r9 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x00a8 }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.SystemJobService.onStartJob(android.app.job.JobParameters):boolean");
    }

    public boolean onStopJob(JobParameters jobParameters) {
        if (this.f5111g == null) {
            C1405l.m7460c().mo6816a(f5110i, "WorkManager is not initialized; requesting retry.", new Throwable[0]);
            return true;
        }
        String a = m7011a(jobParameters);
        if (TextUtils.isEmpty(a)) {
            C1405l.m7460c().mo6817b(f5110i, "WorkSpec id not found!", new Throwable[0]);
            return false;
        }
        C1405l.m7460c().mo6816a(f5110i, String.format("onStopJob for %s", new Object[]{a}), new Throwable[0]);
        synchronized (this.f5112h) {
            this.f5112h.remove(a);
        }
        this.f5111g.mo6619x(a);
        return !this.f5111g.mo6609m().mo6569f(a);
    }
}
