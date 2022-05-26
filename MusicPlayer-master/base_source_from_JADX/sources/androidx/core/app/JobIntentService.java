package androidx.core.app;

import android.app.Service;
import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobServiceEngine;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import android.os.IBinder;
import android.os.PowerManager;
import java.util.ArrayList;
import java.util.HashMap;

@Deprecated
public abstract class JobIntentService extends Service {

    /* renamed from: m */
    static final HashMap<ComponentName, C0464h> f2518m = new HashMap<>();

    /* renamed from: g */
    C0457b f2519g;

    /* renamed from: h */
    C0464h f2520h;

    /* renamed from: i */
    C0456a f2521i;

    /* renamed from: j */
    boolean f2522j = false;

    /* renamed from: k */
    boolean f2523k = false;

    /* renamed from: l */
    final ArrayList<C0459d> f2524l;

    /* renamed from: androidx.core.app.JobIntentService$a */
    final class C0456a extends AsyncTask<Void, Void, Void> {
        C0456a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public Void doInBackground(Void... voidArr) {
            while (true) {
                C0460e a = JobIntentService.this.mo3122a();
                if (a == null) {
                    return null;
                }
                JobIntentService.this.mo3125e(a.getIntent());
                a.mo3143a();
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public void onCancelled(Void voidR) {
            JobIntentService.this.mo3127g();
        }

        /* access modifiers changed from: protected */
        /* renamed from: c */
        public void onPostExecute(Void voidR) {
            JobIntentService.this.mo3127g();
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$b */
    interface C0457b {
        /* renamed from: a */
        IBinder mo3138a();

        /* renamed from: b */
        C0460e mo3139b();
    }

    /* renamed from: androidx.core.app.JobIntentService$c */
    static final class C0458c extends C0464h {

        /* renamed from: d */
        private final PowerManager.WakeLock f2526d;

        /* renamed from: e */
        private final PowerManager.WakeLock f2527e;

        /* renamed from: f */
        boolean f2528f;

        /* renamed from: g */
        boolean f2529g;

        C0458c(Context context, ComponentName componentName) {
            super(componentName);
            context.getApplicationContext();
            PowerManager powerManager = (PowerManager) context.getSystemService("power");
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, componentName.getClassName() + ":launch");
            this.f2526d = newWakeLock;
            newWakeLock.setReferenceCounted(false);
            PowerManager.WakeLock newWakeLock2 = powerManager.newWakeLock(1, componentName.getClassName() + ":run");
            this.f2527e = newWakeLock2;
            newWakeLock2.setReferenceCounted(false);
        }

        /* renamed from: b */
        public void mo3140b() {
            synchronized (this) {
                if (this.f2529g) {
                    if (this.f2528f) {
                        this.f2526d.acquire(60000);
                    }
                    this.f2529g = false;
                    this.f2527e.release();
                }
            }
        }

        /* renamed from: c */
        public void mo3141c() {
            synchronized (this) {
                if (!this.f2529g) {
                    this.f2529g = true;
                    this.f2527e.acquire(600000);
                    this.f2526d.release();
                }
            }
        }

        /* renamed from: d */
        public void mo3142d() {
            synchronized (this) {
                this.f2528f = false;
            }
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$d */
    final class C0459d implements C0460e {

        /* renamed from: a */
        final Intent f2530a;

        /* renamed from: b */
        final int f2531b;

        C0459d(Intent intent, int i) {
            this.f2530a = intent;
            this.f2531b = i;
        }

        /* renamed from: a */
        public void mo3143a() {
            JobIntentService.this.stopSelf(this.f2531b);
        }

        public Intent getIntent() {
            return this.f2530a;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$e */
    interface C0460e {
        /* renamed from: a */
        void mo3143a();

        Intent getIntent();
    }

    /* renamed from: androidx.core.app.JobIntentService$f */
    static final class C0461f extends JobServiceEngine implements C0457b {

        /* renamed from: a */
        final JobIntentService f2533a;

        /* renamed from: b */
        final Object f2534b = new Object();

        /* renamed from: c */
        JobParameters f2535c;

        /* renamed from: androidx.core.app.JobIntentService$f$a */
        final class C0462a implements C0460e {

            /* renamed from: a */
            final JobWorkItem f2536a;

            C0462a(JobWorkItem jobWorkItem) {
                this.f2536a = jobWorkItem;
            }

            /* renamed from: a */
            public void mo3143a() {
                synchronized (C0461f.this.f2534b) {
                    JobParameters jobParameters = C0461f.this.f2535c;
                    if (jobParameters != null) {
                        jobParameters.completeWork(this.f2536a);
                    }
                }
            }

            public Intent getIntent() {
                return this.f2536a.getIntent();
            }
        }

        C0461f(JobIntentService jobIntentService) {
            super(jobIntentService);
            this.f2533a = jobIntentService;
        }

        /* renamed from: a */
        public IBinder mo3138a() {
            return getBinder();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
            r1.getIntent().setExtrasClassLoader(r3.f2533a.getClassLoader());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0023, code lost:
            return new androidx.core.app.JobIntentService.C0461f.C0462a(r3, r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
            return null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
            if (r1 == null) goto L_0x0024;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.core.app.JobIntentService.C0460e mo3139b() {
            /*
                r3 = this;
                java.lang.Object r0 = r3.f2534b
                monitor-enter(r0)
                android.app.job.JobParameters r1 = r3.f2535c     // Catch:{ all -> 0x0025 }
                r2 = 0
                if (r1 != 0) goto L_0x000a
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                return r2
            L_0x000a:
                android.app.job.JobWorkItem r1 = r1.dequeueWork()     // Catch:{ all -> 0x0025 }
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                if (r1 == 0) goto L_0x0024
                android.content.Intent r0 = r1.getIntent()
                androidx.core.app.JobIntentService r2 = r3.f2533a
                java.lang.ClassLoader r2 = r2.getClassLoader()
                r0.setExtrasClassLoader(r2)
                androidx.core.app.JobIntentService$f$a r0 = new androidx.core.app.JobIntentService$f$a
                r0.<init>(r1)
                return r0
            L_0x0024:
                return r2
            L_0x0025:
                r1 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0025 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.app.JobIntentService.C0461f.mo3139b():androidx.core.app.JobIntentService$e");
        }

        public boolean onStartJob(JobParameters jobParameters) {
            this.f2535c = jobParameters;
            this.f2533a.mo3124c(false);
            return true;
        }

        public boolean onStopJob(JobParameters jobParameters) {
            boolean b = this.f2533a.mo3123b();
            synchronized (this.f2534b) {
                this.f2535c = null;
            }
            return b;
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$g */
    static final class C0463g extends C0464h {
        C0463g(Context context, ComponentName componentName, int i) {
            super(componentName);
            mo3147a(i);
            new JobInfo.Builder(i, this.f2538a).setOverrideDeadline(0).build();
            JobScheduler jobScheduler = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
        }
    }

    /* renamed from: androidx.core.app.JobIntentService$h */
    static abstract class C0464h {

        /* renamed from: a */
        final ComponentName f2538a;

        /* renamed from: b */
        boolean f2539b;

        /* renamed from: c */
        int f2540c;

        C0464h(ComponentName componentName) {
            this.f2538a = componentName;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo3147a(int i) {
            if (!this.f2539b) {
                this.f2539b = true;
                this.f2540c = i;
            } else if (this.f2540c != i) {
                throw new IllegalArgumentException("Given job ID " + i + " is different than previous " + this.f2540c);
            }
        }

        /* renamed from: b */
        public void mo3140b() {
        }

        /* renamed from: c */
        public void mo3141c() {
        }

        /* renamed from: d */
        public void mo3142d() {
        }
    }

    public JobIntentService() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2524l = null;
        } else {
            this.f2524l = new ArrayList<>();
        }
    }

    /* renamed from: d */
    static C0464h m2952d(Context context, ComponentName componentName, boolean z, int i) {
        C0464h hVar;
        HashMap<ComponentName, C0464h> hashMap = f2518m;
        C0464h hVar2 = hashMap.get(componentName);
        if (hVar2 != null) {
            return hVar2;
        }
        if (Build.VERSION.SDK_INT < 26) {
            hVar = new C0458c(context, componentName);
        } else if (z) {
            hVar = new C0463g(context, componentName, i);
        } else {
            throw new IllegalArgumentException("Can't be here without a job id");
        }
        C0464h hVar3 = hVar;
        hashMap.put(componentName, hVar3);
        return hVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C0460e mo3122a() {
        C0457b bVar = this.f2519g;
        if (bVar != null) {
            return bVar.mo3139b();
        }
        synchronized (this.f2524l) {
            if (this.f2524l.size() <= 0) {
                return null;
            }
            C0460e remove = this.f2524l.remove(0);
            return remove;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo3123b() {
        C0456a aVar = this.f2521i;
        if (aVar != null) {
            aVar.cancel(this.f2522j);
        }
        return mo3126f();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public void mo3124c(boolean z) {
        if (this.f2521i == null) {
            this.f2521i = new C0456a();
            C0464h hVar = this.f2520h;
            if (hVar != null && z) {
                hVar.mo3141c();
            }
            this.f2521i.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo3125e(Intent intent);

    /* renamed from: f */
    public boolean mo3126f() {
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public void mo3127g() {
        ArrayList<C0459d> arrayList = this.f2524l;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2521i = null;
                ArrayList<C0459d> arrayList2 = this.f2524l;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    mo3124c(false);
                } else if (!this.f2523k) {
                    this.f2520h.mo3140b();
                }
            }
        }
    }

    public IBinder onBind(Intent intent) {
        C0457b bVar = this.f2519g;
        if (bVar != null) {
            return bVar.mo3138a();
        }
        return null;
    }

    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 26) {
            this.f2519g = new C0461f(this);
            this.f2520h = null;
            return;
        }
        this.f2519g = null;
        this.f2520h = m2952d(this, new ComponentName(this, getClass()), false, 0);
    }

    public void onDestroy() {
        super.onDestroy();
        ArrayList<C0459d> arrayList = this.f2524l;
        if (arrayList != null) {
            synchronized (arrayList) {
                this.f2523k = true;
                this.f2520h.mo3140b();
            }
        }
    }

    public int onStartCommand(Intent intent, int i, int i2) {
        if (this.f2524l == null) {
            return 2;
        }
        this.f2520h.mo3142d();
        synchronized (this.f2524l) {
            ArrayList<C0459d> arrayList = this.f2524l;
            if (intent == null) {
                intent = new Intent();
            }
            arrayList.add(new C0459d(intent, i2));
            mo3124c(true);
        }
        return 3;
    }
}
