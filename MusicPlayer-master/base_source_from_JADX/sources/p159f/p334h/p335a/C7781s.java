package p159f.p334h.p335a;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p159f.p334h.p335a.C7755f;
import p159f.p334h.p335a.p336v.C7801b;

/* renamed from: f.h.a.s */
/* compiled from: Moshi */
public final class C7781s {

    /* renamed from: d */
    static final List<C7755f.C7756a> f33164d;

    /* renamed from: a */
    private final List<C7755f.C7756a> f33165a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final ThreadLocal<C7784c> f33166b = new ThreadLocal<>();
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final Map<Object, C7755f<?>> f33167c = new LinkedHashMap();

    /* renamed from: f.h.a.s$a */
    /* compiled from: Moshi */
    public static final class C7782a {

        /* renamed from: a */
        final List<C7755f.C7756a> f33168a = new ArrayList();

        /* renamed from: b */
        int f33169b = 0;

        /* renamed from: a */
        public C7782a mo29033a(C7755f.C7756a aVar) {
            if (aVar != null) {
                List<C7755f.C7756a> list = this.f33168a;
                int i = this.f33169b;
                this.f33169b = i + 1;
                list.add(i, aVar);
                return this;
            }
            throw new IllegalArgumentException("factory == null");
        }

        /* renamed from: b */
        public C7781s mo29034b() {
            return new C7781s(this);
        }
    }

    /* renamed from: f.h.a.s$b */
    /* compiled from: Moshi */
    static final class C7783b<T> extends C7755f<T> {

        /* renamed from: a */
        final Type f33170a;

        /* renamed from: b */
        final String f33171b;

        /* renamed from: c */
        final Object f33172c;

        /* renamed from: d */
        C7755f<T> f33173d;

        C7783b(Type type, String str, Object obj) {
            this.f33170a = type;
            this.f33171b = str;
            this.f33172c = obj;
        }

        /* renamed from: a */
        public T mo15563a(C7761k kVar) throws IOException {
            C7755f<T> fVar = this.f33173d;
            if (fVar != null) {
                return fVar.mo15563a(kVar);
            }
            throw new IllegalStateException("JsonAdapter isn't ready");
        }

        public String toString() {
            C7755f<T> fVar = this.f33173d;
            return fVar != null ? fVar.toString() : super.toString();
        }
    }

    /* renamed from: f.h.a.s$c */
    /* compiled from: Moshi */
    final class C7784c {

        /* renamed from: a */
        final List<C7783b<?>> f33174a = new ArrayList();

        /* renamed from: b */
        final Deque<C7783b<?>> f33175b = new ArrayDeque();

        /* renamed from: c */
        boolean f33176c;

        C7784c() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public <T> void mo29036a(C7755f<T> fVar) {
            this.f33175b.getLast().f33173d = fVar;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public IllegalArgumentException mo29037b(IllegalArgumentException illegalArgumentException) {
            if (this.f33176c) {
                return illegalArgumentException;
            }
            this.f33176c = true;
            if (this.f33175b.size() == 1 && this.f33175b.getFirst().f33171b == null) {
                return illegalArgumentException;
            }
            StringBuilder sb = new StringBuilder(illegalArgumentException.getMessage());
            Iterator<C7783b<?>> descendingIterator = this.f33175b.descendingIterator();
            while (descendingIterator.hasNext()) {
                C7783b next = descendingIterator.next();
                sb.append("\nfor ");
                sb.append(next.f33170a);
                if (next.f33171b != null) {
                    sb.append(' ');
                    sb.append(next.f33171b);
                }
            }
            return new IllegalArgumentException(sb.toString(), illegalArgumentException);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo29038c(boolean z) {
            this.f33175b.removeLast();
            if (this.f33175b.isEmpty()) {
                C7781s.this.f33166b.remove();
                if (z) {
                    synchronized (C7781s.this.f33167c) {
                        int size = this.f33174a.size();
                        for (int i = 0; i < size; i++) {
                            C7783b bVar = this.f33174a.get(i);
                            C7755f<T> fVar = (C7755f) C7781s.this.f33167c.put(bVar.f33172c, bVar.f33173d);
                            if (fVar != null) {
                                bVar.f33173d = fVar;
                                C7781s.this.f33167c.put(bVar.f33172c, fVar);
                            }
                        }
                    }
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <T> C7755f<T> mo29039d(Type type, String str, Object obj) {
            int size = this.f33174a.size();
            for (int i = 0; i < size; i++) {
                C7783b bVar = this.f33174a.get(i);
                if (bVar.f33172c.equals(obj)) {
                    this.f33175b.add(bVar);
                    C7755f<T> fVar = bVar.f33173d;
                    return fVar != null ? fVar : bVar;
                }
            }
            C7783b bVar2 = new C7783b(type, str, obj);
            this.f33174a.add(bVar2);
            this.f33175b.add(bVar2);
            return null;
        }
    }

    static {
        ArrayList arrayList = new ArrayList(5);
        f33164d = arrayList;
        arrayList.add(C7785t.f33178a);
        arrayList.add(C7750d.f33116b);
        arrayList.add(C7779r.f33161c);
        arrayList.add(C7740a.f33097c);
        arrayList.add(C7747c.f33110d);
    }

    C7781s(C7782a aVar) {
        int size = aVar.f33168a.size();
        List<C7755f.C7756a> list = f33164d;
        ArrayList arrayList = new ArrayList(size + list.size());
        arrayList.addAll(aVar.f33168a);
        arrayList.addAll(list);
        this.f33165a = Collections.unmodifiableList(arrayList);
        int i = aVar.f33169b;
    }

    /* renamed from: g */
    private Object m42727g(Type type, Set<? extends Annotation> set) {
        if (set.isEmpty()) {
            return type;
        }
        return Arrays.asList(new Object[]{type, set});
    }

    /* renamed from: c */
    public <T> C7755f<T> mo29028c(Class<T> cls) {
        return mo29030e(cls, C7801b.f33199a);
    }

    /* renamed from: d */
    public <T> C7755f<T> mo29029d(Type type) {
        return mo29030e(type, C7801b.f33199a);
    }

    /* renamed from: e */
    public <T> C7755f<T> mo29030e(Type type, Set<? extends Annotation> set) {
        return mo29031f(type, set, (String) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0030, code lost:
        r1 = new p159f.p334h.p335a.C7781s.C7784c(r4);
        r4.f33166b.set(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x003a, code lost:
        r7 = r1.mo29039d(r5, r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (r7 == null) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r1.mo29038c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        return r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r7 = r4.f33165a.size();
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004c, code lost:
        if (r2 >= r7) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        r3 = r4.f33165a.get(r2).mo15565a(r5, r6, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005a, code lost:
        if (r3 != null) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005c, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005f, code lost:
        r1.mo29036a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        r1.mo29038c(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0066, code lost:
        return r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0081, code lost:
        throw new java.lang.IllegalArgumentException("No JsonAdapter for " + p159f.p334h.p335a.p336v.C7801b.m42791q(r5, r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0082, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0084, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0089, code lost:
        throw r1.mo29037b(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x008a, code lost:
        r1.mo29038c(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008d, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0026, code lost:
        r1 = r4.f33166b.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r1 != null) goto L_0x003a;
     */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <T> p159f.p334h.p335a.C7755f<T> mo29031f(java.lang.reflect.Type r5, java.util.Set<? extends java.lang.annotation.Annotation> r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.String r0 = "type == null"
            java.util.Objects.requireNonNull(r5, r0)
            java.lang.String r0 = "annotations == null"
            java.util.Objects.requireNonNull(r6, r0)
            java.lang.reflect.Type r5 = p159f.p334h.p335a.p336v.C7801b.m42775a(r5)
            java.lang.reflect.Type r5 = p159f.p334h.p335a.p336v.C7801b.m42786l(r5)
            java.lang.Object r0 = r4.m42727g(r5, r6)
            java.util.Map<java.lang.Object, f.h.a.f<?>> r1 = r4.f33167c
            monitor-enter(r1)
            java.util.Map<java.lang.Object, f.h.a.f<?>> r2 = r4.f33167c     // Catch:{ all -> 0x008e }
            java.lang.Object r2 = r2.get(r0)     // Catch:{ all -> 0x008e }
            f.h.a.f r2 = (p159f.p334h.p335a.C7755f) r2     // Catch:{ all -> 0x008e }
            if (r2 == 0) goto L_0x0025
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            return r2
        L_0x0025:
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            java.lang.ThreadLocal<f.h.a.s$c> r1 = r4.f33166b
            java.lang.Object r1 = r1.get()
            f.h.a.s$c r1 = (p159f.p334h.p335a.C7781s.C7784c) r1
            if (r1 != 0) goto L_0x003a
            f.h.a.s$c r1 = new f.h.a.s$c
            r1.<init>()
            java.lang.ThreadLocal<f.h.a.s$c> r2 = r4.f33166b
            r2.set(r1)
        L_0x003a:
            f.h.a.f r7 = r1.mo29039d(r5, r7, r0)
            r0 = 0
            if (r7 == 0) goto L_0x0045
            r1.mo29038c(r0)
            return r7
        L_0x0045:
            java.util.List<f.h.a.f$a> r7 = r4.f33165a     // Catch:{ IllegalArgumentException -> 0x0084 }
            int r7 = r7.size()     // Catch:{ IllegalArgumentException -> 0x0084 }
            r2 = 0
        L_0x004c:
            if (r2 >= r7) goto L_0x0067
            java.util.List<f.h.a.f$a> r3 = r4.f33165a     // Catch:{ IllegalArgumentException -> 0x0084 }
            java.lang.Object r3 = r3.get(r2)     // Catch:{ IllegalArgumentException -> 0x0084 }
            f.h.a.f$a r3 = (p159f.p334h.p335a.C7755f.C7756a) r3     // Catch:{ IllegalArgumentException -> 0x0084 }
            f.h.a.f r3 = r3.mo15565a(r5, r6, r4)     // Catch:{ IllegalArgumentException -> 0x0084 }
            if (r3 != 0) goto L_0x005f
            int r2 = r2 + 1
            goto L_0x004c
        L_0x005f:
            r1.mo29036a(r3)     // Catch:{ IllegalArgumentException -> 0x0084 }
            r5 = 1
            r1.mo29038c(r5)
            return r3
        L_0x0067:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch:{ IllegalArgumentException -> 0x0084 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalArgumentException -> 0x0084 }
            r2.<init>()     // Catch:{ IllegalArgumentException -> 0x0084 }
            java.lang.String r3 = "No JsonAdapter for "
            r2.append(r3)     // Catch:{ IllegalArgumentException -> 0x0084 }
            java.lang.String r5 = p159f.p334h.p335a.p336v.C7801b.m42791q(r5, r6)     // Catch:{ IllegalArgumentException -> 0x0084 }
            r2.append(r5)     // Catch:{ IllegalArgumentException -> 0x0084 }
            java.lang.String r5 = r2.toString()     // Catch:{ IllegalArgumentException -> 0x0084 }
            r7.<init>(r5)     // Catch:{ IllegalArgumentException -> 0x0084 }
            throw r7     // Catch:{ IllegalArgumentException -> 0x0084 }
        L_0x0082:
            r5 = move-exception
            goto L_0x008a
        L_0x0084:
            r5 = move-exception
            java.lang.IllegalArgumentException r5 = r1.mo29037b(r5)     // Catch:{ all -> 0x0082 }
            throw r5     // Catch:{ all -> 0x0082 }
        L_0x008a:
            r1.mo29038c(r0)
            throw r5
        L_0x008e:
            r5 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x008e }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p159f.p334h.p335a.C7781s.mo29031f(java.lang.reflect.Type, java.util.Set, java.lang.String):f.h.a.f");
    }

    /* renamed from: h */
    public <T> C7755f<T> mo29032h(C7755f.C7756a aVar, Type type, Set<? extends Annotation> set) {
        Objects.requireNonNull(set, "annotations == null");
        Type l = C7801b.m42786l(C7801b.m42775a(type));
        int indexOf = this.f33165a.indexOf(aVar);
        if (indexOf != -1) {
            int size = this.f33165a.size();
            for (int i = indexOf + 1; i < size; i++) {
                C7755f<?> a = this.f33165a.get(i).mo15565a(l, set, this);
                if (a != null) {
                    return a;
                }
            }
            throw new IllegalArgumentException("No next JsonAdapter for " + C7801b.m42791q(l, set));
        }
        throw new IllegalArgumentException("Unable to skip past unknown factory " + aVar);
    }
}
