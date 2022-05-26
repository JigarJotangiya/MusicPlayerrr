package androidx.work;

import android.os.Build;
import androidx.work.impl.C1245a;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: androidx.work.b */
/* compiled from: Configuration */
public final class C1228b {

    /* renamed from: a */
    final Executor f5000a;

    /* renamed from: b */
    final Executor f5001b;

    /* renamed from: c */
    final C1425x f5002c;

    /* renamed from: d */
    final C1403k f5003d;

    /* renamed from: e */
    final C1419s f5004e;

    /* renamed from: f */
    final C1241i f5005f;

    /* renamed from: g */
    final String f5006g;

    /* renamed from: h */
    final int f5007h;

    /* renamed from: i */
    final int f5008i;

    /* renamed from: j */
    final int f5009j;

    /* renamed from: k */
    final int f5010k;

    /* renamed from: androidx.work.b$a */
    /* compiled from: Configuration */
    class C1229a implements ThreadFactory {

        /* renamed from: a */
        private final AtomicInteger f5011a = new AtomicInteger(0);

        /* renamed from: b */
        final /* synthetic */ boolean f5012b;

        C1229a(C1228b bVar, boolean z) {
            this.f5012b = z;
        }

        public Thread newThread(Runnable runnable) {
            String str = this.f5012b ? "WM.task-" : "androidx.work-";
            return new Thread(runnable, str + this.f5011a.incrementAndGet());
        }
    }

    /* renamed from: androidx.work.b$b */
    /* compiled from: Configuration */
    public static final class C1230b {

        /* renamed from: a */
        Executor f5013a;

        /* renamed from: b */
        C1425x f5014b;

        /* renamed from: c */
        C1403k f5015c;

        /* renamed from: d */
        Executor f5016d;

        /* renamed from: e */
        C1419s f5017e;

        /* renamed from: f */
        C1241i f5018f;

        /* renamed from: g */
        String f5019g;

        /* renamed from: h */
        int f5020h = 4;

        /* renamed from: i */
        int f5021i = 0;

        /* renamed from: j */
        int f5022j = Integer.MAX_VALUE;

        /* renamed from: k */
        int f5023k = 20;

        /* renamed from: a */
        public C1228b mo6471a() {
            return new C1228b(this);
        }
    }

    /* renamed from: androidx.work.b$c */
    /* compiled from: Configuration */
    public interface C1231c {
        /* renamed from: a */
        C1228b mo6472a();
    }

    C1228b(C1230b bVar) {
        Executor executor = bVar.f5013a;
        if (executor == null) {
            this.f5000a = m6858a(false);
        } else {
            this.f5000a = executor;
        }
        Executor executor2 = bVar.f5016d;
        if (executor2 == null) {
            this.f5001b = m6858a(true);
        } else {
            this.f5001b = executor2;
        }
        C1425x xVar = bVar.f5014b;
        if (xVar == null) {
            this.f5002c = C1425x.m7496c();
        } else {
            this.f5002c = xVar;
        }
        C1403k kVar = bVar.f5015c;
        if (kVar == null) {
            this.f5003d = C1403k.m7456c();
        } else {
            this.f5003d = kVar;
        }
        C1419s sVar = bVar.f5017e;
        if (sVar == null) {
            this.f5004e = new C1245a();
        } else {
            this.f5004e = sVar;
        }
        this.f5007h = bVar.f5020h;
        this.f5008i = bVar.f5021i;
        this.f5009j = bVar.f5022j;
        this.f5010k = bVar.f5023k;
        this.f5005f = bVar.f5018f;
        this.f5006g = bVar.f5019g;
    }

    /* renamed from: a */
    private Executor m6858a(boolean z) {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), m6859b(z));
    }

    /* renamed from: b */
    private ThreadFactory m6859b(boolean z) {
        return new C1229a(this, z);
    }

    /* renamed from: c */
    public String mo6459c() {
        return this.f5006g;
    }

    /* renamed from: d */
    public C1241i mo6460d() {
        return this.f5005f;
    }

    /* renamed from: e */
    public Executor mo6461e() {
        return this.f5000a;
    }

    /* renamed from: f */
    public C1403k mo6462f() {
        return this.f5003d;
    }

    /* renamed from: g */
    public int mo6463g() {
        return this.f5009j;
    }

    /* renamed from: h */
    public int mo6464h() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.f5010k / 2;
        }
        return this.f5010k;
    }

    /* renamed from: i */
    public int mo6465i() {
        return this.f5008i;
    }

    /* renamed from: j */
    public int mo6466j() {
        return this.f5007h;
    }

    /* renamed from: k */
    public C1419s mo6467k() {
        return this.f5004e;
    }

    /* renamed from: l */
    public Executor mo6468l() {
        return this.f5001b;
    }

    /* renamed from: m */
    public C1425x mo6469m() {
        return this.f5002c;
    }
}
