package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class jn3 extends nn3 {

    /* renamed from: c */
    private static final Class<?> f18546c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    /* synthetic */ jn3(in3 in3) {
        super((mn3) null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: com.google.android.gms.internal.ads.gn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v10, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v14, resolved type: com.google.android.gms.internal.ads.gn3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v15, resolved type: com.google.android.gms.internal.ads.gn3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static <L> java.util.List<L> m25797f(java.lang.Object r3, long r4, int r6) {
        /*
            java.lang.Object r0 = com.google.android.gms.internal.ads.vp3.m32648p(r3, r4)
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x002f
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.hn3
            if (r1 == 0) goto L_0x0016
            com.google.android.gms.internal.ads.gn3 r0 = new com.google.android.gms.internal.ads.gn3
            r0.<init>((int) r6)
            goto L_0x002b
        L_0x0016:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ho3
            if (r1 == 0) goto L_0x0026
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ym3
            if (r1 == 0) goto L_0x0026
            com.google.android.gms.internal.ads.ym3 r0 = (com.google.android.gms.internal.ads.ym3) r0
            com.google.android.gms.internal.ads.ym3 r6 = r0.mo15868f(r6)
            r0 = r6
            goto L_0x002b
        L_0x0026:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r6)
        L_0x002b:
            com.google.android.gms.internal.ads.vp3.m32628D(r3, r4, r0)
            goto L_0x0087
        L_0x002f:
            java.lang.Class<?> r1 = f18546c
            java.lang.Class r2 = r0.getClass()
            boolean r1 = r1.isAssignableFrom(r2)
            if (r1 == 0) goto L_0x004d
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>(r2)
            r1.addAll(r0)
            com.google.android.gms.internal.ads.vp3.m32628D(r3, r4, r1)
        L_0x004b:
            r0 = r1
            goto L_0x0087
        L_0x004d:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.qp3
            if (r1 == 0) goto L_0x0068
            com.google.android.gms.internal.ads.gn3 r1 = new com.google.android.gms.internal.ads.gn3
            int r2 = r0.size()
            int r2 = r2 + r6
            r1.<init>((int) r2)
            com.google.android.gms.internal.ads.qp3 r0 = (com.google.android.gms.internal.ads.qp3) r0
            int r6 = r1.size()
            r1.addAll(r6, r0)
            com.google.android.gms.internal.ads.vp3.m32628D(r3, r4, r1)
            goto L_0x004b
        L_0x0068:
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ho3
            if (r1 == 0) goto L_0x0087
            boolean r1 = r0 instanceof com.google.android.gms.internal.ads.ym3
            if (r1 == 0) goto L_0x0087
            r1 = r0
            com.google.android.gms.internal.ads.ym3 r1 = (com.google.android.gms.internal.ads.ym3) r1
            boolean r2 = r1.mo21839b()
            if (r2 == 0) goto L_0x007a
            goto L_0x0087
        L_0x007a:
            int r0 = r0.size()
            int r0 = r0 + r6
            com.google.android.gms.internal.ads.ym3 r6 = r1.mo15868f(r0)
            com.google.android.gms.internal.ads.vp3.m32628D(r3, r4, r6)
            return r6
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.jn3.m25797f(java.lang.Object, long, int):java.util.List");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final <L> List<L> mo18686a(Object obj, long j) {
        return m25797f(obj, j, 10);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo18687b(Object obj, long j) {
        Object obj2;
        List list = (List) vp3.m32648p(obj, j);
        if (list instanceof hn3) {
            obj2 = ((hn3) list).zze();
        } else if (!f18546c.isAssignableFrom(list.getClass())) {
            if (!(list instanceof ho3) || !(list instanceof ym3)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                ym3 ym3 = (ym3) list;
                if (ym3.mo21839b()) {
                    ym3.mo21838a();
                    return;
                }
                return;
            }
        } else {
            return;
        }
        vp3.m32628D(obj, j, obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final <E> void mo18688c(Object obj, Object obj2, long j) {
        List list = (List) vp3.m32648p(obj2, j);
        List f = m25797f(obj, j, list.size());
        int size = f.size();
        int size2 = list.size();
        if (size > 0 && size2 > 0) {
            f.addAll(list);
        }
        if (size > 0) {
            list = f;
        }
        vp3.m32628D(obj, j, list);
    }
}
