package androidx.work;

import android.content.Context;

/* renamed from: androidx.work.x */
/* compiled from: WorkerFactory */
public abstract class C1425x {

    /* renamed from: a */
    private static final String f5480a = C1405l.m7462f("WorkerFactory");

    /* renamed from: androidx.work.x$a */
    /* compiled from: WorkerFactory */
    class C1426a extends C1425x {
        C1426a() {
        }

        /* renamed from: a */
        public ListenableWorker mo6838a(Context context, String str, WorkerParameters workerParameters) {
            return null;
        }
    }

    /* renamed from: c */
    public static C1425x m7496c() {
        return new C1426a();
    }

    /* renamed from: a */
    public abstract ListenableWorker mo6838a(Context context, String str, WorkerParameters workerParameters);

    /* renamed from: b */
    public final ListenableWorker mo6839b(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker a = mo6838a(context, str, workerParameters);
        if (a == null) {
            Class<? extends U> cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                C1405l c = C1405l.m7460c();
                String str2 = f5480a;
                c.mo6817b(str2, "Invalid class: " + str, th);
            }
            if (cls != null) {
                try {
                    a = (ListenableWorker) cls.getDeclaredConstructor(new Class[]{Context.class, WorkerParameters.class}).newInstance(new Object[]{context, workerParameters});
                } catch (Throwable th2) {
                    C1405l c2 = C1405l.m7460c();
                    String str3 = f5480a;
                    c2.mo6817b(str3, "Could not instantiate " + str, th2);
                }
            }
        }
        if (a == null || !a.isUsed()) {
            return a;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", new Object[]{getClass().getName(), str}));
    }
}
