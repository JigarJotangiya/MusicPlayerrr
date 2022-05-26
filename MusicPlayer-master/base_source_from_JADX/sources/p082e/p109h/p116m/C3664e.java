package p082e.p109h.p116m;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import p082e.p098e.C3471e;
import p082e.p098e.C3478g;
import p082e.p109h.p110h.C3626d;
import p082e.p109h.p116m.C3670f;
import p082e.p109h.p118o.C3695a;

/* renamed from: e.h.m.e */
/* compiled from: FontRequestWorker */
class C3664e {

    /* renamed from: a */
    static final C3471e<String, Typeface> f11639a = new C3471e<>(16);

    /* renamed from: b */
    private static final ExecutorService f11640b = C3674g.m15759a("fonts-androidx", 10, 10000);

    /* renamed from: c */
    static final Object f11641c = new Object();

    /* renamed from: d */
    static final C3478g<String, ArrayList<C3695a<C3669e>>> f11642d = new C3478g<>();

    /* renamed from: e.h.m.e$a */
    /* compiled from: FontRequestWorker */
    class C3665a implements Callable<C3669e> {

        /* renamed from: a */
        final /* synthetic */ String f11643a;

        /* renamed from: b */
        final /* synthetic */ Context f11644b;

        /* renamed from: c */
        final /* synthetic */ C3663d f11645c;

        /* renamed from: d */
        final /* synthetic */ int f11646d;

        C3665a(String str, Context context, C3663d dVar, int i) {
            this.f11643a = str;
            this.f11644b = context;
            this.f11645c = dVar;
            this.f11646d = i;
        }

        /* renamed from: a */
        public C3669e call() {
            return C3664e.m15739c(this.f11643a, this.f11644b, this.f11645c, this.f11646d);
        }
    }

    /* renamed from: e.h.m.e$b */
    /* compiled from: FontRequestWorker */
    class C3666b implements C3695a<C3669e> {

        /* renamed from: a */
        final /* synthetic */ C3657a f11647a;

        C3666b(C3657a aVar) {
            this.f11647a = aVar;
        }

        /* renamed from: a */
        public void accept(C3669e eVar) {
            this.f11647a.mo12925b(eVar);
        }
    }

    /* renamed from: e.h.m.e$c */
    /* compiled from: FontRequestWorker */
    class C3667c implements Callable<C3669e> {

        /* renamed from: a */
        final /* synthetic */ String f11648a;

        /* renamed from: b */
        final /* synthetic */ Context f11649b;

        /* renamed from: c */
        final /* synthetic */ C3663d f11650c;

        /* renamed from: d */
        final /* synthetic */ int f11651d;

        C3667c(String str, Context context, C3663d dVar, int i) {
            this.f11648a = str;
            this.f11649b = context;
            this.f11650c = dVar;
            this.f11651d = i;
        }

        /* renamed from: a */
        public C3669e call() {
            return C3664e.m15739c(this.f11648a, this.f11649b, this.f11650c, this.f11651d);
        }
    }

    /* renamed from: e.h.m.e$d */
    /* compiled from: FontRequestWorker */
    class C3668d implements C3695a<C3669e> {

        /* renamed from: a */
        final /* synthetic */ String f11652a;

        C3668d(String str) {
            this.f11652a = str;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
            if (r0 >= r2.size()) goto L_0x002a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
            ((p082e.p109h.p118o.C3695a) r2.get(r0)).accept(r5);
            r0 = r0 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
            r0 = 0;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void accept(p082e.p109h.p116m.C3664e.C3669e r5) {
            /*
                r4 = this;
                java.lang.Object r0 = p082e.p109h.p116m.C3664e.f11641c
                monitor-enter(r0)
                e.e.g<java.lang.String, java.util.ArrayList<e.h.o.a<e.h.m.e$e>>> r1 = p082e.p109h.p116m.C3664e.f11642d     // Catch:{ all -> 0x002b }
                java.lang.String r2 = r4.f11652a     // Catch:{ all -> 0x002b }
                java.lang.Object r2 = r1.get(r2)     // Catch:{ all -> 0x002b }
                java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch:{ all -> 0x002b }
                if (r2 != 0) goto L_0x0011
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                return
            L_0x0011:
                java.lang.String r3 = r4.f11652a     // Catch:{ all -> 0x002b }
                r1.remove(r3)     // Catch:{ all -> 0x002b }
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                r0 = 0
            L_0x0018:
                int r1 = r2.size()
                if (r0 >= r1) goto L_0x002a
                java.lang.Object r1 = r2.get(r0)
                e.h.o.a r1 = (p082e.p109h.p118o.C3695a) r1
                r1.accept(r5)
                int r0 = r0 + 1
                goto L_0x0018
            L_0x002a:
                return
            L_0x002b:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x002b }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p116m.C3664e.C3668d.accept(e.h.m.e$e):void");
        }
    }

    /* renamed from: a */
    private static String m15737a(C3663d dVar, int i) {
        return dVar.mo12932d() + "-" + i;
    }

    @SuppressLint({"WrongConstant"})
    /* renamed from: b */
    private static int m15738b(C3670f.C3671a aVar) {
        int i = 1;
        if (aVar.mo12946c() == 0) {
            C3670f.C3672b[] b = aVar.mo12945b();
            if (!(b == null || b.length == 0)) {
                int length = b.length;
                i = 0;
                int i2 = 0;
                while (i2 < length) {
                    int b2 = b[i2].mo12947b();
                    if (b2 == 0) {
                        i2++;
                    } else if (b2 < 0) {
                        return -3;
                    } else {
                        return b2;
                    }
                }
            }
            return i;
        } else if (aVar.mo12946c() != 1) {
            return -3;
        } else {
            return -2;
        }
    }

    /* renamed from: c */
    static C3669e m15739c(String str, Context context, C3663d dVar, int i) {
        C3471e<String, Typeface> eVar = f11639a;
        Typeface d = eVar.mo12318d(str);
        if (d != null) {
            return new C3669e(d);
        }
        try {
            C3670f.C3671a d2 = C3661c.m15726d(context, dVar, (CancellationSignal) null);
            int b = m15738b(d2);
            if (b != 0) {
                return new C3669e(b);
            }
            Typeface b2 = C3626d.m15617b(context, (CancellationSignal) null, d2.mo12945b(), i);
            if (b2 == null) {
                return new C3669e(-3);
            }
            eVar.mo12319e(str, b2);
            return new C3669e(b2);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C3669e(-1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003b, code lost:
        r9 = new p082e.p109h.p116m.C3664e.C3667c(r0, r5, r6, r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0040, code lost:
        if (r8 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        r8 = f11640b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        p082e.p109h.p116m.C3674g.m15760b(r8, r9, new p082e.p109h.p116m.C3664e.C3668d(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004c, code lost:
        return null;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static android.graphics.Typeface m15740d(android.content.Context r5, p082e.p109h.p116m.C3663d r6, int r7, java.util.concurrent.Executor r8, p082e.p109h.p116m.C3657a r9) {
        /*
            java.lang.String r0 = m15737a(r6, r7)
            e.e.e<java.lang.String, android.graphics.Typeface> r1 = f11639a
            java.lang.Object r1 = r1.mo12318d(r0)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L_0x0017
            e.h.m.e$e r5 = new e.h.m.e$e
            r5.<init>((android.graphics.Typeface) r1)
            r9.mo12925b(r5)
            return r1
        L_0x0017:
            e.h.m.e$b r1 = new e.h.m.e$b
            r1.<init>(r9)
            java.lang.Object r9 = f11641c
            monitor-enter(r9)
            e.e.g<java.lang.String, java.util.ArrayList<e.h.o.a<e.h.m.e$e>>> r2 = f11642d     // Catch:{ all -> 0x004d }
            java.lang.Object r3 = r2.get(r0)     // Catch:{ all -> 0x004d }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x004d }
            r4 = 0
            if (r3 == 0) goto L_0x002f
            r3.add(r1)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            return r4
        L_0x002f:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x004d }
            r3.<init>()     // Catch:{ all -> 0x004d }
            r3.add(r1)     // Catch:{ all -> 0x004d }
            r2.put(r0, r3)     // Catch:{ all -> 0x004d }
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            e.h.m.e$c r9 = new e.h.m.e$c
            r9.<init>(r0, r5, r6, r7)
            if (r8 != 0) goto L_0x0044
            java.util.concurrent.ExecutorService r8 = f11640b
        L_0x0044:
            e.h.m.e$d r5 = new e.h.m.e$d
            r5.<init>(r0)
            p082e.p109h.p116m.C3674g.m15760b(r8, r9, r5)
            return r4
        L_0x004d:
            r5 = move-exception
            monitor-exit(r9)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p109h.p116m.C3664e.m15740d(android.content.Context, e.h.m.d, int, java.util.concurrent.Executor, e.h.m.a):android.graphics.Typeface");
    }

    /* renamed from: e */
    static Typeface m15741e(Context context, C3663d dVar, C3657a aVar, int i, int i2) {
        String a = m15737a(dVar, i);
        Typeface d = f11639a.mo12318d(a);
        if (d != null) {
            aVar.mo12925b(new C3669e(d));
            return d;
        } else if (i2 == -1) {
            C3669e c = m15739c(a, context, dVar, i);
            aVar.mo12925b(c);
            return c.f11653a;
        } else {
            try {
                C3669e eVar = (C3669e) C3674g.m15761c(f11640b, new C3665a(a, context, dVar, i), i2);
                aVar.mo12925b(eVar);
                return eVar.f11653a;
            } catch (InterruptedException unused) {
                aVar.mo12925b(new C3669e(-3));
                return null;
            }
        }
    }

    /* renamed from: e.h.m.e$e */
    /* compiled from: FontRequestWorker */
    static final class C3669e {

        /* renamed from: a */
        final Typeface f11653a;

        /* renamed from: b */
        final int f11654b;

        C3669e(int i) {
            this.f11653a = null;
            this.f11654b = i;
        }

        /* access modifiers changed from: package-private */
        @SuppressLint({"WrongConstant"})
        /* renamed from: a */
        public boolean mo12944a() {
            return this.f11654b == 0;
        }

        @SuppressLint({"WrongConstant"})
        C3669e(Typeface typeface) {
            this.f11653a = typeface;
            this.f11654b = 0;
        }
    }
}
