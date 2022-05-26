package com.bumptech.glide.p051s;

import java.util.concurrent.Executor;

/* renamed from: com.bumptech.glide.s.e */
/* compiled from: Executors */
public final class C2185e {

    /* renamed from: a */
    private static final Executor f7427a = new C2186a();

    /* renamed from: b */
    private static final Executor f7428b = new C2187b();

    /* renamed from: com.bumptech.glide.s.e$a */
    /* compiled from: Executors */
    class C2186a implements Executor {
        C2186a() {
        }

        public void execute(Runnable runnable) {
            C2194k.m10291u(runnable);
        }
    }

    /* renamed from: com.bumptech.glide.s.e$b */
    /* compiled from: Executors */
    class C2187b implements Executor {
        C2187b() {
        }

        public void execute(Runnable runnable) {
            runnable.run();
        }
    }

    /* renamed from: a */
    public static Executor m10250a() {
        return f7428b;
    }

    /* renamed from: b */
    public static Executor m10251b() {
        return f7427a;
    }
}
