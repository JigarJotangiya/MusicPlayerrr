package com.bumptech.glide.p047q;

/* renamed from: com.bumptech.glide.q.e */
/* compiled from: RequestCoordinator */
public interface C2148e {

    /* renamed from: com.bumptech.glide.q.e$a */
    /* compiled from: RequestCoordinator */
    public enum C2149a {
        RUNNING(false),
        PAUSED(false),
        CLEARED(false),
        SUCCESS(true),
        FAILED(true);
        
        private final boolean isComplete;

        private C2149a(boolean z) {
            this.isComplete = z;
        }

        /* access modifiers changed from: package-private */
        public boolean isComplete() {
            return this.isComplete;
        }
    }

    /* renamed from: a */
    C2148e mo8412a();

    /* renamed from: b */
    boolean mo8413b();

    /* renamed from: c */
    void mo8414c(C2147d dVar);

    /* renamed from: e */
    boolean mo8417e(C2147d dVar);

    /* renamed from: g */
    boolean mo8419g(C2147d dVar);

    /* renamed from: i */
    void mo8421i(C2147d dVar);

    /* renamed from: k */
    boolean mo8424k(C2147d dVar);
}
