package com.airbnb.lottie.p015t.p016b;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.p019v.p021k.C1588i;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
/* renamed from: com.airbnb.lottie.t.b.l */
/* compiled from: MergePathsContent */
public class C1519l implements C1521m, C1517j {

    /* renamed from: a */
    private final Path f5848a = new Path();

    /* renamed from: b */
    private final Path f5849b = new Path();

    /* renamed from: c */
    private final Path f5850c = new Path();

    /* renamed from: d */
    private final List<C1521m> f5851d = new ArrayList();

    /* renamed from: e */
    private final C1588i f5852e;

    /* renamed from: com.airbnb.lottie.t.b.l$a */
    /* compiled from: MergePathsContent */
    static /* synthetic */ class C1520a {

        /* renamed from: a */
        static final /* synthetic */ int[] f5853a;

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
                com.airbnb.lottie.v.k.i$a[] r0 = com.airbnb.lottie.p019v.p021k.C1588i.C1589a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f5853a = r0
                com.airbnb.lottie.v.k.i$a r1 = com.airbnb.lottie.p019v.p021k.C1588i.C1589a.MERGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f5853a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.airbnb.lottie.v.k.i$a r1 = com.airbnb.lottie.p019v.p021k.C1588i.C1589a.ADD     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f5853a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.airbnb.lottie.v.k.i$a r1 = com.airbnb.lottie.p019v.p021k.C1588i.C1589a.SUBTRACT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f5853a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.airbnb.lottie.v.k.i$a r1 = com.airbnb.lottie.p019v.p021k.C1588i.C1589a.INTERSECT     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = f5853a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.airbnb.lottie.v.k.i$a r1 = com.airbnb.lottie.p019v.p021k.C1588i.C1589a.EXCLUDE_INTERSECTIONS     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p015t.p016b.C1519l.C1520a.<clinit>():void");
        }
    }

    public C1519l(C1588i iVar) {
        if (Build.VERSION.SDK_INT >= 19) {
            iVar.mo7297c();
            this.f5852e = iVar;
            return;
        }
        throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
    }

    /* renamed from: a */
    private void m7826a() {
        for (int i = 0; i < this.f5851d.size(); i++) {
            this.f5850c.addPath(this.f5851d.get(i).getPath());
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    private void m7827c(Path.Op op) {
        this.f5849b.reset();
        this.f5848a.reset();
        for (int size = this.f5851d.size() - 1; size >= 1; size--) {
            C1521m mVar = this.f5851d.get(size);
            if (mVar instanceof C1511d) {
                C1511d dVar = (C1511d) mVar;
                List<C1521m> i = dVar.mo7142i();
                for (int size2 = i.size() - 1; size2 >= 0; size2--) {
                    Path path = i.get(size2).getPath();
                    path.transform(dVar.mo7143j());
                    this.f5849b.addPath(path);
                }
            } else {
                this.f5849b.addPath(mVar.getPath());
            }
        }
        C1521m mVar2 = this.f5851d.get(0);
        if (mVar2 instanceof C1511d) {
            C1511d dVar2 = (C1511d) mVar2;
            List<C1521m> i2 = dVar2.mo7142i();
            for (int i3 = 0; i3 < i2.size(); i3++) {
                Path path2 = i2.get(i3).getPath();
                path2.transform(dVar2.mo7143j());
                this.f5848a.addPath(path2);
            }
        } else {
            this.f5848a.set(mVar2.getPath());
        }
        this.f5850c.op(this.f5848a, this.f5849b, op);
    }

    /* renamed from: b */
    public void mo7133b(List<C1510c> list, List<C1510c> list2) {
        for (int i = 0; i < this.f5851d.size(); i++) {
            this.f5851d.get(i).mo7133b(list, list2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP:0: B:0:0x0000->B:3:0x000a, LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo7144e(java.util.ListIterator<com.airbnb.lottie.p015t.p016b.C1510c> r3) {
        /*
            r2 = this;
        L_0x0000:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x000d
            java.lang.Object r0 = r3.previous()
            if (r0 == r2) goto L_0x000d
            goto L_0x0000
        L_0x000d:
            boolean r0 = r3.hasPrevious()
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r3.previous()
            com.airbnb.lottie.t.b.c r0 = (com.airbnb.lottie.p015t.p016b.C1510c) r0
            boolean r1 = r0 instanceof com.airbnb.lottie.p015t.p016b.C1521m
            if (r1 == 0) goto L_0x000d
            java.util.List<com.airbnb.lottie.t.b.m> r1 = r2.f5851d
            com.airbnb.lottie.t.b.m r0 = (com.airbnb.lottie.p015t.p016b.C1521m) r0
            r1.add(r0)
            r3.remove()
            goto L_0x000d
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.p015t.p016b.C1519l.mo7144e(java.util.ListIterator):void");
    }

    public Path getPath() {
        this.f5850c.reset();
        if (this.f5852e.mo7298d()) {
            return this.f5850c;
        }
        int i = C1520a.f5853a[this.f5852e.mo7296b().ordinal()];
        if (i == 1) {
            m7826a();
        } else if (i == 2) {
            m7827c(Path.Op.UNION);
        } else if (i == 3) {
            m7827c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i == 4) {
            m7827c(Path.Op.INTERSECT);
        } else if (i == 5) {
            m7827c(Path.Op.XOR);
        }
        return this.f5850c;
    }
}
