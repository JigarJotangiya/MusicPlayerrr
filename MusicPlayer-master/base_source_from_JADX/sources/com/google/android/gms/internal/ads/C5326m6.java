package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* renamed from: com.google.android.gms.internal.ads.m6 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5326m6 {

    /* renamed from: a */
    long f19780a;

    /* renamed from: b */
    final String f19781b;

    /* renamed from: c */
    final String f19782c;

    /* renamed from: d */
    final long f19783d;

    /* renamed from: e */
    final long f19784e;

    /* renamed from: f */
    final long f19785f;

    /* renamed from: g */
    final long f19786g;

    /* renamed from: h */
    final List<C5251k5> f19787h;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    C5326m6(java.lang.String r14, com.google.android.gms.internal.ads.C4917b5 r15) {
        /*
            r13 = this;
            java.lang.String r2 = r15.f14319b
            long r3 = r15.f14320c
            long r5 = r15.f14321d
            long r7 = r15.f14322e
            long r9 = r15.f14323f
            java.util.List<com.google.android.gms.internal.ads.k5> r0 = r15.f14325h
            if (r0 == 0) goto L_0x0010
        L_0x000e:
            r11 = r0
            goto L_0x0044
        L_0x0010:
            java.util.Map<java.lang.String, java.lang.String> r15 = r15.f14324g
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r15.size()
            r0.<init>(r1)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L_0x0023:
            boolean r1 = r15.hasNext()
            if (r1 == 0) goto L_0x000e
            java.lang.Object r1 = r15.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            com.google.android.gms.internal.ads.k5 r11 = new com.google.android.gms.internal.ads.k5
            java.lang.Object r12 = r1.getKey()
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r11.<init>(r12, r1)
            r0.add(r11)
            goto L_0x0023
        L_0x0044:
            r0 = r13
            r1 = r14
            r0.<init>(r1, r2, r3, r5, r7, r9, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C5326m6.<init>(java.lang.String, com.google.android.gms.internal.ads.b5):void");
    }

    /* renamed from: a */
    static C5326m6 m27158a(C5363n6 n6Var) throws IOException {
        List list;
        if (C5437p6.m28893b(n6Var) == 538247942) {
            String e = C5437p6.m28895e(n6Var);
            String e2 = C5437p6.m28895e(n6Var);
            long c = C5437p6.m28894c(n6Var);
            long c2 = C5437p6.m28894c(n6Var);
            long c3 = C5437p6.m28894c(n6Var);
            long c4 = C5437p6.m28894c(n6Var);
            int b = C5437p6.m28893b(n6Var);
            if (b >= 0) {
                if (b == 0) {
                    list = Collections.emptyList();
                } else {
                    list = new ArrayList();
                }
                List list2 = list;
                for (int i = 0; i < b; i++) {
                    list2.add(new C5251k5(C5437p6.m28895e(n6Var).intern(), C5437p6.m28895e(n6Var).intern()));
                }
                return new C5326m6(e, e2, c, c2, c3, c4, list2);
            }
            StringBuilder sb = new StringBuilder(31);
            sb.append("readHeaderList size=");
            sb.append(b);
            throw new IOException(sb.toString());
        }
        throw new IOException();
    }

    private C5326m6(String str, String str2, long j, long j2, long j3, long j4, List<C5251k5> list) {
        this.f19781b = str;
        this.f19782c = true == BuildConfig.FLAVOR.equals(str2) ? null : str2;
        this.f19783d = j;
        this.f19784e = j2;
        this.f19785f = j3;
        this.f19786g = j4;
        this.f19787h = list;
    }
}
