package androidx.work.impl.utils;

import androidx.work.WorkerParameters;
import androidx.work.impl.C1285j;

/* renamed from: androidx.work.impl.utils.h */
/* compiled from: StartWorkRunnable */
public class C1370h implements Runnable {

    /* renamed from: g */
    private C1285j f5377g;

    /* renamed from: h */
    private String f5378h;

    /* renamed from: i */
    private WorkerParameters.C1226a f5379i;

    public C1370h(C1285j jVar, String str, WorkerParameters.C1226a aVar) {
        this.f5377g = jVar;
        this.f5378h = str;
        this.f5379i = aVar;
    }

    public void run() {
        this.f5377g.mo6609m().mo6574k(this.f5378h, this.f5379i);
    }
}
