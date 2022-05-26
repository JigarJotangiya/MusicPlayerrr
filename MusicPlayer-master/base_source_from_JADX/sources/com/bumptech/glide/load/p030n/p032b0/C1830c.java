package com.bumptech.glide.load.p030n.p032b0;

import com.bumptech.glide.p051s.C2193j;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: com.bumptech.glide.load.n.b0.c */
/* compiled from: DiskCacheWriteLocker */
final class C1830c {

    /* renamed from: a */
    private final Map<String, C1831a> f6634a = new HashMap();

    /* renamed from: b */
    private final C1832b f6635b = new C1832b();

    /* renamed from: com.bumptech.glide.load.n.b0.c$a */
    /* compiled from: DiskCacheWriteLocker */
    private static class C1831a {

        /* renamed from: a */
        final Lock f6636a = new ReentrantLock();

        /* renamed from: b */
        int f6637b;

        C1831a() {
        }
    }

    /* renamed from: com.bumptech.glide.load.n.b0.c$b */
    /* compiled from: DiskCacheWriteLocker */
    private static class C1832b {

        /* renamed from: a */
        private final Queue<C1831a> f6638a = new ArrayDeque();

        C1832b() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public C1831a mo7827a() {
            C1831a poll;
            synchronized (this.f6638a) {
                poll = this.f6638a.poll();
            }
            return poll == null ? new C1831a() : poll;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo7828b(C1831a aVar) {
            synchronized (this.f6638a) {
                if (this.f6638a.size() < 10) {
                    this.f6638a.offer(aVar);
                }
            }
        }
    }

    C1830c() {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo7825a(String str) {
        C1831a aVar;
        synchronized (this) {
            aVar = this.f6634a.get(str);
            if (aVar == null) {
                aVar = this.f6635b.mo7827a();
                this.f6634a.put(str, aVar);
            }
            aVar.f6637b++;
        }
        aVar.f6636a.lock();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7826b(String str) {
        C1831a aVar;
        synchronized (this) {
            C1831a aVar2 = this.f6634a.get(str);
            C2193j.m10269d(aVar2);
            aVar = aVar2;
            int i = aVar.f6637b;
            if (i >= 1) {
                int i2 = i - 1;
                aVar.f6637b = i2;
                if (i2 == 0) {
                    C1831a remove = this.f6634a.remove(str);
                    if (remove.equals(aVar)) {
                        this.f6635b.mo7828b(remove);
                    } else {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                }
            } else {
                throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f6637b);
            }
        }
        aVar.f6636a.unlock();
    }
}
