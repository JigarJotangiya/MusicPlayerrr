package androidx.work.impl.background.systemjob;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.C1227a;
import androidx.work.C1232c;
import androidx.work.C1234d;
import androidx.work.C1405l;
import androidx.work.C1407m;
import androidx.work.impl.p012n.C1340p;
import p082e.p109h.p115l.C3643a;

/* renamed from: androidx.work.impl.background.systemjob.a */
/* compiled from: SystemJobInfoConverter */
class C1258a {

    /* renamed from: b */
    private static final String f5113b = C1405l.m7462f("SystemJobInfoConverter");

    /* renamed from: a */
    private final ComponentName f5114a;

    /* renamed from: androidx.work.impl.background.systemjob.a$a */
    /* compiled from: SystemJobInfoConverter */
    static /* synthetic */ class C1259a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5115a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                androidx.work.m[] r0 = androidx.work.C1407m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5115a = r0
                androidx.work.m r1 = androidx.work.C1407m.NOT_REQUIRED     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5115a     // Catch:{ NoSuchFieldError -> 0x001d }
                androidx.work.m r1 = androidx.work.C1407m.CONNECTED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5115a     // Catch:{ NoSuchFieldError -> 0x0028 }
                androidx.work.m r1 = androidx.work.C1407m.UNMETERED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5115a     // Catch:{ NoSuchFieldError -> 0x0033 }
                androidx.work.m r1 = androidx.work.C1407m.NOT_ROAMING     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5115a     // Catch:{ NoSuchFieldError -> 0x003e }
                androidx.work.m r1 = androidx.work.C1407m.METERED     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.background.systemjob.C1258a.C1259a.<clinit>():void");
        }
    }

    C1258a(Context context) {
        this.f5114a = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }

    /* renamed from: b */
    private static JobInfo.TriggerContentUri m7013b(C1234d.C1235a aVar) {
        return new JobInfo.TriggerContentUri(aVar.mo6499a(), aVar.mo6500b() ? 1 : 0);
    }

    /* renamed from: c */
    static int m7014c(C1407m mVar) {
        int i = C1259a.f5115a[mVar.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i != 4) {
            if (i == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        C1405l.m7460c().mo6816a(f5113b, String.format("API version too low. Cannot convert network type value %s", new Object[]{mVar}), new Throwable[0]);
        return 1;
    }

    /* renamed from: d */
    static void m7015d(JobInfo.Builder builder, C1407m mVar) {
        if (Build.VERSION.SDK_INT < 30 || mVar != C1407m.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(m7014c(mVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public JobInfo mo6563a(C1340p pVar, int i) {
        C1232c cVar = pVar.f5322j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f5313a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.mo6709d());
        JobInfo.Builder extras = new JobInfo.Builder(i, this.f5114a).setRequiresCharging(cVar.mo6480g()).setRequiresDeviceIdle(cVar.mo6481h()).setExtras(persistableBundle);
        m7015d(extras, cVar.mo6474b());
        boolean z = false;
        if (!cVar.mo6481h()) {
            extras.setBackoffCriteria(pVar.f5325m, pVar.f5324l == C1227a.LINEAR ? 0 : 1);
        }
        long max = Math.max(pVar.mo6706a() - System.currentTimeMillis(), 0);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 <= 28) {
            extras.setMinimumLatency(max);
        } else if (max > 0) {
            extras.setMinimumLatency(max);
        } else if (!pVar.f5329q) {
            extras.setImportantWhileForeground(true);
        }
        if (i2 >= 24 && cVar.mo6477e()) {
            for (C1234d.C1235a b : cVar.mo6473a().mo6495b()) {
                extras.addTriggerContentUri(m7013b(b));
            }
            extras.setTriggerContentUpdateDelay(cVar.mo6475c());
            extras.setTriggerContentMaxDelay(cVar.mo6476d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(cVar.mo6479f());
            extras.setRequiresStorageNotLow(cVar.mo6483i());
        }
        if (pVar.f5323k > 0) {
            z = true;
        }
        if (C3643a.m15699c() && pVar.f5329q && !z) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
