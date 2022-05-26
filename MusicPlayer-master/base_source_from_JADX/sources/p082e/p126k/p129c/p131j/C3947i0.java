package p082e.p126k.p129c.p131j;

import java.util.Collections;
import java.util.List;
import p082e.p126k.p129c.p131j.C3899b0;

/* renamed from: e.k.c.j.i0 */
/* compiled from: ListFieldSchema */
abstract class C3947i0 {

    /* renamed from: a */
    private static final C3947i0 f12033a = new C3949b();

    /* renamed from: b */
    private static final C3947i0 f12034b = new C3950c();

    /* renamed from: e.k.c.j.i0$b */
    /* compiled from: ListFieldSchema */
    private static final class C3949b extends C3947i0 {

        /* renamed from: c */
        private static final Class<?> f12035c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        private C3949b() {
            super();
        }

        /* renamed from: f */
        static <E> List<E> m16857f(Object obj, long j) {
            return (List) C4022u1.m17617E(obj, j);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: e.k.c.j.g0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: e.k.c.j.g0} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: e.k.c.j.g0} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static <L> java.util.List<L> m16858g(java.lang.Object r3, long r4, int r6) {
            /*
                java.util.List r0 = m16857f(r3, r4)
                boolean r1 = r0.isEmpty()
                if (r1 == 0) goto L_0x002d
                boolean r1 = r0 instanceof p082e.p126k.p129c.p131j.C3932h0
                if (r1 == 0) goto L_0x0014
                e.k.c.j.g0 r0 = new e.k.c.j.g0
                r0.<init>((int) r6)
                goto L_0x0029
            L_0x0014:
                boolean r1 = r0 instanceof p082e.p126k.p129c.p131j.C3913c1
                if (r1 == 0) goto L_0x0024
                boolean r1 = r0 instanceof p082e.p126k.p129c.p131j.C3899b0.C3908i
                if (r1 == 0) goto L_0x0024
                e.k.c.j.b0$i r0 = (p082e.p126k.p129c.p131j.C3899b0.C3908i) r0
                e.k.c.j.b0$i r6 = r0.mo13421i(r6)
                r0 = r6
                goto L_0x0029
            L_0x0024:
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r6)
            L_0x0029:
                p082e.p126k.p129c.p131j.C4022u1.m17632T(r3, r4, r0)
                goto L_0x007f
            L_0x002d:
                java.lang.Class<?> r1 = f12035c
                java.lang.Class r2 = r0.getClass()
                boolean r1 = r1.isAssignableFrom(r2)
                if (r1 == 0) goto L_0x004b
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>(r2)
                r1.addAll(r0)
                p082e.p126k.p129c.p131j.C4022u1.m17632T(r3, r4, r1)
            L_0x0049:
                r0 = r1
                goto L_0x007f
            L_0x004b:
                boolean r1 = r0 instanceof p082e.p126k.p129c.p131j.C4017t1
                if (r1 == 0) goto L_0x0062
                e.k.c.j.g0 r1 = new e.k.c.j.g0
                int r2 = r0.size()
                int r2 = r2 + r6
                r1.<init>((int) r2)
                e.k.c.j.t1 r0 = (p082e.p126k.p129c.p131j.C4017t1) r0
                r1.addAll(r0)
                p082e.p126k.p129c.p131j.C4022u1.m17632T(r3, r4, r1)
                goto L_0x0049
            L_0x0062:
                boolean r1 = r0 instanceof p082e.p126k.p129c.p131j.C3913c1
                if (r1 == 0) goto L_0x007f
                boolean r1 = r0 instanceof p082e.p126k.p129c.p131j.C3899b0.C3908i
                if (r1 == 0) goto L_0x007f
                r1 = r0
                e.k.c.j.b0$i r1 = (p082e.p126k.p129c.p131j.C3899b0.C3908i) r1
                boolean r2 = r1.mo13464r()
                if (r2 != 0) goto L_0x007f
                int r0 = r0.size()
                int r0 = r0 + r6
                e.k.c.j.b0$i r0 = r1.mo13421i(r0)
                p082e.p126k.p129c.p131j.C4022u1.m17632T(r3, r4, r0)
            L_0x007f:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: p082e.p126k.p129c.p131j.C3947i0.C3949b.m16858g(java.lang.Object, long, int):java.util.List");
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo13623c(Object obj, long j) {
            Object obj2;
            List list = (List) C4022u1.m17617E(obj, j);
            if (list instanceof C3932h0) {
                obj2 = ((C3932h0) list).mo13571o();
            } else if (!f12035c.isAssignableFrom(list.getClass())) {
                if (!(list instanceof C3913c1) || !(list instanceof C3899b0.C3908i)) {
                    obj2 = Collections.unmodifiableList(list);
                } else {
                    C3899b0.C3908i iVar = (C3899b0.C3908i) list;
                    if (iVar.mo13464r()) {
                        iVar.mo13463g();
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
            C4022u1.m17632T(obj, j, obj2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo13624d(Object obj, Object obj2, long j) {
            List f = m16857f(obj2, j);
            List g = m16858g(obj, j, f.size());
            int size = g.size();
            int size2 = f.size();
            if (size > 0 && size2 > 0) {
                g.addAll(f);
            }
            if (size > 0) {
                f = g;
            }
            C4022u1.m17632T(obj, j, f);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo13625e(Object obj, long j) {
            return m16858g(obj, j, 10);
        }
    }

    /* renamed from: e.k.c.j.i0$c */
    /* compiled from: ListFieldSchema */
    private static final class C3950c extends C3947i0 {
        private C3950c() {
            super();
        }

        /* renamed from: f */
        static <E> C3899b0.C3908i<E> m16862f(Object obj, long j) {
            return (C3899b0.C3908i) C4022u1.m17617E(obj, j);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo13623c(Object obj, long j) {
            m16862f(obj, j).mo13463g();
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public <E> void mo13624d(Object obj, Object obj2, long j) {
            C3899b0.C3908i f = m16862f(obj, j);
            C3899b0.C3908i f2 = m16862f(obj2, j);
            int size = f.size();
            int size2 = f2.size();
            if (size > 0 && size2 > 0) {
                if (!f.mo13464r()) {
                    f = f.mo13421i(size2 + size);
                }
                f.addAll(f2);
            }
            if (size > 0) {
                f2 = f;
            }
            C4022u1.m17632T(obj, j, f2);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: e */
        public <L> List<L> mo13625e(Object obj, long j) {
            C3899b0.C3908i f = m16862f(obj, j);
            if (f.mo13464r()) {
                return f;
            }
            int size = f.size();
            C3899b0.C3908i i = f.mo13421i(size == 0 ? 10 : size * 2);
            C4022u1.m17632T(obj, j, i);
            return i;
        }
    }

    /* renamed from: a */
    static C3947i0 m16852a() {
        return f12033a;
    }

    /* renamed from: b */
    static C3947i0 m16853b() {
        return f12034b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract void mo13623c(Object obj, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public abstract <L> void mo13624d(Object obj, Object obj2, long j);

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract <L> List<L> mo13625e(Object obj, long j);

    private C3947i0() {
    }
}
