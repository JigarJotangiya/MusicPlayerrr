package androidx.room;

import android.annotation.SuppressLint;
import androidx.lifecycle.LiveData;
import androidx.room.C0967k0;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import p082e.p091b.p092a.p093a.C3445a;

/* renamed from: androidx.room.w0 */
/* compiled from: RoomTrackingLiveData */
class C1010w0<T> extends LiveData<T> {

    /* renamed from: l */
    final C0994s0 f4285l;

    /* renamed from: m */
    final boolean f4286m;

    /* renamed from: n */
    final Callable<T> f4287n;

    /* renamed from: o */
    private final C0965j0 f4288o;

    /* renamed from: p */
    final C0967k0.C0970c f4289p;

    /* renamed from: q */
    final AtomicBoolean f4290q = new AtomicBoolean(true);

    /* renamed from: r */
    final AtomicBoolean f4291r = new AtomicBoolean(false);

    /* renamed from: s */
    final AtomicBoolean f4292s = new AtomicBoolean(false);

    /* renamed from: t */
    final Runnable f4293t = new C1011a();

    /* renamed from: u */
    final Runnable f4294u = new C1012b();

    /* renamed from: androidx.room.w0$a */
    /* compiled from: RoomTrackingLiveData */
    class C1011a implements Runnable {
        C1011a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005c  */
        /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r5 = this;
                androidx.room.w0 r0 = androidx.room.C1010w0.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4292s
                r1 = 0
                r2 = 1
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x001b
                androidx.room.w0 r0 = androidx.room.C1010w0.this
                androidx.room.s0 r0 = r0.f4285l
                androidx.room.k0 r0 = r0.mo5583j()
                androidx.room.w0 r3 = androidx.room.C1010w0.this
                androidx.room.k0$c r3 = r3.f4289p
                r0.mo5495b(r3)
            L_0x001b:
                androidx.room.w0 r0 = androidx.room.C1010w0.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4291r
                boolean r0 = r0.compareAndSet(r1, r2)
                if (r0 == 0) goto L_0x005c
                r0 = 0
                r3 = 0
            L_0x0027:
                androidx.room.w0 r4 = androidx.room.C1010w0.this     // Catch:{ all -> 0x0053 }
                java.util.concurrent.atomic.AtomicBoolean r4 = r4.f4290q     // Catch:{ all -> 0x0053 }
                boolean r4 = r4.compareAndSet(r2, r1)     // Catch:{ all -> 0x0053 }
                if (r4 == 0) goto L_0x0044
                androidx.room.w0 r0 = androidx.room.C1010w0.this     // Catch:{ Exception -> 0x003b }
                java.util.concurrent.Callable<T> r0 = r0.f4287n     // Catch:{ Exception -> 0x003b }
                java.lang.Object r0 = r0.call()     // Catch:{ Exception -> 0x003b }
                r3 = 1
                goto L_0x0027
            L_0x003b:
                r0 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch:{ all -> 0x0053 }
                java.lang.String r3 = "Exception while computing database live data."
                r2.<init>(r3, r0)     // Catch:{ all -> 0x0053 }
                throw r2     // Catch:{ all -> 0x0053 }
            L_0x0044:
                if (r3 == 0) goto L_0x004b
                androidx.room.w0 r4 = androidx.room.C1010w0.this     // Catch:{ all -> 0x0053 }
                r4.mo4153l(r0)     // Catch:{ all -> 0x0053 }
            L_0x004b:
                androidx.room.w0 r0 = androidx.room.C1010w0.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4291r
                r0.set(r1)
                goto L_0x005d
            L_0x0053:
                r0 = move-exception
                androidx.room.w0 r2 = androidx.room.C1010w0.this
                java.util.concurrent.atomic.AtomicBoolean r2 = r2.f4291r
                r2.set(r1)
                throw r0
            L_0x005c:
                r3 = 0
            L_0x005d:
                if (r3 == 0) goto L_0x0069
                androidx.room.w0 r0 = androidx.room.C1010w0.this
                java.util.concurrent.atomic.AtomicBoolean r0 = r0.f4290q
                boolean r0 = r0.get()
                if (r0 != 0) goto L_0x001b
            L_0x0069:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.room.C1010w0.C1011a.run():void");
        }
    }

    /* renamed from: androidx.room.w0$b */
    /* compiled from: RoomTrackingLiveData */
    class C1012b implements Runnable {
        C1012b() {
        }

        public void run() {
            boolean g = C1010w0.this.mo4148g();
            if (C1010w0.this.f4290q.compareAndSet(false, true) && g) {
                C1010w0.this.mo5628q().execute(C1010w0.this.f4293t);
            }
        }
    }

    /* renamed from: androidx.room.w0$c */
    /* compiled from: RoomTrackingLiveData */
    class C1013c extends C0967k0.C0970c {
        C1013c(String[] strArr) {
            super(strArr);
        }

        /* renamed from: b */
        public void mo5514b(Set<String> set) {
            C3445a.m14718f().mo12233b(C1010w0.this.f4294u);
        }
    }

    @SuppressLint({"RestrictedApi"})
    C1010w0(C0994s0 s0Var, C0965j0 j0Var, boolean z, Callable<T> callable, String[] strArr) {
        this.f4285l = s0Var;
        this.f4286m = z;
        this.f4287n = callable;
        this.f4288o = j0Var;
        this.f4289p = new C1013c(strArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo4151j() {
        super.mo4151j();
        this.f4288o.mo5491b(this);
        mo5628q().execute(this.f4293t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo4152k() {
        super.mo4152k();
        this.f4288o.mo5492c(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public Executor mo5628q() {
        if (this.f4286m) {
            return this.f4285l.mo5587n();
        }
        return this.f4285l.mo5585l();
    }
}
