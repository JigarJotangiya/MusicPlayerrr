package androidx.recyclerview.widget;

import androidx.recyclerview.widget.C0865h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* renamed from: androidx.recyclerview.widget.c */
/* compiled from: AsyncDifferConfig */
public final class C0842c<T> {

    /* renamed from: a */
    private final Executor f3807a;

    /* renamed from: b */
    private final Executor f3808b;

    /* renamed from: c */
    private final C0865h.C0871f<T> f3809c;

    /* renamed from: androidx.recyclerview.widget.c$a */
    /* compiled from: AsyncDifferConfig */
    public static final class C0843a<T> {

        /* renamed from: d */
        private static final Object f3810d = new Object();

        /* renamed from: e */
        private static Executor f3811e;

        /* renamed from: a */
        private Executor f3812a;

        /* renamed from: b */
        private Executor f3813b;

        /* renamed from: c */
        private final C0865h.C0871f<T> f3814c;

        public C0843a(C0865h.C0871f<T> fVar) {
            this.f3814c = fVar;
        }

        /* renamed from: a */
        public C0842c<T> mo5196a() {
            if (this.f3813b == null) {
                synchronized (f3810d) {
                    if (f3811e == null) {
                        f3811e = Executors.newFixedThreadPool(2);
                    }
                }
                this.f3813b = f3811e;
            }
            return new C0842c<>(this.f3812a, this.f3813b, this.f3814c);
        }
    }

    C0842c(Executor executor, Executor executor2, C0865h.C0871f<T> fVar) {
        this.f3807a = executor;
        this.f3808b = executor2;
        this.f3809c = fVar;
    }

    /* renamed from: a */
    public Executor mo5193a() {
        return this.f3808b;
    }

    /* renamed from: b */
    public C0865h.C0871f<T> mo5194b() {
        return this.f3809c;
    }

    /* renamed from: c */
    public Executor mo5195c() {
        return this.f3807a;
    }
}
