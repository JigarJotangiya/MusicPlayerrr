package com.bumptech.glide.p051s.p052l;

/* renamed from: com.bumptech.glide.s.l.c */
/* compiled from: StateVerifier */
public abstract class C2205c {

    /* renamed from: com.bumptech.glide.s.l.c$b */
    /* compiled from: StateVerifier */
    private static class C2207b extends C2205c {

        /* renamed from: a */
        private volatile boolean f7447a;

        C2207b() {
            super();
        }

        /* renamed from: b */
        public void mo8514b(boolean z) {
            this.f7447a = z;
        }

        /* renamed from: c */
        public void mo8515c() {
            if (this.f7447a) {
                throw new IllegalStateException("Already released");
            }
        }
    }

    /* renamed from: a */
    public static C2205c m10314a() {
        return new C2207b();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public abstract void mo8514b(boolean z);

    /* renamed from: c */
    public abstract void mo8515c();

    private C2205c() {
    }
}
