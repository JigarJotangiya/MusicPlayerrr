package p082e.p098e;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: e.e.e */
/* compiled from: LruCache */
public class C3471e<K, V> {

    /* renamed from: a */
    private final LinkedHashMap<K, V> f11012a;

    /* renamed from: b */
    private int f11013b;

    /* renamed from: c */
    private int f11014c;

    /* renamed from: d */
    private int f11015d;

    /* renamed from: e */
    private int f11016e;

    /* renamed from: f */
    private int f11017f;

    /* renamed from: g */
    private int f11018g;

    /* renamed from: h */
    private int f11019h;

    public C3471e(int i) {
        if (i > 0) {
            this.f11014c = i;
            this.f11012a = new LinkedHashMap<>(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /* renamed from: f */
    private int m14803f(K k, V v) {
        int g = mo12320g(k, v);
        if (g >= 0) {
            return g;
        }
        throw new IllegalStateException("Negative size: " + k + "=" + v);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public V mo12315a(K k) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo12316b(boolean z, K k, V v, V v2) {
    }

    /* renamed from: c */
    public final void mo12317c() {
        mo12321h(-1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001d, code lost:
        r0 = mo12315a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        if (r0 != null) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0023, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r4.f11016e++;
        r1 = r4.f11012a.put(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0032, code lost:
        if (r1 == null) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
        r4.f11012a.put(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        r4.f11013b += m14803f(r5, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0043, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0044, code lost:
        if (r1 == null) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0046, code lost:
        mo12316b(false, r5, r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x004a, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x004b, code lost:
        mo12321h(r4.f11014c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0050, code lost:
        return r0;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final V mo12318d(K r5) {
        /*
            r4 = this;
            java.lang.String r0 = "key == null"
            java.util.Objects.requireNonNull(r5, r0)
            monitor-enter(r4)
            java.util.LinkedHashMap<K, V> r0 = r4.f11012a     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r0.get(r5)     // Catch:{ all -> 0x0054 }
            if (r0 == 0) goto L_0x0016
            int r5 = r4.f11018g     // Catch:{ all -> 0x0054 }
            int r5 = r5 + 1
            r4.f11018g = r5     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            return r0
        L_0x0016:
            int r0 = r4.f11019h     // Catch:{ all -> 0x0054 }
            int r0 = r0 + 1
            r4.f11019h = r0     // Catch:{ all -> 0x0054 }
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            java.lang.Object r0 = r4.mo12315a(r5)
            if (r0 != 0) goto L_0x0025
            r5 = 0
            return r5
        L_0x0025:
            monitor-enter(r4)
            int r1 = r4.f11016e     // Catch:{ all -> 0x0051 }
            int r1 = r1 + 1
            r4.f11016e = r1     // Catch:{ all -> 0x0051 }
            java.util.LinkedHashMap<K, V> r1 = r4.f11012a     // Catch:{ all -> 0x0051 }
            java.lang.Object r1 = r1.put(r5, r0)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x003a
            java.util.LinkedHashMap<K, V> r2 = r4.f11012a     // Catch:{ all -> 0x0051 }
            r2.put(r5, r1)     // Catch:{ all -> 0x0051 }
            goto L_0x0043
        L_0x003a:
            int r2 = r4.f11013b     // Catch:{ all -> 0x0051 }
            int r3 = r4.m14803f(r5, r0)     // Catch:{ all -> 0x0051 }
            int r2 = r2 + r3
            r4.f11013b = r2     // Catch:{ all -> 0x0051 }
        L_0x0043:
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            if (r1 == 0) goto L_0x004b
            r2 = 0
            r4.mo12316b(r2, r5, r0, r1)
            return r1
        L_0x004b:
            int r5 = r4.f11014c
            r4.mo12321h(r5)
            return r0
        L_0x0051:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0051 }
            throw r5
        L_0x0054:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0054 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p098e.C3471e.mo12318d(java.lang.Object):java.lang.Object");
    }

    /* renamed from: e */
    public final V mo12319e(K k, V v) {
        V put;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f11015d++;
            this.f11013b += m14803f(k, v);
            put = this.f11012a.put(k, v);
            if (put != null) {
                this.f11013b -= m14803f(k, put);
            }
        }
        if (put != null) {
            mo12316b(false, k, put, v);
        }
        mo12321h(this.f11014c);
        return put;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public int mo12320g(K k, V v) {
        return 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0070, code lost:
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo12321h(int r5) {
        /*
            r4 = this;
        L_0x0000:
            monitor-enter(r4)
            int r0 = r4.f11013b     // Catch:{ all -> 0x0071 }
            if (r0 < 0) goto L_0x0052
            java.util.LinkedHashMap<K, V> r0 = r4.f11012a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x0011
            int r0 = r4.f11013b     // Catch:{ all -> 0x0071 }
            if (r0 != 0) goto L_0x0052
        L_0x0011:
            int r0 = r4.f11013b     // Catch:{ all -> 0x0071 }
            if (r0 <= r5) goto L_0x0050
            java.util.LinkedHashMap<K, V> r0 = r4.f11012a     // Catch:{ all -> 0x0071 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x0071 }
            if (r0 == 0) goto L_0x001e
            goto L_0x0050
        L_0x001e:
            java.util.LinkedHashMap<K, V> r0 = r4.f11012a     // Catch:{ all -> 0x0071 }
            java.util.Set r0 = r0.entrySet()     // Catch:{ all -> 0x0071 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0071 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0071 }
            java.lang.Object r1 = r0.getKey()     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0071 }
            java.util.LinkedHashMap<K, V> r2 = r4.f11012a     // Catch:{ all -> 0x0071 }
            r2.remove(r1)     // Catch:{ all -> 0x0071 }
            int r2 = r4.f11013b     // Catch:{ all -> 0x0071 }
            int r3 = r4.m14803f(r1, r0)     // Catch:{ all -> 0x0071 }
            int r2 = r2 - r3
            r4.f11013b = r2     // Catch:{ all -> 0x0071 }
            int r2 = r4.f11017f     // Catch:{ all -> 0x0071 }
            r3 = 1
            int r2 = r2 + r3
            r4.f11017f = r2     // Catch:{ all -> 0x0071 }
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            r2 = 0
            r4.mo12316b(r3, r1, r0, r2)
            goto L_0x0000
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            return
        L_0x0052:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0071 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0071 }
            r0.<init>()     // Catch:{ all -> 0x0071 }
            java.lang.Class r1 = r4.getClass()     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0071 }
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch:{ all -> 0x0071 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0071 }
            r5.<init>(r0)     // Catch:{ all -> 0x0071 }
            throw r5     // Catch:{ all -> 0x0071 }
        L_0x0071:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0071 }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p082e.p098e.C3471e.mo12321h(int):void");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.f11018g;
        i2 = this.f11019h + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", new Object[]{Integer.valueOf(this.f11014c), Integer.valueOf(this.f11018g), Integer.valueOf(this.f11019h), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0)});
    }
}
