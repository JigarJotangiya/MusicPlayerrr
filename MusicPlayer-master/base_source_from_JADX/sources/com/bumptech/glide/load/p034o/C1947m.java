package com.bumptech.glide.load.p034o;

import com.bumptech.glide.p051s.C2189g;
import com.bumptech.glide.p051s.C2194k;
import java.util.Queue;

/* renamed from: com.bumptech.glide.load.o.m */
/* compiled from: ModelCache */
public class C1947m<A, B> {

    /* renamed from: a */
    private final C2189g<C1949b<A>, B> f6925a;

    /* renamed from: com.bumptech.glide.load.o.m$a */
    /* compiled from: ModelCache */
    class C1948a extends C2189g<C1949b<A>, B> {
        C1948a(C1947m mVar, long j) {
            super(j);
        }

        /* access modifiers changed from: protected */
        /* renamed from: n */
        public void mo7835j(C1949b<A> bVar, B b) {
            bVar.mo8051c();
        }
    }

    /* renamed from: com.bumptech.glide.load.o.m$b */
    /* compiled from: ModelCache */
    static final class C1949b<A> {

        /* renamed from: d */
        private static final Queue<C1949b<?>> f6926d = C2194k.m10276f(0);

        /* renamed from: a */
        private int f6927a;

        /* renamed from: b */
        private int f6928b;

        /* renamed from: c */
        private A f6929c;

        private C1949b() {
        }

        /* renamed from: a */
        static <A> C1949b<A> m9325a(A a, int i, int i2) {
            C1949b<A> poll;
            Queue<C1949b<?>> queue = f6926d;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new C1949b<>();
            }
            poll.m9326b(a, i, i2);
            return poll;
        }

        /* renamed from: b */
        private void m9326b(A a, int i, int i2) {
            this.f6929c = a;
            this.f6928b = i;
            this.f6927a = i2;
        }

        /* renamed from: c */
        public void mo8051c() {
            Queue<C1949b<?>> queue = f6926d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof C1949b)) {
                return false;
            }
            C1949b bVar = (C1949b) obj;
            if (this.f6928b == bVar.f6928b && this.f6927a == bVar.f6927a && this.f6929c.equals(bVar.f6929c)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (((this.f6927a * 31) + this.f6928b) * 31) + this.f6929c.hashCode();
        }
    }

    public C1947m(long j) {
        this.f6925a = new C1948a(this, j);
    }

    /* renamed from: a */
    public B mo8048a(A a, int i, int i2) {
        C1949b a2 = C1949b.m9325a(a, i, i2);
        B g = this.f6925a.mo8494g(a2);
        a2.mo8051c();
        return g;
    }

    /* renamed from: b */
    public void mo8049b(A a, int i, int i2, B b) {
        this.f6925a.mo8496k(C1949b.m9325a(a, i, i2), b);
    }
}
