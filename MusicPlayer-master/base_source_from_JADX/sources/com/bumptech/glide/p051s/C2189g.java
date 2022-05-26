package com.bumptech.glide.p051s;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.bumptech.glide.s.g */
/* compiled from: LruCache */
public class C2189g<T, Y> {

    /* renamed from: a */
    private final Map<T, C2190a<Y>> f7430a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private long f7431b;

    /* renamed from: c */
    private long f7432c;

    /* renamed from: com.bumptech.glide.s.g$a */
    /* compiled from: LruCache */
    static final class C2190a<Y> {

        /* renamed from: a */
        final Y f7433a;

        /* renamed from: b */
        final int f7434b;

        C2190a(Y y, int i) {
            this.f7433a = y;
            this.f7434b = i;
        }
    }

    public C2189g(long j) {
        this.f7431b = j;
    }

    /* renamed from: f */
    private void m10254f() {
        mo8498m(this.f7431b);
    }

    /* renamed from: b */
    public void mo8493b() {
        mo8498m(0);
    }

    /* renamed from: g */
    public synchronized Y mo8494g(T t) {
        C2190a aVar;
        aVar = this.f7430a.get(t);
        return aVar != null ? aVar.f7433a : null;
    }

    /* renamed from: h */
    public synchronized long mo8495h() {
        return this.f7431b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public int mo7834i(Y y) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo7835j(T t, Y y) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0049, code lost:
        return r5;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized Y mo8496k(T r8, Y r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.mo7834i(r9)     // Catch:{ all -> 0x004a }
            long r1 = (long) r0     // Catch:{ all -> 0x004a }
            long r3 = r7.f7431b     // Catch:{ all -> 0x004a }
            r5 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L_0x0012
            r7.mo7835j(r8, r9)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r5
        L_0x0012:
            if (r9 == 0) goto L_0x0019
            long r3 = r7.f7432c     // Catch:{ all -> 0x004a }
            long r3 = r3 + r1
            r7.f7432c = r3     // Catch:{ all -> 0x004a }
        L_0x0019:
            java.util.Map<T, com.bumptech.glide.s.g$a<Y>> r1 = r7.f7430a     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x001f
            r2 = r5
            goto L_0x0024
        L_0x001f:
            com.bumptech.glide.s.g$a r2 = new com.bumptech.glide.s.g$a     // Catch:{ all -> 0x004a }
            r2.<init>(r9, r0)     // Catch:{ all -> 0x004a }
        L_0x0024:
            java.lang.Object r0 = r1.put(r8, r2)     // Catch:{ all -> 0x004a }
            com.bumptech.glide.s.g$a r0 = (com.bumptech.glide.p051s.C2189g.C2190a) r0     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0041
            long r1 = r7.f7432c     // Catch:{ all -> 0x004a }
            int r3 = r0.f7434b     // Catch:{ all -> 0x004a }
            long r3 = (long) r3     // Catch:{ all -> 0x004a }
            long r1 = r1 - r3
            r7.f7432c = r1     // Catch:{ all -> 0x004a }
            Y r1 = r0.f7433a     // Catch:{ all -> 0x004a }
            boolean r9 = r1.equals(r9)     // Catch:{ all -> 0x004a }
            if (r9 != 0) goto L_0x0041
            Y r9 = r0.f7433a     // Catch:{ all -> 0x004a }
            r7.mo7835j(r8, r9)     // Catch:{ all -> 0x004a }
        L_0x0041:
            r7.m10254f()     // Catch:{ all -> 0x004a }
            if (r0 == 0) goto L_0x0048
            Y r5 = r0.f7433a     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r7)
            return r5
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.p051s.C2189g.mo8496k(java.lang.Object, java.lang.Object):java.lang.Object");
    }

    /* renamed from: l */
    public synchronized Y mo8497l(T t) {
        C2190a remove = this.f7430a.remove(t);
        if (remove == null) {
            return null;
        }
        this.f7432c -= (long) remove.f7434b;
        return remove.f7433a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public synchronized void mo8498m(long j) {
        while (this.f7432c > j) {
            Iterator<Map.Entry<T, C2190a<Y>>> it = this.f7430a.entrySet().iterator();
            Map.Entry next = it.next();
            C2190a aVar = (C2190a) next.getValue();
            this.f7432c -= (long) aVar.f7434b;
            Object key = next.getKey();
            it.remove();
            mo7835j(key, aVar.f7433a);
        }
    }
}
