package com.bumptech.glide.load.p030n;

import com.bumptech.glide.load.C1744a;
import com.bumptech.glide.load.C1746c;

/* renamed from: com.bumptech.glide.load.n.j */
/* compiled from: DiskCacheStrategy */
public abstract class C1873j {

    /* renamed from: a */
    public static final C1873j f6766a = new C1874a();

    /* renamed from: b */
    public static final C1873j f6767b = new C1875b();

    /* renamed from: c */
    public static final C1873j f6768c = new C1876c();

    /* renamed from: com.bumptech.glide.load.n.j$a */
    /* compiled from: DiskCacheStrategy */
    class C1874a extends C1873j {
        C1874a() {
        }

        /* renamed from: a */
        public boolean mo7924a() {
            return false;
        }

        /* renamed from: b */
        public boolean mo7925b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo7926c(C1744a aVar) {
            return false;
        }

        /* renamed from: d */
        public boolean mo7927d(boolean z, C1744a aVar, C1746c cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$b */
    /* compiled from: DiskCacheStrategy */
    class C1875b extends C1873j {
        C1875b() {
        }

        /* renamed from: a */
        public boolean mo7924a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo7925b() {
            return false;
        }

        /* renamed from: c */
        public boolean mo7926c(C1744a aVar) {
            return (aVar == C1744a.DATA_DISK_CACHE || aVar == C1744a.MEMORY_CACHE) ? false : true;
        }

        /* renamed from: d */
        public boolean mo7927d(boolean z, C1744a aVar, C1746c cVar) {
            return false;
        }
    }

    /* renamed from: com.bumptech.glide.load.n.j$c */
    /* compiled from: DiskCacheStrategy */
    class C1876c extends C1873j {
        C1876c() {
        }

        /* renamed from: a */
        public boolean mo7924a() {
            return true;
        }

        /* renamed from: b */
        public boolean mo7925b() {
            return true;
        }

        /* renamed from: c */
        public boolean mo7926c(C1744a aVar) {
            return aVar == C1744a.REMOTE;
        }

        /* renamed from: d */
        public boolean mo7927d(boolean z, C1744a aVar, C1746c cVar) {
            return ((z && aVar == C1744a.DATA_DISK_CACHE) || aVar == C1744a.LOCAL) && cVar == C1746c.TRANSFORMED;
        }
    }

    /* renamed from: a */
    public abstract boolean mo7924a();

    /* renamed from: b */
    public abstract boolean mo7925b();

    /* renamed from: c */
    public abstract boolean mo7926c(C1744a aVar);

    /* renamed from: d */
    public abstract boolean mo7927d(boolean z, C1744a aVar, C1746c cVar);
}
