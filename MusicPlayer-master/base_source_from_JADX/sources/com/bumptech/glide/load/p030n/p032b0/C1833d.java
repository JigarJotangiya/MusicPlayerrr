package com.bumptech.glide.load.p030n.p032b0;

import com.bumptech.glide.load.p030n.p032b0.C1826a;
import java.io.File;

/* renamed from: com.bumptech.glide.load.n.b0.d */
/* compiled from: DiskLruCacheFactory */
public class C1833d implements C1826a.C1827a {

    /* renamed from: a */
    private final long f6639a;

    /* renamed from: b */
    private final C1834a f6640b;

    /* renamed from: com.bumptech.glide.load.n.b0.d$a */
    /* compiled from: DiskLruCacheFactory */
    public interface C1834a {
        /* renamed from: a */
        File mo7829a();
    }

    public C1833d(C1834a aVar, long j) {
        this.f6639a = j;
        this.f6640b = aVar;
    }

    /* renamed from: d */
    public C1826a mo7823d() {
        File a = this.f6640b.mo7829a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return C1835e.m8972c(a, this.f6639a);
        }
        return null;
    }
}
