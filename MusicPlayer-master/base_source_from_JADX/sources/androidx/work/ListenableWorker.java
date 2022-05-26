package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Network;
import android.net.Uri;
import androidx.annotation.Keep;
import androidx.work.impl.utils.p013o.C1396c;
import androidx.work.impl.utils.p014p.C1397a;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p159f.p243f.p327d.p330c.p331a.C7738a;

public abstract class ListenableWorker {

    /* renamed from: g */
    private Context f4976g;

    /* renamed from: h */
    private WorkerParameters f4977h;

    /* renamed from: i */
    private volatile boolean f4978i;

    /* renamed from: j */
    private boolean f4979j;

    /* renamed from: k */
    private boolean f4980k;

    /* renamed from: androidx.work.ListenableWorker$a */
    public static abstract class C1221a {

        /* renamed from: androidx.work.ListenableWorker$a$a */
        public static final class C1222a extends C1221a {

            /* renamed from: a */
            private final C1236e f4981a;

            public C1222a() {
                this(C1236e.f5045c);
            }

            /* renamed from: e */
            public C1236e mo6433e() {
                return this.f4981a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1222a.class != obj.getClass()) {
                    return false;
                }
                return this.f4981a.equals(((C1222a) obj).f4981a);
            }

            public int hashCode() {
                return (C1222a.class.getName().hashCode() * 31) + this.f4981a.hashCode();
            }

            public String toString() {
                return "Failure {mOutputData=" + this.f4981a + '}';
            }

            public C1222a(C1236e eVar) {
                this.f4981a = eVar;
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$b */
        public static final class C1223b extends C1221a {
            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return obj != null && C1223b.class == obj.getClass();
            }

            public int hashCode() {
                return C1223b.class.getName().hashCode();
            }

            public String toString() {
                return "Retry";
            }
        }

        /* renamed from: androidx.work.ListenableWorker$a$c */
        public static final class C1224c extends C1221a {

            /* renamed from: a */
            private final C1236e f4982a;

            public C1224c() {
                this(C1236e.f5045c);
            }

            /* renamed from: e */
            public C1236e mo6440e() {
                return this.f4982a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj == null || C1224c.class != obj.getClass()) {
                    return false;
                }
                return this.f4982a.equals(((C1224c) obj).f4982a);
            }

            public int hashCode() {
                return (C1224c.class.getName().hashCode() * 31) + this.f4982a.hashCode();
            }

            public String toString() {
                return "Success {mOutputData=" + this.f4982a + '}';
            }

            public C1224c(C1236e eVar) {
                this.f4982a = eVar;
            }
        }

        C1221a() {
        }

        /* renamed from: a */
        public static C1221a m6836a() {
            return new C1222a();
        }

        /* renamed from: b */
        public static C1221a m6837b() {
            return new C1223b();
        }

        /* renamed from: c */
        public static C1221a m6838c() {
            return new C1224c();
        }

        /* renamed from: d */
        public static C1221a m6839d(C1236e eVar) {
            return new C1224c(eVar);
        }
    }

    @SuppressLint({"BanKeepAnnotation"})
    @Keep
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.f4976g = context;
            this.f4977h = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final Context getApplicationContext() {
        return this.f4976g;
    }

    public Executor getBackgroundExecutor() {
        return this.f4977h.mo6447a();
    }

    public C7738a<C1239g> getForegroundInfoAsync() {
        C1396c u = C1396c.m7435u();
        u.mo6789r(new IllegalStateException("Expedited WorkRequests require a ListenableWorker to provide an implementation for `getForegroundInfoAsync()`"));
        return u;
    }

    public final UUID getId() {
        return this.f4977h.mo6449c();
    }

    public final C1236e getInputData() {
        return this.f4977h.mo6450d();
    }

    public final Network getNetwork() {
        return this.f4977h.mo6451e();
    }

    public final int getRunAttemptCount() {
        return this.f4977h.mo6453g();
    }

    public final Set<String> getTags() {
        return this.f4977h.mo6454h();
    }

    public C1397a getTaskExecutor() {
        return this.f4977h.mo6455i();
    }

    public final List<String> getTriggeredContentAuthorities() {
        return this.f4977h.mo6456j();
    }

    public final List<Uri> getTriggeredContentUris() {
        return this.f4977h.mo6457k();
    }

    public C1425x getWorkerFactory() {
        return this.f4977h.mo6458l();
    }

    public boolean isRunInForeground() {
        return this.f4980k;
    }

    public final boolean isStopped() {
        return this.f4978i;
    }

    public final boolean isUsed() {
        return this.f4979j;
    }

    public void onStopped() {
    }

    public final C7738a<Void> setForegroundAsync(C1239g gVar) {
        this.f4980k = true;
        return this.f4977h.mo6448b().mo6520a(getApplicationContext(), getId(), gVar);
    }

    public C7738a<Void> setProgressAsync(C1236e eVar) {
        return this.f4977h.mo6452f().mo6772a(getApplicationContext(), getId(), eVar);
    }

    public void setRunInForeground(boolean z) {
        this.f4980k = z;
    }

    public final void setUsed() {
        this.f4979j = true;
    }

    public abstract C7738a<C1221a> startWork();

    public final void stop() {
        this.f4978i = true;
        onStopped();
    }
}
